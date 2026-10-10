package com.kubi.tradingbotkit.business.asset;

import com.kubi.tradingbotkit.entity.asset.AssetsTotalEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import m40.InterfaceC42425a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BotAssetsRepository.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsRepository;", "", "<init>", "()V", "api", "Lcom/kubi/tradingbotkit/business/asset/api/IBotAssetsApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/tradingbotkit/business/asset/api/IBotAssetsApi;", "api$delegate", "Lkotlin/Lazy;", "requestAssetTotal", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/tradingbotkit/entity/asset/AssetsTotalEntity;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BotAssetsRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f52244a = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.asset.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BotAssetsRepository.m63786b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final InterfaceC42425a m63787c() {
        return (InterfaceC42425a) this.f52244a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC42425a m63786b() {
        return (InterfaceC42425a) C42597a.m93387c().create(InterfaceC42425a.class);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<AssetsTotalEntity> m63788d() {
        return m63787c().m93129a();
    }
}
