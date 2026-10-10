package com.kubi.quotefacade.knb;

import android.content.Context;
import b00.InterfaceC4432o;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.FavFutureCacheManager;
import com.kubi.quotefacade.helper.FavSpotCacheManager;
import com.kubi.quotefacade.helper.FavTradeCacheConvert;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27041f;
import com.kubi.wallet.api.IWalletService;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgeMarketCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016JJ\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2(\u0010\b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016JF\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016JB\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016J>\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016JM\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016¢\u0006\u0002\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010$\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010&\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\tH\u0016R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/knb/KCFlutterBridgeMarketCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeMarketCall;", "<init>", "()V", "getChainFavList", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getFutureIncludes", "getFutureTag", "symbol", "", "", "jumpToWeb3Wallet", InterfaceC33826o0.f71244p, "chain", "redirectType", "", "openMarketFeedNewsTab", "coin", "klineType", "isWalletAvailable", "isAlphaFavorite", "changeAlphaFavorite", CheckIsFavorCommand.KEY_IS_FAV, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "isFutureFavorite", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "getRepository", "()Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "changeFutureFavorite", "changeSpotFavorite", "isSpotFavorite", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeMarketCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeMarketCallImpl.kt\ncom/kubi/quotefacade/knb/KCFlutterBridgeMarketCallImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1869#2,2:221\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeMarketCallImpl.kt\ncom/kubi/quotefacade/knb/KCFlutterBridgeMarketCallImpl\n*L\n65#1:221,2\n*E\n"})
public final class KCFlutterBridgeMarketCallImpl implements InterfaceC4432o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final QuoteMarketRepository f42152a = new QuoteMarketRepository();

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: a */
    public void mo4180a(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (IUserService.a.get().c()) {
            MviExKt.m42518n(new KCFlutterBridgeMarketCallImpl$changeFutureFavorite$1(this, symbol, callback, null));
            return;
        }
        FavTradeCacheConvert.f42000a.m51958d(2, CollectionsKt.listOf(new TradeItemBean(symbol)));
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: b */
    public void mo4181b(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (IUserService.a.get().c()) {
            MviExKt.m42518n(new KCFlutterBridgeMarketCallImpl$changeSpotFavorite$1(this, symbol, callback, null));
            return;
        }
        FavTradeCacheConvert.f42000a.m51958d(1, CollectionsKt.listOf(new TradeItemBean(symbol)));
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: c */
    public void mo4182c(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(FavFutureCacheManager.f41975a.m51911k(symbol)), null);
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: d */
    public void mo4183d(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (IUserService.a.get().c()) {
            MviExKt.m42518n(new KCFlutterBridgeMarketCallImpl$isSpotFavorite$1(this, symbol, callback, null));
        } else {
            callback.invoke(Boolean.valueOf(FavSpotCacheManager.f41993a.m51952l(symbol)), null);
        }
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: e */
    public void mo4184e(@NotNull Context ctx, @Nullable List<String> list, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (String str : list) {
                linkedHashMap.put(str, IKuMexService.f28731a.get().mo33289s(C27041f.m66668h(str)));
            }
        }
        callback.invoke(linkedHashMap, null);
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: f */
    public void mo4185f(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeMarketCallImpl$getFutureIncludes$1(callback, null));
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: g */
    public void mo4186g(@NotNull Context ctx, @NotNull String token, @NotNull String chain, @Nullable Boolean bool, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeMarketCallImpl$changeAlphaFavorite$1(token, chain, bool, callback, null));
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: h */
    public void mo4187h(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(IWalletService.f54542a.get().mo66941a()), null);
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: i */
    public void mo4188i(@NotNull Context ctx, @NotNull String token, @NotNull String chain, @NotNull String redirectType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(redirectType, "redirectType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeMarketCallImpl$jumpToWeb3Wallet$1(token, chain, null));
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: j */
    public void mo4189j(@NotNull Context ctx, @NotNull Function2<? super List<String>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ChainFavCacheManager.f41922a.m51781s());
        callback.invoke(arrayList, null);
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: k */
    public void mo4190k(@NotNull Context ctx, @Nullable String str, @Nullable String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeMarketCallImpl$openMarketFeedNewsTab$1(str, callback, null));
    }

    @Override // b00.InterfaceC4432o
    /* JADX INFO: renamed from: l */
    public void mo4191l(@NotNull Context ctx, @NotNull String token, @NotNull String chain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (IUserService.a.get().c()) {
            MviExKt.m42518n(new KCFlutterBridgeMarketCallImpl$isAlphaFavorite$1(this, token, chain, callback, null));
            return;
        }
        callback.invoke(Boolean.valueOf(FavAlphaCacheManager.f41929a.m51826w(token + '-' + chain)), null);
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final QuoteMarketRepository getF42152a() {
        return this.f42152a;
    }
}
