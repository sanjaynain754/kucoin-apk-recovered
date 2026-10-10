package androidx.media3.exoplayer.rtsp;

import androidx.media3.datasource.DataSourceUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class UdpDataSourceRtpDataChannelFactory implements RtpDataChannel.Factory {
    private final long socketTimeoutMs;

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel.Factory
    public RtpDataChannel createAndOpenDataChannel(int i11) throws IOException {
        UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel = new UdpDataSourceRtpDataChannel(this.socketTimeoutMs);
        UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel2 = new UdpDataSourceRtpDataChannel(this.socketTimeoutMs);
        try {
            udpDataSourceRtpDataChannel.open(RtpUtils.getIncomingRtpDataSpec(0));
            int localPort = udpDataSourceRtpDataChannel.getLocalPort();
            boolean z11 = localPort % 2 == 0;
            udpDataSourceRtpDataChannel2.open(RtpUtils.getIncomingRtpDataSpec(z11 ? localPort + 1 : localPort - 1));
            if (z11) {
                udpDataSourceRtpDataChannel.setRtcpChannel(udpDataSourceRtpDataChannel2);
                return udpDataSourceRtpDataChannel;
            }
            udpDataSourceRtpDataChannel2.setRtcpChannel(udpDataSourceRtpDataChannel);
            return udpDataSourceRtpDataChannel2;
        } catch (IOException e11) {
            DataSourceUtil.closeQuietly(udpDataSourceRtpDataChannel);
            DataSourceUtil.closeQuietly(udpDataSourceRtpDataChannel2);
            throw e11;
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel.Factory
    public RtpDataChannel.Factory createFallbackDataChannelFactory() {
        return new TransferRtpDataChannelFactory(this.socketTimeoutMs);
    }

    public UdpDataSourceRtpDataChannelFactory(long j11) {
        this.socketTimeoutMs = j11;
    }
}
