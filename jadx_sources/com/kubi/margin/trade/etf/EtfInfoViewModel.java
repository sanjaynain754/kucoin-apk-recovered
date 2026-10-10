package com.kubi.margin.trade.etf;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.EtfRebalanceRecord;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.router.utils.RouteExKt;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: EtfInfoViewModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/trade/etf/EtfInfoViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "coin", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getCoin", "()Landroidx/lifecycle/MutableLiveData;", "etfInfo", "Lcom/kubi/data/entity/EtfCoinEntity;", "getEtfInfo", "rebalanceRecord", "", "Lcom/kubi/data/entity/EtfRebalanceRecord;", "getRebalanceRecord", "initParams", "", "bundle", "Landroid/os/Bundle;", "fetchEtfCoin", "fetchEtfRebalanceRecord", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EtfInfoViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<String> f33885V = new MutableLiveData<>("");

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<EtfCoinEntity> f33886W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<List<EtfRebalanceRecord>> f33887X = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<String> m40305p() {
        return this.f33885V;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<EtfCoinEntity> m40306q() {
        return this.f33886W;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<List<EtfRebalanceRecord>> m40307r() {
        return this.f33887X;
    }

    /* JADX INFO: renamed from: s */
    public final void m40308s(@Nullable Bundle bundle) {
        String strM56239b0;
        if (bundle == null || (strM56239b0 = RouteExKt.m56239b0(bundle, "coin")) == null) {
            return;
        }
        this.f33885V.setValue(strM56239b0);
    }

    /* JADX INFO: renamed from: n */
    public final void m40303n() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new EtfInfoViewModel$fetchEtfCoin$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m40304o() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new EtfInfoViewModel$fetchEtfRebalanceRecord$1(this, null), 2, null);
    }
}
