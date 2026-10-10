package gw;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.e */
/* JADX INFO: compiled from: EverythingMeHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38044e implements InterfaceC37725a {
    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("me.everything.launcher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i11));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
