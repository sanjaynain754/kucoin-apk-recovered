package com.kubi.otc.otc.paytype;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.payment.p2p.widget.PaymentMethodTextView;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PayTypeWaySelectFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/otc/otc/paytype/PayTypeWaySelectFragment$adapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/otc/entity/AdPayType;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayTypeWaySelectFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTypeWaySelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeWaySelectFragment$adapter$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n774#2:215\n865#2,2:216\n*S KotlinDebug\n*F\n+ 1 PayTypeWaySelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeWaySelectFragment$adapter$2$1\n*L\n67#1:215\n67#1:216,2\n*E\n"})
public final class PayTypeWaySelectFragment$adapter$2$1 extends BaseQuickAdapter<AdPayType, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PayTypeWaySelectFragment f37889i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTypeWaySelectFragment$adapter$2$1(PayTypeWaySelectFragment payTypeWaySelectFragment, int i11) {
        super(i11);
        this.f37889i = payTypeWaySelectFragment;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m45150q(PayTypeWaySelectFragment$adapter$2$1 payTypeWaySelectFragment$adapter$2$1, Layer layer) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(payTypeWaySelectFragment$adapter$2$1.mContext, R$color.brandRed8));
        gradientDrawable.setCornerRadius(C27040e.m66657a(8.0f));
        layer.setBackground(gradientDrawable);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AdPayType item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Map map = this.f37889i.f37882U;
        PayTypeEntity payTypeEntity = map != null ? (PayTypeEntity) map.get(item.getPayTypeCode()) : null;
        BaseViewHolder text = helper.setText(R$id.tv_kind, C27041f.m66668h(payTypeEntity != null ? payTypeEntity.getShowTypeName() : null)).setText(R$id.tv_pay_type_name, C27041f.m66668h(payTypeEntity != null ? payTypeEntity.getShowTypeName() : null));
        int i11 = R$id.rb_status;
        ArrayList arrayListM45105D3 = this.f37889i.m45105D3();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM45105D3) {
            if (Intrinsics.areEqual(((AdPayType) obj).getId(), item.getId())) {
                arrayList.add(obj);
            }
        }
        text.setImageResource(i11, arrayList.isEmpty() ? R$mipmap.ic_radio_button_unchecked : R$mipmap.ic_radio_button_checked);
        List<String> displayList = item.getDisplayList();
        final String str = displayList != null ? (String) CollectionsKt.getOrNull(displayList, 0) : null;
        C21457l.m49859g(helper.getView(R$id.tv_name), !(str == null || str.length() == 0), null, new Function1() { // from class: com.kubi.otc.otc.paytype.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PayTypeWaySelectFragment$adapter$2$1.m45146m(str, (BaseTextView) obj2);
            }
        }, 2, null);
        List<String> displayList2 = item.getDisplayList();
        final String str2 = displayList2 != null ? (String) CollectionsKt.getOrNull(displayList2, 1) : null;
        C21457l.m49859g(helper.getView(R$id.tv_account), !(str2 == null || str2.length() == 0), null, new Function1() { // from class: com.kubi.otc.otc.paytype.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PayTypeWaySelectFragment$adapter$2$1.m45147n(str2, (BaseTextView) obj2);
            }
        }, 2, null);
        ((PaymentMethodTextView) helper.getView(R$id.tv_pay_type_name)).setDrawableColor(item.getColor());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final PayTypeWaySelectFragment payTypeWaySelectFragment = this.f37889i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.e1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayTypeWaySelectFragment$adapter$2$1.m45148o(payTypeWaySelectFragment, item);
            }
        }, 1, null);
        View view = helper.getView(R$id.rb_status);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        final PayTypeWaySelectFragment payTypeWaySelectFragment2 = this.f37889i;
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.f1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayTypeWaySelectFragment$adapter$2$1.m45149p(payTypeWaySelectFragment2, item);
            }
        }, 1, null);
        if (helper.getAdapterPosition() == 0) {
            helper.setGone(R$id.tv_kind, true);
        } else {
            helper.setGone(R$id.tv_kind, !Intrinsics.areEqual(item.getPayTypeCode(), getData().get(helper.getAdapterPosition() - 1).getPayTypeCode()));
        }
        C21457l.m49859g(helper.getView(R$id.warn_layer), Intrinsics.areEqual(item.getValid(), Boolean.FALSE), null, new Function1() { // from class: com.kubi.otc.otc.paytype.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PayTypeWaySelectFragment$adapter$2$1.m45150q(this.f37991b, (Layer) obj2);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m45146m(String str, BaseTextView baseTextView) {
        baseTextView.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m45147n(String str, BaseTextView baseTextView) {
        baseTextView.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m45148o(PayTypeWaySelectFragment payTypeWaySelectFragment, AdPayType adPayType) {
        payTypeWaySelectFragment.m45115O3(adPayType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m45149p(PayTypeWaySelectFragment payTypeWaySelectFragment, AdPayType adPayType) {
        payTypeWaySelectFragment.m45115O3(adPayType);
        return Unit.INSTANCE;
    }
}
