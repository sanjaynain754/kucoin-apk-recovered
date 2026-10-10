package p20;

import com.kubi.spot.helper.TradeManager;
import com.kubi.spot.tradeLogic.b;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p20.a */
/* JADX INFO: compiled from: TradeEnvImp.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/spot/business/environment/TradeEnvImp;", "Lcom/kubi/spot/tradeLogic/ITradeEnvProvider;", "<init>", "()V", "hasLogin", "", "hasTradePwd", "isSystemMaintenance", "symbol", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43365a implements b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43365a f95766a = new C43365a();

    /* JADX INFO: renamed from: a */
    public boolean m95532a() {
        return IUserService.a.get().d0().isWithDrawPassword();
    }

    /* JADX INFO: renamed from: g */
    public boolean m95533g(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return TradeManager.f50593a.m61840o(symbol);
    }
}
