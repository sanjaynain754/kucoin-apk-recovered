package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.utils.InterfaceC30061a;
import java.io.File;
import java.util.Map;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29948x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60126a;

    /* JADX INFO: renamed from: b */
    public File f60127b;

    /* JADX INFO: renamed from: c */
    public String f60128c;

    /* JADX INFO: renamed from: d */
    public IdentitySide f60129d;

    /* JADX INFO: renamed from: e */
    public Map f60130e;

    /* JADX INFO: renamed from: f */
    public C29070X f60131f;

    /* JADX INFO: renamed from: g */
    public InterfaceC30061a f60132g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f60133h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C29950z f60134i;

    /* JADX INFO: renamed from: j */
    public int f60135j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29948x(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60134i = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60133h = obj;
        this.f60135j |= Integer.MIN_VALUE;
        return this.f60134i.m70014a(null, null, null, null, null, null, null, this);
    }
}
