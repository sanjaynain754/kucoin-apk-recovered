package com.kubi.spot.business.market;

import com.kubi.data.entity.TradeItemBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42917g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import w20.C45700a;

/* JADX INFO: compiled from: ToggleSymbolsFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.market.ToggleSymbolsFragment$sortSearchData$1", m90122f = "ToggleSymbolsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nToggleSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleSymbolsFragment.kt\ncom/kubi/spot/business/market/ToggleSymbolsFragment$sortSearchData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 4 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,351:1\n774#2:352\n865#2,2:353\n1056#2:355\n19#3,2:356\n43#4,7:358\n*S KotlinDebug\n*F\n+ 1 ToggleSymbolsFragment.kt\ncom/kubi/spot/business/market/ToggleSymbolsFragment$sortSearchData$1\n*L\n237#1:352\n237#1:353,2\n238#1:355\n242#1:356,2\n247#1:358,7\n*E\n"})
public final class ToggleSymbolsFragment$sortSearchData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $filterKey;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ToggleSymbolsFragment this$0;

    /* JADX INFO: renamed from: com.kubi.spot.business.market.ToggleSymbolsFragment$sortSearchData$1$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ToggleSymbolsFragment.kt\ncom/kubi/spot/business/market/ToggleSymbolsFragment$sortSearchData$1\n*L\n1#1,328:1\n239#2:329\n*E\n"})
    public static final class C24981a<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f50209b;

        public C24981a(String str) {
            this.f50209b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String showSymbol = ((TradeItemBean) t11).getShowSymbol();
            Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
            Integer numValueOf = Integer.valueOf(StringsKt.indexOf((CharSequence) showSymbol, this.f50209b, 0, true));
            String showSymbol2 = ((TradeItemBean) t12).getShowSymbol();
            Intrinsics.checkNotNullExpressionValue(showSymbol2, "getShowSymbol(...)");
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(StringsKt.indexOf((CharSequence) showSymbol2, this.f50209b, 0, true)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleSymbolsFragment$sortSearchData$1(ToggleSymbolsFragment toggleSymbolsFragment, String str, Continuation<? super ToggleSymbolsFragment$sortSearchData$1> continuation) {
        super(2, continuation);
        this.this$0 = toggleSymbolsFragment;
        this.$filterKey = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ToggleSymbolsFragment$sortSearchData$1 toggleSymbolsFragment$sortSearchData$1 = new ToggleSymbolsFragment$sortSearchData$1(this.this$0, this.$filterKey, continuation);
        toggleSymbolsFragment$sortSearchData$1.L$0 = obj;
        return toggleSymbolsFragment$sortSearchData$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ToggleSymbolsFragment$sortSearchData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = this.this$0.f50199a0;
        this.this$0.m61151H3().m62740n(this.this$0.getF50197Y());
        String str = this.$filterKey;
        final ToggleSymbolsFragment toggleSymbolsFragment = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                String showSymbol = ((TradeItemBean) obj2).getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
                if (StringsKt.contains((CharSequence) showSymbol, (CharSequence) str, true)) {
                    arrayList2.add(obj2);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new C24981a(str));
            if (C41713n0.m91132h(interfaceC41709m0)) {
                C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.spot.business.market.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ToggleSymbolsFragment$sortSearchData$1.m61156f(toggleSymbolsFragment, listSortedWith);
                    }
                });
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C45700a.m100877c(thM103847exceptionOrNullimpl, "sortSearchData");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m61156f(ToggleSymbolsFragment toggleSymbolsFragment, List list) {
        toggleSymbolsFragment.m61151H3().replaceData(list);
    }
}
