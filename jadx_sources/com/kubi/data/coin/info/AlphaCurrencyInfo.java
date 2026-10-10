package com.kubi.data.coin.info;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.coin.BizType;
import com.kubi.data.coin.QueryRet;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.utils.storage.StorageType;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37875a;
import gf.C37901y;
import gf.InterfaceC37884h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: compiled from: AlphaCurrencyInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0014\u001a\u00020\u00152\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017J\u0018\u0010\u001a\u001a\u00020\u00152\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0019H\u0002J!\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010#J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\u0005H\u0002J!\u0010'\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/data/coin/info/AlphaCurrencyInfo;", "", "<init>", "()V", "TAG", "", "tradeApi", "Lcom/kubi/data/coin/CoinApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/data/coin/CoinApi;", "tradeApi$delegate", "Lkotlin/Lazy;", "ALPHA_CURRENCY_INFO_KEY", "getALPHA_CURRENCY_INFO_KEY", "()Ljava/lang/String;", "ALPHA_CURRENCY_INFO_KEY$delegate", "CURRENCY_INFO_TIME_LINE", "Lcom/kubi/utils/storage/StorageId;", "", "fetchAlphaCurrencyInfoList", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "batchSave", "it", "", "saveEntity", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getAlphaCurrencyEntity", "currencySeq", "isQuoteCurrency", "", "(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "getAlphaCurrencyInfoListSync", "getEntity", "key", "getKey", "(Ljava/lang/Long;Ljava/lang/Boolean;)Ljava/lang/String;", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaCurrencyInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 8 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,157:1\n15#2:158\n84#2:159\n1869#3,2:160\n241#4,2:162\n281#4,4:177\n11546#5,9:164\n13472#5:173\n13473#5:175\n11555#5:176\n1#6:174\n139#7:181\n17#7:182\n178#8:183\n*S KotlinDebug\n*F\n+ 1 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo\n*L\n57#1:158\n60#1:159\n88#1:160,2\n98#1:162,2\n143#1:177,4\n128#1:164,9\n128#1:173\n128#1:175\n128#1:176\n128#1:174\n143#1:181\n143#1:182\n143#1:183\n*E\n"})
public final class AlphaCurrencyInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AlphaCurrencyInfo f21428a = new AlphaCurrencyInfo();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f21429b = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaCurrencyInfo.m23490q();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f21430c = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaCurrencyInfo.m23485c();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<Long> f21431d = new StorageId<>("alpha", "alpha_currency_info_time_line", null, false, 12, null);

    /* JADX INFO: renamed from: com.kubi.data.coin.info.AlphaCurrencyInfo$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo\n*L\n1#1,328:1\n130#2:329\n*E\n"})
    public static final class C12488a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Long currencySeq = ((AlphaCurrencyInfoEntity) t11).getCurrencySeq();
            Long l11 = 0L;
            if (currencySeq == null) {
                currencySeq = l11;
            }
            Long currencySeq2 = ((AlphaCurrencyInfoEntity) t12).getCurrencySeq();
            return ComparisonsKt.compareValues(currencySeq, currencySeq2 != null ? currencySeq2 : 0L);
        }
    }

    /* JADX INFO: renamed from: com.kubi.data.coin.info.AlphaCurrencyInfo$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo\n*L\n1#1,328:1\n131#2:329\n*E\n"})
    public static final class C12489b<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f21432b;

        public C12489b(Comparator comparator) {
            this.f21432b = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int iCompare = this.f21432b.compare(t11, t12);
            if (iCompare != 0) {
                return iCompare;
            }
            Boolean boolIsQuoteCurrency = ((AlphaCurrencyInfoEntity) t11).isQuoteCurrency();
            Boolean bool = Boolean.TRUE;
            return ComparisonsKt.compareValues(Intrinsics.areEqual(boolIsQuoteCurrency, bool) ? 1 : 0, Intrinsics.areEqual(((AlphaCurrencyInfoEntity) t12).isQuoteCurrency(), bool) ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m23485c() {
        return SiteUtils.m58088c(SiteUtils.f47907a, "alpha_currency_info_key", null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m23489i(AlphaCurrencyInfo alphaCurrencyInfo, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        alphaCurrencyInfo.m23492h(function1);
    }

    /* JADX INFO: renamed from: g */
    public final void m23491g(List<AlphaCurrencyInfoEntity> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                f21428a.m23499p((AlphaCurrencyInfoEntity) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m23492h(@Nullable Function1<? super ArrayList<AlphaCurrencyInfoEntity>, Unit> function1) {
        C43840a.m96551e("fetchAlphaCurrencyInfoList start", null, 2, null);
        long jM102324f = 0;
        if (C45590s.f102687a.m100679d0()) {
            C46392a.m102335r(f21431d);
        } else {
            jM102324f = C46392a.m102324f(f21431d, 0L);
        }
        C43840a.m96551e("fetchAlphaCurrencyInfoList section2", null, 2, null);
        C41696j.m91104d(C37875a.f85250c, null, null, new AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1(jM102324f, function1, null), 3, null);
        C43840a.m96551e("fetchAlphaCurrencyInfoList section4", null, 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final String m23493j() {
        return (String) f21430c.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final AlphaCurrencyInfoEntity m23494k(@Nullable Long l11, @Nullable Boolean bool) {
        if (l11 == null || bool == null) {
            return null;
        }
        AlphaCurrencyInfoEntity alphaCurrencyInfoEntityM23496m = m23496m(m23497n(l11, bool));
        if (alphaCurrencyInfoEntityM23496m == null) {
            C37901y.m85656a(BizType.AlphaEntityQuery, QueryRet.FAILED);
            return alphaCurrencyInfoEntityM23496m;
        }
        C37901y.m85656a(BizType.AlphaEntityQuery, QueryRet.SUCCESS);
        return alphaCurrencyInfoEntityM23496m;
    }

    /* JADX INFO: renamed from: n */
    public final String m23497n(Long l11, Boolean bool) {
        return (Intrinsics.areEqual(bool, Boolean.TRUE) ? "quote" : TtmlNode.RUBY_BASE) + '_' + l11;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC37884h m23498o() {
        return (InterfaceC37884h) f21429b.getValue();
    }

    /* JADX INFO: renamed from: q */
    public static final InterfaceC37884h m23490q() {
        return (InterfaceC37884h) C42597a.m93388d().create(InterfaceC37884h.class);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<AlphaCurrencyInfoEntity> m23495l() {
        String[] strArrM102346c = C46396e.m102346c(m23493j());
        if (strArrM102346c != null && strArrM102346c.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArrM102346c) {
                AlphaCurrencyInfoEntity alphaCurrencyInfoEntityM23496m = f21428a.m23496m(str);
                if (alphaCurrencyInfoEntityM23496m != null) {
                    arrayList.add(alphaCurrencyInfoEntityM23496m);
                }
            }
            List<AlphaCurrencyInfoEntity> listSortedWith = CollectionsKt.sortedWith(arrayList, new C12489b(new C12488a()));
            if (listSortedWith.isEmpty()) {
                m23489i(this, null, 1, null);
            }
            return listSortedWith;
        }
        m23489i(this, null, 1, null);
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: m */
    public final AlphaCurrencyInfoEntity m23496m(String str) {
        String strM23493j = m23493j();
        C46396e c46396e = C46396e.f104049a;
        return (AlphaCurrencyInfoEntity) C46392a.f104043a.m102336j(new StorageId(strM23493j, str, StorageType.Shared, true), AlphaCurrencyInfoEntity.class, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m23499p(AlphaCurrencyInfoEntity alphaCurrencyInfoEntity) {
        if (alphaCurrencyInfoEntity.getCurrencySeq() != null && alphaCurrencyInfoEntity.isQuoteCurrency() != null) {
            C46396e.m102357n(m23493j(), m23497n(alphaCurrencyInfoEntity.getCurrencySeq(), alphaCurrencyInfoEntity.isQuoteCurrency()), alphaCurrencyInfoEntity);
        }
    }
}
