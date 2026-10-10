package h40;

import com.kubi.tradingbotkit.entity.GridTradingItemEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: h40.b */
/* JADX INFO: compiled from: GridTradingRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/aggregation/GridTradingRepository;", "", "<init>", "()V", "gridTradingApi", "Lcom/kubi/tradingbotkit/business/aggregation/IGridTradingApi;", "kotlin.jvm.PlatformType", "getGridTradingApi", "()Lcom/kubi/tradingbotkit/business/aggregation/IGridTradingApi;", "gridTradingApi$delegate", "Lkotlin/Lazy;", "requestGridTradingList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/tradingbotkit/entity/GridTradingItemEntity;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38109b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f85777a = LazyKt.lazy(new Function0() { // from class: h40.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38109b.m86039c();
        }
    });

    /* JADX INFO: renamed from: b */
    public final InterfaceC38110c m86040b() {
        return (InterfaceC38110c) this.f85777a.getValue();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC38110c m86039c() {
        return (InterfaceC38110c) C42597a.m93387c().create(InterfaceC38110c.class);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<List<GridTradingItemEntity>> m86041d() {
        return m86040b().m86042a();
    }
}
