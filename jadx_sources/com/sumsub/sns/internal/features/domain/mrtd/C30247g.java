package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30247g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f60803a;

    /* JADX INFO: renamed from: b */
    public Object f60804b;

    /* JADX INFO: renamed from: c */
    public List f60805c;

    /* JADX INFO: renamed from: d */
    public Collection f60806d;

    /* JADX INFO: renamed from: e */
    public Iterator f60807e;

    /* JADX INFO: renamed from: f */
    public boolean f60808f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f60809g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C30251i f60810h;

    /* JADX INFO: renamed from: i */
    public int f60811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30247g(C30251i c30251i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60810h = c30251i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60809g = obj;
        this.f60811i |= Integer.MIN_VALUE;
        Object objM70155a = this.f60810h.m70155a((Document) null, (C29154m) null, (ArrayList) null, this);
        return objM70155a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70155a : Result.m103843boximpl(objM70155a);
    }
}
