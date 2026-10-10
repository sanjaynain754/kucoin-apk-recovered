package com.kubi.core.biz.menu.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tuicore.TUIConstants;
import ir.C40167b;
import ir.InterfaceC40166a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import v30.C45386i;
import w00.C45681e;

/* JADX INFO: compiled from: MultiTabBottomDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001fH\u0016J\u001a\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006'"}, m90084d2 = {"Lcom/kubi/core/biz/menu/more/MultiTabBottomDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "tabItems", "", "Lcom/kubi/core/biz/menu/more/MultiTabItemInfo;", "defaultTabIndex", "", "<init>", "(Ljava/util/List;I)V", "getTabItems", "()Ljava/util/List;", "binding", "Lcom/kubi/tradecorebiz/databinding/BkucoinMultiTabBottomDialogBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BkucoinMultiTabBottomDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updateFunctionsDot", "id", "showDot", "", "isBottomSheet", "showAllowingKeyboard", "frag", "Landroidx/fragment/app/Fragment;", "tag", "", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiTabBottomDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiTabBottomDialog.kt\ncom/kubi/core/biz/menu/more/MultiTabBottomDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n143#2,20:136\n1563#3:156\n1634#3,3:157\n1563#3:160\n1634#3,3:161\n1869#3,2:164\n*S KotlinDebug\n*F\n+ 1 MultiTabBottomDialog.kt\ncom/kubi/core/biz/menu/more/MultiTabBottomDialog\n*L\n52#1:136,20\n67#1:156\n67#1:157,3\n68#1:160\n68#1:161,3\n98#1:164,2\n*E\n"})
public final class MultiTabBottomDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public final List<MultiTabItemInfo> f20505s0;

    /* JADX INFO: renamed from: t0 */
    public final int f20506t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final InterfaceC24293a f20507u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f20502w0 = {Reflection.property1(new PropertyReference1Impl(MultiTabBottomDialog.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BkucoinMultiTabBottomDialogBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f20501v0 = new Companion(null);

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final InterfaceC40166a<String> f20503x0 = C40167b.m88525a(new Function0() { // from class: com.kubi.core.biz.menu.more.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MultiTabBottomDialog.m21975q4();
        }
    });

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public static final InterfaceC40166a<String> f20504y0 = C40167b.m88525a(new Function0() { // from class: com.kubi.core.biz.menu.more.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MultiTabBottomDialog.m21974p4();
        }
    });

    /* JADX INFO: compiled from: MultiTabBottomDialog.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/biz/menu/more/MultiTabBottomDialog$Companion;", "", "<init>", "()V", "SPOT_USER_GUIDES_URL", "", "getSPOT_USER_GUIDES_URL", "()Ljava/lang/String;", "SPOT_USER_GUIDES_URL$delegate", "Lcom/kubi/network/api/utils/Link;", "MARGIN_USER_GUIDES_URL", "getMARGIN_USER_GUIDES_URL", "MARGIN_USER_GUIDES_URL$delegate", "create", "Lcom/kubi/core/biz/menu/more/MultiTabBottomDialog;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/core/biz/menu/more/MultiTabItemInfo;", "defaultTabIndex", "", "KEYBOARD_DISMISS_DELAY_MS", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMultiTabBottomDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiTabBottomDialog.kt\ncom/kubi/core/biz/menu/more/MultiTabBottomDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ KProperty<Object>[] f20508a = {Reflection.property1(new PropertyReference1Impl(Companion.class, "SPOT_USER_GUIDES_URL", "getSPOT_USER_GUIDES_URL()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(Companion.class, "MARGIN_USER_GUIDES_URL", "getMARGIN_USER_GUIDES_URL()Ljava/lang/String;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ MultiTabBottomDialog create$default(Companion companion, List list, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return companion.create(list, i11);
        }

        @NotNull
        public final MultiTabBottomDialog create(@NotNull List<MultiTabItemInfo> items, int defaultTabIndex) {
            Intrinsics.checkNotNullParameter(items, "items");
            MultiTabBottomDialog multiTabBottomDialog = new MultiTabBottomDialog(items, defaultTabIndex);
            Bundle bundle = new Bundle();
            bundle.putInt("type", 8);
            multiTabBottomDialog.setArguments(bundle);
            return multiTabBottomDialog;
        }

        @NotNull
        public final String getMARGIN_USER_GUIDES_URL() {
            return (String) MultiTabBottomDialog.f20504y0.getValue(this, f20508a[1]);
        }

        @NotNull
        public final String getSPOT_USER_GUIDES_URL() {
            return (String) MultiTabBottomDialog.f20503x0.getValue(this, f20508a[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiTabBottomDialog() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    public /* synthetic */ MultiTabBottomDialog(List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: p4 */
    public static final String m21974p4() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append("/user-guide/margin?appNeedLang=true&utm_source=userGuide&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: q4 */
    public static final String m21975q4() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        sb2.append("/user-guide/spot?appNeedLang=true&utm_source=userGuide&theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        return sb2.toString();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkucoin_multi_tab_bottom_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        C45386i c45386iM21979t4;
        SlidingTabLayout slidingTabLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        List<MultiTabItemInfo> list = this.f20505s0;
        if (list == null) {
            dismissAllowingStateLoss();
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MultiTabItemInfo) it.next()).getTabName());
        }
        List<MultiTabItemInfo> list2 = this.f20505s0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MultiTabItemInfo) it2.next()).getContent());
        }
        ArrayList arrayList3 = (ArrayList) CollectionsKt.toCollection(arrayList2, new ArrayList());
        if (m21979t4() == null) {
            dismissAllowingStateLoss();
            return;
        }
        if (this.f20505s0.size() < 2 && (c45386iM21979t4 = m21979t4()) != null && (slidingTabLayout = c45386iM21979t4.f102136c) != null) {
            slidingTabLayout.setVisibility(8);
        }
        C45386i c45386iM21979t5 = m21979t4();
        if (c45386iM21979t5 != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            c45386iM21979t5.f102135b.setAdapter(new C27103z(childFragmentManager, arrayList3, arrayList));
            c45386iM21979t5.f102135b.setOffscreenPageLimit(3);
            c45386iM21979t5.f102136c.setNeedBold(true);
            c45386iM21979t5.f102136c.setViewPager(c45386iM21979t5.f102135b);
            c45386iM21979t5.f102136c.m55291w();
            c45386iM21979t5.f102136c.setCurrentTab(RangesKt.coerceIn(this.f20506t0, 0, this.f20505s0.size() - 1));
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final C45386i m21979t4() {
        return (C45386i) this.f20507u0.getValue(this, f20502w0[0]);
    }

    /* JADX INFO: renamed from: u4 */
    public final void m21980u4(@Nullable final Fragment fragment, @Nullable final String str) {
        final FragmentActivity activity;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        if (!KeyboardUtils.m6037i(activity)) {
            super.m54193s3(fragment, str);
        } else {
            KeyboardUtils.m6033e(activity);
            activity.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.kubi.core.biz.menu.more.d
                @Override // java.lang.Runnable
                public final void run() {
                    MultiTabBottomDialog.m21978v4(fragment, activity, this, str);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m21981w4(int i11, boolean z11) {
        List<MultiTabItemInfo> list = this.f20505s0;
        if (list != null) {
            for (MultiTabItemInfo multiTabItemInfo : list) {
                if (multiTabItemInfo.getContent() instanceof TradeFunctionsFragment) {
                    ((TradeFunctionsFragment) multiTabItemInfo.getContent()).m21985m3(i11, z11);
                }
            }
        }
    }

    public MultiTabBottomDialog(@Nullable List<MultiTabItemInfo> list, int i11) {
        this.f20505s0 = list;
        this.f20506t0 = i11;
        this.f20507u0 = C45681e.m100799e(this, new Function1<MultiTabBottomDialog, C45386i>() { // from class: com.kubi.core.biz.menu.more.MultiTabBottomDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45386i invoke(@NotNull MultiTabBottomDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C45386i.m100306a(fragment.requireView());
            }
        }, new Function1<C45386i, Unit>() { // from class: com.kubi.core.biz.menu.more.MultiTabBottomDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C45386i it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45386i c45386i) {
                invoke(c45386i);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m21978v4(Fragment fragment, FragmentActivity fragmentActivity, MultiTabBottomDialog multiTabBottomDialog, String str) {
        if (!fragment.isDetached() && !fragment.isRemoving() && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            super.m54193s3(fragment, str);
        }
    }
}
