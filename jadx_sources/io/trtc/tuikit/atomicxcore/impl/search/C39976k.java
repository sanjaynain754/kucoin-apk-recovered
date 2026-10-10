package io.trtc.tuikit.atomicxcore.impl.search;

import io.trtc.tuikit.atomicxcore.api.search.SearchOption;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C39976k extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C39981p f88873a;

    /* JADX INFO: renamed from: b */
    public Object f88874b;

    /* JADX INFO: renamed from: c */
    public int f88875c;

    /* JADX INFO: renamed from: d */
    public int f88876d;

    /* JADX INFO: renamed from: e */
    public int f88877e;

    /* JADX INFO: renamed from: f */
    public int f88878f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f88879g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C39981p f88880h;

    /* JADX INFO: renamed from: i */
    public int f88881i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39976k(C39981p c39981p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88880h = c39981p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88879g = obj;
        this.f88881i |= Integer.MIN_VALUE;
        return C39981p.m88373a(this.f88880h, (List) null, (SearchOption) null, this);
    }
}
