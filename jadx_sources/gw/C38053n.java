package gw;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.ArrayList;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.n */
/* JADX INFO: compiled from: ZTEHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38053n implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return new ArrayList(0);
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i11);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
    }
}
