package com.jverson.quartz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Suryakanta Sahoo
 * @date Jan 23, 2018 1:10:47 PM
 */
@Service
public class SampleService {

    private static final Logger LOG = LoggerFactory.getLogger(SampleService.class);

    public void hello(String jobName) {
        LOG.info(">>>>> jobName = [" + jobName + "]" + " excuted.");
    }
}
