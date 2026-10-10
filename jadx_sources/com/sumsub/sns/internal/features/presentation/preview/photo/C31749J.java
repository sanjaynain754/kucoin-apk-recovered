package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31749J extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f64502a;

    /* JADX INFO: renamed from: b */
    public Object f64503b;

    /* JADX INFO: renamed from: c */
    public Object f64504c;

    /* JADX INFO: renamed from: d */
    public Object f64505d;

    /* JADX INFO: renamed from: e */
    public Object f64506e;

    /* JADX INFO: renamed from: f */
    public Object f64507f;

    /* JADX INFO: renamed from: g */
    public boolean f64508g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f64509h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC31770c0 f64510i;

    /* JADX INFO: renamed from: j */
    public int f64511j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31749J(AbstractC31770c0 abstractC31770c0, Continuation continuation) {
        super(continuation);
        this.f64510i = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64509h = obj;
        this.f64511j |= Integer.MIN_VALUE;
        return this.f64510i.m70859a((AbstractC30146q) null, this);
    }
}
