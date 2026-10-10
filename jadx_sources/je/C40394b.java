package je;

import com.kubi.core.spot.entity.callAuction.CallAuctionConfigEntity;
import com.kubi.core.spot.entity.callAuction.CallAuctionEstimateInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: je.b */
/* JADX INFO: compiled from: CallAuctionRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/spot/business/callAuction/api/CallAuctionRepository;", "", "<init>", "()V", "api", "Lcom/kubi/core/spot/business/callAuction/api/ICallAuctionApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/core/spot/business/callAuction/api/ICallAuctionApi;", "api$delegate", "Lkotlin/Lazy;", "requestGetConfig", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/core/spot/entity/callAuction/CallAuctionConfigEntity;", "symbol", "", "requestCallAuctionInfo", "Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;", "getPreviewInfo", "Lcom/kubi/data/entity/SymbolPreviewEntity;", "baseCurrency", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40394b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f89706a = LazyKt.lazy(new Function0() { // from class: je.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40394b.m89015b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final InterfaceC40395c m89016c() {
        return (InterfaceC40395c) this.f89706a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<SymbolPreviewEntity> m89017d(@NotNull String symbol, @NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        InterfaceC40395c interfaceC40395cM89016c = m89016c();
        String string = MultiLanguageManager.f46811g.getLocale().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return interfaceC40395cM89016c.m89022d(symbol, baseCurrency, string);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41634e<CallAuctionEstimateInfoEntity> m89018e(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m89016c().m89021b(symbol);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC41634e<CallAuctionConfigEntity> m89019f(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m89016c().m89020a(symbol);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC40395c m89015b() {
        return (InterfaceC40395c) C42597a.m93387c().create(InterfaceC40395c.class);
    }
}
