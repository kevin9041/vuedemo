
const path = require('path')

// 启用热更新的 第2步
const webpack = require('webpack')

// 导入在内存中生成 HTML 页面的 插件
// 只要是插件，都一定要 放到 plugins 节点中去
// 这个插件的两个作用：
//  1. 自动在内存中根据指定页面生成一个内存的页面
//  2. 自动，把打包好的在内存中的bundle.js 追加到页面中去
const htmlWebpackPlugin = require('html-webpack-plugin')

// 这个配置文件，起始就是一个 JS 文件，通过 Node 中的模块操作，向外暴露了一个 配置对象
module.exports = {
    entry: path.join(__dirname, './src/main.js'),// 入口，表示，要使用 webpack 打包哪个文件
    output: { // 输出文件相关的配置
        path: path.join(__dirname, './dist'), // 指定 打包好的文件，输出到哪个目录中去
        filename: 'bundle.js' // 这是指定 输出的文件的名称
    },
    devServer: { // 这是配置 webpack-dev-server 命令参数的第二种形式，相对来说，这种方式麻烦一些
        //  --open --port 3000 --contentBase src --hot
        open: true, // 自动打开浏览器
        port: 9000, // 设置启动时候的运行端口
        // contentBase: 'src', // 指定托管的根目录
        hot: true // 启用热更新 的 第1步(似乎这个配置可有可无，关键是有没有启 new webpack.HotModuleReplacementPlugin())
    },
    plugins: [ // 配置插件的节点
        //这是 启用热更新的第 3 步
        new webpack.HotModuleReplacementPlugin(), // new 一个热更新的 模块对象(此时会在内存中生成一个bundle.js)

        // 创建一个在内存中 生成HTML  页面的插件
        new htmlWebpackPlugin({
            template: path.join(__dirname, './src/index.html'), // 指定 模板页面，将来会根据指定的页面路径，去生成内存中的 页面
            filename: 'index-hot.html' // 指定生成的页面的名称(实际访问的是这个filename，其位置是在托管的路径下，刚好内存中的bundle.js也会生成在托管的路径下，则filename自动引入script时都是<script type="text/javascript" src="bundle.js"></script>)
        })
    ],
    module: { // 这个节点，用于配置 所有 第三方模块 加载器
        rules: [ // 所有第三方模块的 匹配规则
            { test: /\.css$/, use: ['style-loader', 'css-loader'] }, //  配置处理 .css 文件的第三方loader 规则
            { test: /\.less$/, use: ['style-loader', 'css-loader', 'less-loader'] }, //配置处理 .less 文件的第三方 loader 规则
            { test: /\.scss$/, use: ['style-loader', 'css-loader', 'sass-loader'] }, // 配置处理 .scss 文件的 第三方 loader 规则
        ]
    }
}

// webpack 命令执行打包步骤：
//  1. 首先，webpack 发现，我们并没有通过命令的形式，给它指定入口和出口
//  2. webpack 就会去 项目的 根目录中，查找一个叫做 `webpack.config.js` 的配置文件
//  3. webpack找到配置文件并解析执行，得到配置对象
//  4. 当 webpack拿到了 配置对象中，指定的 入口  和 出口，然后进行打包构建；