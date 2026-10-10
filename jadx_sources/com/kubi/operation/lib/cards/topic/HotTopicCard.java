package com.kubi.operation.lib.cards.topic;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$mipmap;
import com.kubi.operation.lib.entity.CoinTopicEntity;
import com.kubi.operation.lib.entity.TopicCurrency;
import com.kubi.operation.lib.entity.TopicScrollInfo;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.operation.lib.utils.EntranceStatus;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p701vs.C45626c;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: HotTopicCard.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/topic/HotTopicCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "binding", "Lcom/kubi/operation/lib/databinding/OperationFragmentHomeCardHotTopicBinding;", "getBinding", "()Lcom/kubi/operation/lib/databinding/OperationFragmentHomeCardHotTopicBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "viewModel", "Lcom/kubi/operation/lib/cards/topic/HotTopicCardVM;", "getViewModel", "()Lcom/kubi/operation/lib/cards/topic/HotTopicCardVM;", "viewModel$delegate", "Lkotlin/Lazy;", "bindToUI", "", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "addObservers", "closeEntrance", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onMoveStart", "onMoveStop", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHotTopicCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotTopicCard.kt\ncom/kubi/operation/lib/cards/topic/HotTopicCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,129:1\n147#2,16:130\n158#3,2:146\n1#4:148\n220#5,5:149\n*S KotlinDebug\n*F\n+ 1 HotTopicCard.kt\ncom/kubi/operation/lib/cards/topic/HotTopicCard\n*L\n37#1:130,16\n46#1:146,2\n41#1:149,5\n*E\n"})
public final class HotTopicCard extends BaseCard {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f36717X = {Reflection.property1(new PropertyReference1Impl(HotTopicCard.class, "binding", "getBinding()Lcom/kubi/operation/lib/databinding/OperationFragmentHomeCardHotTopicBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f36718V = C45681e.m100799e(this, new Function1<HotTopicCard, C45626c>() { // from class: com.kubi.operation.lib.cards.topic.HotTopicCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45626c invoke(@NotNull HotTopicCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45626c.m100737a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45626c, Unit>() { // from class: com.kubi.operation.lib.cards.topic.HotTopicCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45626c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45626c c45626c) {
            invoke(c45626c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f36719W = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.cards.topic.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HotTopicCard.m43394t3(this.f36727b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.topic.HotTopicCard$a */
    /* JADX INFO: compiled from: HotTopicCard.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19473a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f36720b;

        public C19473a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f36720b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f36720b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36720b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        final CoinTopicEntity data2;
        RoundImageView roundImageView;
        RoundImageView roundImageView2;
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout;
        MarqueeTextView marqueeTextView;
        View view;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        RoundImageView roundImageView3;
        RoundImageView roundImageView4;
        RoundImageView roundImageView5;
        RoundImageView roundImageView6;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(data, "data");
        m43389l3();
        C45626c c45626cM43396r3 = m43396r3();
        if (c45626cM43396r3 != null && (imageView = c45626cM43396r3.f102776d) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.topic.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HotTopicCard.m43392o3(this.f36725b);
                }
            }, 1, null);
        }
        if (C12573b.f21598a.m23696a()) {
            "EVENT_CLOSE_ENTRANCE".length();
        }
        C12572a.m23692a(this, false, new HotTopicCard$bindToUI$$inlined$bindFlowEvent$1("EVENT_CLOSE_ENTRANCE", null, this));
        HotTopicCardData hotTopicCardData = data instanceof HotTopicCardData ? (HotTopicCardData) data : null;
        if (hotTopicCardData == null || (data2 = hotTopicCardData.getData()) == null) {
            return;
        }
        C45626c c45626cM43396r4 = m43396r3();
        if (c45626cM43396r4 != null && (roundImageView6 = c45626cM43396r4.f102774b) != null) {
            C19570t.m43667e(roundImageView6, data2.getBackUrl(), null, 2, null);
        }
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        if (dayNightThemeManager.m33187l()) {
            C45626c c45626cM43396r5 = m43396r3();
            if (c45626cM43396r5 != null && (roundImageView5 = c45626cM43396r5.f102774b) != null) {
                ViewExtKt.m66584o(roundImageView5, 0, 0, 0, 0);
            }
            C45626c c45626cM43396r6 = m43396r3();
            if (c45626cM43396r6 != null && (roundImageView4 = c45626cM43396r6.f102775c) != null) {
                ViewExtKt.m66584o(roundImageView4, 0, 0, 0, 0);
            }
        } else {
            C45626c c45626cM43396r7 = m43396r3();
            if (c45626cM43396r7 != null && (roundImageView2 = c45626cM43396r7.f102774b) != null) {
                ViewExtKt.m66584o(roundImageView2, 0, C27040e.m66658b(1), C27040e.m66658b(1), C27040e.m66658b(1));
            }
            C45626c c45626cM43396r8 = m43396r3();
            if (c45626cM43396r8 != null && (roundImageView = c45626cM43396r8.f102775c) != null) {
                ViewExtKt.m66584o(roundImageView, 0, C27040e.m66658b(1), C27040e.m66658b(1), C27040e.m66658b(1));
            }
        }
        C45626c c45626cM43396r9 = m43396r3();
        if (c45626cM43396r9 != null && (roundImageView3 = c45626cM43396r9.f102775c) != null) {
            roundImageView3.setImageResource(dayNightThemeManager.m33187l() ? R$mipmap.operation_hotcard_bg_mask_day : R$mipmap.operation_hotcard_bg_mask_dark);
        }
        C45626c c45626cM43396r10 = m43396r3();
        if (c45626cM43396r10 != null && (baseTextView2 = c45626cM43396r10.f102784l) != null) {
            baseTextView2.setText(C27041f.m66668h(data2.getAnchorsTitle()));
        }
        C45626c c45626cM43396r11 = m43396r3();
        if (c45626cM43396r11 != null && (baseTextView = c45626cM43396r11.f102785m) != null) {
            baseTextView.setText(C27041f.m66668h(data2.getTopicTitle()));
        }
        List<TopicScrollInfo> scrollInfo = data2.getScrollInfo();
        if (scrollInfo == null) {
            scrollInfo = CollectionsKt.emptyList();
        }
        C45626c c45626cM43396r12 = m43396r3();
        if (c45626cM43396r12 != null && (view = c45626cM43396r12.f102786n) != null) {
            view.setVisibility(scrollInfo.isEmpty() ? 4 : 0);
        }
        C45626c c45626cM43396r13 = m43396r3();
        if (c45626cM43396r13 != null && (marqueeTextView = c45626cM43396r13.f102781i) != null) {
            marqueeTextView.setContentList(scrollInfo);
        }
        List<TopicCurrency> currencies = data2.getCurrencies();
        TopicCurrency topicCurrency = currencies != null ? (TopicCurrency) CollectionsKt.firstOrNull((List) currencies) : null;
        if (topicCurrency != null) {
            C45626c c45626cM43396r14 = m43396r3();
            if (c45626cM43396r14 != null) {
                FrameLayout layoutCoin = c45626cM43396r14.f102778f;
                Intrinsics.checkNotNullExpressionValue(layoutCoin, "layoutCoin");
                ViewExtKt.m66594y(layoutCoin);
                c45626cM43396r14.f102783k.setText(C19570t.m43665c(topicCurrency.getChangeRate()));
                C19570t.m43666d(c45626cM43396r14.f102777e, topicCurrency.getLogo(), Integer.valueOf(R$mipmap.kucoin_icon_default_icon));
                BaseTextView baseTextView3 = c45626cM43396r14.f102783k;
                Context context = baseTextView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                baseTextView3.setBackgroundTintList(ColorStateList.valueOf(C22890g.m54279d(context, DowngradeExKt.m66538h(topicCurrency.getChangeRate(), 0.0d, 1, null), 0, 2, null)));
            }
            String symbol = topicCurrency.getSymbol();
            if (symbol != null) {
                m43397s3().m43401o(symbol);
            }
        } else {
            C45626c c45626cM43396r15 = m43396r3();
            if (c45626cM43396r15 != null && (frameLayout = c45626cM43396r15.f102778f) != null) {
                ViewExtKt.m66577h(frameLayout);
            }
        }
        C45626c c45626cM43396r16 = m43396r3();
        if (c45626cM43396r16 != null && (constraintLayout = c45626cM43396r16.f102782j) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.topic.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HotTopicCard.m43393p3(data2);
                }
            }, 1, null);
        }
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "hotspot", null, null, 12, null);
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m43390m3(final HotTopicCard hotTopicCard, final String str) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.topic.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotTopicCard.m43391n3(this.f36729b, str);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final HotTopicCardVM m43394t3(HotTopicCard hotTopicCard) {
        return (HotTopicCardVM) new ViewModelProvider(hotTopicCard).get(HotTopicCardVM.class);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.operation_fragment_home_card_hot_topic;
    }

    /* JADX INFO: renamed from: r3 */
    public final C45626c m43396r3() {
        return (C45626c) this.f36718V.getValue(this, f36717X[0]);
    }

    /* JADX INFO: renamed from: s3 */
    public final HotTopicCardVM m43397s3() {
        return (HotTopicCardVM) this.f36719W.getValue();
    }

    /* JADX INFO: renamed from: l3 */
    private final void m43389l3() {
        m43397s3().m43400n().observe(getViewLifecycleOwner(), new C19473a(new Function1() { // from class: com.kubi.operation.lib.cards.topic.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HotTopicCard.m43390m3(this.f36728b, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m43391n3(HotTopicCard hotTopicCard, String str) {
        double d11;
        C45626c c45626cM43396r3 = hotTopicCard.m43396r3();
        if (c45626cM43396r3 != null) {
            c45626cM43396r3.f102783k.setText(str);
            if (Intrinsics.areEqual(str, "- -")) {
                d11 = 0.0d;
            } else {
                Intrinsics.checkNotNull(str);
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "+", false, 2, (Object) null)) {
                    d11 = 1.0d;
                } else {
                    d11 = -1.0d;
                }
            }
            double d12 = d11;
            BaseTextView baseTextView = c45626cM43396r3.f102783k;
            Context context = baseTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            baseTextView.setBackgroundTintList(ColorStateList.valueOf(C22890g.m54279d(context, d12, 0, 2, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m43392o3(HotTopicCard hotTopicCard) {
        hotTopicCard.m43395q3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m43393p3(CoinTopicEntity coinTopicEntity) {
        String topicUrl = coinTopicEntity.getTopicUrl();
        if (topicUrl != null) {
            Router.f46192a.m56184f(topicUrl).m4048k();
        }
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "hotspot", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        super.mo28981P();
        if (getView() != null) {
            m43389l3();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        super.mo28982Q();
        if (getView() != null) {
            m43397s3().m43400n().removeObservers(getViewLifecycleOwner());
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        MarqueeTextView marqueeTextView;
        super.onHide();
        C45626c c45626cM43396r3 = m43396r3();
        if (c45626cM43396r3 != null && (marqueeTextView = c45626cM43396r3.f102781i) != null) {
            marqueeTextView.m54677n();
        }
        m43397s3().onHide();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() throws Throwable {
        MarqueeTextView marqueeTextView;
        super.onShow();
        C45626c c45626cM43396r3 = m43396r3();
        if (c45626cM43396r3 != null && (marqueeTextView = c45626cM43396r3.f102781i) != null) {
            marqueeTextView.m54678o();
        }
        m43397s3().onShow();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m43395q3() {
        String code;
        EntranceStatus.m43661a();
        BaseCardData f27849u = getF27849U();
        if (f27849u != null) {
            code = f27849u.getCode();
        } else {
            code = null;
        }
        C19570t.m43664b(code);
    }
}
