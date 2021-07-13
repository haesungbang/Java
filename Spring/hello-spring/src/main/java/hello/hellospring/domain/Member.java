package hello.hellospring.domain;

public class Member {
    // 요구사항 ID(시스템에 저장하는 아이디), 이름
    private Long id;
    private String name;

    // getter, setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
