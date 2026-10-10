package p273fw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.kubi.resources.widget.badger.ShortcutBadgeException;
import gw.C38040a;
import gw.C38041b;
import gw.C38042c;
import gw.C38043d;
import gw.C38044e;
import gw.C38045f;
import gw.C38046g;
import gw.C38047h;
import gw.C38048i;
import gw.C38049j;
import gw.C38050k;
import gw.C38051l;
import gw.C38052m;
import gw.C38053n;
import gw.C38054o;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ro.C44127a;

/* JADX INFO: renamed from: fw.b */
/* JADX INFO: compiled from: ShortcutBadger.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37726b {

    /* JADX INFO: renamed from: a */
    public static final List<Class<? extends InterfaceC37725a>> f84998a;

    /* JADX INFO: renamed from: b */
    public static final Object f84999b;

    /* JADX INFO: renamed from: c */
    public static InterfaceC37725a f85000c;

    /* JADX INFO: renamed from: d */
    public static ComponentName f85001d;

    /* JADX INFO: renamed from: e */
    public static boolean m85025e(Context context) {
        return m85021a(context, 0);
    }

    static {
        LinkedList linkedList = new LinkedList();
        f84998a = linkedList;
        f84999b = new Object();
        linkedList.add(C38040a.class);
        linkedList.add(C38041b.class);
        linkedList.add(C38043d.class);
        linkedList.add(C38046g.class);
        linkedList.add(C38047h.class);
        linkedList.add(C38050k.class);
        linkedList.add(C38042c.class);
        linkedList.add(C38045f.class);
        linkedList.add(C38048i.class);
        linkedList.add(C38049j.class);
        linkedList.add(C38054o.class);
        linkedList.add(C38051l.class);
        linkedList.add(C38053n.class);
        linkedList.add(C38044e.class);
        linkedList.add(C38052m.class);
    }

    /* JADX INFO: renamed from: b */
    public static void m85022b(Context context, int i11) throws ShortcutBadgeException {
        if (f85000c == null && !m85023c(context)) {
            throw new ShortcutBadgeException("No default launcher available");
        }
        try {
            f85000c.mo85020b(context, f85001d, i11);
        } catch (Exception e11) {
            throw new ShortcutBadgeException("Unable to execute badge", e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m85024d(Context context, String str) {
        if ("com.yandex.launcher".equals(str)) {
            return C38052m.m85926c(context);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85021a(Context context, int i11) {
        try {
            m85022b(context, i11);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m85023c(Context context) {
        InterfaceC37725a interfaceC37725aNewInstance;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            C44127a.m97245e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f85001d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        m85026f(context.getPackageManager().resolveActivity(intent, 65536), listQueryIntentActivities);
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator<Class<? extends InterfaceC37725a>> it2 = f84998a.iterator();
            while (it2.hasNext()) {
                try {
                    interfaceC37725aNewInstance = it2.next().newInstance();
                } catch (Exception unused) {
                    interfaceC37725aNewInstance = null;
                }
                if (interfaceC37725aNewInstance != null && interfaceC37725aNewInstance.mo85019a().contains(str)) {
                    if (!m85024d(context, str)) {
                        break;
                    }
                    f85000c = interfaceC37725aNewInstance;
                    break;
                }
            }
            if (f85000c != null) {
                break;
            }
        }
        if (f85000c == null) {
            String str2 = Build.MANUFACTURER;
            if (str2.equalsIgnoreCase("ZUK")) {
                f85000c = new C38054o();
                return true;
            }
            if (str2.equalsIgnoreCase("OPPO")) {
                f85000c = new C38048i();
                return true;
            }
            if (str2.equalsIgnoreCase("VIVO")) {
                f85000c = new C38051l();
                return true;
            }
            if (str2.equalsIgnoreCase("ZTE")) {
                f85000c = new C38053n();
                return true;
            }
            f85000c = new C38043d();
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static void m85026f(ResolveInfo resolveInfo, List<ResolveInfo> list) {
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (list.get(i12).activityInfo.packageName.equals(resolveInfo.activityInfo.packageName)) {
                i11 = i12;
            }
        }
        Collections.swap(list, 0, i11);
    }
}
