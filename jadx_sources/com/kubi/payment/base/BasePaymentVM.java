package com.kubi.payment.base;

import androidx.annotation.Keep;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.InterfaceC42877j;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BasePaymentVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u001aB\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/base/BasePaymentVM;", "Repository", "Lcom/kubi/payment/base/IRepository;", "Landroidx/lifecycle/ViewModel;", "repository", "<init>", "(Lcom/kubi/payment/base/IRepository;)V", "Lcom/kubi/payment/base/IRepository;", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "get_isLoading", "()Landroidx/lifecycle/MutableLiveData;", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_loadingUIState", "Lcom/kubi/payment/base/BasePaymentVM$LoadingUIState;", "get_loadingUIState", "loadingUIState", "getLoadingUIState", "_toastException", "", "get_toastException", "toastException", "getToastException", "LoadingUIState", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class BasePaymentVM<Repository extends InterfaceC42877j> extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Repository f38215V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Boolean> f38216W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<LoadingUIState> f38217X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Throwable> f38218Y;

    /* JADX INFO: compiled from: BasePaymentVM.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/base/BasePaymentVM$LoadingUIState;", "", "isLoading", "", "isShowEmpty", "isShowError", "isShowContent", "<init>", "(ZZZZ)V", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadingUIState {
        private final boolean isLoading;
        private final boolean isShowContent;
        private final boolean isShowEmpty;
        private final boolean isShowError;

        public LoadingUIState() {
            this(false, false, false, false, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingUIState)) {
                return false;
            }
            LoadingUIState loadingUIState = (LoadingUIState) other;
            return this.isLoading == loadingUIState.isLoading && this.isShowEmpty == loadingUIState.isShowEmpty && this.isShowError == loadingUIState.isShowError && this.isShowContent == loadingUIState.isShowContent;
        }

        public LoadingUIState(boolean z11, boolean z12, boolean z13, boolean z14) {
            this.isLoading = z11;
            this.isShowEmpty = z12;
            this.isShowError = z13;
            this.isShowContent = z14;
        }

        public static /* synthetic */ LoadingUIState copy$default(LoadingUIState loadingUIState, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = loadingUIState.isLoading;
            }
            if ((i11 & 2) != 0) {
                z12 = loadingUIState.isShowEmpty;
            }
            if ((i11 & 4) != 0) {
                z13 = loadingUIState.isShowError;
            }
            if ((i11 & 8) != 0) {
                z14 = loadingUIState.isShowContent;
            }
            return loadingUIState.copy(z11, z12, z13, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsShowEmpty() {
            return this.isShowEmpty;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsShowError() {
            return this.isShowError;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsShowContent() {
            return this.isShowContent;
        }

        @NotNull
        public final LoadingUIState copy(boolean isLoading, boolean isShowEmpty, boolean isShowError, boolean isShowContent) {
            return new LoadingUIState(isLoading, isShowEmpty, isShowError, isShowContent);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isShowEmpty)) * 31) + Boolean.hashCode(this.isShowError)) * 31) + Boolean.hashCode(this.isShowContent);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isShowContent() {
            return this.isShowContent;
        }

        public final boolean isShowEmpty() {
            return this.isShowEmpty;
        }

        public final boolean isShowError() {
            return this.isShowError;
        }

        @NotNull
        public String toString() {
            return "LoadingUIState(isLoading=" + this.isLoading + ", isShowEmpty=" + this.isShowEmpty + ", isShowError=" + this.isShowError + ", isShowContent=" + this.isShowContent + ')';
        }

        public /* synthetic */ LoadingUIState(boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14);
        }
    }

    public BasePaymentVM(@NotNull Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38215V = repository;
        this.f38216W = new MutableLiveData<>();
        this.f38217X = new MutableLiveData<>();
        this.f38218Y = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<LoadingUIState> m45655n() {
        return this.f38217X;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<Throwable> m45656o() {
        return this.f38218Y;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Boolean> m45657p() {
        return this.f38216W;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<LoadingUIState> m45658q() {
        return this.f38217X;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<Throwable> m45659r() {
        return this.f38218Y;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final LiveData<Boolean> m45660s() {
        return this.f38216W;
    }
}
