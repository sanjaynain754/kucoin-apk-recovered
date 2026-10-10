package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.datasource.UdpDataSource;
import com.google.common.primitives.Ints;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class UdpDataSourceRtpDataChannel implements RtpDataChannel {
    private static final String DEFAULT_UDP_TRANSPORT_FORMAT = "RTP/AVP;unicast;client_port=%d-%d";
    private final UdpDataSource dataSource;

    @Nullable
    private UdpDataSourceRtpDataChannel rtcpChannel;

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel
    @Nullable
    public RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener() {
        return null;
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel
    public boolean needsClosingOnLoadCompletion() {
        return true;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        this.dataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.dataSource.close();
        UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel = this.rtcpChannel;
        if (udpDataSourceRtpDataChannel != null) {
            udpDataSourceRtpDataChannel.close();
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel
    public int getLocalPort() {
        int localPort = this.dataSource.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.dataSource.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        return this.dataSource.open(dataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            return this.dataSource.read(bArr, i11, i12);
        } catch (UdpDataSource.UdpDataSourceException e11) {
            if (e11.reason == 2002) {
                return -1;
            }
            throw e11;
        }
    }

    public void setRtcpChannel(UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel) {
        Assertions.checkArgument(this != udpDataSourceRtpDataChannel);
        this.rtcpChannel = udpDataSourceRtpDataChannel;
    }

    public UdpDataSourceRtpDataChannel(long j11) {
        this.dataSource = new UdpDataSource(2000, Ints.checkedCast(j11));
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel
    public String getTransport() {
        boolean z11;
        int localPort = getLocalPort();
        if (localPort != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        return Util.formatInvariant(DEFAULT_UDP_TRANSPORT_FORMAT, Integer.valueOf(localPort), Integer.valueOf(localPort + 1));
    }
}
