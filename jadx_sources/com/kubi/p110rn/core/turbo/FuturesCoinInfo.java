package com.kubi.p110rn.core.turbo;

import androidx.media3.common.C2711C;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSymbolsCoinTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bã\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\"J\b\u00107\u001a\u000208H\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010Q\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010R\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010S\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010T\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jê\u0002\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u00020\u001b2\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\t\u0010[\u001a\u00020\\HÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010$R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010$R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u001a\u00104R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u001c\u00104R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u001d\u00104R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u001e\u00104R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u001f\u00104R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$¨\u0006^"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/FuturesCoinInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "code", "", FirebaseAnalytics.Param.CURRENCY, "name", "iconUrl", "withdrawDisabledTip", "depositDisabledTip", "type", "precision", "status", "withdrawEnableAt", "depositEnableAt", "withdrawMinFee", "withdrawMinSize", "innerWithdrawMinFee", "availableBalance", "totalBalance", "isDepositEnabled", "isWithdrawEnabled", "isDisplayWithdraw", "isDisplayDeposit", "isMarginEnabled", "isDebitEnabled", "isPoolXEnabled", "isEarnEnabled", "", "isDigitalCoin", "isStableCoin", "isDelistingCoin", "isTransferEnabled", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCurrency", "getName", "getIconUrl", "getWithdrawDisabledTip", "getDepositDisabledTip", "getType", "getPrecision", "getStatus", "getWithdrawEnableAt", "getDepositEnableAt", "getWithdrawMinFee", "getWithdrawMinSize", "getInnerWithdrawMinFee", "getAvailableBalance", "getTotalBalance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProperties", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/FuturesCoinInfo;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSymbolsCoinTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSymbolsCoinTurboModule.kt\ncom/kubi/rn/core/turbo/FuturesCoinInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"})
public final /* data */ class FuturesCoinInfo implements WritableMapSerializable {

    @Nullable
    private final String availableBalance;

    @Nullable
    private final String code;

    @Nullable
    private final String currency;

    @Nullable
    private final String depositDisabledTip;

    @Nullable
    private final String depositEnableAt;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String innerWithdrawMinFee;

    @Nullable
    private final String isDebitEnabled;

    @Nullable
    private final Boolean isDelistingCoin;

    @Nullable
    private final String isDepositEnabled;

    @Nullable
    private final Boolean isDigitalCoin;

    @Nullable
    private final String isDisplayDeposit;

    @Nullable
    private final String isDisplayWithdraw;

    @Nullable
    private final Boolean isEarnEnabled;

    @Nullable
    private final String isMarginEnabled;

    @Nullable
    private final String isPoolXEnabled;

    @Nullable
    private final Boolean isStableCoin;

    @Nullable
    private final Boolean isTransferEnabled;

    @Nullable
    private final String isWithdrawEnabled;

    @Nullable
    private final String name;

    @Nullable
    private final String precision;

    @Nullable
    private final String properties;

    @Nullable
    private final String status;

    @Nullable
    private final String totalBalance;

    @Nullable
    private final String type;

    @Nullable
    private final String withdrawDisabledTip;

    @Nullable
    private final String withdrawEnableAt;

    @Nullable
    private final String withdrawMinFee;

    @Nullable
    private final String withdrawMinSize;

    public FuturesCoinInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public static /* synthetic */ FuturesCoinInfo copy$default(FuturesCoinInfo futuresCoinInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str24, int i11, Object obj) {
        String str25;
        Boolean bool6;
        String str26 = (i11 & 1) != 0 ? futuresCoinInfo.code : str;
        String str27 = (i11 & 2) != 0 ? futuresCoinInfo.currency : str2;
        String str28 = (i11 & 4) != 0 ? futuresCoinInfo.name : str3;
        String str29 = (i11 & 8) != 0 ? futuresCoinInfo.iconUrl : str4;
        String str30 = (i11 & 16) != 0 ? futuresCoinInfo.withdrawDisabledTip : str5;
        String str31 = (i11 & 32) != 0 ? futuresCoinInfo.depositDisabledTip : str6;
        String str32 = (i11 & 64) != 0 ? futuresCoinInfo.type : str7;
        String str33 = (i11 & 128) != 0 ? futuresCoinInfo.precision : str8;
        String str34 = (i11 & 256) != 0 ? futuresCoinInfo.status : str9;
        String str35 = (i11 & 512) != 0 ? futuresCoinInfo.withdrawEnableAt : str10;
        String str36 = (i11 & 1024) != 0 ? futuresCoinInfo.depositEnableAt : str11;
        String str37 = (i11 & 2048) != 0 ? futuresCoinInfo.withdrawMinFee : str12;
        String str38 = (i11 & 4096) != 0 ? futuresCoinInfo.withdrawMinSize : str13;
        String str39 = (i11 & 8192) != 0 ? futuresCoinInfo.innerWithdrawMinFee : str14;
        String str40 = str26;
        String str41 = (i11 & 16384) != 0 ? futuresCoinInfo.availableBalance : str15;
        String str42 = (i11 & 32768) != 0 ? futuresCoinInfo.totalBalance : str16;
        String str43 = (i11 & 65536) != 0 ? futuresCoinInfo.isDepositEnabled : str17;
        String str44 = (i11 & 131072) != 0 ? futuresCoinInfo.isWithdrawEnabled : str18;
        String str45 = (i11 & 262144) != 0 ? futuresCoinInfo.isDisplayWithdraw : str19;
        String str46 = (i11 & 524288) != 0 ? futuresCoinInfo.isDisplayDeposit : str20;
        String str47 = (i11 & 1048576) != 0 ? futuresCoinInfo.isMarginEnabled : str21;
        String str48 = (i11 & 2097152) != 0 ? futuresCoinInfo.isDebitEnabled : str22;
        String str49 = (i11 & 4194304) != 0 ? futuresCoinInfo.isPoolXEnabled : str23;
        Boolean bool7 = (i11 & 8388608) != 0 ? futuresCoinInfo.isEarnEnabled : bool;
        Boolean bool8 = (i11 & 16777216) != 0 ? futuresCoinInfo.isDigitalCoin : bool2;
        Boolean bool9 = (i11 & 33554432) != 0 ? futuresCoinInfo.isStableCoin : bool3;
        Boolean bool10 = (i11 & 67108864) != 0 ? futuresCoinInfo.isDelistingCoin : bool4;
        Boolean bool11 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? futuresCoinInfo.isTransferEnabled : bool5;
        if ((i11 & 268435456) != 0) {
            bool6 = bool11;
            str25 = futuresCoinInfo.properties;
        } else {
            str25 = str24;
            bool6 = bool11;
        }
        return futuresCoinInfo.copy(str40, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str41, str42, str43, str44, str45, str46, str47, str48, str49, bool7, bool8, bool9, bool10, bool6, str25);
    }

    @NotNull
    public final FuturesCoinInfo copy(@Nullable String code, @Nullable String currency, @Nullable String name, @Nullable String iconUrl, @Nullable String withdrawDisabledTip, @Nullable String depositDisabledTip, @Nullable String type, @Nullable String precision, @Nullable String status, @Nullable String withdrawEnableAt, @Nullable String depositEnableAt, @Nullable String withdrawMinFee, @Nullable String withdrawMinSize, @Nullable String innerWithdrawMinFee, @Nullable String availableBalance, @Nullable String totalBalance, @Nullable String isDepositEnabled, @Nullable String isWithdrawEnabled, @Nullable String isDisplayWithdraw, @Nullable String isDisplayDeposit, @Nullable String isMarginEnabled, @Nullable String isDebitEnabled, @Nullable String isPoolXEnabled, @Nullable Boolean isEarnEnabled, @Nullable Boolean isDigitalCoin, @Nullable Boolean isStableCoin, @Nullable Boolean isDelistingCoin, @Nullable Boolean isTransferEnabled, @Nullable String properties) {
        return new FuturesCoinInfo(code, currency, name, iconUrl, withdrawDisabledTip, depositDisabledTip, type, precision, status, withdrawEnableAt, depositEnableAt, withdrawMinFee, withdrawMinSize, innerWithdrawMinFee, availableBalance, totalBalance, isDepositEnabled, isWithdrawEnabled, isDisplayWithdraw, isDisplayDeposit, isMarginEnabled, isDebitEnabled, isPoolXEnabled, isEarnEnabled, isDigitalCoin, isStableCoin, isDelistingCoin, isTransferEnabled, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesCoinInfo)) {
            return false;
        }
        FuturesCoinInfo futuresCoinInfo = (FuturesCoinInfo) other;
        return Intrinsics.areEqual(this.code, futuresCoinInfo.code) && Intrinsics.areEqual(this.currency, futuresCoinInfo.currency) && Intrinsics.areEqual(this.name, futuresCoinInfo.name) && Intrinsics.areEqual(this.iconUrl, futuresCoinInfo.iconUrl) && Intrinsics.areEqual(this.withdrawDisabledTip, futuresCoinInfo.withdrawDisabledTip) && Intrinsics.areEqual(this.depositDisabledTip, futuresCoinInfo.depositDisabledTip) && Intrinsics.areEqual(this.type, futuresCoinInfo.type) && Intrinsics.areEqual(this.precision, futuresCoinInfo.precision) && Intrinsics.areEqual(this.status, futuresCoinInfo.status) && Intrinsics.areEqual(this.withdrawEnableAt, futuresCoinInfo.withdrawEnableAt) && Intrinsics.areEqual(this.depositEnableAt, futuresCoinInfo.depositEnableAt) && Intrinsics.areEqual(this.withdrawMinFee, futuresCoinInfo.withdrawMinFee) && Intrinsics.areEqual(this.withdrawMinSize, futuresCoinInfo.withdrawMinSize) && Intrinsics.areEqual(this.innerWithdrawMinFee, futuresCoinInfo.innerWithdrawMinFee) && Intrinsics.areEqual(this.availableBalance, futuresCoinInfo.availableBalance) && Intrinsics.areEqual(this.totalBalance, futuresCoinInfo.totalBalance) && Intrinsics.areEqual(this.isDepositEnabled, futuresCoinInfo.isDepositEnabled) && Intrinsics.areEqual(this.isWithdrawEnabled, futuresCoinInfo.isWithdrawEnabled) && Intrinsics.areEqual(this.isDisplayWithdraw, futuresCoinInfo.isDisplayWithdraw) && Intrinsics.areEqual(this.isDisplayDeposit, futuresCoinInfo.isDisplayDeposit) && Intrinsics.areEqual(this.isMarginEnabled, futuresCoinInfo.isMarginEnabled) && Intrinsics.areEqual(this.isDebitEnabled, futuresCoinInfo.isDebitEnabled) && Intrinsics.areEqual(this.isPoolXEnabled, futuresCoinInfo.isPoolXEnabled) && Intrinsics.areEqual(this.isEarnEnabled, futuresCoinInfo.isEarnEnabled) && Intrinsics.areEqual(this.isDigitalCoin, futuresCoinInfo.isDigitalCoin) && Intrinsics.areEqual(this.isStableCoin, futuresCoinInfo.isStableCoin) && Intrinsics.areEqual(this.isDelistingCoin, futuresCoinInfo.isDelistingCoin) && Intrinsics.areEqual(this.isTransferEnabled, futuresCoinInfo.isTransferEnabled) && Intrinsics.areEqual(this.properties, futuresCoinInfo.properties);
    }

    public FuturesCoinInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable String str24) {
        this.code = str;
        this.currency = str2;
        this.name = str3;
        this.iconUrl = str4;
        this.withdrawDisabledTip = str5;
        this.depositDisabledTip = str6;
        this.type = str7;
        this.precision = str8;
        this.status = str9;
        this.withdrawEnableAt = str10;
        this.depositEnableAt = str11;
        this.withdrawMinFee = str12;
        this.withdrawMinSize = str13;
        this.innerWithdrawMinFee = str14;
        this.availableBalance = str15;
        this.totalBalance = str16;
        this.isDepositEnabled = str17;
        this.isWithdrawEnabled = str18;
        this.isDisplayWithdraw = str19;
        this.isDisplayDeposit = str20;
        this.isMarginEnabled = str21;
        this.isDebitEnabled = str22;
        this.isPoolXEnabled = str23;
        this.isEarnEnabled = bool;
        this.isDigitalCoin = bool2;
        this.isStableCoin = bool3;
        this.isDelistingCoin = bool4;
        this.isTransferEnabled = bool5;
        this.properties = str24;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getInnerWithdrawMinFee() {
        return this.innerWithdrawMinFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getIsDepositEnabled() {
        return this.isDepositEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getIsWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getIsDisplayWithdraw() {
        return this.isDisplayWithdraw;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getIsDisplayDeposit() {
        return this.isDisplayDeposit;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getIsDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getIsPoolXEnabled() {
        return this.isPoolXEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getIsEarnEnabled() {
        return this.isEarnEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getIsDigitalCoin() {
        return this.isDigitalCoin;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getIsStableCoin() {
        return this.isStableCoin;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getIsDelistingCoin() {
        return this.isDelistingCoin;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getIsTransferEnabled() {
        return this.isTransferEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getProperties() {
        return this.properties;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDepositDisabledTip() {
        return this.depositDisabledTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDepositDisabledTip() {
        return this.depositDisabledTip;
    }

    @Nullable
    public final String getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getInnerWithdrawMinFee() {
        return this.innerWithdrawMinFee;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPrecision() {
        return this.precision;
    }

    @Nullable
    public final String getProperties() {
        return this.properties;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    @Nullable
    public final String getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @Nullable
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.withdrawDisabledTip;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.depositDisabledTip;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.type;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.precision;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.status;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.withdrawEnableAt;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.depositEnableAt;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.withdrawMinFee;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.withdrawMinSize;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.innerWithdrawMinFee;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.availableBalance;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.totalBalance;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.isDepositEnabled;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.isWithdrawEnabled;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.isDisplayWithdraw;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.isDisplayDeposit;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.isMarginEnabled;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.isDebitEnabled;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.isPoolXEnabled;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool = this.isEarnEnabled;
        int iHashCode24 = (iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDigitalCoin;
        int iHashCode25 = (iHashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isStableCoin;
        int iHashCode26 = (iHashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isDelistingCoin;
        int iHashCode27 = (iHashCode26 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isTransferEnabled;
        int iHashCode28 = (iHashCode27 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str24 = this.properties;
        return iHashCode28 + (str24 != null ? str24.hashCode() : 0);
    }

    @Nullable
    public final String isDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    public final Boolean isDelistingCoin() {
        return this.isDelistingCoin;
    }

    @Nullable
    public final String isDepositEnabled() {
        return this.isDepositEnabled;
    }

    @Nullable
    public final Boolean isDigitalCoin() {
        return this.isDigitalCoin;
    }

    @Nullable
    public final String isDisplayDeposit() {
        return this.isDisplayDeposit;
    }

    @Nullable
    public final String isDisplayWithdraw() {
        return this.isDisplayWithdraw;
    }

    @Nullable
    public final Boolean isEarnEnabled() {
        return this.isEarnEnabled;
    }

    @Nullable
    public final String isMarginEnabled() {
        return this.isMarginEnabled;
    }

    @Nullable
    public final String isPoolXEnabled() {
        return this.isPoolXEnabled;
    }

    @Nullable
    public final Boolean isStableCoin() {
        return this.isStableCoin;
    }

    @Nullable
    public final Boolean isTransferEnabled() {
        return this.isTransferEnabled;
    }

    @Nullable
    public final String isWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    @NotNull
    public String toString() {
        return "FuturesCoinInfo(code=" + this.code + ", currency=" + this.currency + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", withdrawDisabledTip=" + this.withdrawDisabledTip + ", depositDisabledTip=" + this.depositDisabledTip + ", type=" + this.type + ", precision=" + this.precision + ", status=" + this.status + ", withdrawEnableAt=" + this.withdrawEnableAt + ", depositEnableAt=" + this.depositEnableAt + ", withdrawMinFee=" + this.withdrawMinFee + ", withdrawMinSize=" + this.withdrawMinSize + ", innerWithdrawMinFee=" + this.innerWithdrawMinFee + ", availableBalance=" + this.availableBalance + ", totalBalance=" + this.totalBalance + ", isDepositEnabled=" + this.isDepositEnabled + ", isWithdrawEnabled=" + this.isWithdrawEnabled + ", isDisplayWithdraw=" + this.isDisplayWithdraw + ", isDisplayDeposit=" + this.isDisplayDeposit + ", isMarginEnabled=" + this.isMarginEnabled + ", isDebitEnabled=" + this.isDebitEnabled + ", isPoolXEnabled=" + this.isPoolXEnabled + ", isEarnEnabled=" + this.isEarnEnabled + ", isDigitalCoin=" + this.isDigitalCoin + ", isStableCoin=" + this.isStableCoin + ", isDelistingCoin=" + this.isDelistingCoin + ", isTransferEnabled=" + this.isTransferEnabled + ", properties=" + this.properties + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.code;
        if (str != null) {
            writableMapCreateMap.putString("code", str.toString());
        }
        String str2 = this.currency;
        if (str2 != null) {
            writableMapCreateMap.putString(FirebaseAnalytics.Param.CURRENCY, str2.toString());
        }
        String str3 = this.name;
        if (str3 != null) {
            writableMapCreateMap.putString("name", str3.toString());
        }
        String str4 = this.iconUrl;
        if (str4 != null) {
            writableMapCreateMap.putString("iconUrl", str4.toString());
        }
        String str5 = this.withdrawDisabledTip;
        if (str5 != null) {
            writableMapCreateMap.putString("withdrawDisabledTip", str5.toString());
        }
        String str6 = this.depositDisabledTip;
        if (str6 != null) {
            writableMapCreateMap.putString("depositDisabledTip", str6.toString());
        }
        String str7 = this.type;
        if (str7 != null) {
            writableMapCreateMap.putString("type", str7.toString());
        }
        String str8 = this.precision;
        if (str8 != null) {
            writableMapCreateMap.putString("precision", str8.toString());
        }
        String str9 = this.status;
        if (str9 != null) {
            writableMapCreateMap.putString("status", str9.toString());
        }
        String str10 = this.withdrawEnableAt;
        if (str10 != null) {
            writableMapCreateMap.putString("withdrawEnableAt", str10.toString());
        }
        String str11 = this.depositEnableAt;
        if (str11 != null) {
            writableMapCreateMap.putString("depositEnableAt", str11.toString());
        }
        String str12 = this.withdrawMinFee;
        if (str12 != null) {
            writableMapCreateMap.putString("withdrawMinFee", str12.toString());
        }
        String str13 = this.withdrawMinSize;
        if (str13 != null) {
            writableMapCreateMap.putString("withdrawMinSize", str13.toString());
        }
        String str14 = this.innerWithdrawMinFee;
        if (str14 != null) {
            writableMapCreateMap.putString("innerWithdrawMinFee", str14.toString());
        }
        String str15 = this.availableBalance;
        if (str15 != null) {
            writableMapCreateMap.putString("availableBalance", str15.toString());
        }
        String str16 = this.totalBalance;
        if (str16 != null) {
            writableMapCreateMap.putString("totalBalance", str16.toString());
        }
        String str17 = this.isDepositEnabled;
        if (str17 != null) {
            writableMapCreateMap.putString("isDepositEnabled", str17.toString());
        }
        String str18 = this.isWithdrawEnabled;
        if (str18 != null) {
            writableMapCreateMap.putString("isWithdrawEnabled", str18.toString());
        }
        String str19 = this.isDisplayWithdraw;
        if (str19 != null) {
            writableMapCreateMap.putString("isDisplayWithdraw", str19.toString());
        }
        String str20 = this.isDisplayDeposit;
        if (str20 != null) {
            writableMapCreateMap.putString("isDisplayDeposit", str20.toString());
        }
        String str21 = this.isMarginEnabled;
        if (str21 != null) {
            writableMapCreateMap.putString("isMarginEnabled", str21.toString());
        }
        String str22 = this.isDebitEnabled;
        if (str22 != null) {
            writableMapCreateMap.putString("isDebitEnabled", str22.toString());
        }
        String str23 = this.isPoolXEnabled;
        if (str23 != null) {
            writableMapCreateMap.putString("isPoolXEnabled", str23.toString());
        }
        Boolean bool = this.isEarnEnabled;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isEarnEnabled", bool.booleanValue());
        }
        Boolean bool2 = this.isDigitalCoin;
        if (bool2 != null) {
            writableMapCreateMap.putBoolean("isDigitalCoin", bool2.booleanValue());
        }
        Boolean bool3 = this.isStableCoin;
        if (bool3 != null) {
            writableMapCreateMap.putBoolean("isStableCoin", bool3.booleanValue());
        }
        Boolean bool4 = this.isDelistingCoin;
        if (bool4 != null) {
            writableMapCreateMap.putBoolean("isDelistingCoin", bool4.booleanValue());
        }
        Boolean bool5 = this.isTransferEnabled;
        if (bool5 != null) {
            writableMapCreateMap.putBoolean("isTransferEnabled", bool5.booleanValue());
        }
        String str24 = this.properties;
        if (str24 != null) {
            writableMapCreateMap.putString("properties", str24.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ FuturesCoinInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str24, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14, (i11 & 16384) != 0 ? null : str15, (i11 & 32768) != 0 ? null : str16, (i11 & 65536) != 0 ? null : str17, (i11 & 131072) != 0 ? null : str18, (i11 & 262144) != 0 ? null : str19, (i11 & 524288) != 0 ? null : str20, (i11 & 1048576) != 0 ? null : str21, (i11 & 2097152) != 0 ? null : str22, (i11 & 4194304) != 0 ? null : str23, (i11 & 8388608) != 0 ? null : bool, (i11 & 16777216) != 0 ? null : bool2, (i11 & 33554432) != 0 ? null : bool3, (i11 & 67108864) != 0 ? null : bool4, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bool5, (i11 & 268435456) != 0 ? null : str24);
    }
}
