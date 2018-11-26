package com.movitech.vue.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafTest {

    //thymeleaf---templates
    @GetMapping(value = "/demothymeleaf")
    //@RequestMapping(value = "/demothymeleaf",method = RequestMethod.GET)
    public String demoThymeleaf(){
        return "demothymeleaf";
    }

    @GetMapping(value = "/demothymeleaf-request")
    public String demothymeleafRequest(){
        return "demothymeleaf-request";
    }

    @GetMapping(value = "/demothymeleaf-welcome")
    public String demothymeleafWelcome(){
        return "welcome";
    }




    //thymeleaf---basevue
    @GetMapping(value = "/basevue01")
    public String test01(){
        return "1.v-cloak-text-html-bind-on";
    }
    @GetMapping(value = "/basevue02")
    public String test02(){
        return "2.跑马灯效果";
    }
    @GetMapping(value = "/basevue03")
    public String test03(){
        return "3.事件修饰符";
    }
    @GetMapping(value = "/basevue04")
    public String test04(){
        return "4.v-model";
    }
    @GetMapping(value = "/basevue05")
    public String test05(){
        return "5.简易计算器";
    }
    @GetMapping(value = "/basevue06")
    public String test06(){
        return "6.vue中的样式";
    }
    @GetMapping(value = "/basevue07")
    public String test07(){
        return "7.vue中的样式-style";
    }
    @GetMapping(value = "/basevue08")
    public String test08(){
        return "8.v-for";
    }
    @GetMapping(value = "/basevue09")
    public String test09(){
        return "9.v-for2";
    }
    @GetMapping(value = "/basevue10")
    public String test10(){
        return "10.v-if-show";
    }
    @GetMapping(value = "/basevue11")
    public String test11(){
        return "11.品牌列表案例";
    }
    @GetMapping(value = "/basevue12")
    public String test12(){
        return "12.过滤器的基本使用";
    }
    @GetMapping(value = "/basevue13")
    public String test13(){
        return "13.品牌列表案例2";
    }
    @GetMapping(value = "/basevue14")
    public String test14(){
        return "14.生命周期函数";
    }
    @GetMapping(value = "/basevue15")
    public String test15(){
        return "15.vue-resource";
    }
    @GetMapping(value = "/basevue16")
    public String test16(){
        return "16.客户端JSONP页面-无服务端";
    }
    @GetMapping(value = "/basevue17")
    public String test17(){
        return "17.vue-resource改造品牌列表案例";
    }
    @GetMapping(value = "/basevue18")
    public String test18(){
        return "18.动画-使用过渡类名实现动画";
    }
    @GetMapping(value = "/basevue19")
    public String test19(){
        return "19.动画-修改v-前缀";
    }
    @GetMapping(value = "/basevue20")
    public String test20(){
        return "20.动画-使用第三方类实现动画";
    }
    @GetMapping(value = "/basevue21")
    public String test21(){
        return "21.动画-使用钩子函数模拟小球半场动画";
    }
    @GetMapping(value = "/basevue22")
    public String test22(){
        return "22.动画-列表动画";
    }
    @GetMapping(value = "/basevue23")
    public String test23(){
        return "23.组件-创建组件的方式1";
    }
    @GetMapping(value = "/basevue24")
    public String test24(){
        return "24.组件-创建组件的方式2";
    }
    @GetMapping(value = "/basevue25")
    public String test25(){
        return "25.组件-创建组件的方式3";
    }
    @GetMapping(value = "/basevue26")
    public String test26(){
        return "26.组件-组件中的data和methods";
    }
    @GetMapping(value = "/basevue27")
    public String test27(){
        return "27.组件切换-方式1";
    }
    @GetMapping(value = "/basevue28")
    public String test28(){
        return "28.组件切换-方式2";
    }
    @GetMapping(value = "/basevue29")
    public String test29(){
        return "29.组件切换-切换动画";
    }
    @GetMapping(value = "/basevue30")
    public String test30(){
        return "30.复习-实现小球动画";
    }
    @GetMapping(value = "/basevue31")
    public String test31(){
        return "31.复习-定义组件的方式";
    }
    @GetMapping(value = "/basevue32")
    public String test32(){
        return "32.组件-父组件向子组件传值";
    }
    @GetMapping(value = "/basevue33")
    public String test33(){
        return "33.组件-父组件把方法传递给子组件";
    }
    @GetMapping(value = "/basevue34")
    public String test34(){
        return "34.组件案例-评论列表";
    }
    @GetMapping(value = "/basevue35")
    public String test35(){
        return "35.ref获取DOM元素和组件";
    }
    @GetMapping(value = "/basevue36")
    public String test36(){
        return "36.路由-路由的基本使用";
    }
    @GetMapping(value = "/basevue37")
    public String test37(){
        return "37.路由规则中定义参数";
    }
    @GetMapping(value = "/basevue38")
    public String test38(){
        return "38.路由规则传参方式2";
    }
    @GetMapping(value = "/basevue39")
    public String test39(){
        return "39.路由-路由的嵌套";
    }
    @GetMapping(value = "/basevue40")
    public String test40(){
        return "40.路由-命名视图实现经典布局";
    }
    @GetMapping(value = "/basevue41")
    public String test41(){
        return "41.父子组件之间传值";
    }
    @GetMapping(value = "/basevue42")
    public String test42(){
        return "42.路由基本的使用";
    }
    @GetMapping(value = "/basevue43")
    public String test43(){
        return "43.名称案例";
    }
    @GetMapping(value = "/basevue44")
    public String test44(){
        return "44.名称案例-方式2";
    }
    @GetMapping(value = "/basevue45")
    public String test45(){
        return "45.watch-监视路由地址的改变";
    }
    @GetMapping(value = "/basevue46")
    public String test46(){
        return "46.名称案例-方式3";
    }








    //mvc
    @ResponseBody
    @GetMapping(value = "/hellomvc")
    public String hellomvc(){
        return "hellomvc";
    }

}