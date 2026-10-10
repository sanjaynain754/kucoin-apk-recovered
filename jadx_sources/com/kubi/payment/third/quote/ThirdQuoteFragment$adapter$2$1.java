package com.kubi.payment.third.quote;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$mipmap;
import com.kubi.payment.third.data.entities.PayChannelSelect;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p569qq.C43852m;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ThirdQuoteFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0015¨\u0006\b"}, m90084d2 = {"com/kubi/payment/third/quote/ThirdQuoteFragment$adapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "viewHolder", "item", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThirdQuoteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdQuoteFragment.kt\ncom/kubi/payment/third/quote/ThirdQuoteFragment$adapter$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,586:1\n1869#2,2:587\n*S KotlinDebug\n*F\n+ 1 ThirdQuoteFragment.kt\ncom/kubi/payment/third/quote/ThirdQuoteFragment$adapter$2$1\n*L\n122#1:587,2\n*E\n"})
public final class ThirdQuoteFragment$adapter$2$1 extends BaseQuickAdapter<PayChannelSelect, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ThirdQuoteFragment f40277i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdQuoteFragment$adapter$2$1(ThirdQuoteFragment thirdQuoteFragment, int i11) {
        super(i11);
        this.f40277i = thirdQuoteFragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder viewHolder, final PayChannelSelect item) {
        String strM66668h;
        String secondActivityMessage;
        String currencyAmount;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(item, "item");
        final ThirdQuoteFragment thirdQuoteFragment = this.f40277i;
        viewHolder.setText(R$id.tv_channel_name, item.getChannelName());
        int i11 = R$id.tv_tag;
        viewHolder.setText(i11, C27041f.m66668h(item.getActivityMessage()));
        boolean z11 = false;
        viewHolder.setGone(R$id.tv_best, (viewHolder.getAdapterPosition() != 0 || (currencyAmount = item.getCurrencyAmount()) == null || currencyAmount.length() == 0) ? false : true);
        String activityMessage = item.getActivityMessage();
        if (activityMessage != null && activityMessage.length() != 0 && ((secondActivityMessage = item.getSecondActivityMessage()) == null || secondActivityMessage.length() == 0)) {
            z11 = true;
        }
        viewHolder.setGone(i11, z11);
        TextView textView = (TextView) viewHolder.getView(R$id.tv_promote_tag);
        String secondActivityMessage2 = item.getSecondActivityMessage();
        if (secondActivityMessage2 == null || secondActivityMessage2.length() == 0) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66700o(textView);
        } else {
            Intrinsics.checkNotNull(textView);
            C27046k.m66685H(textView);
            String secondActivityMessageUrl = item.getSecondActivityMessageUrl();
            if (secondActivityMessageUrl == null || secondActivityMessageUrl.length() == 0) {
                strM66668h = C27041f.m66668h(item.getSecondActivityMessage());
            } else {
                strM66668h = C27041f.m66668h(item.getSecondActivityMessage()) + " >";
            }
            textView.setText(strM66668h);
        }
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.payment.third.quote.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdQuoteFragment$adapter$2$1.m49737j(item);
            }
        }, 1, null);
        viewHolder.setText(R$id.tv_amount, C27041f.m66669i(item.getCurrencyAmount(), "--"));
        viewHolder.setText(R$id.tv_currency, item.getCurrency());
        C46338a.m102151a(this.mContext).mo6634v(item.getSecondIconUrl()).m6594E0((ImageView) viewHolder.getView(R$id.iv_channel));
        int i12 = R$id.iv_check;
        View view = viewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.third.quote.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdQuoteFragment$adapter$2$1.m49738k(item, this, thirdQuoteFragment);
            }
        }, 1, null);
        viewHolder.setImageResource(i12, item.isChecked() ? R$mipmap.ic_checkbox_button_checked : R$drawable.ic_checkbox_button_unchecked_gray);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m49737j(PayChannelSelect payChannelSelect) {
        String secondActivityMessageUrl = payChannelSelect.getSecondActivityMessageUrl();
        if (secondActivityMessageUrl != null && secondActivityMessageUrl.length() != 0) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C27041f.m66668h(payChannelSelect.getSecondActivityMessageUrl()), null, null, null, null, null, null, 126, null);
        }
        C43852m.m96590b("B7ThirdParty", TUIConstants.TUIChat.INPUT_MORE_ICON, "1", TuplesKt.m90091to(AppsFlyerProperties.CHANNEL, payChannelSelect.getChannelName()), TuplesKt.m90091to("message", C27041f.m66668h(payChannelSelect.getSecondActivityMessage())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m49738k(PayChannelSelect payChannelSelect, ThirdQuoteFragment$adapter$2$1 thirdQuoteFragment$adapter$2$1, ThirdQuoteFragment thirdQuoteFragment) {
        if (!payChannelSelect.isChecked()) {
            List<PayChannelSelect> data = thirdQuoteFragment$adapter$2$1.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            for (PayChannelSelect payChannelSelect2 : data) {
                if (Intrinsics.areEqual(payChannelSelect, payChannelSelect2)) {
                    payChannelSelect.setChecked(true);
                } else {
                    payChannelSelect2.setChecked(false);
                }
            }
            thirdQuoteFragment.m49723M4(payChannelSelect);
            thirdQuoteFragment$adapter$2$1.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
