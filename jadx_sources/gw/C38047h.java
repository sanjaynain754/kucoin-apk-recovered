package gw;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.h */
/* JADX INFO: compiled from: NovaHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38047h implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i11));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
