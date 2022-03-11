package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "User_tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Status status;
@Transient
@ManyToMany (mappedBy = "tasks")
    private Set<User> users;

    public Task(Long id, Status status) {
        this.id = id;
        this.status = status;
    }

    public Task() {

    }

    public long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
