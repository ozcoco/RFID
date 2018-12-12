package com.rfid.sql;

import androidx.annotation.NonNull;

import com.rfid.sql.dao.UserDao;

public interface ISQLService {

    @NonNull
    UserDao getUserDao();

}
