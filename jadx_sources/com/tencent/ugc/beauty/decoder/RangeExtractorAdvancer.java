package com.tencent.ugc.beauty.decoder;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class RangeExtractorAdvancer extends ExtractorAdvancer {
    private long mFirstFrameTime;
    private int mLoopCount;
    protected long mRangeEndUs;

    public RangeExtractorAdvancer() {
        this(-1L);
    }

    public RangeExtractorAdvancer(long j11) {
        this.mLoopCount = -1;
        this.mRangeEndUs = j11;
    }

    @Override // com.tencent.ugc.beauty.decoder.ExtractorAdvancer
    public long getSampleTime() {
        return this.mMediaExtractor.getSampleTime();
    }

    public boolean isInRange() {
        long sampleTime = this.mMediaExtractor.getSampleTime();
        if (0 > sampleTime) {
            return false;
        }
        long j11 = this.mRangeEndUs;
        return j11 == -1 || sampleTime <= j11;
    }

    @Override // com.tencent.ugc.beauty.decoder.ExtractorAdvancer
    public boolean advance() {
        if (isInRange() && this.mMediaExtractor.advance()) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.ugc.beauty.decoder.ExtractorAdvancer
    public void readSampleData(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer, int i11) {
        if (isInRange()) {
            if (this.mMediaExtractor.getSampleTime() == this.mFirstFrameTime) {
                this.mLoopCount++;
            }
            bufferInfo.size = this.mMediaExtractor.readSampleData(byteBuffer, i11);
            bufferInfo.flags = this.mMediaExtractor.getSampleFlags();
            bufferInfo.presentationTimeUs = (((long) this.mLoopCount) * this.mRangeEndUs) + this.mMediaExtractor.getSampleTime();
            bufferInfo.offset = i11;
            return;
        }
        bufferInfo.size = -1;
    }

    @Override // com.tencent.ugc.beauty.decoder.ExtractorAdvancer
    public void updateExtractor(MediaExtractor mediaExtractor) {
        super.updateExtractor(mediaExtractor);
        if (this.mRangeEndUs == -1) {
            MediaExtractor mediaExtractor2 = this.mMediaExtractor;
            this.mRangeEndUs = mediaExtractor2.getTrackFormat(mediaExtractor2.getSampleTrackIndex()).getLong("durationUs");
        }
        this.mFirstFrameTime = this.mMediaExtractor.getSampleTime();
    }
}
