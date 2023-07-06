package com.example.crypx.domain.use_case.get_coin

import com.example.crypx.data.remote.dto.toCoinDetail
import com.example.crypx.domain.model.CoinDetail
import com.example.crypx.domain.repository.CrypXRepository
import com.example.crypx.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinDetailsUseCase @Inject constructor(
    private val repository: CrypXRepository
){

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try{
            emit(Resource.Loading())
            val coinDetail = repository.getCoinDetail(coinId).toCoinDetail()
            emit(Resource.Success(coinDetail))
        }catch(e: HttpException){
            emit(
                Resource.Error(
                    e.message ?: "Couldn't reach server. Check your internet connection"
                )
            )
        }catch(e: IOException){
            emit(Resource.Error(e.message ?:"Couldn't reach server. Check your internet connection"))
        }
    }



}