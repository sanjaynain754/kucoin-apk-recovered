package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PkgPlatformApi.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;", "", Constants.BIZ, "", "deleteType", "(Ljava/lang/String;Ljava/lang/String;)V", "getBiz", "()Ljava/lang/String;", "getDeleteType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class CalcBundleDeleteItem {

    @NotNull
    private final String biz;

    @Nullable
    private final String deleteType;

    public CalcBundleDeleteItem(@NotNull String biz, @Nullable String str) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        this.biz = biz;
        this.deleteType = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcBundleDeleteItem)) {
            return false;
        }
        CalcBundleDeleteItem calcBundleDeleteItem = (CalcBundleDeleteItem) other;
        return Intrinsics.areEqual(this.biz, calcBundleDeleteItem.biz) && Intrinsics.areEqual(this.deleteType, calcBundleDeleteItem.deleteType);
    }

    public static /* synthetic */ CalcBundleDeleteItem copy$default(CalcBundleDeleteItem calcBundleDeleteItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = calcBundleDeleteItem.biz;
        }
        if ((i11 & 2) != 0) {
            str2 = calcBundleDeleteItem.deleteType;
        }
        return calcBundleDeleteItem.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeleteType() {
        return this.deleteType;
    }

    @NotNull
    public final CalcBundleDeleteItem copy(@NotNull String biz, @Nullable String deleteType) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        return new CalcBundleDeleteItem(biz, deleteType);
    }

    @NotNull
    public final String getBiz() {
        return this.biz;
    }

    @Nullable
    public final String getDeleteType() {
        return this.deleteType;
    }

    public int hashCode() {
        int iHashCode = this.biz.hashCode() * 31;
        String str = this.deleteType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CalcBundleDeleteItem(biz=" + this.biz + ", deleteType=" + this.deleteType + ')';
    }

    public /* synthetic */ CalcBundleDeleteItem(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
