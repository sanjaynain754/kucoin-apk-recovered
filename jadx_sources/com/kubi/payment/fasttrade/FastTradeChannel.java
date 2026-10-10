package com.kubi.payment.fasttrade;

import androidx.annotation.Keep;
import com.kubi.otc.entity.FastQuoteModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastTradeChannel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel;", "", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "UnSupportedChannel", "BankCard", "GooglePay", "Revolut", "Blik", "Balance", FastQuoteModel.PAY_P2P, "ThirdParty", "ThirdPartyPayID", "Ivy", "ZenPay", "Lcom/kubi/payment/fasttrade/FastTradeChannel$Balance;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$BankCard;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$Blik;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$GooglePay;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$Ivy;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$P2P;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$Revolut;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$ThirdParty;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$ThirdPartyPayID;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$UnSupportedChannel;", "Lcom/kubi/payment/fasttrade/FastTradeChannel$ZenPay;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FastTradeChannel {

    @NotNull
    private final String channelId;

    @NotNull
    private final String paymentMethodCode;

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$Balance;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Balance extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Balance(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$BankCard;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class BankCard extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankCard(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$Blik;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Blik extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Blik(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$GooglePay;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GooglePay extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePay(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$Ivy;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Ivy extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ivy(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$P2P;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class P2P extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P2P(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$Revolut;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Revolut extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Revolut(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$ThirdParty;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ThirdParty extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThirdParty(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$ThirdPartyPayID;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ThirdPartyPayID extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThirdPartyPayID(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$UnSupportedChannel;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UnSupportedChannel extends FastTradeChannel {

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
            super(paymentMethodCode, channelId, null);
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

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
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

    /* JADX INFO: compiled from: FastTradeChannel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannel$ZenPay;", "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ZenPay extends FastTradeChannel {

        @NotNull
        private final String channelId;

        @NotNull
        private final String paymentMethodCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ZenPay(@NotNull String paymentMethodCode, @NotNull String channelId) {
            super(paymentMethodCode, channelId, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            this.paymentMethodCode = paymentMethodCode;
            this.channelId = channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getChannelId() {
            return this.channelId;
        }

        @Override // com.kubi.payment.fasttrade.FastTradeChannel
        @NotNull
        public String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }
    }

    public /* synthetic */ FastTradeChannel(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private FastTradeChannel(String str, String str2) {
        this.paymentMethodCode = str;
        this.channelId = str2;
    }

    @NotNull
    public String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }
}
