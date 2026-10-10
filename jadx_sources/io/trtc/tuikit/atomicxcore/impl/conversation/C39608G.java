package io.trtc.tuikit.atomicxcore.impl.conversation;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.G */
/* JADX INFO: loaded from: classes61.dex */
public final class C39608G extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C39617P f87987a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f87988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39617P f87989c;

    /* JADX INFO: renamed from: d */
    public int f87990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39608G(C39617P c39617p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f87989c = c39617p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f87988b = obj;
        this.f87990d |= Integer.MIN_VALUE;
        return this.f87989c.m88289a(this);
    }
}
