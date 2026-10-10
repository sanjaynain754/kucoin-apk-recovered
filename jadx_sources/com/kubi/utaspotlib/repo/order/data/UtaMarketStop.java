package com.kubi.utaspotlib.repo.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaMakeOrderData.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/data/UtaMarketStop;", "Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UtaMarketStop extends UtaOrderRequest {

    @NotNull
    public static final Parcelable.Creator<UtaMarketStop> CREATOR = new C26950a();

    /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaMarketStop$a */
    /* JADX INFO: compiled from: UtaMakeOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26950a implements Parcelable.Creator<UtaMarketStop> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UtaMarketStop createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new UtaMarketStop();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UtaMarketStop[] newArray(int i11) {
            return new UtaMarketStop[i11];
        }
    }

    @Override // com.kubi.utaspotlib.repo.order.data.UtaOrderRequest, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UtaMarketStop() {
        super(null, "SPOT", "MARKET", null, null, null, null, null, null, null, false, null, "TP", false, 12281, null);
    }

    @Override // com.kubi.utaspotlib.repo.order.data.UtaOrderRequest, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
