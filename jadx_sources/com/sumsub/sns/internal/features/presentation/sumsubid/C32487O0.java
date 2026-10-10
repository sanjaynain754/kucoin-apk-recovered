package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.analytics.StepAction;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29095c0;
import com.sumsub.sns.internal.features.data.model.common.C29119g0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30052a;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30053b;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30059h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30056e;
import com.sumsub.sns.internal.features.presentation.verification.C32707d;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.O0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32487O0 extends AbstractC28142p0 {

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ KProperty[] f66261v = {AbstractC28639a.m69485a(C32487O0.class, "step", "getStep()Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;", 0), AbstractC28639a.m69485a(C32487O0.class, "email", "getEmail()Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdEmail;", 0), AbstractC28639a.m69485a(C32487O0.class, "documentItems", "getDocumentItems()Ljava/util/List;", 0), AbstractC28639a.m69485a(C32487O0.class, "agreementState", "getAgreementState()Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdAgreementState;", 0), AbstractC28639a.m69485a(C32487O0.class, "accountInfo", "getAccountInfo()Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdAccountInfoHolder;", 0), AbstractC28639a.m69485a(C32487O0.class, "lastLoginResponse", "getLastLoginResponse()Lcom/sumsub/sns/internal/features/data/model/sumsubid/SNSSumsubIdLoginResponse;", 0)};

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f66262a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30056e f66263b;

    /* JADX INFO: renamed from: c */
    public final C30053b f66264c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC29921d f66265d;

    /* JADX INFO: renamed from: e */
    public final C32707d f66266e;

    /* JADX INFO: renamed from: f */
    public final C28936t f66267f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41678w f66268g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f66269h;

    /* JADX INFO: renamed from: i */
    public final C28936t f66270i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41678w f66271j;

    /* JADX INFO: renamed from: k */
    public final C28936t f66272k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41678w f66273l;

    /* JADX INFO: renamed from: m */
    public final C28936t f66274m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41678w f66275n;

    /* JADX INFO: renamed from: o */
    public final C28936t f66276o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41678w f66277p;

    /* JADX INFO: renamed from: q */
    public final C28936t f66278q;

    /* JADX INFO: renamed from: r */
    public boolean f66279r;

    /* JADX INFO: renamed from: s */
    public boolean f66280s;

    /* JADX INFO: renamed from: t */
    public boolean f66281t;

    /* JADX INFO: renamed from: u */
    public final C28651g f66282u;

    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m71152a(C32487O0 c32487o0, ContinuationImpl continuationImpl) {
        C32533j0 c32533j0;
        Object objM103844constructorimpl;
        Throwable th2;
        if (continuationImpl instanceof C32533j0) {
            c32533j0 = (C32533j0) continuationImpl;
            int i11 = c32533j0.f66364e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32533j0.f66364e = i11 - Integer.MIN_VALUE;
            } else {
                c32533j0 = new C32533j0(c32487o0, continuationImpl);
            }
        } else {
            c32533j0 = new C32533j0(c32487o0, continuationImpl);
        }
        Object objM71154a = c32533j0.f66362c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32533j0.f66364e;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    ResultKt.throwOnFailure(objM71154a);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = c32533j0.f66361b;
                    ResultKt.throwOnFailure(objM71154a);
                }
                if (((Boolean) objM71154a).booleanValue()) {
                    c32487o0.throwError(th2, "SumsubId", C32502X.f66332a);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objM71154a);
            AbstractC32493S.m71164a("accept agreement");
            Result.Companion companion = Result.INSTANCE;
            InterfaceC30056e interfaceC30056e = c32487o0.f66263b;
            c32533j0.f66364e = 1;
            Object objM70089c = ((C30059h) interfaceC30056e).f60399a.f60391a.m70089c(c32533j0);
            if (objM70089c != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM70089c = Unit.INSTANCE;
            }
            if (objM70089c != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM70089c = Unit.INSTANCE;
            }
            if (objM70089c == coroutine_suspended) {
                return coroutine_suspended;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            AbstractC32493S.m71164a("agreement accepted");
            c32487o0.m71155a(Screen.SumsubIdGreetingScreen);
            c32487o0.m71159c(((C30052a) c32487o0.f66264c.f60387a.getValue()).f60385c);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C33272c.f67816e.f67810a.mo68956e("SnsId", "error while accepting agreement", thM103847exceptionOrNullimpl);
            c32533j0.f66360a = objM103844constructorimpl;
            c32533j0.f66361b = thM103847exceptionOrNullimpl;
            c32533j0.f66364e = 2;
            objM71154a = c32487o0.m71154a(thM103847exceptionOrNullimpl, c32533j0);
            if (objM71154a == coroutine_suspended) {
                return coroutine_suspended;
            }
            th2 = thM103847exceptionOrNullimpl;
            if (((Boolean) objM71154a).booleanValue()) {
                c32487o0.throwError(th2, "SumsubId", C32502X.f66332a);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m71153b(C32487O0 c32487o0, ContinuationImpl continuationImpl) {
        C32479K0 c32479k0;
        C32487O0 c32487o1;
        C32527h0 c32527h0;
        if (continuationImpl instanceof C32479K0) {
            c32479k0 = (C32479K0) continuationImpl;
            int i11 = c32479k0.f66238e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32479k0.f66238e = i11 - Integer.MIN_VALUE;
            } else {
                c32479k0 = new C32479K0(c32487o0, continuationImpl);
            }
        } else {
            c32479k0 = new C32479K0(c32487o0, continuationImpl);
        }
        Object obj = c32479k0.f66236c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32479k0.f66238e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C32527h0 c32527h1 = C32527h0.f66351a;
            c32479k0.f66234a = c32487o0;
            c32479k0.f66235b = c32527h1;
            c32479k0.f66238e = 1;
            Object config = c32487o0.getConfig(c32479k0);
            if (config == coroutine_suspended) {
                return coroutine_suspended;
            }
            c32487o1 = c32487o0;
            c32527h0 = c32527h1;
            obj = config;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32527h0 = c32479k0.f66235b;
            C32487O0 c32487o2 = c32479k0.f66234a;
            ResultKt.throwOnFailure(obj);
            c32487o1 = c32487o2;
        }
        C29124h c29124h = (C29124h) obj;
        AbstractC28052C.throwError$default(c32487o1, new C29119g0(null, c32527h0, new C29095c0(29, null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v) : null, null)), "SumsubId", false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m71159c(boolean z11) {
        AbstractC32493S.m71164a("proceedWithHasDocs, hasDocs=" + z11);
        if (!z11) {
            m71156a(SNSSumsubIdStep.NO_DATA);
        } else {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32465D0(this, null, this), 2, null);
        }
    }

    public C32487O0(InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, InterfaceC30056e interfaceC30056e, C30053b c30053b, InterfaceC29921d interfaceC29921d, C32707d c32707d, SavedStateHandle savedStateHandle) {
        String str;
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f66262a = interfaceC29984m;
        this.f66263b = interfaceC30056e;
        this.f66264c = c30053b;
        this.f66265d = interfaceC29921d;
        this.f66266e = c32707d;
        SNSSumsubIdStep sNSSumsubIdStep = SNSSumsubIdStep.ENTER_EMAIL;
        this.f66267f = new C28936t(savedStateHandle, "step", sNSSumsubIdStep, false);
        this.f66268g = savedStateHandle.getStateFlow("step", sNSSumsubIdStep);
        String str2 = ((C30052a) c30053b.f60387a.getValue()).f60383a;
        C32557s c32557s = new C32557s(str2);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(str2);
        this.f66269h = interfaceC41669nM91009a;
        this.f66270i = new C28936t(savedStateHandle, "email", c32557s, false);
        this.f66271j = savedStateHandle.getStateFlow("email", c32557s);
        this.f66272k = new C28936t(savedStateHandle, "documents", new ArrayList(), false);
        this.f66273l = savedStateHandle.getStateFlow("documents", new ArrayList());
        this.f66274m = new C28936t(savedStateHandle, "agreement", new C32517e(), false);
        this.f66275n = savedStateHandle.getStateFlow("agreement", new C32517e());
        this.f66276o = new C28936t(savedStateHandle, JAnalysisConstants.Account.KEY_ACCOUNT, null, false);
        this.f66277p = savedStateHandle.getStateFlow(JAnalysisConstants.Account.KEY_ACCOUNT, null);
        this.f66278q = new C28936t(savedStateHandle, "login_response", null, false);
        this.f66282u = new C28651g(savedStateHandle);
        C30052a c30052a = (C30052a) c30053b.f60387a.getValue();
        if (c30052a.f60384b && (str = c30052a.f60383a) != null) {
            C32557s c32557s2 = new C32557s(str);
            KProperty kProperty = f66261v[1];
            savedStateHandle.set("email", c32557s2);
            m71159c(c30052a.f60385c);
        }
        AbstractC28421U.m69303a(interfaceC41669nM91009a, ViewModelKt.getViewModelScope(this), new C32499V(this, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90930n0(this.f66268g, new C32536k0(null, this, c28075o));
    }

    /* JADX INFO: renamed from: e */
    public final C32557s m71160e() {
        C28936t c28936t = this.f66270i;
        KProperty kProperty = f66261v[1];
        return (C32557s) c28936t.m69705a();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        Object value;
        AbstractC32493S.m71164a("intent, " + interfaceC28077Q);
        if (interfaceC28077Q instanceof AbstractC32484N) {
            AbstractC32484N abstractC32484N = (AbstractC32484N) interfaceC28077Q;
            if (abstractC32484N instanceof C32470G) {
                this.f66269h.setValue(((C32470G) interfaceC28077Q).f66208a);
                return;
            }
            if (abstractC32484N instanceof C32472H) {
                String str = m71160e().f66411a;
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32467E0(this, null, str, this), 2, null);
                return;
            }
            if (abstractC32484N instanceof C32482M) {
                String str2 = m71160e().f66411a;
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32477J0(this, null, str2, this), 2, null);
                return;
            }
            if (abstractC32484N instanceof C32458A) {
                C32458A c32458a = (C32458A) interfaceC28077Q;
                String str3 = c32458a.f66173a;
                Long l11 = c32458a.f66174b;
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32602v0(this, null, str3, this, l11), 2, null);
                return;
            }
            if (abstractC32484N instanceof C32464D) {
                C32517e c32517e = new C32517e(((C32464D) interfaceC28077Q).f66189a);
                C28936t c28936t = this.f66274m;
                KProperty kProperty = f66261v[3];
                c28936t.f58834a.set(c28936t.f58835b, c32517e);
                return;
            }
            if (abstractC32484N instanceof C32466E) {
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32473H0(this, null, this), 2, null);
                return;
            }
            if (abstractC32484N instanceof C32468F) {
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32481L0(this, null, this), 2, null);
                return;
            }
            if (abstractC32484N instanceof C32480L) {
                AbstractC28052C.onLinkClicked$default(this, ((C32480L) interfaceC28077Q).f66239a, false, 2, null);
                return;
            }
            if (abstractC32484N instanceof C32460B) {
                boolean z11 = ((C32460B) interfaceC28077Q).f66179a;
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32461B0(this, null, this, z11), 2, null);
                return;
            }
            if (abstractC32484N instanceof C32476J) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32469F0(this, null), 3, null);
                return;
            }
            if (abstractC32484N instanceof C32478K) {
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32471G0(this, null, this), 2, null);
            } else if (!(abstractC32484N instanceof C32462C)) {
                if (!(abstractC32484N instanceof C32474I)) {
                    throw new NoWhenBranchMatchedException();
                }
                fireEvent(C32495T.f66323a);
            } else {
                AbstractC32493S.m71164a("log out");
                InterfaceC41669n interfaceC41669n = this.f66264c.f60387a;
                do {
                    value = interfaceC41669n.getValue();
                } while (!interfaceC41669n.compareAndSet(value, new C30052a(((C30052a) value).f60383a, 14)));
                m71156a(SNSSumsubIdStep.ENTER_EMAIL);
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (!(abstractC28503w instanceof C28497u) || this.f66279r) {
            return true;
        }
        C28936t c28936t = this.f66267f;
        KProperty kProperty = f66261v[0];
        int i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t.m69705a()).ordinal()];
        if (i11 == 4) {
            m71156a(SNSSumsubIdStep.ENTER_EMAIL);
            return false;
        }
        if (i11 != 5) {
            return true;
        }
        m71156a(SNSSumsubIdStep.NO_DATA);
        AbstractC32493S.m71164a("reloadDocuments()");
        String str = m71160e().f66411a;
        if (str == null || StringsKt.isBlank(str)) {
            m71156a(SNSSumsubIdStep.ENTER_EMAIL);
        } else {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32475I0(this, null, this), 2, null);
        }
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onErrorCancelled(AbstractC29149l0 abstractC29149l0) {
        Object value;
        AbstractC32493S.m71164a("Error cancelled, " + abstractC29149l0.mo69766d());
        AbstractC32493S.m71164a("log out");
        InterfaceC41669n interfaceC41669n = this.f66264c.f60387a;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, new C30052a(((C30052a) value).f60383a, 14)));
        m71156a(SNSSumsubIdStep.ENTER_EMAIL);
        AbstractC28052C.finish$default(this, null, null, null, null, 15, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        Object value;
        AbstractC32493S.m71164a("Handle error, " + abstractC29149l0.mo69766d());
        Parcelable parcelableMo69766d = abstractC29149l0.mo69766d();
        if (Intrinsics.areEqual(parcelableMo69766d, C32527h0.f66351a)) {
            m71156a(SNSSumsubIdStep.ENTER_EMAIL);
            return;
        }
        if (Intrinsics.areEqual(parcelableMo69766d, C32504Z.f66333a)) {
            AbstractC32493S.m71164a("log out");
            InterfaceC41669n interfaceC41669n = this.f66264c.f60387a;
            do {
                value = interfaceC41669n.getValue();
            } while (!interfaceC41669n.compareAndSet(value, new C30052a(((C30052a) value).f60383a, 14)));
            m71156a(SNSSumsubIdStep.ENTER_EMAIL);
            AbstractC28052C.finishWithResult$default(this, 51, null, 2, null);
            return;
        }
        if (Intrinsics.areEqual(parcelableMo69766d, C32509b0.f66336a)) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32471G0(this, null, this), 2, null);
            return;
        }
        if (Intrinsics.areEqual(parcelableMo69766d, C32515d0.f66341a)) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32481L0(this, null, this), 2, null);
            return;
        }
        if (Intrinsics.areEqual(parcelableMo69766d, C32502X.f66332a)) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32473H0(this, null, this), 2, null);
            return;
        }
        if (Intrinsics.areEqual(parcelableMo69766d, C32521f0.f66345a)) {
            AbstractC32493S.m71164a("reloadDocuments()");
            String str = m71160e().f66411a;
            if (str != null && !StringsKt.isBlank(str)) {
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32475I0(this, null, this), 2, null);
                return;
            } else {
                m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                return;
            }
        }
        super.onHandleError(abstractC29149l0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m71158c(Throwable th2, ContinuationImpl continuationImpl) {
        C32485N0 c32485n0;
        if (continuationImpl instanceof C32485N0) {
            c32485n0 = (C32485N0) continuationImpl;
            int i11 = c32485n0.f66257d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32485n0.f66257d = i11 - Integer.MIN_VALUE;
            } else {
                c32485n0 = new C32485N0(this, continuationImpl);
            }
        } else {
            c32485n0 = new C32485N0(this, continuationImpl);
        }
        Object config = c32485n0.f66255b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32485n0.f66257d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(config);
            AbstractC32493S.m71164a("Throw session expired error");
            c32485n0.f66254a = th2;
            c32485n0.f66257d = 1;
            config = getConfig(c32485n0);
            if (config == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = c32485n0.f66254a;
            ResultKt.throwOnFailure(config);
        }
        C29124h c29124h = (C29124h) config;
        AbstractC28052C.throwError$default(this, new C29119g0(th2, C32527h0.f66351a, new C29095c0(24, c29124h != null ? AbstractC29130i.m69770a("sumsubid.sessionExpired.title", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.sessionExpired.subtitle", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.sessionExpired.action", c29124h.f59089v) : null)), "SumsubId", false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m71157b(Throwable th2, ContinuationImpl continuationImpl) {
        C32483M0 c32483m0;
        if (continuationImpl instanceof C32483M0) {
            c32483m0 = (C32483M0) continuationImpl;
            int i11 = c32483m0.f66253d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32483m0.f66253d = i11 - Integer.MIN_VALUE;
            } else {
                c32483m0 = new C32483M0(this, continuationImpl);
            }
        } else {
            c32483m0 = new C32483M0(this, continuationImpl);
        }
        Object config = c32483m0.f66251b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32483m0.f66253d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(config);
            AbstractC32493S.m71164a("Throw blocked error");
            c32483m0.f66250a = th2;
            c32483m0.f66253d = 1;
            config = getConfig(c32483m0);
            if (config == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = c32483m0.f66250a;
            ResultKt.throwOnFailure(config);
        }
        C29124h c29124h = (C29124h) config;
        AbstractC28052C.throwError$default(this, new C29119g0(new IllegalStateException("SumsubId account is blocked", th2), C32504Z.f66333a, new C29095c0(24, c29124h != null ? AbstractC29130i.m69770a("sumsubid.accountBlocked.title", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.accountBlocked.subtitle", c29124h.f59089v) : null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.accountBlocked.action", c29124h.f59089v) : null)), "SumsubId", false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m71151a(C32487O0 c32487o0, String str, ContinuationImpl continuationImpl) {
        C32604w0 c32604w0;
        if (continuationImpl instanceof C32604w0) {
            c32604w0 = (C32604w0) continuationImpl;
            int i11 = c32604w0.f66502d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32604w0.f66502d = i11 - Integer.MIN_VALUE;
            } else {
                c32604w0 = new C32604w0(c32487o0, continuationImpl);
            }
        } else {
            c32604w0 = new C32604w0(c32487o0, continuationImpl);
        }
        Object string = c32604w0.f66500b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32604w0.f66502d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            C32557s c32557s = new C32557s(null, str);
            C28936t c28936t = c32487o0.f66270i;
            KProperty kProperty = f66261v[1];
            c28936t.f58834a.set(c28936t.f58835b, c32557s);
            if (str != null && Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(str).matches()) {
                return Boxing.boxBoolean(true);
            }
            c32604w0.f66499a = c32487o0;
            c32604w0.f66502d = 1;
            string = c32487o0.getString("sns_data_error_fieldIsMalformed", c32604w0);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32487o0 = c32604w0.f66499a;
            ResultKt.throwOnFailure(string);
        }
        C32557s c32557s2 = new C32557s((CharSequence) string, c32487o0.m71160e().f66411a);
        C28936t c28936t2 = c32487o0.f66270i;
        KProperty kProperty2 = f66261v[1];
        c28936t2.f58834a.set(c28936t2.f58835b, c32557s2);
        AbstractC32493S.m71164a("check email, invalid email");
        return Boxing.boxBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m71156a(SNSSumsubIdStep sNSSumsubIdStep) {
        C28936t c28936t = this.f66267f;
        KProperty kProperty = f66261v[0];
        c28936t.f58834a.set(c28936t.f58835b, sNSSumsubIdStep);
    }

    /* JADX INFO: renamed from: a */
    public final void m71155a(Screen screen) {
        if (this.f66280s && !this.f66281t) {
            this.f66281t = true;
            C28368g c28368gM69266a = new C28368g().m69266a(StepAction.Completed, "SumsubId");
            c28368gM69266a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("screenName", screen.getText())}));
            c28368gM69266a.m69267a(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (m71158c(r8, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (m71157b(r8, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71154a(Throwable th2, ContinuationImpl continuationImpl) {
        C32463C0 c32463c0;
        SNSException.Api api;
        Integer code;
        Integer errorCode;
        SNSException.Api api2;
        Integer code2;
        Integer errorCode2;
        if (continuationImpl instanceof C32463C0) {
            c32463c0 = (C32463C0) continuationImpl;
            int i11 = c32463c0.f66188c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32463c0.f66188c = i11 - Integer.MIN_VALUE;
            } else {
                c32463c0 = new C32463C0(this, continuationImpl);
            }
        } else {
            c32463c0 = new C32463C0(this, continuationImpl);
        }
        Object obj = c32463c0.f66186a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32463c0.f66188c;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z12 = th2 instanceof SNSException.Api;
            if (z12 && (code2 = (api2 = (SNSException.Api) th2).getCode()) != null && code2.intValue() == 401 && (errorCode2 = api2.getErrorCode()) != null && errorCode2.intValue() == 10402) {
                c32463c0.f66188c = 1;
            } else if (z12 && (code = (api = (SNSException.Api) th2).getCode()) != null && code.intValue() == 403 && (errorCode = api.getErrorCode()) != null && errorCode.intValue() == 10401) {
                c32463c0.f66188c = 2;
            }
            return Boxing.boxBoolean(z11);
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        z11 = false;
        return Boxing.boxBoolean(z11);
    }
}
