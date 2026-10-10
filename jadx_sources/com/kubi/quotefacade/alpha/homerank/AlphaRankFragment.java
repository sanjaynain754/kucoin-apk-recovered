package com.kubi.quotefacade.alpha.homerank;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import bv.C4659d;
import bv.C4681m0;
import com.kubi.mvi.state.LazySimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.favorites.C21938a1;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
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

/* JADX INFO: compiled from: AlphaRankFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u0016\u0010\"\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\b\u0010$\u001a\u00020\u0015H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/homerank/AlphaRankFragment;", "Lcom/kubi/mvi/state/LazySimpleStateFragment;", "Lcom/kubi/quotefacade/alpha/homerank/AlphaRankContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentAlphaRankBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentAlphaRankBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/quotefacade/alpha/homerank/AlphaRankAdapter;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/alpha/homerank/AlphaRankVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "doOnLazyInitView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showLoadingView", "color", "gravity", "showContentView", "filterDataList", "", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "list", "refreshAdapter", "dataList", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaRankFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaRankFragment.kt\ncom/kubi/quotefacade/alpha/homerank/AlphaRankFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,108:1\n147#2,16:109\n93#3,4:125\n*S KotlinDebug\n*F\n+ 1 AlphaRankFragment.kt\ncom/kubi/quotefacade/alpha/homerank/AlphaRankFragment\n*L\n32#1:109,16\n66#1:125,4\n*E\n"})
public final class AlphaRankFragment extends LazySimpleStateFragment<AlphaRankContract$UIState> {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f41266b0 = {Reflection.property1(new PropertyReference1Impl(AlphaRankFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentAlphaRankBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f41267Z = C45681e.m100799e(this, new Function1<AlphaRankFragment, C4659d>() { // from class: com.kubi.quotefacade.alpha.homerank.AlphaRankFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4659d invoke(@NotNull AlphaRankFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM42558q3 = this.this$0.m42558q3();
            Intrinsics.checkNotNullExpressionValue(viewM42558q3, "access$getLazyFragContentView(...)");
            return C4659d.m4630a(viewM42558q3);
        }

        {
            super(1);
        }
    }, new Function1<C4659d, Unit>() { // from class: com.kubi.quotefacade.alpha.homerank.AlphaRankFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4659d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4659d c4659d) {
            invoke(c4659d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final AlphaRankAdapter f41268a0 = new AlphaRankAdapter();

    /* JADX INFO: renamed from: y3 */
    private final List<AlphaItemEntity> m50520y3(List<AlphaItemEntity> list) {
        LinearLayoutCompat linearLayoutCompat;
        List<AlphaItemEntity> listTake = CollectionsKt.take(list, 5);
        boolean z11 = list.size() > listTake.size();
        C4659d c4659dM50522z3 = m50522z3();
        if (c4659dM50522z3 != null && (linearLayoutCompat = c4659dM50522z3.f4267c) != null) {
            linearLayoutCompat.setVisibility(z11 ? 0 : 8);
        }
        return listTake;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m50519x3() {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, QuoteMainTab.ALPHA.getType(), "highlights", null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public final void m50521B3(final List<AlphaItemEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.homerank.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaRankFragment.m50514C3(this.f41277b, list);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C21673c) {
            m50521B3(((C21673c) singleEvent).m50529a());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_alpha_rank;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AlphaRankVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AlphaRankVM.class);
    }

    /* JADX INFO: renamed from: z3 */
    public final C4659d m50522z3() {
        return (C4659d) this.f41267Z.getValue(this, f41266b0[0]);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m50513A3() {
        C21938a1.m51383b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m50514C3(AlphaRankFragment alphaRankFragment, List list) {
        alphaRankFragment.showContentView();
        alphaRankFragment.f41268a0.replaceData(alphaRankFragment.m50520y3(list));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment
    /* JADX INFO: renamed from: o3 */
    public void mo42556o3() {
        C4659d c4659dM50522z3 = m50522z3();
        if (c4659dM50522z3 == null) {
            return;
        }
        c4659dM50522z3.f4272h.f4456m.setText(getString(R$string.name));
        ImageView ivName = c4659dM50522z3.f4272h.f4449f;
        Intrinsics.checkNotNullExpressionValue(ivName, "ivName");
        ViewExtKt.m66577h(ivName);
        ImageView ivAmount = c4659dM50522z3.f4272h.f4447d;
        Intrinsics.checkNotNullExpressionValue(ivAmount, "ivAmount");
        ViewExtKt.m66577h(ivAmount);
        ImageView ivPrice = c4659dM50522z3.f4272h.f4450g;
        Intrinsics.checkNotNullExpressionValue(ivPrice, "ivPrice");
        ViewExtKt.m66577h(ivPrice);
        ImageView ivChangeRate = c4659dM50522z3.f4272h.f4448e;
        Intrinsics.checkNotNullExpressionValue(ivChangeRate, "ivChangeRate");
        ViewExtKt.m66577h(ivChangeRate);
        LinearLayout layoutNameAmonut = c4659dM50522z3.f4272h.f4451h;
        Intrinsics.checkNotNullExpressionValue(layoutNameAmonut, "layoutNameAmonut");
        ViewExtKt.m66585p(layoutNameAmonut, C27040e.m66658b(12), 0, 0, 0, 14, null);
        FrameLayout flChangeRate = c4659dM50522z3.f4272h.f4445b;
        Intrinsics.checkNotNullExpressionValue(flChangeRate, "flChangeRate");
        ViewExtKt.m66585p(flChangeRate, 0, 0, 0, 0, 11, null);
        c4659dM50522z3.f4268d.setAdapter(this.f41268a0);
        LinearLayoutCompat layoutViewMore = c4659dM50522z3.f4267c;
        Intrinsics.checkNotNullExpressionValue(layoutViewMore, "layoutViewMore");
        C27046k.m66711z(layoutViewMore, 0L, new Function0() { // from class: com.kubi.quotefacade.alpha.homerank.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaRankFragment.m50519x3();
            }
        }, 1, null);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        RankShimmer rankShimmer;
        RankShimmer rankShimmer2;
        super.onHide();
        C4659d c4659dM50522z3 = m50522z3();
        if (c4659dM50522z3 != null && (rankShimmer2 = c4659dM50522z3.f4269e) != null) {
            rankShimmer2.m53323f();
        }
        C4659d c4659dM50522z4 = m50522z3();
        if (c4659dM50522z4 != null && (rankShimmer = c4659dM50522z4.f4269e) != null) {
            rankShimmer.setVisibility(8);
        }
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        C4681m0 c4681m0;
        AppCompatImageView appCompatImageView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i11;
        super.onShow();
        C4659d c4659dM50522z3 = m50522z3();
        if (c4659dM50522z3 != null && (linearLayout2 = c4659dM50522z3.f4266b) != null) {
            if (C21938a1.m51382a()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
        }
        C4659d c4659dM50522z4 = m50522z3();
        if (c4659dM50522z4 != null && (linearLayout = c4659dM50522z4.f4266b) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.alpha.homerank.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaRankFragment.m50513A3();
                }
            }, 1, null);
        }
        C4659d c4659dM50522z5 = m50522z3();
        if (c4659dM50522z5 != null && (c4681m0 = c4659dM50522z5.f4272h) != null && (appCompatImageView = c4681m0.f4455l) != null) {
            ViewExtKt.m66577h(appCompatImageView);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void showContentView() {
        C4659d c4659dM50522z3 = m50522z3();
        if (c4659dM50522z3 == null) {
            return;
        }
        c4659dM50522z3.f4269e.m53323f();
        c4659dM50522z3.f4269e.setVisibility(8);
        c4659dM50522z3.f4268d.setVisibility(0);
        super.showContentView();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void showLoadingView(int color, int gravity) {
        super.showContentView();
        C4659d c4659dM50522z3 = m50522z3();
        if (c4659dM50522z3 == null) {
            return;
        }
        c4659dM50522z3.f4268d.setVisibility(8);
        c4659dM50522z3.f4267c.setVisibility(8);
        c4659dM50522z3.f4269e.m53322e();
        c4659dM50522z3.f4269e.setVisibility(0);
    }
}
