let arr1=[2,5,8];
let arr2=[2,5];
let arr3=[11,12,...arr1,65,...arr2];

console.log(arr3.length);
console.dir(arr3);

function fsum(arr){
    //방법1
    let sum=0;
    for(i=0;i<arr.length;i++){
        sum+=arr[i];
    }

    console.log("합계:"+sum);

}

// for(let a in arr){
//     sum+=arr[a];
// }
// console.log("합계:"+sum);

// fsum(arr3);

function func3(a,b,c,e,f,g){
    console.log(a,b,c,e,f,g);
}

func3(...arr3);