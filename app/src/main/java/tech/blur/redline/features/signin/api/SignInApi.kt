package tech.blur.redline.features.signin.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import tech.blur.redline.core.model.User
import tech.blur.redline.core.model.UserLoginPass

interface SignInApi {

    @POST("auth/")
    fun authUser(@Body userLoginPass: UserLoginPass): Call<User>

}