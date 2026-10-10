package com.kubi.sdk.mode.config.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiteConfigEntity.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/mode/config/data/LiteConfigEntity;", "", "liteEnabled", "", "popupEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLiteEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPopupEnabled", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/sdk/mode/config/data/LiteConfigEntity;", "equals", "other", "hashCode", "", "toString", "", "LModeConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiteConfigEntity {

    @Nullable
    private final Boolean liteEnabled;

    @Nullable
    private final Boolean popupEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public LiteConfigEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiteConfigEntity)) {
            return false;
        }
        LiteConfigEntity liteConfigEntity = (LiteConfigEntity) other;
        return Intrinsics.areEqual(this.liteEnabled, liteConfigEntity.liteEnabled) && Intrinsics.areEqual(this.popupEnabled, liteConfigEntity.popupEnabled);
    }

    public LiteConfigEntity(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.liteEnabled = bool;
        this.popupEnabled = bool2;
    }

    public static /* synthetic */ LiteConfigEntity copy$default(LiteConfigEntity liteConfigEntity, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = liteConfigEntity.liteEnabled;
        }
        if ((i11 & 2) != 0) {
            bool2 = liteConfigEntity.popupEnabled;
        }
        return liteConfigEntity.copy(bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getLiteEnabled() {
        return this.liteEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getPopupEnabled() {
        return this.popupEnabled;
    }

    @NotNull
    public final LiteConfigEntity copy(@Nullable Boolean liteEnabled, @Nullable Boolean popupEnabled) {
        return new LiteConfigEntity(liteEnabled, popupEnabled);
    }

    @Nullable
    public final Boolean getLiteEnabled() {
        return this.liteEnabled;
    }

    @Nullable
    public final Boolean getPopupEnabled() {
        return this.popupEnabled;
    }

    public int hashCode() {
        Boolean bool = this.liteEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.popupEnabled;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LiteConfigEntity(liteEnabled=" + this.liteEnabled + ", popupEnabled=" + this.popupEnabled + ')';
    }

    public /* synthetic */ LiteConfigEntity(Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? Boolean.FALSE : bool2);
    }
}
