package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31269h0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63341a;

    /* JADX INFO: renamed from: b */
    public Object f63342b;

    /* JADX INFO: renamed from: c */
    public List f63343c;

    /* JADX INFO: renamed from: d */
    public AbstractC29172p f63344d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63345e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31332p0 f63346f;

    /* JADX INFO: renamed from: g */
    public int f63347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31269h0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63346f = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63345e = obj;
        this.f63347g |= Integer.MIN_VALUE;
        return this.f63346f.m70696b(false, this);
    }
}
