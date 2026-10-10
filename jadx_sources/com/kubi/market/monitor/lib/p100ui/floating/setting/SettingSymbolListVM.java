package com.kubi.market.monitor.lib.p100ui.floating.setting;

import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.market.monitor.lib.p100ui.floating.window.FloatingActionManager;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.MVIStatus;
import com.kubi.mvi.state.StatusVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SettingSymbolListVM.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u0014\u0010\u0015\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListVM;", "Lcom/kubi/mvi/state/StatusVM;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "<init>", "()V", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSortIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/SortIntent;", "handleTopSymbolIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/TopSymbolIntent;", "handleRemoveSymbolIntent", "Lcom/kubi/market/monitor/lib/ui/floating/setting/RemoveSymbolIntent;", "handleOnShowIntent", "updateList", "getTradeList", "", "Lcom/kubi/data/entity/TradeItemBean;", "initStatusState", "getInitStatusState", "()Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSettingSymbolListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingSymbolListVM.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListVM\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n106#2,2:109\n106#2,2:111\n473#3,4:113\n473#3,4:117\n473#3,4:121\n1563#4:125\n1634#4,3:126\n1563#4:129\n1634#4,3:130\n*S KotlinDebug\n*F\n+ 1 SettingSymbolListVM.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListVM\n*L\n19#1:109,2\n23#1:111,2\n33#1:113,4\n35#1:117,4\n37#1:121,4\n46#1:125\n46#1:126,3\n100#1:129\n100#1:130,3\n*E\n"})
public final class SettingSymbolListVM extends StatusVM<UIState> {

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.SettingSymbolListVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: SettingSymbolListVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.SettingSymbolListVM", m90122f = "SettingSymbolListVM.kt", m90123i = {0}, m90124l = {32}, m90125m = "dispatchIntent", m90126n = {"intent"}, m90127s = {"L$0"})
    public static final class C186501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C186501(Continuation<? super C186501> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingSymbolListVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m40883C(TopSymbolIntent topSymbolIntent, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it, topSymbolIntent.getSymbol());
    }

    /* JADX INFO: renamed from: E */
    public static final UIState m40884E(List list, UIState updateStateData) {
        Intrinsics.checkNotNullParameter(updateStateData, "$this$updateStateData");
        return UIState.copy$default(updateStateData, false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, list, null, 786431, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.SingleThreadVM, com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C186501 c186501;
        if (continuation instanceof C186501) {
            c186501 = (C186501) continuation;
            int i11 = c186501.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c186501.label = i11 - Integer.MIN_VALUE;
            } else {
                c186501 = new C186501(continuation);
            }
        } else {
            c186501 = new C186501(continuation);
        }
        Object obj = c186501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c186501.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c186501.L$0 = interfaceC19282d;
            c186501.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c186501) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC19282d = (InterfaceC19282d) c186501.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (interfaceC19282d instanceof TopSymbolIntent) {
            m40888B((TopSymbolIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof RemoveSymbolIntent) {
            m40893z((RemoveSymbolIntent) interfaceC19282d);
        }
        if (interfaceC19282d instanceof SortIntent) {
            m40887A((SortIntent) interfaceC19282d);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.StatusVM
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public UIState mo40890t() {
        return new UIState(false, null, 0, 0, null, null, false, null, null, null, false, null, null, 0, false, false, false, false, null, null, 1048575, null);
    }

    /* JADX INFO: renamed from: y */
    public final List<TradeItemBean> m40892y() {
        List<String> listM40732i = FloatingWindowConfigManager.f34272a.m40732i();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM40732i, 10));
        Iterator<T> it = listM40732i.iterator();
        while (it.hasNext()) {
            arrayList.add(new TradeItemBean((String) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final void m40893z(RemoveSymbolIntent removeSymbolIntent) throws Throwable {
        FloatingWindowConfigManager.f34272a.m40740q(removeSymbolIntent.getSymbol());
        m40889D();
    }

    public SettingSymbolListVM() {
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "remove_symbol".length();
        }
        C12572a.m23693b(viewModelScope, new SettingSymbolListVM$special$$inlined$bindFlowEvent$1("remove_symbol", null, this));
        InterfaceC41709m0 viewModelScope2 = ViewModelKt.getViewModelScope(this);
        if (c12573b.m23696a()) {
            "top_symbol".length();
        }
        C12572a.m23693b(viewModelScope2, new SettingSymbolListVM$special$$inlined$bindFlowEvent$2("top_symbol", null, this));
    }

    /* JADX INFO: renamed from: A */
    public final void m40887A(SortIntent sortIntent) throws Throwable {
        List<TradeItemBean> list = sortIntent.getList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeItemBean) it.next()).getSymbol());
        }
        FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
        floatingWindowConfigManager.m40743u(arrayList);
        floatingWindowConfigManager.m40744v(arrayList);
        m40889D();
        FloatingActionManager.f34540a.m41374n1();
    }

    /* JADX INFO: renamed from: B */
    public final void m40888B(final TopSymbolIntent topSymbolIntent) throws Throwable {
        String symbol = topSymbolIntent.getSymbol();
        FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
        if (Intrinsics.areEqual(symbol, CollectionsKt.firstOrNull((List) floatingWindowConfigManager.m40732i()))) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) floatingWindowConfigManager.m40732i());
        CollectionsKt.removeAll(mutableList, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.m1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SettingSymbolListVM.m40883C(topSymbolIntent, (String) obj));
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(topSymbolIntent.getSymbol());
        arrayList.addAll(mutableList);
        floatingWindowConfigManager.m40743u(arrayList);
        floatingWindowConfigManager.m40744v(arrayList);
        m40889D();
        FloatingActionManager.f34540a.m41374n1();
    }

    /* JADX INFO: renamed from: D */
    public final void m40889D() {
        final List<TradeItemBean> listM40892y = m40892y();
        m42645u(MVIStatus.INSTANCE.empty(listM40892y.isEmpty()), new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingSymbolListVM.m40884E(listM40892y, (UIState) obj);
            }
        });
    }

    @Override // com.kubi.mvi.state.SingleThreadVM
    /* JADX INFO: renamed from: p */
    public void mo40864p() {
        m40889D();
    }
}
