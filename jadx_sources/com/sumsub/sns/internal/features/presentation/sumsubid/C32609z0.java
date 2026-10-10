package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.otp.C31374b;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32660k;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32609z0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f66520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28075O f66521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32557s f66522c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66523d;

    public C32609z0(InterfaceC41635f interfaceC41635f, C28075O c28075o, C32557s c32557s, C32487O0 c32487o0) {
        this.f66520a = interfaceC41635f;
        this.f66521b = c28075o;
        this.f66522c = c32557s;
        this.f66523d = c32487o0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088 A[PHI: r8 r9
      0x0088: PHI (r8v2 java.lang.Long) = (r8v1 java.lang.Long), (r8v4 java.lang.Long), (r8v4 java.lang.Long) binds: [B:17:0x004d, B:22:0x006f, B:24:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r9v1 kotlinx.coroutines.flow.f) = (r9v0 kotlinx.coroutines.flow.f), (r9v3 kotlinx.coroutines.flow.f), (r9v3 kotlinx.coroutines.flow.f) binds: [B:17:0x004d, B:22:0x006f, B:24:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r9.emit(r1, r2) == r3) goto L32;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C32607y0 c32607y0;
        InterfaceC41635f interfaceC41635f;
        Long l11;
        C31374b c31374b;
        String strReplace$default;
        String strM70061a;
        if (continuation instanceof C32607y0) {
            c32607y0 = (C32607y0) continuation;
            int i11 = c32607y0.f66510b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32607y0.f66510b = i11 - Integer.MIN_VALUE;
            } else {
                c32607y0 = new C32607y0(this, continuation);
            }
        } else {
            c32607y0 = new C32607y0(this, continuation);
        }
        Object strings = c32607y0.f66509a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32607y0.f66510b;
        if (i12 != 0) {
            if (i12 == 1) {
                c31374b = c32607y0.f66514f;
                l11 = c32607y0.f66513e;
                interfaceC41635f = c32607y0.f66511c;
                ResultKt.throwOnFailure(strings);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(strings);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(strings);
        interfaceC41635f = this.f66520a;
        l11 = (Long) obj;
        if (l11 != null) {
            c31374b = C31374b.f63574a;
            C32487O0 c32487o0 = this.f66523d;
            c32607y0.f66511c = interfaceC41635f;
            c32607y0.f66513e = l11;
            c32607y0.f66514f = c31374b;
            c32607y0.f66510b = 1;
            strings = c32487o0.getStrings(c32607y0);
        } else {
            strReplace$default = null;
            boolean z11 = l11 == null;
            C28075O c28075o = this.f66521b;
            C29983l c29983l = c28075o.f57271c;
            C29124h c29124h = c28075o.f57270b;
            C32557s c32557s = this.f66522c;
            C32492R0 c32492r0M71168a = AbstractC32500V0.m71168a(c29983l, c29124h, c32557s.f66411a, c32557s.f66412b, strReplace$default, z11);
            c32607y0.f66511c = null;
            c32607y0.f66513e = null;
            c32607y0.f66514f = null;
            c32607y0.f66510b = 2;
        }
        return coroutine_suspended;
        C29983l c29983l2 = (C29983l) strings;
        long jLongValue = l11.longValue();
        c31374b.getClass();
        String strM71282a = AbstractC32660k.m71282a(jLongValue);
        if (c29983l2 == null || (strM70061a = c29983l2.m70061a("sns_confirmation_code_resendCountdown")) == null) {
            strReplace$default = null;
        } else {
            strReplace$default = StringsKt.replace$default(strM70061a, "{time}", strM71282a, false, 4, (Object) null);
        }
        boolean z12 = l11 == null;
        C28075O c28075o2 = this.f66521b;
        C29983l c29983l3 = c28075o2.f57271c;
        C29124h c29124h2 = c28075o2.f57270b;
        C32557s c32557s2 = this.f66522c;
        C32492R0 c32492r0M71168a2 = AbstractC32500V0.m71168a(c29983l3, c29124h2, c32557s2.f66411a, c32557s2.f66412b, strReplace$default, z12);
        c32607y0.f66511c = null;
        c32607y0.f66513e = null;
        c32607y0.f66514f = null;
        c32607y0.f66510b = 2;
    }
}
