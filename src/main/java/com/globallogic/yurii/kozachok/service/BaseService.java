package com.globallogic.yurii.kozachok.service;

import org.springframework.stereotype.Service;


public interface BaseService<T> {
    T findEntityById(long id);
}
