package com.example.project.service;

import com.example.project.db.mysql.tables.records.BookRecord;
import com.example.project.db.mysql.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.project.db.mysql.Tables.USER;

@Service
public class DefaultUserService implements UserService {

    @Autowired
    DSLContext dsl;

    @Override
    @Transactional
    public void create(String name) {
        dsl.insertInto(USER).set(USER.NAME,name).execute();
        System.out.println("no i gdzie to jest:" + name);

        Result<UserRecord> result = dsl.selectFrom(USER).fetch();
        for(UserRecord r: result){
            System.out.println(r.getId() + " : " + r.getName());
        }

    }

}