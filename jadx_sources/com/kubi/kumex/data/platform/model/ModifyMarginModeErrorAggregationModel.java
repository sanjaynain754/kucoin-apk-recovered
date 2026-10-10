package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifyMarginModeResultEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/ModifyMarginModeErrorAggregationModel;", "Landroid/os/Parcelable;", "code", "", "errorMsgDesc", "symbols", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getErrorMsgDesc", "getSymbols", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ModifyMarginModeErrorAggregationModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ModifyMarginModeErrorAggregationModel> CREATOR = new C15812a();

    @NotNull
    private final String code;

    @NotNull
    private final String errorMsgDesc;

    @NotNull
    private final String symbols;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.ModifyMarginModeErrorAggregationModel$a */
    /* JADX INFO: compiled from: ModifyMarginModeResultEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15812a implements Parcelable.Creator<ModifyMarginModeErrorAggregationModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModifyMarginModeErrorAggregationModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ModifyMarginModeErrorAggregationModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ModifyMarginModeErrorAggregationModel[] newArray(int i11) {
            return new ModifyMarginModeErrorAggregationModel[i11];
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
        if (!(other instanceof ModifyMarginModeErrorAggregationModel)) {
            return false;
        }
        ModifyMarginModeErrorAggregationModel modifyMarginModeErrorAggregationModel = (ModifyMarginModeErrorAggregationModel) other;
        return Intrinsics.areEqual(this.code, modifyMarginModeErrorAggregationModel.code) && Intrinsics.areEqual(this.errorMsgDesc, modifyMarginModeErrorAggregationModel.errorMsgDesc) && Intrinsics.areEqual(this.symbols, modifyMarginModeErrorAggregationModel.symbols);
    }

    public ModifyMarginModeErrorAggregationModel(@NotNull String code, @NotNull String errorMsgDesc, @NotNull String symbols) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(errorMsgDesc, "errorMsgDesc");
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        this.code = code;
        this.errorMsgDesc = errorMsgDesc;
        this.symbols = symbols;
    }

    public static /* synthetic */ ModifyMarginModeErrorAggregationModel copy$default(ModifyMarginModeErrorAggregationModel modifyMarginModeErrorAggregationModel, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = modifyMarginModeErrorAggregationModel.code;
        }
        if ((i11 & 2) != 0) {
            str2 = modifyMarginModeErrorAggregationModel.errorMsgDesc;
        }
        if ((i11 & 4) != 0) {
            str3 = modifyMarginModeErrorAggregationModel.symbols;
        }
        return modifyMarginModeErrorAggregationModel.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMsgDesc() {
        return this.errorMsgDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbols() {
        return this.symbols;
    }

    @NotNull
    public final ModifyMarginModeErrorAggregationModel copy(@NotNull String code, @NotNull String errorMsgDesc, @NotNull String symbols) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(errorMsgDesc, "errorMsgDesc");
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return new ModifyMarginModeErrorAggregationModel(code, errorMsgDesc, symbols);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getErrorMsgDesc() {
        return this.errorMsgDesc;
    }

    @NotNull
    public final String getSymbols() {
        return this.symbols;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.errorMsgDesc.hashCode()) * 31) + this.symbols.hashCode();
    }

    @NotNull
    public String toString() {
        return "ModifyMarginModeErrorAggregationModel(code=" + this.code + ", errorMsgDesc=" + this.errorMsgDesc + ", symbols=" + this.symbols + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.errorMsgDesc);
        dest.writeString(this.symbols);
    }
}
