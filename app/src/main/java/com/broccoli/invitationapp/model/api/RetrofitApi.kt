package com.broccoli.invitationapp.model.api

import com.broccoli.invitationapp.model.UserModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitApi {

    @POST("/fakeAuth")
    suspend fun sendUser(
        @Body user: UserModel
    ): Response<String>?
}