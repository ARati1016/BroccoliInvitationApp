package com.broccoli.invitationapp.model.repository

import com.broccoli.invitationapp.model.api.RetrofitInstance
import com.broccoli.invitationapp.model.UserModel
import retrofit2.Response

object Repository {

    suspend fun sendUser(user: UserModel): Response<String>? {
        return RetrofitInstance.api.sendUser(user)
    }
}