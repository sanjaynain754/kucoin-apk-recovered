package com.kubi.futures.trade.welfare.distribution;

import ac.C0230b;
import android.content.Context;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.DistributionQuoteEntity;
import com.kubi.kumex.data.market.model.DistributionQuoteFooterEntity;
import com.kubi.kumex.data.market.model.IDistributionData;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.TrendChartView;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37567b;
import gf.C37885i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p419l2.C42032f;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DistributionChooseSymbolAdapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,-B=\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0005H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J\u0018\u0010(\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020)2\u0006\u0010!\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$BaseViewHolder;", "buyClick", "Lkotlin/Function1;", "Lcom/kubi/kumex/data/market/model/DistributionQuoteEntity;", "", "sellClick", "moreClick", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "EXPAND_TYPE", "", "COLLAPSE_TYPE", "FOOTER_TYPE", "expandPosition", "datas", "", "Lcom/kubi/kumex/data/market/model/IDistributionData;", "setData", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "getItemViewType", ViewProps.POSITION, "onBindViewHolder", C33954u6.f72238i, "bindFooterData", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$FooterViewHolder;", "data", "Lcom/kubi/kumex/data/market/model/DistributionQuoteFooterEntity;", "bindCollapseData", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$CollapseViewHolder;", "getUpText", "", "getDownText", "bindExpandData", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$ExpandViewHolder;", "CollapseViewHolder", "ExpandViewHolder", "FooterViewHolder", "BaseViewHolder", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DistributionChooseSymbolAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Function1<DistributionQuoteEntity, Unit> f24730i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Function1<DistributionQuoteEntity, Unit> f24731j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Function0<Unit> f24732k;

    /* JADX INFO: renamed from: l */
    public final int f24733l;

    /* JADX INFO: renamed from: m */
    public final int f24734m;

    /* JADX INFO: renamed from: n */
    public final int f24735n;

    /* JADX INFO: renamed from: o */
    public int f24736o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final List<IDistributionData> f24737p;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.j$a */
    /* JADX INFO: compiled from: DistributionChooseSymbolAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static class a extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.j$b */
    /* JADX INFO: compiled from: DistributionChooseSymbolAdapter.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$CollapseViewHolder;", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$BaseViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImage", "()Landroid/widget/ImageView;", "symbol", "Landroid/widget/TextView;", "getSymbol", "()Landroid/widget/TextView;", FirebaseAnalytics.Param.PRICE, "getPrice", "rate", "getRate", "upText", "getUpText", "registerClick", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: g */
        public final ImageView f24738g;

        /* JADX INFO: renamed from: h */
        public final TextView f24739h;

        /* JADX INFO: renamed from: i */
        public final TextView f24740i;

        /* JADX INFO: renamed from: j */
        public final TextView f24741j;

        /* JADX INFO: renamed from: k */
        public final TextView f24742k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f24738g = (ImageView) this.itemView.findViewById(R$id.image);
            this.f24739h = (TextView) this.itemView.findViewById(R$id.symbol);
            this.f24740i = (TextView) this.itemView.findViewById(R$id.price);
            this.f24741j = (TextView) this.itemView.findViewById(R$id.rate);
            this.f24742k = (TextView) this.itemView.findViewById(R$id.upText);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF24738g() {
            return this.f24738g;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF24740i() {
            return this.f24740i;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF24741j() {
            return this.f24741j;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getF24739h() {
            return this.f24739h;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getF24742k() {
            return this.f24742k;
        }

        /* JADX INFO: renamed from: g */
        public final void m28591g() {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistributionChooseSymbolAdapter.b.m28585h(this.f24758b);
                }
            }, 1, null);
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m28585h(b bVar) {
            DistributionChooseSymbolAdapter distributionChooseSymbolAdapter;
            int bindingAdapterPosition = bVar.getBindingAdapterPosition();
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = bVar.getBindingAdapter();
            if (bindingAdapter instanceof DistributionChooseSymbolAdapter) {
                distributionChooseSymbolAdapter = (DistributionChooseSymbolAdapter) bindingAdapter;
            } else {
                distributionChooseSymbolAdapter = null;
            }
            if (distributionChooseSymbolAdapter == null) {
                return Unit.INSTANCE;
            }
            int itemCount = distributionChooseSymbolAdapter.getItemCount();
            if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                distributionChooseSymbolAdapter.f24736o = bindingAdapterPosition;
                distributionChooseSymbolAdapter.notifyDataSetChanged();
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.j$c */
    /* JADX INFO: compiled from: DistributionChooseSymbolAdapter.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010%\u001a\u00020&R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0017\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0019\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u001b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\u001d\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\u001f\u001a\n \b*\u0004\u0018\u00010 0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010#\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000e¨\u0006'"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$ExpandViewHolder;", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$BaseViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImage", "()Landroid/widget/ImageView;", "symbol", "Landroid/widget/TextView;", "getSymbol", "()Landroid/widget/TextView;", FirebaseAnalytics.Param.PRICE, "getPrice", "rate", "getRate", "upText", "getUpText", "upLabel", "getUpLabel", "downText", "getDownText", "downLabel", "getDownLabel", "buy", "getBuy", "sell", "getSell", "chart", "Lcom/kubi/resources/widget/TrendChartView;", "getChart", "()Lcom/kubi/resources/widget/TrendChartView;", "volume", "getVolume", "registerClick", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: g */
        public final ImageView f24743g;

        /* JADX INFO: renamed from: h */
        public final TextView f24744h;

        /* JADX INFO: renamed from: i */
        public final TextView f24745i;

        /* JADX INFO: renamed from: j */
        public final TextView f24746j;

        /* JADX INFO: renamed from: k */
        public final TextView f24747k;

        /* JADX INFO: renamed from: l */
        public final TextView f24748l;

        /* JADX INFO: renamed from: m */
        public final TextView f24749m;

        /* JADX INFO: renamed from: n */
        public final TextView f24750n;

        /* JADX INFO: renamed from: o */
        public final TextView f24751o;

        /* JADX INFO: renamed from: p */
        public final TextView f24752p;

        /* JADX INFO: renamed from: q */
        public final TrendChartView f24753q;

        /* JADX INFO: renamed from: r */
        public final TextView f24754r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f24743g = (ImageView) this.itemView.findViewById(R$id.image);
            this.f24744h = (TextView) this.itemView.findViewById(R$id.symbol);
            this.f24745i = (TextView) this.itemView.findViewById(R$id.price);
            this.f24746j = (TextView) this.itemView.findViewById(R$id.rate);
            this.f24747k = (TextView) this.itemView.findViewById(R$id.f28673up);
            this.f24748l = (TextView) this.itemView.findViewById(R$id.upLabel);
            this.f24749m = (TextView) this.itemView.findViewById(R$id.down);
            this.f24750n = (TextView) this.itemView.findViewById(R$id.downLabel);
            this.f24751o = (TextView) this.itemView.findViewById(R$id.buy);
            this.f24752p = (TextView) this.itemView.findViewById(R$id.sell);
            this.f24753q = (TrendChartView) this.itemView.findViewById(R$id.chart);
            this.f24754r = (TextView) this.itemView.findViewById(R$id.volume);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF24751o() {
            return this.f24751o;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TrendChartView getF24753q() {
            return this.f24753q;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getF24750n() {
            return this.f24750n;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getF24749m() {
            return this.f24749m;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ImageView getF24743g() {
            return this.f24743g;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextView getF24745i() {
            return this.f24745i;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextView getF24746j() {
            return this.f24746j;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextView getF24752p() {
            return this.f24752p;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextView getF24744h() {
            return this.f24744h;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextView getF24748l() {
            return this.f24748l;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextView getF24747k() {
            return this.f24747k;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextView getF24754r() {
            return this.f24754r;
        }

        /* JADX INFO: renamed from: o */
        public final void m28608o() {
            TextView buy = this.f24751o;
            Intrinsics.checkNotNullExpressionValue(buy, "buy");
            C27046k.m66711z(buy, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistributionChooseSymbolAdapter.c.m28594p(this.f24760b);
                }
            }, 1, null);
            TextView sell = this.f24752p;
            Intrinsics.checkNotNullExpressionValue(sell, "sell");
            C27046k.m66711z(sell, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistributionChooseSymbolAdapter.c.m28595q(this.f24762b);
                }
            }, 1, null);
        }

        /* JADX INFO: renamed from: p */
        public static final Unit m28594p(c cVar) {
            DistributionChooseSymbolAdapter distributionChooseSymbolAdapter;
            int bindingAdapterPosition = cVar.getBindingAdapterPosition();
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = cVar.getBindingAdapter();
            DistributionQuoteEntity distributionQuoteEntity = null;
            if (bindingAdapter instanceof DistributionChooseSymbolAdapter) {
                distributionChooseSymbolAdapter = (DistributionChooseSymbolAdapter) bindingAdapter;
            } else {
                distributionChooseSymbolAdapter = null;
            }
            if (distributionChooseSymbolAdapter == null) {
                return Unit.INSTANCE;
            }
            int itemCount = distributionChooseSymbolAdapter.getItemCount();
            if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                Object obj = distributionChooseSymbolAdapter.f24737p.get(bindingAdapterPosition);
                if (obj instanceof DistributionQuoteEntity) {
                    distributionQuoteEntity = (DistributionQuoteEntity) obj;
                }
                if (distributionQuoteEntity == null) {
                    return Unit.INSTANCE;
                }
                distributionChooseSymbolAdapter.f24730i.invoke(distributionQuoteEntity);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: q */
        public static final Unit m28595q(c cVar) {
            DistributionChooseSymbolAdapter distributionChooseSymbolAdapter;
            int bindingAdapterPosition = cVar.getBindingAdapterPosition();
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = cVar.getBindingAdapter();
            DistributionQuoteEntity distributionQuoteEntity = null;
            if (bindingAdapter instanceof DistributionChooseSymbolAdapter) {
                distributionChooseSymbolAdapter = (DistributionChooseSymbolAdapter) bindingAdapter;
            } else {
                distributionChooseSymbolAdapter = null;
            }
            if (distributionChooseSymbolAdapter == null) {
                return Unit.INSTANCE;
            }
            int itemCount = distributionChooseSymbolAdapter.getItemCount();
            if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                Object obj = distributionChooseSymbolAdapter.f24737p.get(bindingAdapterPosition);
                if (obj instanceof DistributionQuoteEntity) {
                    distributionQuoteEntity = (DistributionQuoteEntity) obj;
                }
                if (distributionQuoteEntity == null) {
                    return Unit.INSTANCE;
                }
                distributionChooseSymbolAdapter.f24731j.invoke(distributionQuoteEntity);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.j$d */
    /* JADX INFO: compiled from: DistributionChooseSymbolAdapter.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$FooterViewHolder;", "Lcom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolAdapter$BaseViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "loading", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getLoading", "()Landroid/widget/ImageView;", "more", "Landroid/widget/TextView;", "getMore", "()Landroid/widget/TextView;", "registerClick", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends a {

        /* JADX INFO: renamed from: g */
        public final ImageView f24755g;

        /* JADX INFO: renamed from: h */
        public final TextView f24756h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f24755g = (ImageView) this.itemView.findViewById(R$id.loading);
            this.f24756h = (TextView) this.itemView.findViewById(R$id.more);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF24755g() {
            return this.f24755g;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF24756h() {
            return this.f24756h;
        }

        /* JADX INFO: renamed from: d */
        public final void m28613d() {
            TextView more = this.f24756h;
            Intrinsics.checkNotNullExpressionValue(more, "more");
            C27046k.m66711z(more, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistributionChooseSymbolAdapter.d.m28610e(this.f24764b);
                }
            }, 1, null);
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m28610e(d dVar) {
            DistributionChooseSymbolAdapter distributionChooseSymbolAdapter;
            int bindingAdapterPosition = dVar.getBindingAdapterPosition();
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = dVar.getBindingAdapter();
            DistributionQuoteFooterEntity distributionQuoteFooterEntity = null;
            if (bindingAdapter instanceof DistributionChooseSymbolAdapter) {
                distributionChooseSymbolAdapter = (DistributionChooseSymbolAdapter) bindingAdapter;
            } else {
                distributionChooseSymbolAdapter = null;
            }
            if (distributionChooseSymbolAdapter == null) {
                return Unit.INSTANCE;
            }
            int itemCount = distributionChooseSymbolAdapter.getItemCount();
            if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                Object obj = distributionChooseSymbolAdapter.f24737p.get(bindingAdapterPosition);
                if (obj instanceof DistributionQuoteFooterEntity) {
                    distributionQuoteFooterEntity = (DistributionQuoteFooterEntity) obj;
                }
                if (distributionQuoteFooterEntity == null) {
                    return Unit.INSTANCE;
                }
                if (distributionQuoteFooterEntity.isLoading()) {
                    return Unit.INSTANCE;
                }
                distributionChooseSymbolAdapter.f24732k.invoke();
                distributionChooseSymbolAdapter.f24737p.set(bindingAdapterPosition, new DistributionQuoteFooterEntity(true));
                distributionChooseSymbolAdapter.notifyItemChanged(bindingAdapterPosition);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistributionChooseSymbolAdapter(@NotNull Function1<? super DistributionQuoteEntity, Unit> buyClick, @NotNull Function1<? super DistributionQuoteEntity, Unit> sellClick, @NotNull Function0<Unit> moreClick) {
        Intrinsics.checkNotNullParameter(buyClick, "buyClick");
        Intrinsics.checkNotNullParameter(sellClick, "sellClick");
        Intrinsics.checkNotNullParameter(moreClick, "moreClick");
        this.f24730i = buyClick;
        this.f24731j = sellClick;
        this.f24732k = moreClick;
        this.f24733l = 1;
        this.f24734m = 2;
        this.f24735n = 3;
        this.f24737p = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f24737p.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (this.f24737p.get(position) instanceof DistributionQuoteFooterEntity) {
            return this.f24735n;
        }
        return position == this.f24736o ? this.f24733l : this.f24734m;
    }

    /* JADX INFO: renamed from: l */
    public final void m28576l(b bVar, DistributionQuoteEntity distributionQuoteEntity) {
        CharSequence symbol;
        String strM92640e;
        Context context = bVar.itemView.getContext();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(distributionQuoteEntity.getSymbol()), false, 2, null);
        ComponentCallbacks2C5309c.m6557u(bVar.getF24738g()).mo6634v(distributionQuoteEntity.getIconUrl()).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(bVar.getF24738g());
        TextView f24739h = bVar.getF24739h();
        if (contractEntityM99529O == null || (symbol = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) == null) {
            symbol = distributionQuoteEntity.getSymbol();
        }
        f24739h.setText(symbol);
        TextView f24740i = bVar.getF24740i();
        BigDecimal lastPrice = distributionQuoteEntity.getLastPrice();
        if (lastPrice != null) {
            strM92640e = C42180b.m92640e(lastPrice, null, C27039d.m66651k(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null, 2), true, false, true, 0, null, 105, null);
        } else {
            strM92640e = null;
        }
        f24740i.setText(strM92640e);
        boolean z11 = C27039d.m66656p(distributionQuoteEntity.getPriceChgPct()).compareTo(BigDecimal.ZERO) >= 0;
        Intrinsics.checkNotNull(context);
        int iM54291p = C22890g.m54291p(context);
        int iM54289n = C22890g.m54289n(context);
        TextView f24741j = bVar.getF24741j();
        BigDecimal priceChgPct = distributionQuoteEntity.getPriceChgPct();
        f24741j.setText(priceChgPct != null ? C42180b.m92642g(priceChgPct, null, null, 0, false, false, true, 31, null) : null);
        bVar.getF24741j().setTextColor(C22890g.m54281f(context, z11));
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        if (z11) {
            bVar.getF24742k().setTextColor(iM54291p);
            TextView f24742k = bVar.getF24742k();
            C27096v0 c27096v0 = new C27096v0();
            BigDecimal upRate = distributionQuoteEntity.getUpRate();
            String strM92642g = upRate != null ? C42180b.m92642g(upRate, null, null, 0, false, false, false, 59, null) : null;
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(C27040e.m66658b(14));
            TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.medium);
            if (typefaceSpanM36545b == null) {
                typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
            }
            f24742k.setText(c27096v0.m66903c(strM92642g, absoluteSizeSpan, typefaceSpanM36545b).append('\n' + m28580p()));
            if (zM33189n) {
                TextView f24742k2 = bVar.getF24742k();
                Intrinsics.checkNotNullExpressionValue(f24742k2, "<get-upText>(...)");
                ViewExKt.m36478d(f24742k2, Integer.valueOf(R$drawable.bkumex_distribution_up_green), null, 2, null);
                return;
            } else {
                TextView f24742k3 = bVar.getF24742k();
                Intrinsics.checkNotNullExpressionValue(f24742k3, "<get-upText>(...)");
                ViewExKt.m36478d(f24742k3, Integer.valueOf(R$drawable.bkumex_distribution_up_red), null, 2, null);
                return;
            }
        }
        bVar.getF24742k().setTextColor(iM54289n);
        TextView f24742k4 = bVar.getF24742k();
        C27096v0 c27096v1 = new C27096v0();
        BigDecimal downRate = distributionQuoteEntity.getDownRate();
        String strM92642g2 = downRate != null ? C42180b.m92642g(downRate, null, null, 0, false, false, false, 59, null) : null;
        AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(C27040e.m66658b(14));
        TypefaceSpan typefaceSpanM36545b2 = C17056l0.m36545b(R$font.medium);
        if (typefaceSpanM36545b2 == null) {
            typefaceSpanM36545b2 = new TypefaceSpan("sans-serif-medium");
        }
        f24742k4.setText(c27096v1.m66903c(strM92642g2, absoluteSizeSpan2, typefaceSpanM36545b2).append('\n' + m28579o()));
        if (zM33189n) {
            TextView f24742k5 = bVar.getF24742k();
            Intrinsics.checkNotNullExpressionValue(f24742k5, "<get-upText>(...)");
            ViewExKt.m36478d(f24742k5, Integer.valueOf(R$drawable.bkumex_distribution_down_red), null, 2, null);
        } else {
            TextView f24742k6 = bVar.getF24742k();
            Intrinsics.checkNotNullExpressionValue(f24742k6, "<get-upText>(...)");
            ViewExKt.m36478d(f24742k6, Integer.valueOf(R$drawable.bkumex_distribution_down_green), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m28577m(c cVar, DistributionQuoteEntity distributionQuoteEntity) {
        CharSequence symbol;
        String strM92640e;
        int color;
        Context context = cVar.itemView.getContext();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(distributionQuoteEntity.getSymbol()), false, 2, null);
        ComponentCallbacks2C5309c.m6557u(cVar.getF24743g()).mo6634v(distributionQuoteEntity.getIconUrl()).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(cVar.getF24743g());
        TextView f24744h = cVar.getF24744h();
        if (contractEntityM99529O == null || (symbol = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) == null) {
            symbol = distributionQuoteEntity.getSymbol();
        }
        f24744h.setText(symbol);
        TextView f24745i = cVar.getF24745i();
        BigDecimal lastPrice = distributionQuoteEntity.getLastPrice();
        if (lastPrice != null) {
            strM92640e = C42180b.m92640e(lastPrice, null, C27039d.m66651k(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null, 2), true, false, true, 0, null, 105, null);
        } else {
            strM92640e = null;
        }
        f24745i.setText(strM92640e);
        boolean z11 = C27039d.m66656p(distributionQuoteEntity.getPriceChgPct()).compareTo(BigDecimal.ZERO) >= 0;
        Intrinsics.checkNotNull(context);
        int iM54291p = C22890g.m54291p(context);
        int iM54289n = C22890g.m54289n(context);
        TextView f24746j = cVar.getF24746j();
        BigDecimal priceChgPct = distributionQuoteEntity.getPriceChgPct();
        f24746j.setText(priceChgPct != null ? C42180b.m92642g(priceChgPct, null, null, 0, false, false, true, 31, null) : null);
        cVar.getF24746j().setTextColor(C22890g.m54281f(context, z11));
        TextView f24754r = cVar.getF24754r();
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.kumex_distribution_order_dialog_volume;
        BigDecimal volume = distributionQuoteEntity.getVolume();
        f24754r.setText(c27017c.m66516f(i11, volume != null ? C37885i.m85567f(volume.doubleValue(), null, 1, null) : null));
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        cVar.getF24747k().setTextColor(iM54291p);
        cVar.getF24748l().setTextColor(iM54291p);
        TextView f24747k = cVar.getF24747k();
        BigDecimal upRate = distributionQuoteEntity.getUpRate();
        f24747k.setText(upRate != null ? C42180b.m92642g(upRate, null, null, 0, false, false, false, 59, null) : null);
        TextView f24747k2 = cVar.getF24747k();
        Intrinsics.checkNotNullExpressionValue(f24747k2, "<get-upText>(...)");
        ViewExKt.m36480f(f24747k2, Integer.valueOf(zM33189n ? R$drawable.bkumex_distribution_up_green : R$drawable.bkumex_distribution_up_red), null, 2, null);
        cVar.getF24749m().setTextColor(iM54289n);
        cVar.getF24750n().setTextColor(iM54289n);
        TextView f24749m = cVar.getF24749m();
        BigDecimal downRate = distributionQuoteEntity.getDownRate();
        f24749m.setText(downRate != null ? C42180b.m92642g(downRate, null, null, 0, false, false, false, 59, null) : null);
        TextView f24749m2 = cVar.getF24749m();
        Intrinsics.checkNotNullExpressionValue(f24749m2, "<get-downText>(...)");
        ViewExKt.m36478d(f24749m2, Integer.valueOf(zM33189n ? R$drawable.bkumex_distribution_down_red : R$drawable.bkumex_distribution_down_green), null, 2, null);
        cVar.getF24751o().setText(m28580p() + '/' + c27017c.m66516f(R$string.contract_long, new Object[0]));
        TextView f24751o = cVar.getF24751o();
        Intrinsics.checkNotNullExpressionValue(f24751o, "<get-buy>(...)");
        C0230b.m848l(f24751o, false, 1, null);
        cVar.getF24752p().setText(m28579o() + '/' + c27017c.m66516f(R$string.contract_short, new Object[0]));
        TextView f24752p = cVar.getF24752p();
        Intrinsics.checkNotNullExpressionValue(f24752p, "<get-sell>(...)");
        C0230b.m852p(f24752p, false, 1, null);
        if (zM33189n) {
            color = z11 ? context.getResources().getColor(R$color.primary20) : context.getResources().getColor(R$color.secondary20);
        } else {
            color = z11 ? context.getResources().getColor(R$color.secondary20) : context.getResources().getColor(R$color.primary20);
        }
        TrendChartView f24753q = cVar.getF24753q();
        List<Double> klineLocal = distributionQuoteEntity.getKlineLocal();
        if (klineLocal == null) {
            klineLocal = CollectionsKt.emptyList();
        }
        if (!z11) {
            iM54291p = iM54289n;
        }
        f24753q.m54911a(klineLocal, iM54291p, color);
    }

    /* JADX INFO: renamed from: o */
    public final String m28579o() {
        return C27017c.f54310a.m66516f(R$string.kumex_distribution_order_dialog_down, new Object[0]);
    }

    /* JADX INFO: renamed from: p */
    public final String m28580p() {
        return C27017c.f54310a.m66516f(R$string.kumex_distribution_order_dialog_up, new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof d) {
            IDistributionData iDistributionData = this.f24737p.get(i11);
            Intrinsics.checkNotNull(iDistributionData, "null cannot be cast to non-null type com.kubi.kumex.data.market.model.DistributionQuoteFooterEntity");
            m28578n((d) holder, (DistributionQuoteFooterEntity) iDistributionData);
        } else if (holder instanceof c) {
            IDistributionData iDistributionData2 = this.f24737p.get(i11);
            Intrinsics.checkNotNull(iDistributionData2, "null cannot be cast to non-null type com.kubi.kumex.data.market.model.DistributionQuoteEntity");
            m28577m((c) holder, (DistributionQuoteEntity) iDistributionData2);
        } else {
            IDistributionData iDistributionData3 = this.f24737p.get(i11);
            Intrinsics.checkNotNull(iDistributionData3, "null cannot be cast to non-null type com.kubi.kumex.data.market.model.DistributionQuoteEntity");
            m28576l((b) holder, (DistributionQuoteEntity) iDistributionData3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i11 == this.f24733l) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.bkumex_item_future_bonus_distribution_expand, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            c cVar = new c(viewInflate);
            cVar.m28608o();
            return cVar;
        }
        if (i11 == this.f24734m) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R$layout.bkumex_item_future_bonus_distribution_collapse, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            b bVar = new b(viewInflate2);
            bVar.m28591g();
            return bVar;
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(R$layout.bkumex_item_future_bonus_distribution_footer, parent, false);
        Intrinsics.checkNotNull(viewInflate3);
        d dVar = new d(viewInflate3);
        dVar.m28613d();
        return dVar;
    }

    /* JADX INFO: renamed from: s */
    public final void m28583s(@NotNull List<? extends IDistributionData> datas) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        this.f24737p.clear();
        this.f24737p.addAll(datas);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    public final void m28578n(d dVar, DistributionQuoteFooterEntity distributionQuoteFooterEntity) {
        ImageView f24755g = dVar.getF24755g();
        Intrinsics.checkNotNullExpressionValue(f24755g, "<get-loading>(...)");
        C27046k.m66684G(f24755g, distributionQuoteFooterEntity.isLoading());
        C24277v.m58539d(dVar.itemView.getContext(), R$drawable.kc_loading, dVar.getF24755g());
        TextView f24756h = dVar.getF24756h();
        Intrinsics.checkNotNullExpressionValue(f24756h, "<get-more>(...)");
        C27046k.m66684G(f24756h, !distributionQuoteFooterEntity.isLoading());
    }
}
