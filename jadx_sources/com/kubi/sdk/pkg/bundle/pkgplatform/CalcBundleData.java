package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PkgPlatformApi.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleData;", "", "update", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;", "delete", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;", "(Ljava/util/List;Ljava/util/List;)V", "getDelete", "()Ljava/util/List;", "getUpdate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class CalcBundleData {

    @Nullable
    private final List<CalcBundleDeleteItem> delete;

    @Nullable
    private final List<PkgBundleUpdateItem> update;

    /* JADX WARN: Multi-variable type inference failed */
    public CalcBundleData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcBundleData)) {
            return false;
        }
        CalcBundleData calcBundleData = (CalcBundleData) other;
        return Intrinsics.areEqual(this.update, calcBundleData.update) && Intrinsics.areEqual(this.delete, calcBundleData.delete);
    }

    public CalcBundleData(@Nullable List<PkgBundleUpdateItem> list, @Nullable List<CalcBundleDeleteItem> list2) {
        this.update = list;
        this.delete = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalcBundleData copy$default(CalcBundleData calcBundleData, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = calcBundleData.update;
        }
        if ((i11 & 2) != 0) {
            list2 = calcBundleData.delete;
        }
        return calcBundleData.copy(list, list2);
    }

    @Nullable
    public final List<PkgBundleUpdateItem> component1() {
        return this.update;
    }

    @Nullable
    public final List<CalcBundleDeleteItem> component2() {
        return this.delete;
    }

    @NotNull
    public final CalcBundleData copy(@Nullable List<PkgBundleUpdateItem> update, @Nullable List<CalcBundleDeleteItem> delete) {
        return new CalcBundleData(update, delete);
    }

    @Nullable
    public final List<CalcBundleDeleteItem> getDelete() {
        return this.delete;
    }

    @Nullable
    public final List<PkgBundleUpdateItem> getUpdate() {
        return this.update;
    }

    public int hashCode() {
        List<PkgBundleUpdateItem> list = this.update;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CalcBundleDeleteItem> list2 = this.delete;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CalcBundleData(update=" + this.update + ", delete=" + this.delete + ')';
    }

    public /* synthetic */ CalcBundleData(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2);
    }
}
