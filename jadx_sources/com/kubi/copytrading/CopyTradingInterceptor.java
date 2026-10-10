package com.kubi.copytrading;

import com.kubi.config.exception.KCConfigException;
import com.kubi.copytrading.futures.FutureCopyTradingConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CopyTradingInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001a\u0010\u000f\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J7\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u001cR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/copytrading/CopyTradingInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "ignoreSubUidUrls", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "mapProceed", "Lokhttp3/Request;", "request", "needAppendSubUidHeader", "", "", "mathKey", "resolveFuturesRecordTracePath", "encodedPath", "traceFuturesRecordHeaderDecision", "", "originalRequest", "mappedRequest", "decision", "nativeIdentityChecked", "nativeIdentityPresent", "(Lokhttp3/Request;Lokhttp3/Request;Ljava/lang/String;ZLjava/lang/Boolean;)V", "Companion", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingInterceptor.kt\ncom/kubi/copytrading/CopyTradingInterceptor\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n44#2,2:143\n1#3:145\n295#4,2:146\n*S KotlinDebug\n*F\n+ 1 CopyTradingInterceptor.kt\ncom/kubi/copytrading/CopyTradingInterceptor\n*L\n89#1:143,2\n117#1:146,2\n*E\n"})
public final class CopyTradingInterceptor implements Interceptor {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f19719b = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<String> f19720c = SetsKt.setOf((Object[]) new String[]{"v1/copyTrading/exchange/futures/orders", "v1/copyTrading/exchange/kumex-trade/fills", "v1/copyTrading/exchange/kumex-snapshot/realised-hist", "v1/copyTrading/exchange/kumex-snapshot/realised-hist-detail"});

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ArrayList<String> f19721a = CollectionsKt.arrayListOf("/app/v1/copyTrading/leadTraders/summary", "/app/v1/copyTrading/leadHomePage/positions/current", "/app/v1/copyTrading/copyTraders/summary", "/app/v1/copyTrading/copyHomePage/traders/current", "/app/v1/copyTrading/leaderboard/query", "/app/v1/copyTrading/leadTraders/active", "/app/v1/copyTrading/copyHomePage/positions/current", "/app/v1/copyTrading/futures/contracts");

    /* JADX INFO: compiled from: CopyTradingInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/copytrading/CopyTradingInterceptor$Companion;", "", "<init>", "()V", "HEADER_SUB_UID", "", "FUTURES_RECORD_TRACE_TAG", "FUTURES_RECORD_TRACE_PATHS", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final Request m20612a(Request request) {
        if (!m20613b(this.f19721a, request.url().encodedPath())) {
            return request;
        }
        String strHeader = request.header("X-SUB-UID");
        if (strHeader != null && !StringsKt.isBlank(strHeader)) {
            m20615d(request, request, "keepExplicit", false, null);
            return request;
        }
        String strM20876k = FutureCopyTradingConfig.f19902a.m20876k();
        if (strM20876k.length() == 0) {
            m20615d(request, request, "missingIdentity", true, Boolean.FALSE);
            C43846g.m96568c(new KCConfigException(new IllegalStateException("subAccountId is empty"), "CopyTrading", false, null, 8, null), null, 2, null);
            return request;
        }
        Request requestBuild = request.newBuilder().header("X-SUB-UID", strM20876k).build();
        m20615d(request, requestBuild, "nativeFallback", true, Boolean.TRUE);
        return requestBuild;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final boolean m20613b(List<String> list, String str) {
        if (!StringsKt.contains((CharSequence) str, (CharSequence) "/app/v1/copyTrading", true)) {
            return false;
        }
        for (Object obj : list) {
            if (Intrinsics.areEqual((String) obj, str)) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final String m20614c(String str) {
        Object obj;
        Object next;
        Iterator<T> it = f19720c.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            }
            return (String) obj;
        } while (!StringsKt.endsWith$default(str, (String) next, false, 2, (Object) null));
        obj = next;
        return (String) obj;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request requestM20612a = m20612a(chain.request());
        m20614c(requestM20612a.url().encodedPath());
        return chain.proceed(requestM20612a);
    }

    /* JADX INFO: renamed from: d */
    public final void m20615d(Request request, Request request2, String str, boolean z11, Boolean bool) {
    }
}
