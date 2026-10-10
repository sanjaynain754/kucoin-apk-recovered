package cb0;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cb0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C4929a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4929a f5465a = new C4929a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Locale m5148a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        if (locale != null) {
            return locale;
        }
        Locale UK = Locale.UK;
        Intrinsics.checkNotNullExpressionValue(UK, "UK");
        return UK;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5149b(@NotNull PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        try {
            packageManager.getPackageInfo("com.revolut.revolut", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
