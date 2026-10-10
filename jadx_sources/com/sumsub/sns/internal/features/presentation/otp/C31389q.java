package com.sumsub.sns.internal.features.presentation.otp;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.C28942c;
import com.sumsub.sns.internal.core.presentation.screen.C28943d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32660k;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31389q extends AbstractC28073M0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty[] f63612d = {AbstractC28639a.m69485a(C31389q.class, "resendTimerEndAtMs", "getResendTimerEndAtMs()J", 0)};

    /* JADX INFO: renamed from: a */
    public final Bundle f63613a;

    /* JADX INFO: renamed from: b */
    public InterfaceC41775x1 f63614b;

    /* JADX INFO: renamed from: c */
    public final C28936t f63615c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70702a(ContinuationImpl continuationImpl) {
        C31384l c31384l;
        C31374b c31374b;
        long j11;
        String strM70061a;
        if (continuationImpl instanceof C31384l) {
            c31384l = (C31384l) continuationImpl;
            int i11 = c31384l.f63599e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31384l.f63599e = i11 - Integer.MIN_VALUE;
            } else {
                c31384l = new C31384l(this, continuationImpl);
            }
        } else {
            c31384l = new C31384l(this, continuationImpl);
        }
        Object obj = c31384l.f63597c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31384l.f63599e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C28936t c28936t = this.f63615c;
            KProperty kProperty = f63612d[0];
            long jCoerceAtLeast = RangesKt.coerceAtLeast(timeUnit.toSeconds(((Number) c28936t.m69705a()).longValue() - System.currentTimeMillis()), 0L);
            C31374b c31374b2 = C31374b.f63574a;
            c31384l.f63596b = c31374b2;
            c31384l.f63595a = jCoerceAtLeast;
            c31384l.f63599e = 1;
            Object strings = getStrings(c31384l);
            if (strings == coroutine_suspended) {
                return coroutine_suspended;
            }
            c31374b = c31374b2;
            obj = strings;
            j11 = jCoerceAtLeast;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = c31384l.f63595a;
            c31374b = c31384l.f63596b;
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

    /* JADX INFO: renamed from: e */
    public final String m70703e() {
        Bundle bundle = this.f63613a;
        return "SNSOtpInputViewModel." + (bundle != null ? bundle.getString("arg_client_tag") : null);
    }

    /* JADX INFO: renamed from: f */
    public final C28943d m70704f() {
        Bundle bundle = this.f63613a;
        if (bundle != null) {
            return (C28943d) AbstractC28437b.m69320a(bundle, "arg_otp_params", C28943d.class, null);
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C31383k(6, null, null, null, null, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r12 == r1) goto L26;
     */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPrepare(Continuation continuation) {
        C31385m c31385m;
        String string;
        Long l11;
        C28942c c28942c;
        Integer num;
        String str;
        if (continuation instanceof C31385m) {
            c31385m = (C31385m) continuation;
            int i11 = c31385m.f63602c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31385m.f63602c = i11 - Integer.MIN_VALUE;
            } else {
                c31385m = new C31385m(this, (ContinuationImpl) continuation);
            }
        } else {
            c31385m = new C31385m(this, (ContinuationImpl) continuation);
        }
        Object string2 = c31385m.f63600a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31385m.f63602c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string2);
            c31385m.f63602c = 1;
            if (AbstractC28073M0.onPrepare$suspendImpl(this, c31385m) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(string2);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(string2);
        }
        String str2 = (String) string2;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C28943d c28943dM70704f = m70704f();
        if (c28943dM70704f != null && (str = c28943dM70704f.f58844a) != null) {
            str3 = str;
        }
        AbstractC28073M0.updateState$default(this, false, new C31386n(this, str2, str3, null), 1, null);
        if (this.f63614b == null) {
            C28943d c28943dM70704f2 = m70704f();
            long seconds = (c28943dM70704f2 == null || (c28942c = c28943dM70704f2.f58845b) == null || (num = c28942c.f58843b) == null) ? TimeUnit.MINUTES.toSeconds(1L) : num.intValue();
            C28943d c28943dM70704f3 = m70704f();
            long millis = (c28943dM70704f3 == null || (l11 = c28943dM70704f3.f58847d) == null) ? TimeUnit.SECONDS.toMillis(seconds) + System.currentTimeMillis() : l11.longValue();
            C28936t c28936t = this.f63615c;
            KProperty kProperty = f63612d[0];
            c28936t.f58834a.set(c28936t.f58835b, Long.valueOf(millis));
            this.f63614b = C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31387o(this, null), 3, null);
        }
        return Unit.INSTANCE;
        Logger.DefaultImpls.v$default(C33272c.f67812a, m70703e(), "onPrepare", null, 4, null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Bundle bundle = this.f63613a;
        if (bundle == null || (string = bundle.getString("arg_strings_key")) == null) {
            string = "default";
        }
        String str4 = String.format("sns_confirmation_code_%s_subtitle", Arrays.copyOf(new Object[]{string}, 1));
        c31385m.f63602c = 2;
        string2 = getString(str4, c31385m);
    }

    public C31389q(Bundle bundle, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m);
        this.f63613a = bundle;
        this.f63615c = new C28936t(savedStateHandle, "resendTimerEndAtMs", 0L, false);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Logger.DefaultImpls.v$default(C33272c.f67812a, m70703e(), "stopResendTimer", null, 4, null);
        C28936t c28936t = this.f63615c;
        KProperty kProperty = f63612d[0];
        c28936t.f58834a.set(c28936t.f58835b, 0L);
        InterfaceC41775x1 interfaceC41775x1 = this.f63614b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f63614b = null;
    }
}
