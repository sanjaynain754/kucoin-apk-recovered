package com.kubi.otc.otc.order;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.util.TypedValueCompat;
import androidx.fragment.app.FragmentManager;
import androidx.webkit.ProxyConfig;
import com.kubi.chat.service.ChatClient;
import com.kubi.otc.OtcUserManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.OrderImInfo;
import com.kubi.otc.entity.OtcOrder;
import com.kubi.payment.chat.ChatConfig;
import com.kubi.payment.chat.entity.ChatInfo;
import com.kubi.payment.chat.p105ui.ChatFragment;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.trade.EndItemDecoration;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37241c;
import f00.C37304a;
import g00.InterfaceC37758j;
import g00.InterfaceC37759k;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p638tb.AbstractC44914a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: OtcOrderListFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u001c\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0014J,\u0010\"\u001a&\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0012j\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u0001`\u0013H\u0002J\u0010\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020&0%2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001cH\u0014J\b\u0010)\u001a\u00020\u0015H\u0014J\u0016\u0010*\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0012j\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u0001`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/otc/otc/order/OtcOrderListFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/otc/entity/OtcOrder;", "<init>", "()V", "orderApi", "Lcom/kubi/otc/api/OtcApi;", "kotlin.jvm.PlatformType", "getOrderApi", "()Lcom/kubi/otc/api/OtcApi;", "orderApi$delegate", "Lkotlin/Lazy;", "side", "", "status", "isFromP2PContainer", "", "statusTypeMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "getLayout", "", "getItemLayout", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getLocalOtcOrderStatusTypeMap", "byName", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "onReBack", "onFilter", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OtcOrderListFragment extends BasePagingFragment<OtcOrder> {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f37838e0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37839Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.order.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcOrderListFragment.m44998X3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f37840a0 = "";

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f37841b0 = "";

    /* JADX INFO: renamed from: c0 */
    public boolean f37842c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public LinkedHashMap<String, String> f37843d0;

    /* JADX INFO: compiled from: OtcOrderListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/otc/otc/order/OtcOrderListFragment$Companion;", "", "<init>", "()V", "P2P_EXPRESS", "", "STATUS_SUCCEEDED", "STATUS_FAILED", "STATUS_CONVERTING", "KEY_STATUS", "KEY_IS_FROM_P2P_CONTAINER", "newInstance", "Lcom/kubi/otc/otc/order/OtcOrderListFragment;", "tradeSide", "status", "isFromP2PContainer", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ OtcOrderListFragment newInstance$default(Companion companion, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.newInstance(str, str2, z11);
        }

        @NotNull
        public final OtcOrderListFragment newInstance(@NotNull String tradeSide, @Nullable String status, boolean isFromP2PContainer) {
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            OtcOrderListFragment otcOrderListFragment = new OtcOrderListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("side", tradeSide);
            bundle.putString("key_status", status);
            bundle.putBoolean("key_is_from_p2p_container", isFromP2PContainer);
            otcOrderListFragment.setArguments(bundle);
            return otcOrderListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.order.OtcOrderListFragment$a */
    /* JADX INFO: compiled from: OtcOrderListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/otc/otc/order/OtcOrderListFragment$bindDataToView$1$2$1$1", "Lcom/kubi/chat/service/AbsChatUIListener;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20078a extends AbstractC44914a {
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m44995Q3(OtcOrder otcOrder, OtcOrderListFragment otcOrderListFragment) {
        if (C27025c.m66566d(otcOrder != null ? otcOrder.getBuyerRole() : null) || C27025c.m66566d(OtcUserManager.f38144a.m45490j().getBindTradePassword())) {
            InterfaceC37758j.a.m85164m(C37304a.f82764a, C27025c.m66566d(otcOrder != null ? otcOrder.getBuyerRole() : null) ? 1L : 0L, C27041f.m66668h(otcOrder != null ? otcOrder.getId() : null), null, null, null, null, 60, null);
        } else {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.rule_limit).m54153J4(R$string.otc_deal_tips).m54148E4(R$layout.botc_view_otc_received_way_error, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.otc.otc.order.l
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    OtcOrderListFragment.m44996R3(baseViewHolder, dialogFragmentHelper);
                }
            }).m54159P4(R$string.cancel, null).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.otc.order.m
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    OtcOrderListFragment.m44997S3(dialogInterface, i11);
                }
            });
            FragmentManager childFragmentManager = otcOrderListFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alertDialogFragmentHelperM54162S4.show(childFragmentManager, "otcDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d6  */
    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable final BaseViewHolder baseViewHolder, @Nullable final OtcOrder otcOrder) {
        int iM54289n;
        OrderImInfo imRelationshipDto;
        BigDecimal legalCurrencyAmount;
        boolean zM66566d = C27025c.m66566d(otcOrder != null ? otcOrder.getBuyerRole() : null);
        if (baseViewHolder != null) {
            baseViewHolder.setGone(R$id.tv_p2p_express, Intrinsics.areEqual(C27041f.m66668h(otcOrder != null ? otcOrder.getOrderSource() : null), "P2P Express") && zM66566d);
            baseViewHolder.setImageResource(R$id.iv_side, zM66566d ? R$mipmap.payment_ic_buy : R$mipmap.payment_ic_sell);
            int i11 = R$id.tv_side;
            baseViewHolder.setText(i11, zM66566d ? R$string.buy : R$string.sell);
            baseViewHolder.setText(R$id.tv_name, otcOrder != null ? otcOrder.getOpTraderNickName() : null);
            baseViewHolder.setText(R$id.tv_label_name, otcOrder != null ? otcOrder.getCurrency() : null);
            int i12 = R$id.tv_amount_title;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R$string.amount));
            sb2.append('(');
            sb2.append(otcOrder != null ? otcOrder.getCurrency() : null);
            sb2.append(')');
            baseViewHolder.setText(i12, sb2.toString());
            int i13 = R$id.tv_price_title;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getString(R$string.trade_total_amount));
            sb3.append('(');
            sb3.append(otcOrder != null ? otcOrder.getLegalCurrency() : null);
            sb3.append(')');
            baseViewHolder.setText(i13, sb3.toString());
            baseViewHolder.setText(R$id.tv_amount_value, C27039d.m66643c(otcOrder != null ? otcOrder.getCurrencyAmount() : null));
            baseViewHolder.setText(R$id.tv_price_value, C27041f.m66668h((otcOrder == null || (legalCurrencyAmount = otcOrder.getLegalCurrencyAmount()) == null) ? null : legalCurrencyAmount.toPlainString()));
            baseViewHolder.setText(R$id.tv_time_value, TimeUtils.m66422i(C27039d.m66652l(otcOrder != null ? otcOrder.getCreatedAt() : null)));
            int i14 = R$id.iv_fast;
            baseViewHolder.setGone(i14, C27025c.m66566d(otcOrder != null ? Boolean.valueOf(otcOrder.isFast()) : null));
            baseViewHolder.setGone(R$id.view_unread_dot, C27025c.m66566d((otcOrder == null || (imRelationshipDto = otcOrder.getImRelationshipDto()) == null) ? null : imRelationshipDto.getMessageUnread()));
            TextView textView = (TextView) baseViewHolder.getView(i11);
            if (textView != null) {
                if (C27025c.m66566d(otcOrder != null ? otcOrder.getBuyerRole() : null)) {
                    Context mContext = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                    iM54289n = C22890g.m54291p(mContext);
                } else {
                    Context mContext2 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                    iM54289n = C22890g.m54289n(mContext2);
                }
                textView.setTextColor(iM54289n);
            }
            TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_status);
            if (Intrinsics.areEqual(C27041f.m66668h(otcOrder != null ? otcOrder.getAppealStatus() : null), OrderDetailInfo.APPEAL_STATUS_APPEALING)) {
                if (textView2 != null) {
                    textView2.setTextColor(getColorRes(R$color.secondary));
                }
                if (textView2 != null) {
                    textView2.setText(getString(R$string.appealing));
                }
            } else {
                String strM45000T3 = m45000T3(C27041f.m66668h(otcOrder != null ? otcOrder.getStatus() : null));
                int iHashCode = strM45000T3.hashCode();
                if (iHashCode != 2104194) {
                    if (iHashCode != 659453081) {
                        if (iHashCode == 907287315 && strM45000T3.equals("PROCESSING")) {
                            if (textView2 != null) {
                                textView2.setTextColor(getColorRes(R$color.primary));
                            }
                        } else if (textView2 != null) {
                            textView2.setTextColor(getColorRes(R$color.c_text40));
                        }
                    } else if (strM45000T3.equals(OrderDetailInfo.ORDER_STATUS_CANCELED)) {
                        if (textView2 != null) {
                            textView2.setTextColor(getColorRes(R$color.c_text20));
                        }
                    } else if (textView2 != null) {
                        textView2.setTextColor(getColorRes(R$color.c_text40));
                    }
                } else if (strM45000T3.equals("DONE")) {
                    if (textView2 != null) {
                        textView2.setTextColor(getColorRes(R$color.c_text40));
                    }
                } else if (textView2 != null) {
                    textView2.setTextColor(getColorRes(R$color.c_text40));
                }
                String status = otcOrder != null ? otcOrder.getStatus() : null;
                if (Intrinsics.areEqual(status, "CREATED")) {
                    if (textView2 != null) {
                        textView2.setText(R$string.unpaid);
                    }
                } else if (Intrinsics.areEqual(status, OrderDetailInfo.ORDER_STATUS_PAYED_MONEY)) {
                    if (textView2 != null) {
                        textView2.setText(R$string.wait_release);
                    }
                } else if (textView2 != null) {
                    LinkedHashMap<String, String> linkedHashMapM45001U3 = m45001U3();
                    Intrinsics.checkNotNull(linkedHashMapM45001U3);
                    textView2.setText(linkedHashMapM45001U3.get(strM45000T3));
                }
            }
            View view = baseViewHolder.getView(i14);
            if (view != null) {
                C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.otc.otc.order.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtcOrderListFragment.m44993O3(this.f37855b, baseViewHolder);
                    }
                }, 1, null);
            }
            View view2 = baseViewHolder.getView(R$id.view_chat);
            if (C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
                Intrinsics.checkNotNull(view2);
                C27046k.m66685H(view2);
            } else {
                Intrinsics.checkNotNull(view2);
                C27046k.m66700o(view2);
            }
            C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.otc.otc.order.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcOrderListFragment.m44994P3(baseViewHolder, otcOrder, this);
                }
            }, 1, null);
            View itemView = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.otc.order.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcOrderListFragment.m44995Q3(otcOrder, this);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m44993O3(OtcOrderListFragment otcOrderListFragment, BaseViewHolder baseViewHolder) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.otc_fast_order);
        String string = otcOrderListFragment.getString(R$string.otc_fast_order_desc, ProxyConfig.MATCH_ALL_SCHEMES);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{ProxyConfig.MATCH_ALL_SCHEMES}, false, 0, 6, (Object) null);
        C27096v0 c27096v0Append = new C27096v0().append((CharSequence) listSplit$default.get(0));
        Drawable drawableM66510d = C27017c.m66510d(C27017c.f54310a, R$mipmap.botc_ic_lightning, null, 2, null);
        drawableM66510d.setBounds(0, 0, C27029c.m66604g(baseViewHolder, 15), C27029c.m66604g(baseViewHolder, 20));
        alertDialogFragmentHelperM54167X4.m54155L4(c27096v0Append.m66906f(drawableM66510d).append((CharSequence) listSplit$default.get(1))).m54162S4(R$string.confirm, null).m54172c5(otcOrderListFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m44994P3(BaseViewHolder baseViewHolder, OtcOrder otcOrder, OtcOrderListFragment otcOrderListFragment) {
        OrderImInfo imRelationshipDto;
        OrderImInfo imRelationshipDto2;
        baseViewHolder.setGone(R$id.view_unread_dot, false);
        String to2 = null;
        String from = (otcOrder == null || (imRelationshipDto2 = otcOrder.getImRelationshipDto()) == null) ? null : imRelationshipDto2.getFrom();
        if (otcOrder != null && (imRelationshipDto = otcOrder.getImRelationshipDto()) != null) {
            to2 = imRelationshipDto.getTo();
        }
        if (from == null || from.length() == 0 || to2 == null || to2.length() == 0) {
            return Unit.INSTANCE;
        }
        ChatClient.Companion companion = ChatClient.INSTANCE;
        companion.init(new ChatConfig(from));
        ChatClient chatClient = companion.get();
        if (chatClient != null) {
            chatClient.m20390e(to2);
        }
        ChatClient chatClient2 = companion.get();
        if (chatClient2 != null) {
            chatClient2.m20395j("orderList", new C20078a());
        }
        BaseActivity.Companion companion2 = BaseActivity.INSTANCE;
        Context mContext = otcOrderListFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        Bundle bundle = new Bundle();
        bundle.putString("oId", otcOrder.getId());
        bundle.putString("adRemark", C27041f.m66668h(otcOrder.getAdRemarks()));
        bundle.putBoolean("isMerchant", C27025c.m66566d(otcOrder.getDisplayOpTradeInfo()));
        bundle.putBoolean("isForbid", !C27025c.m66567e(otcOrder.getCanChat(), true));
        bundle.putParcelable("info", new ChatInfo(from, otcOrder.getImRelationshipDto().getFromName(), to2, otcOrder.getImRelationshipDto().getToName()));
        Unit unit = Unit.INSTANCE;
        companion2.launch(mContext, ChatFragment.class, bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m44996R3(BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        int i11 = R$id.tv_error_one;
        helper.setGone(i11, !C27025c.m66566d(OtcUserManager.f38144a.m45490j().getBindTradePassword())).setText(i11, R$string.open_trade_pwd).setGone(R$id.tv_error_two, true);
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m44997S3(DialogInterface dialogInterface, int i11) {
        Intrinsics.checkNotNullParameter(dialogInterface, "<unused var>");
        if (C27025c.m66566d(OtcUserManager.f38144a.m45490j().getBindTradePassword())) {
            return;
        }
        InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
    }

    /* JADX INFO: renamed from: T3 */
    public final String m45000T3(String str) {
        return (Intrinsics.areEqual(str, "CREATED") || Intrinsics.areEqual(str, OrderDetailInfo.ORDER_STATUS_PAYED_MONEY)) ? "PROCESSING" : str;
    }

    /* JADX INFO: renamed from: U3 */
    public final LinkedHashMap<String, String> m45001U3() {
        if (this.f37843d0 == null) {
            this.f37843d0 = new LinkedHashMap<>();
        }
        LinkedHashMap<String, String> linkedHashMap = this.f37843d0;
        if (linkedHashMap != null) {
            linkedHashMap.put("PROCESSING", getStringRes(R$string.payment_status_processing, new Object[0]));
            linkedHashMap.put("DONE", getStringRes(R$string.completed, new Object[0]));
            linkedHashMap.put(OrderDetailInfo.ORDER_STATUS_CANCELED, getStringRes(R$string.canceled, new Object[0]));
            linkedHashMap.put("SUCCEEDED", getStringRes(R$string.p2p_list_status_succeeded, new Object[0]));
            linkedHashMap.put("FAILED", getStringRes(R$string.p2p_list_status_failed, new Object[0]));
            linkedHashMap.put("CONVERTING", getStringRes(R$string.p2p_list_status_converting, new Object[0]));
        }
        return this.f37843d0;
    }

    /* JADX INFO: renamed from: V3 */
    public final InterfaceC37241c m45002V3() {
        return (InterfaceC37241c) this.f37839Z.getValue();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m45003W3(@NotNull String side, @NotNull String status) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f37840a0 = side;
        this.f37841b0 = status;
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.order_list_fragment_layout;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.f37842c0) {
            this.f46496X.getRecyclerView().addItemDecoration(new EndItemDecoration((int) TypedValueCompat.dpToPx(84.0f, getResources().getDisplayMetrics())));
        }
        ((BaseTextView) view.findViewById(R$id.history_data_warn)).setVisibility(C21457l.m49860h(!C24129b.m58030b(SiteVisibleConfigKey.P2P)));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.botc_item_otc_order;
    }

    /* JADX INFO: renamed from: X3 */
    public static final InterfaceC37241c m44998X3() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strM56285z;
        String strM56285z2;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Boolean boolValueOf = null;
        if (arguments != null) {
            strM56285z = RouteExKt.m56285z(arguments, "side", "");
        } else {
            strM56285z = null;
        }
        this.f37840a0 = C27041f.m66668h(strM56285z);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            strM56285z2 = RouteExKt.m56285z(arguments2, "key_status", "");
        } else {
            strM56285z2 = null;
        }
        this.f37841b0 = C27041f.m66668h(strM56285z2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56252i(arguments3, "key_is_from_p2p_container", false));
        }
        this.f37842c0 = C27025c.m66566d(boolValueOf);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        super.onReBack();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<OtcOrder>> mo16440r3(int i11, int i12) {
        Observable observableCompose = m45002V3().m83328f(this.f37840a0, this.f37841b0, i11, i12).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
