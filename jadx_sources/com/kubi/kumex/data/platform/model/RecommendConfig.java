package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecommendConfig.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006$"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/RecommendConfig;", "Landroid/os/Parcelable;", "usdtBased", "", "", "currencyBased", "usdtBasedFixed", "currencyBasedFixed", "favor", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getUsdtBased", "()Ljava/util/List;", "getCurrencyBased", "getUsdtBasedFixed", "getCurrencyBasedFixed", "getFavor", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RecommendConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecommendConfig> CREATOR = new C15821a();

    @Nullable
    private final List<String> currencyBased;

    @Nullable
    private final List<String> currencyBasedFixed;

    @Nullable
    private final List<String> favor;

    @Nullable
    private final List<String> usdtBased;

    @Nullable
    private final List<String> usdtBasedFixed;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.RecommendConfig$a */
    /* JADX INFO: compiled from: RecommendConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15821a implements Parcelable.Creator<RecommendConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecommendConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecommendConfig(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RecommendConfig[] newArray(int i11) {
            return new RecommendConfig[i11];
        }
    }

    public RecommendConfig() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendConfig)) {
            return false;
        }
        RecommendConfig recommendConfig = (RecommendConfig) other;
        return Intrinsics.areEqual(this.usdtBased, recommendConfig.usdtBased) && Intrinsics.areEqual(this.currencyBased, recommendConfig.currencyBased) && Intrinsics.areEqual(this.usdtBasedFixed, recommendConfig.usdtBasedFixed) && Intrinsics.areEqual(this.currencyBasedFixed, recommendConfig.currencyBasedFixed) && Intrinsics.areEqual(this.favor, recommendConfig.favor);
    }

    public RecommendConfig(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable List<String> list5) {
        this.usdtBased = list;
        this.currencyBased = list2;
        this.usdtBasedFixed = list3;
        this.currencyBasedFixed = list4;
        this.favor = list5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendConfig copy$default(RecommendConfig recommendConfig, List list, List list2, List list3, List list4, List list5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = recommendConfig.usdtBased;
        }
        if ((i11 & 2) != 0) {
            list2 = recommendConfig.currencyBased;
        }
        if ((i11 & 4) != 0) {
            list3 = recommendConfig.usdtBasedFixed;
        }
        if ((i11 & 8) != 0) {
            list4 = recommendConfig.currencyBasedFixed;
        }
        if ((i11 & 16) != 0) {
            list5 = recommendConfig.favor;
        }
        List list6 = list5;
        List list7 = list3;
        return recommendConfig.copy(list, list2, list7, list4, list6);
    }

    @Nullable
    public final List<String> component1() {
        return this.usdtBased;
    }

    @Nullable
    public final List<String> component2() {
        return this.currencyBased;
    }

    @Nullable
    public final List<String> component3() {
        return this.usdtBasedFixed;
    }

    @Nullable
    public final List<String> component4() {
        return this.currencyBasedFixed;
    }

    @Nullable
    public final List<String> component5() {
        return this.favor;
    }

    @NotNull
    public final RecommendConfig copy(@Nullable List<String> usdtBased, @Nullable List<String> currencyBased, @Nullable List<String> usdtBasedFixed, @Nullable List<String> currencyBasedFixed, @Nullable List<String> favor) {
        return new RecommendConfig(usdtBased, currencyBased, usdtBasedFixed, currencyBasedFixed, favor);
    }

    @Nullable
    public final List<String> getCurrencyBased() {
        return this.currencyBased;
    }

    @Nullable
    public final List<String> getCurrencyBasedFixed() {
        return this.currencyBasedFixed;
    }

    @Nullable
    public final List<String> getFavor() {
        return this.favor;
    }

    @Nullable
    public final List<String> getUsdtBased() {
        return this.usdtBased;
    }

    @Nullable
    public final List<String> getUsdtBasedFixed() {
        return this.usdtBasedFixed;
    }

    public int hashCode() {
        List<String> list = this.usdtBased;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.currencyBased;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.usdtBasedFixed;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.currencyBasedFixed;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.favor;
        return iHashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecommendConfig(usdtBased=" + this.usdtBased + ", currencyBased=" + this.currencyBased + ", usdtBasedFixed=" + this.usdtBasedFixed + ", currencyBasedFixed=" + this.currencyBasedFixed + ", favor=" + this.favor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.usdtBased);
        dest.writeStringList(this.currencyBased);
        dest.writeStringList(this.usdtBasedFixed);
        dest.writeStringList(this.currencyBasedFixed);
        dest.writeStringList(this.favor);
    }

    public /* synthetic */ RecommendConfig(List list, List list2, List list3, List list4, List list5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? null : list3, (i11 & 8) != 0 ? null : list4, (i11 & 16) != 0 ? null : list5);
    }
}
