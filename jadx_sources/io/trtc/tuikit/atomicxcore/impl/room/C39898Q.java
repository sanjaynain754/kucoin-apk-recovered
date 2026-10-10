package io.trtc.tuikit.atomicxcore.impl.room;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.Q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39898Q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C39934k0 f88679a;

    /* JADX INFO: renamed from: b */
    public String f88680b;

    /* JADX INFO: renamed from: c */
    public Ref.LongRef f88681c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f88682d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C39934k0 f88683e;

    /* JADX INFO: renamed from: f */
    public int f88684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39898Q(C39934k0 c39934k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88683e = c39934k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88682d = obj;
        this.f88684f |= Integer.MIN_VALUE;
        return C39934k0.m88352c(this.f88683e, null, this);
    }
}
