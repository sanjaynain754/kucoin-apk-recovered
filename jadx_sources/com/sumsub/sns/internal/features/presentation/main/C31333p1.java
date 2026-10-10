package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.p1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31333p1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f63511a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31243a2 f63513c;

    /* JADX INFO: renamed from: d */
    public int f63514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31333p1(C31243a2 c31243a2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63513c = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63512b = obj;
        this.f63514d |= Integer.MIN_VALUE;
        return C31243a2.m70614a(this.f63513c, (ContinuationImpl) this);
    }
}
