package io.trtc.tuikit.atomicxcore.impl.common;

import java.lang.ref.WeakReference;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.p */
/* JADX INFO: loaded from: classes61.dex */
public final class C39508p extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f87704a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39508p(Object obj) {
        super(1);
        this.f87704a = obj;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Intrinsics.areEqual(((WeakReference) obj).get(), this.f87704a));
    }
}
