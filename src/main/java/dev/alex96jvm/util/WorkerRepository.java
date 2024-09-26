package dev.alex96jvm.util;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WorkerRepository {

    private List<Worker> workers = new ArrayList<>();

    public List<Worker> getWorkers() {
        return workers;
    }

    public void saveWorker(Worker worker){
        workers.add(worker);
    }
}
