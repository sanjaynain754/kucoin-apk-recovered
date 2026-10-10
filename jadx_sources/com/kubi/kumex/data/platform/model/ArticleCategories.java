package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesCampaignActivityEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012JH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012¨\u0006!"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/ArticleCategories;", "", "id", "", "name", "", "path", "type", "", "dataType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getPath", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDataType", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/kumex/data/platform/model/ArticleCategories;", "equals", "", "other", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ArticleCategories {

    @SerializedName("data_type")
    @Nullable
    private final Integer dataType;
    private final long id;

    @Nullable
    private final String name;

    @Nullable
    private final String path;

    @Nullable
    private final Integer type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleCategories)) {
            return false;
        }
        ArticleCategories articleCategories = (ArticleCategories) other;
        return this.id == articleCategories.id && Intrinsics.areEqual(this.name, articleCategories.name) && Intrinsics.areEqual(this.path, articleCategories.path) && Intrinsics.areEqual(this.type, articleCategories.type) && Intrinsics.areEqual(this.dataType, articleCategories.dataType);
    }

    public static /* synthetic */ ArticleCategories copy$default(ArticleCategories articleCategories, long j11, String str, String str2, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = articleCategories.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = articleCategories.name;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = articleCategories.path;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            num = articleCategories.type;
        }
        Integer num3 = num;
        if ((i11 & 16) != 0) {
            num2 = articleCategories.dataType;
        }
        return articleCategories.copy(j12, str3, str4, num3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getDataType() {
        return this.dataType;
    }

    @NotNull
    public final ArticleCategories copy(long id2, @Nullable String name, @Nullable String path, @Nullable Integer type, @Nullable Integer dataType) {
        return new ArticleCategories(id2, name, path, type, dataType);
    }

    @Nullable
    public final Integer getDataType() {
        return this.dataType;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.path;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dataType;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ArticleCategories(id=" + this.id + ", name=" + this.name + ", path=" + this.path + ", type=" + this.type + ", dataType=" + this.dataType + ')';
    }

    public ArticleCategories(long j11, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        this.id = j11;
        this.name = str;
        this.path = str2;
        this.type = num;
        this.dataType = num2;
    }
}
