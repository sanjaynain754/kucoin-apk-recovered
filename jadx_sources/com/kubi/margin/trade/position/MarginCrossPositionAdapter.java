package com.kubi.margin.trade.position;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.entity.LeverConfig;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.margin.trade.dialog.CrossMarginCloseContract$UiIntent;
import com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog;
import com.kubi.margin.view.CrossMarginRiskView;
import com.kubi.margin.view.MarginRiskView;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37756h;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p239ep.C37222c;
import p239ep.C37223d;
import p239ep.C37224e;
import p239ep.C37225f;
import p239ep.InterfaceC37221b;
import p311hf.C38184b;
import p402kf.C41014a;
import p569qq.C43852m;
import p641tp.C45057a;
import p838zo.C46897a;
import p838zo.C46899c;
import p838zo.InterfaceC46898b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: renamed from: com.kubi.margin.trade.position.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarginCrossPositionAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005;<=>?B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0018\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u000200H\u0002J\u0018\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u0002022\u0006\u0010\u001e\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0016J\b\u00105\u001a\u00020\tH\u0002J\b\u00106\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000¨\u0006@"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$BaseCrossPositionViewHolder;", "fragment", "Lcom/kubi/margin/trade/position/MarginWholePositionFragment;", "filterCallback", "Lkotlin/Function2;", "Landroid/view/View;", "", "", "<init>", "(Lcom/kubi/margin/trade/position/MarginWholePositionFragment;Lkotlin/jvm/functions/Function2;)V", "getFragment", "()Lcom/kubi/margin/trade/position/MarginWholePositionFragment;", "list", "Ljava/util/ArrayList;", "Lcom/kubi/margin/entity/MarginCrossPosition;", "Lkotlin/collections/ArrayList;", "submitData", "lists", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "bindMarginCrossPositionOfCurrent", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$CurrentCrossPositionViewHolder;", "crossPosition", "Lcom/kubi/margin/entity/MarginCrossPositionOfCurrent;", "updateUnderClosePositionText", "context", "Landroid/content/Context;", "status", "Lcom/kubi/margin/api/entity/ILiquidationStatus;", "bindMarginCrossPositionOfOther", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$OtherCrossPositionViewHolder;", "Lcom/kubi/margin/entity/MarginCrossPositionOfOther;", "bindMarginCrossPositionOfHeader", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$HeaderCrossPositionViewHolder;", "Lcom/kubi/margin/entity/MarginCrossPositionOfHeader;", "updateOneKeyCloseStatusText", "closeStatusView", "Landroid/widget/TextView;", "showCloseDialog", "isCancel", "", "bindMarginCrossPositionOfEmpty", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$EmptyCrossPositionViewHolder;", "Lcom/kubi/margin/entity/MarginCrossPositionOfEmpty;", "getItemViewType", "clickTransfer", "getItemCount", "TYPE_CURRENT", "TYPE_OTHER", "TYPE_EMPTY", "TYPE_HEADER", "HeaderCrossPositionViewHolder", "EmptyCrossPositionViewHolder", "CurrentCrossPositionViewHolder", "OtherCrossPositionViewHolder", "BaseCrossPositionViewHolder", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginCrossPositionAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MarginWholePositionFragment f34066i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Function2<View, Integer, Unit> f34067j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ArrayList<InterfaceC37221b> f34068k;

    /* JADX INFO: renamed from: l */
    public final int f34069l;

    /* JADX INFO: renamed from: m */
    public final int f34070m;

    /* JADX INFO: renamed from: n */
    public final int f34071n;

    /* JADX INFO: renamed from: o */
    public final int f34072o;

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.m$a */
    /* JADX INFO: compiled from: MarginCrossPositionAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$BaseCrossPositionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static class a extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View parent) {
            super(parent);
            Intrinsics.checkNotNullParameter(parent, "parent");
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.m$b */
    /* JADX INFO: compiled from: MarginCrossPositionAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00100\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0017\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0019\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u001b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u001d\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0019\u0010\u001f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u0019\u0010!\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0019\u0010#\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u0019\u0010%\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\nR\u0019\u0010'\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR\u0019\u0010)\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\u0019\u0010+\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\nR\u0019\u0010-\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\nR\u0019\u0010/\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\nR\u0019\u00101\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\nR\u0019\u00103\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\nR\u0019\u00105\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\n¨\u00067"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$CurrentCrossPositionViewHolder;", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$BaseCrossPositionViewHolder;", "parent", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tvTotalAsset", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvTotalAsset", "()Landroid/widget/TextView;", "tvTotalAssetValue", "getTvTotalAssetValue", "tvDebtValue", "getTvDebtValue", "riskView", "Lcom/kubi/margin/view/CrossMarginRiskView;", "getRiskView", "()Lcom/kubi/margin/view/CrossMarginRiskView;", "tvBaseSymbol", "getTvBaseSymbol", "tvBaseAvailableValue", "getTvBaseAvailableValue", "tvBaseFreezeValue", "getTvBaseFreezeValue", "tvBaseDebtValue", "getTvBaseDebtValue", "tvBaseAvailableLegal", "getTvBaseAvailableLegal", "tvBaseFreezeLegal", "getTvBaseFreezeLegal", "tvBaseDebtLegal", "getTvBaseDebtLegal", "tvQuoteSymbol", "getTvQuoteSymbol", "tvQuoteAvailableValue", "getTvQuoteAvailableValue", "tvQuoteFreezeValue", "getTvQuoteFreezeValue", "tvQuoteDebtValue", "getTvQuoteDebtValue", "tvQuoteAvailableLegal", "getTvQuoteAvailableLegal", "tvQuoteFreezeLegal", "getTvQuoteFreezeLegal", "tvQuoteDebtLegal", "getTvQuoteDebtLegal", "btnTransfer", "getBtnTransfer", "btnBorrow", "getBtnBorrow", "btnReturn", "getBtnReturn", "tvUnderClosePosition", "getTvUnderClosePosition", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: A */
        public final TextView f34073A;

        /* JADX INFO: renamed from: B */
        public final TextView f34074B;

        /* JADX INFO: renamed from: g */
        public final TextView f34075g;

        /* JADX INFO: renamed from: h */
        public final TextView f34076h;

        /* JADX INFO: renamed from: i */
        public final TextView f34077i;

        /* JADX INFO: renamed from: j */
        public final CrossMarginRiskView f34078j;

        /* JADX INFO: renamed from: k */
        public final TextView f34079k;

        /* JADX INFO: renamed from: l */
        public final TextView f34080l;

        /* JADX INFO: renamed from: m */
        public final TextView f34081m;

        /* JADX INFO: renamed from: n */
        public final TextView f34082n;

        /* JADX INFO: renamed from: o */
        public final TextView f34083o;

        /* JADX INFO: renamed from: p */
        public final TextView f34084p;

        /* JADX INFO: renamed from: q */
        public final TextView f34085q;

        /* JADX INFO: renamed from: r */
        public final TextView f34086r;

        /* JADX INFO: renamed from: s */
        public final TextView f34087s;

        /* JADX INFO: renamed from: t */
        public final TextView f34088t;

        /* JADX INFO: renamed from: u */
        public final TextView f34089u;

        /* JADX INFO: renamed from: v */
        public final TextView f34090v;

        /* JADX INFO: renamed from: w */
        public final TextView f34091w;

        /* JADX INFO: renamed from: x */
        public final TextView f34092x;

        /* JADX INFO: renamed from: y */
        public final TextView f34093y;

        /* JADX INFO: renamed from: z */
        public final TextView f34094z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View parent) {
            super(parent);
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f34075g = (TextView) this.itemView.findViewById(R$id.tv_total_asset);
            this.f34076h = (TextView) this.itemView.findViewById(R$id.tv_total_asset_value);
            this.f34077i = (TextView) this.itemView.findViewById(R$id.tv_debt_value);
            this.f34078j = (CrossMarginRiskView) this.itemView.findViewById(R$id.margin_risk_view);
            this.f34079k = (TextView) this.itemView.findViewById(R$id.tv_base_symbol);
            this.f34080l = (TextView) this.itemView.findViewById(R$id.tv_base_available_value);
            this.f34081m = (TextView) this.itemView.findViewById(R$id.tv_base_freeze_value);
            this.f34082n = (TextView) this.itemView.findViewById(R$id.tv_base_debt_value);
            this.f34083o = (TextView) this.itemView.findViewById(R$id.tv_base_available_legal);
            this.f34084p = (TextView) this.itemView.findViewById(R$id.tv_base_freeze_legal);
            this.f34085q = (TextView) this.itemView.findViewById(R$id.tv_base_debt_legal);
            this.f34086r = (TextView) this.itemView.findViewById(R$id.tv_quote_symbol);
            this.f34087s = (TextView) this.itemView.findViewById(R$id.tv_quote_available_value);
            this.f34088t = (TextView) this.itemView.findViewById(R$id.tv_quote_freeze_value);
            this.f34089u = (TextView) this.itemView.findViewById(R$id.tv_quote_debt_value);
            this.f34090v = (TextView) this.itemView.findViewById(R$id.tv_quote_available_legal);
            this.f34091w = (TextView) this.itemView.findViewById(R$id.tv_quote_freeze_legal);
            this.f34092x = (TextView) this.itemView.findViewById(R$id.tv_quote_debt_legal);
            this.f34093y = (TextView) this.itemView.findViewById(R$id.btn_transfer);
            this.f34094z = (TextView) this.itemView.findViewById(R$id.btn_borrow);
            this.f34073A = (TextView) this.itemView.findViewById(R$id.btn_return);
            this.f34074B = (TextView) this.itemView.findViewById(R$id.tvUnderClosePosition);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getF34094z() {
            return this.f34094z;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF34073A() {
            return this.f34073A;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF34093y() {
            return this.f34093y;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final CrossMarginRiskView getF34078j() {
            return this.f34078j;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getF34083o() {
            return this.f34083o;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextView getF34080l() {
            return this.f34080l;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextView getF34085q() {
            return this.f34085q;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextView getF34082n() {
            return this.f34082n;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextView getF34084p() {
            return this.f34084p;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextView getF34081m() {
            return this.f34081m;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextView getF34079k() {
            return this.f34079k;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextView getF34077i() {
            return this.f34077i;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextView getF34090v() {
            return this.f34090v;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final TextView getF34087s() {
            return this.f34087s;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final TextView getF34092x() {
            return this.f34092x;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final TextView getF34089u() {
            return this.f34089u;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final TextView getF34091w() {
            return this.f34091w;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final TextView getF34088t() {
            return this.f34088t;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final TextView getF34086r() {
            return this.f34086r;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final TextView getF34075g() {
            return this.f34075g;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final TextView getF34076h() {
            return this.f34076h;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final TextView getF34074B() {
            return this.f34074B;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.m$c */
    /* JADX INFO: compiled from: MarginCrossPositionAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$EmptyCrossPositionViewHolder;", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$BaseCrossPositionViewHolder;", "parent", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tvTransfer", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvTransfer", "()Landroid/widget/TextView;", "emptyTips", "getEmptyTips", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: g */
        public final TextView f34095g;

        /* JADX INFO: renamed from: h */
        public final TextView f34096h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull View parent) {
            super(parent);
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f34095g = (TextView) this.itemView.findViewById(R$id.tv_transfer);
            this.f34096h = (TextView) this.itemView.findViewById(R$id.tv_empty_tips);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getF34096h() {
            return this.f34096h;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF34095g() {
            return this.f34095g;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.m$d */
    /* JADX INFO: compiled from: MarginCrossPositionAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$HeaderCrossPositionViewHolder;", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$BaseCrossPositionViewHolder;", "parent", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "checkBox", "Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "getCheckBox", "()Landroid/widget/CheckBox;", "tvOneKeyClose", "Landroid/widget/TextView;", "getTvOneKeyClose", "()Landroid/widget/TextView;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends a {

        /* JADX INFO: renamed from: g */
        public final CheckBox f34097g;

        /* JADX INFO: renamed from: h */
        public final TextView f34098h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull View parent) {
            super(parent);
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f34097g = (CheckBox) this.itemView.findViewById(R$id.checkbox);
            this.f34098h = (TextView) this.itemView.findViewById(R$id.tvOneKeyClose);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CheckBox getF34097g() {
            return this.f34097g;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF34098h() {
            return this.f34098h;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.m$e */
    /* JADX INFO: compiled from: MarginCrossPositionAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0019\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$OtherCrossPositionViewHolder;", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter$BaseCrossPositionViewHolder;", "parent", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tvBaseSymbol", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvBaseSymbol", "()Landroid/widget/TextView;", "tvAvailableValue", "getTvAvailableValue", "tvFreezeValue", "getTvFreezeValue", "tvDebtValue", "getTvDebtValue", "tvAvailableLegal", "getTvAvailableLegal", "tvFreezeLegal", "getTvFreezeLegal", "tvDebtLegal", "getTvDebtLegal", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e extends a {

        /* JADX INFO: renamed from: g */
        public final TextView f34099g;

        /* JADX INFO: renamed from: h */
        public final TextView f34100h;

        /* JADX INFO: renamed from: i */
        public final TextView f34101i;

        /* JADX INFO: renamed from: j */
        public final TextView f34102j;

        /* JADX INFO: renamed from: k */
        public final TextView f34103k;

        /* JADX INFO: renamed from: l */
        public final TextView f34104l;

        /* JADX INFO: renamed from: m */
        public final TextView f34105m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull View parent) {
            super(parent);
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f34099g = (TextView) this.itemView.findViewById(R$id.tv_base_symbol);
            this.f34100h = (TextView) this.itemView.findViewById(R$id.tv_base_available_value);
            this.f34101i = (TextView) this.itemView.findViewById(R$id.tv_base_freeze_value);
            this.f34102j = (TextView) this.itemView.findViewById(R$id.tv_base_debt_value);
            this.f34103k = (TextView) this.itemView.findViewById(R$id.tv_base_available_legal);
            this.f34104l = (TextView) this.itemView.findViewById(R$id.tv_base_freeze_legal);
            this.f34105m = (TextView) this.itemView.findViewById(R$id.tv_base_debt_legal);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getF34103k() {
            return this.f34103k;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF34100h() {
            return this.f34100h;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF34099g() {
            return this.f34099g;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getF34105m() {
            return this.f34105m;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getF34102j() {
            return this.f34102j;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextView getF34104l() {
            return this.f34104l;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextView getF34101i() {
            return this.f34101i;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.m$f */
    /* JADX INFO: compiled from: MarginCrossPositionAdapter.kt */
    @Metadata(m90083d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0011"}, m90084d2 = {"com/kubi/margin/trade/position/MarginCrossPositionAdapter$bindMarginCrossPositionOfCurrent$1", "Lcom/kubi/margin/view/MarginRiskView$IRiskData;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "status", "", "value", "", "riskGrade", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "transferableAmountDebtRatio", "Ljava/math/BigDecimal;", "flDebtRatio", "isIsolateMargin", "", "quoteCurrency", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class f implements MarginRiskView.InterfaceC18593a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C37222c f34107b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LeverConfig f34108c;

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: b */
        public boolean mo40121b() {
            return false;
        }

        public f(C37222c c37222c, LeverConfig leverConfig) {
            this.f34107b = c37222c;
            this.f34108c = leverConfig;
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: a */
        public String mo40651a() {
            return MarginCrossPositionAdapter.this.getF34066i().m40569N().getQuoteCurrency();
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: c */
        public String mo40122c() {
            return C27041f.m66668h(this.f34108c.getRiskGrade());
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: d */
        public BigDecimal mo40123d() {
            return this.f34108c.getLiquidationDebtRatio();
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: e */
        public SymbolInfoEntity mo40124e() {
            return MarginCrossPositionAdapter.this.getF34066i().m40569N();
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: f */
        public BigDecimal mo40125f() {
            return this.f34108c.getTransferableAmountDebtRatio();
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BaseFragment mo40120H() {
            return MarginCrossPositionAdapter.this.getF34066i();
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        public String status() {
            return C27041f.m66668h(this.f34107b.getF82542c().getStatus());
        }

        @Override // com.kubi.margin.view.MarginRiskView.InterfaceC18593a
        public double value() {
            return C27039d.m66647g(this.f34107b.getF82542c().getLiabilityRate());
        }
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m40587P(MarginCrossPositionAdapter marginCrossPositionAdapter) {
        m40585L(marginCrossPositionAdapter, false, 1, null);
        C45057a.f101456a.m99655b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m40588Q(MarginCrossPositionAdapter marginCrossPositionAdapter) {
        marginCrossPositionAdapter.m40612K(true);
        C45057a.f101456a.m99654a();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarginCrossPositionAdapter(@NotNull MarginWholePositionFragment fragment, @NotNull Function2<? super View, ? super Integer, Unit> filterCallback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(filterCallback, "filterCallback");
        this.f34066i = fragment;
        this.f34067j = filterCallback;
        this.f34068k = new ArrayList<>();
        this.f34069l = 1;
        this.f34070m = 2;
        this.f34071n = 3;
        this.f34072o = 4;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m40582D(C37225f c37225f) {
        InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(c37225f.getF82546a().getCurrency()), 3L, null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m40583F(MarginCrossPositionAdapter marginCrossPositionAdapter) {
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, marginCrossPositionAdapter.f34066i.m40569N().getQuoteCurrency(), null, marginCrossPositionAdapter.f34066i.m40569N().getCode(), "TRADE", "MARGIN", false, C43852m.m96601m("B4tradingCross", "orderManagement", "13"), 34, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final void m40584J(MarginCrossPositionAdapter marginCrossPositionAdapter, d dVar, View view) {
        Function2<View, Integer, Unit> function2 = marginCrossPositionAdapter.f34067j;
        Intrinsics.checkNotNull(view);
        function2.invoke(view, Integer.valueOf(dVar.getAdapterPosition()));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m40585L(MarginCrossPositionAdapter marginCrossPositionAdapter, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        marginCrossPositionAdapter.m40612K(z11);
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m40586M(MarginCrossPositionAdapter marginCrossPositionAdapter, CrossMarginCloseContract$UiIntent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        marginCrossPositionAdapter.f34066i.m40580t4(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m40601t(MarginCrossPositionAdapter marginCrossPositionAdapter) {
        C43852m.m96591c("B4tradingCross", "orderManagement", "14", null, 8, null);
        InterfaceC37756h.a.m85144b(C37304a.f82764a, marginCrossPositionAdapter.f34066i.m40569N().getQuoteCurrency(), marginCrossPositionAdapter.f34066i.m40569N().getCode(), "borrow", "cross", C43852m.m96601m("B4tradingCross", "orderManagement", "14"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m40602u(CurrencyBalance currencyBalance) {
        InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(currencyBalance.getCurrency()), 3L, null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m40603v(CurrencyBalance currencyBalance) {
        InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(currencyBalance.getCurrency()), 3L, null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m40605x(MarginCrossPositionAdapter marginCrossPositionAdapter) {
        C43852m.m96591c("B4tradingCross", "orderManagement", "15", null, 8, null);
        InterfaceC37756h.a.m85144b(C37304a.f82764a, marginCrossPositionAdapter.f34066i.m40569N().getQuoteCurrency(), marginCrossPositionAdapter.f34066i.m40569N().getCode(), "repay", "cross", C43852m.m96601m("B4tradingCross", "orderManagement", "15"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public final void m40608E() {
        C43852m.m96591c("B4tradingCross", "orderManagement", "13", null, 8, null);
        MarginConfigManager.f33681a.m39880Z(this.f34066i, new Function0() { // from class: com.kubi.margin.trade.position.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCrossPositionAdapter.m40583F(this.f34020b);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: G, reason: from getter */
    public final MarginWholePositionFragment getF34066i() {
        return this.f34066i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i11 == -1) {
            return;
        }
        InterfaceC37221b interfaceC37221b = this.f34068k.get(i11);
        Intrinsics.checkNotNullExpressionValue(interfaceC37221b, "get(...)");
        InterfaceC37221b interfaceC37221b2 = interfaceC37221b;
        if (interfaceC37221b2 instanceof C37222c) {
            if (holder instanceof b) {
                m40616s((b) holder, (C37222c) interfaceC37221b2);
                return;
            }
            return;
        }
        if (interfaceC37221b2 instanceof C37225f) {
            if (holder instanceof e) {
                m40607C((e) holder, (C37225f) interfaceC37221b2);
            }
        } else if (interfaceC37221b2 instanceof C37223d) {
            if (holder instanceof c) {
                m40617y((c) holder, (C37223d) interfaceC37221b2);
            }
        } else {
            if (!(interfaceC37221b2 instanceof C37224e)) {
                throw new NoWhenBranchMatchedException();
            }
            if (holder instanceof d) {
                m40606B((d) holder, (C37224e) interfaceC37221b2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i11 == this.f34069l) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.bmargin_item_cross_position_current, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new b(viewInflate);
        }
        if (i11 == this.f34070m) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R$layout.bmargin_item_cross_position, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new e(viewInflate2);
        }
        if (i11 == this.f34071n) {
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(R$layout.bmargin_item_cross_position_empty, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new c(viewInflate3);
        }
        if (i11 != this.f34072o) {
            TextView textView = new TextView(parent.getContext());
            textView.setText("Margin Cross has problem, please refresh.");
            parent.addView(textView);
            return new a(textView);
        }
        View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(R$layout.bmargin_item_cross_position_header, parent, false);
        Intrinsics.checkNotNull(viewInflate4);
        final d dVar = new d(viewInflate4);
        ((CheckBox) viewInflate4.findViewById(R$id.checkbox)).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.margin.trade.position.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginCrossPositionAdapter.m40584J(this.f34061b, dVar, view);
            }
        });
        return dVar;
    }

    /* JADX INFO: renamed from: K */
    public final void m40612K(boolean z11) {
        CrossMarginClosePositionDialog crossMarginClosePositionDialog = new CrossMarginClosePositionDialog();
        crossMarginClosePositionDialog.setArguments(BundleKt.bundleOf(new Pair("isCancelLiquidation", Boolean.valueOf(z11))));
        crossMarginClosePositionDialog.m40084Z3(new Function1() { // from class: com.kubi.margin.trade.position.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossPositionAdapter.m40586M(this.f34016b, (CrossMarginCloseContract$UiIntent) obj);
            }
        });
        FragmentManager childFragmentManager = this.f34066i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        crossMarginClosePositionDialog.show(childFragmentManager, "closeCross");
    }

    /* JADX INFO: renamed from: N */
    public final void m40613N(@NotNull List<? extends InterfaceC37221b> lists) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        this.f34068k.clear();
        this.f34068k.addAll(lists);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final void m40614O(TextView textView, InterfaceC46898b interfaceC46898b) {
        if (Intrinsics.areEqual(interfaceC46898b, InterfaceC46898b.c.f104764a) || Intrinsics.areEqual(interfaceC46898b, InterfaceC46898b.d.f104765a)) {
            ViewExtKt.m66577h(textView);
            return;
        }
        if (Intrinsics.areEqual(interfaceC46898b, InterfaceC46898b.a.f104762a)) {
            ViewExtKt.m66594y(textView);
            textView.setText(R$string.kc_margin_cross_close_position);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.margin.trade.position.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginCrossPositionAdapter.m40587P(this.f34053b);
                }
            }, 1, null);
        } else {
            if (!Intrinsics.areEqual(interfaceC46898b, InterfaceC46898b.b.f104763a)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewExtKt.m66594y(textView);
            textView.setText(R$string.kc_margin_cross_close_position_cancle);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.margin.trade.position.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginCrossPositionAdapter.m40588Q(this.f34058b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m40615R(Context context, b bVar, InterfaceC46898b interfaceC46898b) {
        if (Intrinsics.areEqual(interfaceC46898b, InterfaceC46898b.d.f104765a)) {
            bVar.getF34074B().setText(context.getString(R$string.one_click_closing_cancellation_in_progress));
            TextView f34074b = bVar.getF34074B();
            Intrinsics.checkNotNullExpressionValue(f34074b, "<get-tvUnderClosePosition>(...)");
            ViewExtKt.m66594y(f34074b);
            return;
        }
        if (!Intrinsics.areEqual(interfaceC46898b, InterfaceC46898b.b.f104763a)) {
            TextView f34074b2 = bVar.getF34074B();
            Intrinsics.checkNotNullExpressionValue(f34074b2, "<get-tvUnderClosePosition>(...)");
            ViewExtKt.m66577h(f34074b2);
        } else {
            bVar.getF34074B().setText(context.getString(R$string.kc_margin_cross_closing_status));
            TextView f34074b3 = bVar.getF34074B();
            Intrinsics.checkNotNullExpressionValue(f34074b3, "<get-tvUnderClosePosition>(...)");
            ViewExtKt.m66594y(f34074b3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f34068k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        InterfaceC37221b interfaceC37221b = this.f34068k.get(position);
        if (interfaceC37221b instanceof C37222c) {
            return this.f34069l;
        }
        if (interfaceC37221b instanceof C37225f) {
            return this.f34070m;
        }
        if (interfaceC37221b instanceof C37223d) {
            return this.f34071n;
        }
        if (interfaceC37221b instanceof C37224e) {
            return this.f34072o;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: s */
    public final void m40616s(b bVar, C37222c c37222c) {
        String strM85578b;
        BigDecimal bigDecimalDivide;
        String strM85578b2;
        BigDecimal bigDecimalDivide2;
        TextView f34077i = bVar.getF34077i();
        BigDecimal bigDecimalM89922G = C41014a.m89922G(this.f34066i.getF34008Z(), null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM89922G.compareTo(bigDecimal) == 0) {
            strM85578b = "--";
        } else {
            BigDecimal totalLiability = c37222c.getF82542c().getTotalLiability();
            strM85578b = (totalLiability == null || (bigDecimalDivide = totalLiability.divide(C41014a.m89922G(this.f34066i.getF34008Z(), null, 1, null), 20, RoundingMode.DOWN)) == null) ? null : C37886j.m85578b(bigDecimalDivide, "USDT", null, false, false, true, 2, null, 0, 206, null);
        }
        f34077i.setText(strM85578b);
        Context context = bVar.getF34074B().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        m40615R(context, bVar, C46899c.m103306a(c37222c.getF82542c()));
        TextView f34075g = bVar.getF34075g();
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.cross_margin_assets;
        C38184b c38184b = C38184b.f85884a;
        f34075g.setText(c27017c.m66516f(i11, c38184b.m86146a()));
        TextView f34076h = bVar.getF34076h();
        if (C41014a.m89922G(this.f34066i.getF34008Z(), null, 1, null).compareTo(bigDecimal) == 0) {
            strM85578b2 = "--";
        } else {
            BigDecimal totalBalance = c37222c.getF82542c().getTotalBalance();
            strM85578b2 = (totalBalance == null || (bigDecimalDivide2 = totalBalance.divide(C41014a.m89922G(this.f34066i.getF34008Z(), null, 1, null), 20, RoundingMode.DOWN)) == null) ? null : C37886j.m85578b(bigDecimalDivide2, c38184b.m86146a(), null, false, false, true, 2, null, 0, 206, null);
        }
        f34076h.setText(strM85578b2);
        bVar.getF34078j().setRisk(new f(c37222c, MarginConfigManager.f33681a.m39877W0()));
        final CurrencyBalance f82540a = c37222c.getF82540a();
        bVar.getF34079k().setText(f82540a.getCurrencyName());
        TextView f34079k = bVar.getF34079k();
        Intrinsics.checkNotNullExpressionValue(f34079k, "<get-tvBaseSymbol>(...)");
        C27046k.m66711z(f34079k, 0L, new Function0() { // from class: com.kubi.margin.trade.position.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCrossPositionAdapter.m40602u(f82540a);
            }
        }, 1, null);
        TextView f34080l = bVar.getF34080l();
        Intrinsics.checkNotNullExpressionValue(f34080l, "<get-tvBaseAvailableValue>(...)");
        C44172b.m97383c(f34080l, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        TextView f34081m = bVar.getF34081m();
        Intrinsics.checkNotNullExpressionValue(f34081m, "<get-tvBaseFreezeValue>(...)");
        C44172b.m97383c(f34081m, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        TextView f34082n = bVar.getF34082n();
        Intrinsics.checkNotNullExpressionValue(f34082n, "<get-tvBaseDebtValue>(...)");
        C44172b.m97383c(f34082n, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        bVar.getF34080l().setText(C27041f.m66669i(C46897a.m103290b(f82540a), "--"));
        bVar.getF34083o().setText(C27041f.m66669i(C46897a.m103289a(f82540a), "--"));
        bVar.getF34082n().setText(C27041f.m66669i(C46897a.m103298j(f82540a), "--"));
        bVar.getF34085q().setText(C27041f.m66669i(C46897a.m103297i(f82540a), "--"));
        bVar.getF34081m().setText(C27041f.m66669i(C46897a.m103301m(f82540a), "--"));
        bVar.getF34084p().setText(C27041f.m66669i(C46897a.m103291c(f82540a), "--"));
        final CurrencyBalance f82541b = c37222c.getF82541b();
        bVar.getF34086r().setText(f82541b.getCurrencyName());
        TextView f34086r = bVar.getF34086r();
        Intrinsics.checkNotNullExpressionValue(f34086r, "<get-tvQuoteSymbol>(...)");
        C27046k.m66711z(f34086r, 0L, new Function0() { // from class: com.kubi.margin.trade.position.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCrossPositionAdapter.m40603v(f82541b);
            }
        }, 1, null);
        TextView f34087s = bVar.getF34087s();
        Intrinsics.checkNotNullExpressionValue(f34087s, "<get-tvQuoteAvailableValue>(...)");
        C44172b.m97383c(f34087s, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        TextView f34089u = bVar.getF34089u();
        Intrinsics.checkNotNullExpressionValue(f34089u, "<get-tvQuoteDebtValue>(...)");
        C44172b.m97383c(f34089u, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        TextView f34088t = bVar.getF34088t();
        Intrinsics.checkNotNullExpressionValue(f34088t, "<get-tvQuoteFreezeValue>(...)");
        C44172b.m97383c(f34088t, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        bVar.getF34087s().setText(C27041f.m66669i(C46897a.m103290b(f82541b), "--"));
        bVar.getF34090v().setText(C27041f.m66669i(C46897a.m103289a(f82541b), "--"));
        bVar.getF34089u().setText(C27041f.m66669i(C46897a.m103298j(f82541b), "--"));
        bVar.getF34092x().setText(C27041f.m66669i(C46897a.m103297i(f82541b), "--"));
        bVar.getF34088t().setText(C27041f.m66669i(C46897a.m103301m(f82541b), "--"));
        bVar.getF34091w().setText(C27041f.m66669i(C46897a.m103291c(f82541b), "--"));
        LeverBalance f82542c = c37222c.getF82542c();
        boolean zAreEqual = Intrinsics.areEqual(f82542c.getStatus(), "FROZEN_FL");
        boolean zAreEqual2 = Intrinsics.areEqual(f82542c.getStatus(), "FROZEN_RENEW");
        boolean zIsLiability = f82542c.isLiability();
        TextView f34093y = bVar.getF34093y();
        f34093y.setEnabled((zAreEqual || zAreEqual2) ? false : true);
        Intrinsics.checkNotNull(f34093y);
        C27046k.m66711z(f34093y, 0L, new Function0() { // from class: com.kubi.margin.trade.position.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCrossPositionAdapter.m40604w(this.f34035b);
            }
        }, 1, null);
        TextView f34073a = bVar.getF34073A();
        f34073a.setEnabled(((C27039d.m66647g(f82540a.getLiability()) == 0.0d && C27039d.m66647g(f82541b.getLiability()) == 0.0d) || zAreEqual || zIsLiability || zAreEqual2) ? false : true);
        Intrinsics.checkNotNull(f34073a);
        C27046k.m66711z(f34073a, 0L, new Function0() { // from class: com.kubi.margin.trade.position.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCrossPositionAdapter.m40605x(this.f34039b);
            }
        }, 1, null);
        TextView f34094z = bVar.getF34094z();
        f34094z.setEnabled((zAreEqual || zIsLiability || zAreEqual2) ? false : true);
        Intrinsics.checkNotNull(f34094z);
        C27046k.m66711z(f34094z, 0L, new Function0() { // from class: com.kubi.margin.trade.position.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCrossPositionAdapter.m40601t(this.f34046b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m40581A(MarginCrossPositionAdapter marginCrossPositionAdapter) {
        marginCrossPositionAdapter.m40608E();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m40604w(MarginCrossPositionAdapter marginCrossPositionAdapter) {
        marginCrossPositionAdapter.m40608E();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m40606B(d dVar, C37224e c37224e) {
        dVar.getF34097g().setChecked(c37224e.getF82544a());
        TextView f34098h = dVar.getF34098h();
        Intrinsics.checkNotNullExpressionValue(f34098h, "<get-tvOneKeyClose>(...)");
        m40614O(f34098h, c37224e.getF82545b());
    }

    /* JADX INFO: renamed from: C */
    public final void m40607C(e eVar, final C37225f c37225f) {
        TextView f34100h = eVar.getF34100h();
        Intrinsics.checkNotNullExpressionValue(f34100h, "<get-tvAvailableValue>(...)");
        C44172b.m97383c(f34100h, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        TextView f34102j = eVar.getF34102j();
        Intrinsics.checkNotNullExpressionValue(f34102j, "<get-tvDebtValue>(...)");
        C44172b.m97383c(f34102j, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        TextView f34101i = eVar.getF34101i();
        Intrinsics.checkNotNullExpressionValue(f34101i, "<get-tvFreezeValue>(...)");
        C44172b.m97383c(f34101i, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        eVar.getF34099g().setText(c37225f.getF82546a().getCurrencyName());
        TextView f34099g = eVar.getF34099g();
        Intrinsics.checkNotNullExpressionValue(f34099g, "<get-tvBaseSymbol>(...)");
        C27046k.m66711z(f34099g, 0L, new Function0() { // from class: com.kubi.margin.trade.position.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCrossPositionAdapter.m40582D(c37225f);
            }
        }, 1, null);
        eVar.getF34100h().setText(c37225f.getF82546a().getAvailableBalanceStr());
        eVar.getF34103k().setText(c37225f.getF82546a().getAvailableBalancePriceStr());
        eVar.getF34102j().setText(c37225f.getF82546a().getLiabilityStr());
        eVar.getF34105m().setText(c37225f.getF82546a().getLiabilityPriceStr());
        eVar.getF34101i().setText(c37225f.getF82546a().getHoldBalanceStr());
        eVar.getF34104l().setText(c37225f.getF82546a().getHoldBalancePriceStr());
    }

    /* JADX INFO: renamed from: y */
    public final void m40617y(c cVar, C37223d c37223d) {
        TextView f34095g = cVar.getF34095g();
        Intrinsics.checkNotNullExpressionValue(f34095g, "<get-tvTransfer>(...)");
        C27046k.m66711z(f34095g, 0L, new Function0() { // from class: com.kubi.margin.trade.position.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCrossPositionAdapter.m40581A(this.f34050b);
            }
        }, 1, null);
        TextView f34096h = cVar.getF34096h();
        C27017c c27017c = C27017c.f54310a;
        f34096h.setText(c27017c.m66516f(R$string.margin_account_empty_tips, c27017c.m66516f(R$string.margin_whole_account, new Object[0])));
    }
}
