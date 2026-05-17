package com.example.ss03_btth4.controller;

import com.example.ss03_btth4.model.SinhVien;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SinhVienController {

    @GetMapping(value = "/sinhvien", produces = {"application/json", "application/xml"})
    public List<SinhVien> getSinhViens() {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("SV001", "Nguyen Van A", 8.5));
        list.add(new SinhVien("SV002", "Tran Thi B", 7.0));
        list.add(new SinhVien("SV003", "Le Van C", 9.2));
        return list;
    }
}
