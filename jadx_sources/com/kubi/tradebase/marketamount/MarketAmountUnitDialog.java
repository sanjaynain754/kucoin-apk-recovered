package com.kubi.tradebase.marketamount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$string;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketAmountUnitDialog.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0017H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010#\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u0014J \u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u000fH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MarketAmountUnitDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "baseCurrency", "", "kotlin.jvm.PlatformType", "getBaseCurrency", "()Ljava/lang/String;", "baseCurrency$delegate", "Lkotlin/Lazy;", "quoteCurrency", "getQuoteCurrency", "quoteCurrency$delegate", "selectedUnit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "getSelectedUnit", "()Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "selectedUnit$delegate", "onSelectedListener", "Lkotlin/Function1;", "", "selectionHandled", "", "isBottomSheet", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setOnSelectedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bindUnitRow", "unit", "text", "selectUnit", "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketAmountUnitDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketAmountUnitDialog.kt\ncom/kubi/tradebase/marketamount/MarketAmountUnitDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n295#2,2:90\n*S KotlinDebug\n*F\n+ 1 MarketAmountUnitDialog.kt\ncom/kubi/tradebase/marketamount/MarketAmountUnitDialog\n*L\n17#1:90,2\n*E\n"})
public final class MarketAmountUnitDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f51558v0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f51559q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.marketamount.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketAmountUnitDialog.m63218n4(this.f51576b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f51560r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.marketamount.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketAmountUnitDialog.m63222t4(this.f51577b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f51561s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.marketamount.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketAmountUnitDialog.m63223v4(this.f51578b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public Function1<? super MarketAmountUnit, Unit> f51562t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f51563u0;

    /* JADX INFO: compiled from: MarketAmountUnitDialog.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MarketAmountUnitDialog$Companion;", "", "<init>", "()V", "ARG_BASE_CURRENCY", "", "ARG_QUOTE_CURRENCY", "ARG_SELECTED_UNIT", "newInstance", "Lcom/kubi/tradebase/marketamount/MarketAmountUnitDialog;", "baseCurrency", "quoteCurrency", "selectedUnit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketAmountUnitDialog newInstance(@NotNull String baseCurrency, @NotNull String quoteCurrency, @NotNull MarketAmountUnit selectedUnit) {
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
            Intrinsics.checkNotNullParameter(selectedUnit, "selectedUnit");
            MarketAmountUnitDialog marketAmountUnitDialog = new MarketAmountUnitDialog();
            Bundle bundle = new Bundle();
            bundle.putString("base_currency", baseCurrency);
            bundle.putString("quote_currency", quoteCurrency);
            bundle.putString("selected_unit", selectedUnit.name());
            marketAmountUnitDialog.setArguments(bundle);
            return marketAmountUnitDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: q4 */
    private final String m63220q4() {
        return (String) this.f51559q0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    private final String m63221r4() {
        return (String) this.f51560r0.getValue();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m63224o4(View view, final MarketAmountUnit marketAmountUnit, String str) {
        ((TextView) view.findViewById(R$id.tv_market_amount_unit)).setText(str);
        ((AppCompatImageView) view.findViewById(R$id.iv_market_amount_unit_selected)).setVisibility(m63225s4() == marketAmountUnit ? 0 : 8);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.tradebase.marketamount.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarketAmountUnitDialog.m63219p4(this.f51574b, marketAmountUnit, view2);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.btradebase_dialog_market_amount_unit, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f51563u0 = false;
        ((TextView) view.findViewById(R$id.tv_dialog_title)).setText(R$string.trade_unit);
        View viewFindViewById = view.findViewById(R$id.row_base_unit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        MarketAmountUnit marketAmountUnit = MarketAmountUnit.BASE;
        String string = getString(R$string.amount_stub, m63220q4());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m63224o4(viewFindViewById, marketAmountUnit, string);
        View viewFindViewById2 = view.findViewById(R$id.row_quote_unit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        MarketAmountUnit marketAmountUnit2 = MarketAmountUnit.QUOTE;
        String string2 = getString(R$string.decimal_order, m63221r4());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        m63224o4(viewFindViewById2, marketAmountUnit2, string2);
    }

    /* JADX INFO: renamed from: s4 */
    public final MarketAmountUnit m63225s4() {
        return (MarketAmountUnit) this.f51561s0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m63226u4(MarketAmountUnit marketAmountUnit) {
        if (this.f51563u0) {
            return;
        }
        this.f51563u0 = true;
        Function1<? super MarketAmountUnit, Unit> function1 = this.f51562t0;
        if (function1 != null) {
            function1.invoke(marketAmountUnit);
        }
        dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: w4 */
    public final MarketAmountUnitDialog m63227w4(@NotNull Function1<? super MarketAmountUnit, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f51562t0 = listener;
        return this;
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m63218n4(MarketAmountUnitDialog marketAmountUnitDialog) {
        return marketAmountUnitDialog.requireArguments().getString("base_currency", "");
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m63219p4(MarketAmountUnitDialog marketAmountUnitDialog, MarketAmountUnit marketAmountUnit, View view) {
        marketAmountUnitDialog.m63226u4(marketAmountUnit);
    }

    /* JADX INFO: renamed from: t4 */
    public static final String m63222t4(MarketAmountUnitDialog marketAmountUnitDialog) {
        return marketAmountUnitDialog.requireArguments().getString("quote_currency", "");
    }

    /* JADX INFO: renamed from: v4 */
    public static final MarketAmountUnit m63223v4(MarketAmountUnitDialog marketAmountUnitDialog) {
        MarketAmountUnit next;
        Iterator<MarketAmountUnit> it = MarketAmountUnit.getEntries().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(next.name(), marketAmountUnitDialog.requireArguments().getString("selected_unit")));
        MarketAmountUnit marketAmountUnit = next;
        if (marketAmountUnit == null) {
            return MarketAmountUnit.QUOTE;
        }
        return marketAmountUnit;
    }
}
