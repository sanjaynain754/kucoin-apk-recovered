package com.kubi.home.widgets.recommend;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.entity.WidgetRecommendEntity;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerMiddleCard;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import fj.C37510b0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: RecommendWidget.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0014J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0014H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/home/widgets/recommend/RecommendWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/home/widgets/recommend/RecommendWidgetContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/widgets/recommend/RecommendWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/home/databinding/HomeWidgetRecommendBinding;", "getBinding$HomeLib_googleRelease", "()Lcom/kubi/home/databinding/HomeWidgetRecommendBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "listAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/entity/WidgetRecommendEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "", "convertItem", "helper", "item", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendWidget.kt\ncom/kubi/home/widgets/recommend/RecommendWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,133:1\n147#2,16:134\n1#3:150\n153#4,7:151\n93#5,4:158\n*S KotlinDebug\n*F\n+ 1 RecommendWidget.kt\ncom/kubi/home/widgets/recommend/RecommendWidget\n*L\n46#1:134,16\n74#1:151,7\n91#1:158,4\n*E\n"})
public final class RecommendWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f26773Z = {Reflection.property1(new PropertyReference1Impl(RecommendWidget.class, "binding", "getBinding$HomeLib_googleRelease()Lcom/kubi/home/databinding/HomeWidgetRecommendBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f26774X = C45681e.m100799e(this, new Function1<RecommendWidget, C37510b0>() { // from class: com.kubi.home.widgets.recommend.RecommendWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37510b0 invoke(@NotNull RecommendWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37510b0.m84478a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37510b0, Unit>() { // from class: com.kubi.home.widgets.recommend.RecommendWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37510b0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37510b0 c37510b0) {
            invoke(c37510b0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @Nullable
    public BaseQuickAdapter<WidgetRecommendEntity, BaseViewHolder> f26775Y;

    /* JADX INFO: renamed from: t3 */
    public static final Unit m31212t3(BaseViewHolder baseViewHolder, final WidgetRecommendEntity widgetRecommendEntity) {
        baseViewHolder.setText(R$id.tvTitle, widgetRecommendEntity.getTitle());
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.tvSummary);
        if (baseTextView != null) {
            baseTextView.setText(widgetRecommendEntity.getSummary());
            C22912t.m54415m(baseTextView, 0, 0, 3, null);
        }
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivIcon);
        if (imageView != null) {
            C24277v.m58542g(imageView, widgetRecommendEntity.getImageUrl());
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.home.widgets.recommend.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendWidget.m31213u3(widgetRecommendEntity);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public final void m31214w3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.recommend.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendWidget.m31215x3(this.f26781b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m31216y3(C37510b0 c37510b0, RecommendWidget recommendWidget) {
        c37510b0.f83224e.setLoading(true);
        recommendWidget.sendIntent(new RecommendWidgetContract$UiIntent.LoadData(true));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C15143f) {
            m31214w3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.home_widget_recommend;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<RecommendWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RecommendWidgetVM.class);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m31217s3(final BaseViewHolder baseViewHolder, final WidgetRecommendEntity widgetRecommendEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.recommend.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendWidget.m31212t3(baseViewHolder, widgetRecommendEntity);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public final C37510b0 m31218v3() {
        return (C37510b0) this.f26774X.getValue(this, f26773Z[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m31213u3(WidgetRecommendEntity widgetRecommendEntity) throws JSONException {
        RouteExKt.m56217H(widgetRecommendEntity.getLink());
        String code = HomeWidgetCode.RecommendedPosition.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("url", C27041f.m66668h(widgetRecommendEntity.getLink()));
        jSONObject.put("title", C27041f.m66668h(widgetRecommendEntity.getTitle()));
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m31215x3(final RecommendWidget recommendWidget, boolean z11) {
        final C37510b0 c37510b0M31218v3 = recommendWidget.m31218v3();
        if (c37510b0M31218v3 == null) {
            return Unit.INSTANCE;
        }
        c37510b0M31218v3.f83221b.m54982c();
        c37510b0M31218v3.f83224e.setLoading(false);
        if (z11) {
            RecyclerView recyclerView = c37510b0M31218v3.f83223d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            C27046k.m66703r(recyclerView);
            ReloadRefreshView reloadView = c37510b0M31218v3.f83224e;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c37510b0M31218v3.f83224e;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.home.widgets.recommend.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendWidget.m31216y3(c37510b0M31218v3, recommendWidget);
                }
            }, 1, null);
        } else {
            RecyclerView recyclerView2 = c37510b0M31218v3.f83223d;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
            C27046k.m66685H(recyclerView2);
            ReloadRefreshView reloadView3 = c37510b0M31218v3.f83224e;
            Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
            C27046k.m66700o(reloadView3);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new RecommendWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.widgets.recommend.RecommendWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDataList();
            }
        }, new RecommendWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        HomeShimmerMiddleCard homeShimmerMiddleCard;
        super.initView();
        C37510b0 c37510b0M31218v3 = m31218v3();
        if (c37510b0M31218v3 != null && (homeShimmerMiddleCard = c37510b0M31218v3.f83221b) != null) {
            homeShimmerMiddleCard.m54983e();
        }
        C37510b0 c37510b0M31218v4 = m31218v3();
        if (c37510b0M31218v4 != null && (recyclerView3 = c37510b0M31218v4.f83223d) != null) {
            C22912t.m54409g(recyclerView3, false);
        }
        C37510b0 c37510b0M31218v5 = m31218v3();
        if (c37510b0M31218v5 != null && (recyclerView2 = c37510b0M31218v5.f83223d) != null) {
            recyclerView2.addItemDecoration(new RecommendWidgetDivider());
        }
        C37510b0 c37510b0M31218v6 = m31218v3();
        if (c37510b0M31218v6 != null && (recyclerView = c37510b0M31218v6.f83223d) != null) {
            BaseQuickAdapter<WidgetRecommendEntity, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<WidgetRecommendEntity, BaseViewHolder>(R$layout.home_item_widget_recommend, new ArrayList()) { // from class: com.kubi.home.widgets.recommend.RecommendWidget.initView.1
                @Override // io.chad.library.adapter.base.BaseQuickAdapter
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public void convert(BaseViewHolder baseViewHolder, WidgetRecommendEntity widgetRecommendEntity) {
                    if (baseViewHolder == null || widgetRecommendEntity == null) {
                        return;
                    }
                    RecommendWidget.this.m31217s3(baseViewHolder, widgetRecommendEntity);
                }
            };
            this.f26775Y = baseQuickAdapter;
            recyclerView.setAdapter(baseQuickAdapter);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(new RecommendWidgetContract$UiIntent.LoadData(false, 1, null));
    }
}
