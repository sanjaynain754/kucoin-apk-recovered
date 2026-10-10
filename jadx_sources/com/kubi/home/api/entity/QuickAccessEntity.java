package com.kubi.home.api.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeQuickAccessEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m90084d2 = {"Lcom/kubi/home/api/entity/QuickAccessEntity;", "", "id", "", "name", "iconUrl", "jumpUrl", "createdAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getName", "getIconUrl", "getJumpUrl", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/home/api/entity/QuickAccessEntity;", "equals", "", "other", "hashCode", "", "toString", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class QuickAccessEntity {

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String id;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final String name;

    public QuickAccessEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickAccessEntity)) {
            return false;
        }
        QuickAccessEntity quickAccessEntity = (QuickAccessEntity) other;
        return Intrinsics.areEqual(this.id, quickAccessEntity.id) && Intrinsics.areEqual(this.name, quickAccessEntity.name) && Intrinsics.areEqual(this.iconUrl, quickAccessEntity.iconUrl) && Intrinsics.areEqual(this.jumpUrl, quickAccessEntity.jumpUrl) && Intrinsics.areEqual(this.createdAt, quickAccessEntity.createdAt);
    }

    public QuickAccessEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l11) {
        this.id = str;
        this.name = str2;
        this.iconUrl = str3;
        this.jumpUrl = str4;
        this.createdAt = l11;
    }

    public static /* synthetic */ QuickAccessEntity copy$default(QuickAccessEntity quickAccessEntity, String str, String str2, String str3, String str4, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = quickAccessEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = quickAccessEntity.name;
        }
        if ((i11 & 4) != 0) {
            str3 = quickAccessEntity.iconUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = quickAccessEntity.jumpUrl;
        }
        if ((i11 & 16) != 0) {
            l11 = quickAccessEntity.createdAt;
        }
        Long l12 = l11;
        String str5 = str3;
        return quickAccessEntity.copy(str, str2, str5, str4, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final QuickAccessEntity copy(@Nullable String id2, @Nullable String name, @Nullable String iconUrl, @Nullable String jumpUrl, @Nullable Long createdAt) {
        return new QuickAccessEntity(id2, name, iconUrl, jumpUrl, createdAt);
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.createdAt;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QuickAccessEntity(id=" + this.id + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", jumpUrl=" + this.jumpUrl + ", createdAt=" + this.createdAt + ')';
    }

    public /* synthetic */ QuickAccessEntity(String str, String str2, String str3, String str4, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : l11);
    }
}
