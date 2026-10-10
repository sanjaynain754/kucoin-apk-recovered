package com.kubi.home.service;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.home.api.IHomeService;
import com.kubi.home.api.entity.HomeQuickAccessEntity;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.home.common.ReferralHelper;
import com.kubi.home.main.C14614f;
import com.kubi.home.main.HomeFragment;
import com.kubi.home.navigation.HomeNavigationPayDialogHelper;
import com.kubi.home.rank.impl.cache.RankCoinHelper;
import com.kubi.home.v2.HomeFragmentV2;
import com.kubi.home.v2.biz.grid.utils.GridNaviDataProvider;
import com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity;
import com.kubi.sdk.BaseFragment;
import dj.C36717b;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p502oj.C43099d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0018J\b\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0002\u0010!¨\u0006\""}, m90084d2 = {"Lcom/kubi/home/service/HomeService;", "Lcom/kubi/home/api/IHomeService;", "<init>", "()V", "getCustomerService", "", "getUserLevelChange", "", "adjustHost", "host", "createHomeFragment", "Lcom/kubi/sdk/BaseFragment;", "getCoinIconUrl", FirebaseAnalytics.Param.CURRENCY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeCardsABType", "", "()Ljava/lang/Integer;", "switchDrawerEventKey", "isUseHomeV2", "getAllNavigations", "", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "useCache", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeShowNavigations", "Lcom/kubi/home/api/entity/HomeQuickAccessEntity;", "tryHideKoCoinPayPopup", "", "saveHomeShowNavigations", "ids", "userCustomVersion", "", "(Ljava/util/List;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeService implements IHomeService {
    @Override // com.kubi.home.api.IHomeService
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo28945a(@NotNull List<String> list, @Nullable Long l11, @NotNull Continuation<? super Boolean> continuation) {
        return GridNaviDataProvider.f26418a.m30649k(list, l11, continuation);
    }

    @Override // com.kubi.home.api.IHomeService
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo28947c(boolean z11, @NotNull Continuation<? super HomeQuickAccessEntity> continuation) {
        return GridNaviDataProvider.f26418a.m30647g(z11, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.home.api.IHomeService
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo28948d(@NotNull String str, @NotNull Continuation<? super String> continuation) throws Throwable {
        HomeService$getCoinIconUrl$1 homeService$getCoinIconUrl$1;
        if (continuation instanceof HomeService$getCoinIconUrl$1) {
            homeService$getCoinIconUrl$1 = (HomeService$getCoinIconUrl$1) continuation;
            int i11 = homeService$getCoinIconUrl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeService$getCoinIconUrl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeService$getCoinIconUrl$1 = new HomeService$getCoinIconUrl$1(this, continuation);
            }
        } else {
            homeService$getCoinIconUrl$1 = new HomeService$getCoinIconUrl$1(this, continuation);
        }
        Object objM29942f = homeService$getCoinIconUrl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeService$getCoinIconUrl$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM29942f);
            RankCoinHelper rankCoinHelper = RankCoinHelper.f26031a;
            homeService$getCoinIconUrl$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            homeService$getCoinIconUrl$1.label = 1;
            objM29942f = rankCoinHelper.m29942f(str, homeService$getCoinIconUrl$1);
            if (objM29942f == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM29942f);
        }
        RankCoinEntity rankCoinEntity = (RankCoinEntity) objM29942f;
        if (rankCoinEntity != null) {
            return rankCoinEntity.getIconUrl();
        }
        return null;
    }

    @Override // com.kubi.home.api.IHomeService
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo28949e(boolean z11, @NotNull Continuation<? super List<QuickAccessEntity>> continuation) {
        return GridNaviDataProvider.f26418a.m30646f(z11, continuation);
    }

    @Override // com.kubi.home.api.IHomeService
    @NotNull
    /* JADX INFO: renamed from: f */
    public BaseFragment mo28950f() {
        return C43099d.f95299a.m94706c() ? HomeFragmentV2.f26336f0.newInstance() : HomeFragment.f25712f0.newInstance();
    }

    @Override // com.kubi.home.api.IHomeService
    /* JADX INFO: renamed from: g */
    public void mo28951g() {
        HomeNavigationPayDialogHelper.f25899a.m29698c();
    }

    @Override // com.kubi.home.api.IHomeService
    /* JADX INFO: renamed from: h */
    public boolean mo28952h() {
        return C43099d.f95299a.m94706c();
    }

    @Override // com.kubi.home.api.IHomeService
    @NotNull
    /* JADX INFO: renamed from: i */
    public String mo28953i(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return ReferralHelper.f25587a.adjustHost(host);
    }

    @Override // com.kubi.home.api.IHomeService
    @NotNull
    /* JADX INFO: renamed from: k */
    public String mo28955k() {
        return "com.kubi.home.event.HomeEvent:switchDrawer";
    }

    @Override // com.kubi.home.api.IHomeService
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo28946b() {
        return C14614f.m29399b();
    }

    @Override // com.kubi.home.api.IHomeService
    @Nullable
    /* JADX INFO: renamed from: j */
    public Integer mo28954j() {
        return C36717b.m82248a();
    }
}
