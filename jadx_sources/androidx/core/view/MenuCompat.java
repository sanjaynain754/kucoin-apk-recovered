package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes23.dex */
public final class MenuCompat {

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static void setGroupDividerEnabled(Menu menu, boolean z11) {
            menu.setGroupDividerEnabled(z11);
        }
    }

    public static void setGroupDividerEnabled(@NonNull Menu menu, boolean z11) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z11);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setGroupDividerEnabled(menu, z11);
        }
    }

    private MenuCompat() {
    }

    @ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i11) {
        menuItem.setShowAsAction(i11);
    }
}
