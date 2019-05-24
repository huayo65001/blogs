package com.example.blogs.domain.dto;

public class UpdateReplySumDTO {
    private int replyId;
    private int sum;

    public UpdateReplySumDTO(int replyId, int sum) {
        this.replyId = replyId;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "UpdateReplySumDTO{" +
                "replyId=" + replyId +
                ", sum=" + sum +
                '}';
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
