package com.revolut.revolutpay.p123ui.promo_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.ui_kit.params.C27595c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m90084d2 = {"com/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState", "Landroid/os/Parcelable;", "Confirmation", "Error", "Sent", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState$Confirmation;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState$Error;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState$Sent;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface PromoWidgetContract$SendingFlowState extends Parcelable {

    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState$Sent;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;", "Lcom/revolut/revolutpay/ui_kit/params/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "phoneInputData", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Lcom/revolut/revolutpay/ui_kit/params/c;", "b", "()Lcom/revolut/revolutpay/ui_kit/params/c;", "<init>", "(Lcom/revolut/revolutpay/ui_kit/params/c;)V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
    public static final /* data */ class Sent implements PromoWidgetContract$SendingFlowState {

        @NotNull
        public static final Parcelable.Creator<Sent> CREATOR = new C27581a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final C27595c phoneInputData;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$SendingFlowState$Sent$a */
        @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class C27581a implements Parcelable.Creator<Sent> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Sent[] newArray(int i11) {
                return new Sent[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Sent createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sent(C27595c.CREATOR.createFromParcel(parcel));
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Sent m68456a(Sent sent, C27595c c27595c, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c27595c = sent.phoneInputData;
            }
            return sent.m68457a(c27595c);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sent) && Intrinsics.areEqual(this.phoneInputData, ((Sent) other).phoneInputData);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Sent m68457a(@NotNull C27595c phoneInputData) {
            Intrinsics.checkNotNullParameter(phoneInputData, "phoneInputData");
            return new Sent(phoneInputData);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C27595c m68459b() {
            return this.phoneInputData;
        }

        public int hashCode() {
            return this.phoneInputData.hashCode();
        }

        @NotNull
        public String toString() {
            return "Sent(phoneInputData=" + this.phoneInputData + ')';
        }

        public Sent(@NotNull C27595c phoneInputData) {
            Intrinsics.checkNotNullParameter(phoneInputData, "phoneInputData");
            this.phoneInputData = phoneInputData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C27595c getPhoneInputData() {
            return this.phoneInputData;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.phoneInputData.writeToParcel(parcel, flags);
        }
    }

    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState$Confirmation;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Confirmation implements PromoWidgetContract$SendingFlowState {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Confirmation f56326a = new Confirmation();

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new C27579a();

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$SendingFlowState$Confirmation$a */
        @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class C27579a implements Parcelable.Creator<Confirmation> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Confirmation[] newArray(int i11) {
                return new Confirmation[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Confirmation createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Confirmation.f56326a;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private Confirmation() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState$Error;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Error implements PromoWidgetContract$SendingFlowState {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Error f56327a = new Error();

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new C27580a();

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$SendingFlowState$Error$a */
        @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class C27580a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Error[] newArray(int i11) {
                return new Error[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Error createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f56327a;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private Error() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }
}
