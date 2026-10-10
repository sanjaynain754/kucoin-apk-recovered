package com.kubi.futures.trade.position;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.futures.trade.position.data.PositionSortOrder;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36860w0;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p640ti.PositionSortType;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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

/* JADX INFO: compiled from: PositionSortDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010&\u001a\u00020 H\u0016J>\u0010'\u001a\u00020\u001526\u0010(\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR>\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionSortDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "lastSortKey", "", "getLastSortKey", "()Ljava/lang/String;", "lastSortKey$delegate", "Lkotlin/Lazy;", "lastSortOrder", "Lcom/kubi/futures/trade/position/data/PositionSortOrder;", "getLastSortOrder", "()Lcom/kubi/futures/trade/position/data/PositionSortOrder;", "lastSortOrder$delegate", "onConfirmCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "sortKey", "order", "", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogPositionSortBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogPositionSortBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "sortList", "", "Lcom/kubi/futures/trade/position/data/PositionSortType;", "selectedPos", "", "getSelectedPos", "()I", "setSelectedPos", "(I)V", "currentSortOrder", "initType", "setConfirmCallback", TUIConstants.TUIChat.CALL_BACK, "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionSortDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionSortDialog.kt\ncom/kubi/futures/trade/position/PositionSortDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n143#2,20:339\n360#3,7:359\n1#4:366\n*S KotlinDebug\n*F\n+ 1 PositionSortDialog.kt\ncom/kubi/futures/trade/position/PositionSortDialog\n*L\n63#1:339,20\n176#1:359,7\n*E\n"})
public final class PositionSortDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    public Function2<? super String, ? super PositionSortOrder, Unit> f24106s0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final List<PositionSortType> f24108u0;

    /* JADX INFO: renamed from: v0 */
    public int f24109v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public PositionSortOrder f24110w0;

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ KProperty<Object>[] f24103y0 = {Reflection.property1(new PropertyReference1Impl(PositionSortDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionSortBinding;", 0))};

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f24102x0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f24104q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.o3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PositionSortDialog.m27642A4(this.f24232b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24105r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.p3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PositionSortDialog.m27643B4(this.f24238b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f24107t0 = C45681e.m100799e(this, new Function1<PositionSortDialog, C36860w0>() { // from class: com.kubi.futures.trade.position.PositionSortDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36860w0 invoke(@NotNull PositionSortDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36860w0.m82585a(fragment.requireView());
        }
    }, new Function1<C36860w0, Unit>() { // from class: com.kubi.futures.trade.position.PositionSortDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36860w0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36860w0 c36860w0) {
            invoke(c36860w0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: PositionSortDialog.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00050\f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionSortDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "lastSortKey", "", "lastSortOrderName", "onConfirmCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "sortKey", "Lcom/kubi/futures/trade/position/data/PositionSortOrder;", "order", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull String lastSortKey, @Nullable String lastSortOrderName, @NotNull Function2<? super String, ? super PositionSortOrder, Unit> onConfirmCallback) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(lastSortKey, "lastSortKey");
            Intrinsics.checkNotNullParameter(onConfirmCallback, "onConfirmCallback");
            PositionSortDialog positionSortDialog = new PositionSortDialog();
            Bundle bundle = new Bundle();
            bundle.putString("data", lastSortKey);
            bundle.putString("data_1", lastSortOrderName);
            positionSortDialog.setArguments(bundle);
            positionSortDialog.m27670G4(onConfirmCallback);
            positionSortDialog.show(manager, "PositionSortDialog");
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m27646E4(PositionSortDialog positionSortDialog, SortTypeAdapter sortTypeAdapter) {
        positionSortDialog.f24109v0 = 0;
        PositionSortOrder defaultOrder = positionSortDialog.f24108u0.get(0).getDefaultOrder();
        positionSortDialog.f24110w0 = defaultOrder;
        sortTypeAdapter.m27757m(positionSortDialog.f24109v0, defaultOrder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m27644C4(PositionSortDialog positionSortDialog, C36860w0 c36860w0, int i11) {
        if (positionSortDialog.f24109v0 == i11) {
            PositionSortOrder positionSortOrder = positionSortDialog.f24110w0;
            PositionSortOrder positionSortOrder2 = PositionSortOrder.ASC;
            if (positionSortOrder == positionSortOrder2) {
                positionSortOrder2 = PositionSortOrder.DESC;
            }
            positionSortDialog.f24110w0 = positionSortOrder2;
            RecyclerView.Adapter adapter = c36860w0.f81273b.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.position.SortTypeAdapter");
            ((SortTypeAdapter) adapter).m27758n(positionSortDialog.f24110w0);
        } else {
            positionSortDialog.f24109v0 = i11;
            positionSortDialog.f24110w0 = positionSortDialog.f24108u0.get(i11).getDefaultOrder();
            RecyclerView.Adapter adapter2 = c36860w0.f81273b.getAdapter();
            Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type com.kubi.futures.trade.position.SortTypeAdapter");
            ((SortTypeAdapter) adapter2).m27759o(positionSortDialog.f24109v0, positionSortDialog.f24110w0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m27645D4(PositionSortDialog positionSortDialog, C36860w0 c36860w0, int i11) {
        if (positionSortDialog.f24109v0 != i11) {
            positionSortDialog.f24109v0 = i11;
            positionSortDialog.f24110w0 = positionSortDialog.f24108u0.get(i11).getDefaultOrder();
            RecyclerView.Adapter adapter = c36860w0.f81273b.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.position.SortTypeAdapter");
            ((SortTypeAdapter) adapter).m27759o(positionSortDialog.f24109v0, positionSortDialog.f24110w0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m27647F4(PositionSortDialog positionSortDialog) {
        String key = positionSortDialog.f24108u0.get(positionSortDialog.f24109v0).getKey();
        Function2<? super String, ? super PositionSortOrder, Unit> function2 = positionSortDialog.f24106s0;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onConfirmCallback");
            function2 = null;
        }
        function2.invoke(key, positionSortDialog.f24110w0);
        positionSortDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final String m27648H4(PositionSortOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "";
    }

    /* JADX INFO: renamed from: I4 */
    public static final String m27649I4(PositionSortOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it == PositionSortOrder.ASC ? C27017c.f54310a.m66516f(R$string.sort_alphabet_desc, new Object[0]) : C27017c.f54310a.m66516f(R$string.sort_alphabet_asc, new Object[0]);
    }

    /* JADX INFO: renamed from: J4 */
    public static final String m27650J4(PositionSortOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it == PositionSortOrder.ASC ? C27017c.f54310a.m66516f(R$string.sort_by_asc, new Object[0]) : C27017c.f54310a.m66516f(R$string.sort_by_desc, new Object[0]);
    }

    /* JADX INFO: renamed from: K4 */
    public static final String m27651K4(PositionSortOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it == PositionSortOrder.ASC ? C27017c.f54310a.m66516f(R$string.sort_by_asc, new Object[0]) : C27017c.f54310a.m66516f(R$string.sort_by_desc, new Object[0]);
    }

    /* JADX INFO: renamed from: L4 */
    public static final String m27652L4(PositionSortOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it == PositionSortOrder.ASC ? C27017c.f54310a.m66516f(R$string.sort_by_asc, new Object[0]) : C27017c.f54310a.m66516f(R$string.sort_by_desc, new Object[0]);
    }

    /* JADX INFO: renamed from: M4 */
    public static final String m27653M4(PositionSortOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it == PositionSortOrder.ASC ? C27017c.f54310a.m66516f(R$string.sort_by_asc, new Object[0]) : C27017c.f54310a.m66516f(R$string.sort_by_desc, new Object[0]);
    }

    /* JADX INFO: renamed from: N4 */
    public static final String m27654N4(PositionSortOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it == PositionSortOrder.ASC ? C27017c.f54310a.m66516f(R$string.sort_by_asc, new Object[0]) : C27017c.f54310a.m66516f(R$string.sort_by_desc, new Object[0]);
    }

    /* JADX INFO: renamed from: O4 */
    public static final String m27655O4(PositionSortOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it == PositionSortOrder.ASC ? C27017c.f54310a.m66516f(R$string.sort_by_asc, new Object[0]) : C27017c.f54310a.m66516f(R$string.sort_by_desc, new Object[0]);
    }

    /* JADX INFO: renamed from: G4 */
    public final void m27670G4(@NotNull Function2<? super String, ? super PositionSortOrder, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f24106s0 = callback;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return -11;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_position_sort, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36860w0 c36860w0M27673z4 = m27673z4();
        if (c36860w0M27673z4 == null) {
            return;
        }
        Iterator<PositionSortType> it = this.f24108u0.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getKey(), m27671x4())) {
                break;
            } else {
                i11++;
            }
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        this.f24109v0 = numValueOf != null ? numValueOf.intValue() : 0;
        PositionSortOrder positionSortOrderM27672y4 = m27672y4();
        if (positionSortOrderM27672y4 == null) {
            positionSortOrderM27672y4 = this.f24108u0.get(this.f24109v0).getDefaultOrder();
        }
        PositionSortOrder positionSortOrder = positionSortOrderM27672y4;
        this.f24110w0 = positionSortOrder;
        final SortTypeAdapter sortTypeAdapter = new SortTypeAdapter(this.f24108u0, this.f24109v0, positionSortOrder, new Function1() { // from class: com.kubi.futures.trade.position.g3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27644C4(this.f24174b, c36860w0M27673z4, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.kubi.futures.trade.position.l3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27645D4(this.f24206b, c36860w0M27673z4, ((Integer) obj).intValue());
            }
        });
        c36860w0M27673z4.f81273b.setLayoutManager(new LinearLayoutManager(view.getContext()));
        c36860w0M27673z4.f81273b.setAdapter(sortTypeAdapter);
        KcSecondaryButton tvReset = c36860w0M27673z4.f81275d;
        Intrinsics.checkNotNullExpressionValue(tvReset, "tvReset");
        C27046k.m66711z(tvReset, 0L, new Function0() { // from class: com.kubi.futures.trade.position.m3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionSortDialog.m27646E4(this.f24213b, sortTypeAdapter);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c36860w0M27673z4.f81274c;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.position.n3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionSortDialog.m27647F4(this.f24222b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: x4 */
    public final String m27671x4() {
        return (String) this.f24104q0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final PositionSortOrder m27672y4() {
        return (PositionSortOrder) this.f24105r0.getValue();
    }

    /* JADX INFO: renamed from: z4 */
    public final C36860w0 m27673z4() {
        return (C36860w0) this.f24107t0.getValue(this, f24103y0[0]);
    }

    public PositionSortDialog() {
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.kc_trade_funds_default_sort, new Object[0]);
        Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.q3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27648H4((PositionSortOrder) obj);
            }
        };
        PositionSortOrder positionSortOrder = PositionSortOrder.DESC;
        this.f24108u0 = CollectionsKt.listOf((Object[]) new PositionSortType[]{new PositionSortType(strM66516f, "POSITION_DEFAULT_SORT", false, function1, positionSortOrder), new PositionSortType(c27017c.m66516f(R$string.kumex_contracts_name, new Object[0]), "POSITION_CONTRACT_NAME", true, new Function1() { // from class: com.kubi.futures.trade.position.r3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27649I4((PositionSortOrder) obj);
            }
        }, positionSortOrder), new PositionSortType(c27017c.m66516f(R$string.kumex_position_qty_unit_value, new Object[0]), "POSITION_QTY_VALUE_SORT", true, new Function1() { // from class: com.kubi.futures.trade.position.s3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27650J4((PositionSortOrder) obj);
            }
        }, positionSortOrder), new PositionSortType(c27017c.m66516f(R$string.unrealised_pnl, new Object[0]), "POSITION_UNREALIZED_SORT", true, new Function1() { // from class: com.kubi.futures.trade.position.t3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27651K4((PositionSortOrder) obj);
            }
        }, positionSortOrder), new PositionSortType(c27017c.m66516f(R$string.realised_pnl, new Object[0]), "POSITION_REALIZED_SORT", true, new Function1() { // from class: com.kubi.futures.trade.position.h3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27652L4((PositionSortOrder) obj);
            }
        }, positionSortOrder), new PositionSortType(c27017c.m66516f(R$string.unify_funds_hold_equity, new Object[0]), "POSITION_MARGIN_SORT", true, new Function1() { // from class: com.kubi.futures.trade.position.i3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27653M4((PositionSortOrder) obj);
            }
        }, positionSortOrder), new PositionSortType(c27017c.m66516f(R$string.kumex_pnl_rate_in_position, new Object[0]), "POSITION_ROI_SORT", true, new Function1() { // from class: com.kubi.futures.trade.position.j3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27654N4((PositionSortOrder) obj);
            }
        }, positionSortOrder), new PositionSortType(c27017c.m66516f(R$string.kumex_position_risk_ratio, new Object[0]), "POSITION_RISK_SORT", true, new Function1() { // from class: com.kubi.futures.trade.position.k3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionSortDialog.m27655O4((PositionSortOrder) obj);
            }
        }, positionSortOrder)});
        this.f24110w0 = positionSortOrder;
    }

    /* JADX INFO: renamed from: A4 */
    public static final String m27642A4(PositionSortDialog positionSortDialog) {
        Bundle arguments = positionSortDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public static final PositionSortOrder m27643B4(PositionSortDialog positionSortDialog) {
        String string;
        Bundle arguments = positionSortDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("data_1");
        } else {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return PositionSortOrder.valueOf(string);
        } catch (Exception unused) {
            return null;
        }
    }
}
