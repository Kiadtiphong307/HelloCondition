fun main(args: Array<String>) {
 var score = 50

    //  แบบที่ 1
    //  var exam = "fail"
    // if (score >= 50)  exam = "pass"

    // แบบที่ 2
    //  var exam = ""
    // if (score >= 50) {exam = "pass"} else {exam = "fail"}

    // แบบที่ 3
    // // var exam =  if (score >= 50) { 
    // //     println ("Congratulation!")
    // //     "pass"} else {"fail"}
    // println("The score is $score, result is $exam")

// var grage = "X"
// if (score >= 80) {grage = "A"}
//     else if (score >= 70) {grage = "B"}
//     else if (score >= 60) {grage = "C"}
//     else if (score >= 50) {grage = "D"}
//     else {grage = "F"}

var grade = if (score >= 80) "A"
    else if (score >= 70) "B"
    else if (score >= 60) "C"
    else if (score >= 50) "D"
    else  "F"
    
    println ("score = $score, grade = $grade")


}