package com.sumsub.sns.internal.features.presentation.error;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29095c0;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29119g0;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30940s extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62488a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28075O f62490c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30941t f62491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30940s(C28075O c28075o, C30941t c30941t, Continuation continuation) {
        super(2, continuation);
        this.f62490c = c28075o;
        this.f62491d = c30941t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30940s c30940s = new C30940s(this.f62490c, this.f62491d, continuation);
        c30940s.f62489b = obj;
        return c30940s;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30940s) create((InterfaceC41635f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d0 A[PHI: r4 r5
      0x00d0: PHI (r4v12 java.lang.CharSequence) = (r4v5 java.lang.CharSequence), (r4v9 java.lang.CharSequence), (r4v21 java.lang.CharSequence) binds: [B:46:0x00c6, B:32:0x008b, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r5v21 java.lang.CharSequence) = (r5v4 java.lang.CharSequence), (r5v13 java.lang.CharSequence), (r5v34 java.lang.CharSequence) binds: [B:46:0x00c6, B:32:0x008b, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013b, code lost:
    
        if (r11.emit(r2, r10) == r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0146, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0148, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strM70061a;
        CharSequence charSequenceM69364a;
        CharSequence charSequenceM69364a2;
        String strM70061a2;
        String strM70061a3;
        String strM70061a4;
        String strM70061a5;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62488a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.f62489b;
            C29983l c29983l = this.f62490c.f57271c;
            AbstractC29149l0 abstractC29149l0 = this.f62491d.f62492a;
            CharSequence charSequenceM69364a3 = null;
            if (abstractC29149l0 instanceof C29131i0) {
                if (c29983l != null) {
                    charSequenceM69364a = c29983l.m70061a("sns_oops_network_title");
                } else {
                    charSequenceM69364a = null;
                }
                if (c29983l != null) {
                    charSequenceM69364a2 = c29983l.m70061a("sns_oops_network_html");
                } else {
                    charSequenceM69364a2 = null;
                }
                if (c29983l != null) {
                    strM70061a = c29983l.m70061a("sns_oops_action_retry");
                } else {
                    strM70061a = null;
                }
            } else if (abstractC29149l0 instanceof C29119g0) {
                if (c29983l != null && (strM70061a5 = c29983l.m70061a("sns_oops_fatal_title")) != null) {
                    charSequenceM69364a = AbstractC28462i0.m69364a(strM70061a5, ((C28547d) this.f62491d.f62496e).f58099a.f58163a);
                } else {
                    charSequenceM69364a = null;
                }
                if (c29983l != null && (strM70061a4 = c29983l.m70061a("sns_oops_fatal_html")) != null) {
                    charSequenceM69364a2 = AbstractC28462i0.m69364a(strM70061a4, ((C28547d) this.f62491d.f62496e).f58099a.f58163a);
                } else {
                    charSequenceM69364a2 = null;
                }
                if (c29983l != null) {
                    strM70061a = c29983l.m70061a("sns_oops_action_retry");
                } else {
                    strM70061a = null;
                }
            } else if (abstractC29149l0 instanceof C29107e0) {
                if (c29983l != null && (strM70061a3 = c29983l.m70061a("sns_oops_fatal_title")) != null) {
                    charSequenceM69364a = AbstractC28462i0.m69364a(strM70061a3, ((C28547d) this.f62491d.f62496e).f58099a.f58163a);
                } else {
                    charSequenceM69364a = null;
                }
                if (c29983l != null && (strM70061a2 = c29983l.m70061a("sns_oops_fatal_html")) != null) {
                    charSequenceM69364a2 = AbstractC28462i0.m69364a(strM70061a2, ((C28547d) this.f62491d.f62496e).f58099a.f58163a);
                } else {
                    charSequenceM69364a2 = null;
                }
                if (c29983l != null) {
                    strM70061a = c29983l.m70061a("sns_oops_action_goBack");
                } else {
                    strM70061a = null;
                }
            } else {
                strM70061a = null;
                charSequenceM69364a = null;
                charSequenceM69364a2 = null;
            }
            C29095c0 c29095c0Mo69764b = this.f62491d.f62492a.mo69764b();
            if (c29095c0Mo69764b != null) {
                String str2 = c29095c0Mo69764b.f59044a;
                if ((str2 != null && !StringsKt.isBlank(str2)) || ((str = c29095c0Mo69764b.f59045b) != null && !StringsKt.isBlank(str))) {
                    String str3 = c29095c0Mo69764b.f59044a;
                    if (str3 != null) {
                        charSequenceM69364a = AbstractC28462i0.m69364a(str3, ((C28547d) this.f62491d.f62496e).f58099a.f58163a);
                    } else {
                        charSequenceM69364a = null;
                    }
                    String str4 = c29095c0Mo69764b.f59045b;
                    if (str4 != null) {
                        charSequenceM69364a3 = AbstractC28462i0.m69364a(str4, ((C28547d) this.f62491d.f62496e).f58099a.f58163a);
                    }
                } else {
                    charSequenceM69364a3 = charSequenceM69364a2;
                }
                String str5 = c29095c0Mo69764b.f59046c;
                if (str5 != null && !StringsKt.isBlank(str5)) {
                    strM70061a = c29095c0Mo69764b.f59046c;
                }
                charSequenceM69364a2 = charSequenceM69364a3;
            }
            if ((charSequenceM69364a != null || charSequenceM69364a2 != null) && strM70061a != null) {
                C30937p c30937p = new C30937p(charSequenceM69364a, charSequenceM69364a2, strM70061a);
                this.f62488a = 1;
            } else {
                C30938q c30938q = C30938q.f62487a;
                this.f62488a = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
