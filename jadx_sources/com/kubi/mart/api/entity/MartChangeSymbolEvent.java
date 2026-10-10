package com.kubi.mart.api.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MartChangeSymbolEvent.kt */
/* JADX INFO: loaded from: classes28.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/mart/api/entity/MartChangeSymbolEvent;", "", "sidebarType", "", "symbolCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSidebarType", "()Ljava/lang/String;", "getSymbolCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MartApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MartChangeSymbolEvent {

    @NotNull
    private final String sidebarType;

    @NotNull
    private final String symbolCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MartChangeSymbolEvent)) {
            return false;
        }
        MartChangeSymbolEvent martChangeSymbolEvent = (MartChangeSymbolEvent) other;
        return Intrinsics.areEqual(this.sidebarType, martChangeSymbolEvent.sidebarType) && Intrinsics.areEqual(this.symbolCode, martChangeSymbolEvent.symbolCode);
    }

    public MartChangeSymbolEvent(@NotNull String sidebarType, @NotNull String symbolCode) {
        Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
        Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
        this.sidebarType = sidebarType;
        this.symbolCode = symbolCode;
    }

    public static /* synthetic */ MartChangeSymbolEvent copy$default(MartChangeSymbolEvent martChangeSymbolEvent, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = martChangeSymbolEvent.sidebarType;
        }
        if ((i11 & 2) != 0) {
            str2 = martChangeSymbolEvent.symbolCode;
        }
        return martChangeSymbolEvent.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSidebarType() {
        return this.sidebarType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @NotNull
    public final MartChangeSymbolEvent copy(@NotNull String sidebarType, @NotNull String symbolCode) {
        Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
        Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
        return new MartChangeSymbolEvent(sidebarType, symbolCode);
    }

    @NotNull
    public final String getSidebarType() {
        return this.sidebarType;
    }

    @NotNull
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    public int hashCode() {
        return (this.sidebarType.hashCode() * 31) + this.symbolCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "MartChangeSymbolEvent(sidebarType=" + this.sidebarType + ", symbolCode=" + this.symbolCode + ')';
    }
}
