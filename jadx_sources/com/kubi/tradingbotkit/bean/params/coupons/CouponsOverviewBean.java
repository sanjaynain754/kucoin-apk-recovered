package com.kubi.tradingbotkit.bean.params.coupons;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CouponsOverviewBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsOverviewBean;", "Landroid/os/Parcelable;", "<init>", "()V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "templateType", "getTemplateType", "setTemplateType", "totalInvestments", "getTotalInvestments", "setTotalInvestments", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponsOverviewBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CouponsOverviewBean> CREATOR = new C26030a();

    @Nullable
    private String symbol;

    @Nullable
    private String templateType;

    @Nullable
    private String totalInvestments;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.bean.params.coupons.CouponsOverviewBean$a */
    /* JADX INFO: compiled from: CouponsOverviewBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26030a implements Parcelable.Creator<CouponsOverviewBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponsOverviewBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new CouponsOverviewBean();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponsOverviewBean[] newArray(int i11) {
            return new CouponsOverviewBean[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTemplateType() {
        return this.templateType;
    }

    @Nullable
    public final String getTotalInvestments() {
        return this.totalInvestments;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTemplateType(@Nullable String str) {
        this.templateType = str;
    }

    public final void setTotalInvestments(@Nullable String str) {
        this.totalInvestments = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
