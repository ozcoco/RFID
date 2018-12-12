package com.rfid.service;

import com.rfid.rest.IWebservice;
import com.rfid.sql.ISQLService;

public interface IServiceManager {

    IWebservice getWebservice();

    ISQLService getSQLService();

}
