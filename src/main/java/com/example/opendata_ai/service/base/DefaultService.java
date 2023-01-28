package com.example.opendata_ai.service.base;

import com.example.opendata_ai.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultService {

    @Autowired
    AttendanceRepository attendanceRepository;

    @Autowired
    ExamRepository examRepository;

    @Autowired
    FilesRepository filesRepository;

    @Autowired
    LessonRepository lessonRepository;

    @Autowired
    QrCodeRepository qrCodeRepository;

    @Autowired
    RoomRepository repository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    TimeTableRepository tableRepository;
}
