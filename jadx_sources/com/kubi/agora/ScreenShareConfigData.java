package com.kubi.agora;

import androidx.annotation.Keep;
import com.tencent.bugly.library.MonitorCallback;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ScreenShareConfig.kt */
/* JADX INFO: loaded from: classes63.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/agora/ScreenShareConfigData;", "", MonitorCallback.EVENT_FPS, "", "jpegQuality", "<init>", "(II)V", "getFps", "()I", "getJpegQuality", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScreenShareConfigData {
    private final int fps;
    private final int jpegQuality;

    /* JADX WARN: Illegal instructions before constructor call */
    public ScreenShareConfigData() {
        int i11 = 0;
        this(i11, i11, 3, null);
    }

    public ScreenShareConfigData(int i11, int i12) {
        this.fps = i11;
        this.jpegQuality = i12;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getJpegQuality() {
        return this.jpegQuality;
    }

    public /* synthetic */ ScreenShareConfigData(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 15 : i11, (i13 & 2) != 0 ? 50 : i12);
    }
}
