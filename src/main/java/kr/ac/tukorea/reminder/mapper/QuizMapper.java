package kr.ac.tukorea.reminder.mapper;

import kr.ac.tukorea.reminder.model.QuizModel;
import org.apache.ibatis.annotations.*;

@Mapper
public interface QuizMapper {
    @Insert("INSERT INTO QUIZ (word, mean, quizSpace) VALUES(#{word}, #{mean}, #{quizSpace})")
    int insertQuiz(
            @Param("word") String word,
            @Param("mean") String mean,
            @Param("quizSpace") int quizSpace
    );

    @Delete("DELETE FROM QUIZ WHERE word=#{word}")
    int deleteQuiz(@Param("word") String word);

    @Update("UPDATE QUIZ SET word=#{word}, mean=#{mean} WHERE word=#{word}")
    int updateQuiz(
            @Param("word") String word,
            @Param("mean") String mean
    );

    @Select("SELECT * FROM QUIZ WHERE quizSpace=#{quizSpace}")
    QuizModel getQuizList(@Param("quizSpace") int quizSpace);

    @Update("UPDATE QUIZ SET quizSpace=#{quizSpace} WHERE word=#{word}")
    int updateQuizSpace(
            @Param("word") String word,
            @Param("quizSpace") int quizSpace
    );
}
