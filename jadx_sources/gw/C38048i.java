package gw;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.i */
/* JADX INFO: compiled from: OPPOHomeBader.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38048i implements InterfaceC37725a {

    /* JADX INFO: renamed from: a */
    public int f85663a = -1;

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        if (this.f85663a == i11) {
            return;
        }
        this.f85663a = i11;
        m85918c(context, i11);
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: c */
    public final void m85918c(Context context, int i11) throws ShortcutBadgeException {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i11);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
        }
    }
}
