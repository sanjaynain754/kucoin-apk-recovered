package com.kubi.utaspotlib.biz.order;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspotlib.R$attr;
import com.kubi.utaspotlib.R$color;
import com.kubi.utaspotlib.R$id;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utaspotlib.R$string;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import ne.LimitTradeInputData;
import ne.MarketTradeInputData;
import ne.SegmentTradeInputData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38169a;
import p402kf.C41014a;
import p429lf.C42180b;
import p557qe.InterfaceC43722d;
import p569qq.C43852m;
import p70.C43406a;
import p70.C43409d;
import p70.C43410e;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q70.C43660g;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u001aH\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010'2\u0006\u00100\u001a\u000201H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010'2\u0006\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u00010#H\u0002J\u0010\u00107\u001a\u0004\u0018\u00010#*\u0004\u0018\u00010#H\u0002J\u0017\u00108\u001a\u0004\u0018\u0001092\u0006\u00100\u001a\u000201H\u0002¢\u0006\u0002\u0010:J\u0010\u0010;\u001a\u00020<2\u0006\u00100\u001a\u000201H\u0002J\b\u0010=\u001a\u00020\u0014H\u0002J\b\u0010>\u001a\u00020\u0014H\u0002J\b\u0010?\u001a\u00020\u0014H\u0002J\b\u0010@\u001a\u00020\u0014H\u0002J\u0010\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020%H\u0002J\u0010\u0010C\u001a\u00020\u00142\u0006\u0010D\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/order/UtaOrderConfirmationDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "data", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "intercept", "Lcom/kubi/utaspotlib/biz/order/UtaOrderInfoConfirmVerifyIntercept;", "dispatcher", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "<init>", "(Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;Lcom/kubi/utaspotlib/biz/order/UtaOrderInfoConfirmVerifyIntercept;Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;)V", "viewBinding", "Lcom/kubi/utaspotlib/databinding/UtaOrderInfoConfirmDialogLayoutBinding;", "getViewBinding", "()Lcom/kubi/utaspotlib/databinding/UtaOrderInfoConfirmDialogLayoutBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "resultCallback", "Lkotlin/Function1;", "", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updateRiskRatio", "updateBorrowAmount", "updateHourlyRate", "getBorrowAmount", "Ljava/math/BigDecimal;", "getColoredText", "Landroid/text/SpannableStringBuilder;", "text", "", "initUI", "updateShowAgainMark", "fetchPreRiskRatio", "Lkotlinx/coroutines/Job;", "updateCurRiskRatio", "initOrderDetailInfo", "containerView", "getDirection", "direction", "Lcom/kubi/core/base/setting/data/TradeDirection;", "getTradeType", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "formatRiskRatio", "riskRatio", "limitRiskRatio", "getTradeDirectionTextColor", "", "(Lcom/kubi/core/base/setting/data/TradeDirection;)Ljava/lang/Integer;", "getTradeDirectionBgDrawable", "Landroid/graphics/drawable/Drawable;", "reportExpose", "reportConfirm", "reportShowAgainMark", "hideSegmentOrderBorrowInfo", "updateSegmentOrderBorrowAmount", "coloredText", "updateSegmentHourlyRate", "hourValueSpan", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtaOrderConfirmationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaOrderConfirmationDialog.kt\ncom/kubi/utaspotlib/biz/order/UtaOrderConfirmationDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n143#2,20:528\n1#3:548\n*S KotlinDebug\n*F\n+ 1 UtaOrderConfirmationDialog.kt\ncom/kubi/utaspotlib/biz/order/UtaOrderConfirmationDialog\n*L\n66#1:528,20\n*E\n"})
public final class UtaOrderConfirmationDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f54159h0 = {Reflection.property1(new PropertyReference1Impl(UtaOrderConfirmationDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/utaspotlib/databinding/UtaOrderInfoConfirmDialogLayoutBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC42808a f54160c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final UtaOrderInfoConfirmVerifyIntercept f54161d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC43722d<InterfaceC42808a, InterfaceC42809b> f54162e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final InterfaceC24293a f54163f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public Function1<? super Boolean, Unit> f54164g0;

    /* JADX INFO: renamed from: Y3 */
    public final BigDecimal m66148Y3(BigDecimal bigDecimal) {
        return (C41014a.m89922G(bigDecimal, null, 1, null).compareTo(BigDecimal.ZERO) < 0 || C41014a.m89922G(bigDecimal, null, 1, null).compareTo(BigDecimal.TEN) >= 0) ? new BigDecimal("9.9999") : bigDecimal;
    }

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$a */
    /* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C26908a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.MARKET_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.ADVANCED_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.LIMIT_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.SEGMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UtaOrderConfirmationDialog(@NotNull InterfaceC42808a data, @NotNull UtaOrderInfoConfirmVerifyIntercept intercept, @NotNull InterfaceC43722d<InterfaceC42808a, InterfaceC42809b> dispatcher) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(intercept, "intercept");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f54160c0 = data;
        this.f54161d0 = intercept;
        this.f54162e0 = dispatcher;
        this.f54163f0 = C45681e.m100799e(this, new Function1<UtaOrderConfirmationDialog, C43660g>() { // from class: com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43660g invoke(@NotNull UtaOrderConfirmationDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C43660g.m96081a(fragment.requireView());
            }
        }, new Function1<C43660g, Unit>() { // from class: com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C43660g it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43660g c43660g) {
                invoke(c43660g);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m66134W3(UtaOrderConfirmationDialog utaOrderConfirmationDialog) {
        Function1<? super Boolean, Unit> function1 = utaOrderConfirmationDialog.f54164g0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        utaOrderConfirmationDialog.f54161d0.mo23274a(new UtaOrderInfoConfirmVerifyInterception(utaOrderConfirmationDialog.f54160c0, "user cancel"));
        utaOrderConfirmationDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public final String m66138K3(BigDecimal bigDecimal) {
        return C42180b.m92649n(bigDecimal != null ? C42180b.m92642g(bigDecimal, null, RoundingMode.UP, 0, false, true, false, 13, null) : null);
    }

    /* JADX INFO: renamed from: L3 */
    public final BigDecimal m66139L3() {
        InterfaceC42808a interfaceC42808a = this.f54160c0;
        if (interfaceC42808a instanceof MarketTradeInputData) {
            return ((MarketTradeInputData) interfaceC42808a).getDiffTradeImp().mo23232s(((MarketTradeInputData) this.f54160c0).getOrderHolderType());
        }
        if (interfaceC42808a instanceof LimitTradeInputData) {
            return ((LimitTradeInputData) interfaceC42808a).getDiffTradeImp().mo23232s(((LimitTradeInputData) this.f54160c0).getOrderHolderType());
        }
        if (interfaceC42808a instanceof SegmentTradeInputData) {
            return ((SegmentTradeInputData) interfaceC42808a).getDiffTradeImp().mo23232s(((SegmentTradeInputData) this.f54160c0).getOrderHolderType());
        }
        return null;
    }

    /* JADX INFO: renamed from: M3 */
    public final SpannableStringBuilder m66140M3(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int color = contextRequireContext.getColor(R$color.c_text);
        int color2 = contextRequireContext.getColor(R$color.c_text40);
        int length = str.length();
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (!Character.isDigit(cCharAt) && cCharAt != '.' && cCharAt != ',') {
                if (i11 != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(color), i11, i12, 0);
                    i11 = -1;
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(color2), i12, i12 + 1, 0);
            } else if (i11 == -1) {
                i11 = i12;
            }
        }
        if (i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), i11, str.length(), 0);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: N3 */
    public final String m66141N3(InterfaceC38169a interfaceC38169a) {
        if (Intrinsics.areEqual(interfaceC38169a, InterfaceC38169a.a.f85864a)) {
            Context context = getContext();
            if (context != null) {
                return context.getString(R$string.buy_in);
            }
            return null;
        }
        if (!Intrinsics.areEqual(interfaceC38169a, InterfaceC38169a.b.f85865a)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context2 = getContext();
        if (context2 != null) {
            return context2.getString(R$string.sell_out);
        }
        return null;
    }

    /* JADX INFO: renamed from: O3 */
    public final Drawable m66142O3(InterfaceC38169a interfaceC38169a) {
        if (Intrinsics.areEqual(interfaceC38169a, InterfaceC38169a.a.f85864a)) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return C22890g.m54287l(C22890g.m54277b(contextRequireContext, R$attr.upColor8), 4.0f);
        }
        if (!Intrinsics.areEqual(interfaceC38169a, InterfaceC38169a.b.f85865a)) {
            throw new NoWhenBranchMatchedException();
        }
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        return C22890g.m54287l(C22890g.m54277b(contextRequireContext2, R$attr.downColor8), 4.0f);
    }

    /* JADX INFO: renamed from: P3 */
    public final Integer m66143P3(InterfaceC38169a interfaceC38169a) {
        if (Intrinsics.areEqual(interfaceC38169a, InterfaceC38169a.a.f85864a)) {
            Context context = getContext();
            if (context != null) {
                return Integer.valueOf(C22890g.m54291p(context));
            }
            return null;
        }
        if (!Intrinsics.areEqual(interfaceC38169a, InterfaceC38169a.b.f85865a)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context2 = getContext();
        if (context2 != null) {
            return Integer.valueOf(C22890g.m54289n(context2));
        }
        return null;
    }

    /* JADX INFO: renamed from: Q3 */
    public final String m66144Q3(TradeType tradeType) {
        switch (C26908a.$EnumSwitchMapping$0[tradeType.ordinal()]) {
            case 1:
                Context context = getContext();
                if (context != null) {
                    return context.getString(R$string.market_price_trade);
                }
                return null;
            case 2:
                Context context2 = getContext();
                if (context2 != null) {
                    return context2.getString(R$string.market_price_stop);
                }
                return null;
            case 3:
                Context context3 = getContext();
                if (context3 != null) {
                    return context3.getString(R$string.kc_advanced_limit_order);
                }
                return null;
            case 4:
                Context context4 = getContext();
                if (context4 != null) {
                    return context4.getString(R$string.limit_price_stop);
                }
                return null;
            case 5:
                Context context5 = getContext();
                if (context5 != null) {
                    return context5.getString(R$string.limit_price_trade);
                }
                return null;
            case 6:
                Context context6 = getContext();
                if (context6 != null) {
                    return context6.getString(R$string.kemex_segment_delegation);
                }
                return null;
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final C43660g m66145R3() {
        return (C43660g) this.f54163f0.getValue(this, f54159h0[0]);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m66146S3() {
        View view;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        if (this.f54160c0 instanceof SegmentTradeInputData) {
            C43660g c43660gM66145R3 = m66145R3();
            if (c43660gM66145R3 != null && (baseTextView4 = c43660gM66145R3.f96391i) != null) {
                ViewExtKt.m66577h(baseTextView4);
            }
            C43660g c43660gM66145R4 = m66145R3();
            if (c43660gM66145R4 != null && (baseTextView3 = c43660gM66145R4.f96392j) != null) {
                ViewExtKt.m66577h(baseTextView3);
            }
            C43660g c43660gM66145R5 = m66145R3();
            if (c43660gM66145R5 != null && (baseTextView2 = c43660gM66145R5.f96394l) != null) {
                ViewExtKt.m66577h(baseTextView2);
            }
            C43660g c43660gM66145R6 = m66145R3();
            if (c43660gM66145R6 != null && (baseTextView = c43660gM66145R6.f96395m) != null) {
                ViewExtKt.m66577h(baseTextView);
            }
            C43660g c43660gM66145R7 = m66145R3();
            if (c43660gM66145R7 == null || (view = c43660gM66145R7.f96403u) == null) {
                return;
            }
            ViewExtKt.m66577h(view);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m66149Z3() {
        C43852m.m96591c("B5UnifyTrading", "SpotConfirm", "3", null, 8, null);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m66150a4() {
        C43852m.m96595g("B5UnifyTrading", "SpotConfirm", null, null, 12, null);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m66152c4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (!C26918e.m66176g(this.f54160c0)) {
            C43660g c43660gM66145R3 = m66145R3();
            if (c43660gM66145R3 != null && (baseTextView3 = c43660gM66145R3.f96391i) != null) {
                ViewExtKt.m66577h(baseTextView3);
            }
            C43660g c43660gM66145R4 = m66145R3();
            if (c43660gM66145R4 == null || (baseTextView2 = c43660gM66145R4.f96392j) == null) {
                return;
            }
            ViewExtKt.m66577h(baseTextView2);
            return;
        }
        m66146S3();
        String strM66174e = C26918e.m66174e(this.f54160c0);
        SpannableStringBuilder spannableStringBuilderM66140M3 = m66140M3(strM66174e);
        C43660g c43660gM66145R5 = m66145R3();
        if (c43660gM66145R5 != null && (baseTextView = c43660gM66145R5.f96392j) != null) {
            baseTextView.setText(spannableStringBuilderM66140M3);
        }
        m66157h4(spannableStringBuilderM66140M3);
        C44128b.m97258b("updateBorrowAmount: borrowAmount=" + strM66174e);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m66154e4() {
        C43660g c43660gM66145R3;
        View view;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Boolean boolValueOf = null;
        if (C26918e.m66176g(this.f54160c0)) {
            m66146S3();
            String strM66175f = C26918e.m66175f(this.f54160c0);
            if (strM66175f == null) {
                return;
            }
            IUnifyAccountService.f53155a.get().mo64982F(strM66175f);
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UtaOrderConfirmationDialog$updateHourlyRate$1(strM66175f, this, null), 3, null);
            return;
        }
        C43660g c43660gM66145R4 = m66145R3();
        if (c43660gM66145R4 != null && (baseTextView3 = c43660gM66145R4.f96394l) != null) {
            ViewExtKt.m66577h(baseTextView3);
        }
        C43660g c43660gM66145R5 = m66145R3();
        if (c43660gM66145R5 != null && (baseTextView2 = c43660gM66145R5.f96395m) != null) {
            ViewExtKt.m66577h(baseTextView2);
        }
        C43660g c43660gM66145R6 = m66145R3();
        if (c43660gM66145R6 != null && (baseTextView = c43660gM66145R6.f96392j) != null) {
            boolValueOf = Boolean.valueOf(C27046k.m66704s(baseTextView));
        }
        if (C27025c.m66566d(boolValueOf) || (c43660gM66145R3 = m66145R3()) == null || (view = c43660gM66145R3.f96403u) == null) {
            return;
        }
        ViewExtKt.m66577h(view);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m66155f4() {
        View view;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView6;
        if (C26918e.m66177h(this.f54160c0)) {
            C43660g c43660gM66145R3 = m66145R3();
            if (c43660gM66145R3 != null && (baseTextView6 = c43660gM66145R3.f96398p) != null) {
                ViewExtKt.m66594y(baseTextView6);
            }
            C43660g c43660gM66145R4 = m66145R3();
            if (c43660gM66145R4 != null && (appCompatImageView2 = c43660gM66145R4.f96388f) != null) {
                ViewExtKt.m66594y(appCompatImageView2);
            }
            C43660g c43660gM66145R5 = m66145R3();
            if (c43660gM66145R5 != null && (baseTextView5 = c43660gM66145R5.f96393k) != null) {
                ViewExtKt.m66594y(baseTextView5);
            }
            C43660g c43660gM66145R6 = m66145R3();
            if (c43660gM66145R6 != null && (baseTextView4 = c43660gM66145R6.f96397o) != null) {
                ViewExtKt.m66594y(baseTextView4);
            }
            m66137J3();
            m66153d4();
            return;
        }
        C43660g c43660gM66145R7 = m66145R3();
        if (c43660gM66145R7 != null && (baseTextView3 = c43660gM66145R7.f96398p) != null) {
            ViewExtKt.m66577h(baseTextView3);
        }
        C43660g c43660gM66145R8 = m66145R3();
        if (c43660gM66145R8 != null && (appCompatImageView = c43660gM66145R8.f96388f) != null) {
            ViewExtKt.m66577h(appCompatImageView);
        }
        C43660g c43660gM66145R9 = m66145R3();
        if (c43660gM66145R9 != null && (baseTextView2 = c43660gM66145R9.f96393k) != null) {
            ViewExtKt.m66577h(baseTextView2);
        }
        C43660g c43660gM66145R10 = m66145R3();
        if (c43660gM66145R10 != null && (baseTextView = c43660gM66145R10.f96397o) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        C43660g c43660gM66145R11 = m66145R3();
        if (c43660gM66145R11 == null || (view = c43660gM66145R11.f96404v) == null) {
            return;
        }
        ViewExtKt.m66577h(view);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m66156g4(SpannableStringBuilder spannableStringBuilder) {
        C43660g c43660gM66145R3;
        FrameLayout frameLayout;
        TextView textView;
        if (!(this.f54160c0 instanceof SegmentTradeInputData) || (c43660gM66145R3 = m66145R3()) == null || (frameLayout = c43660gM66145R3.f96386d) == null || (textView = (TextView) frameLayout.findViewById(R$id.tvHourValueSegment)) == null) {
            return;
        }
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m66157h4(SpannableStringBuilder spannableStringBuilder) {
        C43660g c43660gM66145R3;
        FrameLayout frameLayout;
        TextView textView;
        if (!(this.f54160c0 instanceof SegmentTradeInputData) || (c43660gM66145R3 = m66145R3()) == null || (frameLayout = c43660gM66145R3.f96386d) == null || (textView = (TextView) frameLayout.findViewById(R$id.tvBorrowAmountValueSegment)) == null) {
            return;
        }
        textView.setText(spannableStringBuilder);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54250y3(0);
        m54249x3(1.0f - (C5275i0.m6236a(64.0f) / C5267e0.m6182d()));
        return inflater.inflate(R$layout.uta_order_info_confirm_dialog_layout, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m66132U3();
        m66155f4();
        m66152c4();
        m66154e4();
        m66150a4();
    }

    /* JADX INFO: renamed from: U3 */
    private final void m66132U3() {
        KcPrimaryButton kcPrimaryButton;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView;
        FrameLayout frameLayout;
        C43660g c43660gM66145R3 = m66145R3();
        if (c43660gM66145R3 != null && (frameLayout = c43660gM66145R3.f96386d) != null) {
            m66147T3(frameLayout);
        }
        C43660g c43660gM66145R4 = m66145R3();
        if (c43660gM66145R4 != null && (baseTextView = c43660gM66145R4.f96396n) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.order.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaOrderConfirmationDialog.m66133V3(this.f54167b);
                }
            }, 1, null);
        }
        C43660g c43660gM66145R5 = m66145R3();
        if (c43660gM66145R5 != null && (appCompatImageView = c43660gM66145R5.f96387e) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.order.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaOrderConfirmationDialog.m66134W3(this.f54168b);
                }
            }, 1, null);
        }
        C43660g c43660gM66145R6 = m66145R3();
        if (c43660gM66145R6 != null && (kcPrimaryButton = c43660gM66145R6.f96384b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.order.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaOrderConfirmationDialog.m66135X3(this.f54169b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m66133V3(UtaOrderConfirmationDialog utaOrderConfirmationDialog) {
        CheckBox checkBox;
        C43660g c43660gM66145R3 = utaOrderConfirmationDialog.m66145R3();
        if (c43660gM66145R3 != null && (checkBox = c43660gM66145R3.f96385c) != null) {
            checkBox.performClick();
        }
        utaOrderConfirmationDialog.m66151b4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m66135X3(UtaOrderConfirmationDialog utaOrderConfirmationDialog) {
        utaOrderConfirmationDialog.m66158i4();
        Function1<? super Boolean, Unit> function1 = utaOrderConfirmationDialog.f54164g0;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        utaOrderConfirmationDialog.f54161d0.mo23275b(utaOrderConfirmationDialog.f54160c0);
        utaOrderConfirmationDialog.f54162e0.mo96274a(utaOrderConfirmationDialog.f54161d0, utaOrderConfirmationDialog.f54160c0);
        utaOrderConfirmationDialog.dismiss();
        utaOrderConfirmationDialog.m66149Z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public final InterfaceC41775x1 m66137J3() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UtaOrderConfirmationDialog$fetchPreRiskRatio$1(this, null));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m66147T3(ViewGroup viewGroup) {
        ShapeTextView shapeTextView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C43660g c43660gM66145R3 = m66145R3();
        if (c43660gM66145R3 != null && (baseTextView2 = c43660gM66145R3.f96399q) != null) {
            baseTextView2.setText(this.f54160c0.mo93837c());
        }
        C43660g c43660gM66145R4 = m66145R3();
        if (c43660gM66145R4 != null && (baseTextView = c43660gM66145R4.f96401s) != null) {
            baseTextView.setText(m66141N3(this.f54160c0.mo93836b()));
            Integer numM66143P3 = m66143P3(this.f54160c0.mo93836b());
            if (numM66143P3 != null) {
                baseTextView.setTextColor(numM66143P3.intValue());
            }
            baseTextView.setBackgroundDrawable(m66142O3(this.f54160c0.mo93836b()));
        }
        C43660g c43660gM66145R5 = m66145R3();
        if (c43660gM66145R5 != null && (shapeTextView = c43660gM66145R5.f96389g) != null) {
            shapeTextView.setText(m66144Q3(this.f54160c0.mo93835a()));
        }
        InterfaceC42808a interfaceC42808a = this.f54160c0;
        if (interfaceC42808a instanceof LimitTradeInputData) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            viewGroup.addView(C43406a.m95590d(contextRequireContext, (LimitTradeInputData) this.f54160c0));
        } else if (interfaceC42808a instanceof MarketTradeInputData) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            viewGroup.addView(C43409d.m95597c(contextRequireContext2, (MarketTradeInputData) this.f54160c0));
        } else if (interfaceC42808a instanceof SegmentTradeInputData) {
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            viewGroup.addView(C43410e.m95598a(contextRequireContext3, (SegmentTradeInputData) this.f54160c0));
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m66151b4() {
        String str;
        CheckBox checkBox;
        C43660g c43660gM66145R3 = m66145R3();
        if (c43660gM66145R3 != null && (checkBox = c43660gM66145R3.f96385c) != null && checkBox.isChecked()) {
            str = "1";
        } else {
            str = "0";
        }
        C43852m.m96591c("B5UnifyTrading", "SpotConfirmAgain", str, null, 8, null);
    }

    /* JADX INFO: renamed from: d4 */
    public final InterfaceC41775x1 m66153d4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UtaOrderConfirmationDialog$updateCurRiskRatio$1(this, null));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m66158i4() {
        CheckBox checkBox;
        C43660g c43660gM66145R3 = m66145R3();
        if (c43660gM66145R3 != null && (checkBox = c43660gM66145R3.f96385c) != null && checkBox.isChecked()) {
            C26914a.m66169k(false);
        } else {
            C26914a.m66169k(true);
        }
    }
}
