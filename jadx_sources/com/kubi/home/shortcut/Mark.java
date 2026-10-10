package com.kubi.home.shortcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C33590cg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShortCutEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u0082\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0007J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u00067"}, m90084d2 = {"Lcom/kubi/home/shortcut/Mark;", "Landroid/os/Parcelable;", "id", "", "menuId", "name", "type", "", "styleType", "color", "icons", "darkIcons", C33590cg.f69441k, "", "longShow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getId", "()Ljava/lang/String;", "getMenuId", "getName", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStyleType", "getColor", "getIcons", "getDarkIcons", "getExpired", "()Z", "getLongShow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/kubi/home/shortcut/Mark;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Mark implements Parcelable {
    public static final int COLOR_RED = 1;
    public static final int COLOR_THEME = 2;
    public static final int STYLE_IMG = 2;
    public static final int STYLE_TEXT = 1;

    @Nullable
    private final Integer color;

    @Nullable
    private final String darkIcons;
    private final boolean expired;

    @Nullable
    private final String icons;

    @Nullable
    private final String id;
    private final boolean longShow;

    @Nullable
    private final String menuId;

    @Nullable
    private final String name;

    @Nullable
    private final Integer styleType;

    @Nullable
    private final Integer type;

    @NotNull
    public static final Parcelable.Creator<Mark> CREATOR = new C14856a();

    /* JADX INFO: renamed from: com.kubi.home.shortcut.Mark$a */
    /* JADX INFO: compiled from: ShortCutEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14856a implements Parcelable.Creator<Mark> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mark createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new Mark(string, string2, string3, numValueOf, numValueOf2, numValueOf3, string4, string5, z11, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Mark[] newArray(int i11) {
            return new Mark[i11];
        }
    }

    public Mark(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str4, @Nullable String str5, boolean z11, boolean z12) {
        this.id = str;
        this.menuId = str2;
        this.name = str3;
        this.type = num;
        this.styleType = num2;
        this.color = num3;
        this.icons = str4;
        this.darkIcons = str5;
        this.expired = z11;
        this.longShow = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mark)) {
            return false;
        }
        Mark mark = (Mark) other;
        return Intrinsics.areEqual(this.id, mark.id) && Intrinsics.areEqual(this.menuId, mark.menuId) && Intrinsics.areEqual(this.name, mark.name) && Intrinsics.areEqual(this.type, mark.type) && Intrinsics.areEqual(this.styleType, mark.styleType) && Intrinsics.areEqual(this.color, mark.color) && Intrinsics.areEqual(this.icons, mark.icons) && Intrinsics.areEqual(this.darkIcons, mark.darkIcons) && this.expired == mark.expired && this.longShow == mark.longShow;
    }

    public static /* synthetic */ Mark copy$default(Mark mark, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mark.id;
        }
        if ((i11 & 2) != 0) {
            str2 = mark.menuId;
        }
        if ((i11 & 4) != 0) {
            str3 = mark.name;
        }
        if ((i11 & 8) != 0) {
            num = mark.type;
        }
        if ((i11 & 16) != 0) {
            num2 = mark.styleType;
        }
        if ((i11 & 32) != 0) {
            num3 = mark.color;
        }
        if ((i11 & 64) != 0) {
            str4 = mark.icons;
        }
        if ((i11 & 128) != 0) {
            str5 = mark.darkIcons;
        }
        if ((i11 & 256) != 0) {
            z11 = mark.expired;
        }
        if ((i11 & 512) != 0) {
            z12 = mark.longShow;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        String str6 = str4;
        String str7 = str5;
        Integer num4 = num2;
        Integer num5 = num3;
        return mark.copy(str, str2, str3, num, num4, num5, str6, str7, z13, z14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getLongShow() {
        return this.longShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMenuId() {
        return this.menuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStyleType() {
        return this.styleType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcons() {
        return this.icons;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDarkIcons() {
        return this.darkIcons;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getExpired() {
        return this.expired;
    }

    @NotNull
    public final Mark copy(@Nullable String id2, @Nullable String menuId, @Nullable String name, @Nullable Integer type, @Nullable Integer styleType, @Nullable Integer color, @Nullable String icons, @Nullable String darkIcons, boolean expired, boolean longShow) {
        return new Mark(id2, menuId, name, type, styleType, color, icons, darkIcons, expired, longShow);
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final String getDarkIcons() {
        return this.darkIcons;
    }

    public final boolean getExpired() {
        return this.expired;
    }

    @Nullable
    public final String getIcons() {
        return this.icons;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final boolean getLongShow() {
        return this.longShow;
    }

    @Nullable
    public final String getMenuId() {
        return this.menuId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getStyleType() {
        return this.styleType;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.menuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.styleType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.color;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.icons;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.darkIcons;
        return ((((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.expired)) * 31) + Boolean.hashCode(this.longShow);
    }

    @NotNull
    public String toString() {
        return "Mark(id=" + this.id + ", menuId=" + this.menuId + ", name=" + this.name + ", type=" + this.type + ", styleType=" + this.styleType + ", color=" + this.color + ", icons=" + this.icons + ", darkIcons=" + this.darkIcons + ", expired=" + this.expired + ", longShow=" + this.longShow + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.menuId);
        dest.writeString(this.name);
        Integer num = this.type;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.styleType;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.color;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.icons);
        dest.writeString(this.darkIcons);
        dest.writeInt(this.expired ? 1 : 0);
        dest.writeInt(this.longShow ? 1 : 0);
    }

    public /* synthetic */ Mark(String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? -1 : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : num3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? false : z12);
    }
}
