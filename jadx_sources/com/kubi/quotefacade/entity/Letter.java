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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeMarketEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001c\u0012\u0013\u0010\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0005HÆ\u0003J \u0010\u000b\u001a\u00020\u00002\u0015\b\u0002\u0010\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0005HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u001e\u0010\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/Letter;", "Landroid/os/Parcelable;", "letters", "", "Lcom/kubi/quotefacade/entity/Lettes;", "Lkotlinx/android/parcel/RawValue;", "<init>", "(Ljava/util/List;)V", "getLetters", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Letter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Letter> CREATOR = new C21899a();

    @Nullable
    private final List<Lettes> letters;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.Letter$a */
    /* JADX INFO: compiled from: HomeMarketEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21899a implements Parcelable.Creator<Letter> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Letter createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(Lettes.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Letter(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Letter[] newArray(int i11) {
            return new Letter[i11];
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
        return (other instanceof Letter) && Intrinsics.areEqual(this.letters, ((Letter) other).letters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Letter copy$default(Letter letter, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = letter.letters;
        }
        return letter.copy(list);
    }

    @Nullable
    public final List<Lettes> component1() {
        return this.letters;
    }

    @NotNull
    public final Letter copy(@Nullable List<Lettes> letters) {
        return new Letter(letters);
    }

    @Nullable
    public final List<Lettes> getLetters() {
        return this.letters;
    }

    public int hashCode() {
        List<Lettes> list = this.letters;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "Letter(letters=" + this.letters + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<Lettes> list = this.letters;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Lettes> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public Letter(@Nullable List<Lettes> list) {
        this.letters = list;
    }
}
