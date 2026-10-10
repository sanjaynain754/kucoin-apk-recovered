package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.data.model.common.C28999F;
import java.util.Iterator;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30420Z extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f61227a;

    /* JADX INFO: renamed from: b */
    public Object f61228b;

    /* JADX INFO: renamed from: c */
    public Iterator f61229c;

    /* JADX INFO: renamed from: d */
    public C28999F f61230d;

    /* JADX INFO: renamed from: e */
    public String f61231e;

    /* JADX INFO: renamed from: f */
    public C30733u f61232f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f61233g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C30736v0 f61234h;

    /* JADX INFO: renamed from: i */
    public int f61235i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30420Z(C30736v0 c30736v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61234h = c30736v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61233g = obj;
        this.f61235i |= Integer.MIN_VALUE;
        return this.f61234h.m70440a((String) null, this);
    }
}
