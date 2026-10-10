package com.kubi.payment.fasttradev2.coupon;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.blankj.utilcode.util.C5267e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.FiatCouponDiscountInfo;
import com.kubi.payment.fast.data.entities.FiatCouponListInfo;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM;
import com.kubi.payment.widget.MaxHeightRecyclerView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.adapter.KcBaseDifferMultiAdapter;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.DialogC40864b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37637j0;
import p270ft.C37647l0;
import p270ft.C37682s0;
import p275fy.C37728a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: MarketingCouponListDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u001b\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\f\u0010(\u001a\u00020&*\u00020\u000bH\u0002J\f\u0010)\u001a\u00020&*\u00020\u000bH\u0002J\"\u0010*\u001a\u00020&*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c¨\u00061"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "commonBuyViewModel", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;", "getCommonBuyViewModel", "()Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;", "commonBuyViewModel$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/otc/databinding/MarketingCouponListLayoutBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/MarketingCouponListLayoutBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingDialog", "Lcom/kubi/sdk/widget/loading/LoadingDialog;", "getLoadingDialog", "()Lcom/kubi/sdk/widget/loading/LoadingDialog;", "loadingDialog$delegate", "adapter", "Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponListAdapter;", "lastSelectedPosition", "", "currentSelectedPosition", "loadingDialogObserver", "com/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog$loadingDialogObserver$1", "Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog$loadingDialogObserver$1;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "observeData", "safeNotifyItemChanged", "Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;", "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;", ViewProps.POSITION, "payload", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketingCouponListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketingCouponListDialog.kt\ncom/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n143#2,20:260\n360#3,7:280\n360#3,7:287\n1563#3:294\n1634#3,3:295\n1563#3:298\n1634#3,3:299\n*S KotlinDebug\n*F\n+ 1 MarketingCouponListDialog.kt\ncom/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog\n*L\n52#1:260,20\n211#1:280,7\n215#1:287,7\n177#1:294\n177#1:295,3\n186#1:298\n186#1:299,3\n*E\n"})
public final class MarketingCouponListDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: t0 */
    public MarketingCouponListAdapter f39334t0;

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ KProperty<Object>[] f39330y0 = {Reflection.property1(new PropertyReference1Impl(MarketingCouponListDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/MarketingCouponListLayoutBinding;", 0))};

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f39329x0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f39331q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketingCouponListDialog.m47917s4(this.f39364b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f39332r0 = C45681e.m100799e(this, new Function1<MarketingCouponListDialog, C37647l0>() { // from class: com.kubi.payment.fasttradev2.coupon.MarketingCouponListDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37647l0 invoke(@NotNull MarketingCouponListDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37647l0.m84877a(fragment.requireView());
        }
    }, new Function1<C37647l0, Unit>() { // from class: com.kubi.payment.fasttradev2.coupon.MarketingCouponListDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37647l0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37647l0 c37647l0) {
            invoke(c37647l0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f39333s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketingCouponListDialog.m47921z4(this.f39365b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    public int f39335u0 = -1;

    /* JADX INFO: renamed from: v0 */
    public int f39336v0 = -1;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final C20868b f39337w0 = new C20868b();

    /* JADX INFO: compiled from: MarketingCouponListDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragment", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "fiatCurrency", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarketingCouponListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketingCouponListDialog.kt\ncom/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull BuyCommonConfirmFragment<?> fragment, @Nullable String fiatCurrency) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            MarketingCouponListDialog marketingCouponListDialog = new MarketingCouponListDialog();
            Bundle bundle = new Bundle();
            bundle.putString("fiatCurrency", fiatCurrency);
            marketingCouponListDialog.setArguments(bundle);
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            marketingCouponListDialog.show(childFragmentManager, "MarketingCouponListDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.coupon.MarketingCouponListDialog$a */
    /* JADX INFO: compiled from: MarketingCouponListDialog.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog$initView$3", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20867a extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            outRect.left = C27040e.m66658b(16);
            outRect.right = C27040e.m66658b(16);
            RecyclerView.ViewHolder childViewHolder = parent.getChildViewHolder(view);
            if (childViewHolder instanceof C37728a) {
                C37728a c37728a = (C37728a) childViewHolder;
                ViewBinding viewBindingM85032b = c37728a.m85032b();
                if (viewBindingM85032b instanceof C37682s0) {
                    outRect.top = C27040e.m66658b(c37728a.getAbsoluteAdapterPosition() != 0 ? 12 : 0);
                } else if (viewBindingM85032b instanceof C37637j0) {
                    outRect.top = C27040e.m66658b(8);
                    outRect.bottom = C27040e.m66658b(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.coupon.MarketingCouponListDialog$b */
    /* JADX INFO: compiled from: MarketingCouponListDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/fasttradev2/coupon/MarketingCouponListDialog$loadingDialogObserver$1", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "value", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20868b implements Observer<Boolean> {
        public C20868b() {
        }

        /* JADX INFO: renamed from: a */
        public void m47927a(boolean z11) {
            if (z11) {
                MarketingCouponListDialog.this.getLoadingDialog().show();
            } else {
                MarketingCouponListDialog.this.getLoadingDialog().m89436a(true);
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
            m47927a(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.coupon.MarketingCouponListDialog$c */
    /* JADX INFO: compiled from: MarketingCouponListDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20869c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39339b;

        public C20869c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39339b = function;
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
            return this.f39339b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39339b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public static final BuyCommonConfirmVM m47917s4(MarketingCouponListDialog marketingCouponListDialog) {
        try {
            Fragment fragmentRequireParentFragment = marketingCouponListDialog.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            if (fragmentRequireParentFragment instanceof BuyCommonConfirmFragment) {
                return (BuyCommonConfirmVM) new ViewModelProvider(fragmentRequireParentFragment).get(JvmClassMappingKt.getJavaClass((KClass) ((BuyCommonConfirmFragment) fragmentRequireParentFragment).mo45654z3()));
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m47905B4(final MarketingCouponListDialog marketingCouponListDialog, C37647l0 c37647l0, final BuyCommonConfirmVM buyCommonConfirmVM, FiatCouponListInfo.Response response) {
        final ArrayList arrayList = new ArrayList();
        List<FiatCouponListInfo.CouponInfo> availableList = response.getAvailableList();
        if (availableList != null && !availableList.isEmpty()) {
            arrayList.add(new ItemFiatCouponInfo.ItemHeader(marketingCouponListDialog.getString(R$string.payment_coupon_one_time)));
            List<FiatCouponListInfo.CouponInfo> availableList2 = response.getAvailableList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(availableList2, 10));
            Iterator<T> it = availableList2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ItemFiatCouponInfo.ItemAvailable((FiatCouponListInfo.CouponInfo) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        List<FiatCouponListInfo.CouponInfo> notEligibleList = response.getNotEligibleList();
        if (notEligibleList != null && !notEligibleList.isEmpty()) {
            arrayList.add(new ItemFiatCouponInfo.ItemHeader(marketingCouponListDialog.getString(R$string.payment_not_eligible)));
            List<FiatCouponListInfo.CouponInfo> notEligibleList2 = response.getNotEligibleList();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(notEligibleList2, 10));
            Iterator<T> it2 = notEligibleList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new ItemFiatCouponInfo.ItemUnAvailable((FiatCouponListInfo.CouponInfo) it2.next()));
            }
            arrayList.addAll(arrayList3);
        }
        if (arrayList.isEmpty()) {
            MaxHeightRecyclerView recyclerView = c37647l0.f84204g;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            ViewExtKt.m66577h(recyclerView);
            Layer emptyLayer = c37647l0.f84201d;
            Intrinsics.checkNotNullExpressionValue(emptyLayer, "emptyLayer");
            ViewExtKt.m66594y(emptyLayer);
            Layer saveAmountLayer = c37647l0.f84207j;
            Intrinsics.checkNotNullExpressionValue(saveAmountLayer, "saveAmountLayer");
            ViewExtKt.m66577h(saveAmountLayer);
            c37647l0.f84210m.setText(marketingCouponListDialog.getString(R$string.payment_coupon_no_available));
        } else {
            MaxHeightRecyclerView recyclerView2 = c37647l0.f84204g;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
            ViewExtKt.m66594y(recyclerView2);
            Layer emptyLayer2 = c37647l0.f84201d;
            Intrinsics.checkNotNullExpressionValue(emptyLayer2, "emptyLayer");
            ViewExtKt.m66577h(emptyLayer2);
            List<FiatCouponListInfo.CouponInfo> availableList3 = response.getAvailableList();
            if (availableList3 == null || availableList3.isEmpty()) {
                Layer saveAmountLayer2 = c37647l0.f84207j;
                Intrinsics.checkNotNullExpressionValue(saveAmountLayer2, "saveAmountLayer");
                ViewExtKt.m66577h(saveAmountLayer2);
                c37647l0.f84210m.setText(marketingCouponListDialog.getString(R$string.payment_coupon_no_available));
            } else {
                Layer saveAmountLayer3 = c37647l0.f84207j;
                Intrinsics.checkNotNullExpressionValue(saveAmountLayer3, "saveAmountLayer");
                ViewExtKt.m66594y(saveAmountLayer3);
                c37647l0.f84210m.setText(marketingCouponListDialog.getString(R$string.payment_promotion_you_can_save));
            }
            MarketingCouponListAdapter marketingCouponListAdapter = marketingCouponListDialog.f39334t0;
            if (marketingCouponListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                marketingCouponListAdapter = null;
            }
            marketingCouponListAdapter.m56506m(arrayList, new Runnable() { // from class: com.kubi.payment.fasttradev2.coupon.u
                @Override // java.lang.Runnable
                public final void run() {
                    MarketingCouponListDialog.m47906C4(buyCommonConfirmVM, arrayList, marketingCouponListDialog);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m47907D4(MarketingCouponListDialog marketingCouponListDialog, C37647l0 c37647l0, FiatCouponDiscountInfo.Response response) {
        if (response == null) {
            return Unit.INSTANCE;
        }
        MarketingCouponListAdapter marketingCouponListAdapter = marketingCouponListDialog.f39334t0;
        MarketingCouponListAdapter marketingCouponListAdapter2 = null;
        if (marketingCouponListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            marketingCouponListAdapter = null;
        }
        marketingCouponListDialog.m47923E4(marketingCouponListAdapter, marketingCouponListDialog.f39335u0, false);
        MarketingCouponListAdapter marketingCouponListAdapter3 = marketingCouponListDialog.f39334t0;
        if (marketingCouponListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            marketingCouponListAdapter2 = marketingCouponListAdapter3;
        }
        marketingCouponListDialog.m47923E4(marketingCouponListAdapter2, marketingCouponListDialog.f39336v0, true);
        marketingCouponListDialog.f39335u0 = marketingCouponListDialog.f39336v0;
        c37647l0.f84205h.setText(C27041f.m66669i(response.getFiatAmount(), "0"));
        c37647l0.f84206i.setText(C27041f.m66669i(response.getFiatCurrency(), C33820nf.f71144W));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m47919x4(MarketingCouponListDialog marketingCouponListDialog, C37647l0 c37647l0, String str, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        MarketingCouponListAdapter marketingCouponListAdapter = marketingCouponListDialog.f39334t0;
        MarketingCouponListAdapter marketingCouponListAdapter2 = null;
        if (marketingCouponListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            marketingCouponListAdapter = null;
        }
        ItemFiatCouponInfo item = marketingCouponListAdapter.getItem(i11);
        if (item instanceof ItemFiatCouponInfo.ItemAvailable) {
            if (marketingCouponListDialog.f39335u0 != i11) {
                marketingCouponListDialog.f39336v0 = i11;
                String rewardId = ((ItemFiatCouponInfo.ItemAvailable) item).getCouponInfo().getRewardId();
                BuyCommonConfirmVM buyCommonConfirmVMM47924t4 = marketingCouponListDialog.m47924t4();
                if (buyCommonConfirmVMM47924t4 != null) {
                    buyCommonConfirmVMM47924t4.m47539R(rewardId, false);
                    return;
                }
                return;
            }
            marketingCouponListDialog.f39335u0 = -1;
            MarketingCouponListAdapter marketingCouponListAdapter3 = marketingCouponListDialog.f39334t0;
            if (marketingCouponListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                marketingCouponListAdapter2 = marketingCouponListAdapter3;
            }
            marketingCouponListAdapter2.notifyItemChanged(i11, Boolean.FALSE);
            c37647l0.f84205h.setText("0");
            c37647l0.f84206i.setText(C27041f.m66668h(str));
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static final DialogC40864b m47921z4(MarketingCouponListDialog marketingCouponListDialog) {
        Context contextRequireContext = marketingCouponListDialog.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new DialogC40864b(contextRequireContext, false, 2, null);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m47923E4(KcBaseDifferMultiAdapter<ItemFiatCouponInfo> kcBaseDifferMultiAdapter, int i11, boolean z11) {
        FiatCouponListInfo.CouponInfo couponInfo;
        if (i11 < 0 || i11 >= kcBaseDifferMultiAdapter.getItemCount()) {
            return;
        }
        ItemFiatCouponInfo item = kcBaseDifferMultiAdapter.getItem(i11);
        if (item != null && (couponInfo = item.getCouponInfo()) != null) {
            couponInfo.setChecked(z11);
        }
        kcBaseDifferMultiAdapter.notifyItemChanged(i11, Boolean.valueOf(z11));
    }

    public final DialogC40864b getLoadingDialog() {
        return (DialogC40864b) this.f39333s0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.marketing_coupon_list_layout, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setState(3);
        }
        C37647l0 c37647l0M47925u4 = m47925u4();
        if (c37647l0M47925u4 != null) {
            m47926v4(c37647l0M47925u4);
            m47922A4(c37647l0M47925u4);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final BuyCommonConfirmVM m47924t4() {
        return (BuyCommonConfirmVM) this.f39331q0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final C37647l0 m47925u4() {
        return (C37647l0) this.f39332r0.getValue(this, f39330y0[0]);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m47926v4(final C37647l0 c37647l0) {
        AppCompatImageView ivClose = c37647l0.f84203f;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketingCouponListDialog.m47918w4(this.f39359b);
            }
        }, 1, null);
        Bundle arguments = getArguments();
        MarketingCouponListAdapter marketingCouponListAdapter = null;
        final String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "fiatCurrency") : null;
        c37647l0.f84205h.setText("0");
        c37647l0.f84206i.setText(strM56284y);
        MarketingCouponListAdapter marketingCouponListAdapter2 = new MarketingCouponListAdapter();
        this.f39334t0 = marketingCouponListAdapter2;
        marketingCouponListAdapter2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.fasttradev2.coupon.q
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                MarketingCouponListDialog.m47919x4(this.f39360a, c37647l0, strM56284y, baseQuickAdapter, view, i11);
            }
        });
        MaxHeightRecyclerView maxHeightRecyclerView = c37647l0.f84204g;
        MarketingCouponListAdapter marketingCouponListAdapter3 = this.f39334t0;
        if (marketingCouponListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            marketingCouponListAdapter = marketingCouponListAdapter3;
        }
        maxHeightRecyclerView.setAdapter(marketingCouponListAdapter);
        c37647l0.f84204g.setMaxHeight((int) (C5267e0.m6182d() * 0.7f));
        c37647l0.f84204g.addItemDecoration(new C20867a());
        KcPrimaryButton tvConfirm = c37647l0.f84208k;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketingCouponListDialog.m47920y4(this.f39363b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m47906C4(BuyCommonConfirmVM buyCommonConfirmVM, List list, MarketingCouponListDialog marketingCouponListDialog) {
        FiatCouponListInfo.CouponInfo couponInfo;
        String rewardId;
        String value = buyCommonConfirmVM.m47535N().getValue();
        int i11 = -1;
        int i12 = 0;
        if ((value == null || value.length() == 0) && !buyCommonConfirmVM.m47535N().isInitialized()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ItemFiatCouponInfo) it.next()).getF38450c() == 1) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            marketingCouponListDialog.f39336v0 = i11;
            ItemFiatCouponInfo itemFiatCouponInfo = (ItemFiatCouponInfo) CollectionsKt.getOrNull(list, i11);
            if (itemFiatCouponInfo != null && (couponInfo = itemFiatCouponInfo.getCouponInfo()) != null) {
                value = couponInfo.getRewardId();
            } else {
                value = null;
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                FiatCouponListInfo.CouponInfo couponInfo2 = ((ItemFiatCouponInfo) it2.next()).getCouponInfo();
                if (couponInfo2 != null) {
                    rewardId = couponInfo2.getRewardId();
                } else {
                    rewardId = null;
                }
                if (Intrinsics.areEqual(rewardId, value)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            marketingCouponListDialog.f39336v0 = i11;
        }
        if (value != null && value.length() != 0) {
            buyCommonConfirmVM.m47539R(value, true);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m47918w4(MarketingCouponListDialog marketingCouponListDialog) {
        marketingCouponListDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m47920y4(MarketingCouponListDialog marketingCouponListDialog) {
        FiatCouponListInfo.CouponInfo couponInfo;
        LiveData<Boolean> liveDataM45660s;
        BuyCommonConfirmVM buyCommonConfirmVMM47924t4 = marketingCouponListDialog.m47924t4();
        if (buyCommonConfirmVMM47924t4 != null && (liveDataM45660s = buyCommonConfirmVMM47924t4.m45660s()) != null) {
            liveDataM45660s.removeObserver(marketingCouponListDialog.f39337w0);
        }
        String rewardId = null;
        if (marketingCouponListDialog.f39335u0 > 0) {
            MarketingCouponListAdapter marketingCouponListAdapter = marketingCouponListDialog.f39334t0;
            if (marketingCouponListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                marketingCouponListAdapter = null;
            }
            ItemFiatCouponInfo item = marketingCouponListAdapter.getItem(marketingCouponListDialog.f39336v0);
            if (item != null && (couponInfo = item.getCouponInfo()) != null) {
                rewardId = couponInfo.getRewardId();
            }
            BuyCommonConfirmVM buyCommonConfirmVMM47924t5 = marketingCouponListDialog.m47924t4();
            if (buyCommonConfirmVMM47924t5 != null) {
                buyCommonConfirmVMM47924t5.m47542V(rewardId);
            }
        } else {
            BuyCommonConfirmVM buyCommonConfirmVMM47924t6 = marketingCouponListDialog.m47924t4();
            if (buyCommonConfirmVMM47924t6 != null) {
                buyCommonConfirmVMM47924t6.m47542V(null);
            }
        }
        marketingCouponListDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final void m47922A4(final C37647l0 c37647l0) {
        final BuyCommonConfirmVM buyCommonConfirmVMM47924t4 = m47924t4();
        if (buyCommonConfirmVMM47924t4 != null) {
            buyCommonConfirmVMM47924t4.m45660s().observe(getViewLifecycleOwner(), this.f39337w0);
            buyCommonConfirmVMM47924t4.m47531J().observe(getViewLifecycleOwner(), new C20869c(new Function1() { // from class: com.kubi.payment.fasttradev2.coupon.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketingCouponListDialog.m47905B4(this.f39354b, c37647l0, buyCommonConfirmVMM47924t4, (FiatCouponListInfo.Response) obj);
                }
            }));
            buyCommonConfirmVMM47924t4.m47530I().observe(getViewLifecycleOwner(), new C20869c(new Function1() { // from class: com.kubi.payment.fasttradev2.coupon.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketingCouponListDialog.m47907D4(this.f39357b, c37647l0, (FiatCouponDiscountInfo.Response) obj);
                }
            }));
        }
    }
}
