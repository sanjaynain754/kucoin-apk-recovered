package com.kubi.home.shortcut;

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

/* JADX INFO: compiled from: ShortCutEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u00103\u001a\u00020\tH\u0016J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001d\u0010=\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u0013HÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J¦\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u00132\b\b\u0002\u0010\u0014\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010@J\u0006\u0010A\u001a\u00020\tJ\u0013\u0010B\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\tHÖ\u0001J\t\u0010F\u001a\u00020\u0004HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\tR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R.\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010#\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010,R\u001a\u00100\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010#\"\u0004\b2\u0010,¨\u0006L"}, m90084d2 = {"Lcom/kubi/home/shortcut/FunctionEntity;", "Landroid/os/Parcelable;", "Lcom/kubi/home/shortcut/IMenuItem;", "id", "", "name", "icons", "darkIcons", "iconRes", "", "uri", "showMark", "", "marks", "", "Lcom/kubi/home/shortcut/Mark;", "explain", "children", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isEmpty", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Z)V", "getId", "()Ljava/lang/String;", "getName", "getIcons", "setIcons", "(Ljava/lang/String;)V", "getDarkIcons", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUri", "getShowMark", "()Z", "getMarks", "()Ljava/util/List;", "getExplain", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "setEmpty", "(Z)V", "editing", "getEditing", "setEditing", "editable", "getEditable", "setEditable", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Z)Lcom/kubi/home/shortcut/FunctionEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FunctionEntity implements Parcelable, IMenuItem {

    @NotNull
    public static final Parcelable.Creator<FunctionEntity> CREATOR = new C14851a();

    @Nullable
    private ArrayList<FunctionEntity> children;

    @Nullable
    private final String darkIcons;
    private boolean editable;
    private boolean editing;

    @Nullable
    private final String explain;

    @Nullable
    private final Integer iconRes;

    @Nullable
    private String icons;

    @Nullable
    private final String id;
    private boolean isEmpty;

    @Nullable
    private final List<Mark> marks;

    @Nullable
    private final String name;
    private final boolean showMark;

    @Nullable
    private final String uri;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.FunctionEntity$a */
    /* JADX INFO: compiled from: ShortCutEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14851a implements Parcelable.Creator<FunctionEntity> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1, types: [int] */
        /* JADX WARN: Type inference failed for: r13v8 */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FunctionEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (?? r13 = z11; r13 != i11; r13++) {
                    arrayList.add(Mark.CREATOR.createFromParcel(parcel));
                }
            }
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList3.add(FunctionEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new FunctionEntity(string, string2, string3, string4, numValueOf, string5, z11, arrayList, string6, arrayList2, parcel.readInt() != 0 ? true : z11);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FunctionEntity[] newArray(int i11) {
            return new FunctionEntity[i11];
        }
    }

    public FunctionEntity() {
        this(null, null, null, null, null, null, false, null, null, null, false, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FunctionEntity copy$default(FunctionEntity functionEntity, String str, String str2, String str3, String str4, Integer num, String str5, boolean z11, List list, String str6, ArrayList arrayList, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = functionEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = functionEntity.name;
        }
        if ((i11 & 4) != 0) {
            str3 = functionEntity.icons;
        }
        if ((i11 & 8) != 0) {
            str4 = functionEntity.darkIcons;
        }
        if ((i11 & 16) != 0) {
            num = functionEntity.iconRes;
        }
        if ((i11 & 32) != 0) {
            str5 = functionEntity.uri;
        }
        if ((i11 & 64) != 0) {
            z11 = functionEntity.showMark;
        }
        if ((i11 & 128) != 0) {
            list = functionEntity.marks;
        }
        if ((i11 & 256) != 0) {
            str6 = functionEntity.explain;
        }
        if ((i11 & 512) != 0) {
            arrayList = functionEntity.children;
        }
        if ((i11 & 1024) != 0) {
            z12 = functionEntity.isEmpty;
        }
        ArrayList arrayList2 = arrayList;
        boolean z13 = z12;
        List list2 = list;
        String str7 = str6;
        String str8 = str5;
        boolean z14 = z11;
        Integer num2 = num;
        String str9 = str3;
        return functionEntity.copy(str, str2, str9, str4, num2, str8, z14, list2, str7, arrayList2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunctionEntity)) {
            return false;
        }
        FunctionEntity functionEntity = (FunctionEntity) other;
        return Intrinsics.areEqual(this.id, functionEntity.id) && Intrinsics.areEqual(this.name, functionEntity.name) && Intrinsics.areEqual(this.icons, functionEntity.icons) && Intrinsics.areEqual(this.darkIcons, functionEntity.darkIcons) && Intrinsics.areEqual(this.iconRes, functionEntity.iconRes) && Intrinsics.areEqual(this.uri, functionEntity.uri) && this.showMark == functionEntity.showMark && Intrinsics.areEqual(this.marks, functionEntity.marks) && Intrinsics.areEqual(this.explain, functionEntity.explain) && Intrinsics.areEqual(this.children, functionEntity.children) && this.isEmpty == functionEntity.isEmpty;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return 1;
    }

    public FunctionEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, boolean z11, @Nullable List<Mark> list, @Nullable String str6, @Nullable ArrayList<FunctionEntity> arrayList, boolean z12) {
        this.id = str;
        this.name = str2;
        this.icons = str3;
        this.darkIcons = str4;
        this.iconRes = num;
        this.uri = str5;
        this.showMark = z11;
        this.marks = list;
        this.explain = str6;
        this.children = arrayList;
        this.isEmpty = z12;
        this.editable = true;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final ArrayList<FunctionEntity> component10() {
        return this.children;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcons() {
        return this.icons;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDarkIcons() {
        return this.darkIcons;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowMark() {
        return this.showMark;
    }

    @Nullable
    public final List<Mark> component8() {
        return this.marks;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    @NotNull
    public final FunctionEntity copy(@Nullable String id2, @Nullable String name, @Nullable String icons, @Nullable String darkIcons, @Nullable Integer iconRes, @Nullable String uri, boolean showMark, @Nullable List<Mark> marks, @Nullable String explain, @Nullable ArrayList<FunctionEntity> children, boolean isEmpty) {
        return new FunctionEntity(id2, name, icons, darkIcons, iconRes, uri, showMark, marks, explain, children, isEmpty);
    }

    @Nullable
    public final ArrayList<FunctionEntity> getChildren() {
        return this.children;
    }

    @Nullable
    public final String getDarkIcons() {
        return this.darkIcons;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final boolean getEditing() {
        return this.editing;
    }

    @Nullable
    public final String getExplain() {
        return this.explain;
    }

    @Nullable
    public final Integer getIconRes() {
        return this.iconRes;
    }

    @Nullable
    public final String getIcons() {
        return this.icons;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<Mark> getMarks() {
        return this.marks;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getShowMark() {
        return this.showMark;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icons;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkIcons;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.iconRes;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.uri;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.showMark)) * 31;
        List<Mark> list = this.marks;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.explain;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ArrayList<FunctionEntity> arrayList = this.children;
        return ((iHashCode8 + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEmpty);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public final void setChildren(@Nullable ArrayList<FunctionEntity> arrayList) {
        this.children = arrayList;
    }

    public final void setEditable(boolean z11) {
        this.editable = z11;
    }

    public final void setEditing(boolean z11) {
        this.editing = z11;
    }

    public final void setEmpty(boolean z11) {
        this.isEmpty = z11;
    }

    public final void setIcons(@Nullable String str) {
        this.icons = str;
    }

    @NotNull
    public String toString() {
        return "FunctionEntity(id=" + this.id + ", name=" + this.name + ", icons=" + this.icons + ", darkIcons=" + this.darkIcons + ", iconRes=" + this.iconRes + ", uri=" + this.uri + ", showMark=" + this.showMark + ", marks=" + this.marks + ", explain=" + this.explain + ", children=" + this.children + ", isEmpty=" + this.isEmpty + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.icons);
        dest.writeString(this.darkIcons);
        Integer num = this.iconRes;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.uri);
        dest.writeInt(this.showMark ? 1 : 0);
        List<Mark> list = this.marks;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Mark> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.explain);
        ArrayList<FunctionEntity> arrayList = this.children;
        if (arrayList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList.size());
            Iterator<FunctionEntity> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.isEmpty ? 1 : 0);
    }

    public /* synthetic */ FunctionEntity(String str, String str2, String str3, String str4, Integer num, String str5, boolean z11, List list, String str6, ArrayList arrayList, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? "" : str5, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? null : list, (i11 & 256) == 0 ? str6 : "", (i11 & 512) == 0 ? arrayList : null, (i11 & 1024) != 0 ? false : z12);
    }
}
