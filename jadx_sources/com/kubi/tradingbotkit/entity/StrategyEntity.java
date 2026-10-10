package com.kubi.tradingbotkit.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: StrategyEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0089\u0001\u008a\u0001B\u009f\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b,\u0010-J\u0006\u0010\u007f\u001a\u00020\u000eJ\u0007\u0010\u0080\u0001\u001a\u00020\u000eJ\u0007\u0010\u0081\u0001\u001a\u00020\u000eJ\u0007\u0010\u0082\u0001\u001a\u00020\u000eJ\t\u0010\u0083\u0001\u001a\u00020\u001eH\u0016J\u001d\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u001eH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010/\"\u0004\b<\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010/\"\u0004\b>\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010/\"\u0004\b@\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010/\"\u0004\bB\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010/\"\u0004\bD\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010/\"\u0004\bJ\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010/\"\u0004\bL\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010/\"\u0004\bN\u00101R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\bO\u00105\"\u0004\bP\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010F\"\u0004\bR\u0010HR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010F\"\u0004\bT\u0010HR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010F\"\u0004\bZ\u0010HR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010[\"\u0004\b\\\u0010]R\u001a\u0010\u001b\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010[\"\u0004\b^\u0010]R\u001a\u0010\u001c\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010[\"\u0004\b_\u0010]R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\be\u0010a\"\u0004\bf\u0010cR\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010/\"\u0004\bh\u00101R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010/\"\u0004\bj\u00101R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010/\"\u0004\bl\u00101R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010/\"\u0004\br\u00101R\u001e\u0010&\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\bs\u00105\"\u0004\bt\u00107R\u001e\u0010'\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\bu\u0010a\"\u0004\bv\u0010cR\u001e\u0010(\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\bw\u0010a\"\u0004\bx\u0010cR\u001c\u0010)\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010F\"\u0004\bz\u0010HR\u001c\u0010*\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010F\"\u0004\b|\u0010HR\u001c\u0010+\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010F\"\u0004\b~\u0010H¨\u0006\u008b\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/StrategyEntity;", "Landroid/os/Parcelable;", "up", "Ljava/math/BigDecimal;", "down", "endTime", "", "startTime", "openUnitPrice", "stopLossPrice", "stopProfitPrice", "strategyProfit", "strategyProfitRate", "symbol", "", "totalCost", "totalProfit", "totalProfitRate", "id", "name", "stopReason", "transfers", "", "Lcom/kubi/tradingbotkit/entity/StrategyEntity$Transfer;", "status", "isOpenUnit", "", "isRisk", "isUpdated", "buyNum", "", "sellNum", "entryPrice", "floatingAmount", "floatingAmountRate", "couponReward", "Lcom/kubi/tradingbotkit/entity/StrategyEntity$CouponReward;", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "startTimeDifference", "dayArbitrageNum", "totalArbitrageNum", "yearProfitRate", "strategyProfitYearRate", "breakEvenPrice", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/tradingbotkit/entity/StrategyEntity$CouponReward;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUp", "()Ljava/math/BigDecimal;", "setUp", "(Ljava/math/BigDecimal;)V", "getDown", "setDown", "getEndTime", "()Ljava/lang/Long;", "setEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getStartTime", "setStartTime", "getOpenUnitPrice", "setOpenUnitPrice", "getStopLossPrice", "setStopLossPrice", "getStopProfitPrice", "setStopProfitPrice", "getStrategyProfit", "setStrategyProfit", "getStrategyProfitRate", "setStrategyProfitRate", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getTotalCost", "setTotalCost", "getTotalProfit", "setTotalProfit", "getTotalProfitRate", "setTotalProfitRate", "getId", "setId", "getName", "setName", "getStopReason", "setStopReason", "getTransfers", "()Ljava/util/List;", "setTransfers", "(Ljava/util/List;)V", "getStatus", "setStatus", "()Z", "setOpenUnit", "(Z)V", "setRisk", "setUpdated", "getBuyNum", "()Ljava/lang/Integer;", "setBuyNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSellNum", "setSellNum", "getEntryPrice", "setEntryPrice", "getFloatingAmount", "setFloatingAmount", "getFloatingAmountRate", "setFloatingAmountRate", "getCouponReward", "()Lcom/kubi/tradingbotkit/entity/StrategyEntity$CouponReward;", "setCouponReward", "(Lcom/kubi/tradingbotkit/entity/StrategyEntity$CouponReward;)V", "getLatestPrice", "setLatestPrice", "getStartTimeDifference", "setStartTimeDifference", "getDayArbitrageNum", "setDayArbitrageNum", "getTotalArbitrageNum", "setTotalArbitrageNum", "getYearProfitRate", "setYearProfitRate", "getStrategyProfitYearRate", "setStrategyProfitYearRate", "getBreakEvenPrice", "setBreakEvenPrice", "getQuoteCode", "getBaseCode", "getQuoteCurrencyName", "getBaseCurrencyName", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Transfer", "CouponReward", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStrategyEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrategyEntity.kt\ncom/kubi/tradingbotkit/entity/StrategyEntity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,147:1\n37#2:148\n36#2,3:149\n37#2:152\n36#2,3:153\n*S KotlinDebug\n*F\n+ 1 StrategyEntity.kt\ncom/kubi/tradingbotkit/entity/StrategyEntity\n*L\n104#1:148\n104#1:149,3\n112#1:152\n112#1:153,3\n*E\n"})
public class StrategyEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StrategyEntity> CREATOR = new C26221a();

    @Nullable
    private String breakEvenPrice;

    @Nullable
    private Integer buyNum;

    @Nullable
    private CouponReward couponReward;

    @Nullable
    private Integer dayArbitrageNum;

    @Nullable
    private BigDecimal down;

    @Nullable
    private Long endTime;

    @Nullable
    private BigDecimal entryPrice;

    @Nullable
    private BigDecimal floatingAmount;

    @Nullable
    private BigDecimal floatingAmountRate;

    @Nullable
    private Long id;
    private boolean isOpenUnit;
    private boolean isRisk;
    private boolean isUpdated;

    @Nullable
    private BigDecimal latestPrice;

    @Nullable
    private String name;

    @Nullable
    private BigDecimal openUnitPrice;

    @Nullable
    private Integer sellNum;

    @Nullable
    private Long startTime;

    @Nullable
    private Long startTimeDifference;

    @Nullable
    private String status;

    @Nullable
    private BigDecimal stopLossPrice;

    @Nullable
    private BigDecimal stopProfitPrice;

    @Nullable
    private String stopReason;

    @Nullable
    private BigDecimal strategyProfit;

    @Nullable
    private BigDecimal strategyProfitRate;

    @Nullable
    private String strategyProfitYearRate;

    @Nullable
    private String symbol;

    @Nullable
    private Integer totalArbitrageNum;

    @Nullable
    private BigDecimal totalCost;

    @Nullable
    private BigDecimal totalProfit;

    @Nullable
    private BigDecimal totalProfitRate;

    @Nullable
    private List<Transfer> transfers;

    @Nullable
    private BigDecimal up;

    @Nullable
    private String yearProfitRate;

    /* JADX INFO: compiled from: StrategyEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017¨\u0006*"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/StrategyEntity$CouponReward;", "Landroid/os/Parcelable;", "couponsId", "", FirebaseAnalytics.Param.CURRENCY, "expiredTime", "", "maxReward", "Ljava/math/BigDecimal;", "name", "rewardSize", "taskId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)V", "getCouponsId", "()Ljava/lang/String;", "setCouponsId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getExpiredTime", "()Ljava/lang/Long;", "setExpiredTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMaxReward", "()Ljava/math/BigDecimal;", "setMaxReward", "(Ljava/math/BigDecimal;)V", "getName", "setName", "getRewardSize", "setRewardSize", "getTaskId", "setTaskId", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CouponReward implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CouponReward> CREATOR = new C26219a();

        @Nullable
        private String couponsId;

        @Nullable
        private String currency;

        @Nullable
        private Long expiredTime;

        @Nullable
        private BigDecimal maxReward;

        @Nullable
        private String name;

        @Nullable
        private BigDecimal rewardSize;

        @Nullable
        private Long taskId;

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.StrategyEntity$CouponReward$a */
        /* JADX INFO: compiled from: StrategyEntity.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C26219a implements Parcelable.Creator<CouponReward> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CouponReward createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CouponReward(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CouponReward[] newArray(int i11) {
                return new CouponReward[i11];
            }
        }

        public CouponReward() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public CouponReward(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable Long l12) {
            this.couponsId = str;
            this.currency = str2;
            this.expiredTime = l11;
            this.maxReward = bigDecimal;
            this.name = str3;
            this.rewardSize = bigDecimal2;
            this.taskId = l12;
        }

        @Nullable
        public final String getCouponsId() {
            return this.couponsId;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final Long getExpiredTime() {
            return this.expiredTime;
        }

        @Nullable
        public final BigDecimal getMaxReward() {
            return this.maxReward;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final BigDecimal getRewardSize() {
            return this.rewardSize;
        }

        @Nullable
        public final Long getTaskId() {
            return this.taskId;
        }

        public final void setCouponsId(@Nullable String str) {
            this.couponsId = str;
        }

        public final void setCurrency(@Nullable String str) {
            this.currency = str;
        }

        public final void setExpiredTime(@Nullable Long l11) {
            this.expiredTime = l11;
        }

        public final void setMaxReward(@Nullable BigDecimal bigDecimal) {
            this.maxReward = bigDecimal;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setRewardSize(@Nullable BigDecimal bigDecimal) {
            this.rewardSize = bigDecimal;
        }

        public final void setTaskId(@Nullable Long l11) {
            this.taskId = l11;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.couponsId);
            dest.writeString(this.currency);
            Long l11 = this.expiredTime;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
            dest.writeSerializable(this.maxReward);
            dest.writeString(this.name);
            dest.writeSerializable(this.rewardSize);
            Long l12 = this.taskId;
            if (l12 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l12.longValue());
            }
        }

        public /* synthetic */ CouponReward(String str, String str2, Long l11, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0L : l11, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? 0L : l12);
        }
    }

    /* JADX INFO: compiled from: StrategyEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/StrategyEntity$Transfer;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "size", "Ljava/math/BigDecimal;", "type", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getSize", "()Ljava/math/BigDecimal;", "setSize", "(Ljava/math/BigDecimal;)V", "getType", "setType", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Transfer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new C26220a();

        @Nullable
        private String currency;

        @Nullable
        private BigDecimal size;

        @Nullable
        private String type;

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.StrategyEntity$Transfer$a */
        /* JADX INFO: compiled from: StrategyEntity.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C26220a implements Parcelable.Creator<Transfer> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Transfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Transfer[] newArray(int i11) {
                return new Transfer[i11];
            }
        }

        public Transfer() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Transfer(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2) {
            this.currency = str;
            this.size = bigDecimal;
            this.type = str2;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final BigDecimal getSize() {
            return this.size;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final void setCurrency(@Nullable String str) {
            this.currency = str;
        }

        public final void setSize(@Nullable BigDecimal bigDecimal) {
            this.size = bigDecimal;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.currency);
            dest.writeSerializable(this.size);
            dest.writeString(this.type);
        }

        public /* synthetic */ Transfer(String str, BigDecimal bigDecimal, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 4) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.StrategyEntity$a */
    /* JADX INFO: compiled from: StrategyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26221a implements Parcelable.Creator<StrategyEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StrategyEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int i12 = 0;
                while (i12 != i11) {
                    arrayList.add(Transfer.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
            }
            String string4 = parcel.readString();
            boolean z11 = true;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            return new StrategyEntity(bigDecimal, bigDecimal2, lValueOf, lValueOf2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, string, bigDecimal8, bigDecimal9, bigDecimal10, lValueOf3, string2, string3, arrayList, string4, z12, z11, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? CouponReward.CREATOR.createFromParcel(parcel) : null, (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StrategyEntity[] newArray(int i11) {
            return new StrategyEntity[i11];
        }
    }

    public StrategyEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StrategyEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Long l11, @Nullable Long l12, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable Long l13, @Nullable String str2, @Nullable String str3, @Nullable List<Transfer> list, @Nullable String str4, boolean z11, boolean z12, boolean z13, @Nullable Integer num, @Nullable Integer num2, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable CouponReward couponReward, @Nullable BigDecimal bigDecimal14, @Nullable Long l14, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.up = bigDecimal;
        this.down = bigDecimal2;
        this.endTime = l11;
        this.startTime = l12;
        this.openUnitPrice = bigDecimal3;
        this.stopLossPrice = bigDecimal4;
        this.stopProfitPrice = bigDecimal5;
        this.strategyProfit = bigDecimal6;
        this.strategyProfitRate = bigDecimal7;
        this.symbol = str;
        this.totalCost = bigDecimal8;
        this.totalProfit = bigDecimal9;
        this.totalProfitRate = bigDecimal10;
        this.id = l13;
        this.name = str2;
        this.stopReason = str3;
        this.transfers = list;
        this.status = str4;
        this.isOpenUnit = z11;
        this.isRisk = z12;
        this.isUpdated = z13;
        this.buyNum = num;
        this.sellNum = num2;
        this.entryPrice = bigDecimal11;
        this.floatingAmount = bigDecimal12;
        this.floatingAmountRate = bigDecimal13;
        this.couponReward = couponReward;
        this.latestPrice = bigDecimal14;
        this.startTimeDifference = l14;
        this.dayArbitrageNum = num3;
        this.totalArbitrageNum = num4;
        this.yearProfitRate = str5;
        this.strategyProfitYearRate = str6;
        this.breakEvenPrice = str7;
    }

    @NotNull
    public final String getBaseCode() {
        String str = this.symbol;
        return str != null ? ((String[]) StringsKt.split$default((CharSequence) str, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null).toArray(new String[0]))[0] : "";
    }

    @NotNull
    public final String getBaseCurrencyName() {
        String str = this.symbol;
        if (str == null) {
            return "- -";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        return C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getBaseCurrencyName() : null);
    }

    @Nullable
    public final String getBreakEvenPrice() {
        return this.breakEvenPrice;
    }

    @Nullable
    public final Integer getBuyNum() {
        return this.buyNum;
    }

    @Nullable
    public final CouponReward getCouponReward() {
        return this.couponReward;
    }

    @Nullable
    public final Integer getDayArbitrageNum() {
        return this.dayArbitrageNum;
    }

    @Nullable
    public final BigDecimal getDown() {
        return this.down;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final BigDecimal getEntryPrice() {
        return this.entryPrice;
    }

    @Nullable
    public final BigDecimal getFloatingAmount() {
        return this.floatingAmount;
    }

    @Nullable
    public final BigDecimal getFloatingAmountRate() {
        return this.floatingAmountRate;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final BigDecimal getOpenUnitPrice() {
        return this.openUnitPrice;
    }

    @NotNull
    public final String getQuoteCode() {
        String str = this.symbol;
        if (str == null) {
            return "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null);
        return listSplit$default.size() > 1 ? ((String[]) listSplit$default.toArray(new String[0]))[1] : "";
    }

    @NotNull
    public final String getQuoteCurrencyName() {
        String str = this.symbol;
        if (str == null) {
            return "- -";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        return C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getQuoteCurrencyName() : null);
    }

    @Nullable
    public final Integer getSellNum() {
        return this.sellNum;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Long getStartTimeDifference() {
        return this.startTimeDifference;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final BigDecimal getStopLossPrice() {
        return this.stopLossPrice;
    }

    @Nullable
    public final BigDecimal getStopProfitPrice() {
        return this.stopProfitPrice;
    }

    @Nullable
    public final String getStopReason() {
        return this.stopReason;
    }

    @Nullable
    public final BigDecimal getStrategyProfit() {
        return this.strategyProfit;
    }

    @Nullable
    public final BigDecimal getStrategyProfitRate() {
        return this.strategyProfitRate;
    }

    @Nullable
    public final String getStrategyProfitYearRate() {
        return this.strategyProfitYearRate;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Integer getTotalArbitrageNum() {
        return this.totalArbitrageNum;
    }

    @Nullable
    public final BigDecimal getTotalCost() {
        return this.totalCost;
    }

    @Nullable
    public final BigDecimal getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    public final BigDecimal getTotalProfitRate() {
        return this.totalProfitRate;
    }

    @Nullable
    public final List<Transfer> getTransfers() {
        return this.transfers;
    }

    @Nullable
    public final BigDecimal getUp() {
        return this.up;
    }

    @Nullable
    public final String getYearProfitRate() {
        return this.yearProfitRate;
    }

    /* JADX INFO: renamed from: isOpenUnit, reason: from getter */
    public final boolean getIsOpenUnit() {
        return this.isOpenUnit;
    }

    /* JADX INFO: renamed from: isRisk, reason: from getter */
    public final boolean getIsRisk() {
        return this.isRisk;
    }

    /* JADX INFO: renamed from: isUpdated, reason: from getter */
    public final boolean getIsUpdated() {
        return this.isUpdated;
    }

    public final void setBreakEvenPrice(@Nullable String str) {
        this.breakEvenPrice = str;
    }

    public final void setBuyNum(@Nullable Integer num) {
        this.buyNum = num;
    }

    public final void setCouponReward(@Nullable CouponReward couponReward) {
        this.couponReward = couponReward;
    }

    public final void setDayArbitrageNum(@Nullable Integer num) {
        this.dayArbitrageNum = num;
    }

    public final void setDown(@Nullable BigDecimal bigDecimal) {
        this.down = bigDecimal;
    }

    public final void setEndTime(@Nullable Long l11) {
        this.endTime = l11;
    }

    public final void setEntryPrice(@Nullable BigDecimal bigDecimal) {
        this.entryPrice = bigDecimal;
    }

    public final void setFloatingAmount(@Nullable BigDecimal bigDecimal) {
        this.floatingAmount = bigDecimal;
    }

    public final void setFloatingAmountRate(@Nullable BigDecimal bigDecimal) {
        this.floatingAmountRate = bigDecimal;
    }

    public final void setId(@Nullable Long l11) {
        this.id = l11;
    }

    public final void setLatestPrice(@Nullable BigDecimal bigDecimal) {
        this.latestPrice = bigDecimal;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOpenUnit(boolean z11) {
        this.isOpenUnit = z11;
    }

    public final void setOpenUnitPrice(@Nullable BigDecimal bigDecimal) {
        this.openUnitPrice = bigDecimal;
    }

    public final void setRisk(boolean z11) {
        this.isRisk = z11;
    }

    public final void setSellNum(@Nullable Integer num) {
        this.sellNum = num;
    }

    public final void setStartTime(@Nullable Long l11) {
        this.startTime = l11;
    }

    public final void setStartTimeDifference(@Nullable Long l11) {
        this.startTimeDifference = l11;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setStopLossPrice(@Nullable BigDecimal bigDecimal) {
        this.stopLossPrice = bigDecimal;
    }

    public final void setStopProfitPrice(@Nullable BigDecimal bigDecimal) {
        this.stopProfitPrice = bigDecimal;
    }

    public final void setStopReason(@Nullable String str) {
        this.stopReason = str;
    }

    public final void setStrategyProfit(@Nullable BigDecimal bigDecimal) {
        this.strategyProfit = bigDecimal;
    }

    public final void setStrategyProfitRate(@Nullable BigDecimal bigDecimal) {
        this.strategyProfitRate = bigDecimal;
    }

    public final void setStrategyProfitYearRate(@Nullable String str) {
        this.strategyProfitYearRate = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTotalArbitrageNum(@Nullable Integer num) {
        this.totalArbitrageNum = num;
    }

    public final void setTotalCost(@Nullable BigDecimal bigDecimal) {
        this.totalCost = bigDecimal;
    }

    public final void setTotalProfit(@Nullable BigDecimal bigDecimal) {
        this.totalProfit = bigDecimal;
    }

    public final void setTotalProfitRate(@Nullable BigDecimal bigDecimal) {
        this.totalProfitRate = bigDecimal;
    }

    public final void setTransfers(@Nullable List<Transfer> list) {
        this.transfers = list;
    }

    public final void setUp(@Nullable BigDecimal bigDecimal) {
        this.up = bigDecimal;
    }

    public final void setUpdated(boolean z11) {
        this.isUpdated = z11;
    }

    public final void setYearProfitRate(@Nullable String str) {
        this.yearProfitRate = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.up);
        dest.writeSerializable(this.down);
        Long l11 = this.endTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.startTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeSerializable(this.openUnitPrice);
        dest.writeSerializable(this.stopLossPrice);
        dest.writeSerializable(this.stopProfitPrice);
        dest.writeSerializable(this.strategyProfit);
        dest.writeSerializable(this.strategyProfitRate);
        dest.writeString(this.symbol);
        dest.writeSerializable(this.totalCost);
        dest.writeSerializable(this.totalProfit);
        dest.writeSerializable(this.totalProfitRate);
        Long l13 = this.id;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.stopReason);
        List<Transfer> list = this.transfers;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Transfer> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.status);
        dest.writeInt(this.isOpenUnit ? 1 : 0);
        dest.writeInt(this.isRisk ? 1 : 0);
        dest.writeInt(this.isUpdated ? 1 : 0);
        Integer num = this.buyNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.sellNum;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeSerializable(this.entryPrice);
        dest.writeSerializable(this.floatingAmount);
        dest.writeSerializable(this.floatingAmountRate);
        CouponReward couponReward = this.couponReward;
        if (couponReward == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            couponReward.writeToParcel(dest, flags);
        }
        dest.writeSerializable(this.latestPrice);
        Long l14 = this.startTimeDifference;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        Integer num3 = this.dayArbitrageNum;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.totalArbitrageNum;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        dest.writeString(this.yearProfitRate);
        dest.writeString(this.strategyProfitYearRate);
        dest.writeString(this.breakEvenPrice);
    }

    public /* synthetic */ StrategyEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l11, Long l12, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Long l13, String str2, String str3, List list, String str4, boolean z11, boolean z12, boolean z13, Integer num, Integer num2, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, CouponReward couponReward, BigDecimal bigDecimal14, Long l14, Integer num3, Integer num4, String str5, String str6, String str7, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? BigDecimal.ZERO : bigDecimal3, (i11 & 32) != 0 ? BigDecimal.ZERO : bigDecimal4, (i11 & 64) != 0 ? BigDecimal.ZERO : bigDecimal5, (i11 & 128) != 0 ? BigDecimal.ZERO : bigDecimal6, (i11 & 256) != 0 ? BigDecimal.ZERO : bigDecimal7, (i11 & 512) != 0 ? "" : str, (i11 & 1024) != 0 ? BigDecimal.ZERO : bigDecimal8, (i11 & 2048) != 0 ? BigDecimal.ZERO : bigDecimal9, (i11 & 4096) != 0 ? BigDecimal.ZERO : bigDecimal10, (i11 & 8192) != 0 ? 0L : l13, (i11 & 16384) == 0 ? str2 : "", (32768 & i11) != 0 ? null : str3, (i11 & 65536) != 0 ? null : list, (i11 & 131072) != 0 ? "PREPARING" : str4, (i11 & 262144) != 0 ? false : z11, (i11 & 524288) != 0 ? false : z12, (i11 & 1048576) != 0 ? false : z13, (i11 & 2097152) != 0 ? 0 : num, (i11 & 4194304) != 0 ? 0 : num2, (i11 & 8388608) != 0 ? BigDecimal.ZERO : bigDecimal11, (i11 & 16777216) != 0 ? BigDecimal.ZERO : bigDecimal12, (i11 & 33554432) != 0 ? BigDecimal.ZERO : bigDecimal13, (i11 & 67108864) != 0 ? null : couponReward, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? BigDecimal.ZERO : bigDecimal14, (i11 & 268435456) != 0 ? null : l14, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : num3, (i11 & 1073741824) != 0 ? null : num4, (i11 & Integer.MIN_VALUE) != 0 ? null : str5, (i12 & 1) != 0 ? null : str6, (i12 & 2) != 0 ? null : str7);
    }
}
