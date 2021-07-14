package hello.hellospring.controller;

public class MemberForm {

    // creation 에서 넘어오는 name 이 여기로 들어온다.
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
