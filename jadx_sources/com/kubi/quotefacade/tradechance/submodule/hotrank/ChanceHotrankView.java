package com.kubi.quotefacade.tradechance.submodule.hotrank;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4683n0;
import bv.C4689q0;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.ChanceDiscoverConfig;
import com.kubi.quotefacade.entity.ChanceHotRankEntity;
import com.kubi.quotefacade.entity.ChanceHotRankItem;
import com.kubi.quotefacade.entity.ChanceHotRankItemOperationTag;
import com.kubi.quotefacade.entity.ChanceHotRankItemTag;
import com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView;
import com.kubi.quotefacade.tradechance.submodule.hotrank.ChanceHotrankView;
import com.kubi.quotefacade.tradechance.utils.C22586f;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.QuoteCompareIndicator;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import gf.C37886j;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p311hf.C38184b;
import p402kf.C41014a;
import p481ny.C42899b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import rs.C44172b;
import w00.C45682f;

/* JADX INFO: compiled from: ChanceHotrankView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000fH\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/hotrank/ChanceHotrankView;", "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;", "Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceHotrankBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceHotrankBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coinsAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/entity/ChanceHotRankItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "showEmptyUI", "", "updateDataUI", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "showRankRulesDialog", "config", "Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;", "setUpDownCount", "countDown", "", "countUp", "convertListItem", "helper", "coin", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceHotrankView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceHotrankView.kt\ncom/kubi/quotefacade/tradechance/submodule/hotrank/ChanceHotrankView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n52#2:209\n80#2,7:210\n1#3:217\n*S KotlinDebug\n*F\n+ 1 ChanceHotrankView.kt\ncom/kubi/quotefacade/tradechance/submodule/hotrank/ChanceHotrankView\n*L\n58#1:209\n58#1:210,7\n*E\n"})
public final class ChanceHotrankView extends BaseChanceChildView<ChanceHotRankEntity> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f42679g = {Reflection.property1(new PropertyReference1Impl(ChanceHotrankView.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceHotrankBinding;", 0))};

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC24293a f42680e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BaseQuickAdapter<ChanceHotRankItem, BaseViewHolder> f42681f;

    /* JADX INFO: renamed from: s */
    public final void m53208s(int i11, int i12) {
        QuoteCompareIndicator quoteCompareIndicator;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        QuoteCompareIndicator quoteCompareIndicator2;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        QuoteCompareIndicator quoteCompareIndicator3;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i11, 0);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i12, 0);
        if (iCoerceAtLeast == 0 && iCoerceAtLeast2 == 0) {
            C4689q0 binding = getBinding();
            if (binding != null && (baseTextView8 = binding.f4502f) != null) {
                C27046k.m66700o(baseTextView8);
            }
            C4689q0 binding2 = getBinding();
            if (binding2 != null && (baseTextView7 = binding2.f4503g) != null) {
                C27046k.m66700o(baseTextView7);
            }
            C4689q0 binding3 = getBinding();
            if (binding3 == null || (quoteCompareIndicator3 = binding3.f4500d) == null) {
                return;
            }
            C27046k.m66700o(quoteCompareIndicator3);
            return;
        }
        C4689q0 binding4 = getBinding();
        if (binding4 != null && (baseTextView6 = binding4.f4502f) != null) {
            C27046k.m66685H(baseTextView6);
        }
        C4689q0 binding5 = getBinding();
        if (binding5 != null && (baseTextView5 = binding5.f4503g) != null) {
            C27046k.m66685H(baseTextView5);
        }
        C4689q0 binding6 = getBinding();
        if (binding6 != null && (quoteCompareIndicator2 = binding6.f4500d) != null) {
            C27046k.m66685H(quoteCompareIndicator2);
        }
        C4689q0 binding7 = getBinding();
        if (binding7 != null && (baseTextView4 = binding7.f4502f) != null) {
            baseTextView4.setText(getContext().getString(R$string.discover_hotcoins_indicator_down, String.valueOf(iCoerceAtLeast)));
        }
        C4689q0 binding8 = getBinding();
        if (binding8 != null && (baseTextView3 = binding8.f4502f) != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            baseTextView3.setTextColor(C22890g.m54289n(context));
        }
        C4689q0 binding9 = getBinding();
        if (binding9 != null && (baseTextView2 = binding9.f4503g) != null) {
            baseTextView2.setText(getContext().getString(R$string.discover_hotcoins_indicator_up, String.valueOf(iCoerceAtLeast2)));
        }
        C4689q0 binding10 = getBinding();
        if (binding10 != null && (baseTextView = binding10.f4503g) != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            baseTextView.setTextColor(C22890g.m54291p(context2));
        }
        C4689q0 binding11 = getBinding();
        if (binding11 == null || (quoteCompareIndicator = binding11.f4500d) == null) {
            return;
        }
        QuoteCompareIndicator.m54722g(quoteCompareIndicator, iCoerceAtLeast2, iCoerceAtLeast, 0, 0, 12, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChanceHotrankView(@NotNull Context context) {
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42680e = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4689q0>() { // from class: com.kubi.quotefacade.tradechance.submodule.hotrank.ChanceHotrankView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4689q0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4689q0.m4690a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.quote_view_tradechance_hotrank, (ViewGroup) this, true);
        C4689q0 binding = getBinding();
        if (binding != null && (baseTextView = binding.f4507k) != null) {
            C27046k.m66710y(baseTextView, 1000L, new Function0() { // from class: nv.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChanceHotrankView.m53200n();
                }
            });
        }
        C4689q0 binding2 = getBinding();
        if (binding2 == null || (recyclerView = binding2.f4501e) == null) {
            return;
        }
        C22586f.m53262g(recyclerView);
        final int i11 = R$layout.quote_item_tradechance_hotrank;
        final ArrayList arrayList = new ArrayList();
        BaseQuickAdapter<ChanceHotRankItem, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<ChanceHotRankItem, BaseViewHolder>(i11, arrayList) { // from class: com.kubi.quotefacade.tradechance.submodule.hotrank.ChanceHotrankView$2$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, ChanceHotRankItem chanceHotRankItem) {
                if (baseViewHolder == null || chanceHotRankItem == null) {
                    return;
                }
                this.f42682i.m53207p(baseViewHolder, chanceHotRankItem);
            }
        };
        this.f42681f = baseQuickAdapter;
        recyclerView.setAdapter(baseQuickAdapter);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m53200n() {
        C23767n.m56877a("discover/rankingList", false);
        C43852m.m96591c("B5TradeChance", "morerank", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m53202q(ChanceHotRankItem chanceHotRankItem, ChanceHotRankItemTag tag, int i11) throws JSONException {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (C27039d.m66650j(tag.getType()) == 2) {
            String strM66668h = C27041f.m66668h(tag.getTagId());
            Router.f46192a.m56184f(C23767n.m56883g("discover/rankingList", false)).m4038a("tagId", strM66668h).m4048k();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("symbol", chanceHotRankItem.getSymbolCode());
            jSONObject.put("index", i11);
            jSONObject.put("name", strM66668h);
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B5TradeChance", "hottag", "1", jSONObject);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m53203r(ChanceHotRankItem chanceHotRankItem) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), chanceHotRankItem.getSymbolCode(), null, null, null, 14, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", chanceHotRankItem.getSymbolCode());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5TradeChance", "hotcoin", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m53205v(AlertDialogFragmentHelper alertDialogFragmentHelper, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        alertDialogFragmentHelper.show(supportFragmentManager, "showRankRulesDialog");
        return Unit.INSTANCE;
    }

    @Nullable
    public final C4689q0 getBinding() {
        return (C4689q0) this.f42680e.getValue(this, f42679g[0]);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX INFO: renamed from: p */
    public final BaseViewHolder m53207p(BaseViewHolder baseViewHolder, final ChanceHotRankItem chanceHotRankItem) {
        String strM89933g;
        String strM85579c;
        Object next;
        int i11 = R$id.iv_flag_holder;
        Boolean holding = chanceHotRankItem.getHolding();
        baseViewHolder.setGone(i11, holding != null && C27025c.m66566d(holding));
        List<ChanceHotRankItemOperationTag> operationTags = chanceHotRankItem.getOperationTags();
        if (operationTags == null || operationTags.isEmpty()) {
            baseViewHolder.setGone(R$id.tv_heat_surge, false);
        } else {
            baseViewHolder.setGone(R$id.tv_heat_surge, true);
            List<ChanceHotRankItemOperationTag> operationTags2 = chanceHotRankItem.getOperationTags();
            if (operationTags2 != null) {
                Iterator<T> it = operationTags2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Integer displayType = ((ChanceHotRankItemOperationTag) next).getDisplayType();
                    if (displayType != null && displayType.intValue() == 101) {
                        break;
                    }
                }
                ChanceHotRankItemOperationTag chanceHotRankItemOperationTag = (ChanceHotRankItemOperationTag) next;
                if (chanceHotRankItemOperationTag == null || baseViewHolder.setText(R$id.tv_heat_surge, C27041f.m66668h(chanceHotRankItemOperationTag.getTitle())) == null) {
                    baseViewHolder.setGone(R$id.tv_heat_surge, false);
                }
            } else {
                baseViewHolder.setGone(R$id.tv_heat_surge, false);
            }
        }
        baseViewHolder.setText(R$id.tv_hotcoins_name, chanceHotRankItem.getName());
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_hotcoins_rank_icon);
        String iconUrl = chanceHotRankItem.getIconUrl();
        C24277v.m58542g(imageView, iconUrl != null ? C27041f.m66668h(iconUrl) : null);
        int i12 = R$id.tv_hotcoins_trade_num;
        BigDecimal volValue = chanceHotRankItem.getVolValue();
        String str = "--";
        baseViewHolder.setText(i12, C27041f.m66669i(volValue != null ? C37885i.m85566e(C27039d.m66647g(volValue), C27041f.m66668h(chanceHotRankItem.getQuoteCurrency())) : null, "--"));
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_hotcoins_price_usdt);
        if (textView != null) {
            BigDecimal price = chanceHotRankItem.getPrice();
            if (price == null || (strM85579c = C37886j.m85579c(price, chanceHotRankItem.getSymbolCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 2 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null)) == null) {
                strM85579c = "--";
            }
            textView.setText(strM85579c);
            C44172b.m97383c(textView, null, false, 3, null);
            C24256n1.m58511a(textView);
        }
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_hotcoins_price_dollar);
        if (textView2 != null) {
            BigDecimal price2 = chanceHotRankItem.getPrice();
            if (price2 != null && (strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(price2, C27041f.m66668h(chanceHotRankItem.getQuoteCurrency())))), null, null, 0, false, false, true, 31, null)) != null) {
                str = strM89933g;
            }
            textView2.setText(str);
            C44172b.m97383c(textView2, null, false, 3, null);
            C24256n1.m58511a(textView2);
        }
        int i13 = R$id.tv_hotcoins_price_change_num;
        baseViewHolder.setText(i13, chanceHotRankItem.getFormatChangeRate());
        if (chanceHotRankItem.getChangeRate() != null) {
            double dM66647g = C27039d.m66647g(chanceHotRankItem.getChangeRate());
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C22890g.m54293r(baseViewHolder, i13, C22890g.m54286k(dM66647g, context));
        }
        FlexboxLayout flexboxLayout = (FlexboxLayout) baseViewHolder.getView(R$id.ll_flexbox);
        if (flexboxLayout != null) {
            flexboxLayout.removeAllViews();
            List<ChanceHotRankItemTag> tags = chanceHotRankItem.getTags();
            flexboxLayout.setVisibility((tags == null || tags.isEmpty()) ? 8 : 0);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C22586f.m53257b(flexboxLayout, context2, chanceHotRankItem.getTags(), new Function2() { // from class: nv.b
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChanceHotrankView.m53202q(chanceHotRankItem, (ChanceHotRankItemTag) obj, ((Integer) obj2).intValue());
                }
            });
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: nv.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceHotrankView.m53203r(chanceHotRankItem);
            }
        });
        return baseViewHolder;
    }

    /* JADX INFO: renamed from: t */
    public final void m53209t(ChanceDiscoverConfig chanceDiscoverConfig) {
        if (chanceDiscoverConfig == null) {
            return;
        }
        final AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.discover_hotcoins_subtitle).m54156M4(chanceDiscoverConfig.getTopCurrencyRole()).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: nv.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ChanceHotrankView.m53204u(dialogInterface, i11);
            }
        });
        alertDialogFragmentHelperM54162S4.setCancelable(false);
        C42899b.m94073c(new Function1() { // from class: nv.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChanceHotrankView.m53205v(alertDialogFragmentHelperM54162S4, (FragmentActivity) obj);
            }
        });
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo53112e(@NotNull final ChanceHotRankEntity entity) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        Group group;
        C4683n0 c4683n0;
        ConstraintLayout root;
        Intrinsics.checkNotNullParameter(entity, "entity");
        List<ChanceHotRankItem> items = entity.getItems();
        if (items == null || items.isEmpty()) {
            mo53111d();
            return;
        }
        C4689q0 binding = getBinding();
        if (binding != null && (c4683n0 = binding.f4499c) != null && (root = c4683n0.getRoot()) != null) {
            C27046k.m66700o(root);
        }
        C4689q0 binding2 = getBinding();
        if (binding2 != null && (group = binding2.f4498b) != null) {
            C27046k.m66685H(group);
        }
        C4689q0 binding3 = getBinding();
        if (binding3 != null && (baseTextView4 = binding3.f4509m) != null) {
            baseTextView4.setText(entity.getTitle());
        }
        C4689q0 binding4 = getBinding();
        if (binding4 != null && (baseTextView3 = binding4.f4508l) != null) {
            baseTextView3.setVisibility(entity.getConfig() == null ? 8 : 0);
        }
        C4689q0 binding5 = getBinding();
        if (binding5 != null && (baseTextView2 = binding5.f4508l) != null) {
            C27046k.m66710y(baseTextView2, 1000L, new Function0() { // from class: nv.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChanceHotrankView.m53206x(this.f94952b, entity);
                }
            });
        }
        m53208s(C27039d.m66650j(entity.getDownNum()), C27039d.m66650j(entity.getUpNum()));
        String strM86147b = C38184b.f85884a.m86147b();
        if (strM86147b.length() == 0) {
            strM86147b = "USDT";
        }
        C4689q0 binding6 = getBinding();
        if (binding6 != null && (baseTextView = binding6.f4505i) != null) {
            baseTextView.setText(getContext().getString(R$string.price_order, strM86147b));
        }
        BaseQuickAdapter<ChanceHotRankItem, BaseViewHolder> baseQuickAdapter = this.f42681f;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.setNewData(entity.getItems());
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m53204u(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m53206x(ChanceHotrankView chanceHotrankView, ChanceHotRankEntity chanceHotRankEntity) {
        chanceHotrankView.m53209t(chanceHotRankEntity.getConfig());
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: d */
    public void mo53111d() {
        C4683n0 c4683n0;
        ConstraintLayout root;
        Group group;
        C4689q0 binding = getBinding();
        if (binding != null && (group = binding.f4498b) != null) {
            C27046k.m66700o(group);
        }
        C4689q0 binding2 = getBinding();
        if (binding2 != null && (c4683n0 = binding2.f4499c) != null && (root = c4683n0.getRoot()) != null) {
            C27046k.m66685H(root);
        }
    }
}
