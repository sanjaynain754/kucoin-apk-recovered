package com.kubi.futures.trade;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.data.platform.model.Article;
import com.kubi.kumex.data.platform.model.ContractNotice;
import com.kubi.kumex.data.platform.model.FuturesBannerEntity;
import com.kubi.kumex.data.platform.model.FuturesCampaignActivityEntity;
import com.kubi.kumex.data.platform.model.NoticeConfig;
import com.kubi.kumex.data.platform.model.ResourcePositionEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FuturesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$fetchBannerList$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFuturesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel$fetchBannerList$1\n+ 2 NoticeConfig.kt\ncom/kubi/kumex/data/platform/model/NoticeConfig\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,408:1\n21#2:409\n22#2:412\n23#2:414\n24#2:418\n774#3:410\n865#3:411\n866#3:413\n1563#3:415\n1634#3,2:416\n1636#3:420\n1021#3,2:421\n149#4:419\n*S KotlinDebug\n*F\n+ 1 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel$fetchBannerList$1\n*L\n297#1:409\n297#1:412\n297#1:414\n297#1:418\n297#1:410\n297#1:411\n297#1:413\n297#1:415\n297#1:416,2\n297#1:420\n357#1:421,2\n297#1:419\n*E\n"})
public final class FuturesViewModel$fetchBannerList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $lang;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ FuturesViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$fetchBannerList$1$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/kumex/data/platform/model/NoticeConfig$body$lambda$1$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C13609a extends TypeToken<ContractNotice> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$fetchBannerList$1$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel$fetchBannerList$1\n*L\n1#1,328:1\n357#2:329\n*E\n"})
    public static final class C13610b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(C27039d.m66652l(((FuturesBannerEntity) t12).getPublishTime())), Long.valueOf(C27039d.m66652l(((FuturesBannerEntity) t11).getPublishTime())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesViewModel$fetchBannerList$1(String str, String str2, FuturesViewModel futuresViewModel, Continuation<? super FuturesViewModel$fetchBannerList$1> continuation) {
        super(2, continuation);
        this.$lang = str;
        this.$symbol = str2;
        this.this$0 = futuresViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesViewModel$fetchBannerList$1(this.$lang, this.$symbol, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesViewModel$fetchBannerList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FuturesCampaignActivityEntity futuresCampaignActivityEntityMo24986M;
        List<ResourcePositionEntity> listEmptyList;
        List<ContractNotice> listEmptyList2;
        List<Article> listEmptyList3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<FuturesBannerEntity> arrayList = new ArrayList<>();
        try {
            futuresCampaignActivityEntityMo24986M = RepositoryServiceLocator.f19236a.m20288g().mo24986M(1, 100, this.$lang, "futures-announcements", Boxing.boxInt(1));
            try {
                C44128b.m97258b("fetchBannerList campaignActivityEntity: " + futuresCampaignActivityEntityMo24986M);
            } catch (Exception e11) {
                e = e11;
                C44128b.m97263g("fetchBannerList campaignActivityEntity error", e);
            }
        } catch (Exception e12) {
            e = e12;
            futuresCampaignActivityEntityMo24986M = null;
        }
        try {
            listEmptyList = RepositoryServiceLocator.f19236a.m20288g().mo25033x("futures-topbar-app", "contract", this.$symbol).get("futures-topbar-app");
            try {
                C44128b.m97258b("fetchBannerList resourcePositionBanner: " + listEmptyList);
            } catch (Exception e13) {
                e = e13;
                C44128b.m97263g("fetchBannerList resourcePositionBanner error", e);
            }
        } catch (Exception e14) {
            e = e14;
            listEmptyList = null;
        }
        try {
            NoticeConfig noticeConfigMo25023q = RepositoryServiceLocator.f19236a.m20288g().mo25023q();
            ArrayList arrayList2 = new ArrayList();
            for (Map<String, ? extends Object> map : noticeConfigMo25023q) {
                if (Intrinsics.areEqual(map.get("type"), "trade_notice")) {
                    arrayList2.add(map);
                }
            }
            listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String strM66606i = C27029c.m66606i((Map) it.next());
                Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
                C27099x c27099x = C27099x.f54458a;
                listEmptyList2.add(C27099x.m66914d(strM66606i, new C13609a().getType()));
            }
        } catch (Exception unused) {
            listEmptyList2 = null;
        }
        if (futuresCampaignActivityEntityMo24986M == null || (listEmptyList3 = futuresCampaignActivityEntityMo24986M.getItems()) == null) {
            listEmptyList3 = CollectionsKt.emptyList();
        }
        for (Article article : listEmptyList3) {
            long jM66652l = C27039d.m66652l(article.getPublishTime());
            if (this.this$0.m26721I(String.valueOf(C27039d.m66652l(article.getId())))) {
                Long id2 = article.getId();
                String string = id2 != null ? id2.toString() : null;
                String title = article.getTitle();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(HostManager.a.e());
                sb2.append("/announcement");
                sb2.append(article.getPath());
                sb2.append("?theme=");
                sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
                sb2.append("&appNeedLang=true");
                arrayList.add(new FuturesBannerEntity(string, title, sb2.toString(), Boxing.boxLong(jM66652l), null, null, 48, null));
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        for (ResourcePositionEntity resourcePositionEntity : listEmptyList) {
            long jM66652l2 = C27039d.m66652l(resourcePositionEntity.getReleasedAtMillis()) / 1000;
            if (this.this$0.m26721I(C27041f.m66668h(resourcePositionEntity.getId()))) {
                Map<String, String> srcTextMap = resourcePositionEntity.getSrcTextMap();
                String str = srcTextMap != null ? srcTextMap.get("text1") : null;
                Map<String, String> daySrcImgMap = resourcePositionEntity.getDaySrcImgMap();
                String str2 = daySrcImgMap != null ? daySrcImgMap.get("img1") : null;
                Map<String, String> nightSrcImgMap = resourcePositionEntity.getNightSrcImgMap();
                arrayList.add(new FuturesBannerEntity(resourcePositionEntity.getId(), str, resourcePositionEntity.getUrl(), Boxing.boxLong(jM66652l2), str2, nightSrcImgMap != null ? nightSrcImgMap.get("img1") : null));
            }
        }
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        for (ContractNotice contractNotice : listEmptyList2) {
            long jM66652l3 = C27039d.m66652l(contractNotice.getStart()) / 1000;
            String strValueOf = String.valueOf(jM66652l3);
            if (this.this$0.m26721I(strValueOf)) {
                arrayList.add(new FuturesBannerEntity(strValueOf, contractNotice.getContent(), contractNotice.getLink(), Boxing.boxLong(jM66652l3), null, null, 48, null));
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C13610b());
        }
        MutableLiveData<List<FuturesBannerEntity>> mutableLiveDataM26714B = this.this$0.m26714B();
        if (arrayList.size() > 6) {
            arrayList = arrayList.subList(0, 6);
        }
        mutableLiveDataM26714B.postValue(arrayList);
        return Unit.INSTANCE;
    }
}
