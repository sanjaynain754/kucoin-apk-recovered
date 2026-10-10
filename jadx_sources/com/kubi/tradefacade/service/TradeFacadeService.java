package com.kubi.tradefacade.service;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradefacade.RnTradeMainFragment;
import com.kubi.tradefacade.TradeFragment;
import com.kubi.tradefacade.api.ITradeFacadeService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import z30.C46685c;
import z30.C46686d;
import z30.TradeRnRouteTarget;

/* JADX INFO: compiled from: TradeFacadeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradefacade/service/TradeFacadeService;", "Lcom/kubi/tradefacade/api/ITradeFacadeService;", "<init>", "()V", "getTradeFragment", "Lcom/kubi/sdk/BaseFragment;", "handleKlineInMaintenance", "", "tradeFragment", TIMPushProvider.f75062n, "", "isFirstShow", "refresh", "setFirstShow", "syncTradeRoute", "args", "Landroid/os/Bundle;", "getCurrentTradeType", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "isRnMigrationEnabled", "createRnTradeMainFragment", "resolveCurrentIsUta", "()Ljava/lang/Boolean;", "Companion", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeFacadeService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFacadeService.kt\ncom/kubi/tradefacade/service/TradeFacadeService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n808#2,11:99\n774#2:110\n865#2,2:111\n1#3:113\n*S KotlinDebug\n*F\n+ 1 TradeFacadeService.kt\ncom/kubi/tradefacade/service/TradeFacadeService\n*L\n72#1:99,11\n73#1:110\n73#1:111,2\n*E\n"})
public final class TradeFacadeService implements ITradeFacadeService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f51989b = new Companion(null);

    /* JADX INFO: compiled from: TradeFacadeService.kt */
    /* JADX INFO: loaded from: classes50.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradefacade/service/TradeFacadeService$Companion;", "", "<init>", "()V", "EVENT_TRADE_MAIN_NATIVE_ROUTE_CHANGED", "", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.tradefacade.api.ITradeFacadeService
    /* JADX INFO: renamed from: a */
    public boolean mo63585a(@NotNull BaseFragment tradeFragment) {
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        TradeFragment tradeFragment2 = tradeFragment instanceof TradeFragment ? (TradeFragment) tradeFragment : null;
        return C27025c.m66567e(tradeFragment2 != null ? Boolean.valueOf(tradeFragment2.getF51858X()) : null, false);
    }

    @Override // com.kubi.tradefacade.api.ITradeFacadeService
    /* JADX INFO: renamed from: b */
    public int mo63586b(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        List<Fragment> fragments = activity.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof TradeFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((TradeFragment) obj2).isAdded()) {
                arrayList2.add(obj2);
            }
        }
        TradeFragment tradeFragment = (TradeFragment) CollectionsKt.getOrNull(arrayList2, 0);
        return C27039d.m66650j(tradeFragment != null ? tradeFragment.m63571r4() : null);
    }

    @Override // com.kubi.tradefacade.api.ITradeFacadeService
    /* JADX INFO: renamed from: c */
    public void mo63587c(@NotNull BaseFragment tradeFragment) {
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        TradeFragment tradeFragment2 = tradeFragment instanceof TradeFragment ? (TradeFragment) tradeFragment : null;
        if (tradeFragment2 != null) {
            tradeFragment2.m63544B0();
        }
    }

    @Override // com.kubi.tradefacade.api.ITradeFacadeService
    /* JADX INFO: renamed from: d */
    public void mo63588d(@NotNull BaseFragment tradeFragment, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        if (!m63612h() || (tradeFragment instanceof TradeFragment)) {
            return;
        }
        Boolean boolM63613j = m63613j();
        C46686d c46686d = C46686d.f104523a;
        TradeRnRouteTarget tradeRnRouteTargetM102918i = c46686d.m102918i(bundle, boolM63613j);
        tradeFragment.performArguments(c46686d.m102910a(bundle, boolM63613j));
        if (tradeFragment.isAdded()) {
            IReactNativeService.INSTANCE.get().nativeNotifyRn("tradeMainNativeRouteChanged", MapsKt.hashMapOf(TuplesKt.m90091to("route", tradeRnRouteTargetM102918i.m102925d()), TuplesKt.m90091to(ReportDataTable.COLUMN_PARAMS, new HashMap(tradeRnRouteTargetM102918i.m102924c()))));
        }
    }

    @Override // com.kubi.tradefacade.api.ITradeFacadeService
    /* JADX INFO: renamed from: e */
    public void mo63589e(@NotNull BaseFragment tradeFragment, boolean z11) {
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        TradeFragment tradeFragment2 = tradeFragment instanceof TradeFragment ? (TradeFragment) tradeFragment : null;
        if (tradeFragment2 != null) {
            tradeFragment2.m63554e5(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m63612h() {
        return C46685c.f104522a.m102909a();
    }

    @Override // com.kubi.tradefacade.api.ITradeFacadeService
    /* JADX INFO: renamed from: i */
    public void mo63591i(@NotNull BaseFragment tradeFragment, boolean z11) {
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        TradeFragment tradeFragment2 = tradeFragment instanceof TradeFragment ? (TradeFragment) tradeFragment : null;
        if (tradeFragment2 != null) {
            tradeFragment2.m63568q1(z11);
        }
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m63613j() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(IUnifyAccountService.f53155a.get().mo64979C()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (Boolean) objM103844constructorimpl;
    }

    @Override // com.kubi.tradefacade.api.ITradeFacadeService
    @NotNull
    /* JADX INFO: renamed from: f */
    public BaseFragment mo63590f() {
        if (m63612h()) {
            return m63611g();
        }
        return new TradeFragment();
    }

    /* JADX INFO: renamed from: g */
    public final BaseFragment m63611g() {
        Bundle bundleM102910a = C46686d.f104523a.m102910a(null, m63613j());
        bundleM102910a.putBoolean("isEmbedMode", true);
        return RnTradeMainFragment.f51845Z.newInstance(bundleM102910a);
    }
}
