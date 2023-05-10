<template>
    <div class="flex w-1/3 flex-col m-auto justify-center">
        <div class="flex flex-row gap-12">

        <div>
        <div class="backdrop-filter border-0 bg-white bg-opacity-40 backdrop-blur-sm group cursor-pointer absolute routerlink m-2">
                <p class="group-hover:text-emerald-800 duration-300 font-bold text-neutral-700 p-2 rounded-xl">
                    Миючі засоби
                </p>
            </div>
            <img class="rounded-3xl" src="../../assets/pagesimages/finish.jpg" alt="">
        </div>
        <div class="flex w-full p-12 flex-col bg-white border-2 border-white rounded-3xl text-neutral-700
        bg-opacity-70 backdrop-filter backdrop-blur-lg">
            <h1 class="break-word font-bold text-4xl text-neutral-700">
                Finish 3 упаковки<br>XL Pack
            </h1>
            <p class="mt-2 text-blue-700 text-4xl font-bold">
                399₴
                <span class="text-red-400 text-xl line-through">
                    510₴
                </span>
            </p>

            <div class="flex flex-col w-full m-auto justify-center">
                <div>
                    <div class="py-4 my-4 justify-center gap-4 group routerlink flex flex-row items-center cursor-pointer">
                        <button class="">Додати в кошик</button>
                        <img class="w-10 h-10 group-hover:bg-neutral-700 p-2 rounded-lg transition duration-300" src="../../assets/icons/basket.png" alt="">
                    </div>
                    <div class="flex flex-row justify-evenly">
                    <img class="h-4" src="../../assets/paysystems/apay.png" alt="">
                    <img class="h-4" src="../../assets/paysystems/gpay.png" alt="">
                    <img class="h-4" src="../../assets/paysystems/mr.png" alt="">
                    <img class="h-4" src="../../assets/paysystems/paypal.png" alt="">
                    <img class="h-4" src="../../assets/paysystems/visa.png" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="flex justify-center mt-12 flex-row w-full">
        <div class="w-full flex p-12 flex-col bg-white border-2 border-white rounded-3xl text-neutral-700 bg-opacity-70 backdrop-filter backdrop-blur-lg">
            <div class="flex flex-row items-center gap-4">
                <h2 class="break-word text-left font-bold text-4xl text-neutral-700">
                    Опис продукуту
                </h2>

                <img class="h-12"
                src="../../assets/icons/info.png" alt="">
            </div>

           <div class="mt-8 grid grid-cols-2 gap-12 items-center">
                <div class="border-r-2 px-4">
                    <p class="font-bold text-neutral-600 text-2xl">
                        Миття вікон
                    </p>
                    <p class="font-bold text-neutral-600 text-2xl">
                        Ще якась тема
                    </p>
                </div>
                <div>
                    <p>Справляється на чудово</p>
                    <p>Справляється заєбісь</p>
                </div>
           </div>
        </div>
    </div>

    </div>
</template>
