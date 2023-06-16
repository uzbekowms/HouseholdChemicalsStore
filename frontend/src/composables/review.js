import { ref } from "vue";
import axios from "axios";

export default function restReview() {
  const review = ref([]);
  const reviews = ref([]);

  const errors = ref({});

  const BASE_URL = "";

  const getReview = async (id) => {
    const response = await axios.get(
      "http://localhost:8001/api/v1/reviews/" + id
    );
    review.value = response.data.data;
  };

  const getReviews = async () => {
    const response = await axios.get("http://localhost:8001/api/v1/reviews");
    reviews.value = response.data.data;
  };

  const getReviewsByProductId = async (product_id) => {
    const response = await axios.get(
      "http://localhost:8001/api/v1/reviews?product=" + product_id
    );
    reviews.value = response.data.data;
  };

  const updateReview = async (id) => {
    try {
      await axios.put(
        "http://localhost:8001/api/v1/reviews/" + id,
        review.value
      );
    } catch (error) {
      if (error.response.status === 422) {
        errors.value = error.response.data.errors;
      }
    }
  };

  const createReview = async (data) => {
    try {
      await axios.post("http://localhost:8001/api/v1/reviews", data);
    } catch (error) {
      if (error.response.status === 422) {
        errors.value = error.response.data.errors;
      }
    }
  };

  const deleteReview = async (id) => {
    if (!window.confirm("Видалити категорію?")) {
      return;
    }
    await axios.delete("http://localhost:8001/api/v1/reviews/" + id);
  };

  return {
    review,
    reviews,
    getReview,
    getReviews,
    createReview,
    deleteReview,
    updateReview,
    getReviewsByProductId,
  };
}
