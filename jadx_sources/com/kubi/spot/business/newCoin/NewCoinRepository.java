package com.kubi.spot.business.newCoin;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.spot.business.newCoin.entity.NewCoinActivityEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import s20.InterfaceC44275a;

/* JADX INFO: renamed from: com.kubi.spot.business.newCoin.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NewCoinRepository.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/spot/business/newCoin/NewCoinRepository;", "", "<init>", "()V", "api", "Lcom/kubi/spot/business/newCoin/api/INewCoinApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/business/newCoin/api/INewCoinApi;", "api$delegate", "Lkotlin/Lazy;", "getNewCoinCanReserve", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/business/newCoin/entity/NewCoinActivityEntity;", FirebaseAnalytics.Param.CURRENCY, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NewCoinRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f50282a = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.newCoin.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewCoinRepository.m61284b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final InterfaceC44275a m61285c() {
        return (InterfaceC44275a) this.f50282a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<NewCoinActivityEntity> m61286d(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return m61285c().m97690a(currency);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC44275a m61284b() {
        return (InterfaceC44275a) C42597a.m93387c().create(InterfaceC44275a.class);
    }
}
