package com.example.weatherapp.domain.commands

import com.example.weatherapp.data.ForecastRequest
import com.example.weatherapp.domain.mappers.ForecastDataMapper
import com.example.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}