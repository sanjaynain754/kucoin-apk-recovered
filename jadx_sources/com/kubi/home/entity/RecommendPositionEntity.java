package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecommendPositionEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/home/entity/RecommendPositionEntity;", "", "id", "", "imageUrl", "", SignTermItem.LINK, "summary", "title", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImageUrl", "()Ljava/lang/String;", "getLink", "getSummary", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/home/entity/RecommendPositionEntity;", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RecommendPositionEntity {

    @Nullable
    private final Long id;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final String link;

    @Nullable
    private final String summary;

    @Nullable
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendPositionEntity)) {
            return false;
        }
        RecommendPositionEntity recommendPositionEntity = (RecommendPositionEntity) other;
        return Intrinsics.areEqual(this.id, recommendPositionEntity.id) && Intrinsics.areEqual(this.imageUrl, recommendPositionEntity.imageUrl) && Intrinsics.areEqual(this.link, recommendPositionEntity.link) && Intrinsics.areEqual(this.summary, recommendPositionEntity.summary) && Intrinsics.areEqual(this.title, recommendPositionEntity.title);
    }

    public static /* synthetic */ RecommendPositionEntity copy$default(RecommendPositionEntity recommendPositionEntity, Long l11, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = recommendPositionEntity.id;
        }
        if ((i11 & 2) != 0) {
            str = recommendPositionEntity.imageUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = recommendPositionEntity.link;
        }
        if ((i11 & 8) != 0) {
            str3 = recommendPositionEntity.summary;
        }
        if ((i11 & 16) != 0) {
            str4 = recommendPositionEntity.title;
        }
        String str5 = str4;
        String str6 = str2;
        return recommendPositionEntity.copy(l11, str, str6, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final RecommendPositionEntity copy(@Nullable Long id2, @Nullable String imageUrl, @Nullable String link, @Nullable String summary, @Nullable String title) {
        return new RecommendPositionEntity(id2, imageUrl, link, summary, title);
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Long l11 = this.id;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.summary;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecommendPositionEntity(id=" + this.id + ", imageUrl=" + this.imageUrl + ", link=" + this.link + ", summary=" + this.summary + ", title=" + this.title + ')';
    }

    public RecommendPositionEntity(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.id = l11;
        this.imageUrl = str;
        this.link = str2;
        this.summary = str3;
        this.title = str4;
    }
}
