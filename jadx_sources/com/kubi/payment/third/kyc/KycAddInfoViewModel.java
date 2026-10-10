package com.kubi.payment.third.kyc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.payment.third.data.source.IThirdRepository;
import com.kubi.payment.track.IPaymentTrack;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p477nt.C42874g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycAddInfoViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/third/kyc/KycAddInfoViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/third/data/source/IThirdRepository;", "<init>", "(Lcom/kubi/payment/third/data/source/IThirdRepository;)V", "_isCompleteKyc", "Landroidx/lifecycle/MutableLiveData;", "", "isCompleteKyc", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "loadCompleteKycInfo", "", ReportDataTable.COLUMN_PARAMS, "", "", "trackCheckKycComplete", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycAddInfoViewModel extends C42874g {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IThirdRepository f40233X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f40234Y;

    public KycAddInfoViewModel(@NotNull IThirdRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f40233X = repository;
        this.f40234Y = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<Boolean> m49571w() {
        return this.f40234Y;
    }

    /* JADX INFO: renamed from: x */
    public final void m49572x(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new KycAddInfoViewModel$loadCompleteKycInfo$1(this, params, null), 3, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m49573y(ApiException apiException) {
        IPaymentTrack.m49797i(IPaymentTrack.f40346a.getTrack(), "CHECK_KYC_COMPLETE", false, apiException.code + ':' + apiException.getMessage(), null, 10, null);
    }
}
