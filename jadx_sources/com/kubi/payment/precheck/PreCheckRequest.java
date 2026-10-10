package com.kubi.payment.precheck;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentManager;
import com.kubi.payment.data.entities.VersionCheck;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreCheckRequest.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/precheck/PreCheckRequest;", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "versionCheckRequest", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "<init>", "(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;)V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getVersionCheckRequest", "()Lcom/kubi/payment/data/entities/VersionCheck$Request;", "BuyPreCheckRequest", "SellPreCheckRequest", "P2PSellPreCheckRequest", "Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;", "Lcom/kubi/payment/precheck/PreCheckRequest$SellPreCheckRequest;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class PreCheckRequest {

    @NotNull
    private final FragmentManager fragmentManager;

    @Nullable
    private final VersionCheck.Request versionCheckRequest;

    /* JADX INFO: compiled from: PreCheckRequest.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;", "Lcom/kubi/payment/precheck/PreCheckRequest;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "versionCheckRequest", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "needCheckTradingPassword", "", "needCheckEmail", "needCheckPhone", "<init>", "(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;ZZZ)V", "getNeedCheckTradingPassword", "()Z", "getNeedCheckEmail", "getNeedCheckPhone", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class BuyPreCheckRequest extends PreCheckRequest {
        private final boolean needCheckEmail;
        private final boolean needCheckPhone;
        private final boolean needCheckTradingPassword;

        public /* synthetic */ BuyPreCheckRequest(FragmentManager fragmentManager, VersionCheck.Request request, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(fragmentManager, (i11 & 2) != 0 ? null : request, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyPreCheckRequest(@NotNull FragmentManager fragmentManager, @Nullable VersionCheck.Request request, boolean z11, boolean z12, boolean z13) {
            super(fragmentManager, request, null);
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            this.needCheckTradingPassword = z11;
            this.needCheckEmail = z12;
            this.needCheckPhone = z13;
        }

        public final boolean getNeedCheckEmail() {
            return this.needCheckEmail;
        }

        public final boolean getNeedCheckPhone() {
            return this.needCheckPhone;
        }

        public final boolean getNeedCheckTradingPassword() {
            return this.needCheckTradingPassword;
        }
    }

    /* JADX INFO: compiled from: PreCheckRequest.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/precheck/PreCheckRequest$P2PSellPreCheckRequest;", "Lcom/kubi/payment/precheck/PreCheckRequest$SellPreCheckRequest;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "versionCheckRequest", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "needCheckTradingPassword", "", "p2pInfo", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;", "context", "Landroid/content/Context;", "<init>", "(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;ZLcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;Landroid/content/Context;)V", "getP2pInfo", "()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;", "getContext", "()Landroid/content/Context;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class P2PSellPreCheckRequest extends SellPreCheckRequest {

        @NotNull
        private final Context context;

        @Nullable
        private final SellPaymentMethod.Response.PaymentMethod.P2PInfo p2pInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P2PSellPreCheckRequest(@NotNull FragmentManager fragmentManager, @Nullable VersionCheck.Request request, boolean z11, @Nullable SellPaymentMethod.Response.PaymentMethod.P2PInfo p2PInfo, @NotNull Context context) {
            super(fragmentManager, request, z11);
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(context, "context");
            this.p2pInfo = p2PInfo;
            this.context = context;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        public final SellPaymentMethod.Response.PaymentMethod.P2PInfo getP2pInfo() {
            return this.p2pInfo;
        }
    }

    /* JADX INFO: compiled from: PreCheckRequest.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/precheck/PreCheckRequest$SellPreCheckRequest;", "Lcom/kubi/payment/precheck/PreCheckRequest;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "versionCheckRequest", "Lcom/kubi/payment/data/entities/VersionCheck$Request;", "needCheckTradingPassword", "", "<init>", "(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;Z)V", "getNeedCheckTradingPassword", "()Z", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static class SellPreCheckRequest extends PreCheckRequest {
        private final boolean needCheckTradingPassword;

        public /* synthetic */ SellPreCheckRequest(FragmentManager fragmentManager, VersionCheck.Request request, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(fragmentManager, (i11 & 2) != 0 ? null : request, (i11 & 4) != 0 ? false : z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SellPreCheckRequest(@NotNull FragmentManager fragmentManager, @Nullable VersionCheck.Request request, boolean z11) {
            super(fragmentManager, request, null);
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            this.needCheckTradingPassword = z11;
        }

        public final boolean getNeedCheckTradingPassword() {
            return this.needCheckTradingPassword;
        }
    }

    public /* synthetic */ PreCheckRequest(FragmentManager fragmentManager, VersionCheck.Request request, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, request);
    }

    private PreCheckRequest(FragmentManager fragmentManager, VersionCheck.Request request) {
        this.fragmentManager = fragmentManager;
        this.versionCheckRequest = request;
    }

    @NotNull
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    @Nullable
    public final VersionCheck.Request getVersionCheckRequest() {
        return this.versionCheckRequest;
    }

    public /* synthetic */ PreCheckRequest(FragmentManager fragmentManager, VersionCheck.Request request, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, (i11 & 2) != 0 ? null : request, null);
    }
}
