package com.kubi.kumex.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeTypeFilterData.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/entity/TradeTypeFilterData;", "", "typeStringRes", "", "type", "", "<init>", "(ILjava/lang/String;)V", "getTypeStringRes", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeTypeFilterData {

    @Nullable
    private final String type;
    private final int typeStringRes;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeTypeFilterData)) {
            return false;
        }
        TradeTypeFilterData tradeTypeFilterData = (TradeTypeFilterData) other;
        return this.typeStringRes == tradeTypeFilterData.typeStringRes && Intrinsics.areEqual(this.type, tradeTypeFilterData.type);
    }

    public static /* synthetic */ TradeTypeFilterData copy$default(TradeTypeFilterData tradeTypeFilterData, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = tradeTypeFilterData.typeStringRes;
        }
        if ((i12 & 2) != 0) {
            str = tradeTypeFilterData.type;
        }
        return tradeTypeFilterData.copy(i11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTypeStringRes() {
        return this.typeStringRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final TradeTypeFilterData copy(int typeStringRes, @Nullable String type) {
        return new TradeTypeFilterData(typeStringRes, type);
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final int getTypeStringRes() {
        return this.typeStringRes;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.typeStringRes) * 31;
        String str = this.type;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "TradeTypeFilterData(typeStringRes=" + this.typeStringRes + ", type=" + this.type + ')';
    }

    public TradeTypeFilterData(int i11, @Nullable String str) {
        this.typeStringRes = i11;
        this.type = str;
    }
}
