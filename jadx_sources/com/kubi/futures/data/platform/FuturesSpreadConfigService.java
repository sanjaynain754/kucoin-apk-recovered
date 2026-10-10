package com.kubi.futures.data.platform;

import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.Log;
import com.tencent.bugly.proguard.C33590cg;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesSpreadConfigService.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u001a\u001a\u00020\u0007*\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/data/platform/FuturesSpreadConfigService;", "", "<init>", "()V", "TAG", "", "DEFAULT_SPREAD", "Ljava/math/BigDecimal;", "getDEFAULT_SPREAD", "()Ljava/math/BigDecimal;", "MAX_CACHE_SIZE", "", "cacheLock", C33590cg.f69440j, "com/kubi/futures/data/platform/FuturesSpreadConfigService$cache$1", "Lcom/kubi/futures/data/platform/FuturesSpreadConfigService$cache$1;", "cachedSpread", "symbol", "bizType", "Lcom/kubi/broker/MultiBizType;", "fetchSpread", "cachedValue", "key", "supports", "", "cacheKey", "validatedSpread", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesSpreadConfigService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesSpreadConfigService.kt\ncom/kubi/futures/data/platform/FuturesSpreadConfigService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class FuturesSpreadConfigService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FuturesSpreadConfigService f22739a = new FuturesSpreadConfigService();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final BigDecimal f22740b = new BigDecimal("0.01");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Object f22741c = new Object();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final FuturesSpreadConfigService$cache$1 f22742d = new FuturesSpreadConfigService$cache$1();

    /* JADX INFO: renamed from: a */
    public final String m24883a(String str, MultiBizType multiBizType) {
        return multiBizType.getValue() + '-' + KuMexDepend.f30378a.m35905g().d() + '-' + str;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final BigDecimal m24884b(@NotNull String symbol, @NotNull MultiBizType bizType) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        if (!m24888f(bizType)) {
            return f22740b;
        }
        BigDecimal bigDecimalM24885c = m24885c(m24883a(symbol, bizType));
        return bigDecimalM24885c == null ? f22740b : bigDecimalM24885c;
    }

    /* JADX INFO: renamed from: c */
    public final BigDecimal m24885c(String str) {
        BigDecimal bigDecimal;
        synchronized (f22741c) {
            bigDecimal = (BigDecimal) f22742d.get((Object) str);
        }
        return bigDecimal;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final BigDecimal m24886d(@NotNull String symbol, @NotNull MultiBizType bizType) {
        Object objM103844constructorimpl;
        BigDecimal bigDecimal;
        String str;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        if (StringsKt.isBlank(symbol) || !m24888f(bizType)) {
            Log log = Log.f30813a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fetch skipped symbol=");
            sb2.append(symbol);
            sb2.append(" bizType=");
            sb2.append(bizType.getValue());
            sb2.append(" spread=");
            BigDecimal bigDecimal2 = f22740b;
            sb2.append(bigDecimal2);
            log.m36617c("SpreadConfig", sb2.toString());
            return bigDecimal2;
        }
        String strM24883a = m24883a(symbol, bizType);
        BigDecimal bigDecimalM24885c = m24885c(strM24883a);
        Log.f30813a.m36617c("SpreadConfig", "fetch start symbol=" + symbol + " bizType=" + bizType.getValue() + " cached=" + bigDecimalM24885c);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(m24889g(RepositoryServiceLocator.f19236a.m20288g().mo24977C(symbol).getSpread()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            Log.f30813a.m36616b("SpreadConfig", thM103847exceptionOrNullimpl);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        BigDecimal bigDecimal3 = (BigDecimal) objM103844constructorimpl;
        if (bigDecimal3 == null) {
            bigDecimal = bigDecimalM24885c == null ? f22740b : bigDecimalM24885c;
        } else {
            bigDecimal = bigDecimal3;
        }
        synchronized (f22741c) {
            f22742d.put(strM24883a, bigDecimal);
            Unit unit = Unit.INSTANCE;
        }
        Log log2 = Log.f30813a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("fetch complete symbol=");
        sb3.append(symbol);
        sb3.append(" bizType=");
        sb3.append(bizType.getValue());
        sb3.append(" spread=");
        sb3.append(bigDecimal);
        sb3.append(" source=");
        if (bigDecimal3 != null) {
            str = "remote";
        } else {
            str = bigDecimalM24885c != null ? C33590cg.f69440j : "default";
        }
        sb3.append(str);
        log2.m36617c("SpreadConfig", sb3.toString());
        return bigDecimal;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final BigDecimal m24887e() {
        return f22740b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m24888f(MultiBizType multiBizType) {
        return multiBizType == MultiBizType.CLASSIC || multiBizType == MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: g */
    public final BigDecimal m24889g(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            if (bigDecimal.compareTo(BigDecimal.ZERO) < 0 || bigDecimal.compareTo(BigDecimal.ONE) >= 0) {
                bigDecimal = null;
            }
            if (bigDecimal != null) {
                return bigDecimal;
            }
        }
        return f22740b;
    }
}
