package com.airbnb.lottie.model.content;

import p328i1.C38396d;
import p328i1.C38400h;

/* JADX INFO: loaded from: classes34.dex */
public class Mask {

    /* JADX INFO: renamed from: a */
    public final MaskMode f6050a;

    /* JADX INFO: renamed from: b */
    public final C38400h f6051b;

    /* JADX INFO: renamed from: c */
    public final C38396d f6052c;

    /* JADX INFO: renamed from: d */
    public final boolean f6053d;

    /* JADX INFO: loaded from: classes.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    /* JADX INFO: renamed from: a */
    public MaskMode m5687a() {
        return this.f6050a;
    }

    /* JADX INFO: renamed from: b */
    public C38400h m5688b() {
        return this.f6051b;
    }

    /* JADX INFO: renamed from: c */
    public C38396d m5689c() {
        return this.f6052c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m5690d() {
        return this.f6053d;
    }

    public Mask(MaskMode maskMode, C38400h c38400h, C38396d c38396d, boolean z11) {
        this.f6050a = maskMode;
        this.f6051b = c38400h;
        this.f6052c = c38396d;
        this.f6053d = z11;
    }
}
