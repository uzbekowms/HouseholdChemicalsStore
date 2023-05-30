import { ref } from "vue"
import axios from 'axios'

export default function restOrder() {
    const order = ref([]);
    const orders = ref([]);

    const errors = ref({});

    const BASE_URL = '';

    const getOrder = async (id) => {
        const response = await axios.get(BASE_URL.value + "/orders/" + id);
        order.value = response.data.data;
    };

    const getOrders = async () => {
        const response = await axios.get(BASE_URL.value + "/orders");
        orders.value = response.data.data;
    };

    const getOrdersByUserId = async (user_id) => {
        const response = await axios.get(BASE_URL.value + "/orders?user=" + user_id);
        orders.value = response.data.data;
    };

    const getOrdersByStatus = async (status_id) => {
        const response = await axios.get(BASE_URL.value + "/orders?status=" + status_id);
        orders.value = response.data.data;
    };

    const updateOrderStatus = async (id, status_id, data) => {
        try {
            await axios.put(BASE_URL.value + "/orders/" + id + "?status=" + status_id, data);
        } catch (error) {
            if (error.response.status === 422) {
                errors.value = error.response.data.errors;
            }
        }
    }

    const createOrder = async (data) => {
        try {
            await axios.post(BASE_URL.value + "/orders", data);
        } catch (error) {
            if (error.response.status === 422) {
                errors.value = error.response.data.errors;
            }
        }
    }

    const deleteOrder = async (id) => {
        if (!window.confirm("Видалити замовлення?")) {
            return;
        }
        await axios.delete(BASE_URL.value + "/orders/" + id);
    }

    return {
        order,
        orders,
        getOrder,
        getOrders,
        getOrdersByStatus,
        getOrdersByUserId,
        createOrder,
        deleteOrder,
        updateOrderStatus
    }
}
