package com.kubi.kweb.api;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CmsArticle.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kweb/api/CmsArticleType;", "", "id", "", "name", "", "path", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getPath", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kweb/api/CmsArticleType;", "equals", "", "other", "hashCode", "", "toString", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CmsArticleType {

    @Nullable
    private final Long id;

    @Nullable
    private final String name;

    @Nullable
    private final String path;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmsArticleType)) {
            return false;
        }
        CmsArticleType cmsArticleType = (CmsArticleType) other;
        return Intrinsics.areEqual(this.id, cmsArticleType.id) && Intrinsics.areEqual(this.name, cmsArticleType.name) && Intrinsics.areEqual(this.path, cmsArticleType.path);
    }

    public static /* synthetic */ CmsArticleType copy$default(CmsArticleType cmsArticleType, Long l11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = cmsArticleType.id;
        }
        if ((i11 & 2) != 0) {
            str = cmsArticleType.name;
        }
        if ((i11 & 4) != 0) {
            str2 = cmsArticleType.path;
        }
        return cmsArticleType.copy(l11, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
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

    @NotNull
    public final CmsArticleType copy(@Nullable Long id2, @Nullable String name, @Nullable String path) {
        return new CmsArticleType(id2, name, path);
    }

    @Nullable
    public final Long getId() {
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

    public int hashCode() {
        Long l11 = this.id;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.path;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CmsArticleType(id=" + this.id + ", name=" + this.name + ", path=" + this.path + ')';
    }

    public CmsArticleType(@Nullable Long l11, @Nullable String str, @Nullable String str2) {
        this.id = l11;
        this.name = str;
        this.path = str2;
    }
}
