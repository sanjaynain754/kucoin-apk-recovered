package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaMenuEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010-\u001a\u00020\rHÆ\u0003Jl\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020\u000bJ\u0013\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u000bHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006;"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaMenuModel;", "Landroid/os/Parcelable;", "categoryHighlightsAll", "", "categoryHighlightsNew", "categoryChainarea", "networksAll", "", "Lcom/kubi/quotefacade/entity/AlphaNetworks;", "networksNew", "newCount", "", "showOndoTab", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Z)V", "getCategoryHighlightsAll", "()Ljava/lang/String;", "setCategoryHighlightsAll", "(Ljava/lang/String;)V", "getCategoryHighlightsNew", "setCategoryHighlightsNew", "getCategoryChainarea", "setCategoryChainarea", "getNetworksAll", "()Ljava/util/List;", "setNetworksAll", "(Ljava/util/List;)V", "getNetworksNew", "setNetworksNew", "getNewCount", "()Ljava/lang/Integer;", "setNewCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getShowOndoTab", "()Z", "setShowOndoTab", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Z)Lcom/kubi/quotefacade/entity/AlphaMenuModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaMenuModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaMenuModel> CREATOR = new C21868a();

    @Nullable
    private String categoryChainarea;

    @Nullable
    private String categoryHighlightsAll;

    @Nullable
    private String categoryHighlightsNew;

    @Nullable
    private List<AlphaNetworks> networksAll;

    @Nullable
    private List<AlphaNetworks> networksNew;

    @Nullable
    private Integer newCount;
    private boolean showOndoTab;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaMenuModel$a */
    /* JADX INFO: compiled from: AlphaMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21868a implements Parcelable.Creator<AlphaMenuModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaMenuModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(AlphaNetworks.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(AlphaNetworks.CREATOR.createFromParcel(parcel));
                }
            }
            return new AlphaMenuModel(string, string2, string3, arrayList, arrayList2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaMenuModel[] newArray(int i11) {
            return new AlphaMenuModel[i11];
        }
    }

    public AlphaMenuModel() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaMenuModel)) {
            return false;
        }
        AlphaMenuModel alphaMenuModel = (AlphaMenuModel) other;
        return Intrinsics.areEqual(this.categoryHighlightsAll, alphaMenuModel.categoryHighlightsAll) && Intrinsics.areEqual(this.categoryHighlightsNew, alphaMenuModel.categoryHighlightsNew) && Intrinsics.areEqual(this.categoryChainarea, alphaMenuModel.categoryChainarea) && Intrinsics.areEqual(this.networksAll, alphaMenuModel.networksAll) && Intrinsics.areEqual(this.networksNew, alphaMenuModel.networksNew) && Intrinsics.areEqual(this.newCount, alphaMenuModel.newCount) && this.showOndoTab == alphaMenuModel.showOndoTab;
    }

    public AlphaMenuModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<AlphaNetworks> list, @Nullable List<AlphaNetworks> list2, @Nullable Integer num, boolean z11) {
        this.categoryHighlightsAll = str;
        this.categoryHighlightsNew = str2;
        this.categoryChainarea = str3;
        this.networksAll = list;
        this.networksNew = list2;
        this.newCount = num;
        this.showOndoTab = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaMenuModel copy$default(AlphaMenuModel alphaMenuModel, String str, String str2, String str3, List list, List list2, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alphaMenuModel.categoryHighlightsAll;
        }
        if ((i11 & 2) != 0) {
            str2 = alphaMenuModel.categoryHighlightsNew;
        }
        if ((i11 & 4) != 0) {
            str3 = alphaMenuModel.categoryChainarea;
        }
        if ((i11 & 8) != 0) {
            list = alphaMenuModel.networksAll;
        }
        if ((i11 & 16) != 0) {
            list2 = alphaMenuModel.networksNew;
        }
        if ((i11 & 32) != 0) {
            num = alphaMenuModel.newCount;
        }
        if ((i11 & 64) != 0) {
            z11 = alphaMenuModel.showOndoTab;
        }
        Integer num2 = num;
        boolean z12 = z11;
        List list3 = list2;
        String str4 = str3;
        return alphaMenuModel.copy(str, str2, str4, list, list3, num2, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategoryHighlightsAll() {
        return this.categoryHighlightsAll;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategoryHighlightsNew() {
        return this.categoryHighlightsNew;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategoryChainarea() {
        return this.categoryChainarea;
    }

    @Nullable
    public final List<AlphaNetworks> component4() {
        return this.networksAll;
    }

    @Nullable
    public final List<AlphaNetworks> component5() {
        return this.networksNew;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getNewCount() {
        return this.newCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowOndoTab() {
        return this.showOndoTab;
    }

    @NotNull
    public final AlphaMenuModel copy(@Nullable String categoryHighlightsAll, @Nullable String categoryHighlightsNew, @Nullable String categoryChainarea, @Nullable List<AlphaNetworks> networksAll, @Nullable List<AlphaNetworks> networksNew, @Nullable Integer newCount, boolean showOndoTab) {
        return new AlphaMenuModel(categoryHighlightsAll, categoryHighlightsNew, categoryChainarea, networksAll, networksNew, newCount, showOndoTab);
    }

    @Nullable
    public final String getCategoryChainarea() {
        return this.categoryChainarea;
    }

    @Nullable
    public final String getCategoryHighlightsAll() {
        return this.categoryHighlightsAll;
    }

    @Nullable
    public final String getCategoryHighlightsNew() {
        return this.categoryHighlightsNew;
    }

    @Nullable
    public final List<AlphaNetworks> getNetworksAll() {
        return this.networksAll;
    }

    @Nullable
    public final List<AlphaNetworks> getNetworksNew() {
        return this.networksNew;
    }

    @Nullable
    public final Integer getNewCount() {
        return this.newCount;
    }

    public final boolean getShowOndoTab() {
        return this.showOndoTab;
    }

    public int hashCode() {
        String str = this.categoryHighlightsAll;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryHighlightsNew;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryChainarea;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AlphaNetworks> list = this.networksAll;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<AlphaNetworks> list2 = this.networksNew;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.newCount;
        return ((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.showOndoTab);
    }

    public final void setCategoryChainarea(@Nullable String str) {
        this.categoryChainarea = str;
    }

    public final void setCategoryHighlightsAll(@Nullable String str) {
        this.categoryHighlightsAll = str;
    }

    public final void setCategoryHighlightsNew(@Nullable String str) {
        this.categoryHighlightsNew = str;
    }

    public final void setNetworksAll(@Nullable List<AlphaNetworks> list) {
        this.networksAll = list;
    }

    public final void setNetworksNew(@Nullable List<AlphaNetworks> list) {
        this.networksNew = list;
    }

    public final void setNewCount(@Nullable Integer num) {
        this.newCount = num;
    }

    public final void setShowOndoTab(boolean z11) {
        this.showOndoTab = z11;
    }

    @NotNull
    public String toString() {
        return "AlphaMenuModel(categoryHighlightsAll=" + this.categoryHighlightsAll + ", categoryHighlightsNew=" + this.categoryHighlightsNew + ", categoryChainarea=" + this.categoryChainarea + ", networksAll=" + this.networksAll + ", networksNew=" + this.networksNew + ", newCount=" + this.newCount + ", showOndoTab=" + this.showOndoTab + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.categoryHighlightsAll);
        dest.writeString(this.categoryHighlightsNew);
        dest.writeString(this.categoryChainarea);
        List<AlphaNetworks> list = this.networksAll;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<AlphaNetworks> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<AlphaNetworks> list2 = this.networksNew;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<AlphaNetworks> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        Integer num = this.newCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeInt(this.showOndoTab ? 1 : 0);
    }

    public /* synthetic */ AlphaMenuModel(String str, String str2, String str3, List list, List list2, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : list2, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? false : z11);
    }
}
