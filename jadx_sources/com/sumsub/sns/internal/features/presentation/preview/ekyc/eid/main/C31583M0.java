package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.ekyc.C30163f;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.AbstractC31661o;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31548a;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31549b;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31550c;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31551d;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31554g;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31660n;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31662p;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.SNSEidExceptionReason;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import de.authada.library.api.Can;
import de.authada.library.api.SecretWrong;
import de.authada.library.api.authentication.Pin;
import de.authada.library.api.authentication.StartCallback;
import java.net.URL;
import java.util.ArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.M0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31583M0 extends AbstractC28073M0 {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty[] f64136p = {AbstractC28639a.m69485a(C31583M0.class, "legalInfo", "getLegalInfo()Ljava/lang/CharSequence;", 0), AbstractC28639a.m69485a(C31583M0.class, "step", "getStep()Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/SNSEidMainViewModel$Step;", 0)};

    /* JADX INFO: renamed from: q */
    public static final C31624h0 f64137q = C31624h0.f64219a;

    /* JADX INFO: renamed from: a */
    public final String f64138a;

    /* JADX INFO: renamed from: b */
    public final String f64139b;

    /* JADX INFO: renamed from: c */
    public final String f64140c;

    /* JADX INFO: renamed from: d */
    public final C30163f f64141d;

    /* JADX INFO: renamed from: e */
    public final C28936t f64142e;

    /* JADX INFO: renamed from: f */
    public final C28936t f64143f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f64144g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f64145h;

    /* JADX INFO: renamed from: i */
    public boolean f64146i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41678w f64147j;

    /* JADX INFO: renamed from: k */
    public final C31647t0 f64148k;

    /* JADX INFO: renamed from: l */
    public final C31651v0 f64149l;

    /* JADX INFO: renamed from: m */
    public final C31563B0 f64150m;

    /* JADX INFO: renamed from: n */
    public final C31566D0 f64151n;

    /* JADX INFO: renamed from: o */
    public final Function1 f64152o;

    /* JADX INFO: renamed from: b */
    public static Screen m70763b(C31583M0 c31583m0) {
        C28936t c28936t = c31583m0.f64143f;
        KProperty kProperty = f64136p[1];
        return m70760a((AbstractC31640o0) c28936t.m69705a());
    }

    /* JADX INFO: renamed from: a */
    public final void m70765a(StartCallback startCallback) {
        C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Start", null);
        showProgress(true);
        String str = this.f64138a;
        if (str == null) {
            AbstractC28052C.throwError$default(this, new IllegalStateException("No mobile token"), "E_KYC", null, 4, null);
            return;
        }
        if (this.f64140c == null) {
            AbstractC28052C.throwError$default(this, new IllegalStateException("No certificate"), "E_KYC", null, 4, null);
        } else if (this.f64139b == null) {
            AbstractC28052C.throwError$default(this, new IllegalStateException("No url"), "E_KYC", null, 4, null);
        } else {
            fireEvent(new C31631k(new C31554g(str, new URL(this.f64139b), this.f64140c, startCallback, this.f64152o)));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m70773c(boolean z11) {
        C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Set scanning state: " + z11, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31571G0(z11, this, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return "E_KYC";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final InterfaceC41673r getViewState() {
        return this.f64147j;
    }

    public C31583M0(String str, String str2, String str3, C30163f c30163f, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m);
        this.f64138a = str;
        this.f64139b = str2;
        this.f64140c = str3;
        this.f64141d = c30163f;
        this.f64142e = new C28936t(savedStateHandle, "KEY_LEGAL_INFO", null, false);
        C31624h0 c31624h0 = f64137q;
        C28936t c28936t = new C28936t(savedStateHandle, "KEY_EID_STEP", c31624h0, false);
        this.f64143f = c28936t;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f64144g = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(null);
        this.f64145h = interfaceC41669nM91009a2;
        InterfaceC41678w stateFlow = savedStateHandle.getStateFlow("KEY_EID_STEP", c31624h0);
        KProperty kProperty = f64136p[1];
        AbstractC31640o0 abstractC31640o0 = (AbstractC31640o0) c28936t.m69705a();
        if (Intrinsics.areEqual(abstractC31640o0, C31638n0.f64246a) || Intrinsics.areEqual(abstractC31640o0, C31619f0.f64213a) || Intrinsics.areEqual(abstractC31640o0, C31634l0.f64241a)) {
            C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Init state is scanning, aborting scan", null);
            m70770a(C28497u.f58029b);
        }
        this.f64147j = C41636g.m90916g0(C41636g.m90929n(stateFlow, interfaceC41669nM91009a, interfaceC41669nM91009a2, new C31581L0(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), C31589P0.f64167b);
        this.f64148k = new C31647t0(this);
        this.f64149l = new C31651v0(this);
        this.f64150m = new C31563B0(this);
        this.f64151n = new C31566D0(this);
        this.f64152o = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C31583M0.m70761a(this.f64253b, (Throwable) obj);
            }
        };
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "ViewModel cleared", null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onErrorCancelled(AbstractC29149l0 abstractC29149l0) {
        if (abstractC29149l0.mo69765c() instanceof C31660n) {
            C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Reset", null);
            m70771b(f64137q);
        } else {
            super.onErrorCancelled(abstractC29149l0);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        Parcelable parcelableMo69766d = abstractC29149l0.mo69766d();
        if (parcelableMo69766d instanceof AbstractC31595T) {
            m70764a((AbstractC31595T) parcelableMo69766d);
        } else {
            super.onHandleError(abstractC29149l0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m70771b(AbstractC31640o0 abstractC31640o0) {
        C28936t c28936t = this.f64143f;
        KProperty kProperty = f64136p[1];
        c28936t.f58834a.set(c28936t.f58835b, abstractC31640o0);
    }

    /* JADX INFO: renamed from: b */
    public final void m70772b(SecretWrong secretWrong) {
        boolean z11 = secretWrong == SecretWrong.CAN_WRONG_CAN_PIN_REQUIRED || secretWrong == SecretWrong.PIN_WRONG_ONE_PIN_TRY_LEFT_CAN_PIN_REQUIRED;
        C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Request pin enter, triesLeft=" + secretWrong + ", needCan=" + z11, null);
        fireEvent(new C31639o(z11));
    }

    /* JADX INFO: renamed from: a */
    public final void m70767a(String str, String str2) {
        Can can = null;
        if (str == null) {
            C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Start reading, card pin is null. Aborting.", null);
            return;
        }
        this.f64144g.setValue(null);
        m70773c(false);
        C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Start reading, canIsNull=" + (str2 == null || StringsKt.isBlank(str2)), null);
        m70771b(C31638n0.f64246a);
        try {
            ArrayList arrayList = new ArrayList(str.length());
            for (int i11 = 0; i11 < str.length(); i11++) {
                arrayList.add(Integer.valueOf(CharsKt.digitToInt(str.charAt(i11))));
            }
            Pin pin = new Pin(CollectionsKt.toIntArray(arrayList));
            if (str2 != null) {
                ArrayList arrayList2 = new ArrayList(str2.length());
                for (int i12 = 0; i12 < str2.length(); i12++) {
                    arrayList2.add(Integer.valueOf(CharsKt.digitToInt(str2.charAt(i12))));
                }
                can = new Can(CollectionsKt.toIntArray(arrayList2));
            }
            fireEvent(new C31631k(new C31551d(pin, can, this.f64149l, this.f64152o)));
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this, e11, "E_KYC", null, 4, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70761a(C31583M0 c31583m0, Throwable th2) {
        if (th2 instanceof C31662p) {
            AbstractC31661o.m70797a("Error starting auth. Restarting. " + th2.getMessage());
            C31662p c31662p = (C31662p) th2;
            String str = c31662p.f64264a;
            String str2 = c31662p.f64265b;
            c31583m0.f64144g.setValue(null);
            c31583m0.m70765a(new C31569F0(c31583m0, str, str2));
        } else {
            c31583m0.m70769a(th2, "sns_eid_error_title", "sns_eid_error_subtitle", "sns_oops_action_goBack", C31593S.f64183a);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70768a(String str, boolean z11) {
        C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "On pin entered, need can: " + z11, null);
        if (str == null) {
            return;
        }
        if (z11) {
            m70771b(new C31602Z(new C31568F(str)));
        } else {
            m70767a(str, (String) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70764a(AbstractC31595T abstractC31595T) {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSEidMain", "On action " + abstractC31595T, null);
        if (abstractC31595T == null) {
            return;
        }
        if (abstractC31595T instanceof C31588P) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31575I0(this, null), 3, null);
            return;
        }
        if (abstractC31595T instanceof C31584N) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31573H0(this, null), 3, null);
            return;
        }
        if (abstractC31595T instanceof C31593S) {
            c33270a.f67810a.mo68955d("SNSEidMain", "Reset", null);
            m70771b(f64137q);
            return;
        }
        if (abstractC31595T instanceof C31565D) {
            m70765a(this.f64148k);
            return;
        }
        if (abstractC31595T instanceof C31654x) {
            fireEvent(C31633l.f64240a);
            return;
        }
        if (abstractC31595T instanceof C31644r) {
            m70773c(false);
            c33270a.f67810a.mo68955d("SNSEidMain", "Cancel pin change", null);
            fireEvent(new C31631k(C31548a.f64060a));
            m70771b(C31624h0.f64219a);
            return;
        }
        if (abstractC31595T instanceof C31650v) {
            m70773c(false);
            this.f64144g.setValue(null);
            c33270a.f67810a.mo68955d("SNSEidMain", "Cancel reading", null);
            m70771b(C31607b0.f64202a);
            fireEvent(new C31631k(C31550c.f64062a));
            return;
        }
        if (abstractC31595T instanceof C31580L) {
            fireEvent(C31641p.f64248a);
            return;
        }
        if (abstractC31595T instanceof C31646t) {
            c33270a.f67810a.mo68955d("SNSEidMain", "Cancel pin unlocking", null);
            fireEvent(new C31631k(C31549b.f64061a));
            m70771b(C31607b0.f64202a);
            return;
        }
        if (abstractC31595T instanceof C31576J) {
            m70772b(((C31576J) abstractC31595T).f64116a);
            return;
        }
        if (abstractC31595T instanceof C31568F) {
            fireEvent(new C31635m(((C31568F) abstractC31595T).f64097a));
            return;
        }
        if (abstractC31595T instanceof C31572H) {
            C31572H c31572h = (C31572H) abstractC31595T;
            fireEvent(new C31637n(c31572h.f64106a, c31572h.f64107b, c31572h.f64108c));
        } else if (abstractC31595T instanceof C31658z) {
            this.f64146i = true;
            AbstractC28052C.finish$default(this, null, null, null, null, 15, null);
        } else {
            if (abstractC31595T instanceof C31562B) {
                this.f64146i = true;
                AbstractC28052C.finishWithResult$default(this, 1, null, 2, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70770a(AbstractC28503w abstractC28503w) {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSEidMain", "Try finish, reason=" + abstractC28503w, null);
        if (!(abstractC28503w instanceof C28497u) || this.f64146i) {
            return true;
        }
        C28936t c28936t = this.f64143f;
        KProperty kProperty = f64136p[1];
        AbstractC31640o0 abstractC31640o0 = (AbstractC31640o0) c28936t.m69705a();
        C31624h0 c31624h0 = C31624h0.f64219a;
        if (Intrinsics.areEqual(abstractC31640o0, c31624h0)) {
            return true;
        }
        C31607b0 c31607b0 = C31607b0.f64202a;
        if (!Intrinsics.areEqual(abstractC31640o0, c31607b0) && !(abstractC31640o0 instanceof C31602Z) && !Intrinsics.areEqual(abstractC31640o0, C31613d0.f64206a) && !Intrinsics.areEqual(abstractC31640o0, C31630j0.f64238a)) {
            if (Intrinsics.areEqual(abstractC31640o0, C31638n0.f64246a)) {
                m70773c(false);
                this.f64144g.setValue(null);
                c33270a.f67810a.mo68955d("SNSEidMain", "Cancel reading", null);
                m70771b(c31607b0);
                fireEvent(new C31631k(C31550c.f64062a));
                return false;
            }
            if (Intrinsics.areEqual(abstractC31640o0, C31619f0.f64213a)) {
                m70773c(false);
                c33270a.f67810a.mo68955d("SNSEidMain", "Cancel pin change", null);
                fireEvent(new C31631k(C31548a.f64060a));
                m70771b(c31624h0);
                return false;
            }
            if (Intrinsics.areEqual(abstractC31640o0, C31634l0.f64241a)) {
                c33270a.f67810a.mo68955d("SNSEidMain", "Cancel pin unlocking", null);
                fireEvent(new C31631k(C31549b.f64061a));
                m70771b(c31607b0);
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        m70771b(f64137q);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static Screen m70760a(AbstractC31640o0 abstractC31640o0) {
        if (Intrinsics.areEqual(abstractC31640o0, C31624h0.f64219a)) {
            return Screen.EidPinSelection;
        }
        if (Intrinsics.areEqual(abstractC31640o0, C31607b0.f64202a)) {
            return Screen.EidIdentInfo;
        }
        if (Intrinsics.areEqual(abstractC31640o0, C31619f0.f64213a)) {
            return Screen.EidNfcScan;
        }
        if (Intrinsics.areEqual(abstractC31640o0, C31613d0.f64206a)) {
            return Screen.EidPinChangeSuccess;
        }
        if (Intrinsics.areEqual(abstractC31640o0, C31638n0.f64246a)) {
            return Screen.EidNfcScan;
        }
        if (abstractC31640o0 instanceof C31602Z) {
            return Screen.EidCanRequired;
        }
        if (Intrinsics.areEqual(abstractC31640o0, C31634l0.f64241a)) {
            return Screen.EidNfcScan;
        }
        if (Intrinsics.areEqual(abstractC31640o0, C31630j0.f64238a)) {
            return Screen.EidUnlockSuccess;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final void m70769a(Throwable th2, String str, String str2, String str3, AbstractC31595T abstractC31595T) {
        this.f64144g.setValue(null);
        AbstractC31661o.m70797a("Error " + th2);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31577J0(this, str, str2, str3, th2, abstractC31595T, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m70762a(C31583M0 c31583m0, String str, SNSEidExceptionReason sNSEidExceptionReason, String str2, AbstractC31595T abstractC31595T, int i11) {
        String str3;
        String str4;
        if ((i11 & 4) != 0) {
            str3 = "sns_eid_error_title";
        } else {
            str3 = "sns_eid_error_cardLost_title";
        }
        String str5 = str3;
        if ((i11 & 8) != 0) {
            str2 = "sns_eid_error_subtitle";
        }
        String str6 = str2;
        if ((i11 & 16) != 0) {
            str4 = "sns_oops_action_goBack";
        } else {
            str4 = "sns_oops_action_retry";
        }
        String str7 = str4;
        if ((i11 & 32) != 0) {
            abstractC31595T = C31593S.f64183a;
        }
        c31583m0.m70766a(str, sNSEidExceptionReason, str5, str6, str7, abstractC31595T);
    }

    /* JADX INFO: renamed from: a */
    public final void m70766a(String str, SNSEidExceptionReason sNSEidExceptionReason, String str2, String str3, String str4, AbstractC31595T abstractC31595T) {
        m70769a(new C31660n(str, sNSEidExceptionReason.getCode()), str2, str3, str4, abstractC31595T);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31579K0(this, sNSEidExceptionReason, null), 3, null);
    }
}
