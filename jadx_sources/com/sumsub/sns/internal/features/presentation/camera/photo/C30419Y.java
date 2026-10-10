package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import java.util.Collection;
import java.util.Iterator;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30419Y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f61216a;

    /* JADX INFO: renamed from: b */
    public Collection f61217b;

    /* JADX INFO: renamed from: c */
    public Iterator f61218c;

    /* JADX INFO: renamed from: d */
    public AbstractC29180q2 f61219d;

    /* JADX INFO: renamed from: e */
    public AbstractC29180q2 f61220e;

    /* JADX INFO: renamed from: f */
    public InterfaceC30000a f61221f;

    /* JADX INFO: renamed from: g */
    public C30687p f61222g;

    /* JADX INFO: renamed from: h */
    public Collection f61223h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f61224i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C30736v0 f61225j;

    /* JADX INFO: renamed from: k */
    public int f61226k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30419Y(C30736v0 c30736v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61225j = c30736v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61224i = obj;
        this.f61226k |= Integer.MIN_VALUE;
        return this.f61225j.m70439a(null, null, this);
    }
}
