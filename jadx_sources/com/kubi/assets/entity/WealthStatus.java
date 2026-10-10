package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WealthEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/entity/WealthStatus;", "", "hasNext", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/entity/WealthStatusItem;", "<init>", "(ZLjava/util/List;)V", "getHasNext", "()Z", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WealthStatus {
    private final boolean hasNext;

    @Nullable
    private final List<WealthStatusItem> items;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WealthStatus)) {
            return false;
        }
        WealthStatus wealthStatus = (WealthStatus) other;
        return this.hasNext == wealthStatus.hasNext && Intrinsics.areEqual(this.items, wealthStatus.items);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WealthStatus copy$default(WealthStatus wealthStatus, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = wealthStatus.hasNext;
        }
        if ((i11 & 2) != 0) {
            list = wealthStatus.items;
        }
        return wealthStatus.copy(z11, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    @Nullable
    public final List<WealthStatusItem> component2() {
        return this.items;
    }

    @NotNull
    public final WealthStatus copy(boolean hasNext, @Nullable List<WealthStatusItem> items) {
        return new WealthStatus(hasNext, items);
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    @Nullable
    public final List<WealthStatusItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasNext) * 31;
        List<WealthStatusItem> list = this.items;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "WealthStatus(hasNext=" + this.hasNext + ", items=" + this.items + ')';
    }

    public WealthStatus(boolean z11, @Nullable List<WealthStatusItem> list) {
        this.hasNext = z11;
        this.items = list;
    }
}
