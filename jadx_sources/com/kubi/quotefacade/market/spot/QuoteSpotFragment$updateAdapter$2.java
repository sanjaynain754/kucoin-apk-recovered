package com.kubi.quotefacade.market.spot;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.quotefacade.entity.SpotLevel2;
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

/* JADX INFO: compiled from: QuoteSpotFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.spot.QuoteSpotFragment$updateAdapter$2", m90122f = "QuoteSpotFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nQuoteSpotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment$updateAdapter$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1573#2:306\n1604#2,3:307\n1607#2:311\n1#3:310\n*S KotlinDebug\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment$updateAdapter$2\n*L\n263#1:306\n263#1:307,3\n263#1:311\n*E\n"})
public final class QuoteSpotFragment$updateAdapter$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SpotLevel2> $list;
    final /* synthetic */ String $quoteCryptoAliasName;
    final /* synthetic */ int $selectIndex;
    final /* synthetic */ SlidingTabLayout $tabLayout;
    final /* synthetic */ ViewPager2 $viewPager;
    int label;
    final /* synthetic */ QuoteSpotFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteSpotFragment$updateAdapter$2(ViewPager2 viewPager2, List<SpotLevel2> list, QuoteSpotFragment quoteSpotFragment, int i11, SlidingTabLayout slidingTabLayout, String str, Continuation<? super QuoteSpotFragment$updateAdapter$2> continuation) {
        super(2, continuation);
        this.$viewPager = viewPager2;
        this.$list = list;
        this.this$0 = quoteSpotFragment;
        this.$selectIndex = i11;
        this.$tabLayout = slidingTabLayout;
        this.$quoteCryptoAliasName = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteSpotFragment$updateAdapter$2(this.$viewPager, this.$list, this.this$0, this.$selectIndex, this.$tabLayout, this.$quoteCryptoAliasName, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteSpotFragment$updateAdapter$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Fragment m52625f(QuoteSpotFragment quoteSpotFragment, SpotLevel2 spotLevel2, String str, int i11) {
        C44128b.m97266j(quoteSpotFragment.getTAG(), "Adapter add index=" + i11 + " --> " + spotLevel2 + " --> " + quoteSpotFragment.f42354Y.size());
        if (Intrinsics.areEqual(spotLevel2.getConcept(), "ALL") && quoteSpotFragment.f42354Y.size() > 1) {
            SpotListFragment.Companion companion = SpotListFragment.f42360j0;
            String concept = spotLevel2.getConcept();
            int count = spotLevel2.getCount();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(quoteSpotFragment.f42355Z);
            Unit unit = Unit.INSTANCE;
            return companion.newInstance(str, concept, count, arrayList);
        }
        SpotListFragment.Companion companion2 = SpotListFragment.f42360j0;
        String concept2 = spotLevel2.getConcept();
        int count2 = spotLevel2.getCount();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(spotLevel2.getConcept());
        Unit unit2 = Unit.INSTANCE;
        return companion2.newInstance(str, concept2, count2, arrayList2);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String nameA;
        String concept;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RecyclerView.Adapter adapter = this.$viewPager.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.resources.widget.viewpager2.ViewPager2Adapter");
            C37727a c37727a = (C37727a) adapter;
            List<?> mutableList = CollectionsKt.toMutableList((Collection) this.$list);
            c37727a.clear();
            this.this$0.f42354Y.clear();
            this.this$0.f42355Z.clear();
            final QuoteSpotFragment quoteSpotFragment = this.this$0;
            final String str = this.$quoteCryptoAliasName;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
            int i11 = 0;
            for (Object obj2 : mutableList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final SpotLevel2 spotLevel2 = (SpotLevel2) obj2;
                C44128b.m97266j(quoteSpotFragment.getTAG(), "updateAdapter " + i11 + " --> " + spotLevel2);
                if (spotLevel2.getEnabled() && (nameA = spotLevel2.getNameA()) != null && nameA.length() != 0 && (concept = spotLevel2.getConcept()) != null && concept.length() != 0) {
                    spotLevel2.setTime(Boxing.boxLong(SystemClock.elapsedRealtime()));
                    quoteSpotFragment.f42354Y.add(spotLevel2.getNameA());
                    if (!Intrinsics.areEqual(spotLevel2.getConcept(), "ALL")) {
                        quoteSpotFragment.f42355Z.add(spotLevel2.getConcept());
                    }
                    c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.market.spot.e
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return QuoteSpotFragment$updateAdapter$2.m52625f(quoteSpotFragment, spotLevel2, str, ((Integer) obj3).intValue());
                        }
                    });
                }
                arrayList.add(Unit.INSTANCE);
                i11 = i12;
            }
            this.$viewPager.setCurrentItem(this.$selectIndex, false);
            c37727a.m85031k(mutableList);
            if (this.this$0.f42354Y.size() > 0) {
                this.$tabLayout.m55597u();
            }
            C44128b.m97266j(this.this$0.getTAG(), "updateAdapter done");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
