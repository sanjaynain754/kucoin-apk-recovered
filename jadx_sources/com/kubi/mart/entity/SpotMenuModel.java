package com.kubi.mart.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotMenuModel.kt */
/* JADX INFO: loaded from: classes28.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m90084d2 = {"Lcom/kubi/mart/entity/SpotMenuModel;", "Landroid/os/Parcelable;", "tabType", "", "concept", "titleName", "count", "", "quoteCryptos", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getTabType", "()Ljava/lang/String;", "getConcept", "getTitleName", "getCount", "()I", "getQuoteCryptos", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotMenuModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpotMenuModel> CREATOR = new C18841a();

    @NotNull
    private final String concept;
    private final int count;

    @NotNull
    private final List<String> quoteCryptos;

    @NotNull
    private final String tabType;

    @NotNull
    private final String titleName;

    /* JADX INFO: renamed from: com.kubi.mart.entity.SpotMenuModel$a */
    /* JADX INFO: compiled from: SpotMenuModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18841a implements Parcelable.Creator<SpotMenuModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpotMenuModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpotMenuModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SpotMenuModel[] newArray(int i11) {
            return new SpotMenuModel[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotMenuModel)) {
            return false;
        }
        SpotMenuModel spotMenuModel = (SpotMenuModel) other;
        return Intrinsics.areEqual(this.tabType, spotMenuModel.tabType) && Intrinsics.areEqual(this.concept, spotMenuModel.concept) && Intrinsics.areEqual(this.titleName, spotMenuModel.titleName) && this.count == spotMenuModel.count && Intrinsics.areEqual(this.quoteCryptos, spotMenuModel.quoteCryptos);
    }

    public SpotMenuModel(@NotNull String tabType, @NotNull String concept, @NotNull String titleName, int i11, @NotNull List<String> quoteCryptos) {
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        Intrinsics.checkNotNullParameter(concept, "concept");
        Intrinsics.checkNotNullParameter(titleName, "titleName");
        Intrinsics.checkNotNullParameter(quoteCryptos, "quoteCryptos");
        this.tabType = tabType;
        this.concept = concept;
        this.titleName = titleName;
        this.count = i11;
        this.quoteCryptos = quoteCryptos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotMenuModel copy$default(SpotMenuModel spotMenuModel, String str, String str2, String str3, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = spotMenuModel.tabType;
        }
        if ((i12 & 2) != 0) {
            str2 = spotMenuModel.concept;
        }
        if ((i12 & 4) != 0) {
            str3 = spotMenuModel.titleName;
        }
        if ((i12 & 8) != 0) {
            i11 = spotMenuModel.count;
        }
        if ((i12 & 16) != 0) {
            list = spotMenuModel.quoteCryptos;
        }
        List list2 = list;
        String str4 = str3;
        return spotMenuModel.copy(str, str2, str4, i11, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTabType() {
        return this.tabType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConcept() {
        return this.concept;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleName() {
        return this.titleName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<String> component5() {
        return this.quoteCryptos;
    }

    @NotNull
    public final SpotMenuModel copy(@NotNull String tabType, @NotNull String concept, @NotNull String titleName, int count, @NotNull List<String> quoteCryptos) {
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        Intrinsics.checkNotNullParameter(concept, "concept");
        Intrinsics.checkNotNullParameter(titleName, "titleName");
        Intrinsics.checkNotNullParameter(quoteCryptos, "quoteCryptos");
        return new SpotMenuModel(tabType, concept, titleName, count, quoteCryptos);
    }

    @NotNull
    public final String getConcept() {
        return this.concept;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<String> getQuoteCryptos() {
        return this.quoteCryptos;
    }

    @NotNull
    public final String getTabType() {
        return this.tabType;
    }

    @NotNull
    public final String getTitleName() {
        return this.titleName;
    }

    public int hashCode() {
        return (((((((this.tabType.hashCode() * 31) + this.concept.hashCode()) * 31) + this.titleName.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.quoteCryptos.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpotMenuModel(tabType=" + this.tabType + ", concept=" + this.concept + ", titleName=" + this.titleName + ", count=" + this.count + ", quoteCryptos=" + this.quoteCryptos + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tabType);
        dest.writeString(this.concept);
        dest.writeString(this.titleName);
        dest.writeInt(this.count);
        dest.writeStringList(this.quoteCryptos);
    }
}
