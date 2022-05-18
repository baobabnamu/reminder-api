package kr.ac.tukorea.reminder.controller;

import kr.ac.tukorea.reminder.model.UserProfile;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserProfileController {

    private Map<String, UserProfile> userMap;

    @PostConstruct
    public void init() {
        userMap = new HashMap<String, UserProfile>();
        userMap.put("1", new UserProfile("1","test1","test1"));
        userMap.put("2", new UserProfile("2","test2","test2"));
    }

    @GetMapping("/user/{id}") // path variable 매칭됨
    public UserProfile getUserProfile(@PathVariable("id") String id) {
        return userMap.get(id);
    }

    @GetMapping("/user/all")
    public List<UserProfile> getUserProfileList() {
        return new ArrayList<UserProfile>(userMap.values());
    }

    @PutMapping("/user/{id}") // path variable 매칭됨
    public void putUserProfile(
            @PathVariable("id") String id,
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ) {
        UserProfile userProfile = userMap.get(id);
        userProfile.setUsername(username);
        userProfile.setPassword(password);
    }

    @PostMapping("/user/{id}")
    public void postUserProfile(
            @PathVariable("id") String id,
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ) {
        UserProfile userProfile = new UserProfile(id, username, password);
        userMap.put(id, userProfile);
    }
}
