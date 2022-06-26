package com.tanvir.training.actioninputsbatch04

data class BusSchedule(
    val id: Long,
    val name: String,
    val from: String,
    val to: String,
    val departureDate: String,
    val departureTime: String,
    val busType: String,
    var favorite: Boolean = false
)

val scheduleList = mutableListOf<BusSchedule>(
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
    BusSchedule(id = System.currentTimeMillis(), name = "Shohag", departureTime = "23:00", departureDate = "07/04/2022", busType = "Business", from = "Dhaka", to = "Chittagong"),
)
