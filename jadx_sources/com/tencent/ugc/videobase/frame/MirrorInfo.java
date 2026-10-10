package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class MirrorInfo {
    public boolean isHorizontal;
    public boolean isVertical;

    public MirrorInfo() {
        this.isHorizontal = false;
        this.isVertical = false;
    }

    public MirrorInfo(boolean z11, boolean z12) {
        this.isHorizontal = z11;
        this.isVertical = z12;
    }
}
