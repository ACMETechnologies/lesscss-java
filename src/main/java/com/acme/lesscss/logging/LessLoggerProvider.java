package com.acme.lesscss.logging;

interface LessLoggerProvider {
    LessLogger getLogger(Class<?> clazz);
}
