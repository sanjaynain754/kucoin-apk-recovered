package com.kubi.transfer;

import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.transfer.entity.AccountInfos;
import com.kubi.transfer.entity.AccountItem;
import com.kubi.transfer.entity.RespMultiAccountBalance;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.transfer.TransferStateContract$UIState, reason: from toString */
/* JADX INFO: compiled from: TransferStateContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\u0017\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00101J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00106J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010O\u001a\u00020\u0007HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\u0007HÆ\u0003J\u008a\u0002\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00072\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0012HÖ\u0001J\t\u0010X\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010'R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00107\u001a\u0004\b\u0017\u00106R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010'R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010'R\u0011\u0010\u001f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010'R\u0011\u0010 \u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'¨\u0006Y"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$UIState;", "Lcom/kubi/mvi/state/IState;", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "accountInfo", "Lcom/kubi/transfer/entity/AccountInfos;", "isMultiAccountMode", "", "multiAccountBalance", "", "", "Lcom/kubi/transfer/entity/RespMultiAccountBalance;", "balance", "baseBalance", "quoteBalance", "baseCurrency", "quoteCurrency", "precision", "", "fromAccountList", "", "Lcom/kubi/transfer/entity/AccountItem;", "toAccountList", "isShowCoinPairView", "isSupportBatchTransfer", "fromSymbolBean", "Lcom/kubi/data/entity/SymbolInfoEntity;", "toSymbolBean", "contractBalance", "Lcom/kubi/kumex/entity/BalanceEntity;", "isCoinEnable", "isShowNoCoinTip", "shouldShowExchangeButton", "<init>", "(Lcom/kubi/data/entity/CoinInfoEntity;Lcom/kubi/transfer/entity/AccountInfos;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;ZLcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/kumex/entity/BalanceEntity;ZZZ)V", "getCoinInfo", "()Lcom/kubi/data/entity/CoinInfoEntity;", "getAccountInfo", "()Lcom/kubi/transfer/entity/AccountInfos;", "()Z", "getMultiAccountBalance", "()Ljava/util/Map;", "getBalance", "()Ljava/lang/String;", "getBaseBalance", "getQuoteBalance", "getBaseCurrency", "getQuoteCurrency", "getPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFromAccountList", "()Ljava/util/List;", "getToAccountList", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFromSymbolBean", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getToSymbolBean", "getContractBalance", "()Lcom/kubi/kumex/entity/BalanceEntity;", "getShouldShowExchangeButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Lcom/kubi/data/entity/CoinInfoEntity;Lcom/kubi/transfer/entity/AccountInfos;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;ZLcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/kumex/entity/BalanceEntity;ZZZ)Lcom/kubi/transfer/TransferStateContract$UIState;", "equals", "other", "", "hashCode", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final AccountInfos accountInfo;

    @Nullable
    private final String balance;

    @Nullable
    private final String baseBalance;

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final CoinInfoEntity coinInfo;

    @Nullable
    private final BalanceEntity contractBalance;

    @Nullable
    private final List<AccountItem> fromAccountList;

    @Nullable
    private final SymbolInfoEntity fromSymbolBean;
    private final boolean isCoinEnable;
    private final boolean isMultiAccountMode;

    @Nullable
    private final Boolean isShowCoinPairView;
    private final boolean isShowNoCoinTip;
    private final boolean isSupportBatchTransfer;

    @Nullable
    private final Map<String, RespMultiAccountBalance> multiAccountBalance;

    @Nullable
    private final Integer precision;

    @Nullable
    private final String quoteBalance;

    @Nullable
    private final String quoteCurrency;
    private final boolean shouldShowExchangeButton;

    @Nullable
    private final List<AccountItem> toAccountList;

    @Nullable
    private final SymbolInfoEntity toSymbolBean;

    public UIState() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, 1048575, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, CoinInfoEntity coinInfoEntity, AccountInfos accountInfos, boolean z11, Map map, String str, String str2, String str3, String str4, String str5, Integer num, List list, List list2, Boolean bool, boolean z12, SymbolInfoEntity symbolInfoEntity, SymbolInfoEntity symbolInfoEntity2, BalanceEntity balanceEntity, boolean z13, boolean z14, boolean z15, int i11, Object obj) {
        boolean z16;
        boolean z17;
        CoinInfoEntity coinInfoEntity2 = (i11 & 1) != 0 ? uIState.coinInfo : coinInfoEntity;
        AccountInfos accountInfos2 = (i11 & 2) != 0 ? uIState.accountInfo : accountInfos;
        boolean z18 = (i11 & 4) != 0 ? uIState.isMultiAccountMode : z11;
        Map map2 = (i11 & 8) != 0 ? uIState.multiAccountBalance : map;
        String str6 = (i11 & 16) != 0 ? uIState.balance : str;
        String str7 = (i11 & 32) != 0 ? uIState.baseBalance : str2;
        String str8 = (i11 & 64) != 0 ? uIState.quoteBalance : str3;
        String str9 = (i11 & 128) != 0 ? uIState.baseCurrency : str4;
        String str10 = (i11 & 256) != 0 ? uIState.quoteCurrency : str5;
        Integer num2 = (i11 & 512) != 0 ? uIState.precision : num;
        List list3 = (i11 & 1024) != 0 ? uIState.fromAccountList : list;
        List list4 = (i11 & 2048) != 0 ? uIState.toAccountList : list2;
        Boolean bool2 = (i11 & 4096) != 0 ? uIState.isShowCoinPairView : bool;
        boolean z19 = (i11 & 8192) != 0 ? uIState.isSupportBatchTransfer : z12;
        CoinInfoEntity coinInfoEntity3 = coinInfoEntity2;
        SymbolInfoEntity symbolInfoEntity3 = (i11 & 16384) != 0 ? uIState.fromSymbolBean : symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity4 = (i11 & 32768) != 0 ? uIState.toSymbolBean : symbolInfoEntity2;
        BalanceEntity balanceEntity2 = (i11 & 65536) != 0 ? uIState.contractBalance : balanceEntity;
        boolean z21 = (i11 & 131072) != 0 ? uIState.isCoinEnable : z13;
        boolean z22 = (i11 & 262144) != 0 ? uIState.isShowNoCoinTip : z14;
        if ((i11 & 524288) != 0) {
            z17 = z22;
            z16 = uIState.shouldShowExchangeButton;
        } else {
            z16 = z15;
            z17 = z22;
        }
        return uIState.copy(coinInfoEntity3, accountInfos2, z18, map2, str6, str7, str8, str9, str10, num2, list3, list4, bool2, z19, symbolInfoEntity3, symbolInfoEntity4, balanceEntity2, z21, z17, z16);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.coinInfo, uIState.coinInfo) && Intrinsics.areEqual(this.accountInfo, uIState.accountInfo) && this.isMultiAccountMode == uIState.isMultiAccountMode && Intrinsics.areEqual(this.multiAccountBalance, uIState.multiAccountBalance) && Intrinsics.areEqual(this.balance, uIState.balance) && Intrinsics.areEqual(this.baseBalance, uIState.baseBalance) && Intrinsics.areEqual(this.quoteBalance, uIState.quoteBalance) && Intrinsics.areEqual(this.baseCurrency, uIState.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, uIState.quoteCurrency) && Intrinsics.areEqual(this.precision, uIState.precision) && Intrinsics.areEqual(this.fromAccountList, uIState.fromAccountList) && Intrinsics.areEqual(this.toAccountList, uIState.toAccountList) && Intrinsics.areEqual(this.isShowCoinPairView, uIState.isShowCoinPairView) && this.isSupportBatchTransfer == uIState.isSupportBatchTransfer && Intrinsics.areEqual(this.fromSymbolBean, uIState.fromSymbolBean) && Intrinsics.areEqual(this.toSymbolBean, uIState.toSymbolBean) && Intrinsics.areEqual(this.contractBalance, uIState.contractBalance) && this.isCoinEnable == uIState.isCoinEnable && this.isShowNoCoinTip == uIState.isShowNoCoinTip && this.shouldShowExchangeButton == uIState.shouldShowExchangeButton;
    }

    public UIState(@Nullable CoinInfoEntity coinInfoEntity, @NotNull AccountInfos accountInfo, boolean z11, @Nullable Map<String, RespMultiAccountBalance> map, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable List<AccountItem> list, @Nullable List<AccountItem> list2, @Nullable Boolean bool, boolean z12, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable SymbolInfoEntity symbolInfoEntity2, @Nullable BalanceEntity balanceEntity, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        this.coinInfo = coinInfoEntity;
        this.accountInfo = accountInfo;
        this.isMultiAccountMode = z11;
        this.multiAccountBalance = map;
        this.balance = str;
        this.baseBalance = str2;
        this.quoteBalance = str3;
        this.baseCurrency = str4;
        this.quoteCurrency = str5;
        this.precision = num;
        this.fromAccountList = list;
        this.toAccountList = list2;
        this.isShowCoinPairView = bool;
        this.isSupportBatchTransfer = z12;
        this.fromSymbolBean = symbolInfoEntity;
        this.toSymbolBean = symbolInfoEntity2;
        this.contractBalance = balanceEntity;
        this.isCoinEnable = z13;
        this.isShowNoCoinTip = z14;
        this.shouldShowExchangeButton = z15;
    }

    @NotNull
    public final UIState copy(@Nullable CoinInfoEntity coinInfo, @NotNull AccountInfos accountInfo, boolean isMultiAccountMode, @Nullable Map<String, RespMultiAccountBalance> multiAccountBalance, @Nullable String balance, @Nullable String baseBalance, @Nullable String quoteBalance, @Nullable String baseCurrency, @Nullable String quoteCurrency, @Nullable Integer precision, @Nullable List<AccountItem> fromAccountList, @Nullable List<AccountItem> toAccountList, @Nullable Boolean isShowCoinPairView, boolean isSupportBatchTransfer, @Nullable SymbolInfoEntity fromSymbolBean, @Nullable SymbolInfoEntity toSymbolBean, @Nullable BalanceEntity contractBalance, boolean isCoinEnable, boolean isShowNoCoinTip, boolean shouldShowExchangeButton) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        return new UIState(coinInfo, accountInfo, isMultiAccountMode, multiAccountBalance, balance, baseBalance, quoteBalance, baseCurrency, quoteCurrency, precision, fromAccountList, toAccountList, isShowCoinPairView, isSupportBatchTransfer, fromSymbolBean, toSymbolBean, contractBalance, isCoinEnable, isShowNoCoinTip, shouldShowExchangeButton);
    }

    @NotNull
    public final AccountInfos getAccountInfo() {
        return this.accountInfo;
    }

    @Nullable
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getBaseBalance() {
        return this.baseBalance;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final CoinInfoEntity getCoinInfo() {
        return this.coinInfo;
    }

    @Nullable
    public final BalanceEntity getContractBalance() {
        return this.contractBalance;
    }

    @Nullable
    public final List<AccountItem> getFromAccountList() {
        return this.fromAccountList;
    }

    @Nullable
    public final SymbolInfoEntity getFromSymbolBean() {
        return this.fromSymbolBean;
    }

    @Nullable
    public final Map<String, RespMultiAccountBalance> getMultiAccountBalance() {
        return this.multiAccountBalance;
    }

    @Nullable
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    public final String getQuoteBalance() {
        return this.quoteBalance;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    public final boolean getShouldShowExchangeButton() {
        return this.shouldShowExchangeButton;
    }

    @Nullable
    public final List<AccountItem> getToAccountList() {
        return this.toAccountList;
    }

    @Nullable
    public final SymbolInfoEntity getToSymbolBean() {
        return this.toSymbolBean;
    }

    public int hashCode() {
        CoinInfoEntity coinInfoEntity = this.coinInfo;
        int iHashCode = (((((coinInfoEntity == null ? 0 : coinInfoEntity.hashCode()) * 31) + this.accountInfo.hashCode()) * 31) + Boolean.hashCode(this.isMultiAccountMode)) * 31;
        Map<String, RespMultiAccountBalance> map = this.multiAccountBalance;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.balance;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.baseBalance;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quoteBalance;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.baseCurrency;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.quoteCurrency;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.precision;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<AccountItem> list = this.fromAccountList;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<AccountItem> list2 = this.toAccountList;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isShowCoinPairView;
        int iHashCode11 = (((iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isSupportBatchTransfer)) * 31;
        SymbolInfoEntity symbolInfoEntity = this.fromSymbolBean;
        int iHashCode12 = (iHashCode11 + (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode())) * 31;
        SymbolInfoEntity symbolInfoEntity2 = this.toSymbolBean;
        int iHashCode13 = (iHashCode12 + (symbolInfoEntity2 == null ? 0 : symbolInfoEntity2.hashCode())) * 31;
        BalanceEntity balanceEntity = this.contractBalance;
        return ((((((iHashCode13 + (balanceEntity != null ? balanceEntity.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCoinEnable)) * 31) + Boolean.hashCode(this.isShowNoCoinTip)) * 31) + Boolean.hashCode(this.shouldShowExchangeButton);
    }

    /* JADX INFO: renamed from: isCoinEnable, reason: from getter */
    public final boolean getIsCoinEnable() {
        return this.isCoinEnable;
    }

    /* JADX INFO: renamed from: isMultiAccountMode, reason: from getter */
    public final boolean getIsMultiAccountMode() {
        return this.isMultiAccountMode;
    }

    @Nullable
    /* JADX INFO: renamed from: isShowCoinPairView, reason: from getter */
    public final Boolean getIsShowCoinPairView() {
        return this.isShowCoinPairView;
    }

    /* JADX INFO: renamed from: isShowNoCoinTip, reason: from getter */
    public final boolean getIsShowNoCoinTip() {
        return this.isShowNoCoinTip;
    }

    /* JADX INFO: renamed from: isSupportBatchTransfer, reason: from getter */
    public final boolean getIsSupportBatchTransfer() {
        return this.isSupportBatchTransfer;
    }

    @NotNull
    public String toString() {
        return "UIState(coinInfo=" + this.coinInfo + ", accountInfo=" + this.accountInfo + ", isMultiAccountMode=" + this.isMultiAccountMode + ", multiAccountBalance=" + this.multiAccountBalance + ", balance=" + this.balance + ", baseBalance=" + this.baseBalance + ", quoteBalance=" + this.quoteBalance + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", precision=" + this.precision + ", fromAccountList=" + this.fromAccountList + ", toAccountList=" + this.toAccountList + ", isShowCoinPairView=" + this.isShowCoinPairView + ", isSupportBatchTransfer=" + this.isSupportBatchTransfer + ", fromSymbolBean=" + this.fromSymbolBean + ", toSymbolBean=" + this.toSymbolBean + ", contractBalance=" + this.contractBalance + ", isCoinEnable=" + this.isCoinEnable + ", isShowNoCoinTip=" + this.isShowNoCoinTip + ", shouldShowExchangeButton=" + this.shouldShowExchangeButton + ')';
    }

    public /* synthetic */ UIState(CoinInfoEntity coinInfoEntity, AccountInfos accountInfos, boolean z11, Map map, String str, String str2, String str3, String str4, String str5, Integer num, List list, List list2, Boolean bool, boolean z12, SymbolInfoEntity symbolInfoEntity, SymbolInfoEntity symbolInfoEntity2, BalanceEntity balanceEntity, boolean z13, boolean z14, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : coinInfoEntity, (i11 & 2) != 0 ? new AccountInfos(null, null, null, 4, null) : accountInfos, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : map, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & 512) != 0 ? 8 : num, (i11 & 1024) != 0 ? null : list, (i11 & 2048) != 0 ? null : list2, (i11 & 4096) != 0 ? null : bool, (i11 & 8192) != 0 ? false : z12, (i11 & 16384) != 0 ? null : symbolInfoEntity, (i11 & 32768) != 0 ? null : symbolInfoEntity2, (i11 & 65536) != 0 ? null : balanceEntity, (i11 & 131072) != 0 ? true : z13, (i11 & 262144) != 0 ? false : z14, (i11 & 524288) != 0 ? false : z15);
    }
}
