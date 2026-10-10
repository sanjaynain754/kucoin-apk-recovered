package com.revolut.revolutpay.p123ui.sandbox;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.UiThread;
import com.revolut.revolutpay.factory.sandbox.C27529b;
import com.revolut.revolutpay.polling.C27534e;
import com.revolut.revolutpay.polling.InterfaceC27533d;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import ka0.InterfaceC40968a;
import la0.C42144a;
import la0.C42145b;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import retrofit2.Response;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.sandbox.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C27586a {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final a f56352c = new a(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final b f56353a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC27533d f56354b;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.sandbox.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.sandbox.a$b */
    public interface b {
        @UiThread
        /* JADX INFO: renamed from: a */
        void mo68477a(@NotNull String str);

        /* JADX INFO: renamed from: b */
        void mo68478b(@Nullable String str);
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.sandbox.a$c */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f56356b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f56357c;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.sandbox.a$c$a */
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C27586a f56358a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C27586a c27586a) {
                super(0);
                this.f56358a = c27586a;
            }

            /* JADX INFO: renamed from: a */
            public final void m68490a() {
                this.f56358a.f56353a.mo68477a("Error happened while confirming the order");
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m68490a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.sandbox.a$c$b */
        public static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C27586a f56359a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C27586a c27586a) {
                super(0);
                this.f56359a = c27586a;
            }

            /* JADX INFO: renamed from: a */
            public final void m68491a() {
                this.f56359a.f56353a.mo68477a("Error happened while confirming the order");
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m68491a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.sandbox.a$c$c, reason: collision with other inner class name */
        public static final class C46985c extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C27586a f56360a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46985c(C27586a c27586a) {
                super(0);
                this.f56360a = c27586a;
            }

            /* JADX INFO: renamed from: a */
            public final void m68492a() {
                this.f56360a.f56353a.mo68477a("Payment confirmed, proceeding back to the Order screen");
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m68492a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.f56356b = str;
            this.f56357c = str2;
        }

        /* JADX INFO: renamed from: a */
        public final void m68489a() throws IOException {
            Response responseM68484d = C27586a.this.m68484d(this.f56356b);
            if (!responseM68484d.isSuccessful()) {
                C27586a.this.f56354b.mo68264c(new a(C27586a.this));
                return;
            }
            if (!C27586a.this.m68485e((C42145b) responseM68484d.body()).isSuccessful()) {
                C27586a.this.f56354b.mo68264c(new b(C27586a.this));
            } else {
                C27586a.this.f56354b.mo68264c(new C46985c(C27586a.this));
                C27586a.this.f56353a.mo68478b(this.f56357c);
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws IOException {
            m68489a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Response<C42145b> m68484d(String str) throws IOException {
        Response<C42145b> responseExecute = C27529b.f56187a.m68231c().m89722b(str, "application/json", "application/json", new C42144a(24, 2560, 1440)).execute();
        Intrinsics.checkNotNullExpressionValue(responseExecute, "SandboxServiceFactory.sa…    )\n        ).execute()");
        return responseExecute;
    }

    /* JADX INFO: renamed from: e */
    public final Response<ResponseBody> m68485e(C42145b c42145b) {
        InterfaceC40968a interfaceC40968aM68231c = C27529b.f56187a.m68231c();
        String strM92483a = c42145b != null ? c42145b.m92483a() : null;
        if (strM92483a == null) {
            strM92483a = "";
        }
        return interfaceC40968aM68231c.m89721a(strM92483a, "application/json", "application/json").execute();
    }

    /* JADX INFO: renamed from: f */
    public final void m68486f() {
        this.f56354b.pause();
    }

    /* JADX INFO: renamed from: i */
    public final void m68488i() {
        this.f56354b.mo68261a();
    }

    public C27586a(@NotNull b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f56353a = view;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.f56354b = new C27534e(executorServiceNewCachedThreadPool, scheduledExecutorServiceNewSingleThreadScheduledExecutor, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m68487g(@NotNull String orderToken, @Nullable String str) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        return this.f56354b.mo68263b(new c(orderToken, str));
    }
}
