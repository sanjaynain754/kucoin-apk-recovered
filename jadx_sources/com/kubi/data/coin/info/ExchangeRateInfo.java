package com.kubi.data.coin.info;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.DataInitManager;
import com.kubi.data.coin.BizType;
import com.kubi.data.coin.QueryRet;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.storage.StorageType;
import gf.C37901y;
import gf.InterfaceC37884h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.text.StringsKt;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: compiled from: ExchangeRateInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J \u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0005J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/data/coin/info/ExchangeRateInfo;", "", "<init>", "()V", "TAG", "", "tradeApi", "Lcom/kubi/data/coin/CoinApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/data/coin/CoinApi;", "tradeApi$delegate", "Lkotlin/Lazy;", "category", "getLocaleCoinList", "Lio/reactivex/disposables/Disposable;", "callBack", "Lio/reactivex/functions/Consumer;", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "getLocaleCoinListSync", "fetchCoinList", "getCoinEntityByCode", FirebaseAnalytics.Param.CURRENCY, "searchCoinListByKeyword", "keyword", BridgeParamKeyKt.MAX_COUNT, "", "saveList", "", "list", "getList", "CoinInfoEntityExt", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nExchangeRateInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExchangeRateInfo.kt\ncom/kubi/data/coin/info/ExchangeRateInfo\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 3 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n281#2,4:145\n241#2,2:157\n241#2,2:159\n281#2,4:163\n139#3:149\n17#3:150\n139#3:167\n17#3:168\n178#4:151\n178#4:169\n774#5:152\n865#5,2:153\n1878#5,2:155\n1880#5:161\n774#5:171\n865#5,2:172\n774#5:174\n865#5,2:175\n774#5:177\n865#5,2:178\n1869#5:180\n1870#5:182\n1056#5:183\n13472#6:162\n13473#6:170\n1#7:181\n*S KotlinDebug\n*F\n+ 1 ExchangeRateInfo.kt\ncom/kubi/data/coin/info/ExchangeRateInfo\n*L\n84#1:145,4\n119#1:157,2\n121#1:159,2\n133#1:163,4\n84#1:149\n84#1:150\n133#1:167\n133#1:168\n84#1:151\n133#1:169\n105#1:152\n105#1:153,2\n118#1:155,2\n118#1:161\n137#1:171\n137#1:172,2\n60#1:174\n60#1:175,2\n61#1:177\n61#1:178,2\n62#1:180\n62#1:182\n65#1:183\n132#1:162\n132#1:170\n*E\n"})
public final class ExchangeRateInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ExchangeRateInfo f21433a = new ExchangeRateInfo();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f21434b = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExchangeRateInfo.m23501F();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f21435c = SiteUtils.m58088c(SiteUtils.f47907a, "coin_info_key_" + DataInitManager.f21486a.m23668i().getUid(), null, null, 6, null);

    /* JADX INFO: compiled from: ExchangeRateInfo.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/data/coin/info/ExchangeRateInfo$CoinInfoEntityExt;", "Landroid/os/Parcelable;", "index", "", "bean", "Lcom/kubi/data/entity/CoinInfoEntity;", "<init>", "(ILcom/kubi/data/entity/CoinInfoEntity;)V", "getIndex", "()I", "getBean", "()Lcom/kubi/data/entity/CoinInfoEntity;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CoinInfoEntityExt implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CoinInfoEntityExt> CREATOR = new C12491a();

        @NotNull
        private final CoinInfoEntity bean;
        private final int index;

        /* JADX INFO: renamed from: com.kubi.data.coin.info.ExchangeRateInfo$CoinInfoEntityExt$a */
        /* JADX INFO: compiled from: ExchangeRateInfo.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C12491a implements Parcelable.Creator<CoinInfoEntityExt> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CoinInfoEntityExt createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoinInfoEntityExt(parcel.readInt(), (CoinInfoEntity) parcel.readParcelable(CoinInfoEntityExt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CoinInfoEntityExt[] newArray(int i11) {
                return new CoinInfoEntityExt[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CoinInfoEntityExt)) {
                return false;
            }
            CoinInfoEntityExt coinInfoEntityExt = (CoinInfoEntityExt) other;
            return this.index == coinInfoEntityExt.index && Intrinsics.areEqual(this.bean, coinInfoEntityExt.bean);
        }

        public CoinInfoEntityExt(int i11, @NotNull CoinInfoEntity bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            this.index = i11;
            this.bean = bean;
        }

        public static /* synthetic */ CoinInfoEntityExt copy$default(CoinInfoEntityExt coinInfoEntityExt, int i11, CoinInfoEntity coinInfoEntity, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = coinInfoEntityExt.index;
            }
            if ((i12 & 2) != 0) {
                coinInfoEntity = coinInfoEntityExt.bean;
            }
            return coinInfoEntityExt.copy(i11, coinInfoEntity);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CoinInfoEntity getBean() {
            return this.bean;
        }

        @NotNull
        public final CoinInfoEntityExt copy(int index, @NotNull CoinInfoEntity bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            return new CoinInfoEntityExt(index, bean);
        }

        @NotNull
        public final CoinInfoEntity getBean() {
            return this.bean;
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + this.bean.hashCode();
        }

        @NotNull
        public String toString() {
            return "CoinInfoEntityExt(index=" + this.index + ", bean=" + this.bean + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.index);
            dest.writeParcelable(this.bean, flags);
        }
    }

    /* JADX INFO: renamed from: com.kubi.data.coin.info.ExchangeRateInfo$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExchangeRateInfo.kt\ncom/kubi/data/coin/info/ExchangeRateInfo\n*L\n1#1,328:1\n65#2:329\n*E\n"})
    public static final class C12492a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(((CoinInfoEntity) t11).getContractCoin() == null), Boolean.valueOf(((CoinInfoEntity) t12).getContractCoin() == null));
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m23526D(List<? extends CoinInfoEntity> list) {
        synchronized (this) {
            try {
                C46396e.m102344a(f21435c);
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    CoinInfoEntity coinInfoEntity = (CoinInfoEntity) obj;
                    CoinInfoEntityExt coinInfoEntityExt = new CoinInfoEntityExt(i11, coinInfoEntity);
                    String str = f21435c;
                    String code = coinInfoEntity.getCode();
                    Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
                    C46396e.m102357n(str, code, coinInfoEntityExt);
                    if (!Intrinsics.areEqual(coinInfoEntity.getCode(), coinInfoEntity.getCurrency())) {
                        CoinInfoEntityExt coinInfoEntityExt2 = new CoinInfoEntityExt(i11, coinInfoEntity);
                        String currency = coinInfoEntity.getCurrency();
                        Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
                        C46396e.m102357n(str, currency, coinInfoEntityExt2);
                    }
                    i11 = i12;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final List<CoinInfoEntity> m23530w() {
        ArrayList arrayList;
        String currency;
        synchronized (this) {
            try {
                String[] strArrM102346c = C46396e.m102346c(f21435c);
                ArrayList arrayList2 = new ArrayList(Collections.nCopies(strArrM102346c != null ? strArrM102346c.length : 0, new CoinInfoEntity()));
                if (strArrM102346c != null) {
                    for (String str : strArrM102346c) {
                        String str2 = f21435c;
                        C46396e c46396e = C46396e.f104049a;
                        CoinInfoEntityExt coinInfoEntityExt = (CoinInfoEntityExt) C46392a.f104043a.m102336j(new StorageId(str2, str, StorageType.Shared, true), CoinInfoEntityExt.class, null);
                        if (coinInfoEntityExt != null) {
                            arrayList2.set(coinInfoEntityExt.getIndex(), coinInfoEntityExt.getBean());
                        }
                    }
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    CoinInfoEntity coinInfoEntity = (CoinInfoEntity) obj;
                    String code = coinInfoEntity.getCode();
                    if (code != null && code.length() != 0 && (currency = coinInfoEntity.getCurrency()) != null && currency.length() != 0) {
                        arrayList.add(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static final List m23514n(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m23515o(List list) {
        ExchangeRateInfo exchangeRateInfo = f21433a;
        Intrinsics.checkNotNull(list);
        exchangeRateInfo.m23526D(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m23517q(Consumer consumer, List list) throws Exception {
        if (consumer != null) {
            consumer.accept(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m23519s(Consumer consumer, Throwable th2) {
        f21433a.m23531x(consumer);
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final List m23521u(ArrayList it) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList<CoinInfoEntity> arrayList = new ArrayList();
        for (Object obj : it) {
            if (((CoinInfoEntity) obj).getProperties().isContract()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : it) {
            if (!((CoinInfoEntity) obj2).getProperties().isContract()) {
                arrayList2.add(obj2);
            }
        }
        for (CoinInfoEntity coinInfoEntity : arrayList) {
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!Intrinsics.areEqual(coinInfoEntity.getCode(), ((CoinInfoEntity) objPrevious).getCode()));
            CoinInfoEntity coinInfoEntity2 = (CoinInfoEntity) objPrevious;
            if (coinInfoEntity2 != null) {
                coinInfoEntity2.setContractCoin(coinInfoEntity);
            }
        }
        return CollectionsKt.sortedWith(arrayList2, new C12492a());
    }

    /* JADX INFO: renamed from: y */
    public static final List m23522y() {
        return f21433a.m23530w();
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m23523z(Consumer consumer, List list) throws Exception {
        if (consumer != null) {
            consumer.accept(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC37884h m23525C() {
        return (InterfaceC37884h) f21434b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final List<CoinInfoEntity> m23527E(@NotNull String keyword, int i11) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        if (keyword.length() == 0) {
            return CollectionsKt.emptyList();
        }
        String lowerCase = keyword.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List<CoinInfoEntity> listM23530w = m23530w();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM23530w) {
            String currency = ((CoinInfoEntity) obj).getCurrency();
            if (currency != null) {
                String lowerCase2 = currency.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 != null && StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase, false, 2, (Object) null)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size() > i11 ? CollectionsKt.take(arrayList, i11) : arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Disposable m23528m(@Nullable final Consumer<List<CoinInfoEntity>> consumer) {
        if (!DataInitManager.f21486a.m23668i().mo23675c()) {
            return null;
        }
        Observable<R> observableCompose = m23525C().m85557d().compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.data.coin.info.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExchangeRateInfo.m23521u((ArrayList) obj);
            }
        };
        Observable map = observableCompose.map(new Function() { // from class: com.kubi.data.coin.info.o
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ExchangeRateInfo.m23514n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.data.coin.info.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExchangeRateInfo.m23515o((List) obj);
            }
        };
        Observable observableObserveOn = map.doOnNext(new Consumer() { // from class: com.kubi.data.coin.info.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ExchangeRateInfo.m23516p(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.data.coin.info.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExchangeRateInfo.m23517q(consumer, (List) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.data.coin.info.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ExchangeRateInfo.m23518r(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.data.coin.info.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExchangeRateInfo.m23519s(consumer, (Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer2, new Consumer() { // from class: com.kubi.data.coin.info.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ExchangeRateInfo.m23520t(function4, obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final CoinInfoEntity m23529v(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (currency.length() == 0) {
            return null;
        }
        String str = f21435c;
        if (!C46396e.m102345b(str, currency)) {
            C37901y.m85656a(BizType.CoinEntityQuery, QueryRet.FAILED);
            return null;
        }
        CoinInfoEntityExt coinInfoEntityExt = (CoinInfoEntityExt) C46392a.f104043a.m102336j(new StorageId(str, currency, StorageType.Shared, true), CoinInfoEntityExt.class, null);
        CoinInfoEntity bean = coinInfoEntityExt != null ? coinInfoEntityExt.getBean() : null;
        if (bean == null) {
            C37901y.m85656a(BizType.CoinEntityQuery, QueryRet.FAILED);
            return bean;
        }
        C37901y.m85656a(BizType.CoinEntityQuery, QueryRet.SUCCESS);
        return bean;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final Disposable m23531x(@Nullable final Consumer<List<CoinInfoEntity>> consumer) {
        if (!DataInitManager.f21486a.m23668i().mo23675c()) {
            return null;
        }
        Observable observableObserveOn = Observable.fromCallable(new Callable() { // from class: com.kubi.data.coin.info.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExchangeRateInfo.m23522y();
            }
        }).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.data.coin.info.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExchangeRateInfo.m23523z(consumer, (List) obj);
            }
        };
        return observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.data.coin.info.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ExchangeRateInfo.m23500A(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final void m23500A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static final InterfaceC37884h m23501F() {
        return (InterfaceC37884h) C42597a.m93386b().create(InterfaceC37884h.class);
    }

    /* JADX INFO: renamed from: p */
    public static final void m23516p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static final void m23518r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static final void m23520t(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final List<CoinInfoEntity> m23524B() {
        return m23530w();
    }
}
