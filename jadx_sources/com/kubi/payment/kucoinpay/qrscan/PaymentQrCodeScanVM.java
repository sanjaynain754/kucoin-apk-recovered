package com.kubi.payment.kucoinpay.qrscan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: PaymentQrCodeScanVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rR\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_logoList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/payment/kucoinpay/qrscan/QrcodeInfo;", "logoList", "Landroidx/lifecycle/LiveData;", "getLogoList", "()Landroidx/lifecycle/LiveData;", "fetchQrPayLogoList", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentQrCodeScanVM extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<List<QrcodeInfo>> f39623V = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<List<QrcodeInfo>> m48380o() {
        return this.f39623V;
    }

    /* JADX INFO: renamed from: n */
    public final void m48379n() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new PaymentQrCodeScanVM$fetchQrPayLogoList$1(this, null), 3, null);
    }
}
