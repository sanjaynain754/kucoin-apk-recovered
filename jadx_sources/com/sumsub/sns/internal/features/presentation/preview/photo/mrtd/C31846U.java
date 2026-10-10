package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import com.sumsub.sns.internal.core.presentation.nfc.C28899d;
import com.sumsub.sns.internal.core.presentation.nfc.C28901f;
import com.sumsub.sns.internal.core.presentation.nfc.C28902g;
import com.sumsub.sns.internal.core.presentation.nfc.C28903h;
import com.sumsub.sns.internal.core.presentation.nfc.C28907l;
import com.sumsub.sns.internal.core.presentation.nfc.InterfaceC28898c;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31846U implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f64721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31848W f64722b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function2 f64723c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31868f0 f64724d;

    public C31846U(InterfaceC41635f interfaceC41635f, C31848W c31848w, Function2 function2, C31868f0 c31868f0) {
        this.f64721a = interfaceC41635f;
        this.f64722b = c31848w;
        this.f64723c = function2;
        this.f64724d = c31868f0;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31845T c31845t;
        Object obj2;
        Object c31841o;
        if (continuation instanceof C31845T) {
            c31845t = (C31845T) continuation;
            int i11 = c31845t.f64719b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31845t.f64719b = i11 - Integer.MIN_VALUE;
            } else {
                c31845t = new C31845T(this, continuation);
            }
        } else {
            c31845t = new C31845T(this, continuation);
        }
        Object obj3 = c31845t.f64718a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31845t.f64719b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj3);
            InterfaceC41635f interfaceC41635f = this.f64721a;
            InterfaceC28898c interfaceC28898c = (InterfaceC28898c) obj;
            if (interfaceC28898c instanceof C28901f) {
                c31841o = new C31842P((CharSequence) this.f64722b.invoke("sns_mrtdscan2_listening_title"), (CharSequence) this.f64723c.invoke("sns_mrtdscan2_listening_subtitle::%s", "sns_mrtdscan2_listening_subtitle"), (CharSequence) this.f64722b.invoke("sns_alert_action_cancel"));
            } else {
                if (interfaceC28898c instanceof C28902g) {
                    C28902g c28902g = (C28902g) interfaceC28898c;
                    boolean z11 = c28902g.f58765a >= 60;
                    c31841o = new C31843Q(z11 ? (String) this.f64723c.invoke("sns_mrtdscan2_reader_ending_prompt", "sns_mrtdscan2_reader_prompt") : (String) this.f64723c.invoke("sns_mrtdscan2_reader_prompt::%s", "sns_mrtdscan2_reader_prompt"), (CharSequence) this.f64722b.invoke(z11 ? "sns_mrtdscan2_reader_ending_inProgress" : "sns_mrtdscan2_reader_inProgress"), (CharSequence) this.f64722b.invoke("sns_alert_action_cancel"), c28902g.f58765a);
                } else if (interfaceC28898c instanceof C28903h) {
                    c31841o = new C31839M((CharSequence) this.f64722b.invoke("sns_mrtdscan_reader_done"));
                } else {
                    if (interfaceC28898c instanceof C28899d) {
                        CharSequence charSequence = (CharSequence) this.f64722b.invoke("sns_mrtdscan_reader_error");
                        Object objInvoke = this.f64722b.invoke("sns_mrtdscan_action_retry");
                        C28936t c28936t = this.f64724d.f64768h.f58781h;
                        KProperty[] kPropertyArr = C28907l.f58773m;
                        KProperty kProperty = kPropertyArr[2];
                        if (((Boolean) c28936t.m69705a()).booleanValue()) {
                            objInvoke = null;
                        }
                        CharSequence charSequence2 = (CharSequence) objInvoke;
                        Object objInvoke2 = this.f64722b.invoke("sns_mrtdscan_action_skip");
                        C31868f0 c31868f0 = this.f64724d;
                        C28907l c28907l = c31868f0.f64768h;
                        C28936t c28936t2 = c28907l.f58781h;
                        KProperty kProperty2 = kPropertyArr[2];
                        if (!((Boolean) c28936t2.m69705a()).booleanValue()) {
                            int iM69678a = c28907l.m69678a();
                            C28936t c28936t3 = c31868f0.f64766f;
                            KProperty kProperty3 = C31868f0.f64760k[2];
                            if (iM69678a < ((Number) c28936t3.m69705a()).intValue()) {
                                objInvoke2 = null;
                            }
                        }
                        CharSequence charSequence3 = (CharSequence) objInvoke2;
                        AbstractC28978A2 abstractC28978A2Mo69720e = this.f64724d.f64762b.mo69720e();
                        C31868f0 c31868f1 = this.f64724d;
                        int iM69678a2 = c31868f1.f64768h.m69678a() - c31868f1.f64762b.mo69717b();
                        C28936t c28936t4 = c31868f1.f64767g;
                        KProperty kProperty4 = C31868f0.f64760k[3];
                        if (iM69678a2 < ((Number) c28936t4.m69705a()).intValue()) {
                            abstractC28978A2Mo69720e = null;
                        }
                        c31841o = new C31840N(charSequence, charSequence2, charSequence3, abstractC28978A2Mo69720e != null ? abstractC28978A2Mo69720e.mo69716a(this.f64724d.f64762b.mo69716a(null, 0), this.f64724d.f64768h.m69678a()) : null);
                    } else {
                        CharSequence charSequence4 = (CharSequence) this.f64723c.invoke("sns_mrtdscan2_title::%s", "sns_mrtdscan2_title");
                        String str = (String) this.f64723c.invoke("sns_mrtdscan2_body::%s", "sns_mrtdscan2_body");
                        String strSubstringAfter$default = str != null ? StringsKt.substringAfter$default(str, "{animation}", (String) null, 2, (Object) null) : null;
                        CharSequence charSequence5 = (CharSequence) this.f64722b.invoke("sns_mrtdscan2_action_more");
                        CharSequence charSequence6 = (CharSequence) this.f64722b.invoke("sns_mrtdscan_action_start");
                        Object objInvoke3 = this.f64722b.invoke("sns_mrtdscan_action_skip");
                        C31868f0 c31868f2 = this.f64724d;
                        C28907l c28907l2 = c31868f2.f64768h;
                        C28936t c28936t5 = c28907l2.f58781h;
                        KProperty kProperty5 = C28907l.f58773m[2];
                        if (!((Boolean) c28936t5.m69705a()).booleanValue()) {
                            int iM69678a3 = c28907l2.m69678a();
                            C28936t c28936t6 = c31868f2.f64766f;
                            KProperty kProperty6 = C31868f0.f64760k[2];
                            obj2 = iM69678a3 >= ((Number) c28936t6.m69705a()).intValue() ? objInvoke3 : null;
                        }
                        c31841o = new C31841O(charSequence4, strSubstringAfter$default, charSequence5, charSequence6, (CharSequence) obj2);
                    }
                }
            }
            c31845t.f64719b = 1;
            if (interfaceC41635f.emit(c31841o, c31845t) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj3);
        }
        return Unit.INSTANCE;
    }
}
