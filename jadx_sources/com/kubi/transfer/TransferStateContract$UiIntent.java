package com.kubi.transfer;

import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19283e;
import com.kubi.transfer.entity.AccountItem;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TransferStateContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchCoinList", "FetchBalanceList", "CheckCoinInAccount", "FetchFromBalance", "GoTransfer", "QueryBatchTransferConfig", "UpdateCoinInfo", "UpdateSymbolInfo", "MultiAccountDialogCloseEvent", "CheckNeedShowTip", "Lcom/kubi/transfer/TransferStateContract$UiIntent$CheckCoinInAccount;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$CheckNeedShowTip;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchBalanceList;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchCoinList;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchFromBalance;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$GoTransfer;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$MultiAccountDialogCloseEvent;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$QueryBatchTransferConfig;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$UpdateCoinInfo;", "Lcom/kubi/transfer/TransferStateContract$UiIntent$UpdateSymbolInfo;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class TransferStateContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$CheckCoinInAccount;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IOThreadIntent;", "fromType", "", "toType", "fromSymbolBean", "Lcom/kubi/data/entity/SymbolInfoEntity;", "toSymbolBean", "coin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/String;)V", "getFromType", "()Ljava/lang/String;", "getToType", "getFromSymbolBean", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getToSymbolBean", "getCoin", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CheckCoinInAccount extends TransferStateContract$UiIntent implements InterfaceC19283e {

        @Nullable
        private final String coin;

        @Nullable
        private final SymbolInfoEntity fromSymbolBean;

        @Nullable
        private final String fromType;

        @Nullable
        private final SymbolInfoEntity toSymbolBean;

        @Nullable
        private final String toType;

        public CheckCoinInAccount(@Nullable String str, @Nullable String str2, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable SymbolInfoEntity symbolInfoEntity2, @Nullable String str3) {
            super(null);
            this.fromType = str;
            this.toType = str2;
            this.fromSymbolBean = symbolInfoEntity;
            this.toSymbolBean = symbolInfoEntity2;
            this.coin = str3;
        }

        @Nullable
        public final String getCoin() {
            return this.coin;
        }

        @Nullable
        public final SymbolInfoEntity getFromSymbolBean() {
            return this.fromSymbolBean;
        }

        @Nullable
        public final String getFromType() {
            return this.fromType;
        }

        @Nullable
        public final SymbolInfoEntity getToSymbolBean() {
            return this.toSymbolBean;
        }

        @Nullable
        public final String getToType() {
            return this.toType;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$CheckNeedShowTip;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IOThreadIntent;", "code", "", "toType", "Lcom/kubi/data/coin/AccountType;", "<init>", "(Ljava/lang/String;Lcom/kubi/data/coin/AccountType;)V", "getCode", "()Ljava/lang/String;", "getToType", "()Lcom/kubi/data/coin/AccountType;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CheckNeedShowTip extends TransferStateContract$UiIntent implements InterfaceC19283e {

        @Nullable
        private final String code;

        @Nullable
        private final AccountType toType;

        public CheckNeedShowTip(@Nullable String str, @Nullable AccountType accountType) {
            super(null);
            this.code = str;
            this.toType = accountType;
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final AccountType getToType() {
            return this.toType;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchBalanceList;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "fromType", "", "toType", "isContract", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getFromType", "()Ljava/lang/String;", "getToType", "()Z", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchBalanceList extends TransferStateContract$UiIntent {

        @Nullable
        private final String fromType;
        private final boolean isContract;

        @Nullable
        private final String toType;

        public FetchBalanceList(@Nullable String str, @Nullable String str2, boolean z11) {
            super(null);
            this.fromType = str;
            this.toType = str2;
            this.isContract = z11;
        }

        @Nullable
        public final String getFromType() {
            return this.fromType;
        }

        @Nullable
        public final String getToType() {
            return this.toType;
        }

        /* JADX INFO: renamed from: isContract, reason: from getter */
        public final boolean getIsContract() {
            return this.isContract;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchCoinList;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IOThreadIntent;", "coin", "", "fromType", "toType", "toSymbolBean", "Lcom/kubi/data/entity/SymbolInfoEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getCoin", "()Ljava/lang/String;", "getFromType", "getToType", "getToSymbolBean", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchCoinList extends TransferStateContract$UiIntent implements InterfaceC19283e {

        @Nullable
        private final String coin;

        @Nullable
        private final String fromType;

        @Nullable
        private final SymbolInfoEntity toSymbolBean;

        @Nullable
        private final String toType;

        public FetchCoinList(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SymbolInfoEntity symbolInfoEntity) {
            super(null);
            this.coin = str;
            this.fromType = str2;
            this.toType = str3;
            this.toSymbolBean = symbolInfoEntity;
        }

        @Nullable
        public final String getCoin() {
            return this.coin;
        }

        @Nullable
        public final String getFromType() {
            return this.fromType;
        }

        @Nullable
        public final SymbolInfoEntity getToSymbolBean() {
            return this.toSymbolBean;
        }

        @Nullable
        public final String getToType() {
            return this.toType;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchFromBalance;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IOThreadIntent;", "fromType", "", "toType", "fromSymbolBean", "Lcom/kubi/data/entity/SymbolInfoEntity;", "toSymbolBean", "coin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/String;)V", "getFromType", "()Ljava/lang/String;", "getToType", "getFromSymbolBean", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getToSymbolBean", "getCoin", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchFromBalance extends TransferStateContract$UiIntent implements InterfaceC19283e {

        @Nullable
        private final String coin;

        @Nullable
        private final SymbolInfoEntity fromSymbolBean;

        @Nullable
        private final String fromType;

        @Nullable
        private final SymbolInfoEntity toSymbolBean;

        @Nullable
        private final String toType;

        public /* synthetic */ FetchFromBalance(String str, String str2, SymbolInfoEntity symbolInfoEntity, SymbolInfoEntity symbolInfoEntity2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : symbolInfoEntity, (i11 & 8) != 0 ? null : symbolInfoEntity2, (i11 & 16) != 0 ? null : str3);
        }

        public FetchFromBalance(@Nullable String str, @Nullable String str2, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable SymbolInfoEntity symbolInfoEntity2, @Nullable String str3) {
            super(null);
            this.fromType = str;
            this.toType = str2;
            this.fromSymbolBean = symbolInfoEntity;
            this.toSymbolBean = symbolInfoEntity2;
            this.coin = str3;
        }

        @Nullable
        public final String getCoin() {
            return this.coin;
        }

        @Nullable
        public final SymbolInfoEntity getFromSymbolBean() {
            return this.fromSymbolBean;
        }

        @Nullable
        public final String getFromType() {
            return this.fromType;
        }

        @Nullable
        public final SymbolInfoEntity getToSymbolBean() {
            return this.toSymbolBean;
        }

        @Nullable
        public final String getToType() {
            return this.toType;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$GoTransfer;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "amount", "", "fromType", "toType", "payTag", "recTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getFromType", "getToType", "getPayTag", "getRecTag", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GoTransfer extends TransferStateContract$UiIntent {

        @Nullable
        private final String amount;

        @Nullable
        private final String fromType;

        @Nullable
        private final String payTag;

        @Nullable
        private final String recTag;

        @Nullable
        private final String toType;

        public GoTransfer(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            super(null);
            this.amount = str;
            this.fromType = str2;
            this.toType = str3;
            this.payTag = str4;
            this.recTag = str5;
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getFromType() {
            return this.fromType;
        }

        @Nullable
        public final String getPayTag() {
            return this.payTag;
        }

        @Nullable
        public final String getRecTag() {
            return this.recTag;
        }

        @Nullable
        public final String getToType() {
            return this.toType;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$MultiAccountDialogCloseEvent;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IOThreadIntent;", "isFrom", "", "isMultiAccountMode", "sortedAccounts", "", "Lcom/kubi/transfer/entity/AccountItem;", "selectAccount", "<init>", "(ZZLjava/util/List;Lcom/kubi/transfer/entity/AccountItem;)V", "()Z", "getSortedAccounts", "()Ljava/util/List;", "getSelectAccount", "()Lcom/kubi/transfer/entity/AccountItem;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class MultiAccountDialogCloseEvent extends TransferStateContract$UiIntent implements InterfaceC19283e {
        private final boolean isFrom;
        private final boolean isMultiAccountMode;

        @Nullable
        private final AccountItem selectAccount;

        @NotNull
        private final List<AccountItem> sortedAccounts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiAccountDialogCloseEvent(boolean z11, boolean z12, @NotNull List<AccountItem> sortedAccounts, @Nullable AccountItem accountItem) {
            super(null);
            Intrinsics.checkNotNullParameter(sortedAccounts, "sortedAccounts");
            this.isFrom = z11;
            this.isMultiAccountMode = z12;
            this.sortedAccounts = sortedAccounts;
            this.selectAccount = accountItem;
        }

        @Nullable
        public final AccountItem getSelectAccount() {
            return this.selectAccount;
        }

        @NotNull
        public final List<AccountItem> getSortedAccounts() {
            return this.sortedAccounts;
        }

        /* JADX INFO: renamed from: isFrom, reason: from getter */
        public final boolean getIsFrom() {
            return this.isFrom;
        }

        /* JADX INFO: renamed from: isMultiAccountMode, reason: from getter */
        public final boolean getIsMultiAccountMode() {
            return this.isMultiAccountMode;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$QueryBatchTransferConfig;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IOThreadIntent;", "fromType", "", "toType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFromType", "()Ljava/lang/String;", "getToType", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class QueryBatchTransferConfig extends TransferStateContract$UiIntent implements InterfaceC19283e {

        @Nullable
        private final String fromType;

        @Nullable
        private final String toType;

        public QueryBatchTransferConfig(@Nullable String str, @Nullable String str2) {
            super(null);
            this.fromType = str;
            this.toType = str2;
        }

        @Nullable
        public final String getFromType() {
            return this.fromType;
        }

        @Nullable
        public final String getToType() {
            return this.toType;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$UpdateCoinInfo;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IOThreadIntent;", "coin", "", "isFetchFromBalance", "", "<init>", "(Ljava/lang/String;Z)V", "getCoin", "()Ljava/lang/String;", "()Z", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class UpdateCoinInfo extends TransferStateContract$UiIntent implements InterfaceC19283e {

        @Nullable
        private final String coin;
        private final boolean isFetchFromBalance;

        public /* synthetic */ UpdateCoinInfo(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? true : z11);
        }

        public UpdateCoinInfo(@Nullable String str, boolean z11) {
            super(null);
            this.coin = str;
            this.isFetchFromBalance = z11;
        }

        @Nullable
        public final String getCoin() {
            return this.coin;
        }

        /* JADX INFO: renamed from: isFetchFromBalance, reason: from getter */
        public final boolean getIsFetchFromBalance() {
            return this.isFetchFromBalance;
        }
    }

    /* JADX INFO: compiled from: TransferStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UiIntent$UpdateSymbolInfo;", "Lcom/kubi/transfer/TransferStateContract$UiIntent;", "Lcom/kubi/mvi/state/IOThreadIntent;", "fromType", "Lcom/kubi/data/coin/AccountType;", "toType", "fromSymbolBean", "Lcom/kubi/data/entity/SymbolInfoEntity;", "toSymbolBean", "<init>", "(Lcom/kubi/data/coin/AccountType;Lcom/kubi/data/coin/AccountType;Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getFromType", "()Lcom/kubi/data/coin/AccountType;", "getToType", "getFromSymbolBean", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getToSymbolBean", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class UpdateSymbolInfo extends TransferStateContract$UiIntent implements InterfaceC19283e {

        @Nullable
        private final SymbolInfoEntity fromSymbolBean;

        @NotNull
        private final AccountType fromType;

        @Nullable
        private final SymbolInfoEntity toSymbolBean;

        @NotNull
        private final AccountType toType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateSymbolInfo(@NotNull AccountType fromType, @NotNull AccountType toType, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable SymbolInfoEntity symbolInfoEntity2) {
            super(null);
            Intrinsics.checkNotNullParameter(fromType, "fromType");
            Intrinsics.checkNotNullParameter(toType, "toType");
            this.fromType = fromType;
            this.toType = toType;
            this.fromSymbolBean = symbolInfoEntity;
            this.toSymbolBean = symbolInfoEntity2;
        }

        @Nullable
        public final SymbolInfoEntity getFromSymbolBean() {
            return this.fromSymbolBean;
        }

        @NotNull
        public final AccountType getFromType() {
            return this.fromType;
        }

        @Nullable
        public final SymbolInfoEntity getToSymbolBean() {
            return this.toSymbolBean;
        }

        @NotNull
        public final AccountType getToType() {
            return this.toType;
        }
    }

    public /* synthetic */ TransferStateContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransferStateContract$UiIntent() {
    }
}
