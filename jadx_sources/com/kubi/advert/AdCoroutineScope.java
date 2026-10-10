package com.kubi.advert;

import com.kubi.advert.exception.AdvertException;
import java.io.Closeable;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.advert.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AdvertEx.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/advert/AdCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "name", "", "<init>", "(Ljava/lang/String;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "close", "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAdvertEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvertEx.kt\ncom/kubi/advert/AdCoroutineScope\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,42:1\n47#2,4:43\n*S KotlinDebug\n*F\n+ 1 AdvertEx.kt\ncom/kubi/advert/AdCoroutineScope\n*L\n19#1:43,4\n*E\n"})
public final class AdCoroutineScope implements InterfaceC41709m0, Closeable {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CoroutineContext f15154b;

    /* JADX INFO: renamed from: com.kubi.advert.g$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AdvertEx.kt\ncom/kubi/advert/AdCoroutineScope\n+ 3 AdvertIssue.kt\ncom/kubi/advert/exception/AdvertIssueKt\n*L\n1#1,49:1\n20#2:50\n21#2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 AdvertEx.kt\ncom/kubi/advert/AdCoroutineScope\n*L\n20#1:51,4\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C43846g.m96568c(new AdvertException(exception, "AdCoroutineScope", false, null, 8, null), null, 2, null);
            }
        }
    }

    public AdCoroutineScope(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15154b = new CoroutineName("AdCoroutineScope" + name).plus(C41727q2.m91192b(null, 1, null)).plus(new a(CoroutineExceptionHandler.INSTANCE));
    }

    @Override // kotlinx.coroutines.InterfaceC41709m0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f15154b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m90365i(getCoroutineContext(), null, 1, null);
    }
}
