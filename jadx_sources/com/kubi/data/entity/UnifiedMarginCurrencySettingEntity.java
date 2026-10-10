package com.kubi.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedMarginCurrencyEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;", "", "mode", "", "marginCurrencies", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getMode", "()Ljava/lang/String;", "getMarginCurrencies", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedMarginCurrencySettingEntity {

    @SerializedName("marginCurrencies")
    @Nullable
    private final List<String> marginCurrencies;

    @SerializedName("mode")
    @Nullable
    private final String mode;

    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedMarginCurrencySettingEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedMarginCurrencySettingEntity)) {
            return false;
        }
        UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity = (UnifiedMarginCurrencySettingEntity) other;
        return Intrinsics.areEqual(this.mode, unifiedMarginCurrencySettingEntity.mode) && Intrinsics.areEqual(this.marginCurrencies, unifiedMarginCurrencySettingEntity.marginCurrencies);
    }

    public UnifiedMarginCurrencySettingEntity(@Nullable String str, @Nullable List<String> list) {
        this.mode = str;
        this.marginCurrencies = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifiedMarginCurrencySettingEntity copy$default(UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifiedMarginCurrencySettingEntity.mode;
        }
        if ((i11 & 2) != 0) {
            list = unifiedMarginCurrencySettingEntity.marginCurrencies;
        }
        return unifiedMarginCurrencySettingEntity.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    public final List<String> component2() {
        return this.marginCurrencies;
    }

    @NotNull
    public final UnifiedMarginCurrencySettingEntity copy(@Nullable String mode, @Nullable List<String> marginCurrencies) {
        return new UnifiedMarginCurrencySettingEntity(mode, marginCurrencies);
    }

    @Nullable
    public final List<String> getMarginCurrencies() {
        return this.marginCurrencies;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        String str = this.mode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.marginCurrencies;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifiedMarginCurrencySettingEntity(mode=" + this.mode + ", marginCurrencies=" + this.marginCurrencies + ')';
    }

    public /* synthetic */ UnifiedMarginCurrencySettingEntity(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list);
    }
}
