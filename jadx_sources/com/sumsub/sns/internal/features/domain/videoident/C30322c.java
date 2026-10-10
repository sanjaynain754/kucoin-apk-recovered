package com.sumsub.sns.internal.features.domain.videoident;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import java.io.InputStream;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30322c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29070X f60956a;

    /* JADX INFO: renamed from: b */
    public String f60957b;

    /* JADX INFO: renamed from: c */
    public IdentitySide f60958c;

    /* JADX INFO: renamed from: d */
    public String f60959d;

    /* JADX INFO: renamed from: e */
    public InputStream f60960e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f60961f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C30323d f60962g;

    /* JADX INFO: renamed from: h */
    public int f60963h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30322c(C30323d c30323d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60962g = c30323d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60961f = obj;
        this.f60963h |= Integer.MIN_VALUE;
        Object objM70187a = this.f60962g.m70187a(null, null, null, null, null, this);
        return objM70187a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70187a : Result.m103843boximpl(objM70187a);
    }
}
