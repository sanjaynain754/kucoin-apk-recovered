package gw;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.Collections;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.m */
/* JADX INFO: compiled from: YandexLauncherBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38052m implements InterfaceC37725a {

    /* JADX INFO: renamed from: a */
    public static final Uri f85669a = Uri.parse("content://com.yandex.launcher.badges_external");

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Collections.singletonList("com.yandex.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putString("class", componentName.getClassName());
        bundle.putString(TPDownloadProxyEnum.DLPARAM_PACKAGE, componentName.getPackageName());
        bundle.putString("badges_count", String.valueOf(i11));
        context.getContentResolver().call(f85669a, "setBadgeNumber", (String) null, bundle);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m85926c(Context context) {
        try {
            context.getContentResolver().call(f85669a, "", (String) null, (Bundle) null);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
