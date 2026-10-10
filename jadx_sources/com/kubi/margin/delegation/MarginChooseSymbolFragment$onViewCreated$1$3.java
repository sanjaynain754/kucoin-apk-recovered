package com.kubi.margin.delegation;

import android.R;
import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginChooseSymbolFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/margin/delegation/MarginChooseSymbolFragment$onViewCreated$1$3", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginChooseSymbolFragment$onViewCreated$1$3 extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ MarginChooseSymbolFragment f32814i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginChooseSymbolFragment$onViewCreated$1$3(MarginChooseSymbolFragment marginChooseSymbolFragment, int i11, ArrayList<TradeItemBean> arrayList) {
        super(i11, arrayList);
        this.f32814i = marginChooseSymbolFragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final TradeItemBean item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(R.id.text1);
        textView.setTextColor(this.f32814i.getColorRes(R$color.c_text));
        textView.setBackgroundResource(R$drawable.selector_darkoverlay_click);
        textView.setPadding(C5275i0.m6236a(15.0f), C5275i0.m6236a(15.0f), C5275i0.m6236a(15.0f), C5275i0.m6236a(15.0f));
        textView.setText(item.getShowSymbol());
        Intrinsics.checkNotNull(textView);
        final MarginChooseSymbolFragment marginChooseSymbolFragment = this.f32814i;
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.margin.delegation.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginChooseSymbolFragment$onViewCreated$1$3.m38024i(marginChooseSymbolFragment, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m38024i(MarginChooseSymbolFragment marginChooseSymbolFragment, TradeItemBean tradeItemBean) {
        FragmentActivity activity = marginChooseSymbolFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent().putExtra("data", tradeItemBean));
        }
        FragmentActivity activity2 = marginChooseSymbolFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }
}
