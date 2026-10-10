package com.kubi.core.biz.order.record.history;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.kubi.core.biz.order.record.history.ChooseSymbolView$initView$2;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$id;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v30.C45391k0;

/* JADX INFO: compiled from: ChooseSymbolView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/core/biz/order/record/history/ChooseSymbolView$initView$2", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/core/biz/order/record/history/ChooseSymbolView$FilterChooseData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChooseSymbolView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseSymbolView.kt\ncom/kubi/core/biz/order/record/history/ChooseSymbolView$initView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,256:1\n1869#2,2:257\n*S KotlinDebug\n*F\n+ 1 ChooseSymbolView.kt\ncom/kubi/core/biz/order/record/history/ChooseSymbolView$initView$2\n*L\n92#1:257,2\n*E\n"})
public final class ChooseSymbolView$initView$2 extends BaseQuickAdapter<ChooseSymbolView.FilterChooseData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ChooseSymbolView f20612i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseSymbolView$initView$2(ChooseSymbolView chooseSymbolView, int i11, ArrayList<ChooseSymbolView.FilterChooseData> arrayList) {
        super(i11, arrayList);
        this.f20612i = chooseSymbolView;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final ChooseSymbolView.FilterChooseData item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tvName, item.getName());
        int i11 = R$id.tv_coin_name_full;
        helper.setText(i11, item.getFullName());
        helper.setGone(i11, !TextUtils.isEmpty(item.getFullName()));
        int i12 = R$id.iv_icon;
        helper.setGone(i12, !TextUtils.isEmpty(item.getIconUrl()));
        C24277v.m58540e(this.mContext, item.getIconUrl(), (ImageView) helper.getView(i12));
        helper.itemView.setSelected(item.getIsChecked());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final ChooseSymbolView chooseSymbolView = this.f20612i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: ud.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseSymbolView$initView$2.m22182i(chooseSymbolView, this, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m22182i(ChooseSymbolView chooseSymbolView, ChooseSymbolView$initView$2 chooseSymbolView$initView$2, ChooseSymbolView.FilterChooseData filterChooseData) {
        BaseTextView baseTextView;
        C45391k0 binding = chooseSymbolView.getBinding();
        if (binding != null && (baseTextView = binding.f102180d) != null) {
            Context mContext = chooseSymbolView$initView$2.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            baseTextView.setTextColor(C27046k.m66699n(mContext, R$color.c_text));
        }
        List<ChooseSymbolView.FilterChooseData> data = chooseSymbolView$initView$2.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            ((ChooseSymbolView.FilterChooseData) it.next()).m22180g(false);
        }
        filterChooseData.m22180g(true);
        chooseSymbolView$initView$2.notifyDataSetChanged();
        Function1<ChooseSymbolView.FilterChooseData, Unit> onSelectCallback = chooseSymbolView.getOnSelectCallback();
        if (onSelectCallback != null) {
            onSelectCallback.invoke(filterChooseData);
        }
        return Unit.INSTANCE;
    }
}
