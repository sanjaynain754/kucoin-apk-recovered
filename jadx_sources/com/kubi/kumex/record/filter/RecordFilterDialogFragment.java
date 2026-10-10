package com.kubi.kumex.record.filter;

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
import androidx.activity.result.ActivityResultCaller;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36781j;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: RecordFilterDialogFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J.\u0010,\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR\u001b\u0010\u0018\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0019\u0010\u000fR\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/kumex/record/filter/RecordFilterDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogCommonFilterBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogCommonFilterBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isBottomSheet", "", "fundsType", "", "getFundsType", "()Ljava/lang/String;", "fundsType$delegate", "Lkotlin/Lazy;", "bizType", "getBizType", "bizType$delegate", "timeType", "getTimeType", "timeType$delegate", "sideType", "getSideType", "sideType$delegate", "resultCallBackList", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/record/filter/IFilterDialogCallBack;", "Lkotlin/collections/ArrayList;", "fundsTypeChangeClick", "Lio/reactivex/functions/Consumer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initFilterData2View", "filterData", "", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "isSameFundsType", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordFilterDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordFilterDialogFragment.kt\ncom/kubi/kumex/record/filter/RecordFilterDialogFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,169:1\n143#2,20:170\n1878#3,2:190\n1880#3:199\n3829#4:192\n4344#4,2:193\n37#5:195\n36#5,3:196\n*S KotlinDebug\n*F\n+ 1 RecordFilterDialogFragment.kt\ncom/kubi/kumex/record/filter/RecordFilterDialogFragment\n*L\n33#1:170,20\n129#1:190,2\n129#1:199\n134#1:192\n134#1:193,2\n137#1:195\n137#1:196,3\n*E\n"})
public final class RecordFilterDialogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f30247q0 = C45681e.m100799e(this, new Function1<RecordFilterDialogFragment, C36781j>() { // from class: com.kubi.kumex.record.filter.RecordFilterDialogFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36781j invoke(@NotNull RecordFilterDialogFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36781j.m82420a(fragment.requireView());
        }
    }, new Function1<C36781j, Unit>() { // from class: com.kubi.kumex.record.filter.RecordFilterDialogFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36781j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36781j c36781j) {
            invoke(c36781j);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f30248r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.filter.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecordFilterDialogFragment.m35771s4(this.f30267b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f30249s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.filter.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecordFilterDialogFragment.m35769q4(this.f30268b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f30250t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.filter.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecordFilterDialogFragment.m35761C4(this.f30269b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f30251u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.filter.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecordFilterDialogFragment.m35760B4(this.f30270b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final ArrayList<IFilterDialogCallBack> f30252v0 = new ArrayList<>();

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Consumer<String> f30253w0 = new Consumer() { // from class: com.kubi.kumex.record.filter.k
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            RecordFilterDialogFragment.m35770r4(this.f30271b, (String) obj);
        }
    };

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ KProperty<Object>[] f30246y0 = {Reflection.property1(new PropertyReference1Impl(RecordFilterDialogFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogCommonFilterBinding;", 0))};

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f30245x0 = new Companion(null);

    /* JADX INFO: compiled from: RecordFilterDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/record/filter/RecordFilterDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "sideType", "", "timeType", "fundsType", "bizType", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final DialogFragmentHelper newInstance(@NotNull String sideType, @NotNull String timeType, @NotNull String fundsType, @NotNull String bizType) {
            Intrinsics.checkNotNullParameter(sideType, "sideType");
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            Intrinsics.checkNotNullParameter(fundsType, "fundsType");
            Intrinsics.checkNotNullParameter(bizType, "bizType");
            RecordFilterDialogFragment recordFilterDialogFragment = new RecordFilterDialogFragment();
            recordFilterDialogFragment.setArguments(new C27051h().m66724h("fundsType", fundsType).m66724h("sideType", sideType).m66724h("timeType", timeType).m66724h("bizType", bizType).m66717a());
            return recordFilterDialogFragment;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m35770r4(RecordFilterDialogFragment recordFilterDialogFragment, String str) {
        AssetFilterHelper assetFilterHelper = AssetFilterHelper.f30236a;
        Context contextRequireContext = recordFilterDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String adapterResult = recordFilterDialogFragment.f30252v0.get(0).getAdapterResult();
        String adapterResult2 = recordFilterDialogFragment.f30252v0.get(1).getAdapterResult();
        Intrinsics.checkNotNull(str);
        recordFilterDialogFragment.m35774y4(assetFilterHelper.m35749h(contextRequireContext, adapterResult, adapterResult2, str, recordFilterDialogFragment.m35772u4(), Intrinsics.areEqual(recordFilterDialogFragment.m35773v4(), str)), Intrinsics.areEqual(recordFilterDialogFragment.m35773v4(), str), str, recordFilterDialogFragment.m35772u4());
    }

    /* JADX INFO: renamed from: u4 */
    private final String m35772u4() {
        return (String) this.f30249s0.getValue();
    }

    /* JADX INFO: renamed from: v4 */
    private final String m35773v4() {
        return (String) this.f30248r0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    private final void m35774y4(List<? extends C23034a.a> list, boolean z11, String str, String str2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        this.f30252v0.clear();
        C36781j c36781jM35776t4 = m35776t4();
        if (c36781jM35776t4 != null && (linearLayout3 = c36781jM35776t4.f80266b) != null) {
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
                AssetFilterHelper assetFilterHelper = AssetFilterHelper.f30236a;
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
                RecordFilterRecyclerView recordFilterRecyclerView = new RecordFilterRecyclerView(contextRequireContext, strM55169c, assetFilterHelper.m35755p(contextRequireContext2, (FilterType.InterfaceC23033b[]) arrayList.toArray(new FilterType.InterfaceC23033b[0]), z11, str2, str));
                recordFilterRecyclerView.setPadding(0, 0, 0, C5275i0.m6236a(30.0f));
                C36781j c36781jM35776t5 = m35776t4();
                if (c36781jM35776t5 != null && (linearLayout2 = c36781jM35776t5.f80266b) != null) {
                    linearLayout2.addView(recordFilterRecyclerView, new LinearLayout.LayoutParams(-1, -1, 1.0f));
                }
                this.f30252v0.add(recordFilterRecyclerView);
            } else {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.bkumex_item_asset_account_filter_view, (ViewGroup) null);
                C36781j c36781jM35776t6 = m35776t4();
                if (c36781jM35776t6 != null && (linearLayout = c36781jM35776t6.f80266b) != null) {
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
                RecordFilterAdapter recordFilterAdapter = new RecordFilterAdapter(interfaceC23033bArrM55168b2, i11 == 2 ? this.f30253w0 : null);
                recyclerView.setAdapter(recordFilterAdapter);
                this.f30252v0.add(recordFilterAdapter);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m35775z4(RecordFilterDialogFragment recordFilterDialogFragment) {
        AssetFilterHelper assetFilterHelper = AssetFilterHelper.f30236a;
        Context contextRequireContext = recordFilterDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recordFilterDialogFragment.m35774y4(assetFilterHelper.m35749h(contextRequireContext, "", "ONE_MONTH", "selfFunds", "", true), true, "selfFunds", "");
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_common_filter, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcSecondaryButton kcSecondaryButton;
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
        C36781j c36781jM35776t4 = m35776t4();
        if (c36781jM35776t4 != null && (kcSecondaryButton = c36781jM35776t4.f80268d) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.kumex.record.filter.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecordFilterDialogFragment.m35775z4(this.f30272b);
                }
            }, 1, null);
        }
        C36781j c36781jM35776t5 = m35776t4();
        if (c36781jM35776t5 != null && (kcPrimaryButton = c36781jM35776t5.f80267c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.kumex.record.filter.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecordFilterDialogFragment.m35759A4(this.f30273b);
                }
            }, 1, null);
        }
        AssetFilterHelper assetFilterHelper = AssetFilterHelper.f30236a;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        m35774y4(assetFilterHelper.m35749h(contextRequireContext, m35777w4(), m35778x4(), m35773v4(), m35772u4(), true), true, m35773v4(), m35772u4());
    }

    /* JADX INFO: renamed from: t4 */
    public final C36781j m35776t4() {
        return (C36781j) this.f30247q0.getValue(this, f30246y0[0]);
    }

    /* JADX INFO: renamed from: w4 */
    public final String m35777w4() {
        return (String) this.f30251u0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final String m35778x4() {
        return (String) this.f30250t0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m35759A4(RecordFilterDialogFragment recordFilterDialogFragment) {
        IFilterDialogCallBack iFilterDialogCallBack;
        ActivityResultCaller parentFragment = recordFilterDialogFragment.getParentFragment();
        if (parentFragment instanceof IFilterDialogCallBack) {
            iFilterDialogCallBack = (IFilterDialogCallBack) parentFragment;
        } else {
            iFilterDialogCallBack = null;
        }
        if (iFilterDialogCallBack != null) {
            iFilterDialogCallBack.mo35200j2(recordFilterDialogFragment.f30252v0.get(0).getAdapterResult(), recordFilterDialogFragment.f30252v0.get(1).getAdapterResult(), recordFilterDialogFragment.f30252v0.get(2).getAdapterResult(), recordFilterDialogFragment.f30252v0.get(3).getAdapterResult());
        }
        recordFilterDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final String m35760B4(RecordFilterDialogFragment recordFilterDialogFragment) {
        String string;
        Bundle arguments = recordFilterDialogFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("sideType");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: C4 */
    public static final String m35761C4(RecordFilterDialogFragment recordFilterDialogFragment) {
        String string;
        Bundle arguments = recordFilterDialogFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("timeType");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: q4 */
    public static final String m35769q4(RecordFilterDialogFragment recordFilterDialogFragment) {
        String string;
        Bundle arguments = recordFilterDialogFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("bizType");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: s4 */
    public static final String m35771s4(RecordFilterDialogFragment recordFilterDialogFragment) {
        String string;
        Bundle arguments = recordFilterDialogFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("fundsType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "selfFunds");
    }
}
