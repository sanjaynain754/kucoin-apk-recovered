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

/* JADX INFO: renamed from: gw.o */
/* JADX INFO: compiled from: ZukHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38054o implements InterfaceC37725a {

    /* JADX INFO: renamed from: a */
    public final Uri f85670a = Uri.parse("content://com.android.badge/badge");

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    @TargetApi(11)
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i11);
        context.getContentResolver().call(this.f85670a, "setAppBadgeCount", (String) null, bundle);
    }
}
