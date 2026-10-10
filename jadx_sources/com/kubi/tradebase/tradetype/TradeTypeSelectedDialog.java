package com.kubi.tradebase.tradetype;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n30.C42730f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: TradeTypeSelectedDialog.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010)\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0\u001dJ\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020,H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseDialogTradeTypeSelectedBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseDialogTradeTypeSelectedBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tracePageId", "", "getTracePageId", "()Ljava/lang/String;", "tracePageId$delegate", "Lkotlin/Lazy;", "initSelectedType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getInitSelectedType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "initSelectedType$delegate", "displayOrderStringList", "Ljava/util/ArrayList;", "Lcom/kubi/tradebase/tradetype/TradeTypeItem;", "kotlin.jvm.PlatformType", "getDisplayOrderStringList", "()Ljava/util/ArrayList;", "displayOrderStringList$delegate", "onSelectedChange", "Lkotlin/Function1;", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setTypeSelectedChangeListener", "onStart", "isBottomSheet", "", "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTypeSelectedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypeSelectedDialog.kt\ncom/kubi/tradebase/tradetype/TradeTypeSelectedDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,191:1\n143#2,20:192\n774#3:212\n865#3:213\n866#3:215\n1563#3:216\n1634#3,3:217\n1#4:214\n37#5:220\n36#5,3:221\n*S KotlinDebug\n*F\n+ 1 TradeTypeSelectedDialog.kt\ncom/kubi/tradebase/tradetype/TradeTypeSelectedDialog\n*L\n27#1:192,20\n67#1:212\n67#1:213\n67#1:215\n72#1:216\n72#1:217,3\n72#1:220\n72#1:221,3\n*E\n"})
public final class TradeTypeSelectedDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f51649q0 = C45681e.m100799e(this, new Function1<TradeTypeSelectedDialog, C42730f>() { // from class: com.kubi.tradebase.tradetype.TradeTypeSelectedDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42730f invoke(@NotNull TradeTypeSelectedDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42730f.m93631a(fragment.requireView());
        }
    }, new Function1<C42730f, Unit>() { // from class: com.kubi.tradebase.tradetype.TradeTypeSelectedDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42730f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42730f c42730f) {
            invoke(c42730f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f51650r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeTypeSelectedDialog.m63379x4(this.f51675b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f51651s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeTypeSelectedDialog.m63376t4(this.f51676b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f51652t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeTypeSelectedDialog.m63375o4(this.f51677b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public Function1<? super TradeType, Unit> f51653u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f51648w0 = {Reflection.property1(new PropertyReference1Impl(TradeTypeSelectedDialog.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/BtradebaseDialogTradeTypeSelectedBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f51647v0 = new Companion(null);

    /* JADX INFO: compiled from: TradeTypeSelectedDialog.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J8\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion;", "", "<init>", "()V", "TRACK_PAGE_ID", "", "TRADE_TYPE_SELECTED", "TRADE_TYPE_LIST", "TRADE_TYPE_CONDITIONAL_MARKET", "newInstance", "Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;", "supportTradeTypeList", "", "initType", "pageId", "isConditionalMarket", "", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/tradebase/tradetype/TradeTypeSelectedDialog;", "Ljava/util/ArrayList;", "Lcom/kubi/tradebase/tradetype/TradeTypeItem;", "Lkotlin/collections/ArrayList;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTradeTypeSelectedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypeSelectedDialog.kt\ncom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n11228#2:192\n11563#2,3:193\n1#3:196\n*S KotlinDebug\n*F\n+ 1 TradeTypeSelectedDialog.kt\ncom/kubi/tradebase/tradetype/TradeTypeSelectedDialog$Companion\n*L\n154#1:192\n154#1:193,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TradeTypeSelectedDialog newInstance$default(Companion companion, String[] strArr, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return companion.newInstance(strArr, str, str2, z11);
        }

        @NotNull
        public final TradeTypeSelectedDialog newInstance(@NotNull ArrayList<TradeTypeItem> supportTradeTypeList, @NotNull String initType, @NotNull String pageId, boolean isConditionalMarket) {
            Intrinsics.checkNotNullParameter(supportTradeTypeList, "supportTradeTypeList");
            Intrinsics.checkNotNullParameter(initType, "initType");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("tradeTypeList", supportTradeTypeList);
            bundle.putString("tradeTypeSelected", initType);
            bundle.putString("TrackPageId", pageId);
            bundle.putBoolean("isConditionalMarket", isConditionalMarket);
            TradeTypeSelectedDialog tradeTypeSelectedDialog = new TradeTypeSelectedDialog();
            tradeTypeSelectedDialog.setArguments(bundle);
            return tradeTypeSelectedDialog;
        }

        public Companion() {
        }

        public static /* synthetic */ TradeTypeSelectedDialog newInstance$default(Companion companion, ArrayList arrayList, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return companion.newInstance((ArrayList<TradeTypeItem>) arrayList, str, str2, z11);
        }

        @NotNull
        public final TradeTypeSelectedDialog newInstance(@NotNull String[] supportTradeTypeList, @NotNull String initType, @NotNull String pageId, boolean isConditionalMarket) {
            Intrinsics.checkNotNullParameter(supportTradeTypeList, "supportTradeTypeList");
            Intrinsics.checkNotNullParameter(initType, "initType");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            ArrayList arrayList = new ArrayList(supportTradeTypeList.length);
            for (String str : supportTradeTypeList) {
                arrayList.add(new TradeTypeItem(str, null, 2, null));
            }
            return newInstance(new ArrayList<>(arrayList), initType, pageId, isConditionalMarket);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m63377u4(TradeTypeSelectedDialog tradeTypeSelectedDialog, TradeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Function1<? super TradeType, Unit> function1 = tradeTypeSelectedDialog.f51653u0;
        if (function1 != null) {
            function1.invoke(type);
        }
        tradeTypeSelectedDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m63378v4(List list, TradeTypeSelectedDialog tradeTypeSelectedDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TradeTypeBizDialogFragment.Companion companion = TradeTypeBizDialogFragment.f51635x0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TradeTypeItem) it2.next()).getTradeTypeKey());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        TradeType tradeTypeM63382r4 = tradeTypeSelectedDialog.m63382r4();
        String strM63383s4 = tradeTypeSelectedDialog.m63383s4();
        Bundle arguments = tradeTypeSelectedDialog.getArguments();
        TradeTypeBizDialogFragment tradeTypeBizDialogFragmentNewInstance$default = TradeTypeBizDialogFragment.Companion.newInstance$default(companion, strArr, tradeTypeM63382r4, strM63383s4, false, arguments != null ? RouteExKt.m56250h(arguments, "isConditionalMarket") : false, null, 40, null);
        FragmentManager childFragmentManager = tradeTypeSelectedDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        tradeTypeBizDialogFragmentNewInstance$default.show(childFragmentManager, "TradeTypeSelectedDialog");
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.btradebase_dialog_trade_type_selected, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ArrayList<TradeTypeItem> arrayListM63381q4 = m63381q4();
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = arrayListM63381q4.iterator();
        while (true) {
            TradeType tradeType = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TradeTypeItem tradeTypeItem = (TradeTypeItem) next;
            for (TradeType tradeType2 : TradeType.getEntries()) {
                if (Intrinsics.areEqual(tradeType2.getValue(), tradeTypeItem.getTradeTypeKey())) {
                    tradeType = tradeType2;
                    break;
                }
            }
            if (tradeType != null) {
                arrayList.add(next);
            }
        }
        C42730f c42730fM63380p4 = m63380p4();
        if (c42730fM63380p4 != null && (baseTextView = c42730fM63380p4.f94609c) != null) {
            ViewExtKt.m66575f(baseTextView, new Function1() { // from class: com.kubi.tradebase.tradetype.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeTypeSelectedDialog.m63378v4(arrayList, this, (View) obj);
                }
            });
        }
        C42730f c42730fM63380p5 = m63380p4();
        if (c42730fM63380p5 != null && (recyclerView2 = c42730fM63380p5.f94608b) != null) {
            recyclerView2.setItemAnimator(null);
        }
        C42730f c42730fM63380p6 = m63380p4();
        if (c42730fM63380p6 == null || (recyclerView = c42730fM63380p6.f94608b) == null) {
            return;
        }
        TradeTypeSelectedAdapter tradeTypeSelectedAdapter = new TradeTypeSelectedAdapter();
        tradeTypeSelectedAdapter.m63394l(arrayList, m63382r4(), new Function1() { // from class: com.kubi.tradebase.tradetype.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeTypeSelectedDialog.m63377u4(this.f51680b, (TradeType) obj);
            }
        });
        recyclerView.setAdapter(tradeTypeSelectedAdapter);
    }

    /* JADX INFO: renamed from: p4 */
    public final C42730f m63380p4() {
        return (C42730f) this.f51649q0.getValue(this, f51648w0[0]);
    }

    /* JADX INFO: renamed from: q4 */
    public final ArrayList<TradeTypeItem> m63381q4() {
        return (ArrayList) this.f51652t0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public final TradeType m63382r4() {
        return (TradeType) this.f51651s0.getValue();
    }

    /* JADX INFO: renamed from: s4 */
    public final String m63383s4() {
        return (String) this.f51650r0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: w4 */
    public final TradeTypeSelectedDialog m63384w4(@NotNull Function1<? super TradeType, Unit> onSelectedChange) {
        Intrinsics.checkNotNullParameter(onSelectedChange, "onSelectedChange");
        this.f51653u0 = onSelectedChange;
        return this;
    }

    /* JADX INFO: renamed from: o4 */
    public static final ArrayList m63375o4(TradeTypeSelectedDialog tradeTypeSelectedDialog) {
        ArrayList parcelableArrayList;
        Bundle arguments = tradeTypeSelectedDialog.getArguments();
        if (arguments != null && (parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "tradeTypeList", TradeTypeItem.class)) != null) {
            return parcelableArrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: t4 */
    public static final TradeType m63376t4(TradeTypeSelectedDialog tradeTypeSelectedDialog) {
        String string;
        TradeType next;
        Bundle arguments = tradeTypeSelectedDialog.getArguments();
        if (arguments != null && (string = arguments.getString("tradeTypeSelected")) != null) {
            Iterator<TradeType> it = TradeType.getEntries().iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(next.getValue(), string));
            TradeType tradeType = next;
            if (tradeType != null) {
                return tradeType;
            }
        }
        return TradeType.LIMIT;
    }

    /* JADX INFO: renamed from: x4 */
    public static final String m63379x4(TradeTypeSelectedDialog tradeTypeSelectedDialog) {
        String string;
        Bundle arguments = tradeTypeSelectedDialog.getArguments();
        if (arguments != null && (string = arguments.getString("TrackPageId")) != null) {
            return string;
        }
        return "TradeTypeSelectedDialog";
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        super.onStart();
        int iM6182d = C5267e0.m6182d();
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
        }
    }
}
