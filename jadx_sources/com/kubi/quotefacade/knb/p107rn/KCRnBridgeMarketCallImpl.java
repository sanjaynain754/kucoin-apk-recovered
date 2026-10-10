package com.kubi.quotefacade.knb.p107rn;

import android.content.Context;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.FavEtfCacheManager;
import com.kubi.quotefacade.helper.FavFutureCacheManager;
import com.kubi.quotefacade.helper.FavItem;
import com.kubi.quotefacade.helper.FavSpotCacheManager;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeMarketVisitorFavoriteEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import e00.InterfaceC37013e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCRnBridgeMarketCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J6\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J6\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J4\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\n\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J4\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\n\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J4\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\n\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J6\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J6\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J6\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/quotefacade/knb/rn/KCRnBridgeMarketCallImpl;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeMarketCall;", "<init>", "()V", "changeAlphaFavorite", "", "ctx", "Landroid/content/Context;", "tokenChain", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "changeFutureFavorite", "symbol", "changeSpotFavorite", "getAlphaFavoriteList", "", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeMarketVisitorFavoriteEntity;", "getFutureFavoriteList", "getSpotFavoriteList", "isAlphaFavorite", "isFutureFavorite", "isSpotFavorite", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCRnBridgeMarketCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRnBridgeMarketCallImpl.kt\ncom/kubi/quotefacade/knb/rn/KCRnBridgeMarketCallImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1563#2:133\n1634#2,3:134\n1563#2:137\n1634#2,3:138\n1563#2:141\n1634#2,3:142\n1563#2:145\n1634#2,3:146\n*S KotlinDebug\n*F\n+ 1 KCRnBridgeMarketCallImpl.kt\ncom/kubi/quotefacade/knb/rn/KCRnBridgeMarketCallImpl\n*L\n67#1:133\n67#1:134,3\n80#1:137\n80#1:138,3\n93#1:141\n93#1:142,3\n99#1:145\n99#1:146,3\n*E\n"})
public final class KCRnBridgeMarketCallImpl implements InterfaceC37013e {
    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: a */
    public void mo52221a(@NotNull Context ctx, @NotNull String symbol, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FavFutureCacheManager.f41975a.m51907d(symbol, new Function1() { // from class: com.kubi.quotefacade.knb.rn.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCRnBridgeMarketCallImpl.m52219l(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: b */
    public void mo52222b(@NotNull Context ctx, @NotNull String symbol, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FavSpotCacheManager.f41993a.m51948f(symbol, new Function1() { // from class: com.kubi.quotefacade.knb.rn.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCRnBridgeMarketCallImpl.m52220m(callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: c */
    public void mo52223c(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(FavFutureCacheManager.f41975a.m51911k(symbol)), null);
    }

    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: d */
    public void mo52224d(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(FavSpotCacheManager.f41993a.m51952l(symbol)), null);
    }

    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: e */
    public void mo52225e(@NotNull Context ctx, @NotNull Function2<? super List<KCBridgeMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<FavItem> listM51894i = FavEtfCacheManager.f41951a.m51894i();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51894i, 10));
        for (FavItem favItem : listM51894i) {
            arrayList.add(new KCBridgeMarketVisitorFavoriteEntity("etf", favItem.getSymbol(), Long.valueOf(favItem.getTimestamp())));
        }
        List<FavItem> listM51950j = FavSpotCacheManager.f41993a.m51950j();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51950j, 10));
        for (FavItem favItem2 : listM51950j) {
            arrayList2.add(new KCBridgeMarketVisitorFavoriteEntity(SearchCategory$Companion.SPOT, favItem2.getSymbol(), Long.valueOf(favItem2.getTimestamp())));
        }
        callback.invoke(CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2), null);
    }

    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: f */
    public void mo52226f(@NotNull Context ctx, @NotNull Function2<? super List<KCBridgeMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<FavItem> listM51824u = FavAlphaCacheManager.f41929a.m51824u();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51824u, 10));
        for (FavItem favItem : listM51824u) {
            arrayList.add(new KCBridgeMarketVisitorFavoriteEntity("alpha", favItem.getSymbol(), Long.valueOf(favItem.getTimestamp())));
        }
        callback.invoke(arrayList, null);
    }

    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: g */
    public void mo52227g(@NotNull Context ctx, @NotNull Function2<? super List<KCBridgeMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<FavItem> listM51909i = FavFutureCacheManager.f41975a.m51909i();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51909i, 10));
        for (FavItem favItem : listM51909i) {
            arrayList.add(new KCBridgeMarketVisitorFavoriteEntity(ClickCardReport.ReportData.CARD_TYPE_FUTURE, favItem.getSymbol(), Long.valueOf(favItem.getTimestamp())));
        }
        callback.invoke(arrayList, null);
    }

    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: h */
    public void mo52228h(@NotNull Context ctx, @NotNull String tokenChain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCRnBridgeMarketCallImpl$changeAlphaFavorite$1(tokenChain, callback, null));
    }

    @Override // e00.InterfaceC37013e
    /* JADX INFO: renamed from: i */
    public void mo52229i(@NotNull Context ctx, @NotNull String tokenChain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(FavAlphaCacheManager.f41929a.m51826w(tokenChain)), null);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m52219l(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m52220m(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }
}
