package com.kubi.payment.track;

import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.track.IPaymentTrack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: IPaymentTrack.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&J2\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\fH&J2\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u000eH&J2\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0010H&J2\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/track/IPaymentTrack;", "", "trackP2P", "", "category", "", "isSuccessful", "", "reason", "data", "Lcom/kubi/payment/track/P2PTrackData;", "trackFast", "Lcom/kubi/payment/track/FastTrackData;", "trackRecharge", "Lcom/kubi/payment/track/RechargeTrackData;", "trackWithdraw", "Lcom/kubi/payment/track/WithdrawTrackData;", "trackThirdBuy", "Lcom/kubi/payment/track/ThirdBuyTrackData;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPaymentTrack {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f40346a = Companion.f40347a;

    /* JADX INFO: compiled from: IPaymentTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/track/IPaymentTrack$Companion;", "", "<init>", "()V", "track", "Lcom/kubi/payment/track/IPaymentTrack;", "getTrack", "()Lcom/kubi/payment/track/IPaymentTrack;", "track$delegate", "Lkotlin/Lazy;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f40347a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Lazy<IPaymentTrack> f40348b = LazyKt.lazy(new Function0() { // from class: nu.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IPaymentTrack.Companion.m49804b();
            }
        });

        /* JADX INFO: renamed from: b */
        public static final IPaymentTrack m49804b() {
            return PaymentServiceLocator.f38204a.m45619g();
        }

        @NotNull
        public final IPaymentTrack getTrack() {
            return f40348b.getValue();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo49798a(@NotNull String str, boolean z11, @Nullable String str2, @Nullable RechargeTrackData rechargeTrackData);

    /* JADX INFO: renamed from: c */
    void mo49799c(@NotNull String str, boolean z11, @Nullable String str2, @Nullable ThirdBuyTrackData thirdBuyTrackData);

    /* JADX INFO: renamed from: d */
    void mo49800d(@NotNull String str, boolean z11, @Nullable String str2, @Nullable WithdrawTrackData withdrawTrackData);

    /* JADX INFO: renamed from: g */
    void mo49801g(@NotNull String str, boolean z11, @Nullable String str2, @Nullable P2PTrackData p2PTrackData);

    /* JADX INFO: renamed from: j */
    void mo49802j(@NotNull String str, boolean z11, @Nullable String str2, @Nullable FastTrackData fastTrackData);

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m49793b(IPaymentTrack iPaymentTrack, String str, boolean z11, String str2, FastTrackData fastTrackData, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackFast");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            fastTrackData = null;
        }
        iPaymentTrack.mo49802j(str, z11, str2, fastTrackData);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m49794e(IPaymentTrack iPaymentTrack, String str, boolean z11, String str2, RechargeTrackData rechargeTrackData, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRecharge");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            rechargeTrackData = null;
        }
        iPaymentTrack.mo49798a(str, z11, str2, rechargeTrackData);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m49795f(IPaymentTrack iPaymentTrack, String str, boolean z11, String str2, WithdrawTrackData withdrawTrackData, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackWithdraw");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            withdrawTrackData = null;
        }
        iPaymentTrack.mo49800d(str, z11, str2, withdrawTrackData);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ void m49796h(IPaymentTrack iPaymentTrack, String str, boolean z11, String str2, P2PTrackData p2PTrackData, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackP2P");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            p2PTrackData = null;
        }
        iPaymentTrack.mo49801g(str, z11, str2, p2PTrackData);
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m49797i(IPaymentTrack iPaymentTrack, String str, boolean z11, String str2, ThirdBuyTrackData thirdBuyTrackData, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackThirdBuy");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            thirdBuyTrackData = null;
        }
        iPaymentTrack.mo49799c(str, z11, str2, thirdBuyTrackData);
    }
}
