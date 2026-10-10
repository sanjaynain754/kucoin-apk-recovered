package p219e2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: renamed from: e2.a */
/* JADX INFO: compiled from: DrawableDecoderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C37045a {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f82300a = true;

    /* JADX INFO: renamed from: b */
    public static Drawable m82891b(Context context, Context context2, @DrawableRes int i11) {
        return m82892c(context, context2, i11, null);
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m82892c(Context context, Context context2, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        try {
            if (f82300a) {
                return m82894e(context2, i11, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e11) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e11;
            }
            return ContextCompat.getDrawable(context2, i11);
        } catch (NoClassDefFoundError unused2) {
            f82300a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m82893d(context2, i11, theme);
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m82894e(Context context, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return AppCompatResources.getDrawable(context, i11);
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m82890a(Context context, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        return m82892c(context, context, i11, theme);
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m82893d(Context context, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i11, theme);
    }
}
