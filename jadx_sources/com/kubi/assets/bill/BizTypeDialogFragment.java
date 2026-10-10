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
import com.kubi.assets.filter.AssetFilterAdapter;
import com.kubi.assets.filter.AssetFilterHelper;
import com.kubi.assets.filter.AssetFilterRecyclerView;
import com.kubi.assets.filter.IFilterDialogCallBack;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44788i3;
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

/* JADX INFO: compiled from: BizTypeDialogFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J.\u0010*\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130,H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/bill/BizTypeDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/DialogCommonFilterBinding;", "getBinding", "()Lcom/kubi/assets/databinding/DialogCommonFilterBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "", "setCallBack", "isBottomSheet", "", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "getInitParams", "()Ljava/util/List;", "initParams$delegate", "Lkotlin/Lazy;", "fromType", "getFromType", "()Ljava/lang/String;", "fromType$delegate", "resultCallBackList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/filter/IFilterDialogCallBack;", "Lkotlin/collections/ArrayList;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initFilterData", "filterData", "", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "displayParams", "getResultsList", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBizTypeDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizTypeDialogFragment.kt\ncom/kubi/assets/bill/BizTypeDialogFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n143#2,20:197\n1869#3:217\n1870#3:225\n1563#3:226\n1634#3,3:227\n1563#3:230\n1634#3,3:231\n1878#3,3:234\n3829#4:218\n4344#4,2:219\n37#5:221\n36#5,3:222\n1#6:237\n*S KotlinDebug\n*F\n+ 1 BizTypeDialogFragment.kt\ncom/kubi/assets/bill/BizTypeDialogFragment\n*L\n37#1:197,20\n138#1:217\n138#1:225\n188#1:226\n188#1:227,3\n189#1:230\n189#1:231,3\n191#1:234,3\n146#1:218\n146#1:219,2\n149#1:221\n149#1:222,3\n*E\n"})
public final class BizTypeDialogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function1<? super String, Unit> f16684r0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f16682w0 = {Reflection.property1(new PropertyReference1Impl(BizTypeDialogFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/DialogCommonFilterBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f16681v0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16683q0 = C45681e.m100799e(this, new Function1<BizTypeDialogFragment, C44788i3>() { // from class: com.kubi.assets.bill.BizTypeDialogFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44788i3 invoke(@NotNull BizTypeDialogFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44788i3.m99094a(fragment.requireView());
        }
    }, new Function1<C44788i3, Unit>() { // from class: com.kubi.assets.bill.BizTypeDialogFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44788i3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44788i3 c44788i3) {
            invoke(c44788i3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f16685s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.j1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BizTypeDialogFragment.m15703t4(this.f16772b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f16686t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.k1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BizTypeDialogFragment.m15701n4(this.f16775b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final ArrayList<IFilterDialogCallBack> f16687u0 = new ArrayList<>();

    /* JADX INFO: compiled from: BizTypeDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/bill/BizTypeDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/bill/BizTypeDialogFragment;", "fromType", "", "initData", "Ljava/util/ArrayList;", "Lcom/kubi/assets/filter/ParcelizePair;", "Lkotlin/collections/ArrayList;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final BizTypeDialogFragment newInstance(@NotNull String fromType, @NotNull ArrayList<ParcelizePair> initData) {
            Intrinsics.checkNotNullParameter(fromType, "fromType");
            Intrinsics.checkNotNullParameter(initData, "initData");
            BizTypeDialogFragment bizTypeDialogFragment = new BizTypeDialogFragment();
            bizTypeDialogFragment.setArguments(new C27051h().m66724h("fromType", fromType).m66722f("initParams", initData).m66717a());
            return bizTypeDialogFragment;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: p4 */
    private final String m15702p4() {
        return (String) this.f16686t0.getValue();
    }

    /* JADX INFO: renamed from: o4 */
    public final C44788i3 m15706o4() {
        return (C44788i3) this.f16683q0.getValue(this, f16682w0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_common_filter, container);
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
        C44788i3 c44788i3M15706o4 = m15706o4();
        if (c44788i3M15706o4 != null && (kcSecondaryButton = c44788i3M15706o4.f100131d) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.bill.l1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BizTypeDialogFragment.m15704u4(this.f16778b);
                }
            }, 1, null);
        }
        C44788i3 c44788i3M15706o5 = m15706o4();
        if (c44788i3M15706o5 != null && (kcPrimaryButton = c44788i3M15706o5.f100130c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.bill.m1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BizTypeDialogFragment.m15705v4(this.f16781b);
                }
            }, 1, null);
        }
        m15709s4(m15702p4(), BizTypeFilterHelper.f16688a.m15718h(m15702p4(), m15707q4()), m15707q4());
    }

    /* JADX INFO: renamed from: q4 */
    public final List<ParcelizePair> m15707q4() {
        return (List) this.f16685s0.getValue();
    }

    /* JADX INFO: renamed from: s4 */
    public final void m15709s4(String str, List<? extends C23034a.a> list, List<ParcelizePair> list2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        this.f16687u0.clear();
        C44788i3 c44788i3M15706o4 = m15706o4();
        if (c44788i3M15706o4 != null && (linearLayout3 = c44788i3M15706o4.f100129b) != null) {
            linearLayout3.removeAllViews();
        }
        for (C23034a.a aVar : list) {
            if (aVar.m55168b().length > 8) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                String strM55169c = aVar.m55169c();
                Intrinsics.checkNotNullExpressionValue(strM55169c, "getName(...)");
                AssetFilterHelper assetFilterHelper = AssetFilterHelper.f17335a;
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
                FilterType.InterfaceC23033b[] interfaceC23033bArr = (FilterType.InterfaceC23033b[]) arrayList.toArray(new FilterType.InterfaceC23033b[0]);
                String filterKey = aVar.f44552a;
                Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
                AssetFilterRecyclerView assetFilterRecyclerView = new AssetFilterRecyclerView(contextRequireContext, strM55169c, assetFilterHelper.m16586n(contextRequireContext2, str, interfaceC23033bArr, list2, filterKey));
                C44788i3 c44788i3M15706o5 = m15706o4();
                if (c44788i3M15706o5 != null && (linearLayout = c44788i3M15706o5.f100129b) != null) {
                    linearLayout.addView(assetFilterRecyclerView, new LinearLayout.LayoutParams(-1, -1, 1.0f));
                }
                this.f16687u0.add(assetFilterRecyclerView);
            } else {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.item_asset_account_filter_view, (ViewGroup) null);
                C44788i3 c44788i3M15706o6 = m15706o4();
                if (c44788i3M15706o6 != null && (linearLayout2 = c44788i3M15706o6.f100129b) != null) {
                    linearLayout2.addView(viewInflate);
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
                AssetFilterAdapter assetFilterAdapter = new AssetFilterAdapter(interfaceC23033bArrM55168b2);
                recyclerView.setAdapter(assetFilterAdapter);
                this.f16687u0.add(assetFilterAdapter);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: w4 */
    public final BizTypeDialogFragment m15710w4(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f16684r0 = callback;
        return this;
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m15701n4(BizTypeDialogFragment bizTypeDialogFragment) {
        Bundle arguments = bizTypeDialogFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("fromType");
        }
        return null;
    }

    /* JADX INFO: renamed from: t4 */
    public static final List m15703t4(BizTypeDialogFragment bizTypeDialogFragment) {
        ArrayList parcelableArrayList;
        Bundle arguments = bizTypeDialogFragment.getArguments();
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList("initParams");
        } else {
            parcelableArrayList = null;
        }
        return C27024b.m66559b(parcelableArrayList);
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m15704u4(BizTypeDialogFragment bizTypeDialogFragment) {
        Object next;
        Iterator<T> it = bizTypeDialogFragment.m15707q4().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((ParcelizePair) next).getKey(), "tag"));
        ParcelizePair parcelizePair = (ParcelizePair) next;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ParcelizePair("bizType", ""));
        if (parcelizePair != null) {
            arrayList.add(parcelizePair);
        }
        bizTypeDialogFragment.m15709s4(bizTypeDialogFragment.m15702p4(), BizTypeFilterHelper.f16688a.m15718h(bizTypeDialogFragment.m15702p4(), arrayList), arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m15705v4(BizTypeDialogFragment bizTypeDialogFragment) {
        String value;
        Object next;
        Iterator<T> it = bizTypeDialogFragment.m15708r4().iterator();
        do {
            value = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((ParcelizePair) next).getKey(), "bizType"));
        ParcelizePair parcelizePair = (ParcelizePair) next;
        if (parcelizePair != null) {
            value = parcelizePair.getValue();
        }
        String strM66668h = C27041f.m66668h(value);
        Function1<? super String, Unit> function1 = bizTypeDialogFragment.f16684r0;
        if (function1 != null) {
            function1.invoke(strM66668h);
        }
        bizTypeDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public final List<ParcelizePair> m15708r4() {
        List<ParcelizePair> listM15707q4 = m15707q4();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15707q4, 10));
        Iterator<T> it = listM15707q4.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParcelizePair) it.next()).getKey());
        }
        ArrayList<IFilterDialogCallBack> arrayList2 = this.f16687u0;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((IFilterDialogCallBack) it2.next()).getAdapterResult());
        }
        ArrayList arrayList4 = new ArrayList();
        int i11 = 0;
        for (Object obj : arrayList3) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList4.add(new ParcelizePair((String) arrayList.get(i11), (String) obj));
            i11 = i12;
        }
        return arrayList4;
    }
}
