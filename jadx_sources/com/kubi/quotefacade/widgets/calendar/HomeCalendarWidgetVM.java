package com.kubi.quotefacade.widgets.calendar;

import com.kubi.home.api.HomeWidgetCode;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p502oj.C43103h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeCalendarWidgetVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0094@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarRepo;", "initState", "getInitState", "()Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "data", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UiIntent$LoadData;", "(Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UiIntent$LoadData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCalendarWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarWidgetVM.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n473#2,4:36\n1056#3:40\n*S KotlinDebug\n*F\n+ 1 HomeCalendarWidgetVM.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetVM\n*L\n20#1:36,4\n30#1:40\n*E\n"})
public final class HomeCalendarWidgetVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final HomeCalendarRepo f42783X = new HomeCalendarRepo();

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.calendar.HomeCalendarWidgetVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HomeCalendarWidgetVM.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetVM\n*L\n1#1,328:1\n31#2:329\n*E\n"})
    public static final class C22606a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((HomeCalendarEventEntity) t11).getStartTime(), ((HomeCalendarEventEntity) t12).getStartTime());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.calendar.HomeCalendarWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: HomeCalendarWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.calendar.HomeCalendarWidgetVM", m90122f = "HomeCalendarWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {20}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-HomeCalendarWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C226071 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C226071(Continuation<? super C226071> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HomeCalendarWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final UIState m53390p(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(CollectionsKt.sortedWith(list, new C22606a()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C226071 c226071;
        if (continuation instanceof C226071) {
            c226071 = (C226071) continuation;
            int i11 = c226071.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c226071.label = i11 - Integer.MIN_VALUE;
            } else {
                c226071 = new C226071(continuation);
            }
        } else {
            c226071 = new C226071(continuation);
        }
        Object obj = c226071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c226071.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof HomeCalendarWidgetContract$UiIntent.LoadData) {
                HomeCalendarWidgetContract$UiIntent.LoadData loadData = (HomeCalendarWidgetContract$UiIntent.LoadData) interfaceC19282d;
                c226071.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c226071.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c226071.L$2 = interfaceC19282d;
                c226071.L$3 = SpillingKt.nullOutSpilledVariable(loadData);
                c226071.I$0 = 0;
                c226071.I$1 = 0;
                c226071.label = 1;
                if (m53392o(loadData, c226071) == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m53392o(HomeCalendarWidgetContract$UiIntent.LoadData loadData, Continuation<? super Unit> continuation) throws JSONException {
        HomeCalendarWidgetVM$loadData$1 homeCalendarWidgetVM$loadData$1;
        long j11;
        if (continuation instanceof HomeCalendarWidgetVM$loadData$1) {
            homeCalendarWidgetVM$loadData$1 = (HomeCalendarWidgetVM$loadData$1) continuation;
            int i11 = homeCalendarWidgetVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeCalendarWidgetVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeCalendarWidgetVM$loadData$1 = new HomeCalendarWidgetVM$loadData$1(this, continuation);
            }
        } else {
            homeCalendarWidgetVM$loadData$1 = new HomeCalendarWidgetVM$loadData$1(this, continuation);
        }
        HomeCalendarWidgetVM$loadData$1 homeCalendarWidgetVM$loadData$2 = homeCalendarWidgetVM$loadData$1;
        Object objM53382d = homeCalendarWidgetVM$loadData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeCalendarWidgetVM$loadData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM53382d);
            long jM94718b = C43103h.f95308a.m94718b();
            HomeCalendarRepo homeCalendarRepo = this.f42783X;
            long startSecond = loadData.getStartSecond();
            long endSecond = loadData.getEndSecond();
            homeCalendarWidgetVM$loadData$2.L$0 = SpillingKt.nullOutSpilledVariable(loadData);
            homeCalendarWidgetVM$loadData$2.J$0 = jM94718b;
            homeCalendarWidgetVM$loadData$2.label = 1;
            objM53382d = homeCalendarRepo.m53382d(startSecond, endSecond, homeCalendarWidgetVM$loadData$2);
            if (objM53382d == coroutine_suspended) {
                return coroutine_suspended;
            }
            j11 = jM94718b;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = homeCalendarWidgetVM$loadData$2.J$0;
            ResultKt.throwOnFailure(objM53382d);
        }
        final List listEmptyList = (List) objM53382d;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        C43103h c43103h = C43103h.f95308a;
        c43103h.m94720d(HomeWidgetCode.Calendar.getCode(), c43103h.m94718b() - j11);
        updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.calendar.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeCalendarWidgetVM.m53390p(listEmptyList, (UIState) obj);
            }
        });
        return Unit.INSTANCE;
    }
}
