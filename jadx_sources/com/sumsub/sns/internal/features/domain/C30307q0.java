package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.repository.applicant.AbstractC29920c;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.domain.documents.C30123Q;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32668s;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30307q0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30311s0 f60920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f60921c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29054T f60922d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30227m0 f60923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30307q0(C30311s0 c30311s0, String str, C29054T c29054t, C30227m0 c30227m0, Continuation continuation) {
        super(2, continuation);
        this.f60920b = c30311s0;
        this.f60921c = str;
        this.f60922d = c29054t;
        this.f60923e = c30227m0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30307q0(this.f60920b, this.f60921c, this.f60922d, this.f60923e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30307q0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30307q0 c30307q0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60919a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                c30307q0 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC29921d interfaceC29921d = this.f60920b.f60754b;
            String str = this.f60921c;
            C29054T c29054t = this.f60922d;
            File file = c29054t.f58995b;
            String str2 = c29054t.f58997d;
            IdentitySide identitySide = c29054t.f58998e;
            C29070X type = this.f60923e.f60638a.getType();
            C30303o0 c30303o0 = new C30303o0(this.f60922d, this.f60920b);
            this.f60919a = 1;
            c30307q0 = this;
            obj = AbstractC29920c.m70003a(interfaceC29921d, str, file, str2, identitySide, null, type, c30303o0, c30307q0, 16);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C30311s0 c30311s0 = c30307q0.f60920b;
        C29054T c29054t2 = c30307q0.f60922d;
        C29307Y0 c29307y0 = (C29307Y0) obj;
        InterfaceC30271n0 interfaceC30271n0 = c30311s0.f60936d;
        if (interfaceC30271n0 != null) {
            interfaceC30271n0.mo70170a(c29054t2, C30123Q.f60563a, c30311s0.m70178a());
        }
        if (c29307y0 != null && c29307y0.m69844d()) {
            String str3 = "Fast-fail for " + c29054t2;
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d("DocCapture", str3, null);
            c33270a.f67810a.mo68955d("DocCapture", "response: " + c29307y0, null);
        }
        C32668s c32668s = C32635M.f66606w;
        C29054T c29054t3 = c30307q0.f60922d;
        c32668s.getClass();
        return new C30217h0(C32668s.m71291a(c29054t3), c29307y0);
    }
}
