package com.revolut.revolutpay.polling;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.revolut.revolutpay.polling.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C27534e implements InterfaceC27533d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ExecutorService f56211a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ScheduledExecutorService f56212b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Handler f56213c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final AtomicBoolean f56214d;

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.e$a */
    public static final class a extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function0<Unit> f56216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(0);
            this.f56216b = function0;
        }

        /* JADX INFO: renamed from: b */
        public static final void m68270b(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }

        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Object invoke() {
            ExecutorService executorService = C27534e.this.f56211a;
            final Function0<Unit> function0 = this.f56216b;
            Future<?> futureSubmit = executorService.submit(new Runnable() { // from class: com.revolut.revolutpay.polling.f
                @Override // java.lang.Runnable
                public final void run() {
                    C27534e.a.m68270b(function0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(futureSubmit, "ioExecutorService.submit(lambda)");
            return futureSubmit;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.e$b */
    public static final class b extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function0<Unit> f56218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0) {
            super(0);
            this.f56218b = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m68272b(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }

        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Object invoke() {
            Handler handler = C27534e.this.f56213c;
            final Function0<Unit> function0 = this.f56218b;
            return Boolean.valueOf(handler.post(new Runnable() { // from class: com.revolut.revolutpay.polling.g
                @Override // java.lang.Runnable
                public final void run() {
                    C27534e.b.m68272b(function0);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.e$c */
    public static final class c extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function0<Unit> f56220b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f56221c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ TimeUnit f56222d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, long j11, TimeUnit timeUnit) {
            super(0);
            this.f56220b = function0;
            this.f56221c = j11;
            this.f56222d = timeUnit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m68274b(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }

        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Object invoke() {
            ScheduledExecutorService scheduledExecutorService = C27534e.this.f56212b;
            final Function0<Unit> function0 = this.f56220b;
            ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.revolut.revolutpay.polling.h
                @Override // java.lang.Runnable
                public final void run() {
                    C27534e.c.m68274b(function0);
                }
            }, this.f56221c, this.f56222d);
            Intrinsics.checkNotNullExpressionValue(scheduledFutureSchedule, "scheduledExecutorService…(lambda, delay, timeUnit)");
            return scheduledFutureSchedule;
        }
    }

    @Override // com.revolut.revolutpay.polling.InterfaceC27533d
    /* JADX INFO: renamed from: a */
    public void mo68261a() {
        this.f56214d.set(false);
    }

    public C27534e(@NotNull ExecutorService ioExecutorService, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull Handler mainThreadHandler) {
        Intrinsics.checkNotNullParameter(ioExecutorService, "ioExecutorService");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "scheduledExecutorService");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        this.f56211a = ioExecutorService;
        this.f56212b = scheduledExecutorService;
        this.f56213c = mainThreadHandler;
        this.f56214d = new AtomicBoolean(false);
    }

    @Override // com.revolut.revolutpay.polling.InterfaceC27533d
    /* JADX INFO: renamed from: a */
    public boolean mo68262a(@NotNull Function0<Unit> lambda, long j11, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return m68268g(new c(lambda, j11, timeUnit));
    }

    @Override // com.revolut.revolutpay.polling.InterfaceC27533d
    /* JADX INFO: renamed from: b */
    public boolean mo68263b(@NotNull Function0<Unit> lambda) {
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        return m68268g(new a(lambda));
    }

    @Override // com.revolut.revolutpay.polling.InterfaceC27533d
    /* JADX INFO: renamed from: c */
    public boolean mo68264c(@NotNull Function0<Unit> lambda) {
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        return m68268g(new b(lambda));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m68268g(Function0<? extends Object> function0) {
        if (this.f56214d.get()) {
            return false;
        }
        function0.invoke();
        return true;
    }

    @Override // com.revolut.revolutpay.polling.InterfaceC27533d
    public void pause() {
        this.f56214d.set(true);
    }

    @Override // com.revolut.revolutpay.polling.InterfaceC27533d
    public void stop() {
        this.f56212b.shutdownNow();
        this.f56211a.shutdownNow();
    }
}
