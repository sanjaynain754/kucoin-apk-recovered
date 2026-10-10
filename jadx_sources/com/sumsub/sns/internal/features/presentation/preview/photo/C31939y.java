package com.sumsub.sns.internal.features.presentation.preview.photo;

import java.util.List;
import java.util.Map;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31939y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC31770c0 f64936a;

    /* JADX INFO: renamed from: b */
    public List f64937b;

    /* JADX INFO: renamed from: c */
    public Map f64938c;

    /* JADX INFO: renamed from: d */
    public Map f64939d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f64940e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC31770c0 f64941f;

    /* JADX INFO: renamed from: g */
    public int f64942g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31939y(AbstractC31770c0 abstractC31770c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64941f = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64940e = obj;
        this.f64942g |= Integer.MIN_VALUE;
        return AbstractC31770c0.m70855a(this.f64941f, null, null, this);
    }
}
