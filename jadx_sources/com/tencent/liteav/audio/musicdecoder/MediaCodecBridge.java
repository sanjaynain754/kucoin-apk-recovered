package com.tencent.liteav.audio.musicdecoder;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::audio")
public class MediaCodecBridge {
    private static final String TAG = "MediaCodecBridge";
    private static final long TIMEOUT_MS = 400;
    private final Context mContext = ContextUtils.getApplicationContext();
    private boolean mDecodeEOS;
    private MediaFormat mFormat;
    private long mLongestDurationUs;
    private MediaCodec mMediaCodec;
    private MediaExtractor mMediaExtractor;
    private String mMime;
    private int mRawDataSize;
    private int mTrackCount;
    private int mTrackIndex;

    private ByteBuffer drainData() {
        for (int i11 = 0; i11 < 3; i11++) {
            ByteBuffer byteBufferDequeueOutputBuffer = dequeueOutputBuffer();
            if (byteBufferDequeueOutputBuffer != null) {
                return byteBufferDequeueOutputBuffer;
            }
        }
        return null;
    }

    private boolean selectTrack(int i11) {
        try {
            MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i11);
            String string = trackFormat.getString("mime");
            if (TextUtils.isEmpty(string) || !string.startsWith("audio/")) {
                return false;
            }
            this.mMediaExtractor.selectTrack(i11);
            this.mTrackIndex = i11;
            this.mFormat = trackFormat;
            this.mMime = string;
            return true;
        } catch (Throwable th2) {
            Log.m76033e(TAG, "Failed to select track: " + th2.getMessage(), th2);
            return false;
        }
    }

    private ByteBuffer dequeueOutputBuffer() {
        if (this.mDecodeEOS) {
            return null;
        }
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(TIMEOUT_MS));
            if (iDequeueOutputBuffer == -1) {
                return null;
            }
            if (iDequeueOutputBuffer == -3) {
                Log.m76034i(TAG, "codec output buffers changed.", new Object[0]);
                return null;
            }
            if (iDequeueOutputBuffer == -2) {
                this.mFormat = this.mMediaCodec.getOutputFormat();
                Log.m76034i(TAG, "codec output format changed: " + this.mFormat, new Object[0]);
                return null;
            }
            if (iDequeueOutputBuffer < 0) {
                Log.m76033e(TAG, "unexpected result from dequeueOutputBuffer: ".concat(String.valueOf(iDequeueOutputBuffer)), new Object[0]);
                return null;
            }
            if ((bufferInfo.flags & 4) != 0) {
                Log.m76034i(TAG, "Decode to EOS", new Object[0]);
                this.mDecodeEOS = true;
                return null;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.mMediaCodec.getOutputBuffer(iDequeueOutputBuffer) : this.mMediaCodec.getOutputBuffers()[iDequeueOutputBuffer];
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
            byteBufferAllocateDirect.put(outputBuffer);
            this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return byteBufferAllocateDirect;
        } catch (Throwable th2) {
            Log.m76033e(TAG, "Failed to dequeue output buffer" + th2.getMessage(), th2);
            return null;
        }
    }

    private long getDuration(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return -1L;
        }
        try {
            return mediaFormat.getLong("durationUs");
        } catch (Throwable th2) {
            Log.m76033e(TAG, "getDuration failed. " + th2.getMessage(), new Object[0]);
            return -1L;
        }
    }

    private boolean initMediaCodec() {
        if (!TextUtils.isEmpty(this.mMime) && this.mFormat != null) {
            try {
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.mMime);
                this.mMediaCodec = mediaCodecCreateDecoderByType;
                mediaCodecCreateDecoderByType.configure(this.mFormat, (Surface) null, (MediaCrypto) null, 0);
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                this.mMediaCodec = null;
            }
        }
        return false;
    }

    public long getLongestDuration() {
        return this.mLongestDurationUs;
    }

    public MediaFormat getOutputFormat() {
        return this.mFormat;
    }

    public int getTotalRawDataSize() {
        return this.mRawDataSize;
    }

    public int getTrackCount() {
        return this.mTrackCount;
    }

    public boolean initAndStart(String str) {
        if (this.mMediaCodec != null || !initMediaExtractor(str) || !initMediaCodec()) {
            return false;
        }
        try {
            this.mMediaCodec.start();
            return true;
        } catch (Throwable th2) {
            Log.m76033e(TAG, "Cannot start the audio codec" + th2.getMessage(), th2);
            return false;
        }
    }

    public boolean isDecodeEnd() {
        return this.mDecodeEOS;
    }

    public ByteBuffer processFrame() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null) {
            return null;
        }
        try {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(TIMEOUT_MS);
            if (iDequeueInputBuffer < 0) {
                return null;
            }
            ByteBuffer byteBuffer = this.mMediaCodec.getInputBuffers()[iDequeueInputBuffer];
            int sampleData = byteBuffer != null ? this.mMediaExtractor.readSampleData(byteBuffer, 0) : -1;
            if (sampleData <= 0) {
                this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.mRawDataSize += sampleData;
                this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.mMediaExtractor.getSampleTime(), 0);
                this.mMediaExtractor.advance();
            }
            return drainData();
        } catch (Throwable th2) {
            Log.m76033e(TAG, "Failed to process frame: " + th2.getMessage(), th2);
            return null;
        }
    }

    public boolean seekTo(long j11) {
        MediaExtractor mediaExtractor;
        if (this.mMediaCodec == null || (mediaExtractor = this.mMediaExtractor) == null || j11 > this.mLongestDurationUs) {
            return false;
        }
        try {
            mediaExtractor.seekTo(j11, 2);
            return true;
        } catch (Throwable th2) {
            Log.m76033e(TAG, "Failed to seek: " + th2.getMessage(), th2);
            return false;
        }
    }

    public void setMusicTrack(int i11) {
        int i12 = this.mTrackIndex;
        if (i12 == i11) {
            return;
        }
        try {
            this.mMediaExtractor.unselectTrack(i12);
            if (selectTrack(i11)) {
                try {
                    MediaCodec mediaCodec = this.mMediaCodec;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        this.mMediaCodec.release();
                        this.mMediaCodec = null;
                    }
                    if (initMediaCodec()) {
                        try {
                            this.mMediaCodec.start();
                        } catch (Throwable th2) {
                            Log.m76033e(TAG, "Cannot start the audio codec" + th2.getMessage(), th2);
                        }
                    }
                } catch (Throwable th3) {
                    Log.m76033e(TAG, "Failed to stop media codec: " + th3.getMessage(), th3);
                }
            }
        } catch (Throwable th4) {
            Log.m76033e(TAG, "Failed to unselect track: " + th4.getMessage(), th4);
        }
    }

    public void stop() {
        MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mMediaExtractor = null;
        }
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mMediaCodec.release();
            this.mMediaCodec = null;
        }
        this.mDecodeEOS = false;
    }

    private boolean initMediaExtractor(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.mDecodeEOS = false;
        try {
            this.mMediaExtractor = new MediaExtractor();
            if (!setDataSource(str)) {
                return false;
            }
            this.mTrackCount = this.mMediaExtractor.getTrackCount();
            for (int i11 = 0; i11 < this.mTrackCount; i11++) {
                MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i11);
                String string = trackFormat.getString("mime");
                if (!TextUtils.isEmpty(string) && string.startsWith("audio/")) {
                    long duration = getDuration(trackFormat);
                    if (this.mLongestDurationUs < duration) {
                        this.mLongestDurationUs = duration;
                    }
                }
            }
            int i12 = this.mTrackIndex;
            if (i12 != 0) {
                return selectTrack(i12);
            }
            for (int i13 = 0; i13 < this.mTrackCount; i13++) {
                if (selectTrack(i13)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.m76033e(TAG, "initMediaExtractor: " + th2.getMessage(), th2);
            this.mMediaExtractor = null;
            this.mFormat = null;
            this.mMime = null;
            return false;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean setDataSource(String str) {
        Log.m76034i(TAG, "setDataSource url:".concat(String.valueOf(str)), new Object[0]);
        if (str.startsWith("content://")) {
            if (this.mContext != null && this.mMediaExtractor != null) {
                this.mMediaExtractor.setDataSource(this.mContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor());
                return true;
            }
            this.mMediaExtractor.setDataSource(str);
            return true;
        }
        this.mMediaExtractor.setDataSource(str);
        return true;
        Log.m76033e(TAG, "setDataSource failed! error: " + th.getMessage(), th);
        return false;
    }
}
