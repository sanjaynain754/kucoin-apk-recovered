package com.kubi.quotefacade.widgets.fear;

import android.graphics.Color;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import bv.C4701w0;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.FearGreedEntity;
import com.kubi.quotefacade.entity.FearGreedValueEntity;
import com.kubi.quotefacade.entity.WidgetFearGreedEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FearGreedWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\"H\u0002J\u0017\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010(R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006)"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/fear/FearGreedWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/quotefacade/widgets/fear/FearGreedContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/widgets/fear/FearGreedWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/QuoteWidgetFearGreedBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/QuoteWidgetFearGreedBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "fillViewData", "Lcom/kubi/quotefacade/entity/WidgetFearGreedEntity;", "textColor", FirebaseAnalytics.Param.SCORE, "(Ljava/lang/Integer;)I", "textByScore", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFearGreedWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FearGreedWidget.kt\ncom/kubi/quotefacade/widgets/fear/FearGreedWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 Color.kt\nandroidx/core/graphics/ColorKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,164:1\n147#2,16:165\n153#3,7:181\n93#4,4:188\n470#5:192\n35#6,4:193\n39#6:199\n44#7,2:197\n*S KotlinDebug\n*F\n+ 1 FearGreedWidget.kt\ncom/kubi/quotefacade/widgets/fear/FearGreedWidget\n*L\n43#1:165,16\n63#1:181,7\n75#1:188,4\n146#1:192\n132#1:193,4\n132#1:199\n132#1:197,2\n*E\n"})
public final class FearGreedWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f42818Y = {Reflection.property1(new PropertyReference1Impl(FearGreedWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/QuoteWidgetFearGreedBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f42819X = C45681e.m100799e(this, new Function1<FearGreedWidget, C4701w0>() { // from class: com.kubi.quotefacade.widgets.fear.FearGreedWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4701w0 invoke(@NotNull FearGreedWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4701w0.m4714a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4701w0, Unit>() { // from class: com.kubi.quotefacade.widgets.fear.FearGreedWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4701w0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4701w0 c4701w0) {
            invoke(c4701w0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.fear.FearGreedWidget$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C22629a extends TypeToken<Boolean> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public final void m53463q3(final WidgetFearGreedEntity widgetFearGreedEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.fear.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FearGreedWidget.m53464r3(this.f42831b, widgetFearGreedEntity);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m53465s3() throws JSONException {
        Object objM20457a;
        String code = HomeWidgetCode.FearAndGreedIndex.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C22629a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("market_opportunity_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (C27025c.m66567e((Boolean) objM20457a, false)) {
            Router.f46192a.m56184f("krn/router?biz=opportunity&entry=main&component=kucoin_opportunity_rn&isEmbedMode=true&disableAddHome=1&route=GreedDetailPage").m4048k();
        } else {
            KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "discover/emotionDetail", false, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    private final void m53466u3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.fear.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FearGreedWidget.m53467v3(this.f42829b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m53468w3(C4701w0 c4701w0, FearGreedWidget fearGreedWidget) {
        c4701w0.f4598j.setLoading(true);
        fearGreedWidget.sendIntent(new FearGreedContract$UiIntent.LoadData(true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    private final String m53469x3(Integer num) {
        if (num == null) {
            return "--";
        }
        if (num.intValue() <= 20) {
            String string = getString(R$string.platform_market_emotion_very_panic);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (num.intValue() <= 40) {
            String string2 = getString(R$string.platform_market_emotion_panic);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (num.intValue() <= 60) {
            String string3 = getString(R$string.platform_market_emotion_neutral);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (num.intValue() <= 80) {
            String string4 = getString(R$string.platform_market_emotion_greedy);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        String string5 = getString(R$string.platform_market_emotion_very_greedy);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return string5;
    }

    /* JADX INFO: renamed from: y3 */
    private final int m53470y3(Integer num) {
        if (num == null) {
            return getColorRes(R$color.c_text40);
        }
        if (num.intValue() <= 0) {
            return getColorRes(R$color.c_text40);
        }
        if (new IntRange(1, 20).contains(num.intValue())) {
            return getColorRes(R$color.brandGreen);
        }
        if (new IntRange(21, 40).contains(num.intValue())) {
            return Color.parseColor("#FF1E8AF4");
        }
        if (new IntRange(41, 60).contains(num.intValue())) {
            return getColorRes(R$color.c_text60);
        }
        return new IntRange(61, 80).contains(num.intValue()) ? getColorRes(R$color.complementary) : getColorRes(R$color.brandRed);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22631a) {
            m53466u3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.quote_widget_fear_greed;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<FearGreedWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FearGreedWidgetVM.class);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: q */
    public void mo30081q(@NotNull BaseCardDataV2 data, boolean z11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo30081q(data, z11);
        C4701w0 c4701w0M53471t3 = m53471t3();
        if (c4701w0M53471t3 == null || (baseTextView = c4701w0M53471t3.f4601m) == null) {
            return;
        }
        baseTextView.setText(data.getTitle());
    }

    @Nullable
    /* JADX INFO: renamed from: t3 */
    public final C4701w0 m53471t3() {
        return (C4701w0) this.f42819X.getValue(this, f42818Y[0]);
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m53464r3(FearGreedWidget fearGreedWidget, WidgetFearGreedEntity widgetFearGreedEntity) {
        FearGreedValueEntity value;
        Integer score;
        Integer score2;
        String string;
        int i11;
        Integer score3;
        C4701w0 c4701w0M53471t3 = fearGreedWidget.m53471t3();
        if (c4701w0M53471t3 == null) {
            return Unit.INSTANCE;
        }
        fearGreedWidget.m53466u3(false);
        FearGreedEntity today = widgetFearGreedEntity.getToday();
        FearGreedValueEntity value2 = null;
        if (today != null) {
            value = today.getValue();
        } else {
            value = null;
        }
        if (value != null) {
            score = value.getScore();
        } else {
            score = null;
        }
        if (C27039d.m66650j(score) < 0 || value == null) {
            score2 = null;
        } else {
            score2 = value.getScore();
        }
        BaseTextView baseTextView = c4701w0M53471t3.f4599k;
        String str = "--";
        if (score2 == null || (string = score2.toString()) == null) {
            string = "--";
        }
        baseTextView.setText(string);
        c4701w0M53471t3.f4599k.setTextColor(fearGreedWidget.m53470y3(score2));
        c4701w0M53471t3.f4600l.setText(fearGreedWidget.m53469x3(score2));
        c4701w0M53471t3.f4600l.setTextColor(fearGreedWidget.m53470y3(score2));
        FearGreedEntity yesterday = widgetFearGreedEntity.getYesterday();
        if (yesterday != null) {
            value2 = yesterday.getValue();
        }
        BaseTextView baseTextView2 = c4701w0M53471t3.f4603o;
        if (value2 != null && (score3 = value2.getScore()) != null) {
            String str2 = score3.intValue() + '(' + fearGreedWidget.m53469x3(value2.getScore()) + ')';
            if (str2 != null) {
                str = str2;
            }
        }
        baseTextView2.setText(str);
        AppCompatImageView appCompatImageView = c4701w0M53471t3.f4593e;
        if (C27039d.m66651k(score2, -1) >= 0) {
            i11 = R$mipmap.quote_ic_fear_greed;
        } else {
            i11 = R$mipmap.quote_ic_fear_greed_gray;
        }
        appCompatImageView.setImageResource(i11);
        if (score2 != null && score2.intValue() >= 0 && score2.intValue() <= 100) {
            AppCompatImageView indexIndictor = c4701w0M53471t3.f4594f;
            Intrinsics.checkNotNullExpressionValue(indexIndictor, "indexIndictor");
            C27046k.m66685H(indexIndictor);
            float fIntValue = 270 + (((score2.intValue() * 1.0f) / 100) * 180);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(c4701w0M53471t3.f4595g);
            constraintSet.constrainCircle(R$id.indexIndictor, R$id.bgViewBottom, C27040e.m66658b(42), fIntValue);
            constraintSet.applyTo(c4701w0M53471t3.f4595g);
        } else {
            AppCompatImageView indexIndictor2 = c4701w0M53471t3.f4594f;
            Intrinsics.checkNotNullExpressionValue(indexIndictor2, "indexIndictor");
            C27046k.m66700o(indexIndictor2);
        }
        MaterialCardView materialCardViewM4715b = c4701w0M53471t3.getRoot();
        Intrinsics.checkNotNullExpressionValue(materialCardViewM4715b, "getRoot(...)");
        C27046k.m66710y(materialCardViewM4715b, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.fear.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FearGreedWidget.m53465s3();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m53467v3(final FearGreedWidget fearGreedWidget, boolean z11) {
        final C4701w0 c4701w0M53471t3 = fearGreedWidget.m53471t3();
        if (c4701w0M53471t3 == null) {
            return Unit.INSTANCE;
        }
        c4701w0M53471t3.f4596h.m54976c();
        c4701w0M53471t3.f4598j.setLoading(false);
        if (z11) {
            Group groupContent = c4701w0M53471t3.f4592d;
            Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
            C27046k.m66703r(groupContent);
            ReloadRefreshView reloadView = c4701w0M53471t3.f4598j;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c4701w0M53471t3.f4598j;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.fear.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FearGreedWidget.m53468w3(c4701w0M53471t3, fearGreedWidget);
                }
            }, 1, null);
        } else {
            Group groupContent2 = c4701w0M53471t3.f4592d;
            Intrinsics.checkNotNullExpressionValue(groupContent2, "groupContent");
            C27046k.m66685H(groupContent2);
            ReloadRefreshView reloadView3 = c4701w0M53471t3.f4598j;
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
        C12572a.m23692a(this, false, new FearGreedWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.fear.FearGreedWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new FearGreedWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        HomeShimmerHalfCard homeShimmerHalfCard;
        super.initView();
        C4701w0 c4701w0M53471t3 = m53471t3();
        if (c4701w0M53471t3 != null && (homeShimmerHalfCard = c4701w0M53471t3.f4596h) != null) {
            homeShimmerHalfCard.m54977e();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(new FearGreedContract$UiIntent.LoadData(false, 1, null));
    }
}
