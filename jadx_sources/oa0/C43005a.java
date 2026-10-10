package oa0;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.revolut.revolutpay.api.RevolutPayEnvironment;
import com.revolut.revolutpay.p123ui.controller.C27546a;
import ha0.InterfaceC38153a;
import ia0.C38506a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oa0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C43005a {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static RevolutPayEnvironment f95165b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static Uri f95166c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static String f95167d;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43005a f95164a = new C43005a();

    /* JADX INFO: renamed from: e */
    public static boolean f95168e = true;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C38506a m94435a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m94436b(@NotNull Context context, @NotNull String orderToken, @NotNull Lifecycle lifecycle, @NotNull InterfaceC38153a callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new C27546a(context).m68316n(orderToken, lifecycle, callback);
    }

    /* JADX INFO: renamed from: c */
    public final void m94437c(@NotNull RevolutPayEnvironment environment, @NotNull Uri returnUri, @NotNull String merchantPublicKey, boolean z11, @Nullable C38506a c38506a) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(returnUri, "returnUri");
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        f95165b = environment;
        f95166c = returnUri;
        f95167d = merchantPublicKey;
        f95168e = z11;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final RevolutPayEnvironment m94438d() {
        return f95165b;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m94439e() {
        return f95167d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m94440f() {
        return f95168e;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Uri m94441g() {
        return f95166c;
    }
}
