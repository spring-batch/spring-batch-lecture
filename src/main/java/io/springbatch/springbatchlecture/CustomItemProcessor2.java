package io.springbatch.springbatchlecture;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor2 implements ItemProcessor<ProcessorInfo, ProcessorInfo> {

    public ProcessorInfo process(ProcessorInfo item) throws Exception {
        return item;
    }
}