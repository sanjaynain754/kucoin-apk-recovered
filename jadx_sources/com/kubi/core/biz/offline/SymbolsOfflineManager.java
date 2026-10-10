package com.kubi.core.biz.offline;

import com.kubi.utils.C27099x;
import id.C38519a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vc.InterfaceC45491a;
import y70.C46392a;

/* JADX INFO: compiled from: SymbolsOfflineManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0006J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0082@¢\u0006\u0002\u0010\fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/offline/SymbolsOfflineManager;", "", "<init>", "()V", "offlineSymbolCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/kubi/core/biz/offline/SymbolOfflineData;", "getOfflineSymbols", "symbol", "fetchOfflineSymbols", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInOfflineEffect", "", "getSymbolOfflineDataFromLocal", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolsOfflineManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolsOfflineManager.kt\ncom/kubi/core/biz/offline/SymbolsOfflineManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,76:1\n1#2:77\n23#3,2:78\n32#3:82\n1869#4,2:80\n196#5,3:83\n*S KotlinDebug\n*F\n+ 1 SymbolsOfflineManager.kt\ncom/kubi/core/biz/offline/SymbolsOfflineManager\n*L\n39#1:78,2\n72#1:82\n44#1:80,2\n71#1:83,3\n*E\n"})
public final class SymbolsOfflineManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SymbolsOfflineManager f20563a = new SymbolsOfflineManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<String, SymbolOfflineData> f20564b = new ConcurrentHashMap<>();

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m22080b(@NotNull Continuation<? super Unit> continuation) {
        SymbolsOfflineManager$fetchOfflineSymbols$1 symbolsOfflineManager$fetchOfflineSymbols$1;
        Object objM103844constructorimpl;
        Object obj;
        String symbol;
        if (continuation instanceof SymbolsOfflineManager$fetchOfflineSymbols$1) {
            symbolsOfflineManager$fetchOfflineSymbols$1 = (SymbolsOfflineManager$fetchOfflineSymbols$1) continuation;
            int i11 = symbolsOfflineManager$fetchOfflineSymbols$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                symbolsOfflineManager$fetchOfflineSymbols$1.label = i11 - Integer.MIN_VALUE;
            } else {
                symbolsOfflineManager$fetchOfflineSymbols$1 = new SymbolsOfflineManager$fetchOfflineSymbols$1(this, continuation);
            }
        } else {
            symbolsOfflineManager$fetchOfflineSymbols$1 = new SymbolsOfflineManager$fetchOfflineSymbols$1(this, continuation);
        }
        Object objM100452b = symbolsOfflineManager$fetchOfflineSymbols$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = symbolsOfflineManager$fetchOfflineSymbols$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM100452b);
                Result.Companion companion = Result.INSTANCE;
                InterfaceC45491a interfaceC45491a = (InterfaceC45491a) C42597a.m93388d().create(InterfaceC45491a.class);
                symbolsOfflineManager$fetchOfflineSymbols$1.L$0 = SpillingKt.nullOutSpilledVariable(this);
                symbolsOfflineManager$fetchOfflineSymbols$1.I$0 = 0;
                symbolsOfflineManager$fetchOfflineSymbols$1.label = 1;
                objM100452b = InterfaceC45491a.m100452b(interfaceC45491a, null, symbolsOfflineManager$fetchOfflineSymbols$1, 1, null);
                if (objM100452b == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                ResultKt.throwOnFailure(objM100452b);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = symbolsOfflineManager$fetchOfflineSymbols$1.L$0;
                ResultKt.throwOnFailure(objM100452b);
            }
            if (!Result.m103850isFailureimpl(obj)) {
                objM100452b = obj;
            }
            f20564b.clear();
            for (SymbolOfflineData symbolOfflineData : (List) objM100452b) {
                symbol = symbolOfflineData.getSymbol();
                if (symbol != null) {
                    f20564b.put(symbol, symbolOfflineData);
                }
            }
            return Unit.INSTANCE;
            C46392a.m102333p(C38519a.f86479a.m87139n(), C27099x.m66919i((List) objM100452b, false, 2, null));
            objM103844constructorimpl = Result.m103844constructorimpl((List) objM100452b);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        symbolsOfflineManager$fetchOfflineSymbols$1.L$0 = objM103844constructorimpl;
        symbolsOfflineManager$fetchOfflineSymbols$1.label = 2;
        Object objM22082d = m22082d(symbolsOfflineManager$fetchOfflineSymbols$1);
        if (objM22082d != coroutine_suspended) {
            obj = objM103844constructorimpl;
            objM100452b = objM22082d;
            if (!Result.m103850isFailureimpl(obj)) {
                objM100452b = obj;
            }
            f20564b.clear();
            while (r9.hasNext()) {
                symbol = symbolOfflineData.getSymbol();
                if (symbol != null) {
                    f20564b.put(symbol, symbolOfflineData);
                }
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final SymbolOfflineData m22081c(@Nullable String str) {
        return f20564b.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m22082d(Continuation<? super List<SymbolOfflineData>> continuation) {
        SymbolsOfflineManager$getSymbolOfflineDataFromLocal$1 symbolsOfflineManager$getSymbolOfflineDataFromLocal$1;
        Object objM103844constructorimpl;
        if (continuation instanceof SymbolsOfflineManager$getSymbolOfflineDataFromLocal$1) {
            symbolsOfflineManager$getSymbolOfflineDataFromLocal$1 = (SymbolsOfflineManager$getSymbolOfflineDataFromLocal$1) continuation;
            int i11 = symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.label = i11 - Integer.MIN_VALUE;
            } else {
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1 = new SymbolsOfflineManager$getSymbolOfflineDataFromLocal$1(this, continuation);
            }
        } else {
            symbolsOfflineManager$getSymbolOfflineDataFromLocal$1 = new SymbolsOfflineManager$getSymbolOfflineDataFromLocal$1(this, continuation);
        }
        Object objM90914f0 = symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90914f0);
                Result.Companion companion = Result.INSTANCE;
                C27099x c27099x = C27099x.f54458a;
                String strM102326h = C46392a.m102326h(C38519a.f86479a.m87139n(), "");
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C12013x3c522bbe(strM102326h, null)), C42911a.m94120b());
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.L$0 = SpillingKt.nullOutSpilledVariable(this);
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.L$2 = SpillingKt.nullOutSpilledVariable(strM102326h);
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.L$3 = SpillingKt.nullOutSpilledVariable(symbolsOfflineManager$getSymbolOfflineDataFromLocal$1);
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.I$0 = 0;
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.I$1 = 0;
                symbolsOfflineManager$getSymbolOfflineDataFromLocal$1.label = 1;
                objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, symbolsOfflineManager$getSymbolOfflineDataFromLocal$1);
                if (objM90914f0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90914f0);
            }
            List listEmptyList = (List) objM90914f0;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(listEmptyList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Result.m103850isFailureimpl(objM103844constructorimpl) ? CollectionsKt.emptyList() : objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m22083e(@NotNull String symbol) {
        Long showStartTime;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        SymbolOfflineData symbolOfflineData = f20564b.get(symbol);
        if (symbolOfflineData != null && (showStartTime = symbolOfflineData.getShowStartTime()) != null) {
            long jLongValue = showStartTime.longValue();
            Long showEndTime = symbolOfflineData.getShowEndTime();
            if (showEndTime != null) {
                long jLongValue2 = showEndTime.longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jLongValue <= jCurrentTimeMillis && jCurrentTimeMillis <= jLongValue2) {
                    return true;
                }
            }
        }
        return false;
    }
}
