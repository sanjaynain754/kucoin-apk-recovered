package gw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;
import p322hw.C38360a;

/* JADX INFO: renamed from: gw.a */
/* JADX INFO: compiled from: AdwHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38040a implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i11);
        C38360a.m86559c(context, intent);
    }
}
