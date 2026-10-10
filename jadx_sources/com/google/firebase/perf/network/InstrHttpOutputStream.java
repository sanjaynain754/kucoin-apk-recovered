package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class InstrHttpOutputStream extends OutputStream {
    long bytesWritten = -1;
    NetworkRequestMetricBuilder networkMetricBuilder;
    private final OutputStream outputStream;
    private final Timer timer;

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        try {
            this.outputStream.write(i11);
            long j11 = this.bytesWritten + 1;
            this.bytesWritten = j11;
            this.networkMetricBuilder.setRequestPayloadBytes(j11);
        } catch (IOException e11) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e11;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j11 = this.bytesWritten;
        if (j11 != -1) {
            this.networkMetricBuilder.setRequestPayloadBytes(j11);
        }
        this.networkMetricBuilder.setTimeToRequestCompletedMicros(this.timer.getDurationMicros());
        try {
            this.outputStream.close();
        } catch (IOException e11) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e11;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.outputStream.flush();
        } catch (IOException e11) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e11;
        }
    }

    public InstrHttpOutputStream(OutputStream outputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.outputStream = outputStream;
        this.networkMetricBuilder = networkRequestMetricBuilder;
        this.timer = timer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.outputStream.write(bArr);
            long length = this.bytesWritten + ((long) bArr.length);
            this.bytesWritten = length;
            this.networkMetricBuilder.setRequestPayloadBytes(length);
        } catch (IOException e11) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        try {
            this.outputStream.write(bArr, i11, i12);
            long j11 = this.bytesWritten + ((long) i12);
            this.bytesWritten = j11;
            this.networkMetricBuilder.setRequestPayloadBytes(j11);
        } catch (IOException e11) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e11;
        }
    }
}
