package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31675M extends AbstractC28073M0 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty[] f64290h = {AbstractC28639a.m69485a(C31675M.class, "can", "getCan()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31675M.class, "lastPinDigit", "getLastPinDigit()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31675M.class, "currentPin", "getCurrentPin()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31675M.class, "originalPin", "getOriginalPin()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31675M.class, "step", "getStep()Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinViewModel$Step;", 0)};

    /* JADX INFO: renamed from: a */
    public final AbstractC31686k f64291a;

    /* JADX INFO: renamed from: b */
    public final C28936t f64292b;

    /* JADX INFO: renamed from: c */
    public final C28936t f64293c;

    /* JADX INFO: renamed from: d */
    public final C28936t f64294d;

    /* JADX INFO: renamed from: e */
    public final C28936t f64295e;

    /* JADX INFO: renamed from: f */
    public final C28936t f64296f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41678w f64297g;

    /* JADX INFO: renamed from: a */
    public static final void m70799a(C31675M c31675m) {
        C33272c.f67816e.f67810a.mo68955d("SNSEidPin", "Finish with success", null);
        AbstractC31686k abstractC31686k = c31675m.f64291a;
        C28936t c28936t = c31675m.f64294d;
        KProperty[] kPropertyArr = f64290h;
        KProperty kProperty = kPropertyArr[2];
        String str = (String) c28936t.m69705a();
        C28936t c28936t2 = c31675m.f64295e;
        KProperty kProperty2 = kPropertyArr[3];
        String str2 = (String) c28936t2.m69705a();
        C28936t c28936t3 = c31675m.f64292b;
        KProperty kProperty3 = kPropertyArr[0];
        String str3 = (String) c28936t3.m69705a();
        C28936t c28936t4 = c31675m.f64293c;
        KProperty kProperty4 = kPropertyArr[1];
        c31675m.fireEvent(new C31697v(new C31688m(abstractC31686k, str, str2, str3, (String) c28936t4.m69705a())));
    }

    /* JADX INFO: renamed from: b */
    public final void m70801b(String str) {
        C28936t c28936t = this.f64294d;
        KProperty kProperty = f64290h[2];
        c28936t.f58834a.set(c28936t.f58835b, str);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final InterfaceC41673r getViewState() {
        return this.f64297g;
    }

    public C31675M(AbstractC31686k abstractC31686k, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m);
        this.f64291a = abstractC31686k;
        this.f64292b = new C28936t(savedStateHandle, "can", null, false);
        this.f64293c = new C28936t(savedStateHandle, "last_pin_digit", null, false);
        this.f64294d = new C28936t(savedStateHandle, "current_pin", null, false);
        this.f64295e = new C28936t(savedStateHandle, "original_pin", null, false);
        SNSEidPinViewModel$Step sNSEidPinViewModel$Step = SNSEidPinViewModel$Step.ENTER_PIN;
        this.f64296f = new C28936t(savedStateHandle, "pin_step", sNSEidPinViewModel$Step, false);
        this.f64297g = C41636g.m90916g0(new C31673K(C41636g.m90896T(savedStateHandle.getStateFlow("pin_step", sNSEidPinViewModel$Step), new C31674L(null)), this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), C31664B.f64266e);
        if (!(abstractC31686k instanceof C31681f)) {
            if (abstractC31686k instanceof C31685j) {
                sNSEidPinViewModel$Step = SNSEidPinViewModel$Step.ENTER_OLD_PIN;
            } else if (abstractC31686k instanceof C31683h) {
                sNSEidPinViewModel$Step = SNSEidPinViewModel$Step.ENTER_PUK;
            } else if (abstractC31686k instanceof C31677b) {
                m70801b(((C31677b) abstractC31686k).f64298a);
                sNSEidPinViewModel$Step = SNSEidPinViewModel$Step.ENTER_CAN;
            } else if (abstractC31686k instanceof C31679d) {
                C31679d c31679d = (C31679d) abstractC31686k;
                String str = c31679d.f64299a;
                KProperty[] kPropertyArr = f64290h;
                KProperty kProperty = kPropertyArr[3];
                savedStateHandle.set("original_pin", str);
                m70801b(c31679d.f64300b);
                String str2 = c31679d.f64301c;
                KProperty kProperty2 = kPropertyArr[1];
                savedStateHandle.set("last_pin_digit", str2);
                sNSEidPinViewModel$Step = SNSEidPinViewModel$Step.ENTER_CAN;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        m70800b(sNSEidPinViewModel$Step);
    }

    /* JADX INFO: renamed from: b */
    public final void m70800b(SNSEidPinViewModel$Step sNSEidPinViewModel$Step) {
        C28936t c28936t = this.f64296f;
        KProperty kProperty = f64290h[4];
        c28936t.f58834a.set(c28936t.f58835b, sNSEidPinViewModel$Step);
    }

    /* JADX INFO: renamed from: a */
    public static Map m70798a(SNSEidPinViewModel$Step sNSEidPinViewModel$Step) {
        String str = "transportPin";
        switch (AbstractC31667E.f64271a[sNSEidPinViewModel$Step.ordinal()]) {
            case 1:
                str = "pin";
                break;
            case 2:
                str = "can";
                break;
            case 3:
                str = "puk";
                break;
            case 4:
            case 7:
                break;
            case 5:
                str = "newPin";
                break;
            case 6:
                str = "newPinRepeat";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return MapsKt.mapOf(TuplesKt.m90091to("mode", str));
    }
}
