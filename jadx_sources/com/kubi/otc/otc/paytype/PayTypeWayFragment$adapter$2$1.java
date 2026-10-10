package com.kubi.otc.otc.paytype;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.otc.paytype.add.PayTypeAddFragment;
import com.kubi.payment.p2p.widget.PaymentMethodTextView;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PayTypeWayFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/otc/otc/paytype/PayTypeWayFragment$adapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/otc/entity/AdPayType;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PayTypeWayFragment$adapter$2$1 extends BaseQuickAdapter<AdPayType, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PayTypeWayFragment f37879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTypeWayFragment$adapter$2$1(PayTypeWayFragment payTypeWayFragment, int i11) {
        super(i11);
        this.f37879i = payTypeWayFragment;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m45100q(PayTypeWayFragment$adapter$2$1 payTypeWayFragment$adapter$2$1, Layer layer) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(payTypeWayFragment$adapter$2$1.mContext, R$color.brandRed8));
        gradientDrawable.setCornerRadius(C27040e.m66657a(8.0f));
        layer.setBackground(gradientDrawable);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final AdPayType item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final PayTypeWayFragment payTypeWayFragment = this.f37879i;
        Map map = payTypeWayFragment.f37871U;
        PayTypeEntity payTypeEntity = map != null ? (PayTypeEntity) map.get(item.getPayTypeCode()) : null;
        int i11 = R$id.tv_kind;
        helper.setText(i11, C27041f.m66668h(payTypeEntity != null ? payTypeEntity.getShowTypeName() : null));
        int i12 = R$id.tv_pay_type_name;
        helper.setText(i12, C27041f.m66668h(payTypeEntity != null ? payTypeEntity.getShowTypeName() : null));
        List<String> displayList = item.getDisplayList();
        final String str = displayList != null ? (String) CollectionsKt.getOrNull(displayList, 0) : null;
        C21457l.m49859g(helper.getView(R$id.tv_name), !(str == null || str.length() == 0), null, new Function1() { // from class: com.kubi.otc.otc.paytype.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeWayFragment$adapter$2$1.m45096m(str, (BaseTextView) obj);
            }
        }, 2, null);
        List<String> displayList2 = item.getDisplayList();
        final String str2 = displayList2 != null ? (String) CollectionsKt.getOrNull(displayList2, 1) : null;
        C21457l.m49859g(helper.getView(R$id.tv_account), !(str2 == null || str2.length() == 0), null, new Function1() { // from class: com.kubi.otc.otc.paytype.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeWayFragment$adapter$2$1.m45097n(str2, (BaseTextView) obj);
            }
        }, 2, null);
        ((PaymentMethodTextView) helper.getView(i12)).setDrawableColor(item.getColor());
        helper.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.kubi.otc.otc.paytype.m0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return PayTypeWayFragment$adapter$2$1.m45098o(payTypeWayFragment, helper, item, view);
            }
        });
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayTypeWayFragment$adapter$2$1.m45099p(payTypeWayFragment, item);
            }
        }, 1, null);
        if (helper.getAdapterPosition() == 0) {
            helper.setGone(i11, true);
        } else {
            helper.setGone(i11, !Intrinsics.areEqual(item.getPayTypeCode(), getData().get(helper.getAdapterPosition() - 1).getPayTypeCode()));
        }
        C21457l.m49859g(helper.getView(R$id.warn_layer), Intrinsics.areEqual(item.getValid(), Boolean.FALSE), null, new Function1() { // from class: com.kubi.otc.otc.paytype.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeWayFragment$adapter$2$1.m45100q(this.f38015b, (Layer) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m45096m(String str, BaseTextView baseTextView) {
        baseTextView.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m45097n(String str, BaseTextView baseTextView) {
        baseTextView.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m45098o(PayTypeWayFragment payTypeWayFragment, BaseViewHolder baseViewHolder, AdPayType adPayType, View view) {
        payTypeWayFragment.m45082M3(baseViewHolder, C27041f.m66668h(adPayType.getId()));
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m45099p(PayTypeWayFragment payTypeWayFragment, AdPayType adPayType) {
        BaseFragmentActivity.m56574n0(payTypeWayFragment.getContext(), payTypeWayFragment.getString(R$string.modify_pay_type), PayTypeAddFragment.class.getName(), new C27051h().m66721e("data", adPayType).m66724h("data_1", payTypeWayFragment.f37878b0).m66717a());
        return Unit.INSTANCE;
    }
}
