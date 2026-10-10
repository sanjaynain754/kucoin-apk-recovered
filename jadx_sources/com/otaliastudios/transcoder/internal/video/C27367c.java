package com.otaliastudios.transcoder.internal.video;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import w90.C45770i;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.video.c */
/* JADX INFO: compiled from: FrameDropper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"", "inputFps", "outputFps", "Lcom/otaliastudios/transcoder/internal/video/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(II)Lcom/otaliastudios/transcoder/internal/video/b;", "lib_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27367c {

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.video.c$a */
    /* JADX INFO: compiled from: FrameDropper.kt */
    @Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"com/otaliastudios/transcoder/internal/video/c$a", "Lcom/otaliastudios/transcoder/internal/video/b;", "", "timeUs", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)Z", "Lw90/i;", "Lw90/i;", "log", "", "b", "D", "inputSpf", "c", "outputSpf", "d", "currentSpf", "", "e", "I", "frameCount", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a implements InterfaceC27366b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C45770i log = new C45770i("FrameDropper");

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final double inputSpf;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final double outputSpf;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public double currentSpf;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public int frameCount;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f55815f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f55816g;

        public a(int i11, int i12) {
            this.f55815f = i11;
            this.f55816g = i12;
            this.inputSpf = 1.0d / ((double) i11);
            this.outputSpf = 1.0d / ((double) i12);
        }

        @Override // com.otaliastudios.transcoder.internal.video.InterfaceC27366b
        /* JADX INFO: renamed from: a */
        public boolean mo68087a(long timeUs) {
            double d11 = this.currentSpf + this.inputSpf;
            this.currentSpf = d11;
            int i11 = this.frameCount;
            this.frameCount = i11 + 1;
            if (i11 == 0) {
                this.log.m101070h("RENDERING (first frame) - currentSpf=" + this.currentSpf + " inputSpf=" + this.inputSpf + " outputSpf=" + this.outputSpf);
                return true;
            }
            double d12 = this.outputSpf;
            if (d11 <= d12) {
                this.log.m101070h("DROPPING - currentSpf=" + this.currentSpf + " inputSpf=" + this.inputSpf + " outputSpf=" + this.outputSpf);
                return false;
            }
            this.currentSpf = d11 - d12;
            this.log.m101070h("RENDERING - currentSpf=" + this.currentSpf + " inputSpf=" + this.inputSpf + " outputSpf=" + this.outputSpf);
            return true;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC27366b m68088a(int i11, int i12) {
        return new a(i11, i12);
    }
}
