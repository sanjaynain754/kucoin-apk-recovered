package com.kubi.kucoin.home.p090v2.cards;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cards.e, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: BaseCardDataV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cards/CardStyle;", "", "name", "", "mapping", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "gridType", "", "<init>", "(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getMapping", "()Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "getGridType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CardStyle {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public String name;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final ClassMappingV2 mapping;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int gridType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardStyle)) {
            return false;
        }
        CardStyle cardStyle = (CardStyle) other;
        return Intrinsics.areEqual(this.name, cardStyle.name) && Intrinsics.areEqual(this.mapping, cardStyle.mapping) && this.gridType == cardStyle.gridType;
    }

    public CardStyle(@NotNull String name, @NotNull ClassMappingV2 mapping, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        this.name = name;
        this.mapping = mapping;
        this.gridType = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGridType() {
        return this.gridType;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ClassMappingV2 getMapping() {
        return this.mapping;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.mapping.hashCode()) * 31) + Integer.hashCode(this.gridType);
    }

    @NotNull
    public String toString() {
        return "CardStyle(name=" + this.name + ", mapping=" + this.mapping + ", gridType=" + this.gridType + ')';
    }
}
