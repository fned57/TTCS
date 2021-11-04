package com.tiemvacxin.Controller;


import com.tiemvacxin.Database.DiaDiemDao;
import com.tiemvacxin.Model.DiaDiem;
import com.tiemvacxin.Model.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/DiaDiem")
public class DiaDiemController {

    DiaDiemDao DiadiemDao;
    @GetMapping("/")
    public @ResponseBody
    Iterable<DiaDiem>  GetAll(){
        return  DiadiemDao.findAll();
    }
    @PostMapping("/")
    public @ResponseBody DiaDiem createDiaDiem(@RequestBody DiaDiem diaDiem){
        DiadiemDao.save(diaDiem);
        return  diaDiem;
    }

    @PutMapping("/{id}")
    public @ResponseBody DiaDiem UpdateDiaDiem(@RequestBody DiaDiem diadiem, @RequestParam Integer id){
        return  null;

    }
    @DeleteMapping("/{id}")
    public @ResponseBody User DeleteDiaDiem(@RequestParam Integer id){

//        User a = userDao.findAllById(Collections.singleton(id)).getClass();
        return  null;

    }
}
