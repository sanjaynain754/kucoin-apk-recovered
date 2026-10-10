package com.kubi.home.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNavigationEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/entity/MoreIconEntity;", "", "dayIcon", "", "darkIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDayIcon", "()Ljava/lang/String;", "getDarkIcon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MoreIconEntity {

    @Nullable
    private final String darkIcon;

    @Nullable
    private final String dayIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public MoreIconEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoreIconEntity)) {
            return false;
        }
        MoreIconEntity moreIconEntity = (MoreIconEntity) other;
        return Intrinsics.areEqual(this.dayIcon, moreIconEntity.dayIcon) && Intrinsics.areEqual(this.darkIcon, moreIconEntity.darkIcon);
    }

    public MoreIconEntity(@Nullable String str, @Nullable String str2) {
        this.dayIcon = str;
        this.darkIcon = str2;
    }

    public static /* synthetic */ MoreIconEntity copy$default(MoreIconEntity moreIconEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = moreIconEntity.dayIcon;
        }
        if ((i11 & 2) != 0) {
            str2 = moreIconEntity.darkIcon;
        }
        return moreIconEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDayIcon() {
        return this.dayIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @NotNull
    public final MoreIconEntity copy(@Nullable String dayIcon, @Nullable String darkIcon) {
        return new MoreIconEntity(dayIcon, darkIcon);
    }

    @Nullable
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @Nullable
    public final String getDayIcon() {
        return this.dayIcon;
    }

    public int hashCode() {
        String str = this.dayIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkIcon;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MoreIconEntity(dayIcon=" + this.dayIcon + ", darkIcon=" + this.darkIcon + ')';
    }

    public /* synthetic */ MoreIconEntity(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
