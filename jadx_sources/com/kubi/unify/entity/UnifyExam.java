package com.kubi.unify.entity;

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

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012¨\u0006%"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyExam;", "Landroid/os/Parcelable;", "title", "", "right", "options", "", "Lcom/kubi/unify/entity/UnifyExamItem;", "choose", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getRight", "getOptions", "()Ljava/util/List;", "getChoose", "setChoose", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyExam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifyExam> CREATOR = new C26520a();

    @Nullable
    private String choose;

    @Nullable
    private final List<UnifyExamItem> options;

    @Nullable
    private final String right;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.unify.entity.UnifyExam$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26520a implements Parcelable.Creator<UnifyExam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifyExam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(UnifyExamItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new UnifyExam(string, string2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifyExam[] newArray(int i11) {
            return new UnifyExam[i11];
        }
    }

    public UnifyExam(@Nullable String str, @Nullable String str2, @Nullable List<UnifyExamItem> list, @Nullable String str3) {
        this.title = str;
        this.right = str2;
        this.options = list;
        this.choose = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyExam)) {
            return false;
        }
        UnifyExam unifyExam = (UnifyExam) other;
        return Intrinsics.areEqual(this.title, unifyExam.title) && Intrinsics.areEqual(this.right, unifyExam.right) && Intrinsics.areEqual(this.options, unifyExam.options) && Intrinsics.areEqual(this.choose, unifyExam.choose);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifyExam copy$default(UnifyExam unifyExam, String str, String str2, List list, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyExam.title;
        }
        if ((i11 & 2) != 0) {
            str2 = unifyExam.right;
        }
        if ((i11 & 4) != 0) {
            list = unifyExam.options;
        }
        if ((i11 & 8) != 0) {
            str3 = unifyExam.choose;
        }
        return unifyExam.copy(str, str2, list, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRight() {
        return this.right;
    }

    @Nullable
    public final List<UnifyExamItem> component3() {
        return this.options;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChoose() {
        return this.choose;
    }

    @NotNull
    public final UnifyExam copy(@Nullable String title, @Nullable String right, @Nullable List<UnifyExamItem> options, @Nullable String choose) {
        return new UnifyExam(title, right, options, choose);
    }

    @Nullable
    public final String getChoose() {
        return this.choose;
    }

    @Nullable
    public final List<UnifyExamItem> getOptions() {
        return this.options;
    }

    @Nullable
    public final String getRight() {
        return this.right;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.right;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UnifyExamItem> list = this.options;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.choose;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setChoose(@Nullable String str) {
        this.choose = str;
    }

    @NotNull
    public String toString() {
        return "UnifyExam(title=" + this.title + ", right=" + this.right + ", options=" + this.options + ", choose=" + this.choose + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.right);
        List<UnifyExamItem> list = this.options;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<UnifyExamItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.choose);
    }

    public /* synthetic */ UnifyExam(String str, String str2, List list, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i11 & 8) != 0 ? null : str3);
    }
}
