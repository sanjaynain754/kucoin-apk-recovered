package com.kubi.tradebase.segment;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mvi.common.C19244f;
import com.kubi.resources.C22912t;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$font;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$string;
import com.kubi.tradebase.api.segment.SegmentDistributionType;
import com.kubi.tradebase.segment.SegmentDistributionDialog;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import j30.C40266c;
import j30.InterfaceC40264a;
import j30.SegmentOrder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n30.C42739o;
import n30.C42742r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import t30.C44682b;
import w00.C45681e;

/* JADX INFO: compiled from: SegmentDistributionDialog.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 N2\u00020\u0001:\u0002NOB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u00020\u0005H\u0002J\b\u00102\u001a\u00020\u0005H\u0002J\b\u00105\u001a\u00020\rH\u0016J\b\u00106\u001a\u00020\u001eH\u0016J\b\u00107\u001a\u000208H\u0016J$\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001a\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020:2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010C\u001a\u000208H\u0002J\b\u0010D\u001a\u000208H\u0002J\u0010\u0010E\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010FH\u0002J\b\u0010H\u001a\u000208H\u0002J\b\u0010I\u001a\u000208H\u0002J\u0010\u0010J\u001a\u0002082\u0006\u0010K\u001a\u00020%H\u0002J\b\u0010L\u001a\u000208H\u0002J\u0010\u0010M\u001a\u0002082\u0006\u0010K\u001a\u00020%H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u001c\u0010 \u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0014R\u001c\u0010\"\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014R\u0014\u0010$\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010)\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u000e\u0010/\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "totalQty", "Ljava/math/BigDecimal;", "getTotalQty", "()Ljava/math/BigDecimal;", "priceMin", "getPriceMin", "priceMax", "getPriceMax", "orderCount", "", "getOrderCount", "()I", "quoteCurrency", "", "kotlin.jvm.PlatformType", "getQuoteCurrency", "()Ljava/lang/String;", "baseCurrency", "getBaseCurrency", "pricePrecision", "getPricePrecision", "qtyPrecision", "getQtyPrecision", "minSize", "getMinSize", "isFutures", "", "()Z", "trackPageId", "getTrackPageId", "trackTradeType", "getTrackTradeType", "initDistribution", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "getInitDistribution", "()Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "selectedType", "binding", "Lcom/kubi/tradebase/databinding/TradebaseDialogSegmentDistributionBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/TradebaseDialogSegmentDistributionBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "dialogHost", "Lcom/kubi/tradebase/api/segment/SegmentDistributionDialogHost;", "minQtyForUniform", "minQtyForArithmetic", "ordersAdapter", "Lcom/kubi/tradebase/segment/SegmentDistributionDialog$SegmentOrderAdapter;", "initType", "isBottomSheet", "onStart", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupTypeSelector", "setupRecyclerView", "getBottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "setupSummary", "setupConfirm", "trackConfirmClick", "type", "observeCost", "renderOrders", "Companion", "SegmentOrderAdapter", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSegmentDistributionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentDistributionDialog.kt\ncom/kubi/tradebase/segment/SegmentDistributionDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n143#2,20:464\n1#3:484\n216#4,2:485\n216#4,2:493\n1761#5,3:487\n1803#5,3:490\n*S KotlinDebug\n*F\n+ 1 SegmentDistributionDialog.kt\ncom/kubi/tradebase/segment/SegmentDistributionDialog\n*L\n119#1:464,20\n215#1:485,2\n207#1:493,2\n338#1:487,3\n339#1:490,3\n*E\n"})
public final class SegmentDistributionDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    public InterfaceC40264a f51609s0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f51606v0 = {Reflection.property1(new PropertyReference1Impl(SegmentDistributionDialog.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/TradebaseDialogSegmentDistributionBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f51605u0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public SegmentDistributionType f51607q0 = SegmentDistributionType.Uniform;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f51608r0 = C45681e.m100799e(this, new Function1<SegmentDistributionDialog, C42739o>() { // from class: com.kubi.tradebase.segment.SegmentDistributionDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42739o invoke(@NotNull SegmentDistributionDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42739o.m93652a(fragment.requireView());
        }
    }, new Function1<C42739o, Unit>() { // from class: com.kubi.tradebase.segment.SegmentDistributionDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42739o it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42739o c42739o) {
            invoke(c42739o);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final C25912a f51610t0 = new C25912a();

    /* JADX INFO: compiled from: SegmentDistributionDialog.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J|\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionDialog$Companion;", "", "<init>", "()V", "ARG_TOTAL_QTY", "", "ARG_PRICE_MIN", "ARG_PRICE_MAX", "ARG_ORDER_COUNT", "ARG_DISTRIBUTION", "ARG_QUOTE_CURRENCY", "ARG_BASE_CURRENCY", "ARG_PRICE_PRECISION", "ARG_QTY_PRECISION", "ARG_MIN_SIZE", "ARG_IS_FUTURES", "ARG_PAGE_ID", "ARG_TRADE_TYPE", "newInstance", "Lcom/kubi/tradebase/segment/SegmentDistributionDialog;", "totalQty", "Ljava/math/BigDecimal;", "priceMin", "priceMax", "orderCount", "", "distributionType", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "quoteCurrency", "baseCurrency", "pricePrecision", "qtyPrecision", "minSize", "isFutures", "", "pageId", "tradeType", "dialogHost", "Lcom/kubi/tradebase/api/segment/SegmentDistributionDialogHost;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SegmentDistributionDialog newInstance(@NotNull BigDecimal totalQty, @NotNull BigDecimal priceMin, @NotNull BigDecimal priceMax, int i11, @NotNull SegmentDistributionType distributionType, @NotNull String quoteCurrency, @NotNull String baseCurrency, int i12, int i13, @NotNull BigDecimal minSize, boolean z11, @NotNull String pageId, @NotNull String tradeType, @NotNull InterfaceC40264a dialogHost) {
            Intrinsics.checkNotNullParameter(totalQty, "totalQty");
            Intrinsics.checkNotNullParameter(priceMin, "priceMin");
            Intrinsics.checkNotNullParameter(priceMax, "priceMax");
            Intrinsics.checkNotNullParameter(distributionType, "distributionType");
            Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            Intrinsics.checkNotNullParameter(minSize, "minSize");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(dialogHost, "dialogHost");
            SegmentDistributionDialog segmentDistributionDialog = new SegmentDistributionDialog();
            Bundle bundle = new Bundle();
            bundle.putString("arg_total_qty", totalQty.toPlainString());
            bundle.putString("arg_price_min", priceMin.toPlainString());
            bundle.putString("arg_price_max", priceMax.toPlainString());
            bundle.putInt("arg_order_count", i11);
            bundle.putString("arg_distribution", distributionType.name());
            bundle.putString("arg_quote_currency", quoteCurrency);
            bundle.putString("arg_base_currency", baseCurrency);
            bundle.putInt("arg_price_precision", i12);
            bundle.putInt("arg_qty_precision", i13);
            bundle.putString("arg_min_size", minSize.toPlainString());
            bundle.putBoolean("arg_is_futures", z11);
            bundle.putString("arg_page_id", pageId);
            bundle.putString("arg_trade_type", tradeType);
            segmentDistributionDialog.setArguments(bundle);
            segmentDistributionDialog.f51609s0 = dialogHost;
            return segmentDistributionDialog;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.segment.SegmentDistributionDialog$a */
    /* JADX INFO: compiled from: SegmentDistributionDialog.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionDialog$SegmentOrderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/tradebase/segment/SegmentDistributionDialog$SegmentOrderAdapter$VH;", "<init>", "()V", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/tradebase/api/segment/SegmentOrder;", "totalQty", "Ljava/math/BigDecimal;", "qtyPrecision", "", "pricePrecision", "minQty", "ratios", "", "submit", "", "orders", "distributionType", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "calcRatios", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "VH", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSegmentDistributionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentDistributionDialog.kt\ncom/kubi/tradebase/segment/SegmentDistributionDialog$SegmentOrderAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1563#2:464\n1634#2,3:465\n1878#2,3:468\n1#3:471\n*S KotlinDebug\n*F\n+ 1 SegmentDistributionDialog.kt\ncom/kubi/tradebase/segment/SegmentDistributionDialog$SegmentOrderAdapter\n*L\n390#1:464\n390#1:465,3\n396#1:468,3\n*E\n"})
    public static final class C25912a extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public List<SegmentOrder> f51611i = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: j */
        @NotNull
        public BigDecimal f51612j;

        /* JADX INFO: renamed from: k */
        public int f51613k;

        /* JADX INFO: renamed from: l */
        public int f51614l;

        /* JADX INFO: renamed from: m */
        @NotNull
        public BigDecimal f51615m;

        /* JADX INFO: renamed from: n */
        @NotNull
        public List<String> f51616n;

        /* JADX INFO: renamed from: com.kubi.tradebase.segment.SegmentDistributionDialog$a$a */
        /* JADX INFO: compiled from: SegmentDistributionDialog.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionDialog$SegmentOrderAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "b", "Lcom/kubi/tradebase/databinding/TradebaseItemSegmentOrderBinding;", "<init>", "(Lcom/kubi/tradebase/databinding/TradebaseItemSegmentOrderBinding;)V", "getB", "()Lcom/kubi/tradebase/databinding/TradebaseItemSegmentOrderBinding;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: g */
            @NotNull
            public final C42742r f51617g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull C42742r b11) {
                super(b11.getRoot());
                Intrinsics.checkNotNullParameter(b11, "b");
                this.f51617g = b11;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final C42742r getF51617g() {
                return this.f51617g;
            }
        }

        /* JADX INFO: renamed from: g */
        public final List<String> m63315g(List<SegmentOrder> list, BigDecimal bigDecimal, SegmentDistributionType segmentDistributionType) {
            if (list.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (SegmentOrder segmentOrder : list) {
                    arrayList.add("0.00%");
                }
                return arrayList;
            }
            int lastIndex = CollectionsKt.getLastIndex(list);
            int size = list.size();
            String[] strArr = new String[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                strArr[i12] = "";
            }
            BigDecimal element = BigDecimal.ZERO;
            for (Object obj : list) {
                int i13 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SegmentOrder segmentOrder2 = (SegmentOrder) obj;
                if (i11 != lastIndex) {
                    BigDecimal qty = segmentOrder2.getQty();
                    BigDecimal bigDecimalDivide = BigDecimal.ZERO;
                    if (qty.compareTo(bigDecimalDivide) > 0) {
                        bigDecimalDivide = segmentOrder2.getQty().divide(bigDecimal, 4, RoundingMode.DOWN);
                    }
                    BigDecimal bigDecimal2 = bigDecimalDivide;
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    Intrinsics.checkNotNull(bigDecimal2);
                    element = element.add(bigDecimal2);
                    Intrinsics.checkNotNullExpressionValue(element, "add(...)");
                    strArr[i11] = C42180b.m92642g(bigDecimal2, null, RoundingMode.DOWN, 4, false, false, false, 25, null);
                }
                i11 = i13;
            }
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            Intrinsics.checkNotNullExpressionValue(element, "element");
            BigDecimal bigDecimalSubtract = ONE.subtract(element);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            BigDecimal bigDecimal3 = (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSubtract, ZERO);
            Intrinsics.checkNotNull(bigDecimal3);
            strArr[lastIndex] = C42180b.m92642g(bigDecimal3, null, RoundingMode.DOWN, 4, false, false, false, 25, null);
            return ArraysKt.toList(strArr);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f51611i.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull a holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            SegmentOrder segmentOrder = this.f51611i.get(i11);
            boolean z11 = segmentOrder.getQty().compareTo(this.f51615m) < 0;
            C27017c c27017c = C27017c.f54310a;
            int iM66512a = c27017c.m66512a(R$color.secondary);
            int iM66512a2 = c27017c.m66512a(R$color.c_text);
            if (!z11) {
                iM66512a = iM66512a2;
            }
            BaseTextView tvPrice = holder.getF51617g().f94686b;
            Intrinsics.checkNotNullExpressionValue(tvPrice, "tvPrice");
            C22912t.m54420r(tvPrice, C42180b.m92640e(segmentOrder.getPrice(), null, this.f51614l, false, false, false, 0, null, 125, null), 14.0f, 8.0f);
            holder.getF51617g().f94686b.setTextColor(iM66512a);
            BaseTextView tvQty = holder.getF51617g().f94687c;
            Intrinsics.checkNotNullExpressionValue(tvQty, "tvQty");
            C22912t.m54420r(tvQty, C42180b.m92640e(segmentOrder.getQty(), null, this.f51613k, false, false, false, 0, null, 125, null), 14.0f, 8.0f);
            holder.getF51617g().f94687c.setTextColor(iM66512a);
            List<String> list = this.f51616n;
            holder.getF51617g().f94688d.setText((i11 < 0 || i11 >= list.size()) ? "0.00%" : list.get(i11));
            holder.getF51617g().f94688d.setTextColor(iM66512a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            C42742r c42742rM93660c = C42742r.m93660c(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(c42742rM93660c, "inflate(...)");
            return new a(c42742rM93660c);
        }

        /* JADX INFO: renamed from: j */
        public final void m63318j(@NotNull List<SegmentOrder> orders, @NotNull BigDecimal totalQty, int i11, int i12, @NotNull BigDecimal minQty, @NotNull SegmentDistributionType distributionType) {
            Intrinsics.checkNotNullParameter(orders, "orders");
            Intrinsics.checkNotNullParameter(totalQty, "totalQty");
            Intrinsics.checkNotNullParameter(minQty, "minQty");
            Intrinsics.checkNotNullParameter(distributionType, "distributionType");
            this.f51611i = orders;
            this.f51612j = totalQty;
            this.f51613k = i11;
            this.f51614l = i12;
            this.f51615m = minQty;
            this.f51616n = m63315g(orders, totalQty, distributionType);
            notifyDataSetChanged();
        }

        public C25912a() {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            this.f51612j = ZERO;
            this.f51613k = 8;
            this.f51614l = 2;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            this.f51615m = ZERO;
            this.f51616n = CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.segment.SegmentDistributionDialog$c */
    /* JADX INFO: compiled from: SegmentDistributionDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/tradebase/segment/SegmentDistributionDialog$setupRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25914c extends RecyclerView.OnScrollListener {
        public C25914c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
            BottomSheetBehavior bottomSheetBehaviorM63307r4 = SegmentDistributionDialog.this.m63307r4();
            if (bottomSheetBehaviorM63307r4 != null) {
                bottomSheetBehaviorM63307r4.setDraggable(!zCanScrollVertically);
            }
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

    /* JADX INFO: renamed from: com.kubi.tradebase.segment.SegmentDistributionDialog$b */
    /* JADX INFO: compiled from: SegmentDistributionDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C25913b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentDistributionType.values().length];
            try {
                iArr[SegmentDistributionType.Uniform.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentDistributionType.Increasing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentDistributionType.Decreasing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m63283J4(SegmentDistributionDialog segmentDistributionDialog) {
        segmentDistributionDialog.m63305P4(segmentDistributionDialog.f51607q0);
        InterfaceC40264a interfaceC40264a = segmentDistributionDialog.f51609s0;
        if (interfaceC40264a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogHost");
            interfaceC40264a = null;
        }
        interfaceC40264a.setDistributionType(segmentDistributionDialog.f51607q0);
        segmentDistributionDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m63285N4(SegmentDistributionDialog segmentDistributionDialog, Map map, int i11, int i12, Typeface typeface, Typeface typeface2, SegmentDistributionType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        segmentDistributionDialog.f51607q0 = type;
        for (Map.Entry entry : map.entrySet()) {
            SegmentDistributionType segmentDistributionType = (SegmentDistributionType) entry.getKey();
            RadioButton radioButton = (RadioButton) entry.getValue();
            boolean z11 = segmentDistributionType == type;
            radioButton.setChecked(z11);
            radioButton.setTextColor(z11 ? i11 : i12);
            radioButton.setTypeface(z11 ? typeface : typeface2);
        }
        segmentDistributionDialog.m63301H4(type);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final BigDecimal m63296A4() {
        String string = requireArguments().getString("arg_total_qty");
        Intrinsics.checkNotNull(string);
        return new BigDecimal(string);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m63300F4() {
        InterfaceC40264a interfaceC40264a = this.f51609s0;
        if (interfaceC40264a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogHost");
            interfaceC40264a = null;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        interfaceC40264a.mo23177j(viewLifecycleOwner, new Function2() { // from class: r30.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SegmentDistributionDialog.m63282G4(this.f97083b, (BigDecimal) obj, (BigDecimal) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public final void m63301H4(SegmentDistributionType segmentDistributionType) {
        String strM98838c;
        BigDecimal bigDecimalM63299E4;
        C40266c c40266c = C40266c.f89505a;
        List<SegmentOrder> listM88647c = c40266c.m88647c(m63312w4(), m63311v4(), m63310u4(), m63296A4(), segmentDistributionType, m63313x4(), m63314y4(), m63281C4() ? m63309t4() : null);
        BigDecimal bigDecimalM88644f = C40266c.m88644f(c40266c, listM88647c, 0, 2, null);
        C42739o c42739oM63306q4 = m63306q4();
        if (c42739oM63306q4 == null) {
            return;
        }
        BaseTextView baseTextView = c42739oM63306q4.f94663h;
        if (bigDecimalM88644f != null) {
            String str = C42180b.m92640e(bigDecimalM88644f, null, m63313x4(), false, false, false, 0, null, 125, null) + ' ' + m63295z4();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            strM98838c = C44682b.m98838c(str, contextRequireContext);
        } else {
            strM98838c = "--";
        }
        baseTextView.setText(strM98838c);
        InterfaceC40264a interfaceC40264a = this.f51609s0;
        if (interfaceC40264a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogHost");
            interfaceC40264a = null;
        }
        interfaceC40264a.mo23176W2(m63312w4(), m63311v4(), m63310u4(), m63296A4(), segmentDistributionType, m63313x4(), m63314y4());
        int i11 = C25913b.$EnumSwitchMapping$0[segmentDistributionType.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            bigDecimalM63299E4 = m63299E4();
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalM63299E4 = m63298D4();
        }
        BigDecimal bigDecimal = bigDecimalM63299E4;
        BigDecimal bigDecimalM63309t4 = m63309t4();
        if (listM88647c != null && listM88647c.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator<T> it = listM88647c.iterator();
        do {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
        } while (((SegmentOrder) it.next()).getQty().compareTo(bigDecimalM63309t4) >= 0);
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (SegmentOrder segmentOrder : listM88647c) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            bigDecimalAdd = bigDecimalAdd.add(segmentOrder.getQty());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        if (z11 || m63296A4().compareTo(bigDecimal) < 0) {
            c42739oM63306q4.f94664i.setVisibility(0);
            c42739oM63306q4.f94664i.setText(C27017c.f54310a.m66516f(R$string.kumex_segmented_preview_warn_suborder_min, C42180b.m92640e(bigDecimal, null, m63314y4(), false, false, false, 0, null, 125, null), m63294p4()));
        } else {
            c42739oM63306q4.f94664i.setVisibility(8);
        }
        C25912a c25912a = this.f51610t0;
        Intrinsics.checkNotNull(bigDecimalAdd);
        c25912a.m63318j(listM88647c, bigDecimalAdd, m63314y4(), m63313x4(), bigDecimalM63309t4, segmentDistributionType);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.tradebase_dialog_segment_distribution, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f51607q0 = m63308s4();
        m63304M4();
        m63284K4();
        m63303L4();
        m63302I4();
        m63300F4();
        m63301H4(this.f51607q0);
    }

    /* JADX INFO: renamed from: q4 */
    public final C42739o m63306q4() {
        return (C42739o) this.f51608r0.getValue(this, f51606v0[0]);
    }

    /* JADX INFO: renamed from: v4 */
    public final BigDecimal m63311v4() {
        String string = requireArguments().getString("arg_price_max");
        Intrinsics.checkNotNull(string);
        return new BigDecimal(string);
    }

    /* JADX INFO: renamed from: w4 */
    public final BigDecimal m63312w4() {
        String string = requireArguments().getString("arg_price_min");
        Intrinsics.checkNotNull(string);
        return new BigDecimal(string);
    }

    /* JADX INFO: renamed from: C4 */
    private final boolean m63281C4() {
        return requireArguments().getBoolean("arg_is_futures", true);
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m63282G4(SegmentDistributionDialog segmentDistributionDialog, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        String strM98838c;
        C42739o c42739oM63306q4 = segmentDistributionDialog.m63306q4();
        if (c42739oM63306q4 == null) {
            return Unit.INSTANCE;
        }
        if (bigDecimal == null) {
            bigDecimal = bigDecimal2;
        }
        BaseTextView baseTextView = c42739oM63306q4.f94665j;
        if (bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            String str = C42180b.m92640e(bigDecimal, null, 2, false, false, false, 0, null, 125, null) + ' ' + segmentDistributionDialog.m63295z4();
            Context contextRequireContext = segmentDistributionDialog.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            strM98838c = C44682b.m98838c(str, contextRequireContext);
        } else {
            strM98838c = "--";
        }
        baseTextView.setText(strM98838c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    private final void m63284K4() {
        C42739o c42739oM63306q4 = m63306q4();
        if (c42739oM63306q4 == null) {
            return;
        }
        c42739oM63306q4.f94662g.setLayoutManager(new LinearLayoutManager(requireContext()));
        c42739oM63306q4.f94662g.setAdapter(this.f51610t0);
        c42739oM63306q4.f94662g.setNestedScrollingEnabled(true);
        c42739oM63306q4.f94662g.addOnScrollListener(new C25914c());
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m63286O4(Function1 function1, SegmentDistributionType segmentDistributionType) {
        function1.invoke(segmentDistributionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P0 */
    private final String m63287P0() {
        return requireArguments().getString("arg_page_id", "");
    }

    /* JADX INFO: renamed from: p4 */
    private final String m63294p4() {
        return requireArguments().getString("arg_base_currency", "");
    }

    /* JADX INFO: renamed from: z4 */
    private final String m63295z4() {
        return requireArguments().getString("arg_quote_currency", "");
    }

    /* JADX INFO: renamed from: B4 */
    public final String m63297B4() {
        return requireArguments().getString("arg_trade_type", "");
    }

    /* JADX INFO: renamed from: D4 */
    public final BigDecimal m63298D4() {
        BigDecimal bigDecimalM63309t4 = m63309t4();
        return C40266c.f89505a.m88651i(m63310u4(), SegmentDistributionType.Increasing, bigDecimalM63309t4, m63314y4());
    }

    /* JADX INFO: renamed from: E4 */
    public final BigDecimal m63299E4() {
        BigDecimal bigDecimalM63309t4 = m63309t4();
        C40266c c40266c = C40266c.f89505a;
        int iM63310u4 = m63310u4();
        int iM63314y4 = m63314y4();
        SegmentDistributionType segmentDistributionType = SegmentDistributionType.Uniform;
        BigDecimal bigDecimalM88651i = c40266c.m88651i(iM63310u4, segmentDistributionType, bigDecimalM63309t4, iM63314y4);
        if (m63281C4()) {
            return bigDecimalM88651i;
        }
        BigDecimal bigDecimalMax = bigDecimalM88651i.max(c40266c.m88652j(m63310u4(), segmentDistributionType, new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(m63295z4()))), m63312w4(), m63314y4()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMax, "max(...)");
        return bigDecimalMax;
    }

    /* JADX INFO: renamed from: I4 */
    public final void m63302I4() {
        C42739o c42739oM63306q4 = m63306q4();
        if (c42739oM63306q4 == null) {
            return;
        }
        ShapeTextView btnConfirm = c42739oM63306q4.f94657b;
        Intrinsics.checkNotNullExpressionValue(btnConfirm, "btnConfirm");
        C27046k.m66711z(btnConfirm, 0L, new Function0() { // from class: r30.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SegmentDistributionDialog.m63283J4(this.f97084b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: L4 */
    public final void m63303L4() {
        C42739o c42739oM63306q4 = m63306q4();
        if (c42739oM63306q4 == null) {
            return;
        }
        LinearLayout llEstMarginRow = c42739oM63306q4.f94658c;
        Intrinsics.checkNotNullExpressionValue(llEstMarginRow, "llEstMarginRow");
        C19244f.m42542a(llEstMarginRow, m63281C4());
        BaseTextView baseTextView = c42739oM63306q4.f94668m;
        String str = C42180b.m92640e(m63296A4(), null, m63314y4(), false, false, false, 0, null, 125, null) + ' ' + m63294p4();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        baseTextView.setText(C44682b.m98838c(str, contextRequireContext));
        BaseTextView baseTextView2 = c42739oM63306q4.f94666k;
        C27017c c27017c = C27017c.f54310a;
        baseTextView2.setText(c27017c.m66516f(R$string.price_order, m63295z4()));
        c42739oM63306q4.f94667l.setText(c27017c.m66516f(R$string.qty_stub, m63294p4()));
    }

    /* JADX INFO: renamed from: M4 */
    public final void m63304M4() {
        final Typeface typeface;
        C42739o c42739oM63306q4 = m63306q4();
        if (c42739oM63306q4 == null) {
            return;
        }
        final Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to(SegmentDistributionType.Uniform, c42739oM63306q4.f94661f), TuplesKt.m90091to(SegmentDistributionType.Increasing, c42739oM63306q4.f94660e), TuplesKt.m90091to(SegmentDistributionType.Decreasing, c42739oM63306q4.f94659d));
        Typeface font = ResourcesCompat.getFont(requireContext(), R$font.regular);
        if (font == null) {
            font = Typeface.DEFAULT;
        }
        final Typeface typeface2 = font;
        Typeface font2 = ResourcesCompat.getFont(requireContext(), R$font.medium);
        if (font2 == null) {
            typeface = typeface2;
        } else {
            typeface = font2;
        }
        C27017c c27017c = C27017c.f54310a;
        final int iM66512a = c27017c.m66512a(R$color.c_text);
        final int iM66512a2 = c27017c.m66512a(R$color.c_text60);
        final Function1 function1 = new Function1() { // from class: r30.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SegmentDistributionDialog.m63285N4(this.f97075b, mapMapOf, iM66512a, iM66512a2, typeface, typeface2, (SegmentDistributionType) obj);
            }
        };
        for (Map.Entry entry : mapMapOf.entrySet()) {
            final SegmentDistributionType segmentDistributionType = (SegmentDistributionType) entry.getKey();
            C27046k.m66711z((RadioButton) entry.getValue(), 0L, new Function0() { // from class: r30.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SegmentDistributionDialog.m63286O4(function1, segmentDistributionType);
                }
            }, 1, null);
        }
        function1.invoke(this.f51607q0);
    }

    /* JADX INFO: renamed from: P4 */
    public final void m63305P4(SegmentDistributionType segmentDistributionType) {
        String str;
        String strM63287P0 = m63287P0();
        Intrinsics.checkNotNull(strM63287P0);
        if (strM63287P0.length() == 0) {
            return;
        }
        int i11 = C25913b.$EnumSwitchMapping$0[segmentDistributionType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    str = "Decreasing";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "Ascending";
            }
        } else {
            str = "Avg";
        }
        C43852m.m96590b(strM63287P0, "orderAllocationPopup", "confirm", TuplesKt.m90091to("trade_type", m63297B4()), TuplesKt.m90091to("type", str));
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        int iM6182d = C5267e0.m6182d();
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM63307r4 = m63307r4();
        if (bottomSheetBehaviorM63307r4 != null) {
            bottomSheetBehaviorM63307r4.setPeekHeight(iM6182d);
            bottomSheetBehaviorM63307r4.setState(3);
            bottomSheetBehaviorM63307r4.setSkipCollapsed(true);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final BottomSheetBehavior<FrameLayout> m63307r4() {
        FrameLayout frameLayout;
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            return BottomSheetBehavior.from(frameLayout);
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public final SegmentDistributionType m63308s4() {
        String string = requireArguments().getString("arg_distribution", "Uniform");
        Intrinsics.checkNotNull(string);
        return SegmentDistributionType.valueOf(string);
    }

    /* JADX INFO: renamed from: t4 */
    public final BigDecimal m63309t4() {
        Object objM103844constructorimpl;
        String string = requireArguments().getString("arg_min_size");
        if (string == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new BigDecimal(string));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        BigDecimal bigDecimal = (BigDecimal) objM103844constructorimpl;
        if (bigDecimal == null) {
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            return ZERO2;
        }
        return bigDecimal;
    }

    /* JADX INFO: renamed from: u4 */
    public final int m63310u4() {
        return requireArguments().getInt("arg_order_count");
    }

    /* JADX INFO: renamed from: x4 */
    public final int m63313x4() {
        return requireArguments().getInt("arg_price_precision", 2);
    }

    /* JADX INFO: renamed from: y4 */
    public final int m63314y4() {
        return requireArguments().getInt("arg_qty_precision", 8);
    }
}
