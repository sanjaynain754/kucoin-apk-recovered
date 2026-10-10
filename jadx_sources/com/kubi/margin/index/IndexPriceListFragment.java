package com.kubi.margin.index;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.kubi.margin.R$color;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.IndexSymbolData;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import g10.C37787r;
import g10.InterfaceC37770a;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36939t;
import p768xo.InterfaceC46304e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: IndexPriceListFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010(\u001a\u00020!H\u0016J\b\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0017J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000.H\u0002J\b\u00101\u001a\u00020!H\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/margin/index/IndexPriceListFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "Lcom/kubi/margin/api/IIndexPriceListTag;", "<init>", "()V", "bmarginFragmentIndexPriceListBinding", "Lcom/kubi/margin/databinding/BmarginFragmentIndexPriceListBinding;", "getBmarginFragmentIndexPriceListBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentIndexPriceListBinding;", "bmarginFragmentIndexPriceListBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "indexApi", "Lcom/kubi/margin/api/IndexApi;", "kotlin.jvm.PlatformType", "getIndexApi", "()Lcom/kubi/margin/api/IndexApi;", "indexApi$delegate", "Lkotlin/Lazy;", "adapter", "com/kubi/margin/index/IndexPriceListFragment$adapter$2$1", "getAdapter", "()Lcom/kubi/margin/index/IndexPriceListFragment$adapter$2$1;", "adapter$delegate", "getDisplayTradePair", "", "context", "Landroid/content/Context;", "symbols", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "getRestfulData", "resetWs", "", "getSubTopicList", "", "tradeItemBeans", "Lcom/kubi/margin/entity/IndexSymbolData;", "registerWsData", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIndexPriceListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexPriceListFragment.kt\ncom/kubi/margin/index/IndexPriceListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,264:1\n147#2,16:265\n739#3,9:281\n1869#3,2:299\n1869#3,2:301\n37#4:290\n36#4,3:291\n1#5:294\n160#6,4:295\n*S KotlinDebug\n*F\n+ 1 IndexPriceListFragment.kt\ncom/kubi/margin/index/IndexPriceListFragment\n*L\n49#1:265,16\n122#1:281,9\n246#1:299,2\n234#1:301,2\n122#1:290\n122#1:291,3\n241#1:295,4\n*E\n"})
public final class IndexPriceListFragment extends OldBaseFragment implements InterfaceC37770a {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f33049Y = {Reflection.property1(new PropertyReference1Impl(IndexPriceListFragment.class, "bmarginFragmentIndexPriceListBinding", "getBmarginFragmentIndexPriceListBinding()Lcom/kubi/margin/databinding/BmarginFragmentIndexPriceListBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33050U = C45681e.m100799e(this, new Function1<IndexPriceListFragment, C36939t>() { // from class: com.kubi.margin.index.IndexPriceListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36939t invoke(@NotNull IndexPriceListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36939t.m82747a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36939t, Unit>() { // from class: com.kubi.margin.index.IndexPriceListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36939t it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36939t c36939t) {
            invoke(c36939t);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33051V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.index.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IndexPriceListFragment.m38448K3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33052W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.index.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IndexPriceListFragment.m38444C3(this.f33085b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final C37787r f33053X = new C37787r(this);

    /* JADX INFO: renamed from: com.kubi.margin.index.IndexPriceListFragment$a */
    /* JADX INFO: compiled from: IndexPriceListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/margin/index/IndexPriceListFragment$getRestfulData$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "onNetError", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17645a extends C24223c1 {
        public C17645a() {
            super(IndexPriceListFragment.this, false);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (IndexPriceListFragment.this.isDetached() || IndexPriceListFragment.this.getParentFragment() == null) {
                return;
            }
            FragmentActivity activity = IndexPriceListFragment.this.getActivity();
            if (C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null)) {
                return;
            }
            if (IndexPriceListFragment.this.m38477D3().getData().isEmpty()) {
                IndexPriceListFragment.this.showEmpty();
            }
            super.accept(throwable);
        }

        @Override // com.kubi.sdk.util.C24223c1
        /* JADX INFO: renamed from: c */
        public void mo32077c() {
            IndexPriceListFragment.this.showNetWorkError();
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.index.IndexPriceListFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C17647b extends TypeToken<IndexSymbolData> {
    }

    /* JADX INFO: renamed from: C3 */
    public static final IndexPriceListFragment$adapter$2$1 m38444C3(IndexPriceListFragment indexPriceListFragment) {
        return new IndexPriceListFragment$adapter$2$1(indexPriceListFragment, R$layout.bmargin_view_item_index_list);
    }

    /* JADX INFO: renamed from: G3 */
    private final InterfaceC46304e m38445G3() {
        return (InterfaceC46304e) this.f33051V.getValue();
    }

    /* JADX INFO: renamed from: J3 */
    public static final String m38447J3(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb2 = new StringBuilder();
        int size = it.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!TextUtils.isEmpty(((IndexSymbolData) it.get(i11)).getSymbol())) {
                if (i11 != it.size() - 1) {
                    sb2.append(((IndexSymbolData) it.get(i11)).getSymbol());
                    sb2.append(",");
                } else {
                    sb2.append(((IndexSymbolData) it.get(i11)).getSymbol());
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: O3 */
    public static final IndexSymbolData m38451O3(Message s11) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(s11, "s");
        String strM66668h = C27041f.m66668h(s11.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C17647b().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        IndexSymbolData indexSymbolData = (IndexSymbolData) objM66914d;
        return indexSymbolData == null ? new IndexSymbolData(null, null, null, null, null, null, 63, null) : indexSymbolData;
    }

    /* JADX INFO: renamed from: P3 */
    public static final IndexSymbolData m38452P3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (IndexSymbolData) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final List m38453Q3(IndexPriceListFragment indexPriceListFragment, List it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        List<IndexSymbolData> data = indexPriceListFragment.m38477D3().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        List listM66558a = C27024b.m66558a(data);
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            IndexSymbolData indexSymbolData = (IndexSymbolData) it2.next();
            Iterator it3 = listM66558a.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!Intrinsics.areEqual(((IndexSymbolData) next).getSymbol(), indexSymbolData.getSymbol()));
            IndexSymbolData indexSymbolData2 = (IndexSymbolData) next;
            if (indexSymbolData2 != null) {
                indexSymbolData2.setChange(indexSymbolData.getChange());
                indexSymbolData2.setPrice(indexSymbolData.getPrice());
            }
        }
        return listM66558a;
    }

    /* JADX INFO: renamed from: R3 */
    public static final List m38454R3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: W3 */
    public static final boolean m38459W3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.startsWith$default(it.getTopic(), "/index/tickers:", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: X3 */
    public static final boolean m38460X3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final IndexPriceListFragment$adapter$2$1 m38477D3() {
        return (IndexPriceListFragment$adapter$2$1) this.f33052W.getValue();
    }

    /* JADX INFO: renamed from: E3 */
    public final C36939t m38478E3() {
        return (C36939t) this.f33050U.getValue(this, f33049Y[0]);
    }

    /* JADX INFO: renamed from: I3 */
    public final List<String> m38480I3(List<IndexSymbolData> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(CollectionsKt.chunked(list, 100, new Function1() { // from class: com.kubi.margin.index.y
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IndexPriceListFragment.m38447J3((List) obj);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M3 */
    public void m38481M3() throws Exception {
        this.f33053X.m85234g(new Action() { // from class: com.kubi.margin.index.c0
            @Override // io.reactivex.functions.Action
            public final void run() {
                IndexPriceListFragment.m38450N3(this.f33063b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_index_price_list;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        this.f33053X.m85236i(false);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        RecyclerView recyclerView;
        this.f33053X.m85236i(true);
        if (m38477D3().getData().isEmpty()) {
            showLoading();
            mo22379g(true);
            return;
        }
        C36939t c36939tM38478E3 = m38478E3();
        if (c36939tM38478E3 == null || (recyclerView = c36939tM38478E3.f81981b) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.kubi.margin.index.a0
            @Override // java.lang.Runnable
            public final void run() {
                IndexPriceListFragment.m38449L3(this.f33059b);
            }
        }, 400L);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m38477D3().m38487l()) {
            IndexPriceListFragment$adapter$2$1 indexPriceListFragment$adapter$2$1M38477D3 = m38477D3();
            C36939t c36939tM38478E3 = m38478E3();
            indexPriceListFragment$adapter$2$1M38477D3.bindToRecyclerView(c36939tM38478E3 != null ? c36939tM38478E3.f81981b : null);
        }
        C36939t c36939tM38478E4 = m38478E3();
        if (c36939tM38478E4 == null || (recyclerView = c36939tM38478E4.f81981b) == null) {
            return;
        }
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m38446H3(IndexPriceListFragment indexPriceListFragment, boolean z11, ArrayList arrayList) throws Exception {
        if (!indexPriceListFragment.isDetached() && indexPriceListFragment.getParentFragment() != null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                indexPriceListFragment.m38477D3().replaceData(arrayList);
                if (z11 && indexPriceListFragment.isShowing()) {
                    indexPriceListFragment.m38481M3();
                }
                indexPriceListFragment.showContent();
                return;
            }
            indexPriceListFragment.showEmpty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final InterfaceC46304e m38448K3() {
        return (InterfaceC46304e) C42597a.m93386b().create(InterfaceC46304e.class);
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m38449L3(IndexPriceListFragment indexPriceListFragment) {
        C36939t c36939tM38478E3;
        if (indexPriceListFragment.getView() != null && (c36939tM38478E3 = indexPriceListFragment.m38478E3()) != null && c36939tM38478E3.f81981b != null) {
            indexPriceListFragment.mo22379g(true);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m38450N3(final IndexPriceListFragment indexPriceListFragment) {
        indexPriceListFragment.getVisibleDisposable().clear();
        List<IndexSymbolData> data = indexPriceListFragment.m38477D3().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        for (String str : indexPriceListFragment.m38480I3(data)) {
            CompositeDisposable visibleDisposable = indexPriceListFragment.getVisibleDisposable();
            PublishSubject<Message> publishSubjectM85233f = indexPriceListFragment.f33053X.m85233f("/index/tickers:%s", str);
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.index.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(IndexPriceListFragment.m38459W3((Message) obj));
                }
            };
            Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.margin.index.e0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return IndexPriceListFragment.m38460X3(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.index.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IndexPriceListFragment.m38451O3((Message) obj);
                }
            };
            Observable observableBuffer = observableFilter.map(new Function() { // from class: com.kubi.margin.index.g0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return IndexPriceListFragment.m38452P3(function2, obj);
                }
            }).buffer(1200L, TimeUnit.MILLISECONDS);
            final Function1 function3 = new Function1() { // from class: com.kubi.margin.index.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IndexPriceListFragment.m38453Q3(this.f33070b, (List) obj);
                }
            };
            Observable observableObserveOn = observableBuffer.map(new Function() { // from class: com.kubi.margin.index.t
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return IndexPriceListFragment.m38454R3(function3, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function4 = new Function1() { // from class: com.kubi.margin.index.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IndexPriceListFragment.m38455S3(this.f33082b, (List) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.margin.index.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    IndexPriceListFragment.m38456T3(function4, obj);
                }
            };
            final Function1 function5 = new Function1() { // from class: com.kubi.margin.index.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IndexPriceListFragment.m38457U3((Throwable) obj);
                }
            };
            visibleDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.index.x
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    IndexPriceListFragment.m38458V3(function5, obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m38455S3(IndexPriceListFragment indexPriceListFragment, List list) {
        if (!indexPriceListFragment.isDetached() && indexPriceListFragment.getParentFragment() != null && list != null && !list.isEmpty()) {
            indexPriceListFragment.m38477D3().replaceData(list);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m38456T3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m38457U3(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m38458V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F3 */
    public final CharSequence m38479F3(Context context, String str) {
        List listEmptyList;
        List<String> listSplit = new Regex("/").split(C27041f.m66668h(str), 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                    break;
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
            break;
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        if (strArr.length > 1) {
            C27096v0 c27096v0 = new C27096v0();
            c27096v0.m66904d(strArr[0], 16);
            c27096v0.m66904d('/' + strArr[1], 12);
            c27096v0.setSpan(new ForegroundColorSpan(C27046k.m66699n(context, R$color.c_text)), 0, strArr[0].length(), 18);
            c27096v0.setSpan(new ForegroundColorSpan(C27046k.m66699n(context, R$color.c_text40)), strArr[0].length(), strArr[0].length() + strArr[1].length() + 1, 18);
            return c27096v0;
        }
        return C27041f.m66668h(str);
    }

    @Override // g10.InterfaceC37770a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: g */
    public void mo22379g(final boolean z11) {
        Boolean boolValueOf;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            boolValueOf = Boolean.valueOf(activity.isFinishing());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            return;
        }
        InterfaceC46304e.m102060a(m38445G3(), null, 1, null).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.margin.index.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                IndexPriceListFragment.m38446H3(this.f33061b, z11, (ArrayList) obj);
            }
        }, new C17645a());
    }
}
