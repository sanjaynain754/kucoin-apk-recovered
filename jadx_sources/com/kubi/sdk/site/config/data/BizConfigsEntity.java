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
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/site/config/data/BizConfigsEntity;", "", "code", "", "value", "Lcom/google/gson/JsonElement;", "<init>", "(Ljava/lang/String;Lcom/google/gson/JsonElement;)V", "getCode", "()Ljava/lang/String;", "getValue", "()Lcom/google/gson/JsonElement;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@VisibleForTesting(otherwise = 3)
public final /* data */ class BizConfigsEntity {

    @Nullable
    private final String code;

    @Nullable
    private final JsonElement value;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BizConfigsEntity)) {
            return false;
        }
        BizConfigsEntity bizConfigsEntity = (BizConfigsEntity) other;
        return Intrinsics.areEqual(this.code, bizConfigsEntity.code) && Intrinsics.areEqual(this.value, bizConfigsEntity.value);
    }

    public static /* synthetic */ BizConfigsEntity copy$default(BizConfigsEntity bizConfigsEntity, String str, JsonElement jsonElement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bizConfigsEntity.code;
        }
        if ((i11 & 2) != 0) {
            jsonElement = bizConfigsEntity.value;
        }
        return bizConfigsEntity.copy(str, jsonElement);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getValue() {
        return this.value;
    }

    @NotNull
    public final BizConfigsEntity copy(@Nullable String code, @Nullable JsonElement value) {
        return new BizConfigsEntity(code, value);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final JsonElement getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonElement jsonElement = this.value;
        return iHashCode + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BizConfigsEntity(code=" + this.code + ", value=" + this.value + ')';
    }

    public BizConfigsEntity(@Nullable String str, @Nullable JsonElement jsonElement) {
        this.code = str;
        this.value = jsonElement;
    }
}
