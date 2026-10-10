package com.sumsub.sns.internal.features.presentation.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32672w extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f66681a;

    /* JADX INFO: renamed from: b */
    public Map f66682b;

    /* JADX INFO: renamed from: c */
    public Map f66683c;

    /* JADX INFO: renamed from: d */
    public Iterator f66684d;

    /* JADX INFO: renamed from: e */
    public String f66685e;

    /* JADX INFO: renamed from: f */
    public Map f66686f;

    /* JADX INFO: renamed from: g */
    public boolean f66687g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f66688h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C32635M f66689i;

    /* JADX INFO: renamed from: j */
    public int f66690j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32672w(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66689i = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66688h = obj;
        this.f66690j |= Integer.MIN_VALUE;
        return this.f66689i.m71231a((List) null, 0, this);
    }
}
