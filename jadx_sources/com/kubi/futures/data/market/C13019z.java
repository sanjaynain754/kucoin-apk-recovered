package com.kubi.futures.data.market;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.market.model.RecentDealEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.market.model.WsPriceEntity;
import com.kubi.kumex.data.market.model.WsQuotesEntity;
import com.kubi.kumex.data.market.model.WsTickerEntity;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.network.websocket.model.Message;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.data.market.z */
/* JADX INFO: compiled from: MarketConverter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f*\b\u0012\u0004\u0012\u00020\u00010\fH\u0000\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eH\u0002¨\u0006\u001a"}, m90084d2 = {"bind", "", "any", "bindWsQuotesEntity", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "wsQuotesEntity", "Lcom/kubi/kumex/data/market/model/WsQuotesEntity;", "bindWsPriceEntity", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "snapshot", "Lcom/kubi/kumex/data/market/model/WsPriceEntity;", "scanTickerEntity", "Lio/reactivex/Observable;", "bindRecentSnapshot", "", "Lcom/kubi/kumex/data/market/model/RecentDealEntity;", TUIConstants.TUIContact.LIMIT, "", "toBookList", "Lcom/kubi/kumex/logic/book/BookEntity;", "Lcom/kubi/network/websocket/model/Message;", "_symbol", "", "filterSort", "", TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketConverter.kt\ncom/kubi/futures/data/market/MarketConverterKt\n+ 2 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n58#2,6:143\n64#2,2:150\n58#2,6:152\n64#2,2:159\n126#3:149\n126#3:158\n774#4:161\n865#4,2:162\n*S KotlinDebug\n*F\n+ 1 MarketConverter.kt\ncom/kubi/futures/data/market/MarketConverterKt\n*L\n119#1:143,6\n119#1:150,2\n124#1:152,6\n124#1:159,2\n119#1:149\n124#1:158\n136#1:161\n136#1:162,2\n*E\n"})
public final class C13019z {

    /* JADX INFO: renamed from: com.kubi.futures.data.market.z$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarketConverter.kt\ncom/kubi/futures/data/market/MarketConverterKt\n*L\n1#1,328:1\n139#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.z$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class b extends TypeToken<BookEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.z$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class c extends TypeToken<BookEntity> {
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Object m24875b(@NotNull Object obj, @NotNull Object any) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(any, "any");
        Iterator it = ArrayIteratorKt.iterator(any.getClass().getDeclaredFields());
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if ((field.getModifiers() & 8) == 0) {
                try {
                    Field declaredField = obj.getClass().getDeclaredField(field.getName());
                    if (Intrinsics.areEqual(field.getType(), declaredField.getType())) {
                        field.setAccessible(true);
                        declaredField.setAccessible(true);
                        Object obj2 = field.get(any);
                        if (obj2 != null) {
                            if (ArraysKt.contains((Class<?>[]) new Class[]{Byte.TYPE, Short.TYPE, Integer.TYPE, Double.TYPE, Float.TYPE, Long.TYPE, Boolean.TYPE}, field.getType()) || field.getType().isAssignableFrom(String.class) || field.getType().isAssignableFrom(BigDecimal.class)) {
                                declaredField.set(obj, obj2);
                            } else {
                                Object obj3 = declaredField.get(obj);
                                if (obj3 != null) {
                                    m24875b(obj3, obj2);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return obj;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final List<RecentDealEntity> m24876c(@NotNull List<RecentDealEntity> list, @NotNull RecentDealEntity snapshot, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (list.isEmpty() || snapshot.getTimestamp() >= list.get(0).getTimestamp()) {
            list.add(0, snapshot);
        }
        if (list.size() > i11) {
            list.remove(list.size() - 1);
        }
        return list;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final TickerEntity m24877d(@NotNull TickerEntity tickerEntity, @NotNull WsPriceEntity snapshot) {
        Long granularity;
        Long granularity2;
        Intrinsics.checkNotNullParameter(tickerEntity, "<this>");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot.getFundingRate() != null && (granularity2 = snapshot.getGranularity()) != null && granularity2.longValue() == FundingRateEntity.DEFAULT_FUNDING_PERIOD_MILLIS) {
            tickerEntity.setLastFundingRate(snapshot.getFundingRate());
        }
        if (snapshot.getFundingRate() != null && (granularity = snapshot.getGranularity()) != null && granularity.longValue() == 60000) {
            tickerEntity.setPredictedFundingRate(snapshot.getFundingRate());
        }
        return tickerEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final QuotesEntity m24878e(@NotNull QuotesEntity quotesEntity, @NotNull WsQuotesEntity wsQuotesEntity) {
        Intrinsics.checkNotNullParameter(quotesEntity, "<this>");
        Intrinsics.checkNotNullParameter(wsQuotesEntity, "wsQuotesEntity");
        quotesEntity.setSymbol(wsQuotesEntity.getSymbol());
        quotesEntity.setLastPrice(wsQuotesEntity.getLastPrice());
        quotesEntity.setPriceChgPct(wsQuotesEntity.getPriceChgPct());
        quotesEntity.setTurnover(wsQuotesEntity.getTurnover());
        quotesEntity.setVolume(wsQuotesEntity.getVolume());
        return quotesEntity;
    }

    /* JADX INFO: renamed from: f */
    public static final List<double[]> m24879f(List<double[]> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            double[] dArr = (double[]) obj;
            if (dArr[0] != 0.0d && dArr[1] != 0.0d) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList, new a()));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Observable<TickerEntity> m24880g(@NotNull Observable<Object> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable observableSkip = observable.scan(new TickerEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null), new BiFunction() { // from class: com.kubi.futures.data.market.y
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C13019z.m24881h((TickerEntity) obj, obj2);
            }
        }).skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        Observable<TickerEntity> observableM66399m = FlowableCompatKt.m66399m(observableSkip);
        Intrinsics.checkNotNullExpressionValue(observableM66399m, "midFrequency(...)");
        return observableM66399m;
    }

    /* JADX INFO: renamed from: h */
    public static final TickerEntity m24881h(TickerEntity old, Object current) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(current, "current");
        if (current instanceof TickerEntity) {
            return (TickerEntity) current;
        }
        if (current instanceof WsTickerEntity) {
            Object objM24875b = m24875b(old, current);
            Intrinsics.checkNotNull(objM24875b, "null cannot be cast to non-null type com.kubi.kumex.data.market.model.TickerEntity");
            return (TickerEntity) objM24875b;
        }
        if (!(current instanceof WsQuotesEntity)) {
            return current instanceof WsPriceEntity ? m24877d(old, (WsPriceEntity) current) : old;
        }
        Object objM24875b2 = m24875b(old, current);
        Intrinsics.checkNotNull(objM24875b2, "null cannot be cast to non-null type com.kubi.kumex.data.market.model.TickerEntity");
        return (TickerEntity) objM24875b2;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final BookEntity m24882i(@NotNull Message message, @NotNull String _symbol) {
        Object objM66914d;
        BookEntity bookEntity;
        Object objM66914d2;
        Intrinsics.checkNotNullParameter(message, "<this>");
        Intrinsics.checkNotNullParameter(_symbol, "_symbol");
        BookEntity bookEntity2 = null;
        if (Intrinsics.areEqual(message.getSource(), "heartbeat")) {
            if (message.getData() == null || TextUtils.isEmpty(message.getData())) {
                objM66914d2 = null;
            } else {
                try {
                    String data = message.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d2 = C27099x.m66914d(data, new b().getType());
                } catch (Throwable unused) {
                    objM66914d2 = null;
                }
            }
            bookEntity = (BookEntity) objM66914d2;
            if (bookEntity != null) {
                bookEntity.setBids(m24879f(bookEntity.getBids()));
                bookEntity.setAsks(m24879f(bookEntity.getAsks()));
                bookEntity2 = bookEntity;
            }
        } else {
            if (message.getData() == null || TextUtils.isEmpty(message.getData())) {
                objM66914d = null;
            } else {
                try {
                    String data2 = message.getData();
                    Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x2 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data2, new c().getType());
                } catch (Throwable unused2) {
                    objM66914d = null;
                }
            }
            bookEntity = (BookEntity) objM66914d;
            if (bookEntity != null) {
                bookEntity.setSymbol(_symbol);
                bookEntity.setBids(m24879f(bookEntity.getBids()));
                bookEntity.setAsks(m24879f(bookEntity.getAsks()));
                bookEntity2 = bookEntity;
            }
        }
        Intrinsics.checkNotNull(bookEntity2, "null cannot be cast to non-null type com.kubi.kumex.logic.book.BookEntity");
        return bookEntity2;
    }
}
