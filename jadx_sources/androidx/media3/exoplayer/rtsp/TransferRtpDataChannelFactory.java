package androidx.media3.exoplayer.rtsp;

/* JADX INFO: loaded from: classes34.dex */
final class TransferRtpDataChannelFactory implements RtpDataChannel.Factory {
    private static final int INTERLEAVED_CHANNELS_PER_TRACK = 2;
    private final long timeoutMs;

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel.Factory
    public RtpDataChannel createAndOpenDataChannel(int i11) {
        TransferRtpDataChannel transferRtpDataChannel = new TransferRtpDataChannel(this.timeoutMs);
        transferRtpDataChannel.open(RtpUtils.getIncomingRtpDataSpec(i11 * 2));
        return transferRtpDataChannel;
    }

    public TransferRtpDataChannelFactory(long j11) {
        this.timeoutMs = j11;
    }
}
