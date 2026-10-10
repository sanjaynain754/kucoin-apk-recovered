package pa0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import cb0.C4929a;
import com.revolut.revolutpay.p123ui.navigator.internal.AbstractC27561g;
import com.revolut.revolutpay.p123ui.navigator.internal.C27556b;
import com.revolut.revolutpay.p123ui.navigator.internal.C27557c;
import com.revolut.revolutpay.p123ui.navigator.internal.C27558d;
import com.revolut.revolutpay.p123ui.navigator.internal.C27560f;
import com.revolut.revolutpay.p123ui.navigator.internal.EnumC27559e;
import com.revolut.revolutpay.p123ui.sandbox.SandboxConfirmationActivity;
import com.revolut.revolutpay.p123ui.webview.WebViewConfirmationActivity;
import java.lang.ref.WeakReference;
import na0.C42791a;
import oa0.C43005a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import qa0.C43678c;

/* JADX INFO: renamed from: pa0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C43428b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final WeakReference<Context> f95879a;

    /* JADX INFO: renamed from: pa0.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95880a;

        static {
            int[] iArr = new int[EnumC27559e.values().length];
            try {
                iArr[EnumC27559e.RETAIL_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27559e.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27559e.WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95880a = iArr;
        }
    }

    public C43428b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f95879a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m95613c(Context context, C27557c c27557c) {
        context.startActivity(new Intent("android.intent.action.VIEW", c27557c.m68359b()));
    }

    /* JADX INFO: renamed from: d */
    public final void m95614d(Context context, C27558d c27558d) {
        Intent intentM93782b;
        C43678c c43678c = C43678c.f96511a;
        String strM68373j = c27558d.m68373j();
        String strM68372i = c27558d.m68372i();
        String strM68370g = c27558d.m68370g();
        boolean zM68371h = c27558d.m68371h();
        String language = C4929a.f5465a.m5148a(context).getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "context.getLocale().language");
        Uri uriM96137a = c43678c.m96137a(strM68373j, strM68372i, strM68370g, zM68371h, language);
        int i11 = a.f95880a[c27558d.m68369f().ordinal()];
        if (i11 == 1) {
            intentM93782b = C42791a.m93782b(new Intent("android.intent.action.VIEW", uriM96137a), "com.revolut.revolut");
        } else if (i11 == 2) {
            intentM93782b = new Intent("android.intent.action.VIEW", uriM96137a, context, SandboxConfirmationActivity.class);
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            intentM93782b = C42791a.m93784d(new Intent(context, (Class<?>) WebViewConfirmationActivity.class), MapsKt.mapOf(TuplesKt.m90091to("CONFIRMATION_URL_PARAM", String.valueOf(uriM96137a)), TuplesKt.m90091to("RETURN_URL_PARAM", String.valueOf(C43005a.f95164a.m94441g()))));
        }
        context.startActivity(intentM93782b);
    }

    /* JADX INFO: renamed from: e */
    public final void m95615e(Context context, AbstractC27561g abstractC27561g) {
        if (abstractC27561g instanceof C27557c) {
            m95613c(context, (C27557c) abstractC27561g);
        } else if (abstractC27561g instanceof C27556b) {
            m95612b(context, (C27556b) abstractC27561g);
        } else if (abstractC27561g instanceof C27558d) {
            m95614d(context, (C27558d) abstractC27561g);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m95616f(@NotNull final AbstractC27561g command) {
        Intrinsics.checkNotNullParameter(command, "command");
        final Context context = this.f95879a.get();
        if (context != null) {
            Unit unit = null;
            if ((context instanceof Activity ? (Activity) context : null) != null) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: pa0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C43428b.m95611g(this.f95876b, context, command);
                    }
                });
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                m95615e(context, command);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m95611g(C43428b this$0, Context context, AbstractC27561g command) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(command, "$command");
        this$0.m95615e(context, command);
    }

    /* JADX INFO: renamed from: b */
    public final void m95612b(Context context, C27556b c27556b) {
        if (c27556b.m68350i() instanceof C27560f) {
            context.startActivity(C42791a.m93784d(C42791a.m93783c(C42791a.m93781a(new Intent(context, ((C27560f) c27556b.m68350i()).m68380b()), c27556b.m68352k()), c27556b.m68349h(), c27556b.m68348g()), c27556b.m68351j()));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
