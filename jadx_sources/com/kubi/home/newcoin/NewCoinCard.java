package com.kubi.home.newcoin;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.home.entity.RecommendNewCoinEntity;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36720e;
import fj.C37518f0;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p058cj.C4988a;
import p311hf.C38184b;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import rs.C44172b;
import w00.C45681e;

/* JADX INFO: compiled from: NewCoinCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\"H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006)"}, m90084d2 = {"Lcom/kubi/home/newcoin/NewCoinCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "kucoinFragmentHomeRecommendedPositionBinding", "Lcom/kubi/home/databinding/KucoinFragmentHomeRecommendedPositionBinding;", "getKucoinFragmentHomeRecommendedPositionBinding", "()Lcom/kubi/home/databinding/KucoinFragmentHomeRecommendedPositionBinding;", "kucoinFragmentHomeRecommendedPositionBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "viewModel", "Lcom/kubi/home/newcoin/NewCoinCardVM;", "getViewModel", "()Lcom/kubi/home/newcoin/NewCoinCardVM;", "viewModel$delegate", "Lkotlin/Lazy;", "onMoveStart", "", "onMoveStop", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "addObserver", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "fillCoinDataView", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/home/entity/RecommendNewCoinEntity;", "setPriceTitle", "displayNewCoinPreview", "displayNewCoinOpen", "displayHotCoin", "bindActivityUI", "orgEntity", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewCoinCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCoinCard.kt\ncom/kubi/home/newcoin/NewCoinCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,259:1\n147#2,16:260\n220#3,5:276\n*S KotlinDebug\n*F\n+ 1 NewCoinCard.kt\ncom/kubi/home/newcoin/NewCoinCard\n*L\n44#1:260,16\n55#1:276,5\n*E\n"})
public final class NewCoinCard extends BaseCard {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f25923X = {Reflection.property1(new PropertyReference1Impl(NewCoinCard.class, "kucoinFragmentHomeRecommendedPositionBinding", "getKucoinFragmentHomeRecommendedPositionBinding()Lcom/kubi/home/databinding/KucoinFragmentHomeRecommendedPositionBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f25924V = C45681e.m100799e(this, new Function1<NewCoinCard, C37518f0>() { // from class: com.kubi.home.newcoin.NewCoinCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37518f0 invoke(@NotNull NewCoinCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37518f0.m84496a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37518f0, Unit>() { // from class: com.kubi.home.newcoin.NewCoinCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37518f0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37518f0 c37518f0) {
            invoke(c37518f0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f25925W = LazyKt.lazy(new Function0() { // from class: com.kubi.home.newcoin.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewCoinCard.m29705B3(this.f25935b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.home.newcoin.NewCoinCard$a */
    /* JADX INFO: compiled from: NewCoinCard.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14727a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f25926b;

        public C14727a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25926b = function;
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
            return this.f25926b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25926b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m29704A3(NewCoinCard newCoinCard) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String strM86147b = C38184b.f85884a.m86147b();
        if (strM86147b.length() > 0) {
            String string = newCoinCard.getString(R$string.rank_volume_new_price_any, strM86147b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            C37518f0 c37518f0M29724x3 = newCoinCard.m29724x3();
            if (c37518f0M29724x3 != null && (baseTextView2 = c37518f0M29724x3.f83269O) != null) {
                baseTextView2.setText(string);
            }
            C37518f0 c37518f0M29724x4 = newCoinCard.m29724x3();
            if (c37518f0M29724x4 != null && (baseTextView = c37518f0M29724x4.f83268N) != null) {
                baseTextView.setText(string);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final NewCoinCardVM m29705B3(NewCoinCard newCoinCard) {
        return (NewCoinCardVM) new ViewModelProvider(newCoinCard).get(NewCoinCardVM.class);
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m29715p3(RecommendNewCoinEntity recommendNewCoinEntity, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        RouteExKt.m56217H(recommendNewCoinEntity.getActivityLink());
        HomeRecommPosHelper.m29735g(recommendNewCoinEntity, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m29716r3(RecommendNewCoinEntity recommendNewCoinEntity) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), C27041f.m66668h(recommendNewCoinEntity.getSymbol()), null, null, null, 14, null);
        HomeRecommPosHelper.m29736h(recommendNewCoinEntity, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m29717t3(RecommendNewCoinEntity recommendNewCoinEntity) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), C27041f.m66668h(recommendNewCoinEntity.getSymbol()), null, null, null, 14, null);
        HomeRecommPosHelper.m29736h(recommendNewCoinEntity, false);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        NewCoinData newCoinData = data instanceof NewCoinData ? (NewCoinData) data : null;
        if (newCoinData != null) {
            m29723w3(newCoinData.getData());
            m29725y3().m29728o();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_home_recommended_position;
    }

    @Override // com.kubi.kucoin.home.cards.BaseCard, com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m29713m3();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX INFO: renamed from: w3 */
    public final void m29723w3(RecommendNewCoinEntity recommendNewCoinEntity) throws JSONException {
        C37518f0 c37518f0M29724x3;
        C37518f0 c37518f0M29724x4;
        C37518f0 c37518f0M29724x5;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        C4988a.m5286a("刷新数据", "coin_recommend");
        m29726z3();
        String type = recommendNewCoinEntity != null ? recommendNewCoinEntity.getType() : null;
        if (type == null) {
            c37518f0M29724x3 = m29724x3();
            if (c37518f0M29724x3 != null && (frameLayout3 = c37518f0M29724x3.f83283n) != null) {
                ViewExtKt.m66577h(frameLayout3);
            }
            c37518f0M29724x4 = m29724x3();
            if (c37518f0M29724x4 != null && (frameLayout2 = c37518f0M29724x4.f83282m) != null) {
                ViewExtKt.m66577h(frameLayout2);
            }
            c37518f0M29724x5 = m29724x3();
            if (c37518f0M29724x5 != null && (frameLayout = c37518f0M29724x5.f83280k) != null) {
                ViewExtKt.m66577h(frameLayout);
            }
        } else {
            int iHashCode = type.hashCode();
            if (iHashCode != -1694901277) {
                if (iHashCode != 2432586) {
                    if (iHashCode == 399798184 && type.equals("PREVIEW")) {
                        m29722u3(recommendNewCoinEntity);
                    } else {
                        c37518f0M29724x3 = m29724x3();
                        if (c37518f0M29724x3 != null) {
                            ViewExtKt.m66577h(frameLayout3);
                        }
                        c37518f0M29724x4 = m29724x3();
                        if (c37518f0M29724x4 != null) {
                            ViewExtKt.m66577h(frameLayout2);
                        }
                        c37518f0M29724x5 = m29724x3();
                        if (c37518f0M29724x5 != null) {
                            ViewExtKt.m66577h(frameLayout);
                        }
                    }
                } else if (type.equals("OPEN")) {
                    m29721s3(recommendNewCoinEntity);
                } else {
                    c37518f0M29724x3 = m29724x3();
                    if (c37518f0M29724x3 != null) {
                        ViewExtKt.m66577h(frameLayout3);
                    }
                    c37518f0M29724x4 = m29724x3();
                    if (c37518f0M29724x4 != null) {
                        ViewExtKt.m66577h(frameLayout2);
                    }
                    c37518f0M29724x5 = m29724x3();
                    if (c37518f0M29724x5 != null) {
                        ViewExtKt.m66577h(frameLayout);
                    }
                }
            } else if (type.equals("HOT_CURRENCY")) {
                m29720q3(recommendNewCoinEntity);
            } else {
                c37518f0M29724x3 = m29724x3();
                if (c37518f0M29724x3 != null) {
                    ViewExtKt.m66577h(frameLayout3);
                }
                c37518f0M29724x4 = m29724x3();
                if (c37518f0M29724x4 != null) {
                    ViewExtKt.m66577h(frameLayout2);
                }
                c37518f0M29724x5 = m29724x3();
                if (c37518f0M29724x5 != null) {
                    ViewExtKt.m66577h(frameLayout);
                }
            }
        }
        if (recommendNewCoinEntity != null) {
            m29719o3(recommendNewCoinEntity);
            HomeRecommPosHelper.m29736h(recommendNewCoinEntity, true);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final C37518f0 m29724x3() {
        return (C37518f0) this.f25924V.getValue(this, f25923X[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public final NewCoinCardVM m29725y3() {
        return (NewCoinCardVM) this.f25925W.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    public final void m29726z3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.newcoin.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewCoinCard.m29704A3(this.f25933b);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    private final void m29713m3() {
        m29725y3().m29727n().observe(getViewLifecycleOwner(), new C14727a(new Function1() { // from class: com.kubi.home.newcoin.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewCoinCard.m29714n3(this.f25936b, (RecommendNewCoinEntity) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m29714n3(NewCoinCard newCoinCard, RecommendNewCoinEntity recommendNewCoinEntity) throws JSONException {
        newCoinCard.m29723w3(recommendNewCoinEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m29718v3(RecommendNewCoinEntity recommendNewCoinEntity) throws JSONException {
        if (recommendNewCoinEntity.getLink() == null) {
            return Unit.INSTANCE;
        }
        Router.f46192a.m56184f(recommendNewCoinEntity.getLink()).m4048k();
        HomeRecommPosHelper.m29736h(recommendNewCoinEntity, false);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        super.mo28981P();
        if (getView() != null) {
            m29713m3();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        super.mo28982Q();
        if (getView() != null) {
            m29725y3().m29727n().removeObservers(getViewLifecycleOwner());
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final void m29719o3(final RecommendNewCoinEntity recommendNewCoinEntity) throws JSONException {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout3;
        String activityContent = recommendNewCoinEntity.getActivityContent();
        if (activityContent != null && activityContent.length() != 0) {
            C37518f0 c37518f0M29724x3 = m29724x3();
            if (c37518f0M29724x3 != null && (constraintLayout3 = c37518f0M29724x3.f83279j) != null) {
                ViewExtKt.m66594y(constraintLayout3);
            }
            C37518f0 c37518f0M29724x4 = m29724x3();
            if (c37518f0M29724x4 != null && (baseTextView = c37518f0M29724x4.f83272c) != null) {
                baseTextView.setText(recommendNewCoinEntity.getActivityContent());
            }
            C37518f0 c37518f0M29724x5 = m29724x3();
            if (c37518f0M29724x5 != null && (constraintLayout2 = c37518f0M29724x5.f83279j) != null) {
                ViewExtKt.m66575f(constraintLayout2, new Function1() { // from class: com.kubi.home.newcoin.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NewCoinCard.m29715p3(recommendNewCoinEntity, (View) obj);
                    }
                });
            }
            HomeRecommPosHelper.m29735g(recommendNewCoinEntity, true);
            return;
        }
        C37518f0 c37518f0M29724x6 = m29724x3();
        if (c37518f0M29724x6 != null && (constraintLayout = c37518f0M29724x6.f83279j) != null) {
            ViewExtKt.m66577h(constraintLayout);
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        super.onHide();
        m29725y3().onHide();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() throws Throwable {
        super.onShow();
        m29725y3().onShow();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m29720q3(final RecommendNewCoinEntity recommendNewCoinEntity) {
        String strM93915p;
        FrameLayout frameLayout;
        HomeRecommPosTagFlexBoxLayout homeRecommPosTagFlexBoxLayout;
        View view;
        LinearLayout linearLayout;
        int i11;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        ShowHideTextView showHideTextView3;
        TextView textViewM97383c;
        String strM85579c;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        CoinAvatarView coinAvatarView;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        C37518f0 c37518f0M29724x3 = m29724x3();
        if (c37518f0M29724x3 != null && (frameLayout4 = c37518f0M29724x3.f83283n) != null) {
            ViewExtKt.m66577h(frameLayout4);
        }
        C37518f0 c37518f0M29724x4 = m29724x3();
        if (c37518f0M29724x4 != null && (frameLayout3 = c37518f0M29724x4.f83282m) != null) {
            ViewExtKt.m66577h(frameLayout3);
        }
        C37518f0 c37518f0M29724x5 = m29724x3();
        if (c37518f0M29724x5 != null && (frameLayout2 = c37518f0M29724x5.f83280k) != null) {
            ViewExtKt.m66594y(frameLayout2);
        }
        C37518f0 c37518f0M29724x6 = m29724x3();
        if (c37518f0M29724x6 != null && (coinAvatarView = c37518f0M29724x6.f83276g) != null) {
            HomeRecommPosHelper.m29734f(HomeRecommPosHelper.f25930a, coinAvatarView, recommendNewCoinEntity.getIconUrl(), requireContext(), false, 4, null);
        }
        C37518f0 c37518f0M29724x7 = m29724x3();
        if (c37518f0M29724x7 != null && (baseTextView2 = c37518f0M29724x7.f83294y) != null) {
            baseTextView2.setText(recommendNewCoinEntity.getFullName());
        }
        C37518f0 c37518f0M29724x8 = m29724x3();
        if (c37518f0M29724x8 != null && (baseTextView = c37518f0M29724x8.f83295z) != null) {
            baseTextView.setText(recommendNewCoinEntity.getName());
        }
        C37518f0 c37518f0M29724x9 = m29724x3();
        int i12 = 0;
        ShowHideTextView showHideTextView4 = null;
        if (c37518f0M29724x9 != null && (showHideTextView3 = c37518f0M29724x9.f83255A) != null && (textViewM97383c = C44172b.m97383c(showHideTextView3, null, false, 3, null)) != null) {
            BigDecimal price = recommendNewCoinEntity.getPrice();
            if (price == null || (strM85579c = C37886j.m85579c(price, recommendNewCoinEntity.getCurrency(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null)) == null) {
                strM85579c = "- -";
            }
            textViewM97383c.setText(strM85579c);
        }
        C37518f0 c37518f0M29724x10 = m29724x3();
        if (c37518f0M29724x10 != null && (showHideTextView2 = c37518f0M29724x10.f83256B) != null) {
            C24256n1.m58511a(showHideTextView2);
        }
        HomeRecommPosHelper homeRecommPosHelper = HomeRecommPosHelper.f25930a;
        C37518f0 c37518f0M29724x11 = m29724x3();
        if (c37518f0M29724x11 != null) {
            showHideTextView4 = c37518f0M29724x11.f83256B;
        }
        ShowHideTextView showHideTextView5 = showHideTextView4;
        BigDecimal changeRate = recommendNewCoinEntity.getChangeRate();
        if (changeRate == null || (strM93915p = C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(changeRate, null, null, C41014a.m89951y(changeRate), true, false, false, 19, null)))) == null) {
            strM93915p = "--";
        }
        HomeRecommPosHelper.m29733c(homeRecommPosHelper, showHideTextView5, strM93915p, 0.0f, 2, null);
        C37518f0 c37518f0M29724x12 = m29724x3();
        if (c37518f0M29724x12 != null && (showHideTextView = c37518f0M29724x12.f83256B) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            showHideTextView.setTextColor(C22890g.m54279d(contextRequireContext, recommendNewCoinEntity.changeRate24h(), 0, 2, null));
        }
        C37518f0 c37518f0M29724x13 = m29724x3();
        if (c37518f0M29724x13 != null && (linearLayout = c37518f0M29724x13.f83281l) != null) {
            List<String> highlights = recommendNewCoinEntity.getHighlights();
            if (highlights != null && !highlights.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        C37518f0 c37518f0M29724x14 = m29724x3();
        if (c37518f0M29724x14 != null && (view = c37518f0M29724x14.f83288s) != null) {
            List<String> highlights2 = recommendNewCoinEntity.getHighlights();
            if (highlights2 == null || highlights2.isEmpty()) {
                i12 = 4;
            }
            view.setVisibility(i12);
        }
        C37518f0 c37518f0M29724x15 = m29724x3();
        if (c37518f0M29724x15 != null && (homeRecommPosTagFlexBoxLayout = c37518f0M29724x15.f83273d) != null) {
            homeRecommPosTagFlexBoxLayout.setHighlights(recommendNewCoinEntity.getHighlights());
        }
        C37518f0 c37518f0M29724x16 = m29724x3();
        if (c37518f0M29724x16 != null && (frameLayout = c37518f0M29724x16.f83280k) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.home.newcoin.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewCoinCard.m29716r3(recommendNewCoinEntity);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final void m29721s3(final RecommendNewCoinEntity recommendNewCoinEntity) {
        FrameLayout frameLayout;
        HomeRecommPosTagFlexBoxLayout homeRecommPosTagFlexBoxLayout;
        View view;
        LinearLayout linearLayout;
        int i11;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        Double dValueOf;
        Double dValueOf2;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c;
        String strM85579c;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        CoinAvatarView coinAvatarView;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        C37518f0 c37518f0M29724x3 = m29724x3();
        if (c37518f0M29724x3 != null && (frameLayout4 = c37518f0M29724x3.f83283n) != null) {
            ViewExtKt.m66577h(frameLayout4);
        }
        C37518f0 c37518f0M29724x4 = m29724x3();
        if (c37518f0M29724x4 != null && (frameLayout3 = c37518f0M29724x4.f83280k) != null) {
            ViewExtKt.m66577h(frameLayout3);
        }
        C37518f0 c37518f0M29724x5 = m29724x3();
        if (c37518f0M29724x5 != null && (frameLayout2 = c37518f0M29724x5.f83282m) != null) {
            ViewExtKt.m66594y(frameLayout2);
        }
        C37518f0 c37518f0M29724x6 = m29724x3();
        if (c37518f0M29724x6 != null && (coinAvatarView = c37518f0M29724x6.f83277h) != null) {
            HomeRecommPosHelper.m29734f(HomeRecommPosHelper.f25930a, coinAvatarView, recommendNewCoinEntity.getIconUrl(), requireContext(), false, 4, null);
        }
        C37518f0 c37518f0M29724x7 = m29724x3();
        if (c37518f0M29724x7 != null && (baseTextView2 = c37518f0M29724x7.f83257C) != null) {
            baseTextView2.setText(recommendNewCoinEntity.getFullName());
        }
        C37518f0 c37518f0M29724x8 = m29724x3();
        if (c37518f0M29724x8 != null && (baseTextView = c37518f0M29724x8.f83258D) != null) {
            baseTextView.setText(recommendNewCoinEntity.getName());
        }
        C37518f0 c37518f0M29724x9 = m29724x3();
        int i12 = 0;
        if (c37518f0M29724x9 != null && (showHideTextView4 = c37518f0M29724x9.f83259E) != null && (textViewM97383c = C44172b.m97383c(showHideTextView4, null, false, 3, null)) != null) {
            BigDecimal price = recommendNewCoinEntity.getPrice();
            if (price == null || (strM85579c = C37886j.m85579c(price, recommendNewCoinEntity.getCurrency(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null)) == null) {
                strM85579c = "- -";
            }
            textViewM97383c.setText(strM85579c);
        }
        C37518f0 c37518f0M29724x10 = m29724x3();
        if (c37518f0M29724x10 != null && (showHideTextView3 = c37518f0M29724x10.f83260F) != null) {
            C24256n1.m58511a(showHideTextView3);
        }
        C37518f0 c37518f0M29724x11 = m29724x3();
        if (c37518f0M29724x11 != null && (showHideTextView2 = c37518f0M29724x11.f83260F) != null) {
            BigDecimal price2 = recommendNewCoinEntity.getPrice();
            if (price2 != null) {
                dValueOf = Double.valueOf(price2.doubleValue());
            } else {
                dValueOf = null;
            }
            BigDecimal openingPrice = recommendNewCoinEntity.getOpeningPrice();
            if (openingPrice != null) {
                dValueOf2 = Double.valueOf(openingPrice.doubleValue());
            } else {
                dValueOf2 = null;
            }
            showHideTextView2.setText(C42828b.m93915p(C42828b.m93911l(C36720e.m82283c(dValueOf, dValueOf2))));
        }
        C37518f0 c37518f0M29724x12 = m29724x3();
        if (c37518f0M29724x12 != null && (showHideTextView = c37518f0M29724x12.f83260F) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            showHideTextView.setTextColor(C22890g.m54279d(contextRequireContext, RecommendNewCoinEntity.changeRateSinceList$default(recommendNewCoinEntity, null, 1, null), 0, 2, null));
        }
        C37518f0 c37518f0M29724x13 = m29724x3();
        if (c37518f0M29724x13 != null && (linearLayout = c37518f0M29724x13.f83284o) != null) {
            List<String> highlights = recommendNewCoinEntity.getHighlights();
            if (highlights != null && !highlights.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        C37518f0 c37518f0M29724x14 = m29724x3();
        if (c37518f0M29724x14 != null && (view = c37518f0M29724x14.f83287r) != null) {
            List<String> highlights2 = recommendNewCoinEntity.getHighlights();
            if (highlights2 == null || highlights2.isEmpty()) {
                i12 = 4;
            }
            view.setVisibility(i12);
        }
        C37518f0 c37518f0M29724x15 = m29724x3();
        if (c37518f0M29724x15 != null && (homeRecommPosTagFlexBoxLayout = c37518f0M29724x15.f83274e) != null) {
            homeRecommPosTagFlexBoxLayout.setHighlights(recommendNewCoinEntity.getHighlights());
        }
        C37518f0 c37518f0M29724x16 = m29724x3();
        if (c37518f0M29724x16 != null && (frameLayout = c37518f0M29724x16.f83282m) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.home.newcoin.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewCoinCard.m29717t3(recommendNewCoinEntity);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m29722u3(final RecommendNewCoinEntity recommendNewCoinEntity) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        FrameLayout frameLayout;
        HomeRecommPosTagFlexBoxLayout homeRecommPosTagFlexBoxLayout;
        View view;
        LinearLayout linearLayout;
        int i11;
        LinearLayout linearLayout2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        CoinAvatarView coinAvatarView;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        C37518f0 c37518f0M29724x3 = m29724x3();
        if (c37518f0M29724x3 != null && (frameLayout4 = c37518f0M29724x3.f83283n) != null) {
            ViewExtKt.m66594y(frameLayout4);
        }
        C37518f0 c37518f0M29724x4 = m29724x3();
        if (c37518f0M29724x4 != null && (frameLayout3 = c37518f0M29724x4.f83282m) != null) {
            ViewExtKt.m66577h(frameLayout3);
        }
        C37518f0 c37518f0M29724x5 = m29724x3();
        if (c37518f0M29724x5 != null && (frameLayout2 = c37518f0M29724x5.f83280k) != null) {
            ViewExtKt.m66577h(frameLayout2);
        }
        C37518f0 c37518f0M29724x6 = m29724x3();
        if (c37518f0M29724x6 != null && (coinAvatarView = c37518f0M29724x6.f83278i) != null) {
            HomeRecommPosHelper.m29734f(HomeRecommPosHelper.f25930a, coinAvatarView, recommendNewCoinEntity.getIconUrl(), requireContext(), false, 4, null);
        }
        C37518f0 c37518f0M29724x7 = m29724x3();
        if (c37518f0M29724x7 != null && (baseTextView11 = c37518f0M29724x7.f83262H) != null) {
            baseTextView11.setText(recommendNewCoinEntity.getFullName());
        }
        C37518f0 c37518f0M29724x8 = m29724x3();
        if (c37518f0M29724x8 != null && (baseTextView10 = c37518f0M29724x8.f83262H) != null) {
            C24256n1.m58512b(baseTextView10);
        }
        C37518f0 c37518f0M29724x9 = m29724x3();
        if (c37518f0M29724x9 != null && (baseTextView9 = c37518f0M29724x9.f83266L) != null) {
            baseTextView9.setText(recommendNewCoinEntity.getName());
        }
        C37518f0 c37518f0M29724x10 = m29724x3();
        if (c37518f0M29724x10 != null && (baseTextView8 = c37518f0M29724x10.f83266L) != null) {
            C24256n1.m58512b(baseTextView8);
        }
        String[] strArrM29732a = HomeRecommPosHelper.m29732a(recommendNewCoinEntity.getOpenDay());
        C37518f0 c37518f0M29724x11 = m29724x3();
        int i12 = 0;
        if (c37518f0M29724x11 != null && (baseTextView7 = c37518f0M29724x11.f83267M) != null) {
            baseTextView7.setText(strArrM29732a[0]);
        }
        C37518f0 c37518f0M29724x12 = m29724x3();
        if (c37518f0M29724x12 != null && (baseTextView6 = c37518f0M29724x12.f83265K) != null) {
            baseTextView6.setText(strArrM29732a[1]);
        }
        C37518f0 c37518f0M29724x13 = m29724x3();
        if (c37518f0M29724x13 != null && (baseTextView5 = c37518f0M29724x13.f83261G) != null) {
            baseTextView5.setText(strArrM29732a[2]);
        }
        C37518f0 c37518f0M29724x14 = m29724x3();
        if (c37518f0M29724x14 != null && (linearLayout2 = c37518f0M29724x14.f83292w) != null && linearLayout2.getLayoutDirection() == 1) {
            C37518f0 c37518f0M29724x15 = m29724x3();
            if (c37518f0M29724x15 != null && (baseTextView4 = c37518f0M29724x15.f83263I) != null) {
                baseTextView4.setText(strArrM29732a[4]);
            }
            C37518f0 c37518f0M29724x16 = m29724x3();
            if (c37518f0M29724x16 != null && (baseTextView3 = c37518f0M29724x16.f83264J) != null) {
                baseTextView3.setText(strArrM29732a[3]);
            }
        } else {
            C37518f0 c37518f0M29724x17 = m29724x3();
            if (c37518f0M29724x17 != null && (baseTextView2 = c37518f0M29724x17.f83263I) != null) {
                baseTextView2.setText(strArrM29732a[3]);
            }
            C37518f0 c37518f0M29724x18 = m29724x3();
            if (c37518f0M29724x18 != null && (baseTextView = c37518f0M29724x18.f83264J) != null) {
                baseTextView.setText(strArrM29732a[4]);
            }
        }
        C37518f0 c37518f0M29724x19 = m29724x3();
        if (c37518f0M29724x19 != null && (linearLayout = c37518f0M29724x19.f83285p) != null) {
            List<String> highlights = recommendNewCoinEntity.getHighlights();
            if (highlights != null && !highlights.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        C37518f0 c37518f0M29724x20 = m29724x3();
        if (c37518f0M29724x20 != null && (view = c37518f0M29724x20.f83286q) != null) {
            List<String> highlights2 = recommendNewCoinEntity.getHighlights();
            if (highlights2 == null || highlights2.isEmpty()) {
                i12 = 4;
            }
            view.setVisibility(i12);
        }
        C37518f0 c37518f0M29724x21 = m29724x3();
        if (c37518f0M29724x21 != null && (homeRecommPosTagFlexBoxLayout = c37518f0M29724x21.f83275f) != null) {
            homeRecommPosTagFlexBoxLayout.setHighlights(recommendNewCoinEntity.getHighlights());
        }
        C37518f0 c37518f0M29724x22 = m29724x3();
        if (c37518f0M29724x22 != null && (frameLayout = c37518f0M29724x22.f83283n) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.home.newcoin.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewCoinCard.m29718v3(recommendNewCoinEntity);
                }
            }, 1, null);
        }
    }
}
