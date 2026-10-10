package com.kubi.tradingbotkit.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CouponsItemModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006 "}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/CouponsItemModel;", "Landroid/os/Parcelable;", "<init>", "()V", "discountPercentage", "", "getDiscountPercentage", "()Ljava/lang/String;", "setDiscountPercentage", "(Ljava/lang/String;)V", "discountTitle", "getDiscountTitle", "setDiscountTitle", "discountExpireDate", "getDiscountExpireDate", "setDiscountExpireDate", "supportTypeCode", "", "getSupportTypeCode", "()Ljava/util/List;", "setSupportTypeCode", "(Ljava/util/List;)V", "supportTypeName", "getSupportTypeName", "setSupportTypeName", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponsItemModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CouponsItemModel> CREATOR = new C26229a();

    @Nullable
    private String discountExpireDate;

    @Nullable
    private String discountPercentage;

    @Nullable
    private String discountTitle;

    @Nullable
    private List<String> supportTypeCode;

    @Nullable
    private List<String> supportTypeName;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.CouponsItemModel$a */
    /* JADX INFO: compiled from: CouponsItemModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26229a implements Parcelable.Creator<CouponsItemModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponsItemModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new CouponsItemModel();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponsItemModel[] newArray(int i11) {
            return new CouponsItemModel[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getDiscountExpireDate() {
        return this.discountExpireDate;
    }

    @Nullable
    public final String getDiscountPercentage() {
        return this.discountPercentage;
    }

    @Nullable
    public final String getDiscountTitle() {
        return this.discountTitle;
    }

    @Nullable
    public final List<String> getSupportTypeCode() {
        return this.supportTypeCode;
    }

    @Nullable
    public final List<String> getSupportTypeName() {
        return this.supportTypeName;
    }

    public final void setDiscountExpireDate(@Nullable String str) {
        this.discountExpireDate = str;
    }

    public final void setDiscountPercentage(@Nullable String str) {
        this.discountPercentage = str;
    }

    public final void setDiscountTitle(@Nullable String str) {
        this.discountTitle = str;
    }

    public final void setSupportTypeCode(@Nullable List<String> list) {
        this.supportTypeCode = list;
    }

    public final void setSupportTypeName(@Nullable List<String> list) {
        this.supportTypeName = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
