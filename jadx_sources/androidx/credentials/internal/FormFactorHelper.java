package androidx.credentials.internal;

import android.content.Context;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FormFactorHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/internal/FormFactorHelper;", "", "<init>", "()V", "isTV", "", "ctx", "Landroid/content/Context;", "isWear", "isAuto", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class FormFactorHelper {

    @NotNull
    public static final FormFactorHelper INSTANCE = new FormFactorHelper();

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean isAuto(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean isTV(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return ctx.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean isWear(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return ctx.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    private FormFactorHelper() {
    }
}
