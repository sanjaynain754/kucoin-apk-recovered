package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32455x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f66161a;

    /* JADX INFO: renamed from: b */
    public SNSStepState f66162b;

    /* JADX INFO: renamed from: c */
    public String f66163c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f66164d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32403L f66165e;

    /* JADX INFO: renamed from: f */
    public int f66166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32455x(C32403L c32403l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66165e = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66164d = obj;
        this.f66166f |= Integer.MIN_VALUE;
        return this.f66165e.m71118a((ArrayList) null, this);
    }
}
