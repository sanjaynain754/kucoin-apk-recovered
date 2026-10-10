package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesCampaignActivityEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J|\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/Article;", "", "id", "", "title", "", "path", "summary", "images", "", "firstPublishAt", "categories", "Lcom/kubi/kumex/data/platform/model/ArticleCategories;", "publishTime", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTitle", "()Ljava/lang/String;", "getPath", "getSummary", "getImages", "()Ljava/util/List;", "getFirstPublishAt", "getCategories", "getPublishTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;)Lcom/kubi/kumex/data/platform/model/Article;", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Article {

    @Nullable
    private final List<ArticleCategories> categories;

    @SerializedName("first_publish_at")
    @Nullable
    private final Long firstPublishAt;

    @Nullable
    private final Long id;

    @Nullable
    private final List<String> images;

    @Nullable
    private final String path;

    @SerializedName("publish_ts")
    @Nullable
    private final Long publishTime;

    @Nullable
    private final String summary;

    @Nullable
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Article)) {
            return false;
        }
        Article article = (Article) other;
        return Intrinsics.areEqual(this.id, article.id) && Intrinsics.areEqual(this.title, article.title) && Intrinsics.areEqual(this.path, article.path) && Intrinsics.areEqual(this.summary, article.summary) && Intrinsics.areEqual(this.images, article.images) && Intrinsics.areEqual(this.firstPublishAt, article.firstPublishAt) && Intrinsics.areEqual(this.categories, article.categories) && Intrinsics.areEqual(this.publishTime, article.publishTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Article copy$default(Article article, Long l11, String str, String str2, String str3, List list, Long l12, List list2, Long l13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = article.id;
        }
        if ((i11 & 2) != 0) {
            str = article.title;
        }
        if ((i11 & 4) != 0) {
            str2 = article.path;
        }
        if ((i11 & 8) != 0) {
            str3 = article.summary;
        }
        if ((i11 & 16) != 0) {
            list = article.images;
        }
        if ((i11 & 32) != 0) {
            l12 = article.firstPublishAt;
        }
        if ((i11 & 64) != 0) {
            list2 = article.categories;
        }
        if ((i11 & 128) != 0) {
            l13 = article.publishTime;
        }
        List list3 = list2;
        Long l14 = l13;
        List list4 = list;
        Long l15 = l12;
        return article.copy(l11, str, str2, str3, list4, l15, list3, l14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    public final List<String> component5() {
        return this.images;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getFirstPublishAt() {
        return this.firstPublishAt;
    }

    @Nullable
    public final List<ArticleCategories> component7() {
        return this.categories;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getPublishTime() {
        return this.publishTime;
    }

    @NotNull
    public final Article copy(@Nullable Long id2, @Nullable String title, @Nullable String path, @Nullable String summary, @Nullable List<String> images, @Nullable Long firstPublishAt, @Nullable List<ArticleCategories> categories, @Nullable Long publishTime) {
        return new Article(id2, title, path, summary, images, firstPublishAt, categories, publishTime);
    }

    @Nullable
    public final List<ArticleCategories> getCategories() {
        return this.categories;
    }

    @Nullable
    public final Long getFirstPublishAt() {
        return this.firstPublishAt;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getImages() {
        return this.images;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Long getPublishTime() {
        return this.publishTime;
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
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.path;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.summary;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.images;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l12 = this.firstPublishAt;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        List<ArticleCategories> list2 = this.categories;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l13 = this.publishTime;
        return iHashCode7 + (l13 != null ? l13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Article(id=" + this.id + ", title=" + this.title + ", path=" + this.path + ", summary=" + this.summary + ", images=" + this.images + ", firstPublishAt=" + this.firstPublishAt + ", categories=" + this.categories + ", publishTime=" + this.publishTime + ')';
    }

    public Article(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Long l12, @Nullable List<ArticleCategories> list2, @Nullable Long l13) {
        this.id = l11;
        this.title = str;
        this.path = str2;
        this.summary = str3;
        this.images = list;
        this.firstPublishAt = l12;
        this.categories = list2;
        this.publishTime = l13;
    }
}
