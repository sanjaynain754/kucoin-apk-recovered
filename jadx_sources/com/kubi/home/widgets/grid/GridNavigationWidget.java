package com.kubi.home.widgets.grid;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.entity.MoreNavigationEntity;
import com.kubi.home.v2.HomeFragmentV2;
import com.kubi.home.v2.biz.grid.GridNavigationFragment;
import com.kubi.home.v2.biz.grid.utils.C14965l;
import com.kubi.home.v2.biz.grid.utils.GridNavigationExKt;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.sdk.util.StartupTrace;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36723h;
import fj.C37508a0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p502oj.C43101f;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import sj.C44510a;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: GridNavigationWidget.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0019\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0014J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0014J\b\u0010\u001f\u001a\u00020\rH\u0014J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u0018\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020)H\u0002J\u0010\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020%H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u00061"}, m90084d2 = {"Lcom/kubi/home/widgets/grid/GridNavigationWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "binding", "Lcom/kubi/home/databinding/HomeWidgetGridNavigationBinding;", "getBinding$HomeLib_googleRelease", "()Lcom/kubi/home/databinding/HomeWidgetGridNavigationBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "listAdapter", "com/kubi/home/widgets/grid/GridNavigationWidget$listAdapter$1", "Lcom/kubi/home/widgets/grid/GridNavigationWidget$listAdapter$1;", "initView", "onAgainShow", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "", "fillViewData", "dataList", "", "Lcom/kubi/home/entity/GridNavigationEntity;", "convertItem", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "showShimmer", TIMPushProvider.f75062n, "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNavigationWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationWidget.kt\ncom/kubi/home/widgets/grid/GridNavigationWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt\n*L\n1#1,242:1\n147#2,16:243\n67#3:259\n58#3,2:270\n174#4,6:260\n93#5,4:266\n1#6:272\n1#6:275\n120#7,2:273\n122#7:276\n47#7,6:277\n*S KotlinDebug\n*F\n+ 1 GridNavigationWidget.kt\ncom/kubi/home/widgets/grid/GridNavigationWidget\n*L\n76#1:243,16\n94#1:259\n181#1:270,2\n132#1:260,6\n146#1:266,4\n205#1:275\n205#1:273,2\n205#1:276\n191#1:277,6\n*E\n"})
public final class GridNavigationWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f26746X = C45681e.m100799e(this, new Function1<GridNavigationWidget, C37508a0>() { // from class: com.kubi.home.widgets.grid.GridNavigationWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37508a0 invoke(@NotNull GridNavigationWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37508a0.m84474a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37508a0, Unit>() { // from class: com.kubi.home.widgets.grid.GridNavigationWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37508a0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37508a0 c37508a0) {
            invoke(c37508a0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final GridNavigationWidget$listAdapter$1 f26747Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f26745a0 = {Reflection.property1(new PropertyReference1Impl(GridNavigationWidget.class, "binding", "getBinding$HomeLib_googleRelease()Lcom/kubi/home/databinding/HomeWidgetGridNavigationBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f26744Z = new Companion(null);

    /* JADX INFO: compiled from: GridNavigationWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/widgets/grid/GridNavigationWidget$Companion;", "", "<init>", "()V", "EVENT_GRID_CHANGE_BY_MORE", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: B3 */
    private final void m31170B3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.grid.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationWidget.m31171C3(this.f26758b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m31172D3(C37508a0 c37508a0, GridNavigationWidget gridNavigationWidget) {
        c37508a0.f83211e.setLoading(true);
        gridNavigationWidget.sendIntent(new GridNavigationWidgetContract$UiIntent.LoadData(true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m31184v3(final BaseViewHolder baseViewHolder, final GridNavigationEntity gridNavigationEntity, final GridNavigationWidget gridNavigationWidget) throws JSONException {
        View view = baseViewHolder.getView(R$id.ivIcon);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27100x0.m66923d(new C14965l((ImageView) view, gridNavigationEntity.getIconUrl()));
        baseViewHolder.setText(R$id.tvName, gridNavigationEntity.getName());
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivMark);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvMark);
        Intrinsics.checkNotNull(imageView);
        Intrinsics.checkNotNull(textView);
        GridNavigationExKt.m30668c(gridNavigationEntity, imageView, textView);
        View view2 = baseViewHolder.getView(R$id.layoutIconName);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        ViewExtKt.m66578i(view2, gridNavigationEntity.getItemViewHeight());
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.home.widgets.grid.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationWidget.m31185w3(gridNavigationEntity, gridNavigationWidget, baseViewHolder);
            }
        }, 1, null);
        if (!(gridNavigationEntity instanceof MoreNavigationEntity)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", C27041f.m66668h(gridNavigationEntity.getUri()));
            jSONObject.put("contentID", C27041f.m66668h(gridNavigationEntity.getId()));
            jSONObject.put("contentName", C27041f.m66668h(gridNavigationEntity.getName()));
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "eightPlace", null, jSONObject, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m31185w3(GridNavigationEntity gridNavigationEntity, GridNavigationWidget gridNavigationWidget, BaseViewHolder baseViewHolder) throws JSONException {
        if (gridNavigationEntity instanceof MoreNavigationEntity) {
            FragmentActivity activity = gridNavigationWidget.getActivity();
            if (activity != null) {
                GridNavigationFragment.f26378b0.openMe(activity);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "eightPlaceMore", null, jSONObject, 4, null);
        } else {
            int adapterPosition = baseViewHolder.getAdapterPosition();
            String uri = gridNavigationEntity.getUri();
            if (uri != null) {
                C36723h.m82297a(uri, HomeCardViewHolderProxy.PAGE_ID, "eightPlace", String.valueOf(adapterPosition + 1));
            }
            String id2 = gridNavigationEntity.getId();
            if (id2 != null) {
                GridNavigationExKt.m30671f(id2);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", C27041f.m66668h(gridNavigationEntity.getUri()));
            jSONObject2.put("contentID", C27041f.m66668h(gridNavigationEntity.getId()));
            jSONObject2.put("contentName", C27041f.m66668h(gridNavigationEntity.getName()));
            jSONObject2.put("norm_version", "1");
            Unit unit2 = Unit.INSTANCE;
            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "eightPlace", null, jSONObject2, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public final void m31186x3(final List<? extends GridNavigationEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.grid.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationWidget.m31187y3(this.f26763b, list);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m31188z3(C37508a0 c37508a0) {
        C46392a.m102329l(C44510a.f98560a.m98475a(), c37508a0.getRoot().getHeight());
        C12572a.m23695d("com.kubi.home.event.HomeEvent:widget_view_loaded", HomeWidgetCode.Menu, 0L, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: A3 */
    public final C37508a0 m31189A3() {
        return (C37508a0) this.f26746X.getValue(this, f26745a0[0]);
    }

    /* JADX INFO: renamed from: E3 */
    public final void m31190E3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.grid.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationWidget.m31173F3(this.f26753b, z11);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C15129h) {
            m31170B3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        C43101f.f95302a.m94709b("home_page_menu_widget_on_create_view");
        return R$layout.home_widget_grid_navigation;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<GridNavigationWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(GridNavigationWidgetVM.class);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43101f.f95302a.m94709b("home_page_menu_widget_on_view_created");
    }

    /* JADX INFO: renamed from: u3 */
    public final void m31191u3(final BaseViewHolder baseViewHolder, final GridNavigationEntity gridNavigationEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.grid.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationWidget.m31184v3(baseViewHolder, gridNavigationEntity, this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.kubi.home.widgets.grid.GridNavigationWidget$listAdapter$1] */
    public GridNavigationWidget() {
        final int i11 = R$layout.home_item_grid_navigation;
        final ArrayList arrayList = new ArrayList();
        this.f26747Y = new BaseQuickAdapter<GridNavigationEntity, BaseViewHolder>(i11, arrayList) { // from class: com.kubi.home.widgets.grid.GridNavigationWidget$listAdapter$1
            {
                setHasStableIds(true);
            }

            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, GridNavigationEntity gridNavigationEntity) {
                if (baseViewHolder == null || gridNavigationEntity == null) {
                    return;
                }
                this.f26748i.m31191u3(baseViewHolder, gridNavigationEntity);
            }
        };
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m31171C3(final GridNavigationWidget gridNavigationWidget, boolean z11) {
        final C37508a0 c37508a0M31189A3 = gridNavigationWidget.m31189A3();
        if (c37508a0M31189A3 == null) {
            C43101f.f95302a.m94714h();
            return Unit.INSTANCE;
        }
        C43101f c43101f = C43101f.f95302a;
        c43101f.m94709b("home_page_menu_widget_show_data");
        c37508a0M31189A3.f83211e.setLoading(false);
        gridNavigationWidget.m31190E3(false);
        if (z11) {
            RecyclerView recyclerView = c37508a0M31189A3.f83210d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            C27046k.m66703r(recyclerView);
            ReloadRefreshView reloadView = c37508a0M31189A3.f83211e;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c37508a0M31189A3.f83211e;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.home.widgets.grid.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNavigationWidget.m31172D3(c37508a0M31189A3, gridNavigationWidget);
                }
            }, 1, null);
        } else {
            RecyclerView recyclerView2 = c37508a0M31189A3.f83210d;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
            C27046k.m66685H(recyclerView2);
            ReloadRefreshView reloadView3 = c37508a0M31189A3.f83211e;
            Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
            C27046k.m66700o(reloadView3);
        }
        c43101f.m94712f();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m31173F3(GridNavigationWidget gridNavigationWidget, boolean z11) {
        ViewGroup viewGroup;
        C37508a0 c37508a0M31189A3 = gridNavigationWidget.m31189A3();
        if (c37508a0M31189A3 == null) {
            return Unit.INSTANCE;
        }
        if (z11) {
            LinearLayoutCompat linearLayoutCompatM84584b = c37508a0M31189A3.f83209c.getRoot();
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompatM84584b, "getRoot(...)");
            if (C27046k.m66704s(linearLayoutCompatM84584b)) {
                return Unit.INSTANCE;
            }
            RecyclerView recyclerView = c37508a0M31189A3.f83210d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            C27046k.m66700o(recyclerView);
            LinearLayoutCompat linearLayoutCompatM84584b2 = c37508a0M31189A3.f83209c.getRoot();
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompatM84584b2, "getRoot(...)");
            C27046k.m66685H(linearLayoutCompatM84584b2);
        } else {
            RecyclerView recyclerView2 = c37508a0M31189A3.f83210d;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
            if (C27046k.m66704s(recyclerView2)) {
                return Unit.INSTANCE;
            }
            RecyclerView recyclerView3 = c37508a0M31189A3.f83210d;
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "recyclerView");
            C27046k.m66685H(recyclerView3);
            LinearLayoutCompat linearLayoutCompatM84584b3 = c37508a0M31189A3.f83209c.getRoot();
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompatM84584b3, "getRoot(...)");
            ViewParent parent = linearLayoutCompatM84584b3.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(linearLayoutCompatM84584b3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m31187y3(GridNavigationWidget gridNavigationWidget, List list) {
        final C37508a0 c37508a0M31189A3 = gridNavigationWidget.m31189A3();
        if (c37508a0M31189A3 == null) {
            return Unit.INSTANCE;
        }
        C43101f c43101f = C43101f.f95302a;
        c43101f.m94709b("home_page_menu_widget_show_data");
        gridNavigationWidget.m31170B3(false);
        ConstraintLayout constraintLayoutM84475b = c37508a0M31189A3.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM84475b, "getRoot(...)");
        ViewExtKt.m66578i(constraintLayoutM84475b, -2);
        gridNavigationWidget.f26747Y.replaceData(list);
        RecyclerView recyclerView = c37508a0M31189A3.f83210d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C22912t.m54416n(recyclerView, new Runnable() { // from class: com.kubi.home.widgets.grid.f
            @Override // java.lang.Runnable
            public final void run() {
                GridNavigationWidget.m31188z3(c37508a0M31189A3);
            }
        });
        C43841b.m96557d("event_load_home_grid_menu", "page_load_end", null, 4, null);
        c43101f.m94712f();
        StartupTrace startupTrace = StartupTrace.f48194a;
        startupTrace.m58450j("$event_duration");
        startupTrace.m58457q();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12572a.m23692a(this, false, new C15120x5b81dd37(new String[]{"com.kubi.home.event.HomeEvent:pullRefresh", "event_grid_change_by_more", "com.kubi.user.event.UserEvent:onTokenRefresh"}, null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.widgets.grid.GridNavigationWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDataList();
            }
        }, new GridNavigationWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        super.initView();
        C37508a0 c37508a0M31189A3 = m31189A3();
        if (c37508a0M31189A3 != null) {
            int iM102323e = C46392a.m102323e(C44510a.f98560a.m98475a(), -1);
            if (iM102323e != -1) {
                ConstraintLayout constraintLayoutM84475b = c37508a0M31189A3.getRoot();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutM84475b, "getRoot(...)");
                ViewExtKt.m66578i(constraintLayoutM84475b, iM102323e);
            }
            m31190E3(true);
            Context context = c37508a0M31189A3.f83210d.getContext();
            RecyclerView recyclerView = c37508a0M31189A3.f83210d;
            HomeFragmentV2.Companion companion = HomeFragmentV2.f26336f0;
            recyclerView.setPadding(companion.getLineSpacing(), 0, companion.getLineSpacing(), 0);
            c37508a0M31189A3.f83210d.setLayoutManager(new GridLayoutManager(context, 4));
            RecyclerView recyclerView2 = c37508a0M31189A3.f83210d;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
            C22912t.m54409g(recyclerView2, false);
            c37508a0M31189A3.f83210d.addItemDecoration(new GridNavigationWidgetItemDecoration());
            c37508a0M31189A3.f83210d.setAdapter(this.f26747Y);
            if (C43101f.f95302a.m94711e()) {
                sendIntent(new GridNavigationWidgetContract$UiIntent.LoadData(false, 1, null));
            }
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onAgainShow() {
        super.onAgainShow();
        if (C43101f.f95302a.m94711e()) {
            sendIntent(new GridNavigationWidgetContract$UiIntent.LoadData(false, 1, null));
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        if (!C43101f.f95302a.m94711e()) {
            sendIntent(new GridNavigationWidgetContract$UiIntent.LoadData(false, 1, null));
        }
    }
}
