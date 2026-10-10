package com.kubi.assets.dialog.payment;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetPaymentListConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetPaymentListConfig;", "Landroid/os/Parcelable;", "tradeType", "", DropFrameTable.COLUMN_SCENE, "paymentMethod", "", "Lcom/kubi/assets/dialog/payment/AssetPaymentListGroup;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTradeType", "()Ljava/lang/String;", "getScene", "getPaymentMethod", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetPaymentListConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetPaymentListConfig> CREATOR = new C9823a();

    @Nullable
    private final List<AssetPaymentListGroup> paymentMethod;

    @Nullable
    private final String scene;

    @Nullable
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetPaymentListConfig$a */
    /* JADX INFO: compiled from: AssetPaymentListConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9823a implements Parcelable.Creator<AssetPaymentListConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssetPaymentListConfig createFromParcel(Parcel parcel) {
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
                    arrayList2.add(AssetPaymentListGroup.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AssetPaymentListConfig(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AssetPaymentListConfig[] newArray(int i11) {
            return new AssetPaymentListConfig[i11];
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
        if (!(other instanceof AssetPaymentListConfig)) {
            return false;
        }
        AssetPaymentListConfig assetPaymentListConfig = (AssetPaymentListConfig) other;
        return Intrinsics.areEqual(this.tradeType, assetPaymentListConfig.tradeType) && Intrinsics.areEqual(this.scene, assetPaymentListConfig.scene) && Intrinsics.areEqual(this.paymentMethod, assetPaymentListConfig.paymentMethod);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetPaymentListConfig copy$default(AssetPaymentListConfig assetPaymentListConfig, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = assetPaymentListConfig.tradeType;
        }
        if ((i11 & 2) != 0) {
            str2 = assetPaymentListConfig.scene;
        }
        if ((i11 & 4) != 0) {
            list = assetPaymentListConfig.paymentMethod;
        }
        return assetPaymentListConfig.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final List<AssetPaymentListGroup> component3() {
        return this.paymentMethod;
    }

    @NotNull
    public final AssetPaymentListConfig copy(@Nullable String tradeType, @Nullable String scene, @Nullable List<AssetPaymentListGroup> paymentMethod) {
        return new AssetPaymentListConfig(tradeType, scene, paymentMethod);
    }

    @Nullable
    public final List<AssetPaymentListGroup> getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        String str = this.tradeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scene;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AssetPaymentListGroup> list = this.paymentMethod;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AssetPaymentListConfig(tradeType=" + this.tradeType + ", scene=" + this.scene + ", paymentMethod=" + this.paymentMethod + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeType);
        dest.writeString(this.scene);
        List<AssetPaymentListGroup> list = this.paymentMethod;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<AssetPaymentListGroup> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public AssetPaymentListConfig(@Nullable String str, @Nullable String str2, @Nullable List<AssetPaymentListGroup> list) {
        this.tradeType = str;
        this.scene = str2;
        this.paymentMethod = list;
    }
}
