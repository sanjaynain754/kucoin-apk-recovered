package com.kubi.unify.utils;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.JobKt__JobKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.unify.utils.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifyCoroutineScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/unify/utils/UnifyCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "context", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "close", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyCoroutineScope.kt\ncom/kubi/unify/utils/UnifyCoroutineScope\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,80:1\n47#2,4:81\n*S KotlinDebug\n*F\n+ 1 UnifyCoroutineScope.kt\ncom/kubi/unify/utils/UnifyCoroutineScope\n*L\n27#1:81,4\n*E\n"})
public final class UnifyCoroutineScope implements InterfaceC41709m0, Closeable {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CoroutineContext f53495b;

    /* JADX INFO: renamed from: com.kubi.unify.utils.a$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 UnifyCoroutineScope.kt\ncom/kubi/unify/utils/UnifyCoroutineScope\n*L\n1#1,49:1\n28#2,4:50\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (exception instanceof CancellationException) {
                return;
            }
            C44128b.m97263g("[unifyAccount]", exception);
        }

        public a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    public UnifyCoroutineScope(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53495b = C41727q2.m91192b(null, 1, null).plus(context).plus(new a(CoroutineExceptionHandler.INSTANCE));
    }

    @Override // kotlinx.coroutines.InterfaceC41709m0
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public CoroutineContext getF34870b() {
        return this.f53495b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m90365i(getF34870b(), null, 1, null);
    }

    public /* synthetic */ UnifyCoroutineScope(CoroutineContext coroutineContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C42911a.m94121c() : coroutineContext);
    }
}
