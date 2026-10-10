package com.kubi.assets.unify;

import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.entity.UnifiedAssetsEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.UnifiedMarginCurrencySettingEntity;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27024b;
import io.reactivex.disposables.CompositeDisposable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;

/* JADX INFO: compiled from: AssetUnifiedViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0018H\u0002J\u0012\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\u0014\u0010&\u001a\u00020\u00152\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010)\u001a\u00020\u0011H\u0002J&\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0018H\u0002R\u0014\u0010\u0006\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;", "unifiedApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getUnifiedApi$AssetsCenterLib_googleRelease", "()Lcom/kubi/assets/AssetV2Api;", "unifiedApi$delegate", "Lkotlin/Lazy;", "fetchUnifyOverviewJob", "Lkotlinx/coroutines/Job;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "onCleared", "", "filterDebtCondition", "isManual", "", "checked", "dispatchIntentOnIO", "intent", "(Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateHideNumberState", "isHide", "fetchUnifiedOverviewInfo", "baseCurrency", "", "fetchUnifiedPnlOverviewInfo", "fetchUnifyAssetsList", "fetchMarginCurrencySetting", "isMarginFeatureAvailable", "updateMarginCurrencyState", "setting", "Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;", "fetchProducts", "getFilterAssetListData", "", "Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "keyWord", "isHideSmallAsset", "isShowInDebt", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetUnifiedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetUnifiedViewModel.kt\ncom/kubi/assets/unify/AssetUnifiedViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n126#2,2:272\n126#2,2:274\n126#2,2:276\n774#3:278\n865#3,2:279\n*S KotlinDebug\n*F\n+ 1 AssetUnifiedViewModel.kt\ncom/kubi/assets/unify/AssetUnifiedViewModel\n*L\n55#1:272,2\n125#1:274,2\n156#1:276,2\n253#1:278\n253#1:279,2\n*E\n"})
public final class AssetUnifiedViewModel extends BaseStateVM<AssetUnifiedContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: W */
    @Nullable
    public InterfaceC41775x1 f18933W;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18932V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.unify.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetUnifiedViewModel.m19680I();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final CompositeDisposable f18934X = new CompositeDisposable();

    /* JADX INFO: renamed from: D */
    public static final UIState m19679D(AssetUnifiedViewModel assetUnifiedViewModel, List list, boolean z11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, list, false, z11, assetUnifiedViewModel.getState().getUiHideSmallSwitch(), null, null, null, null, assetUnifiedViewModel.getState().getFilterKeywords(), null, 1509, null);
    }

    /* JADX INFO: renamed from: K */
    public static final UIState m19681K(boolean z11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, z11, false, false, null, null, null, null, null, null, 2043, null);
    }

    /* JADX INFO: renamed from: M */
    public static final UIState m19682M(UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, false, false, false, null, null, UnifyMarginCurrencyHelper.f19058a.m19896d(unifiedMarginCurrencySettingEntity), unifiedMarginCurrencySettingEntity, null, null, 1663, null);
    }

    /* JADX INFO: renamed from: w */
    public static final UIState m19691w(AssetUnifiedContract$UiIntent assetUnifiedContract$UiIntent, List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        AssetUnifiedContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetUnifiedContract$UiIntent.HideSmallOrFilter) assetUnifiedContract$UiIntent;
        return UIState.copy$default(updateState, null, list, false, false, hideSmallOrFilter.getChecked(), null, null, null, null, hideSmallOrFilter.getKeyword(), null, 1517, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m19694C(boolean z11, final boolean z12) {
        if (z11) {
            C46392a.m102328k(C42153h.f93593a.m92505I(), z12);
        }
        final List<UnifiedAssetsEntity> listM19695E = m19695E(getState().getFilterKeywords(), getState().getUiHideSmallSwitch(), z12);
        updateState(new Function1() { // from class: com.kubi.assets.unify.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetUnifiedViewModel.m19679D(this.f19026b, listM19695E, z12, (UIState) obj);
            }
        });
        ArrayList<UnifiedAssetsEntity> originAssetsSourceList = getState().getOriginAssetsSourceList();
        if (originAssetsSourceList == null || originAssetsSourceList.isEmpty()) {
            return;
        }
        sendSingleEvent(SingleEvent.C19247c.f35626b);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, false, false, null, null, null, null, null, null, 2047, null);
    }

    /* JADX INFO: renamed from: G */
    public final AssetV2Api m19697G() {
        return (AssetV2Api) this.f18932V.getValue();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m19698H() {
        return UnifyCustomMarginEntrance.f19056a.m19890a(IUnifyAccountService.f53155a.get().mo64979C(), AssetRemoteConfig.f18903a.m19578u());
    }

    /* JADX INFO: renamed from: J */
    public final void m19699J(final boolean z11) {
        C46392a.m102328k(C42153h.f93593a.m92500D(), z11);
        updateState(new Function1() { // from class: com.kubi.assets.unify.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetUnifiedViewModel.m19681K(z11, (UIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final void m19700L(final UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity) {
        updateState(new Function1() { // from class: com.kubi.assets.unify.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetUnifiedViewModel.m19682M(unifiedMarginCurrencySettingEntity, (UIState) obj);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object dispatchIntentOnIO(@NotNull final AssetUnifiedContract$UiIntent assetUnifiedContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        if (assetUnifiedContract$UiIntent instanceof AssetUnifiedContract$UiIntent.FetchUnifiedOverviewData) {
            m19704z(((AssetUnifiedContract$UiIntent.FetchUnifiedOverviewData) assetUnifiedContract$UiIntent).getBaseCurrency());
        } else if (assetUnifiedContract$UiIntent instanceof AssetUnifiedContract$UiIntent.FetchUnifiedPnlOverview) {
            m19692A();
        } else if (assetUnifiedContract$UiIntent instanceof AssetUnifiedContract$UiIntent.FetchAssetsList) {
            m19693B();
        } else if (assetUnifiedContract$UiIntent instanceof AssetUnifiedContract$UiIntent.FetchMarginCurrencyList) {
            if (m19698H()) {
                m19702x();
            } else {
                m19700L(null);
                Unit unit = Unit.INSTANCE;
            }
        } else if (assetUnifiedContract$UiIntent instanceof AssetUnifiedContract$UiIntent.FetchProducts) {
            m19703y();
        } else if (assetUnifiedContract$UiIntent instanceof AssetUnifiedContract$UiIntent.HideOrShowNumber) {
            m19699J(((AssetUnifiedContract$UiIntent.HideOrShowNumber) assetUnifiedContract$UiIntent).getIsChecked());
            Unit unit2 = Unit.INSTANCE;
        } else if (assetUnifiedContract$UiIntent instanceof AssetUnifiedContract$UiIntent.ShowInDebt) {
            AssetUnifiedContract$UiIntent.ShowInDebt showInDebt = (AssetUnifiedContract$UiIntent.ShowInDebt) assetUnifiedContract$UiIntent;
            m19694C(showInDebt.getIsManual(), showInDebt.getChecked());
            Unit unit3 = Unit.INSTANCE;
        } else {
            if (!(assetUnifiedContract$UiIntent instanceof AssetUnifiedContract$UiIntent.HideSmallOrFilter)) {
                throw new NoWhenBranchMatchedException();
            }
            AssetUnifiedContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetUnifiedContract$UiIntent.HideSmallOrFilter) assetUnifiedContract$UiIntent;
            if (hideSmallOrFilter.getIsManual()) {
                C46392a.m102328k(C42153h.f93593a.m92504H(), hideSmallOrFilter.getChecked());
            }
            final List<UnifiedAssetsEntity> listM19695E = m19695E(hideSmallOrFilter.getKeyword(), hideSmallOrFilter.getChecked(), getState().getIsShowInDebt());
            updateState(new Function1() { // from class: com.kubi.assets.unify.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetUnifiedViewModel.m19691w(assetUnifiedContract$UiIntent, listM19695E, (UIState) obj);
                }
            });
            ArrayList<UnifiedAssetsEntity> originAssetsSourceList = getState().getOriginAssetsSourceList();
            if (originAssetsSourceList != null && !originAssetsSourceList.isEmpty()) {
                sendSingleEvent(SingleEvent.C19247c.f35626b);
            }
            Unit unit4 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final AssetV2Api m19680I() {
        return (AssetV2Api) C42597a.m93388d().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC41775x1 m19692A() {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AssetUnifiedViewModel$fetchUnifiedPnlOverviewInfo$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC41775x1 m19693B() {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AssetUnifiedViewModel$fetchUnifyAssetsList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: E */
    public final List<UnifiedAssetsEntity> m19695E(String str, boolean z11, boolean z12) {
        List listM66558a;
        String currency;
        boolean z13;
        String baseCurrency;
        ArrayList<UnifiedAssetsEntity> originAssetsSourceList = getState().getOriginAssetsSourceList();
        if (originAssetsSourceList != null && (listM66558a = C27024b.m66558a(originAssetsSourceList)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM66558a) {
                UnifiedAssetsEntity unifiedAssetsEntity = (UnifiedAssetsEntity) obj;
                CoinInfoEntity coinEntity = unifiedAssetsEntity.getCoinEntity();
                BigDecimal quotaLimit = null;
                if (coinEntity != null) {
                    currency = coinEntity.getCurrency();
                } else {
                    currency = null;
                }
                if (currency == null) {
                    currency = "";
                }
                boolean z14 = true;
                boolean zContains = StringsKt.contains((CharSequence) currency, (CharSequence) str, true);
                if (z12 && !unifiedAssetsEntity.isLiabilityVisible()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z11) {
                    BigDecimal bigDecimalM89922G = C41014a.m89922G(unifiedAssetsEntity.getEquity(), null, 1, null);
                    String currency2 = unifiedAssetsEntity.getCurrency();
                    AssetsHelper assetsHelper = AssetsHelper.f18684a;
                    SmallEntity smallEntityM19164h = assetsHelper.m19164h();
                    if (smallEntityM19164h != null) {
                        baseCurrency = smallEntityM19164h.getBaseCurrency();
                    } else {
                        baseCurrency = null;
                    }
                    BigDecimal bigDecimalM89916A = C41014a.m89916A(bigDecimalM89922G, currency2, baseCurrency);
                    SmallEntity smallEntityM19164h2 = assetsHelper.m19164h();
                    if (smallEntityM19164h2 != null) {
                        quotaLimit = smallEntityM19164h2.getQuotaLimit();
                    }
                    if (bigDecimalM89916A.compareTo(quotaLimit) < 0) {
                        z14 = false;
                    }
                }
                if (zContains && z13 && z14) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC41775x1 interfaceC41775x1 = this.f18933W;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f18934X.clear();
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC41775x1 m19702x() {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AssetUnifiedViewModel$fetchMarginCurrencySetting$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: y */
    public final InterfaceC41775x1 m19703y() {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AssetUnifiedViewModel$fetchProducts$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC41775x1 m19704z(String str) {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1(str, this, null), 3, null);
    }
}
