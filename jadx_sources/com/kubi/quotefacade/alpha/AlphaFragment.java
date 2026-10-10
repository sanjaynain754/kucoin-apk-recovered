package com.kubi.quotefacade.alpha;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.ViewPager;
import bv.C4696u;
import com.blankj.utilcode.util.C5275i0;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.alpha.container.AlphaContainerFragment;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4391b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import qe0.C43724b;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AlphaFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\b*\u0001\u001d\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\r\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006$"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentQuoteAlphaBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentQuoteAlphaBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "hasFirstSelected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getCurrentItem", "", "()Ljava/lang/Integer;", "getViewPagerSize", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onPageChangeListener", "com/kubi/quotefacade/alpha/AlphaFragment$onPageChangeListener$1", "Lcom/kubi/quotefacade/alpha/AlphaFragment$onPageChangeListener$1;", "handlePopTips", "alertPopuTip", "currentTab", "onDestroyView", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaFragment.kt\ncom/kubi/quotefacade/alpha/AlphaFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,180:1\n147#2,16:181\n43#3:197\n135#4,2:198\n135#4,2:200\n126#4,2:202\n126#4,2:204\n*S KotlinDebug\n*F\n+ 1 AlphaFragment.kt\ncom/kubi/quotefacade/alpha/AlphaFragment\n*L\n48#1:181,16\n98#1:197\n134#1:198,2\n135#1:200,2\n149#1:202,2\n151#1:204,2\n*E\n"})
public final class AlphaFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41131U = C45681e.m100799e(this, new Function1<AlphaFragment, C4696u>() { // from class: com.kubi.quotefacade.alpha.AlphaFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4696u invoke(@NotNull AlphaFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4696u.m4704a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4696u, Unit>() { // from class: com.kubi.quotefacade.alpha.AlphaFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4696u it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4696u c4696u) {
            invoke(c4696u);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final AtomicBoolean f41132V = new AtomicBoolean(false);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final C21602a f41133W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f41130Y = {Reflection.property1(new PropertyReference1Impl(AlphaFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentQuoteAlphaBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f41129X = new Companion(null);

    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.AlphaFragment$a */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/alpha/AlphaFragment$onPageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21602a extends ViewPager.SimpleOnPageChangeListener {
        public C21602a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            AlphaFragment.this.m50327z3();
            C27023a.m66555b("B5marketAlpha", position == 0 ? "hot" : "chain", "1", null, 8, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_quote_alpha, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TextView textViewM55289t;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C4696u c4696uM50324w3 = m50324w3();
        if (c4696uM50324w3 == null) {
            return;
        }
        AlphaCurrent.f41143a.m50344b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getString(R$string.market_alpha_premium));
        AlphaContainerFragment.Companion companion = AlphaContainerFragment.f41160f0;
        arrayList.add(companion.instance("alpha_premium"));
        if (C24129b.m58030b(SiteVisibleConfigKey.Web3Wallet)) {
            arrayList2.add(getString(R$string.market_alpha_onchain));
            arrayList.add(companion.instance("alpha_onchain"));
        }
        c4696uM50324w3.f4542b.setNeedBold(true);
        NoScrollQuoteViewPager noScrollQuoteViewPager = c4696uM50324w3.f4543c;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        noScrollQuoteViewPager.setAdapter(new C27103z(childFragmentManager, arrayList, arrayList2));
        c4696uM50324w3.f4542b.setViewPager(c4696uM50324w3.f4543c);
        c4696uM50324w3.f4543c.setOffscreenPageLimit(arrayList.size());
        c4696uM50324w3.f4543c.addOnPageChangeListener(this.f41133W);
        if (!QuoteConfigHelper.f41987a.m51923c() || (textViewM55289t = c4696uM50324w3.f4542b.m55289t(0)) == null) {
            return;
        }
        C27046k.m66694i(textViewM55289t, R$mipmap.quote_ic_fees, C5275i0.m6236a(4.0f), 0, 4, null);
    }

    /* JADX INFO: renamed from: r3 */
    public final void m50323r3(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaFragment.m50319s3(this.f41260b, i11);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final C4696u m50324w3() {
        return (C4696u) this.f41131U.getValue(this, f41130Y[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final void m50327z3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaFragment.m50308A3(this.f41155b);
            }
        });
    }

    public AlphaFragment() {
        setPageId("B5marketAlpha");
        this.f41133W = new C21602a();
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m50308A3(final AlphaFragment alphaFragment) {
        if (alphaFragment.getView() != null && !C22218w1.m52123c(alphaFragment.getArguments()) && alphaFragment.isShowing()) {
            final C4696u c4696uM50324w3 = alphaFragment.m50324w3();
            if (c4696uM50324w3 == null) {
                return Unit.INSTANCE;
            }
            SlidingTabLayout tabLayout = c4696uM50324w3.f4542b;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            C22912t.m54417o(tabLayout, new Runnable() { // from class: com.kubi.quotefacade.alpha.d
                @Override // java.lang.Runnable
                public final void run() {
                    AlphaFragment.m50309B3(this.f41258b, c4696uM50324w3);
                }
            }, 500L);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final void m50309B3(AlphaFragment alphaFragment, C4696u c4696u) {
        boolean z11;
        if (alphaFragment.getView() != null) {
            int currentItem = c4696u.f4543c.getCurrentItem();
            boolean z12 = true;
            if (currentItem == 0 && !C46392a.m102322d(QuoteKV.f42044a.m52043c(), false)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (currentItem != 1 || C46392a.m102322d(QuoteKV.f42044a.m52042b(), false)) {
                z12 = false;
            }
            if (!z11 && !z12) {
                return;
            }
            alphaFragment.m50323r3(currentItem);
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m50310C3(AlphaFragment alphaFragment) {
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        C4696u c4696uM50324w3 = alphaFragment.m50324w3();
        if (c4696uM50324w3 != null && (noScrollQuoteViewPager = c4696uM50324w3.f4543c) != null) {
            noScrollQuoteViewPager.removeOnPageChangeListener(alphaFragment.f41133W);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m50319s3(final AlphaFragment alphaFragment, final int i11) {
        int i12;
        C4696u c4696uM50324w3 = alphaFragment.m50324w3();
        if (c4696uM50324w3 == null) {
            return Unit.INSTANCE;
        }
        Context context = alphaFragment.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        C44128b.m97268l(alphaFragment.getTAG(), "alertPopuTip:" + i11);
        final C43724b c43724bM96322p = new BubbleEasyPopup(context).m96307Q(R$layout.quote_view_pop_alpha_tips).m96313W(false).m96322p();
        c43724bM96322p.m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.quotefacade.alpha.f
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                AlphaFragment.m50320t3(this.f41262b, i11);
            }
        });
        TextView textViewM55289t = c4696uM50324w3.f4542b.m55289t(i11);
        BaseViewHolder baseViewHolder = new BaseViewHolder(c43724bM96322p.m96292A());
        if (i11 == 0) {
            baseViewHolder.setText(R$id.tvMsg, alphaFragment.getString(R$string.market_alpha_premium_tip));
        } else {
            baseViewHolder.setText(R$id.tvMsg, alphaFragment.getString(R$string.market_alpha_onchain_tip));
        }
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) baseViewHolder.getView(R$id.layoutBubble);
        if (bubbleLinearLayout != null) {
            int[] iArr = {0, 0};
            textViewM55289t.getLocationInWindow(iArr);
            float width = iArr[0] + (textViewM55289t.getWidth() / 2.0f);
            if (Intrinsics.areEqual(MultiLanguageManager.f46811g.getLocalString(), "zh_HK")) {
                i12 = 17;
            } else {
                i12 = 12;
            }
            bubbleLinearLayout.setArrowPosDelta(width - C27040e.m66658b(i12));
        }
        Intrinsics.checkNotNull(textViewM55289t);
        C22912t.m54417o(textViewM55289t, new Runnable() { // from class: com.kubi.quotefacade.alpha.g
            @Override // java.lang.Runnable
            public final void run() {
                AlphaFragment.m50321u3(c43724bM96322p);
            }
        }, 5000L);
        View view = baseViewHolder.getView(R$id.ivClose);
        if (view != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.quotefacade.alpha.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaFragment.m50322v3(c43724bM96322p);
                }
            }, 1, null);
        }
        c43724bM96322p.mo54253b0(c4696uM50324w3.f4542b.m55289t(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m50320t3(AlphaFragment alphaFragment, int i11) {
        if (alphaFragment.getView() == null) {
            return;
        }
        if (i11 == 0) {
            C46392a.m102328k(QuoteKV.f42044a.m52043c(), true);
        } else {
            C46392a.m102328k(QuoteKV.f42044a.m52042b(), true);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m50321u3(C43724b c43724b) {
        if (c43724b.m96299I()) {
            c43724b.m96331y();
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m50322v3(C43724b c43724b) {
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaFragment.m50310C3(this.f41154b);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        int i11;
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        super.onShow();
        C4391b c4391b = C4391b.f3820a;
        String strM4005c = c4391b.m4005c();
        if (Intrinsics.areEqual(strM4005c, "highlights")) {
            i11 = 0;
        } else if (Intrinsics.areEqual(strM4005c, "chain_area")) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        c4391b.m4010h("");
        if (i11 >= 0) {
            C4696u c4696uM50324w3 = m50324w3();
            if (c4696uM50324w3 != null && (noScrollQuoteViewPager = c4696uM50324w3.f4543c) != null) {
                noScrollQuoteViewPager.setCurrentItem(i11);
                return;
            }
            return;
        }
        if (this.f41132V.compareAndSet(false, true)) {
            this.f41133W.onPageSelected(0);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public final Integer m50325x3() {
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        C4696u c4696uM50324w3 = m50324w3();
        if (c4696uM50324w3 != null && (noScrollQuoteViewPager = c4696uM50324w3.f4543c) != null) {
            return Integer.valueOf(noScrollQuoteViewPager.getCurrentItem());
        }
        return null;
    }

    /* JADX INFO: renamed from: y3 */
    public final int m50326y3() {
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        C4696u c4696uM50324w3 = m50324w3();
        if (c4696uM50324w3 != null && (noScrollQuoteViewPager = c4696uM50324w3.f4543c) != null) {
            return noScrollQuoteViewPager.getChildCount();
        }
        return 0;
    }
}
