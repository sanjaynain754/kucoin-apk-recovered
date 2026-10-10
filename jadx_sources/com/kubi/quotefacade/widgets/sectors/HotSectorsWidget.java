package com.kubi.quotefacade.widgets.sectors;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import bv.C4707z0;
import com.blankj.utilcode.util.C5272h;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.ChancePlateItem;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: HotSectorsWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0016\u0010!\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0012\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0010\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0018\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010/\u001a\u000200H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/sectors/HotSectorsWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/quotefacade/widgets/sectors/HotSectorsContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/widgets/sectors/HotSectorsWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/QuoteWidgetHotSectorsBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/QuoteWidgetHotSectorsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "fillViewData", "dataList", "", "Lcom/kubi/quotefacade/entity/ChancePlateItem;", "jumpToPlateDetail", "tagId", "", "radius", "", "topBg", "Landroid/graphics/drawable/GradientDrawable;", "color", "bottomBg", "bgDrawable", "raduii", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHotSectorsWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotSectorsWidget.kt\ncom/kubi/quotefacade/widgets/sectors/HotSectorsWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,180:1\n147#2,16:181\n153#3,7:197\n93#4,4:204\n35#5,4:208\n39#5:214\n44#6,2:212\n*S KotlinDebug\n*F\n+ 1 HotSectorsWidget.kt\ncom/kubi/quotefacade/widgets/sectors/HotSectorsWidget\n*L\n53#1:181,16\n76#1:197,7\n86#1:204,4\n152#1:208,4\n152#1:214\n152#1:212,2\n*E\n"})
public final class HotSectorsWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f42934Z = {Reflection.property1(new PropertyReference1Impl(HotSectorsWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/QuoteWidgetHotSectorsBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f42935X = C45681e.m100799e(this, new Function1<HotSectorsWidget, C4707z0>() { // from class: com.kubi.quotefacade.widgets.sectors.HotSectorsWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4707z0 invoke(@NotNull HotSectorsWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4707z0.m4726a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4707z0, Unit>() { // from class: com.kubi.quotefacade.widgets.sectors.HotSectorsWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4707z0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4707z0 c4707z0) {
            invoke(c4707z0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public final float f42936Y = C27040e.m66657a(8.0f);

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.sectors.HotSectorsWidget$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C22701a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m53676B3(C4707z0 c4707z0, HotSectorsWidget hotSectorsWidget) {
        c4707z0.f4657g.setLoading(true);
        hotSectorsWidget.sendIntent(HotSectorsContract$UiIntent.LoadData.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    private final GradientDrawable m53677C3(int i11) {
        float f11 = this.f42936Y;
        return m53685r3(i11, new float[]{f11, f11, f11, f11, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    /* JADX INFO: renamed from: r3 */
    private final GradientDrawable m53685r3(int i11, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public final void m53686t3(final List<ChancePlateItem> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotSectorsWidget.m53687u3(this.f42959b, list);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m53687u3(final HotSectorsWidget hotSectorsWidget, List list) {
        C4707z0 c4707z0M53693x3 = hotSectorsWidget.m53693x3();
        if (c4707z0M53693x3 == null) {
            return Unit.INSTANCE;
        }
        Context context = c4707z0M53693x3.getRoot().getContext();
        hotSectorsWidget.m53691z3(false);
        final ChancePlateItem chancePlateItem = (ChancePlateItem) CollectionsKt.getOrNull(list, 0);
        final ChancePlateItem chancePlateItem2 = (ChancePlateItem) CollectionsKt.getOrNull(list, 1);
        if (chancePlateItem != null) {
            String avgChangeRate = chancePlateItem.getAvgChangeRate();
            BigDecimal bigDecimalM66671k = avgChangeRate != null ? C27041f.m66671k(avgChangeRate) : null;
            c4707z0M53693x3.f4658h.setText(chancePlateItem.getTitle());
            c4707z0M53693x3.f4660j.setText(C42180b.m92649n(C42828b.m93915p(C42828b.m93911l(bigDecimalM66671k != null ? C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 55, null) : null))));
            Intrinsics.checkNotNull(context);
            int iM54278c = C22890g.m54278c(context, C27039d.m66647g(bigDecimalM66671k), R$color.c_text40);
            c4707z0M53693x3.f4660j.setTextColor(iM54278c);
            c4707z0M53693x3.f4654d.setBackground(hotSectorsWidget.m53677C3(C5272h.m6229a(iM54278c, 0.04f)));
            LinearLayoutCompat layoutSector1 = c4707z0M53693x3.f4654d;
            Intrinsics.checkNotNullExpressionValue(layoutSector1, "layoutSector1");
            C27046k.m66710y(layoutSector1, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HotSectorsWidget.m53688v3(this.f42965b, chancePlateItem);
                }
            });
        }
        if (chancePlateItem2 != null) {
            String avgChangeRate2 = chancePlateItem2.getAvgChangeRate();
            BigDecimal bigDecimalM66671k2 = avgChangeRate2 != null ? C27041f.m66671k(avgChangeRate2) : null;
            c4707z0M53693x3.f4659i.setText(chancePlateItem2.getTitle());
            c4707z0M53693x3.f4661k.setText(C42180b.m92649n(C42828b.m93915p(C42828b.m93911l(bigDecimalM66671k2 != null ? C42180b.m92642g(bigDecimalM66671k2, null, null, 0, true, false, false, 55, null) : null))));
            Intrinsics.checkNotNull(context);
            int iM54278c2 = C22890g.m54278c(context, C27039d.m66647g(bigDecimalM66671k2), R$color.c_text40);
            c4707z0M53693x3.f4661k.setTextColor(iM54278c2);
            c4707z0M53693x3.f4655e.setBackground(hotSectorsWidget.m53692s3(C5272h.m6229a(iM54278c2, 0.04f)));
            LinearLayoutCompat layoutSector2 = c4707z0M53693x3.f4655e;
            Intrinsics.checkNotNullExpressionValue(layoutSector2, "layoutSector2");
            C27046k.m66710y(layoutSector2, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HotSectorsWidget.m53689w3(this.f42967b, chancePlateItem2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    private final void m53690y3(String str) {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C22701a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("enable_rn_plate", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (!C27025c.m66567e((Boolean) objM20457a, false)) {
            KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "discover/plate?tagId=" + str, false, null, 6, null);
            return;
        }
        String strEncode = Uri.encode("PlateDetailPage?tagId=" + str + "&preSpmId=" + C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, HomeWidgetCode.HotSections.getCode(), null, 4, null));
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/krn/router?biz=opportunity&entry=main&component=kucoin_opportunity_rn&disableAddHome=1&route=");
        sb2.append(strEncode);
        router.m56184f(sb2.toString()).m4048k();
    }

    /* JADX INFO: renamed from: z3 */
    private final void m53691z3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotSectorsWidget.m53675A3(this.f42961b, z11);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22706b) {
            m53691z3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.quote_widget_hot_sectors;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<HotSectorsWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(HotSectorsWidgetVM.class);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: q */
    public void mo30081q(@NotNull BaseCardDataV2 data, boolean z11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo30081q(data, z11);
        C4707z0 c4707z0M53693x3 = m53693x3();
        if (c4707z0M53693x3 == null || (baseTextView = c4707z0M53693x3.f4662l) == null) {
            return;
        }
        baseTextView.setText(data.getTitle());
    }

    /* JADX INFO: renamed from: s3 */
    public final GradientDrawable m53692s3(int i11) {
        float f11 = this.f42936Y;
        return m53685r3(i11, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f11, f11, f11, f11});
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public final C4707z0 m53693x3() {
        return (C4707z0) this.f42935X.getValue(this, f42934Z[0]);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m53675A3(final HotSectorsWidget hotSectorsWidget, boolean z11) {
        final C4707z0 c4707z0M53693x3 = hotSectorsWidget.m53693x3();
        if (c4707z0M53693x3 == null) {
            return Unit.INSTANCE;
        }
        c4707z0M53693x3.f4656f.m54976c();
        c4707z0M53693x3.f4657g.setLoading(false);
        if (z11) {
            Group groupContent = c4707z0M53693x3.f4652b;
            Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
            C27046k.m66703r(groupContent);
            ReloadRefreshView reloadView = c4707z0M53693x3.f4657g;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c4707z0M53693x3.f4657g;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.sectors.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HotSectorsWidget.m53676B3(c4707z0M53693x3, hotSectorsWidget);
                }
            }, 1, null);
        } else {
            Group groupContent2 = c4707z0M53693x3.f4652b;
            Intrinsics.checkNotNullExpressionValue(groupContent2, "groupContent");
            C27046k.m66685H(groupContent2);
            ReloadRefreshView reloadView3 = c4707z0M53693x3.f4657g;
            Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
            C27046k.m66700o(reloadView3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m53688v3(HotSectorsWidget hotSectorsWidget, ChancePlateItem chancePlateItem) throws JSONException {
        hotSectorsWidget.m53690y3(chancePlateItem.getTagId());
        String code = HomeWidgetCode.HotSections.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("name", C27041f.m66668h(chancePlateItem.getTitle()));
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m53689w3(HotSectorsWidget hotSectorsWidget, ChancePlateItem chancePlateItem) throws JSONException {
        hotSectorsWidget.m53690y3(chancePlateItem.getTagId());
        String code = HomeWidgetCode.HotSections.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("name", C27041f.m66668h(chancePlateItem.getTitle()));
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new HotSectorsWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.sectors.HotSectorsWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDataList();
            }
        }, new HotSectorsWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        super.initView();
        C4707z0 c4707z0M53693x3 = m53693x3();
        if (c4707z0M53693x3 == null) {
            return;
        }
        c4707z0M53693x3.f4656f.m54977e();
        LinearLayoutCompat linearLayoutCompat = c4707z0M53693x3.f4654d;
        int i11 = R$color.c_cover2;
        linearLayoutCompat.setBackground(m53677C3(getColorRes(i11)));
        c4707z0M53693x3.f4655e.setBackground(m53692s3(getColorRes(i11)));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(HotSectorsContract$UiIntent.LoadData.INSTANCE);
    }
}
