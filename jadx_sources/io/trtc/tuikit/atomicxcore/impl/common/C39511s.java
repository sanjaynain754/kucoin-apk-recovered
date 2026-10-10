package io.trtc.tuikit.atomicxcore.impl.common;

import java.lang.ref.WeakReference;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C39511s extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public static final C39511s f87708a = new C39511s();

    public C39511s() {
        super(1);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((WeakReference) obj).get() == null);
    }
}
