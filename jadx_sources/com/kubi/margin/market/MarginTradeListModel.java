package com.kubi.margin.market;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import io.reactivex.Observable;
import java.util.List;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p768xo.InterfaceC46307h;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.market.d4, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarginTradeListModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\fR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/margin/market/MarginTradeListModel;", "", "<init>", "()V", "mApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMarketList", "Lio/reactivex/Observable;", "", "Lcom/kubi/data/entity/TradeItemBean;", "market", "", "isMarket", "", "from", FirebaseAnalytics.Param.CURRENCY, "tradeType", "", "addCoinFavorite", "symbol", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginTradeListModel {

    /* JADX INFO: renamed from: a */
    public final InterfaceC46307h f33260a = (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Observable m39009d(MarginTradeListModel marginTradeListModel, String str, boolean z11, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str3 = null;
        }
        String str4 = str3;
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        return marginTradeListModel.m39012c(str, z11, str2, str4, i11);
    }

    /* JADX INFO: renamed from: e */
    public static final CharSequence m39010e(SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String code = it.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        return code;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Observable<Object> m39011b(@Nullable String str) {
        return this.f33260a.addFavorSymbol(str).compose(C24217a1.m58389m());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Observable<List<TradeItemBean>> m39012c(@NotNull String market, boolean z11, @NotNull String from, @Nullable String str, int i11) {
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(from, "from");
        if (Intrinsics.areEqual(market, "relation")) {
            String strJoinToString$default = CollectionsKt.joinToString$default(C37890n.f85269a.mo85592c(C27041f.m66668h(str), i11 == 1, i11 == 2), null, null, null, 0, null, new Function1() { // from class: com.kubi.margin.market.c4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginTradeListModel.m39010e((SymbolInfoEntity) obj);
                }
            }, 31, null);
            if (strJoinToString$default.length() == 0) {
                Observable<List<TradeItemBean>> observableJust = Observable.just(CollectionsKt.emptyList());
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
            InterfaceC46307h mApi = this.f33260a;
            Intrinsics.checkNotNullExpressionValue(mApi, "mApi");
            return C17846i4.m39017e(mApi, strJoinToString$default, from);
        }
        if (!Intrinsics.areEqual(market, "favor")) {
            if (z11) {
                Observable observableCompose = this.f33260a.getMarketSymbol(market, from).compose(C24217a1.m58389m());
                Intrinsics.checkNotNull(observableCompose);
                return observableCompose;
            }
            InterfaceC46307h mApi2 = this.f33260a;
            Intrinsics.checkNotNullExpressionValue(mApi2, "mApi");
            return C17846i4.m39017e(mApi2, market, from);
        }
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c()) {
            Observable observableCompose2 = this.f33260a.getMarketSymbol(market, from).compose(C24217a1.m58389m());
            Intrinsics.checkNotNull(observableCompose2);
            return observableCompose2;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = c42579a.m93345e().mo50707j().size();
        for (int i12 = 0; i12 < size; i12++) {
            C42579a c42579a2 = C42579a.f94275a;
            sb2.append(c42579a2.m93345e().mo50707j().get(i12));
            if (i12 != c42579a2.m93345e().mo50707j().size() - 1) {
                sb2.append(",");
            }
        }
        if (TextUtils.isEmpty(sb2)) {
            Observable<List<TradeItemBean>> observableJust2 = Observable.just(CollectionsKt.emptyList());
            Intrinsics.checkNotNull(observableJust2);
            return observableJust2;
        }
        InterfaceC46307h mApi3 = this.f33260a;
        Intrinsics.checkNotNullExpressionValue(mApi3, "mApi");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return C17846i4.m39017e(mApi3, string, from);
    }
}
