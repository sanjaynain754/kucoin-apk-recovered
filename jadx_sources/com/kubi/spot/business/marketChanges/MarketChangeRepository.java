package com.kubi.spot.business.marketChanges;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.spot.business.discover.entity.MarketChangesItemEntity;
import com.kubi.spot.business.discover.entity.MarketChangesRequestEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import q20.InterfaceC43594a;

/* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketChangeRepository.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u0014R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/business/marketChanges/MarketChangeRepository;", "", "<init>", "()V", "api", "Lcom/kubi/spot/business/marketChanges/api/IMarketChangeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/business/marketChanges/api/IMarketChangeApi;", "api$delegate", "Lkotlin/Lazy;", "getMarketChangeData", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;", TtmlNode.TAG_BODY, "Lcom/kubi/spot/business/discover/entity/MarketChangesRequestEntity;", "getSymbolSupport", "", "symbol", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketChangeRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f50255a = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.marketChanges.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketChangeRepository.m61222b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final InterfaceC43594a m61223c() {
        return (InterfaceC43594a) this.f50255a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<List<MarketChangesItemEntity>> m61224d(@NotNull MarketChangesRequestEntity body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return m61223c().m95949b(body);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41634e<Boolean> m61225e(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m61223c().m95948a(symbol);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC43594a m61222b() {
        return (InterfaceC43594a) C42597a.m93387c().create(InterfaceC43594a.class);
    }
}
