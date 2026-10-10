package gw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.l */
/* JADX INFO: compiled from: VivoHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38051l implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i11);
        context.sendBroadcast(intent);
    }
}
