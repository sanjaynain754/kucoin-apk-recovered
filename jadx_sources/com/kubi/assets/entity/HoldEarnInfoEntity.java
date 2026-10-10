package com.kubi.assets.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldEarnInfoEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jh\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/entity/HoldEarnInfoEntity;", "", "phrases", "", FirebaseAnalytics.Param.CURRENCY, "url", "buttonName", "type", "", "typePhrases", "currencyInfo", "", "Lcom/kubi/assets/entity/HoldEarnInfoEntity$CurrencyInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getPhrases", "()Ljava/lang/String;", "getCurrency", "getUrl", "getButtonName", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTypePhrases", "getCurrencyInfo", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/kubi/assets/entity/HoldEarnInfoEntity;", "equals", "", "other", "hashCode", "toString", "CurrencyInfo", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldEarnInfoEntity {

    @Nullable
    private final String buttonName;

    @Nullable
    private final String currency;

    @Nullable
    private final List<CurrencyInfo> currencyInfo;

    @Nullable
    private final String phrases;

    @Nullable
    private final Integer type;

    @Nullable
    private final String typePhrases;

    @Nullable
    private final String url;

    /* JADX INFO: compiled from: HoldEarnInfoEntity.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/entity/HoldEarnInfoEntity$CurrencyInfo;", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", FirebaseAnalytics.Param.CURRENCY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getCurrency", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CurrencyInfo {

        @Nullable
        private final String currency;

        @Nullable
        private final String icon;

        /* JADX WARN: Multi-variable type inference failed */
        public CurrencyInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrencyInfo)) {
                return false;
            }
            CurrencyInfo currencyInfo = (CurrencyInfo) other;
            return Intrinsics.areEqual(this.icon, currencyInfo.icon) && Intrinsics.areEqual(this.currency, currencyInfo.currency);
        }

        public CurrencyInfo(@Nullable String str, @Nullable String str2) {
            this.icon = str;
            this.currency = str2;
        }

        public static /* synthetic */ CurrencyInfo copy$default(CurrencyInfo currencyInfo, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = currencyInfo.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = currencyInfo.currency;
            }
            return currencyInfo.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        public final CurrencyInfo copy(@Nullable String icon, @Nullable String currency) {
            return new CurrencyInfo(icon, currency);
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            String str = this.icon;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.currency;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CurrencyInfo(icon=" + this.icon + ", currency=" + this.currency + ')';
        }

        public /* synthetic */ CurrencyInfo(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    public HoldEarnInfoEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldEarnInfoEntity)) {
            return false;
        }
        HoldEarnInfoEntity holdEarnInfoEntity = (HoldEarnInfoEntity) other;
        return Intrinsics.areEqual(this.phrases, holdEarnInfoEntity.phrases) && Intrinsics.areEqual(this.currency, holdEarnInfoEntity.currency) && Intrinsics.areEqual(this.url, holdEarnInfoEntity.url) && Intrinsics.areEqual(this.buttonName, holdEarnInfoEntity.buttonName) && Intrinsics.areEqual(this.type, holdEarnInfoEntity.type) && Intrinsics.areEqual(this.typePhrases, holdEarnInfoEntity.typePhrases) && Intrinsics.areEqual(this.currencyInfo, holdEarnInfoEntity.currencyInfo);
    }

    public HoldEarnInfoEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable List<CurrencyInfo> list) {
        this.phrases = str;
        this.currency = str2;
        this.url = str3;
        this.buttonName = str4;
        this.type = num;
        this.typePhrases = str5;
        this.currencyInfo = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoldEarnInfoEntity copy$default(HoldEarnInfoEntity holdEarnInfoEntity, String str, String str2, String str3, String str4, Integer num, String str5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = holdEarnInfoEntity.phrases;
        }
        if ((i11 & 2) != 0) {
            str2 = holdEarnInfoEntity.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = holdEarnInfoEntity.url;
        }
        if ((i11 & 8) != 0) {
            str4 = holdEarnInfoEntity.buttonName;
        }
        if ((i11 & 16) != 0) {
            num = holdEarnInfoEntity.type;
        }
        if ((i11 & 32) != 0) {
            str5 = holdEarnInfoEntity.typePhrases;
        }
        if ((i11 & 64) != 0) {
            list = holdEarnInfoEntity.currencyInfo;
        }
        String str6 = str5;
        List list2 = list;
        Integer num2 = num;
        String str7 = str3;
        return holdEarnInfoEntity.copy(str, str2, str7, str4, num2, str6, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhrases() {
        return this.phrases;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTypePhrases() {
        return this.typePhrases;
    }

    @Nullable
    public final List<CurrencyInfo> component7() {
        return this.currencyInfo;
    }

    @NotNull
    public final HoldEarnInfoEntity copy(@Nullable String phrases, @Nullable String currency, @Nullable String url, @Nullable String buttonName, @Nullable Integer type, @Nullable String typePhrases, @Nullable List<CurrencyInfo> currencyInfo) {
        return new HoldEarnInfoEntity(phrases, currency, url, buttonName, type, typePhrases, currencyInfo);
    }

    @Nullable
    public final String getButtonName() {
        return this.buttonName;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<CurrencyInfo> getCurrencyInfo() {
        return this.currencyInfo;
    }

    @Nullable
    public final String getPhrases() {
        return this.phrases;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getTypePhrases() {
        return this.typePhrases;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.phrases;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.typePhrases;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<CurrencyInfo> list = this.currencyInfo;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HoldEarnInfoEntity(phrases=" + this.phrases + ", currency=" + this.currency + ", url=" + this.url + ", buttonName=" + this.buttonName + ", type=" + this.type + ", typePhrases=" + this.typePhrases + ", currencyInfo=" + this.currencyInfo + ')';
    }

    public /* synthetic */ HoldEarnInfoEntity(String str, String str2, String str3, String str4, Integer num, String str5, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : list);
    }
}
