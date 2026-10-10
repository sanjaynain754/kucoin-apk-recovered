package gw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;
import p322hw.C38360a;

/* JADX INFO: renamed from: gw.b */
/* JADX INFO: compiled from: ApexHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38041b implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra(TPDownloadProxyEnum.DLPARAM_PACKAGE, componentName.getPackageName());
        intent.putExtra("count", i11);
        intent.putExtra("class", componentName.getClassName());
        C38360a.m86559c(context, intent);
    }
}
