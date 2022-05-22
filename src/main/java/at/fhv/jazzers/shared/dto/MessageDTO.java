package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;

public class MessageDTO implements Serializable {
    private String topic;
    private String title;
    private String message;

    public MessageDTO() {

    }

    public MessageDTO(String topic, String title, String message) {
        this.topic = topic;
        this.title = title;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageDTO that = (MessageDTO) o;
        return topic.equals(that.topic) && title.equals(that.title) && message.equals(that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, title, message);
    }
}
