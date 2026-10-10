package com.kubi.operation.lib.topic.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.operation.api.entity.SearchTopicCurrency;
import com.kubi.operation.api.entity.SearchTopicEntity;
import com.kubi.operation.api.entity.SearchTopicScrollInfo;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$mipmap;
import com.kubi.operation.lib.R$string;
import com.kubi.operation.lib.entity.TopicCoinWsEntity;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p701vs.C45628e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SearchTopicFragment.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0019H\u0014J\u0012\u0010\"\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010#H\u0007J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m90084d2 = {"Lcom/kubi/operation/lib/topic/search/SearchTopicFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/operation/lib/topic/search/SearchTopicIS$SearchTopicState;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "Lcom/kubi/operation/lib/databinding/OperationFragmentSearchTopicBinding;", "getBinding", "()Lcom/kubi/operation/lib/databinding/OperationFragmentSearchTopicBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/operation/lib/topic/search/SearchTopicVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderViewData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/api/entity/SearchTopicEntity;", "bindState", "refreshView", "Lcom/kubi/operation/lib/entity/TopicCoinWsEntity;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchTopicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchTopicFragment.kt\ncom/kubi/operation/lib/topic/search/SearchTopicFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n147#2,16:124\n1#3:140\n*S KotlinDebug\n*F\n+ 1 SearchTopicFragment.kt\ncom/kubi/operation/lib/topic/search/SearchTopicFragment\n*L\n44#1:124,16\n*E\n"})
public final class SearchTopicFragment extends SimpleStateFragment<SearchTopicState> {

    /* JADX INFO: renamed from: U */
    public boolean f36832U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f36833V = C45681e.m100799e(this, new Function1<SearchTopicFragment, C45628e>() { // from class: com.kubi.operation.lib.topic.search.SearchTopicFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45628e invoke(@NotNull SearchTopicFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45628e.m100741a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45628e, Unit>() { // from class: com.kubi.operation.lib.topic.search.SearchTopicFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45628e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45628e c45628e) {
            invoke(c45628e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f36831X = {Reflection.property1(new PropertyReference1Impl(SearchTopicFragment.class, "binding", "getBinding()Lcom/kubi/operation/lib/databinding/OperationFragmentSearchTopicBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f36830W = new Companion(null);

    /* JADX INFO: compiled from: SearchTopicFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/topic/search/SearchTopicFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/operation/lib/topic/search/SearchTopicFragment;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/api/entity/SearchTopicEntity;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SearchTopicFragment instance(@NotNull SearchTopicEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            SearchTopicFragment searchTopicFragment = new SearchTopicFragment();
            new C27051h().m66721e("data", entity).m66718b(searchTopicFragment);
            return searchTopicFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.topic.search.SearchTopicFragment$bindState$2 */
    /* JADX INFO: compiled from: SearchTopicFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/operation/lib/entity/TopicCoinWsEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.topic.search.SearchTopicFragment$bindState$2", m90122f = "SearchTopicFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C195432 extends SuspendLambda implements Function2<TopicCoinWsEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(TopicCoinWsEntity topicCoinWsEntity, Continuation<? super Unit> continuation) {
            return ((C195432) create(topicCoinWsEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C195432(Continuation<? super C195432> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C195432 c195432 = SearchTopicFragment.this.new C195432(continuation);
            c195432.L$0 = obj;
            return c195432;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TopicCoinWsEntity topicCoinWsEntity = (TopicCoinWsEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SearchTopicFragment.this.m43590p3(topicCoinWsEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m43587q3(TopicCoinWsEntity topicCoinWsEntity, SearchTopicFragment searchTopicFragment) {
        WsMarketSnapshotEntity data;
        TradeItemBean tradeItemBeanCovertToTradeItemBean$default;
        C45628e c45628eM43589o3;
        if (topicCoinWsEntity != null && (data = topicCoinWsEntity.getData()) != null && (tradeItemBeanCovertToTradeItemBean$default = WsMarketSnapshotEntity.covertToTradeItemBean$default(data, null, 1, null)) != null && (c45628eM43589o3 = searchTopicFragment.m43589o3()) != null) {
            c45628eM43589o3.f102812h.setText(tradeItemBeanCovertToTradeItemBean$default.getFormatChangeRate());
            BaseTextView baseTextView = c45628eM43589o3.f102812h;
            Context context = baseTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Double changeRate = tradeItemBeanCovertToTradeItemBean$default.getChangeRate();
            baseTextView.setBackgroundTintList(ColorStateList.valueOf(C22890g.m54279d(context, changeRate != null ? changeRate.doubleValue() : 0.0d, 0, 2, null)));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.operation_fragment_search_topic;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF36832U() {
        return this.f36832U;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<SearchTopicVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SearchTopicVM.class);
    }

    /* JADX INFO: renamed from: o3 */
    public final C45628e m43589o3() {
        return (C45628e) this.f36833V.getValue(this, f36831X[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        MarqueeTextView marqueeTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        SearchTopicEntity searchTopicEntity = arguments != null ? (SearchTopicEntity) RouteExKt.m56274t(arguments, "data") : null;
        if (searchTopicEntity != null) {
            C45628e c45628eM43589o3 = m43589o3();
            if (c45628eM43589o3 != null && (constraintLayout = c45628eM43589o3.f102811g) != null) {
                ViewExtKt.m66594y(constraintLayout);
            }
            m43591r3(searchTopicEntity);
            return;
        }
        C45628e c45628eM43589o4 = m43589o3();
        if (c45628eM43589o4 != null && (marqueeTextView = c45628eM43589o4.f102810f) != null) {
            marqueeTextView.m54677n();
        }
        C45628e c45628eM43589o5 = m43589o3();
        if (c45628eM43589o5 == null || (constraintLayout2 = c45628eM43589o5.f102811g) == null) {
            return;
        }
        ViewExtKt.m66577h(constraintLayout2);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p3 */
    public final void m43590p3(@Nullable final TopicCoinWsEntity topicCoinWsEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.topic.search.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchTopicFragment.m43587q3(topicCoinWsEntity, this);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f36832U = z11;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m43588s3(SearchTopicEntity searchTopicEntity) throws JSONException {
        String topicUrl = searchTopicEntity.getTopicUrl();
        if (topicUrl != null) {
            Router.f46192a.m56184f(topicUrl).m4048k();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("messageId", "separate");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("B1MainSearch", "hotspot", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.operation.lib.topic.search.SearchTopicFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SearchTopicState) obj).getData();
            }
        }, new C195432(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        MarqueeTextView marqueeTextView;
        C45628e c45628eM43589o3 = m43589o3();
        if (c45628eM43589o3 != null && (marqueeTextView = c45628eM43589o3.f102810f) != null) {
            marqueeTextView.m54677n();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        MarqueeTextView marqueeTextView;
        C45628e c45628eM43589o3 = m43589o3();
        if (c45628eM43589o3 != null && (marqueeTextView = c45628eM43589o3.f102810f) != null) {
            marqueeTextView.m54678o();
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final void m43591r3(final SearchTopicEntity searchTopicEntity) throws JSONException {
        SearchTopicCurrency searchTopicCurrency;
        FrameLayout frameLayout;
        LinearLayoutCompat linearLayoutCompat;
        MarqueeTextView marqueeTextView;
        View view;
        int i11;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C45628e c45628eM43589o3 = m43589o3();
        if (c45628eM43589o3 != null && (baseTextView2 = c45628eM43589o3.f102813i) != null) {
            String anchorsTitle = searchTopicEntity.getAnchorsTitle();
            if (anchorsTitle == null) {
                anchorsTitle = getString(R$string.operation_hottopic_subject);
                Intrinsics.checkNotNullExpressionValue(anchorsTitle, "getString(...)");
            }
            baseTextView2.setText(anchorsTitle);
        }
        C45628e c45628eM43589o4 = m43589o3();
        if (c45628eM43589o4 != null && (baseTextView = c45628eM43589o4.f102814j) != null) {
            String topicTitle = searchTopicEntity.getTopicTitle();
            if (topicTitle == null) {
                topicTitle = "";
            }
            baseTextView.setText(topicTitle);
        }
        List<SearchTopicScrollInfo> scrollInfo = searchTopicEntity.getScrollInfo();
        if (scrollInfo == null) {
            scrollInfo = CollectionsKt.emptyList();
        }
        C45628e c45628eM43589o5 = m43589o3();
        if (c45628eM43589o5 != null && (view = c45628eM43589o5.f102815k) != null) {
            if (scrollInfo.isEmpty()) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            view.setVisibility(i11);
        }
        C45628e c45628eM43589o6 = m43589o3();
        if (c45628eM43589o6 != null && (marqueeTextView = c45628eM43589o6.f102810f) != null) {
            marqueeTextView.setContentList(scrollInfo);
        }
        List<SearchTopicCurrency> currencies = searchTopicEntity.getCurrencies();
        if (currencies != null) {
            searchTopicCurrency = (SearchTopicCurrency) CollectionsKt.firstOrNull((List) currencies);
        } else {
            searchTopicCurrency = null;
        }
        if (searchTopicCurrency != null) {
            C45628e c45628eM43589o7 = m43589o3();
            if (c45628eM43589o7 != null) {
                FrameLayout layoutCoin = c45628eM43589o7.f102807c;
                Intrinsics.checkNotNullExpressionValue(layoutCoin, "layoutCoin");
                ViewExtKt.m66594y(layoutCoin);
                C19570t.m43666d(c45628eM43589o7.f102806b, searchTopicCurrency.getLogo(), Integer.valueOf(R$mipmap.kucoin_icon_default_icon));
                c45628eM43589o7.f102812h.setText(C19570t.m43665c(searchTopicCurrency.getChangeRate()));
                BaseTextView baseTextView3 = c45628eM43589o7.f102812h;
                Context context = baseTextView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                baseTextView3.setBackgroundTintList(ColorStateList.valueOf(C22890g.m54279d(context, DowngradeExKt.m66538h(searchTopicCurrency.getChangeRate(), 0.0d, 1, null), 0, 2, null)));
            }
            String symbol = searchTopicCurrency.getSymbol();
            if (symbol != null) {
                sendIntent(new SubscribeWS(symbol));
            }
        } else {
            C45628e c45628eM43589o8 = m43589o3();
            if (c45628eM43589o8 != null && (frameLayout = c45628eM43589o8.f102807c) != null) {
                ViewExtKt.m66577h(frameLayout);
            }
        }
        C45628e c45628eM43589o9 = m43589o3();
        if (c45628eM43589o9 != null && (linearLayoutCompat = c45628eM43589o9.f102808d) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.operation.lib.topic.search.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchTopicFragment.m43588s3(searchTopicEntity);
                }
            }, 1, null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("messageId", "separate");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("B1MainSearch", "hotspot", null, jSONObject, 4, null);
    }
}
