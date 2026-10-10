package androidx.media3.exoplayer.rtsp;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class RtpDataLoadable implements Loader.Loadable {

    @Nullable
    private RtpDataChannel dataChannel;
    private final EventListener eventListener;
    private RtpExtractor extractor;
    private DefaultExtractorInput extractorInput;
    private volatile boolean loadCancelled;
    private volatile long nextRtpTimestamp;
    private final ExtractorOutput output;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    public final RtspMediaTrack rtspMediaTrack;
    public final int trackId;
    private final Handler playbackThreadHandler = Util.createHandlerForCurrentLooper();
    private volatile long pendingSeekPositionUs = C2711C.TIME_UNSET;

    public interface EventListener {
        void onTransportReady(String str, RtpDataChannel rtpDataChannel);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCancelled = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() throws IOException {
        if (this.loadCancelled) {
            this.loadCancelled = false;
        }
        try {
            if (this.dataChannel == null) {
                RtpDataChannel rtpDataChannelCreateAndOpenDataChannel = this.rtpDataChannelFactory.createAndOpenDataChannel(this.trackId);
                this.dataChannel = rtpDataChannelCreateAndOpenDataChannel;
                final String transport = rtpDataChannelCreateAndOpenDataChannel.getTransport();
                final RtpDataChannel rtpDataChannel = this.dataChannel;
                this.playbackThreadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.rtsp.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3304b.eventListener.onTransportReady(transport, rtpDataChannel);
                    }
                });
                this.extractorInput = new DefaultExtractorInput((DataReader) Assertions.checkNotNull(this.dataChannel), 0L, -1L);
                RtpExtractor rtpExtractor = new RtpExtractor(this.rtspMediaTrack.payloadFormat, this.trackId);
                this.extractor = rtpExtractor;
                rtpExtractor.init(this.output);
            }
            while (!this.loadCancelled) {
                if (this.pendingSeekPositionUs != C2711C.TIME_UNSET) {
                    ((RtpExtractor) Assertions.checkNotNull(this.extractor)).seek(this.nextRtpTimestamp, this.pendingSeekPositionUs);
                    this.pendingSeekPositionUs = C2711C.TIME_UNSET;
                }
                if (((RtpExtractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), new PositionHolder()) == -1) {
                    break;
                }
            }
            this.loadCancelled = false;
        } finally {
            if (((RtpDataChannel) Assertions.checkNotNull(this.dataChannel)).needsClosingOnLoadCompletion()) {
                DataSourceUtil.closeQuietly(this.dataChannel);
                this.dataChannel = null;
            }
        }
    }

    public void resetForSeek() {
        ((RtpExtractor) Assertions.checkNotNull(this.extractor)).preSeek();
    }

    public void seekToUs(long j11, long j12) {
        this.pendingSeekPositionUs = j11;
        this.nextRtpTimestamp = j12;
    }

    public void setSequenceNumber(int i11) {
        if (((RtpExtractor) Assertions.checkNotNull(this.extractor)).hasReadFirstRtpPacket()) {
            return;
        }
        this.extractor.setFirstSequenceNumber(i11);
    }

    public RtpDataLoadable(int i11, RtspMediaTrack rtspMediaTrack, EventListener eventListener, ExtractorOutput extractorOutput, RtpDataChannel.Factory factory) {
        this.trackId = i11;
        this.rtspMediaTrack = rtspMediaTrack;
        this.eventListener = eventListener;
        this.output = extractorOutput;
        this.rtpDataChannelFactory = factory;
    }

    public void setTimestamp(long j11) {
        if (j11 != C2711C.TIME_UNSET && !((RtpExtractor) Assertions.checkNotNull(this.extractor)).hasReadFirstRtpPacket()) {
            this.extractor.setFirstTimestamp(j11);
        }
    }
}
