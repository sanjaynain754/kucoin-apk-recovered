package com.kubi.quotefacade.helper;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.l1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FavTradeCacheConvert.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ#\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002¢\u0006\u0002\u0010\u000bJ%\u0010\u0017\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0002\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/FavTradeCacheConvert;", "", "<init>", "()V", "saveNewFavor", "", "favType", "", "list", "", "Lcom/kubi/data/entity/TradeItemBean;", "(Ljava/lang/Integer;Ljava/util/List;)V", "saveNewFavorBySymbol", "symbolList", "", "getFavorList", "(Ljava/lang/Integer;)Ljava/util/List;", "getFavorListTimestamp", "Lcom/kubi/quotefacade/helper/FavItem;", "changeFavor", "tradeBean", "(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;)V", "updateSpotOrEtfCacheBySymbol", "updateSpotOrEtfCache", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavTradeCacheConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavTradeCacheConvert.kt\ncom/kubi/quotefacade/helper/FavTradeCacheConvert\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,159:1\n1617#2,9:160\n1869#2:169\n1870#2:171\n1626#2:172\n1617#2,9:173\n1869#2:182\n1870#2:184\n1626#2:185\n774#2:193\n865#2,2:194\n1617#2,9:196\n1869#2:205\n1870#2:207\n1626#2:208\n774#2:209\n865#2,2:210\n1617#2,9:212\n1869#2:221\n1870#2:223\n1626#2:224\n1#3:170\n1#3:183\n1#3:206\n1#3:222\n45#4,7:186\n45#4,7:225\n*S KotlinDebug\n*F\n+ 1 FavTradeCacheConvert.kt\ncom/kubi/quotefacade/helper/FavTradeCacheConvert\n*L\n28#1:160,9\n28#1:169\n28#1:171\n28#1:172\n29#1:173,9\n29#1:182\n29#1:184\n29#1:185\n145#1:193\n145#1:194,2\n145#1:196,9\n145#1:205\n145#1:207\n145#1:208\n147#1:209\n147#1:210,2\n147#1:212,9\n147#1:221\n147#1:223\n147#1:224\n28#1:170\n29#1:183\n145#1:206\n147#1:222\n138#1:186,7\n156#1:225,7\n*E\n"})
public final class FavTradeCacheConvert {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FavTradeCacheConvert f42000a = new FavTradeCacheConvert();

    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:5:0x0004, B:7:0x000a, B:8:0x0013, B:10:0x0019, B:12:0x002a, B:15:0x0031, B:16:0x003a, B:18:0x0040, B:20:0x004c, B:39:0x00a2, B:35:0x0096, B:37:0x009c, B:21:0x0050, B:22:0x0059, B:24:0x005f, B:26:0x0070, B:27:0x0074, B:28:0x007d, B:30:0x0083, B:32:0x008f), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:5:0x0004, B:7:0x000a, B:8:0x0013, B:10:0x0019, B:12:0x002a, B:15:0x0031, B:16:0x003a, B:18:0x0040, B:20:0x004c, B:39:0x00a2, B:35:0x0096, B:37:0x009c, B:21:0x0050, B:22:0x0059, B:24:0x005f, B:26:0x0070, B:27:0x0074, B:28:0x007d, B:30:0x0083, B:32:0x008f), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0083 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:5:0x0004, B:7:0x000a, B:8:0x0013, B:10:0x0019, B:12:0x002a, B:15:0x0031, B:16:0x003a, B:18:0x0040, B:20:0x004c, B:39:0x00a2, B:35:0x0096, B:37:0x009c, B:21:0x0050, B:22:0x0059, B:24:0x005f, B:26:0x0070, B:27:0x0074, B:28:0x007d, B:30:0x0083, B:32:0x008f), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007d A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m51960f(Integer num, List<? extends TradeItemBean> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        String symbol;
        if (num == null) {
            arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!((TradeItemBean) obj).getSymbolInfoEntity().isEtfSymbol()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            it = arrayList2.iterator();
            while (it.hasNext()) {
                symbol = ((TradeItemBean) it.next()).getSymbol();
                if (symbol != null) {
                    arrayList.add(symbol);
                }
            }
        } else {
            try {
                if (num.intValue() == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((TradeItemBean) obj2).getSymbolInfoEntity().isEtfSymbol()) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        String symbol2 = ((TradeItemBean) it2.next()).getSymbol();
                        if (symbol2 != null) {
                            arrayList.add(symbol2);
                        }
                    }
                } else {
                    arrayList2 = new ArrayList();
                    while (r6.hasNext()) {
                        if (!((TradeItemBean) obj).getSymbolInfoEntity().isEtfSymbol()) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = new ArrayList();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        symbol = ((TradeItemBean) it.next()).getSymbol();
                        if (symbol != null) {
                            arrayList.add(symbol);
                        }
                    }
                }
            } catch (Exception e11) {
                C37266a.m83411b(e11, "FavTradeCacheConvert updateSpotOrEtfCache error");
                return;
            }
        }
        if (num != null && num.intValue() == 3) {
            FavEtfCacheManager.f41951a.m51899o(arrayList);
            return;
        }
        FavSpotCacheManager.f41993a.m51954o(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m51955a(@Nullable Integer num, @NotNull TradeItemBean tradeBean) {
        Intrinsics.checkNotNullParameter(tradeBean, "tradeBean");
        if (num != null && num.intValue() == 1) {
            FavSpotCacheManager.m51943e(FavSpotCacheManager.f41993a, tradeBean, null, 2, null);
            return;
        }
        if (num != null && num.intValue() == 3) {
            FavEtfCacheManager.m51888e(FavEtfCacheManager.f41951a, tradeBean, null, 2, null);
            return;
        }
        if (num != null && num.intValue() == 2) {
            FavFutureCacheManager.m51903e(FavFutureCacheManager.f41975a, tradeBean.getSymbol(), null, 2, null);
            IKuMexService iKuMexServiceM53023c = BQuoteFacadeDepend.f42592a.m53023c();
            String symbol = tradeBean.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            IKuMexService.m33250m(iKuMexServiceM53023c, symbol, false, false, null, 8, null);
            return;
        }
        if (num != null && num.intValue() == 5) {
            FavAlphaCacheManager.m51807m(FavAlphaCacheManager.f41929a, tradeBean.getSymbolInfoEntity().getFeeCode() + '-' + tradeBean.getSymbolInfoEntity().getPriceIncrement(), null, 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m51956b(@Nullable Integer num) {
        if (num != null && num.intValue() == 1) {
            return FavSpotCacheManager.f41993a.m51949i();
        }
        if (num != null && num.intValue() == 2) {
            return FavFutureCacheManager.f41975a.m51908h();
        }
        return (num != null && num.intValue() == 3) ? FavEtfCacheManager.f41951a.m51893h() : CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<FavItem> m51957c(@Nullable Integer num) {
        if (num != null && num.intValue() == 5) {
            return FavAlphaCacheManager.f41929a.m51824u();
        }
        if (num != null && num.intValue() == 1) {
            return FavSpotCacheManager.f41993a.m51950j();
        }
        if (num != null && num.intValue() == 2) {
            return FavFutureCacheManager.f41975a.m51909i();
        }
        return (num != null && num.intValue() == 3) ? FavEtfCacheManager.f41951a.m51894i() : CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: d */
    public final void m51958d(@Nullable Integer num, @NotNull List<? extends TradeItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (num != null && num.intValue() == 1) {
            m51960f(num, list);
            return;
        }
        if (num == null || num.intValue() != 2) {
            if (num != null && num.intValue() == 3) {
                m51960f(num, list);
                return;
            }
            return;
        }
        FavFutureCacheManager favFutureCacheManager = FavFutureCacheManager.f41975a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String symbol = ((TradeItemBean) it.next()).getSymbol();
            if (symbol != null) {
                arrayList.add(symbol);
            }
        }
        favFutureCacheManager.m51913n(arrayList);
        IKuMexService iKuMexServiceM53023c = BQuoteFacadeDepend.f42592a.m53023c();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            String symbol2 = ((TradeItemBean) it2.next()).getSymbol();
            if (symbol2 != null) {
                arrayList2.add(symbol2);
            }
        }
        iKuMexServiceM53023c.mo33256E(CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null), true);
    }

    /* JADX INFO: renamed from: e */
    public final void m51959e(@Nullable Integer num, @NotNull List<String> symbolList) {
        Intrinsics.checkNotNullParameter(symbolList, "symbolList");
        if (num != null && num.intValue() == 1) {
            m51961g(num, symbolList);
            return;
        }
        if (num != null && num.intValue() == 2) {
            FavFutureCacheManager.f41975a.m51913n(symbolList);
        } else if (num != null && num.intValue() == 3) {
            m51961g(num, symbolList);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m51961g(Integer num, List<String> list) {
        if (num != null) {
            try {
                if (num.intValue() == 3) {
                    FavEtfCacheManager.f41951a.m51899o(list);
                    return;
                }
            } catch (Exception e11) {
                C37266a.m83411b(e11, "FavTradeCacheConvert updateSpotOrEtfCacheBySymbol error");
                return;
            }
        }
        FavSpotCacheManager.f41993a.m51954o(list);
    }
}
