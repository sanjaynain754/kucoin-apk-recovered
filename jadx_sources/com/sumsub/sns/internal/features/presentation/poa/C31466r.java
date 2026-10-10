package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import java.util.ArrayList;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31466r extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f63805a;

    /* JADX INFO: renamed from: b */
    public Object f63806b;

    /* JADX INFO: renamed from: c */
    public Object f63807c;

    /* JADX INFO: renamed from: d */
    public Object f63808d;

    /* JADX INFO: renamed from: e */
    public String f63809e;

    /* JADX INFO: renamed from: f */
    public ArrayList f63810f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f63811g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C31472x f63812h;

    /* JADX INFO: renamed from: i */
    public int f63813i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31466r(C31472x c31472x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63812h = c31472x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63811g = obj;
        this.f63813i |= Integer.MIN_VALUE;
        return this.f63812h.m70736a((C29046Q2) null, this);
    }
}
