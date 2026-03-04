package com.javatpoint;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question {

    private int id;
    private String name;
    private Map<Answer, User> answer;   // property name = answer

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Answer, User> getAnswer() {
        return answer;
    }

    // ✅ CORRECT setter
    public void setAnswer(Map<Answer, User> answer) {
        this.answer = answer;
    }

    public void displayInfo() {
        System.out.println("question id: " + id);
        System.out.println("question name: " + name);
        System.out.println("Answers...");

        Set<Entry<Answer, User>> set = answer.entrySet();
        Iterator<Entry<Answer, User>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<Answer, User> entry = itr.next();
            Answer ans = entry.getKey();
            User user = entry.getValue();

            System.out.println("Answer Information:");
            System.out.println(ans);
            System.out.println("Posted By:");
            System.out.println(user);
        }
    }
}