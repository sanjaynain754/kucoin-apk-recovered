package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28387C0;
import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.core.common.AbstractC28420T0;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28432Z0;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28803j;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.core.presentation.form.model.C28859q;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C28994D3;
import com.sumsub.sns.internal.features.data.model.common.C28999F;
import com.sumsub.sns.internal.features.data.model.common.C29059U0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.C29693s3;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.C29192B;
import com.sumsub.sns.internal.features.data.model.common.remote.C29203D0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29276S;
import com.sumsub.sns.internal.features.data.model.common.remote.C29412m;
import com.sumsub.sns.internal.features.data.model.common.remote.C29683z0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29458B;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29482J;
import com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationStatus;
import com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.EKycFlowStatus;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30226m;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.domain.appdata.C30095b;
import com.sumsub.sns.internal.features.domain.ekyc.C30158a;
import com.sumsub.sns.internal.features.domain.ekyc.C30159b;
import com.sumsub.sns.internal.features.domain.ekyc.C30161d;
import com.sumsub.sns.internal.features.presentation.otp.C31374b;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32653g;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32660k;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31707h0 extends AbstractC31739h implements InterfaceC28804k {

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ KProperty[] f64357D = {AbstractC28639a.m69485a(C31707h0.class, "currentSourceId", "getCurrentSourceId()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31707h0.class, "currentConfirmationId", "getCurrentConfirmationId()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31707h0.class, "submitResponse", "getSubmitResponse()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/SubmitApplicantDataResponse;", 0), AbstractC28639a.m69485a(C31707h0.class, "oAuthPostRedirectParams", "getOAuthPostRedirectParams()Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/SNSEkycViewModel$OAuthPostRedirectParams;", 0), AbstractC28639a.m69485a(C31707h0.class, "country", "getCountry()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31707h0.class, "countrySelectAutoSubmitted", "getCountrySelectAutoSubmitted()Z", 0), AbstractC28639a.m69485a(C31707h0.class, "fieldValueCache", "getFieldValueCache()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: A */
    public final C31530S f64358A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC41669n f64359B;

    /* JADX INFO: renamed from: C */
    public final C28936t f64360C;

    /* JADX INFO: renamed from: g */
    public final boolean f64361g;

    /* JADX INFO: renamed from: h */
    public final C31729t f64362h;

    /* JADX INFO: renamed from: i */
    public final C29917M f64363i;

    /* JADX INFO: renamed from: j */
    public final C30158a f64364j;

    /* JADX INFO: renamed from: k */
    public final C30161d f64365k;

    /* JADX INFO: renamed from: l */
    public final C30159b f64366l;

    /* JADX INFO: renamed from: m */
    public final C28432Z0 f64367m;

    /* JADX INFO: renamed from: n */
    public AbstractC29172p f64368n;

    /* JADX INFO: renamed from: o */
    public boolean f64369o;

    /* JADX INFO: renamed from: p */
    public InterfaceC41775x1 f64370p;

    /* JADX INFO: renamed from: q */
    public InterfaceC41775x1 f64371q;

    /* JADX INFO: renamed from: r */
    public final AbstractC41710m1 f64372r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC41709m0 f64373s;

    /* JADX INFO: renamed from: t */
    public C30095b f64374t;

    /* JADX INFO: renamed from: u */
    public final C28936t f64375u;

    /* JADX INFO: renamed from: v */
    public final C28936t f64376v;

    /* JADX INFO: renamed from: w */
    public final C28936t f64377w;

    /* JADX INFO: renamed from: x */
    public final C28936t f64378x;

    /* JADX INFO: renamed from: y */
    public final C28936t f64379y;

    /* JADX INFO: renamed from: z */
    public final C28936t f64380z;

    public C31707h0(Document document, boolean z11, C31729t c31729t, C29917M c29917m, C30158a c30158a, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C30156e c30156e, C30161d c30161d, C30159b c30159b) {
        super(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c30156e);
        this.f64361g = z11;
        this.f64362h = c31729t;
        this.f64363i = c29917m;
        this.f64364j = c30158a;
        this.f64365k = c30161d;
        this.f64366l = c30159b;
        this.f64367m = new C28432Z0();
        AbstractC41710m1 abstractC41710m1M91179c = C41718o1.m91179c(Executors.newSingleThreadExecutor());
        this.f64372r = abstractC41710m1M91179c;
        this.f64373s = C41713n0.m91125a(abstractC41710m1M91179c);
        this.f64375u = new C28936t(savedStateHandle, "currentSourceId", null, false);
        this.f64376v = new C28936t(savedStateHandle, "currentConfirmationId", null, false);
        this.f64377w = new C28936t(savedStateHandle, "submitResponse", null, false);
        this.f64378x = new C28936t(savedStateHandle, "oAuthPostRedirect", null, false);
        this.f64379y = new C28936t(savedStateHandle, "KEY_COUNTRY", null, false);
        this.f64380z = new C28936t(savedStateHandle, "KEY_COUNTRY_SELECT_AUTO_SUBMITTED", Boolean.FALSE, false);
        this.f64358A = new C31530S(this);
        this.f64359B = C41679x.m91009a(new C28799f(0, CollectionsKt.emptyList(), null, new C28803j()));
        this.f64360C = new C28936t(savedStateHandle, "KEY_FIELD_CACHE", MapsKt.emptyMap(), false);
        AbstractC28421U.m69306b(getViewState(), ViewModelKt.getViewModelScope(this), new C31719o(this, null));
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69616a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m70817b(C29456A0 c29456a0) {
        Boolean bool;
        String str;
        if (c29456a0 == null) {
            return;
        }
        C28936t c28936t = this.f64377w;
        KProperty[] kPropertyArr = f64357D;
        KProperty kProperty = kPropertyArr[2];
        c28936t.f58834a.set(c28936t.f58835b, c29456a0);
        EKycFlowStatus eKycFlowStatus = c29456a0.f59442a;
        if (eKycFlowStatus != EKycFlowStatus.CONFIRMATION_REQUIRED) {
            m70813a(eKycFlowStatus);
            return;
        }
        String str2 = c29456a0.f59444c;
        C28936t c28936t2 = this.f64376v;
        KProperty kProperty2 = kPropertyArr[1];
        c28936t2.f58834a.set(c28936t2.f58835b, str2);
        ConfirmationType confirmationType = c29456a0.f59443b;
        int i11 = confirmationType == null ? -1 : AbstractC31515C.f63940a[confirmationType.ordinal()];
        if (i11 == 1) {
            AbstractC28073M0.updateState$default(this, false, new C31534W(this, c29456a0, null), 1, null);
            InterfaceC41775x1 interfaceC41775x1 = this.f64370p;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            this.f64370p = C41696j.m91104d(this.f64373s, null, null, new C31545d0(this, null), 3, null);
            return;
        }
        if (i11 == 2) {
            C29482J c29482j = c29456a0.f59447f;
            String str3 = c29482j != null ? c29482j.f59490b : null;
            String str4 = c29482j != null ? c29482j.f59489a : null;
            boolean zM71434a = (c29482j == null || (bool = c29482j.f59491c) == null) ? C33048a.f67458U.m71434a() : bool.booleanValue();
            if (str4 == null || str4.length() == 0 || str3 == null || str3.length() == 0) {
                AbstractC31739h.m70853a(this, new Exception("url or redirect url is empty"));
                return;
            }
            AbstractC28073M0.updateState$default(this, false, new C31536Y(str4, str3, zM71434a, this, null), 1, null);
            if (zM71434a) {
                AbstractC29172p abstractC29172p = this.f64368n;
                C31727s c31727s = new C31727s(abstractC29172p != null ? abstractC29172p.mo69754e() : null, c29456a0.f59444c);
                C28936t c28936t3 = this.f64378x;
                KProperty kProperty3 = kPropertyArr[3];
                c28936t3.f58834a.set(c28936t3.f58835b, c31727s);
                onLinkClicked(str4, false);
                return;
            }
            return;
        }
        if (i11 != 3) {
            m70813a(c29456a0.f59442a);
            return;
        }
        if (!AbstractC28409N0.m69294a("com.sumsub.sns.eid.BuildConfig")) {
            AbstractC28052C.throwError$default(this, new Exception("Eid not available"), "E_KYC", null, 4, null);
            return;
        }
        C29458B c29458b = c29456a0.f59448g;
        if (c29458b == null || (str = c29458b.f59455a) == null) {
            throw new IllegalStateException("No mobile token");
        }
        String str5 = c29458b.f59457c;
        if (str5 == null) {
            throw new IllegalStateException("No certificate");
        }
        String str6 = c29458b.f59456b;
        if (str6 == null) {
            throw new IllegalStateException("No url");
        }
        String str7 = c29456a0.f59444c;
        if (str7 == null) {
            C28936t c28936t4 = this.f64376v;
            KProperty kProperty4 = kPropertyArr[1];
            str7 = (String) c28936t4.m69705a();
        }
        showProgress(false);
        fireEvent(new C31721p(str, str6, str5, str7));
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: c */
    public final void mo70746c(boolean z11) {
        if (z11) {
            return;
        }
        AbstractC28073M0.updateState$default(this, false, new C31535X(null), 1, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w mo69624d() {
        return this.f64359B;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m70821e(ContinuationImpl continuationImpl) {
        C31547e0 c31547e0;
        String str;
        List list;
        String strMo69754e;
        String str2;
        C31707h0 c31707h0;
        String description;
        CharSequence charSequence;
        Object string;
        CharSequence charSequence2;
        C31707h0 c31707h1;
        if (continuationImpl instanceof C31547e0) {
            c31547e0 = (C31547e0) continuationImpl;
            int i11 = c31547e0.f64059e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31547e0.f64059e = i11 - Integer.MIN_VALUE;
            } else {
                c31547e0 = new C31547e0(this, continuationImpl);
            }
        } else {
            c31547e0 = new C31547e0(this, continuationImpl);
        }
        Object objM69974a = c31547e0.f64057c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31547e0.f64059e;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69974a);
                C33272c c33272c = C33272c.f67812a;
                Logger.DefaultImpls.v$default(c33272c, "EKyc", "onSubmit", null, 4, null);
                C28936t c28936t = this.f64376v;
                KProperty kProperty = f64357D[1];
                c28936t.f58834a.set(c28936t.f58835b, null);
                String strM70823f = m70823f();
                if (strM70823f == null) {
                    return Unit.INSTANCE;
                }
                List listM70822e = m70822e();
                List listM71276a = AbstractC32653g.m71276a(listM70822e, getStrings(), this.f64367m, this.f64374t, false, null, m70825h(), SetsKt.emptySet());
                if (listM71276a != null) {
                    Logger.DefaultImpls.v$default(c33272c, "EKyc", "onSubmit: " + listM71276a.size() + " field errors encountered", null, 4, null);
                    m70811a(strM70823f, listM71276a);
                    return Unit.INSTANCE;
                }
                c31547e0.f64055a = strM70823f;
                c31547e0.f64056b = listM70822e;
                c31547e0.f64059e = 1;
                Object objM70819d = m70819d(c31547e0);
                if (objM70819d != coroutine_suspended) {
                    str = strM70823f;
                    objM69974a = objM70819d;
                    list = listM70822e;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        c31707h0 = (C31707h0) c31547e0.f64055a;
                        ResultKt.throwOnFailure(objM69974a);
                        charSequence = (CharSequence) objM69974a;
                        c31547e0.f64055a = c31707h0;
                        c31547e0.f64056b = charSequence;
                        c31547e0.f64059e = 4;
                        string = getString("sns_alert_action_dismiss", c31547e0);
                        if (string != coroutine_suspended) {
                            charSequence2 = charSequence;
                            objM69974a = string;
                            c31707h1 = c31707h0;
                        }
                        return coroutine_suspended;
                    }
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charSequence2 = (CharSequence) c31547e0.f64056b;
                    c31707h1 = (C31707h0) c31547e0.f64055a;
                    ResultKt.throwOnFailure(objM69974a);
                    c31707h1.fireEvent(new C31723q(charSequence2, (CharSequence) objM69974a));
                    return Unit.INSTANCE;
                }
                str2 = (String) c31547e0.f64055a;
                try {
                    ResultKt.throwOnFailure(objM69974a);
                    C29456A0 c29456a0 = (C29456A0) objM69974a;
                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Submit response: " + c29456a0, null, 4, null);
                    m70817b(c29456a0);
                } catch (SNSException.Api e11) {
                    e = e11;
                    str = str2;
                    m70811a(str, CollectionsKt.emptyList());
                    c31547e0.f64055a = this;
                    c31547e0.f64056b = null;
                    c31547e0.f64059e = 3;
                    if (e.getErrorCode() != null || (description = e.getDescription()) == null || StringsKt.isBlank(description)) {
                        objM69974a = getString("sns_ekyc_error_common", c31547e0);
                    } else {
                        objM69974a = e.getDescription();
                    }
                    if (objM69974a != coroutine_suspended) {
                        c31707h0 = this;
                        charSequence = (CharSequence) objM69974a;
                        c31547e0.f64055a = c31707h0;
                        c31547e0.f64056b = charSequence;
                        c31547e0.f64059e = 4;
                        string = getString("sns_alert_action_dismiss", c31547e0);
                        if (string != coroutine_suspended) {
                            charSequence2 = charSequence;
                            objM69974a = string;
                            c31707h1 = c31707h0;
                            c31707h1.fireEvent(new C31723q(charSequence2, (CharSequence) objM69974a));
                        }
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            list = (List) c31547e0.f64056b;
            str = (String) c31547e0.f64055a;
            ResultKt.throwOnFailure(objM69974a);
            AbstractC29172p abstractC29172p = (AbstractC29172p) objM69974a;
            if (abstractC29172p == null || (strMo69754e = abstractC29172p.mo69754e()) == null) {
                return Unit.INSTANCE;
            }
            try {
                C29192B c29192bM70807a = m70807a(list);
                C29917M c29917m = this.f64363i;
                String str3 = this.f64476a.getType().f59014a;
                c31547e0.f64055a = str;
                c31547e0.f64056b = null;
                c31547e0.f64059e = 2;
                objM69974a = ((C29914J) c29917m.f60057a).f60051a.m69974a(strMo69754e, str3, c29192bM70807a, c31547e0);
                if (objM69974a != coroutine_suspended) {
                    str2 = str;
                    C29456A0 c29456a1 = (C29456A0) objM69974a;
                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Submit response: " + c29456a1, null, 4, null);
                    m70817b(c29456a1);
                    return Unit.INSTANCE;
                }
            } catch (SNSException.Api e12) {
                e = e12;
                m70811a(str, CollectionsKt.emptyList());
                c31547e0.f64055a = this;
                c31547e0.f64056b = null;
                c31547e0.f64059e = 3;
                if (e.getErrorCode() != null) {
                    objM69974a = getString("sns_ekyc_error_common", c31547e0);
                } else {
                    objM69974a = getString("sns_ekyc_error_common", c31547e0);
                }
                if (objM69974a != coroutine_suspended) {
                    c31707h0 = this;
                    charSequence = (CharSequence) objM69974a;
                    c31547e0.f64055a = c31707h0;
                    c31547e0.f64056b = charSequence;
                    c31547e0.f64059e = 4;
                    string = getString("sns_alert_action_dismiss", c31547e0);
                    if (string != coroutine_suspended) {
                        charSequence2 = charSequence;
                        objM69974a = string;
                        c31707h1 = c31707h0;
                        c31707h1.fireEvent(new C31723q(charSequence2, (CharSequence) objM69974a));
                        return Unit.INSTANCE;
                    }
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            AbstractC31739h.m70853a(this, th2);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69617a(AbstractC28841e0 abstractC28841e0) {
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m70818c(ContinuationImpl continuationImpl) {
        C31525M c31525m;
        CharSequence charSequence;
        String str;
        Object string;
        String str2;
        CharSequence charSequence2;
        if (continuationImpl instanceof C31525M) {
            c31525m = (C31525M) continuationImpl;
            int i11 = c31525m.f63988e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31525m.f63988e = i11 - Integer.MIN_VALUE;
            } else {
                c31525m = new C31525M(this, continuationImpl);
            }
        } else {
            c31525m = new C31525M(this, continuationImpl);
        }
        Object objM70808a = c31525m.f63986c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31525m.f63988e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70808a);
            c31525m.f63988e = 1;
            objM70808a = m70808a(60L, c31525m);
            if (objM70808a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM70808a);
        } else {
            if (i12 == 2) {
                charSequence = c31525m.f63984a;
                ResultKt.throwOnFailure(objM70808a);
                str = (String) objM70808a;
                c31525m.f63984a = charSequence;
                c31525m.f63985b = str;
                c31525m.f63988e = 3;
                string = getString("sns_confirmation_code_ekyc_subtitle", c31525m);
                if (string != coroutine_suspended) {
                    str2 = str;
                    objM70808a = string;
                    charSequence2 = charSequence;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c31525m.f63985b;
            CharSequence charSequence3 = c31525m.f63984a;
            ResultKt.throwOnFailure(objM70808a);
            charSequence2 = charSequence3;
        }
        return new C31736z(str2, (String) objM70808a, charSequence2, null, 60L, null);
        CharSequence charSequence4 = (CharSequence) objM70808a;
        c31525m.f63984a = charSequence4;
        c31525m.f63988e = 2;
        Object string2 = getString("sns_confirmation_code_ekyc_title", c31525m);
        if (string2 != coroutine_suspended) {
            charSequence = charSequence4;
            objM70808a = string2;
            str = (String) objM70808a;
            c31525m.f63984a = charSequence;
            c31525m.f63985b = str;
            c31525m.f63988e = 3;
            string = getString("sns_confirmation_code_ekyc_subtitle", c31525m);
            if (string != coroutine_suspended) {
                str2 = str;
                objM70808a = string;
                charSequence2 = charSequence;
                return new C31736z(str2, (String) objM70808a, charSequence2, null, 60L, null);
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m70819d(ContinuationImpl continuationImpl) {
        C31526N c31526n;
        if (continuationImpl instanceof C31526N) {
            c31526n = (C31526N) continuationImpl;
            int i11 = c31526n.f63991c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31526n.f63991c = i11 - Integer.MIN_VALUE;
            } else {
                c31526n = new C31526N(this, continuationImpl);
            }
        } else {
            c31526n = new C31526N(this, continuationImpl);
        }
        Object objM70042a = c31526n.f63989a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31526n.f63991c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            AbstractC29172p abstractC29172p = this.f64368n;
            if (abstractC29172p != null) {
                return abstractC29172p;
            }
            InterfaceC29984m interfaceC29984m = this.f64478c;
            c31526n.f63991c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31526n);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        return (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
    }

    /* JADX INFO: renamed from: f */
    public final String m70823f() {
        C28936t c28936t = this.f64379y;
        KProperty kProperty = f64357D[4];
        return (String) c28936t.m69705a();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final /* bridge */ /* synthetic */ InterfaceC28147s getDefaultState() {
        return C31733w.f64457a;
    }

    /* JADX INFO: renamed from: h */
    public final Map m70825h() {
        C28936t c28936t = this.f64360C;
        KProperty kProperty = f64357D[6];
        return (Map) c28936t.m69705a();
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69618a(AbstractC28841e0 abstractC28841e0, String str) {
    }

    /* JADX INFO: renamed from: g */
    public final C28999F m70824g() {
        Map map;
        List list;
        C29124h c29124h;
        String strM70823f = m70823f();
        Object obj = null;
        if (strM70823f == null) {
            return null;
        }
        C30159b c30159b = this.f64366l;
        C30095b c30095b = this.f64374t;
        if (c30095b != null && (c29124h = c30095b.f60491b) != null) {
            map = c29124h.f59078k;
        } else {
            map = null;
        }
        String str = this.f64476a.getType().f59014a;
        c30159b.getClass();
        Map mapM70123a = C30159b.m70123a(str, map);
        if (mapM70123a != null) {
            list = (List) mapM70123a.get(strM70823f);
        } else {
            list = null;
        }
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            String str2 = ((C28999F) obj2).f58940a;
            C28936t c28936t = this.f64375u;
            KProperty kProperty = f64357D[0];
            if (Intrinsics.areEqual(str2, (String) c28936t.m69705a())) {
                obj = obj2;
                break;
            }
        }
        return (C28999F) obj;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C41713n0.m91129e(this.f64373s, null, 1, null);
        try {
            this.f64372r.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        onLoad();
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69619a(AbstractC28841e0 abstractC28841e0, List list) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69620a(C28850j c28850j) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final boolean mo69621a(String str) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m70812a(C29456A0 c29456a0) {
        if (c29456a0 == null) {
            return;
        }
        EKycFlowStatus eKycFlowStatus = c29456a0.f59442a;
        EKycFlowStatus eKycFlowStatus2 = EKycFlowStatus.CONFIRMATION_REQUIRED;
        if (eKycFlowStatus == eKycFlowStatus2) {
            ConfirmationType confirmationType = c29456a0.f59443b;
            int i11 = confirmationType == null ? -1 : AbstractC31515C.f63940a[confirmationType.ordinal()];
            if (i11 == 1) {
                if (c29456a0.f59445d == ConfirmationStatus.RETRY) {
                    AbstractC28073M0.updateState$default(this, false, new C31529Q(this, c29456a0, null), 1, null);
                    return;
                }
                AbstractC28073M0.updateState$default(this, false, new C31534W(this, c29456a0, null), 1, null);
                InterfaceC41775x1 interfaceC41775x1 = this.f64370p;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                this.f64370p = C41696j.m91104d(this.f64373s, null, null, new C31545d0(this, null), 3, null);
                return;
            }
            if (i11 != 2 && i11 != 3) {
                m70813a(c29456a0.f59442a);
                return;
            }
            EKycFlowStatus eKycFlowStatus3 = c29456a0.f59442a;
            if (eKycFlowStatus3 == eKycFlowStatus2 && c29456a0.f59445d == ConfirmationStatus.RETRY) {
                C28936t c28936t = this.f64378x;
                KProperty kProperty = f64357D[3];
                if (((C31727s) c28936t.m69705a()) != null) {
                    Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "Continue polling for oAuth post redirect", null, 4, null);
                    return;
                } else {
                    showProgress(false);
                    AbstractC28073M0.updateState$default(this, false, new C31528P(this, null), 1, null);
                    return;
                }
            }
            m70813a(eKycFlowStatus3);
            return;
        }
        m70813a(eKycFlowStatus);
    }

    /* JADX INFO: renamed from: d */
    public final void m70820d(boolean z11) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "Pause oAuthPolling, abort=" + z11, null, 4, null);
        if (z11) {
            C28936t c28936t = this.f64378x;
            KProperty kProperty = f64357D[3];
            c28936t.f58834a.set(c28936t.f58835b, null);
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f64371q;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    public final Object mo70740a(AbstractC29172p abstractC29172p, C29124h c29124h, Continuation continuation) {
        boolean z11;
        Object objM103844constructorimpl;
        Map mapEmptyMap;
        String strM70823f;
        C29124h c29124h2;
        C29124h c29124h3;
        Map map;
        if (c29124h != null && (map = c29124h.f59076i) != null) {
            this.f64367m.m69316a(map);
        }
        C28994D3 c28994d3 = abstractC29172p.mo69761l().f59119c;
        boolean z12 = false;
        if (c28994d3 != null ? Intrinsics.areEqual(c28994d3.f58921a, Boxing.boxBoolean(true)) : false) {
            C29154m c29154mM69794a = abstractC29172p.m69794a(this.f64476a.getType());
            if (!(c29154mM69794a != null ? Intrinsics.areEqual(c29154mM69794a.f59143l, Boxing.boxBoolean(true)) : false) || this.f64361g) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        this.f64369o = z11;
        C30158a c30158a = this.f64364j;
        Map map2 = this.f64481f;
        c30158a.getClass();
        if (c29124h == null) {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new IllegalStateException("E-KYC init failed: no AppConfig")));
        } else {
            Map map3 = c29124h.f59078k;
            if (map3 == null) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new IllegalStateException("E-KYC init failed: no eKycConfig")));
            } else if (map2 != null) {
                if (map2.isEmpty()) {
                    map2 = null;
                }
                if (map2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map3.entrySet()) {
                        Pair pairM70122a = C30158a.m70122a(map2, (String) entry.getKey(), (List) entry.getValue());
                        if (pairM70122a != null) {
                            arrayList.add(pairM70122a);
                        }
                    }
                    Map map4 = MapsKt.toMap(arrayList);
                    if (map4.isEmpty()) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new IllegalStateException("E-KYC init failed: no sources configured")));
                    } else {
                        objM103844constructorimpl = Result.m103844constructorimpl(map4);
                    }
                } else {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new IllegalStateException("E-KYC init failed: no countries")));
                }
            } else {
                Result.Companion companion5 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new IllegalStateException("E-KYC init failed: no countries")));
            }
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
            Map map5 = (Map) objM103844constructorimpl;
            this.f64368n = abstractC29172p;
            if (c29124h == null || (mapEmptyMap = AbstractC29130i.m69781g(c29124h)) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            C30095b c30095b = new C30095b(abstractC29172p, c29124h, mapEmptyMap, map5, 48);
            this.f64374t = c30095b;
            C30159b c30159b = this.f64366l;
            C29124h c29124h4 = c30095b.f60491b;
            Map map6 = c29124h4 != null ? c29124h4.f59078k : null;
            String str = this.f64476a.getType().f59014a;
            c30159b.getClass();
            Map mapM70123a = C30159b.m70123a(str, map6);
            if (mapM70123a != null && mapM70123a.size() == 1) {
                String str2 = (String) CollectionsKt.firstOrNull(mapM70123a.keySet());
                C28936t c28936t = this.f64379y;
                KProperty kProperty = f64357D[4];
                c28936t.f58834a.set(c28936t.f58835b, str2);
            }
            C28936t c28936t2 = this.f64378x;
            KProperty[] kPropertyArr = f64357D;
            KProperty kProperty2 = kPropertyArr[3];
            if (((C31727s) c28936t2.m69705a()) != null) {
                AbstractC28073M0.updateState$default(this, false, new C31536Y(null, null, true, this, null), 1, null);
            } else {
                C28936t c28936t3 = this.f64380z;
                KProperty kProperty3 = kPropertyArr[5];
                if (!((Boolean) c28936t3.m69705a()).booleanValue()) {
                    C30095b c30095b2 = this.f64374t;
                    if (((c30095b2 == null || (c29124h3 = c30095b2.f60491b) == null) ? false : Intrinsics.areEqual(c29124h3.f59079l, Boolean.TRUE)) && (strM70823f = m70823f()) != null) {
                        if (this.f64362h == null) {
                            C30159b c30159b2 = this.f64366l;
                            C30095b c30095b3 = this.f64374t;
                            Map map7 = (c30095b3 == null || (c29124h2 = c30095b3.f60491b) == null) ? null : c29124h2.f59078k;
                            String str3 = this.f64476a.getType().f59014a;
                            c30159b2.getClass();
                            Map mapM70123a2 = C30159b.m70123a(str3, map7);
                            List list = mapM70123a2 != null ? (List) mapM70123a2.get(strM70823f) : null;
                            if ((list != null ? list.size() : 0) > 1) {
                                z12 = true;
                            }
                        }
                        z12 = !z12;
                    }
                }
                if (z12) {
                    Object objM70809a = m70809a((ContinuationImpl) continuation);
                    return objM70809a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70809a : Unit.INSTANCE;
                }
                m70811a(m70823f(), CollectionsKt.emptyList());
            }
            return Unit.INSTANCE;
        }
        AbstractC28052C.throwError$default(this, thM103847exceptionOrNullimpl, this.f64476a.getType().f59014a, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final List m70822e() {
        List listEmptyList;
        C28999F c28999fM70824g = m70824g();
        if (c28999fM70824g == null || (listEmptyList = c28999fM70824g.f58943d) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C29719y(C29059U0.f59007b, true, null, null, 508));
        arrayList.addAll(listEmptyList);
        return Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) arrayList));
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final InterfaceC28805l mo69622b() {
        return this.f64358A;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final void mo69623b(AbstractC28841e0 abstractC28841e0, String str) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "EKyc", "onFieldValueChanged: " + abstractC28841e0.m69653j() + " -> " + str, null, 4, null);
        Map mapM70825h = m70825h();
        String str2 = abstractC28841e0.mo69642c().f59466a;
        if (str2 == null) {
            str2 = "";
        }
        Map mapM69338a = AbstractC28458h.m69338a(mapM70825h, str2, str);
        C28936t c28936t = this.f64360C;
        KProperty kProperty = f64357D[6];
        c28936t.f58834a.set(c28936t.f58835b, mapM69338a);
        if (abstractC28841e0 instanceof C28859q) {
            m70811a(str, CollectionsKt.emptyList());
        } else if (Intrinsics.areEqual(abstractC28841e0.mo69642c().f59466a, "source_id")) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31705g0(this, str, CollectionsKt.emptyList(), null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m70816b(ContinuationImpl continuationImpl) {
        C31524L c31524l;
        String strM70823f;
        String str;
        String str2;
        C30095b c30095b;
        String str3;
        String str4;
        String str5;
        String str6;
        C30095b c30095b2;
        Object string;
        String str7;
        String str8;
        String str9;
        C30095b c30095b3;
        if (continuationImpl instanceof C31524L) {
            c31524l = (C31524L) continuationImpl;
            int i11 = c31524l.f63983g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31524l.f63983g = i11 - Integer.MIN_VALUE;
            } else {
                c31524l = new C31524L(this, continuationImpl);
            }
        } else {
            c31524l = new C31524L(this, continuationImpl);
        }
        Object string2 = c31524l.f63981e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31524l.f63983g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string2);
            strM70823f = m70823f();
            c31524l.f63977a = strM70823f;
            c31524l.f63983g = 1;
            string2 = getString("sns_ekyc_form_title", c31524l);
            if (string2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            strM70823f = c31524l.f63977a;
            ResultKt.throwOnFailure(string2);
        } else {
            if (i12 == 2) {
                String str10 = c31524l.f63978b;
                String str11 = c31524l.f63977a;
                ResultKt.throwOnFailure(string2);
                str = str10;
                strM70823f = str11;
                str2 = (String) string2;
                c30095b = this.f64374t;
                if (c30095b == null) {
                    c30095b = new C30095b(null, null, null, null, 63);
                }
                if (this.f64369o) {
                    c31524l.f63977a = strM70823f;
                    c31524l.f63978b = str;
                    c31524l.f63979c = str2;
                    c31524l.f63980d = c30095b;
                    c31524l.f63983g = 3;
                    string = getString("sns_ekyc_action_skip", c31524l);
                    if (string != coroutine_suspended) {
                        String str12 = strM70823f;
                        str7 = str2;
                        string2 = string;
                        str8 = str12;
                        str9 = str;
                        c30095b3 = c30095b;
                    }
                    return coroutine_suspended;
                }
                str3 = str2;
                str4 = null;
                str5 = strM70823f;
                str6 = str;
                c30095b2 = c30095b;
                return new C31732v(str6, str3, null, str4, c30095b2, str5, null, CollectionsKt.emptyList(), null);
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30095b3 = c31524l.f63980d;
            str7 = c31524l.f63979c;
            str9 = c31524l.f63978b;
            str8 = c31524l.f63977a;
            ResultKt.throwOnFailure(string2);
        }
        str4 = (String) string2;
        str5 = str8;
        c30095b2 = c30095b3;
        str3 = str7;
        str6 = str9;
        return new C31732v(str6, str3, null, str4, c30095b2, str5, null, CollectionsKt.emptyList(), null);
        String str13 = (String) string2;
        c31524l.f63977a = strM70823f;
        c31524l.f63978b = str13;
        c31524l.f63983g = 2;
        Object string3 = getString("sns_ekyc_form_subtitle", c31524l);
        if (string3 != coroutine_suspended) {
            str = str13;
            string2 = string3;
            str2 = (String) string2;
            c30095b = this.f64374t;
            if (c30095b == null) {
                c30095b = new C30095b(null, null, null, null, 63);
            }
            if (this.f64369o) {
                c31524l.f63977a = strM70823f;
                c31524l.f63978b = str;
                c31524l.f63979c = str2;
                c31524l.f63980d = c30095b;
                c31524l.f63983g = 3;
                string = getString("sns_ekyc_action_skip", c31524l);
                if (string != coroutine_suspended) {
                    String str14 = strM70823f;
                    str7 = str2;
                    string2 = string;
                    str8 = str14;
                    str9 = str;
                    c30095b3 = c30095b;
                    str4 = (String) string2;
                    str5 = str8;
                    c30095b2 = c30095b3;
                    str3 = str7;
                    str6 = str9;
                }
            } else {
                str3 = str2;
                str4 = null;
                str5 = strM70823f;
                str6 = str;
                c30095b2 = c30095b;
            }
            return new C31732v(str6, str3, null, str4, c30095b2, str5, null, CollectionsKt.emptyList(), null);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m70804a(C31707h0 c31707h0, String str, String str2, C29412m c29412m, ContinuationImpl continuationImpl) {
        C31520H c31520h;
        c31707h0.getClass();
        if (continuationImpl instanceof C31520H) {
            c31520h = (C31520H) continuationImpl;
            int i11 = c31520h.f63959c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31520h.f63959c = i11 - Integer.MIN_VALUE;
            } else {
                c31520h = new C31520H(c31707h0, continuationImpl);
            }
        } else {
            c31520h = new C31520H(c31707h0, continuationImpl);
        }
        Object objM69975a = c31520h.f63957a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31520h.f63959c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69975a);
                Logger.DefaultImpls.d$default(C33272c.f67812a, "EKyc", "confirmOAuthData ...", null, 4, null);
                C29917M c29917m = c31707h0.f64363i;
                c31520h.f63959c = 1;
                objM69975a = ((C29914J) c29917m.f60057a).f60051a.m69975a(str, str2, c29412m, c31520h);
                if (objM69975a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM69975a);
            }
            c31707h0.m70812a((C29456A0) objM69975a);
        } catch (Exception e11) {
            C33272c.f67814c.mo68956e("EKyc", "confirmOAuthData error", e11);
            c31707h0.m70820d(true);
            c31707h0.showProgress(false);
            AbstractC28073M0.updateState$default(c31707h0, false, new C31521I(c31707h0, e11, null), 1, null);
        } catch (Throwable th2) {
            AbstractC31739h.m70853a(c31707h0, th2);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    public final void mo70743a(C30270n c30270n) {
        C31729t c31729t = this.f64362h;
        if (c31729t != null) {
            String str = c31729t.f64441a;
            C28936t c28936t = this.f64379y;
            KProperty[] kPropertyArr = f64357D;
            KProperty kProperty = kPropertyArr[4];
            c28936t.f58834a.set(c28936t.f58835b, str);
            String str2 = this.f64362h.f64442b;
            C28936t c28936t2 = this.f64375u;
            KProperty kProperty2 = kPropertyArr[0];
            c28936t2.f58834a.set(c28936t2.f58835b, str2);
        }
        String strM70823f = m70823f();
        if (strM70823f == null) {
            C30226m c30226m = c30270n.f60859f;
            String str3 = c30226m.f60757b;
            strM70823f = (str3 == null && (str3 = c30226m.f60756a) == null) ? c30226m.f60758c : str3;
        }
        C28936t c28936t3 = this.f64379y;
        KProperty kProperty3 = f64357D[4];
        c28936t3.f58834a.set(c28936t3.f58835b, strM70823f);
        this.f64481f = c30270n.f60856c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70809a(ContinuationImpl continuationImpl) {
        C31516D c31516d;
        if (continuationImpl instanceof C31516D) {
            c31516d = (C31516D) continuationImpl;
            int i11 = c31516d.f63944c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31516d.f63944c = i11 - Integer.MIN_VALUE;
            } else {
                c31516d = new C31516D(this, continuationImpl);
            }
        } else {
            c31516d = new C31516D(this, continuationImpl);
        }
        Object obj = c31516d.f63942a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31516d.f63944c;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Logger.DefaultImpls.i$default(C33272c.f67812a, "EKyc", "Auto-submitting country select, country=" + m70823f(), null, 4, null);
            C28936t c28936t = this.f64380z;
            KProperty kProperty = f64357D[5];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            showProgress(true);
            InterfaceC41775x1 interfaceC41775x1M70811a = m70811a(m70823f(), CollectionsKt.emptyList());
            c31516d.f63944c = 1;
            if (interfaceC41775x1M70811a.mo90385E(c31516d) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List listM70822e = m70822e();
        if (listM70822e != null && listM70822e.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator it = listM70822e.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            C29719y c29719y = (C29719y) it.next();
            String str = (String) m70825h().get(c29719y.mo69727c());
            if (str == null) {
                str = "";
            }
            if (c29719y.f59782c && str.length() == 0) {
                break;
            }
        }
        if (m70824g() != null && !z11) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), AbstractC28387C0.f57876a, null, new C31517E(this, null), 2, null);
            return Unit.INSTANCE;
        }
        Logger.DefaultImpls.i$default(C33272c.f67812a, "EKyc", "Auto-submit cancelled: no source or empty required fields", null, 4, null);
        showProgress(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    /* JADX INFO: renamed from: a */
    public final InterfaceC41775x1 m70811a(String str, List list) {
        List list2;
        String str2;
        C28999F c28999f;
        C29124h c29124h;
        Logger.DefaultImpls.i$default(C33272c.f67812a, "EKyc", "Update country, oldCountry=" + m70823f() + ", newCountry=" + str + ", errors=" + list.size(), null, 4, null);
        boolean zAreEqual = Intrinsics.areEqual(m70823f(), str);
        C28936t c28936t = this.f64379y;
        KProperty[] kPropertyArr = f64357D;
        KProperty kProperty = kPropertyArr[4];
        c28936t.f58834a.set(c28936t.f58835b, str);
        if (str != null) {
            C30159b c30159b = this.f64366l;
            C30095b c30095b = this.f64374t;
            Map map = (c30095b == null || (c29124h = c30095b.f60491b) == null) ? null : c29124h.f59078k;
            String str3 = this.f64476a.getType().f59014a;
            c30159b.getClass();
            Map mapM70123a = C30159b.m70123a(str3, map);
            if (mapM70123a != null) {
                list2 = (List) mapM70123a.get(str);
            } else {
                list2 = null;
            }
        } else {
            list2 = null;
        }
        if (zAreEqual) {
            C28936t c28936t2 = this.f64375u;
            KProperty kProperty2 = kPropertyArr[0];
            String str4 = (String) c28936t2.m69705a();
            if (str4 != null && !StringsKt.isBlank(str4)) {
                C28936t c28936t3 = this.f64375u;
                KProperty kProperty3 = kPropertyArr[0];
                str2 = (String) c28936t3.m69705a();
            } else if (list2 != null || (c28999f = (C28999F) CollectionsKt.getOrNull(list2, 0)) == null) {
                str2 = null;
            } else {
                str2 = c28999f.f58940a;
            }
        } else if (list2 != null) {
            str2 = null;
        } else {
            str2 = null;
        }
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31705g0(this, str2, list, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final Function2 m70810a(final C29983l c29983l, final String str, final String str2) {
        return new Function2() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.i0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C31707h0.m70806a(str2, this, str, c29983l, (String) obj, (String) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static final String m70806a(String str, C31707h0 c31707h0, String str2, C29983l c29983l, String str3, String str4) {
        String str5;
        C29124h c29124h;
        Map map;
        Map map2;
        C29124h c29124h2;
        Map map3;
        C29693s3 c29693s3;
        Map map4;
        String strM69301a = AbstractC28420T0.m69301a(StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null));
        C30095b c30095b = c31707h0.f64374t;
        String str6 = (c30095b == null || (c29124h2 = c30095b.f60491b) == null || (map3 = c29124h2.f59082o) == null || (c29693s3 = (C29693s3) map3.get(strM69301a)) == null || (map4 = c29693s3.f59740b) == null) ? null : (String) map4.get(str4);
        C30095b c30095b2 = c31707h0.f64374t;
        if (c30095b2 == null || (c29124h = c30095b2.f60491b) == null || (map = c29124h.f59081n) == null || (map2 = (Map) map.get(str2)) == null || (str5 = (String) map2.get(str4)) == null || !Intrinsics.areEqual(str3, "field")) {
            str5 = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM69671a = AbstractC28892d.m69671a(new Object[]{str3, str4}, 2, "sns_data_%s_%s", c29983l);
        if (str6 != null) {
            if (!Intrinsics.areEqual(str3, "field")) {
                str6 = null;
            }
            if (str6 != null) {
                return str6;
            }
        }
        if (str5 == null || !Intrinsics.areEqual(str3, "field")) {
            str5 = null;
        }
        if (str5 != null) {
            return str5;
        }
        if (strM69671a != null) {
            return strM69671a;
        }
        if (str4 == null || !Intrinsics.areEqual(str3, "field")) {
            return null;
        }
        return str4;
    }

    /* JADX INFO: renamed from: a */
    public final C29192B m70807a(List list) {
        HashMap map;
        String strMo69715b;
        C28999F c28999fM70824g = m70824g();
        if (c28999fM70824g != null) {
            Function1 function1 = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C31707h0.m70805a(this.f64387b, (String) obj);
                }
            };
            HashMap map2 = new HashMap();
            String str = c28999fM70824g.f58941b;
            if (str != null) {
                map2.put("idDocType", str);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29719y c29719y = (C29719y) it.next();
                String str2 = c29719y.f59789j;
                if (str2 == null || !(!StringsKt.isBlank(str2))) {
                    map = map2;
                } else {
                    if (map2.get(c29719y.f59789j) == null) {
                        map2.put(c29719y.f59789j, new HashMap());
                    }
                    map = (HashMap) map2.get(c29719y.f59789j);
                }
                AbstractC29103d2 abstractC29103d2 = c29719y.f59781b;
                if (abstractC29103d2 == null || (strMo69715b = abstractC29103d2.mo69715b()) == null) {
                    strMo69715b = "";
                }
                map.put(strMo69715b, function1.invoke(c29719y.mo69727c()));
            }
            return new C29192B(map2);
        }
        throw new IllegalArgumentException("ApplicantDataSource is null");
    }

    /* JADX INFO: renamed from: a */
    public static final String m70805a(C31707h0 c31707h0, String str) {
        String string;
        String str2 = (String) c31707h0.m70825h().get(str);
        return (str2 == null || (string = StringsKt.trim((CharSequence) str2).toString()) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70815a(String str, Uri uri) {
        String strMo69754e;
        Logger.DefaultImpls.d$default(C33272c.f67812a, "EKyc", "onCallbackUrl: " + uri, null, 4, null);
        if (str == null || str.length() == 0 || !StringsKt.startsWith$default(uri.toString(), str, false, 2, (Object) null)) {
            return false;
        }
        showProgress(true);
        mo70746c(false);
        AbstractC29172p abstractC29172p = this.f64368n;
        if (abstractC29172p != null && (strMo69754e = abstractC29172p.mo69754e()) != null) {
            C28936t c28936t = this.f64376v;
            KProperty kProperty = f64357D[1];
            String str2 = (String) c28936t.m69705a();
            if (str2 == null) {
                return true;
            }
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31532U(this, strMo69754e, str2, new C29412m((C29203D0) null, new C29683z0(uri.toString()), (C29276S) null, 5), null), 3, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m70813a(EKycFlowStatus eKycFlowStatus) {
        m70820d(true);
        int i11 = eKycFlowStatus == null ? -1 : AbstractC31515C.f63941b[eKycFlowStatus.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (this.f64361g) {
                AbstractC28052C.finishWithResult$default(this, 0, null, 3, null);
                return;
            } else {
                AbstractC28052C.finish$default(this, new C28494t(), null, null, null, 14, null);
                return;
            }
        }
        if (i11 != 3) {
            AbstractC28052C.finish$default(this, new C28494t(false), null, null, null, 14, null);
        } else {
            AbstractC28052C.finish$default(this, new C28494t(false), null, null, null, 14, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70808a(long j11, ContinuationImpl continuationImpl) {
        C31527O c31527o;
        C31374b c31374b;
        String strM70061a;
        if (continuationImpl instanceof C31527O) {
            c31527o = (C31527O) continuationImpl;
            int i11 = c31527o.f63996e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31527o.f63996e = i11 - Integer.MIN_VALUE;
            } else {
                c31527o = new C31527O(this, continuationImpl);
            }
        } else {
            c31527o = new C31527O(this, continuationImpl);
        }
        Object obj = c31527o.f63994c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31527o.f63996e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C31374b c31374b2 = C31374b.f63574a;
            c31527o.f63993b = c31374b2;
            c31527o.f63992a = j11;
            c31527o.f63996e = 1;
            Object strings = getStrings(c31527o);
            if (strings == coroutine_suspended) {
                return coroutine_suspended;
            }
            c31374b = c31374b2;
            obj = strings;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = c31527o.f63992a;
            c31374b = c31527o.f63993b;
            ResultKt.throwOnFailure(obj);
        }
        C29983l c29983l = (C29983l) obj;
        c31374b.getClass();
        String strM71282a = AbstractC32660k.m71282a(j11);
        if (c29983l == null || (strM70061a = c29983l.m70061a("sns_confirmation_code_resendCountdown")) == null) {
            return null;
        }
        return StringsKt.replace$default(strM70061a, "{time}", strM71282a, false, 4, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m70814a(Function1 function1) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), AbstractC28387C0.f57876a, null, new C31531T(this, function1, null), 2, null);
    }
}
