package d20;

import android.app.Activity;
import android.content.Intent;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27025c;
import gf.C37890n;
import gf.InterfaceC37888l;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: d20.a */
/* JADX INFO: compiled from: SpotExtension.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"updatePreViewData", "", "data", "Lcom/kubi/data/entity/TradeItemBean;", "it", "Lcom/kubi/data/entity/SymbolPreviewEntity;", "getTradeBeanFromIntent", "Landroid/app/Activity;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36596a {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final TradeItemBean m81886a(@Nullable Activity activity) {
        Intent intent = activity != null ? activity.getIntent() : null;
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "action_widget_desk_item")) {
            try {
                TradeItemBean tradeItemBean = (TradeItemBean) RouteExKt.m56272s(intent, "data");
                if (tradeItemBean == null) {
                    tradeItemBean = new TradeItemBean("BTC-USDT");
                }
                return tradeItemBean;
            } catch (Exception e11) {
                C44128b.m97263g("KuCoinMarketActivity", e11);
                return null;
            }
        }
        String strM56280w = intent != null ? RouteExKt.m56280w(intent, "symbol") : null;
        if (strM56280w != null && strM56280w.length() != 0) {
            return new TradeItemBean(strM56280w);
        }
        String strM56280w2 = intent != null ? RouteExKt.m56280w(intent, "coin") : null;
        if (strM56280w2 == null || strM56280w2.length() == 0) {
            return null;
        }
        return new TradeItemBean(InterfaceC37888l.m85586i(C37890n.f85269a, strM56280w2, null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX INFO: renamed from: b */
    public static final void m81887b(@Nullable TradeItemBean tradeItemBean, @Nullable SymbolPreviewEntity symbolPreviewEntity) {
        boolean z11;
        SymbolInfoEntity symbolInfoEntity;
        boolean zAreEqual;
        if (tradeItemBean == null) {
            return;
        }
        SymbolInfoEntity symbolInfoEntity2 = tradeItemBean.getSymbolInfoEntity();
        if (symbolInfoEntity2 != null) {
            if (symbolInfoEntity2.isPreviewEnableShow() == C27025c.m66566d(symbolPreviewEntity != null ? symbolPreviewEntity.getPreviewEnableShow() : null) && (symbolInfoEntity = tradeItemBean.getSymbolInfoEntity()) != null) {
                if (symbolInfoEntity.isEnableTrading() == C27025c.m66566d(symbolPreviewEntity != null ? symbolPreviewEntity.getEnableTrading() : null)) {
                    SymbolInfoEntity symbolInfoEntity3 = tradeItemBean.getSymbolInfoEntity();
                    if (symbolInfoEntity3 != null) {
                        zAreEqual = Intrinsics.areEqual(symbolInfoEntity3.getEnableAuctionTrade(), Boolean.valueOf(C27025c.m66566d(symbolPreviewEntity != null ? symbolPreviewEntity.isEnableAuctionTrade() : null)));
                    } else {
                        zAreEqual = false;
                    }
                    z11 = zAreEqual ? false : true;
                }
            }
        }
        if (z11) {
            SymbolInfoEntity symbolInfoEntity4 = tradeItemBean.getSymbolInfoEntity();
            if (symbolInfoEntity4 != null) {
                symbolInfoEntity4.setPreviewEnableShow(C27025c.m66566d(symbolPreviewEntity != null ? symbolPreviewEntity.getPreviewEnableShow() : null));
            }
            SymbolInfoEntity symbolInfoEntity5 = tradeItemBean.getSymbolInfoEntity();
            if (symbolInfoEntity5 != null) {
                symbolInfoEntity5.setEnableTrading(C27025c.m66566d(symbolPreviewEntity != null ? symbolPreviewEntity.getEnableTrading() : null));
            }
            SymbolInfoEntity symbolInfoEntity6 = tradeItemBean.getSymbolInfoEntity();
            if (symbolInfoEntity6 != null) {
                symbolInfoEntity6.setEnableAuctionTrade(Boolean.valueOf(C27025c.m66566d(symbolPreviewEntity != null ? symbolPreviewEntity.isEnableAuctionTrade() : null)));
            }
            C37890n.f85269a.m85607H(tradeItemBean.getSymbolInfoEntity());
            tradeItemBean.setSymbolInfoEntity(null);
        }
    }
}
