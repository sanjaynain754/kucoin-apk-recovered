package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.h2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31271h2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C31244b f63351a;

    /* JADX INFO: renamed from: b */
    public AbstractC31275i2 f63352b;

    /* JADX INFO: renamed from: c */
    public String f63353c;

    /* JADX INFO: renamed from: d */
    public String f63354d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63355e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC31275i2 f63356f;

    /* JADX INFO: renamed from: g */
    public int f63357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31271h2(AbstractC31275i2 abstractC31275i2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63356f = abstractC31275i2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63355e = obj;
        this.f63357g |= Integer.MIN_VALUE;
        return this.f63356f.m70664a(this);
    }
}
