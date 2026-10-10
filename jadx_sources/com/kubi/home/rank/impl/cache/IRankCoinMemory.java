package com.kubi.home.rank.impl.cache;

import com.google.gson.reflect.TypeToken;
import com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity;
import com.kubi.restful.AbstractC23185a;
import com.kubi.restful.InterfaceC23192h;
import com.kubi.restful.InterfaceC23193i;
import com.kubi.restful.InterfaceC23194j;
import com.kubi.restful.InterfaceC23195k;
import com.kubi.restful.InterfaceC23196l;
import java.lang.reflect.Type;
import java.util.List;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IRankCoinMemory.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\nH'J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\nH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/IRankCoinMemory;", "", "insertCoinList", "", "value", "", "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;", "proxy", "Lcom/kubi/restful/BaseProxy;", "type", "Ljava/lang/reflect/Type;", "getCoinList", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IRankCoinMemory {

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.b$a */
    /* JADX INFO: compiled from: IRankCoinMemory.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/rank/impl/cache/IRankCoinMemory$getCoinList$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<List<? extends RankCoinEntity>> {
    }

    @InterfaceC23194j(m103799default = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, key = "coin")
    @NotNull
    /* JADX INFO: renamed from: a */
    List<RankCoinEntity> m29967a(@InterfaceC23193i @Nullable AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "coin")
    /* JADX INFO: renamed from: b */
    boolean m29968b(@InterfaceC23196l @NotNull List<RankCoinEntity> list, @InterfaceC23193i @Nullable AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    /* JADX INFO: renamed from: c */
    static /* synthetic */ List m29965c(IRankCoinMemory iRankCoinMemory, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinList");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = RankMemoryProxy.f26042d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        }
        return iRankCoinMemory.m29967a(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ boolean m29966d(IRankCoinMemory iRankCoinMemory, List list, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertCoinList");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = RankMemoryProxy.f26042d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return iRankCoinMemory.m29968b(list, abstractC23185a, type);
    }
}
