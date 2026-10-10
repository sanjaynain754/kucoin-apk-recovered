package com.kubi.assets.interceptor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.AssetV2EventTracker;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.MultiChainEntity;
import com.kubi.assets.entity.WithdrawAddrAddChild;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.withdraw.address.WithdrawAddressAddFragment;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.router.utils.C23636b;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import il.C38661c;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p846zx.InterfaceC46935a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: WithdrawAddAddressRouteInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/interceptor/WithdrawAddAddressRouteInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "mAssetApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getMAssetApi", "()Lcom/kubi/assets/AssetV2Api;", "mAssetApi$delegate", "Lkotlin/Lazy;", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawAddAddressRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawAddAddressRouteInterceptor.kt\ncom/kubi/assets/interceptor/WithdrawAddAddressRouteInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1208#2,2:138\n1236#2,4:140\n1869#2,2:144\n1#3:146\n*S KotlinDebug\n*F\n+ 1 WithdrawAddAddressRouteInterceptor.kt\ncom/kubi/assets/interceptor/WithdrawAddAddressRouteInterceptor\n*L\n95#1:138,2\n95#1:140,4\n96#1:144,2\n*E\n"})
public final class WithdrawAddAddressRouteInterceptor extends C38661c {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f17772b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f17773a = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.interceptor.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawAddAddressRouteInterceptor.m17415i();
        }
    });

    /* JADX INFO: compiled from: WithdrawAddAddressRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/interceptor/WithdrawAddAddressRouteInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Pair m17413g(ArrayList chainList, ArrayList universalList) {
        Intrinsics.checkNotNullParameter(chainList, "chainList");
        Intrinsics.checkNotNullParameter(universalList, "universalList");
        return new Pair(chainList, universalList);
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) throws JSONException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!AssetsDepend.f18689a.m19189j().c()) {
            return super.mo4304b(chain);
        }
        Bundle bundle = chain.getPostcard().getBundle();
        String strM66668h = C27041f.m66668h(RouteExKt.m56284y(bundle, "coin"));
        final String strM66668h2 = C27041f.m66668h(RouteExKt.m56284y(bundle, "address"));
        final String strM66668h3 = C27041f.m66668h(RouteExKt.m56284y(bundle, "memo"));
        final String strM66668h4 = C27041f.m66668h(RouteExKt.m56284y(bundle, "chainId"));
        if (strM66668h.length() == 0) {
            return true;
        }
        final CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(strM66668h);
        if (coinInfoEntityM85613u == null) {
            AssetV2EventTracker.f17857a.m17556i(strM66668h);
            return true;
        }
        Observable.zip(AssetV2Api.m17061d1(m17416f(), strM66668h, null, null, null, 12, null).compose(C24217a1.m58389m()), AssetV2Api.m17070w(m17416f(), null, Boolean.valueOf(AssetRemoteConfig.f18903a.m19565A()), 1, null).compose(C24217a1.m58389m()), new BiFunction() { // from class: com.kubi.assets.interceptor.y
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return WithdrawAddAddressRouteInterceptor.m17413g((ArrayList) obj, (ArrayList) obj2);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.assets.interceptor.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WithdrawAddAddressRouteInterceptor.m17414h(strM66668h2, strM66668h3, strM66668h4, coinInfoEntityM85613u, (Pair) obj);
            }
        }, new C24223c1(null));
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final AssetV2Api m17416f() {
        return (AssetV2Api) this.f17773a.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static final void m17414h(String str, String str2, String str3, CoinInfoEntity coinInfoEntity, Pair pair) {
        ArrayList<? extends Parcelable> arrayList = (ArrayList) pair.component1();
        ArrayList<? extends Parcelable> arrayList2 = (ArrayList) pair.component2();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put(((MultiChainEntity) obj).getChainId(), obj);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zIsUniversalChain = false;
            if (!it.hasNext()) {
                break;
            }
            MultiChainEntity multiChainEntity = (MultiChainEntity) it.next();
            multiChainEntity.setSelected(false);
            MultiChainEntity multiChainEntity2 = (MultiChainEntity) linkedHashMap.get(multiChainEntity.getChainId());
            if (multiChainEntity2 != null) {
                zIsUniversalChain = multiChainEntity2.isUniversalChain();
            }
            multiChainEntity.setUniversalChain(zIsUniversalChain);
        }
        WithdrawAddrAddChild withdrawAddrAddChild = null;
        if (str.length() > 0) {
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str3.length() == 0) {
                str3 = null;
            }
            withdrawAddrAddChild = new WithdrawAddrAddChild(str, str2, null, str3);
        }
        C27051h c27051hM66724h = new C27051h().m66721e("coinInfo", coinInfoEntity).m66724h("title", C27017c.f54310a.m66516f(R$string.asset_add_address, new Object[0]));
        if (withdrawAddrAddChild == null) {
            c27051hM66724h.m66722f("parcelable_list", arrayList).m66722f("parcelable_list_data", arrayList2);
        } else {
            c27051hM66724h.m66721e("data", withdrawAddrAddChild).m66722f("parcelable_list", arrayList2);
        }
        Bundle bundleM66717a = c27051hM66724h.m66717a();
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextM56289c = C23636b.m56289c();
        Intrinsics.checkNotNullExpressionValue(contextM56289c, "getTopActivityOrApp(...)");
        companion.launch(contextM56289c, WithdrawAddressAddFragment.class, bundleM66717a);
    }

    /* JADX INFO: renamed from: i */
    public static final AssetV2Api m17415i() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }
}
