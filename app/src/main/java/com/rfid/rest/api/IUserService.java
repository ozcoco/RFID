package com.rfid.rest.api;

import com.rfid.po.User;
import com.rfid.vo.UserVo;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IUserService {

    @GET("user/{userId}")
    Observable<User> user(@Path("userId") int userId);

    @GET("user/list/{page}")
    Observable<UserVo> users(@Path("page") int page);

}
