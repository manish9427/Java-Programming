const fun = function abc (){
    var a = 10;
    console.log("Manish");
}

function xyz (){
    fun()
};

xyz();

function greet(name, callback) {
    console.log("Hello " + name);
    callback();
}

function sayGoodbye() {
    console.log("Goodbye!");
}

greet("Manish", sayGoodbye); // 'sayGoodbye' is passed as a callback
