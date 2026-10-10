package com.kubi.data.coin.info;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.coin.BizType;
import com.kubi.data.coin.QueryRet;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27101y;
import com.kubi.utils.storage.StorageType;
import com.tencent.bugly.proguard.C33786m2;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37901y;
import gf.InterfaceC37884h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.data.coin.info.n0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SymbolsInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0018J2\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J/\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0$2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020 0\u001cJ\u0016\u0010)\u001a\u00020\u00182\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010$J\u001f\u0010)\u001a\u00020\u0018\"\b\b\u0000\u0010+*\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u0001H+¢\u0006\u0002\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0010\u0010/\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u001eH\u0002J\u0016\u00100\u001a\u00020\u00162\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0012\u0010\u000f¨\u00062"}, m90084d2 = {"Lcom/kubi/data/coin/info/SymbolsInfo;", "", "<init>", "()V", "TAG", "", "tradeApi", "Lcom/kubi/data/coin/CoinApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/data/coin/CoinApi;", "tradeApi$delegate", "Lkotlin/Lazy;", "SYMBOLS_INFO_KEY", "getSYMBOLS_INFO_KEY", "()Ljava/lang/String;", "SYMBOLS_INFO_KEY$delegate", "SYMBOLS_INFO_ALIA", "getSYMBOLS_INFO_ALIA", "SYMBOLS_INFO_ALIA$delegate", "getSymbolsInfoCurrentTimeLine", "Lcom/kubi/utils/storage/StorageId;", "", "initDefaultSymbolsList", "", "fetchSymbolInfoList", "Lio/reactivex/disposables/Disposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "ignoreState", "", "getSymbolEntityByCode", "code", "filterSymbolPairs", "", "condition", "Lkotlin/ParameterName;", "name", "item", "updateSymbolEntity", "list", ExifInterface.GPS_DIRECTION_TRUE, TUIConstants.TIMPush.NOTIFICATION.ENTITY, "(Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getEntity", "saveEntity", "batchSave", "it", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolsInfo.kt\ncom/kubi/data/coin/info/SymbolsInfo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 5 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 6 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,183:1\n15#2:184\n84#2:185\n84#2:231\n75#2,2:240\n13472#3:186\n13473#3:194\n13472#3:195\n13473#3:203\n281#4,4:187\n281#4,4:196\n281#4,4:213\n281#4,4:220\n241#4,2:227\n241#4,2:229\n139#5:191\n17#5:192\n139#5:200\n17#5:201\n139#5:217\n17#5:218\n139#5:224\n17#5:225\n178#6:193\n178#6:202\n178#6:219\n178#6:226\n1669#7,8:204\n1869#7,2:232\n2756#7:238\n1#8:212\n1#8:239\n160#9,4:234\n*S KotlinDebug\n*F\n+ 1 SymbolsInfo.kt\ncom/kubi/data/coin/info/SymbolsInfo\n*L\n77#1:184\n79#1:185\n159#1:231\n83#1:240,2\n107#1:186\n107#1:194\n115#1:195\n115#1:203\n108#1:187,4\n116#1:196,4\n141#1:213,4\n143#1:220,4\n150#1:227,2\n152#1:229,2\n108#1:191\n108#1:192\n116#1:200\n116#1:201\n141#1:217\n141#1:218\n143#1:224\n143#1:225\n108#1:193\n116#1:202\n141#1:219\n143#1:226\n123#1:204,8\n160#1:232,2\n64#1:238\n64#1:239\n62#1:234,4\n*E\n"})
public final class SymbolsInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SymbolsInfo f21457a = new SymbolsInfo();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f21458b = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SymbolsInfo.m23605E();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f21459c = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SymbolsInfo.m23617l();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f21460d = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SymbolsInfo.m23616k();
        }
    });

    /* JADX INFO: renamed from: com.kubi.data.coin.info.n0$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<List<? extends SymbolInfoEntity>> {
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m23604C() throws Throwable {
        Object objM66914d;
        String strM66926b = C27101y.m66926b(BaseApplication.INSTANCE.get(), SiteUtils.m58088c(SiteUtils.f47907a, "symbols", JPushConstants.Analysis.KEY_JSON, null, 4, null));
        Intrinsics.checkNotNullExpressionValue(strM66926b, "getJsonAsBlock(...)");
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66926b, new a().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        List list = (List) objM66914d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f21457a.m23626D((SymbolInfoEntity) it.next());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final String m23616k() {
        return SiteUtils.m58088c(SiteUtils.f47907a, "symbols_info_alia", null, null, 6, null);
    }

    /* JADX INFO: renamed from: l */
    public static final String m23617l() {
        return SiteUtils.m58088c(SiteUtils.f47907a, "symbols_info_new_key", null, null, 6, null);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m23619p(ArrayList arrayList) {
        SymbolsInfo symbolsInfo = f21457a;
        StorageId<Long> storageIdM23636z = symbolsInfo.m23636z();
        Intrinsics.checkNotNull(arrayList);
        C46392a.m102330m(storageIdM23636z, symbolsInfo.m23629m(arrayList));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m23621r(Function1 function1, ArrayList arrayList) {
        if (function1 != null) {
            function1.invoke(arrayList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m23623t(Function1 function1, Throwable th2) {
        if (function1 != null) {
            function1.invoke(null);
        }
        C44128b.m97263g("fetchSymbolInfoList", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC37884h m23624A() {
        return (InterfaceC37884h) f21458b.getValue();
    }

    /* JADX INFO: renamed from: F */
    public final <T extends SymbolInfoEntity> void m23627F(@Nullable T t11) {
        if (t11 != null) {
            f21457a.m23626D(t11);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m23628G(@Nullable List<? extends SymbolInfoEntity> list) {
        if (list != null) {
            f21457a.m23629m(list);
        }
    }

    @SuppressLint({"CheckResult"})
    @Nullable
    /* JADX INFO: renamed from: n */
    public final Disposable m23630n(@Nullable final Function1<? super ArrayList<SymbolInfoEntity>, Unit> function1, boolean z11) {
        if (C45590s.f102687a.m100679d0()) {
            C46392a.m102335r(m23636z());
        }
        Observable<R> observableCompose = m23624A().m85560g(Long.valueOf(C46392a.m102324f(m23636z(), 0L)), Boolean.TRUE, z11).compose(C24217a1.m58390n());
        final Function1 function2 = new Function1() { // from class: com.kubi.data.coin.info.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolsInfo.m23619p((ArrayList) obj);
            }
        };
        Observable observableObserveOn = observableCompose.doOnNext(new Consumer() { // from class: com.kubi.data.coin.info.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolsInfo.m23620q(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.data.coin.info.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolsInfo.m23621r(function1, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.data.coin.info.k0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolsInfo.m23622s(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.data.coin.info.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolsInfo.m23623t(function1, (Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.data.coin.info.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolsInfo.m23618o(function4, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final List<SymbolInfoEntity> m23631u(@NotNull Function1<? super SymbolInfoEntity, Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        ArrayList arrayList = new ArrayList();
        String[] strArrM102321c = C46392a.m102321c(m23633w());
        if (strArrM102321c != null) {
            for (String str : strArrM102321c) {
                String strM23633w = f21457a.m23633w();
                C46396e c46396e = C46396e.f104049a;
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) C46392a.f104043a.m102336j(new StorageId(strM23633w, str, StorageType.Shared, true), SymbolInfoEntity.class, null);
                if (symbolInfoEntity != null && condition.invoke(symbolInfoEntity).booleanValue()) {
                    arrayList.add(symbolInfoEntity);
                }
            }
        }
        String[] strArrM102321c2 = C46392a.m102321c(m23634x());
        if (strArrM102321c2 != null) {
            for (String str2 : strArrM102321c2) {
                String strM23634x = f21457a.m23634x();
                C46396e c46396e2 = C46396e.f104049a;
                SymbolInfoEntity symbolInfoEntity2 = (SymbolInfoEntity) C46392a.f104043a.m102336j(new StorageId(strM23634x, str2, StorageType.Shared, true), SymbolInfoEntity.class, null);
                if (symbolInfoEntity2 != null && condition.invoke(symbolInfoEntity2).booleanValue()) {
                    arrayList.add(symbolInfoEntity2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((SymbolInfoEntity) obj).getCode())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public final String m23633w() {
        return (String) f21460d.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final String m23634x() {
        return (String) f21459c.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public final SymbolInfoEntity m23635y(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        SymbolInfoEntity symbolInfoEntityM23632v = m23632v(str);
        if (symbolInfoEntityM23632v == null) {
            C37901y.m85656a(BizType.SymbolEntityQuery, QueryRet.FAILED);
            return symbolInfoEntityM23632v;
        }
        C37901y.m85656a(BizType.SymbolEntityQuery, QueryRet.SUCCESS);
        return symbolInfoEntityM23632v;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final StorageId<Long> m23636z() {
        return new StorageId<>(C33786m2.f70892t, "symbols_info_time_line", null, false, 12, null);
    }

    /* JADX INFO: renamed from: E */
    public static final InterfaceC37884h m23605E() {
        return (InterfaceC37884h) C42597a.m93386b().create(InterfaceC37884h.class);
    }

    /* JADX INFO: renamed from: o */
    public static final void m23618o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final void m23620q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final void m23622s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public final void m23625B() {
        String[] strArrM102321c = C46392a.m102321c(m23634x());
        if (strArrM102321c != null && strArrM102321c.length != 0) {
            return;
        }
        C27100x0.m66924e(new Function0() { // from class: com.kubi.data.coin.info.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SymbolsInfo.m23604C();
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m23626D(SymbolInfoEntity symbolInfoEntity) {
        if (symbolInfoEntity.getCode() != null) {
            String strM23634x = m23634x();
            String code = symbolInfoEntity.getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            C46396e.m102357n(strM23634x, code, symbolInfoEntity);
            if (!Intrinsics.areEqual(symbolInfoEntity.getSymbol(), symbolInfoEntity.getCode())) {
                String strM23633w = m23633w();
                String symbol = symbolInfoEntity.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                C46396e.m102357n(strM23633w, symbol, symbolInfoEntity);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final long m23629m(List<? extends SymbolInfoEntity> list) {
        long jM102324f = C46392a.m102324f(m23636z(), 0L);
        for (SymbolInfoEntity symbolInfoEntity : list) {
            if (symbolInfoEntity.isEnabled()) {
                SymbolsInfo symbolsInfo = f21457a;
                String strM23634x = symbolsInfo.m23634x();
                String code = symbolInfoEntity.getCode();
                Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
                if (C46396e.m102345b(strM23634x, code)) {
                    C44128b.m97259c("SymbolsInfo", "update coin:" + symbolInfoEntity.getCode());
                } else {
                    C44128b.m97259c("SymbolsInfo", "add coin:" + symbolInfoEntity.getCode());
                }
                symbolsInfo.m23626D(symbolInfoEntity);
            } else {
                C44128b.m97259c("SymbolsInfo", "remove coin:" + symbolInfoEntity.getCode());
                SymbolsInfo symbolsInfo2 = f21457a;
                String strM23634x2 = symbolsInfo2.m23634x();
                String code2 = symbolInfoEntity.getCode();
                Intrinsics.checkNotNullExpressionValue(code2, "getCode(...)");
                C46396e.m102360q(strM23634x2, code2);
                String strM23633w = symbolsInfo2.m23633w();
                String symbol = symbolInfoEntity.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                C46396e.m102360q(strM23633w, symbol);
            }
            if (symbolInfoEntity.getUnionUpdatedAt().longValue() > jM102324f) {
                Long unionUpdatedAt = symbolInfoEntity.getUnionUpdatedAt();
                Intrinsics.checkNotNullExpressionValue(unionUpdatedAt, "getUnionUpdatedAt(...)");
                jM102324f = unionUpdatedAt.longValue();
            }
        }
        return jM102324f;
    }

    /* JADX INFO: renamed from: v */
    public final SymbolInfoEntity m23632v(String str) {
        if (C46396e.m102345b(m23633w(), str)) {
            return (SymbolInfoEntity) C46392a.f104043a.m102336j(new StorageId(m23633w(), str, StorageType.Shared, true), SymbolInfoEntity.class, null);
        }
        return (SymbolInfoEntity) C46392a.f104043a.m102336j(new StorageId(m23634x(), str, StorageType.Shared, true), SymbolInfoEntity.class, null);
    }
}
