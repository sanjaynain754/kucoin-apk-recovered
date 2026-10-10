package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class FaceRect {
    private int height;
    private int width;

    /* JADX INFO: renamed from: x */
    private int f74603x;

    /* JADX INFO: renamed from: y */
    private int f74604y;

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX() {
        return this.f74603x;
    }

    public int getY() {
        return this.f74604y;
    }

    public FaceRect(int i11, int i12, int i13, int i14) {
        this.f74603x = i11;
        this.f74604y = i12;
        this.width = i13;
        this.height = i14;
    }
}
