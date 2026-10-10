package com.kubi.quotefacade.widgets.sectors;

import androidx.lifecycle.ViewModelKt;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.ChancePlateItem;
import com.kubi.quotefacade.widgets.QuoteWidgetsRepo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HotSectorsWidgetVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0094@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u000e\u0010\u0016\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/sectors/HotSectorsWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/widgets/sectors/HotSectorsContract$UIState;", BridgeParamKeyKt.MAX_COUNT, "", "<init>", "(I)V", "repo", "Lcom/kubi/quotefacade/widgets/QuoteWidgetsRepo;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "repeatJob", "Lkotlinx/coroutines/Job;", "initState", "getInitState", "()Lcom/kubi/quotefacade/widgets/sectors/HotSectorsContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "startLoadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sort", "", "Lcom/kubi/quotefacade/entity/ChancePlateItem;", "resetRepeatJob", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHotSectorsWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotSectorsWidgetVM.kt\ncom/kubi/quotefacade/widgets/sectors/HotSectorsWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n473#2,4:77\n1#3:81\n1068#4:82\n*S KotlinDebug\n*F\n+ 1 HotSectorsWidgetVM.kt\ncom/kubi/quotefacade/widgets/sectors/HotSectorsWidgetVM\n*L\n32#1:77,4\n66#1:82\n*E\n"})
public final class HotSectorsWidgetVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    public final int f42937X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteWidgetsRepo f42938Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final AtomicBoolean f42939Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public InterfaceC41775x1 f42940a0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.sectors.HotSectorsWidgetVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HotSectorsWidgetVM.kt\ncom/kubi/quotefacade/widgets/sectors/HotSectorsWidgetVM\n*L\n1#1,328:1\n67#2:329\n*E\n"})
    public static final class C22702a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            ChancePlateItem chancePlateItem = (ChancePlateItem) t12;
            List<String> hotCurrencyNameList = chancePlateItem.getHotCurrencyNameList();
            if (hotCurrencyNameList == null) {
                hotCurrencyNameList = CollectionsKt.emptyList();
            }
            Integer numValueOf = Integer.valueOf(hotCurrencyNameList.size() * C27039d.m66651k(chancePlateItem.getWeight(), 1));
            ChancePlateItem chancePlateItem2 = (ChancePlateItem) t11;
            List<String> hotCurrencyNameList2 = chancePlateItem2.getHotCurrencyNameList();
            if (hotCurrencyNameList2 == null) {
                hotCurrencyNameList2 = CollectionsKt.emptyList();
            }
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(hotCurrencyNameList2.size() * C27039d.m66651k(chancePlateItem2.getWeight(), 1)));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.sectors.HotSectorsWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: HotSectorsWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.sectors.HotSectorsWidgetVM", m90122f = "HotSectorsWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {32}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-HotSectorsWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C227031 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C227031(Continuation<? super C227031> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HotSectorsWidgetVM.this.dispatchIntent(null, this);
        }
    }

    public HotSectorsWidgetVM() {
        this(0, 1, null);
    }

    public HotSectorsWidgetVM(int i11) {
        this.f42937X = i11;
        this.f42938Y = new QuoteWidgetsRepo();
        this.f42939Z = new AtomicBoolean(true);
    }

    /* JADX INFO: renamed from: o */
    private final void m53702o() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotSectorsWidgetVM.m53703p(this.f42971b);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m53703p(HotSectorsWidgetVM hotSectorsWidgetVM) {
        InterfaceC41775x1 interfaceC41775x1 = hotSectorsWidgetVM.f42940a0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        hotSectorsWidgetVM.f42940a0 = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m53704r(Continuation<? super Unit> continuation) {
        HotSectorsWidgetVM$startLoadData$1 hotSectorsWidgetVM$startLoadData$1;
        if (continuation instanceof HotSectorsWidgetVM$startLoadData$1) {
            hotSectorsWidgetVM$startLoadData$1 = (HotSectorsWidgetVM$startLoadData$1) continuation;
            int i11 = hotSectorsWidgetVM$startLoadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hotSectorsWidgetVM$startLoadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                hotSectorsWidgetVM$startLoadData$1 = new HotSectorsWidgetVM$startLoadData$1(this, continuation);
            }
        } else {
            hotSectorsWidgetVM$startLoadData$1 = new HotSectorsWidgetVM$startLoadData$1(this, continuation);
        }
        Object objM53337f = hotSectorsWidgetVM$startLoadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hotSectorsWidgetVM$startLoadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM53337f);
            m53702o();
            if (this.f42939Z.compareAndSet(true, false)) {
                QuoteWidgetsRepo quoteWidgetsRepo = this.f42938Y;
                hotSectorsWidgetVM$startLoadData$1.label = 1;
                objM53337f = quoteWidgetsRepo.m53337f(hotSectorsWidgetVM$startLoadData$1);
                if (objM53337f == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new HotSectorsWidgetVM$startLoadData$3(this, null), 3, null);
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM53337f);
        final List list = (List) objM53337f;
        if (list != null) {
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.sectors.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HotSectorsWidgetVM.m53705s(this.f42969b, list, (UIState) obj);
                }
            }));
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new HotSectorsWidgetVM$startLoadData$3(this, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final UIState m53705s(HotSectorsWidgetVM hotSectorsWidgetVM, List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(hotSectorsWidgetVM.m53707q(list));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C227031 c227031;
        if (continuation instanceof C227031) {
            c227031 = (C227031) continuation;
            int i11 = c227031.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c227031.label = i11 - Integer.MIN_VALUE;
            } else {
                c227031 = new C227031(continuation);
            }
        } else {
            c227031 = new C227031(continuation);
        }
        Object obj = c227031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c227031.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof HotSectorsContract$UiIntent.LoadData) {
                c227031.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c227031.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c227031.L$2 = interfaceC19282d;
                c227031.L$3 = SpillingKt.nullOutSpilledVariable((HotSectorsContract$UiIntent.LoadData) interfaceC19282d);
                c227031.I$0 = 0;
                c227031.I$1 = 0;
                c227031.label = 1;
                if (m53704r(c227031) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: q */
    public final List<ChancePlateItem> m53707q(List<ChancePlateItem> list) {
        return CollectionsKt.take(CollectionsKt.sortedWith(list, new C22702a()), this.f42937X);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m53702o();
    }

    public /* synthetic */ HotSectorsWidgetVM(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 2 : i11);
    }
}
