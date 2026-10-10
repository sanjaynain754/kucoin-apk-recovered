package com.kubi.quotefacade.widgets.fear;

import android.graphics.Color;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import bv.C4703x0;
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
import com.kubi.resources.widget.bizshimmer.HomeShimmerFullCard;
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

/* JADX INFO: compiled from: FearGreedFullWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\"H\u0002J\u0017\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010&J\u0017\u0010'\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010(J\u0017\u0010)\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010&R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/quotefacade/widgets/fear/FearGreedContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/widgets/fear/FearGreedWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/QuoteWidgetFearGreedFullBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/QuoteWidgetFearGreedFullBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "fillViewData", "Lcom/kubi/quotefacade/entity/WidgetFearGreedEntity;", "scoreWithStatus", "", FirebaseAnalytics.Param.SCORE, "(Ljava/lang/Integer;)Ljava/lang/String;", "textColor", "(Ljava/lang/Integer;)I", "textByScore", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFearGreedFullWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FearGreedFullWidget.kt\ncom/kubi/quotefacade/widgets/fear/FearGreedFullWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 Color.kt\nandroidx/core/graphics/ColorKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n147#2,16:207\n153#3,7:223\n93#4,4:230\n470#5:234\n35#6,4:235\n39#6:241\n44#7,2:239\n1#8:242\n*S KotlinDebug\n*F\n+ 1 FearGreedFullWidget.kt\ncom/kubi/quotefacade/widgets/fear/FearGreedFullWidget\n*L\n49#1:207,16\n68#1:223,7\n80#1:230,4\n188#1:234\n166#1:235,4\n166#1:241\n166#1:239,2\n*E\n"})
public final class FearGreedFullWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f42814Y = {Reflection.property1(new PropertyReference1Impl(FearGreedFullWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/QuoteWidgetFearGreedFullBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f42815X = C45681e.m100799e(this, new Function1<FearGreedFullWidget, C4703x0>() { // from class: com.kubi.quotefacade.widgets.fear.FearGreedFullWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4703x0 invoke(@NotNull FearGreedFullWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4703x0.m4718a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4703x0, Unit>() { // from class: com.kubi.quotefacade.widgets.fear.FearGreedFullWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4703x0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4703x0 c4703x0) {
            invoke(c4703x0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.fear.FearGreedFullWidget$a */
    /* JADX INFO: compiled from: FearGreedFullWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/quotefacade/widgets/fear/FearGreedFullWidget$fillViewData$1$3", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFearGreedFullWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FearGreedFullWidget.kt\ncom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$fillViewData$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
    public static final class ViewTreeObserverOnGlobalLayoutListenerC22626a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseTextView f42816b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BaseTextView f42817c;

        public ViewTreeObserverOnGlobalLayoutListenerC22626a(BaseTextView baseTextView, BaseTextView baseTextView2) {
            this.f42816b = baseTextView;
            this.f42817c = baseTextView2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f42816b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int iMax = Math.max(this.f42816b.getMeasuredWidth(), this.f42817c.getMeasuredWidth());
            if (iMax > 0) {
                BaseTextView baseTextView = this.f42816b;
                ViewGroup.LayoutParams layoutParams = baseTextView.getLayoutParams();
                layoutParams.width = iMax;
                baseTextView.setLayoutParams(layoutParams);
                BaseTextView baseTextView2 = this.f42817c;
                ViewGroup.LayoutParams layoutParams2 = baseTextView2.getLayoutParams();
                layoutParams2.width = iMax;
                baseTextView2.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.fear.FearGreedFullWidget$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C22627b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m53448s3() throws JSONException {
        Object objM20457a;
        String code = HomeWidgetCode.FearAndGreedIndex.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C22627b().getType();
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

    /* JADX INFO: renamed from: v3 */
    private final void m53449v3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.fear.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FearGreedFullWidget.m53450w3(this.f42823b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m53451x3(C4703x0 c4703x0, FearGreedFullWidget fearGreedFullWidget) {
        c4703x0.f4618j.setLoading(true);
        fearGreedFullWidget.sendIntent(new FearGreedContract$UiIntent.LoadData(true));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22631a) {
            m53449v3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.quote_widget_fear_greed_full;
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
        C4703x0 c4703x0M53453t3 = m53453t3();
        if (c4703x0M53453t3 == null || (baseTextView = c4703x0M53453t3.f4621m) == null) {
            return;
        }
        baseTextView.setText(data.getTitle());
    }

    /* JADX INFO: renamed from: q3 */
    public final void m53452q3(final WidgetFearGreedEntity widgetFearGreedEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.fear.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FearGreedFullWidget.m53447r3(this.f42825b, widgetFearGreedEntity);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: t3 */
    public final C4703x0 m53453t3() {
        return (C4703x0) this.f42815X.getValue(this, f42814Y[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final String m53454u3(Integer num) {
        if (num == null) {
            return "--";
        }
        return num + ' ' + m53455y3(num);
    }

    /* JADX INFO: renamed from: y3 */
    public final String m53455y3(Integer num) {
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

    /* JADX INFO: renamed from: z3 */
    public final int m53456z3(Integer num) {
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

    /* JADX INFO: renamed from: r3 */
    public static final Unit m53447r3(FearGreedFullWidget fearGreedFullWidget, WidgetFearGreedEntity widgetFearGreedEntity) {
        FearGreedValueEntity value;
        Integer score;
        Integer score2;
        String string;
        int i11;
        FearGreedValueEntity value2;
        Integer score3;
        FearGreedValueEntity value3;
        C4703x0 c4703x0M53453t3 = fearGreedFullWidget.m53453t3();
        if (c4703x0M53453t3 == null) {
            return Unit.INSTANCE;
        }
        fearGreedFullWidget.m53449v3(false);
        FearGreedEntity today = widgetFearGreedEntity.getToday();
        Integer score4 = null;
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
        BaseTextView baseTextView = c4703x0M53453t3.f4619k;
        if (score2 == null || (string = score2.toString()) == null) {
            string = "--";
        }
        baseTextView.setText(string);
        c4703x0M53453t3.f4619k.setTextColor(fearGreedFullWidget.m53456z3(score2));
        c4703x0M53453t3.f4620l.setText(fearGreedFullWidget.m53455y3(score2));
        c4703x0M53453t3.f4620l.setTextColor(fearGreedFullWidget.m53456z3(score2));
        AppCompatImageView appCompatImageView = c4703x0M53453t3.f4614f;
        if (C27039d.m66651k(score2, -1) >= 0) {
            i11 = R$mipmap.quote_ic_fear_greed;
        } else {
            i11 = R$mipmap.quote_ic_fear_greed_gray;
        }
        appCompatImageView.setImageResource(i11);
        if (score2 != null && score2.intValue() >= 0 && score2.intValue() <= 100) {
            AppCompatImageView indexIndictor = c4703x0M53453t3.f4615g;
            Intrinsics.checkNotNullExpressionValue(indexIndictor, "indexIndictor");
            C27046k.m66685H(indexIndictor);
            float fIntValue = 270 + (((score2.intValue() * 1.0f) / 100) * 180);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(c4703x0M53453t3.f4616h);
            constraintSet.constrainCircle(R$id.indexIndictor, R$id.bgViewBottom, C27040e.m66658b(42), fIntValue);
            constraintSet.applyTo(c4703x0M53453t3.f4616h);
        } else {
            AppCompatImageView indexIndictor2 = c4703x0M53453t3.f4615g;
            Intrinsics.checkNotNullExpressionValue(indexIndictor2, "indexIndictor");
            C27046k.m66700o(indexIndictor2);
        }
        FearGreedEntity yesterday = widgetFearGreedEntity.getYesterday();
        if (yesterday != null) {
            value2 = yesterday.getValue();
        } else {
            value2 = null;
        }
        if (value2 != null) {
            score3 = value2.getScore();
        } else {
            score3 = null;
        }
        c4703x0M53453t3.f4625q.setText(fearGreedFullWidget.m53454u3(score3));
        c4703x0M53453t3.f4625q.setTextColor(fearGreedFullWidget.m53456z3(score3));
        FearGreedEntity aweekAgo = widgetFearGreedEntity.getAweekAgo();
        if (aweekAgo != null) {
            value3 = aweekAgo.getValue();
        } else {
            value3 = null;
        }
        if (value3 != null) {
            score4 = value3.getScore();
        }
        c4703x0M53453t3.f4623o.setText(fearGreedFullWidget.m53454u3(score4));
        c4703x0M53453t3.f4623o.setTextColor(fearGreedFullWidget.m53456z3(score4));
        BaseTextView tvYesterdayLabel = c4703x0M53453t3.f4624p;
        Intrinsics.checkNotNullExpressionValue(tvYesterdayLabel, "tvYesterdayLabel");
        BaseTextView tvWeekAgoLabel = c4703x0M53453t3.f4622n;
        Intrinsics.checkNotNullExpressionValue(tvWeekAgoLabel, "tvWeekAgoLabel");
        ViewGroup.LayoutParams layoutParams = tvYesterdayLabel.getLayoutParams();
        layoutParams.width = -2;
        tvYesterdayLabel.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = tvWeekAgoLabel.getLayoutParams();
        layoutParams2.width = -2;
        tvWeekAgoLabel.setLayoutParams(layoutParams2);
        tvYesterdayLabel.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC22626a(tvYesterdayLabel, tvWeekAgoLabel));
        MaterialCardView materialCardViewM4719b = c4703x0M53453t3.getRoot();
        Intrinsics.checkNotNullExpressionValue(materialCardViewM4719b, "getRoot(...)");
        C27046k.m66710y(materialCardViewM4719b, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.fear.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FearGreedFullWidget.m53448s3();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m53450w3(final FearGreedFullWidget fearGreedFullWidget, boolean z11) {
        final C4703x0 c4703x0M53453t3 = fearGreedFullWidget.m53453t3();
        if (c4703x0M53453t3 == null) {
            return Unit.INSTANCE;
        }
        c4703x0M53453t3.f4617i.m54970c();
        c4703x0M53453t3.f4618j.setLoading(false);
        if (z11) {
            Group groupContent = c4703x0M53453t3.f4613e;
            Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
            C27046k.m66703r(groupContent);
            ReloadRefreshView reloadView = c4703x0M53453t3.f4618j;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c4703x0M53453t3.f4618j;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.fear.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FearGreedFullWidget.m53451x3(c4703x0M53453t3, fearGreedFullWidget);
                }
            }, 1, null);
        } else {
            Group groupContent2 = c4703x0M53453t3.f4613e;
            Intrinsics.checkNotNullExpressionValue(groupContent2, "groupContent");
            C27046k.m66685H(groupContent2);
            ReloadRefreshView reloadView3 = c4703x0M53453t3.f4618j;
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
        C12572a.m23692a(this, false, new C22628xc997c059("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.fear.FearGreedFullWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new FearGreedFullWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        HomeShimmerFullCard homeShimmerFullCard;
        super.initView();
        C4703x0 c4703x0M53453t3 = m53453t3();
        if (c4703x0M53453t3 != null && (homeShimmerFullCard = c4703x0M53453t3.f4617i) != null) {
            homeShimmerFullCard.m54971e();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(new FearGreedContract$UiIntent.LoadData(false, 1, null));
    }
}
