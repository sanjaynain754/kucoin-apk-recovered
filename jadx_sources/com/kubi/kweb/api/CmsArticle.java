package com.kubi.kweb.api;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.C33616e0;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CmsArticle.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u001e\u0010\f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001`\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u001e\u0010\u0013\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010)\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ!\u0010.\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J!\u00105\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jø\u0001\u00107\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2 \b\u0002\u0010\f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001`\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0007HÖ\u0001R)\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR)\u0010\f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR)\u0010\u0013\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006?"}, m90084d2 = {"Lcom/kubi/kweb/api/CmsArticle;", "", "categories", "Ljava/util/ArrayList;", "Lcom/kubi/kweb/api/CmsArticleType;", "Lkotlin/collections/ArrayList;", "content", "", "first_publish_at", "", "hot", "id", "images", "path", "publish_at", "publish_ts", "pv", "stick", "summary", C33616e0.f69644s, "title", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "getCategories", "()Ljava/util/ArrayList;", "getContent", "()Ljava/lang/String;", "getFirst_publish_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHot", "getId", "getImages", "getPath", "getPublish_at", "getPublish_ts", "getPv", "getStick", "getSummary", "getTags", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Lcom/kubi/kweb/api/CmsArticle;", "equals", "", "other", "hashCode", "", "toString", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CmsArticle {

    @Nullable
    private final ArrayList<CmsArticleType> categories;

    @Nullable
    private final String content;

    @Nullable
    private final Long first_publish_at;

    @Nullable
    private final Long hot;

    @Nullable
    private final Long id;

    @Nullable
    private final ArrayList<String> images;

    @Nullable
    private final String path;

    @Nullable
    private final String publish_at;

    @Nullable
    private final Long publish_ts;

    @Nullable
    private final Long pv;

    @Nullable
    private final Long stick;

    @Nullable
    private final String summary;

    @Nullable
    private final ArrayList<Object> tags;

    @Nullable
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmsArticle)) {
            return false;
        }
        CmsArticle cmsArticle = (CmsArticle) other;
        return Intrinsics.areEqual(this.categories, cmsArticle.categories) && Intrinsics.areEqual(this.content, cmsArticle.content) && Intrinsics.areEqual(this.first_publish_at, cmsArticle.first_publish_at) && Intrinsics.areEqual(this.hot, cmsArticle.hot) && Intrinsics.areEqual(this.id, cmsArticle.id) && Intrinsics.areEqual(this.images, cmsArticle.images) && Intrinsics.areEqual(this.path, cmsArticle.path) && Intrinsics.areEqual(this.publish_at, cmsArticle.publish_at) && Intrinsics.areEqual(this.publish_ts, cmsArticle.publish_ts) && Intrinsics.areEqual(this.pv, cmsArticle.pv) && Intrinsics.areEqual(this.stick, cmsArticle.stick) && Intrinsics.areEqual(this.summary, cmsArticle.summary) && Intrinsics.areEqual(this.tags, cmsArticle.tags) && Intrinsics.areEqual(this.title, cmsArticle.title);
    }

    @Nullable
    public final ArrayList<CmsArticleType> component1() {
        return this.categories;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getPv() {
        return this.pv;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getStick() {
        return this.stick;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    public final ArrayList<Object> component13() {
        return this.tags;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getFirst_publish_at() {
        return this.first_publish_at;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getHot() {
        return this.hot;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final ArrayList<String> component6() {
        return this.images;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPublish_at() {
        return this.publish_at;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getPublish_ts() {
        return this.publish_ts;
    }

    @NotNull
    public final CmsArticle copy(@Nullable ArrayList<CmsArticleType> categories, @Nullable String content, @Nullable Long first_publish_at, @Nullable Long hot, @Nullable Long id2, @Nullable ArrayList<String> images, @Nullable String path, @Nullable String publish_at, @Nullable Long publish_ts, @Nullable Long pv2, @Nullable Long stick, @Nullable String summary, @Nullable ArrayList<Object> tags, @Nullable String title) {
        return new CmsArticle(categories, content, first_publish_at, hot, id2, images, path, publish_at, publish_ts, pv2, stick, summary, tags, title);
    }

    @Nullable
    public final ArrayList<CmsArticleType> getCategories() {
        return this.categories;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getFirst_publish_at() {
        return this.first_publish_at;
    }

    @Nullable
    public final Long getHot() {
        return this.hot;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final ArrayList<String> getImages() {
        return this.images;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final String getPublish_at() {
        return this.publish_at;
    }

    @Nullable
    public final Long getPublish_ts() {
        return this.publish_ts;
    }

    @Nullable
    public final Long getPv() {
        return this.pv;
    }

    @Nullable
    public final Long getStick() {
        return this.stick;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    public final ArrayList<Object> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        ArrayList<CmsArticleType> arrayList = this.categories;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.content;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.first_publish_at;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.hot;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.id;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        ArrayList<String> arrayList2 = this.images;
        int iHashCode6 = (iHashCode5 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        String str2 = this.path;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publish_at;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.publish_ts;
        int iHashCode9 = (iHashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.pv;
        int iHashCode10 = (iHashCode9 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.stick;
        int iHashCode11 = (iHashCode10 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str4 = this.summary;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<Object> arrayList3 = this.tags;
        int iHashCode13 = (iHashCode12 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        String str5 = this.title;
        return iHashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CmsArticle(categories=" + this.categories + ", content=" + this.content + ", first_publish_at=" + this.first_publish_at + ", hot=" + this.hot + ", id=" + this.id + ", images=" + this.images + ", path=" + this.path + ", publish_at=" + this.publish_at + ", publish_ts=" + this.publish_ts + ", pv=" + this.pv + ", stick=" + this.stick + ", summary=" + this.summary + ", tags=" + this.tags + ", title=" + this.title + ')';
    }

    public CmsArticle(@Nullable ArrayList<CmsArticleType> arrayList, @Nullable String str, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable ArrayList<String> arrayList2, @Nullable String str2, @Nullable String str3, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16, @Nullable String str4, @Nullable ArrayList<Object> arrayList3, @Nullable String str5) {
        this.categories = arrayList;
        this.content = str;
        this.first_publish_at = l11;
        this.hot = l12;
        this.id = l13;
        this.images = arrayList2;
        this.path = str2;
        this.publish_at = str3;
        this.publish_ts = l14;
        this.pv = l15;
        this.stick = l16;
        this.summary = str4;
        this.tags = arrayList3;
        this.title = str5;
    }
}
