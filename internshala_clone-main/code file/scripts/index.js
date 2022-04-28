const slideShow = () => {
    let img_arr = ['./code file/images/int1.PNG','./code file/images/int2.PNG','./code file/images/int3.PNG','./code file/images/int4.PNG']
    let slide_img = document.getElementById('slideshow_img')
    let i=0;
    var x = setInterval(function(){
        if(i==img_arr.length){
            i=0;
        }
        slide_img.src = img_arr[i];
        i++;
    },4000)
}
slideShow();

import navbar from "../components/navbar.js";
document.querySelector('header').innerHTML = navbar()

import footer from "../components/footer.js"
document.querySelector('footer').innerHTML = footer()