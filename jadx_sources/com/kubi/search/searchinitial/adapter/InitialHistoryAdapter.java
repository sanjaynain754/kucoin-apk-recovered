package com.kubi.search.searchinitial.adapter;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.R$string;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.SearchHistoryBean;
import com.kubi.search.searchinitial.adapter.InitialHistoryAdapter;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.search.utils.SearchExKt;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33954u6;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: InitialHistoryAdapter.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0002H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/search/searchinitial/adapter/InitialHistoryAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/search/entity/SearchHistoryBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "itemJump", "exposeList", "", "", "onViewAttachedToWindow", C33954u6.f72238i, "trackParams", "Lorg/json/JSONObject;", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInitialHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitialHistoryAdapter.kt\ncom/kubi/search/searchinitial/adapter/InitialHistoryAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class InitialHistoryAdapter extends BaseQuickAdapter<SearchHistoryBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<String> f48892i;

    public InitialHistoryAdapter() {
        super(R$layout.search_item_initial_history);
        this.f48892i = new ArrayList();
        setHasStableIds(true);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final SearchHistoryBean item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tv_item, Intrinsics.areEqual(item.getCategory(), SearchCategory$Companion.FUTURES) ? IKuMexService.m33249T(IKuMexService.f28731a.get(), item.getSymbol(), false, 2, null) : item.getShowSymbol());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: t10.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialHistoryAdapter.m59187i(this.f98921b, item);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k */
    public final JSONObject m59190k(SearchHistoryBean searchHistoryBean) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("after_click_element_value", searchHistoryBean.getSymbol());
        jSONObject.put("norm_version", "1");
        String category = searchHistoryBean.getCategory();
        switch (category.hashCode()) {
            case -503567600:
                if (category.equals(SearchCategory$Companion.FUTURES)) {
                    jSONObject.put("type", "Futures");
                    jSONObject.put("after_page_id", "B6FuturesCandle");
                }
                break;
            case 3105752:
                if (category.equals(SearchCategory$Companion.EARN)) {
                    jSONObject.put("type", SearchCategory$Companion.EARN);
                    jSONObject.put("after_page_id", "B9earn");
                }
                break;
            case 3537154:
                if (category.equals(SearchCategory$Companion.SPOT)) {
                    jSONObject.put("type", IQuoteFacadeService.Companion.TRADE_TYPE_SPOT);
                    jSONObject.put("after_page_id", "B5candle");
                }
                break;
            case 3645279:
                if (category.equals(SearchCategory$Companion.WEB3)) {
                    jSONObject.put("type", SearchCategory$Companion.WEB3);
                    jSONObject.put("after_page_id", "web3BuyAndSell");
                }
                break;
        }
        jSONObject.put("norm_version", "1");
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        SearchHistoryBean item = getItem(holder.getBindingAdapterPosition());
        if (item == null || this.f48892i.contains(item.getSymbol())) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("allItemAmount", getItemCount());
        jSONObject.put("postId", item.getSymbol());
        jSONObject.put("trade_pair", item.getShowSymbol());
        String category = item.getCategory();
        switch (category.hashCode()) {
            case -503567600:
                str = SearchCategory$Companion.FUTURES;
                if (!category.equals(SearchCategory$Companion.FUTURES)) {
                    str = "";
                }
                break;
            case 3105752:
                str = SearchCategory$Companion.EARN;
                if (!category.equals(SearchCategory$Companion.EARN)) {
                    str = "";
                }
                break;
            case 3537154:
                str = SearchCategory$Companion.SPOT;
                if (!category.equals(SearchCategory$Companion.SPOT)) {
                    str = "";
                }
                break;
            case 3645279:
                str = SearchCategory$Companion.WEB3;
                if (!category.equals(SearchCategory$Companion.WEB3)) {
                    str = "";
                }
                break;
            default:
                str = "";
                break;
        }
        jSONObject.put("postType", str);
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("B1SearchOrSearchResultPage", "searchHistory", null, jSONObject, 4, null);
        this.f48892i.add(item.getSymbol());
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m59187i(InitialHistoryAdapter initialHistoryAdapter, SearchHistoryBean searchHistoryBean) {
        initialHistoryAdapter.m59189j(searchHistoryBean);
        C27023a.m66554a("B1SearchOrSearchResultPage", FirebaseAnalytics.Event.SEARCH, "searchHistory", initialHistoryAdapter.m59190k(searchHistoryBean));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    public final void m59189j(SearchHistoryBean searchHistoryBean) {
        ExtendEntity beanEarnEntity;
        ExtendEntity beanWeb3Entity;
        String tokenBridgeId;
        String category = searchHistoryBean.getCategory();
        String jumpUrl = null;
        switch (category.hashCode()) {
            case -503567600:
                if (category.equals(SearchCategory$Companion.FUTURES)) {
                    if (IKuMexService.m33251q(IKuMexService.f28731a.get(), searchHistoryBean.getSymbol(), false, 2, null)) {
                        SearchExKt.m59539u(searchHistoryBean.getSymbol(), C43852m.m96601m("B1SearchOrSearchResultPage", "history", "2"));
                    } else {
                        ToastCompat.m66437C(R$string.cant_find_contract);
                    }
                    break;
                }
                break;
            case 3105752:
                if (category.equals(SearchCategory$Companion.EARN) && (beanEarnEntity = searchHistoryBean.getBeanEarnEntity()) != null) {
                    SearchExKt.m59540v(beanEarnEntity);
                }
                break;
            case 3537154:
                if (category.equals(SearchCategory$Companion.SPOT)) {
                    TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(StringsKt.replace$default(searchHistoryBean.getSymbol(), "/", C33820nf.f71144W, false, 4, (Object) null));
                    if (tradeItemBeanM85603D != null) {
                        if (tradeItemBeanM85603D.getSymbolInfoEntity().isPreviewEnableShow()) {
                            ISpotService.m59982A(ISpotService.f49646a.get(), tradeItemBeanM85603D.getSymbol(), 2, null, null, 12, null);
                        } else {
                            ISpotService.m59982A(ISpotService.f49646a.get(), tradeItemBeanM85603D.getSymbol(), null, null, null, 14, null);
                        }
                    } else {
                        ToastCompat.m66437C(R$string.cant_find_symbols);
                    }
                    break;
                }
                break;
            case 3645279:
                if (category.equals(SearchCategory$Companion.WEB3)) {
                    ExtendEntity beanWeb3Entity2 = searchHistoryBean.getBeanWeb3Entity();
                    if (beanWeb3Entity2 != null) {
                        jumpUrl = beanWeb3Entity2.getJumpUrl();
                    }
                    SearchExKt.m59529k(jumpUrl);
                    break;
                }
                break;
            case 92909918:
                if (category.equals("alpha") && (beanWeb3Entity = searchHistoryBean.getBeanWeb3Entity()) != null && (tokenBridgeId = beanWeb3Entity.getTokenBridgeId()) != null) {
                    SearchExKt.m59542x(tokenBridgeId);
                }
                break;
        }
    }
}
