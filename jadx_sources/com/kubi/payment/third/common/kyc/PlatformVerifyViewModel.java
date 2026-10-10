package com.kubi.payment.third.common.kyc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.third.data.source.IThirdRepository;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p477nt.C42874g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformVerifyViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/third/data/source/IThirdRepository;", "<init>", "(Lcom/kubi/payment/third/data/source/IThirdRepository;)V", "_userInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/otc/entity/FiatUserInfo;", "userInfo", "Landroidx/lifecycle/LiveData;", "getUserInfo", "()Landroidx/lifecycle/LiveData;", "isRefreshing", "", "setRefreshing", "", "loadUserInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PlatformVerifyViewModel extends C42874g {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IThirdRepository f40217X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<FiatUserInfo> f40218Y;

    /* JADX INFO: renamed from: Z */
    public boolean f40219Z;

    public PlatformVerifyViewModel(@NotNull IThirdRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f40217X = repository;
        this.f40218Y = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<FiatUserInfo> m49531x() {
        return this.f40218Y;
    }

    /* JADX INFO: renamed from: y */
    public final void m49532y() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new PlatformVerifyViewModel$loadUserInfo$1(this, null), 3, null);
    }
}
