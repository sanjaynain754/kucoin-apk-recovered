package com.kubi.fallback.internal.config;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FallbackData.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/fallback/internal/config/FallbackData;", "", "fallbackType", "", "fallbackValue", "bizType", "discardParams", "", "errorCode", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getFallbackType", "()Ljava/lang/String;", "getFallbackValue", "getBizType", "getDiscardParams", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getErrorCode", "getPath", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/fallback/internal/config/FallbackData;", "equals", "other", "hashCode", "", "toString", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FallbackData {

    @SerializedName("bizType")
    @Nullable
    private final String bizType;

    @SerializedName("discardParams")
    @Nullable
    private final Boolean discardParams;

    @SerializedName("errorCode")
    @Nullable
    private final String errorCode;

    @SerializedName("fallbackType")
    @Nullable
    private final String fallbackType;

    @SerializedName("fallbackValue")
    @Nullable
    private final String fallbackValue;

    @SerializedName("path")
    @Nullable
    private final String path;

    public FallbackData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallbackData)) {
            return false;
        }
        FallbackData fallbackData = (FallbackData) other;
        return Intrinsics.areEqual(this.fallbackType, fallbackData.fallbackType) && Intrinsics.areEqual(this.fallbackValue, fallbackData.fallbackValue) && Intrinsics.areEqual(this.bizType, fallbackData.bizType) && Intrinsics.areEqual(this.discardParams, fallbackData.discardParams) && Intrinsics.areEqual(this.errorCode, fallbackData.errorCode) && Intrinsics.areEqual(this.path, fallbackData.path);
    }

    public FallbackData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5) {
        this.fallbackType = str;
        this.fallbackValue = str2;
        this.bizType = str3;
        this.discardParams = bool;
        this.errorCode = str4;
        this.path = str5;
    }

    public static /* synthetic */ FallbackData copy$default(FallbackData fallbackData, String str, String str2, String str3, Boolean bool, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fallbackData.fallbackType;
        }
        if ((i11 & 2) != 0) {
            str2 = fallbackData.fallbackValue;
        }
        if ((i11 & 4) != 0) {
            str3 = fallbackData.bizType;
        }
        if ((i11 & 8) != 0) {
            bool = fallbackData.discardParams;
        }
        if ((i11 & 16) != 0) {
            str4 = fallbackData.errorCode;
        }
        if ((i11 & 32) != 0) {
            str5 = fallbackData.path;
        }
        String str6 = str4;
        String str7 = str5;
        return fallbackData.copy(str, str2, str3, bool, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFallbackType() {
        return this.fallbackType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFallbackValue() {
        return this.fallbackValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getDiscardParams() {
        return this.discardParams;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final FallbackData copy(@Nullable String fallbackType, @Nullable String fallbackValue, @Nullable String bizType, @Nullable Boolean discardParams, @Nullable String errorCode, @Nullable String path) {
        return new FallbackData(fallbackType, fallbackValue, bizType, discardParams, errorCode, path);
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final Boolean getDiscardParams() {
        return this.discardParams;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getFallbackType() {
        return this.fallbackType;
    }

    @Nullable
    public final String getFallbackValue() {
        return this.fallbackValue;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.fallbackType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fallbackValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bizType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.discardParams;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.errorCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.path;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FallbackData(fallbackType=" + this.fallbackType + ", fallbackValue=" + this.fallbackValue + ", bizType=" + this.bizType + ", discardParams=" + this.discardParams + ", errorCode=" + this.errorCode + ", path=" + this.path + ')';
    }

    public /* synthetic */ FallbackData(String str, String str2, String str3, Boolean bool, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? Boolean.FALSE : bool, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5);
    }
}
