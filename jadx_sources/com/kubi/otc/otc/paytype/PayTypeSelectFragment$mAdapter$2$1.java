package com.kubi.otc.otc.paytype;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.R$id;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.payment.p2p.widget.PaymentMethodTextView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PayTypeSelectFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/otc/otc/paytype/PayTypeSelectFragment$mAdapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/otc/entity/PayTypeEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "getItem", ViewProps.POSITION, "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PayTypeSelectFragment$mAdapter$2$1 extends BaseQuickAdapter<PayTypeEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PayTypeSelectFragment f37869i;

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public PayTypeEntity getItem(int i11) {
        PayTypeEntity payTypeEntity;
        if (i11 < 0 || i11 >= this.mData.size() || (payTypeEntity = (PayTypeEntity) this.mData.get(i11)) == null) {
            return null;
        }
        if (i11 == 0) {
            payTypeEntity.setTitle(true);
        }
        List<T> mData = this.mData;
        Intrinsics.checkNotNullExpressionValue(mData, "mData");
        PayTypeEntity payTypeEntity2 = (PayTypeEntity) CollectionsKt.getOrNull(mData, i11 - 1);
        if (payTypeEntity2 != null && !Intrinsics.areEqual(payTypeEntity.getTitle(), payTypeEntity2.getTitle())) {
            payTypeEntity.setTitle(true);
        }
        return payTypeEntity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTypeSelectFragment$mAdapter$2$1(PayTypeSelectFragment payTypeSelectFragment, int i11) {
        super(i11);
        this.f37869i = payTypeSelectFragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final PayTypeEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_name;
        helper.setText(i11, C27041f.m66668h(item.getShowTypeName()));
        ((PaymentMethodTextView) helper.getView(i11)).setDrawableColor(item.getColor());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final PayTypeSelectFragment payTypeSelectFragment = this.f37869i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayTypeSelectFragment$mAdapter$2$1.m45029i(payTypeSelectFragment, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m45029i(PayTypeSelectFragment payTypeSelectFragment, PayTypeEntity payTypeEntity) {
        FragmentActivity activity = payTypeSelectFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent().putExtra("data", payTypeEntity));
        }
        FragmentActivity activity2 = payTypeSelectFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }
}
