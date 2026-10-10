package com.kubi.spot.business.marketChanges;

import android.content.Context;
import android.view.View;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.business.discover.MarketChangeHelper;
import com.kubi.spot.business.discover.entity.MarketChangesItemEntity;
import com.kubi.spot.exeption.SpotMessage;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketChangeAdapter.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/business/marketChanges/MarketChangeAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "renderMarketChangeItems", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketChangeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketChangeAdapter.kt\ncom/kubi/spot/business/marketChanges/MarketChangeAdapter\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,92:1\n52#2,2:93\n*S KotlinDebug\n*F\n+ 1 MarketChangeAdapter.kt\ncom/kubi/spot/business/marketChanges/MarketChangeAdapter\n*L\n54#1:93,2\n*E\n"})
public final class MarketChangeAdapter extends BaseQuickAdapter<MarketChangesItemEntity, BaseViewHolder> {
    public MarketChangeAdapter() {
        super(R$layout.market_change_kline_entrance_item);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable MarketChangesItemEntity marketChangesItemEntity) {
        if (baseViewHolder != null) {
            m61201i(baseViewHolder, marketChangesItemEntity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m61201i(BaseViewHolder baseViewHolder, final MarketChangesItemEntity marketChangesItemEntity) {
        String collectPrice;
        BigDecimal bigDecimalM66536f;
        T t11;
        if (baseViewHolder == null || marketChangesItemEntity == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "--";
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(marketChangesItemEntity.getItem());
        if (symbolInfoEntityM85601B != null) {
            String quoteCurrencyName = symbolInfoEntityM85601B.getQuoteCurrencyName();
            if (quoteCurrencyName == null || quoteCurrencyName.length() == 0) {
                t11 = quoteCurrencyName;
                t11 = "--";
            }
            t11 = quoteCurrencyName;
            objectRef.element = t11;
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.spot.business.marketChanges.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketChangeAdapter.m61199j(marketChangesItemEntity);
            }
        }, 1, null);
        int i11 = R$id.tv_time;
        MarketChangeHelper marketChangeHelper = MarketChangeHelper.f50139a;
        baseViewHolder.setText(i11, marketChangeHelper.m61016b(C27039d.m66653m(marketChangesItemEntity.getCollectAt(), System.currentTimeMillis())));
        String item = marketChangesItemEntity.getItem();
        String strM85579c = null;
        if (item != null && (collectPrice = marketChangesItemEntity.getCollectPrice()) != null && (bigDecimalM66536f = DowngradeExKt.m66536f(collectPrice)) != null) {
            strM85579c = C37886j.m85579c(bigDecimalM66536f, item, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
        }
        baseViewHolder.setText(R$id.tv_price, C27041f.m66669i(strM85579c, "--"));
        baseViewHolder.setText(R$id.tv_message_hint, marketChangesItemEntity.getTemplate());
        int i12 = R$id.tv_message_value;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        baseViewHolder.setTextColor(i12, C22890g.m54281f(mContext, Intrinsics.areEqual(marketChangesItemEntity.getColor(), "UP")));
        baseViewHolder.setText(i12, marketChangeHelper.m61017c(C27041f.m66668h(marketChangesItemEntity.getValue()), C27041f.m66668h(marketChangesItemEntity.getValueType()), (String) objectRef.element));
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m61199j(MarketChangesItemEntity marketChangesItemEntity) throws JSONException {
        if (marketChangesItemEntity.getItem() != null && marketChangesItemEntity.getItemType() != null && marketChangesItemEntity.getId() != null) {
            MarketChangeKlineEntranceClickPoint.f50250a.m61220a(marketChangesItemEntity);
            MarketChangeHelper.m61014e(MarketChangeHelper.f50139a, "", marketChangesItemEntity.getItem(), marketChangesItemEntity.getItemType(), C27041f.m66668h(marketChangesItemEntity.getId()), null, 16, null);
        } else {
            C43846g.m96568c(new SpotMessage("item:" + marketChangesItemEntity.getItem() + " itemType:" + marketChangesItemEntity.getItemType() + " itemId:" + marketChangesItemEntity.getId(), "MarketChangeAdapter", false, 4, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
