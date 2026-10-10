package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bm.InterfaceC4633f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareAssetsEntity;", "Landroid/os/Parcelable;", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "isShowAssets", "", "<init>", "(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;Z)V", "getTrial", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareAssetsEntity implements Parcelable, InterfaceC4633f {

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareAssetsEntity> CREATOR = new C15800a();
    private final boolean isShowAssets;

    @NotNull
    private final FuturesWelfareTrialEntity trial;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareAssetsEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15800a implements Parcelable.Creator<FuturesWelfareAssetsEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareAssetsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesWelfareAssetsEntity(FuturesWelfareTrialEntity.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareAssetsEntity[] newArray(int i11) {
            return new FuturesWelfareAssetsEntity[i11];
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
        if (!(other instanceof FuturesWelfareAssetsEntity)) {
            return false;
        }
        FuturesWelfareAssetsEntity futuresWelfareAssetsEntity = (FuturesWelfareAssetsEntity) other;
        return Intrinsics.areEqual(this.trial, futuresWelfareAssetsEntity.trial) && this.isShowAssets == futuresWelfareAssetsEntity.isShowAssets;
    }

    public FuturesWelfareAssetsEntity(@NotNull FuturesWelfareTrialEntity trial, boolean z11) {
        Intrinsics.checkNotNullParameter(trial, "trial");
        this.trial = trial;
        this.isShowAssets = z11;
    }

    public static /* synthetic */ FuturesWelfareAssetsEntity copy$default(FuturesWelfareAssetsEntity futuresWelfareAssetsEntity, FuturesWelfareTrialEntity futuresWelfareTrialEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            futuresWelfareTrialEntity = futuresWelfareAssetsEntity.trial;
        }
        if ((i11 & 2) != 0) {
            z11 = futuresWelfareAssetsEntity.isShowAssets;
        }
        return futuresWelfareAssetsEntity.copy(futuresWelfareTrialEntity, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FuturesWelfareTrialEntity getTrial() {
        return this.trial;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsShowAssets() {
        return this.isShowAssets;
    }

    @NotNull
    public final FuturesWelfareAssetsEntity copy(@NotNull FuturesWelfareTrialEntity trial, boolean isShowAssets) {
        Intrinsics.checkNotNullParameter(trial, "trial");
        return new FuturesWelfareAssetsEntity(trial, isShowAssets);
    }

    @NotNull
    public final FuturesWelfareTrialEntity getTrial() {
        return this.trial;
    }

    public int hashCode() {
        return (this.trial.hashCode() * 31) + Boolean.hashCode(this.isShowAssets);
    }

    public final boolean isShowAssets() {
        return this.isShowAssets;
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareAssetsEntity(trial=" + this.trial + ", isShowAssets=" + this.isShowAssets + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.trial.writeToParcel(dest, flags);
        dest.writeInt(this.isShowAssets ? 1 : 0);
    }
}
