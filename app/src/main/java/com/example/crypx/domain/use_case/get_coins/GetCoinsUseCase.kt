package com.example.crypx.domain.use_case.get_coins

import android.util.Log
import com.example.crypx.data.remote.dto.toCoin
import com.example.crypx.domain.model.Coin
import com.example.crypx.domain.repository.CrypXRepository
import com.example.crypx.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CrypXRepository
){

    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try{
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            Log.d("GetCoinsUseCase", "invoke: ${coins.size}}")
            emit(Resource.Success(coins))
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