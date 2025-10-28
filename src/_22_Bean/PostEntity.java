package _22_Bean;

import java.time.LocalDateTime;

/*
 * 게시물 엔티티===
 * 게시물 아이디
 * 게시물 제목
 * 게시물 내용
 * 작성자 아이디
 * 작성자 닉네임
 * 생성시각
 * 수정시각
 *
 * */
public class PostEntity {
    private int boardId;
    private String title;
    private String body;
    private int userId;
    private String userName;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;


    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }

    @Override
    public String toString() {
        return "게시물 아이디: "+ boardId +", 게시물 제목: "+title+", 게시물 내용: "+body+", 작성자 아이디: "+userId+", 작성자 닉네임: "+userName+", 생성시각: "+createDt+", 수정시각: "+updateDt;
    }
}
