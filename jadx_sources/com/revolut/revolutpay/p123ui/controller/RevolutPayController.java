package com.revolut.revolutpay.p123ui.controller;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.media3.exoplayer.upstream.CmcdData;
import cb0.C4929a;
import com.revolut.revolutpay.api.RevolutPayEnvironment;
import com.revolut.revolutpay.data.C27524a;
import com.revolut.revolutpay.p123ui.navigator.internal.C27558d;
import com.revolut.revolutpay.p123ui.navigator.internal.EnumC27559e;
import com.revolut.revolutpay.polling.C27530a;
import com.revolut.revolutpay.polling.C27531b;
import com.revolut.revolutpay.polling.C27534e;
import ha0.InterfaceC38153a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import ma0.C42499c;
import oa0.C43005a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import pa0.C43428b;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0015\u0010\bJ'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+¨\u0006-"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/controller/RevolutPayController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()V", "Lha0/a;", "orderResultCallback", "j", "(Lha0/a;)V", "", "orderToken", "k", "(Ljava/lang/String;)V", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "f", "(Landroidx/lifecycle/Lifecycle;)V", "g", "sessionToken", "merchantPublicKey", "", "requestShipping", "i", "(Ljava/lang/String;Ljava/lang/String;Z)V", CmcdData.Factory.STREAM_TYPE_LIVE, "m", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Landroidx/lifecycle/Lifecycle;", "c", "Lha0/a;", "d", "Ljava/lang/String;", "Lpa0/b;", "e", "Lpa0/b;", "navigator", "Lcom/revolut/revolutpay/polling/b;", "Lcom/revolut/revolutpay/polling/b;", "poller", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public class RevolutPayController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Lifecycle lifecycle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public InterfaceC38153a orderResultCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String orderToken;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C43428b navigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C27531b poller;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.controller.RevolutPayController$a */
    @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
    public /* synthetic */ class C27543a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RevolutPayEnvironment.values().length];
            try {
                iArr[RevolutPayEnvironment.SANDBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RevolutPayEnvironment.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RevolutPayController(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.navigator = new C43428b(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m68308f(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.lifecycle = lifecycle;
    }

    /* JADX INFO: renamed from: g */
    public final void m68309g() {
        if (this.orderToken == null) {
            m68310h();
            throw new IllegalArgumentException("Need to call setOrderToken before continuing the confirmation flow");
        }
        C43005a c43005a = C43005a.f95164a;
        final String strM94439e = c43005a.m94439e();
        if (strM94439e == null) {
            m68310h();
            throw new IllegalArgumentException("Need to pass non-null [merchantPublicKey] in [RevolutPay.init(...)] function call before continuing the confirmation flow");
        }
        final boolean zM94440f = c43005a.m94440f();
        if (this.lifecycle == null) {
            m68310h();
            throw new IllegalArgumentException("Need to pass [lifecycle] by calling [attachLifecycle] function call before continuing the confirmation flow");
        }
        if (this.orderResultCallback == null) {
            m68310h();
            throw new IllegalArgumentException("Need to call [setOrderResultCallback] to receive the result of the order processing");
        }
        C27524a c27524a = C27524a.f55949a;
        String str = this.orderToken;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderToken");
            str = null;
        }
        c27524a.m68205b(str, new Function1<C42499c, Unit>() { // from class: com.revolut.revolutpay.ui.controller.RevolutPayController$continueConfirmationFlow$7
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C42499c c42499c) {
                invoke2(c42499c);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C42499c session) {
                Lifecycle lifecycle;
                Intrinsics.checkNotNullParameter(session, "session");
                this.this$0.m68310h();
                RevolutPayController revolutPayController = this.this$0;
                String str2 = revolutPayController.orderToken;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orderToken");
                    str2 = null;
                    lifecycle = null;
                } else {
                    lifecycle = null;
                }
                Lifecycle lifecycle2 = this.this$0.lifecycle;
                if (lifecycle2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lifecycle");
                } else {
                    lifecycle = lifecycle2;
                }
                C27530a c27530a = new C27530a(lifecycle);
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
                Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
                C27534e c27534e = new C27534e(executorServiceNewCachedThreadPool, scheduledExecutorServiceNewSingleThreadScheduledExecutor, new Handler(Looper.getMainLooper()));
                final RevolutPayController revolutPayController2 = this.this$0;
                Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.revolut.revolutpay.ui.controller.RevolutPayController$continueConfirmationFlow$7.1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                        invoke2(str3);
                        return Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InterfaceC38153a interfaceC38153a = revolutPayController2.orderResultCallback;
                        if (interfaceC38153a == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orderResultCallback");
                            interfaceC38153a = null;
                        }
                        interfaceC38153a.mo47721b();
                    }
                };
                final RevolutPayController revolutPayController3 = this.this$0;
                C27531b c27531b = new C27531b(str2, c27530a, c27534e, function1, new Function1<Throwable, Unit>() { // from class: com.revolut.revolutpay.ui.controller.RevolutPayController$continueConfirmationFlow$7.2
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                        invoke2(th2);
                        return Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InterfaceC38153a interfaceC38153a = revolutPayController3.orderResultCallback;
                        if (interfaceC38153a == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orderResultCallback");
                            interfaceC38153a = null;
                        }
                        interfaceC38153a.mo47720a(it);
                    }
                }, C27524a.f55949a, null, 0L, 0L, null, 960, null);
                c27531b.m68254s();
                revolutPayController.poller = c27531b;
                this.this$0.m68311i(session.m93184a(), strM94439e, zM94440f);
            }
        }, new Function1<Throwable, Unit>() { // from class: com.revolut.revolutpay.ui.controller.RevolutPayController$continueConfirmationFlow$8
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.m68310h();
                InterfaceC38153a interfaceC38153a = this.this$0.orderResultCallback;
                if (interfaceC38153a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orderResultCallback");
                    interfaceC38153a = null;
                }
                interfaceC38153a.mo47720a(it);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m68311i(String sessionToken, String merchantPublicKey, boolean requestShipping) {
        RevolutPayEnvironment revolutPayEnvironmentM94438d = C43005a.f95164a.m94438d();
        int i11 = revolutPayEnvironmentM94438d == null ? -1 : C27543a.$EnumSwitchMapping$0[revolutPayEnvironmentM94438d.ordinal()];
        if (i11 == 1) {
            m68315m(sessionToken, merchantPublicKey, requestShipping);
        } else {
            if (i11 != 2) {
                return;
            }
            m68314l(sessionToken, merchantPublicKey, requestShipping);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m68315m(String sessionToken, String merchantPublicKey, boolean requestShipping) {
        C4929a c4929a = C4929a.f5465a;
        PackageManager packageManager = this.context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        EnumC27559e enumC27559e = c4929a.m5149b(packageManager) ? EnumC27559e.SANDBOX : EnumC27559e.WEB_VIEW;
        C43428b c43428b = this.navigator;
        String str = this.orderToken;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderToken");
            str = null;
        }
        c43428b.m95616f(new C27558d(enumC27559e, str, sessionToken, merchantPublicKey, requestShipping));
    }

    /* JADX INFO: renamed from: j */
    public final void m68312j(@NotNull InterfaceC38153a orderResultCallback) {
        Intrinsics.checkNotNullParameter(orderResultCallback, "orderResultCallback");
        this.orderResultCallback = orderResultCallback;
    }

    /* JADX INFO: renamed from: k */
    public final void m68313k(@NotNull String orderToken) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        this.orderToken = orderToken;
    }

    /* JADX INFO: renamed from: l */
    public final void m68314l(String sessionToken, String merchantPublicKey, boolean requestShipping) {
        String str;
        String str2;
        boolean z11;
        String str3;
        try {
            C43428b c43428b = this.navigator;
            EnumC27559e enumC27559e = EnumC27559e.RETAIL_APP;
            String str4 = this.orderToken;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orderToken");
                str4 = null;
            }
            str = sessionToken;
            str2 = merchantPublicKey;
            z11 = requestShipping;
            try {
                c43428b.m95616f(new C27558d(enumC27559e, str4, str, str2, z11));
            } catch (ActivityNotFoundException unused) {
                C43428b c43428b2 = this.navigator;
                String str5 = str;
                String str6 = str2;
                EnumC27559e enumC27559e2 = EnumC27559e.WEB_VIEW;
                String str7 = this.orderToken;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orderToken");
                    str3 = null;
                } else {
                    str3 = str7;
                }
                c43428b2.m95616f(new C27558d(enumC27559e2, str3, str5, str6, z11));
            }
        } catch (ActivityNotFoundException unused2) {
            str = sessionToken;
            str2 = merchantPublicKey;
            z11 = requestShipping;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m68310h() {
    }
}
