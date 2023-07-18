let num1=Math.floor(Math.random() * 10) + 1;//generates random number between 1-10
let num2=Math.floor(Math.random() * 10) + 1;

document.getElementById("number1").innerHTML=num1;
document.getElementById("number2").innerHTML=num2;

let sum=Number(num1)+Number(num2);
let diff=Number(num1)-Number(num2);
let mul=Number(num1)*Number(num2);
let division=Number(num1)/Number(num2);
let remainder=Number(num1)%Number(num2)
//no floor division in javascript
let is_equal=num1==num2
let power=Math.pow(num1,num2)
const pi=3.14;
let m_pi;
m_pi=pi*num1

document.getElementById("result").innerHTML="Sum: "+sum+"<br>Diff: "+diff+"<br>Product: "+mul+"<br>Division: "+division+'<br>Remainder:'+remainder+"<br>Mulitipilication of num1 with pi:"+m_pi+'<br>are_equal:'+is_equal+"<br>Power:"+power;