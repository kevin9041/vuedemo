

import VueRouter from 'vue-router'

// 导入 Account 组件
import account from './components/Account.vue'
import goodslist from './components/GoodsList.vue'
// 导入Account的两个子组件
import account_login from './subcomponents/account_login.vue'
import account_register from './subcomponents/account_register.vue'

// 创建路由对象
var router = new VueRouter({
    routes: [
        // account  goodslist
        { path: '/account', component: account,
            children:[
                {path: 'account_login', component: account_login}, {path: 'account_register', component: account_register}
            ]
        },
        { path: '/goodslist', component: goodslist }

    ]
})

// 把路由对象暴露出去
export default router
// export router  为什么一定要加default ?