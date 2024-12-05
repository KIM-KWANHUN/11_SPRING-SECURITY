package com.ohgiraffers.petharmony.DAO;

import com.ohgiraffers.petharmony.DTO.petAllDTO;
import com.ohgiraffers.petharmony.DTO.petDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface petMapper {


    List<petAllDTO> empJoin();

    List<petDTO> empAll(); // 메뉴전체조회

    petDTO empCode(String empCode);
}
