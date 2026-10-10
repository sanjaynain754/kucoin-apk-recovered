package com.kubi.flutter.widget.kline;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p499og.C43043a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: KLineDataSession.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002+,B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010#J \u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0086@¢\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineDataSession;", "", "dataParam", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", TtmlNode.RUBY_CONTAINER, "Lcom/kubi/flutter/widget/kline/IKLineContainer;", "<init>", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;Lcom/kubi/flutter/widget/kline/IKLineContainer;)V", "dataSessionScope", "Lkotlinx/coroutines/CoroutineScope;", AppsFlyerProperties.CHANNEL, "Lcom/kubi/flutter/widget/kline/IKLineChannel;", "loadLock", "Lkotlinx/coroutines/sync/Mutex;", "historyOrderLoadLock", "activeOrderLoadLock", "savedPreviousTime", "Ljava/util/concurrent/atomic/AtomicLong;", "savedOrderPreviousTime", "isLoadingRefresh", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoadingSplit", "loadCdnData", "Lcom/kubi/flutter/proto/kline/Response;", "firstTime", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindDataPushFlow", "", "refresh", "", "from", "", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadHistoryOrderData", "orderParam", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadActiveOrderData", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "Companion", "Factory", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineDataSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n+ 4 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,322:1\n47#2,4:323\n9#3:327\n45#4,4:328\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession\n*L\n83#1:323,4\n149#1:327\n319#1:328,4\n*E\n"})
public final class KLineDataSession {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f22358m = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IKLineDataInteractor.DataParam f22359a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final IKLineDataInteractor f22360b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final IKLineContainer f22361c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41709m0 f22362d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final IKLineChannel f22363e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC44082a f22364f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC44082a f22365g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC44082a f22366h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AtomicLong f22367i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AtomicLong f22368j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final AtomicBoolean f22369k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final AtomicBoolean f22370l;

    /* JADX INFO: compiled from: KLineDataSession.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineDataSession$Companion;", "", "<init>", "()V", "TAG", "", "DATA_SCOPE_NAME", "PRELOAD_LIMIT_NUM", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineDataSession$a */
    /* JADX INFO: compiled from: KLineDataSession.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineDataSession$Factory;", "", TtmlNode.RUBY_CONTAINER, "Lcom/kubi/flutter/widget/kline/IKLineContainer;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "<init>", "(Lcom/kubi/flutter/widget/kline/IKLineContainer;Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;)V", "createSession", "Lcom/kubi/flutter/widget/kline/KLineDataSession;", "dataParam", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12753a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final IKLineContainer f22371a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final IKLineDataInteractor f22372b;

        public C12753a(@NotNull IKLineContainer container, @NotNull IKLineDataInteractor interactor) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(interactor, "interactor");
            this.f22371a = container;
            this.f22372b = interactor;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final KLineDataSession m24172a(@NotNull IKLineDataInteractor.DataParam dataParam) {
            Intrinsics.checkNotNullParameter(dataParam, "dataParam");
            return new KLineDataSession(dataParam, this.f22372b, this.f22371a, null);
        }
    }

    public /* synthetic */ KLineDataSession(IKLineDataInteractor.DataParam dataParam, IKLineDataInteractor iKLineDataInteractor, IKLineContainer iKLineContainer, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataParam, iKLineDataInteractor, iKLineContainer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineDataSession$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession\n+ 3 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,49:1\n85#2,2:50\n84#2:52\n88#2:57\n45#3,4:53\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession\n*L\n84#1:53,4\n*E\n"})
    public static final class C12754b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C12754b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C43043a.m94532c(exception, "DataSession unhatched");
            }
        }
    }

    public KLineDataSession(IKLineDataInteractor.DataParam dataParam, IKLineDataInteractor iKLineDataInteractor, IKLineContainer iKLineContainer) {
        this.f22359a = dataParam;
        this.f22360b = iKLineDataInteractor;
        this.f22361c = iKLineContainer;
        this.f22362d = C41713n0.m91125a(new CoroutineName("kline_data_session_scope").plus(C42911a.m94120b()).plus(new C12754b(CoroutineExceptionHandler.INSTANCE)));
        this.f22363e = iKLineContainer.getChannel();
        this.f22364f = C44087f.m97144b(false, 1, null);
        this.f22365g = C44087f.m97144b(false, 1, null);
        this.f22366h = C44087f.m97144b(false, 1, null);
        this.f22367i = new AtomicLong(0L);
        this.f22368j = new AtomicLong(0L);
        this.f22369k = new AtomicBoolean(true);
        this.f22370l = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m24166q(KLineDataSession kLineDataSession, IKLineDataInteractor.OrderParam orderParam, long j11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = -1;
        }
        return kLineDataSession.m24171p(orderParam, j11, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m24167l(boolean z11, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        C44128b.m97266j("KLineDataSession", "dataSession open " + this.f22359a.getSymbol() + '[' + this.f22359a.getType().getType() + "] from=" + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f22361c.mo24147d(z11 ? KLineLoadingState.Refresh : KLineLoadingState.Loading);
        long j11 = jCurrentTimeMillis / ((long) 1000);
        AtomicReference atomicReference = new AtomicReference(null);
        long jM24366a = C12802p.m24366a(this.f22359a.getType(), j11);
        KLineRealTimeLog.f22494a.m24393a("bindDataPushFlow,symbol=" + this.f22359a.getSymbol() + ",type=" + this.f22359a.getType().getType() + ",from=" + str + ",cdnCandleCount=" + jM24366a);
        if (jM24366a < 100) {
            atomicReference.set(C41696j.m91102b(this.f22362d, null, null, new KLineDataSession$bindDataPushFlow$deferred$1(this, j11, null), 3, null));
            this.f22370l.set(true);
        }
        C41636g.m90891O(C41636g.m90917h(C41636g.m90896T(this.f22360b.mo24271b(this.f22359a), new KLineDataSession$bindDataPushFlow$2(atomicReference, this, jCurrentTimeMillis, str, null)), new KLineDataSession$bindDataPushFlow$3(this, str, null)), this.f22362d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final void m24168m() {
        try {
            C44128b.m97266j("KLineDataSession", "dataSession close");
            C41713n0.m91129e(this.f22362d, null, 1, null);
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                return;
            }
            C43043a.m94532c(e11, "close dataSession error");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m24169n(@NotNull IKLineDataInteractor.OrderParam orderParam, @NotNull Continuation<? super Response> continuation) {
        return C41686h.m91049g(this.f22362d.getF82850b(), new KLineDataSession$loadActiveOrderData$2(this, orderParam, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m24170o(long j11, @NotNull Continuation<? super Response> continuation) {
        return C41686h.m91049g(this.f22362d.getF82850b(), new KLineDataSession$loadCdnData$2(this, j11, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m24171p(@NotNull IKLineDataInteractor.OrderParam orderParam, long j11, @NotNull Continuation<? super Response> continuation) {
        return C41686h.m91049g(this.f22362d.getF82850b(), new KLineDataSession$loadHistoryOrderData$2(j11, this, orderParam, null), continuation);
    }
}
