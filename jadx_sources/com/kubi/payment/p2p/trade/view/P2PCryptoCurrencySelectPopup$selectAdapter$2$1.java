package com.kubi.payment.p2p.trade.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.otc.R$id;
import com.kubi.payment.p2p.trade.view.P2PCryptoCurrencySelectPopup$selectAdapter$2$1;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PCryptoCurrencySelectPopup.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup$selectAdapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "name", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PCryptoCurrencySelectPopup$selectAdapter$2$1 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ P2PCryptoCurrencySelectPopup f40137i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Context f40138j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Function1<String, Unit> f40139k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P2PCryptoCurrencySelectPopup$selectAdapter$2$1(P2PCryptoCurrencySelectPopup p2PCryptoCurrencySelectPopup, Context context, Function1<? super String, Unit> function1, int i11) {
        super(i11);
        this.f40137i = p2PCryptoCurrencySelectPopup;
        this.f40138j = context;
        this.f40139k = function1;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final String name) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(name, "name");
        final P2PCryptoCurrencySelectPopup p2PCryptoCurrencySelectPopup = this.f40137i;
        Context context = this.f40138j;
        final Function1<String, Unit> function1 = this.f40139k;
        helper.setText(R$id.tv_name, name);
        boolean zAreEqual = Intrinsics.areEqual(p2PCryptoCurrencySelectPopup.f40135g, name);
        View view = helper.getView(R$id.iv_select);
        Intrinsics.checkNotNull(view);
        if (zAreEqual) {
            C27046k.m66685H(view);
        } else {
            C27046k.m66700o(view);
        }
        helper.getView(R$id.view_item).setSelected(zAreEqual);
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(name);
        C24277v.m58540e(context, C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null), (ImageView) helper.getView(R$id.iv_icon));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: gu.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PCryptoCurrencySelectPopup$selectAdapter$2$1.m49393i(p2PCryptoCurrencySelectPopup, name, this, function1);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m49393i(P2PCryptoCurrencySelectPopup p2PCryptoCurrencySelectPopup, String str, P2PCryptoCurrencySelectPopup$selectAdapter$2$1 p2PCryptoCurrencySelectPopup$selectAdapter$2$1, Function1 function1) {
        p2PCryptoCurrencySelectPopup.f40135g = str;
        p2PCryptoCurrencySelectPopup$selectAdapter$2$1.notifyDataSetChanged();
        function1.invoke(p2PCryptoCurrencySelectPopup.f40135g);
        p2PCryptoCurrencySelectPopup.m49369i();
        return Unit.INSTANCE;
    }
}
