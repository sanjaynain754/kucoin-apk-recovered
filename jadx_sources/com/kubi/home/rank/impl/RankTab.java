package com.kubi.home.rank.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.l, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: RankTab.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankTab;", "", "key", "", "type", "", "defaultType", "title", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getType", "()I", "setType", "(I)V", "getDefaultType", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RankTab {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: from toString */
    public int type;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int defaultType;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankTab)) {
            return false;
        }
        RankTab rankTab = (RankTab) other;
        return Intrinsics.areEqual(this.key, rankTab.key) && this.type == rankTab.type && this.defaultType == rankTab.defaultType && Intrinsics.areEqual(this.title, rankTab.title);
    }

    public RankTab(@NotNull String key, int i11, int i12, @NotNull String title) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        this.key = key;
        this.type = i11;
        this.defaultType = i12;
        this.title = title;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ RankTab m29992b(RankTab rankTab, String str, int i11, int i12, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rankTab.key;
        }
        if ((i13 & 2) != 0) {
            i11 = rankTab.type;
        }
        if ((i13 & 4) != 0) {
            i12 = rankTab.defaultType;
        }
        if ((i13 & 8) != 0) {
            str2 = rankTab.title;
        }
        return rankTab.m29993a(str, i11, i12, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final RankTab m29993a(@NotNull String key, int i11, int i12, @NotNull String title) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        return new RankTab(key, i11, i12, title);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDefaultType() {
        return this.defaultType;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.key.hashCode() * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.defaultType)) * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "RankTab(key=" + this.key + ", type=" + this.type + ", defaultType=" + this.defaultType + ", title=" + this.title + ')';
    }
}
