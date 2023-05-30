import { ref } from "vue"
import axios from 'axios'

export default function restUser() {
    const user = ref([]);
    const users = ref([]);

    const errors = ref({});

    const BASE_URL = '';

    const getUser = async (id) => {
        const response = await axios.get(BASE_URL.value + "/users/" + id);
        user.value = response.data.data;
    };

    const getUsers = async () => {
        const response = await axios.get(BASE_URL.value + "/users");
        users.value = response.data.data;
    };

    const updateUser = async (id) => {
        try {
            await axios.put(BASE_URL.value + "/users/" + id, user.value);
        } catch (error) {
            if (error.response.status === 422) {
                errors.value = error.response.data.errors;
            }
        }
    }

    const createUser = async (data) => {
        try {
            await axios.post(BASE_URL.value + "/users", data);
        } catch (error) {
            if (error.response.status === 422) {
                errors.value = error.response.data.errors;
            }
        }
    }

    const deleteUser = async (id) => {
        if (!window.confirm("Видалити користувача?")) {
            return;
        }
        await axios.delete(BASE_URL.value + "/users/" + id);
    }

    return {
        user,
        users,
        getUser,
        getUsers,
        createUser,
        updateUser,
        deleteUser
    }
}
