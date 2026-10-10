package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.Q1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31213Q1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63123a;

    /* JADX INFO: renamed from: b */
    public C29124h f63124b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63125c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31243a2 f63126d;

    /* JADX INFO: renamed from: e */
    public int f63127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31213Q1(C31243a2 c31243a2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63126d = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63125c = obj;
        this.f63127e |= Integer.MIN_VALUE;
        return this.f63126d.m70619a(false, (C29124h) null, (ContinuationImpl) this);
    }
}
