package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32696V implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f66845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f66846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32742x f66847c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32720j0 f66848d;

    public C32696V(InterfaceC41635f interfaceC41635f, String str, C32742x c32742x, C32720j0 c32720j0) {
        this.f66845a = interfaceC41635f;
        this.f66846b = str;
        this.f66847c = c32742x;
        this.f66848d = c32720j0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r8.emit(r9, r2) == r3) goto L28;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C32695U c32695u;
        InterfaceC41635f interfaceC41635f;
        Long l11;
        String str;
        String str2;
        if (continuation instanceof C32695U) {
            c32695u = (C32695U) continuation;
            int i11 = c32695u.f66841b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32695u.f66841b = i11 - Integer.MIN_VALUE;
            } else {
                c32695u = new C32695U(this, continuation);
            }
        } else {
            c32695u = new C32695U(this, continuation);
        }
        Object objM71300a = c32695u.f66840a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32695u.f66841b;
        if (i12 != 0) {
            if (i12 == 1) {
                l11 = c32695u.f66844e;
                interfaceC41635f = c32695u.f66842c;
                ResultKt.throwOnFailure(objM71300a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM71300a);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM71300a);
        interfaceC41635f = this.f66845a;
        l11 = (Long) obj;
        if (l11 != null) {
            long jLongValue = l11.longValue();
            C32720j0 c32720j0 = this.f66848d;
            c32695u.f66842c = interfaceC41635f;
            c32695u.f66844e = l11;
            c32695u.f66841b = 1;
            KProperty[] kPropertyArr = C32720j0.f66932t;
            objM71300a = c32720j0.m71300a(jLongValue, c32695u);
        } else {
            str = null;
            if (l11 == null) {
                str2 = this.f66846b;
            } else {
                str2 = null;
            }
            C32742x c32742x = this.f66847c;
            CharSequence charSequence = c32742x.f66995a;
            CharSequence charSequence2 = c32742x.f66996b;
            Integer num = c32742x.f66997c;
            C28936t c28936t = this.f66848d.f66943k;
            KProperty kProperty = C32720j0.f66932t[1];
            CharSequence charSequence3 = (CharSequence) c28936t.m69705a();
            C32742x c32742x2 = this.f66847c;
            C32677B c32677b = new C32677B(charSequence, charSequence2, str, str2, num, charSequence3, c32742x2.f66998d, c32742x2.f66999e);
            c32695u.f66842c = null;
            c32695u.f66844e = null;
            c32695u.f66841b = 2;
        }
        return coroutine_suspended;
        str = (String) objM71300a;
        if (l11 == null) {
            str2 = this.f66846b;
        } else {
            str2 = null;
        }
        C32742x c32742x3 = this.f66847c;
        CharSequence charSequence4 = c32742x3.f66995a;
        CharSequence charSequence5 = c32742x3.f66996b;
        Integer num2 = c32742x3.f66997c;
        C28936t c28936t2 = this.f66848d.f66943k;
        KProperty kProperty2 = C32720j0.f66932t[1];
        CharSequence charSequence6 = (CharSequence) c28936t2.m69705a();
        C32742x c32742x4 = this.f66847c;
        C32677B c32677b2 = new C32677B(charSequence4, charSequence5, str, str2, num2, charSequence6, c32742x4.f66998d, c32742x4.f66999e);
        c32695u.f66842c = null;
        c32695u.f66844e = null;
        c32695u.f66841b = 2;
    }
}
