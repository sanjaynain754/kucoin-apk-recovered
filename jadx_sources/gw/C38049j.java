package gw;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;
import p322hw.C38361b;

/* JADX INFO: renamed from: gw.j */
/* JADX INFO: compiled from: SamsungHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38049j implements InterfaceC37725a {

    /* JADX INFO: renamed from: b */
    public static final String[] f85664b = {"_id", "class"};

    /* JADX INFO: renamed from: a */
    public C38043d f85665a = new C38043d();

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        C38043d c38043d = this.f85665a;
        if (c38043d != null && c38043d.m85917c(context)) {
            this.f85665a.mo85020b(context, componentName, i11);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f85664b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                String className = componentName.getClassName();
                boolean z11 = false;
                while (cursorQuery.moveToNext()) {
                    contentResolver.update(uri, m85919c(componentName, i11, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                    if (className.equals(cursorQuery.getString(cursorQuery.getColumnIndex("class")))) {
                        z11 = true;
                    }
                }
                if (!z11) {
                    contentResolver.insert(uri, m85919c(componentName, i11, true));
                }
            }
        } finally {
            C38361b.m86560a(cursorQuery);
        }
    }

    /* JADX INFO: renamed from: c */
    public final ContentValues m85919c(ComponentName componentName, int i11, boolean z11) {
        ContentValues contentValues = new ContentValues();
        if (z11) {
            contentValues.put(TPDownloadProxyEnum.DLPARAM_PACKAGE, componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i11));
        return contentValues;
    }
}
