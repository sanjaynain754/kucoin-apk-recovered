package gw;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.f */
/* JADX INFO: compiled from: HuaweiHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38045f implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("com.huawei.android.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putString(TPDownloadProxyEnum.DLPARAM_PACKAGE, context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i11);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
