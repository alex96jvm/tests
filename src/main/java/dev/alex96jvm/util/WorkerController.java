package dev.alex96jvm.util;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/worker")
@RequiredArgsConstructor
public class WorkerController {
    private final WorkerService workerService;

    @GetMapping("/salary-sum")
    public int getSumOfSalariesOfAllWorkers(){
        return workerService.getSumOfSalariesOfAllWorkers();
    }
}
