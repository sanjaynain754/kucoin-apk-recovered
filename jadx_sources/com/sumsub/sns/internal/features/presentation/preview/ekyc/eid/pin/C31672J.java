package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31672J implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f64285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31675M f64286b;

    public C31672J(InterfaceC41635f interfaceC41635f, C31675M c31675m) {
        this.f64285a = interfaceC41635f;
        this.f64286b = c31675m;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0153  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
    
        if (r9 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0191, code lost:
    
        if (r9 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0211, code lost:
    
        if (r9 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x024c, code lost:
    
        if (r9 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x026a, code lost:
    
        if (r9.emit(r2, r0) == r1) goto L89;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C31671I c31671i;
        InterfaceC41635f interfaceC41635f;
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step;
        InterfaceC41635f interfaceC41635f2;
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step2;
        InterfaceC41635f interfaceC41635f3;
        InterfaceC41635f interfaceC41635f4;
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step3;
        InterfaceC41635f interfaceC41635f5;
        Object c31663a;
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step4;
        CharSequence charSequence;
        Object c31663a2;
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step5;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object string;
        InterfaceC41635f interfaceC41635f6;
        CharSequence charSequence4;
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step6;
        CharSequence charSequence5;
        Object c31701z;
        CharSequence charSequence6;
        Object string2;
        CharSequence charSequence7;
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step7;
        CharSequence charSequence8;
        if (continuation instanceof C31671I) {
            c31671i = (C31671I) continuation;
            int i11 = c31671i.f64280b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31671i.f64280b = i11 - Integer.MIN_VALUE;
            } else {
                c31671i = new C31671I(this, continuation);
            }
        } else {
            c31671i = new C31671I(this, continuation);
        }
        Object string3 = c31671i.f64279a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c31671i.f64280b) {
            case 0:
                ResultKt.throwOnFailure(string3);
                interfaceC41635f = this.f64285a;
                sNSEidPinViewModel$Step = (SNSEidPinViewModel$Step) obj;
                switch (AbstractC31667E.f64271a[sNSEidPinViewModel$Step.ordinal()]) {
                    case 1:
                        C31675M c31675m = this.f64286b;
                        c31671i.f64281c = interfaceC41635f;
                        c31671i.f64283e = sNSEidPinViewModel$Step;
                        c31671i.f64280b = 1;
                        Object string4 = c31675m.getString("sns_eid_pinpad_pin_title", c31671i);
                        if (string4 != coroutine_suspended) {
                            interfaceC41635f2 = interfaceC41635f;
                            string3 = string4;
                            sNSEidPinViewModel$Step4 = sNSEidPinViewModel$Step;
                            charSequence = (CharSequence) string3;
                            C31675M c31675m2 = this.f64286b;
                            c31671i.f64281c = interfaceC41635f2;
                            c31671i.f64283e = sNSEidPinViewModel$Step4;
                            c31671i.f64284f = charSequence;
                            c31671i.f64280b = 2;
                            string3 = c31675m2.getString("sns_eid_pinpad_pin_subtitle", c31671i);
                            break;
                        }
                        return coroutine_suspended;
                    case 2:
                        C31675M c31675m3 = this.f64286b;
                        c31671i.f64281c = interfaceC41635f;
                        c31671i.f64283e = sNSEidPinViewModel$Step;
                        c31671i.f64280b = 3;
                        Object string5 = c31675m3.getString("sns_eid_pinpad_can_title", c31671i);
                        if (string5 != coroutine_suspended) {
                            interfaceC41635f2 = interfaceC41635f;
                            string3 = string5;
                            sNSEidPinViewModel$Step5 = sNSEidPinViewModel$Step;
                            charSequence2 = (CharSequence) string3;
                            C31675M c31675m4 = this.f64286b;
                            c31671i.f64281c = interfaceC41635f2;
                            c31671i.f64283e = sNSEidPinViewModel$Step5;
                            c31671i.f64284f = charSequence2;
                            c31671i.f64280b = 4;
                            string3 = c31675m4.getString("sns_eid_pinpad_can_subtitle", c31671i);
                            break;
                        }
                        return coroutine_suspended;
                    case 3:
                        C31675M c31675m5 = this.f64286b;
                        c31671i.f64281c = interfaceC41635f;
                        c31671i.f64283e = sNSEidPinViewModel$Step;
                        c31671i.f64280b = 5;
                        Object string6 = c31675m5.getString("sns_eid_pinpad_puk_title", c31671i);
                        if (string6 != coroutine_suspended) {
                            sNSEidPinViewModel$Step2 = sNSEidPinViewModel$Step;
                            interfaceC41635f3 = interfaceC41635f;
                            string3 = string6;
                            charSequence3 = (CharSequence) string3;
                            C31675M c31675m6 = this.f64286b;
                            c31671i.f64281c = interfaceC41635f3;
                            c31671i.f64283e = sNSEidPinViewModel$Step2;
                            c31671i.f64284f = charSequence3;
                            c31671i.f64280b = 6;
                            string = c31675m6.getString("sns_eid_pinpad_puk_subtitle", c31671i);
                            if (string != coroutine_suspended) {
                                interfaceC41635f6 = interfaceC41635f3;
                                charSequence4 = charSequence3;
                                string3 = string;
                                c31663a2 = new C31663A(charSequence4, (CharSequence) string3, 10, C31675M.m70798a(sNSEidPinViewModel$Step2));
                                interfaceC41635f = interfaceC41635f6;
                                c31663a = c31663a2;
                                c31671i.f64281c = null;
                                c31671i.f64283e = null;
                                c31671i.f64284f = null;
                                c31671i.f64280b = 13;
                            }
                            break;
                        }
                        return coroutine_suspended;
                    case 4:
                        C31675M c31675m7 = this.f64286b;
                        c31671i.f64281c = interfaceC41635f;
                        c31671i.f64283e = sNSEidPinViewModel$Step;
                        c31671i.f64280b = 7;
                        Object string7 = c31675m7.getString("sns_eid_pinpad_transportPin_title", c31671i);
                        if (string7 != coroutine_suspended) {
                            interfaceC41635f4 = interfaceC41635f;
                            string3 = string7;
                            sNSEidPinViewModel$Step6 = sNSEidPinViewModel$Step;
                            charSequence5 = (CharSequence) string3;
                            C31675M c31675m8 = this.f64286b;
                            c31671i.f64281c = interfaceC41635f4;
                            c31671i.f64283e = sNSEidPinViewModel$Step6;
                            c31671i.f64284f = charSequence5;
                            c31671i.f64280b = 8;
                            string3 = c31675m8.getString("sns_eid_pinpad_transportPin_subtitle", c31671i);
                            break;
                        }
                        return coroutine_suspended;
                    case 5:
                        C31675M c31675m9 = this.f64286b;
                        c31671i.f64281c = interfaceC41635f;
                        c31671i.f64283e = sNSEidPinViewModel$Step;
                        c31671i.f64280b = 9;
                        Object string8 = c31675m9.getString("sns_eid_pinpad_newPin_title", c31671i);
                        if (string8 != coroutine_suspended) {
                            sNSEidPinViewModel$Step3 = sNSEidPinViewModel$Step;
                            interfaceC41635f5 = interfaceC41635f;
                            string3 = string8;
                            charSequence6 = (CharSequence) string3;
                            C31675M c31675m10 = this.f64286b;
                            c31671i.f64281c = interfaceC41635f5;
                            c31671i.f64283e = sNSEidPinViewModel$Step3;
                            c31671i.f64284f = charSequence6;
                            c31671i.f64280b = 10;
                            string2 = c31675m10.getString("sns_eid_pinpad_newPin_subtitle", c31671i);
                            if (string2 != coroutine_suspended) {
                                interfaceC41635f4 = interfaceC41635f5;
                                charSequence7 = charSequence6;
                                string3 = string2;
                                c31701z = new C31700y(charSequence7, (CharSequence) string3, C31675M.m70798a(sNSEidPinViewModel$Step3));
                                interfaceC41635f = interfaceC41635f4;
                                c31663a = c31701z;
                                c31671i.f64281c = null;
                                c31671i.f64283e = null;
                                c31671i.f64284f = null;
                                c31671i.f64280b = 13;
                            }
                            break;
                        }
                        return coroutine_suspended;
                    case 6:
                        C31675M c31675m11 = this.f64286b;
                        c31671i.f64281c = interfaceC41635f;
                        c31671i.f64283e = sNSEidPinViewModel$Step;
                        c31671i.f64280b = 11;
                        Object string9 = c31675m11.getString("sns_eid_pinpad_newPinRepeat_title", c31671i);
                        if (string9 != coroutine_suspended) {
                            interfaceC41635f4 = interfaceC41635f;
                            string3 = string9;
                            sNSEidPinViewModel$Step7 = sNSEidPinViewModel$Step;
                            charSequence8 = (CharSequence) string3;
                            C31675M c31675m12 = this.f64286b;
                            c31671i.f64281c = interfaceC41635f4;
                            c31671i.f64283e = sNSEidPinViewModel$Step7;
                            c31671i.f64284f = charSequence8;
                            c31671i.f64280b = 12;
                            string3 = c31675m12.getString("sns_eid_pinpad_newPinRepeat_subtitle", c31671i);
                            break;
                        }
                        return coroutine_suspended;
                    case 7:
                        c31663a = new C31663A("!!! FOR TESTING ONLY !!!", "Enter the LAST digit of your old 6-digit PIN", 1, C31675M.m70798a(sNSEidPinViewModel$Step));
                        c31671i.f64281c = null;
                        c31671i.f64283e = null;
                        c31671i.f64284f = null;
                        c31671i.f64280b = 13;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                break;
            case 1:
                sNSEidPinViewModel$Step = c31671i.f64283e;
                InterfaceC41635f interfaceC41635f7 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                interfaceC41635f2 = interfaceC41635f7;
                sNSEidPinViewModel$Step4 = sNSEidPinViewModel$Step;
                charSequence = (CharSequence) string3;
                C31675M c31675m13 = this.f64286b;
                c31671i.f64281c = interfaceC41635f2;
                c31671i.f64283e = sNSEidPinViewModel$Step4;
                c31671i.f64284f = charSequence;
                c31671i.f64280b = 2;
                string3 = c31675m13.getString("sns_eid_pinpad_pin_subtitle", c31671i);
                break;
            case 2:
                charSequence = c31671i.f64284f;
                sNSEidPinViewModel$Step4 = c31671i.f64283e;
                interfaceC41635f2 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                c31663a2 = new C31663A(charSequence, (CharSequence) string3, 6, C31675M.m70798a(sNSEidPinViewModel$Step4));
                interfaceC41635f = interfaceC41635f2;
                c31663a = c31663a2;
                c31671i.f64281c = null;
                c31671i.f64283e = null;
                c31671i.f64284f = null;
                c31671i.f64280b = 13;
                break;
            case 3:
                sNSEidPinViewModel$Step = c31671i.f64283e;
                InterfaceC41635f interfaceC41635f8 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                interfaceC41635f2 = interfaceC41635f8;
                sNSEidPinViewModel$Step5 = sNSEidPinViewModel$Step;
                charSequence2 = (CharSequence) string3;
                C31675M c31675m14 = this.f64286b;
                c31671i.f64281c = interfaceC41635f2;
                c31671i.f64283e = sNSEidPinViewModel$Step5;
                c31671i.f64284f = charSequence2;
                c31671i.f64280b = 4;
                string3 = c31675m14.getString("sns_eid_pinpad_can_subtitle", c31671i);
                break;
            case 4:
                charSequence2 = c31671i.f64284f;
                sNSEidPinViewModel$Step5 = c31671i.f64283e;
                interfaceC41635f2 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                c31663a2 = new C31663A(charSequence2, (CharSequence) string3, 6, C31675M.m70798a(sNSEidPinViewModel$Step5));
                interfaceC41635f = interfaceC41635f2;
                c31663a = c31663a2;
                c31671i.f64281c = null;
                c31671i.f64283e = null;
                c31671i.f64284f = null;
                c31671i.f64280b = 13;
                break;
            case 5:
                SNSEidPinViewModel$Step sNSEidPinViewModel$Step8 = c31671i.f64283e;
                InterfaceC41635f interfaceC41635f9 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                sNSEidPinViewModel$Step2 = sNSEidPinViewModel$Step8;
                interfaceC41635f3 = interfaceC41635f9;
                charSequence3 = (CharSequence) string3;
                C31675M c31675m15 = this.f64286b;
                c31671i.f64281c = interfaceC41635f3;
                c31671i.f64283e = sNSEidPinViewModel$Step2;
                c31671i.f64284f = charSequence3;
                c31671i.f64280b = 6;
                string = c31675m15.getString("sns_eid_pinpad_puk_subtitle", c31671i);
                if (string != coroutine_suspended) {
                    interfaceC41635f6 = interfaceC41635f3;
                    charSequence4 = charSequence3;
                    string3 = string;
                    c31663a2 = new C31663A(charSequence4, (CharSequence) string3, 10, C31675M.m70798a(sNSEidPinViewModel$Step2));
                    interfaceC41635f = interfaceC41635f6;
                    c31663a = c31663a2;
                    c31671i.f64281c = null;
                    c31671i.f64283e = null;
                    c31671i.f64284f = null;
                    c31671i.f64280b = 13;
                    break;
                }
                return coroutine_suspended;
            case 6:
                charSequence4 = c31671i.f64284f;
                sNSEidPinViewModel$Step2 = c31671i.f64283e;
                interfaceC41635f6 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                c31663a2 = new C31663A(charSequence4, (CharSequence) string3, 10, C31675M.m70798a(sNSEidPinViewModel$Step2));
                interfaceC41635f = interfaceC41635f6;
                c31663a = c31663a2;
                c31671i.f64281c = null;
                c31671i.f64283e = null;
                c31671i.f64284f = null;
                c31671i.f64280b = 13;
                break;
            case 7:
                sNSEidPinViewModel$Step = c31671i.f64283e;
                InterfaceC41635f interfaceC41635f10 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                interfaceC41635f4 = interfaceC41635f10;
                sNSEidPinViewModel$Step6 = sNSEidPinViewModel$Step;
                charSequence5 = (CharSequence) string3;
                C31675M c31675m16 = this.f64286b;
                c31671i.f64281c = interfaceC41635f4;
                c31671i.f64283e = sNSEidPinViewModel$Step6;
                c31671i.f64284f = charSequence5;
                c31671i.f64280b = 8;
                string3 = c31675m16.getString("sns_eid_pinpad_transportPin_subtitle", c31671i);
                break;
            case 8:
                charSequence5 = c31671i.f64284f;
                sNSEidPinViewModel$Step6 = c31671i.f64283e;
                interfaceC41635f4 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                c31701z = new C31701z(charSequence5, (CharSequence) string3, C31675M.m70798a(sNSEidPinViewModel$Step6));
                interfaceC41635f = interfaceC41635f4;
                c31663a = c31701z;
                c31671i.f64281c = null;
                c31671i.f64283e = null;
                c31671i.f64284f = null;
                c31671i.f64280b = 13;
                break;
            case 9:
                SNSEidPinViewModel$Step sNSEidPinViewModel$Step9 = c31671i.f64283e;
                InterfaceC41635f interfaceC41635f11 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                sNSEidPinViewModel$Step3 = sNSEidPinViewModel$Step9;
                interfaceC41635f5 = interfaceC41635f11;
                charSequence6 = (CharSequence) string3;
                C31675M c31675m17 = this.f64286b;
                c31671i.f64281c = interfaceC41635f5;
                c31671i.f64283e = sNSEidPinViewModel$Step3;
                c31671i.f64284f = charSequence6;
                c31671i.f64280b = 10;
                string2 = c31675m17.getString("sns_eid_pinpad_newPin_subtitle", c31671i);
                if (string2 != coroutine_suspended) {
                    interfaceC41635f4 = interfaceC41635f5;
                    charSequence7 = charSequence6;
                    string3 = string2;
                    c31701z = new C31700y(charSequence7, (CharSequence) string3, C31675M.m70798a(sNSEidPinViewModel$Step3));
                    interfaceC41635f = interfaceC41635f4;
                    c31663a = c31701z;
                    c31671i.f64281c = null;
                    c31671i.f64283e = null;
                    c31671i.f64284f = null;
                    c31671i.f64280b = 13;
                    break;
                }
                return coroutine_suspended;
            case 10:
                charSequence7 = c31671i.f64284f;
                sNSEidPinViewModel$Step3 = c31671i.f64283e;
                interfaceC41635f4 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                c31701z = new C31700y(charSequence7, (CharSequence) string3, C31675M.m70798a(sNSEidPinViewModel$Step3));
                interfaceC41635f = interfaceC41635f4;
                c31663a = c31701z;
                c31671i.f64281c = null;
                c31671i.f64283e = null;
                c31671i.f64284f = null;
                c31671i.f64280b = 13;
                break;
            case 11:
                sNSEidPinViewModel$Step = c31671i.f64283e;
                InterfaceC41635f interfaceC41635f12 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                interfaceC41635f4 = interfaceC41635f12;
                sNSEidPinViewModel$Step7 = sNSEidPinViewModel$Step;
                charSequence8 = (CharSequence) string3;
                C31675M c31675m18 = this.f64286b;
                c31671i.f64281c = interfaceC41635f4;
                c31671i.f64283e = sNSEidPinViewModel$Step7;
                c31671i.f64284f = charSequence8;
                c31671i.f64280b = 12;
                string3 = c31675m18.getString("sns_eid_pinpad_newPinRepeat_subtitle", c31671i);
                break;
            case 12:
                charSequence8 = c31671i.f64284f;
                sNSEidPinViewModel$Step7 = c31671i.f64283e;
                interfaceC41635f4 = c31671i.f64281c;
                ResultKt.throwOnFailure(string3);
                c31701z = new C31665C(charSequence8, (CharSequence) string3, C31675M.m70798a(sNSEidPinViewModel$Step7));
                interfaceC41635f = interfaceC41635f4;
                c31663a = c31701z;
                c31671i.f64281c = null;
                c31671i.f64283e = null;
                c31671i.f64284f = null;
                c31671i.f64280b = 13;
                break;
            case 13:
                ResultKt.throwOnFailure(string3);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
