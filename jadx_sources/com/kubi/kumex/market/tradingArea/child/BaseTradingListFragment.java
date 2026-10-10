package com.kubi.kumex.market.tradingArea.child;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.data.market.IMarketService;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.dialog.QuoteMenuDialog;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17066r;
import com.kubi.kumex.utils.Log;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.R$string;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37570e;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC41072a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: BaseTradingListFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e*\u0001\"\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010-\u001a\u00020\u000bH&J\b\u0010.\u001a\u00020\u0019H&J\n\u0010/\u001a\u0004\u0018\u000100H&J\u001e\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\u0006\u00105\u001a\u00020\u000bJ\b\u00106\u001a\u00020\u0019H\u0002J\b\u00107\u001a\u0004\u0018\u000108J \u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u00192\b\u0010=\u001a\u0004\u0018\u000108J$\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u001a\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010H\u001a\u00020:H\u0016J\b\u0010I\u001a\u00020:H\u0016J\b\u0010J\u001a\u00020:H\u0016J\b\u0010K\u001a\u00020:H\u0016J\b\u0010L\u001a\u00020:H\u0016J\b\u0010M\u001a\u00020:H\u0002J\u0018\u0010N\u001a\u00020:2\u000e\u0010O\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001eH\u0014J\b\u0010P\u001a\u00020:H\u0014J\b\u0010Q\u001a\u00020:H\u0014J\b\u0010R\u001a\u00020:H\u0004J\u0006\u0010S\u001a\u00020:J\b\u0010T\u001a\u00020:H\u0004J \u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e2\u000e\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001eH\u0002J(\u0010V\u001a\u00020:2\u0006\u0010/\u001a\u0002002\u0006\u0010G\u001a\u00020?2\u0006\u0010W\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u001fH\u0004J\u0018\u0010X\u001a\u00020:2\u0006\u0010/\u001a\u0002002\u0006\u0010Y\u001a\u000204H\u0002J\u0018\u0010\u000e\u001a\u00020:2\u0006\u0010/\u001a\u0002002\u0006\u0010W\u001a\u00020\u000bH\u0005J\u000e\u0010Z\u001a\u00020:2\u0006\u0010<\u001a\u00020\u0019J\u0006\u0010[\u001a\u00020\u0005J\b\u0010\\\u001a\u00020\u0005H\u0014J\u0018\u0010]\u001a\u00020:2\u0006\u0010/\u001a\u0002002\u0006\u0010^\u001a\u00020\u000bH\u0014J \u0010_\u001a\u00020:2\u0006\u0010/\u001a\u0002002\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000bH\u0014J\b\u0010b\u001a\u00020:H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u001c\u001a \u0012\u001c\u0012\u001a\u0012\u0006\b\u0001\u0012\u00020\u001f  *\f\u0012\u0006\b\u0001\u0012\u00020\u001f\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0017\u001a\u0004\b*\u0010+¨\u0006c"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/child/BaseTradingListFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "indexLongClick", "", "getIndexLongClick", "()I", "setIndexLongClick", "(I)V", "sortType", "getSortType", "wrapperLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getWrapperLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "wrapperLoadingView$delegate", "Lkotlin/Lazy;", "sortName", "", "getSortName", "()Ljava/lang/String;", "sortProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "", "Lcom/kubi/kumex/market/ContractObject;", "kotlin.jvm.PlatformType", "mOnScrollListener", "com/kubi/kumex/market/tradingArea/child/BaseTradingListFragment$mOnScrollListener$1", "Lcom/kubi/kumex/market/tradingArea/child/BaseTradingListFragment$mOnScrollListener$1;", "unFavoriteQuotes", "getUnFavoriteQuotes", "()Ljava/util/List;", "unFavoriteQuotes$delegate", "popup", "Lcom/kubi/kumex/dialog/QuoteMenuDialog;", "getPopup", "()Lcom/kubi/kumex/dialog/QuoteMenuDialog;", "popup$delegate", "layoutRes", "getParentPageId", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "toDisplayList", "lists", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "getType", "getTradingId", "getAvailableTradeAreaEntity", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "putArguments", "", "type", "id", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onResume", "onPause", "subscribe", "doSubscribe", "updateEmptyFavorite", DbParams.KEY_CHANNEL_RESULT, "showEmptyView", "showContent", "showLoadingView", "processorSort", "registerSortProcessor", "recheckContainsUnFavorite", "onItemLongClick", "pos", "findRealIndexInAdapterAndRemove", "quote", "resetSubscribe", "isFavorite", "needShowLoading", "onRecyclerViewScrollStateChanged", "newState", "onRecyclerViewScrolled", "dx", "dy", "onDestroyView", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseTradingListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTradingListFragment.kt\ncom/kubi/kumex/market/tradingArea/child/BaseTradingListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,473:1\n774#2:474\n865#2,2:475\n1869#2,2:477\n1869#2,2:479\n1869#2,2:481\n1869#2:483\n1870#2:485\n1869#2,2:486\n1788#2,4:488\n1#3:484\n*S KotlinDebug\n*F\n+ 1 BaseTradingListFragment.kt\ncom/kubi/kumex/market/tradingArea/child/BaseTradingListFragment\n*L\n127#1:474\n127#1:475,2\n129#1:477,2\n133#1:479,2\n427#1:481,2\n315#1:483\n315#1:485\n322#1:486,2\n338#1:488,4\n*E\n"})
public abstract class BaseTradingListFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    public boolean f29502U;

    /* JADX INFO: renamed from: V */
    public int f29503V = -1;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29504W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.tradingArea.child.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseTradingListFragment.m34504H4(this.f29544b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final BehaviorProcessor<List<? extends ContractObject>> f29505X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final C16250a f29506Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f29507Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f29508a0;

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment$a */
    /* JADX INFO: compiled from: BaseTradingListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/kumex/market/tradingArea/child/BaseTradingListFragment$mOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "onScrollStateChanged", "newState", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16250a extends RecyclerView.OnScrollListener {
        public C16250a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            BaseTradingListFragment.this.mo34560i4(recyclerView, newState);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, dx2, dy2);
            BaseTradingListFragment.this.m34561j4(recyclerView, dx2, dy2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment$b */
    /* JADX INFO: compiled from: BaseTradingListFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/market/tradingArea/child/BaseTradingListFragment$onItemLongClick$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "_pos", "", "quote", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16251b implements ItemCallBack<QuotesEntity> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView f29511b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ContractObject f29512c;

        public C16251b(RecyclerView recyclerView, ContractObject contractObject) {
            this.f29511b = recyclerView;
            this.f29512c = contractObject;
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, QuotesEntity quote) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(quote, "quote");
            if (i11 == 0 && BaseTradingListFragment.this.m34556e4() && !C27025c.m66566d(Boolean.valueOf(C37570e.m84690e(quote.getSymbol())))) {
                List<ContractObject> listM34554c4 = BaseTradingListFragment.this.m34554c4();
                BaseTradingListFragment baseTradingListFragment = BaseTradingListFragment.this;
                ContractObject contractObject = this.f29512c;
                synchronized (listM34554c4) {
                    baseTradingListFragment.m34554c4().add(contractObject);
                }
                BaseTradingListFragment.this.m34545T3(this.f29511b, quote);
            }
            if (i11 == 1) {
                BaseTradingListFragment.this.m34562l4();
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: W3 */
    public abstract String mo34548W3();

    /* JADX INFO: renamed from: f4 */
    public abstract int mo34557f4();

    /* JADX INFO: renamed from: g4 */
    public boolean mo34558g4() {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public abstract RecyclerView mo34565o4();

    /* JADX INFO: renamed from: F4 */
    public static final ArrayList m34502F4() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m34505I3(BaseTradingListFragment baseTradingListFragment, List list) {
        baseTradingListFragment.f29505X.onNext(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m34509M3(List list) {
        TracePageHelper.m42467b("load_contract_quotes");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final List m34514R3(BaseTradingListFragment baseTradingListFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<? extends ContractObject> listMo33759E4 = baseTradingListFragment.mo33759E4(it);
        baseTradingListFragment.mo33760G4(listMo33759E4);
        return listMo33759E4;
    }

    /* JADX INFO: renamed from: S3 */
    public static final List m34515S3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: k4 */
    public static final QuoteMenuDialog m34518k4(BaseTradingListFragment baseTradingListFragment) {
        Context contextRequireContext = baseTradingListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new QuoteMenuDialog(contextRequireContext, baseTradingListFragment.m34553b4() == 0, true, baseTradingListFragment.mo34548W3());
    }

    /* JADX INFO: renamed from: q4 */
    public static final Triple m34525q4(BaseTradingListFragment baseTradingListFragment, List quotes) {
        Object next;
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        if (baseTradingListFragment.m34556e4()) {
            synchronized (baseTradingListFragment.m34554c4()) {
                try {
                    for (ContractObject contractObject : baseTradingListFragment.m34554c4()) {
                        Iterator it = quotes.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(((ContractObject) next).getF29417b().getSymbol(), contractObject.getF29417b().getSymbol()));
                        TypeIntrinsics.asMutableCollection(quotes).remove((ContractObject) next);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (KuMexDepend.f30378a.m35905g().c()) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = quotes.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C27041f.m66668h(((ContractObject) it2.next()).getF29417b().getSymbol()));
                }
                RepositoryServiceLocator.f19236a.m20288g().mo24983J(arrayList);
            }
        }
        return new Triple(C17066r.m36567G(quotes, baseTradingListFragment.m34550Y3(), baseTradingListFragment.m34551Z3(), baseTradingListFragment.m34556e4()), baseTradingListFragment.m34550Y3(), Integer.valueOf(baseTradingListFragment.m34551Z3()));
    }

    /* JADX INFO: renamed from: r4 */
    public static final Triple m34527r4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Triple) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: s4 */
    public static final boolean m34529s4(BaseTradingListFragment baseTradingListFragment, Triple it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSecond(), baseTradingListFragment.m34550Y3()) && ((Number) it.getThird()).intValue() == baseTradingListFragment.m34551Z3();
    }

    /* JADX INFO: renamed from: t4 */
    public static final boolean m34531t4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: C4 */
    public void m34543C4() {
        runOnUiThread(new Function0() { // from class: com.kubi.kumex.market.tradingArea.child.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseTradingListFragment.m34499D4(this.f29521b);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: E4 */
    public List<? extends ContractObject> mo33759E4(@NotNull List<QuotesEntity> lists) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        int iM34553b4 = m34553b4();
        ArrayList arrayList = new ArrayList();
        if (KuMexDepend.f30378a.m35905g().c() || !m34556e4()) {
            Iterator<T> it = lists.iterator();
            while (it.hasNext()) {
                arrayList.add(new ContractObject(iM34553b4, (QuotesEntity) it.next()));
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : lists) {
                QuotesEntity quotesEntity = (QuotesEntity) obj;
                if (C27025c.m66566d(C37570e.m84689d(RepositoryServiceLocator.f19236a.m20288g().mo24996X(C27041f.m66668h(quotesEntity.getSymbol())), C27041f.m66668h(quotesEntity.getSymbol())))) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new ContractObject(iM34553b4, (QuotesEntity) it2.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G4 */
    public void mo33760G4(@NotNull List<? extends ContractObject> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.isEmpty() && m34556e4()) {
            RepositoryServiceLocator.f19236a.m20288g().mo24983J(CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m34544H3() {
        String strM34552a4 = (KuMexDepend.f30378a.m35905g().c() || !m34556e4()) ? m34552a4() : null;
        if (m34556e4()) {
            m34554c4().clear();
        }
        Observable observableObserveOn = IMarketService.m24859o(RepositoryServiceLocator.f19236a.m20286e(), strM34552a4, null, 2, null).observeOn(C42916f.m94126e());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradingListFragment.m34514R3(this.f29528b, (List) obj);
            }
        };
        Observable map = observableObserveOn.map(new Function() { // from class: com.kubi.kumex.market.tradingArea.child.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseTradingListFragment.m34515S3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradingListFragment.m34505I3(this.f29534b, (List) obj);
            }
        };
        Observable observableObserveOn2 = map.doOnNext(new Consumer() { // from class: com.kubi.kumex.market.tradingArea.child.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradingListFragment.m34506J3(function2, obj);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradingListFragment.m34507K3(this.f29538b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableObserveOn2.doOnSubscribe(new Consumer() { // from class: com.kubi.kumex.market.tradingArea.child.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradingListFragment.m34508L3(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradingListFragment.m34509M3((List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.market.tradingArea.child.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradingListFragment.m34510N3(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradingListFragment.m34511O3(this.f29546b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.tradingArea.child.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradingListFragment.m34513Q3(function5, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: V3, reason: from getter */
    public final int getF29503V() {
        return this.f29503V;
    }

    @NotNull
    /* JADX INFO: renamed from: X3 */
    public final QuoteMenuDialog m34549X3() {
        return (QuoteMenuDialog) this.f29508a0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c4 */
    public final List<ContractObject> m34554c4() {
        return (List) this.f29507Z.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: d4 */
    public final WrapperLoadingView m34555d4() {
        return (WrapperLoadingView) this.f29504W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF23600U() {
        return this.f29502U;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m34559h4(@NotNull RecyclerView recyclerView, @NotNull View view, int i11, @NotNull ContractObject entity) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entity, "entity");
        m34549X3().m33592x0(entity.getF29417b(), new C16251b(recyclerView, entity));
        m34549X3().m96320e0(view, 1, 0, 0, 0);
        m34568z4(recyclerView, i11);
    }

    /* JADX INFO: renamed from: i4 */
    public void mo34560i4(@NotNull RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (m34549X3().m96299I()) {
            m34549X3().m96331y();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m34561j4(@NotNull RecyclerView recyclerView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    /* JADX INFO: renamed from: m4 */
    public final void m34563m4(int i11, @NotNull String id2, @Nullable AvailableTradeAreaEntity availableTradeAreaEntity) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("putArguments:type:");
        sb2.append(i11);
        sb2.append(" , id:");
        sb2.append(id2);
        sb2.append(" , name:");
        sb2.append(availableTradeAreaEntity != null ? availableTradeAreaEntity.getDisplayName() : null);
        log.m36617c(tag, sb2.toString());
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("type", i11);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putString("data", id2);
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.putParcelable("data_1", availableTradeAreaEntity);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(mo34557f4(), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerViewMo34565o4 = mo34565o4();
        if (recyclerViewMo34565o4 != null) {
            recyclerViewMo34565o4.setOnScrollListener(this.f29506Y);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m34566p4() {
        Flowable<List<? extends ContractObject>> flowableObserveOn = this.f29505X.onBackpressureLatest().observeOn(C42916f.m94134m());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradingListFragment.m34525q4(this.f29550b, (List) obj);
            }
        };
        Flowable flowableObserveOn2 = flowableObserveOn.map(new Function() { // from class: com.kubi.kumex.market.tradingArea.child.s
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseTradingListFragment.m34527r4(function1, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseTradingListFragment.m34529s4(this.f29552b, (Triple) obj));
            }
        };
        Flowable flowableFilter = flowableObserveOn2.filter(new Predicate() { // from class: com.kubi.kumex.market.tradingArea.child.u
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseTradingListFragment.m34531t4(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradingListFragment.m34533u4(this.f29554b, (Triple) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.market.tradingArea.child.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradingListFragment.m34535v4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradingListFragment.m34537w4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.tradingArea.child.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradingListFragment.m34539x4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f29502U = z11;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m34567y4(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        log.m36617c(tag, "resetSubscribe:" + id2);
        getVisibleDisposable().clear();
        m34563m4(m34553b4(), id2, m34546U3());
        m34543C4();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: z4 */
    public final void m34568z4(@NotNull RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f29503V = i11;
        if (recyclerView.getAdapter() instanceof InterfaceC41072a) {
            Object adapter = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.kumex.market.tradingArea.adapter.AdapterData");
            Iterator<T> it = ((InterfaceC41072a) adapter).mo90050a().iterator();
            while (it.hasNext()) {
                ((ContractObject) it.next()).m34388i(this.f29503V);
            }
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
    }

    public BaseTradingListFragment() {
        BehaviorProcessor<List<? extends ContractObject>> behaviorProcessorCreate = BehaviorProcessor.create();
        Intrinsics.checkNotNullExpressionValue(behaviorProcessorCreate, "create(...)");
        this.f29505X = behaviorProcessorCreate;
        this.f29506Y = new C16250a();
        this.f29507Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.tradingArea.child.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseTradingListFragment.m34502F4();
            }
        });
        this.f29508a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.tradingArea.child.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseTradingListFragment.m34518k4(this.f29549b);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m34499D4(BaseTradingListFragment baseTradingListFragment) {
        baseTradingListFragment.m34544H3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final WrapperLoadingView m34504H4(BaseTradingListFragment baseTradingListFragment) {
        RecyclerView recyclerViewMo34565o4 = baseTradingListFragment.mo34565o4();
        if (recyclerViewMo34565o4 != null) {
            return WrapperLoadingView.injectView(recyclerViewMo34565o4);
        }
        return null;
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m34506J3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m34507K3(BaseTradingListFragment baseTradingListFragment, Disposable disposable) {
        Integer numValueOf;
        RecyclerView.Adapter adapter;
        Integer viewStatus = baseTradingListFragment.getViewStatus();
        boolean zMo34558g4 = false;
        if (viewStatus == null || viewStatus.intValue() != 2) {
            RecyclerView recyclerViewMo34565o4 = baseTradingListFragment.mo34565o4();
            if (recyclerViewMo34565o4 != null && (adapter = recyclerViewMo34565o4.getAdapter()) != null) {
                numValueOf = Integer.valueOf(adapter.getItemCount());
            } else {
                numValueOf = null;
            }
            if (C27039d.m66650j(numValueOf) <= 0) {
                zMo34558g4 = baseTradingListFragment.mo34558g4();
            }
        }
        if (zMo34558g4) {
            baseTradingListFragment.m34542B4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m34508L3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m34510N3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m34511O3(final BaseTradingListFragment baseTradingListFragment, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        WrapperLoadingView wrapperLoadingViewM34555d4 = baseTradingListFragment.m34555d4();
        if (wrapperLoadingViewM34555d4 != null) {
            wrapperLoadingViewM34555d4.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.kumex.market.tradingArea.child.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseTradingListFragment.m34512P3(this.f29548b, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m34512P3(BaseTradingListFragment baseTradingListFragment, View view) {
        baseTradingListFragment.getVisibleDisposable().clear();
        baseTradingListFragment.m34543C4();
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m34513Q3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX INFO: renamed from: u4 */
    public static final Unit m34533u4(BaseTradingListFragment baseTradingListFragment, Triple triple) {
        Object adapter;
        if (!((List) triple.getFirst()).isEmpty()) {
            Iterable iterable = (Iterable) triple.getFirst();
            int i11 = 0;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((ContractObject) it.next()) != null && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i11 != 0) {
                baseTradingListFragment.showContent();
                RecyclerView recyclerViewMo34565o4 = baseTradingListFragment.mo34565o4();
                if (recyclerViewMo34565o4 != null) {
                    adapter = recyclerViewMo34565o4.getAdapter();
                } else {
                    adapter = null;
                }
                if (adapter instanceof InterfaceC41072a) {
                    ((InterfaceC41072a) adapter).mo90051c(baseTradingListFragment.m34564n4((List) triple.getFirst()));
                }
            } else {
                baseTradingListFragment.mo33764A4();
            }
        } else {
            baseTradingListFragment.mo33764A4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m34535v4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m34537w4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "BaseTradingListFragment-sortProcessor");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m34539x4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A4 */
    public void mo33764A4() {
        WrapperLoadingView wrapperLoadingViewM34555d4 = m34555d4();
        if (wrapperLoadingViewM34555d4 != null) {
            wrapperLoadingViewM34555d4.showEmpty(com.kubi.kumex.R$string.no_more_data, com.kubi.kumex.R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final void m34542B4() {
        WrapperLoadingView wrapperLoadingViewM34555d4 = m34555d4();
        if (wrapperLoadingViewM34555d4 != null) {
            wrapperLoadingViewM34555d4.showLoading(17, 0);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m34545T3(RecyclerView recyclerView, QuotesEntity quotesEntity) {
        if (recyclerView.getAdapter() instanceof InterfaceC41072a) {
            Object adapter = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.kumex.market.tradingArea.adapter.AdapterData");
            InterfaceC41072a interfaceC41072a = (InterfaceC41072a) adapter;
            List<ContractObject> listMo90050a = interfaceC41072a.mo90050a();
            int size = listMo90050a.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (Intrinsics.areEqual(listMo90050a.get(i11).getF29417b().getSymbol(), quotesEntity.getSymbol())) {
                    interfaceC41072a.removeItem(i11);
                    return;
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: U3 */
    public final AvailableTradeAreaEntity m34546U3() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (AvailableTradeAreaEntity) arguments.getParcelable("data_1");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: Y3 */
    public final String m34550Y3() {
        BaseTradingAreaFragment baseTradingAreaFragment;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof BaseTradingAreaFragment) {
            baseTradingAreaFragment = (BaseTradingAreaFragment) parentFragment;
        } else {
            baseTradingAreaFragment = null;
        }
        if (baseTradingAreaFragment == null) {
            return null;
        }
        return baseTradingAreaFragment.getF29467U();
    }

    /* JADX INFO: renamed from: Z3 */
    public final int m34551Z3() {
        BaseTradingAreaFragment baseTradingAreaFragment;
        Fragment parentFragment = getParentFragment();
        Integer numValueOf = null;
        if (parentFragment instanceof BaseTradingAreaFragment) {
            baseTradingAreaFragment = (BaseTradingAreaFragment) parentFragment;
        } else {
            baseTradingAreaFragment = null;
        }
        if (baseTradingAreaFragment != null) {
            numValueOf = Integer.valueOf(baseTradingAreaFragment.getF29468V());
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: a4 */
    public final String m34552a4() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("data", "");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: b4 */
    public final int m34553b4() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("type");
        }
        return 0;
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m34556e4() {
        return Intrinsics.areEqual(m34552a4(), "favor");
    }

    /* JADX INFO: renamed from: l4 */
    public final void m34562l4() {
        List<? extends ContractObject> value;
        if (isAdded() && !isDetached() && isShowing() && (value = this.f29505X.getValue()) != null && !value.isEmpty()) {
            this.f29505X.onNext(value);
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final List<? extends ContractObject> m34564n4(List<? extends ContractObject> list) {
        if (!m34556e4()) {
            return list;
        }
        Iterator<? extends ContractObject> it = list.iterator();
        synchronized (m34554c4()) {
            try {
                if (!m34554c4().isEmpty()) {
                    while (it.hasNext()) {
                        ContractObject next = it.next();
                        Iterator<ContractObject> it2 = m34554c4().iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(it2.next().getF29417b().getSymbol(), next.getF29417b().getSymbol())) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        String displayName = null;
        if (m34549X3().m96299I()) {
            m34549X3().m96315Y(null);
            m34549X3().m96331y();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDestroyView->hashCode:");
        sb2.append(hashCode());
        sb2.append(" , name:");
        AvailableTradeAreaEntity availableTradeAreaEntityM34546U3 = m34546U3();
        if (availableTradeAreaEntityM34546U3 != null) {
            displayName = availableTradeAreaEntityM34546U3.getDisplayName();
        }
        sb2.append(displayName);
        C44128b.m97259c("BaseTradingListFragment", sb2.toString());
        super.onDestroyView();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m34549X3().m96331y();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        String displayName;
        super.onPause();
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPause->hashCode:");
        sb2.append(hashCode());
        sb2.append(" , name:");
        AvailableTradeAreaEntity availableTradeAreaEntityM34546U3 = m34546U3();
        if (availableTradeAreaEntityM34546U3 != null) {
            displayName = availableTradeAreaEntityM34546U3.getDisplayName();
        } else {
            displayName = null;
        }
        sb2.append(displayName);
        log.m36617c(tag, sb2.toString());
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        String displayName;
        super.onResume();
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onResume->hashCode:");
        sb2.append(hashCode());
        sb2.append(" , name:");
        AvailableTradeAreaEntity availableTradeAreaEntityM34546U3 = m34546U3();
        if (availableTradeAreaEntityM34546U3 != null) {
            displayName = availableTradeAreaEntityM34546U3.getDisplayName();
        } else {
            displayName = null;
        }
        sb2.append(displayName);
        log.m36617c(tag, sb2.toString());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m34543C4();
    }

    public void showContent() {
        WrapperLoadingView wrapperLoadingViewM34555d4 = m34555d4();
        if (wrapperLoadingViewM34555d4 != null) {
            wrapperLoadingViewM34555d4.showContent();
        }
    }
}
