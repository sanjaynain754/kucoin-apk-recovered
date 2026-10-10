package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
public class DialogCompat {

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static <T> T requireViewById(Dialog dialog, int i11) {
            return (T) dialog.requireViewById(i11);
        }
    }

    @NonNull
    public static View requireViewById(@NonNull Dialog dialog, int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) Api28Impl.requireViewById(dialog, i11);
        }
        View viewFindViewById = dialog.findViewById(i11);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }

    private DialogCompat() {
    }
}
