package com.kubi.kumex.trade.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.trade.menu.announcement.AllAnnouncementFragment;
import com.kubi.kumex.trade.menu.announcement.LatestAnnouncementFragment;
import com.kubi.kumex.trade.menu.announcement.NewPairAnnouncementFragment;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36733b;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/* JADX INFO: compiled from: AnnouncementFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0015\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00170\u0016H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/AnnouncementFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexAnnouncementDialogBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexAnnouncementDialogBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "createAnnouncementFragment", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnnouncementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementFragment.kt\ncom/kubi/kumex/trade/menu/AnnouncementFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,66:1\n147#2,16:67\n*S KotlinDebug\n*F\n+ 1 AnnouncementFragment.kt\ncom/kubi/kumex/trade/menu/AnnouncementFragment\n*L\n20#1:67,16\n*E\n"})
public final class AnnouncementFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f30562V = {Reflection.property1(new PropertyReference1Impl(AnnouncementFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexAnnouncementDialogBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f30563U = C45681e.m100799e(this, new Function1<AnnouncementFragment, C36733b>() { // from class: com.kubi.kumex.trade.menu.AnnouncementFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36733b invoke(@NotNull AnnouncementFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36733b.m82316a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36733b, Unit>() { // from class: com.kubi.kumex.trade.menu.AnnouncementFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36733b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36733b c36733b) {
            invoke(c36733b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: j3 */
    public final Pair<ArrayList<Fragment>, ArrayList<String>> m36303j3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AllAnnouncementFragment());
        arrayList.add(new LatestAnnouncementFragment());
        arrayList.add(new NewPairAnnouncementFragment());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getString(R$string.all));
        arrayList2.add(getString(R$string.latest_events));
        arrayList2.add(getString(R$string.new_trading_pair));
        return TuplesKt.m90091to(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: k3 */
    public final C36733b m36304k3() {
        return (C36733b) this.f30563U.getValue(this, f30562V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_announcement_dialog, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36733b c36733bM36304k3 = m36304k3();
        if (c36733bM36304k3 == null) {
            return;
        }
        Pair<ArrayList<Fragment>, ArrayList<String>> pairM36303j3 = m36303j3();
        RtlViewPager rtlViewPager = c36733bM36304k3.f79716c;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rtlViewPager.setAdapter(new C27103z(childFragmentManager, pairM36303j3.getFirst(), pairM36303j3.getSecond()));
        c36733bM36304k3.f79715b.setViewPager(c36733bM36304k3.f79716c);
    }
}
