package com.facebook.imagepipeline.animated.base;

/* JADX INFO: loaded from: classes34.dex */
public class AnimatedDrawableFrameInfo {

    /* JADX INFO: renamed from: a */
    public final int f8825a;

    /* JADX INFO: renamed from: b */
    public final int f8826b;

    /* JADX INFO: renamed from: c */
    public final int f8827c;

    /* JADX INFO: renamed from: d */
    public final int f8828d;

    /* JADX INFO: renamed from: e */
    public final int f8829e;

    /* JADX INFO: renamed from: f */
    public final BlendOperation f8830f;

    /* JADX INFO: renamed from: g */
    public final DisposalMethod f8831g;

    public enum BlendOperation {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    public enum DisposalMethod {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public AnimatedDrawableFrameInfo(int i11, int i12, int i13, int i14, int i15, BlendOperation blendOperation, DisposalMethod disposalMethod) {
        this.f8825a = i11;
        this.f8826b = i12;
        this.f8827c = i13;
        this.f8828d = i14;
        this.f8829e = i15;
        this.f8830f = blendOperation;
        this.f8831g = disposalMethod;
    }
}
