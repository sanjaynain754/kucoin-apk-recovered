package com.sumsub.sns.internal.log.cacher;

import java.io.ByteArrayOutputStream;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33278f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ByteArrayOutputStream f67823a;

    /* JADX INFO: renamed from: b */
    public ByteArrayOutputStream f67824b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f67825c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C33284l f67826d;

    /* JADX INFO: renamed from: e */
    public int f67827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33278f(C33284l c33284l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67826d = c33284l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67825c = obj;
        this.f67827e |= Integer.MIN_VALUE;
        return C33284l.m71619a(this.f67826d, null, this);
    }
}
