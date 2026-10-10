package com.kubi.futures.entry;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.platform.model.ResourcePositionEntity;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44974a;

/* JADX INFO: compiled from: FuturesContainerViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/entry/FuturesContainerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "platformApi", "Lcom/kubi/futures/data/platform/IPlatformApi;", "kotlin.jvm.PlatformType", "getPlatformApi", "()Lcom/kubi/futures/data/platform/IPlatformApi;", "platformApi$delegate", "Lkotlin/Lazy;", "_tradingCompetitionResource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;", "tradingCompetitionResource", "Landroidx/lifecycle/LiveData;", "getTradingCompetitionResource", "()Landroidx/lifecycle/LiveData;", "loadTradingCompetitionResource", "", "code", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesContainerViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f23013V = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.entry.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesContainerViewModel.m25534t();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<ResourcePositionEntity> f23014W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final LiveData<ResourcePositionEntity> f23015X;

    /* JADX INFO: renamed from: q */
    public final InterfaceC44974a m25535q() {
        return (InterfaceC44974a) this.f23013V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final LiveData<ResourcePositionEntity> m25536r() {
        return this.f23015X;
    }

    /* JADX INFO: renamed from: s */
    public final void m25537s(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new FuturesContainerViewModel$loadTradingCompetitionResource$1(this, code, null), 2, null);
    }

    public FuturesContainerViewModel() {
        MutableLiveData<ResourcePositionEntity> mutableLiveData = new MutableLiveData<>();
        this.f23014W = mutableLiveData;
        this.f23015X = mutableLiveData;
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC44974a m25534t() {
        return (InterfaceC44974a) C42597a.m93391g().create(InterfaceC44974a.class);
    }
}
