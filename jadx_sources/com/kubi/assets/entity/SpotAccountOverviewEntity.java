package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "", "totalAssets", "", "todayPnl", "todayRoe", "last7DaysPnl", "last7DaysRoe", "baseCurrency", "baseFiatCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTotalAssets", "()Ljava/lang/String;", "getTodayPnl", "getTodayRoe", "getLast7DaysPnl", "getLast7DaysRoe", "getBaseCurrency", "getBaseFiatCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotAccountOverviewEntity {

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final String baseFiatCurrency;

    @Nullable
    private final String last7DaysPnl;

    @Nullable
    private final String last7DaysRoe;

    @Nullable
    private final String todayPnl;

    @Nullable
    private final String todayRoe;

    @Nullable
    private final String totalAssets;

    public SpotAccountOverviewEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotAccountOverviewEntity)) {
            return false;
        }
        SpotAccountOverviewEntity spotAccountOverviewEntity = (SpotAccountOverviewEntity) other;
        return Intrinsics.areEqual(this.totalAssets, spotAccountOverviewEntity.totalAssets) && Intrinsics.areEqual(this.todayPnl, spotAccountOverviewEntity.todayPnl) && Intrinsics.areEqual(this.todayRoe, spotAccountOverviewEntity.todayRoe) && Intrinsics.areEqual(this.last7DaysPnl, spotAccountOverviewEntity.last7DaysPnl) && Intrinsics.areEqual(this.last7DaysRoe, spotAccountOverviewEntity.last7DaysRoe) && Intrinsics.areEqual(this.baseCurrency, spotAccountOverviewEntity.baseCurrency) && Intrinsics.areEqual(this.baseFiatCurrency, spotAccountOverviewEntity.baseFiatCurrency);
    }

    public SpotAccountOverviewEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.totalAssets = str;
        this.todayPnl = str2;
        this.todayRoe = str3;
        this.last7DaysPnl = str4;
        this.last7DaysRoe = str5;
        this.baseCurrency = str6;
        this.baseFiatCurrency = str7;
    }

    public static /* synthetic */ SpotAccountOverviewEntity copy$default(SpotAccountOverviewEntity spotAccountOverviewEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = spotAccountOverviewEntity.totalAssets;
        }
        if ((i11 & 2) != 0) {
            str2 = spotAccountOverviewEntity.todayPnl;
        }
        if ((i11 & 4) != 0) {
            str3 = spotAccountOverviewEntity.todayRoe;
        }
        if ((i11 & 8) != 0) {
            str4 = spotAccountOverviewEntity.last7DaysPnl;
        }
        if ((i11 & 16) != 0) {
            str5 = spotAccountOverviewEntity.last7DaysRoe;
        }
        if ((i11 & 32) != 0) {
            str6 = spotAccountOverviewEntity.baseCurrency;
        }
        if ((i11 & 64) != 0) {
            str7 = spotAccountOverviewEntity.baseFiatCurrency;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return spotAccountOverviewEntity.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotalAssets() {
        return this.totalAssets;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTodayPnl() {
        return this.todayPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTodayRoe() {
        return this.todayRoe;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLast7DaysPnl() {
        return this.last7DaysPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLast7DaysRoe() {
        return this.last7DaysRoe;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBaseFiatCurrency() {
        return this.baseFiatCurrency;
    }

    @NotNull
    public final SpotAccountOverviewEntity copy(@Nullable String totalAssets, @Nullable String todayPnl, @Nullable String todayRoe, @Nullable String last7DaysPnl, @Nullable String last7DaysRoe, @Nullable String baseCurrency, @Nullable String baseFiatCurrency) {
        return new SpotAccountOverviewEntity(totalAssets, todayPnl, todayRoe, last7DaysPnl, last7DaysRoe, baseCurrency, baseFiatCurrency);
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getBaseFiatCurrency() {
        return this.baseFiatCurrency;
    }

    @Nullable
    public final String getLast7DaysPnl() {
        return this.last7DaysPnl;
    }

    @Nullable
    public final String getLast7DaysRoe() {
        return this.last7DaysRoe;
    }

    @Nullable
    public final String getTodayPnl() {
        return this.todayPnl;
    }

    @Nullable
    public final String getTodayRoe() {
        return this.todayRoe;
    }

    @Nullable
    public final String getTotalAssets() {
        return this.totalAssets;
    }

    public int hashCode() {
        String str = this.totalAssets;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.todayPnl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.todayRoe;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.last7DaysPnl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.last7DaysRoe;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.baseCurrency;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.baseFiatCurrency;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotAccountOverviewEntity(totalAssets=" + this.totalAssets + ", todayPnl=" + this.todayPnl + ", todayRoe=" + this.todayRoe + ", last7DaysPnl=" + this.last7DaysPnl + ", last7DaysRoe=" + this.last7DaysRoe + ", baseCurrency=" + this.baseCurrency + ", baseFiatCurrency=" + this.baseFiatCurrency + ')';
    }

    public /* synthetic */ SpotAccountOverviewEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }
}
