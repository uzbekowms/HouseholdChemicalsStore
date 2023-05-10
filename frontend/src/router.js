import { createRouter, createWebHistory } from "vue-router";

import HomePageComponent from './components/pages/HomePageComponent.vue'
import ProductPage from './components/pages/ProductPage.vue'
import ProfilePage from './components/pages/ProfilePage.vue'
import ProductsPage from './components/pages/ProductsPage.vue'

import LoginPage from './components/authpages/LoginPage.vue'
import RegisterPage from './components/authpages/RegisterPage.vue'

import UserEdit from './components/editable/UserEdit.vue'

import AdminComponent from './components/admin/AdminComponent.vue'


const routes = [
    {
        path: '/',
        name: 'Home',
        component: HomePageComponent
    },
    {
        path: '/products',
        name: 'Products',
        component: ProductsPage
    },
    {
        path: '/users/:id?/edit',
        name: 'UserEdit',
        component: UserEdit
    },
    {
        path: '/products/:id?',
        name: 'ProductPage',
        component: ProductPage,
        props: true
    },
    {
        path: '/login',
        name: 'Login',
        component: LoginPage,
    },
    {
        path: '/admin',
        name: 'Admin',
        component: AdminComponent,
    },
    {
        path: '/register',
        name: 'Register',
        component: RegisterPage,
    },
    {
        path: '/profile',
        name: 'Profile',
        component: ProfilePage,
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router;
