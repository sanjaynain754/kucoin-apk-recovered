package com.sumsub.sns.internal.features.presentation.verification;

import androidx.autofill.HintConstants;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.Status;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30068B;
import com.sumsub.sns.internal.features.domain.C30069C;
import com.sumsub.sns.internal.features.domain.C30083Q;
import com.sumsub.sns.internal.features.domain.C30101b;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32660k;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32720j0 extends AbstractC28073M0 {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ KProperty[] f66932t = {AbstractC28639a.m69485a(C32720j0.class, "step", "getStep()Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;", 0), AbstractC28639a.m69485a(C32720j0.class, "currentError", "getCurrentError()Ljava/lang/CharSequence;", 0), AbstractC28639a.m69485a(C32720j0.class, "verifyCodeStepData", "getVerifyCodeStepData()Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$VerifyCodeStepData;", 0), AbstractC28639a.m69485a(C32720j0.class, "codeResponse", "getCodeResponse()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/RequestCodeResponse;", 0)};

    /* JADX INFO: renamed from: a */
    public final ValidationIdentifierType f66933a;

    /* JADX INFO: renamed from: b */
    public final boolean f66934b;

    /* JADX INFO: renamed from: c */
    public final C30156e f66935c;

    /* JADX INFO: renamed from: d */
    public final C30083Q f66936d;

    /* JADX INFO: renamed from: e */
    public final C32707d f66937e;

    /* JADX INFO: renamed from: f */
    public final C30101b f66938f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC29984m f66939g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC30000a f66940h;

    /* JADX INFO: renamed from: i */
    public final C30069C f66941i;

    /* JADX INFO: renamed from: j */
    public final C28936t f66942j;

    /* JADX INFO: renamed from: k */
    public final C28936t f66943k;

    /* JADX INFO: renamed from: l */
    public final C28936t f66944l;

    /* JADX INFO: renamed from: m */
    public final C28936t f66945m;

    /* JADX INFO: renamed from: n */
    public boolean f66946n;

    /* JADX INFO: renamed from: o */
    public boolean f66947o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41669n f66948p;

    /* JADX INFO: renamed from: q */
    public boolean f66949q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41669n f66950r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC41678w f66951s;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71297a(C32720j0 c32720j0, SNSVerificationStepViewModel$Step sNSVerificationStepViewModel$Step, CharSequence charSequence, C32742x c32742x, C29570k0 c29570k0, ContinuationImpl continuationImpl) {
        C32693S c32693s;
        if (continuationImpl instanceof C32693S) {
            c32693s = (C32693S) continuationImpl;
            int i11 = c32693s.f66834c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32693s.f66834c = i11 - Integer.MIN_VALUE;
            } else {
                c32693s = new C32693S(c32720j0, continuationImpl);
            }
        } else {
            c32693s = new C32693S(c32720j0, continuationImpl);
        }
        Object objM71302a = c32693s.f66832a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32693s.f66834c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71302a);
            int i13 = AbstractC32681F.f66734b[sNSVerificationStepViewModel$Step.ordinal()];
            if (i13 == 1) {
                c32693s.f66834c = 1;
                Object objM71304a = c32720j0.m71304a(charSequence, c32693s);
                if (objM71304a != coroutine_suspended) {
                    return objM71304a;
                }
            } else if (i13 == 2) {
                c32693s.f66834c = 2;
                Object objM71303a = c32720j0.m71303a(c32742x, c32693s);
                if (objM71303a != coroutine_suspended) {
                    return objM71303a;
                }
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c32693s.f66834c = 3;
                objM71302a = c32720j0.m71302a(c29570k0, c32693s);
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM71302a);
            return objM71302a;
        }
        if (i12 == 2) {
            ResultKt.throwOnFailure(objM71302a);
            return objM71302a;
        }
        if (i12 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM71302a);
        return C41636g.m90889M(objM71302a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Code duplicated, block: B:42:0x0136  */
    /* JADX WARN: Code duplicated, block: B:46:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x0181  */
    /* JADX WARN: Code duplicated, block: B:56:0x0197  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01df  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:76:0x0205  */
    /* JADX WARN: Code duplicated, block: B:79:0x0228  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m71309b(AbstractC29172p abstractC29172p, CharSequence charSequence, ContinuationImpl continuationImpl) {
        C32689N c32689n;
        String str;
        Object objM70120a;
        AbstractC29172p abstractC29172p2;
        CharSequence charSequence2;
        C32720j0 c32720j0;
        Throwable thM103847exceptionOrNullimpl;
        Exception exc;
        String imageName;
        CharSequence charSequence3;
        C30270n c30270n;
        C30068B c30068bM70095a;
        boolean z11;
        Object string;
        C30270n c30270n2;
        CharSequence charSequence4;
        Object string2;
        C30270n c30270n3;
        CharSequence charSequence5;
        CharSequence charSequence6;
        Object string3;
        CharSequence charSequence7;
        C30270n c30270n4;
        C30068B c30068b;
        CharSequence charSequence8;
        Object string4;
        CharSequence charSequence9;
        CharSequence charSequence10;
        C30270n c30270n5;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        Object string5;
        CharSequence charSequence15;
        CharSequence charSequence16;
        Object c32676a;
        if (continuationImpl instanceof C32689N) {
            c32689n = (C32689N) continuationImpl;
            int i11 = c32689n.f66805i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32689n.f66805i = i11 - Integer.MIN_VALUE;
            } else {
                c32689n = new C32689N(this, continuationImpl);
            }
        } else {
            c32689n = new C32689N(this, continuationImpl);
        }
        Object string6 = c32689n.f66803g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c32689n.f66805i) {
            case 0:
                ResultKt.throwOnFailure(string6);
                C29062V c29062v = C29070X.Companion;
                int i12 = AbstractC32681F.f66733a[this.f66933a.ordinal()];
                if (i12 == 1) {
                    str = "EMAIL_VERIFICATION";
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "PHONE_VERIFICATION";
                }
                c29062v.getClass();
                C29154m c29154mM69794a = abstractC29172p.m69794a(C29062V.m69739a(str));
                boolean zM69789c = c29154mM69794a != null ? c29154mM69794a.m69789c() : false;
                C30156e c30156e = this.f66935c;
                c32689n.f66797a = abstractC29172p;
                c32689n.f66798b = charSequence;
                c32689n.f66805i = 1;
                objM70120a = c30156e.m70120a(zM69789c, c32689n);
                if (objM70120a != coroutine_suspended) {
                    abstractC29172p2 = abstractC29172p;
                    charSequence2 = charSequence;
                    if (Result.m103851isSuccessimpl(objM70120a)) {
                        ResultKt.throwOnFailure(objM70120a);
                        c30270n = (C30270n) objM70120a;
                        this.f66941i.getClass();
                        c30068bM70095a = C30069C.m70095a(abstractC29172p2, c30270n);
                        z11 = c30068bM70095a.f60407b;
                        if (z11) {
                            c32689n.f66797a = charSequence2;
                            c32689n.f66798b = c30270n;
                            c32689n.f66799c = c30068bM70095a;
                            c32689n.f66802f = z11;
                            c32689n.f66805i = 2;
                            string2 = getString("sns_confirmation_contact_phoneLocked_title", c32689n);
                            if (string2 != coroutine_suspended) {
                                c30270n3 = c30270n;
                                string6 = string2;
                                charSequence5 = charSequence2;
                                charSequence6 = (CharSequence) string6;
                                c32689n.f66797a = charSequence5;
                                c32689n.f66798b = c30270n3;
                                c32689n.f66799c = c30068bM70095a;
                                c32689n.f66800d = charSequence6;
                                c32689n.f66802f = z11;
                                c32689n.f66805i = 3;
                                string3 = getString("sns_confirmation_contact_phoneLocked_subtitle", c32689n);
                                if (string3 != coroutine_suspended) {
                                    C30068B c30068b2 = c30068bM70095a;
                                    charSequence7 = charSequence6;
                                    string6 = string3;
                                    c30270n4 = c30270n3;
                                    c30068b = c30068b2;
                                    charSequence8 = (CharSequence) string6;
                                    c32689n.f66797a = charSequence5;
                                    c32689n.f66798b = c30270n4;
                                    c32689n.f66799c = c30068b;
                                    c32689n.f66800d = charSequence7;
                                    c32689n.f66801e = charSequence8;
                                    c32689n.f66802f = z11;
                                    c32689n.f66805i = 4;
                                    string4 = getString("sns_confirmation_contact_phoneLocked_footer", c32689n);
                                    if (string4 != coroutine_suspended) {
                                        charSequence9 = charSequence8;
                                        string6 = string4;
                                        charSequence10 = charSequence5;
                                        c30270n5 = c30270n4;
                                        charSequence11 = charSequence10;
                                        charSequence12 = charSequence7;
                                        c30068bM70095a = c30068b;
                                        charSequence13 = (CharSequence) string6;
                                        return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
                                    }
                                }
                            }
                        } else {
                            c32689n.f66797a = charSequence2;
                            c32689n.f66798b = c30270n;
                            c32689n.f66799c = c30068bM70095a;
                            c32689n.f66802f = z11;
                            c32689n.f66805i = 5;
                            string = getString("sns_confirmation_contact_phone_title", c32689n);
                            if (string != coroutine_suspended) {
                                c30270n2 = c30270n;
                                string6 = string;
                                charSequence4 = charSequence2;
                                charSequence14 = (CharSequence) string6;
                                c32689n.f66797a = charSequence4;
                                c32689n.f66798b = c30270n2;
                                c32689n.f66799c = c30068bM70095a;
                                c32689n.f66800d = charSequence14;
                                c32689n.f66802f = z11;
                                c32689n.f66805i = 6;
                                string5 = getString("sns_confirmation_contact_phone_subtitle", c32689n);
                                if (string5 != coroutine_suspended) {
                                    charSequence15 = charSequence14;
                                    string6 = string5;
                                    charSequence16 = charSequence4;
                                    c30270n5 = c30270n2;
                                    charSequence13 = null;
                                    charSequence11 = charSequence16;
                                    charSequence12 = charSequence15;
                                    charSequence9 = (CharSequence) string6;
                                    return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
                                }
                            }
                        }
                    } else if (charSequence2 != null) {
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70120a);
                        if (thM103847exceptionOrNullimpl instanceof Exception) {
                            exc = (Exception) thM103847exceptionOrNullimpl;
                        } else {
                            exc = null;
                        }
                        String message = exc != null ? exc.getMessage() : null;
                        imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
                        c32689n.f66797a = charSequence2;
                        c32689n.f66798b = message;
                        c32689n.f66799c = imageName;
                        c32689n.f66805i = 7;
                        string6 = getString("sns_confirmation_result_action_tryAgain", c32689n);
                        if (string6 != coroutine_suspended) {
                            charSequence3 = charSequence2;
                            c32676a = new C32676A(charSequence3, imageName, (CharSequence) string6, true);
                            return C41636g.m90889M(c32676a);
                        }
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str2 = String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{HintConstants.AUTOFILL_HINT_PHONE}, 1));
                        c32689n.f66797a = this;
                        c32689n.f66798b = null;
                        c32689n.f66805i = 8;
                        string6 = getString(str2, c32689n);
                        if (string6 != coroutine_suspended) {
                            c32720j0 = this;
                            c32720j0.m71307a((CharSequence) string6);
                            c32676a = C32744z.f67003a;
                            return C41636g.m90889M(c32676a);
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                CharSequence charSequence17 = (CharSequence) c32689n.f66798b;
                AbstractC29172p abstractC29172p3 = (AbstractC29172p) c32689n.f66797a;
                ResultKt.throwOnFailure(string6);
                objM70120a = ((Result) string6).getValue();
                charSequence2 = charSequence17;
                abstractC29172p2 = abstractC29172p3;
                if (Result.m103851isSuccessimpl(objM70120a)) {
                    ResultKt.throwOnFailure(objM70120a);
                    c30270n = (C30270n) objM70120a;
                    this.f66941i.getClass();
                    c30068bM70095a = C30069C.m70095a(abstractC29172p2, c30270n);
                    z11 = c30068bM70095a.f60407b;
                    if (z11) {
                        c32689n.f66797a = charSequence2;
                        c32689n.f66798b = c30270n;
                        c32689n.f66799c = c30068bM70095a;
                        c32689n.f66802f = z11;
                        c32689n.f66805i = 2;
                        string2 = getString("sns_confirmation_contact_phoneLocked_title", c32689n);
                        if (string2 != coroutine_suspended) {
                            c30270n3 = c30270n;
                            string6 = string2;
                            charSequence5 = charSequence2;
                            charSequence6 = (CharSequence) string6;
                            c32689n.f66797a = charSequence5;
                            c32689n.f66798b = c30270n3;
                            c32689n.f66799c = c30068bM70095a;
                            c32689n.f66800d = charSequence6;
                            c32689n.f66802f = z11;
                            c32689n.f66805i = 3;
                            string3 = getString("sns_confirmation_contact_phoneLocked_subtitle", c32689n);
                            if (string3 != coroutine_suspended) {
                                C30068B c30068b3 = c30068bM70095a;
                                charSequence7 = charSequence6;
                                string6 = string3;
                                c30270n4 = c30270n3;
                                c30068b = c30068b3;
                                charSequence8 = (CharSequence) string6;
                                c32689n.f66797a = charSequence5;
                                c32689n.f66798b = c30270n4;
                                c32689n.f66799c = c30068b;
                                c32689n.f66800d = charSequence7;
                                c32689n.f66801e = charSequence8;
                                c32689n.f66802f = z11;
                                c32689n.f66805i = 4;
                                string4 = getString("sns_confirmation_contact_phoneLocked_footer", c32689n);
                                if (string4 != coroutine_suspended) {
                                    charSequence9 = charSequence8;
                                    string6 = string4;
                                    charSequence10 = charSequence5;
                                    c30270n5 = c30270n4;
                                    charSequence11 = charSequence10;
                                    charSequence12 = charSequence7;
                                    c30068bM70095a = c30068b;
                                    charSequence13 = (CharSequence) string6;
                                    return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
                                }
                            }
                        }
                    } else {
                        c32689n.f66797a = charSequence2;
                        c32689n.f66798b = c30270n;
                        c32689n.f66799c = c30068bM70095a;
                        c32689n.f66802f = z11;
                        c32689n.f66805i = 5;
                        string = getString("sns_confirmation_contact_phone_title", c32689n);
                        if (string != coroutine_suspended) {
                            c30270n2 = c30270n;
                            string6 = string;
                            charSequence4 = charSequence2;
                            charSequence14 = (CharSequence) string6;
                            c32689n.f66797a = charSequence4;
                            c32689n.f66798b = c30270n2;
                            c32689n.f66799c = c30068bM70095a;
                            c32689n.f66800d = charSequence14;
                            c32689n.f66802f = z11;
                            c32689n.f66805i = 6;
                            string5 = getString("sns_confirmation_contact_phone_subtitle", c32689n);
                            if (string5 != coroutine_suspended) {
                                charSequence15 = charSequence14;
                                string6 = string5;
                                charSequence16 = charSequence4;
                                c30270n5 = c30270n2;
                                charSequence13 = null;
                                charSequence11 = charSequence16;
                                charSequence12 = charSequence15;
                                charSequence9 = (CharSequence) string6;
                                return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
                            }
                        }
                    }
                } else if (charSequence2 != null) {
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70120a);
                    if (thM103847exceptionOrNullimpl instanceof Exception) {
                        exc = (Exception) thM103847exceptionOrNullimpl;
                    } else {
                        exc = null;
                    }
                    if (exc != null) {
                    }
                    imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
                    c32689n.f66797a = charSequence2;
                    c32689n.f66798b = message;
                    c32689n.f66799c = imageName;
                    c32689n.f66805i = 7;
                    string6 = getString("sns_confirmation_result_action_tryAgain", c32689n);
                    if (string6 != coroutine_suspended) {
                        charSequence3 = charSequence2;
                        c32676a = new C32676A(charSequence3, imageName, (CharSequence) string6, true);
                        return C41636g.m90889M(c32676a);
                    }
                } else {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str3 = String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{HintConstants.AUTOFILL_HINT_PHONE}, 1));
                    c32689n.f66797a = this;
                    c32689n.f66798b = null;
                    c32689n.f66805i = 8;
                    string6 = getString(str3, c32689n);
                    if (string6 != coroutine_suspended) {
                        c32720j0 = this;
                        c32720j0.m71307a((CharSequence) string6);
                        c32676a = C32744z.f67003a;
                        return C41636g.m90889M(c32676a);
                    }
                }
                return coroutine_suspended;
            case 2:
                z11 = c32689n.f66802f;
                c30068bM70095a = (C30068B) c32689n.f66799c;
                c30270n3 = (C30270n) c32689n.f66798b;
                charSequence5 = (CharSequence) c32689n.f66797a;
                ResultKt.throwOnFailure(string6);
                charSequence6 = (CharSequence) string6;
                c32689n.f66797a = charSequence5;
                c32689n.f66798b = c30270n3;
                c32689n.f66799c = c30068bM70095a;
                c32689n.f66800d = charSequence6;
                c32689n.f66802f = z11;
                c32689n.f66805i = 3;
                string3 = getString("sns_confirmation_contact_phoneLocked_subtitle", c32689n);
                if (string3 != coroutine_suspended) {
                    C30068B c30068b4 = c30068bM70095a;
                    charSequence7 = charSequence6;
                    string6 = string3;
                    c30270n4 = c30270n3;
                    c30068b = c30068b4;
                    charSequence8 = (CharSequence) string6;
                    c32689n.f66797a = charSequence5;
                    c32689n.f66798b = c30270n4;
                    c32689n.f66799c = c30068b;
                    c32689n.f66800d = charSequence7;
                    c32689n.f66801e = charSequence8;
                    c32689n.f66802f = z11;
                    c32689n.f66805i = 4;
                    string4 = getString("sns_confirmation_contact_phoneLocked_footer", c32689n);
                    if (string4 != coroutine_suspended) {
                        charSequence9 = charSequence8;
                        string6 = string4;
                        charSequence10 = charSequence5;
                        c30270n5 = c30270n4;
                        charSequence11 = charSequence10;
                        charSequence12 = charSequence7;
                        c30068bM70095a = c30068b;
                        charSequence13 = (CharSequence) string6;
                        return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
                    }
                }
                return coroutine_suspended;
            case 3:
                z11 = c32689n.f66802f;
                charSequence7 = c32689n.f66800d;
                c30068b = (C30068B) c32689n.f66799c;
                C30270n c30270n6 = (C30270n) c32689n.f66798b;
                CharSequence charSequence18 = (CharSequence) c32689n.f66797a;
                ResultKt.throwOnFailure(string6);
                c30270n4 = c30270n6;
                charSequence5 = charSequence18;
                charSequence8 = (CharSequence) string6;
                c32689n.f66797a = charSequence5;
                c32689n.f66798b = c30270n4;
                c32689n.f66799c = c30068b;
                c32689n.f66800d = charSequence7;
                c32689n.f66801e = charSequence8;
                c32689n.f66802f = z11;
                c32689n.f66805i = 4;
                string4 = getString("sns_confirmation_contact_phoneLocked_footer", c32689n);
                if (string4 != coroutine_suspended) {
                    charSequence9 = charSequence8;
                    string6 = string4;
                    charSequence10 = charSequence5;
                    c30270n5 = c30270n4;
                    charSequence11 = charSequence10;
                    charSequence12 = charSequence7;
                    c30068bM70095a = c30068b;
                    charSequence13 = (CharSequence) string6;
                    return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
                }
                return coroutine_suspended;
            case 4:
                z11 = c32689n.f66802f;
                charSequence9 = c32689n.f66801e;
                charSequence7 = c32689n.f66800d;
                c30068b = (C30068B) c32689n.f66799c;
                c30270n5 = (C30270n) c32689n.f66798b;
                charSequence10 = (CharSequence) c32689n.f66797a;
                ResultKt.throwOnFailure(string6);
                charSequence11 = charSequence10;
                charSequence12 = charSequence7;
                c30068bM70095a = c30068b;
                charSequence13 = (CharSequence) string6;
                return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
            case 5:
                z11 = c32689n.f66802f;
                c30068bM70095a = (C30068B) c32689n.f66799c;
                c30270n2 = (C30270n) c32689n.f66798b;
                charSequence4 = (CharSequence) c32689n.f66797a;
                ResultKt.throwOnFailure(string6);
                charSequence14 = (CharSequence) string6;
                c32689n.f66797a = charSequence4;
                c32689n.f66798b = c30270n2;
                c32689n.f66799c = c30068bM70095a;
                c32689n.f66800d = charSequence14;
                c32689n.f66802f = z11;
                c32689n.f66805i = 6;
                string5 = getString("sns_confirmation_contact_phone_subtitle", c32689n);
                if (string5 != coroutine_suspended) {
                    charSequence15 = charSequence14;
                    string6 = string5;
                    charSequence16 = charSequence4;
                    c30270n5 = c30270n2;
                    charSequence13 = null;
                    charSequence11 = charSequence16;
                    charSequence12 = charSequence15;
                    charSequence9 = (CharSequence) string6;
                    return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
                }
                return coroutine_suspended;
            case 6:
                z11 = c32689n.f66802f;
                charSequence15 = c32689n.f66800d;
                c30068bM70095a = (C30068B) c32689n.f66799c;
                c30270n2 = (C30270n) c32689n.f66798b;
                charSequence16 = (CharSequence) c32689n.f66797a;
                ResultKt.throwOnFailure(string6);
                c30270n5 = c30270n2;
                charSequence13 = null;
                charSequence11 = charSequence16;
                charSequence12 = charSequence15;
                charSequence9 = (CharSequence) string6;
                return C41636g.m90930n0(this.f66950r, new C32688M(null, this, charSequence12, charSequence9, c30068bM70095a, charSequence13, c30270n5, charSequence11, z11));
            case 7:
                imageName = (String) c32689n.f66799c;
                charSequence3 = (CharSequence) c32689n.f66797a;
                ResultKt.throwOnFailure(string6);
                c32676a = new C32676A(charSequence3, imageName, (CharSequence) string6, true);
                return C41636g.m90889M(c32676a);
            case 8:
                c32720j0 = (C32720j0) c32689n.f66797a;
                ResultKt.throwOnFailure(string6);
                c32720j0.m71307a((CharSequence) string6);
                c32676a = C32744z.f67003a;
                return C41636g.m90889M(c32676a);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        int i11 = AbstractC32681F.f66733a[this.f66933a.ordinal()];
        if (i11 == 1) {
            return "EMAIL_VERIFICATION";
        }
        if (i11 == 2) {
            return "PHONE_VERIFICATION";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final InterfaceC41673r getViewState() {
        return this.f66951s;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        C28936t c28936t = this.f66944l;
        KProperty[] kPropertyArr = f66932t;
        KProperty kProperty = kPropertyArr[2];
        C32742x c32742x = (C32742x) c28936t.m69705a();
        if (c32742x != null) {
            C28936t c28936t2 = this.f66944l;
            KProperty kProperty2 = kPropertyArr[2];
            c28936t2.f58834a.set(c28936t2.f58835b, c32742x);
            this.f66937e.m71293a(c32742x.f66998d, c32742x.f67000f);
            m71305a(SNSVerificationStepViewModel$Step.VERIFY_CODE);
        }
        C28936t c28936t3 = this.f66945m;
        KProperty kProperty3 = kPropertyArr[3];
        C29570k0 c29570k0 = (C29570k0) c28936t3.m69705a();
        if (c29570k0 != null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32704b0(this, c29570k0, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public C32720j0(ValidationIdentifierType validationIdentifierType, boolean z11, C30156e c30156e, C30083Q c30083q, C32707d c32707d, C30101b c30101b, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, SavedStateHandle savedStateHandle, C28547d c28547d, C30069C c30069c) {
        super(interfaceC29953a, interfaceC29984m);
        this.f66933a = validationIdentifierType;
        this.f66934b = z11;
        this.f66935c = c30156e;
        this.f66936d = c30083q;
        this.f66937e = c32707d;
        this.f66938f = c30101b;
        this.f66939g = interfaceC29984m;
        this.f66940h = c28547d;
        this.f66941i = c30069c;
        SNSVerificationStepViewModel$Step sNSVerificationStepViewModel$Step = SNSVerificationStepViewModel$Step.INIT;
        this.f66942j = new C28936t(savedStateHandle, "sns_verification_step", sNSVerificationStepViewModel$Step, false);
        this.f66943k = new C28936t(savedStateHandle, "sns_verification_error", null, false);
        this.f66944l = new C28936t(savedStateHandle, "sns_verification_code_step_data", null, false);
        this.f66945m = new C28936t(savedStateHandle, "sns_verification_response", null, false);
        this.f66948p = C41679x.m91009a(null);
        this.f66950r = C41679x.m91009a(null);
        this.f66951s = C41636g.m90916g0(C41636g.m90917h(C41636g.m90930n0(C41636g.m90931o(savedStateHandle.getStateFlow("sns_verification_step", sNSVerificationStepViewModel$Step), savedStateHandle.getStateFlow("sns_verification_error", null), savedStateHandle.getStateFlow("sns_verification_code_step_data", null), savedStateHandle.getStateFlow("sns_verification_response", null), new C32716h0(this, null)), new C32710e0(null)), new C32718i0(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), C32744z.f67003a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r2 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r2 == r4) goto L44;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71296a(C32720j0 c32720j0, C29570k0 c29570k0, ContinuationImpl continuationImpl) {
        C32699Y c32699y;
        String str;
        String str2;
        C29570k0 c29570k1;
        String str3;
        String strReplace$default;
        Long l11;
        long jLongValue;
        Integer num;
        int iIntValue;
        String str4;
        String str5;
        C29570k0 c29570k2 = c29570k0;
        if (continuationImpl instanceof C32699Y) {
            c32699y = (C32699Y) continuationImpl;
            int i11 = c32699y.f66862f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32699y.f66862f = i11 - Integer.MIN_VALUE;
            } else {
                c32699y = new C32699Y(c32720j0, continuationImpl);
            }
        } else {
            c32699y = new C32699Y(c32720j0, continuationImpl);
        }
        Object string = c32699y.f66860d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32699y.f66862f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            if (Intrinsics.areEqual(c29570k2.f59589d, ValidationIdentifierType.EMAIL.getType())) {
                c32699y.f66857a = c29570k2;
                c32699y.f66862f = 1;
                string = c32720j0.getString("sns_confirmation_code_email_title", c32699y);
            } else {
                c32699y.f66857a = c29570k2;
                c32699y.f66862f = 2;
                string = c32720j0.getString("sns_confirmation_code_phone_title", c32699y);
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29570k2 = c32699y.f66857a;
            ResultKt.throwOnFailure(string);
            str = (String) string;
        } else {
            if (i12 != 2) {
                if (i12 == 3) {
                    String str6 = c32699y.f66859c;
                    str2 = c32699y.f66858b;
                    c29570k1 = c32699y.f66857a;
                    ResultKt.throwOnFailure(string);
                    str3 = str6;
                    strReplace$default = StringsKt.replace$default(String.valueOf(string), "{email}", str3, false, 4, (Object) null);
                    String str7 = strReplace$default;
                    String str8 = str2;
                    String str9 = str3;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    l11 = c29570k1.f59594i;
                    if (l11 != null) {
                        jLongValue = l11.longValue();
                    } else {
                        jLongValue = 60;
                    }
                    long millis = timeUnit.toMillis(jLongValue) + jCurrentTimeMillis;
                    num = c29570k1.f59593h;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 6;
                    }
                    str4 = c29570k1.f59586a;
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    return new C32742x(str8, str7, Boxing.boxInt(iIntValue), str9, str5, millis);
                }
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str10 = c32699y.f66859c;
                str2 = c32699y.f66858b;
                c29570k1 = c32699y.f66857a;
                ResultKt.throwOnFailure(string);
                str3 = str10;
                strReplace$default = StringsKt.replace$default(String.valueOf(string), "{phone}", str3, false, 4, (Object) null);
                String str11 = strReplace$default;
                String str12 = str2;
                String str13 = str3;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                l11 = c29570k1.f59594i;
                if (l11 != null) {
                    jLongValue = l11.longValue();
                } else {
                    jLongValue = 60;
                }
                long millis2 = timeUnit2.toMillis(jLongValue) + jCurrentTimeMillis2;
                num = c29570k1.f59593h;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 6;
                }
                str4 = c29570k1.f59586a;
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                return new C32742x(str12, str11, Boxing.boxInt(iIntValue), str13, str5, millis2);
            }
            c29570k2 = c32699y.f66857a;
            ResultKt.throwOnFailure(string);
            str = (String) string;
        }
        String str14 = str;
        C29570k0 c29570k3 = c29570k2;
        str2 = str14;
        String str15 = c29570k3.f59588c;
        if (str15 == null) {
            str15 = "";
        }
        if (Intrinsics.areEqual(c29570k3.f59589d, ValidationIdentifierType.EMAIL.getType())) {
            c32699y.f66857a = c29570k3;
            c32699y.f66858b = str2;
            c32699y.f66859c = str15;
            c32699y.f66862f = 3;
            Object string2 = c32720j0.getString("sns_confirmation_code_email_subtitle", c32699y);
            if (string2 != coroutine_suspended) {
                c29570k1 = c29570k3;
                str3 = str15;
                string = string2;
                strReplace$default = StringsKt.replace$default(String.valueOf(string), "{email}", str3, false, 4, (Object) null);
                String str16 = strReplace$default;
                String str17 = str2;
                String str18 = str3;
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                l11 = c29570k1.f59594i;
                if (l11 != null) {
                    jLongValue = l11.longValue();
                } else {
                    jLongValue = 60;
                }
                long millis3 = timeUnit3.toMillis(jLongValue) + jCurrentTimeMillis3;
                num = c29570k1.f59593h;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 6;
                }
                str4 = c29570k1.f59586a;
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                return new C32742x(str17, str16, Boxing.boxInt(iIntValue), str18, str5, millis3);
            }
        } else {
            c32699y.f66857a = c29570k3;
            c32699y.f66858b = str2;
            c32699y.f66859c = str15;
            c32699y.f66862f = 4;
            Object string3 = c32720j0.getString("sns_confirmation_code_phone_subtitle", c32699y);
            if (string3 != coroutine_suspended) {
                c29570k1 = c29570k3;
                str3 = str15;
                string = string3;
                strReplace$default = StringsKt.replace$default(String.valueOf(string), "{phone}", str3, false, 4, (Object) null);
                String str19 = strReplace$default;
                String str110 = str2;
                String str111 = str3;
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                TimeUnit timeUnit4 = TimeUnit.SECONDS;
                l11 = c29570k1.f59594i;
                if (l11 != null) {
                    jLongValue = l11.longValue();
                } else {
                    jLongValue = 60;
                }
                long millis4 = timeUnit4.toMillis(jLongValue) + jCurrentTimeMillis4;
                num = c29570k1.f59593h;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 6;
                }
                str4 = c29570k1.f59586a;
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                return new C32742x(str110, str19, Boxing.boxInt(iIntValue), str111, str5, millis4);
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m71298a(C32720j0 c32720j0, boolean z11, Long l11, boolean z12, String str, ContinuationImpl continuationImpl) {
        C32702a0 c32702a0;
        int i11;
        String str2;
        SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action;
        if (continuationImpl instanceof C32702a0) {
            c32702a0 = (C32702a0) continuationImpl;
            int i12 = c32702a0.f66879e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c32702a0.f66879e = i12 - Integer.MIN_VALUE;
            } else {
                c32702a0 = new C32702a0(c32720j0, continuationImpl);
            }
        } else {
            c32702a0 = new C32702a0(c32720j0, continuationImpl);
        }
        Object string = c32702a0.f66877c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c32702a0.f66879e;
        if (i13 == 0) {
            ResultKt.throwOnFailure(string);
            int i14 = ((z11 && l11 == null) || z12) ? 0 : 1;
            if (l11 != null && !z12) {
                long jLongValue = l11.longValue();
                c32702a0.f66875a = z12;
                c32702a0.f66876b = i14;
                c32702a0.f66879e = 1;
                string = c32720j0.m71300a(jLongValue, c32702a0);
                if (string != coroutine_suspended) {
                    i11 = i14;
                    str2 = (String) string;
                }
            } else {
                c32702a0.f66875a = z12;
                c32702a0.f66876b = i14;
                c32702a0.f66879e = 2;
                string = c32720j0.getString(str, c32702a0);
                if (string != coroutine_suspended) {
                    i11 = i14;
                    str2 = (String) string;
                }
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            i11 = c32702a0.f66876b;
            z12 = c32702a0.f66875a;
            ResultKt.throwOnFailure(string);
            str2 = (String) string;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = c32702a0.f66876b;
            z12 = c32702a0.f66875a;
            ResultKt.throwOnFailure(string);
            str2 = (String) string;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (z12) {
            sNSVerificationStepViewModel$ViewState$ButtonSpec$Action = SNSVerificationStepViewModel$ViewState$ButtonSpec$Action.ENTER_OTP;
        } else {
            sNSVerificationStepViewModel$ViewState$ButtonSpec$Action = i11 == 0 ? SNSVerificationStepViewModel$ViewState$ButtonSpec$Action.RESEND_CODE : null;
        }
        return new C32743y(str2, sNSVerificationStepViewModel$ViewState$ButtonSpec$Action);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(1000, r0) == r1) goto L31;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71310b(C29570k0 c29570k0, ContinuationImpl continuationImpl) {
        C32712f0 c32712f0;
        C32720j0 c32720j0;
        if (continuationImpl instanceof C32712f0) {
            c32712f0 = (C32712f0) continuationImpl;
            int i11 = c32712f0.f66915d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32712f0.f66915d = i11 - Integer.MIN_VALUE;
            } else {
                c32712f0 = new C32712f0(this, continuationImpl);
            }
        } else {
            c32712f0 = new C32712f0(this, continuationImpl);
        }
        Object string = c32712f0.f66913b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32712f0.f66915d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "checkCodeResponse " + c29570k0, null, 4, null);
            String str = c29570k0.f59591f;
            if (Intrinsics.areEqual(str, Status.VERIFIED.getValue())) {
                String str2 = c29570k0.f59588c;
                if (str2 != null) {
                    this.f66937e.m71295c(str2);
                }
                C28936t c28936t = this.f66944l;
                KProperty[] kPropertyArr = f66932t;
                KProperty kProperty = kPropertyArr[2];
                c28936t.f58834a.set(c28936t.f58835b, null);
                C28936t c28936t2 = this.f66945m;
                KProperty kProperty2 = kPropertyArr[3];
                c28936t2.f58834a.set(c28936t2.f58835b, c29570k0);
                m71305a(SNSVerificationStepViewModel$Step.STATUS);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32714g0(this, null), 3, null);
            } else if (Intrinsics.areEqual(str, Status.REJECTED.getValue())) {
                C28936t c28936t3 = this.f66944l;
                KProperty[] kPropertyArr2 = f66932t;
                KProperty kProperty3 = kPropertyArr2[2];
                c28936t3.f58834a.set(c28936t3.f58835b, null);
                C28936t c28936t4 = this.f66945m;
                KProperty kProperty4 = kPropertyArr2[3];
                c28936t4.f58834a.set(c28936t4.f58835b, c29570k0);
                m71305a(SNSVerificationStepViewModel$Step.STATUS);
                fireEvent(C32736s.f66988a);
            } else {
                c32712f0.f66912a = this;
                c32712f0.f66915d = 1;
                string = getString("sns_confirmation_code_isNotValid", c32712f0);
                if (string != coroutine_suspended) {
                    c32720j0 = this;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i12 == 1) {
            c32720j0 = c32712f0.f66912a;
            ResultKt.throwOnFailure(string);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(string);
        }
        fireEvent(C32736s.f66988a);
        return Unit.INSTANCE;
        c32720j0.m71307a((CharSequence) string);
        c32712f0.f66912a = null;
        c32712f0.f66915d = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m71305a(SNSVerificationStepViewModel$Step sNSVerificationStepViewModel$Step) {
        C28936t c28936t = this.f66942j;
        KProperty kProperty = f66932t[0];
        c28936t.f58834a.set(c28936t.f58835b, sNSVerificationStepViewModel$Step);
    }

    /* JADX INFO: renamed from: a */
    public final void m71307a(CharSequence charSequence) {
        C28936t c28936t = this.f66943k;
        KProperty kProperty = f66932t[1];
        c28936t.f58834a.set(c28936t.f58835b, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r15 == r1) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71304a(CharSequence charSequence, ContinuationImpl continuationImpl) {
        C32687L c32687l;
        if (continuationImpl instanceof C32687L) {
            c32687l = (C32687L) continuationImpl;
            int i11 = c32687l.f66785d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32687l.f66785d = i11 - Integer.MIN_VALUE;
            } else {
                c32687l = new C32687L(this, continuationImpl);
            }
        } else {
            c32687l = new C32687L(this, continuationImpl);
        }
        Object objM70043a = c32687l.f66783b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32687l.f66785d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70043a);
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "buildInitState", null, 4, null);
            InterfaceC29984m interfaceC29984m = this.f66939g;
            c32687l.f66782a = charSequence;
            c32687l.f66785d = 1;
            objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c32687l);
            if (objM70043a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            charSequence = c32687l.f66782a;
            ResultKt.throwOnFailure(objM70043a);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70043a);
                return objM70043a;
            }
            ResultKt.throwOnFailure(objM70043a);
        }
        return (InterfaceC41634e) objM70043a;
        AbstractC29172p abstractC29172p = (AbstractC29172p) objM70043a;
        int i13 = AbstractC32681F.f66733a[this.f66933a.ordinal()];
        if (i13 == 1) {
            showProgress(false);
            c32687l.f66782a = null;
            c32687l.f66785d = 2;
            objM70043a = m71301a(abstractC29172p, charSequence, c32687l);
        } else if (i13 == 2) {
            c32687l.f66782a = null;
            c32687l.f66785d = 3;
            Object objM71309b = m71309b(abstractC29172p, charSequence, c32687l);
            if (objM71309b != coroutine_suspended) {
                return objM71309b;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m71301a(AbstractC29172p abstractC29172p, CharSequence charSequence, ContinuationImpl continuationImpl) {
        C32683H c32683h;
        String strMo69753c;
        Object next;
        int i11;
        Object string;
        Object string2;
        CharSequence charSequence2;
        Object string3;
        CharSequence charSequence3;
        int i12;
        String str;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Object string4;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        Object string5;
        CharSequence charSequence11 = charSequence;
        if (continuationImpl instanceof C32683H) {
            c32683h = (C32683H) continuationImpl;
            int i13 = c32683h.f66753h;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c32683h.f66753h = i13 - Integer.MIN_VALUE;
            } else {
                c32683h = new C32683H(this, continuationImpl);
            }
        } else {
            c32683h = new C32683H(this, continuationImpl);
        }
        Object obj = c32683h.f66751f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = c32683h.f66753h;
        CharSequence charSequence12 = null;
        if (i14 == 0) {
            ResultKt.throwOnFailure(obj);
            strMo69753c = abstractC29172p.mo69753c();
            Iterator it = abstractC29172p.mo69760k().f59151a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.startsWith$default(((C29154m) next).f59132a.f59014a, "EMAIL_VERIFICATION", false, 2, (Object) null));
            C29154m c29154m = (C29154m) next;
            if (strMo69753c == null || !(!StringsKt.isBlank(strMo69753c))) {
                i11 = 0;
            } else {
                if (c29154m != null ? Intrinsics.areEqual(c29154m.f59147p, Boxing.boxBoolean(true)) : false) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
            }
            if (i11 != 0) {
                c32683h.f66746a = charSequence11;
                c32683h.f66747b = strMo69753c;
                c32683h.f66750e = i11;
                c32683h.f66753h = 1;
                string2 = getString("sns_confirmation_contact_emailLocked_title", c32683h);
                if (string2 != coroutine_suspended) {
                    charSequence2 = (CharSequence) string2;
                    c32683h.f66746a = charSequence11;
                    c32683h.f66747b = strMo69753c;
                    c32683h.f66748c = charSequence2;
                    c32683h.f66750e = i11;
                    c32683h.f66753h = 2;
                    string3 = getString("sns_confirmation_contact_emailLocked_subtitle", c32683h);
                    if (string3 != coroutine_suspended) {
                        charSequence3 = charSequence11;
                        i12 = i11;
                        obj = string3;
                        str = strMo69753c;
                        charSequence4 = charSequence2;
                        charSequence5 = (CharSequence) obj;
                        c32683h.f66746a = charSequence3;
                        c32683h.f66747b = str;
                        c32683h.f66748c = charSequence4;
                        c32683h.f66749d = charSequence5;
                        c32683h.f66750e = i12;
                        c32683h.f66753h = 3;
                        string4 = getString("sns_confirmation_contact_emailLocked_footer", c32683h);
                        if (string4 != coroutine_suspended) {
                            charSequence6 = charSequence5;
                            obj = string4;
                            charSequence7 = charSequence3;
                            charSequence12 = (CharSequence) obj;
                            CharSequence charSequence13 = charSequence4;
                            charSequence8 = charSequence6;
                            charSequence9 = charSequence13;
                        }
                    }
                }
            } else {
                c32683h.f66746a = charSequence11;
                c32683h.f66747b = strMo69753c;
                c32683h.f66750e = i11;
                c32683h.f66753h = 4;
                string = getString("sns_confirmation_contact_email_title", c32683h);
                if (string != coroutine_suspended) {
                    charSequence10 = (CharSequence) string;
                    c32683h.f66746a = charSequence11;
                    c32683h.f66747b = strMo69753c;
                    c32683h.f66748c = charSequence10;
                    c32683h.f66750e = i11;
                    c32683h.f66753h = 5;
                    string5 = getString("sns_confirmation_contact_email_subtitle", c32683h);
                    if (string5 != coroutine_suspended) {
                        charSequence7 = charSequence11;
                        i12 = i11;
                        obj = string5;
                        charSequence9 = charSequence10;
                        str = strMo69753c;
                        charSequence8 = (CharSequence) obj;
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            int i15 = c32683h.f66750e;
            strMo69753c = c32683h.f66747b;
            CharSequence charSequence14 = c32683h.f66746a;
            ResultKt.throwOnFailure(obj);
            i11 = i15;
            charSequence11 = charSequence14;
            string2 = obj;
            charSequence2 = (CharSequence) string2;
            c32683h.f66746a = charSequence11;
            c32683h.f66747b = strMo69753c;
            c32683h.f66748c = charSequence2;
            c32683h.f66750e = i11;
            c32683h.f66753h = 2;
            string3 = getString("sns_confirmation_contact_emailLocked_subtitle", c32683h);
            if (string3 != coroutine_suspended) {
                charSequence3 = charSequence11;
                i12 = i11;
                obj = string3;
                str = strMo69753c;
                charSequence4 = charSequence2;
                charSequence5 = (CharSequence) obj;
                c32683h.f66746a = charSequence3;
                c32683h.f66747b = str;
                c32683h.f66748c = charSequence4;
                c32683h.f66749d = charSequence5;
                c32683h.f66750e = i12;
                c32683h.f66753h = 3;
                string4 = getString("sns_confirmation_contact_emailLocked_footer", c32683h);
                if (string4 != coroutine_suspended) {
                    charSequence6 = charSequence5;
                    obj = string4;
                    charSequence7 = charSequence3;
                }
            }
            return coroutine_suspended;
        }
        if (i14 == 2) {
            i12 = c32683h.f66750e;
            charSequence4 = c32683h.f66748c;
            str = c32683h.f66747b;
            charSequence3 = c32683h.f66746a;
            ResultKt.throwOnFailure(obj);
            charSequence5 = (CharSequence) obj;
            c32683h.f66746a = charSequence3;
            c32683h.f66747b = str;
            c32683h.f66748c = charSequence4;
            c32683h.f66749d = charSequence5;
            c32683h.f66750e = i12;
            c32683h.f66753h = 3;
            string4 = getString("sns_confirmation_contact_emailLocked_footer", c32683h);
            if (string4 != coroutine_suspended) {
                charSequence6 = charSequence5;
                obj = string4;
                charSequence7 = charSequence3;
            }
            return coroutine_suspended;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                int i16 = c32683h.f66750e;
                strMo69753c = c32683h.f66747b;
                CharSequence charSequence15 = c32683h.f66746a;
                ResultKt.throwOnFailure(obj);
                i11 = i16;
                charSequence11 = charSequence15;
                string = obj;
                charSequence10 = (CharSequence) string;
                c32683h.f66746a = charSequence11;
                c32683h.f66747b = strMo69753c;
                c32683h.f66748c = charSequence10;
                c32683h.f66750e = i11;
                c32683h.f66753h = 5;
                string5 = getString("sns_confirmation_contact_email_subtitle", c32683h);
                if (string5 != coroutine_suspended) {
                    charSequence7 = charSequence11;
                    i12 = i11;
                    obj = string5;
                    charSequence9 = charSequence10;
                }
                return coroutine_suspended;
            }
            if (i14 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = c32683h.f66750e;
            charSequence9 = c32683h.f66748c;
            strMo69753c = c32683h.f66747b;
            charSequence7 = c32683h.f66746a;
            ResultKt.throwOnFailure(obj);
            str = strMo69753c;
            charSequence8 = (CharSequence) obj;
        } else {
            i12 = c32683h.f66750e;
            charSequence6 = c32683h.f66749d;
            charSequence4 = c32683h.f66748c;
            str = c32683h.f66747b;
            charSequence7 = c32683h.f66746a;
            ResultKt.throwOnFailure(obj);
        }
        charSequence12 = (CharSequence) obj;
        CharSequence charSequence16 = charSequence4;
        charSequence8 = charSequence6;
        charSequence9 = charSequence16;
        return C41636g.m90930n0(this.f66948p, new C32682G(null, this, charSequence7, charSequence9, charSequence8, str, charSequence12, i12 != 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71303a(C32742x c32742x, ContinuationImpl continuationImpl) {
        C32698X c32698x;
        if (continuationImpl instanceof C32698X) {
            c32698x = (C32698X) continuationImpl;
            int i11 = c32698x.f66856d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32698x.f66856d = i11 - Integer.MIN_VALUE;
            } else {
                c32698x = new C32698X(this, continuationImpl);
            }
        } else {
            c32698x = new C32698X(this, continuationImpl);
        }
        Object string = c32698x.f66854b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32698x.f66856d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "buildVerifyCodeState " + c32742x, null, 4, null);
            if (c32742x == null) {
                return C41636g.m90889M(C32744z.f67003a);
            }
            c32698x.f66853a = c32742x;
            c32698x.f66856d = 1;
            string = getString("sns_confirmation_code_action_resend", c32698x);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32742x = c32698x.f66853a;
            ResultKt.throwOnFailure(string);
        }
        return new C32697W(this.f66937e.m71294b(c32742x.f66998d), (String) string, c32742x, this);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0131  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        if (r2 == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r2 == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
    
        if (r2 == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        if (r2 == r4) goto L52;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71302a(C29570k0 c29570k0, ContinuationImpl continuationImpl) {
        C32694T c32694t;
        String str;
        String str2;
        String imageName;
        Object string;
        String str3;
        if (continuationImpl instanceof C32694T) {
            c32694t = (C32694T) continuationImpl;
            int i11 = c32694t.f66839e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32694t.f66839e = i11 - Integer.MIN_VALUE;
            } else {
                c32694t = new C32694T(this, continuationImpl);
            }
        } else {
            c32694t = new C32694T(this, continuationImpl);
        }
        Object string2 = c32694t.f66837c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32694t.f66839e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string2);
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "buildStatusState " + c29570k0, null, 4, null);
            if (c29570k0 == null) {
                return C32744z.f67003a;
            }
            if (Intrinsics.areEqual(c29570k0.f59591f, Status.VERIFIED.getValue())) {
                if (this.f66933a == ValidationIdentifierType.EMAIL) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str4 = String.format("sns_confirmation_result_%s_success_title", Arrays.copyOf(new Object[]{"email"}, 1));
                    c32694t.f66839e = 1;
                    string2 = getString(str4, c32694t);
                } else {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str5 = String.format("sns_confirmation_result_%s_success_title", Arrays.copyOf(new Object[]{HintConstants.AUTOFILL_HINT_PHONE}, 1));
                    c32694t.f66839e = 2;
                    string2 = getString(str5, c32694t);
                }
            } else if (this.f66933a == ValidationIdentifierType.EMAIL) {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String str6 = String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{"email"}, 1));
                c32694t.f66839e = 3;
                string2 = getString(str6, c32694t);
            } else {
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                String str7 = String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{HintConstants.AUTOFILL_HINT_PHONE}, 1));
                c32694t.f66839e = 4;
                string2 = getString(str7, c32694t);
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(string2);
            str = (String) string2;
            return new C32676A(str, SNSIconHandler.SNSResultIcons.SUCCESS.getImageName(), null, false);
        }
        if (i12 == 2) {
            ResultKt.throwOnFailure(string2);
            str = (String) string2;
            return new C32676A(str, SNSIconHandler.SNSResultIcons.SUCCESS.getImageName(), null, false);
        }
        if (i12 == 3) {
            ResultKt.throwOnFailure(string2);
            str2 = (String) string2;
            imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
            c32694t.f66835a = str2;
            c32694t.f66836b = imageName;
            c32694t.f66839e = 5;
            string = getString("sns_confirmation_result_action_tryAgain", c32694t);
            if (string != coroutine_suspended) {
                str3 = str2;
                string2 = string;
            }
            return coroutine_suspended;
        }
        if (i12 == 4) {
            ResultKt.throwOnFailure(string2);
            str2 = (String) string2;
            imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
            c32694t.f66835a = str2;
            c32694t.f66836b = imageName;
            c32694t.f66839e = 5;
            string = getString("sns_confirmation_result_action_tryAgain", c32694t);
            if (string != coroutine_suspended) {
                str3 = str2;
                string2 = string;
            }
            return coroutine_suspended;
        }
        if (i12 != 5) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        imageName = c32694t.f66836b;
        str3 = c32694t.f66835a;
        ResultKt.throwOnFailure(string2);
        return new C32676A(str3, imageName, (CharSequence) string2, true);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m71299a(C32720j0 c32720j0, String str, C32742x c32742x, Long l11) {
        if (c32742x == null || str == null) {
            return false;
        }
        return (l11 != null && (l11.longValue() > 0L ? 1 : (l11.longValue() == 0L ? 0 : -1)) > 0) && Intrinsics.areEqual(c32742x.f66998d, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m71306a(SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action) {
        String str;
        String str2;
        String str3;
        int i11 = AbstractC32681F.f66735c[sNSVerificationStepViewModel$ViewState$ButtonSpec$Action.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                C28936t c28936t = this.f66944l;
                KProperty[] kPropertyArr = f66932t;
                KProperty kProperty = kPropertyArr[2];
                C32742x c32742x = (C32742x) c28936t.m69705a();
                if (c32742x != null) {
                    C28936t c28936t2 = this.f66944l;
                    KProperty kProperty2 = kPropertyArr[2];
                    c28936t2.f58834a.set(c28936t2.f58835b, c32742x);
                    this.f66937e.m71293a(c32742x.f66998d, c32742x.f67000f);
                    m71305a(SNSVerificationStepViewModel$Step.VERIFY_CODE);
                    return;
                }
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        ValidationIdentifierType validationIdentifierType = this.f66933a;
        int[] iArr = AbstractC32681F.f66733a;
        int i12 = iArr[validationIdentifierType.ordinal()];
        if (i12 == 1) {
            String str4 = (String) this.f66948p.getValue();
            if (str4 != null) {
                int i13 = iArr[this.f66933a.ordinal()];
                if (i13 == 1) {
                    str = "EMAIL_VERIFICATION";
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "PHONE_VERIFICATION";
                }
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32708d0(this, str, null, this, str4), 3, null);
                return;
            }
            return;
        }
        if (i12 == 2) {
            C32739u c32739u = (C32739u) this.f66950r.getValue();
            if (c32739u == null || (str2 = c32739u.f66990a) == null) {
                return;
            }
            int i14 = iArr[this.f66933a.ordinal()];
            if (i14 == 1) {
                str3 = "EMAIL_VERIFICATION";
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = "PHONE_VERIFICATION";
            }
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32708d0(this, str3, null, this, str2), 3, null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final void m71308a(String str, boolean z11) {
        C32739u c32739u;
        InterfaceC41669n interfaceC41669n = this.f66950r;
        if (str == null || StringsKt.isBlank(str)) {
            c32739u = null;
        } else {
            c32739u = new C32739u("+" + str, z11);
        }
        interfaceC41669n.setValue(c32739u);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71300a(long j11, ContinuationImpl continuationImpl) {
        C32706c0 c32706c0;
        String strM71282a;
        if (continuationImpl instanceof C32706c0) {
            c32706c0 = (C32706c0) continuationImpl;
            int i11 = c32706c0.f66896d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32706c0.f66896d = i11 - Integer.MIN_VALUE;
            } else {
                c32706c0 = new C32706c0(this, continuationImpl);
            }
        } else {
            c32706c0 = new C32706c0(this, continuationImpl);
        }
        Object string = c32706c0.f66894b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32706c0.f66896d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            strM71282a = AbstractC32660k.m71282a(j11);
            c32706c0.f66893a = strM71282a;
            c32706c0.f66896d = 1;
            string = getString("sns_confirmation_code_resendCountdown", c32706c0);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strM71282a = c32706c0.f66893a;
            ResultKt.throwOnFailure(string);
        }
        String str = strM71282a;
        String str2 = (String) string;
        if (str2 != null) {
            return StringsKt.replace$default(str2, "{time}", str, false, 4, (Object) null);
        }
        return null;
    }
}
