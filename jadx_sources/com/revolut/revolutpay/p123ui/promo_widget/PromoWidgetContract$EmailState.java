package com.revolut.revolutpay.p123ui.promo_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m90084d2 = {"com/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState", "Landroid/os/Parcelable;", "Empty", "Valid", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState$Empty;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState$Valid;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface PromoWidgetContract$EmailState extends Parcelable {

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState$Valid;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "email", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
    public static final /* data */ class Valid implements PromoWidgetContract$EmailState {

        @NotNull
        public static final Parcelable.Creator<Valid> CREATOR = new C27575a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String email;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$EmailState$Valid$a */
        @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class C27575a implements Parcelable.Creator<Valid> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Valid[] newArray(int i11) {
                return new Valid[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Valid createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Valid(parcel.readString());
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Valid m68432a(Valid valid, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = valid.email;
            }
            return valid.m68433a(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Valid) && Intrinsics.areEqual(this.email, ((Valid) other).email);
        }

        public Valid(@NotNull String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Valid m68433a(@NotNull String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new Valid(email);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m68435b() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        @NotNull
        public String toString() {
            return "Valid(email=" + this.email + ')';
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.email);
        }
    }

    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState$Empty;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Empty implements PromoWidgetContract$EmailState {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Empty f56321a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new C27574a();

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$EmailState$Empty$a */
        @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class C27574a implements Parcelable.Creator<Empty> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Empty[] newArray(int i11) {
                return new Empty[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Empty createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f56321a;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private Empty() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }
}
