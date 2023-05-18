import { ref } from "vue"
import axios from 'axios'

export default function restCategory() {
    const category = ref([]);
    const categories = ref([]);

    const errors = ref({});

    const BASE_URL = '';

    const getCategories = async () => {
        const response = await axios.get(BASE_URL.value + "/categories");
        categories.value = response.data.data;
    };

    const getCategory = async (id) => {
        const response = await axios.get(BASE_URL.value + "/categories/" + id);
        category.value = response.data.data;
    };

    const updateCategory = async (id) => {
        try {
            await axios.put(BASE_URL.value + "/categories/" + id, category.value);
        } catch (error) {
            if (error.response.status === 422) {
                errors.value = error.response.data.errors;
            }
        }
    }

    const createCategory = async (data) => {
        try {
            await axios.post(BASE_URL.value + "/categories", data);
        } catch (error) {
            if (error.response.status === 422) {
                errors.value = error.response.data.errors;
            }
        }
    }

    const deleteCategory = async (id) => {
        if (!window.confirm("Видалити категорію?")) {
            return;
        }
        await axios.delete(BASE_URL.value + "/categories/" + id);
    }

    return {
        category,
        categories,
        getCategory,
        getCategories,
        createCategory,
        deleteCategory,
        updateCategory
    }
}
