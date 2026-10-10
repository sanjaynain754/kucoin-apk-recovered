package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.kubi.operation.api.entity.SearchTopicEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchTopicWrap.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/search/entity/TopSearchEntityWrap;", "", "realtimeEntity", "Lcom/kubi/search/entity/SearchRealtimeEntity;", "sameCoin", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/api/entity/SearchTopicEntity;", "<init>", "(Lcom/kubi/search/entity/SearchRealtimeEntity;ZLcom/kubi/operation/api/entity/SearchTopicEntity;)V", "getRealtimeEntity", "()Lcom/kubi/search/entity/SearchRealtimeEntity;", "getSameCoin", "()Z", "getEntity", "()Lcom/kubi/operation/api/entity/SearchTopicEntity;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TopSearchEntityWrap {

    @Nullable
    private final SearchTopicEntity entity;

    @Nullable
    private final SearchRealtimeEntity realtimeEntity;
    private final boolean sameCoin;

    public TopSearchEntityWrap() {
        this(null, false, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopSearchEntityWrap)) {
            return false;
        }
        TopSearchEntityWrap topSearchEntityWrap = (TopSearchEntityWrap) other;
        return Intrinsics.areEqual(this.realtimeEntity, topSearchEntityWrap.realtimeEntity) && this.sameCoin == topSearchEntityWrap.sameCoin && Intrinsics.areEqual(this.entity, topSearchEntityWrap.entity);
    }

    public TopSearchEntityWrap(@Nullable SearchRealtimeEntity searchRealtimeEntity, boolean z11, @Nullable SearchTopicEntity searchTopicEntity) {
        this.realtimeEntity = searchRealtimeEntity;
        this.sameCoin = z11;
        this.entity = searchTopicEntity;
    }

    public static /* synthetic */ TopSearchEntityWrap copy$default(TopSearchEntityWrap topSearchEntityWrap, SearchRealtimeEntity searchRealtimeEntity, boolean z11, SearchTopicEntity searchTopicEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            searchRealtimeEntity = topSearchEntityWrap.realtimeEntity;
        }
        if ((i11 & 2) != 0) {
            z11 = topSearchEntityWrap.sameCoin;
        }
        if ((i11 & 4) != 0) {
            searchTopicEntity = topSearchEntityWrap.entity;
        }
        return topSearchEntityWrap.copy(searchRealtimeEntity, z11, searchTopicEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SearchRealtimeEntity getRealtimeEntity() {
        return this.realtimeEntity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSameCoin() {
        return this.sameCoin;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SearchTopicEntity getEntity() {
        return this.entity;
    }

    @NotNull
    public final TopSearchEntityWrap copy(@Nullable SearchRealtimeEntity realtimeEntity, boolean sameCoin, @Nullable SearchTopicEntity entity) {
        return new TopSearchEntityWrap(realtimeEntity, sameCoin, entity);
    }

    @Nullable
    public final SearchTopicEntity getEntity() {
        return this.entity;
    }

    @Nullable
    public final SearchRealtimeEntity getRealtimeEntity() {
        return this.realtimeEntity;
    }

    public final boolean getSameCoin() {
        return this.sameCoin;
    }

    public int hashCode() {
        SearchRealtimeEntity searchRealtimeEntity = this.realtimeEntity;
        int iHashCode = (((searchRealtimeEntity == null ? 0 : searchRealtimeEntity.hashCode()) * 31) + Boolean.hashCode(this.sameCoin)) * 31;
        SearchTopicEntity searchTopicEntity = this.entity;
        return iHashCode + (searchTopicEntity != null ? searchTopicEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TopSearchEntityWrap(realtimeEntity=" + this.realtimeEntity + ", sameCoin=" + this.sameCoin + ", entity=" + this.entity + ')';
    }

    public /* synthetic */ TopSearchEntityWrap(SearchRealtimeEntity searchRealtimeEntity, boolean z11, SearchTopicEntity searchTopicEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : searchRealtimeEntity, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : searchTopicEntity);
    }
}
