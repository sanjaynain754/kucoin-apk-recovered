package com.kubi.quotefacade.market.etf;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bv.C4682n;
import com.kubi.quotefacade.entity.EtfLevel1;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p274fx.C37727a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: QuoteEtfFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.etf.QuoteEtfFragment$updateAdapter$2", m90122f = "QuoteEtfFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nQuoteEtfFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteEtfFragment.kt\ncom/kubi/quotefacade/market/etf/QuoteEtfFragment$updateAdapter$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1573#2:151\n1604#2,3:152\n1607#2:156\n1#3:155\n*S KotlinDebug\n*F\n+ 1 QuoteEtfFragment.kt\ncom/kubi/quotefacade/market/etf/QuoteEtfFragment$updateAdapter$2\n*L\n122#1:151\n122#1:152,3\n122#1:156\n*E\n"})
public final class QuoteEtfFragment$updateAdapter$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<EtfLevel1> $list;
    final /* synthetic */ int $selectIndex;
    final /* synthetic */ SlidingTabLayout $tabLayout;
    final /* synthetic */ ViewPager2 $viewPager;
    int label;
    final /* synthetic */ QuoteEtfFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteEtfFragment$updateAdapter$2(ViewPager2 viewPager2, List<EtfLevel1> list, QuoteEtfFragment quoteEtfFragment, int i11, SlidingTabLayout slidingTabLayout, Continuation<? super QuoteEtfFragment$updateAdapter$2> continuation) {
        super(2, continuation);
        this.$viewPager = viewPager2;
        this.$list = list;
        this.this$0 = quoteEtfFragment;
        this.$selectIndex = i11;
        this.$tabLayout = slidingTabLayout;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteEtfFragment$updateAdapter$2(this.$viewPager, this.$list, this.this$0, this.$selectIndex, this.$tabLayout, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteEtfFragment$updateAdapter$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Fragment m52401f(QuoteEtfFragment quoteEtfFragment, EtfLevel1 etfLevel1, int i11) {
        C44128b.m97266j(quoteEtfFragment.getTAG(), "updateAdapter index=" + i11);
        EtfListFragment.Companion companion = EtfListFragment.f42220j0;
        String concept = etfLevel1.getConcept();
        int count = etfLevel1.getCount();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(etfLevel1.getConcept());
        Unit unit = Unit.INSTANCE;
        return companion.newInstance(concept, "l2p", count, arrayList);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SlidingTabLayout slidingTabLayout;
        String concept;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RecyclerView.Adapter adapter = this.$viewPager.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.resources.widget.viewpager2.ViewPager2Adapter");
            C37727a c37727a = (C37727a) adapter;
            List<?> mutableList = CollectionsKt.toMutableList((Collection) this.$list);
            c37727a.clear();
            this.this$0.f42224V.clear();
            C44128b.m97266j(this.this$0.getTAG(), "updateAdapter start 01 etf");
            final QuoteEtfFragment quoteEtfFragment = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
            int i11 = 0;
            int i12 = 0;
            for (Object obj2 : mutableList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final EtfLevel1 etfLevel1 = (EtfLevel1) obj2;
                if (etfLevel1.getEnabled() && (concept = etfLevel1.getConcept()) != null && concept.length() != 0) {
                    C44128b.m97266j(quoteEtfFragment.getTAG(), "updateAdapter " + i12 + " -----------> " + etfLevel1);
                    String nameA = etfLevel1.getNameA();
                    if (nameA != null) {
                        Boxing.boxBoolean(quoteEtfFragment.f42224V.add(nameA));
                    }
                    c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.market.etf.d
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return QuoteEtfFragment$updateAdapter$2.m52401f(quoteEtfFragment, etfLevel1, ((Integer) obj3).intValue());
                        }
                    });
                }
                arrayList.add(Unit.INSTANCE);
                i12 = i13;
            }
            C44128b.m97266j(this.this$0.getTAG(), "updateAdapter start 02 etf");
            this.$viewPager.setCurrentItem(this.$selectIndex, false);
            C4682n c4682nM52398n3 = this.this$0.m52398n3();
            if (c4682nM52398n3 != null && (slidingTabLayout = c4682nM52398n3.f4461b) != null) {
                if (this.this$0.f42224V.size() <= 1) {
                    i11 = 8;
                }
                slidingTabLayout.setVisibility(i11);
            }
            c37727a.m85031k(mutableList);
            if (this.this$0.f42224V.size() > 0) {
                this.$tabLayout.m55597u();
            }
            C44128b.m97266j(this.this$0.getTAG(), "updateAdapter done");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
