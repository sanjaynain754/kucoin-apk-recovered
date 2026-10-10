package androidx.media3.exoplayer.rtsp;

/* JADX INFO: loaded from: classes34.dex */
final class RtspSetupResponse {
    public final RtspMessageUtil.RtspSessionHeader sessionHeader;
    public final int status;
    public final String transport;

    public RtspSetupResponse(int i11, RtspMessageUtil.RtspSessionHeader rtspSessionHeader, String str) {
        this.status = i11;
        this.sessionHeader = rtspSessionHeader;
        this.transport = str;
    }
}
