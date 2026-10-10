package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTradingEntity;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/copytrading/assets/LeadTradingItemEntity;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadTradingEntity {

    @Nullable
    private final List<LeadTradingItemEntity> items;

    /* JADX WARN: Multi-variable type inference failed */
    public LeadTradingEntity() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LeadTradingEntity) && Intrinsics.areEqual(this.items, ((LeadTradingEntity) other).items);
    }

    public LeadTradingEntity(@Nullable List<LeadTradingItemEntity> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadTradingEntity copy$default(LeadTradingEntity leadTradingEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = leadTradingEntity.items;
        }
        return leadTradingEntity.copy(list);
    }

    @Nullable
    public final List<LeadTradingItemEntity> component1() {
        return this.items;
    }

    @NotNull
    public final LeadTradingEntity copy(@Nullable List<LeadTradingItemEntity> items) {
        return new LeadTradingEntity(items);
    }

    @Nullable
    public final List<LeadTradingItemEntity> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<LeadTradingItemEntity> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeadTradingEntity(items=" + this.items + ')';
    }

    public /* synthetic */ LeadTradingEntity(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
