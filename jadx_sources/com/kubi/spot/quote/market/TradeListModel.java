package com.kubi.spot.quote.market;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.sdk.util.C24217a1;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27041f;
import e20.InterfaceC37053d;
import gf.C37890n;
import gf.InterfaceC37888l;
import i30.InterfaceC38436a;
import io.reactivex.Observable;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.quote.market.c2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeListModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012J\u001c\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00120\u001dj\b\u0012\u0004\u0012\u00020\u0012`\u001e0\u001cR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/spot/quote/market/TradeListModel;", "", "<init>", "()V", "mApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "mFavoriteApi", "Lcom/kubi/tradebase/api/FavoriteApi;", "getMFavoriteApi", "()Lcom/kubi/tradebase/api/FavoriteApi;", "mFavoriteApi$delegate", "Lkotlin/Lazy;", "getMarketList", "Lio/reactivex/Observable;", "", "Lcom/kubi/data/entity/TradeItemBean;", "market", "", "isMarket", "", "from", FirebaseAnalytics.Param.CURRENCY, "getFavoriteMarketList", "addCoinFavorite", "symbol", "stickSymbol", "getSpotFavoriteList", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeListModel {

    /* JADX INFO: renamed from: a */
    public final InterfaceC37053d f50908a = (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f50909b = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.a2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeListModel.m62520g();
        }
    });

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Observable m62518e(TradeListModel tradeListModel, String str, boolean z11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        return tradeListModel.m62522d(str, z11, str2, str3);
    }

    /* JADX INFO: renamed from: f */
    public static final CharSequence m62519f(SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String code = it.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        return code;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Observable<Object> m62521c(@Nullable String str) {
        Observable<R> observableCompose = this.f50908a.addFavorSymbol(str).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d */
    public final Observable<List<TradeItemBean>> m62522d(@NotNull String market, boolean z11, @NotNull String from, @Nullable String str) {
        Observable observableJust;
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(from, "from");
        if (Intrinsics.areEqual(market, "relation")) {
            String strJoinToString$default = CollectionsKt.joinToString$default(InterfaceC37888l.m85584f(C37890n.f85269a, C27041f.m66668h(str), false, false, 6, null), null, null, null, 0, null, new Function1() { // from class: com.kubi.spot.quote.market.b2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeListModel.m62519f((SymbolInfoEntity) obj);
                }
            }, 31, null);
            Observable observableJust2 = strJoinToString$default.length() == 0 ? Observable.just(CollectionsKt.emptyList()) : this.f50908a.m82933a(strJoinToString$default, from).compose(C24217a1.m58389m());
            Intrinsics.checkNotNull(observableJust2);
            return observableJust2;
        }
        if (!Intrinsics.areEqual(market, "favor")) {
            Observable observableCompose = z11 ? this.f50908a.getMarketSymbol(market, from).compose(C24217a1.m58389m()) : this.f50908a.m82933a(market, from).compose(C24217a1.m58389m());
            Intrinsics.checkNotNull(observableCompose);
            return observableCompose;
        }
        if (IUserService.a.get().c()) {
            observableJust = this.f50908a.getMarketSymbol(market, from).compose(C24217a1.m58389m());
        } else {
            StringBuilder sb2 = new StringBuilder();
            List<String> listMo50707j = IQuoteFacadeService.f41383a.get().mo50707j();
            int size = listMo50707j.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str2 = (String) CollectionsKt.getOrNull(listMo50707j, i11);
                if (str2 != null) {
                    sb2.append(str2);
                    if (i11 != listMo50707j.size() - 1) {
                        sb2.append(",");
                    }
                }
            }
            observableJust = TextUtils.isEmpty(sb2) ? Observable.just(CollectionsKt.emptyList()) : this.f50908a.m82933a(sb2.toString(), from).compose(C24217a1.m58389m());
        }
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC38436a m62520g() {
        return (InterfaceC38436a) C42597a.m93387c().create(InterfaceC38436a.class);
    }
}
