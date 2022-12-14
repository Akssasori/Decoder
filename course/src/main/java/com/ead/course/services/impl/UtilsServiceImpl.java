package com.ead.course.services.impl;

import com.ead.course.services.UtilsService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UtilsServiceImpl implements UtilsService {

//    @Value("${ead.api.url.authuser}")
//    String REQUEST_URI;

//    String REQUEST_URI = "http://localhost:8087";

    public String createUrlGetAllUsersByCourse(UUID courseId, Pageable pageable) {

        return "/users?courseId=" + courseId + "&page=" + pageable.getPageNumber() + "&size=" + pageable
                .getPageSize() + "&sort=" + pageable.getSort().toString().replaceAll(": ", ",");
    }
}
