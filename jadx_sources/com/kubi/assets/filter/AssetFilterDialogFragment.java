package com.kubi.assets.filter;

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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
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

/* JADX INFO: compiled from: AssetFilterDialogFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010'\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0)H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/assets/filter/AssetFilterDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/DialogCommonFilterBinding;", "getBinding", "()Lcom/kubi/assets/databinding/DialogCommonFilterBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isBottomSheet", "", "initParams", "", "Lcom/kubi/assets/filter/ParcelizePair;", "getInitParams", "()Ljava/util/List;", "initParams$delegate", "Lkotlin/Lazy;", "fromType", "", "getFromType", "()Ljava/lang/String;", "fromType$delegate", "resultCallBackList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/filter/IFilterDialogCallBack;", "Lkotlin/collections/ArrayList;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initFilterData", "filterData", "", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "displayParams", "getResultsList", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFilterDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFilterDialogFragment.kt\ncom/kubi/assets/filter/AssetFilterDialogFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n143#2,20:183\n1869#3:203\n1870#3:211\n1563#3:212\n1634#3,3:213\n1563#3:216\n1634#3,3:217\n1878#3,3:220\n3829#4:204\n4344#4,2:205\n37#5:207\n36#5,3:208\n1#6:223\n*S KotlinDebug\n*F\n+ 1 AssetFilterDialogFragment.kt\ncom/kubi/assets/filter/AssetFilterDialogFragment\n*L\n31#1:183,20\n124#1:203\n124#1:211\n174#1:212\n174#1:213,3\n175#1:216\n175#1:217,3\n177#1:220,3\n132#1:204\n132#1:205,2\n135#1:207\n135#1:208,3\n*E\n"})
public final class AssetFilterDialogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f17331q0 = C45681e.m100799e(this, new Function1<AssetFilterDialogFragment, C44788i3>() { // from class: com.kubi.assets.filter.AssetFilterDialogFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44788i3 invoke(@NotNull AssetFilterDialogFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44788i3.m99094a(fragment.requireView());
        }
    }, new Function1<C44788i3, Unit>() { // from class: com.kubi.assets.filter.AssetFilterDialogFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44788i3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44788i3 c44788i3) {
            invoke(c44788i3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f17332r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.filter.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFilterDialogFragment.m16569t4(this.f17362b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f17333s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.filter.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFilterDialogFragment.m16564n4(this.f17363b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final ArrayList<IFilterDialogCallBack> f17334t0 = new ArrayList<>();

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f17330v0 = {Reflection.property1(new PropertyReference1Impl(AssetFilterDialogFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/DialogCommonFilterBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f17329u0 = new Companion(null);

    /* JADX INFO: compiled from: AssetFilterDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/filter/AssetFilterDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "fromType", "", "initData", "Ljava/util/ArrayList;", "Lcom/kubi/assets/filter/ParcelizePair;", "Lkotlin/collections/ArrayList;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final DialogFragmentHelper newInstance(@NotNull String fromType, @NotNull ArrayList<ParcelizePair> initData) {
            Intrinsics.checkNotNullParameter(fromType, "fromType");
            Intrinsics.checkNotNullParameter(initData, "initData");
            AssetFilterDialogFragment assetFilterDialogFragment = new AssetFilterDialogFragment();
            assetFilterDialogFragment.setArguments(new C27051h().m66724h("fromType", fromType).m66722f("initParams", initData).m66717a());
            return assetFilterDialogFragment;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: o4 */
    private final C44788i3 m16565o4() {
        return (C44788i3) this.f17331q0.getValue(this, f17330v0[0]);
    }

    /* JADX INFO: renamed from: p4 */
    private final String m16566p4() {
        return (String) this.f17333s0.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    private final List<ParcelizePair> m16567q4() {
        return (List) this.f17332r0.getValue();
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
        C44788i3 c44788i3M16565o4 = m16565o4();
        if (c44788i3M16565o4 != null && (kcSecondaryButton = c44788i3M16565o4.f100131d) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.filter.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetFilterDialogFragment.m16570u4(this.f17360b);
                }
            }, 1, null);
        }
        C44788i3 c44788i3M16565o5 = m16565o4();
        if (c44788i3M16565o5 != null && (kcPrimaryButton = c44788i3M16565o5.f100130c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.filter.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetFilterDialogFragment.m16571v4(this.f17361b);
                }
            }, 1, null);
        }
        m16572s4(AssetFilterHelper.f17335a.m16582j(m16566p4(), m16567q4()), m16567q4());
    }

    /* JADX INFO: renamed from: s4 */
    public final void m16572s4(List<? extends C23034a.a> list, List<ParcelizePair> list2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        this.f17334t0.clear();
        C44788i3 c44788i3M16565o4 = m16565o4();
        if (c44788i3M16565o4 != null && (linearLayout3 = c44788i3M16565o4.f100129b) != null) {
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
                String strM16566p4 = m16566p4();
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
                AssetFilterRecyclerView assetFilterRecyclerView = new AssetFilterRecyclerView(contextRequireContext, strM55169c, assetFilterHelper.m16586n(contextRequireContext2, strM16566p4, interfaceC23033bArr, list2, filterKey));
                C44788i3 c44788i3M16565o5 = m16565o4();
                if (c44788i3M16565o5 != null && (linearLayout = c44788i3M16565o5.f100129b) != null) {
                    linearLayout.addView(assetFilterRecyclerView, new LinearLayout.LayoutParams(-1, -1, 1.0f));
                }
                this.f17334t0.add(assetFilterRecyclerView);
            } else {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.item_asset_account_filter_view, (ViewGroup) null);
                C44788i3 c44788i3M16565o6 = m16565o4();
                if (c44788i3M16565o6 != null && (linearLayout2 = c44788i3M16565o6.f100129b) != null) {
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
                this.f17334t0.add(assetFilterAdapter);
            }
        }
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m16564n4(AssetFilterDialogFragment assetFilterDialogFragment) {
        Bundle arguments = assetFilterDialogFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("fromType");
        }
        return null;
    }

    /* JADX INFO: renamed from: r4 */
    private final List<ParcelizePair> m16568r4() {
        List<ParcelizePair> listM16567q4 = m16567q4();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16567q4, 10));
        Iterator<T> it = listM16567q4.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParcelizePair) it.next()).getKey());
        }
        ArrayList<IFilterDialogCallBack> arrayList2 = this.f17334t0;
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

    /* JADX INFO: renamed from: t4 */
    public static final List m16569t4(AssetFilterDialogFragment assetFilterDialogFragment) {
        ArrayList parcelableArrayList;
        Bundle arguments = assetFilterDialogFragment.getArguments();
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList("initParams");
        } else {
            parcelableArrayList = null;
        }
        return C27024b.m66559b(parcelableArrayList);
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m16570u4(AssetFilterDialogFragment assetFilterDialogFragment) {
        Object obj;
        Object next;
        Iterator<T> it = assetFilterDialogFragment.m16567q4().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((ParcelizePair) next).getKey(), "tag"));
        ParcelizePair parcelizePair = (ParcelizePair) next;
        for (Object obj2 : assetFilterDialogFragment.m16567q4()) {
            if (Intrinsics.areEqual(((ParcelizePair) obj2).getKey(), FirebaseAnalytics.Param.CURRENCY)) {
                obj = obj2;
                break;
            }
        }
        ParcelizePair parcelizePair2 = (ParcelizePair) obj;
        ArrayList arrayList = new ArrayList();
        if (parcelizePair2 != null) {
            arrayList.add(new ParcelizePair(FirebaseAnalytics.Param.CURRENCY, ""));
        }
        arrayList.add(new ParcelizePair("direction", ""));
        arrayList.add(new ParcelizePair("time", "ONE_MONTH"));
        arrayList.add(new ParcelizePair("bizType", ""));
        if (parcelizePair != null) {
            arrayList.add(parcelizePair);
        }
        assetFilterDialogFragment.m16572s4(AssetFilterHelper.f17335a.m16582j(assetFilterDialogFragment.m16566p4(), arrayList), arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m16571v4(AssetFilterDialogFragment assetFilterDialogFragment) {
        IFilterDialogCallBack iFilterDialogCallBack;
        ActivityResultCaller parentFragment = assetFilterDialogFragment.getParentFragment();
        if (parentFragment instanceof IFilterDialogCallBack) {
            iFilterDialogCallBack = (IFilterDialogCallBack) parentFragment;
        } else {
            iFilterDialogCallBack = null;
        }
        if (iFilterDialogCallBack != null) {
            iFilterDialogCallBack.mo15926z(assetFilterDialogFragment.m16568r4());
        }
        assetFilterDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
