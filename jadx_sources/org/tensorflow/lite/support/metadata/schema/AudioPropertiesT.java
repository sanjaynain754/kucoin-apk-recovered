package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class AudioPropertiesT {
    private long sampleRate = 0;
    private long channels = 0;

    public long getChannels() {
        return this.channels;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public void setChannels(long j11) {
        this.channels = j11;
    }

    public void setSampleRate(long j11) {
        this.sampleRate = j11;
    }
}
