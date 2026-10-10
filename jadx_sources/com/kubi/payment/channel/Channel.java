package com.kubi.payment.channel;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel;", "", "<init>", "()V", "UnSupportedChannel", "Capitual", "Advcash", "EasyEuro", "Nuvei", "BirApi", "Scb", "Bcb", "Transfero", "Build", "Ivy", "Lcom/kubi/payment/channel/Channel$Advcash;", "Lcom/kubi/payment/channel/Channel$Bcb;", "Lcom/kubi/payment/channel/Channel$BirApi;", "Lcom/kubi/payment/channel/Channel$Build;", "Lcom/kubi/payment/channel/Channel$Capitual;", "Lcom/kubi/payment/channel/Channel$EasyEuro;", "Lcom/kubi/payment/channel/Channel$Ivy;", "Lcom/kubi/payment/channel/Channel$Nuvei;", "Lcom/kubi/payment/channel/Channel$Scb;", "Lcom/kubi/payment/channel/Channel$Transfero;", "Lcom/kubi/payment/channel/Channel$UnSupportedChannel;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class Channel {

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$Advcash;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Advcash extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: Multi-variable type inference failed */
        public Advcash() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Advcash)) {
                return false;
            }
            Advcash advcash = (Advcash) other;
            return Intrinsics.areEqual(this.paymentMethodCode, advcash.paymentMethodCode) && Intrinsics.areEqual(this.channelId, advcash.channelId);
        }

        public /* synthetic */ Advcash(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "advcash" : str, (i11 & 2) != 0 ? "advcash" : str2);
        }

        public static /* synthetic */ Advcash copy$default(Advcash advcash, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = advcash.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = advcash.channelId;
            }
            return advcash.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Advcash copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new Advcash(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Advcash(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Advcash(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$Bcb;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Bcb extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: Multi-variable type inference failed */
        public Bcb() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bcb)) {
                return false;
            }
            Bcb bcb = (Bcb) other;
            return Intrinsics.areEqual(this.paymentMethodCode, bcb.paymentMethodCode) && Intrinsics.areEqual(this.channelId, bcb.channelId);
        }

        public /* synthetic */ Bcb(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "REGULAR_BANK_TRANSFER" : str, (i11 & 2) != 0 ? "bcb" : str2);
        }

        public static /* synthetic */ Bcb copy$default(Bcb bcb, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bcb.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = bcb.channelId;
            }
            return bcb.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Bcb copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new Bcb(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Bcb(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bcb(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$BirApi;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BirApi extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: Multi-variable type inference failed */
        public BirApi() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BirApi)) {
                return false;
            }
            BirApi birApi = (BirApi) other;
            return Intrinsics.areEqual(this.paymentMethodCode, birApi.paymentMethodCode) && Intrinsics.areEqual(this.channelId, birApi.channelId);
        }

        public /* synthetic */ BirApi(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "bank_transfer_ziraat" : str, (i11 & 2) != 0 ? "birapi" : str2);
        }

        public static /* synthetic */ BirApi copy$default(BirApi birApi, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = birApi.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = birApi.channelId;
            }
            return birApi.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final BirApi copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new BirApi(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "BirApi(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BirApi(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$Build;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Build extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        public /* synthetic */ Build(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? "build_au" : str2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Build)) {
                return false;
            }
            Build build = (Build) other;
            return Intrinsics.areEqual(this.paymentMethodCode, build.paymentMethodCode) && Intrinsics.areEqual(this.channelId, build.channelId);
        }

        public static /* synthetic */ Build copy$default(Build build, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = build.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = build.channelId;
            }
            return build.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Build copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new Build(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Build(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Build(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$Capitual;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Capitual extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: Multi-variable type inference failed */
        public Capitual() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Capitual)) {
                return false;
            }
            Capitual capitual = (Capitual) other;
            return Intrinsics.areEqual(this.paymentMethodCode, capitual.paymentMethodCode) && Intrinsics.areEqual(this.channelId, capitual.channelId);
        }

        public /* synthetic */ Capitual(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "capitual" : str, (i11 & 2) != 0 ? "capitual" : str2);
        }

        public static /* synthetic */ Capitual copy$default(Capitual capitual, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = capitual.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = capitual.channelId;
            }
            return capitual.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Capitual copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new Capitual(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Capitual(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Capitual(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$EasyEuro;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class EasyEuro extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EasyEuro)) {
                return false;
            }
            EasyEuro easyEuro = (EasyEuro) other;
            return Intrinsics.areEqual(this.paymentMethodCode, easyEuro.paymentMethodCode) && Intrinsics.areEqual(this.channelId, easyEuro.channelId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EasyEuro(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        public static /* synthetic */ EasyEuro copy$default(EasyEuro easyEuro, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = easyEuro.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = easyEuro.channelId;
            }
            return easyEuro.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final EasyEuro copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new EasyEuro(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "EasyEuro(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$Ivy;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Ivy extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        public /* synthetic */ Ivy(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? "ivy" : str2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ivy)) {
                return false;
            }
            Ivy ivy = (Ivy) other;
            return Intrinsics.areEqual(this.paymentMethodCode, ivy.paymentMethodCode) && Intrinsics.areEqual(this.channelId, ivy.channelId);
        }

        public static /* synthetic */ Ivy copy$default(Ivy ivy, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = ivy.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = ivy.channelId;
            }
            return ivy.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Ivy copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new Ivy(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ivy(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ivy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$Nuvei;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Nuvei extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: Multi-variable type inference failed */
        public Nuvei() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Nuvei)) {
                return false;
            }
            Nuvei nuvei = (Nuvei) other;
            return Intrinsics.areEqual(this.paymentMethodCode, nuvei.paymentMethodCode) && Intrinsics.areEqual(this.channelId, nuvei.channelId);
        }

        public /* synthetic */ Nuvei(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "easy_bank_transfer_eur" : str, (i11 & 2) != 0 ? "nuvei_apm" : str2);
        }

        public static /* synthetic */ Nuvei copy$default(Nuvei nuvei, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = nuvei.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = nuvei.channelId;
            }
            return nuvei.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Nuvei copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new Nuvei(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Nuvei(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Nuvei(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$Scb;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Scb extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: Multi-variable type inference failed */
        public Scb() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Scb)) {
                return false;
            }
            Scb scb = (Scb) other;
            return Intrinsics.areEqual(this.paymentMethodCode, scb.paymentMethodCode) && Intrinsics.areEqual(this.channelId, scb.channelId);
        }

        public /* synthetic */ Scb(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "bank_transfer_scb_th" : str, (i11 & 2) != 0 ? "scb_th" : str2);
        }

        public static /* synthetic */ Scb copy$default(Scb scb, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = scb.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = scb.channelId;
            }
            return scb.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Scb copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new Scb(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Scb(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Scb(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$Transfero;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Transfero extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        public /* synthetic */ Transfero(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? "transfero" : str2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Transfero)) {
                return false;
            }
            Transfero transfero = (Transfero) other;
            return Intrinsics.areEqual(this.paymentMethodCode, transfero.paymentMethodCode) && Intrinsics.areEqual(this.channelId, transfero.channelId);
        }

        public static /* synthetic */ Transfero copy$default(Transfero transfero, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = transfero.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = transfero.channelId;
            }
            return transfero.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Transfero copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new Transfero(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Transfero(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transfero(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/channel/Channel$UnSupportedChannel;", "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UnSupportedChannel extends Channel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnSupportedChannel)) {
                return false;
            }
            UnSupportedChannel unSupportedChannel = (UnSupportedChannel) other;
            return Intrinsics.areEqual(this.paymentMethodCode, unSupportedChannel.paymentMethodCode) && Intrinsics.areEqual(this.channelId, unSupportedChannel.channelId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnSupportedChannel(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        public static /* synthetic */ UnSupportedChannel copy$default(UnSupportedChannel unSupportedChannel, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unSupportedChannel.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = unSupportedChannel.channelId;
            }
            return unSupportedChannel.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final UnSupportedChannel copy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            return new UnSupportedChannel(paymentMethodCode, channelId);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnSupportedChannel(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }
    }

    public /* synthetic */ Channel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Channel() {
    }
}
