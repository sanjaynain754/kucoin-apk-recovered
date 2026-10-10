package com.kubi.home.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetBannerEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/home/entity/WidgetBannerTextEntity;", "", "small_text1", "", "small_text2", "large_text1", "large_text2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSmall_text1", "()Ljava/lang/String;", "getSmall_text2", "getLarge_text1", "getLarge_text2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WidgetBannerTextEntity {

    @Nullable
    private final String large_text1;

    @Nullable
    private final String large_text2;

    @Nullable
    private final String small_text1;

    @Nullable
    private final String small_text2;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetBannerTextEntity)) {
            return false;
        }
        WidgetBannerTextEntity widgetBannerTextEntity = (WidgetBannerTextEntity) other;
        return Intrinsics.areEqual(this.small_text1, widgetBannerTextEntity.small_text1) && Intrinsics.areEqual(this.small_text2, widgetBannerTextEntity.small_text2) && Intrinsics.areEqual(this.large_text1, widgetBannerTextEntity.large_text1) && Intrinsics.areEqual(this.large_text2, widgetBannerTextEntity.large_text2);
    }

    public static /* synthetic */ WidgetBannerTextEntity copy$default(WidgetBannerTextEntity widgetBannerTextEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = widgetBannerTextEntity.small_text1;
        }
        if ((i11 & 2) != 0) {
            str2 = widgetBannerTextEntity.small_text2;
        }
        if ((i11 & 4) != 0) {
            str3 = widgetBannerTextEntity.large_text1;
        }
        if ((i11 & 8) != 0) {
            str4 = widgetBannerTextEntity.large_text2;
        }
        return widgetBannerTextEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSmall_text1() {
        return this.small_text1;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSmall_text2() {
        return this.small_text2;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLarge_text1() {
        return this.large_text1;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLarge_text2() {
        return this.large_text2;
    }

    @NotNull
    public final WidgetBannerTextEntity copy(@Nullable String small_text1, @Nullable String small_text2, @Nullable String large_text1, @Nullable String large_text2) {
        return new WidgetBannerTextEntity(small_text1, small_text2, large_text1, large_text2);
    }

    @Nullable
    public final String getLarge_text1() {
        return this.large_text1;
    }

    @Nullable
    public final String getLarge_text2() {
        return this.large_text2;
    }

    @Nullable
    public final String getSmall_text1() {
        return this.small_text1;
    }

    @Nullable
    public final String getSmall_text2() {
        return this.small_text2;
    }

    public int hashCode() {
        String str = this.small_text1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.small_text2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.large_text1;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.large_text2;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WidgetBannerTextEntity(small_text1=" + this.small_text1 + ", small_text2=" + this.small_text2 + ", large_text1=" + this.large_text1 + ", large_text2=" + this.large_text2 + ')';
    }

    public WidgetBannerTextEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.small_text1 = str;
        this.small_text2 = str2;
        this.large_text1 = str3;
        this.large_text2 = str4;
    }
}
