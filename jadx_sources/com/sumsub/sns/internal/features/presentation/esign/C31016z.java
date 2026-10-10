package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.features.data.model.esign.C29748U;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.model.esign.C29763f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31016z extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f62684a;

    /* JADX INFO: renamed from: b */
    public Iterator f62685b;

    /* JADX INFO: renamed from: c */
    public C29748U f62686c;

    /* JADX INFO: renamed from: d */
    public String f62687d;

    /* JADX INFO: renamed from: e */
    public String f62688e;

    /* JADX INFO: renamed from: f */
    public Collection f62689f;

    /* JADX INFO: renamed from: g */
    public Iterator f62690g;

    /* JADX INFO: renamed from: h */
    public C29763f f62691h;

    /* JADX INFO: renamed from: i */
    public Collection f62692i;

    /* JADX INFO: renamed from: j */
    public String f62693j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f62694k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C30997n0 f62695l;

    /* JADX INFO: renamed from: m */
    public int f62696m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31016z(C30997n0 c30997n0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62695l = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62694k = obj;
        this.f62696m |= Integer.MIN_VALUE;
        return this.f62695l.m70544a((ArrayList) null, (C29752Y) null, this);
    }
}
