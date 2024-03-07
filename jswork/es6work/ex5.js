//화살표 함수: 일반함수와의 차이점: 객체생성안됨,new로 사용못함
// 자바 Ramda(익명함수)와 같은방식(function 키워드 대신 ()와 화살표 사용해서 기존보다 간단히 함수 정의)
// 일반함수
function f1(){
    console.log("일반함수 f1");
}
f1();

// 화살표
let f2=()=>console.log("화살표 함수 f2");
f2();

//일반
function f3(a,b){
    return a+b;
}

let a=f3(5,7);
console.log(a);

//화살표
let f4=(a,b)=>a+b;
let b=f4(11,13);
console.log(b);

//일반
function f5(x,y,z=30)
{
    return x+y+z;
}

console.log(f5(1,2,3));
console.log(f5(10,20));

//화살표 f6로 구현
let f6=(a,b,c)=>a+b+c;
let c=f6(11,12,13);
console.log(c);

//오브젝트 함수를 객체로 만들수 있다
let ob={
    f1:()=>{
        console.log(1);

        let f2=()=>console.log(2);
        f2();

        setTimeout(f2,1000);
    }
}

ob.f1();


