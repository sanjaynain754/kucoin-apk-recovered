package com.kubi.quotefacade.tradechance.submodule.whale;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4683n0;
import bv.C4695t0;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.ChanceWhaleEntity;
import com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView;
import com.kubi.quotefacade.tradechance.submodule.whale.ChanceWhaleView;
import com.kubi.quotefacade.tradechance.utils.C22586f;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
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
import f00.C37304a;
import g00.InterfaceC37752d;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: ChanceWhaleView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0003H\u0003J\u001c\u0010\u0018\u001a\u00020\u0012*\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0003J&\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J\u0014\u0010\"\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020%H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/whale/ChanceWhaleView;", "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;", "", "Lcom/kubi/quotefacade/entity/ChanceWhaleEntity;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceWhaleBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceWhaleBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "msgAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "showEmptyUI", "", "updateDataUI", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "convertItem", "helper", "item", "formatTempMsg", "Landroid/widget/TextView;", "upDownAutoColor", "", "spanTag", "Lkotlin/Pair;", "Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;", "Landroid/text/style/CharacterStyle;", "index", "color", "keepPrecision", "", "value", "Ljava/math/BigDecimal;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceWhaleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceWhaleView.kt\ncom/kubi/quotefacade/tradechance/submodule/whale/ChanceWhaleView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,245:1\n52#2:246\n80#2,7:247\n1#3:254\n1#3:288\n1573#4:255\n1604#4,4:256\n1563#4:260\n1634#4,3:261\n1563#4:270\n1634#4,3:271\n1617#4,9:278\n1869#4:287\n1870#4:289\n1626#4:290\n37#5:264\n36#5,3:265\n37#5:274\n36#5,3:275\n37#5:291\n36#5,3:292\n44#6,2:268\n*S KotlinDebug\n*F\n+ 1 ChanceWhaleView.kt\ncom/kubi/quotefacade/tradechance/submodule/whale/ChanceWhaleView\n*L\n60#1:246\n60#1:247,7\n201#1:288\n167#1:255\n167#1:256,4\n195#1:260\n195#1:261,3\n198#1:270\n198#1:271,3\n201#1:278,9\n201#1:287\n201#1:289\n201#1:290\n195#1:264\n195#1:265,3\n198#1:274\n198#1:275,3\n201#1:291\n201#1:292,3\n197#1:268,2\n*E\n"})
public final class ChanceWhaleView extends BaseChanceChildView<List<? extends ChanceWhaleEntity>> {

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC24293a f42691e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BaseQuickAdapter<ChanceWhaleEntity, BaseViewHolder> f42692f;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f42690h = {Reflection.property1(new PropertyReference1Impl(ChanceWhaleView.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/QuoteViewTradechanceWhaleBinding;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f42689g = new Companion(null);

    /* JADX INFO: compiled from: ChanceWhaleView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/whale/ChanceWhaleView$Companion;", "", "<init>", "()V", "TYPE_SPOT", "", "TYPE_FUTURES", "URL", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChanceWhaleView(@NotNull Context context) {
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42691e = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4695t0>() { // from class: com.kubi.quotefacade.tradechance.submodule.whale.ChanceWhaleView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4695t0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4695t0.m4702a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.quote_view_tradechance_whale, (ViewGroup) this, true);
        C4695t0 binding = getBinding();
        if (binding != null && (baseTextView = binding.f4539d) != null) {
            C27046k.m66710y(baseTextView, 1000L, new Function0() { // from class: qv.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChanceWhaleView.m53233m();
                }
            });
        }
        C4695t0 binding2 = getBinding();
        if (binding2 == null || (recyclerView = binding2.f4538c) == null) {
            return;
        }
        C22586f.m53262g(recyclerView);
        final int i11 = R$layout.quote_item_tradechance_whale;
        final ArrayList arrayList = new ArrayList();
        BaseQuickAdapter<ChanceWhaleEntity, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<ChanceWhaleEntity, BaseViewHolder>(i11, arrayList) { // from class: com.kubi.quotefacade.tradechance.submodule.whale.ChanceWhaleView$2$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, ChanceWhaleEntity chanceWhaleEntity) {
                if (baseViewHolder == null || chanceWhaleEntity == null) {
                    return;
                }
                this.f42693i.m53239o(baseViewHolder, chanceWhaleEntity);
            }
        };
        this.f42692f = baseQuickAdapter;
        recyclerView.setAdapter(baseQuickAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Unit m53233m() {
        RouteExKt.m56217H("krn/router?biz=platform&entry=main&component=app&route=WhaleAccountHomePage");
        C43852m.m96591c("B5TradeChance", "whalewatch", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m53236q(String str) {
        InterfaceC37752d.a.m85122a(C37304a.f82764a, str, null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m53237s(ChanceWhaleEntity chanceWhaleEntity, final TextView textView, ChanceWhaleView chanceWhaleView, int i11) {
        BigDecimal bigDecimalM66671k;
        BigDecimal bigDecimalM66671k2;
        Pair pairM90091to;
        BigDecimal bigDecimalM66671k3;
        final String template = chanceWhaleEntity.getTemplate();
        if (template == null) {
            template = "";
        }
        if (template.length() == 0) {
            textView.setText("");
            return Unit.INSTANCE;
        }
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM54291p = C22890g.m54291p(context);
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM54289n = C22890g.m54289n(context2);
        Map<String, String> context3 = chanceWhaleEntity.getContext();
        if (context3 == null) {
            context3 = MapsKt.emptyMap();
        }
        List<String> templateParamList = chanceWhaleEntity.getTemplateParamList();
        if (templateParamList == null) {
            templateParamList = CollectionsKt.emptyList();
        }
        String str = context3.get("whaleBuyQuoteVol");
        if (str == null || (bigDecimalM66671k = C27041f.m66671k(str)) == null) {
            bigDecimalM66671k = BigDecimal.ZERO;
        }
        String str2 = context3.get("whaleSellQuoteVol");
        if (str2 == null || (bigDecimalM66671k2 = C27041f.m66671k(str2)) == null) {
            bigDecimalM66671k2 = BigDecimal.ZERO;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(templateParamList, 10));
        Iterator it = templateParamList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) next;
            Iterator it2 = it;
            if (!StringsKt.equals("tradeScale", str3, true)) {
                String str4 = context3.get(str3);
                pairM90091to = (str4 == null || (bigDecimalM66671k3 = C27041f.m66671k(str4)) == null) ? TuplesKt.m90091to("--", chanceWhaleView.m53242v(i12, i11)) : TuplesKt.m90091to(chanceWhaleView.m53241u(str3, bigDecimalM66671k3), chanceWhaleView.m53242v(i12, i11));
            } else if (C41014a.m89919D(bigDecimalM66671k) && C41014a.m89919D(bigDecimalM66671k2)) {
                pairM90091to = TuplesKt.m90091to("0:0", chanceWhaleView.m53242v(i12, iM54289n));
            } else if (C41014a.m89919D(bigDecimalM66671k) && !C41014a.m89919D(bigDecimalM66671k2)) {
                pairM90091to = TuplesKt.m90091to("0:1", chanceWhaleView.m53242v(i12, iM54289n));
            } else if (!C41014a.m89919D(bigDecimalM66671k) && C41014a.m89919D(bigDecimalM66671k2)) {
                pairM90091to = TuplesKt.m90091to("1:0", chanceWhaleView.m53242v(i12, iM54291p));
            } else if (C41014a.m89927a(bigDecimalM66671k, bigDecimalM66671k2)) {
                pairM90091to = TuplesKt.m90091to("1:1", chanceWhaleView.m53242v(i12, iM54291p));
            } else if (bigDecimalM66671k.compareTo(bigDecimalM66671k2) > 0) {
                pairM90091to = TuplesKt.m90091to(bigDecimalM66671k.divide(bigDecimalM66671k2, 1, RoundingMode.HALF_UP) + ":1", chanceWhaleView.m53242v(i12, iM54291p));
            } else {
                pairM90091to = TuplesKt.m90091to("1:" + bigDecimalM66671k2.divide(bigDecimalM66671k, 1, RoundingMode.HALF_UP), chanceWhaleView.m53242v(i12, iM54289n));
            }
            arrayList.add(pairM90091to);
            it = it2;
            i12 = i13;
        }
        List list = CollectionsKt.toList(arrayList);
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add((String) ((Pair) it3.next()).getFirst());
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            String str5 = String.format(template, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            textView.setText(str5);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "ChanceWhaleView", false, null, 8, null), null, 2, null);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(templateParamList, 10));
            for (String str6 : templateParamList) {
                arrayList3.add("--");
            }
            final String[] strArr2 = (String[]) arrayList3.toArray(new String[0]);
            C27100x0.m66924e(new Function0() { // from class: qv.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChanceWhaleView.m53238t(textView, template, strArr2);
                }
            });
        }
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Pair pair = (Pair) ((Pair) it4.next()).getSecond();
            if (pair != null) {
                arrayList4.add(pair);
            }
        }
        Pair[] pairArr = (Pair[]) arrayList4.toArray(new Pair[0]);
        highlightTextHelper.m54120f(textView, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m53238t(TextView textView, String str, String[] strArr) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView.setText(str2);
        return Unit.INSTANCE;
    }

    @Nullable
    public final C4695t0 getBinding() {
        return (C4695t0) this.f42691e.getValue(this, f42690h[0]);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: o */
    public final void m53239o(BaseViewHolder baseViewHolder, final ChanceWhaleEntity chanceWhaleEntity) {
        CharSequence charSequenceMo33255D;
        String strM92640e;
        List<ChanceWhaleEntity> data;
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        int i11 = R$id.vDivider;
        BaseQuickAdapter<ChanceWhaleEntity, BaseViewHolder> baseQuickAdapter = this.f42692f;
        baseViewHolder.setGone(i11, bindingAdapterPosition != C27039d.m66650j((baseQuickAdapter == null || (data = baseQuickAdapter.getData()) == null) ? null : Integer.valueOf(data.size())) - 1);
        Context context = baseViewHolder.itemView.getContext();
        boolean zEquals = StringsKt.equals("UP", chanceWhaleEntity.getColor(), true);
        Intrinsics.checkNotNull(context);
        int iM54281f = C22890g.m54281f(context, zEquals);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvTitle);
        if (textView != null) {
            textView.setText(chanceWhaleEntity.getName());
            textView.setTextColor(iM54281f);
            textView.setBackground(C22890g.m54276a(context, zEquals, C27040e.m66657a(4.0f), C27040e.m66658b(1)));
        }
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivLogo);
        if (imageView != null) {
            C24277v.m58540e(context, chanceWhaleEntity.getIconUrl(), imageView);
        }
        final String item = chanceWhaleEntity.getItem();
        if (item == null) {
            item = "";
        }
        String str = "--";
        if (StringsKt.equals("SPOT", chanceWhaleEntity.getItemType(), true)) {
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(item);
            if (symbolInfoEntityM85601B != null) {
                charSequenceMo33255D = C27041f.m66668h(symbolInfoEntityM85601B.getBaseCurrencyName());
                if (charSequenceMo33255D.length() == 0) {
                    charSequenceMo33255D = "--";
                }
            } else {
                charSequenceMo33255D = "--";
            }
        } else if (StringsKt.equals("FUTURES", chanceWhaleEntity.getItemType(), true) && C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            IKuMexService iKuMexService = IKuMexService.f28731a.get();
            String item2 = chanceWhaleEntity.getItem();
            charSequenceMo33255D = iKuMexService.mo33255D(item2 != null ? item2 : "", false);
        } else {
            charSequenceMo33255D = item;
        }
        baseViewHolder.setText(R$id.tvName, charSequenceMo33255D);
        baseViewHolder.setText(R$id.tvTime, chanceWhaleEntity.getCollectAt() != null ? C22586f.m53259d(C27039d.m66652l(chanceWhaleEntity.getCollectAt())) : "--");
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tvMsg);
        if (textView2 != null) {
            m53240r(textView2, chanceWhaleEntity, iM54281f);
        }
        BigDecimal bigDecimalM66671k = C27041f.m66671k(chanceWhaleEntity.getPrice());
        if (bigDecimalM66671k != null && (strM92640e = C42180b.m92640e(bigDecimalM66671k, null, 2, false, true, false, 0, null, 117, null)) != null) {
            str = strM92640e;
        }
        baseViewHolder.setText(R$id.tvPrice, context.getString(R$string.trade_opportunity_whale_trend_current_price) + ' ' + str);
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: qv.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceWhaleView.m53235p(chanceWhaleEntity, item);
            }
        });
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: r */
    public final void m53240r(final TextView textView, final ChanceWhaleEntity chanceWhaleEntity, final int i11) {
        C27100x0.m66923d(new Function0() { // from class: qv.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceWhaleView.m53237s(chanceWhaleEntity, textView, this, i11);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final Pair<HighlightTextHelper.TextTagEnum, CharacterStyle> m53242v(int i11, int i12) {
        if (i11 == 0) {
            return new Pair<>(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(i12));
        }
        if (i11 == 1) {
            return new Pair<>(HighlightTextHelper.TextTagEnum.SPAN1, new ForegroundColorSpan(i12));
        }
        if (i11 == 2) {
            return new Pair<>(HighlightTextHelper.TextTagEnum.SPAN2, new ForegroundColorSpan(i12));
        }
        if (i11 != 3) {
            return null;
        }
        return new Pair<>(HighlightTextHelper.TextTagEnum.SPAN3, new ForegroundColorSpan(i12));
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo53112e(@NotNull List<ChanceWhaleEntity> entity) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C4683n0 c4683n0;
        ConstraintLayout root;
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (entity.isEmpty()) {
            mo53111d();
            return;
        }
        C4695t0 binding = getBinding();
        if (binding != null && (c4683n0 = binding.f4537b) != null && (root = c4683n0.getRoot()) != null) {
            C27046k.m66700o(root);
        }
        C4695t0 binding2 = getBinding();
        if (binding2 != null && (recyclerView2 = binding2.f4538c) != null) {
            C27046k.m66685H(recyclerView2);
        }
        C4695t0 binding3 = getBinding();
        if (binding3 != null && (recyclerView = binding3.f4538c) != null) {
            recyclerView.setItemViewCacheSize(entity.size());
        }
        BaseQuickAdapter<ChanceWhaleEntity, BaseViewHolder> baseQuickAdapter = this.f42692f;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.setNewData(CollectionsKt.toMutableList((Collection) entity));
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m53235p(ChanceWhaleEntity chanceWhaleEntity, String str) throws JSONException {
        final String str2;
        if (StringsKt.equals("SPOT", chanceWhaleEntity.getItemType(), true)) {
            str2 = str;
            ISpotService.m59982A(ISpotService.f49646a.get(), str2, null, null, null, 14, null);
        } else {
            str2 = str;
            if (StringsKt.equals("FUTURES", chanceWhaleEntity.getItemType(), true)) {
                C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: qv.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChanceWhaleView.m53236q(str2);
                    }
                });
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", str2);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5TradeChance", "whalewatch", "2", jSONObject);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: d */
    public void mo53111d() {
        C4683n0 c4683n0;
        ConstraintLayout root;
        RecyclerView recyclerView;
        C4695t0 binding = getBinding();
        if (binding != null && (recyclerView = binding.f4538c) != null) {
            C27046k.m66700o(recyclerView);
        }
        C4695t0 binding2 = getBinding();
        if (binding2 != null && (c4683n0 = binding2.f4537b) != null && (root = c4683n0.getRoot()) != null) {
            C27046k.m66685H(root);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r11.equals("whaleSellQuoteVol") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r11.equals("whalePreQuoteVol") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r11.equals("whalePreSellQuoteVol") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r11.equals("quoteVol") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r11.equals("whaleQuoteVol") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r11.equals("whaleBuyQuoteVol") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        r1 = java.math.RoundingMode.HALF_UP;
        r0 = com.fasterxml.jackson.databind.node.C6447a.m11724a(r12.setScale(-2, r1));
        p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "stripTrailingZeros(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        return p429lf.C42180b.m92640e(r0, r1, 0, false, false, false, 0, null, 124, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r11.equals("whalePreBuyQuoteVol") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r11.equals("preQuoteVol") == false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m53241u(String str, BigDecimal bigDecimal) {
        switch (str.hashCode()) {
            case -2052389772:
                break;
            case -953513728:
                break;
            case -879120201:
                break;
            case 639078403:
                break;
            case 938986385:
                break;
            case 968883698:
                break;
            case 993424506:
                break;
            case 1677749315:
                break;
        }
        return C42180b.m92640e(bigDecimal, RoundingMode.HALF_UP, 2, false, false, false, 2, null, 92, null);
    }
}
