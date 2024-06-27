const base = {
    get() {
        return {
            url : "http://localhost:8080/clothingmall/",
            name: "clothingmall",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/clothingmall/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "衣依服装销售平台"
        } 
    }
}
export default base
