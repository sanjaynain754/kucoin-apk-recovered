package io.trtc.tuikit.atomicxcore.impl.common;

import java.lang.ref.WeakReference;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.o */
/* JADX INFO: loaded from: classes61.dex */
public final class C39507o extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public static final C39507o f87703a = new C39507o();

    public C39507o() {
        super(1);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((WeakReference) obj).get() == null);
    }
}
