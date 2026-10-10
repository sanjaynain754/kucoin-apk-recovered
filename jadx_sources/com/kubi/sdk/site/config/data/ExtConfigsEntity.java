package com.kubi.sdk.site.config.data;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.google.gson.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SiteConfigEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/site/config/data/ExtConfigsEntity;", "", "type", "", "key", "value", "Lcom/google/gson/JsonElement;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;)V", "getType", "()Ljava/lang/String;", "getKey", "getValue", "()Lcom/google/gson/JsonElement;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@VisibleForTesting(otherwise = 3)
public final /* data */ class ExtConfigsEntity {

    @Nullable
    private final String key;

    @Nullable
    private final String type;

    @Nullable
    private final JsonElement value;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtConfigsEntity)) {
            return false;
        }
        ExtConfigsEntity extConfigsEntity = (ExtConfigsEntity) other;
        return Intrinsics.areEqual(this.type, extConfigsEntity.type) && Intrinsics.areEqual(this.key, extConfigsEntity.key) && Intrinsics.areEqual(this.value, extConfigsEntity.value);
    }

    public static /* synthetic */ ExtConfigsEntity copy$default(ExtConfigsEntity extConfigsEntity, String str, String str2, JsonElement jsonElement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = extConfigsEntity.type;
        }
        if ((i11 & 2) != 0) {
            str2 = extConfigsEntity.key;
        }
        if ((i11 & 4) != 0) {
            jsonElement = extConfigsEntity.value;
        }
        return extConfigsEntity.copy(str, str2, jsonElement);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonElement getValue() {
        return this.value;
    }

    @NotNull
    public final ExtConfigsEntity copy(@Nullable String type, @Nullable String key, @Nullable JsonElement value) {
        return new ExtConfigsEntity(type, key, value);
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final JsonElement getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        JsonElement jsonElement = this.value;
        return iHashCode2 + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ExtConfigsEntity(type=" + this.type + ", key=" + this.key + ", value=" + this.value + ')';
    }

    public ExtConfigsEntity(@Nullable String str, @Nullable String str2, @Nullable JsonElement jsonElement) {
        this.type = str;
        this.key = str2;
        this.value = jsonElement;
    }
}
