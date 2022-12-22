package com.example.ieltsprepuz;

import com.example.ieltsprepuz.model.EssayDTO;
import com.example.ieltsprepuz.service.EssayService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EssayController {

    private final EssayService essayService;

    public EssayController(EssayService essayService) {
        this.essayService = essayService;
    }

    @GetMapping("/{id}")
    public EssayDTO getById(@PathVariable Long id)
    {
        return essayService.get(id);
    }

    @PostMapping("/create")
    public EssayDTO create(EssayDTO essayDTO)
    {
        return essayService.create(essayDTO);
    }

    @DeleteMapping("/delete")
    public void delete(EssayDTO essayDTO)
    {
        essayService.delete(essayDTO);
    }
}
