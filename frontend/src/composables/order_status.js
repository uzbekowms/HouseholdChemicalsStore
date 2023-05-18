import { ref } from "vue"
import axios from 'axios'

export default function restOrderStatus() {
    const order_status = ref([]);
    const order_statuses = ref([]);

    const errors = ref({});

    const BASE_URL = '';

    const getOrderStatus = async (id) => {
        const response = await axios.get(BASE_URL.value + "/order_statuses/" + id);
        order_status.value = response.data.data;
    };

    const getOrderStatuses = async () => {
        const response = await axios.get(BASE_URL.value + "/order_statuses");
        order_statuses.value = response.data.data;
    };

    const updateOrderStatus = async (id) => {
        try {
            await axios.put(BASE_URL.value + "/order_statuses/" + id, order_status.value);
        } catch (error) {
            if (error.response.status === 422) {
                errors.value = error.response.data.errors;
            }
        }
    }

    const createOrderStatus = async (data) => {
        try {
            await axios.post(BASE_URL.value + "/order_statuses", data);
        } catch (error) {
            if (error.response.status === 422) {
                errors.value = error.response.data.errors;
            }
        }
    }

    const deleteOrderStatus = async (id) => {
        if (!window.confirm("Видалити статус замовлення?")) {
            return;
        }
        await axios.delete(BASE_URL.value + "/orders/" + id);
    }

    return {
        order_status,
        order_statuses,
        getOrderStatus,
        getOrderStatuses,
        createOrderStatus,
        deleteOrderStatus,
        updateOrderStatus
    }
}
