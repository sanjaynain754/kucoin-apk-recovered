package gw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.c */
/* JADX INFO: compiled from: AsusHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38042c implements InterfaceC37725a {

    /* JADX INFO: renamed from: a */
    public final Uri f85662a = Uri.parse("content://com.android.badge/");

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("com.asus.launcher");
    }

    /* JADX INFO: renamed from: c */
    public final void m85916c(Context context, ComponentName componentName, int i11) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i11));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i11 > 0);
        context.sendBroadcast(intent);
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        m85916c(context, componentName, i11);
    }
}
