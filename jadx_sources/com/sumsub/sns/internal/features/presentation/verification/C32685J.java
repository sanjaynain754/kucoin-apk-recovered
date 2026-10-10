package com.sumsub.sns.internal.features.presentation.verification;

import android.text.Spanned;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32685J implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f66762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32720j0 f66763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f66764c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f66765d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CharSequence f66766e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f66767f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f66768g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CharSequence f66769h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CharSequence f66770i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f66771j;

    public C32685J(InterfaceC41635f interfaceC41635f, C32720j0 c32720j0, String str, boolean z11, CharSequence charSequence, CharSequence charSequence2, String str2, CharSequence charSequence3, CharSequence charSequence4, boolean z12) {
        this.f66762a = interfaceC41635f;
        this.f66763b = c32720j0;
        this.f66764c = str;
        this.f66765d = z11;
        this.f66766e = charSequence;
        this.f66767f = charSequence2;
        this.f66768g = str2;
        this.f66769h = charSequence3;
        this.f66770i = charSequence4;
        this.f66771j = z12;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        if (r7.emit(r12, r8) == r2) goto L49;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C32684I c32684i;
        InterfaceC41635f interfaceC41635f;
        C32743y c32743y;
        String str;
        String str2;
        String str3;
        String str4;
        Spanned spannedM69364a;
        if (continuation instanceof C32684I) {
            c32684i = (C32684I) continuation;
            int i11 = c32684i.f66755b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32684i.f66755b = i11 - Integer.MIN_VALUE;
            } else {
                c32684i = new C32684I(this, continuation);
            }
        } else {
            c32684i = new C32684I(this, continuation);
        }
        C32684I c32684i2 = c32684i;
        Object string = c32684i2.f66754a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32684i2.f66755b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            InterfaceC41635f interfaceC41635f2 = this.f66762a;
            Long l11 = (Long) obj;
            C32720j0 c32720j0 = this.f66763b;
            String str5 = this.f66764c;
            KProperty[] kPropertyArr = C32720j0.f66932t;
            C28936t c28936t = c32720j0.f66944l;
            KProperty kProperty = C32720j0.f66932t[2];
            boolean zM71299a = C32720j0.m71299a(c32720j0, str5, (C32742x) c28936t.m69705a(), l11);
            String str6 = this.f66764c;
            boolean z11 = (str6 == null || StringsKt.isBlank(str6) || this.f66765d) ? false : true;
            C32720j0 c32720j1 = this.f66763b;
            c32684i2.f66756c = interfaceC41635f2;
            c32684i2.f66755b = 1;
            Object objM71298a = C32720j0.m71298a(c32720j1, z11, l11, zM71299a, "sns_confirmation_contact_action_send", c32684i2);
            if (objM71298a != coroutine_suspended) {
                interfaceC41635f = interfaceC41635f2;
                string = objM71298a;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            InterfaceC41635f interfaceC41635f3 = c32684i2.f66756c;
            ResultKt.throwOnFailure(string);
            interfaceC41635f = interfaceC41635f3;
        } else if (i12 == 2) {
            str3 = c32684i2.f66761h;
            str2 = c32684i2.f66760g;
            str = c32684i2.f66759f;
            c32743y = c32684i2.f66758e;
            interfaceC41635f = c32684i2.f66756c;
            ResultKt.throwOnFailure(string);
            String str7 = str3;
            String str8 = str2;
            String str9 = str;
            C32743y c32743y2 = c32743y;
            String str10 = (String) string;
            str4 = (String) this.f66769h;
            if (str4 != null) {
                spannedM69364a = AbstractC28462i0.m69364a(str4, ((C28547d) this.f66763b.f66940h).f58099a.f58163a);
            } else {
                spannedM69364a = null;
            }
            C32678C c32678c = new C32678C(str9, str8, str7, str10, this.f66770i, c32743y2, spannedM69364a, this.f66771j);
            c32684i2.f66756c = null;
            c32684i2.f66758e = null;
            c32684i2.f66759f = null;
            c32684i2.f66760g = null;
            c32684i2.f66761h = null;
            c32684i2.f66755b = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(string);
        }
        return Unit.INSTANCE;
        c32743y = (C32743y) string;
        str = (String) this.f66766e;
        str2 = (String) this.f66767f;
        C32720j0 c32720j2 = this.f66763b;
        str3 = (c32720j2.f66946n || c32720j2.f66949q) ? null : this.f66768g;
        c32684i2.f66756c = interfaceC41635f;
        c32684i2.f66758e = c32743y;
        c32684i2.f66759f = str;
        c32684i2.f66760g = str2;
        c32684i2.f66761h = str3;
        c32684i2.f66755b = 2;
        string = c32720j2.getString("sns_confirmation_contact_email_placeholder", c32684i2);
        if (string != coroutine_suspended) {
            String str11 = str3;
            String str12 = str2;
            String str13 = str;
            C32743y c32743y3 = c32743y;
            String str14 = (String) string;
            str4 = (String) this.f66769h;
            if (str4 != null) {
                spannedM69364a = AbstractC28462i0.m69364a(str4, ((C28547d) this.f66763b.f66940h).f58099a.f58163a);
            } else {
                spannedM69364a = null;
            }
            C32678C c32678c2 = new C32678C(str13, str12, str11, str14, this.f66770i, c32743y3, spannedM69364a, this.f66771j);
            c32684i2.f66756c = null;
            c32684i2.f66758e = null;
            c32684i2.f66759f = null;
            c32684i2.f66760g = null;
            c32684i2.f66761h = null;
            c32684i2.f66755b = 3;
        }
        return coroutine_suspended;
    }
}
