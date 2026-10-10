package com.sumsub.sns.internal.features.presentation.verification2.email;

import android.text.Spanned;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32660k;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32820d;
import com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g;
import java.util.Iterator;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32797s extends SuspendLambda implements Function5 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f67115a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Long f67116b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ InterfaceC32823g f67117c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ InterfaceC32792n f67118d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32774D f67119e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC29172p f67120f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C29983l f67121g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32797s(C32774D c32774d, AbstractC29172p abstractC29172p, C29983l c29983l, Continuation continuation) {
        super(5, continuation);
        this.f67119e = c32774d;
        this.f67120f = abstractC29172p;
        this.f67121g = c29983l;
    }

    @Override // p852kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C32797s c32797s = new C32797s(this.f67119e, this.f67120f, this.f67121g, (Continuation) obj5);
        c32797s.f67115a = (String) obj;
        c32797s.f67116b = (Long) obj2;
        c32797s.f67117c = (InterfaceC32823g) obj3;
        c32797s.f67118d = (InterfaceC32792n) obj4;
        return c32797s.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        String strM70061a;
        String strM70061a2;
        boolean z11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f67115a;
        Long l11 = this.f67116b;
        InterfaceC32823g interfaceC32823g = this.f67117c;
        InterfaceC32792n interfaceC32792n = this.f67118d;
        C32774D c32774d = this.f67119e;
        AbstractC29172p abstractC29172p = this.f67120f;
        C29983l c29983l = this.f67121g;
        int i11 = C32774D.f67075V;
        Iterator it = abstractC29172p.mo69760k().f59151a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.startsWith$default(((C29154m) next).f59132a.f59014a, "EMAIL_VERIFICATION", false, 2, (Object) null));
        C29154m c29154m = (C29154m) next;
        String strMo69753c = abstractC29172p.mo69753c();
        String strMo69753c2 = abstractC29172p.mo69753c();
        if (strMo69753c2 == null) {
            strMo69753c2 = null;
        } else {
            if (StringsKt.isBlank(strMo69753c2)) {
                z11 = false;
            } else {
                if (c29154m != null ? Intrinsics.areEqual(c29154m.f59147p, Boolean.TRUE) : false) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (!z11) {
                strMo69753c2 = null;
            }
        }
        boolean z12 = strMo69753c2 != null;
        String strM70061a3 = c29983l.m70061a(z12 ? "sns_confirmation_contact_emailLocked_title" : "sns_confirmation_contact_email_title");
        String strM70061a4 = c29983l.m70061a(z12 ? "sns_confirmation_contact_emailLocked_subtitle" : "sns_confirmation_contact_email_subtitle");
        String str2 = z12 ? "sns_confirmation_contact_emailLocked_footer" : null;
        Spanned spannedM69364a = (str2 == null || (strM70061a2 = c29983l.m70061a(str2)) == null) ? null : AbstractC28462i0.m69364a(strM70061a2, ((C28547d) c32774d.f67077b).f58099a.f58163a);
        if (strMo69753c2 != null) {
            strMo69753c = strMo69753c2;
        } else if (str != null) {
            strMo69753c = str;
        }
        C32793o c32793o = new C32793o(strMo69753c, c29983l.m70061a("sns_confirmation_contact_email_placeholder"), interfaceC32792n != null ? interfaceC32792n.mo71345a() : null, z12);
        boolean z13 = (str == null || StringsKt.isBlank(str) || (interfaceC32792n instanceof C32790l)) ? false : true;
        C32820d c32820d = interfaceC32823g instanceof C32820d ? (C32820d) interfaceC32823g : null;
        String str3 = c32820d != null ? c32820d.f67162a : null;
        boolean z14 = str3 != null && Intrinsics.areEqual(str3, str) && l11 != null && l11.longValue() > 0;
        boolean z15 = (z13 && l11 == null) || z14;
        if (l11 == null || z14) {
            strM70061a = c29983l.m70061a("sns_confirmation_contact_action_send");
        } else {
            String strM71282a = AbstractC32660k.m71282a(l11.longValue());
            String strM70061a5 = c29983l.m70061a("sns_confirmation_code_resendCountdown");
            strM70061a = strM70061a5 != null ? StringsKt.replace$default(strM70061a5, "{time}", strM71282a, false, 4, (Object) null) : null;
            if (strM70061a == null) {
                strM70061a = AbstractC32660k.m71282a(l11.longValue());
            }
        }
        return new C32794p(strM70061a3, strM70061a4, c32793o, spannedM69364a, new C32789k(strM70061a, z15));
    }
}
