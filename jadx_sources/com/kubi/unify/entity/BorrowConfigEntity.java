package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/unify/entity/BorrowConfigEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "loanConfigs", "", "Lcom/kubi/unify/entity/BorrowConfigItemEntity;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "getLoanConfigs", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BorrowConfigEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BorrowConfigEntity> CREATOR = new C26506a();

    @Nullable
    private final String currency;

    @NotNull
    private final List<BorrowConfigItemEntity> loanConfigs;

    /* JADX INFO: renamed from: com.kubi.unify.entity.BorrowConfigEntity$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26506a implements Parcelable.Creator<BorrowConfigEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BorrowConfigEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(BorrowConfigItemEntity.CREATOR.createFromParcel(parcel));
            }
            return new BorrowConfigEntity(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BorrowConfigEntity[] newArray(int i11) {
            return new BorrowConfigEntity[i11];
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
        if (!(other instanceof BorrowConfigEntity)) {
            return false;
        }
        BorrowConfigEntity borrowConfigEntity = (BorrowConfigEntity) other;
        return Intrinsics.areEqual(this.currency, borrowConfigEntity.currency) && Intrinsics.areEqual(this.loanConfigs, borrowConfigEntity.loanConfigs);
    }

    public BorrowConfigEntity(@Nullable String str, @NotNull List<BorrowConfigItemEntity> loanConfigs) {
        Intrinsics.checkNotNullParameter(loanConfigs, "loanConfigs");
        this.currency = str;
        this.loanConfigs = loanConfigs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BorrowConfigEntity copy$default(BorrowConfigEntity borrowConfigEntity, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = borrowConfigEntity.currency;
        }
        if ((i11 & 2) != 0) {
            list = borrowConfigEntity.loanConfigs;
        }
        return borrowConfigEntity.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final List<BorrowConfigItemEntity> component2() {
        return this.loanConfigs;
    }

    @NotNull
    public final BorrowConfigEntity copy(@Nullable String currency, @NotNull List<BorrowConfigItemEntity> loanConfigs) {
        Intrinsics.checkNotNullParameter(loanConfigs, "loanConfigs");
        return new BorrowConfigEntity(currency, loanConfigs);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final List<BorrowConfigItemEntity> getLoanConfigs() {
        return this.loanConfigs;
    }

    public int hashCode() {
        String str = this.currency;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.loanConfigs.hashCode();
    }

    @NotNull
    public String toString() {
        return "BorrowConfigEntity(currency=" + this.currency + ", loanConfigs=" + this.loanConfigs + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        List<BorrowConfigItemEntity> list = this.loanConfigs;
        dest.writeInt(list.size());
        Iterator<BorrowConfigItemEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
