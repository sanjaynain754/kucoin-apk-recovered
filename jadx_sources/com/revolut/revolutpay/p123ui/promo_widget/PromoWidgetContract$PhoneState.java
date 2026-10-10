package com.revolut.revolutpay.p123ui.promo_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.p123ui.picker.model.C27572a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m90084d2 = {"com/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState", "Landroid/os/Parcelable;", "CountrySelected", "Empty", "Preset", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState$CountrySelected;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState$Empty;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState$Preset;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface PromoWidgetContract$PhoneState extends Parcelable {

    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState$CountrySelected;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;", "Lcom/revolut/revolutpay/ui/picker/model/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "countryInfo", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Lcom/revolut/revolutpay/ui/picker/model/a;", "b", "()Lcom/revolut/revolutpay/ui/picker/model/a;", "<init>", "(Lcom/revolut/revolutpay/ui/picker/model/a;)V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
    public static final /* data */ class CountrySelected implements PromoWidgetContract$PhoneState {

        @NotNull
        public static final Parcelable.Creator<CountrySelected> CREATOR = new C27576a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final C27572a countryInfo;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$PhoneState$CountrySelected$a */
        @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class C27576a implements Parcelable.Creator<CountrySelected> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountrySelected[] newArray(int i11) {
                return new CountrySelected[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountrySelected createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountrySelected(C27572a.CREATOR.createFromParcel(parcel));
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C27572a getCountryInfo() {
            return this.countryInfo;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CountrySelected) && Intrinsics.areEqual(this.countryInfo, ((CountrySelected) other).countryInfo);
        }

        public CountrySelected(@NotNull C27572a countryInfo) {
            Intrinsics.checkNotNullParameter(countryInfo, "countryInfo");
            this.countryInfo = countryInfo;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final CountrySelected m68440a(@NotNull C27572a countryInfo) {
            Intrinsics.checkNotNullParameter(countryInfo, "countryInfo");
            return new CountrySelected(countryInfo);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C27572a m68441b() {
            return this.countryInfo;
        }

        public int hashCode() {
            return this.countryInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "CountrySelected(countryInfo=" + this.countryInfo + ')';
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ CountrySelected m68438a(CountrySelected countrySelected, C27572a c27572a, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c27572a = countrySelected.countryInfo;
            }
            return countrySelected.m68440a(c27572a);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.countryInfo.writeToParcel(parcel, flags);
        }
    }

    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState$Preset;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, HintConstants.AUTOFILL_HINT_PHONE, "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
    public static final /* data */ class Preset implements PromoWidgetContract$PhoneState {

        @NotNull
        public static final Parcelable.Creator<Preset> CREATOR = new C27578a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String phone;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$PhoneState$Preset$a */
        @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class C27578a implements Parcelable.Creator<Preset> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Preset[] newArray(int i11) {
                return new Preset[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Preset createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Preset(parcel.readString());
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Preset m68446a(Preset preset, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = preset.phone;
            }
            return preset.m68447a(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Preset) && Intrinsics.areEqual(this.phone, ((Preset) other).phone);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Preset m68447a(@NotNull String phone) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            return new Preset(phone);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m68449b() {
            return this.phone;
        }

        public int hashCode() {
            return this.phone.hashCode();
        }

        @NotNull
        public String toString() {
            return "Preset(phone=" + this.phone + ')';
        }

        public Preset(@NotNull String phone) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            this.phone = phone;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.phone);
        }
    }

    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState$Empty;", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Empty implements PromoWidgetContract$PhoneState {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Empty f56324a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new C27577a();

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$PhoneState$Empty$a */
        @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
        public static final class C27577a implements Parcelable.Creator<Empty> {
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
                return Empty.f56324a;
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
