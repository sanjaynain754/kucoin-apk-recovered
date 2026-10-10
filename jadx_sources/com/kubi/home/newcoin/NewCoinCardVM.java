package com.kubi.home.newcoin;

import android.annotation.SuppressLint;
import androidx.lifecycle.MutableLiveData;
import com.kubi.home.entity.RecommendNewCoinEntity;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.mvi.p102vm.BaseVM;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: NewCoinCardVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/home/newcoin/NewCoinCardVM;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "recommendNewCoinEntityLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/home/entity/RecommendNewCoinEntity;", "getRecommendNewCoinEntityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "registerWsData", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
public final class NewCoinCardVM extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<RecommendNewCoinEntity> f25927V = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<RecommendNewCoinEntity> m29727n() {
        return this.f25927V;
    }

    /* JADX INFO: renamed from: o */
    public final void m29728o() {
        ExtensionKt.m32184j(this, new NewCoinCardVM$registerWsData$1(this, null));
    }
}
