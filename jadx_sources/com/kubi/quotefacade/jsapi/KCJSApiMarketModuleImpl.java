package com.kubi.quotefacade.jsapi;

import android.content.Context;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.FavEtfCacheManager;
import com.kubi.quotefacade.helper.FavFutureCacheManager;
import com.kubi.quotefacade.helper.FavItem;
import com.kubi.quotefacade.helper.FavSpotCacheManager;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiMarketVisitorFavoriteEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import d00.InterfaceC36578m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCJSApiMarketModuleImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JF\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JF\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JZ\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152(\u0010\r\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JF\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J@\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¨\u0006 "}, m90084d2 = {"Lcom/kubi/quotefacade/jsapi/KCJSApiMarketModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiMarketModule;", "<init>", "()V", "changeAlphaFavorite", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "tokenChain", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "changeFutureFavorite", "symbol", "changeSpotFavorite", "getAlphaFavoriteList", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiMarketVisitorFavoriteEntity;", "getFutureFavoriteList", "getFutureTag", "", "", "getSpotFavoriteList", "getUsStockExcludes", "isAlphaFavorite", "isFutureFavorite", "isSpotFavorite", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiMarketModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiMarketModuleImpl.kt\ncom/kubi/quotefacade/jsapi/KCJSApiMarketModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1563#2:172\n1634#2,3:173\n1563#2:176\n1634#2,3:177\n1869#2,2:180\n1563#2:182\n1634#2,3:183\n1563#2:186\n1634#2,3:187\n*S KotlinDebug\n*F\n+ 1 KCJSApiMarketModuleImpl.kt\ncom/kubi/quotefacade/jsapi/KCJSApiMarketModuleImpl\n*L\n70#1:172\n70#1:173,3\n85#1:176\n85#1:177,3\n102#1:180,2\n114#1:182\n114#1:183,3\n120#1:186\n120#1:187,3\n*E\n"})
public final class KCJSApiMarketModuleImpl implements InterfaceC36578m {
    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: a */
    public void mo52135a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCJSApiMarketModuleImpl$getUsStockExcludes$1(callback, null));
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: b */
    public void mo52136b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FavSpotCacheManager.f41993a.m51948f(symbol, new Function1() { // from class: com.kubi.quotefacade.jsapi.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCJSApiMarketModuleImpl.m52134o(callback, ((Boolean) obj2).booleanValue());
            }
        });
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: c */
    public void mo52137c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<FavItem> listM51909i = FavFutureCacheManager.f41975a.m51909i();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51909i, 10));
        for (FavItem favItem : listM51909i) {
            arrayList.add(new KCJSApiMarketVisitorFavoriteEntity(ClickCardReport.ReportData.CARD_TYPE_FUTURE, favItem.getSymbol(), Long.valueOf(favItem.getTimestamp())));
        }
        callback.invoke(arrayList, null);
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: d */
    public void mo52138d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull List<String> symbol, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : symbol) {
            linkedHashMap.put(str, IKuMexService.f28731a.get().mo33289s(C27041f.m66668h(str)));
        }
        callback.invoke(linkedHashMap, null);
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: e */
    public void mo52139e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(FavSpotCacheManager.f41993a.m51952l(symbol)), null);
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: f */
    public void mo52140f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String tokenChain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(FavAlphaCacheManager.f41929a.m51826w(tokenChain)), null);
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: g */
    public void mo52141g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(FavFutureCacheManager.f41975a.m51911k(symbol)), null);
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: h */
    public void mo52142h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<FavItem> listM51894i = FavEtfCacheManager.f41951a.m51894i();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51894i, 10));
        for (FavItem favItem : listM51894i) {
            arrayList.add(new KCJSApiMarketVisitorFavoriteEntity("etf", favItem.getSymbol(), Long.valueOf(favItem.getTimestamp())));
        }
        List<FavItem> listM51950j = FavSpotCacheManager.f41993a.m51950j();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51950j, 10));
        for (FavItem favItem2 : listM51950j) {
            arrayList2.add(new KCJSApiMarketVisitorFavoriteEntity(SearchCategory$Companion.SPOT, favItem2.getSymbol(), Long.valueOf(favItem2.getTimestamp())));
        }
        callback.invoke(CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2), null);
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: i */
    public void mo52143i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<FavItem> listM51824u = FavAlphaCacheManager.f41929a.m51824u();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51824u, 10));
        for (FavItem favItem : listM51824u) {
            arrayList.add(new KCJSApiMarketVisitorFavoriteEntity("alpha", favItem.getSymbol(), Long.valueOf(favItem.getTimestamp())));
        }
        callback.invoke(arrayList, null);
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: j */
    public void mo52144j(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String tokenChain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCJSApiMarketModuleImpl$changeAlphaFavorite$1(tokenChain, callback, null));
    }

    @Override // d00.InterfaceC36578m
    /* JADX INFO: renamed from: k */
    public void mo52145k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FavFutureCacheManager.f41975a.m51907d(symbol, new Function1() { // from class: com.kubi.quotefacade.jsapi.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCJSApiMarketModuleImpl.m52133n(callback, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m52133n(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m52134o(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }
}
