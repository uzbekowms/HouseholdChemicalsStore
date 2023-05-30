import axios from 'axios'

export default function restAuth() {

    const BASE_URL = '';

    const loginUser = async (data) => {
        await axios.post(BASE_URL.value + "/auth/login", data);
    };

    const signUpUser = async (data) => {
        await axios.post(BASE_URL.value + "/auth/signup", data);
    };

    const logoutUser = async () => {
        await axios.post(BASE_URL.value + "/auth/logout");
    }

    return {
        loginUser,
        signUpUser,
        logoutUser
    }
}
