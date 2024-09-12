let a:number[]=[10,19,2,7,4,3];
for(let i:number=0;i<a.length;i++){
    for(let j:number=i+1;j<a.length;j++){
            if(a[i]>=a[j]){
                [a[i],a[j]]=[a[j],a[i]];
            }
    }
}
console.log("the Selection sort are: "+a);

