package p343ii;

import com.kubi.kumex.data.platform.model.SymbolConfig;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ii.f */
/* JADX INFO: compiled from: FuturesSymbolConfigImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/trade/config/impl/FuturesSymbolConfigImpl;", "Lcom/kubi/futures/trade/config/IFuturesSymbolConfig;", "symbolConfig", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "<init>", "(Lcom/kubi/kumex/data/platform/model/SymbolConfig;)V", "getLeverage", "Ljava/math/BigDecimal;", "isFavorite", "", "getKycLeverage", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38650f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final SymbolConfig f86653a;

    public C38650f(@NotNull SymbolConfig symbolConfig) {
        Intrinsics.checkNotNullParameter(symbolConfig, "symbolConfig");
        this.f86653a = symbolConfig;
    }
}
