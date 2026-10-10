package com.revolut.revolutpay.p123ui.promo_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.api.CashbackState;
import com.revolut.revolutpay.api.ExperienceEnrollment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u0017\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0017\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\u0017\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b\u001b\u0010%\"\u0004\b\u0017\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b\u0017\u0010*¨\u0006+"}, m90084d2 = {"com/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState", "Landroid/os/Parcelable;", "Lcom/revolut/revolutpay/api/CashbackState;", "cashbackState", "Lcom/revolut/revolutpay/api/ExperienceEnrollment;", "experienceEnrollment", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;", "phoneState", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;", "emailState", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;", "sendingFlowState", "<init>", "(Lcom/revolut/revolutpay/api/CashbackState;Lcom/revolut/revolutpay/api/ExperienceEnrollment;Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/revolut/revolutpay/api/CashbackState;", "()Lcom/revolut/revolutpay/api/CashbackState;", "(Lcom/revolut/revolutpay/api/CashbackState;)V", "b", "Lcom/revolut/revolutpay/api/ExperienceEnrollment;", "c", "()Lcom/revolut/revolutpay/api/ExperienceEnrollment;", "(Lcom/revolut/revolutpay/api/ExperienceEnrollment;)V", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;", "d", "()Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;", "(Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;)V", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;", "()Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;", "(Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;)V", "e", "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;", "()Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;", "(Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;)V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class PromoWidgetContract$DomainState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PromoWidgetContract$DomainState> CREATOR = new C27573a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private CashbackState cashbackState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ExperienceEnrollment experienceEnrollment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private PromoWidgetContract$PhoneState phoneState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private PromoWidgetContract$EmailState emailState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private PromoWidgetContract$SendingFlowState sendingFlowState;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.promo_widget.PromoWidgetContract$DomainState$a */
    @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class C27573a implements Parcelable.Creator<PromoWidgetContract$DomainState> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PromoWidgetContract$DomainState[] newArray(int i11) {
            return new PromoWidgetContract$DomainState[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PromoWidgetContract$DomainState createFromParcel(@NotNull Parcel parcel) {
            CashbackState cashbackStateCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ExperienceEnrollment experienceEnrollmentValueOf = null;
            if (parcel.readInt() == 0) {
                cashbackStateCreateFromParcel = null;
            } else {
                cashbackStateCreateFromParcel = CashbackState.CREATOR.createFromParcel(parcel);
            }
            CashbackState cashbackState = cashbackStateCreateFromParcel;
            if (parcel.readInt() != 0) {
                experienceEnrollmentValueOf = ExperienceEnrollment.valueOf(parcel.readString());
            }
            return new PromoWidgetContract$DomainState(cashbackState, experienceEnrollmentValueOf, (PromoWidgetContract$PhoneState) parcel.readParcelable(PromoWidgetContract$DomainState.class.getClassLoader()), (PromoWidgetContract$EmailState) parcel.readParcelable(PromoWidgetContract$DomainState.class.getClassLoader()), (PromoWidgetContract$SendingFlowState) parcel.readParcelable(PromoWidgetContract$DomainState.class.getClassLoader()));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CashbackState getCashbackState() {
        return this.cashbackState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m68419a(@Nullable CashbackState cashbackState) {
        this.cashbackState = cashbackState;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final PromoWidgetContract$EmailState getEmailState() {
        return this.emailState;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ExperienceEnrollment getExperienceEnrollment() {
        return this.experienceEnrollment;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final PromoWidgetContract$PhoneState getPhoneState() {
        return this.phoneState;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final PromoWidgetContract$SendingFlowState getSendingFlowState() {
        return this.sendingFlowState;
    }

    public PromoWidgetContract$DomainState(@Nullable CashbackState cashbackState, @Nullable ExperienceEnrollment experienceEnrollment, @NotNull PromoWidgetContract$PhoneState phoneState, @NotNull PromoWidgetContract$EmailState emailState, @NotNull PromoWidgetContract$SendingFlowState sendingFlowState) {
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        Intrinsics.checkNotNullParameter(emailState, "emailState");
        Intrinsics.checkNotNullParameter(sendingFlowState, "sendingFlowState");
        this.cashbackState = cashbackState;
        this.experienceEnrollment = experienceEnrollment;
        this.phoneState = phoneState;
        this.emailState = emailState;
        this.sendingFlowState = sendingFlowState;
    }

    /* JADX INFO: renamed from: a */
    public final void m68420a(@Nullable ExperienceEnrollment experienceEnrollment) {
        this.experienceEnrollment = experienceEnrollment;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        CashbackState cashbackState = this.cashbackState;
        if (cashbackState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cashbackState.writeToParcel(parcel, flags);
        }
        ExperienceEnrollment experienceEnrollment = this.experienceEnrollment;
        if (experienceEnrollment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(experienceEnrollment.name());
        }
        parcel.writeParcelable(this.phoneState, flags);
        parcel.writeParcelable(this.emailState, flags);
        parcel.writeParcelable(this.sendingFlowState, flags);
    }

    /* JADX INFO: renamed from: a */
    public final void m68421a(@NotNull PromoWidgetContract$EmailState promoWidgetContract$EmailState) {
        Intrinsics.checkNotNullParameter(promoWidgetContract$EmailState, "<set-?>");
        this.emailState = promoWidgetContract$EmailState;
    }

    /* JADX INFO: renamed from: a */
    public final void m68422a(@NotNull PromoWidgetContract$PhoneState promoWidgetContract$PhoneState) {
        Intrinsics.checkNotNullParameter(promoWidgetContract$PhoneState, "<set-?>");
        this.phoneState = promoWidgetContract$PhoneState;
    }

    /* JADX INFO: renamed from: a */
    public final void m68423a(@NotNull PromoWidgetContract$SendingFlowState promoWidgetContract$SendingFlowState) {
        Intrinsics.checkNotNullParameter(promoWidgetContract$SendingFlowState, "<set-?>");
        this.sendingFlowState = promoWidgetContract$SendingFlowState;
    }
}
