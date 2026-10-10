package com.sumsub.sns.internal.core.presentation.nfc;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.data.model.common.C28988C2;
import com.sumsub.sns.internal.features.data.model.common.C28998E2;
import com.sumsub.sns.internal.features.domain.mrtd.AbstractC30268y;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.nfc.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28907l implements InterfaceC28773g {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ KProperty[] f58773m = {AbstractC28639a.m69485a(C28907l.class, "attempt", "getAttempt()I", 0), AbstractC28639a.m69485a(C28907l.class, "hasFailedAttempts", "getHasFailedAttempts()Z", 0), AbstractC28639a.m69485a(C28907l.class, "isLastErrorAccessRejected", "isLastErrorAccessRejected()Z", 0), AbstractC28639a.m69485a(C28907l.class, "progress", "getProgress()I", 0), AbstractC28639a.m69485a(C28907l.class, "readingStep", "getReadingStep()Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;", 0)};

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f58774a;

    /* JADX INFO: renamed from: b */
    public final AbstractC30268y f58775b;

    /* JADX INFO: renamed from: c */
    public final Function1 f58776c;

    /* JADX INFO: renamed from: d */
    public final String f58777d;

    /* JADX INFO: renamed from: e */
    public final String f58778e;

    /* JADX INFO: renamed from: f */
    public final C28936t f58779f;

    /* JADX INFO: renamed from: g */
    public final C28936t f58780g;

    /* JADX INFO: renamed from: h */
    public final C28936t f58781h;

    /* JADX INFO: renamed from: i */
    public final C28936t f58782i;

    /* JADX INFO: renamed from: j */
    public final C28936t f58783j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41678w f58784k;

    /* JADX INFO: renamed from: l */
    public InterfaceC41775x1 f58785l;

    /* JADX INFO: renamed from: a */
    public final int m69678a() {
        C28936t c28936t = this.f58779f;
        KProperty kProperty = f58773m[0];
        return ((Number) c28936t.m69705a()).intValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m69679b() {
        InterfaceC41775x1 interfaceC41775x1 = this.f58785l;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f58785l = null;
        C28936t c28936t = this.f58782i;
        KProperty[] kPropertyArr = f58773m;
        KProperty kProperty = kPropertyArr[3];
        c28936t.f58834a.set(c28936t.f58835b, 0);
        NfcReadController$ReadingStep nfcReadController$ReadingStep = NfcReadController$ReadingStep.IDLE;
        C28936t c28936t2 = this.f58783j;
        KProperty kProperty2 = kPropertyArr[4];
        c28936t2.f58834a.set(c28936t2.f58835b, nfcReadController$ReadingStep);
    }

    /* JADX INFO: renamed from: c */
    public final void m69680c() {
        InterfaceC41775x1 interfaceC41775x1 = this.f58785l;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f58785l = null;
        C28936t c28936t = this.f58782i;
        KProperty[] kPropertyArr = f58773m;
        KProperty kProperty = kPropertyArr[3];
        c28936t.f58834a.set(c28936t.f58835b, 0);
        NfcReadController$ReadingStep nfcReadController$ReadingStep = NfcReadController$ReadingStep.LISTENING;
        C28936t c28936t2 = this.f58783j;
        KProperty kProperty2 = kPropertyArr[4];
        c28936t2.f58834a.set(c28936t2.f58835b, nfcReadController$ReadingStep);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g
    public final InterfaceC41678w getState() {
        return this.f58784k;
    }

    public C28907l(InterfaceC41709m0 interfaceC41709m0, SavedStateHandle savedStateHandle, AbstractC28978A2 abstractC28978A2, AbstractC30268y abstractC30268y, Function1 function1) {
        String str;
        C28998E2 c28998e2;
        String str2;
        NfcReadController$ReadingStep nfcReadController$ReadingStep;
        this.f58774a = interfaceC41709m0;
        this.f58775b = abstractC30268y;
        this.f58776c = function1;
        if (abstractC28978A2 instanceof C28988C2) {
            str = "basic";
        } else if (abstractC28978A2 instanceof C28998E2) {
            str = "kinegram";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f58777d = str;
        if (abstractC28978A2 instanceof C28998E2) {
            c28998e2 = (C28998E2) abstractC28978A2;
        } else {
            c28998e2 = null;
        }
        if (c28998e2 != null) {
            str2 = c28998e2.f58936n;
        } else {
            str2 = null;
        }
        this.f58778e = str2;
        this.f58779f = new C28936t(savedStateHandle, "STATE_ATTEMPT", Integer.valueOf(abstractC28978A2.mo69717b()), false);
        Boolean bool = Boolean.FALSE;
        this.f58780g = new C28936t(savedStateHandle, "STATE_HAS_FAILED_ATTEMPTS", bool, false);
        this.f58781h = new C28936t(savedStateHandle, "STATE_IS_LAST_ERROR_ACCESS_REJECTED", bool, false);
        C28936t c28936t = new C28936t(savedStateHandle, "STATE_PROGRESS", 0, false);
        this.f58782i = c28936t;
        if (abstractC28978A2.mo69717b() > 0) {
            nfcReadController$ReadingStep = NfcReadController$ReadingStep.LISTENING;
        } else {
            nfcReadController$ReadingStep = NfcReadController$ReadingStep.IDLE;
        }
        C28936t c28936t2 = new C28936t(savedStateHandle, "STATE_NFC_READING_STEP", nfcReadController$ReadingStep, false);
        this.f58783j = c28936t2;
        KProperty[] kPropertyArr = f58773m;
        KProperty kProperty = kPropertyArr[4];
        InterfaceC41678w stateFlow = savedStateHandle.getStateFlow("STATE_NFC_READING_STEP", (NfcReadController$ReadingStep) c28936t2.m69705a());
        KProperty kProperty2 = kPropertyArr[3];
        this.f58784k = C41636g.m90916g0(C41636g.m90927m(stateFlow, savedStateHandle.getStateFlow("STATE_PROGRESS", Integer.valueOf(((Number) c28936t.m69705a()).intValue())), new C28906k(null)), interfaceC41709m0, SharingStarted.INSTANCE.getLazily(), null);
    }
}
