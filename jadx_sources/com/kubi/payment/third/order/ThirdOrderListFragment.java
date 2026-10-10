package com.kubi.payment.third.order;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.payment.third.data.entities.ThirdOrderItem;
import com.kubi.payment.third.data.source.remote.ThirdWebService;
import com.kubi.payment.third.order.ThirdOrderListFragment;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p778xy.C46338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdOrderListFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u001d\u001a\u00020\u0014H\u0002J&\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 \u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0014J\b\u0010#\u001a\u00020\u0014H\u0014J\"\u0010$\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rJ\u0012\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/payment/third/order/ThirdOrderListFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/payment/third/data/entities/ThirdOrderItem;", "<init>", "()V", "mApi", "Lcom/kubi/payment/third/data/source/remote/ThirdWebService;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/payment/third/data/source/remote/ThirdWebService;", "mApi$delegate", "Lkotlin/Lazy;", AppsFlyerProperties.CHANNEL, "", "side", "status", "getLayout", "", "getItemLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "showProcessingDialog", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "onReBack", "onFilter", "onErrorCallBack", "throwable", "", "trackCheckOrderRecord", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ThirdOrderListFragment extends BasePagingFragment<ThirdOrderItem> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f40244Z = LazyKt.lazy(new Function0() { // from class: mu.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThirdOrderListFragment.m49604Q3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f40245a0 = "";

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f40246b0 = "";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f40247c0 = "";

    /* JADX INFO: renamed from: O3 */
    public static final Unit m49603O3(ThirdOrderItem thirdOrderItem) {
        String metaData = thirdOrderItem != null ? thirdOrderItem.getMetaData() : null;
        if (metaData == null || metaData.length() == 0) {
            return Unit.INSTANCE;
        }
        Router.f46192a.m56184f(C27041f.m66668h(thirdOrderItem != null ? thirdOrderItem.getMetaData() : null)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m49602N3(boolean z11, boolean z12, ThirdOrderListFragment thirdOrderListFragment) {
        if (z11 && z12) {
            thirdOrderListFragment.m49611T3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m49605S3(ThirdOrderListFragment thirdOrderListFragment, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        thirdOrderListFragment.m49610R3(str, str2, str3);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m49606U3(BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = viewHolder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: mu.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdOrderListFragment.m49607V3(helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:82:0x0208  */
    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: M3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable final ThirdOrderItem thirdOrderItem) {
        String fiatAmount;
        if (baseViewHolder != null) {
            C46338a.m102151a(this.mContext).mo6634v(C27041f.m66668h(thirdOrderItem != null ? thirdOrderItem.getChannelIconUrl() : null)).mo92188b0(R$mipmap.kucoin_icon_default_icon).m6594E0((ImageView) baseViewHolder.getView(R$id.iv_type));
            int i11 = R$id.tv_side;
            baseViewHolder.setText(i11, R$string.buy);
            baseViewHolder.setText(R$id.tv_currency, C27041f.m66668h(thirdOrderItem != null ? thirdOrderItem.getCurrency() : null));
            baseViewHolder.setGone(R$id.iv_fast, C27025c.m66566d(thirdOrderItem != null ? Boolean.valueOf(thirdOrderItem.isFast()) : null));
            int i12 = R$id.tv_amount_title;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R$string.amount));
            sb2.append('(');
            sb2.append(thirdOrderItem != null ? thirdOrderItem.getCurrency() : null);
            sb2.append(')');
            baseViewHolder.setText(i12, sb2.toString());
            int i13 = R$id.tv_price_title;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getString(R$string.market_amount));
            sb3.append('(');
            sb3.append(thirdOrderItem != null ? thirdOrderItem.getFiatCurrency() : null);
            sb3.append(')');
            baseViewHolder.setText(i13, sb3.toString());
            baseViewHolder.setText(R$id.tv_amount_value, C27041f.m66668h(thirdOrderItem != null ? thirdOrderItem.getAmount() : null));
            int i14 = R$id.tv_price_value;
            String strM89945s = (thirdOrderItem == null || (fiatAmount = thirdOrderItem.getFiatAmount()) == null) ? null : C41014a.m89945s(fiatAmount, null, 2, false, false, false, false, false, null, ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, null);
            if (strM89945s == null) {
                strM89945s = "";
            }
            baseViewHolder.setText(i14, strM89945s);
            baseViewHolder.setText(R$id.tv_time_value, TimeUtils.m66422i(C27039d.m66652l(thirdOrderItem != null ? thirdOrderItem.getCreatedAt() : null)));
            TextView textView = (TextView) baseViewHolder.getView(i11);
            if (textView != null) {
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                textView.setTextColor(C22890g.m54291p(mContext));
            }
            TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_status);
            final boolean zAreEqual = Intrinsics.areEqual(thirdOrderItem != null ? thirdOrderItem.getChannelId() : null, "treasura");
            final boolean zAreEqual2 = Intrinsics.areEqual(thirdOrderItem != null ? thirdOrderItem.getStatus() : null, "PROCESSING");
            View view = baseViewHolder.getView(R$id.iv_status);
            Intrinsics.checkNotNull(view);
            Intrinsics.checkNotNull(textView2);
            C27046k.m66681D(new View[]{view, textView2}, new Function0() { // from class: mu.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThirdOrderListFragment.m49602N3(zAreEqual, zAreEqual2, this);
                }
            });
            String status = thirdOrderItem != null ? thirdOrderItem.getStatus() : null;
            if (status != null) {
                switch (status) {
                    case "DONE":
                        textView2.setTextColor(getColorRes(R$color.c_text40));
                        textView2.setText(getString(R$string.completed));
                        C27046k.m66700o(view);
                        break;
                    case "REFUNDED":
                        textView2.setTextColor(getColorRes(R$color.c_text40));
                        textView2.setText(getString(R$string.payment_order_refunded));
                        C27046k.m66700o(view);
                        break;
                    case "CANCELED":
                        textView2.setTextColor(getColorRes(R$color.c_text40));
                        textView2.setText(getString(R$string.canceled));
                        C27046k.m66700o(view);
                        break;
                    case "PROCESSING":
                        textView2.setTextColor(getColorRes(R$color.primary));
                        textView2.setText(getString(R$string.payment_status_processing));
                        if (!zAreEqual) {
                            C27046k.m66700o(view);
                        } else {
                            C27046k.m66685H(view);
                        }
                        break;
                    case "FAILED":
                        textView2.setTextColor(getColorRes(R$color.c_text40));
                        textView2.setText(getString(R$string.failed));
                        C27046k.m66700o(view);
                        break;
                    default:
                        textView2.setTextColor(getColorRes(R$color.c_text40));
                        C27046k.m66700o(view);
                        break;
                }
            } else {
                textView2.setTextColor(getColorRes(R$color.c_text40));
                C27046k.m66700o(view);
            }
            String metaData = thirdOrderItem != null ? thirdOrderItem.getMetaData() : null;
            if (metaData != null && metaData.length() != 0 && !zAreEqual) {
                C27046k.m66694i(textView2, R$drawable.icon_arrow_right_mirrored, 0, 0, 6, null);
            }
            View itemView = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: mu.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThirdOrderListFragment.m49603O3(thirdOrderItem);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final ThirdWebService m49609P3() {
        return (ThirdWebService) this.f40244Z.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public final void m49610R3(@NotNull String channel, @NotNull String side, @NotNull String status) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f40245a0 = channel;
        this.f40246b0 = side;
        this.f40247c0 = status;
        mo15906F3();
    }

    /* JADX INFO: renamed from: T3 */
    public final void m49611T3() {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_third_processing_status, true).m54237f4(new Function2() { // from class: mu.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ThirdOrderListFragment.m49606U3((BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "payment_processing_status");
    }

    /* JADX INFO: renamed from: W3 */
    public final void m49612W3(ApiException apiException) {
        IPaymentTrack.m49797i(IPaymentTrack.f40346a.getTrack(), "CHECK_ORDER_RECORD", false, apiException.code + ':' + apiException.getMessage(), null, 10, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.order_list_fragment_layout;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((BaseTextView) view.findViewById(R$id.history_data_warn)).setVisibility(C21457l.m49860h(!C24129b.m58030b(SiteVisibleConfigKey.ThirdParty)));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<ThirdOrderItem>> mo16440r3(int i11, int i12) {
        if (this.f40245a0.length() > 0) {
            return ThirdWebService.m49551f(m49609P3(), this.f40245a0, this.f40246b0, this.f40247c0, i11, i12, null, 32, null).compose(C24217a1.m58389m());
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.botc_item_third_order;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final ThirdWebService m49604Q3() {
        return (ThirdWebService) C42597a.m93386b().create(ThirdWebService.class);
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m49607V3(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: D3 */
    public void mo35196D3(@Nullable Throwable th2) {
        super.mo35196D3(th2);
        if (th2 instanceof ApiException) {
            m49612W3((ApiException) th2);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        super.onReBack();
        mo15906F3();
    }
}
