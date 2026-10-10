package androidx.media3.exoplayer.rtsp;

/* JADX INFO: loaded from: classes34.dex */
final class RtspDescribeResponse {
    public final RtspHeaders headers;
    public final SessionDescription sessionDescription;
    public final int status;

    public RtspDescribeResponse(RtspHeaders rtspHeaders, int i11, SessionDescription sessionDescription) {
        this.headers = rtspHeaders;
        this.status = i11;
        this.sessionDescription = sessionDescription;
    }
}
