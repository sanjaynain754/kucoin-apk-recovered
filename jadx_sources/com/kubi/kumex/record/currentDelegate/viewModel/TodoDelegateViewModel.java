package com.kubi.kumex.record.currentDelegate.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kubi.sdk.BaseViewModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TodoDelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020 J\u0006\u0010\u0011\u001a\u00020 J\u0006\u0010\u0017\u001a\u00020 J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0010J\u000e\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\n¨\u0006*"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/viewModel/TodoDelegateViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "_filtersInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/record/currentDelegate/viewModel/FiltersInfo;", "filtersInfo", "Landroidx/lifecycle/LiveData;", "getFiltersInfo", "()Landroidx/lifecycle/LiveData;", "_fundsType", "", "fundsType", "getFundsType", "_revokeAllBasicOrders", "", "revokeAllBasicOrders", "getRevokeAllBasicOrders", "_revokeAllAdvanceOrders", "revokeAllAdvanceOrders", "getRevokeAllAdvanceOrders", "_revokeAllTwapOrders", "revokeAllTwapOrders", "getRevokeAllTwapOrders", "_isBasicOrdersEmpty", "isBasicOrdersEmpty", "_isAdvancedOrdersEmpty", "isAdvancedOrdersEmpty", "_isTwapOrdersEmpty", "isTwapOrdersEmpty", "updateFilters", "", "filters", "setFundsType", "setBasicOrdersEmpty", "basicOrdersEmpty", "setAdvancedOrdersEmpty", "advancedOrdersEmpty", "setTwapOrdersEmpty", "twapOrdersEmpty", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TodoDelegateViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public static final Companion f30091n0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<FiltersInfo> f30092X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<FiltersInfo> f30093Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<String> f30094Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<String> f30095a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f30096b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final LiveData<Boolean> f30097c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f30098d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<Boolean> f30099e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Boolean> f30100f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final LiveData<Boolean> f30101g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<Boolean> f30102h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final LiveData<Boolean> f30103i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MutableLiveData<Boolean> f30104j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final LiveData<Boolean> f30105k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<Boolean> f30106l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final LiveData<Boolean> f30107m0;

    /* JADX INFO: compiled from: TodoDelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/viewModel/TodoDelegateViewModel$Companion;", "", "<init>", "()V", "PAGE_SIZE", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m35572A(boolean z11) {
        this.f30104j0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: B */
    public final void m35573B(boolean z11) {
        this.f30102h0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: C */
    public final void m35574C(@NotNull String fundsType) {
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        this.f30094Z.setValue(fundsType);
    }

    /* JADX INFO: renamed from: D */
    public final void m35575D(boolean z11) {
        this.f30106l0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: E */
    public final void m35576E(@NotNull FiltersInfo filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f30092X.setValue(filters);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LiveData<FiltersInfo> m35577p() {
        return this.f30093Y;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<String> m35578q() {
        return this.f30095a0;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final LiveData<Boolean> m35579r() {
        return this.f30099e0;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final LiveData<Boolean> m35580s() {
        return this.f30097c0;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final LiveData<Boolean> m35581t() {
        return this.f30101g0;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final LiveData<Boolean> m35582u() {
        return this.f30105k0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final LiveData<Boolean> m35583v() {
        return this.f30103i0;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<Boolean> m35584w() {
        return this.f30107m0;
    }

    /* JADX INFO: renamed from: x */
    public final void m35585x() {
        this.f30098d0.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y */
    public final void m35586y() {
        this.f30096b0.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: z */
    public final void m35587z() {
        this.f30100f0.setValue(Boolean.TRUE);
    }

    public TodoDelegateViewModel() {
        MutableLiveData<FiltersInfo> mutableLiveData = new MutableLiveData<>();
        this.f30092X = mutableLiveData;
        this.f30093Y = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.f30094Z = mutableLiveData2;
        this.f30095a0 = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.f30096b0 = mutableLiveData3;
        this.f30097c0 = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.f30098d0 = mutableLiveData4;
        this.f30099e0 = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.f30100f0 = mutableLiveData5;
        this.f30101g0 = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        this.f30102h0 = mutableLiveData6;
        this.f30103i0 = mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>();
        this.f30104j0 = mutableLiveData7;
        this.f30105k0 = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        this.f30106l0 = mutableLiveData8;
        this.f30107m0 = mutableLiveData8;
    }
}
