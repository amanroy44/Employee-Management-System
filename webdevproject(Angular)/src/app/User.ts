export class User{
    username:String;
    firstname : String;
    lastname : String;
    password : String;
    age : number;
    city : String;
    constructor(
        username : String,
        firstname : String,
        lastname : String,
        password : String,
        age : number,
        city : String
    ){
        this.username=username;
        this.firstname=firstname;
        this.lastname=lastname;
        this.password=password;
        this.age=age;
        this.city=city;


    }
}