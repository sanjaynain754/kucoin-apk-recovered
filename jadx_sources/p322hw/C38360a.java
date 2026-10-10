package p322hw;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: hw.a */
/* JADX INFO: compiled from: BroadcastHelper.java */
/* JADX INFO: loaded from: classes12.dex */
public class C38360a {
    /* JADX INFO: renamed from: b */
    public static void m86558b(Context context, Intent intent) throws ShortcutBadgeException {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                m86559c(context, intent2);
                return;
            } catch (ShortcutBadgeException unused) {
            }
        }
        m86559c(context, intent);
    }

    /* JADX INFO: renamed from: a */
    public static List<ResolveInfo> m86557a(Context context, Intent intent) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null) {
            return listQueryBroadcastReceivers;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: c */
    public static void m86559c(Context context, Intent intent) throws ShortcutBadgeException {
        List<ResolveInfo> listM86557a = m86557a(context, intent);
        if (listM86557a.size() != 0) {
            for (ResolveInfo resolveInfo : listM86557a) {
                Intent intent2 = new Intent(intent);
                if (resolveInfo != null) {
                    intent2.setPackage(resolveInfo.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent.toString());
    }
}
