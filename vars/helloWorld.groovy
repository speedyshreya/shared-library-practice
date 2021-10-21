def call(Map config = [:]) {
    echo "Hello, ${config.name} ,today is a ${config.dayOfWeek}, and the month is ${config.monthOfYear}"
}
