package com.kubi.futures.trade.welfare.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36815o3;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: WelfareHistoryFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0015\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00170\u0016H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/history/WelfareHistoryFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentWelfareHistoryBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentWelfareHistoryBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "createHistoryFragments", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareHistoryFragment.kt\ncom/kubi/futures/trade/welfare/history/WelfareHistoryFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,79:1\n147#2,16:80\n*S KotlinDebug\n*F\n+ 1 WelfareHistoryFragment.kt\ncom/kubi/futures/trade/welfare/history/WelfareHistoryFragment\n*L\n29#1:80,16\n*E\n"})
public final class WelfareHistoryFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f24846V = {Reflection.property1(new PropertyReference1Impl(WelfareHistoryFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentWelfareHistoryBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f24847U = C45681e.m100799e(this, new Function1<WelfareHistoryFragment, C36815o3>() { // from class: com.kubi.futures.trade.welfare.history.WelfareHistoryFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36815o3 invoke(@NotNull WelfareHistoryFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36815o3.m82491a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36815o3, Unit>() { // from class: com.kubi.futures.trade.welfare.history.WelfareHistoryFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36815o3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36815o3 c36815o3) {
            invoke(c36815o3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.history.WelfareHistoryFragment$a */
    /* JADX INFO: compiled from: WelfareHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/trade/welfare/history/WelfareHistoryFragment$onViewCreated$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14353a extends C45938b {
        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            String str;
            super.mo18273b(i11);
            if (i11 != 0) {
                if (i11 != 1) {
                    str = "couponHistory";
                } else {
                    str = "bonusHistory";
                }
            } else {
                str = "airdropHistory";
            }
            C43852m.m96591c("B11FuturesBonus", str, null, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final Pair<ArrayList<Fragment>, ArrayList<String>> m28714j3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FuturesAirdropHistoryFragment());
        arrayList.add(new FuturesTrialHistoryFragment());
        arrayList.add(new FuturesCouponHistoryFragment());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getString(R$string.kumex_airdrop_label));
        arrayList2.add(getString(R$string.kumex_welfare_trial));
        arrayList2.add(getString(R$string.coupon_records));
        return TuplesKt.m90091to(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: k3 */
    public final C36815o3 m28715k3() {
        return (C36815o3) this.f24847U.getValue(this, f24846V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_welfare_history, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36815o3 c36815o3M28715k3 = m28715k3();
        if (c36815o3M28715k3 == null) {
            return;
        }
        getTitleBar().setTitle(getStringRes(R$string.history_record, new Object[0]));
        Pair<ArrayList<Fragment>, ArrayList<String>> pairM28714j3 = m28714j3();
        RtlViewPager rtlViewPager = c36815o3M28715k3.f80736c;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rtlViewPager.setAdapter(new C27103z(childFragmentManager, pairM28714j3.getFirst(), pairM28714j3.getSecond()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(getStringRes(R$string.kumex_airdrop_label, new Object[0]));
        arrayList.add(getStringRes(R$string.kumex_welfare_trial, new Object[0]));
        arrayList.add(getStringRes(R$string.coupon_records, new Object[0]));
        c36815o3M28715k3.f80735b.setViewPager(c36815o3M28715k3.f80736c);
        c36815o3M28715k3.f80735b.setOnTabSelectListener(new C14353a());
    }
}
