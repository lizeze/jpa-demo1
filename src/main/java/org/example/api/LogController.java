package org.example.api;


import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.example.dao.LogDao;
import org.example.entity.LogRecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("api/log")
@RestSchema(schemaId = "log")
public class LogController {


    @Autowired
    private LogDao logDao;

    public List<LogRecordEntity> list() {

        return logDao.findAll();

    }
}
