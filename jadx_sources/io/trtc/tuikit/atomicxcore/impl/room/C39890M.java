package io.trtc.tuikit.atomicxcore.impl.room;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.M */
/* JADX INFO: loaded from: classes61.dex */
public final class C39890M extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C39934k0 f88655a;

    /* JADX INFO: renamed from: b */
    public String f88656b;

    /* JADX INFO: renamed from: c */
    public Ref.ObjectRef f88657c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f88658d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C39934k0 f88659e;

    /* JADX INFO: renamed from: f */
    public int f88660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39890M(C39934k0 c39934k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88659e = c39934k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88658d = obj;
        this.f88660f |= Integer.MIN_VALUE;
        return C39934k0.m88348a(this.f88659e, null, this);
    }
}
