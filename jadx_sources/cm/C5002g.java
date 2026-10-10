package cm;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.trade.model.ComposeUserEntity;
import com.kubi.kumex.utils.Log;
import org.jetbrains.annotations.NotNull;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.g */
/* JADX INFO: compiled from: ComposeUserEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"mapOf", "Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;", "isTrial", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C5002g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ComposeUserEntity m5396a(@NotNull ComposeUserEntity composeUserEntity, boolean z11) {
        Intrinsics.checkNotNullParameter(composeUserEntity, "<this>");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Log.f30813a.m36615a("全仓数据映射", "所有数据都发生变化");
        try {
            com.kubi.futures.model.trade.leverage.a.a.a(composeUserEntity.getLeverageWrapper(), composeUserEntity.getPositionWrapper());
            com.kubi.futures.model.trade.balance.a aVar = com.kubi.futures.model.trade.balance.a.a;
            aVar.i(composeUserEntity.getBalanceWrapper(), composeUserEntity.getPositionWrapper(), composeUserEntity.getIsHedge(), composeUserEntity.m33455e());
            aVar.g(composeUserEntity.getBalanceWrapper(), composeUserEntity.getPositionWrapper());
            com.kubi.futures.model.trade.position.d.a.a(composeUserEntity.getPositionWrapper(), composeUserEntity.getBalanceWrapper(), composeUserEntity.getLeverageWrapper(), RepositoryServiceLocator.f19236a.m20290i().mo99995w(z11), composeUserEntity.getIsHedge(), composeUserEntity.m33455e());
            aVar.e(composeUserEntity.getBalanceWrapper(), composeUserEntity.getPositionWrapper(), composeUserEntity.getLeverageWrapper(), composeUserEntity.getIsHedge(), composeUserEntity.m33455e());
        } catch (Throwable th2) {
            C37214b.m83255a(th2, "CrossComposeMapOf");
        }
        Log.f30813a.m36615a("全仓数据映射", "总耗时：" + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return composeUserEntity;
    }
}
