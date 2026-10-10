package com.kubi.mine.lib.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReferralTextConfig.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/ConfigProperty;", "", "value", "", "backupValues", "Lcom/kubi/mine/lib/entity/ConfigBackupValue;", "<init>", "(Ljava/lang/String;Lcom/kubi/mine/lib/entity/ConfigBackupValue;)V", "getValue", "()Ljava/lang/String;", "getBackupValues", "()Lcom/kubi/mine/lib/entity/ConfigBackupValue;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ConfigProperty {

    @Nullable
    private final ConfigBackupValue backupValues;

    @Nullable
    private final String value;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigProperty)) {
            return false;
        }
        ConfigProperty configProperty = (ConfigProperty) other;
        return Intrinsics.areEqual(this.value, configProperty.value) && Intrinsics.areEqual(this.backupValues, configProperty.backupValues);
    }

    public static /* synthetic */ ConfigProperty copy$default(ConfigProperty configProperty, String str, ConfigBackupValue configBackupValue, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = configProperty.value;
        }
        if ((i11 & 2) != 0) {
            configBackupValue = configProperty.backupValues;
        }
        return configProperty.copy(str, configBackupValue);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConfigBackupValue getBackupValues() {
        return this.backupValues;
    }

    @NotNull
    public final ConfigProperty copy(@Nullable String value, @Nullable ConfigBackupValue backupValues) {
        return new ConfigProperty(value, backupValues);
    }

    @Nullable
    public final ConfigBackupValue getBackupValues() {
        return this.backupValues;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ConfigBackupValue configBackupValue = this.backupValues;
        return iHashCode + (configBackupValue != null ? configBackupValue.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConfigProperty(value=" + this.value + ", backupValues=" + this.backupValues + ')';
    }

    public ConfigProperty(@Nullable String str, @Nullable ConfigBackupValue configBackupValue) {
        this.value = str;
        this.backupValues = configBackupValue;
    }
}
