package com.kiran.student.Repository

import com.kiran.student.API.Api
import com.kiran.student.API.MyApiRequest
import com.kiran.student.API.ServiceBuilder
import com.kiran.student.entity.User
import com.kiran.student.response.LoginResponse

class UserRepo:MyApiRequest(){


    val myApi = ServiceBuilder.buildServices(Api::class.java)

    suspend fun registerUser(user: User):LoginResponse{

        return apiRequest {
            myApi.registerUser(user)

        }

    }



    suspend fun Login(username:String,password:String):LoginResponse
    {
        return apiRequest {
            myApi.Login(username,password)
        }


    }



}