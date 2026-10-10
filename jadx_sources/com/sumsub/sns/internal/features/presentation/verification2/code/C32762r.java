package com.sumsub.sns.internal.features.presentation.verification2.code;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32660k;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32820d;
import com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32762r extends SuspendLambda implements Function4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Long f67031a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC32823g f67032b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ CharSequence f67033c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32767w f67034d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C28075O f67035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32762r(C32767w c32767w, C28075O c28075o, Continuation continuation) {
        super(4, continuation);
        this.f67034d = c32767w;
        this.f67035e = c28075o;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C32762r c32762r = new C32762r(this.f67034d, this.f67035e, (Continuation) obj4);
        c32762r.f67031a = (Long) obj;
        c32762r.f67032b = (InterfaceC32823g) obj2;
        c32762r.f67033c = (CharSequence) obj3;
        return c32762r.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM70061a;
        String strM70061a2;
        String strReplace$default;
        String strReplace$default2;
        String strM70061a3;
        String strM70061a4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Long l11 = this.f67031a;
        InterfaceC32823g interfaceC32823g = this.f67032b;
        CharSequence charSequence = this.f67033c;
        C32767w c32767w = this.f67034d;
        C28075O c28075o = this.f67035e;
        int i11 = C32767w.f67058V;
        boolean z11 = interfaceC32823g instanceof C32820d;
        C29983l c29983l = c28075o.f57271c;
        String str = c32767w.f67060b;
        boolean z12 = c32767w.f67061c == ValidationIdentifierType.EMAIL;
        if (z12) {
            if (c29983l != null) {
                strM70061a = c29983l.m70061a("sns_confirmation_code_email_title");
            } else {
                strM70061a = null;
            }
        } else if (c29983l != null) {
            strM70061a = c29983l.m70061a("sns_confirmation_code_phone_title");
        } else {
            strM70061a = null;
        }
        if (z12) {
            if (c29983l == null || (strM70061a4 = c29983l.m70061a("sns_confirmation_code_email_subtitle")) == null) {
                strReplace$default = null;
            } else {
                strReplace$default = StringsKt.replace$default(strM70061a4, "{email}", str, false, 4, (Object) null);
            }
        } else if (c29983l == null || (strM70061a2 = c29983l.m70061a("sns_confirmation_code_phone_subtitle")) == null) {
            strReplace$default = null;
        } else {
            strReplace$default = StringsKt.replace$default(strM70061a2, "{phone}", str, false, 4, (Object) null);
        }
        if (l11 != null) {
            strReplace$default2 = (c29983l == null || (strM70061a3 = c29983l.m70061a("sns_confirmation_code_resendCountdown")) == null) ? null : StringsKt.replace$default(strM70061a3, "{time}", AbstractC32660k.m71282a(l11.longValue()), false, 4, (Object) null);
            if (strReplace$default2 == null) {
                strReplace$default2 = AbstractC32660k.m71282a(l11.longValue());
            }
        } else {
            strReplace$default2 = null;
        }
        C32820d c32820d = z11 ? (C32820d) interfaceC32823g : null;
        return new C32761q(strM70061a, strReplace$default, c32820d != null ? c32820d.f67164c : 6, strReplace$default2, c29983l != null ? c29983l.m70061a("sns_confirmation_code_action_resend") : null, l11 == null && z11, charSequence);
    }
}
