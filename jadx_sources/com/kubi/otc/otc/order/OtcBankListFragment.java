package com.kubi.otc.otc.order;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.webkit.ProxyConfig;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.cpiz.android.bubbleview.C5392c;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$font;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatBankCardOrder;
import com.kubi.otc.entity.RechargeOrderDetail;
import com.kubi.otc.fast.PayFiatOrderDetailFragment;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import et.InterfaceC37240b;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: OtcBankListFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0014J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002J$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0014J\b\u0010\"\u001a\u00020\u0014H\u0014R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/otc/otc/order/OtcBankListFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/otc/entity/FiatBankCardOrder;", "<init>", "()V", "mApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/otc/api/FiatApi;", "mApi$delegate", "Lkotlin/Lazy;", "getItemLayout", "", "bubbleWindow", "Lcom/cpiz/android/bubbleview/BubblePopupWindow;", "getBubbleWindow", "()Lcom/cpiz/android/bubbleview/BubblePopupWindow;", "bubbleWindow$delegate", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "bindOrderStatus", "orderStatusView", "Landroid/widget/TextView;", "orderStatusIcon", "Landroid/widget/ImageView;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "onReBack", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcBankListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcBankListFragment.kt\ncom/kubi/otc/otc/order/OtcBankListFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,220:1\n172#2,2:221\n*S KotlinDebug\n*F\n+ 1 OtcBankListFragment.kt\ncom/kubi/otc/otc/order/OtcBankListFragment\n*L\n75#1:221,2\n*E\n"})
public final class OtcBankListFragment extends BasePagingFragment<FiatBankCardOrder> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37836Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.order.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcBankListFragment.m44983U3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f37837a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.order.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcBankListFragment.m44981R3(this.f37847b);
        }
    });

    /* JADX INFO: renamed from: P3 */
    public final void m44985P3(final TextView textView, ImageView imageView, final FiatBankCardOrder fiatBankCardOrder) {
        String stringRes;
        int i11 = R$color.c_text40;
        C27046k.m66700o(imageView);
        int iM66650j = C27039d.m66650j(fiatBankCardOrder != null ? fiatBankCardOrder.getOrderStatus() : null);
        if (iM66650j == 0) {
            stringRes = getStringRes(R$string.payment_status_processing, new Object[0]);
            i11 = R$color.primary;
        } else if (iM66650j == 1) {
            stringRes = getStringRes(R$string.success, new Object[0]);
        } else if (iM66650j == 2) {
            if ((fiatBankCardOrder != null ? fiatBankCardOrder.getRechargeOrderDetail() : null) == null) {
                stringRes = getStringRes(R$string.order_cancelled, new Object[0]);
            } else {
                Integer rechargeOrderStatus = fiatBankCardOrder.getRechargeOrderDetail().getRechargeOrderStatus();
                if (rechargeOrderStatus != null && rechargeOrderStatus.intValue() == 1) {
                    stringRes = getStringRes(R$string.failed, new Object[0]);
                    i11 = R$color.complementary;
                    C27046k.m66685H(imageView);
                } else if (rechargeOrderStatus != null && rechargeOrderStatus.intValue() == 2) {
                    stringRes = getStringRes(R$string.failed, new Object[0]);
                    i11 = R$color.brandRed;
                } else {
                    stringRes = getStringRes(R$string.failed, new Object[0]);
                    i11 = R$color.brandRed;
                }
            }
        } else if (iM66650j != 3) {
            stringRes = (iM66650j == 4 || iM66650j == 5) ? getStringRes(R$string.order_cancelled, new Object[0]) : "";
        } else {
            stringRes = getStringRes(R$string.failed, new Object[0]);
        }
        textView.setText(stringRes);
        textView.setTextColor(getColorRes(i11));
        C27046k.m66681D(new View[]{textView, imageView}, new Function0() { // from class: com.kubi.otc.otc.order.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtcBankListFragment.m44980Q3(fiatBankCardOrder, this, textView);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m44978N3(OtcBankListFragment otcBankListFragment, BaseViewHolder baseViewHolder) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.otc_fast_order);
        String string = otcBankListFragment.getString(R$string.otc_fast_order_desc, ProxyConfig.MATCH_ALL_SCHEMES);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{ProxyConfig.MATCH_ALL_SCHEMES}, false, 0, 6, (Object) null);
        C27096v0 c27096v0Append = new C27096v0().append((CharSequence) listSplit$default.get(0));
        Drawable drawableM66510d = C27017c.m66510d(C27017c.f54310a, R$mipmap.botc_ic_lightning, null, 2, null);
        drawableM66510d.setBounds(0, 0, C27029c.m66604g(baseViewHolder, 15), C27029c.m66604g(baseViewHolder, 20));
        alertDialogFragmentHelperM54167X4.m54155L4(c27096v0Append.m66906f(drawableM66510d).append((CharSequence) listSplit$default.get(1))).m54162S4(R$string.confirm, null).m54172c5(otcBankListFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m44979O3(OtcBankListFragment otcBankListFragment, FiatBankCardOrder fiatBankCardOrder) {
        PayFiatOrderDetailFragment.Companion companion = PayFiatOrderDetailFragment.f37258X;
        Context mContext = otcBankListFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        companion.startFragment(mContext, C27041f.m66668h(fiatBankCardOrder != null ? fiatBankCardOrder.getOrderId() : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m44980Q3(FiatBankCardOrder fiatBankCardOrder, OtcBankListFragment otcBankListFragment, TextView textView) {
        Integer orderStatus;
        RechargeOrderDetail rechargeOrderDetail;
        Integer rechargeOrderStatus;
        if (fiatBankCardOrder != null && (orderStatus = fiatBankCardOrder.getOrderStatus()) != null && orderStatus.intValue() == 2 && (rechargeOrderDetail = fiatBankCardOrder.getRechargeOrderDetail()) != null && (rechargeOrderStatus = rechargeOrderDetail.getRechargeOrderStatus()) != null && rechargeOrderStatus.intValue() == 1) {
            otcBankListFragment.m44986S3().m7079m(textView, BubbleStyle.ArrowDirection.Down);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final C5392c m44981R3(OtcBankListFragment otcBankListFragment) {
        int iM66658b = C27040e.m66658b(12);
        BubbleTextView bubbleTextView = new BubbleTextView(otcBankListFragment.mContext);
        bubbleTextView.setMaxLines(3);
        bubbleTextView.setText(otcBankListFragment.getStringRes(R$string.payment_fast_deposit_buy_failed_tip, new Object[0]));
        bubbleTextView.setArrowDirection(BubbleStyle.ArrowDirection.Down);
        bubbleTextView.setArrowHeight(C27040e.m66657a(8.0f));
        bubbleTextView.setArrowWidth(C27040e.m66657a(12.0f));
        bubbleTextView.setTextSize(2, 14.0f);
        bubbleTextView.setTextColor(ContextCompat.getColor(otcBankListFragment.mContext, R$color.c_white));
        bubbleTextView.setCornerRadius(C27040e.m66657a(8.0f));
        bubbleTextView.setPadding(iM66658b, iM66658b, iM66658b, iM66658b);
        bubbleTextView.setTypeface(ResourcesCompat.getFont(bubbleTextView.getContext(), R$font.regular));
        bubbleTextView.mo6996a(iM66658b, iM66658b, iM66658b, iM66658b);
        bubbleTextView.setFillColor(ContextCompat.getColor(otcBankListFragment.mContext, R$color.c_toolTip));
        C5392c c5392c = new C5392c(bubbleTextView, bubbleTextView);
        c5392c.m7078l(iM66658b);
        c5392c.m7076j(true);
        c5392c.m7077k(true);
        return c5392c;
    }

    /* JADX INFO: renamed from: T3 */
    private final InterfaceC37240b m44982T3() {
        return (InterfaceC37240b) this.f37836Z.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: M3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable final BaseViewHolder baseViewHolder, @Nullable final FiatBankCardOrder fiatBankCardOrder) {
        int iM54289n;
        String fiatAmount;
        if (baseViewHolder != null) {
            boolean zM66566d = C27025c.m66566d(fiatBankCardOrder != null ? Boolean.valueOf(fiatBankCardOrder.isBuyType()) : null);
            int i11 = R$id.iv_side;
            baseViewHolder.setImageResource(i11, zM66566d ? R$drawable.ic2_plus_16 : R$drawable.ic2_sub_16);
            View view = baseViewHolder.getView(i11);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C27046k.m66701p((ImageView) view, ContextCompat.getColor(this.mContext, zM66566d ? R$color.brandGreen : R$color.brandRed));
            int i12 = R$id.tv_side;
            baseViewHolder.setText(i12, zM66566d ? R$string.buy : R$string.sell);
            baseViewHolder.setText(R$id.tv_name, fiatBankCardOrder != null ? fiatBankCardOrder.getCryptoCurrency() : null);
            int i13 = R$id.tv_amount_title;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R$string.amount));
            sb2.append('(');
            sb2.append(fiatBankCardOrder != null ? fiatBankCardOrder.getCryptoCurrency() : null);
            sb2.append(')');
            baseViewHolder.setText(i13, sb2.toString());
            int i14 = R$id.tv_price_title;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getString(R$string.trade_total_amount));
            sb3.append('(');
            sb3.append(fiatBankCardOrder != null ? fiatBankCardOrder.getFiatCurrency() : null);
            sb3.append(')');
            baseViewHolder.setText(i14, sb3.toString());
            baseViewHolder.setText(R$id.tv_amount_value, fiatBankCardOrder != null ? fiatBankCardOrder.getCryptoQuantity() : null);
            baseViewHolder.setText(R$id.tv_pay_name, C27041f.m66668h(fiatBankCardOrder != null ? fiatBankCardOrder.getPaymentName() : null));
            baseViewHolder.setText(R$id.tv_price_value, C27041f.m66668h((fiatBankCardOrder == null || (fiatAmount = fiatBankCardOrder.getFiatAmount()) == null) ? null : C41014a.m89945s(fiatAmount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null)));
            baseViewHolder.setText(R$id.tv_time_value, TimeUtils.m66422i(C27039d.m66652l(fiatBankCardOrder != null ? fiatBankCardOrder.getCreatedAt() : null)));
            TextView textView = (TextView) baseViewHolder.getView(i12);
            if (zM66566d) {
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                iM54289n = C22890g.m54291p(mContext);
            } else {
                Context mContext2 = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                iM54289n = C22890g.m54289n(mContext2);
            }
            textView.setTextColor(iM54289n);
            View view2 = baseViewHolder.getView(R$id.tv_status);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            View view3 = baseViewHolder.getView(R$id.iv_status);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            m44985P3((TextView) view2, (ImageView) view3, fiatBankCardOrder);
            View view4 = baseViewHolder.getView(R$id.iv_fast);
            if (view4 != null) {
                C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.otc.otc.order.e
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtcBankListFragment.m44978N3(this.f37848b, baseViewHolder);
                    }
                }, 1, null);
            }
            View itemView = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.otc.order.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcBankListFragment.m44979O3(this.f37850b, fiatBankCardOrder);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final C5392c m44986S3() {
        return (C5392c) this.f37837a0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.botc_item_fiat_order;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public static final InterfaceC37240b m44983U3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        super.onReBack();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<FiatBankCardOrder>> mo16440r3(int i11, int i12) {
        Observable observableCompose = m44982T3().m83293f(i11, i12).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
