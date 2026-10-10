package com.kubi.tradingbotkit.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AllCouponsItemModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 l2\u00020\u0001:\u0002klB±\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u0006\u0010e\u001a\u00020\u001bJ\u0016\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b6\u00100\"\u0004\b7\u00102R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010$\"\u0004\bC\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010*\"\u0004\bI\u0010,R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010$\"\u0004\bM\u0010&R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010\u0019\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010S\"\u0004\bT\u0010UR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010$\"\u0004\b\\\u0010&R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010$\"\u0004\b^\u0010&R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010$\"\u0004\b`\u0010&R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006m"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "Landroid/os/Parcelable;", "couponsId", "", "discountPercentage", "discountPercentageShowBd", "Ljava/math/BigDecimal;", "discountTitle", "receiveTime", "", "discountReceiveDateScope", "expirationTime", "discountExpireDateScope", "discountExpireDate", "supportTypeCode", "", "supportTypeName", "showTypeName", "showSupportSymbol", "maxReward", "rewardSeconds", "minTotalInvestments", "validityPeriod", "detailShowing", "", "isChecked", "type", "", "subTitle", "unUsableReason", "unUsableReasonShow", "rules", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;)V", "getCouponsId", "()Ljava/lang/String;", "setCouponsId", "(Ljava/lang/String;)V", "getDiscountPercentage", "setDiscountPercentage", "getDiscountPercentageShowBd", "()Ljava/math/BigDecimal;", "setDiscountPercentageShowBd", "(Ljava/math/BigDecimal;)V", "getDiscountTitle", "setDiscountTitle", "getReceiveTime", "()Ljava/lang/Long;", "setReceiveTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDiscountReceiveDateScope", "setDiscountReceiveDateScope", "getExpirationTime", "setExpirationTime", "getDiscountExpireDateScope", "setDiscountExpireDateScope", "getDiscountExpireDate", "setDiscountExpireDate", "getSupportTypeCode", "()Ljava/util/List;", "setSupportTypeCode", "(Ljava/util/List;)V", "getSupportTypeName", "setSupportTypeName", "getShowTypeName", "setShowTypeName", "getShowSupportSymbol", "setShowSupportSymbol", "getMaxReward", "setMaxReward", "getRewardSeconds", "setRewardSeconds", "getMinTotalInvestments", "setMinTotalInvestments", "getValidityPeriod", "setValidityPeriod", "getDetailShowing", "()Ljava/lang/Boolean;", "setDetailShowing", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setChecked", "(Z)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSubTitle", "setSubTitle", "getUnUsableReason", "setUnUsableReason", "getUnUsableReasonShow", "setUnUsableReasonShow", "getRules", "()Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;", "setRules", "(Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;)V", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Rules", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AllCouponsItemModel implements Parcelable {
    public static final int AVAILABLE_COUPONS = 102;
    public static final int SUB_TITLE = 101;
    public static final int UNAVAILABLE_COUPONS = 103;

    @NotNull
    public static final String UNAVAILABLE_REASON_INVESTMENT = "INVESTMENT";

    @NotNull
    public static final String UNAVAILABLE_REASON_STRATEGY = "STRATEGY";

    @NotNull
    public static final String UNAVAILABLE_REASON_SYMBOL = "SYMBOL";

    @Nullable
    private String couponsId;

    @Nullable
    private Boolean detailShowing;

    @Nullable
    private String discountExpireDate;

    @Nullable
    private String discountExpireDateScope;

    @Nullable
    private String discountPercentage;

    @Nullable
    private BigDecimal discountPercentageShowBd;

    @Nullable
    private String discountReceiveDateScope;

    @Nullable
    private String discountTitle;

    @Nullable
    private Long expirationTime;
    private boolean isChecked;

    @Nullable
    private BigDecimal maxReward;

    @Nullable
    private BigDecimal minTotalInvestments;

    @Nullable
    private Long receiveTime;

    @Nullable
    private BigDecimal rewardSeconds;

    @Nullable
    private Rules rules;

    @Nullable
    private String showSupportSymbol;

    @Nullable
    private String showTypeName;

    @Nullable
    private String subTitle;

    @Nullable
    private List<String> supportTypeCode;

    @Nullable
    private List<String> supportTypeName;

    @Nullable
    private Integer type;

    @Nullable
    private String unUsableReason;

    @Nullable
    private String unUsableReasonShow;

    @Nullable
    private String validityPeriod;

    @NotNull
    public static final Parcelable.Creator<AllCouponsItemModel> CREATOR = new C26228a();

    /* JADX INFO: compiled from: AllCouponsItemModel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00124\b\u0002\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u00010\nj\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u0001`\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010.\u001a\u00020/J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020/R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016RF\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u00010\nj\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00065"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;", "Landroid/os/Parcelable;", "maxReward", "Ljava/math/BigDecimal;", "minTotalInvestments", "rewardCurrency", "", "rewardPercent", "rewardSeconds", "scope", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "strategyNames", "", "validPeriodSeconds", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/LinkedHashMap;Ljava/util/Map;Ljava/lang/Long;)V", "getMaxReward", "()Ljava/math/BigDecimal;", "setMaxReward", "(Ljava/math/BigDecimal;)V", "getMinTotalInvestments", "setMinTotalInvestments", "getRewardCurrency", "()Ljava/lang/String;", "setRewardCurrency", "(Ljava/lang/String;)V", "getRewardPercent", "setRewardPercent", "getRewardSeconds", "setRewardSeconds", "getScope", "()Ljava/util/LinkedHashMap;", "setScope", "(Ljava/util/LinkedHashMap;)V", "getStrategyNames", "()Ljava/util/Map;", "setStrategyNames", "(Ljava/util/Map;)V", "getValidPeriodSeconds", "()Ljava/lang/Long;", "setValidPeriodSeconds", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Rules implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Rules> CREATOR = new C26227a();

        @Nullable
        private BigDecimal maxReward;

        @Nullable
        private BigDecimal minTotalInvestments;

        @Nullable
        private String rewardCurrency;

        @Nullable
        private BigDecimal rewardPercent;

        @Nullable
        private BigDecimal rewardSeconds;

        @Nullable
        private LinkedHashMap<String, List<String>> scope;

        @Nullable
        private Map<String, String> strategyNames;

        @Nullable
        private Long validPeriodSeconds;

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.AllCouponsItemModel$Rules$a */
        /* JADX INFO: compiled from: AllCouponsItemModel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C26227a implements Parcelable.Creator<Rules> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Rules createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                LinkedHashMap linkedHashMap2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                String string = parcel.readString();
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i11 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int i13 = parcel.readInt();
                    linkedHashMap2 = new LinkedHashMap(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                }
                return new Rules(bigDecimal, bigDecimal2, string, bigDecimal3, bigDecimal4, linkedHashMap, linkedHashMap2, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Rules[] newArray(int i11) {
                return new Rules[i11];
            }
        }

        public Rules() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Rules(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable LinkedHashMap<String, List<String>> linkedHashMap, @Nullable Map<String, String> map, @Nullable Long l11) {
            this.maxReward = bigDecimal;
            this.minTotalInvestments = bigDecimal2;
            this.rewardCurrency = str;
            this.rewardPercent = bigDecimal3;
            this.rewardSeconds = bigDecimal4;
            this.scope = linkedHashMap;
            this.strategyNames = map;
            this.validPeriodSeconds = l11;
        }

        @Nullable
        public final BigDecimal getMaxReward() {
            return this.maxReward;
        }

        @Nullable
        public final BigDecimal getMinTotalInvestments() {
            return this.minTotalInvestments;
        }

        @Nullable
        public final String getRewardCurrency() {
            return this.rewardCurrency;
        }

        @Nullable
        public final BigDecimal getRewardPercent() {
            return this.rewardPercent;
        }

        @Nullable
        public final BigDecimal getRewardSeconds() {
            return this.rewardSeconds;
        }

        @Nullable
        public final LinkedHashMap<String, List<String>> getScope() {
            return this.scope;
        }

        @Nullable
        public final Map<String, String> getStrategyNames() {
            return this.strategyNames;
        }

        @Nullable
        public final Long getValidPeriodSeconds() {
            return this.validPeriodSeconds;
        }

        public final void setMaxReward(@Nullable BigDecimal bigDecimal) {
            this.maxReward = bigDecimal;
        }

        public final void setMinTotalInvestments(@Nullable BigDecimal bigDecimal) {
            this.minTotalInvestments = bigDecimal;
        }

        public final void setRewardCurrency(@Nullable String str) {
            this.rewardCurrency = str;
        }

        public final void setRewardPercent(@Nullable BigDecimal bigDecimal) {
            this.rewardPercent = bigDecimal;
        }

        public final void setRewardSeconds(@Nullable BigDecimal bigDecimal) {
            this.rewardSeconds = bigDecimal;
        }

        public final void setScope(@Nullable LinkedHashMap<String, List<String>> linkedHashMap) {
            this.scope = linkedHashMap;
        }

        public final void setStrategyNames(@Nullable Map<String, String> map) {
            this.strategyNames = map;
        }

        public final void setValidPeriodSeconds(@Nullable Long l11) {
            this.validPeriodSeconds = l11;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.maxReward);
            dest.writeSerializable(this.minTotalInvestments);
            dest.writeString(this.rewardCurrency);
            dest.writeSerializable(this.rewardPercent);
            dest.writeSerializable(this.rewardSeconds);
            LinkedHashMap<String, List<String>> linkedHashMap = this.scope;
            if (linkedHashMap == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(linkedHashMap.size());
                for (Map.Entry<String, List<String>> entry : linkedHashMap.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeStringList(entry.getValue());
                }
            }
            Map<String, String> map = this.strategyNames;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    dest.writeString(entry2.getKey());
                    dest.writeString(entry2.getValue());
                }
            }
            Long l11 = this.validPeriodSeconds;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
        }

        public /* synthetic */ Rules(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, BigDecimal bigDecimal3, BigDecimal bigDecimal4, LinkedHashMap linkedHashMap, Map map, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : linkedHashMap, (i11 & 64) != 0 ? null : map, (i11 & 128) != 0 ? null : l11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.AllCouponsItemModel$a */
    /* JADX INFO: compiled from: AllCouponsItemModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26228a implements Parcelable.Creator<AllCouponsItemModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AllCouponsItemModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AllCouponsItemModel(string, string2, bigDecimal, string3, lValueOf, string4, lValueOf2, string5, string6, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string7, string8, bigDecimal2, bigDecimal3, bigDecimal4, string9, boolValueOf, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Rules.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AllCouponsItemModel[] newArray(int i11) {
            return new AllCouponsItemModel[i11];
        }
    }

    public AllCouponsItemModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777215, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AllCouponsItemModel(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable Long l12, @Nullable String str5, @Nullable String str6, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str7, @Nullable String str8, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str9, @Nullable Boolean bool, boolean z11, @Nullable Integer num, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Rules rules) {
        this.couponsId = str;
        this.discountPercentage = str2;
        this.discountPercentageShowBd = bigDecimal;
        this.discountTitle = str3;
        this.receiveTime = l11;
        this.discountReceiveDateScope = str4;
        this.expirationTime = l12;
        this.discountExpireDateScope = str5;
        this.discountExpireDate = str6;
        this.supportTypeCode = list;
        this.supportTypeName = list2;
        this.showTypeName = str7;
        this.showSupportSymbol = str8;
        this.maxReward = bigDecimal2;
        this.rewardSeconds = bigDecimal3;
        this.minTotalInvestments = bigDecimal4;
        this.validityPeriod = str9;
        this.detailShowing = bool;
        this.isChecked = z11;
        this.type = num;
        this.subTitle = str10;
        this.unUsableReason = str11;
        this.unUsableReasonShow = str12;
        this.rules = rules;
    }

    @Nullable
    public final String getCouponsId() {
        return this.couponsId;
    }

    @Nullable
    public final Boolean getDetailShowing() {
        return this.detailShowing;
    }

    @Nullable
    public final String getDiscountExpireDate() {
        return this.discountExpireDate;
    }

    @Nullable
    public final String getDiscountExpireDateScope() {
        return this.discountExpireDateScope;
    }

    @Nullable
    public final String getDiscountPercentage() {
        return this.discountPercentage;
    }

    @Nullable
    public final BigDecimal getDiscountPercentageShowBd() {
        return this.discountPercentageShowBd;
    }

    @Nullable
    public final String getDiscountReceiveDateScope() {
        return this.discountReceiveDateScope;
    }

    @Nullable
    public final String getDiscountTitle() {
        return this.discountTitle;
    }

    @Nullable
    public final Long getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    public final BigDecimal getMaxReward() {
        return this.maxReward;
    }

    @Nullable
    public final BigDecimal getMinTotalInvestments() {
        return this.minTotalInvestments;
    }

    @Nullable
    public final Long getReceiveTime() {
        return this.receiveTime;
    }

    @Nullable
    public final BigDecimal getRewardSeconds() {
        return this.rewardSeconds;
    }

    @Nullable
    public final Rules getRules() {
        return this.rules;
    }

    @Nullable
    public final String getShowSupportSymbol() {
        return this.showSupportSymbol;
    }

    @Nullable
    public final String getShowTypeName() {
        return this.showTypeName;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final List<String> getSupportTypeCode() {
        return this.supportTypeCode;
    }

    @Nullable
    public final List<String> getSupportTypeName() {
        return this.supportTypeName;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUnUsableReason() {
        return this.unUsableReason;
    }

    @Nullable
    public final String getUnUsableReasonShow() {
        return this.unUsableReasonShow;
    }

    @Nullable
    public final String getValidityPeriod() {
        return this.validityPeriod;
    }

    /* JADX INFO: renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    public final void setCouponsId(@Nullable String str) {
        this.couponsId = str;
    }

    public final void setDetailShowing(@Nullable Boolean bool) {
        this.detailShowing = bool;
    }

    public final void setDiscountExpireDate(@Nullable String str) {
        this.discountExpireDate = str;
    }

    public final void setDiscountExpireDateScope(@Nullable String str) {
        this.discountExpireDateScope = str;
    }

    public final void setDiscountPercentage(@Nullable String str) {
        this.discountPercentage = str;
    }

    public final void setDiscountPercentageShowBd(@Nullable BigDecimal bigDecimal) {
        this.discountPercentageShowBd = bigDecimal;
    }

    public final void setDiscountReceiveDateScope(@Nullable String str) {
        this.discountReceiveDateScope = str;
    }

    public final void setDiscountTitle(@Nullable String str) {
        this.discountTitle = str;
    }

    public final void setExpirationTime(@Nullable Long l11) {
        this.expirationTime = l11;
    }

    public final void setMaxReward(@Nullable BigDecimal bigDecimal) {
        this.maxReward = bigDecimal;
    }

    public final void setMinTotalInvestments(@Nullable BigDecimal bigDecimal) {
        this.minTotalInvestments = bigDecimal;
    }

    public final void setReceiveTime(@Nullable Long l11) {
        this.receiveTime = l11;
    }

    public final void setRewardSeconds(@Nullable BigDecimal bigDecimal) {
        this.rewardSeconds = bigDecimal;
    }

    public final void setRules(@Nullable Rules rules) {
        this.rules = rules;
    }

    public final void setShowSupportSymbol(@Nullable String str) {
        this.showSupportSymbol = str;
    }

    public final void setShowTypeName(@Nullable String str) {
        this.showTypeName = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setSupportTypeCode(@Nullable List<String> list) {
        this.supportTypeCode = list;
    }

    public final void setSupportTypeName(@Nullable List<String> list) {
        this.supportTypeName = list;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setUnUsableReason(@Nullable String str) {
        this.unUsableReason = str;
    }

    public final void setUnUsableReasonShow(@Nullable String str) {
        this.unUsableReasonShow = str;
    }

    public final void setValidityPeriod(@Nullable String str) {
        this.validityPeriod = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.couponsId);
        dest.writeString(this.discountPercentage);
        dest.writeSerializable(this.discountPercentageShowBd);
        dest.writeString(this.discountTitle);
        Long l11 = this.receiveTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.discountReceiveDateScope);
        Long l12 = this.expirationTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.discountExpireDateScope);
        dest.writeString(this.discountExpireDate);
        dest.writeStringList(this.supportTypeCode);
        dest.writeStringList(this.supportTypeName);
        dest.writeString(this.showTypeName);
        dest.writeString(this.showSupportSymbol);
        dest.writeSerializable(this.maxReward);
        dest.writeSerializable(this.rewardSeconds);
        dest.writeSerializable(this.minTotalInvestments);
        dest.writeString(this.validityPeriod);
        Boolean bool = this.detailShowing;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.isChecked ? 1 : 0);
        Integer num = this.type;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.subTitle);
        dest.writeString(this.unUsableReason);
        dest.writeString(this.unUsableReasonShow);
        Rules rules = this.rules;
        if (rules == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rules.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AllCouponsItemModel(String str, String str2, BigDecimal bigDecimal, String str3, Long l11, String str4, Long l12, String str5, String str6, List list, List list2, String str7, String str8, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str9, Boolean bool, boolean z11, Integer num, String str10, String str11, String str12, Rules rules, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : l12, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : list, (i11 & 1024) != 0 ? null : list2, (i11 & 2048) != 0 ? null : str7, (i11 & 4096) != 0 ? null : str8, (i11 & 8192) != 0 ? null : bigDecimal2, (i11 & 16384) != 0 ? null : bigDecimal3, (i11 & 32768) != 0 ? null : bigDecimal4, (i11 & 65536) != 0 ? null : str9, (i11 & 131072) != 0 ? Boolean.FALSE : bool, (i11 & 262144) != 0 ? false : z11, (i11 & 524288) != 0 ? null : num, (i11 & 1048576) != 0 ? null : str10, (i11 & 2097152) != 0 ? null : str11, (i11 & 4194304) != 0 ? null : str12, (i11 & 8388608) != 0 ? null : rules);
    }
}
