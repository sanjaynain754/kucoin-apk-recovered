package com.kubi.otc.fiat.finger;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.entity.ConfigDate;
import et.InterfaceC37240b;
import kotlinx.coroutines.C41686h;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: DeviceFingerHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015JB\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/otc/fiat/finger/DeviceFingerHelper;", "", "<init>", "()V", "ORG_ID_DEBUG", "", "ORG_ID_RELEASE", "FINGERPRINT_SERVER_URL", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "TYPE_RECHARGE", "TYPE_BANK_CARD", "TYPE_BANK_CARD_RECURRING", "initDeviceFingerConfig", "", "config", "Lcom/kubi/otc/entity/ConfigDate;", "checkRisk", "type", "cardId", FirebaseAnalytics.Param.CURRENCY, "cryptoCurrency", "totalAmount", "frequency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadDeviceInfo", "sessionId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DeviceFingerHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DeviceFingerHelper f37296a = new DeviceFingerHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f37297b = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.finger.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceFingerHelper.m44050c();
        }
    });

    /* JADX INFO: renamed from: d */
    public final InterfaceC37240b m44051d() {
        return (InterfaceC37240b) f37297b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC37240b m44050c() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m44052e(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new DeviceFingerHelper$getSessionId$2(str, null), continuation);
    }

    /* JADX INFO: renamed from: f */
    public final void m44053f(@Nullable ConfigDate configDate) {
    }
}
