package com.kubi.quotefacade.favorites.recommend;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4680m;
import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.RecommendItemBean;
import com.kubi.quotefacade.entity.WsFutureSnapshotEntity;
import com.kubi.quotefacade.event.RecommendCommonContract$UiIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p212dv.C36982v;
import p212dv.C36983w;
import p212dv.C36984x;
import p569qq.C43852m;
import p671uq.C45290a;
import p809yu.C46570c0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: RecommendCommonFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\f\u0010#\u001a\u0006\u0012\u0002\b\u00030$H\u0002J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020\u000eH&J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020)H\u0016J\b\u0010/\u001a\u00020)H\u0016J\b\u00100\u001a\u00020)H\u0016J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u00020)H\u0015J\b\u00105\u001a\u00020)H\u0002J\u0018\u00106\u001a\u00020)2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u000108H\u0002J\b\u00109\u001a\u00020)H\u0002J\u0016\u0010:\u001a\u00020)2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<08H\u0007J\u0016\u0010=\u001a\u00020)2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?08H\u0007J\u0018\u0010@\u001a\u00020)2\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B08H\u0007J\b\u0010C\u001a\u00020)H\u0002J\b\u0010D\u001a\u00020)H\u0002J\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020FH\u0002J\b\u0010H\u001a\u00020)H\u0002J\u0010\u0010I\u001a\u00020)2\u0006\u0010J\u001a\u00020\u000eH\u0002J\b\u0010K\u001a\u00020)H\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010!¨\u0006L"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/quotefacade/event/RecommendCommonContract$UiIntent;", "Lcom/kubi/quotefacade/event/RecommendCommonContract$UIState;", "Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonViewModel;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentCommonRecommendBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/FragmentCommonRecommendBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "favType", "getFavType", "()I", "favType$delegate", "Lkotlin/Lazy;", "originDataList", "Ljava/util/ArrayList;", "Lcom/kubi/quotefacade/entity/RecommendItemBean;", "Lkotlin/collections/ArrayList;", "heightNotifyRunnable", "Ljava/lang/Runnable;", "adapter", "Lcom/kubi/sdk/BaseAdapter;", "getAdapter", "()Lcom/kubi/sdk/BaseAdapter;", "adapter$delegate", "getItemProxy", "Ljava/lang/Class;", "getCurrentPageId", "", "getSymbolType", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "showLoading", "showContent", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "initRecyclerView", "showRecommendList", "itemBeanList", "", "showRecommendEmptyView", "dealWsAlphaDataAndRefresh", "wsHoldingsList", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "dealWsSpotDataAndRefresh", "wsSpotList", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "dealWsFutureDataAndRefresh", "wsFutureList", "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "initViewForHomeRank", "clickCollection", "isHomeRank", "", "isAlphaFavTab", "jumpToMarket", "notifyHeightForHome", "listItemCount", "onDestroyView", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendCommonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendCommonFragment.kt\ncom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,443:1\n147#2,16:444\n1869#3,2:460\n1869#3,2:462\n1869#3,2:464\n1869#3,2:466\n1869#3,2:468\n1869#3,2:470\n1#4:472\n46#5,14:473\n347#6:487\n347#6:488\n*S KotlinDebug\n*F\n+ 1 RecommendCommonFragment.kt\ncom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment\n*L\n65#1:444,16\n249#1:460,2\n252#1:462,2\n270#1:464,2\n276#1:466,2\n294#1:468,2\n301#1:470,2\n356#1:473,14\n420#1:487\n423#1:488\n*E\n"})
public abstract class RecommendCommonFragment extends BaseStateFragment<RecommendCommonContract$UiIntent, UIState, RecommendCommonViewModel> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f41853Z = {Reflection.property1(new PropertyReference1Impl(RecommendCommonFragment.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/FragmentCommonRecommendBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @Nullable
    public Runnable f41857X;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41854U = C45681e.m100799e(this, new Function1<RecommendCommonFragment, C4680m>() { // from class: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4680m invoke(@NotNull RecommendCommonFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4680m.m4672a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4680m, Unit>() { // from class: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4680m it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4680m c4680m) {
            invoke(c4680m);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f41855V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(RecommendCommonFragment.m51643J3(this.f41870b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ArrayList<RecommendItemBean> f41856W = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f41858Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecommendCommonFragment.m51639C3(this.f41871b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$a */
    /* JADX INFO: compiled from: RecommendCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/quotefacade/favorites/recommend/RecommendCommonFragment$adapter$2$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/quotefacade/entity/RecommendItemBean;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22062a implements ItemCallBack<RecommendItemBean> {
        public C22062a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, RecommendItemBean data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            RecommendCommonFragment.this.sendIntent(new RecommendCommonContract$UiIntent.ChangeSelectState(C27041f.m66668h(data.getSymbolCode())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$bindState$2 */
    /* JADX INFO: compiled from: RecommendCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "list", "", "Lcom/kubi/quotefacade/entity/RecommendItemBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$bindState$2", m90122f = "RecommendCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C220642 extends SuspendLambda implements Function2<List<? extends RecommendItemBean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RecommendItemBean> list, Continuation<? super Unit> continuation) {
            return invoke2((List<RecommendItemBean>) list, continuation);
        }

        public C220642(Continuation<? super C220642> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C220642 c220642 = RecommendCommonFragment.this.new C220642(continuation);
            c220642.L$0 = obj;
            return c220642;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RecommendItemBean> list, Continuation<? super Unit> continuation) {
            return ((C220642) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                RecommendCommonFragment.this.f41856W.clear();
                RecommendCommonFragment.this.f41856W.addAll(list);
                RecommendCommonFragment.this.showContent();
                RecommendCommonFragment.this.m51677c4(list);
                RecommendCommonFragment.this.m51675V3(list.size());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$bindState$4 */
    /* JADX INFO: compiled from: RecommendCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$bindState$4", m90122f = "RecommendCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C220664 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C220664(Continuation<? super C220664> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C220664 c220664 = RecommendCommonFragment.this.new C220664(continuation);
            c220664.L$0 = obj;
            return c220664;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C220664) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            View view;
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                RecommendCommonFragment.this.showContent();
                RecommendCommonFragment.this.m51676Z3();
                if (RecommendCommonFragment.this.m51673T3() && (view = RecommendCommonFragment.this.getView()) != null) {
                    C22218w1.m52126f(view, RecommendCommonFragment.this.getParentFragment(), Boxing.boxInt(C27040e.m66658b(357)), null, 4, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$bindState$6 */
    /* JADX INFO: compiled from: RecommendCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "size", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment$bindState$6", m90122f = "RecommendCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C220686 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C220686) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C220686(Continuation<? super C220686> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C220686 c220686 = RecommendCommonFragment.this.new C220686(continuation);
            c220686.I$0 = ((Number) obj).intValue();
            return c220686;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KcPrimaryButton kcPrimaryButton;
            KcPrimaryButton kcPrimaryButton2;
            int i11 = this.I$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4680m c4680mM51671L3 = RecommendCommonFragment.this.m51671L3();
            if (c4680mM51671L3 != null && (kcPrimaryButton2 = c4680mM51671L3.f4432c) != null) {
                kcPrimaryButton2.setEnabled(i11 != 0);
            }
            C4680m c4680mM51671L4 = RecommendCommonFragment.this.m51671L3();
            if (c4680mM51671L4 != null && (kcPrimaryButton = c4680mM51671L4.f4432c) != null) {
                kcPrimaryButton.setText(RecommendCommonFragment.this.getStringRes(R$string.market_add_self_choose, new Object[0]) + '(' + i11 + ')');
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: M3 */
    public abstract String mo51543M3();

    /* JADX INFO: renamed from: P3 */
    public abstract int mo51544P3();

    /* JADX INFO: renamed from: C3 */
    public static final BaseAdapter m51639C3(RecommendCommonFragment recommendCommonFragment) {
        return BaseAdapter.a.m57323c(new BaseAdapter.a().m57327e(recommendCommonFragment), RecommendItemBean.class, recommendCommonFragment.m51672O3(), recommendCommonFragment.new C22062a(), null, 8, null).m57324a();
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m51641E3(RecommendCommonFragment recommendCommonFragment) throws JSONException {
        recommendCommonFragment.sendIntent(new RecommendCommonContract$UiIntent.AddFavorSymbol(Integer.valueOf(recommendCommonFragment.m51644N3())));
        String strMo51543M3 = recommendCommonFragment.mo51543M3();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", recommendCommonFragment.m51673T3() ? "home" : "markets");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strMo51543M3, "add", "1", jSONObject);
        if ("B5markets_fav_add".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(B5markets_fav_add) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42381b("type", recommendCommonFragment.m51644N3());
            C45290a.f101823a.m100101b("B5markets_fav_add", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public final int m51644N3() {
        return ((Number) this.f41855V.getValue()).intValue();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: G3 */
    public final void m51667G3(@NotNull List<WsAlphaSnapshotEntity> wsHoldingsList) {
        Intrinsics.checkNotNullParameter(wsHoldingsList, "wsHoldingsList");
        HashMap map = new HashMap();
        for (WsAlphaSnapshotEntity wsAlphaSnapshotEntity : wsHoldingsList) {
            map.put(wsAlphaSnapshotEntity.getTokenBridgeId(), wsAlphaSnapshotEntity);
        }
        for (RecommendItemBean recommendItemBean : this.f41856W) {
            AlphaItemEntity alphaItemEntity = recommendItemBean.getAlphaItemEntity();
            WsAlphaSnapshotEntity wsAlphaSnapshotEntity2 = (WsAlphaSnapshotEntity) map.get(alphaItemEntity != null ? alphaItemEntity.getTokenBridgeId() : null);
            if (wsAlphaSnapshotEntity2 != null) {
                AlphaItemEntity alphaItemEntity2 = recommendItemBean.getAlphaItemEntity();
                if (alphaItemEntity2 != null) {
                    alphaItemEntity2.setPrice(wsAlphaSnapshotEntity2.getPrice());
                }
                AlphaItemEntity alphaItemEntity3 = recommendItemBean.getAlphaItemEntity();
                if (alphaItemEntity3 != null) {
                    alphaItemEntity3.setPriceRate(wsAlphaSnapshotEntity2.getPriceRate());
                }
                AlphaItemEntity alphaItemEntity4 = recommendItemBean.getAlphaItemEntity();
                if (alphaItemEntity4 != null) {
                    alphaItemEntity4.setTradingVolume(wsAlphaSnapshotEntity2.getTradingVolume());
                }
            }
        }
        m51677c4(this.f41856W);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: H3 */
    public final void m51668H3(@NotNull List<WsFutureSnapshotEntity> wsFutureList) {
        String symbol;
        Intrinsics.checkNotNullParameter(wsFutureList, "wsFutureList");
        HashMap map = new HashMap();
        for (WsFutureSnapshotEntity wsFutureSnapshotEntity : wsFutureList) {
            if (wsFutureSnapshotEntity != null && (symbol = wsFutureSnapshotEntity.getSymbol()) != null && symbol.length() != 0) {
                map.put(wsFutureSnapshotEntity.getSymbol(), wsFutureSnapshotEntity);
            }
        }
        for (RecommendItemBean recommendItemBean : this.f41856W) {
            WsFutureSnapshotEntity wsFutureSnapshotEntity2 = (WsFutureSnapshotEntity) map.get(recommendItemBean.getSymbolCode());
            if (wsFutureSnapshotEntity2 != null) {
                recommendItemBean.setSymbolCode(wsFutureSnapshotEntity2.getSymbol());
                recommendItemBean.setLastDealPrice(new BigDecimal(String.valueOf(wsFutureSnapshotEntity2.getLastPrice())));
                recommendItemBean.setChangeRate(new BigDecimal(String.valueOf(wsFutureSnapshotEntity2.getPriceChgPct())));
            }
        }
        m51677c4(this.f41856W);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: I3 */
    public final void m51669I3(@NotNull List<WsMarketSnapshotEntity> wsSpotList) {
        Intrinsics.checkNotNullParameter(wsSpotList, "wsSpotList");
        HashMap map = new HashMap();
        for (WsMarketSnapshotEntity wsMarketSnapshotEntity : wsSpotList) {
            if (wsMarketSnapshotEntity != null && wsMarketSnapshotEntity.getSymbolCode() != null) {
                map.put(wsMarketSnapshotEntity.getSymbolCode(), wsMarketSnapshotEntity);
            }
        }
        for (RecommendItemBean recommendItemBean : this.f41856W) {
            WsMarketSnapshotEntity wsMarketSnapshotEntity2 = (WsMarketSnapshotEntity) map.get(recommendItemBean.getSymbolCode());
            if (wsMarketSnapshotEntity2 != null) {
                recommendItemBean.setSymbolCode(wsMarketSnapshotEntity2.getSymbolCode());
                recommendItemBean.setLastDealPrice(new BigDecimal(String.valueOf(wsMarketSnapshotEntity2.getLastTradedPrice())));
                recommendItemBean.setChangeRate(new BigDecimal(String.valueOf(wsMarketSnapshotEntity2.getChangeRate())));
            }
        }
        m51677c4(this.f41856W);
    }

    /* JADX INFO: renamed from: K3 */
    public final BaseAdapter<RecommendItemBean> m51670K3() {
        return (BaseAdapter) this.f41858Y.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: L3 */
    public final C4680m m51671L3() {
        return (C4680m) this.f41854U.getValue(this, f41853Z[0]);
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m51676Z3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendCommonFragment.m51651a4(this.f41869b);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        C36982v c36982v;
        List<WsAlphaSnapshotEntity> listM82800a;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C36984x) {
            C36984x c36984x = (C36984x) singleEvent;
            List<WsMarketSnapshotEntity> listM82802a = c36984x.m82802a();
            if (listM82802a == null || listM82802a.isEmpty()) {
                return;
            }
            m51669I3(c36984x.m82802a());
            return;
        }
        if (!(singleEvent instanceof C36983w)) {
            if (!(singleEvent instanceof C36982v) || (listM82800a = (c36982v = (C36982v) singleEvent).m82800a()) == null || listM82800a.isEmpty()) {
                return;
            }
            m51667G3(c36982v.m82800a());
            return;
        }
        C36983w c36983w = (C36983w) singleEvent;
        List<WsFutureSnapshotEntity> listM82801a = c36983w.m82801a();
        if (listM82801a == null || listM82801a.isEmpty()) {
            return;
        }
        m51668H3(c36983w.m82801a());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_common_recommend;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends RecommendCommonViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RecommendCommonViewModel.class);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View viewFindViewById;
        this.f41856W.clear();
        Runnable runnable = this.f41857X;
        if (runnable != null && (viewFindViewById = findViewById(R$id.fl_container)) != null) {
            viewFindViewById.removeCallbacks(runnable);
        }
        this.f41857X = null;
        super.onDestroyView();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m51645Q3();
        m51646R3();
        m51640D3();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendCommonFragment.m51649X3(this.f41872b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendCommonFragment.m51650Y3(this.f41873b);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    private final void m51640D3() {
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        C4680m c4680mM51671L3 = m51671L3();
        if (c4680mM51671L3 != null && (kcPrimaryButton = c4680mM51671L3.f4432c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendCommonFragment.m51641E3(this.f41867b);
                }
            }, 1, null);
        }
        C4680m c4680mM51671L4 = m51671L3();
        if (c4680mM51671L4 != null && (baseTextView = c4680mM51671L4.f4431b) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendCommonFragment.m51642F3(this.f41868b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m51642F3(RecommendCommonFragment recommendCommonFragment) throws JSONException {
        String str;
        recommendCommonFragment.m51674U3();
        String strMo51543M3 = recommendCommonFragment.mo51543M3();
        JSONObject jSONObject = new JSONObject();
        if (recommendCommonFragment.m51673T3()) {
            str = "home";
        } else {
            str = "markets";
        }
        jSONObject.put("type", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strMo51543M3, "other", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final int m51643J3(RecommendCommonFragment recommendCommonFragment) {
        return recommendCommonFragment.mo51544P3();
    }

    /* JADX INFO: renamed from: Q3 */
    private final void m51645Q3() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        int i11;
        int i12;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        C4680m c4680mM51671L3 = m51671L3();
        if (c4680mM51671L3 != null && (recyclerView4 = c4680mM51671L3.f4440k) != null) {
            recyclerView4.setAdapter(m51670K3());
        }
        Context context = getContext();
        if (context != null) {
            C4680m c4680mM51671L4 = m51671L3();
            if (c4680mM51671L4 != null && (recyclerView3 = c4680mM51671L4.f4440k) != null) {
                recyclerView3.setLayoutManager(new GridLayoutManager(context, 2));
            }
            C4680m c4680mM51671L5 = m51671L3();
            if (c4680mM51671L5 != null && (recyclerView = c4680mM51671L5.f4440k) != null && recyclerView.getItemDecorationCount() == 0) {
                boolean zM51673T3 = m51673T3();
                C4680m c4680mM51671L6 = m51671L3();
                if (c4680mM51671L6 != null && (recyclerView2 = c4680mM51671L6.f4440k) != null) {
                    if (zM51673T3) {
                        i11 = 16;
                    } else {
                        i11 = 12;
                    }
                    int iM66658b = C27040e.m66658b(i11);
                    if (zM51673T3) {
                        i12 = 7;
                    } else {
                        i12 = 8;
                    }
                    recyclerView2.addItemDecoration(new C46570c0(2, iM66658b, C27040e.m66658b(i12)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: R3 */
    private final void m51646R3() {
        BaseTextView baseTextView;
        C4680m c4680mM51671L3;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (!m51673T3()) {
            if (m51644N3() == 2) {
                C4680m c4680mM51671L4 = m51671L3();
                if (c4680mM51671L4 != null && (baseTextView3 = c4680mM51671L4.f4439j) != null) {
                    baseTextView3.setText(getString(R$string.no_add_favorites_recommend_contract));
                }
            } else {
                C4680m c4680mM51671L5 = m51671L3();
                if (c4680mM51671L5 != null && (baseTextView = c4680mM51671L5.f4439j) != null) {
                    baseTextView.setText(getString(R$string.kc_spot_trade_may_like));
                }
            }
            if (m51647S3() && (c4680mM51671L3 = m51671L3()) != null && (baseTextView2 = c4680mM51671L3.f4439j) != null) {
                ViewExtKt.m66585p(baseTextView2, 0, C27040e.m66658b(12), 0, 0, 13, null);
                return;
            }
            return;
        }
        C4680m c4680mM51671L6 = m51671L3();
        if (c4680mM51671L6 == null) {
            return;
        }
        Group groupRecommendText = c4680mM51671L6.f4437h;
        Intrinsics.checkNotNullExpressionValue(groupRecommendText, "groupRecommendText");
        C27046k.m66700o(groupRecommendText);
        int iM66658b = C27040e.m66658b(12);
        RecyclerView recyclerView = c4680mM51671L6.f4440k;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.m66584o(recyclerView, iM66658b, C27040e.m66658b(16), iM66658b, 0);
        KcPrimaryButton addRecommend = c4680mM51671L6.f4432c;
        Intrinsics.checkNotNullExpressionValue(addRecommend, "addRecommend");
        ViewExtKt.m66584o(addRecommend, iM66658b, C27040e.m66658b(12), iM66658b, 0);
        ImageView ivEmpty = c4680mM51671L6.f4438i;
        Intrinsics.checkNotNullExpressionValue(ivEmpty, "ivEmpty");
        ViewExtKt.m66585p(ivEmpty, 0, C27040e.m66658b(32), 0, 0, 13, null);
    }

    /* JADX INFO: renamed from: S3 */
    private final boolean m51647S3() {
        if (m51644N3() != 6 && m51644N3() != 7) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m51648W3(RecommendCommonFragment recommendCommonFragment, int i11) {
        View childAt;
        int measuredHeight;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RecyclerView recyclerView;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i12;
        RecyclerView recyclerView2;
        RecyclerView.LayoutManager layoutManager;
        if (recommendCommonFragment.isAdded() && !recommendCommonFragment.isDetached() && recommendCommonFragment.m51671L3() != null) {
            int i13 = (int) (((double) (i11 / 2.0f)) + 0.5d);
            int i14 = 0;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i13 - 1, 0) * C27040e.m66658b(12);
            C4680m c4680mM51671L3 = recommendCommonFragment.m51671L3();
            Integer numValueOf4 = null;
            if (c4680mM51671L3 != null && (recyclerView2 = c4680mM51671L3.f4440k) != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                childAt = layoutManager.getChildAt(0);
            } else {
                childAt = null;
            }
            if (childAt != null) {
                measuredHeight = childAt.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            int i15 = measuredHeight * i13;
            C4680m c4680mM51671L4 = recommendCommonFragment.m51671L3();
            if (c4680mM51671L4 != null && (recyclerView = c4680mM51671L4.f4440k) != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams2 = null;
                }
                if (marginLayoutParams2 != null) {
                    i12 = marginLayoutParams2.topMargin;
                } else {
                    i12 = 0;
                }
                numValueOf = Integer.valueOf(i12);
            } else {
                numValueOf = null;
            }
            int iM66650j = C27039d.m66650j(numValueOf);
            C4680m c4680mM51671L5 = recommendCommonFragment.m51671L3();
            if (c4680mM51671L5 != null && (kcPrimaryButton2 = c4680mM51671L5.f4432c) != null) {
                ViewGroup.LayoutParams layoutParams2 = kcPrimaryButton2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    i14 = marginLayoutParams.topMargin;
                }
                numValueOf2 = Integer.valueOf(i14);
            } else {
                numValueOf2 = null;
            }
            int iM66650j2 = C27039d.m66650j(numValueOf2);
            C4680m c4680mM51671L6 = recommendCommonFragment.m51671L3();
            if (c4680mM51671L6 != null && (kcPrimaryButton = c4680mM51671L6.f4432c) != null) {
                numValueOf3 = Integer.valueOf(kcPrimaryButton.getMeasuredHeight());
            } else {
                numValueOf3 = null;
            }
            int iM66650j3 = iM66650j2 + C27039d.m66650j(numValueOf3);
            C4680m c4680mM51671L7 = recommendCommonFragment.m51671L3();
            if (c4680mM51671L7 != null && (baseTextView = c4680mM51671L7.f4431b) != null) {
                numValueOf4 = Integer.valueOf(baseTextView.getMeasuredHeight());
            }
            int iM66650j4 = iCoerceAtLeast + i15 + iM66650j + iM66650j3 + C27039d.m66650j(numValueOf4);
            C4680m c4680mM51671L8 = recommendCommonFragment.m51671L3();
            if (c4680mM51671L8 != null && (constraintLayout = c4680mM51671L8.f4434e) != null) {
                C22218w1.m52126f(constraintLayout, recommendCommonFragment.getParentFragment(), Integer.valueOf(iM66650j4), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m51649X3(RecommendCommonFragment recommendCommonFragment) {
        C4680m c4680mM51671L3 = recommendCommonFragment.m51671L3();
        if (c4680mM51671L3 == null) {
            return Unit.INSTANCE;
        }
        RankShimmer rsLoading = c4680mM51671L3.f4441l;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        C27046k.m66700o(rsLoading);
        c4680mM51671L3.f4441l.m53323f();
        NestedScrollView scrollContent = c4680mM51671L3.f4442m;
        Intrinsics.checkNotNullExpressionValue(scrollContent, "scrollContent");
        C27046k.m66685H(scrollContent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m51650Y3(RecommendCommonFragment recommendCommonFragment) {
        int iM66658b;
        C4680m c4680mM51671L3 = recommendCommonFragment.m51671L3();
        if (c4680mM51671L3 == null) {
            return Unit.INSTANCE;
        }
        NestedScrollView scrollContent = c4680mM51671L3.f4442m;
        Intrinsics.checkNotNullExpressionValue(scrollContent, "scrollContent");
        C27046k.m66700o(scrollContent);
        RankShimmer rankShimmer = c4680mM51671L3.f4441l;
        ViewGroup.LayoutParams layoutParams = rankShimmer.getLayoutParams();
        if (recommendCommonFragment.m51673T3()) {
            iM66658b = C27040e.m66658b(320);
        } else {
            iM66658b = -1;
        }
        layoutParams.height = iM66658b;
        rankShimmer.setLayoutParams(layoutParams);
        c4680mM51671L3.f4441l.m53322e();
        RankShimmer rsLoading = c4680mM51671L3.f4441l;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        C27046k.m66685H(rsLoading);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m51651a4(final RecommendCommonFragment recommendCommonFragment) {
        KcPrimaryButton kcPrimaryButton;
        Group group;
        Group group2;
        Group group3;
        C4680m c4680mM51671L3 = recommendCommonFragment.m51671L3();
        if (c4680mM51671L3 != null && (group3 = c4680mM51671L3.f4435f) != null) {
            C27046k.m66700o(group3);
        }
        C4680m c4680mM51671L4 = recommendCommonFragment.m51671L3();
        if (c4680mM51671L4 != null && (group2 = c4680mM51671L4.f4437h) != null) {
            C27046k.m66700o(group2);
        }
        C4680m c4680mM51671L5 = recommendCommonFragment.m51671L3();
        if (c4680mM51671L5 != null && (group = c4680mM51671L5.f4436g) != null) {
            C27046k.m66685H(group);
        }
        C4680m c4680mM51671L6 = recommendCommonFragment.m51671L3();
        if (c4680mM51671L6 != null && (kcPrimaryButton = c4680mM51671L6.f4433d) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendCommonFragment.m51652b4(this.f41876b);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m51652b4(RecommendCommonFragment recommendCommonFragment) {
        recommendCommonFragment.m51674U3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public final Class<?> m51672O3() {
        if (m51647S3() && m51673T3()) {
            return RecommendRecyclerAlphaHomeItemProxy.class;
        }
        if (m51647S3()) {
            return RecommendRecyclerAlphaItemProxy.class;
        }
        if (m51673T3()) {
            return RecommendRecyclerHomeItemProxy.class;
        }
        return RecommendRecyclerItemProxy.class;
    }

    /* JADX INFO: renamed from: T3 */
    public final boolean m51673T3() {
        return C22218w1.m52123c(getArguments());
    }

    /* JADX INFO: renamed from: U3 */
    public final void m51674U3() {
        Pair pairM90091to;
        int iM51644N3 = m51644N3();
        if (iM51644N3 != 1) {
            if (iM51644N3 != 2) {
                if (iM51644N3 != 3) {
                    if (iM51644N3 != 6) {
                        if (iM51644N3 != 7) {
                            pairM90091to = TuplesKt.m90091to(QuoteMainTab.MARKET, "");
                        } else {
                            pairM90091to = TuplesKt.m90091to(QuoteMainTab.ALPHA, "chain_area");
                        }
                    } else {
                        pairM90091to = TuplesKt.m90091to(QuoteMainTab.ALPHA, "highlights");
                    }
                } else {
                    pairM90091to = TuplesKt.m90091to(QuoteMainTab.MARKET, "etf");
                }
            } else {
                pairM90091to = TuplesKt.m90091to(QuoteMainTab.MARKET, SearchCategory$Companion.FUTURES);
            }
        } else {
            pairM90091to = TuplesKt.m90091to(QuoteMainTab.MARKET, SearchCategory$Companion.SPOT);
        }
        InterfaceC37754f.a.m85138j(C37304a.f82764a, ((QuoteMainTab) pairM90091to.getFirst()).getType(), (String) pairM90091to.getSecond(), null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m51675V3(final int i11) {
        ConstraintLayout constraintLayout;
        C4680m c4680mM51671L3;
        ConstraintLayout constraintLayout2;
        if (m51673T3() && i11 > 0) {
            Runnable runnable = this.f41857X;
            if (runnable != null && (c4680mM51671L3 = m51671L3()) != null && (constraintLayout2 = c4680mM51671L3.f4434e) != null) {
                constraintLayout2.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: com.kubi.quotefacade.favorites.recommend.i
                @Override // java.lang.Runnable
                public final void run() {
                    RecommendCommonFragment.m51648W3(this.f41874b, i11);
                }
            };
            this.f41857X = runnable2;
            C4680m c4680mM51671L4 = m51671L3();
            if (c4680mM51671L4 != null && (constraintLayout = c4680mM51671L4.f4434e) != null) {
                C22912t.m54416n(constraintLayout, runnable2);
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"SetTextI18n"})
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRecommendBeanList();
            }
        }, new C220642(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getEmpty();
            }
        }, new C220664(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((UIState) obj).getSelectSize());
            }
        }, new C220686(null));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m51677c4(List<RecommendItemBean> list) {
        List<RecommendItemBean> mutableList;
        Group group;
        Group group2;
        Group group3;
        C4680m c4680mM51671L3 = m51671L3();
        if (c4680mM51671L3 != null && (group3 = c4680mM51671L3.f4435f) != null) {
            C27046k.m66685H(group3);
        }
        C4680m c4680mM51671L4 = m51671L3();
        if (c4680mM51671L4 != null && (group2 = c4680mM51671L4.f4437h) != null) {
            C27046k.m66685H(group2);
        }
        C4680m c4680mM51671L5 = m51671L3();
        if (c4680mM51671L5 != null && (group = c4680mM51671L5.f4436g) != null) {
            C27046k.m66700o(group);
        }
        m51646R3();
        BaseAdapter<RecommendItemBean> baseAdapterM51670K3 = m51670K3();
        if (list != null) {
            mutableList = CollectionsKt.toMutableList((Collection) list);
        } else {
            mutableList = null;
        }
        baseAdapterM51670K3.mo32194p(mutableList);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        Integer numValueOf;
        super.onShow();
        if (this.f41856W.isEmpty()) {
            showLoading();
        }
        sendIntent(new RecommendCommonContract$UiIntent.FetchRecommendData(Integer.valueOf(m51644N3())));
        List<RecommendItemBean> data = m51670K3().getData();
        if (data != null) {
            numValueOf = Integer.valueOf(data.size());
        } else {
            numValueOf = null;
        }
        int iM66650j = C27039d.m66650j(numValueOf);
        if (iM66650j > 0) {
            m51675V3(iM66650j);
        }
    }
}
