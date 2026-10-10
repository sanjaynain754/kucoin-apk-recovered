package com.kubi.quotefacade.market.futures;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.FutureLevel2;
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

/* JADX INFO: compiled from: QuoteFuturesFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.futures.QuoteFuturesFragment$updateAdapter$2", m90122f = "QuoteFuturesFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nQuoteFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFuturesFragment.kt\ncom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1573#2:322\n1604#2,3:323\n1607#2:327\n1573#2:328\n1604#2,4:329\n1#3:326\n*S KotlinDebug\n*F\n+ 1 QuoteFuturesFragment.kt\ncom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2\n*L\n257#1:322\n257#1:323,3\n257#1:327\n297#1:328\n297#1:329,4\n*E\n"})
public final class QuoteFuturesFragment$updateAdapter$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<FutureLevel2> $list;
    final /* synthetic */ String $quoteCrypto;
    final /* synthetic */ int $selectIndex;
    final /* synthetic */ SlidingTabLayout $tabLayout;
    final /* synthetic */ ViewPager2 $viewPager;
    int label;
    final /* synthetic */ QuoteFuturesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteFuturesFragment$updateAdapter$2(ViewPager2 viewPager2, List<FutureLevel2> list, QuoteFuturesFragment quoteFuturesFragment, int i11, SlidingTabLayout slidingTabLayout, String str, Continuation<? super QuoteFuturesFragment$updateAdapter$2> continuation) {
        super(2, continuation);
        this.$viewPager = viewPager2;
        this.$list = list;
        this.this$0 = quoteFuturesFragment;
        this.$selectIndex = i11;
        this.$tabLayout = slidingTabLayout;
        this.$quoteCrypto = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteFuturesFragment$updateAdapter$2(this.$viewPager, this.$list, this.this$0, this.$selectIndex, this.$tabLayout, this.$quoteCrypto, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteFuturesFragment$updateAdapter$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Fragment m52433f(QuoteFuturesFragment quoteFuturesFragment, FutureLevel2 futureLevel2, String str, int i11) {
        C44128b.m97266j(quoteFuturesFragment.getTAG(), "Adapter add index=" + i11 + " --> " + futureLevel2 + " --> " + quoteFuturesFragment.f42242Y.size());
        if (Intrinsics.areEqual(futureLevel2.getConcept(), quoteFuturesFragment.f42246c0) && quoteFuturesFragment.f42242Y.size() > 1) {
            FuturesListFragment.Companion companion = FuturesListFragment.f42235j0;
            String concept = futureLevel2.getConcept();
            int count = futureLevel2.getCount();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(quoteFuturesFragment.f42243Z);
            Unit unit = Unit.INSTANCE;
            return companion.newInstance(str, concept, count, arrayList);
        }
        FuturesListFragment.Companion companion2 = FuturesListFragment.f42235j0;
        String concept2 = futureLevel2.getConcept();
        int count2 = futureLevel2.getCount();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(futureLevel2.getConcept());
        Unit unit2 = Unit.INSTANCE;
        return companion2.newInstance(str, concept2, count2, arrayList2);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        Drawable drawable;
        String nameAMultiLang;
        String concept;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RecyclerView.Adapter adapter = this.$viewPager.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.resources.widget.viewpager2.ViewPager2Adapter");
            C37727a c37727a = (C37727a) adapter;
            List<?> mutableList = CollectionsKt.toMutableList((Collection) this.$list);
            c37727a.clear();
            this.this$0.f42242Y.clear();
            this.this$0.f42243Z.clear();
            final QuoteFuturesFragment quoteFuturesFragment = this.this$0;
            final String str = this.$quoteCrypto;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
            int i11 = 0;
            int i12 = 0;
            for (Object obj2 : mutableList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final FutureLevel2 futureLevel2 = (FutureLevel2) obj2;
                C44128b.m97266j(quoteFuturesFragment.getTAG(), "updateAdapter " + i12 + " --> " + futureLevel2);
                if (futureLevel2.getEnabled() && (nameAMultiLang = futureLevel2.getNameAMultiLang()) != null && nameAMultiLang.length() != 0 && (concept = futureLevel2.getConcept()) != null && concept.length() != 0) {
                    futureLevel2.setTime(Boxing.boxLong(SystemClock.elapsedRealtime()));
                    String nameAMultiLang2 = futureLevel2.getNameAMultiLang();
                    if (nameAMultiLang2 != null) {
                        quoteFuturesFragment.f42242Y.add(nameAMultiLang2);
                        C44128b.m97266j(quoteFuturesFragment.getTAG(), "titleList=" + quoteFuturesFragment.f42242Y.size());
                    }
                    if (!Intrinsics.areEqual(futureLevel2.getConcept(), quoteFuturesFragment.f42246c0)) {
                        quoteFuturesFragment.f42243Z.add(futureLevel2.getConcept());
                        C44128b.m97266j(quoteFuturesFragment.getTAG(), "wsList=" + quoteFuturesFragment.f42243Z.size());
                    }
                    c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.market.futures.i
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return QuoteFuturesFragment$updateAdapter$2.m52433f(quoteFuturesFragment, futureLevel2, str, ((Integer) obj3).intValue());
                        }
                    });
                }
                arrayList.add(Unit.INSTANCE);
                i12 = i13;
            }
            this.$viewPager.setCurrentItem(this.$selectIndex, false);
            c37727a.m85031k(mutableList);
            if (this.this$0.f42242Y.size() > 0) {
                this.$tabLayout.m55597u();
            }
            SlidingTabLayout slidingTabLayout = this.$tabLayout;
            QuoteFuturesFragment quoteFuturesFragment2 = this.this$0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
            for (Object obj3 : mutableList) {
                int i14 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                FutureLevel2 futureLevel3 = (FutureLevel2) obj3;
                View viewM55593q = slidingTabLayout.m55593q(i11);
                TextView textView2 = null;
                if (viewM55593q != null && (textView = (TextView) viewM55593q.findViewById(R$id.tv_tab_title)) != null) {
                    if (futureLevel3.getHot()) {
                        C44128b.m97266j(quoteFuturesFragment2.getTAG(), "show hot");
                        drawable = textView.getContext().getDrawable(R$mipmap.ic_hot);
                    } else {
                        C44128b.m97266j(quoteFuturesFragment2.getTAG(), "not show hot");
                        drawable = null;
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2 = textView;
                }
                arrayList2.add(textView2);
                i11 = i14;
            }
            C44128b.m97266j(this.this$0.getTAG(), "updateAdapter done");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
