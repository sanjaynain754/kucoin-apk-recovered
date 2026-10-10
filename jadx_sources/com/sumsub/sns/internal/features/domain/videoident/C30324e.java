package com.sumsub.sns.internal.features.domain.videoident;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import java.io.File;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30324e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29070X f60967a;

    /* JADX INFO: renamed from: b */
    public String f60968b;

    /* JADX INFO: renamed from: c */
    public IdentitySide f60969c;

    /* JADX INFO: renamed from: d */
    public String f60970d;

    /* JADX INFO: renamed from: e */
    public File f60971e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f60972f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C30325f f60973g;

    /* JADX INFO: renamed from: h */
    public int f60974h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30324e(C30325f c30325f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60973g = c30325f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60972f = obj;
        this.f60974h |= Integer.MIN_VALUE;
        Object objM70188a = this.f60973g.m70188a(null, null, null, null, null, this);
        return objM70188a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70188a : Result.m103843boximpl(objM70188a);
    }
}
