package p827zc;

import ad.InterfaceC0239a;
import cd.InterfaceC4934a;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.submit.SubmitOrderConfig;
import gd.InterfaceC37868a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zc.c */
/* JADX INFO: compiled from: ITradeCoreDataRepoProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "", "<init>", "()V", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "getTradeAccountType", "()Lcom/kubi/core/base/TradeAccountType;", "isMargin", "", "()Z", "settingsRepo", "Lcom/kubi/core/base/setting/ITradeSettingsRepo;", "getSettingsRepo", "()Lcom/kubi/core/base/setting/ITradeSettingsRepo;", "orderRepo", "Lcom/kubi/core/base/order/ITradeOrderDataRepo;", "getOrderRepo", "()Lcom/kubi/core/base/order/ITradeOrderDataRepo;", "balanceRepo", "Lcom/kubi/core/base/balance/ITradeBalanceDataRepo;", "getBalanceRepo", "()Lcom/kubi/core/base/balance/ITradeBalanceDataRepo;", "orderConfig", "Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "getOrderConfig", "()Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "routerPageOperator", "Lcom/kubi/core/base/assets/IBizRouterOperator;", "getRouterPageOperator", "()Lcom/kubi/core/base/assets/IBizRouterOperator;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC46753c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract SubmitOrderConfig mo96892a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract InterfaceC4934a mo96893b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract InterfaceC0239a mo96894c();

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract InterfaceC37868a mo96895d();

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract TradeAccountType mo96896e();

    /* JADX INFO: renamed from: f */
    public final boolean m103015f() {
        return Intrinsics.areEqual(mo96896e(), TradeAccountType.Margin.INSTANCE);
    }
}
