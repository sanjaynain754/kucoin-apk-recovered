package com.kubi.quotefacade.tradechance.submodule.gembox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4683n0;
import bv.C4685o0;
import bv.C4687p0;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.ChanceGemBoxCurrency;
import com.kubi.quotefacade.entity.ChanceGemBoxEntity;
import com.kubi.quotefacade.entity.ChanceGemBoxTextItem;
import com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView;
import com.kubi.quotefacade.tradechance.utils.C22586f;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.LtrLinearLayoutManager;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
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
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: ChanceGemBoxView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u0016\u0010\u001c\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u0018\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceGemBoxView;", "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;", "Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceGemboxBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceGemboxBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "otherCoinsAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;", "Lio/chad/library/adapter/base/BaseViewHolder;", "lastTextItems", "", "Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "gemBoxJumpUrl", "", "showEmptyUI", "", "updateDataUI", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "refreshCurrency", "data", "refreshOtherCurrency", "currencyList", "convertOtherCoinsItem", "helper", "item", "onMoveStart", "onMoveStop", "onAgainShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceGemBoxView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceGemBoxView.kt\ncom/kubi/quotefacade/tradechance/submodule/gembox/ChanceGemBoxView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n52#2:233\n80#2,7:234\n1#3:241\n*S KotlinDebug\n*F\n+ 1 ChanceGemBoxView.kt\ncom/kubi/quotefacade/tradechance/submodule/gembox/ChanceGemBoxView\n*L\n55#1:233\n55#1:234,7\n*E\n"})
public final class ChanceGemBoxView extends BaseChanceChildView<ChanceGemBoxEntity> {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f42638i = {Reflection.property1(new PropertyReference1Impl(ChanceGemBoxView.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceGemboxBinding;", 0))};

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC24293a f42639e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BaseQuickAdapter<ChanceGemBoxCurrency, BaseViewHolder> f42640f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public List<ChanceGemBoxTextItem> f42641g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public String f42642h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChanceGemBoxView(@NotNull Context context) {
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42639e = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4685o0>() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.ChanceGemBoxView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4685o0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4685o0.m4682a(C45682f.m100800a(viewGroup));
            }
        });
        this.f42641g = new ArrayList();
        LayoutInflater.from(context).inflate(R$layout.quote_view_tradechance_gembox, (ViewGroup) this, true);
        C4685o0 binding = getBinding();
        if (binding != null && (baseTextView = binding.f4473e) != null) {
            C27046k.m66710y(baseTextView, 1000L, new Function0() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChanceGemBoxView.m53118l(this.f42660b);
                }
            });
        }
        C4685o0 binding2 = getBinding();
        if (binding2 == null || (recyclerView = binding2.f4472d) == null) {
            return;
        }
        C22586f.m53262g(recyclerView);
        recyclerView.addItemDecoration(new StrictDividerItemDecoration(0, C27040e.m66658b(14), 0, 4, null));
        final int i11 = R$layout.quote_item_tradechance_gembox_other_coin;
        final ArrayList arrayList = new ArrayList();
        BaseQuickAdapter<ChanceGemBoxCurrency, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<ChanceGemBoxCurrency, BaseViewHolder>(i11, arrayList) { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.ChanceGemBoxView$2$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, ChanceGemBoxCurrency chanceGemBoxCurrency) {
                if (baseViewHolder == null || chanceGemBoxCurrency == null) {
                    return;
                }
                this.f42643i.m53123n(baseViewHolder, chanceGemBoxCurrency);
            }
        };
        this.f42640f = baseQuickAdapter;
        recyclerView.setAdapter(baseQuickAdapter);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m53118l(ChanceGemBoxView chanceGemBoxView) {
        String str = chanceGemBoxView.f42642h;
        if (str != null) {
            RouteExKt.m56217H(str);
        }
        C43852m.m96591c("B5TradeChance", "gemboxmore", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m53120o(ChanceGemBoxCurrency chanceGemBoxCurrency) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), chanceGemBoxCurrency.getSymbolCode(), null, null, null, 14, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", chanceGemBoxCurrency.getSymbolCode());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5TradeChance", "gemboxright", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m53121q(ChanceGemBoxView chanceGemBoxView, final ChanceGemBoxCurrency chanceGemBoxCurrency) {
        C4687p0 c4687p0;
        String strM85579c;
        String strM92642g;
        C4685o0 binding = chanceGemBoxView.getBinding();
        if (binding == null || (c4687p0 = binding.f4470b) == null) {
            return Unit.INSTANCE;
        }
        RecyclerView recyclerView = c4687p0.f4489e;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(new LtrLinearLayoutManager(context, 0, false, 4, null));
        C22586f.m53262g(recyclerView);
        String heatValue = chanceGemBoxCurrency.getHeatValue();
        String strM93917r = null;
        float fM66649i = C27039d.m66649i(heatValue != null ? StringsKt.toFloatOrNull(heatValue) : null, 0.0f, 1, null);
        final int i11 = R$layout.quote_item_tradechance_gembox_heat;
        final List<Integer> listM53177o = ChanceGemBoxHelper.f42656a.m53177o(fM66649i);
        recyclerView.setAdapter(new BaseQuickAdapter<Integer, BaseViewHolder>(i11, listM53177o) { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.ChanceGemBoxView$refreshCurrency$1$1$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, Integer num) {
                if (baseViewHolder != null) {
                    baseViewHolder.setImageResource(R$id.icon, num != null ? num.intValue() : R$mipmap.ic_gembox_heat_grey_cover08);
                }
            }
        });
        String str = "--";
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66669i(chanceGemBoxCurrency.getSymbolCode(), "--"));
        c4687p0.f4491g.setText(C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getBaseCurrencyName() : null, "--"));
        C24277v.m58540e(chanceGemBoxView.getContext(), chanceGemBoxCurrency.getIconUrl(), c4687p0.f4487c);
        BaseTextView baseTextView = c4687p0.f4493i;
        BigDecimal changeRate = chanceGemBoxCurrency.getChangeRate();
        if (changeRate != null && (strM92642g = C42180b.m92642g(changeRate, null, null, C41014a.m89951y(changeRate), true, false, false, 19, null)) != null) {
            str = strM92642g;
        }
        baseTextView.setText(str);
        BaseTextView baseTextView2 = c4687p0.f4493i;
        Context context2 = chanceGemBoxView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        baseTextView2.setTextColor(C22890g.m54279d(context2, C27039d.m66647g(chanceGemBoxCurrency.getChangeRate()), 0, 2, null));
        BaseTextView baseTextView3 = c4687p0.f4492h;
        BigDecimal price = chanceGemBoxCurrency.getPrice();
        if (price != null && (strM85579c = C37886j.m85579c(price, chanceGemBoxCurrency.getSymbolCode(), (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.HALF_UP, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null)) != null) {
            strM93917r = C42828b.m93917r(strM85579c, chanceGemBoxCurrency.getSymbolCode());
        }
        baseTextView3.setText(strM93917r);
        List<ChanceGemBoxTextItem> highLightsTextItems = chanceGemBoxCurrency.getHighLightsTextItems();
        if (highLightsTextItems == null) {
            highLightsTextItems = CollectionsKt.emptyList();
        }
        if (!Intrinsics.areEqual(chanceGemBoxView.f42641g, highLightsTextItems)) {
            c4687p0.f4490f.setData(highLightsTextItems);
        }
        chanceGemBoxView.f42641g = highLightsTextItems;
        chanceGemBoxView.f42642h = chanceGemBoxCurrency.getJumpLink();
        ConstraintLayout root = c4687p0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C27046k.m66710y(root, 1000L, new Function0() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceGemBoxView.m53122r(chanceGemBoxCurrency);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final C4685o0 getBinding() {
        return (C4685o0) this.f42639e.getValue(this, f42638i[0]);
    }

    /* JADX INFO: renamed from: n */
    public final void m53123n(BaseViewHolder baseViewHolder, final ChanceGemBoxCurrency chanceGemBoxCurrency) {
        BigDecimal bigDecimal;
        String strM92642g;
        Context context = baseViewHolder.itemView.getContext();
        String str = "--";
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66669i(chanceGemBoxCurrency.getSymbolCode(), "--"));
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivLogo);
        if (imageView != null) {
            C24277v.m58540e(context, chanceGemBoxCurrency.getIconUrl(), imageView);
        }
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvName);
        if (textView != null) {
            textView.setText(C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getBaseCurrencyName() : null, "--"));
            C24256n1.m58512b(textView);
        }
        BigDecimal changeRate = chanceGemBoxCurrency.getChangeRate();
        int i11 = R$id.tvValue;
        if (changeRate != null && (strM92642g = C42180b.m92642g(changeRate, null, null, 0, true, false, false, 23, null)) != null) {
            str = strM92642g;
        }
        baseViewHolder.setText(i11, str);
        Intrinsics.checkNotNull(context);
        baseViewHolder.setTextColor(i11, C22890g.m54280e(context, C41014a.m89922G(changeRate, null, 1, null), R$color.c_text40));
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.itemListHeat);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LtrLinearLayoutManager(context, 0, false, 4, null));
            C22586f.m53262g(recyclerView);
            BigDecimal bigDecimalM66671k = C27041f.m66671k(chanceGemBoxCurrency.getHeatValue());
            if (bigDecimalM66671k == null || (bigDecimal = (BigDecimal) RangesKt.coerceAtMost(bigDecimalM66671k, new BigDecimal("5"))) == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            final int i12 = R$layout.quote_item_tradechance_gembox_heat;
            final List<Integer> listM53178p = ChanceGemBoxHelper.f42656a.m53178p(bigDecimal.floatValue());
            recyclerView.setAdapter(new BaseQuickAdapter<Integer, BaseViewHolder>(i12, listM53178p) { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.ChanceGemBoxView$convertOtherCoinsItem$3$1
                @Override // io.chad.library.adapter.base.BaseQuickAdapter
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public void convert(BaseViewHolder baseViewHolder2, Integer num) {
                    if (baseViewHolder2 != null) {
                        baseViewHolder2.setImageResource(R$id.icon, num != null ? num.intValue() : R$mipmap.ic_gembox_heat_grey_cover08);
                    }
                }
            });
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceGemBoxView.m53120o(chanceGemBoxCurrency);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m53124p(final ChanceGemBoxCurrency chanceGemBoxCurrency) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceGemBoxView.m53121q(this.f42661b, chanceGemBoxCurrency);
            }
        });
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo53112e(@NotNull ChanceGemBoxEntity entity) {
        C4685o0 binding;
        BaseTextView baseTextView;
        RecyclerView recyclerView;
        C4687p0 c4687p0;
        ConstraintLayout root;
        C4683n0 c4683n0;
        ConstraintLayout root2;
        Intrinsics.checkNotNullParameter(entity, "entity");
        List<ChanceGemBoxCurrency> currencyList = entity.getCurrencyList();
        if (currencyList == null) {
            currencyList = CollectionsKt.emptyList();
        }
        if (currencyList.isEmpty()) {
            mo53111d();
            return;
        }
        C4685o0 binding2 = getBinding();
        if (binding2 != null && (c4683n0 = binding2.f4471c) != null && (root2 = c4683n0.getRoot()) != null) {
            C27046k.m66700o(root2);
        }
        C4685o0 binding3 = getBinding();
        if (binding3 != null && (c4687p0 = binding3.f4470b) != null && (root = c4687p0.getRoot()) != null) {
            C27046k.m66685H(root);
        }
        m53124p(currencyList.get(0));
        C4685o0 binding4 = getBinding();
        if (binding4 != null && (recyclerView = binding4.f4472d) != null) {
            recyclerView.setVisibility(currencyList.size() <= 1 ? 8 : 0);
        }
        m53125s(currencyList);
        String str = this.f42642h;
        if ((str != null && str.length() != 0) || (binding = getBinding()) == null || (baseTextView = binding.f4473e) == null) {
            return;
        }
        C27046k.m66700o(baseTextView);
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m53122r(ChanceGemBoxCurrency chanceGemBoxCurrency) {
        String jumpLink = chanceGemBoxCurrency.getJumpLink();
        if (jumpLink != null) {
            RouteExKt.m56217H(jumpLink);
        }
        C43852m.m96591c("B5TradeChance", "gemboxleft", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView, mv.InterfaceC42657b
    /* JADX INFO: renamed from: P */
    public void mo53107P() {
        C4687p0 c4687p0;
        ConstraintLayout root;
        C4685o0 binding;
        C4687p0 c4687p1;
        ChanceMarqueeView chanceMarqueeView;
        super.mo53107P();
        C4685o0 binding2 = getBinding();
        if (binding2 != null && (c4687p0 = binding2.f4470b) != null && (root = c4687p0.getRoot()) != null && C27046k.m66704s(root) && (binding = getBinding()) != null && (c4687p1 = binding.f4470b) != null && (chanceMarqueeView = c4687p1.f4490f) != null) {
            chanceMarqueeView.m53145o();
        }
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView, mv.InterfaceC42657b
    /* JADX INFO: renamed from: Q */
    public void mo53108Q() {
        C4687p0 c4687p0;
        ConstraintLayout root;
        C4685o0 binding;
        C4687p0 c4687p1;
        ChanceMarqueeView chanceMarqueeView;
        super.mo53108Q();
        C4685o0 binding2 = getBinding();
        if (binding2 != null && (c4687p0 = binding2.f4470b) != null && (root = c4687p0.getRoot()) != null && C27046k.m66704s(root) && (binding = getBinding()) != null && (c4687p1 = binding.f4470b) != null && (chanceMarqueeView = c4687p1.f4490f) != null) {
            chanceMarqueeView.m53143m();
        }
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: b */
    public void mo53109b() {
        C4687p0 c4687p0;
        ConstraintLayout root;
        C4685o0 binding;
        C4687p0 c4687p1;
        ChanceMarqueeView chanceMarqueeView;
        super.mo53109b();
        C4685o0 binding2 = getBinding();
        if (binding2 != null && (c4687p0 = binding2.f4470b) != null && (root = c4687p0.getRoot()) != null && C27046k.m66704s(root) && (binding = getBinding()) != null && (c4687p1 = binding.f4470b) != null && (chanceMarqueeView = c4687p1.f4490f) != null) {
            chanceMarqueeView.m53145o();
        }
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: c */
    public void mo53110c() {
        C4687p0 c4687p0;
        ConstraintLayout root;
        C4685o0 binding;
        C4687p0 c4687p1;
        ChanceMarqueeView chanceMarqueeView;
        super.mo53110c();
        C4685o0 binding2 = getBinding();
        if (binding2 != null && (c4687p0 = binding2.f4470b) != null && (root = c4687p0.getRoot()) != null && C27046k.m66704s(root) && (binding = getBinding()) != null && (c4687p1 = binding.f4470b) != null && (chanceMarqueeView = c4687p1.f4490f) != null) {
            chanceMarqueeView.m53143m();
        }
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: d */
    public void mo53111d() {
        C4683n0 c4683n0;
        ConstraintLayout root;
        C4687p0 c4687p0;
        ConstraintLayout root2;
        RecyclerView recyclerView;
        C4685o0 binding = getBinding();
        if (binding != null && (recyclerView = binding.f4472d) != null) {
            C27046k.m66700o(recyclerView);
        }
        C4685o0 binding2 = getBinding();
        if (binding2 != null && (c4687p0 = binding2.f4470b) != null && (root2 = c4687p0.getRoot()) != null) {
            C27046k.m66700o(root2);
        }
        C4685o0 binding3 = getBinding();
        if (binding3 != null && (c4683n0 = binding3.f4471c) != null && (root = c4683n0.getRoot()) != null) {
            C27046k.m66685H(root);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m53125s(List<ChanceGemBoxCurrency> list) {
        RecyclerView recyclerView;
        if (list.size() > 1) {
            List<ChanceGemBoxCurrency> listTake = CollectionsKt.take(CollectionsKt.toMutableList((Collection) list.subList(1, list.size())), 4);
            C4685o0 binding = getBinding();
            if (binding != null && (recyclerView = binding.f4472d) != null) {
                recyclerView.setItemViewCacheSize(listTake.size());
            }
            BaseQuickAdapter<ChanceGemBoxCurrency, BaseViewHolder> baseQuickAdapter = this.f42640f;
            if (baseQuickAdapter != null) {
                baseQuickAdapter.setNewData(listTake);
            }
        }
    }
}
