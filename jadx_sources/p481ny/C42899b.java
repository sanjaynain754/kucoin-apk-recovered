package p481ny;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.utils.extensions.C27041f;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import retrofit2.HttpException;

/* JADX INFO: renamed from: ny.b */
/* JADX INFO: compiled from: BaseCommonEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u001a\u0010\b\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n\u001a(\u0010\b\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0010¨\u0006\u0011"}, m90084d2 = {"getFlutterSp", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "pop", "", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "tag", "", "getTopActivity", "block", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "default", "Lkotlin/Function0;", "needIgnore", "", "", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42899b {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final SharedPreferences m94072b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        SharedPreferences sharedPreferences = context.getSharedPreferences(SharedPreferencesPluginKt.SHARED_PREFERENCES_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: c */
    public static final void m94073c(@NotNull Function1<? super FragmentActivity, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Activity activityM6125h = C5258a.m6125h();
        FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        if (fragmentActivity != null) {
            block.invoke(fragmentActivity);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m94074d(@NotNull Function1<? super FragmentActivity, Unit> block, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(function0, "default");
        Activity activityM6125h = C5258a.m6125h();
        FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        if (fragmentActivity != null) {
            block.invoke(fragmentActivity);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m94075e(@NotNull Throwable th2) {
        String message;
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if ((th2 instanceof SocketException) || (th2 instanceof UnknownHostException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException) || (th2 instanceof ConnectionShutdownException) || (th2 instanceof HttpException)) {
            return true;
        }
        if (th2 instanceof SecurityException) {
            String message2 = th2.getMessage();
            if (message2 != null) {
                return StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
            }
            return false;
        }
        if (!(th2 instanceof ApiException)) {
            if (th2 instanceof InterruptedIOException) {
                return true;
            }
            return (th2 instanceof IOException) && (message = th2.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"));
        }
        String message3 = th2.getMessage();
        if (message3 != null) {
            return StringsKt.startsWith$default(message3, "Sorry! Your IP is from restricted area", false, 2, (Object) null);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final void m94076f(@NotNull final BaseDialogFragment baseDialogFragment, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(baseDialogFragment, "<this>");
        m94073c(new Function1() { // from class: ny.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42899b.m94077g(baseDialogFragment, str, (FragmentActivity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m94077g(BaseDialogFragment baseDialogFragment, String str, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        baseDialogFragment.show(supportFragmentManager, C27041f.m66668h(str));
        return Unit.INSTANCE;
    }
}
