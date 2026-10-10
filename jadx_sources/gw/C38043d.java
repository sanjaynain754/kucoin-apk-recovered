package gw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;
import p322hw.C38360a;

/* JADX INFO: renamed from: gw.d */
/* JADX INFO: compiled from: DefaultBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38043d implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i11);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        C38360a.m86558b(context, intent);
    }

    /* JADX INFO: renamed from: c */
    public boolean m85917c(Context context) {
        if (C38360a.m86557a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() <= 0) {
            return Build.VERSION.SDK_INT >= 26 && C38360a.m86557a(context, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0;
        }
        return true;
    }
}
