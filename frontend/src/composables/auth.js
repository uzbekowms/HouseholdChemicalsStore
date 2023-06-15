import axios from "axios";
import { useRouter } from "vue-router";
import { useRoute } from "vue-router";

export default function restAuth() {
  const router = useRouter();
  const route = useRoute();

  const loginUser = async (data) => {
    const response = await axios.post(
      "http://localhost:8001/api/v1/auth/authenticate",
      data
    );
    let token = response.data.token;

    localStorage.setItem("token", token);

    if (response.status == 200) {
      router.push({ name: "Profile" });
    }
  };

  const userLogged = async () => {
    if ("token" in localStorage) {
      const token = localStorage.getItem("token");
      console.log(token);
      router.push({ name: "Profile" });
    } else {
      if (route.name === "Login") {
        router.push({ name: "Login" });
      } else {
        router.push({ name: "Register" });
      }
    }
  };

  const logout = async () => {
    localStorage.clear();
    router.push({ name: "Login" });
  };

  const signUpUser = async (data) => {
    const response = await axios.post(
      "http://localhost:8001/api/v1/auth/signup",
      data
    );

    let token = response.data.token;

    localStorage.setItem("token", token);

    if (response.status == 200) {
      router.push({ name: "Profile" });
    }
  };

  const logoutUser = async () => {
    await axios.post("http://localhost:8001/api/v1/auth/logout");
  };

  return {
    loginUser,
    signUpUser,
    logoutUser,
    logout,
    userLogged,
  };
}
