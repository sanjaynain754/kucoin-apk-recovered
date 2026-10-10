package com.tencent.liteav.videobase.egl;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.egl.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C34880d extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    public final int mErrorCode;
    private final String mErrorMessage;

    public C34880d(int i11) {
        this(i11, "");
    }

    public C34880d(int i11, String str) {
        super(str);
        this.mErrorCode = i11;
        this.mErrorMessage = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (this.mErrorMessage != null) {
            return "EGL error code: " + this.mErrorCode + ", " + this.mErrorMessage;
        }
        return "EGL error code: " + this.mErrorCode + ", " + super.getMessage();
    }

    public C34880d(int i11, String str, Throwable th2) {
        super(str, th2);
        this.mErrorCode = i11;
        this.mErrorMessage = str;
    }
}
