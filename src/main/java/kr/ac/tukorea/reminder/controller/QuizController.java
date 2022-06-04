package kr.ac.tukorea.reminder.controller;

import kr.ac.tukorea.reminder.mapper.QuizMapper;
import kr.ac.tukorea.reminder.model.QuizModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizController {
    private QuizMapper mapper;

    public QuizController(QuizMapper mapper) {
        this.mapper = mapper;
    }

//    Hello API
    @GetMapping("/hello")
    public String hello(
    ) {
        return "Hello API!";
    }

//    Quiz Insert API
    @PostMapping("/quiz/add")
    public void addQuiz(
            @RequestBody() QuizModel quizModel
    ) {
        String word = quizModel.getWord();
        String mean = quizModel.getMean();
        String uid = quizModel.getUid();
        int quizSpace = 1;

        mapper.insertQuiz(word, mean, quizSpace, uid);
    }

//    Quiz Delete API
    @DeleteMapping("/quiz/del")
    public void delQuiz(
            @RequestBody() QuizModel quizModel
    ) {
        String word = quizModel.getWord();
        String uid = quizModel.getUid();
        mapper.deleteQuiz(word, uid);
    }

//    Quiz Update API
    @PutMapping("/quiz/update")
    public void modifyQuiz(
            @RequestBody() QuizModel quizModel
    ) {
        String word = quizModel.getWord();
        String mean = quizModel.getMean();
        String uid = quizModel.getUid();
        mapper.updateQuiz(word, mean, uid);
    }

//    Get QuizList API
    @PostMapping("/quiz")
    public List<QuizModel> getQuizList(
            @RequestBody() QuizModel quizModel
    ) {
        int quizSpace = quizModel.getQuizSpace();
        String uid = quizModel.getUid();
        return mapper.getQuizList(quizSpace, uid);
    }

//  Update Quiz Space API
    @PutMapping("/quiz/updateSpace")
    public void modifyQuizSpace(
            @RequestBody() QuizModel quizModel
    ) {
        String word = quizModel.getWord();
        int quizSpace = quizModel.getQuizSpace();
        String uid = quizModel.getUid();
        mapper.updateQuizSpace(word, quizSpace, uid);
    }
}
