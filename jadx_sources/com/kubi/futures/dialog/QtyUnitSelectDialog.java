package com.kubi.futures.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36735b1;
import fm.C37567b;
import fm.C37571f;
import java.math.BigDecimal;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: QtyUnitSelectDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0010\u0010\u0012R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, m90084d2 = {"Lcom/kubi/futures/dialog/QtyUnitSelectDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogSelectQtyUnitBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogSelectQtyUnitBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "isClose", "", "()Z", "isClose$delegate", "onBeforeSwitchToCost", "Lkotlin/Function0;", "getOnBeforeSwitchToCost", "()Lkotlin/jvm/functions/Function0;", "setOnBeforeSwitchToCost", "(Lkotlin/jvm/functions/Function0;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQtyUnitSelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QtyUnitSelectDialog.kt\ncom/kubi/futures/dialog/QtyUnitSelectDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,176:1\n143#2,20:177\n*S KotlinDebug\n*F\n+ 1 QtyUnitSelectDialog.kt\ncom/kubi/futures/dialog/QtyUnitSelectDialog\n*L\n78#1:177,20\n*E\n"})
public final class QtyUnitSelectDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f22803q0 = C45681e.m100799e(this, new Function1<QtyUnitSelectDialog, C36735b1>() { // from class: com.kubi.futures.dialog.QtyUnitSelectDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36735b1 invoke(@NotNull QtyUnitSelectDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36735b1.m82320a(fragment.requireView());
        }
    }, new Function1<C36735b1, Unit>() { // from class: com.kubi.futures.dialog.QtyUnitSelectDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36735b1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36735b1 c36735b1) {
            invoke(c36735b1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f22804r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.k1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QtyUnitSelectDialog.m25224y4(this.f22858b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22805s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.l1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(QtyUnitSelectDialog.m25219s4(this.f22860b));
        }
    });

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public Function0<Boolean> f22806t0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f22802v0 = {Reflection.property1(new PropertyReference1Impl(QtyUnitSelectDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogSelectQtyUnitBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f22801u0 = new Companion(null);

    /* JADX INFO: compiled from: QtyUnitSelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/dialog/QtyUnitSelectDialog$Companion;", "", "<init>", "()V", "modifyQtyUnit", "", "unit", "", "isTrack", "", "qtyUnit2TrackOrderUnit", "type", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void modifyQtyUnit$default(Companion companion, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            companion.modifyQtyUnit(str, z11);
        }

        public final void modifyQtyUnit(@NotNull String unit, boolean isTrack) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            HashMap map = new HashMap();
            if (Intrinsics.areEqual(unit, "QtyUnitOfLot") || Intrinsics.areEqual(unit, "QtyUnitOfCurrency")) {
                map.put("isLot", String.valueOf(Intrinsics.areEqual(unit, "QtyUnitOfLot")));
            }
            map.put("qtyUnit", unit);
            if (isTrack) {
                C43852m.m96591c(C17060n0.m36552b(), "TradeUnit", m25228a(unit), null, 8, null);
            }
            RepositoryServiceLocator.f19236a.m20290i().mo99991q(map);
            IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
            if (iReactNativeService != null) {
                iReactNativeService.nativeNotifyRn("qtyUnitChanged", MapsKt.hashMapOf(TuplesKt.m90091to("qtyUnit", unit)));
            }
        }

        /* JADX INFO: renamed from: a */
        public final String m25228a(String str) {
            switch (str) {
                case "QtyUnitOfLot":
                    return "1";
                case "QtyUnitOfCurrency":
                    return "2";
                case "QtyUnitOfCost":
                    return "4";
                case "QtyUnitOfValue":
                    return "3";
                default:
                    return "0";
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    private final String m25218p4() {
        return (String) this.f22804r0.getValue();
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m25220t4(QtyUnitSelectDialog qtyUnitSelectDialog) {
        Companion.modifyQtyUnit$default(f22801u0, "QtyUnitOfLot", false, 2, null);
        qtyUnitSelectDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m25221u4(QtyUnitSelectDialog qtyUnitSelectDialog) {
        Companion.modifyQtyUnit$default(f22801u0, "QtyUnitOfCurrency", false, 2, null);
        qtyUnitSelectDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m25222v4(QtyUnitSelectDialog qtyUnitSelectDialog) {
        Companion.modifyQtyUnit$default(f22801u0, "QtyUnitOfValue", false, 2, null);
        qtyUnitSelectDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m25223w4(QtyUnitSelectDialog qtyUnitSelectDialog) {
        Function0<Boolean> function0 = qtyUnitSelectDialog.f22806t0;
        if (function0 != null ? function0.invoke().booleanValue() : true) {
            Companion.modifyQtyUnit$default(f22801u0, "QtyUnitOfCost", false, 2, null);
            qtyUnitSelectDialog.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
        ToastCompat.m66441G(qtyUnitSelectDialog.getString(R$string.kumex_trade_cost_order_zero_tips), new Object[0]);
        qtyUnitSelectDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_select_qty_unit, container, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        boolean z11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36735b1 c36735b1M25225q4 = m25225q4();
        if (c36735b1M25225q4 == null) {
            return;
        }
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), C27041f.m66668h(m25218p4()), false, 2, null);
        if (contractEntityM99529O == null) {
            dismissAllowingStateLoss();
            return;
        }
        ShapeLinearLayout cost = c36735b1M25225q4.f79730b;
        Intrinsics.checkNotNullExpressionValue(cost, "cost");
        if (m25226r4()) {
            z11 = false;
        } else {
            com.kubi.futures.trade.submit.panel.a aVar = com.kubi.futures.trade.submit.panel.a.a;
            if (aVar.c() == OrderTradeType.Tso || aVar.c() == OrderTradeType.Twap) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        C27046k.m66684G(cost, z11);
        String strM66668h = C27041f.m66668h(C27041f.m66677q(contractEntityM99529O.getDisplayBaseCurrency()));
        c36735b1M25225q4.f79735g.setText(getString(R$string.kc_kumex_place_order_base_currency, strM66668h));
        c36735b1M25225q4.f79734f.setText(getString(R$string.kc_kumex_place_order_base_currency_desc));
        c36735b1M25225q4.f79738j.setText(getString(R$string.kc_kumex_place_order_lot));
        BaseTextView baseTextView = c36735b1M25225q4.f79737i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1 ");
        sb2.append(C27017c.f54310a.m66516f(R$string.card, new Object[0]));
        sb2.append(" = ");
        BigDecimal bigDecimalMultiply = C27039d.m66656p(contractEntityM99529O.getLotSize()).multiply(C27039d.m66656p(contractEntityM99529O.getMultiplier()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        sb2.append(C42180b.m92640e(bigDecimalMultiply, null, C27039d.m66650j(Integer.valueOf(C37567b.m84624n(contractEntityM99529O))), false, false, false, 0, null, 125, null));
        sb2.append(' ');
        sb2.append(strM66668h);
        baseTextView.setText(sb2.toString());
        c36735b1M25225q4.f79742n.setText(getString(R$string.kc_kumex_place_order_settle_currency_stub, C27041f.m66668h(C27041f.m66677q(contractEntityM99529O.getSettleCurrency()))));
        c36735b1M25225q4.f79741m.setText(getString(R$string.kc_kumex_place_order_settle_currency_desc));
        c36735b1M25225q4.f79732d.setText(getString(R$string.kc_kumex_place_order_cost_title_stub, C27041f.m66668h(C27041f.m66677q(contractEntityM99529O.getSettleCurrency()))));
        if (contractEntityM99529O.isInverse()) {
            ShapeLinearLayout currency = c36735b1M25225q4.f79733e;
            Intrinsics.checkNotNullExpressionValue(currency, "currency");
            ViewExtKt.m66577h(currency);
            ShapeLinearLayout value = c36735b1M25225q4.f79740l;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            ViewExtKt.m66577h(value);
        }
        c36735b1M25225q4.f79731c.setText(getString(R$string.kc_kumex_place_order_cost_desc));
        ShapeLinearLayout lot = c36735b1M25225q4.f79736h;
        Intrinsics.checkNotNullExpressionValue(lot, "lot");
        C27046k.m66711z(lot, 0L, new Function0() { // from class: com.kubi.futures.dialog.g1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QtyUnitSelectDialog.m25220t4(this.f22842b);
            }
        }, 1, null);
        ShapeLinearLayout currency2 = c36735b1M25225q4.f79733e;
        Intrinsics.checkNotNullExpressionValue(currency2, "currency");
        C27046k.m66711z(currency2, 0L, new Function0() { // from class: com.kubi.futures.dialog.h1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QtyUnitSelectDialog.m25221u4(this.f22847b);
            }
        }, 1, null);
        ShapeLinearLayout value2 = c36735b1M25225q4.f79740l;
        Intrinsics.checkNotNullExpressionValue(value2, "value");
        C27046k.m66711z(value2, 0L, new Function0() { // from class: com.kubi.futures.dialog.i1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QtyUnitSelectDialog.m25222v4(this.f22851b);
            }
        }, 1, null);
        ShapeLinearLayout cost2 = c36735b1M25225q4.f79730b;
        Intrinsics.checkNotNullExpressionValue(cost2, "cost");
        C27046k.m66711z(cost2, 0L, new Function0() { // from class: com.kubi.futures.dialog.j1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QtyUnitSelectDialog.m25223w4(this.f22854b);
            }
        }, 1, null);
        String strM84698e = C37571f.m84698e(repositoryServiceLocator.m20290i().mo99981F0());
        int iHashCode = strM84698e.hashCode();
        if (iHashCode != -1208996640) {
            if (iHashCode != 1175541790) {
                if (iHashCode == 2099180352 && strM84698e.equals("QtyUnitOfValue")) {
                    c36735b1M25225q4.f79740l.setSelected(true);
                    return;
                }
            } else if (strM84698e.equals("QtyUnitOfCost")) {
                c36735b1M25225q4.f79730b.setSelected(true);
                return;
            }
        } else if (strM84698e.equals("QtyUnitOfLot")) {
            c36735b1M25225q4.f79736h.setSelected(true);
            return;
        }
        c36735b1M25225q4.f79733e.setSelected(true);
    }

    /* JADX INFO: renamed from: q4 */
    public final C36735b1 m25225q4() {
        return (C36735b1) this.f22803q0.getValue(this, f22802v0[0]);
    }

    /* JADX INFO: renamed from: r4 */
    public final boolean m25226r4() {
        return ((Boolean) this.f22805s0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m25227x4(@Nullable Function0<Boolean> function0) {
        this.f22806t0 = function0;
    }

    /* JADX INFO: renamed from: s4 */
    public static final boolean m25219s4(QtyUnitSelectDialog qtyUnitSelectDialog) {
        Boolean boolValueOf;
        Bundle arguments = qtyUnitSelectDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: y4 */
    public static final String m25224y4(QtyUnitSelectDialog qtyUnitSelectDialog) {
        Bundle arguments = qtyUnitSelectDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("symbol");
        }
        return null;
    }
}
