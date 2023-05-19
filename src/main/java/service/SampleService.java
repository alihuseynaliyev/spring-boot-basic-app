package service;

import dao.repository.SampleRepository;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }
}
