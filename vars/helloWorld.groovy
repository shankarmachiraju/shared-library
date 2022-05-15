def call(Map config = [:]) {
    sh "echo Hi ${config.name} , hey today issss ${config.dayOfWeek}"
}
