package io.trtc.tuikit.atomicxcore.impl.search;

import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C39967b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f88845a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39981p f88847c;

    /* JADX INFO: renamed from: d */
    public int f88848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39967b(C39981p c39981p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88847c = c39981p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88846b = obj;
        this.f88848d |= Integer.MIN_VALUE;
        return this.f88847c.m88378a((List) null, this);
    }
}
