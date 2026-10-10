package io.trtc.tuikit.atomicxcore.impl.room;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.O */
/* JADX INFO: loaded from: classes61.dex */
public final class C39894O extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C39934k0 f88665a;

    /* JADX INFO: renamed from: b */
    public String f88666b;

    /* JADX INFO: renamed from: c */
    public Ref.ObjectRef f88667c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f88668d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C39934k0 f88669e;

    /* JADX INFO: renamed from: f */
    public int f88670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39894O(C39934k0 c39934k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88669e = c39934k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88668d = obj;
        this.f88670f |= Integer.MIN_VALUE;
        return C39934k0.m88351b(this.f88669e, null, this);
    }
}
