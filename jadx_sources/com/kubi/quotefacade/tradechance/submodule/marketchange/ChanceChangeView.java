package com.kubi.quotefacade.tradechance.submodule.marketchange;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4683n0;
import bv.C4691r0;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.futures.dialog.twap.OrderPriceType;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.ChanceMarketChangeEntity;
import com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView;
import com.kubi.quotefacade.tradechance.submodule.marketchange.ChanceChangeView;
import com.kubi.quotefacade.tradechance.utils.C22586f;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p402kf.C41016c;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: ChanceChangeView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/marketchange/ChanceChangeView;", "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;", "", "Lcom/kubi/quotefacade/entity/ChanceMarketChangeEntity;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceMarketchangeBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceMarketchangeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "msgAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "showEmptyUI", "", "updateDataUI", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "convertItem", "helper", "item", "formatMarketChangeValue", "", "value", "type", "quoteCurrency", "formatMarketChangePrice", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceChangeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceChangeView.kt\ncom/kubi/quotefacade/tradechance/submodule/marketchange/ChanceChangeView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n52#2:179\n80#2,7:180\n1#3:187\n*S KotlinDebug\n*F\n+ 1 ChanceChangeView.kt\ncom/kubi/quotefacade/tradechance/submodule/marketchange/ChanceChangeView\n*L\n52#1:179\n52#1:180,7\n*E\n"})
public final class ChanceChangeView extends BaseChanceChildView<List<? extends ChanceMarketChangeEntity>> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f42683g = {Reflection.property1(new PropertyReference1Impl(ChanceChangeView.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceMarketchangeBinding;", 0))};

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC24293a f42684e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BaseQuickAdapter<ChanceMarketChangeEntity, BaseViewHolder> f42685f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChanceChangeView(@NotNull Context context) {
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42684e = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4691r0>() { // from class: com.kubi.quotefacade.tradechance.submodule.marketchange.ChanceChangeView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4691r0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4691r0.m4694a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.quote_view_tradechance_marketchange, (ViewGroup) this, true);
        C4691r0 binding = getBinding();
        if (binding != null && (baseTextView = binding.f4521d) != null) {
            C27046k.m66710y(baseTextView, 1000L, new Function0() { // from class: ov.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChanceChangeView.m53214j();
                }
            });
        }
        C4691r0 binding2 = getBinding();
        if (binding2 == null || (recyclerView = binding2.f4520c) == null) {
            return;
        }
        C22586f.m53262g(recyclerView);
        final int i11 = R$layout.quote_item_tradechance_market_change;
        final ArrayList arrayList = new ArrayList();
        BaseQuickAdapter<ChanceMarketChangeEntity, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<ChanceMarketChangeEntity, BaseViewHolder>(i11, arrayList) { // from class: com.kubi.quotefacade.tradechance.submodule.marketchange.ChanceChangeView$2$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, ChanceMarketChangeEntity chanceMarketChangeEntity) {
                if (baseViewHolder == null || chanceMarketChangeEntity == null) {
                    return;
                }
                this.f42686i.m53217l(baseViewHolder, chanceMarketChangeEntity);
            }
        };
        this.f42685f = baseQuickAdapter;
        recyclerView.setAdapter(baseQuickAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Unit m53214j() {
        C22586f.m53264i(null, null, null, null, null, 31, null);
        C43852m.m96591c("B5TradeChance", "marketevents", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Nullable
    public final C4691r0 getBinding() {
        return (C4691r0) this.f42684e.getValue(this, f42683g[0]);
    }

    /* JADX INFO: renamed from: o */
    public final String m53219o(String str, String str2, String str3) {
        if (Intrinsics.areEqual(str2, "PRICE")) {
            return m53218n(str, str3);
        }
        if (!Intrinsics.areEqual(str2, OrderPriceType.TYPE_PERCENT)) {
            return m53218n(str, "USD");
        }
        BigDecimal bigDecimalDivide = C41014a.m89922G(C27041f.m66671k(str), null, 1, null).divide(new BigDecimal(C33556b3.f68995S), 4, RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        String strM92649n = C42180b.m92649n(C42180b.m92642g(bigDecimalDivide, null, null, 0, true, false, false, 55, null));
        String strM93911l = C42828b.m93911l(strM92649n);
        return strM93911l == null ? strM92649n : strM93911l;
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo53112e(@NotNull List<ChanceMarketChangeEntity> entity) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C4683n0 c4683n0;
        ConstraintLayout root;
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (entity.isEmpty()) {
            mo53111d();
            return;
        }
        C4691r0 binding = getBinding();
        if (binding != null && (c4683n0 = binding.f4519b) != null && (root = c4683n0.getRoot()) != null) {
            C27046k.m66700o(root);
        }
        C4691r0 binding2 = getBinding();
        if (binding2 != null && (recyclerView2 = binding2.f4520c) != null) {
            C27046k.m66685H(recyclerView2);
        }
        C4691r0 binding3 = getBinding();
        if (binding3 != null && (recyclerView = binding3.f4520c) != null) {
            recyclerView.setItemViewCacheSize(entity.size());
        }
        BaseQuickAdapter<ChanceMarketChangeEntity, BaseViewHolder> baseQuickAdapter = this.f42685f;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.setNewData(CollectionsKt.toMutableList((Collection) entity));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m53216m(ChanceMarketChangeEntity chanceMarketChangeEntity) throws JSONException {
        C22586f.m53264i(null, null, null, C27041f.m66668h(chanceMarketChangeEntity.getId()), null, 23, null);
        JSONObject jSONObject = new JSONObject();
        String item = chanceMarketChangeEntity.getItem();
        if (item == null) {
            item = "";
        }
        jSONObject.put("symbol", item);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5TradeChance", "marketevents", "2", jSONObject);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: d */
    public void mo53111d() {
        C4683n0 c4683n0;
        ConstraintLayout root;
        RecyclerView recyclerView;
        C4691r0 binding = getBinding();
        if (binding != null && (recyclerView = binding.f4520c) != null) {
            C27046k.m66700o(recyclerView);
        }
        C4691r0 binding2 = getBinding();
        if (binding2 != null && (c4683n0 = binding2.f4519b) != null && (root = c4683n0.getRoot()) != null) {
            C27046k.m66685H(root);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m53217l(BaseViewHolder baseViewHolder, final ChanceMarketChangeEntity chanceMarketChangeEntity) {
        String strM66669i;
        String str;
        int iM66699n;
        String baseCurrencyName;
        String quoteCurrencyName;
        if (Intrinsics.areEqual(chanceMarketChangeEntity.getItemType(), "SPOT")) {
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(chanceMarketChangeEntity.getItem());
            if (symbolInfoEntityM85601B != null) {
                baseCurrencyName = symbolInfoEntityM85601B.getBaseCurrencyName();
            } else {
                baseCurrencyName = null;
            }
            String strM66668h = C27041f.m66668h(baseCurrencyName);
            if (strM66668h.length() == 0) {
                strM66668h = "--";
            }
            if (symbolInfoEntityM85601B != null) {
                quoteCurrencyName = symbolInfoEntityM85601B.getQuoteCurrencyName();
            } else {
                quoteCurrencyName = null;
            }
            strM66669i = C27041f.m66668h(quoteCurrencyName);
            if (strM66669i.length() == 0) {
                strM66669i = "--";
            }
            baseViewHolder.setText(R$id.tv_main_symbol_name, strM66668h);
            int i11 = R$id.tv_second_symbol_name;
            baseViewHolder.setText(i11, '/' + strM66669i);
            baseViewHolder.setGone(i11, true);
        } else if (Intrinsics.areEqual(chanceMarketChangeEntity.getItemType(), "FUTURES") && C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            IKuMexService.Companion companion = IKuMexService.f28731a;
            C27096v0 c27096v0M33249T = IKuMexService.m33249T(companion.get(), C27041f.m66668h(chanceMarketChangeEntity.getItem()), false, 2, null);
            IKuMexService iKuMexService = companion.get();
            String item = chanceMarketChangeEntity.getItem();
            if (item == null) {
                item = "";
            }
            Object obj = iKuMexService.mo33286o(item).get("quoteCurrency");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            strM66669i = C27041f.m66669i(str, "USDT");
            baseViewHolder.setText(R$id.tv_main_symbol_name, c27096v0M33249T);
            baseViewHolder.setGone(R$id.tv_second_symbol_name, false);
        } else {
            baseViewHolder.setText(R$id.tv_main_symbol_name, "--");
            baseViewHolder.setGone(R$id.tv_second_symbol_name, false);
            strM66669i = "--";
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: ov.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceChangeView.m53216m(chanceMarketChangeEntity);
            }
        }, 1, null);
        baseViewHolder.setText(R$id.tv_message_time, C22586f.m53259d(C27039d.m66653m(chanceMarketChangeEntity.getCollectAt(), System.currentTimeMillis())));
        baseViewHolder.setText(R$id.tv_message_hint, chanceMarketChangeEntity.getTemplate());
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_message_value);
        if (textView != null) {
            textView.setText(m53219o(C27041f.m66668h(chanceMarketChangeEntity.getValue()), C27041f.m66668h(chanceMarketChangeEntity.getValueType()), strM66669i));
            if (!C41014a.m89919D(C41014a.m89922G(C27041f.m66671k(chanceMarketChangeEntity.getValue()), null, 1, null)) && !Intrinsics.areEqual(textView.getText(), "--")) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iM66699n = C22890g.m54281f(context, Intrinsics.areEqual(chanceMarketChangeEntity.getColor(), "UP"));
            } else {
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iM66699n = C27046k.m66699n(context2, R$color.c_text60);
            }
            textView.setTextColor(iM66699n);
            C24256n1.m58511a(textView);
        }
    }

    /* JADX INFO: renamed from: n */
    public final String m53218n(String str, String str2) {
        Double dM89969g = C41016c.m89969g(str2);
        if (dM89969g != null) {
            double dM66647g = C27039d.m66647g(C27041f.m66671k(str)) * dM89969g.doubleValue();
            if (dM66647g < 1.0d) {
                return C41014a.m89933g(new BigDecimal(String.valueOf(dM66647g)), null, null, 0, false, false, true, 31, null);
            }
            return C41016c.m89966d() + C41014a.m89931e(new BigDecimal(String.valueOf(dM66647g)), false, 1, null);
        }
        return "--";
    }
}
