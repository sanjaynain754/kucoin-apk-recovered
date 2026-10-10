package com.kubi.sdk.site.config.data;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SiteConfigEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/site/config/data/FunctionsEntity;", "", "code", "", "value", "", "<init>", "(Ljava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getValue", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@VisibleForTesting(otherwise = 3)
public final /* data */ class FunctionsEntity {

    @Nullable
    private final String code;
    private final boolean value;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunctionsEntity)) {
            return false;
        }
        FunctionsEntity functionsEntity = (FunctionsEntity) other;
        return Intrinsics.areEqual(this.code, functionsEntity.code) && this.value == functionsEntity.value;
    }

    public static /* synthetic */ FunctionsEntity copy$default(FunctionsEntity functionsEntity, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = functionsEntity.code;
        }
        if ((i11 & 2) != 0) {
            z11 = functionsEntity.value;
        }
        return functionsEntity.copy(str, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    @NotNull
    public final FunctionsEntity copy(@Nullable String code, boolean value) {
        return new FunctionsEntity(code, value);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.code;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "FunctionsEntity(code=" + this.code + ", value=" + this.value + ')';
    }

    public FunctionsEntity(@Nullable String str, boolean z11) {
        this.code = str;
        this.value = z11;
    }
}
