package com.example.apitest2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping
@RequiredArgsConstructor
@CrossOrigin("*")
public class ApiController {

    private final ApiRepository apiRepository;

    @PostMapping(path = "/api")
    public @ResponseBody void addMember (@ModelAttribute ApiEntity apiEntity){
        System.out.println("플루터 데이터 전송 완료");
        System.out.println(apiEntity.address1);
        apiRepository.save(apiEntity);



    }
}
