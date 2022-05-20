package kr.ac.tukorea.reminder.mapper;

import kr.ac.tukorea.reminder.model.QuizModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface QuizMapper {
    @Insert("INSERT INTO QUIZ (word, mean, quizSpace, uid) VALUES(#{word}, #{mean}, #{quizSpace}, #{uid})")
    int insertQuiz(
            @Param("word") String word,
            @Param("mean") String mean,
            @Param("quizSpace") int quizSpace,
            @Param("uid") String uid
    );

    @Delete("DELETE FROM QUIZ WHERE word=#{word} AND uid=#{uid}")
    int deleteQuiz(
            @Param("word") String word,
            @Param("uid") String uid
    );

    @Update("UPDATE QUIZ SET word=#{word}, mean=#{mean} WHERE word=#{word} AND uid=#{uid}")
    int updateQuiz(
            @Param("word") String word,
            @Param("mean") String mean,
            @Param("uid") String uid
    );

    @Select("SELECT * FROM QUIZ WHERE quizSpace=#{quizSpace} AND uid=#{uid}")
    List<QuizModel> getQuizList(
            @Param("quizSpace") int quizSpace,
            @Param("uid") String uid
    );

    @Update("UPDATE QUIZ SET quizSpace=#{quizSpace} WHERE word=#{word} AND uid=#{uid}")
    int updateQuizSpace(
            @Param("word") String word,
            @Param("quizSpace") int quizSpace,
            @Param("uid") String uid
    );
}
