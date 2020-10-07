package com.bytedance.nacosprovidermovie.service;

import com.bytedance.nacosprovidermovie.bean.Movie;
import com.bytedance.nacosprovidermovie.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieDao movieDao;

    public Movie getMovie(Integer id) {
        return movieDao.getMovieById(id);
    }
}
