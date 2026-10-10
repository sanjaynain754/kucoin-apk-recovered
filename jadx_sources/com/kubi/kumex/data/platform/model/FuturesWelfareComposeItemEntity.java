package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bm.C4630c;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.kubi.kumex.utils.C17069u;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BX\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001fH\u0002J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001e\u0010%\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\f\u0018\u00010\nHÆ\u0003Ji\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u001d\b\u0002\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\f\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R&\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00065"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;", "Landroid/os/Parcelable;", "couponId", "", "welfareType", "effectiveTime", "expireTime", "", "tag", JAnalysisConstants.EVENT_ATTRIBUTES, "", "Lcom/google/gson/JsonElement;", "Lkotlinx/parcelize/RawValue;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V", "getCouponId", "()Ljava/lang/String;", "getWelfareType", "getEffectiveTime", "getExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTag", "getAttributes", "()Ljava/util/Map;", "toTrial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "toCoupon", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;", "toAirdrop", "parseSupportedContracts", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesWelfareEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesWelfareEntity.kt\ncom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n1869#2,2:369\n*S KotlinDebug\n*F\n+ 1 FuturesWelfareEntity.kt\ncom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity\n*L\n335#1:369,2\n*E\n"})
public final /* data */ class FuturesWelfareComposeItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareComposeItemEntity> CREATOR = new C15802a();

    @Nullable
    private final Map<String, JsonElement> attributes;

    @SerializedName(alternate = {"id"}, value = "couponId")
    @Nullable
    private final String couponId;

    @SerializedName(alternate = {"claimTime"}, value = "effectiveTime")
    @Nullable
    private final String effectiveTime;

    @Nullable
    private final Long expireTime;

    @Nullable
    private final String tag;

    @SerializedName(alternate = {"trialFundType"}, value = "welfareType")
    @Nullable
    private final String welfareType;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareComposeItemEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15802a implements Parcelable.Creator<FuturesWelfareComposeItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareComposeItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(FuturesWelfareComposeItemEntity.class.getClassLoader()));
                }
            }
            return new FuturesWelfareComposeItemEntity(string, string2, string3, lValueOf, string4, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareComposeItemEntity[] newArray(int i11) {
            return new FuturesWelfareComposeItemEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesWelfareComposeItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable Map<String, ? extends JsonElement> map) {
        this.couponId = str;
        this.welfareType = str2;
        this.effectiveTime = str3;
        this.expireTime = l11;
        this.tag = str4;
        this.attributes = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesWelfareComposeItemEntity)) {
            return false;
        }
        FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity = (FuturesWelfareComposeItemEntity) other;
        return Intrinsics.areEqual(this.couponId, futuresWelfareComposeItemEntity.couponId) && Intrinsics.areEqual(this.welfareType, futuresWelfareComposeItemEntity.welfareType) && Intrinsics.areEqual(this.effectiveTime, futuresWelfareComposeItemEntity.effectiveTime) && Intrinsics.areEqual(this.expireTime, futuresWelfareComposeItemEntity.expireTime) && Intrinsics.areEqual(this.tag, futuresWelfareComposeItemEntity.tag) && Intrinsics.areEqual(this.attributes, futuresWelfareComposeItemEntity.attributes);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    @Nullable
    public final FuturesWelfareTrialItemEntity toTrial() {
        String strM36614d;
        BigDecimal bigDecimal;
        Long lM36613c;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimalM36611a;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimalM36611a2;
        BigDecimal bigDecimal5;
        BigDecimal bigDecimal6;
        String str;
        String str2;
        String str3;
        String strM36614d2;
        String strM36614d3;
        BigDecimal bigDecimalM36611a3;
        String strM36614d4;
        Map<String, JsonElement> map = this.attributes;
        if (map == null) {
            return null;
        }
        JsonElement jsonElement = map.get("trialFundType");
        String strM36614d5 = jsonElement != null ? C17069u.m36614d(jsonElement) : null;
        JsonElement jsonElement2 = this.attributes.get("type");
        String str4 = (jsonElement2 == null || (strM36614d4 = C17069u.m36614d(jsonElement2)) == null) ? strM36614d5 : strM36614d4;
        String strM66668h = C27041f.m66668h(this.welfareType);
        boolean zAreEqual = Intrinsics.areEqual(strM66668h, "CONTRACT_BONUS");
        boolean z11 = Intrinsics.areEqual(strM66668h, FuturesWelfareTrialItemEntity.LEAD_TRIAL_FUND_TYPE) || Intrinsics.areEqual(strM36614d5, FuturesWelfareTrialItemEntity.LEAD_TRIAL_FUND_TYPE) || Intrinsics.areEqual(str4, FuturesWelfareTrialItemEntity.LEAD_TRIAL_FUND_TYPE);
        if (!zAreEqual && !z11) {
            return null;
        }
        List<String> supportedContracts = parseSupportedContracts();
        JsonElement jsonElement3 = this.attributes.get("faceValue");
        if (jsonElement3 == null || (strM36614d = C17069u.m36614d(jsonElement3)) == null) {
            JsonElement jsonElement4 = this.attributes.get("amount");
            strM36614d = jsonElement4 != null ? C17069u.m36614d(jsonElement4) : null;
            if (strM36614d == null) {
                strM36614d = "0";
            }
        }
        JsonElement jsonElement5 = this.attributes.get("code");
        String strM36614d6 = jsonElement5 != null ? C17069u.m36614d(jsonElement5) : null;
        JsonElement jsonElement6 = this.attributes.get("rewardId");
        String strM36614d7 = jsonElement6 != null ? C17069u.m36614d(jsonElement6) : null;
        if (z11) {
            String str5 = this.couponId;
            if (str5 != null) {
                strM36614d6 = str5;
            } else if (strM36614d7 != null) {
                strM36614d6 = strM36614d7;
            }
        } else if (strM36614d6 == null) {
            strM36614d6 = strM36614d7;
        }
        JsonElement jsonElement7 = this.attributes.get("faceValue");
        if (jsonElement7 == null || (bigDecimalM36611a = C17069u.m36611a(jsonElement7)) == null) {
            JsonElement jsonElement8 = this.attributes.get("amount");
            if (jsonElement8 != null) {
                BigDecimal bigDecimalM36611a4 = C17069u.m36611a(jsonElement8);
                bigDecimal = bigDecimalM36611a4;
            } else {
                bigDecimal = null;
            }
        } else {
            bigDecimal = bigDecimalM36611a4;
        }
        JsonElement jsonElement9 = this.attributes.get(FirebaseAnalytics.Param.CURRENCY);
        String strM36614d8 = jsonElement9 != null ? C17069u.m36614d(jsonElement9) : null;
        JsonElement jsonElement10 = this.attributes.get("status");
        String strM4561b = C4630c.m4561b(jsonElement10 != null ? C17069u.m36614d(jsonElement10) : null);
        JsonElement jsonElement11 = this.attributes.get("expiredPeriod");
        if (jsonElement11 == null || (lM36613c = C17069u.m36613c(jsonElement11)) == null) {
            lM36613c = this.expireTime;
        }
        Long l11 = lM36613c;
        String str6 = this.couponId;
        JsonElement jsonElement12 = this.attributes.get("maxValue");
        if (jsonElement12 == null || (bigDecimalM36611a = C17069u.m36611a(jsonElement12)) == null) {
            JsonElement jsonElement13 = this.attributes.get("maxWithdrawAmount");
            if (jsonElement13 != null) {
                BigDecimal bigDecimalM36611a5 = C17069u.m36611a(jsonElement13);
                bigDecimal2 = bigDecimalM36611a5;
            } else {
                bigDecimal2 = null;
            }
        } else {
            bigDecimal2 = bigDecimalM36611a5;
        }
        JsonElement jsonElement14 = this.attributes.get("trialFundBalance");
        BigDecimal bigDecimalM89921F = (jsonElement14 == null || (bigDecimalM36611a3 = C17069u.m36611a(jsonElement14)) == null) ? null : C41014a.m89921F(bigDecimalM36611a3, strM36614d);
        JsonElement jsonElement15 = this.attributes.get("minTotalAmount");
        if (jsonElement15 == null || (bigDecimalM89921F = C17069u.m36611a(jsonElement15)) == null) {
            JsonElement jsonElement16 = this.attributes.get("withdrawThresholdTrade");
            if (jsonElement16 == null || (bigDecimalM36611a = C17069u.m36611a(jsonElement16)) == null) {
                bigDecimal3 = null;
            } else {
                BigDecimal bigDecimalM89921F2 = C41014a.m89921F(bigDecimalM36611a, strM36614d);
                bigDecimal3 = bigDecimalM89921F2;
            }
        } else {
            bigDecimal3 = bigDecimalM89921F2;
        }
        JsonElement jsonElement17 = this.attributes.get("minCloseRealisedPnl");
        if (jsonElement17 == null || (bigDecimalM89921F = C17069u.m36611a(jsonElement17)) == null) {
            JsonElement jsonElement18 = this.attributes.get("withdrawThresholdProfit");
            if (jsonElement18 == null || (bigDecimalM36611a2 = C17069u.m36611a(jsonElement18)) == null) {
                bigDecimal4 = null;
            } else {
                BigDecimal bigDecimalM89921F3 = C41014a.m89921F(bigDecimalM36611a2, strM36614d);
                bigDecimal4 = bigDecimalM89921F3;
            }
        } else {
            bigDecimal4 = bigDecimalM89921F3;
        }
        JsonElement jsonElement19 = this.attributes.get("maxLeverage");
        BigDecimal bigDecimalM36611a6 = jsonElement19 != null ? C17069u.m36611a(jsonElement19) : null;
        JsonElement jsonElement20 = this.attributes.get("realisedPNL");
        if (jsonElement20 == null || (bigDecimalM36611a = C17069u.m36611a(jsonElement20)) == null) {
            JsonElement jsonElement21 = this.attributes.get("profitAmount");
            if (jsonElement21 != null) {
                BigDecimal bigDecimalM36611a7 = C17069u.m36611a(jsonElement21);
                bigDecimal5 = bigDecimalM36611a7;
            } else {
                bigDecimal5 = null;
            }
        } else {
            bigDecimal5 = bigDecimalM36611a7;
        }
        JsonElement jsonElement22 = this.attributes.get("totalAmount");
        if (jsonElement22 == null || (bigDecimalM36611a = C17069u.m36611a(jsonElement22)) == null) {
            JsonElement jsonElement23 = this.attributes.get("tradeAmount");
            if (jsonElement23 != null) {
                BigDecimal bigDecimalM36611a8 = C17069u.m36611a(jsonElement23);
                bigDecimal6 = bigDecimalM36611a8;
            } else {
                bigDecimal6 = null;
            }
        } else {
            bigDecimal6 = bigDecimalM36611a8;
        }
        JsonElement jsonElement24 = this.attributes.get("useDurition");
        Integer numM36612b = jsonElement24 != null ? C17069u.m36612b(jsonElement24) : null;
        JsonElement jsonElement25 = this.attributes.get("prizeType");
        String strM36614d9 = jsonElement25 != null ? C17069u.m36614d(jsonElement25) : null;
        String strM36614d10 = this.tag;
        if (strM36614d10 != null) {
            str = strM36614d10;
        } else {
            JsonElement jsonElement26 = this.attributes.get("tag");
            if (jsonElement26 != null) {
                strM36614d10 = C17069u.m36614d(jsonElement26);
                str = strM36614d10;
            } else {
                str = null;
            }
        }
        JsonElement jsonElement27 = this.attributes.get("title");
        if (jsonElement27 == null || (strM36614d = C17069u.m36614d(jsonElement27)) == null) {
            JsonElement jsonElement28 = this.attributes.get("displayTitle");
            if (jsonElement28 != null) {
                String strM36614d11 = C17069u.m36614d(jsonElement28);
                str2 = strM36614d11;
            } else {
                str2 = null;
            }
        } else {
            str2 = strM36614d11;
        }
        JsonElement jsonElement29 = this.attributes.get("couponAlias");
        String strM36614d12 = jsonElement29 != null ? C17069u.m36614d(jsonElement29) : null;
        JsonElement jsonElement30 = this.attributes.get("campaignTemplateCode");
        String strM36614d13 = jsonElement30 != null ? C17069u.m36614d(jsonElement30) : null;
        JsonElement jsonElement31 = this.attributes.get("ruleUrl");
        if (jsonElement31 == null || (strM36614d = C17069u.m36614d(jsonElement31)) == null) {
            JsonElement jsonElement32 = this.attributes.get("progressUrl");
            if (jsonElement32 != null) {
                String strM36614d14 = C17069u.m36614d(jsonElement32);
                str3 = strM36614d14;
            } else {
                str3 = null;
            }
        } else {
            str3 = strM36614d14;
        }
        JsonElement jsonElement33 = this.attributes.get("progressUrl");
        if (jsonElement33 == null || (strM36614d3 = C17069u.m36614d(jsonElement33)) == null) {
            JsonElement jsonElement34 = this.attributes.get("ruleUrl");
            strM36614d2 = jsonElement34 != null ? C17069u.m36614d(jsonElement34) : null;
        } else {
            strM36614d2 = strM36614d3;
        }
        return new FuturesWelfareTrialItemEntity(strM36614d6, strM4561b, null, null, l11, strM36614d8, bigDecimal, null, null, bigDecimal5, str4, bigDecimal3, bigDecimal6, null, null, bigDecimal2, null, null, supportedContracts, bigDecimalM36611a6, bigDecimalM89921F, str3, null, null, bigDecimal4, false, null, null, strM36614d9, numM36612b, null, str6, strM36614d7, str, str2, strM36614d12, strM36614d2, strM36614d13, 1321427340, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesWelfareComposeItemEntity copy$default(FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity, String str, String str2, String str3, Long l11, String str4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresWelfareComposeItemEntity.couponId;
        }
        if ((i11 & 2) != 0) {
            str2 = futuresWelfareComposeItemEntity.welfareType;
        }
        if ((i11 & 4) != 0) {
            str3 = futuresWelfareComposeItemEntity.effectiveTime;
        }
        if ((i11 & 8) != 0) {
            l11 = futuresWelfareComposeItemEntity.expireTime;
        }
        if ((i11 & 16) != 0) {
            str4 = futuresWelfareComposeItemEntity.tag;
        }
        if ((i11 & 32) != 0) {
            map = futuresWelfareComposeItemEntity.attributes;
        }
        String str5 = str4;
        Map map2 = map;
        return futuresWelfareComposeItemEntity.copy(str, str2, str3, l11, str5, map2);
    }

    private final List<String> parseSupportedContracts() {
        JsonArray asJsonArray;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        ArrayList arrayList = new ArrayList();
        Map<String, JsonElement> map = this.attributes;
        if (map == null || (jsonElement2 = map.get("supportedContracts")) == null || (asJsonArray = jsonElement2.getAsJsonArray()) == null) {
            Map<String, JsonElement> map2 = this.attributes;
            asJsonArray = (map2 == null || (jsonElement = map2.get("supportContract")) == null) ? null : jsonElement.getAsJsonArray();
        }
        if (asJsonArray != null) {
            for (JsonElement jsonElement3 : asJsonArray) {
                Intrinsics.checkNotNull(jsonElement3);
                arrayList.add(C27041f.m66668h(C17069u.m36614d(jsonElement3)));
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWelfareType() {
        return this.welfareType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEffectiveTime() {
        return this.effectiveTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final Map<String, JsonElement> component6() {
        return this.attributes;
    }

    @NotNull
    public final FuturesWelfareComposeItemEntity copy(@Nullable String couponId, @Nullable String welfareType, @Nullable String effectiveTime, @Nullable Long expireTime, @Nullable String tag, @Nullable Map<String, ? extends JsonElement> attributes) {
        return new FuturesWelfareComposeItemEntity(couponId, welfareType, effectiveTime, expireTime, tag, attributes);
    }

    @Nullable
    public final Map<String, JsonElement> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getEffectiveTime() {
        return this.effectiveTime;
    }

    @Nullable
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getWelfareType() {
        return this.welfareType;
    }

    public int hashCode() {
        String str = this.couponId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.welfareType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.effectiveTime;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.expireTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.tag;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, JsonElement> map = this.attributes;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    @Nullable
    public final FuturesWelfareTrialItemEntity toAirdrop() {
        BigDecimal bigDecimalM36611a;
        if (this.attributes == null || !Intrinsics.areEqual(this.welfareType, "CONTRACT_AIRDROP_POSITION")) {
            return null;
        }
        List<String> supportedContracts = parseSupportedContracts();
        JsonElement jsonElement = this.attributes.get("faceValue");
        String strM66669i = C27041f.m66669i(jsonElement != null ? C17069u.m36614d(jsonElement) : null, "0");
        JsonElement jsonElement2 = this.attributes.get("type");
        String strM36614d = jsonElement2 != null ? C17069u.m36614d(jsonElement2) : null;
        JsonElement jsonElement3 = this.attributes.get("faceValue");
        BigDecimal bigDecimalM36611a2 = jsonElement3 != null ? C17069u.m36611a(jsonElement3) : null;
        JsonElement jsonElement4 = this.attributes.get(FirebaseAnalytics.Param.CURRENCY);
        String strM36614d2 = jsonElement4 != null ? C17069u.m36614d(jsonElement4) : null;
        JsonElement jsonElement5 = this.attributes.get("status");
        String strM4561b = C4630c.m4561b(jsonElement5 != null ? C17069u.m36614d(jsonElement5) : null);
        JsonElement jsonElement6 = this.attributes.get("expiredPeriod");
        Long lM36613c = jsonElement6 != null ? C17069u.m36613c(jsonElement6) : null;
        JsonElement jsonElement7 = this.attributes.get("code");
        String strM36614d3 = jsonElement7 != null ? C17069u.m36614d(jsonElement7) : null;
        JsonElement jsonElement8 = this.attributes.get("maxValue");
        BigDecimal bigDecimalM36611a3 = jsonElement8 != null ? C17069u.m36611a(jsonElement8) : null;
        JsonElement jsonElement9 = this.attributes.get("trialFundBalance");
        BigDecimal bigDecimalM89921F = (jsonElement9 == null || (bigDecimalM36611a = C17069u.m36611a(jsonElement9)) == null) ? null : C41014a.m89921F(bigDecimalM36611a, strM66669i);
        JsonElement jsonElement10 = this.attributes.get("useDurition");
        Integer numM36612b = jsonElement10 != null ? C17069u.m36612b(jsonElement10) : null;
        JsonElement jsonElement11 = this.attributes.get("couponAlias");
        return new FuturesWelfareTrialItemEntity(strM36614d3, strM4561b, null, null, lM36613c, strM36614d2, bigDecimalM36611a2, null, null, null, strM36614d, null, null, null, null, bigDecimalM36611a3, null, null, supportedContracts, null, bigDecimalM89921F, null, null, null, null, false, null, null, "AIRDROP_POSITION", numM36612b, null, null, null, null, null, jsonElement11 != null ? C17069u.m36614d(jsonElement11) : null, null, null, -806650996, 55, null);
    }

    @Nullable
    public final FuturesWelfareCouponItemEntity toCoupon() {
        if (this.attributes == null || !Intrinsics.areEqual(this.welfareType, "CONTRACT_COUPON")) {
            return null;
        }
        String strM66668h = C27041f.m66668h(this.couponId);
        String str = this.effectiveTime;
        Long longOrNull = str != null ? StringsKt.toLongOrNull(str) : null;
        Long l11 = this.expireTime;
        String strM66668h2 = C27041f.m66668h(this.welfareType);
        JsonElement jsonElement = this.attributes.get("faceValue");
        BigDecimal bigDecimalM36611a = jsonElement != null ? C17069u.m36611a(jsonElement) : null;
        JsonElement jsonElement2 = this.attributes.get("deductionRatio");
        BigDecimal bigDecimalM36611a2 = jsonElement2 != null ? C17069u.m36611a(jsonElement2) : null;
        JsonElement jsonElement3 = this.attributes.get("deductedAmount");
        BigDecimal bigDecimalM36611a3 = jsonElement3 != null ? C17069u.m36611a(jsonElement3) : null;
        JsonElement jsonElement4 = this.attributes.get("remainAmount");
        BigDecimal bigDecimalM36611a4 = jsonElement4 != null ? C17069u.m36611a(jsonElement4) : null;
        JsonElement jsonElement5 = this.attributes.get("couponAlias");
        String strM36614d = jsonElement5 != null ? C17069u.m36614d(jsonElement5) : null;
        JsonElement jsonElement6 = this.attributes.get("status");
        String strM36614d2 = jsonElement6 != null ? C17069u.m36614d(jsonElement6) : null;
        JsonElement jsonElement7 = this.attributes.get("validPeriod");
        Long lM36613c = jsonElement7 != null ? C17069u.m36613c(jsonElement7) : null;
        JsonElement jsonElement8 = this.attributes.get(FirebaseAnalytics.Param.CURRENCY);
        String strM36614d3 = jsonElement8 != null ? C17069u.m36614d(jsonElement8) : null;
        JsonElement jsonElement9 = this.attributes.get("tradeMode");
        return new FuturesWelfareCouponItemEntity(strM66668h, strM66668h2, longOrNull, l11, new FuturesWelfareCouponAttributes(bigDecimalM36611a, bigDecimalM36611a2, bigDecimalM36611a3, bigDecimalM36611a4, strM36614d, strM36614d2, lM36613c, strM36614d3, jsonElement9 != null ? C17069u.m36612b(jsonElement9) : null));
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareComposeItemEntity(couponId=" + this.couponId + ", welfareType=" + this.welfareType + ", effectiveTime=" + this.effectiveTime + ", expireTime=" + this.expireTime + ", tag=" + this.tag + ", attributes=" + this.attributes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.couponId);
        dest.writeString(this.welfareType);
        dest.writeString(this.effectiveTime);
        Long l11 = this.expireTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.tag);
        Map<String, JsonElement> map = this.attributes;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, JsonElement> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeValue(entry.getValue());
        }
    }

    public /* synthetic */ FuturesWelfareComposeItemEntity(String str, String str2, String str3, Long l11, String str4, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, l11, (i11 & 16) != 0 ? null : str4, map);
    }
}
