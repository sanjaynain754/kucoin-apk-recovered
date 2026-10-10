package com.sumsub.sns.internal.features.presentation.verification2.phone;

import android.text.Spanned;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32660k;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32820d;
import com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32874s extends SuspendLambda implements Function6 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C32849a f67257a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Long f67258b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C30270n f67259c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ InterfaceC32823g f67260d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ InterfaceC32872q f67261e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C32847F f67262f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC29172p f67263g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C29983l f67264h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32874s(C32847F c32847f, AbstractC29172p abstractC29172p, C29983l c29983l, Continuation continuation) {
        super(6, continuation);
        this.f67262f = c32847f;
        this.f67263g = abstractC29172p;
        this.f67264h = c29983l;
    }

    @Override // p852kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C32874s c32874s = new C32874s(this.f67262f, this.f67263g, this.f67264h, (Continuation) obj6);
        c32874s.f67257a = (C32849a) obj;
        c32874s.f67258b = (Long) obj2;
        c32874s.f67259c = (C30270n) obj3;
        c32874s.f67260d = (InterfaceC32823g) obj4;
        c32874s.f67261e = (InterfaceC32872q) obj5;
        return c32874s.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        String strM70061a;
        String strM70061a2;
        String strM70061a3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C32849a c32849a = this.f67257a;
        Long l11 = this.f67258b;
        C30270n c30270n = this.f67259c;
        InterfaceC32823g interfaceC32823g = this.f67260d;
        InterfaceC32872q interfaceC32872q = this.f67261e;
        C32847F c32847f = this.f67262f;
        AbstractC29172p abstractC29172p = this.f67263g;
        C29983l c29983l = this.f67264h;
        Spanned spannedM69364a = null;
        c32847f.f67209e.m71352a(abstractC29172p, c30270n, interfaceC32872q != null ? ((C32871p) interfaceC32872q).f67252a : null);
        C32851b c32851b = (C32851b) c32847f.f67209e.f57261i.getValue();
        boolean z12 = c32851b != null ? c32851b.f67219c : false;
        boolean z13 = c32849a != null ? c32849a.f67215b : false;
        C32820d c32820d = interfaceC32823g instanceof C32820d ? (C32820d) interfaceC32823g : null;
        String str = c32820d != null ? c32820d.f67162a : null;
        if (str == null) {
            z11 = false;
        } else {
            if (!Intrinsics.areEqual(str, c32849a != null ? c32849a.f67214a : null) || l11 == null || l11.longValue() <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        boolean z14 = (z13 && l11 == null) || z11;
        if (l11 == null || z11) {
            strM70061a = c29983l.m70061a("sns_confirmation_contact_action_send");
        } else {
            strM70061a = (c29983l == null || (strM70061a3 = c29983l.m70061a("sns_confirmation_code_resendCountdown")) == null) ? null : StringsKt.replace$default(strM70061a3, "{time}", AbstractC32660k.m71282a(l11.longValue()), false, 4, (Object) null);
            if (strM70061a == null) {
                strM70061a = AbstractC32660k.m71282a(l11.longValue());
            }
        }
        C32870o c32870o = new C32870o(strM70061a, z14);
        String strM70061a4 = c29983l.m70061a(z12 ? "sns_confirmation_contact_phoneLocked_title" : "sns_confirmation_contact_phone_title");
        Spanned spannedM69364a2 = strM70061a4 != null ? AbstractC28462i0.m69364a(strM70061a4, ((C28547d) c32847f.f67207c).f58099a.f58163a) : null;
        String strM70061a5 = c29983l.m70061a(z12 ? "sns_confirmation_contact_phoneLocked_subtitle" : "sns_confirmation_contact_phone_subtitle");
        Spanned spannedM69364a3 = strM70061a5 != null ? AbstractC28462i0.m69364a(strM70061a5, ((C28547d) c32847f.f67207c).f58099a.f58163a) : null;
        String str2 = z12 ? "sns_confirmation_contact_phoneLocked_footer" : null;
        if (str2 != null && (strM70061a2 = c29983l.m70061a(str2)) != null) {
            spannedM69364a = AbstractC28462i0.m69364a(strM70061a2, ((C28547d) c32847f.f67207c).f58099a.f58163a);
        }
        return new C32873r(spannedM69364a2, spannedM69364a3, spannedM69364a, c32870o);
    }
}
