package com.revolut.revolutpay.polling;

import com.revolut.revolutpay.api.OrderState;
import com.revolut.revolutpay.api.exceptions.OrderStateException;
import ja0.InterfaceC40362d;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.revolut.revolutpay.polling.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C27531b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f56194a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C27530a f56195b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC27533d f56196c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function1<String, Unit> f56197d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Function1<Throwable, Unit> f56198e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC40362d f56199f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final C27538i f56200g;

    /* JADX INFO: renamed from: h */
    public final long f56201h;

    /* JADX INFO: renamed from: i */
    public final long f56202i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final TimeUnit f56203j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final a f56204k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Long f56205l;

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.b$a */
    public final class a implements InterfaceC27532c {
        public a() {
        }

        @Override // com.revolut.revolutpay.polling.InterfaceC27532c
        /* JADX INFO: renamed from: a */
        public void mo68255a() {
            C27531b.this.m68245b();
        }

        @Override // com.revolut.revolutpay.polling.InterfaceC27532c
        /* JADX INFO: renamed from: b */
        public void mo68256b() {
            C27531b.this.m68247g();
        }

        @Override // com.revolut.revolutpay.polling.InterfaceC27532c
        public void onDestroy() {
            C27531b.this.m68252q();
        }

        @Override // com.revolut.revolutpay.polling.InterfaceC27532c
        public void onStop() {
            C27531b.this.m68253r();
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.b$b */
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m68257a() {
            try {
                OrderState orderStateMo68204a = C27531b.this.f56199f.mo68204a(C27531b.this.f56194a);
                C27531b c27531b = C27531b.this;
                if (orderStateMo68204a == OrderState.COMPLETED) {
                    c27531b.m68250m();
                } else {
                    c27531b.m68251n();
                }
            } catch (UnknownHostException unused) {
                C27531b.this.m68251n();
            } catch (Exception e11) {
                C27531b.this.m68246e(e11);
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m68257a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.b$c */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m68258a() {
            C27531b.this.f56197d.invoke(C27531b.this.f56194a);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m68258a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.b$d */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f56210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th2) {
            super(0);
            this.f56210b = th2;
        }

        /* JADX INFO: renamed from: a */
        public final void m68259a() {
            C27531b.this.f56198e.invoke(this.f56210b);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m68259a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.b$e */
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        public e(Object obj) {
            super(0, obj, C27531b.class, "execute", "execute()V", 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m68260a() {
            ((C27531b) this.receiver).m68249k();
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m68260a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27531b(@NotNull String orderToken, @NotNull C27530a lifecycleProxy, @NotNull InterfaceC27533d schedulerService, @NotNull Function1<? super String, Unit> onCompletedState, @NotNull Function1<? super Throwable, Unit> onErrorHappened, @NotNull InterfaceC40362d apiService, @NotNull C27538i timestampProvider, long j11, long j12, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(lifecycleProxy, "lifecycleProxy");
        Intrinsics.checkNotNullParameter(schedulerService, "schedulerService");
        Intrinsics.checkNotNullParameter(onCompletedState, "onCompletedState");
        Intrinsics.checkNotNullParameter(onErrorHappened, "onErrorHappened");
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f56194a = orderToken;
        this.f56195b = lifecycleProxy;
        this.f56196c = schedulerService;
        this.f56197d = onCompletedState;
        this.f56198e = onErrorHappened;
        this.f56199f = apiService;
        this.f56200g = timestampProvider;
        this.f56201h = j11;
        this.f56202i = j12;
        this.f56203j = timeUnit;
        a aVar = new a();
        this.f56204k = aVar;
        lifecycleProxy.m68234b(aVar);
    }

    public /* synthetic */ C27531b(String str, C27530a c27530a, InterfaceC27533d interfaceC27533d, Function1 function1, Function1 function2, InterfaceC40362d interfaceC40362d, C27538i c27538i, long j11, long j12, TimeUnit timeUnit, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c27530a, interfaceC27533d, function1, function2, interfaceC40362d, (i11 & 64) != 0 ? new C27538i() : c27538i, (i11 & 128) != 0 ? 3L : j11, (i11 & 256) != 0 ? 600L : j12, (i11 & 512) != 0 ? TimeUnit.SECONDS : timeUnit);
    }

    /* JADX INFO: renamed from: a */
    public final long m68244a(long j11) {
        return this.f56203j.toMillis(j11);
    }

    /* JADX INFO: renamed from: b */
    public void m68245b() {
        this.f56196c.mo68261a();
        m68249k();
    }

    /* JADX INFO: renamed from: e */
    public final void m68246e(Throwable th2) {
        this.f56196c.mo68264c(new d(th2));
        m68248i();
    }

    /* JADX INFO: renamed from: g */
    public void m68247g() {
        this.f56196c.pause();
    }

    /* JADX INFO: renamed from: i */
    public void m68248i() {
        this.f56196c.stop();
        this.f56205l = null;
        this.f56195b.m68235c(this.f56204k);
    }

    /* JADX INFO: renamed from: k */
    public final void m68249k() {
        if (this.f56205l == null) {
            m68246e(new OrderStateException("Cannot get the order state"));
        } else {
            this.f56196c.mo68263b(new b());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m68250m() {
        this.f56196c.mo68264c(new c());
        m68248i();
    }

    /* JADX INFO: renamed from: n */
    public final void m68251n() {
        Long l11 = this.f56205l;
        if (l11 != null) {
            long jMin = Math.min(m68244a(this.f56201h), (l11.longValue() + m68244a(this.f56202i)) - this.f56200g.m68275a());
            if (jMin > 0) {
                this.f56196c.mo68262a(new e(this), jMin, TimeUnit.MILLISECONDS);
            } else {
                m68246e(new OrderStateException("Timeout has passed"));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m68253r() {
        this.f56196c.pause();
    }

    /* JADX INFO: renamed from: s */
    public void m68254s() {
        this.f56205l = Long.valueOf(this.f56200g.m68275a());
        m68249k();
    }

    /* JADX INFO: renamed from: q */
    public void m68252q() {
        m68248i();
    }
}
