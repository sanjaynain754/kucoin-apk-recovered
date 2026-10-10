package com.revolut.revolutpay.ui_kit.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.model.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C27594e extends AbstractC27592b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27594e f56383a = new C27594e();

    @NotNull
    public static final Parcelable.Creator<C27594e> CREATOR = new a();

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.model.e$a */
    public static final class a implements Parcelable.Creator<C27594e> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C27594e[] newArray(int i11) {
            return new C27594e[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27594e createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return C27594e.f56383a;
        }
    }

    private C27594e() {
        super(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(1);
    }
}
