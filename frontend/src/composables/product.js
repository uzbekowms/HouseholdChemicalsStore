import { ref } from "vue";
import axios from "axios";

export default function restProduct() {
  const product = ref([]);
  const products = ref([]);

  const errors = ref({});

  const getProducts = async () => {
    const response = await axios.get("http://localhost:8001/api/v1/products");
    products.value = response.data;
  };

  const getProductsByPageNumber = async (page_number) => {
    const response = await axios.get(
      "http://localhost:8001/api/v1/products?page=" + page_number
    );
    products.value = response.data.data;
  };

  const getProductsByCategoryId = async (category_id) => {
    const response = await axios.get(
      "http://localhost:8001/api/v1/products?category=" + category_id
    );
    products.value = response.data.data;
  };

  const getProductsByPageNumberAndCategoryId = async (
    page_number,
    category_id
  ) => {
    const response = await axios.get(
      "http://localhost:8001/api/v1/products?category=" +
        category_id +
        "&page=" +
        page_number
    );
    products.value = response.data.data;
  };

  const getProductsByNameAndPageNumberAndCategoryId = async (
    name,
    page_number,
    category_id
  ) => {
    const response = await axios.get(
      "http://localhost:8001/api/v1/products?search=" +
        name +
        "&category=" +
        category_id +
        "&page=" +
        page_number
    );
    products.value = response.data.data;
  };

  const getProductsByNameAndPageNumber = async (name, page_number) => {
    const response = await axios.get(
      "http://localhost:8001/api/v1/products?search=" +
        name +
        "&page=" +
        page_number
    );
    products.value = response.data.data;
  };

  const getProduct = async (id) => {
    const response = await axios.get(
      "http://localhost:8001/api/v1/products/" + id
    );
    product.value = response.data;
  };

  const updateProduct = async (id) => {
    try {
      await axios.put(
        "http://localhost:8001/api/v1/products/" + id,
        product.value
      );
    } catch (error) {
      if (error.response.status === 422) {
        errors.value = error.response.data.errors;
      }
    }
  };

  const createProduct = async (data) => {
    try {
      const formData = new FormData();
      formData.append("product[]", data);
      console.log(formData);

      await axios.post("http://localhost:8001/api/v1/products", formData);
    } catch (error) {
      if (error.response.status === 422) {
        errors.value = error.response.data.errors;
      }
    }
  };

  const deleteProduct = async (id) => {
    if (!window.confirm("Видалити продукт?")) {
      return;
    }
    await axios.delete("http://localhost:8001/api/v1/products/" + id);
  };

  return {
    product,
    products,
    errors,
    getProduct,
    getProducts,
    getProductsByCategoryId,
    getProductsByNameAndPageNumber,
    getProductsByNameAndPageNumberAndCategoryId,
    getProductsByPageNumber,
    getProductsByPageNumberAndCategoryId,
    updateProduct,
    createProduct,
    deleteProduct,
  };
}
