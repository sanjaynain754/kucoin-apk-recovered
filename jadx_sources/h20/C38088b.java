package h20;

import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.entity.callAuction.CallAuctionConfigEntity;
import com.kubi.spot.entity.callAuction.CallAuctionEstimateInfoEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: h20.b */
/* JADX INFO: compiled from: CallAuctionRepository.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/api/CallAuctionRepository;", "", "<init>", "()V", "api", "Lcom/kubi/spot/business/callAuction/api/ICallAuctionApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/business/callAuction/api/ICallAuctionApi;", "api$delegate", "Lkotlin/Lazy;", "requestGetConfig", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/entity/callAuction/CallAuctionConfigEntity;", "symbol", "", "requestCallAuctionInfo", "Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;", "getPreviewInfo", "Lcom/kubi/data/entity/SymbolPreviewEntity;", "baseCurrency", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38088b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f85736a = LazyKt.lazy(new Function0() { // from class: h20.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38088b.m85988b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final InterfaceC38089c m85989c() {
        return (InterfaceC38089c) this.f85736a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<SymbolPreviewEntity> m85990d(@NotNull String symbol, @NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        InterfaceC38089c interfaceC38089cM85989c = m85989c();
        String string = MultiLanguageManager.f46811g.getLocale().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return interfaceC38089cM85989c.m85995d(symbol, baseCurrency, string);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41634e<CallAuctionEstimateInfoEntity> m85991e(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m85989c().m85994b(symbol);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC41634e<CallAuctionConfigEntity> m85992f(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m85989c().m85993a(symbol);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC38089c m85988b() {
        return (InterfaceC38089c) C42597a.m93387c().create(InterfaceC38089c.class);
    }
}
