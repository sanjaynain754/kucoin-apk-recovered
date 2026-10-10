package androidx.media3.exoplayer.rtsp;

import androidx.annotation.Nullable;
import androidx.media3.datasource.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
interface RtpDataChannel extends DataSource {

    public interface Factory {
        RtpDataChannel createAndOpenDataChannel(int i11) throws IOException;

        @Nullable
        default Factory createFallbackDataChannelFactory() {
            return null;
        }
    }

    @Nullable
    RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener();

    int getLocalPort();

    String getTransport();

    boolean needsClosingOnLoadCompletion();
}
