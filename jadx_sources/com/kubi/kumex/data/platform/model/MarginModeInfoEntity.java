package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginModeOfSymbol.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "", "marginMode", "", "setDefaultCross", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getMarginMode", "()Ljava/lang/String;", "getSetDefaultCross", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "equals", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginModeInfoEntity {

    @Nullable
    private final String marginMode;

    @Nullable
    private final Boolean setDefaultCross;

    /* JADX WARN: Multi-variable type inference failed */
    public MarginModeInfoEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginModeInfoEntity)) {
            return false;
        }
        MarginModeInfoEntity marginModeInfoEntity = (MarginModeInfoEntity) other;
        return Intrinsics.areEqual(this.marginMode, marginModeInfoEntity.marginMode) && Intrinsics.areEqual(this.setDefaultCross, marginModeInfoEntity.setDefaultCross);
    }

    public MarginModeInfoEntity(@Nullable String str, @Nullable Boolean bool) {
        this.marginMode = str;
        this.setDefaultCross = bool;
    }

    public static /* synthetic */ MarginModeInfoEntity copy$default(MarginModeInfoEntity marginModeInfoEntity, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginModeInfoEntity.marginMode;
        }
        if ((i11 & 2) != 0) {
            bool = marginModeInfoEntity.setDefaultCross;
        }
        return marginModeInfoEntity.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSetDefaultCross() {
        return this.setDefaultCross;
    }

    @NotNull
    public final MarginModeInfoEntity copy(@Nullable String marginMode, @Nullable Boolean setDefaultCross) {
        return new MarginModeInfoEntity(marginMode, setDefaultCross);
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Boolean getSetDefaultCross() {
        return this.setDefaultCross;
    }

    public int hashCode() {
        String str = this.marginMode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.setDefaultCross;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginModeInfoEntity(marginMode=" + this.marginMode + ", setDefaultCross=" + this.setDefaultCross + ')';
    }

    public /* synthetic */ MarginModeInfoEntity(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool);
    }
}
