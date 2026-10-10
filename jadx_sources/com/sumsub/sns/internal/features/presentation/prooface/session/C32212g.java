package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.features.data.model.prooface.C29822f;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32212g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f65614a;

    /* JADX INFO: renamed from: b */
    public C29822f f65615b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65616c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32228m f65617d;

    /* JADX INFO: renamed from: e */
    public int f65618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32212g(C32228m c32228m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65617d = c32228m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65616c = obj;
        this.f65618e |= Integer.MIN_VALUE;
        return this.f65617d.m71058a((C28758x) null, this);
    }
}
