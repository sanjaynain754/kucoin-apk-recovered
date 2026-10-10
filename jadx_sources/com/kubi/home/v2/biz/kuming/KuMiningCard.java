package com.kubi.home.v2.biz.kuming;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import fj.C37538p0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import w00.C45681e;

/* JADX INFO: compiled from: KuMiningCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m90084d2 = {"Lcom/kubi/home/v2/biz/kuming/KuMiningCard;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;", "<init>", "()V", "adapter", "Lcom/kubi/home/v2/biz/kuming/KuMiningCardAdapter;", "getAdapter", "()Lcom/kubi/home/v2/biz/kuming/KuMiningCardAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/home/databinding/KucoinLayoutCardsKuMiningBinding;", "getBinding", "()Lcom/kubi/home/databinding/KucoinLayoutCardsKuMiningBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContent", "data", "Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMiningCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMiningCard.kt\ncom/kubi/home/v2/biz/kuming/KuMiningCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n147#2,16:114\n153#3,7:130\n93#4,4:137\n1#5:141\n*S KotlinDebug\n*F\n+ 1 KuMiningCard.kt\ncom/kubi/home/v2/biz/kuming/KuMiningCard\n*L\n42#1:114,16\n79#1:130,7\n87#1:137,4\n*E\n"})
public final class KuMiningCard extends SimpleStateCardV2<KuMiningWidgetContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f26461X = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.biz.kuming.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMiningCard.m30680o3();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f26462Y = C45681e.m100799e(this, new Function1<KuMiningCard, C37538p0>() { // from class: com.kubi.home.v2.biz.kuming.KuMiningCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37538p0 invoke(@NotNull KuMiningCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37538p0.m84542a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37538p0, Unit>() { // from class: com.kubi.home.v2.biz.kuming.KuMiningCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37538p0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37538p0 c37538p0) {
            invoke(c37538p0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f26460a0 = {Reflection.property1(new PropertyReference1Impl(KuMiningCard.class, "binding", "getBinding()Lcom/kubi/home/databinding/KucoinLayoutCardsKuMiningBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f26459Z = new Companion(null);

    /* JADX INFO: compiled from: KuMiningCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/v2/biz/kuming/KuMiningCard$Companion;", "", "<init>", "()V", "KU_MINING_JUMP", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final KuMiningCardAdapter m30680o3() {
        return new KuMiningCardAdapter();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m30681r3(KuMiningCard kuMiningCard) {
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        String string = kuMiningCard.getString(R$string.home_card_kuming_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = kuMiningCard.getString(R$string.home_card_kuming_tilte_dialog_des);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = kuMiningCard.getString(R$string.task_dialog_known);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        BottomSheetDialogHelper.m58980j0(bottomSheetDialogHelper, string, 0, string2, string3, null, 18, null).m54193s3(kuMiningCard, "home_widget_ku_mining_tips_dialog");
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C14972d) {
            m30685t3(((C14972d) singleEvent).getF26467a());
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.kucoin_layout_cards_ku_mining;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<KuMiningWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(KuMiningWidgetVM.class);
    }

    /* JADX INFO: renamed from: p3 */
    public final KuMiningCardAdapter m30683p3() {
        return (KuMiningCardAdapter) this.f26461X.getValue();
    }

    /* JADX INFO: renamed from: q3 */
    public final C37538p0 m30684q3() {
        return (C37538p0) this.f26462Y.getValue(this, f26460a0[0]);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m30685t3(KuMiningDataEntity kuMiningDataEntity) {
        if (kuMiningDataEntity == null || kuMiningDataEntity.isEmpty()) {
            C37538p0 c37538p0M30684q3 = m30684q3();
            if (c37538p0M30684q3 != null) {
                LinearLayout llKuMiningListLoading = c37538p0M30684q3.f83392f;
                Intrinsics.checkNotNullExpressionValue(llKuMiningListLoading, "llKuMiningListLoading");
                C27046k.m66700o(llKuMiningListLoading);
                RecyclerView llKuMiningList = c37538p0M30684q3.f83391e;
                Intrinsics.checkNotNullExpressionValue(llKuMiningList, "llKuMiningList");
                C27046k.m66700o(llKuMiningList);
                LinearLayout root = c37538p0M30684q3.f83389c.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                C27046k.m66700o(root);
                LinearLayout kuMiningCardEmptyLayout = c37538p0M30684q3.f83388b;
                Intrinsics.checkNotNullExpressionValue(kuMiningCardEmptyLayout, "kuMiningCardEmptyLayout");
                C27046k.m66685H(kuMiningCardEmptyLayout);
                return;
            }
            return;
        }
        C37538p0 c37538p0M30684q4 = m30684q3();
        if (c37538p0M30684q4 != null) {
            LinearLayout llKuMiningListLoading2 = c37538p0M30684q4.f83392f;
            Intrinsics.checkNotNullExpressionValue(llKuMiningListLoading2, "llKuMiningListLoading");
            C27046k.m66700o(llKuMiningListLoading2);
            LinearLayout kuMiningCardEmptyLayout2 = c37538p0M30684q4.f83388b;
            Intrinsics.checkNotNullExpressionValue(kuMiningCardEmptyLayout2, "kuMiningCardEmptyLayout");
            C27046k.m66700o(kuMiningCardEmptyLayout2);
            LinearLayout root2 = c37538p0M30684q4.f83389c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            C27046k.m66685H(root2);
            RecyclerView llKuMiningList2 = c37538p0M30684q4.f83391e;
            Intrinsics.checkNotNullExpressionValue(llKuMiningList2, "llKuMiningList");
            C27046k.m66685H(llKuMiningList2);
        }
        List<KuMiningItemEntity> miningProfits = kuMiningDataEntity.getMiningProfits();
        if (miningProfits != null) {
            m30683p3().replaceData(miningProfits);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m30682s3(C37538p0 c37538p0, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        if (C27014a1.m66501a(c37538p0.getRoot())) {
            return;
        }
        RouteExKt.m56217H("/krn/router?biz=cloudmining&entry=main&component=kucoin_cloud_mining_rn&route=HomePage%3Ftab%3DMarket");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "KuMining", null, jSONObject, 4, null);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new KuMiningCard$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        super.initView();
        final C37538p0 c37538p0M30684q3 = m30684q3();
        if (c37538p0M30684q3 == null) {
            return;
        }
        c37538p0M30684q3.f83391e.setAdapter(m30683p3());
        LinearLayout llKuMiningTitle = c37538p0M30684q3.f83393g;
        Intrinsics.checkNotNullExpressionValue(llKuMiningTitle, "llKuMiningTitle");
        C27046k.m66711z(llKuMiningTitle, 0L, new Function0() { // from class: com.kubi.home.v2.biz.kuming.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMiningCard.m30681r3(this.f26465b);
            }
        }, 1, null);
        m30683p3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.home.v2.biz.kuming.b
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
                KuMiningCard.m30682s3(c37538p0M30684q3, baseQuickAdapter, view, i11);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(KuMiningWidgetContract$UiIntent.LoadData.INSTANCE);
    }
}
