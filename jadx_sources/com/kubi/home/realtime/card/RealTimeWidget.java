package com.kubi.home.realtime.card;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$layout;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.home.realtime.ViewLifecycleEvent;
import com.kubi.home.realtime.ViewLifecycleListener;
import com.kubi.home.realtime.dialog.RealTimeDialog;
import com.kubi.home.realtime.frame.view.CardStackView;
import com.kubi.home.v2.card.C15000n;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.KcLabelView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import fj.C37554x0;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p456mj.C42562k;
import p456mj.InterfaceC42553b;
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
import p852kotlin.sequences.SequencesKt;
import ss.C44542b;
import w00.C45681e;

/* JADX INFO: compiled from: RealTimeWidget.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0014J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\b\u0010 \u001a\u00020\u0017H\u0014J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002J\b\u0010)\u001a\u00020\u0017H\u0002J\u0012\u0010*\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010+H\u0002J\u0012\u0010,\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010+H\u0002J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\u0016\u0010/\u001a\u00020\u00172\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001701H\u0002R\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/home/realtime/card/RealTimeWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/home/realtime/card/RealTimeWidgetContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "binding", "Lcom/kubi/home/databinding/LayoutHomeRealtimeWidgetBinding;", "getBinding$HomeLib_googleRelease", "()Lcom/kubi/home/databinding/LayoutHomeRealtimeWidgetBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/home/realtime/frame/manager/IUIDataRefreshListener;", "helper", "Lcom/kubi/home/realtime/card/CardStackIntegrationUIListener;", "getLayout", "", "bindToUI", "", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", "onEnterDragMode", "onExitDragMode", "initView", "onDestroy", "bindFlowEvent", "initListener", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "updateCardVisible", "updateNumber", "notifyCardHide", "notifyCardRelease", "notifyCardShow", "notifyCardPullRefresh", "notifyViewLifecycleShow", "Lcom/kubi/home/realtime/IRealTimeData;", "notifyViewLifecycleHide", "notifyViewLifecycleRemoved", "notifyAllViewLifecycleRemoved", "viewBindingSafeRun", "block", "Lkotlin/Function0;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealTimeWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeWidget.kt\ncom/kubi/home/realtime/card/RealTimeWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n147#2,16:310\n1#3:326\n153#4,7:327\n1869#5,2:334\n1869#5,2:336\n1869#5,2:338\n1869#5,2:340\n1869#5,2:342\n*S KotlinDebug\n*F\n+ 1 RealTimeWidget.kt\ncom/kubi/home/realtime/card/RealTimeWidget\n*L\n37#1:310,16\n132#1:327,7\n214#1:334,2\n226#1:336,2\n237#1:338,2\n248#1:340,2\n298#1:342,2\n*E\n"})
public final class RealTimeWidget extends SimpleStateCardV2<RealTimeWidgetContract$UIState> {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f26092a0 = {Reflection.property1(new PropertyReference1Impl(RealTimeWidget.class, "binding", "getBinding$HomeLib_googleRelease()Lcom/kubi/home/databinding/LayoutHomeRealtimeWidgetBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f26093X = C45681e.m100799e(this, new Function1<RealTimeWidget, C37554x0>() { // from class: com.kubi.home.realtime.card.RealTimeWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37554x0 invoke(@NotNull RealTimeWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37554x0.m84581a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37554x0, Unit>() { // from class: com.kubi.home.realtime.card.RealTimeWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37554x0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37554x0 c37554x0) {
            invoke(c37554x0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @Nullable
    public InterfaceC42553b f26094Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public CardStackIntegrationUIListener f26095Z;

    /* JADX INFO: renamed from: com.kubi.home.realtime.card.RealTimeWidget$a */
    /* JADX INFO: compiled from: RealTimeWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/home/realtime/card/RealTimeWidget$initListener$1", "Lcom/kubi/home/realtime/frame/manager/IUIDataRefreshListener;", "onAdd", "", "data", "Lcom/kubi/home/realtime/IRealTimeData;", "immediate", "", "onUpdate", "onRemove", "onRemoveAll", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14807a implements InterfaceC42553b {
        public C14807a() {
        }

        @Override // p456mj.InterfaceC42553b
        /* JADX INFO: renamed from: a */
        public void mo30086a(IRealTimeData data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // p456mj.InterfaceC42553b
        /* JADX INFO: renamed from: b */
        public void mo30087b(boolean z11) {
            final RealTimeWidget realTimeWidget = RealTimeWidget.this;
            realTimeWidget.m30079M3(new Function0() { // from class: com.kubi.home.realtime.card.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealTimeWidget.C14807a.m30085f(realTimeWidget);
                }
            });
        }

        @Override // p456mj.InterfaceC42553b
        /* JADX INFO: renamed from: c */
        public void mo30088c(IRealTimeData data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // p456mj.InterfaceC42553b
        /* JADX INFO: renamed from: d */
        public void mo30089d(IRealTimeData data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m30085f(RealTimeWidget realTimeWidget) {
            CardStackView cardStackView;
            C37554x0 c37554x0M30083v3 = realTimeWidget.m30083v3();
            if (c37554x0M30083v3 != null && (cardStackView = c37554x0M30083v3.f83493d) != null) {
                cardStackView.m30173s();
            }
            realTimeWidget.m30077K3();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m30052A3(C37554x0 c37554x0) throws JSONException {
        CardStackView.CardData topCard = c37554x0.f83493d.getTopCard();
        if (topCard != null) {
            C42562k.f94240a.m93305D(topCard.getBusinessData(), true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", topCard.getBusinessData().getViewType().getTypeName());
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "deleteOneActivity", null, jSONObject, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    private final void m30068w3() {
        if (this.f26094Y == null) {
            this.f26094Y = new C14807a();
        }
        InterfaceC42553b interfaceC42553b = this.f26094Y;
        if (interfaceC42553b != null) {
            C42562k.f94240a.m93314m(interfaceC42553b);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m30069x3(final RealTimeWidget realTimeWidget, C37554x0 c37554x0) {
        CardStackView.CardData topCard = c37554x0.f83493d.getTopCard();
        realTimeWidget.m30076I3(topCard != null ? topCard.getBusinessData() : null);
        realTimeWidget.m30079M3(new Function0() { // from class: com.kubi.home.realtime.card.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealTimeWidget.m30070y3(this.f26111b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m30071z3(CardStackView cardStackView, RealTimeWidget realTimeWidget, C37554x0 c37554x0, IRealTimeData it) throws JSONException {
        RealTimeViewType viewType;
        Intrinsics.checkNotNullParameter(it, "it");
        if (cardStackView.getChildCount() > 1) {
            RealTimeDialog.f26127u0.show(realTimeWidget.getParentFragmentManager());
        } else {
            Intrinsics.checkNotNull(cardStackView);
            View view = (View) SequencesKt.firstOrNull(ViewGroupKt.getChildren(cardStackView));
            if (view != null) {
                view.performClick();
            }
        }
        CardStackView.CardData topCard = c37554x0.f83493d.getTopCard();
        String typeName = null;
        IRealTimeData iRealTimeDataM30183c = topCard != null ? topCard.getBusinessData() : null;
        if (C44542b.f98754a.m98608c()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", String.valueOf(iRealTimeDataM30183c != null ? iRealTimeDataM30183c.getViewTypeV2() : null));
            typeName = iRealTimeDataM30183c != null ? iRealTimeDataM30183c.getReportStatus() : null;
            if (typeName != null && typeName.length() != 0) {
                jSONObject.put("status", String.valueOf(iRealTimeDataM30183c.getReportStatus()));
            }
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "realtimeUpdatesCard", null, jSONObject, 4, null);
        } else {
            String code = HomeWidgetCode.RealTime.getCode();
            JSONObject jSONObject2 = new JSONObject();
            if (iRealTimeDataM30183c != null && (viewType = iRealTimeDataM30183c.getViewType()) != null) {
                typeName = viewType.getTypeName();
            }
            jSONObject2.put("type", String.valueOf(typeName));
            jSONObject2.put("norm_version", "1");
            Unit unit2 = Unit.INSTANCE;
            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject2, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public final void m30072B3() {
        Iterator<T> it = C42562k.f94240a.m93317p().iterator();
        while (it.hasNext()) {
            final ViewLifecycleListener viewLifecycleListener = (ViewLifecycleListener) it.next();
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.realtime.card.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealTimeWidget.m30053C3(viewLifecycleListener);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m30073D3() {
        Iterator<T> it = C42562k.f94240a.m93317p().iterator();
        while (it.hasNext()) {
            final ViewLifecycleListener viewLifecycleListener = (ViewLifecycleListener) it.next();
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.realtime.card.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealTimeWidget.m30054E3(viewLifecycleListener);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m30074F3() {
        Iterator<T> it = C42562k.f94240a.m93317p().iterator();
        while (it.hasNext()) {
            final ViewLifecycleListener viewLifecycleListener = (ViewLifecycleListener) it.next();
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.realtime.card.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealTimeWidget.m30055G3(viewLifecycleListener);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m30075H3(IRealTimeData iRealTimeData) {
        if (iRealTimeData == null) {
            return;
        }
        C42562k.f94240a.m93324x(new ViewLifecycleEvent.Hide(iRealTimeData, iRealTimeData.getViewType()));
    }

    /* JADX INFO: renamed from: I3 */
    public final void m30076I3(IRealTimeData iRealTimeData) {
        if (iRealTimeData == null) {
            return;
        }
        C42562k.f94240a.m93324x(new ViewLifecycleEvent.Show(iRealTimeData, iRealTimeData.getViewType()));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.layout_home_realtime_widget;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<? extends AbstractC19291m<RealTimeWidgetContract$UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RealTimeWidgetVM.class);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: q */
    public void mo30081q(@NotNull BaseCardDataV2 data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo30081q(data, z11);
        if (z11) {
            return;
        }
        C42562k.f94240a.m93311N(data.getDefaultData());
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public final C37554x0 m30083v3() {
        return (C37554x0) this.f26093X.getValue(this, f26092a0[0]);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m30053C3(ViewLifecycleListener viewLifecycleListener) {
        viewLifecycleListener.mo30040b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m30054E3(ViewLifecycleListener viewLifecycleListener) {
        viewLifecycleListener.mo30043e();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m30055G3(ViewLifecycleListener viewLifecycleListener) {
        viewLifecycleListener.mo30039a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m30056J3(RealTimeWidget realTimeWidget) {
        realTimeWidget.m30077K3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m30070y3(RealTimeWidget realTimeWidget) {
        realTimeWidget.m30077K3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public final void m30077K3() {
        int childCount;
        boolean z11;
        IRealTimeData iRealTimeDataM30183c;
        CardStackView cardStackView;
        CardStackView.CardData topCard;
        CardStackView cardStackView2;
        C37554x0 c37554x0M30083v3 = m30083v3();
        if (c37554x0M30083v3 != null && (cardStackView2 = c37554x0M30083v3.f83493d) != null) {
            childCount = cardStackView2.getChildCount();
        } else {
            childCount = 0;
        }
        if (childCount > 0 && UserInfo.a.n()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m30078L3();
            C37554x0 c37554x0M30083v4 = m30083v3();
            if (c37554x0M30083v4 != null && (cardStackView = c37554x0M30083v4.f83493d) != null && (topCard = cardStackView.getTopCard()) != null) {
                iRealTimeDataM30183c = topCard.getBusinessData();
            } else {
                iRealTimeDataM30183c = null;
            }
            m30076I3(iRealTimeDataM30183c);
            C15000n.m30816f(this, true);
            return;
        }
        m30078L3();
        C15000n.m30816f(this, false);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m30078L3() {
        C37554x0 c37554x0M30083v3 = m30083v3();
        if (c37554x0M30083v3 != null) {
            int childCount = c37554x0M30083v3.f83493d.getChildCount();
            if (childCount > 1) {
                c37554x0M30083v3.f83492c.setText(String.valueOf(childCount));
                KcLabelView labelRealtimeCount = c37554x0M30083v3.f83492c;
                Intrinsics.checkNotNullExpressionValue(labelRealtimeCount, "labelRealtimeCount");
                C27046k.m66685H(labelRealtimeCount);
                AppCompatImageView buttonClose = c37554x0M30083v3.f83491b;
                Intrinsics.checkNotNullExpressionValue(buttonClose, "buttonClose");
                C27046k.m66700o(buttonClose);
                return;
            }
            c37554x0M30083v3.f83492c.setText("");
            KcLabelView labelRealtimeCount2 = c37554x0M30083v3.f83492c;
            Intrinsics.checkNotNullExpressionValue(labelRealtimeCount2, "labelRealtimeCount");
            C27046k.m66700o(labelRealtimeCount2);
            AppCompatImageView buttonClose2 = c37554x0M30083v3.f83491b;
            Intrinsics.checkNotNullExpressionValue(buttonClose2, "buttonClose");
            C27046k.m66685H(buttonClose2);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m30079M3(Function0<Unit> function0) {
        if (isAdded() && getView() != null && getViewLifecycleOwner().getLifecycle().getState() != Lifecycle.State.DESTROYED) {
            function0.invoke();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new RealTimeWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        super.initView();
        C42562k c42562k = C42562k.f94240a;
        c42562k.m93323v();
        m30068w3();
        final C37554x0 c37554x0M30083v3 = m30083v3();
        if (c37554x0M30083v3 != null) {
            final CardStackView cardStackView = c37554x0M30083v3.f83493d;
            Intrinsics.checkNotNull(cardStackView);
            CardStackIntegrationUIListener cardStackIntegrationUIListener = new CardStackIntegrationUIListener(cardStackView, new Function0() { // from class: com.kubi.home.realtime.card.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealTimeWidget.m30069x3(this.f26104b, c37554x0M30083v3);
                }
            });
            this.f26095Z = cardStackIntegrationUIListener;
            cardStackIntegrationUIListener.m30092f();
            cardStackView.setOnCardClickListener(new Function1() { // from class: com.kubi.home.realtime.card.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RealTimeWidget.m30071z3(cardStackView, this, c37554x0M30083v3, (IRealTimeData) obj);
                }
            });
            AppCompatImageView buttonClose = c37554x0M30083v3.f83491b;
            Intrinsics.checkNotNullExpressionValue(buttonClose, "buttonClose");
            C27046k.m66711z(buttonClose, 0L, new Function0() { // from class: com.kubi.home.realtime.card.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealTimeWidget.m30052A3(c37554x0M30083v3);
                }
            }, 1, null);
        }
        c42562k.m93303A();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: k0 */
    public void mo30080k0() {
        CardStackView cardStackView;
        super.mo30080k0();
        C37554x0 c37554x0M30083v3 = m30083v3();
        if (c37554x0M30083v3 != null && (cardStackView = c37554x0M30083v3.f83493d) != null) {
            cardStackView.setHomeDragMode(false);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CardStackIntegrationUIListener cardStackIntegrationUIListener = this.f26095Z;
        if (cardStackIntegrationUIListener != null) {
            cardStackIntegrationUIListener.m30093h();
        }
        InterfaceC42553b interfaceC42553b = this.f26094Y;
        if (interfaceC42553b != null) {
            C42562k.f94240a.m93308H(interfaceC42553b);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onHide() {
        IRealTimeData iRealTimeDataM30183c;
        CardStackView cardStackView;
        CardStackView.CardData topCard;
        super.onHide();
        m30072B3();
        C37554x0 c37554x0M30083v3 = m30083v3();
        if (c37554x0M30083v3 != null && (cardStackView = c37554x0M30083v3.f83493d) != null && (topCard = cardStackView.getTopCard()) != null) {
            iRealTimeDataM30183c = topCard.getBusinessData();
        } else {
            iRealTimeDataM30183c = null;
        }
        m30075H3(iRealTimeDataM30183c);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        m30074F3();
        m30079M3(new Function0() { // from class: com.kubi.home.realtime.card.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealTimeWidget.m30056J3(this.f26102b);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: r0 */
    public void mo30082r0() {
        CardStackView cardStackView;
        super.mo30082r0();
        C37554x0 c37554x0M30083v3 = m30083v3();
        if (c37554x0M30083v3 != null && (cardStackView = c37554x0M30083v3.f83493d) != null) {
            cardStackView.setHomeDragMode(true);
        }
    }
}
