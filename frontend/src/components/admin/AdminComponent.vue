<template>
<div class="flex flex-col w-2/3 m-auto">
    <div class="flex flex-row justify-evenly bg-white p-6
        bg-opacity-70  backdrop-filter backdrop-blur-lg rounded-3xl mb-12 ">
        <div class="w-full" v-for="(category, index) in choosedCategory" :key="category.id">
            <div @click="changeSelected(index)" :class="[
              category.enabled
                ? 'routerlink selected'
                : 'routerlink',
            ]"
            class="text-center py-4 m-2"
            >
            <div class="cursor-pointer">
              {{ category.name }}
            </div>
          </div>
          </div>
    </div>
    <component :is="choosedCategory[selectedIndex].component"></component>
</div>
</template>





<script>
import UsersOrders from "./UsersOrders.vue";
import AllProducts from "./AllProducts.vue";
import CreateProduct from "./CreateProduct.vue";
import CategoriesWorkComponent from "./CategoriesWorkComponent.vue";
export default {
  data() {
    return {
      selectedIndex: 0,
      choosedCategory: [
        {
          name: "Замовлення користувачів",
          enabled: true,
          component: UsersOrders,
        },
        {
          name: "Наявні продукти",
          enabled: false,
          component: AllProducts,
        },
        {
          name: "Створення продукту",
          enabled: false,
          component: CreateProduct,
        },
        {
          name: "Категорії продуктів",
          enabled: false,
          component: CategoriesWorkComponent,
        },
      ],
    };
  },
  components: {
    UsersOrders,
    AllProducts,
    CreateProduct
  },
  methods: {
    changeSelected(index) {
      this.choosedCategory.forEach((category) => {
        category.enabled = false;
      });
      this.choosedCategory[index].enabled = true;
      this.selectedIndex = index;
    },
  },
};
</script>
