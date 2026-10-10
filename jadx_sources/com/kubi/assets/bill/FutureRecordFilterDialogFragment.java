package com.kubi.assets.bill;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44831o1;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FutureRecordFilterDialogFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000e\u001a\u00020\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J.\u0010*\u001a\u00020\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/assets/bill/FutureRecordFilterDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetKumexDialogCommonFilterBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetKumexDialogCommonFilterBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "callBack", "Lkotlin/Function2;", "", "", "setCallBack", TUIConstants.TUIChat.CALL_BACK, "isBottomSheet", "", "fundsType", "getFundsType", "()Ljava/lang/String;", "fundsType$delegate", "Lkotlin/Lazy;", "bizType", "getBizType", "bizType$delegate", "resultCallBackList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/bill/IFilterDialogCallBack;", "Lkotlin/collections/ArrayList;", "fundsTypeChangeClick", "Lio/reactivex/functions/Consumer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initFilterData2View", "filterData", "", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "isSameFundsType", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFutureRecordFilterDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureRecordFilterDialogFragment.kt\ncom/kubi/assets/bill/FutureRecordFilterDialogFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n143#2,20:171\n1878#3,2:191\n1880#3:200\n3829#4:193\n4344#4,2:194\n37#5:196\n36#5,3:197\n*S KotlinDebug\n*F\n+ 1 FutureRecordFilterDialogFragment.kt\ncom/kubi/assets/bill/FutureRecordFilterDialogFragment\n*L\n32#1:171,20\n130#1:191,2\n130#1:200\n135#1:193\n135#1:194,2\n138#1:196\n138#1:197,3\n*E\n"})
public final class FutureRecordFilterDialogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function2<? super String, ? super String, Unit> f16712r0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f16710x0 = {Reflection.property1(new PropertyReference1Impl(FutureRecordFilterDialogFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetKumexDialogCommonFilterBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f16709w0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16711q0 = C45681e.m100799e(this, new Function1<FutureRecordFilterDialogFragment, C44831o1>() { // from class: com.kubi.assets.bill.FutureRecordFilterDialogFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44831o1 invoke(@NotNull FutureRecordFilterDialogFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44831o1.m99188a(fragment.requireView());
        }
    }, new Function1<C44831o1, Unit>() { // from class: com.kubi.assets.bill.FutureRecordFilterDialogFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44831o1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44831o1 c44831o1) {
            invoke(c44831o1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f16713s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.c2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FutureRecordFilterDialogFragment.m15779q4(this.f16739b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f16714t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.d2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FutureRecordFilterDialogFragment.m15777o4(this.f16744b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final ArrayList<IFilterDialogCallBack> f16715u0 = new ArrayList<>();

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Consumer<String> f16716v0 = new Consumer() { // from class: com.kubi.assets.bill.e2
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            FutureRecordFilterDialogFragment.m15778p4(this.f16747b, (String) obj);
        }
    };

    /* JADX INFO: compiled from: FutureRecordFilterDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/assets/bill/FutureRecordFilterDialogFragment$Companion;", "", "<init>", "()V", "SELF_FUNDS", "", "TRIAL_FUNDS", "newInstance", "Lcom/kubi/assets/bill/FutureRecordFilterDialogFragment;", "fundsType", "bizType", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FutureRecordFilterDialogFragment newInstance(@NotNull String fundsType, @NotNull String bizType) {
            Intrinsics.checkNotNullParameter(fundsType, "fundsType");
            Intrinsics.checkNotNullParameter(bizType, "bizType");
            FutureRecordFilterDialogFragment futureRecordFilterDialogFragment = new FutureRecordFilterDialogFragment();
            futureRecordFilterDialogFragment.setArguments(new C27051h().m66724h("fundsType", fundsType).m66724h("bizType", bizType).m66717a());
            return futureRecordFilterDialogFragment;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m15778p4(FutureRecordFilterDialogFragment futureRecordFilterDialogFragment, String str) {
        FutureAssetFilterHelper futureAssetFilterHelper = FutureAssetFilterHelper.f16700a;
        Context contextRequireContext = futureRecordFilterDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(str);
        futureRecordFilterDialogFragment.m15785u4(futureAssetFilterHelper.m15762i(contextRequireContext, str, futureRecordFilterDialogFragment.m15783s4(), Intrinsics.areEqual(futureRecordFilterDialogFragment.m15784t4(), str)), Intrinsics.areEqual(futureRecordFilterDialogFragment.m15784t4(), str), str, futureRecordFilterDialogFragment.m15783s4());
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m15780v4(FutureRecordFilterDialogFragment futureRecordFilterDialogFragment) {
        FutureAssetFilterHelper futureAssetFilterHelper = FutureAssetFilterHelper.f16700a;
        Context contextRequireContext = futureRecordFilterDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        futureRecordFilterDialogFragment.m15785u4(futureAssetFilterHelper.m15762i(contextRequireContext, "selfFunds", "", true), true, "selfFunds", "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m15781w4(FutureRecordFilterDialogFragment futureRecordFilterDialogFragment) {
        Function2<? super String, ? super String, Unit> function2 = futureRecordFilterDialogFragment.f16712r0;
        if (function2 != null) {
            function2.invoke(futureRecordFilterDialogFragment.f16715u0.get(0).getAdapterResult(), futureRecordFilterDialogFragment.f16715u0.get(1).getAdapterResult());
        }
        futureRecordFilterDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_kumex_dialog_common_filter, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int iM6237b = C5275i0.m6237b(view);
        int iM6182d = (C5267e0.m6182d() * 7) / 8;
        if (iM6237b > iM6182d) {
            iM6237b = iM6182d;
        }
        view.getLayoutParams().height = iM6237b;
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, iM6237b);
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(iM6237b);
                bottomSheetBehaviorFrom.setState(3);
            }
        }
        C44831o1 c44831o1M15782r4 = m15782r4();
        if (c44831o1M15782r4 != null && (kcPrimaryButton2 = c44831o1M15782r4.f100536d) != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.assets.bill.f2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FutureRecordFilterDialogFragment.m15780v4(this.f16750b);
                }
            }, 1, null);
        }
        C44831o1 c44831o1M15782r5 = m15782r4();
        if (c44831o1M15782r5 != null && (kcPrimaryButton = c44831o1M15782r5.f100535c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.bill.g2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FutureRecordFilterDialogFragment.m15781w4(this.f16754b);
                }
            }, 1, null);
        }
        FutureAssetFilterHelper futureAssetFilterHelper = FutureAssetFilterHelper.f16700a;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        m15785u4(futureAssetFilterHelper.m15762i(contextRequireContext, m15784t4(), m15783s4(), true), true, m15784t4(), m15783s4());
    }

    /* JADX INFO: renamed from: r4 */
    public final C44831o1 m15782r4() {
        return (C44831o1) this.f16711q0.getValue(this, f16710x0[0]);
    }

    /* JADX INFO: renamed from: s4 */
    public final String m15783s4() {
        return (String) this.f16714t0.getValue();
    }

    /* JADX INFO: renamed from: t4 */
    public final String m15784t4() {
        return (String) this.f16713s0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m15785u4(List<? extends C23034a.a> list, boolean z11, String str, String str2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        this.f16715u0.clear();
        C44831o1 c44831o1M15782r4 = m15782r4();
        if (c44831o1M15782r4 != null && (linearLayout3 = c44831o1M15782r4.f100534b) != null) {
            linearLayout3.removeAllViews();
        }
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C23034a.a aVar = (C23034a.a) obj;
            if (aVar.m55168b().length > 8) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                String strM55169c = aVar.m55169c();
                Intrinsics.checkNotNullExpressionValue(strM55169c, "getName(...)");
                FutureAssetFilterHelper futureAssetFilterHelper = FutureAssetFilterHelper.f16700a;
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
                ArrayList arrayList = new ArrayList();
                for (FilterType.InterfaceC23033b interfaceC23033b : interfaceC23033bArrM55168b) {
                    if (!Intrinsics.areEqual(interfaceC23033b.getF44545b(), "")) {
                        arrayList.add(interfaceC23033b);
                    }
                }
                FutureRecordFilterRecyclerView futureRecordFilterRecyclerView = new FutureRecordFilterRecyclerView(contextRequireContext, strM55169c, futureAssetFilterHelper.m15768q(contextRequireContext2, (FilterType.InterfaceC23033b[]) arrayList.toArray(new FilterType.InterfaceC23033b[0]), z11, str2, str));
                futureRecordFilterRecyclerView.setPadding(0, 0, 0, C5275i0.m6236a(30.0f));
                C44831o1 c44831o1M15782r5 = m15782r4();
                if (c44831o1M15782r5 != null && (linearLayout2 = c44831o1M15782r5.f100534b) != null) {
                    linearLayout2.addView(futureRecordFilterRecyclerView, new LinearLayout.LayoutParams(-1, -1, 1.0f));
                }
                this.f16715u0.add(futureRecordFilterRecyclerView);
            } else {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.asset_kumex_item_asset_account_filter_view, (ViewGroup) null);
                C44831o1 c44831o1M15782r6 = m15782r4();
                if (c44831o1M15782r6 != null && (linearLayout = c44831o1M15782r6.f100534b) != null) {
                    linearLayout.addView(viewInflate);
                }
                ((TextView) viewInflate.findViewById(R$id.tv_title)).setText(aVar.m55169c());
                RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.recycler_view);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager != null) {
                    gridLayoutManager.setSpanCount(aVar.m55168b().length > 3 ? 2 : 3);
                }
                FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b2 = aVar.m55168b();
                Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b2, "getList(...)");
                FutureRecordFilterAdapter futureRecordFilterAdapter = new FutureRecordFilterAdapter(interfaceC23033bArrM55168b2, i11 == 0 ? this.f16716v0 : null);
                recyclerView.setAdapter(futureRecordFilterAdapter);
                this.f16715u0.add(futureRecordFilterAdapter);
            }
            i11 = i12;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x4 */
    public final FutureRecordFilterDialogFragment m15786x4(@NotNull Function2<? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f16712r0 = callback;
        return this;
    }

    /* JADX INFO: renamed from: o4 */
    public static final String m15777o4(FutureRecordFilterDialogFragment futureRecordFilterDialogFragment) {
        String string;
        Bundle arguments = futureRecordFilterDialogFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("bizType");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: q4 */
    public static final String m15779q4(FutureRecordFilterDialogFragment futureRecordFilterDialogFragment) {
        String string;
        Bundle arguments = futureRecordFilterDialogFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("fundsType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "selfFunds");
    }
}
