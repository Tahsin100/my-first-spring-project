package io.test.sample.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topic")
    private List<Topic> getTopicList() {
        return Arrays.asList(new Topic("1", "Spring", "Des1"),
                new Topic("2", "Java", "Des2"),
                new Topic("3", "Hibernate", "Des3"));
    }

}
