package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.ReplaceWith;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public final class ListViewCompat {
    private ListViewCompat() {
    }

    @ReplaceWith(expression = "listView.canScrollList(direction)")
    @Deprecated
    public static boolean canScrollList(@NonNull ListView listView, int i11) {
        return listView.canScrollList(i11);
    }

    @ReplaceWith(expression = "listView.scrollListBy(y)")
    @Deprecated
    public static void scrollListBy(@NonNull ListView listView, int i11) {
        listView.scrollListBy(i11);
    }
}
