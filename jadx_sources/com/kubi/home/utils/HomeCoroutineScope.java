package com.kubi.home.utils;

import java.io.Closeable;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import p289gj.C37967a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeCoroutineScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/utils/HomeCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "context", "Lkotlin/coroutines/CoroutineContext;", "name", "", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "close", "", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCoroutineScope.kt\ncom/kubi/home/utils/HomeCoroutineScope\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,27:1\n75#2:28\n77#2:33\n47#3,4:29\n*S KotlinDebug\n*F\n+ 1 HomeCoroutineScope.kt\ncom/kubi/home/utils/HomeCoroutineScope\n*L\n22#1:28\n22#1:33\n22#1:29,4\n*E\n"})
public final class HomeCoroutineScope implements InterfaceC41709m0, Closeable {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f26334c = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CoroutineContext f26335b;

    /* JADX INFO: compiled from: HomeCoroutineScope.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/utils/HomeCoroutineScope$Companion;", "", "<init>", "()V", "NAME", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public HomeCoroutineScope(@NotNull CoroutineContext context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f26335b = new CoroutineName("home_scope_" + name).plus(C41727q2.m91192b(null, 1, null)).plus(context).plus(new C37967a(CoroutineExceptionHandler.INSTANCE));
    }

    @Override // kotlinx.coroutines.InterfaceC41709m0
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public CoroutineContext getF53495b() {
        return this.f26335b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m90365i(getF53495b(), null, 1, null);
    }
}
