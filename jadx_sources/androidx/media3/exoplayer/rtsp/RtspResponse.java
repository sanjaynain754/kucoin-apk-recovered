package androidx.media3.exoplayer.rtsp;

/* JADX INFO: loaded from: classes34.dex */
final class RtspResponse {
    public final RtspHeaders headers;
    public final String messageBody;
    public final int status;

    public RtspResponse(int i11, RtspHeaders rtspHeaders, String str) {
        this.status = i11;
        this.headers = rtspHeaders;
        this.messageBody = str;
    }

    public RtspResponse(int i11, RtspHeaders rtspHeaders) {
        this(i11, rtspHeaders, "");
    }
}
