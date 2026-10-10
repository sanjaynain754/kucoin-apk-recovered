package com.kubi.home.widgets.grid;

import com.kubi.home.api.HomeConst;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.entity.HomeGridNavigationEntity;
import com.kubi.home.entity.MoreIconEntity;
import com.kubi.home.entity.MoreNavigationEntity;
import com.kubi.home.v2.biz.grid.utils.GridItemHeightHelper;
import com.kubi.home.widgets.HomeWidgetRepo;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.sdk.util.StartupTrace;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p502oj.C43101f;
import p502oj.C43103h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNavigationWidgetVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/home/widgets/HomeWidgetRepo;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initState", "getInitState", "()Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNavigationWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationWidgetVM.kt\ncom/kubi/home/widgets/grid/GridNavigationWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,72:1\n473#2,4:73\n*S KotlinDebug\n*F\n+ 1 GridNavigationWidgetVM.kt\ncom/kubi/home/widgets/grid/GridNavigationWidgetVM\n*L\n29#1:73,4\n*E\n"})
public final class GridNavigationWidgetVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final HomeWidgetRepo f26751X = new HomeWidgetRepo();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f26752Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.kubi.home.widgets.grid.GridNavigationWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: GridNavigationWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.widgets.grid.GridNavigationWidgetVM", m90122f = "GridNavigationWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {29}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-GridNavigationWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C151211 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C151211(Continuation<? super C151211> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GridNavigationWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:59:0x016d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final Object m31199o(boolean z11, Continuation<? super Unit> continuation) throws JSONException {
        GridNavigationWidgetVM$loadData$1 gridNavigationWidgetVM$loadData$1;
        long jM94718b;
        Long l11;
        final List<GridNavigationEntity> listM31193a;
        final List list;
        List list2;
        boolean z12 = z11;
        if (continuation instanceof GridNavigationWidgetVM$loadData$1) {
            gridNavigationWidgetVM$loadData$1 = (GridNavigationWidgetVM$loadData$1) continuation;
            int i11 = gridNavigationWidgetVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gridNavigationWidgetVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                gridNavigationWidgetVM$loadData$1 = new GridNavigationWidgetVM$loadData$1(this, continuation);
            }
        } else {
            gridNavigationWidgetVM$loadData$1 = new GridNavigationWidgetVM$loadData$1(this, continuation);
        }
        GridNavigationWidgetVM$loadData$1 gridNavigationWidgetVM$loadData$2 = gridNavigationWidgetVM$loadData$1;
        Object obj = gridNavigationWidgetVM$loadData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gridNavigationWidgetVM$loadData$2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                jM94718b = gridNavigationWidgetVM$loadData$2.J$0;
                z12 = gridNavigationWidgetVM$loadData$2.Z$0;
                l11 = (Long) gridNavigationWidgetVM$loadData$2.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) gridNavigationWidgetVM$loadData$2.L$3;
                ResultKt.throwOnFailure(obj);
            }
            list = list2;
            if (list.size() > 1) {
                updateState(new Function1() { // from class: com.kubi.home.widgets.grid.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GridNavigationWidgetVM.m31201q(list, (UIState) obj2);
                    }
                });
                GridNavigationWidgetPreloader.f26749a.m31194b();
            } else if (((UIState) getState()).getDataList() == null) {
                send(C15129h.f26768a);
            } else {
                C43101f.f95302a.m94714h();
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        StartupTrace startupTrace = StartupTrace.f48194a;
        startupTrace.m58450j("duration10");
        C43101f c43101f = C43101f.f95302a;
        c43101f.m94709b("home_page_menu_widget_load_data");
        if (this.f26752Y.compareAndSet(true, false) && (listM31193a = GridNavigationWidgetPreloader.f26749a.m31193a()) != null && listM31193a.size() > 1) {
            c43101f.m94709b("home_page_menu_widget_use_cache");
            startupTrace.m58450j("duration11");
            updateState(new Function1() { // from class: com.kubi.home.widgets.grid.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GridNavigationWidgetVM.m31200p(listM31193a, (UIState) obj2);
                }
            });
        }
        Long lBoxLong = z12 ? null : Boxing.boxLong(HomeConst.f25513a.m28962b());
        c43101f.m94709b("home_page_menu_widget_start_fetch_data");
        jM94718b = C43103h.f95308a.m94718b();
        HomeWidgetRepo homeWidgetRepo = this.f26751X;
        gridNavigationWidgetVM$loadData$2.L$0 = SpillingKt.nullOutSpilledVariable(lBoxLong);
        gridNavigationWidgetVM$loadData$2.Z$0 = z12;
        gridNavigationWidgetVM$loadData$2.J$0 = jM94718b;
        gridNavigationWidgetVM$loadData$2.label = 1;
        Object objM31074h = homeWidgetRepo.m31074h(lBoxLong, gridNavigationWidgetVM$loadData$2);
        if (objM31074h != coroutine_suspended) {
            l11 = lBoxLong;
            obj = objM31074h;
        }
        return coroutine_suspended;
        HomeGridNavigationEntity homeGridNavigationEntity = (HomeGridNavigationEntity) obj;
        C43103h c43103h = C43103h.f95308a;
        c43103h.m94720d(HomeWidgetCode.Menu.getCode(), c43103h.m94718b() - jM94718b);
        C43101f.f95302a.m94709b("home_page_menu_widget_end_fetch_data");
        StartupTrace.f48194a.m58450j("duration11");
        MoreIconEntity iconResponse = homeGridNavigationEntity != null ? homeGridNavigationEntity.getIconResponse() : null;
        List<GridNavigationEntity> navigationList = homeGridNavigationEntity != null ? homeGridNavigationEntity.getNavigationList() : null;
        if (navigationList == null) {
            navigationList = CollectionsKt.emptyList();
        }
        List mutableList = CollectionsKt.toMutableList((Collection) navigationList);
        mutableList.add(new MoreNavigationEntity(iconResponse != null ? iconResponse.getDayIcon() : null, iconResponse != null ? iconResponse.getDarkIcon() : null));
        list = CollectionsKt.toList(mutableList);
        if (!list.isEmpty()) {
            Long l12 = l11;
            GridItemHeightHelper gridItemHeightHelper = GridItemHeightHelper.f26415a;
            gridNavigationWidgetVM$loadData$2.L$0 = SpillingKt.nullOutSpilledVariable(l12);
            gridNavigationWidgetVM$loadData$2.L$1 = SpillingKt.nullOutSpilledVariable(homeGridNavigationEntity);
            gridNavigationWidgetVM$loadData$2.L$2 = SpillingKt.nullOutSpilledVariable(iconResponse);
            gridNavigationWidgetVM$loadData$2.L$3 = list;
            gridNavigationWidgetVM$loadData$2.Z$0 = z12;
            gridNavigationWidgetVM$loadData$2.J$0 = jM94718b;
            gridNavigationWidgetVM$loadData$2.label = 2;
            if (GridItemHeightHelper.m30636e(gridItemHeightHelper, list, 4, 0, gridNavigationWidgetVM$loadData$2, 4, null) != coroutine_suspended) {
                list2 = list;
                list = list2;
            }
            return coroutine_suspended;
        }
        if (list.size() > 1) {
            updateState(new Function1() { // from class: com.kubi.home.widgets.grid.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GridNavigationWidgetVM.m31201q(list, (UIState) obj2);
                }
            });
            GridNavigationWidgetPreloader.f26749a.m31194b();
        } else if (((UIState) getState()).getDataList() == null) {
            send(C15129h.f26768a);
        } else {
            C43101f.f95302a.m94714h();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final UIState m31200p(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(list);
    }

    /* JADX INFO: renamed from: q */
    public static final UIState m31201q(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C151211 c151211;
        if (continuation instanceof C151211) {
            c151211 = (C151211) continuation;
            int i11 = c151211.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c151211.label = i11 - Integer.MIN_VALUE;
            } else {
                c151211 = new C151211(continuation);
            }
        } else {
            c151211 = new C151211(continuation);
        }
        Object obj = c151211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c151211.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof GridNavigationWidgetContract$UiIntent.LoadData) {
                GridNavigationWidgetContract$UiIntent.LoadData loadData = (GridNavigationWidgetContract$UiIntent.LoadData) interfaceC19282d;
                boolean forceRefresh = loadData.getForceRefresh();
                c151211.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c151211.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c151211.L$2 = interfaceC19282d;
                c151211.L$3 = SpillingKt.nullOutSpilledVariable(loadData);
                c151211.I$0 = 0;
                c151211.I$1 = 0;
                c151211.label = 1;
                if (m31199o(forceRefresh, c151211) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }
}
