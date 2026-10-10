package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesTrialEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\\\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b'\u0010(J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010^\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010h\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010i\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018HÆ\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010s\u001a\u00020!HÆ\u0003J\u0010\u0010t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010u\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0002\u0010NJ\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008c\u0003\u0010y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010zJ\u0006\u0010{\u001a\u00020\u0013J\u0013\u0010|\u001a\u00020!2\b\u0010}\u001a\u0004\u0018\u00010~HÖ\u0003J\t\u0010\u007f\u001a\u00020\u0013HÖ\u0001J\n\u0010\u0080\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010.\u001a\u0004\b/\u0010-R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010.\u001a\u0004\b0\u0010-R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010<\u001a\u0004\b=\u0010;R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010*R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010.\u001a\u0004\bM\u0010-R\u001e\u0010#\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\b#\u0010N\"\u0004\bO\u0010PR\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010*\"\u0004\bS\u0010TR\u001e\u0010%\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\bU\u0010;\"\u0004\bV\u0010WR\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010*\"\u0004\bY\u0010T¨\u0006\u0086\u0001"}, m90084d2 = {"Lcom/kubi/assets/entity/FuturesTrialItemEntity;", "Landroid/os/Parcelable;", "code", "", "status", "validPeriod", "", "activateValidPeriod", "expiredPeriod", FirebaseAnalytics.Param.CURRENCY, "faceValue", "Ljava/math/BigDecimal;", "withdrawnValue", "availableCashAmount", "realisedPNL", "type", "minTotalAmount", "totalAmount", "tradeNum", "", "minTradeNum", "maxValue", "minValue", "contractList", "", "supportedContracts", "maxLeverage", "trialFundBalance", "ruleUrl", "ruleText", "withDrawHelpText", "minCloseRealisedPnl", "checked", "", "recycleAt", "isLoading", "prizeType", "useDurition", "marginMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getStatus", "getValidPeriod", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getActivateValidPeriod", "getExpiredPeriod", "getCurrency", "getFaceValue", "()Ljava/math/BigDecimal;", "getWithdrawnValue", "getAvailableCashAmount", "getRealisedPNL", "getType", "getMinTotalAmount", "getTotalAmount", "getTradeNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinTradeNum", "getMaxValue", "getMinValue", "getContractList", "()Ljava/util/List;", "getSupportedContracts", "getMaxLeverage", "getTrialFundBalance", "getRuleUrl", "getRuleText", "getWithDrawHelpText", "getMinCloseRealisedPnl", "getChecked", "()Z", "setChecked", "(Z)V", "getRecycleAt", "()Ljava/lang/Boolean;", "setLoading", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPrizeType", "setPrizeType", "(Ljava/lang/String;)V", "getUseDurition", "setUseDurition", "(Ljava/lang/Integer;)V", "getMarginMode", "setMarginMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/assets/entity/FuturesTrialItemEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesTrialItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesTrialItemEntity> CREATOR = new Creator();

    @Nullable
    private final Long activateValidPeriod;

    @Nullable
    private final BigDecimal availableCashAmount;
    private boolean checked;

    @Nullable
    private final String code;

    @Nullable
    private final List<String> contractList;

    @Nullable
    private final String currency;

    @Nullable
    private final Long expiredPeriod;

    @Nullable
    private final BigDecimal faceValue;

    @Nullable
    private Boolean isLoading;

    @Nullable
    private String marginMode;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final BigDecimal maxValue;

    @Nullable
    private final BigDecimal minCloseRealisedPnl;

    @Nullable
    private final BigDecimal minTotalAmount;

    @Nullable
    private final Integer minTradeNum;

    @Nullable
    private final BigDecimal minValue;

    @Nullable
    private String prizeType;

    @Nullable
    private final BigDecimal realisedPNL;

    @Nullable
    private final Long recycleAt;

    @Nullable
    private final String ruleText;

    @Nullable
    private final String ruleUrl;

    @Nullable
    private final String status;

    @Nullable
    private final List<String> supportedContracts;

    @Nullable
    private final BigDecimal totalAmount;

    @Nullable
    private final Integer tradeNum;

    @Nullable
    private final BigDecimal trialFundBalance;

    @Nullable
    private final String type;

    @Nullable
    private Integer useDurition;

    @Nullable
    private final Long validPeriod;

    @Nullable
    private final String withDrawHelpText;

    @Nullable
    private final BigDecimal withdrawnValue;

    /* JADX INFO: compiled from: FuturesTrialEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FuturesTrialItemEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesTrialItemEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            String string4 = parcel.readString();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            boolean z11 = parcel.readInt() != 0;
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FuturesTrialItemEntity(string, string2, lValueOf, lValueOf2, lValueOf3, string3, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, string4, bigDecimal5, bigDecimal6, numValueOf, numValueOf2, bigDecimal7, bigDecimal8, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, bigDecimal9, bigDecimal10, string5, string6, string7, bigDecimal11, z11, lValueOf4, boolValueOf, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesTrialItemEntity[] newArray(int i11) {
            return new FuturesTrialItemEntity[i11];
        }
    }

    public FuturesTrialItemEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable Integer num, @Nullable Integer num2, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable List<String> list, @Nullable List<String> list2, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable BigDecimal bigDecimal11, boolean z11, @Nullable Long l14, @Nullable Boolean bool, @Nullable String str8, @Nullable Integer num3, @Nullable String str9) {
        this.code = str;
        this.status = str2;
        this.validPeriod = l11;
        this.activateValidPeriod = l12;
        this.expiredPeriod = l13;
        this.currency = str3;
        this.faceValue = bigDecimal;
        this.withdrawnValue = bigDecimal2;
        this.availableCashAmount = bigDecimal3;
        this.realisedPNL = bigDecimal4;
        this.type = str4;
        this.minTotalAmount = bigDecimal5;
        this.totalAmount = bigDecimal6;
        this.tradeNum = num;
        this.minTradeNum = num2;
        this.maxValue = bigDecimal7;
        this.minValue = bigDecimal8;
        this.contractList = list;
        this.supportedContracts = list2;
        this.maxLeverage = bigDecimal9;
        this.trialFundBalance = bigDecimal10;
        this.ruleUrl = str5;
        this.ruleText = str6;
        this.withDrawHelpText = str7;
        this.minCloseRealisedPnl = bigDecimal11;
        this.checked = z11;
        this.recycleAt = l14;
        this.isLoading = bool;
        this.prizeType = str8;
        this.useDurition = num3;
        this.marginMode = str9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesTrialItemEntity copy$default(FuturesTrialItemEntity futuresTrialItemEntity, String str, String str2, Long l11, Long l12, Long l13, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, Integer num, Integer num2, BigDecimal bigDecimal7, BigDecimal bigDecimal8, List list, List list2, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str5, String str6, String str7, BigDecimal bigDecimal11, boolean z11, Long l14, Boolean bool, String str8, Integer num3, String str9, int i11, Object obj) {
        String str10;
        Integer num4;
        String str11 = (i11 & 1) != 0 ? futuresTrialItemEntity.code : str;
        String str12 = (i11 & 2) != 0 ? futuresTrialItemEntity.status : str2;
        Long l15 = (i11 & 4) != 0 ? futuresTrialItemEntity.validPeriod : l11;
        Long l16 = (i11 & 8) != 0 ? futuresTrialItemEntity.activateValidPeriod : l12;
        Long l17 = (i11 & 16) != 0 ? futuresTrialItemEntity.expiredPeriod : l13;
        String str13 = (i11 & 32) != 0 ? futuresTrialItemEntity.currency : str3;
        BigDecimal bigDecimal12 = (i11 & 64) != 0 ? futuresTrialItemEntity.faceValue : bigDecimal;
        BigDecimal bigDecimal13 = (i11 & 128) != 0 ? futuresTrialItemEntity.withdrawnValue : bigDecimal2;
        BigDecimal bigDecimal14 = (i11 & 256) != 0 ? futuresTrialItemEntity.availableCashAmount : bigDecimal3;
        BigDecimal bigDecimal15 = (i11 & 512) != 0 ? futuresTrialItemEntity.realisedPNL : bigDecimal4;
        String str14 = (i11 & 1024) != 0 ? futuresTrialItemEntity.type : str4;
        BigDecimal bigDecimal16 = (i11 & 2048) != 0 ? futuresTrialItemEntity.minTotalAmount : bigDecimal5;
        BigDecimal bigDecimal17 = (i11 & 4096) != 0 ? futuresTrialItemEntity.totalAmount : bigDecimal6;
        Integer num5 = (i11 & 8192) != 0 ? futuresTrialItemEntity.tradeNum : num;
        String str15 = str11;
        Integer num6 = (i11 & 16384) != 0 ? futuresTrialItemEntity.minTradeNum : num2;
        BigDecimal bigDecimal18 = (i11 & 32768) != 0 ? futuresTrialItemEntity.maxValue : bigDecimal7;
        BigDecimal bigDecimal19 = (i11 & 65536) != 0 ? futuresTrialItemEntity.minValue : bigDecimal8;
        List list3 = (i11 & 131072) != 0 ? futuresTrialItemEntity.contractList : list;
        List list4 = (i11 & 262144) != 0 ? futuresTrialItemEntity.supportedContracts : list2;
        BigDecimal bigDecimal20 = (i11 & 524288) != 0 ? futuresTrialItemEntity.maxLeverage : bigDecimal9;
        BigDecimal bigDecimal21 = (i11 & 1048576) != 0 ? futuresTrialItemEntity.trialFundBalance : bigDecimal10;
        String str16 = (i11 & 2097152) != 0 ? futuresTrialItemEntity.ruleUrl : str5;
        String str17 = (i11 & 4194304) != 0 ? futuresTrialItemEntity.ruleText : str6;
        String str18 = (i11 & 8388608) != 0 ? futuresTrialItemEntity.withDrawHelpText : str7;
        BigDecimal bigDecimal22 = (i11 & 16777216) != 0 ? futuresTrialItemEntity.minCloseRealisedPnl : bigDecimal11;
        boolean z12 = (i11 & 33554432) != 0 ? futuresTrialItemEntity.checked : z11;
        Long l18 = (i11 & 67108864) != 0 ? futuresTrialItemEntity.recycleAt : l14;
        Boolean bool2 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? futuresTrialItemEntity.isLoading : bool;
        String str19 = (i11 & 268435456) != 0 ? futuresTrialItemEntity.prizeType : str8;
        Integer num7 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? futuresTrialItemEntity.useDurition : num3;
        if ((i11 & 1073741824) != 0) {
            num4 = num7;
            str10 = futuresTrialItemEntity.marginMode;
        } else {
            str10 = str9;
            num4 = num7;
        }
        return futuresTrialItemEntity.copy(str15, str12, l15, l16, l17, str13, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, str14, bigDecimal16, bigDecimal17, num5, num6, bigDecimal18, bigDecimal19, list3, list4, bigDecimal20, bigDecimal21, str16, str17, str18, bigDecimal22, z12, l18, bool2, str19, num4, str10);
    }

    @NotNull
    public final FuturesTrialItemEntity copy(@Nullable String code, @Nullable String status, @Nullable Long validPeriod, @Nullable Long activateValidPeriod, @Nullable Long expiredPeriod, @Nullable String currency, @Nullable BigDecimal faceValue, @Nullable BigDecimal withdrawnValue, @Nullable BigDecimal availableCashAmount, @Nullable BigDecimal realisedPNL, @Nullable String type, @Nullable BigDecimal minTotalAmount, @Nullable BigDecimal totalAmount, @Nullable Integer tradeNum, @Nullable Integer minTradeNum, @Nullable BigDecimal maxValue, @Nullable BigDecimal minValue, @Nullable List<String> contractList, @Nullable List<String> supportedContracts, @Nullable BigDecimal maxLeverage, @Nullable BigDecimal trialFundBalance, @Nullable String ruleUrl, @Nullable String ruleText, @Nullable String withDrawHelpText, @Nullable BigDecimal minCloseRealisedPnl, boolean checked, @Nullable Long recycleAt, @Nullable Boolean isLoading, @Nullable String prizeType, @Nullable Integer useDurition, @Nullable String marginMode) {
        return new FuturesTrialItemEntity(code, status, validPeriod, activateValidPeriod, expiredPeriod, currency, faceValue, withdrawnValue, availableCashAmount, realisedPNL, type, minTotalAmount, totalAmount, tradeNum, minTradeNum, maxValue, minValue, contractList, supportedContracts, maxLeverage, trialFundBalance, ruleUrl, ruleText, withDrawHelpText, minCloseRealisedPnl, checked, recycleAt, isLoading, prizeType, useDurition, marginMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesTrialItemEntity)) {
            return false;
        }
        FuturesTrialItemEntity futuresTrialItemEntity = (FuturesTrialItemEntity) other;
        return Intrinsics.areEqual(this.code, futuresTrialItemEntity.code) && Intrinsics.areEqual(this.status, futuresTrialItemEntity.status) && Intrinsics.areEqual(this.validPeriod, futuresTrialItemEntity.validPeriod) && Intrinsics.areEqual(this.activateValidPeriod, futuresTrialItemEntity.activateValidPeriod) && Intrinsics.areEqual(this.expiredPeriod, futuresTrialItemEntity.expiredPeriod) && Intrinsics.areEqual(this.currency, futuresTrialItemEntity.currency) && Intrinsics.areEqual(this.faceValue, futuresTrialItemEntity.faceValue) && Intrinsics.areEqual(this.withdrawnValue, futuresTrialItemEntity.withdrawnValue) && Intrinsics.areEqual(this.availableCashAmount, futuresTrialItemEntity.availableCashAmount) && Intrinsics.areEqual(this.realisedPNL, futuresTrialItemEntity.realisedPNL) && Intrinsics.areEqual(this.type, futuresTrialItemEntity.type) && Intrinsics.areEqual(this.minTotalAmount, futuresTrialItemEntity.minTotalAmount) && Intrinsics.areEqual(this.totalAmount, futuresTrialItemEntity.totalAmount) && Intrinsics.areEqual(this.tradeNum, futuresTrialItemEntity.tradeNum) && Intrinsics.areEqual(this.minTradeNum, futuresTrialItemEntity.minTradeNum) && Intrinsics.areEqual(this.maxValue, futuresTrialItemEntity.maxValue) && Intrinsics.areEqual(this.minValue, futuresTrialItemEntity.minValue) && Intrinsics.areEqual(this.contractList, futuresTrialItemEntity.contractList) && Intrinsics.areEqual(this.supportedContracts, futuresTrialItemEntity.supportedContracts) && Intrinsics.areEqual(this.maxLeverage, futuresTrialItemEntity.maxLeverage) && Intrinsics.areEqual(this.trialFundBalance, futuresTrialItemEntity.trialFundBalance) && Intrinsics.areEqual(this.ruleUrl, futuresTrialItemEntity.ruleUrl) && Intrinsics.areEqual(this.ruleText, futuresTrialItemEntity.ruleText) && Intrinsics.areEqual(this.withDrawHelpText, futuresTrialItemEntity.withDrawHelpText) && Intrinsics.areEqual(this.minCloseRealisedPnl, futuresTrialItemEntity.minCloseRealisedPnl) && this.checked == futuresTrialItemEntity.checked && Intrinsics.areEqual(this.recycleAt, futuresTrialItemEntity.recycleAt) && Intrinsics.areEqual(this.isLoading, futuresTrialItemEntity.isLoading) && Intrinsics.areEqual(this.prizeType, futuresTrialItemEntity.prizeType) && Intrinsics.areEqual(this.useDurition, futuresTrialItemEntity.useDurition) && Intrinsics.areEqual(this.marginMode, futuresTrialItemEntity.marginMode);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getRealisedPNL() {
        return this.realisedPNL;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getMinTotalAmount() {
        return this.minTotalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getTradeNum() {
        return this.tradeNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getMinTradeNum() {
        return this.minTradeNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getMinValue() {
        return this.minValue;
    }

    @Nullable
    public final List<String> component18() {
        return this.contractList;
    }

    @Nullable
    public final List<String> component19() {
        return this.supportedContracts;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getTrialFundBalance() {
        return this.trialFundBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRuleUrl() {
        return this.ruleUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRuleText() {
        return this.ruleText;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getWithDrawHelpText() {
        return this.withDrawHelpText;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BigDecimal getMinCloseRealisedPnl() {
        return this.minCloseRealisedPnl;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getRecycleAt() {
        return this.recycleAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getIsLoading() {
        return this.isLoading;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getValidPeriod() {
        return this.validPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getUseDurition() {
        return this.useDurition;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getActivateValidPeriod() {
        return this.activateValidPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getExpiredPeriod() {
        return this.expiredPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getWithdrawnValue() {
        return this.withdrawnValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getAvailableCashAmount() {
        return this.availableCashAmount;
    }

    @Nullable
    public final Long getActivateValidPeriod() {
        return this.activateValidPeriod;
    }

    @Nullable
    public final BigDecimal getAvailableCashAmount() {
        return this.availableCashAmount;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final List<String> getContractList() {
        return this.contractList;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getExpiredPeriod() {
        return this.expiredPeriod;
    }

    @Nullable
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final BigDecimal getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    public final BigDecimal getMinCloseRealisedPnl() {
        return this.minCloseRealisedPnl;
    }

    @Nullable
    public final BigDecimal getMinTotalAmount() {
        return this.minTotalAmount;
    }

    @Nullable
    public final Integer getMinTradeNum() {
        return this.minTradeNum;
    }

    @Nullable
    public final BigDecimal getMinValue() {
        return this.minValue;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final BigDecimal getRealisedPNL() {
        return this.realisedPNL;
    }

    @Nullable
    public final Long getRecycleAt() {
        return this.recycleAt;
    }

    @Nullable
    public final String getRuleText() {
        return this.ruleText;
    }

    @Nullable
    public final String getRuleUrl() {
        return this.ruleUrl;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> getSupportedContracts() {
        return this.supportedContracts;
    }

    @Nullable
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final Integer getTradeNum() {
        return this.tradeNum;
    }

    @Nullable
    public final BigDecimal getTrialFundBalance() {
        return this.trialFundBalance;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getUseDurition() {
        return this.useDurition;
    }

    @Nullable
    public final Long getValidPeriod() {
        return this.validPeriod;
    }

    @Nullable
    public final String getWithDrawHelpText() {
        return this.withDrawHelpText;
    }

    @Nullable
    public final BigDecimal getWithdrawnValue() {
        return this.withdrawnValue;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.validPeriod;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.activateValidPeriod;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.expiredPeriod;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.faceValue;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.withdrawnValue;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.availableCashAmount;
        int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.realisedPNL;
        int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.minTotalAmount;
        int iHashCode12 = (iHashCode11 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalAmount;
        int iHashCode13 = (iHashCode12 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        Integer num = this.tradeNum;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minTradeNum;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.maxValue;
        int iHashCode16 = (iHashCode15 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.minValue;
        int iHashCode17 = (iHashCode16 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        List<String> list = this.contractList;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.supportedContracts;
        int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.maxLeverage;
        int iHashCode20 = (iHashCode19 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.trialFundBalance;
        int iHashCode21 = (iHashCode20 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        String str5 = this.ruleUrl;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ruleText;
        int iHashCode23 = (iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.withDrawHelpText;
        int iHashCode24 = (iHashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.minCloseRealisedPnl;
        int iHashCode25 = (((iHashCode24 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31) + Boolean.hashCode(this.checked)) * 31;
        Long l14 = this.recycleAt;
        int iHashCode26 = (iHashCode25 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool = this.isLoading;
        int iHashCode27 = (iHashCode26 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.prizeType;
        int iHashCode28 = (iHashCode27 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.useDurition;
        int iHashCode29 = (iHashCode28 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.marginMode;
        return iHashCode29 + (str9 != null ? str9.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLoading() {
        return this.isLoading;
    }

    public final void setChecked(boolean z11) {
        this.checked = z11;
    }

    public final void setLoading(@Nullable Boolean bool) {
        this.isLoading = bool;
    }

    public final void setMarginMode(@Nullable String str) {
        this.marginMode = str;
    }

    public final void setPrizeType(@Nullable String str) {
        this.prizeType = str;
    }

    public final void setUseDurition(@Nullable Integer num) {
        this.useDurition = num;
    }

    @NotNull
    public String toString() {
        return "FuturesTrialItemEntity(code=" + this.code + ", status=" + this.status + ", validPeriod=" + this.validPeriod + ", activateValidPeriod=" + this.activateValidPeriod + ", expiredPeriod=" + this.expiredPeriod + ", currency=" + this.currency + ", faceValue=" + this.faceValue + ", withdrawnValue=" + this.withdrawnValue + ", availableCashAmount=" + this.availableCashAmount + ", realisedPNL=" + this.realisedPNL + ", type=" + this.type + ", minTotalAmount=" + this.minTotalAmount + ", totalAmount=" + this.totalAmount + ", tradeNum=" + this.tradeNum + ", minTradeNum=" + this.minTradeNum + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", contractList=" + this.contractList + ", supportedContracts=" + this.supportedContracts + ", maxLeverage=" + this.maxLeverage + ", trialFundBalance=" + this.trialFundBalance + ", ruleUrl=" + this.ruleUrl + ", ruleText=" + this.ruleText + ", withDrawHelpText=" + this.withDrawHelpText + ", minCloseRealisedPnl=" + this.minCloseRealisedPnl + ", checked=" + this.checked + ", recycleAt=" + this.recycleAt + ", isLoading=" + this.isLoading + ", prizeType=" + this.prizeType + ", useDurition=" + this.useDurition + ", marginMode=" + this.marginMode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.status);
        Long l11 = this.validPeriod;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.activateValidPeriod;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Long l13 = this.expiredPeriod;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeString(this.currency);
        dest.writeSerializable(this.faceValue);
        dest.writeSerializable(this.withdrawnValue);
        dest.writeSerializable(this.availableCashAmount);
        dest.writeSerializable(this.realisedPNL);
        dest.writeString(this.type);
        dest.writeSerializable(this.minTotalAmount);
        dest.writeSerializable(this.totalAmount);
        Integer num = this.tradeNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.minTradeNum;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeSerializable(this.maxValue);
        dest.writeSerializable(this.minValue);
        dest.writeStringList(this.contractList);
        dest.writeStringList(this.supportedContracts);
        dest.writeSerializable(this.maxLeverage);
        dest.writeSerializable(this.trialFundBalance);
        dest.writeString(this.ruleUrl);
        dest.writeString(this.ruleText);
        dest.writeString(this.withDrawHelpText);
        dest.writeSerializable(this.minCloseRealisedPnl);
        dest.writeInt(this.checked ? 1 : 0);
        Long l14 = this.recycleAt;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        Boolean bool = this.isLoading;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.prizeType);
        Integer num3 = this.useDurition;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.marginMode);
    }

    public /* synthetic */ FuturesTrialItemEntity(String str, String str2, Long l11, Long l12, Long l13, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, Integer num, Integer num2, BigDecimal bigDecimal7, BigDecimal bigDecimal8, List list, List list2, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str5, String str6, String str7, BigDecimal bigDecimal11, boolean z11, Long l14, Boolean bool, String str8, Integer num3, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : l13, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : bigDecimal, (i11 & 128) != 0 ? null : bigDecimal2, (i11 & 256) != 0 ? null : bigDecimal3, (i11 & 512) != 0 ? null : bigDecimal4, str4, (i11 & 2048) != 0 ? null : bigDecimal5, (i11 & 4096) != 0 ? null : bigDecimal6, (i11 & 8192) != 0 ? null : num, (i11 & 16384) != 0 ? null : num2, (32768 & i11) != 0 ? null : bigDecimal7, (65536 & i11) != 0 ? null : bigDecimal8, (131072 & i11) != 0 ? null : list, (262144 & i11) != 0 ? null : list2, (524288 & i11) != 0 ? null : bigDecimal9, (1048576 & i11) != 0 ? null : bigDecimal10, (2097152 & i11) != 0 ? null : str5, (4194304 & i11) != 0 ? null : str6, (8388608 & i11) != 0 ? null : str7, (16777216 & i11) != 0 ? null : bigDecimal11, (33554432 & i11) != 0 ? false : z11, (67108864 & i11) != 0 ? null : l14, (134217728 & i11) != 0 ? Boolean.FALSE : bool, (268435456 & i11) != 0 ? null : str8, (536870912 & i11) != 0 ? null : num3, (i11 & 1073741824) != 0 ? null : str9);
    }
}
