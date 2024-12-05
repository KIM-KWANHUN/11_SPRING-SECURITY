package com.ohgiraffers.petharmony.MODEL;

import com.ohgiraffers.petharmony.DAO.petMapper;
import com.ohgiraffers.petharmony.DTO.petAllDTO;
import com.ohgiraffers.petharmony.DTO.petDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class petService {
    private final petMapper mapper;

    public petService(petMapper mapper) {
        this.mapper = mapper;
    }

    public List<petAllDTO> empJoin() {

        return mapper.empJoin();
    }

    public List<petDTO> empAll() {

        return mapper.empAll();
    }

    public petDTO empCode(String empCode) {

        return mapper.empCode(empCode);
    }
}
