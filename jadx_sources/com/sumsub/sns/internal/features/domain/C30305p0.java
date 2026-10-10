package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import java.util.ArrayList;
import java.util.Iterator;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.p0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30305p0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30227m0 f60909a;

    /* JADX INFO: renamed from: b */
    public String f60910b;

    /* JADX INFO: renamed from: c */
    public ArrayList f60911c;

    /* JADX INFO: renamed from: d */
    public Iterator f60912d;

    /* JADX INFO: renamed from: e */
    public C29054T f60913e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f60914f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C30311s0 f60915g;

    /* JADX INFO: renamed from: h */
    public int f60916h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30305p0(C30311s0 c30311s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60915g = c30311s0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60914f = obj;
        this.f60916h |= Integer.MIN_VALUE;
        return this.f60915g.m70179a((C30227m0) null, (String) null, this);
    }
}
