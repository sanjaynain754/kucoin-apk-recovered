package com.kubi.kucoin.manager;

import com.kubi.data.exception.CoinDataException;
import java.io.Closeable;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.InterfaceC41781z;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCSocketProvider.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kucoin/manager/KCSocketProviderScope;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "baseContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "job", "Lkotlinx/coroutines/CompletableJob;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "close", "", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCSocketProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProviderScope\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,234:1\n47#2,4:235\n*S KotlinDebug\n*F\n+ 1 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProviderScope\n*L\n220#1:235,4\n*E\n"})
public final class KCSocketProviderScope implements InterfaceC41709m0, Closeable {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CoroutineContext f28125b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public volatile InterfaceC41781z f28126c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final CoroutineExceptionHandler f28127d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        JobKt__JobKt.m90365i(getF796b(), null, 1, null);
        InterfaceC41775x1.a.m91377a(this.f28126c, null, 1, null);
        this.f28126c = C41727q2.m91192b(null, 1, null);
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.g$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProviderScope\n+ 3 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n*L\n1#1,49:1\n221#2:50\n222#2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProviderScope\n*L\n221#1:51,4\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C43846g.m96568c(new CoinDataException(exception, "KCSocketProviderScope", false, null, 8, null), null, 2, null);
            }
        }
    }

    public KCSocketProviderScope(@NotNull CoroutineContext baseContext) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        this.f28125b = baseContext;
        this.f28126c = C41727q2.m91192b(null, 1, null);
        this.f28127d = new a(CoroutineExceptionHandler.INSTANCE);
    }

    @Override // kotlinx.coroutines.InterfaceC41709m0
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF796b() {
        return this.f28126c.plus(this.f28125b).plus(this.f28127d);
    }
}
