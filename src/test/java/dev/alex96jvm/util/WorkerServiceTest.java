package dev.alex96jvm.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class WorkerServiceTest {
    @InjectMocks
    private WorkerService workerService;
    @Mock
    private WorkerRepository workerRepository;
    @Test
    void getSumOfSalariesOfAllWorkers(){
        Worker worker1 = new Worker(1, "Alex", 299);
        Worker worker2 = new Worker(1, "Ivan", 100 );
        Mockito.when(workerRepository.getWorkers()).thenReturn(List.of(worker1, worker2));
        int sumOfSalariesOfAllWorkers = workerService.getSumOfSalariesOfAllWorkers();
        Assertions.assertEquals(399, sumOfSalariesOfAllWorkers);
    }
    @Test
    void hire_withLowSalary_throwException() {
        Worker worker = new Worker(1, "Alex", 15_000);
        Assertions.assertThrows(TooLowSalaryException.class, () -> workerService.hire(worker));
    }
    @Test
    void hire_withValidSalary_savesWorker() {
        Worker worker = new Worker(1, "Petr", 20_000);
        workerService.hire(worker);
        Mockito.verify(workerRepository, Mockito.times(1)).saveWorker(worker);
    }
}
