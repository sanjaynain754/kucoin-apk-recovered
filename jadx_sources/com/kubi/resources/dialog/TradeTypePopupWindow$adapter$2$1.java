package com.kubi.resources.dialog;

import android.content.Context;
import android.widget.TextView;
import com.kubi.resources.dialog.TradeTypePopupWindow$adapter$2$1;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$id;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeTypePopupWindow.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/resources/dialog/TradeTypePopupWindow$adapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/resources/dialog/TradeTypePopupWindow$SelectEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeTypePopupWindow$adapter$2$1 extends BaseQuickAdapter<TradeTypePopupWindow.SelectEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f43599i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ BiConsumer<String, Integer> f43600j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ TradeTypePopupWindow f43601k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeTypePopupWindow$adapter$2$1(List<TradeTypePopupWindow.SelectEntity> list, Context context, BiConsumer<String, Integer> biConsumer, TradeTypePopupWindow tradeTypePopupWindow, int i11) {
        super(i11, list);
        this.f43599i = context;
        this.f43600j = biConsumer;
        this.f43601k = tradeTypePopupWindow;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final TradeTypePopupWindow.SelectEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(R$id.tv_title);
        textView.setText(item.getLabel());
        textView.setTextColor(this.f43599i.getResources().getColor(item.getIsChecked() ? R$color.primary : R$color.c_text40));
        Intrinsics.checkNotNull(textView);
        final BiConsumer<String, Integer> biConsumer = this.f43600j;
        final TradeTypePopupWindow tradeTypePopupWindow = this.f43601k;
        C27046k.m66711z(textView, 0L, new Function0() { // from class: bw.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeTypePopupWindow$adapter$2$1.m54258i(biConsumer, item, helper, tradeTypePopupWindow);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m54258i(BiConsumer biConsumer, TradeTypePopupWindow.SelectEntity c22887a, BaseViewHolder baseViewHolder, TradeTypePopupWindow tradeTypePopupWindow) throws Exception {
        biConsumer.accept(c22887a.getLabel(), Integer.valueOf(baseViewHolder.getAdapterPosition()));
        tradeTypePopupWindow.m96331y();
        return Unit.INSTANCE;
    }
}
