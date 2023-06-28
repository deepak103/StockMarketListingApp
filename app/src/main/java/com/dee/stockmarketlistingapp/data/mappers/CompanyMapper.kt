package com.dee.stockmarketlistingapp.data.mappers

import com.dee.stockmarketlistingapp.data.local.CompanyListingEntity
import com.dee.stockmarketlistingapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing():CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity():CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}