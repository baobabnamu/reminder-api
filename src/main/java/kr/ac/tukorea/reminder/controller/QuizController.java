package kr.ac.tukorea.reminder.controller;

import kr.ac.tukorea.reminder.mapper.QuizMapper;
import kr.ac.tukorea.reminder.model.QuizModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
        int quizSpace = 1;

        mapper.insertQuiz(word, mean, quizSpace);
    }

//    Quiz Delete API
    @DeleteMapping("/quiz/del")
    public void delQuiz(
            @RequestBody() QuizModel quizModel
    ) {
        String word = quizModel.getWord();
        mapper.deleteQuiz(word);
    }

//    Quiz Update API
    @PutMapping("/quiz/update") // path variable 매칭됨
    public void modifyQuiz(
            @RequestBody() QuizModel quizModel
    ) {
        String word = quizModel.getWord();
        String mean = quizModel.getMean();
        mapper.updateQuiz(word, mean);
    }

//    Get QuizList API
    @GetMapping("/quiz/{quizSpace}") // path variable 매칭됨
    public List<QuizModel> getQuizList(
            @PathVariable("quizSpace") int quizSpace
    ) {
        return mapper.getQuizList(quizSpace);
    }

//  Update Quiz Space API
    @PutMapping("/quiz/updateSpace")
    public void modifyQuizSpace(
            @RequestBody() QuizModel quizModel
    ) {
        String word = quizModel.getWord();
        int quizSpace = quizModel.getQuizSpace();
        mapper.updateQuizSpace(word, quizSpace);
    }
}
