<template>
<div class="flex flex-col w-2/3 m-auto">
    <div class="flex flex-row justify-between bg-white p-6
        bg-opacity-70  backdrop-filter backdrop-blur-lg rounded-3xl mb-12 ">
        <div class="m-auto w-2/3 flex flex-col gap-2 ">
            <p class="text-6xl font-bold text-neutral-700 text-center">
               Замовлення користувачів
            </p>
        </div>
        <div class="flex flex-col items-center justify-around gap-4 m-4 pl-4 border-neutral-700">
        </div>

    </div>
    <div class="flex flex-col bg-white p-6
        bg-opacity-70  backdrop-filter backdrop-blur-lg rounded-3xl mb-12 ">
        <p class="text-6xl font-bold text-neutral-700 py-12">
               Ігор Васильович
            </p>
        <div class="flex flex-row gap-24">
            <div>
                <img class="m-4 h-32 rounded-3xl" src="../../assets/pagesimages/finish.jpg" alt="">
            </div>
            <div class="flex flex-col text-neutral-700">
                <router-link :to="{name: 'ProductPage'}" class="duration-300 hover:text-neutral-500 break-word font-bold text-4xl text-neutral-700">
                    Finish 3 упаковки XL Pack
                </router-link>
                <p class="mt-2 text-2xl text-blue-500 font-bold">
                    399₴
                </p>
                <div class="group cursor-pointer">
                    <p class="group-hover:text-emerald-800 duration-300 font-bold text-emerald-400 py-4 rounded-xl">
                        Миючі засоби
                    </p>
                </div>
            </div>
            <div class="flex flex-col gap-4 items-center font-bold text-neutral-700 text-6xl p-4 rounded-xl">
                <p class="text-lg">Кількість</p>
                <h2 class="">
                    <span class="text-3xl">x</span>
                    2
                </h2>
            </div>
        </div>
        <div class="flex flex-col justify-evenly gap-4 text-center">
            <div class="routerlink cursor-pointer shadow-xl bg-emerald-500 border-emerald-500 hover:text-emerald-500">Дозволити</div>
            <div class="routerlink cursor-pointer shadow-xl bg-red-500 border-red-500 hover:text-red-500">Видалити</div>
        </div>
    </div>
</div>
</template>
