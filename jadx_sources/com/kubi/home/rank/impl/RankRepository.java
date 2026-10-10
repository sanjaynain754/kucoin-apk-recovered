package com.kubi.home.rank.impl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.home.R$string;
import com.kubi.home.api.RankConstant;
import com.kubi.home.api.RankNewCoin;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.exception.HomeException;
import com.kubi.home.rank.impl.cache.RankItem;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import dj.C36719d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: RankRepository.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001c\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\u00062\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0013J\u0016\u0010\u0018\u001a\u00020\u00062\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013J&\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ \u0010 \u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0014J7\u0010 \u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0006H\u0002J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00132\u0006\u0010(\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006J\u001c\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010(\u001a\u00020\u00062\u0006\u00103\u001a\u00020\rJ\u000e\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0006J\"\u00106\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankRepository;", "", "<init>", "()V", "trackMap", "", "", "", "putTrackCurrency", "", FirebaseAnalytics.Param.CURRENCY, "trackRankItemExpose", "type", "", ViewProps.POSITION, "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "updateTradeItem", "rankItemList", "", "Lcom/kubi/home/rank/impl/cache/RankItem;", "buildSymbols", "rank", "Lcom/kubi/home/api/RankEntity;", "buildSymbolList", "symbolList", "labelId", "sortPosition", "contentType", "intervals", "", "needShowValue", "trackRankItemClick", "rankItem", "allItemAmount", "(Ljava/lang/String;ILjava/lang/String;DLjava/lang/Double;)V", "getCoinIconUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrackType", "trackSwitchEvent", "key", "buildDialogItemStyleText", "Lcom/kubi/utils/StyledText;", TypedValues.Custom.S_STRING, "getDialogItemText", "", "getCacheRankType", "getDialogItemDescription", "buildSelectItemList", "", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "defaultType", "trackClick", "blockId", "techTrack", "category", "errorMessage", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankRepository.kt\ncom/kubi/home/rank/impl/RankRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 5 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 7 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,333:1\n1878#2,3:334\n1#3:337\n109#4:338\n109#4:341\n109#4:344\n46#5:339\n46#5:342\n46#5:345\n67#6:340\n67#6:343\n67#6:346\n47#7,4:347\n*S KotlinDebug\n*F\n+ 1 RankRepository.kt\ncom/kubi/home/rank/impl/RankRepository\n*L\n70#1:334,3\n271#1:338\n292#1:341\n298#1:344\n271#1:339\n292#1:342\n298#1:345\n272#1:340\n293#1:343\n299#1:346\n322#1:347,4\n*E\n"})
public final class RankRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<String, Boolean> f26012a = new LinkedHashMap();

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankRepository$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 RankRepository.kt\ncom/kubi/home/rank/impl/RankRepository\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,49:1\n323#2:50\n324#2:53\n47#3,2:51\n*S KotlinDebug\n*F\n+ 1 RankRepository.kt\ncom/kubi/home/rank/impl/RankRepository\n*L\n323#1:51,2\n*E\n"})
    public static final class C14763a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new HomeException(exception, "RankHelper", false, null, 8, null), null, 2, null);
        }

        public C14763a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0060  */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<BottomSheetDialogHelper.InterfaceC24339a> m29865b(@NotNull String key, int i11) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence charSequence = m29867d(key).get(0);
        RankConstant rankConstant = RankConstant.f25518a;
        Pair<Integer, Integer> pair = rankConstant.m28973a().get(key);
        if (pair != null) {
            StorageId<Integer> storageIdM82275t = C36719d.f79632a.m82275t();
            if (C46392a.m102323e(new StorageId(storageIdM82275t.getCategory(), storageIdM82275t.getKey() + key, storageIdM82275t.getStorageType(), storageIdM82275t.getSupportLegacy()), i11) == pair.getFirst().intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        Pair<Integer, Integer> pair2 = rankConstant.m28973a().get(key);
        SelectEntity selectEntity = new SelectEntity(null, charSequence, String.valueOf(pair2 != null ? pair2.getFirst() : null), null, null, null, null, null, null, false, z11, null, 3065, null);
        CharSequence charSequence2 = m29867d(key).get(1);
        Pair<Integer, Integer> pair3 = rankConstant.m28973a().get(key);
        if (pair3 != null) {
            StorageId<Integer> storageIdM82275t2 = C36719d.f79632a.m82275t();
            if (C46392a.m102323e(new StorageId(storageIdM82275t2.getCategory(), storageIdM82275t2.getKey() + key, storageIdM82275t2.getStorageType(), storageIdM82275t2.getSupportLegacy()), i11) == pair3.getSecond().intValue()) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        Pair<Integer, Integer> pair4 = rankConstant.m28973a().get(key);
        return CollectionsKt.mutableListOf(selectEntity, new SelectEntity(null, charSequence2, String.valueOf(pair4 != null ? pair4.getSecond() : null), null, null, null, null, null, null, false, z12, null, 3065, null));
    }

    /* JADX INFO: renamed from: c */
    public final int m29866c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        StorageId<Integer> storageIdM82275t = C36719d.f79632a.m82275t();
        StorageId storageId = new StorageId(storageIdM82275t.getCategory(), storageIdM82275t.getKey() + key, storageIdM82275t.getStorageType(), storageIdM82275t.getSupportLegacy());
        Pair<Integer, Integer> pair = RankConstant.f25518a.m28973a().get(key);
        return C46392a.m102323e(storageId, pair != null ? pair.getFirst().intValue() : 1);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<CharSequence> m29867d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.areEqual(key, "DOWN") || Intrinsics.areEqual(key, "UP")) {
            C27017c c27017c = C27017c.f54310a;
            return CollectionsKt.listOf((Object[]) new String[]{c27017c.m66516f(R$string.rank_24_change, new Object[0]), c27017c.m66516f(R$string.rank_7d_change, new Object[0])});
        }
        C27017c c27017c2 = C27017c.f54310a;
        return CollectionsKt.listOf((Object[]) new String[]{c27017c2.m66516f(R$string.rank_24_vol, new Object[0]), c27017c2.m66516f(R$string.rank_7d_vol, new Object[0])});
    }

    /* JADX INFO: renamed from: e */
    public final String m29868e(int i11) {
        switch (i11) {
            case 1:
                return "hot";
            case 2:
                return "up24h";
            case 3:
                return "up7d";
            case 4:
                return "vol24h";
            case 5:
                return "vol7d";
            case 6:
                return "down24h";
            case 7:
                return "down7d";
            case 8:
                return "new";
            default:
                return "hot";
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m29869f(String str) {
        this.f26012a.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: g */
    public final void m29870g(int i11, @NotNull String category, @Nullable String str) {
        Intrinsics.checkNotNullParameter(category, "category");
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("home_rank_techTrack").plus(C42911a.m94120b()).plus(new C14763a(CoroutineExceptionHandler.INSTANCE))), null, null, new RankRepository$techTrack$2(this, i11, category, str, null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m29871h(@NotNull String blockId) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        C43852m.m96591c(HomeCardViewHolderProxy.PAGE_ID, blockId, null, null, 12, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m29872i(int i11, int i12, @Nullable RankItem rankItem) throws JSONException {
        TradeItemBean tradeItemBean;
        if (rankItem == null || (tradeItemBean = rankItem.getTradeItemBean()) == null) {
            return;
        }
        String baseCurrencyName = tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName();
        Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
        String strM29868e = m29868e(i11);
        Double changeRate = tradeItemBean.getChangeRate();
        double dDoubleValue = changeRate != null ? changeRate.doubleValue() : 0.0d;
        RankNewCoin rankNewCoin = rankItem.getRankNewCoin();
        m29873j(baseCurrencyName, i12, strM29868e, dDoubleValue, rankNewCoin != null ? rankNewCoin.getAllItemAmount() : null);
    }

    /* JADX INFO: renamed from: j */
    public final void m29873j(@NotNull String labelId, int i11, @NotNull String contentType, double d11, @Nullable Double d12) throws JSONException {
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("labelId", labelId);
        jSONObject.put("sortPosition", i11 + 1);
        jSONObject.put("contentType", contentType);
        jSONObject.put("intervals", d11);
        if (d12 != null) {
            jSONObject.put("allItemAmount", d12.doubleValue());
        }
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c(HomeCardViewHolderProxy.PAGE_ID, "hotRankFlow", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m29874k(int i11, int i12, @Nullable TradeItemBean tradeItemBean) throws JSONException {
        if (tradeItemBean != null) {
            String baseCurrencyName = tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName();
            Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
            String strM29868e = m29868e(i11);
            Double changeRate = tradeItemBean.getChangeRate();
            m29875l(baseCurrencyName, i12, strM29868e, changeRate != null ? changeRate.doubleValue() : 0.0d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m29875l(@NotNull String labelId, int i11, @NotNull String contentType, double d11) throws JSONException {
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (this.f26012a.containsKey(labelId)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("labelId", labelId);
        jSONObject.put("sortPosition", i11 + 1);
        jSONObject.put("contentType", contentType);
        jSONObject.put("intervals", d11);
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g(HomeCardViewHolderProxy.PAGE_ID, "hotRankFlow", null, jSONObject, 4, null);
        m29869f(labelId);
    }

    /* JADX INFO: renamed from: m */
    public final void m29876m(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iHashCode = key.hashCode();
        if (iHashCode == 2715) {
            if (key.equals("UP")) {
                m29871h("upRankSwitchButton");
            }
        } else if (iHashCode == 85171) {
            if (key.equals("VOL")) {
                m29871h("volumeRankSwitchButton");
            }
        } else if (iHashCode == 2104482) {
            if (key.equals("DOWN")) {
                m29871h("downRankSwitchButton");
            }
        } else if (iHashCode == 1376829904 && key.equals("new_coin")) {
            m29871h("newCoinSinceListing");
        }
    }
}
