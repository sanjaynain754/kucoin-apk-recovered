package com.sumsub.sns.internal.features.presentation.verification;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32707d {

    /* JADX INFO: renamed from: a */
    public final C32701a f66897a;

    /* JADX INFO: renamed from: a */
    public final void m71293a(String str, long j11) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "CountdownKeeper", "addCountdown id: " + str + ", endTime: " + j11, null, 4, null);
        String strM71292a = m71292a(str);
        C32701a c32701a = this.f66897a;
        c32701a.f66874b.put(strM71292a, Long.valueOf(j11));
        c32701a.f66873a.set(strM71292a, Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: c */
    public final void m71295c(String str) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "CountdownKeeper", "removeCountdown id: " + str, null, 4, null);
        String strM71292a = m71292a(str);
        C32701a c32701a = this.f66897a;
        c32701a.f66874b.remove(strM71292a);
        c32701a.f66873a.remove(strM71292a);
    }

    public C32707d(SavedStateHandle savedStateHandle, Map map) {
        this.f66897a = new C32701a(savedStateHandle, map);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC41634e m71294b(String str) {
        return C41636g.m90930n0(this.f66897a.f66873a.getStateFlow(m71292a(str), null), new C32705c(null, str, this));
    }

    /* JADX INFO: renamed from: a */
    public static String m71292a(String str) {
        return "countdown_id_" + StringsKt.trim((CharSequence) str).toString().toLowerCase(Locale.US);
    }
}
