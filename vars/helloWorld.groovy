def call(Map config = [:]) {
    sh "echo Hi ${config.name} , today is ${config.dayOfWeek}"
}
