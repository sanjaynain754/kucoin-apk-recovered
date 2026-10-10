package com.kubi.unify.stream;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.unify.entity.UnifyBalanceEntity;
import com.kubi.unify.entity.UnifyCurrencyLeverageWsEntity;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.unify.stream.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IUnifyNetworkDataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0003H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0003H&J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0010\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u0005H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H&J\u001c\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00040\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/stream/IUnifyNetworkDataSource;", "", "observeIndexPrices", "Lkotlinx/coroutines/flow/Flow;", "", "", "observePositions", "", "Lcom/kubi/unify/entity/UnifyPositionEntity;", "observeFundsInfo", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "observeEquity", "observeFuturesLeverageData", "observerAccountChanged", "observeAvailableBalance", "Lcom/kubi/unify/entity/UnifyBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "observeOverViewData", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "observeMarginCurrencyLeverage", "Lcom/kubi/unify/entity/UnifyCurrencyLeverageWsEntity;", "observeMarginMode", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IUnifyNetworkDataSource {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<String> mo65372a();

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<Map<String, String>> mo65373b();

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<UnifyAccountOverviewEntity> mo65374c();

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<Map<String, MarginModeInfoEntity>> mo65375d();

    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<List<UnifyFundsInfoEntity>> mo65376e();

    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<List<UnifyPositionEntity>> mo65377f();

    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<Map<String, String>> mo65378g();

    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC41634e<UnifyBalanceEntity> mo65379h(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<UnifyCurrencyLeverageWsEntity> mo65380i();
}
