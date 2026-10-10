package com.tencent.bugly.proguard;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.bugly.common.util.ClassUtil;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.q1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33869q1 {

    /* JADX INFO: renamed from: d */
    public static final String f71514d = "RMonitor_BigBitmap_Detector";

    /* JADX INFO: renamed from: e */
    public static final int f71515e = 500;

    /* JADX INFO: renamed from: a */
    public final InterfaceC33687h8 f71516a;

    /* JADX INFO: renamed from: b */
    public final Map<String, AbstractC33573c> f71517b = new HashMap();

    /* JADX INFO: renamed from: c */
    public LinkedList<C33642f5> f71518c = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    public void m74640a(AbstractC33573c abstractC33573c) {
        if (this.f71517b.containsKey(abstractC33573c.m72624a())) {
            return;
        }
        this.f71517b.put(abstractC33573c.m72624a(), abstractC33573c);
    }

    /* JADX INFO: renamed from: b */
    public final String m74643b(View view) {
        String string;
        String className = ClassUtil.getClassName(view, null);
        try {
            Object tag = view.getTag();
            string = tag != null ? tag.toString() : "NO_TAG";
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f71514d, th2);
        }
        return className + "(tag/" + string + ")";
    }

    public C33869q1(InterfaceC33687h8 interfaceC33687h8) {
        this.f71516a = interfaceC33687h8;
    }

    /* JADX INFO: renamed from: a */
    public void m74641a(List<C33642f5> list, String str, String str2, View view) {
        Drawable background = view.getBackground();
        Drawable drawable = view instanceof ImageView ? ((ImageView) view).getDrawable() : null;
        for (AbstractC33573c abstractC33573c : this.f71517b.values()) {
            m74642a(list, str, str2, view, abstractC33573c.mo72623a(background));
            m74642a(list, str, str2, view, abstractC33573c.mo72625b(drawable));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74642a(List<C33642f5> list, String str, String str2, View view, C33912s4 c33912s4) {
        if (c33912s4 == null || !this.f71516a.mo73255a(c33912s4.f71812b, c33912s4.f71813c, view.getWidth(), view.getHeight()).booleanValue()) {
            return;
        }
        C33642f5 c33642f5 = new C33642f5(str, m74639a(view), m74643b(view), str2, view.getWidth(), view.getHeight(), c33912s4.f71812b, c33912s4.f71813c, c33912s4.f71811a, c33912s4.f71814d, c33912s4.f71815e, System.currentTimeMillis());
        if (!this.f71518c.isEmpty()) {
            Iterator<C33642f5> it = this.f71518c.iterator();
            while (it.hasNext()) {
                if (it.next().equals(c33642f5)) {
                    Logger.INSTANCE.mo77132i(f71514d, "has reported, history's size = " + this.f71518c.size());
                    return;
                }
            }
        }
        list.add(c33642f5);
        this.f71518c.addFirst(c33642f5);
        while (this.f71518c.size() > 500) {
            this.f71518c.removeLast();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m74639a(View view) {
        String resourceName;
        String className = ClassUtil.getClassName(view, null);
        try {
            if (view.getId() != -1) {
                resourceName = view.getResources().getResourceName(view.getId());
            } else {
                resourceName = "NO_ID";
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f71514d, th2);
        }
        return className + "(id/" + resourceName + ")";
    }
}
