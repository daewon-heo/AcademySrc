// 1. 실습 문제
function changeQuery(){
    var result1 = document.getElementById('result1');
    result1.value = "INSERT INTO EMPLOYEE VALUES(100,'홍길동', 'HR부서', 2000000, 0.1);";

}

function checkOddEven() {
    //함수의 로직을 작성하세요.
    // silsub2
    var num = prompt("숫자를 입력하세요");
    var divEl = document.getElementById('silsub2');
    var result = "";

    if(num%2 == 0){
        result = "짝수입니다.";
    }else if(num%2 == 1){
        result = "홀수입니다.";
    }else{
        result = "숫자가 아닙니다.";
    }
    console.log(result);

    divEl.innerHTML = result;
}

function changeImage(){
    // 함수의 로직을 작성하세요.
    // hint : setAttribute('속성명', '속성값');
    var imgEl = document.getElementById('image1');
    imgEl.setAttribute('src', '../resource/images/Android.gif');
}

function changeCSS(){
    //함수의 로직을 작성하세요.
    var divEl = document.getElementById('silsub3');
    divEl.setAttribute('style', 'color:navy;')

}

function calculator(op){
    //함수의 로직을 작성하세요.
    //  num1,num2
    // result = span#calc
    var num1 = document.getElementById('num1').value;
    var num2 = document.getElementById('num2').value;
    var result = 0;

    switch(op){
        case '+':
        result =  Number(num1) + Number(num2);
        break;
        case '-':
        result = num1-num2;
        break;
        case 'x':
        result = num1*num2;
        break;
        case '/':
        result = num1/num2;
        break;
        case '%':
        result = num1%num2;
        break;
    }
    
    document.getElementById('calc').innerHTML = result;
}

// 하노이 START..........

cnt = 0;

function finish(obj){
    obj.style.color ="MidnightBlue";
    document.getElementById('bun').style.display = "block";
}

function hanoiStart(n, from, by, to){
    // 함수의 로직을 작성하세요.
    
    if(n > 5){
        print("5를 초과 할 수 없습니다.");
    }else if(n >= 1){
        hanoiStart(n-1 ,from, to, by);
        print("원판[" + n +"] : " + from + " -------> " + to);
        cnt++;
        hanoiStart(n-1 ,by, from, to);
    }
};

function hanoiend(num){
    if(num <= 5){
        print("--------------");
        print("총 원판 : " + num + " 개");
        print("최소 이동 횟수 : " + cnt + " 번 <br><br>");
    }

    cnt = 0;
}

function print(str){
    var divHanoi = document.getElementById('bundle_hanoi');
    divHanoi.innerHTML += str + " <br>";
}

// 하노이 END..........