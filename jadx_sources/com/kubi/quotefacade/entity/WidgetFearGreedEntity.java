package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetFearGreedEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/WidgetFearGreedEntity;", "", "today", "Lcom/kubi/quotefacade/entity/FearGreedEntity;", "yesterday", "aweekAgo", "<init>", "(Lcom/kubi/quotefacade/entity/FearGreedEntity;Lcom/kubi/quotefacade/entity/FearGreedEntity;Lcom/kubi/quotefacade/entity/FearGreedEntity;)V", "getToday", "()Lcom/kubi/quotefacade/entity/FearGreedEntity;", "getYesterday", "getAweekAgo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WidgetFearGreedEntity {

    @Nullable
    private final FearGreedEntity aweekAgo;

    @Nullable
    private final FearGreedEntity today;

    @Nullable
    private final FearGreedEntity yesterday;

    public WidgetFearGreedEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetFearGreedEntity)) {
            return false;
        }
        WidgetFearGreedEntity widgetFearGreedEntity = (WidgetFearGreedEntity) other;
        return Intrinsics.areEqual(this.today, widgetFearGreedEntity.today) && Intrinsics.areEqual(this.yesterday, widgetFearGreedEntity.yesterday) && Intrinsics.areEqual(this.aweekAgo, widgetFearGreedEntity.aweekAgo);
    }

    public WidgetFearGreedEntity(@Nullable FearGreedEntity fearGreedEntity, @Nullable FearGreedEntity fearGreedEntity2, @Nullable FearGreedEntity fearGreedEntity3) {
        this.today = fearGreedEntity;
        this.yesterday = fearGreedEntity2;
        this.aweekAgo = fearGreedEntity3;
    }

    public static /* synthetic */ WidgetFearGreedEntity copy$default(WidgetFearGreedEntity widgetFearGreedEntity, FearGreedEntity fearGreedEntity, FearGreedEntity fearGreedEntity2, FearGreedEntity fearGreedEntity3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fearGreedEntity = widgetFearGreedEntity.today;
        }
        if ((i11 & 2) != 0) {
            fearGreedEntity2 = widgetFearGreedEntity.yesterday;
        }
        if ((i11 & 4) != 0) {
            fearGreedEntity3 = widgetFearGreedEntity.aweekAgo;
        }
        return widgetFearGreedEntity.copy(fearGreedEntity, fearGreedEntity2, fearGreedEntity3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FearGreedEntity getToday() {
        return this.today;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FearGreedEntity getYesterday() {
        return this.yesterday;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FearGreedEntity getAweekAgo() {
        return this.aweekAgo;
    }

    @NotNull
    public final WidgetFearGreedEntity copy(@Nullable FearGreedEntity today, @Nullable FearGreedEntity yesterday, @Nullable FearGreedEntity aweekAgo) {
        return new WidgetFearGreedEntity(today, yesterday, aweekAgo);
    }

    @Nullable
    public final FearGreedEntity getAweekAgo() {
        return this.aweekAgo;
    }

    @Nullable
    public final FearGreedEntity getToday() {
        return this.today;
    }

    @Nullable
    public final FearGreedEntity getYesterday() {
        return this.yesterday;
    }

    public int hashCode() {
        FearGreedEntity fearGreedEntity = this.today;
        int iHashCode = (fearGreedEntity == null ? 0 : fearGreedEntity.hashCode()) * 31;
        FearGreedEntity fearGreedEntity2 = this.yesterday;
        int iHashCode2 = (iHashCode + (fearGreedEntity2 == null ? 0 : fearGreedEntity2.hashCode())) * 31;
        FearGreedEntity fearGreedEntity3 = this.aweekAgo;
        return iHashCode2 + (fearGreedEntity3 != null ? fearGreedEntity3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WidgetFearGreedEntity(today=" + this.today + ", yesterday=" + this.yesterday + ", aweekAgo=" + this.aweekAgo + ')';
    }

    public /* synthetic */ WidgetFearGreedEntity(FearGreedEntity fearGreedEntity, FearGreedEntity fearGreedEntity2, FearGreedEntity fearGreedEntity3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fearGreedEntity, (i11 & 2) != 0 ? null : fearGreedEntity2, (i11 & 4) != 0 ? null : fearGreedEntity3);
    }
}
