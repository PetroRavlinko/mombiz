plugins {
    id("online.ravlinko.license")
}

println("BUILD SCRIPT: This is executed during the configuration phase")

tasks.register("task1"){
    println("REGISTER TASK1: This is executed during the configuration phase")
}

tasks.named("task1"){
    println("NAMED TASK1: This is executed during the configuration phase")
    doFirst {
        println("NAMED TASK1 - doFirst: This is executed during the execution phase")
    }
    doLast {
        println("NAMED TASK1 - doLast: This is executed during the execution phase")
    }
}