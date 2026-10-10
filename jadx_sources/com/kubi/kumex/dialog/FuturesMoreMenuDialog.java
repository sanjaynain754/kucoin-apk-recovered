package com.kubi.kumex.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.C7090R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.trade.menu.AnnouncementFragment;
import com.kubi.kumex.trade.menu.CampaignFragment;
import com.kubi.kumex.trade.menu.FeaturesFragment;
import com.kubi.kumex.trade.menu.MenuItem;
import com.kubi.kumex.trade.menu.WebViewContainerFragment;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.AbstractC34022xe;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36876z;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p729wl.C45875l0;
import p830zf.InterfaceC46808l;
import p830zf.InterfaceC46810m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import tm.C45042a;
import w00.C45681e;

/* JADX INFO: compiled from: FuturesMoreMenuDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J(\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\t2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&H\u0002J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\tH\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0011H\u0003R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006+"}, m90084d2 = {"Lcom/kubi/kumex/dialog/FuturesMoreMenuDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "isBottomSheet", "", "initType", "", "rnDialogId", "", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogFuturesMoreMenuBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFuturesMoreMenuBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onDestroy", "getCampaignFragment", "Landroidx/fragment/app/Fragment;", "getAnnouncementFragment", "getRnCampaignFragment", "getRnAnnouncementFragment", "getFeaturesFragment", "tabType", FirebaseAnalytics.Param.ITEMS, "Ljava/util/ArrayList;", "Lcom/kubi/kumex/trade/menu/MenuItem;", "Lkotlin/collections/ArrayList;", "getRnFeaturesFragment", "setupTouchInterceptor", "viewPager", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesMoreMenuDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesMoreMenuDialog.kt\ncom/kubi/kumex/dialog/FuturesMoreMenuDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,299:1\n143#2,20:300\n17#3,2:320\n*S KotlinDebug\n*F\n+ 1 FuturesMoreMenuDialog.kt\ncom/kubi/kumex/dialog/FuturesMoreMenuDialog\n*L\n80#1:300,20\n112#1:320,2\n*E\n"})
public final class FuturesMoreMenuDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final String f28852q0 = "futures_more_menu_dialog";

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f28853r0 = C45681e.m100799e(this, new Function1<FuturesMoreMenuDialog, C36876z>() { // from class: com.kubi.kumex.dialog.FuturesMoreMenuDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36876z invoke(@NotNull FuturesMoreMenuDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36876z.m82620a(fragment.requireView());
        }
    }, new Function1<C36876z, Unit>() { // from class: com.kubi.kumex.dialog.FuturesMoreMenuDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36876z it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36876z c36876z) {
            invoke(c36876z);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f28851t0 = {Reflection.property1(new PropertyReference1Impl(FuturesMoreMenuDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogFuturesMoreMenuBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f28850s0 = new Companion(null);

    /* JADX INFO: compiled from: FuturesMoreMenuDialog.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kumex/dialog/FuturesMoreMenuDialog$Companion;", "", "<init>", "()V", "TAG", "", "KEY_DISMISS_DIALOG", "KEY_FIRST_SELECTED_TUTORIAL", "newInstance", "Landroidx/fragment/app/DialogFragment;", "menuItems", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/trade/menu/MenuItem;", "Lkotlin/collections/ArrayList;", "dataItems", "firstSelectedTutorial", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFuturesMoreMenuDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesMoreMenuDialog.kt\ncom/kubi/kumex/dialog/FuturesMoreMenuDialog$Companion\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,299:1\n17#2,2:300\n*S KotlinDebug\n*F\n+ 1 FuturesMoreMenuDialog.kt\ncom/kubi/kumex/dialog/FuturesMoreMenuDialog$Companion\n*L\n63#1:300,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DialogFragment newInstance$default(Companion companion, ArrayList arrayList, ArrayList arrayList2, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                arrayList2 = new ArrayList();
            }
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.newInstance(arrayList, arrayList2, z11);
        }

        @NotNull
        public final DialogFragment newInstance(@NotNull ArrayList<MenuItem> menuItems, @NotNull ArrayList<MenuItem> dataItems, boolean firstSelectedTutorial) {
            DialogFragment futuresMoreMenuDialog;
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            Intrinsics.checkNotNullParameter(dataItems, "dataItems");
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46808l.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h == null || (futuresMoreMenuDialog = ((InterfaceC46808l) objM56186h).m103139a()) == null) {
                futuresMoreMenuDialog = new FuturesMoreMenuDialog();
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("data", menuItems);
            bundle.putParcelableArrayList("data_1", dataItems);
            bundle.putBoolean("first_selected_tutorial", firstSelectedTutorial);
            futuresMoreMenuDialog.setArguments(bundle);
            return futuresMoreMenuDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ArrayList arrayListArrayListOf;
        ArrayList arrayListArrayListOf2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6179a() * 0.67f));
        Bundle arguments = getArguments();
        ArrayList<MenuItem> parcelableArrayList = arguments != null ? BundleCompat.getParcelableArrayList(arguments, "data", MenuItem.class) : null;
        Bundle arguments2 = getArguments();
        ArrayList<MenuItem> parcelableArrayList2 = arguments2 != null ? BundleCompat.getParcelableArrayList(arguments2, "data_1", MenuItem.class) : null;
        C36876z c36876zM33498q4 = m33498q4();
        if (getArguments() == null || parcelableArrayList == null || parcelableArrayList.isEmpty() || c36876zM33498q4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46810m.class, SiteInfoManager.f47913a.m58109c());
        boolean zM103140a = objM56186h != null ? ((InterfaceC46810m) objM56186h).m103140a() : true;
        boolean z11 = parcelableArrayList2 == null || parcelableArrayList2.isEmpty();
        if (zM103140a) {
            String string = getString(R$string.kumex_selected_function);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayListArrayListOf = CollectionsKt.arrayListOf(string);
            if (!z11) {
                arrayListArrayListOf.add(getString(R$string.bkmex_aggregate_information_data));
            }
            arrayListArrayListOf.add(getString(R$string.kumex_contract_course));
            arrayListArrayListOf.add(getString(R$string.kumex_popular_activity));
            arrayListArrayListOf.add(getString(R$string.kc_trade_more_tab_announcements));
        } else {
            String string2 = getString(R$string.kumex_selected_function);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayListArrayListOf = CollectionsKt.arrayListOf(string2);
            if (!z11) {
                arrayListArrayListOf.add(getString(R$string.bkmex_aggregate_information_data));
            }
            arrayListArrayListOf.add(getString(R$string.kumex_popular_activity));
            arrayListArrayListOf.add(getString(R$string.kc_trade_more_tab_announcements));
        }
        if (zM103140a) {
            arrayListArrayListOf2 = CollectionsKt.arrayListOf(m33494m4(AbstractC34022xe.f72514e, parcelableArrayList));
            if (!z11) {
                arrayListArrayListOf2.add(FeaturesFragment.f30571V.newInstance(parcelableArrayList2));
            }
            arrayListArrayListOf2.add(WebViewContainerFragment.f30576W.newInstance(C45875l0.f103336a.m101335D0()));
            arrayListArrayListOf2.add(m33493l4());
            arrayListArrayListOf2.add(m33492k4());
        } else {
            arrayListArrayListOf2 = CollectionsKt.arrayListOf(m33494m4(AbstractC34022xe.f72514e, parcelableArrayList));
            if (!z11) {
                arrayListArrayListOf2.add(FeaturesFragment.f30571V.newInstance(parcelableArrayList2));
            }
            arrayListArrayListOf2.add(m33493l4());
            arrayListArrayListOf2.add(m33492k4());
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c36876zM33498q4.f81396b.setAdapter(new C27103z(childFragmentManager, arrayListArrayListOf2, arrayListArrayListOf));
        c36876zM33498q4.f81396b.setOffscreenPageLimit(5);
        c36876zM33498q4.f81397c.setNeedBold(true);
        c36876zM33498q4.f81397c.setViewPager(c36876zM33498q4.f81396b);
        c36876zM33498q4.f81397c.m55291w();
        Bundle arguments3 = getArguments();
        boolean zM56252i = arguments3 != null ? RouteExKt.m56252i(arguments3, "first_selected_tutorial", false) : false;
        if (zM103140a && zM56252i) {
            c36876zM33498q4.f81397c.setCurrentTab(1);
        }
        getChildFragmentManager().setFragmentResultListener("key_dismiss_dialog", this, new FragmentResultListener() { // from class: com.kubi.kumex.dialog.v
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                FuturesMoreMenuDialog.m33491r4(this.f28996a, str, bundle);
            }
        });
        RtlViewPager rtlViewPager = c36876zM33498q4.f81396b;
        Intrinsics.checkNotNullExpressionValue(rtlViewPager, "rtlViewPager");
        m33499s4(rtlViewPager);
        IReactNativeService.INSTANCE.get().registerDialogId(this.f28852q0, this);
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m33491r4(FuturesMoreMenuDialog futuresMoreMenuDialog, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        futuresMoreMenuDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: k4 */
    public final Fragment m33492k4() {
        if (!C45042a.f101445a.m99617e()) {
            return new AnnouncementFragment();
        }
        C44128b.m97259c("FuturesMoreMenuDialog", "getAnnouncementFragment: use RN Fragment");
        return m33495n4();
    }

    /* JADX INFO: renamed from: l4 */
    public final Fragment m33493l4() {
        if (!C45042a.f101445a.m99617e()) {
            return new CampaignFragment();
        }
        C44128b.m97259c("FuturesMoreMenuDialog", "getAnnouncementFragment: use RN Fragment");
        return m33496o4();
    }

    /* JADX INFO: renamed from: m4 */
    public final Fragment m33494m4(String str, ArrayList<MenuItem> arrayList) {
        if (!C45042a.f101445a.m99616d()) {
            return FeaturesFragment.f30571V.newInstance(arrayList);
        }
        C44128b.m97259c("FuturesMoreMenuDialog", "getFeaturesFragment: use RN Fragment for tabType=" + str);
        return m33497p4(str);
    }

    /* JADX INFO: renamed from: n4 */
    public final Fragment m33495n4() {
        return IReactNativeService.INSTANCE.get().getRnRootFragment(BundleKt.bundleOf(new Pair(Constants.BIZ, "trade"), new Pair("entry", "main"), new Pair(Constants.COMPONENT, "kucoin_order_center"), new Pair("route", "AnnouncementPage")));
    }

    /* JADX INFO: renamed from: o4 */
    public final Fragment m33496o4() {
        return IReactNativeService.INSTANCE.get().getRnRootFragment(BundleKt.bundleOf(new Pair(Constants.BIZ, "trade"), new Pair("entry", "main"), new Pair(Constants.COMPONENT, "kucoin_order_center"), new Pair("route", "CampaignPage")));
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_futures_more_menu, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IReactNativeService.INSTANCE.get().unregisterDialogId(this.f28852q0);
        super.onDestroy();
    }

    /* JADX INFO: renamed from: p4 */
    public final Fragment m33497p4(String str) {
        return IReactNativeService.INSTANCE.get().getRnRootFragment(BundleKt.bundleOf(new Pair(Constants.BIZ, "trade"), new Pair("entry", "main"), new Pair(Constants.COMPONENT, "kucoin_order_center"), new Pair("route", "FeaturesPage"), new Pair("tabType", str)));
    }

    /* JADX INFO: renamed from: q4 */
    public final C36876z m33498q4() {
        return (C36876z) this.f28853r0.getValue(this, f28851t0[0]);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: s4 */
    public final void m33499s4(View view) {
        BottomSheetDialog bottomSheetDialog;
        FrameLayout frameLayout;
        Dialog dialog = getDialog();
        final ViewGroup viewGroup = null;
        if (dialog instanceof BottomSheetDialog) {
            bottomSheetDialog = (BottomSheetDialog) dialog;
        } else {
            bottomSheetDialog = null;
        }
        if (bottomSheetDialog != null && (frameLayout = (FrameLayout) bottomSheetDialog.findViewById(C7090R.id.design_bottom_sheet)) != null) {
            final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                int iIndexOfChild = viewGroup.indexOfChild(view);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                final Context context = view.getContext();
                FrameLayout frameLayout2 = new FrameLayout(context) { // from class: com.kubi.kumex.dialog.FuturesMoreMenuDialog$setupTouchInterceptor$wrapper$1
                    @Override // android.view.ViewGroup, android.view.View
                    public boolean dispatchTouchEvent(MotionEvent ev2) {
                        Intrinsics.checkNotNullParameter(ev2, "ev");
                        int action = ev2.getAction();
                        if (action == 0) {
                            bottomSheetBehaviorFrom.setDraggable(false);
                            viewGroup.requestDisallowInterceptTouchEvent(true);
                        } else if (action == 1 || action == 3) {
                            bottomSheetBehaviorFrom.setDraggable(true);
                            viewGroup.requestDisallowInterceptTouchEvent(false);
                        }
                        return super.dispatchTouchEvent(ev2);
                    }
                };
                viewGroup.removeView(view);
                frameLayout2.addView(view, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(frameLayout2, iIndexOfChild, layoutParams);
            }
        }
    }
}
