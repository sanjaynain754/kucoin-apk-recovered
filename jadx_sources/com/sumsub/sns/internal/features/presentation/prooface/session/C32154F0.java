package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.core.domain.facedetector.C28569o;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import com.sumsub.sns.internal.features.data.model.prooface.C29828l;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.F0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32154F0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public byte[] f65444a;

    /* JADX INFO: renamed from: b */
    public C28569o f65445b;

    /* JADX INFO: renamed from: c */
    public AbstractC46162a f65446c;

    /* JADX INFO: renamed from: d */
    public String f65447d;

    /* JADX INFO: renamed from: e */
    public String f65448e;

    /* JADX INFO: renamed from: f */
    public String f65449f;

    /* JADX INFO: renamed from: g */
    public Integer f65450g;

    /* JADX INFO: renamed from: h */
    public Integer f65451h;

    /* JADX INFO: renamed from: i */
    public String f65452i;

    /* JADX INFO: renamed from: j */
    public String f65453j;

    /* JADX INFO: renamed from: k */
    public Integer f65454k;

    /* JADX INFO: renamed from: l */
    public Integer f65455l;

    /* JADX INFO: renamed from: m */
    public C29828l f65456m;

    /* JADX INFO: renamed from: n */
    public C29818c f65457n;

    /* JADX INFO: renamed from: o */
    public int f65458o;

    /* JADX INFO: renamed from: p */
    public long f65459p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f65460q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C32156G0 f65461r;

    /* JADX INFO: renamed from: s */
    public int f65462s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32154F0(C32156G0 c32156g0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65461r = c32156g0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65460q = obj;
        this.f65462s |= Integer.MIN_VALUE;
        return this.f65461r.m71047a(null, null, null, null, this);
    }
}
