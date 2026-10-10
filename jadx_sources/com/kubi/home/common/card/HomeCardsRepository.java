package com.kubi.home.common.card;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.blankj.utilcode.util.C5267e0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kubi.home.common.HomeCardsRegistry;
import com.kubi.home.exception.HomeException;
import com.kubi.home.search.SearchCardData;
import com.kubi.home.setting.SettingCardData;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.CardFlowParser;
import com.kubi.kucoin.home.cards.ClassMapping;
import com.kubi.kucoin.home.cardsconfig.CardListReq;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27099x;
import com.kubi.wallet.api.IWalletService;
import dj.C36717b;
import dj.C36718c;
import dj.C36719d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p830zf.InterfaceC46816p;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: HomeCardsRepository.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u00015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\u0018J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020 J\u0010\u0010$\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010%\u001a\u00020\u0018J\u0006\u0010&\u001a\u00020 J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aJ\u000e\u0010*\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010+\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010,J+\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0.2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100¢\u0006\u0002\u00101J\u0016\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0.2\u0006\u00103\u001a\u000204R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m90084d2 = {"Lcom/kubi/home/common/card/HomeCardsRepository;", "", "<init>", "()V", "homeCardFlowParser", "com/kubi/home/common/card/HomeCardsRepository$homeCardFlowParser$1", "Lcom/kubi/home/common/card/HomeCardsRepository$homeCardFlowParser$1;", "threeGripHeight", "", JPushConstants.Analysis.KEY_JSON, "Lcom/google/gson/JsonObject;", "latestConfig", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;", "initConfig", "getInitConfig", "()Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;", "initConfig$delegate", "Lkotlin/Lazy;", "getCardFlowParser", "Lcom/kubi/kucoin/home/cards/CardFlowParser;", "getCardList", "", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "removeCard", "", "code", "", "getCardConfig", "buildVisibleCardFlow", "saveConfig", "it", "refreshCacheTime", "", "cardStorageId", "Lcom/kubi/utils/storage/StorageId;", "userSavedStorageId", "clearCardData", "setUserSaved", "getUserSaved", "getCardData", "saveCardData", "data", "clear", "loadCardConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRemoteData", "Lkotlinx/coroutines/flow/Flow;", "cacheTime", "", "(Ljava/lang/String;Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "fetchCardConfig", "cardList", "Lcom/kubi/kucoin/home/cardsconfig/CardListReq;", "CardsApi", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCardsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCardsRepository.kt\ncom/kubi/home/common/card/HomeCardsRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 4 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 7 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 8 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 9 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,305:1\n1761#2,3:306\n1563#2:335\n1634#2,3:336\n47#3,2:309\n111#4:311\n99#4:312\n1#5:313\n23#6,2:314\n23#6,2:318\n126#6,2:320\n135#6,2:322\n32#6:326\n23#6,2:329\n23#6,2:333\n32#6:341\n109#7:316\n109#7:324\n109#7:327\n109#7:331\n46#8:317\n46#8:325\n46#8:328\n46#8:332\n17#9,2:339\n*S KotlinDebug\n*F\n+ 1 HomeCardsRepository.kt\ncom/kubi/home/common/card/HomeCardsRepository\n*L\n80#1:306,3\n262#1:335\n262#1:336,3\n84#1:309,2\n157#1:311\n157#1:312\n198#1:314,2\n215#1:318,2\n223#1:320,2\n230#1:322,2\n237#1:326\n244#1:329,2\n251#1:333,2\n101#1:341\n215#1:316\n237#1:324\n244#1:327\n251#1:331\n215#1:317\n237#1:325\n244#1:328\n251#1:332\n98#1:339,2\n*E\n"})
public final class HomeCardsRepository {

    /* JADX INFO: renamed from: c */
    @Nullable
    public static CardListRsp f25608c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeCardsRepository f25606a = new HomeCardsRepository();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C14528b f25607b = new C14528b(HomeCardsRegistry.f25589a.m29044a());

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f25609d = LazyKt.lazy(new Function0() { // from class: com.kubi.home.common.card.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeCardsRepository.m29065o();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<String> f25610e = new StorageId<>("CATE_KV_HOME", "key_home_card_", null, false, 12, null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<Boolean> f25611f = new StorageId<>("CATE_KV_HOME", "key_home_card_user_saved", null, false, 12, null);

    /* JADX INFO: renamed from: com.kubi.home.common.card.HomeCardsRepository$a */
    /* JADX INFO: compiled from: HomeCardsRepository.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH'¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/common/card/HomeCardsRepository$CardsApi;", "", "getCards", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/gson/JsonObject;", "code", "", "cacheTime", "", "(Ljava/lang/String;Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "getConfig", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;", "cardCodeList", "Lcom/kubi/kucoin/home/cardsconfig/CardListReq;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC14527a {
        @Headers({"X-SENSORS-ID:true"})
        @POST("v1/homepage/card/order")
        @NotNull
        /* JADX INFO: renamed from: b */
        InterfaceC41634e<CardListRsp> m29085b(@Body @NotNull CardListReq cardListReq);

        @GET("v1/homepage/card")
        @NotNull
        /* JADX INFO: renamed from: c */
        InterfaceC41634e<JsonObject> m29086c(@Nullable @Query("code") String str, @Header("Cache-Time") @Nullable Long l11);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ InterfaceC41634e m29084a(InterfaceC14527a interfaceC14527a, String str, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCards");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                l11 = null;
            }
            return interfaceC14527a.m29086c(str, l11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.common.card.HomeCardsRepository$b */
    /* JADX INFO: compiled from: HomeCardsRepository.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/home/common/card/HomeCardsRepository$homeCardFlowParser$1", "Lcom/kubi/kucoin/home/cards/CardFlowParser;", "configStyle", "", JPushConstants.Analysis.KEY_JSON, "Lcom/google/gson/JsonObject;", "getCardData", "", "code", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14528b extends CardFlowParser {
        @Override // com.kubi.kucoin.home.cards.CardFlowParser
        /* JADX INFO: renamed from: f */
        public void mo29087f(JsonObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JsonElement jsonElement = json.get("code");
            if (Intrinsics.areEqual(jsonElement != null ? jsonElement.getAsString() : null, "threeGrip")) {
                json.addProperty("height", Integer.valueOf(HomeCardsRepository.f25606a.m29083v(json)));
            }
            JsonElement jsonElement2 = json.get("code");
            if (Intrinsics.areEqual(jsonElement2 != null ? jsonElement2.getAsString() : null, "twoGrip")) {
                json.addProperty("height", (Number) 160);
            }
            JsonElement jsonElement3 = json.get("code");
            if (Intrinsics.areEqual(jsonElement3 != null ? jsonElement3.getAsString() : null, "hotSymbolAndNews")) {
                json.addProperty("bg", Boolean.TRUE);
            }
        }

        @Override // com.kubi.kucoin.home.cards.CardFlowParser
        /* JADX INFO: renamed from: j */
        public String mo29088j(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return HomeCardsRepository.f25606a.m29073j(code);
        }

        public C14528b(HashMap<String, ClassMapping> map) {
            super(map);
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m29083v(JsonObject jsonObject) {
        Iterable asJsonArray;
        try {
            JsonElement jsonElement = jsonObject.get("children");
            if (jsonElement != null && (asJsonArray = jsonElement.getAsJsonArray()) != null) {
                if ((asJsonArray instanceof Collection) && ((Collection) asJsonArray).isEmpty()) {
                    return 150;
                }
                Iterator it = asJsonArray.iterator();
                while (it.hasNext()) {
                    JsonElement jsonElement2 = ((JsonElement) it.next()).getAsJsonObject().get("type");
                    if (Intrinsics.areEqual(jsonElement2 != null ? jsonElement2.getAsString() : null, "BANNER")) {
                    }
                }
                return 150;
            }
        } catch (Throwable th2) {
            C43846g.m96568c(new HomeException(th2, "HomeCardsRepository", false, null, 8, null), null, 2, null);
        }
        return (int) (((((C5267e0.m6183e() - (44 * C5267e0.m6181c())) / 2) / C5267e0.m6181c()) / 3) * 4);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InterfaceC41634e m29064h(HomeCardsRepository homeCardsRepository, String str, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        return homeCardsRepository.m29071g(str, l11);
    }

    /* JADX INFO: renamed from: o */
    public static final CardListRsp m29065o() {
        CardListRsp cardListRspM103146a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46816p.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null && (cardListRspM103146a = ((InterfaceC46816p) objM56186h).m103146a()) != null) {
            return cardListRspM103146a;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            CardListRsp cardListRsp = (CardListRsp) C27099x.m66913c(C46392a.m102326h(C36719d.f79632a.m82270o(), ""), CardListRsp.class);
            if (cardListRsp != null) {
                if (cardListRsp.getCardList() == null) {
                    cardListRsp = null;
                }
                if (cardListRsp != null) {
                    return cardListRsp;
                }
            }
            Result.m103844constructorimpl(null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        ArrayList arrayList = new ArrayList();
        if (!UserInfo.a.m()) {
            arrayList.addAll(CollectionsKt.listOf((Object[]) new CardListRsp.Card[]{new CardListRsp.Card("noLoginedWelfare", "NO_LOGINED_WELFARE", true, false, false, null, null, 1, 0, 0, 888, null), new CardListRsp.Card("noLoginedCurrency", "NO_LOGINED_CURRENCY", true, false, false, null, null, 1, 0, 0, 888, null)}));
        }
        arrayList.addAll(CollectionsKt.listOf((Object[]) new CardListRsp.Card[]{new CardListRsp.Card("menu", "MENU", true, false, false, null, null, 1, 0, 0, 888, null), new CardListRsp.Card("hotSymbol", null, false, false, false, null, null, 0, 0, 0, 1022, null), new CardListRsp.Card("twoGrip", null, false, false, false, null, null, 0, 0, 0, 1022, null), new CardListRsp.Card("rankingList", "RANKING_LIST", true, false, false, null, null, 1, 0, 0, 888, null)}));
        return new CardListRsp(CollectionsKt.toList(arrayList), false, null, null, 8, null);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m29066t(HomeCardsRepository homeCardsRepository, CardListRsp cardListRsp, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        homeCardsRepository.m29081s(cardListRsp, z11);
    }

    /* JADX INFO: renamed from: c */
    public final void m29067c() {
        f25607b.m32206d(m29072i());
    }

    /* JADX INFO: renamed from: d */
    public final void m29068d(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        StorageId<String> storageId = f25610e;
        C46392a.m102333p(new StorageId(storageId.getCategory(), storageId.getKey() + code, storageId.getStorageType(), storageId.getSupportLegacy()), "");
    }

    /* JADX INFO: renamed from: e */
    public final void m29069e(@Nullable String str) {
        if (str != null) {
            StorageId<String> storageId = f25610e;
            C46392a.m102333p(new StorageId(storageId.getCategory(), storageId.getKey() + str, storageId.getStorageType(), storageId.getSupportLegacy()), "");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC41634e<CardListRsp> m29070f(@NotNull CardListReq cardList) {
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        return ((InterfaceC14527a) C42597a.m93387c().create(InterfaceC14527a.class)).m29085b(cardList);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final CardListRsp m29072i() {
        CardListRsp cardListRsp = f25608c;
        if (cardListRsp != null) {
            if (cardListRsp.getCardList() == null) {
                cardListRsp = null;
            }
            if (cardListRsp != null) {
                return cardListRsp;
            }
        }
        f25608c = m29076m();
        return m29076m();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m29073j(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        StorageId<String> storageId = f25610e;
        return C46392a.m102326h(new StorageId(storageId.getCategory(), storageId.getKey() + code, storageId.getStorageType(), storageId.getSupportLegacy()), "");
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final CardFlowParser m29074k() {
        return f25607b;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final List<BaseCardData> m29075l() {
        Object next;
        List<BaseCardData> listM32208i = f25607b.m32208i();
        if (listM32208i == null) {
            return null;
        }
        Iterator<T> it = listM32208i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((BaseCardData) next).getType(), "NO_LOGINED_WELFARE"));
        if (!(next != null) && IWalletService.f54542a.get().mo66941a()) {
            listM32208i.add(0, new SearchCardData());
        }
        if (f25606a.m29072i().getShowConfigButton() && !listM32208i.isEmpty()) {
            listM32208i.add(new SettingCardData(null, 1, null));
        }
        return listM32208i;
    }

    /* JADX INFO: renamed from: m */
    public final CardListRsp m29076m() {
        return (CardListRsp) f25609d.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m29077n() {
        return C46392a.m102322d(f25611f, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m29078p(@NotNull Continuation<? super CardListRsp> continuation) {
        HomeCardsRepository$loadCardConfig$1 homeCardsRepository$loadCardConfig$1;
        if (continuation instanceof HomeCardsRepository$loadCardConfig$1) {
            homeCardsRepository$loadCardConfig$1 = (HomeCardsRepository$loadCardConfig$1) continuation;
            int i11 = homeCardsRepository$loadCardConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeCardsRepository$loadCardConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeCardsRepository$loadCardConfig$1 = new HomeCardsRepository$loadCardConfig$1(this, continuation);
            }
        } else {
            homeCardsRepository$loadCardConfig$1 = new HomeCardsRepository$loadCardConfig$1(this, continuation);
        }
        Object objM42830k = homeCardsRepository$loadCardConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeCardsRepository$loadCardConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            List<CardListRsp.Card> cardList = m29072i().getCardList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cardList, 10));
            for (CardListRsp.Card card : cardList) {
                arrayList.add(new CardListReq.Card(card.getCode(), card.getUserVisible()));
            }
            CardListReq cardListReq = new CardListReq(arrayList, m29077n(), UserInfo.a.m());
            InterfaceC41634e<CardListRsp> interfaceC41634eM29070f = m29070f(cardListReq);
            homeCardsRepository$loadCardConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(cardListReq);
            homeCardsRepository$loadCardConfig$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM29070f, homeCardsRepository$loadCardConfig$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42830k);
        }
        CardListRsp cardListRsp = (CardListRsp) objM42830k;
        if (cardListRsp != null) {
            m29066t(f25606a, cardListRsp, false, 2, null);
        } else {
            cardListRsp = C36718c.m82250a() ? f25608c : null;
        }
        C36717b.m82249b(cardListRsp != null ? cardListRsp.getAbType() : null);
        return cardListRsp;
    }

    /* JADX INFO: renamed from: q */
    public final void m29079q(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        f25607b.m32211m(code);
    }

    /* JADX INFO: renamed from: r */
    public final void m29080r(@NotNull String code, @NotNull String data) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        StorageId<String> storageId = f25610e;
        C46392a.m102333p(new StorageId(storageId.getCategory(), storageId.getKey() + code, storageId.getStorageType(), storageId.getSupportLegacy()), data);
    }

    /* JADX INFO: renamed from: s */
    public final void m29081s(@NotNull CardListRsp it, boolean z11) {
        Intrinsics.checkNotNullParameter(it, "it");
        f25608c = it;
        C46392a.m102333p(C36719d.f79632a.m82270o(), C27099x.m66919i(it, false, 2, null));
        if (z11) {
            C36718c.m82251b();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m29082u() {
        C46392a.m102328k(f25611f, true);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41634e<JsonObject> m29071g(@Nullable String str, @Nullable Long l11) {
        return ((InterfaceC14527a) C42597a.m93387c().create(InterfaceC14527a.class)).m29086c(str, l11);
    }
}
