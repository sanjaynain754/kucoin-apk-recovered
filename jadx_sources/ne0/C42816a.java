package ne0;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: ne0.a */
/* JADX INFO: compiled from: KCAppLabelUtils.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"getLiveAppLabel", "", "Landroid/content/Context;", "tuilivekit_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42816a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m93881a(@NotNull Context context) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            int i11 = context.getApplicationInfo().labelRes;
            objM103844constructorimpl = Result.m103844constructorimpl(i11 != 0 ? context.getString(i11) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str = (String) objM103844constructorimpl;
        if (str != null && !StringsKt.isBlank(str)) {
            return str;
        }
        try {
            CharSequence charSequenceLoadLabel = context.getApplicationInfo().loadLabel(context.getPackageManager());
            objM103844constructorimpl2 = Result.m103844constructorimpl(charSequenceLoadLabel != null ? charSequenceLoadLabel.toString() : null);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        String str2 = (String) (Result.m103850isFailureimpl(objM103844constructorimpl2) ? null : objM103844constructorimpl2);
        if (str2 != null && !StringsKt.isBlank(str2)) {
            return str2;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }
}
