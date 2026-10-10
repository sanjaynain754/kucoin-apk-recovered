package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.domain.C30068B;
import com.sumsub.sns.internal.features.domain.C30270n;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32691P implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f66810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32720j0 f66811b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32739u f66812c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f66813d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CharSequence f66814e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f66815f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C30068B f66816g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CharSequence f66817h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C30270n f66818i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CharSequence f66819j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f66820k;

    public C32691P(InterfaceC41635f interfaceC41635f, C32720j0 c32720j0, C32739u c32739u, boolean z11, CharSequence charSequence, CharSequence charSequence2, C30068B c30068b, CharSequence charSequence3, C30270n c30270n, CharSequence charSequence4, boolean z12) {
        this.f66810a = interfaceC41635f;
        this.f66811b = c32720j0;
        this.f66812c = c32739u;
        this.f66813d = z11;
        this.f66814e = charSequence;
        this.f66815f = charSequence2;
        this.f66816g = c30068b;
        this.f66817h = charSequence3;
        this.f66818i = c30270n;
        this.f66819j = charSequence4;
        this.f66820k = z12;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if (r3.emit(r11, r8) == r2) goto L35;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C32690O c32690o;
        InterfaceC41635f interfaceC41635f;
        if (continuation instanceof C32690O) {
            c32690o = (C32690O) continuation;
            int i11 = c32690o.f66807b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32690o.f66807b = i11 - Integer.MIN_VALUE;
            } else {
                c32690o = new C32690O(this, continuation);
            }
        } else {
            c32690o = new C32690O(this, continuation);
        }
        C32690O c32690o2 = c32690o;
        Object obj2 = c32690o2.f66806a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32690o2.f66807b;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC41635f = c32690o2.f66808c;
                ResultKt.throwOnFailure(obj2);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        InterfaceC41635f interfaceC41635f2 = this.f66810a;
        Long l11 = (Long) obj;
        C32720j0 c32720j0 = this.f66811b;
        C32739u c32739u = this.f66812c;
        String str = c32739u != null ? c32739u.f66990a : null;
        KProperty[] kPropertyArr = C32720j0.f66932t;
        C28936t c28936t = c32720j0.f66944l;
        KProperty kProperty = C32720j0.f66932t[2];
        boolean zM71299a = C32720j0.m71299a(c32720j0, str, (C32742x) c28936t.m69705a(), l11);
        C32720j0 c32720j1 = this.f66811b;
        boolean z11 = this.f66813d;
        c32690o2.f66808c = interfaceC41635f2;
        c32690o2.f66807b = 1;
        Object objM71298a = C32720j0.m71298a(c32720j1, z11, l11, zM71299a, "sns_confirmation_contact_action_send", c32690o2);
        if (objM71298a != coroutine_suspended) {
            interfaceC41635f = interfaceC41635f2;
            obj2 = objM71298a;
        }
        return coroutine_suspended;
        C32743y c32743y = (C32743y) obj2;
        String str2 = (String) this.f66814e;
        String str3 = (String) this.f66815f;
        String str4 = this.f66816g.f60406a;
        String strRemovePrefix = str4 != null ? StringsKt.removePrefix(str4, (CharSequence) "+") : null;
        String str5 = (String) this.f66817h;
        C32679D c32679d = new C32679D(str2, str3, strRemovePrefix, this.f66818i, this.f66819j, c32743y, str5 != null ? AbstractC28462i0.m69364a(str5, ((C28547d) this.f66811b.f66940h).f58099a.f58163a) : null, this.f66820k);
        c32690o2.f66808c = null;
        c32690o2.f66807b = 2;
    }
}
