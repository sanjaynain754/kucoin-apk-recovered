package com.sumsub.sns.internal.features.presentation.main.instructions;

import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.instructions.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31282g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29983l f63377a;

    /* JADX INFO: renamed from: b */
    public C29697t2 f63378b;

    /* JADX INFO: renamed from: c */
    public Parcelable f63379c;

    /* JADX INFO: renamed from: d */
    public String f63380d;

    /* JADX INFO: renamed from: e */
    public AbstractC29172p f63381e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f63382f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C31283h f63383g;

    /* JADX INFO: renamed from: h */
    public int f63384h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31282g(C31283h c31283h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63383g = c31283h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63382f = obj;
        this.f63384h |= Integer.MIN_VALUE;
        return this.f63383g.m70670a(null, null, null, null, this);
    }
}
