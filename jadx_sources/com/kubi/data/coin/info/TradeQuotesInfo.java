package com.kubi.data.coin.info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.DataInitManager;
import com.kubi.data.coin.BizType;
import com.kubi.data.coin.QueryRet;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.storage.StorageType;
import gf.C37901y;
import gf.InterfaceC37884h;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: compiled from: TradeQuotesInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0005J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0#j\b\u0012\u0004\u0012\u00020\u001b`$0\"H\u0002J\u001e\u0010%\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0#j\b\u0012\u0004\u0012\u00020\u001b`$0\"H\u0002J\u000e\u0010&\u001a\u0004\u0018\u00010\u001b*\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m90084d2 = {"Lcom/kubi/data/coin/info/TradeQuotesInfo;", "", "<init>", "()V", "TAG", "", "tradeApi", "Lcom/kubi/data/coin/CoinApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/data/coin/CoinApi;", "tradeApi$delegate", "Lkotlin/Lazy;", "TRADE_PAIR_LIST_KEY", "getTRADE_PAIR_LIST_KEY", "()Ljava/lang/String;", "TRADE_PAIR_LIST_KEY$delegate", "hasCache", "", "getHasCache", "()Z", "hasCache$delegate", "getTradeBeanList", "Lio/reactivex/disposables/Disposable;", "resultCallBack", "Lio/reactivex/functions/Consumer;", "", "Lcom/kubi/data/entity/TradeItemBean;", "latest", "getTradeItem", "item", "getTradeItemAwait", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNetList", "Lio/reactivex/Observable;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLocalList", "getFromKV", "TradeItemBeanExt", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeQuotesInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeQuotesInfo.kt\ncom/kubi/data/coin/info/TradeQuotesInfo\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 3 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,152:1\n281#2,4:153\n241#2,2:162\n281#2,4:166\n139#3:157\n17#3:158\n139#3:170\n17#3:171\n178#4:159\n178#4:172\n1878#5,2:160\n1880#5:164\n13472#6:165\n13473#6:173\n*S KotlinDebug\n*F\n+ 1 TradeQuotesInfo.kt\ncom/kubi/data/coin/info/TradeQuotesInfo\n*L\n147#1:153,4\n122#1:162,2\n137#1:166,4\n147#1:157\n147#1:158\n137#1:170\n137#1:171\n147#1:159\n137#1:172\n121#1:160,2\n121#1:164\n136#1:165\n136#1:173\n*E\n"})
public final class TradeQuotesInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeQuotesInfo f21436a = new TradeQuotesInfo();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f21437b = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeQuotesInfo.m23539G();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f21438c = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.r0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeQuotesInfo.m23552m();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f21439d = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.s0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeQuotesInfo.m23538F());
        }
    });

    /* JADX INFO: compiled from: TradeQuotesInfo.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/data/coin/info/TradeQuotesInfo$TradeItemBeanExt;", "Landroid/os/Parcelable;", "index", "", "bean", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(ILcom/kubi/data/entity/TradeItemBean;)V", "getIndex", "()I", "getBean", "()Lcom/kubi/data/entity/TradeItemBean;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TradeItemBeanExt implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TradeItemBeanExt> CREATOR = new C12493a();

        @NotNull
        private final TradeItemBean bean;
        private final int index;

        /* JADX INFO: renamed from: com.kubi.data.coin.info.TradeQuotesInfo$TradeItemBeanExt$a */
        /* JADX INFO: compiled from: TradeQuotesInfo.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C12493a implements Parcelable.Creator<TradeItemBeanExt> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TradeItemBeanExt createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradeItemBeanExt(parcel.readInt(), (TradeItemBean) parcel.readParcelable(TradeItemBeanExt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TradeItemBeanExt[] newArray(int i11) {
                return new TradeItemBeanExt[i11];
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
            if (!(other instanceof TradeItemBeanExt)) {
                return false;
            }
            TradeItemBeanExt tradeItemBeanExt = (TradeItemBeanExt) other;
            return this.index == tradeItemBeanExt.index && Intrinsics.areEqual(this.bean, tradeItemBeanExt.bean);
        }

        public TradeItemBeanExt(int i11, @NotNull TradeItemBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            this.index = i11;
            this.bean = bean;
        }

        public static /* synthetic */ TradeItemBeanExt copy$default(TradeItemBeanExt tradeItemBeanExt, int i11, TradeItemBean tradeItemBean, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = tradeItemBeanExt.index;
            }
            if ((i12 & 2) != 0) {
                tradeItemBean = tradeItemBeanExt.bean;
            }
            return tradeItemBeanExt.copy(i11, tradeItemBean);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TradeItemBean getBean() {
            return this.bean;
        }

        @NotNull
        public final TradeItemBeanExt copy(int index, @NotNull TradeItemBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            return new TradeItemBeanExt(index, bean);
        }

        @NotNull
        public final TradeItemBean getBean() {
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
            return "TradeItemBeanExt(index=" + this.index + ", bean=" + this.bean + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.index);
            dest.writeParcelable(this.bean, flags);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final ArrayList m23553q() {
        ArrayList arrayList;
        TradeQuotesInfo tradeQuotesInfo = f21436a;
        synchronized (tradeQuotesInfo.m23564w()) {
            try {
                String[] strArrM102321c = C46392a.m102321c(tradeQuotesInfo.m23564w());
                arrayList = new ArrayList(Collections.nCopies(strArrM102321c != null ? strArrM102321c.length : 0, new TradeItemBean()));
                if (strArrM102321c != null) {
                    for (String str : strArrM102321c) {
                        String strM23564w = f21436a.m23564w();
                        C46396e c46396e = C46396e.f104049a;
                        TradeItemBeanExt tradeItemBeanExt = (TradeItemBeanExt) C46392a.f104043a.m102336j(new StorageId(strM23564w, str, StorageType.Shared, true), TradeItemBeanExt.class, null);
                        if (tradeItemBeanExt != null) {
                            arrayList.set(tradeItemBeanExt.getIndex(), tradeItemBeanExt.getBean());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m23534A(Consumer consumer, ArrayList arrayList) throws Exception {
        if (consumer != null) {
            consumer.accept(arrayList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m23536C(Throwable th2) {
        C44128b.m97263g("TradeQuotesInfo", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m23538F() {
        String[] strArrM102321c = C46392a.m102321c(f21436a.m23564w());
        return !(strArrM102321c == null || strArrM102321c.length == 0);
    }

    /* JADX INFO: renamed from: m */
    public static final String m23552m() {
        return SiteUtils.m58088c(SiteUtils.f47907a, "trade_pair_list", null, null, 6, null);
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m23554r(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.isEmpty();
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m23555s(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m23556u(ArrayList arrayList) {
        TradeQuotesInfo tradeQuotesInfo = f21436a;
        synchronized (tradeQuotesInfo.m23564w()) {
            try {
                C46392a.m102319a(tradeQuotesInfo.m23564w());
                Intrinsics.checkNotNull(arrayList);
                int i11 = 0;
                for (Object obj : arrayList) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    TradeItemBean tradeItemBean = (TradeItemBean) obj;
                    Intrinsics.checkNotNull(tradeItemBean);
                    TradeItemBeanExt tradeItemBeanExt = new TradeItemBeanExt(i11, tradeItemBean);
                    String strM23564w = f21436a.m23564w();
                    String innerSymbol = tradeItemBean.getInnerSymbol();
                    Intrinsics.checkNotNullExpressionValue(innerSymbol, "getInnerSymbol(...)");
                    C46396e.m102357n(strM23564w, innerSymbol, tradeItemBeanExt);
                    i11 = i12;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Disposable m23558z(TradeQuotesInfo tradeQuotesInfo, Consumer consumer, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            consumer = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return tradeQuotesInfo.m23566y(consumer, z11);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00a4, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: E */
    public final TradeItemBean m23559E(@NotNull String item) {
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.length() == 0) {
            return null;
        }
        if (!m23561o()) {
            m23558z(this, null, false, 3, null);
        }
        if (C46396e.m102345b(m23564w(), item)) {
            TradeItemBean tradeItemBeanM23560n = m23560n(item);
            if (tradeItemBeanM23560n != null) {
                C37901y.m85656a(BizType.TradeItemQuery, QueryRet.SUCCESS);
                return tradeItemBeanM23560n;
            }
        } else {
            SymbolInfoEntity symbolInfoEntityM23635y = SymbolsInfo.f21457a.m23635y(item);
            if (symbolInfoEntityM23635y == null) {
                C43840a.m96550d("no symbol info:" + item, "TradeQuotesInfo");
            } else {
                String code = !Intrinsics.areEqual(symbolInfoEntityM23635y.getCode(), item) ? symbolInfoEntityM23635y.getCode() : symbolInfoEntityM23635y.getSymbol();
                if (Intrinsics.areEqual(code, item)) {
                    C43840a.m96550d("no diff alias:" + item, "TradeQuotesInfo");
                    unit = Unit.INSTANCE;
                } else {
                    TradeQuotesInfo tradeQuotesInfo = f21436a;
                    String strM23564w = tradeQuotesInfo.m23564w();
                    Intrinsics.checkNotNull(code);
                    if (C46396e.m102345b(strM23564w, code)) {
                        String code2 = symbolInfoEntityM23635y.getCode();
                        Intrinsics.checkNotNullExpressionValue(code2, "getCode(...)");
                        TradeItemBean tradeItemBeanM23560n2 = tradeQuotesInfo.m23560n(code2);
                        if (tradeItemBeanM23560n2 != null) {
                            C37901y.m85656a(BizType.TradeItemQuery, QueryRet.SUCCESS);
                            return tradeItemBeanM23560n2;
                        }
                        unit = null;
                    } else {
                        C43840a.m96550d("no trade item:" + item + '|' + code, "TradeQuotesInfo");
                        unit = Unit.INSTANCE;
                    }
                }
                if (unit == null) {
                    C43840a.m96550d("no symbol info:" + item, "TradeQuotesInfo");
                }
            }
        }
        C37901y.m85656a(BizType.TradeItemQuery, QueryRet.FAILED);
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m23561o() {
        return ((Boolean) f21439d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    public final Observable<ArrayList<TradeItemBean>> m23562p() {
        Observable observableFromCallable = Observable.fromCallable(new Callable() { // from class: com.kubi.data.coin.info.z0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TradeQuotesInfo.m23553q();
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.data.coin.info.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeQuotesInfo.m23554r((ArrayList) obj));
            }
        };
        Observable<ArrayList<TradeItemBean>> observableSubscribeOn = observableFromCallable.filter(new Predicate() { // from class: com.kubi.data.coin.info.q0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeQuotesInfo.m23555s(function1, obj);
            }
        }).subscribeOn(Schedulers.m87969io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* JADX INFO: renamed from: w */
    public final String m23564w() {
        return (String) f21438c.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC37884h m23565x() {
        return (InterfaceC37884h) f21437b.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public final Disposable m23566y(@Nullable final Consumer<List<TradeItemBean>> consumer, boolean z11) {
        Maybe<ArrayList<TradeItemBean>> maybeObserveOn = (z11 ? m23563t().onErrorResumeNext(m23562p()) : Observable.merge(m23562p(), m23563t())).firstElement().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.data.coin.info.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeQuotesInfo.m23534A(consumer, (ArrayList) obj);
            }
        };
        Consumer<? super ArrayList<TradeItemBean>> consumer2 = new Consumer() { // from class: com.kubi.data.coin.info.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeQuotesInfo.m23535B(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.data.coin.info.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeQuotesInfo.m23536C((Throwable) obj);
            }
        };
        return maybeObserveOn.subscribe(consumer2, new Consumer() { // from class: com.kubi.data.coin.info.w0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeQuotesInfo.m23537D(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final void m23535B(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static final void m23537D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static final InterfaceC37884h m23539G() {
        return (InterfaceC37884h) C42597a.m93386b().create(InterfaceC37884h.class);
    }

    /* JADX INFO: renamed from: v */
    public static final void m23557v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public final TradeItemBean m23560n(String str) {
        String strM23564w = m23564w();
        C46396e c46396e = C46396e.f104049a;
        TradeItemBeanExt tradeItemBeanExt = (TradeItemBeanExt) C46392a.f104043a.m102336j(new StorageId(strM23564w, str, StorageType.Shared, true), TradeItemBeanExt.class, null);
        if (tradeItemBeanExt == null) {
            return null;
        }
        return tradeItemBeanExt.getBean();
    }

    /* JADX INFO: renamed from: t */
    public final Observable<ArrayList<TradeItemBean>> m23563t() {
        Observable<R> observableCompose = m23565x().getMarketSymbol(TtmlNode.COMBINE_ALL, "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_getAll").compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.data.coin.info.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeQuotesInfo.m23556u((ArrayList) obj);
            }
        };
        Observable<ArrayList<TradeItemBean>> observableDoOnNext = observableCompose.doOnNext(new Consumer() { // from class: com.kubi.data.coin.info.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeQuotesInfo.m23557v(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }
}
