package gw;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import p273fw.InterfaceC37725a;

/* JADX INFO: renamed from: gw.k */
/* JADX INFO: compiled from: SonyHomeBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38050k implements InterfaceC37725a {

    /* JADX INFO: renamed from: a */
    public final Uri f85666a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* JADX INFO: renamed from: b */
    public AsyncQueryHandler f85667b;

    /* JADX INFO: renamed from: gw.k$a */
    /* JADX INFO: compiled from: SonyHomeBadger.java */
    /* JADX INFO: loaded from: classes13.dex */
    public class a extends AsyncQueryHandler {
        public a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m85920d(Context context, ComponentName componentName, int i11) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i11));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i11 > 0);
        context.sendBroadcast(intent);
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: a */
    public List<String> mo85019a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    /* JADX INFO: renamed from: c */
    public final ContentValues m85922c(int i11, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i11));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    /* JADX INFO: renamed from: e */
    public final void m85923e(Context context, ComponentName componentName, int i11) {
        if (i11 < 0) {
            return;
        }
        ContentValues contentValuesM85922c = m85922c(i11, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m85925g(context, contentValuesM85922c);
            return;
        }
        if (this.f85667b == null) {
            this.f85667b = new a(context.getApplicationContext().getContentResolver());
        }
        m85924f(contentValuesM85922c);
    }

    /* JADX INFO: renamed from: f */
    public final void m85924f(ContentValues contentValues) {
        this.f85667b.startInsert(0, null, this.f85666a, contentValues);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m85921h(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            return false;
        }
        return true;
    }

    @Override // p273fw.InterfaceC37725a
    /* JADX INFO: renamed from: b */
    public void mo85020b(Context context, ComponentName componentName, int i11) throws ShortcutBadgeException {
        if (m85921h(context)) {
            m85923e(context, componentName, i11);
        } else {
            m85920d(context, componentName, i11);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m85925g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f85666a, contentValues);
    }
}
