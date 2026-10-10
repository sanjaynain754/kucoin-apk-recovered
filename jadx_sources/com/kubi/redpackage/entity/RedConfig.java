package com.kubi.redpackage.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedPackageEntity.kt */
/* JADX INFO: loaded from: classes38.dex */
@Keep
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m90084d2 = {"Lcom/kubi/redpackage/entity/RedConfig;", "Landroid/os/Parcelable;", "commonConfigs", "Lcom/kubi/redpackage/entity/CommonConfigs;", "currenciesConfigs", "Ljava/util/ArrayList;", "Lcom/kubi/redpackage/entity/CurrenciesConfig;", "Lkotlin/collections/ArrayList;", "welfareExtend", "Lcom/kubi/redpackage/entity/WelfareExtend;", "<init>", "(Lcom/kubi/redpackage/entity/CommonConfigs;Ljava/util/ArrayList;Lcom/kubi/redpackage/entity/WelfareExtend;)V", "getCommonConfigs", "()Lcom/kubi/redpackage/entity/CommonConfigs;", "getCurrenciesConfigs", "()Ljava/util/ArrayList;", "setCurrenciesConfigs", "(Ljava/util/ArrayList;)V", "getWelfareExtend", "()Lcom/kubi/redpackage/entity/WelfareExtend;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RedConfig> CREATOR = new Creator();

    @Nullable
    private final CommonConfigs commonConfigs;

    @Nullable
    private ArrayList<CurrenciesConfig> currenciesConfigs;

    @Nullable
    private final WelfareExtend welfareExtend;

    /* JADX INFO: compiled from: RedPackageEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<RedConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CommonConfigs commonConfigsCreateFromParcel = parcel.readInt() == 0 ? null : CommonConfigs.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(CurrenciesConfig.CREATOR.createFromParcel(parcel));
                }
            }
            return new RedConfig(commonConfigsCreateFromParcel, arrayList, parcel.readInt() != 0 ? WelfareExtend.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedConfig[] newArray(int i11) {
            return new RedConfig[i11];
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
        if (!(other instanceof RedConfig)) {
            return false;
        }
        RedConfig redConfig = (RedConfig) other;
        return Intrinsics.areEqual(this.commonConfigs, redConfig.commonConfigs) && Intrinsics.areEqual(this.currenciesConfigs, redConfig.currenciesConfigs) && Intrinsics.areEqual(this.welfareExtend, redConfig.welfareExtend);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RedConfig copy$default(RedConfig redConfig, CommonConfigs commonConfigs, ArrayList arrayList, WelfareExtend welfareExtend, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonConfigs = redConfig.commonConfigs;
        }
        if ((i11 & 2) != 0) {
            arrayList = redConfig.currenciesConfigs;
        }
        if ((i11 & 4) != 0) {
            welfareExtend = redConfig.welfareExtend;
        }
        return redConfig.copy(commonConfigs, arrayList, welfareExtend);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CommonConfigs getCommonConfigs() {
        return this.commonConfigs;
    }

    @Nullable
    public final ArrayList<CurrenciesConfig> component2() {
        return this.currenciesConfigs;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WelfareExtend getWelfareExtend() {
        return this.welfareExtend;
    }

    @NotNull
    public final RedConfig copy(@Nullable CommonConfigs commonConfigs, @Nullable ArrayList<CurrenciesConfig> currenciesConfigs, @Nullable WelfareExtend welfareExtend) {
        return new RedConfig(commonConfigs, currenciesConfigs, welfareExtend);
    }

    @Nullable
    public final CommonConfigs getCommonConfigs() {
        return this.commonConfigs;
    }

    @Nullable
    public final ArrayList<CurrenciesConfig> getCurrenciesConfigs() {
        return this.currenciesConfigs;
    }

    @Nullable
    public final WelfareExtend getWelfareExtend() {
        return this.welfareExtend;
    }

    public int hashCode() {
        CommonConfigs commonConfigs = this.commonConfigs;
        int iHashCode = (commonConfigs == null ? 0 : commonConfigs.hashCode()) * 31;
        ArrayList<CurrenciesConfig> arrayList = this.currenciesConfigs;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        WelfareExtend welfareExtend = this.welfareExtend;
        return iHashCode2 + (welfareExtend != null ? welfareExtend.hashCode() : 0);
    }

    public final void setCurrenciesConfigs(@Nullable ArrayList<CurrenciesConfig> arrayList) {
        this.currenciesConfigs = arrayList;
    }

    @NotNull
    public String toString() {
        return "RedConfig(commonConfigs=" + this.commonConfigs + ", currenciesConfigs=" + this.currenciesConfigs + ", welfareExtend=" + this.welfareExtend + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CommonConfigs commonConfigs = this.commonConfigs;
        if (commonConfigs == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonConfigs.writeToParcel(dest, flags);
        }
        ArrayList<CurrenciesConfig> arrayList = this.currenciesConfigs;
        if (arrayList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList.size());
            Iterator<CurrenciesConfig> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        WelfareExtend welfareExtend = this.welfareExtend;
        if (welfareExtend == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            welfareExtend.writeToParcel(dest, flags);
        }
    }

    public RedConfig(@Nullable CommonConfigs commonConfigs, @Nullable ArrayList<CurrenciesConfig> arrayList, @Nullable WelfareExtend welfareExtend) {
        this.commonConfigs = commonConfigs;
        this.currenciesConfigs = arrayList;
        this.welfareExtend = welfareExtend;
    }
}
