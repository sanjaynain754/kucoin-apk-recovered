package gw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;
import p273fw.InterfaceC37725a;
import p322hw.C38360a;

/* JADX INFO: renamed from: gw.g */
/* JADX INFO: compiled from: NewHtcHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38046g implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Collections.singletonList("com.htc.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        boolean z11;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i11);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i11);
        boolean z12 = false;
        try {
            C38360a.m86559c(context, intent);
            z11 = true;
        } catch (ShortcutBadgeException unused) {
            z11 = false;
        }
        try {
            C38360a.m86559c(context, intent2);
            z12 = true;
        } catch (ShortcutBadgeException unused2) {
        }
        if (z11 || z12) {
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent2.toString());
    }
}
