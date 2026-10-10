package com.kubi.tradingbotkit.business.strategyList.viewModel;

import androidx.lifecycle.ViewModelKt;
import com.kubi.sdk.BaseViewModel;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.TagItem;
import com.kubi.tradingbotkit.business.strategyList.entity.CurrencyInfo;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import com.kubi.utils.C27017c;
import com.tencent.bugly.proguard.C33616e0;
import e50.InterfaceC37075a;
import i50.UiStates;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import u50.C45125a;
import y70.C46392a;

/* JADX INFO: compiled from: StrategyListViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u0006\u0010+\u001a\u00020)J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002J\u000e\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0010J\u001c\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0015*\n\u0012\u0004\u0012\u000201\u0018\u00010\u0015H\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J\u000e\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\u0003J\u000e\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030 ¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"¨\u00066"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "entryType", "", "<init>", "(Ljava/lang/String;)V", "getEntryType", "()Ljava/lang/String;", "robotSpotApi", "Lcom/kubi/tradingbotkit/business/spot/restful/RobotSpotApi;", "kotlin.jvm.PlatformType", "getRobotSpotApi", "()Lcom/kubi/tradingbotkit/business/spot/restful/RobotSpotApi;", "robotSpotApi$delegate", "Lkotlin/Lazy;", "value", "", "curSelectedStrategyType", "getCurSelectedStrategyType", "()I", C33616e0.f69644s, "", "Lcom/kubi/tradingbotkit/business/strategyList/TagItem;", "getTags", "()Ljava/util/List;", "curSymbol", "pollingJob", "Lkotlinx/coroutines/Job;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/tradingbotkit/business/strategyList/state/UiStates;", "uiStates", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStates", "()Lkotlinx/coroutines/flow/StateFlow;", "_createBtnTips", "createBtnTips", "getCreateBtnTips", "entryFromFutures", "", "startPolling", "", "stopPolling", "fetchStrategyList", "generateUrl", "queryTypes", "filterAndRefresh", "type", "filterCurSymbol", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "setCurrentSymbol", "symbol", "setOnlyShowCurContractOrders", "checked", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStrategyListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n136#2:288\n126#2,2:293\n774#3:289\n865#3:290\n866#3:292\n1#4:291\n*S KotlinDebug\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel\n*L\n246#1:288\n277#1:293,2\n248#1:289\n248#1:290\n248#1:292\n*E\n"})
public final class StrategyListViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f52436X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f52437Y;

    /* JADX INFO: renamed from: Z */
    public int f52438Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final List<TagItem> f52439a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public String f52440b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public InterfaceC41775x1 f52441c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final InterfaceC41669n<UiStates> f52442d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC41678w<UiStates> f52443e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final InterfaceC41669n<String> f52444f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final InterfaceC41678w<String> f52445g0;

    public StrategyListViewModel(@NotNull String entryType) {
        List<TagItem> listListOf;
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        this.f52436X = entryType;
        this.f52437Y = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.strategyList.viewModel.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StrategyListViewModel.m64136G();
            }
        });
        if (m64153v()) {
            C27017c c27017c = C27017c.f54310a;
            listListOf = CollectionsKt.listOf((Object[]) new TagItem[]{new TagItem(c27017c.m66516f(R$string.all, new Object[0]), 0, null, 0, 12, null), new TagItem(c27017c.m66516f(R$string.kc_tb_futures_grid, new Object[0]), 3, null, 0, 12, null), new TagItem(c27017c.m66516f(R$string.kc_tb_futures_cta, new Object[0]), 13, null, 0, 12, null), new TagItem(c27017c.m66516f(R$string.kc_tb_futures_win_two_way, new Object[0]), 9, null, 0, 12, null), new TagItem(c27017c.m66516f(R$string.kc_tb_futures_martin_gale, new Object[0]), 12, null, 0, 12, null)});
        } else {
            C27017c c27017c2 = C27017c.f54310a;
            listListOf = CollectionsKt.listOf((Object[]) new TagItem[]{new TagItem(c27017c2.m66516f(R$string.all, new Object[0]), 0, null, 0, 12, null), new TagItem(c27017c2.m66516f(R$string.kc_tb_spot_grid, new Object[0]), 1, null, 0, 12, null), new TagItem(c27017c2.m66516f(R$string.kc_tb_spot_cta, new Object[0]), 11, null, 0, 12, null), new TagItem(c27017c2.m66516f(R$string.kc_tb_spot_martin_gale, new Object[0]), 7, null, 0, 12, null), new TagItem(c27017c2.m66516f(R$string.kc_tb_spot_positions, new Object[0]), 4, null, 0, 12, null), new TagItem(c27017c2.m66516f(R$string.kc_tb_spot_aip, new Object[0]), 2, null, 0, 12, null), new TagItem(c27017c2.m66516f(R$string.kc_tb_spot_ai, new Object[0]), 8, null, 0, 12, null), new TagItem(c27017c2.m66516f(R$string.kc_tb_spot_infinity, new Object[0]), 5, null, 0, 12, null), new TagItem(c27017c2.m66516f(R$string.kc_tb_margin_grid, new Object[0]), 10, null, 0, 12, null)});
        }
        this.f52439a0 = listListOf;
        InterfaceC41669n<UiStates> interfaceC41669nM91009a = C41679x.m91009a(new UiStates(false, false, null, null, null, 31, null));
        this.f52442d0 = interfaceC41669nM91009a;
        this.f52443e0 = interfaceC41669nM91009a;
        InterfaceC41669n<String> interfaceC41669nM91009a2 = C41679x.m91009a(m64143A());
        this.f52444f0 = interfaceC41669nM91009a2;
        this.f52445g0 = interfaceC41669nM91009a2;
    }

    /* JADX INFO: renamed from: A */
    public final String m64143A() {
        Object next;
        Iterator<T> it = this.f52439a0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TagItem) next).getType() != getF52438Z());
        TagItem tagItem = (TagItem) next;
        if (getF52438Z() != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C27017c.f54310a.m66516f(R$string.kc_tb_grid_create, new Object[0]));
            sb2.append(tagItem != null ? tagItem.getTagName() : null);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb3.append(c27017c.m66516f(R$string.kc_tb_grid_create, new Object[0]));
        sb3.append(c27017c.m66516f(R$string.robot, new Object[0]));
        return sb3.toString();
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getF52438Z() {
        return this.f52438Z;
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getF52436X() {
        return this.f52436X;
    }

    /* JADX INFO: renamed from: D */
    public final InterfaceC37075a m64146D() {
        return (InterfaceC37075a) this.f52437Y.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final List<TagItem> m64147E() {
        return this.f52439a0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final InterfaceC41678w<UiStates> m64148F() {
        return this.f52443e0;
    }

    /* JADX INFO: renamed from: H */
    public final void m64149H(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f52440b0 = symbol;
        m64155x(getF52438Z());
    }

    /* JADX INFO: renamed from: I */
    public final void m64150I(boolean z11) {
        C46392a.m102328k(C45125a.f101543a.m99748c(), z11);
        m64155x(getF52438Z());
    }

    /* JADX INFO: renamed from: J */
    public final void m64151J() {
        InterfaceC41775x1 interfaceC41775x1 = this.f52441c0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f52441c0 = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C26205b.m64158a(), null, new StrategyListViewModel$startPolling$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m64152K() {
        InterfaceC41775x1 interfaceC41775x1 = this.f52441c0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m64153v() {
        return Intrinsics.areEqual(this.f52436X, SearchCategory$Companion.FUTURES);
    }

    /* JADX INFO: renamed from: x */
    public final void m64155x(int i11) {
        this.f52438Z = i11;
        String strM64143A = m64143A();
        this.f52444f0.setValue(strM64143A);
        Map<Integer, List<StrategyItemEntity>> mapM86706g = this.f52442d0.getValue().m86706g();
        List<StrategyItemEntity> listM64156y = m64156y(mapM86706g != null ? mapM86706g.get(Integer.valueOf(getF52438Z())) : null);
        if (listM64156y == null || listM64156y.isEmpty()) {
            InterfaceC41669n<UiStates> interfaceC41669n = this.f52442d0;
            interfaceC41669n.setValue(UiStates.m86700b(interfaceC41669n.getValue(), false, false, null, null, CollectionsKt.listOf(new StrategyItemEntity(strM64143A, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, -99, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -524290, -1, -1, 255, null)), 15, null));
        } else {
            InterfaceC41669n<UiStates> interfaceC41669n2 = this.f52442d0;
            interfaceC41669n2.setValue(UiStates.m86700b(interfaceC41669n2.getValue(), false, false, null, null, listM64156y, 15, null));
        }
    }

    /* JADX INFO: renamed from: y */
    public final List<StrategyItemEntity> m64156y(List<StrategyItemEntity> list) {
        CurrencyInfo currencyInfo;
        Object next;
        if (!C46392a.m102322d(C45125a.f101543a.m99748c(), false)) {
            return list;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            StrategyItemEntity strategyItemEntity = (StrategyItemEntity) obj;
            if (!Intrinsics.areEqual(strategyItemEntity.getSymbol(), this.f52440b0) && !Intrinsics.areEqual(strategyItemEntity.getSymbolCode(), this.f52440b0)) {
                List<CurrencyInfo> currencyInfo2 = strategyItemEntity.getCurrencyInfo();
                if (currencyInfo2 != null) {
                    Iterator<T> it = currencyInfo2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((CurrencyInfo) next).getCurrency() + "-USDT", this.f52440b0));
                    currencyInfo = (CurrencyInfo) next;
                } else {
                    currencyInfo = null;
                }
                if (currencyInfo != null) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final String m64157z(String str) {
        return "v3/robot/task/common/running-list?marketType=" + str;
    }

    /* JADX INFO: renamed from: G */
    public static final InterfaceC37075a m64136G() {
        return (InterfaceC37075a) C42597a.m93388d().create(InterfaceC37075a.class);
    }

    /* JADX INFO: renamed from: w */
    public final void m64154w() {
        List listListOf;
        if (!TradingBotKitDepend.m64273f().c()) {
            return;
        }
        if (m64153v()) {
            listListOf = CollectionsKt.listOf("FUTURES");
        } else {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{"SPOT", "MARGIN"});
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C26205b.m64158a(), null, new StrategyListViewModel$fetchStrategyList$1(this, listListOf, null), 2, null);
    }
}
