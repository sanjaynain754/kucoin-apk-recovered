package io.trtc.tuikit.atomicxcore.impl.view.call;

import io.trtc.tuikit.atomicxcore.api.view.CallLayoutTemplate;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.a */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39984a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88922a;

    static {
        int[] iArr = new int[CallLayoutTemplate.values().length];
        try {
            iArr[CallLayoutTemplate.Float.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CallLayoutTemplate.Grid.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CallLayoutTemplate.Pip.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f88922a = iArr;
    }
}
