package com.kubi.spot.quote.market.symbolListItemView;

import a30.C0060d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.IMarginService;
import com.kubi.resources.C22890g;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.api.ISpotService;
import com.kubi.spot.helper.C25307a;
import com.kubi.spot.helper.SymbolInfoHelper;
import com.kubi.spot.helper.TradeManager;
import com.kubi.spot.quote.market.symbolListItemView.SymbolsListAdapter;
import com.kubi.spot.service.SpotDepend;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import eg.InterfaceC37173a;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37762n;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38183a;
import p429lf.C42180b;
import p569qq.C43852m;
import p830zf.InterfaceC46807k0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rs.C44172b;
import w20.C45700a;

/* JADX INFO: compiled from: SymbolsListAdapter.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0015J\u0018\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001f*\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u0014H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, m90084d2 = {"Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "toMarket", "", "symbols", "", "tradeItemBean", "<init>", "(Lcom/kubi/sdk/base/ui/OldBaseFragment;ZLjava/lang/String;Lcom/kubi/data/entity/TradeItemBean;)V", "getFragment", "()Lcom/kubi/sdk/base/ui/OldBaseFragment;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "setTradeItemBean", "(Lcom/kubi/data/entity/TradeItemBean;)V", "indexLongClick", "", "getIndexLongClick", "()I", "setIndexLongClick", "(I)V", "convert", "", "helper", "item", ViewProps.POSITION, "getPairShowSymbol", "Lcom/kubi/utils/StyledText;", "fontSize", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolsListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolsListAdapter.kt\ncom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,181:1\n25#2,2:182\n17#2,2:184\n27#2:186\n17#2,2:187\n43#3,7:189\n*S KotlinDebug\n*F\n+ 1 SymbolsListAdapter.kt\ncom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter\n*L\n59#1:182,2\n62#1:184,2\n59#1:186\n97#1:187,2\n131#1:189,7\n*E\n"})
public final class SymbolsListAdapter extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final OldBaseFragment f51069i;

    /* JADX INFO: renamed from: j */
    public final boolean f51070j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f51071k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public TradeItemBean f51072l;

    /* JADX INFO: renamed from: m */
    public int f51073m;

    public /* synthetic */ SymbolsListAdapter(OldBaseFragment oldBaseFragment, boolean z11, String str, TradeItemBean tradeItemBean, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(oldBaseFragment, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? null : tradeItemBean);
    }

    /* JADX INFO: renamed from: k */
    private final C27096v0 m62734k(TradeItemBean tradeItemBean, int i11) {
        C27096v0 c27096v0M66903c = new C27096v0().m66904d(tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName(), i11).m66903c(" /" + tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName(), new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis40)), new AbsoluteSizeSpan(10, true));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66903c, "append(...)");
        return c27096v0M66903c;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C27096v0 m62735l(SymbolsListAdapter symbolsListAdapter, TradeItemBean tradeItemBean, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 14;
        }
        return symbolsListAdapter.m62734k(tradeItemBean, i11);
    }

    /* JADX INFO: renamed from: o */
    private final void m62736o(TradeItemBean tradeItemBean, int i11) {
        if (this.f51070j) {
            InterfaceC37762n.a.m85177a(C37304a.f82764a, tradeItemBean.getSymbol(), null, null, null, 14, null);
        } else if (!SymbolInfoHelper.f50575a.m61804a(tradeItemBean, true) && !TradeManager.f50593a.m61840o(tradeItemBean.getSymbol())) {
            SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
            ToastCompat.m66441G(TextUtils.isEmpty(symbolInfoEntity.getDisabledTip()) ? this.mContext.getString(R$string.current_trade_pause) : symbolInfoEntity.getDisabledTip(), new Object[0]);
            return;
        } else {
            InterfaceC37754f.a.m85140l(C37304a.f82764a, tradeItemBean.getSymbol(), Boolean.TRUE, null, null, null, null, 60, null);
            C43852m.m96590b("B5trading", "symbolSelectTabList", String.valueOf(i11 + 1), TuplesKt.m90091to("symbol", tradeItemBean.getSymbol()));
        }
        tradeItemBean.setSymbolInfoEntity(null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x015d  */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @Nullable final TradeItemBean tradeItemBean) {
        boolean z11;
        boolean z12;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (tradeItemBean == null) {
            return;
        }
        int i11 = R$id.tv_price;
        View view = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, null, false, 3, null);
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(InterfaceC46807k0.class, siteInfoManager.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46807k0) objM56186h).m103138a(helper);
        } else {
            int i12 = R$id.tv_lever;
            if (tradeItemBean.getSymbolInfoEntity().isShowMarginLeverLabel() && C38183a.m86145a()) {
                Object objM56186h2 = router.m56186h(InterfaceC37173a.class, siteInfoManager.m58109c());
                if (objM56186h2 != null ? ((InterfaceC37173a) objM56186h2).m83139b() : true) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            BaseViewHolder gone = helper.setGone(i12, z11);
            StringBuilder sb2 = new StringBuilder();
            IMarginService iMarginServiceM63033c = SpotDepend.f51244a.m63033c();
            String symbol = tradeItemBean.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            sb2.append(C42180b.m92640e(iMarginServiceM63033c.mo37954q(symbol), null, 4, false, false, false, 0, null, 125, null));
            sb2.append('x');
            gone.setText(i12, sb2.toString());
        }
        BaseViewHolder text = helper.setText(R$id.tv_trade_pair, m62735l(this, tradeItemBean, 0, 1, null)).setText(i11, tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow() ? C33820nf.f71144W : C37886j.m85579c(new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())), tradeItemBean.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        Context context = helper.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BaseViewHolder textColor = text.setTextColor(i11, C22890g.m54278c(context, C27039d.m66646f(tradeItemBean.getChangeRate()), R$color.c_text));
        int i13 = R$id.tv_percent;
        BaseViewHolder text2 = textColor.setText(i13, tradeItemBean.getFormatChangeRateV2());
        Context context2 = helper.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        BaseViewHolder gone2 = text2.setTextColor(i13, C22890g.m54278c(context2, C27039d.m66646f(tradeItemBean.getChangeRate()), R$color.c_text40)).setGone(R$id.tv_label, tradeItemBean.getMark() == 1);
        int i14 = R$id.tv_etf_label;
        if (tradeItemBean.getSymbolInfoEntity().isEtfSymbol()) {
            Object objM56186h3 = router.m56186h(InterfaceC37173a.class, siteInfoManager.m58109c());
            if (objM56186h3 != null ? ((InterfaceC37173a) objM56186h3).m83138a() : true) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        BaseViewHolder gone3 = gone2.setGone(i14, z12).setGone(R$id.tv_ready, tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow());
        int i15 = R$id.tvLabel;
        gone3.setGone(i15, !TextUtils.isEmpty(tradeItemBean.getCoinLabel())).setText(i15, C27041f.m66668h(tradeItemBean.getCoinLabel())).setVisible(R$id.iv_fav, C27025c.m66566d(Boolean.valueOf(C25307a.m61759a(tradeItemBean))) && !Intrinsics.areEqual(this.f51071k, "favor")).setOnClickListener(R$id.fl_root, new View.OnClickListener() { // from class: a30.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SymbolsListAdapter.m62733i(tradeItemBean, this, helper, view2);
            }
        });
        if (tradeItemBean.getSymbolInfoEntity().isEtfSymbol()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C37890n c37890n = C37890n.f85269a;
                String baseCurrency = tradeItemBean.getSymbolInfoEntity().getBaseCurrency();
                Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
                EtfCoinEntity etfCoinEntityM85615w = c37890n.m85615w(baseCurrency);
                if (etfCoinEntityM85615w != null) {
                    helper.setText(i14, this.mContext.getString(Intrinsics.areEqual(etfCoinEntityM85615w.getBuyType(), "L") ? R$string.etf_label_times_long : R$string.etf_label_times_short, etfCoinEntityM85615w.getMultiple()));
                    TextView textView = (TextView) helper.getView(i14);
                    boolean zAreEqual = Intrinsics.areEqual(etfCoinEntityM85615w.getBuyType(), "L");
                    Context mContext = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                    textView.setTextColor(C22890g.m54281f(mContext, zAreEqual));
                    Context mContext2 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                    textView.setBackgroundDrawable(C22890g.m54285j(zAreEqual, mContext2));
                } else {
                    etfCoinEntityM85615w = null;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(etfCoinEntityM85615w);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C45700a.m100877c(thM103847exceptionOrNullimpl, "SymbolsListAdapter-getEtfEntityByCode");
            }
        }
        C0060d.m83a(tradeItemBean).mo82a(helper, tradeItemBean, this.f51069i);
        View view2 = helper.itemView;
        String symbol2 = tradeItemBean.getSymbol();
        TradeItemBean tradeItemBean2 = this.f51072l;
        view2.setBackgroundResource((TextUtils.equals(symbol2, tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null) || this.f51073m == helper.getAdapterPosition()) ? R$color.emphasis2 : R$color.c_bulletLayer);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF51073m() {
        return this.f51073m;
    }

    /* JADX INFO: renamed from: m */
    public final void m62739m(int i11) {
        this.f51073m = i11;
    }

    /* JADX INFO: renamed from: n */
    public final void m62740n(@Nullable TradeItemBean tradeItemBean) {
        this.f51072l = tradeItemBean;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolsListAdapter(@NotNull OldBaseFragment fragment, boolean z11, @Nullable String str, @Nullable TradeItemBean tradeItemBean) {
        super(R$layout.item_view_toggle_symbols);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f51069i = fragment;
        this.f51070j = z11;
        this.f51071k = str;
        this.f51072l = tradeItemBean;
        setHasStableIds(true);
        this.f51073m = -1;
    }

    /* JADX INFO: renamed from: i */
    public static final void m62733i(TradeItemBean tradeItemBean, SymbolsListAdapter symbolsListAdapter, BaseViewHolder baseViewHolder, View view) {
        if (C27014a1.m66501a(view)) {
            return;
        }
        if (tradeItemBean.needPullPreviewInfo()) {
            ISpotService.m59983d(ISpotService.f49646a.get(), symbolsListAdapter.mContext, tradeItemBean, null, 4, null);
        } else {
            symbolsListAdapter.m62736o(tradeItemBean, baseViewHolder.getAdapterPosition());
        }
    }
}
