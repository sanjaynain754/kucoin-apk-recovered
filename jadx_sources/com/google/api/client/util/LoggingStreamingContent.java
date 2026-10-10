package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes56.dex */
public final class LoggingStreamingContent implements StreamingContent {
    private final StreamingContent content;
    private final int contentLoggingLimit;
    private final Logger logger;
    private final Level loggingLevel;

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        LoggingOutputStream loggingOutputStream = new LoggingOutputStream(outputStream, this.logger, this.loggingLevel, this.contentLoggingLimit);
        try {
            this.content.writeTo(loggingOutputStream);
            loggingOutputStream.getLogStream().close();
            outputStream.flush();
        } catch (Throwable th2) {
            loggingOutputStream.getLogStream().close();
            throw th2;
        }
    }

    public LoggingStreamingContent(StreamingContent streamingContent, Logger logger, Level level, int i11) {
        this.content = streamingContent;
        this.logger = logger;
        this.loggingLevel = level;
        this.contentLoggingLimit = i11;
    }
}
