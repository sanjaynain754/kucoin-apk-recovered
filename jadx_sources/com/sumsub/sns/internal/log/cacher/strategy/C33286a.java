package com.sumsub.sns.internal.log.cacher.strategy;

import java.io.Serializable;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.strategy.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33286a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f67855a;

    /* JADX INFO: renamed from: b */
    public Serializable f67856b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f67857c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C33288c f67858d;

    /* JADX INFO: renamed from: e */
    public int f67859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33286a(C33288c c33288c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67858d = c33288c;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67857c = obj;
        this.f67859e |= Integer.MIN_VALUE;
        return this.f67858d.mo71622a(null, null, null, this);
    }
}
