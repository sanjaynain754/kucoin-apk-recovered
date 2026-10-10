package com.kubi.payment.channel.fiat;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.otc.R$id;
import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import ht.C38346y;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchFiatFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/payment/channel/fiat/SearchFiatFragment$adapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchFiatFragment$adapter$2$1 extends BaseQuickAdapter<FiatInfoEntity.FiatInfo, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SearchFiatFragment f38267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiatFragment$adapter$2$1(SearchFiatFragment searchFiatFragment, int i11) {
        super(i11);
        this.f38267i = searchFiatFragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final FiatInfoEntity.FiatInfo item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final SearchFiatFragment searchFiatFragment = this.f38267i;
        helper.setText(R$id.tv_fiat_name, item.getCurrency());
        int i11 = R$id.tv_fiat_name_full;
        helper.setText(i11, item.getName());
        helper.setText(i11, item.getName());
        TextView textView = (TextView) helper.getView(R$id.tv_fiat_balance);
        if (Intrinsics.areEqual(searchFiatFragment.m45809N3(), "fiat_withdraw") && C38346y.m86490A(item.getAvailableBalance()).compareTo(BigDecimal.ZERO) == 1) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66685H(textView);
            String availableBalance = item.getAvailableBalance();
            textView.setText(C27041f.m66668h(availableBalance != null ? C41014a.m89945s(availableBalance, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null) : null));
        } else {
            Intrinsics.checkNotNull(textView);
            C27046k.m66700o(textView);
        }
        C24277v.m58540e(this.mContext, item.getIconUrl(), (ImageView) helper.getView(R$id.iv_fiat_icon));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.payment.channel.fiat.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFiatFragment$adapter$2$1.m45815i(searchFiatFragment, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m45815i(SearchFiatFragment searchFiatFragment, FiatInfoEntity.FiatInfo fiatInfo) {
        C43852m.m96590b(C27041f.m66668h(searchFiatFragment.getF34283V()), "fiatSelector", "1", TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(fiatInfo.getCurrency())), TuplesKt.m90091to("after_page_id", "B7FiatDepositMethod"), TuplesKt.m90091to("norm_version", "1"));
        searchFiatFragment.m45810W3(fiatInfo);
        return Unit.INSTANCE;
    }
}
