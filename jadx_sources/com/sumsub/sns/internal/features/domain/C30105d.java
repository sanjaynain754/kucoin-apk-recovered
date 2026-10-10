package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import java.util.Map;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30105d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f60528a;

    /* JADX INFO: renamed from: b */
    public AbstractC29172p f60529b;

    /* JADX INFO: renamed from: c */
    public C29124h f60530c;

    /* JADX INFO: renamed from: d */
    public Map f60531d;

    /* JADX INFO: renamed from: e */
    public Map f60532e;

    /* JADX INFO: renamed from: f */
    public Map f60533f;

    /* JADX INFO: renamed from: g */
    public String f60534g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f60535h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C30156e f60536i;

    /* JADX INFO: renamed from: j */
    public int f60537j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30105d(C30156e c30156e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60536i = c30156e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60535h = obj;
        this.f60537j |= Integer.MIN_VALUE;
        Object objM70120a = this.f60536i.m70120a(false, (ContinuationImpl) this);
        return objM70120a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70120a : Result.m103843boximpl(objM70120a);
    }
}
