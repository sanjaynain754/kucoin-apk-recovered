package com.kubi.spot.business.delegation;

import id.C38519a;
import k20.InterfaceC40871a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.j1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeFundsListViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/TradeFundsRepo;", "Lcom/kubi/spot/business/delegation/ITradeFundsRepo;", "<init>", "()V", "assetsV2Api", "Lcom/kubi/spot/business/delegation/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetsV2Api", "()Lcom/kubi/spot/business/delegation/assets/AssetV2Api;", "assetsV2Api$delegate", "Lkotlin/Lazy;", "getAssetsApi", "isHideSmallFunds", "", "setHideSmallFunds", "", "isHide", "getFundsSortRule", "", "setSortBy", "type", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeFundsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsRepo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,434:1\n136#2:435\n126#2,2:436\n67#2:438\n58#2,2:439\n*S KotlinDebug\n*F\n+ 1 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsRepo\n*L\n374#1:435\n378#1:436,2\n382#1:438\n386#1:439,2\n*E\n"})
public final class TradeFundsRepo implements ITradeFundsRepo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f50073a = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.i1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFundsRepo.m60966g();
        }
    });

    @Override // com.kubi.spot.business.delegation.ITradeFundsRepo
    /* JADX INFO: renamed from: a */
    public int mo60960a() {
        return C46392a.m102323e(C38519a.f86479a.m87141p(), 0);
    }

    @Override // com.kubi.spot.business.delegation.ITradeFundsRepo
    /* JADX INFO: renamed from: b */
    public void mo60961b(boolean z11) {
        C46392a.m102328k(C38519a.f86479a.m87140o(), z11);
    }

    @Override // com.kubi.spot.business.delegation.ITradeFundsRepo
    /* JADX INFO: renamed from: d */
    public boolean mo60963d() {
        return C46392a.m102322d(C38519a.f86479a.m87140o(), false);
    }

    @Override // com.kubi.spot.business.delegation.ITradeFundsRepo
    /* JADX INFO: renamed from: e */
    public void mo60964e(int i11) {
        C46392a.m102329l(C38519a.f86479a.m87141p(), i11);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC40871a m60967h() {
        return (InterfaceC40871a) this.f50073a.getValue();
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC40871a m60966g() {
        return (InterfaceC40871a) C42597a.m93387c().create(InterfaceC40871a.class);
    }

    @Override // com.kubi.spot.business.delegation.ITradeFundsRepo
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC40871a mo60962c() {
        InterfaceC40871a interfaceC40871aM60967h = m60967h();
        Intrinsics.checkNotNullExpressionValue(interfaceC40871aM60967h, "<get-assetsV2Api>(...)");
        return interfaceC40871aM60967h;
    }
}
