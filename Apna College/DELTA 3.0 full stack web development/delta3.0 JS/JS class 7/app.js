let student = {
    name : "shradha",
    age : 23,
    eng : 95,
    math: 93,
    phy : 97,
    getAvg (){
        console.log(this);
        let average = (this.eng + this.phy + this.math)/3;
        console.log(`${this.name} got avg marks = ${average}`);
    }
}