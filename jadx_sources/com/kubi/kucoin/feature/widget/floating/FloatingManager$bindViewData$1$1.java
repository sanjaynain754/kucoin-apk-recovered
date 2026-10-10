package com.kubi.kucoin.feature.widget.floating;

import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.MutableTriple;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import p265fl.C37565d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FloatingManager.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\"\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0004\u0012\u00020\u00060\u0001J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0014¨\u0006\u000b"}, m90084d2 = {"com/kubi/kucoin/feature/widget/floating/FloatingManager$bindViewData$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/utils/extensions/MutableTriple;", "Ljava/math/BigDecimal;", "", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatingManager$bindViewData$1$1 extends BaseQuickAdapter<MutableTriple<BigDecimal, String, Integer>, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, MutableTriple<BigDecimal, String, Integer> item) {
        BigDecimal bigDecimalM11724a;
        String plainString;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tvPrice;
        BigDecimal first = item.getFirst();
        helper.setText(i11, C27041f.m66669i((first == null || (bigDecimalM11724a = C6447a.m11724a(first)) == null || (plainString = bigDecimalM11724a.toPlainString()) == null) ? null : C27041f.m66665e(plainString, 7), "- -"));
        int i12 = R$id.tvSymbol;
        C37565d c37565d = C37565d.f83517a;
        String strM66669i = c37565d.m84602h().get(item.getSecond());
        if (strM66669i == null) {
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(item.getSecond());
            strM66669i = C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, StringsKt.replace$default(item.getSecond(), C33820nf.f71144W, "/", false, 4, (Object) null));
            c37565d.m84602h().put(item.getSecond(), strM66669i);
            Unit unit = Unit.INSTANCE;
        }
        helper.setText(i12, strM66669i).setTextColor(i11, C27039d.m66651k(item.getThird(), -1));
    }
}
