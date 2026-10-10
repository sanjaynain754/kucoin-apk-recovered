package com.kubi.assets.exchange.p075ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.data.coin.AccountType;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44830o0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ConvertHistoryFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/ConvertHistoryFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentConvertHistoryBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentConvertHistoryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConvertHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConvertHistoryFragment.kt\ncom/kubi/assets/exchange/ui/ConvertHistoryFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,65:1\n147#2,16:66\n*S KotlinDebug\n*F\n+ 1 ConvertHistoryFragment.kt\ncom/kubi/assets/exchange/ui/ConvertHistoryFragment\n*L\n27#1:66,16\n*E\n"})
public final class ConvertHistoryFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f17257V = {Reflection.property1(new PropertyReference1Impl(ConvertHistoryFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentConvertHistoryBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17258U = C45681e.m100799e(this, new Function1<ConvertHistoryFragment, C44830o0>() { // from class: com.kubi.assets.exchange.ui.ConvertHistoryFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44830o0 invoke(@NotNull ConvertHistoryFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44830o0.m99186a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44830o0, Unit>() { // from class: com.kubi.assets.exchange.ui.ConvertHistoryFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44830o0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44830o0 c44830o0) {
            invoke(c44830o0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: m3 */
    public static final Unit m16406m3(ArrayList arrayList, ConvertHistoryFragment convertHistoryFragment) {
        arrayList.add(convertHistoryFragment.getString(R$string.lever_account));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m16407n3(ArrayList arrayList) {
        arrayList.add(ExchangeCoinHistoryFragment.f17265b0.newInstance(AccountType.LEVER));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l3 */
    public final C44830o0 m16408l3() {
        return (C44830o0) this.f17258U.getValue(this, f17257V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_fragment_convert_history, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        CustomViewPager customViewPager;
        int size;
        CustomViewPager customViewPager2;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "page") : null;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R$string.save_account));
        arrayList.add(getString(R$string.trade_account));
        SiteVisibleConfigKey siteVisibleConfigKey = SiteVisibleConfigKey.Margin;
        C24129b.m58033e(siteVisibleConfigKey, new Function0() { // from class: com.kubi.assets.exchange.ui.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConvertHistoryFragment.m16406m3(arrayList, this);
            }
        });
        ExchangeCoinHistoryFragment.Companion companion = ExchangeCoinHistoryFragment.f17265b0;
        final ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(companion.newInstance(AccountType.MAIN));
        arrayListArrayListOf.add(companion.newInstance(AccountType.TRADE));
        C24129b.m58033e(siteVisibleConfigKey, new Function0() { // from class: com.kubi.assets.exchange.ui.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConvertHistoryFragment.m16407n3(arrayListArrayListOf);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C27103z c27103z = new C27103z(childFragmentManager, arrayListArrayListOf, arrayList);
        C44830o0 c44830o0M16408l3 = m16408l3();
        if (c44830o0M16408l3 != null && (customViewPager3 = c44830o0M16408l3.f100532c) != null) {
            customViewPager3.setAdapter(c27103z);
        }
        C44830o0 c44830o0M16408l4 = m16408l3();
        if (c44830o0M16408l4 != null && (slidingTabLayout = c44830o0M16408l4.f100531b) != null) {
            C44830o0 c44830o0M16408l5 = m16408l3();
            slidingTabLayout.setViewPager(c44830o0M16408l5 != null ? c44830o0M16408l5.f100532c : null);
        }
        C44830o0 c44830o0M16408l6 = m16408l3();
        if (c44830o0M16408l6 != null && (customViewPager2 = c44830o0M16408l6.f100532c) != null) {
            customViewPager2.setOffscreenPageLimit(arrayListArrayListOf.size());
        }
        C44830o0 c44830o0M16408l7 = m16408l3();
        if (c44830o0M16408l7 == null || (customViewPager = c44830o0M16408l7.f100532c) == null) {
            return;
        }
        if (Intrinsics.areEqual(strM56284y, "MAIN")) {
            size = 0;
        } else {
            size = (Intrinsics.areEqual(strM56284y, "LEVER") && C24129b.m58030b(siteVisibleConfigKey)) ? arrayListArrayListOf.size() - 1 : 1;
        }
        customViewPager.setCurrentItem(size);
    }
}
