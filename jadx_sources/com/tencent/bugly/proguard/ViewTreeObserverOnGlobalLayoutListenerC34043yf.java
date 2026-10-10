package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.util.ClassUtil;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.yf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC34043yf implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: f */
    public static final String f72563f = "RMonitor_BigBitmap_RootViewDetectListener";

    /* JADX INFO: renamed from: g */
    public static final int f72564g = 0;

    /* JADX INFO: renamed from: h */
    public static final Long f72565h = 1000L;

    /* JADX INFO: renamed from: a */
    public final String f72566a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<View> f72567b;

    /* JADX INFO: renamed from: c */
    public final C33869q1 f72568c;

    /* JADX INFO: renamed from: d */
    public final C33909s1 f72569d;

    /* JADX INFO: renamed from: e */
    public final Handler f72570e = new a(ThreadManager.getMonitorThreadLooper());

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.yf$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC34043yf.this.f72567b == null || ViewTreeObserverOnGlobalLayoutListenerC34043yf.this.f72567b.get() == null || !(ViewTreeObserverOnGlobalLayoutListenerC34043yf.this.f72567b.get() instanceof ViewGroup)) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ViewTreeObserverOnGlobalLayoutListenerC34043yf viewTreeObserverOnGlobalLayoutListenerC34043yf = ViewTreeObserverOnGlobalLayoutListenerC34043yf.this;
                viewTreeObserverOnGlobalLayoutListenerC34043yf.m75537a(arrayList, viewTreeObserverOnGlobalLayoutListenerC34043yf.f72566a, ClassUtil.getClassName(viewTreeObserverOnGlobalLayoutListenerC34043yf.f72567b.get(), null), ViewTreeObserverOnGlobalLayoutListenerC34043yf.this.f72567b.get());
                if (arrayList.size() > 0) {
                    ViewTreeObserverOnGlobalLayoutListenerC34043yf.this.m75536a(arrayList);
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(ViewTreeObserverOnGlobalLayoutListenerC34043yf.f72563f, th2);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f72570e.removeMessages(0);
        this.f72570e.sendEmptyMessageDelayed(0, f72565h.longValue());
    }

    public ViewTreeObserverOnGlobalLayoutListenerC34043yf(String str, View view, C33869q1 c33869q1, C33909s1 c33909s1) {
        this.f72566a = str;
        this.f72567b = new WeakReference<>(view);
        this.f72568c = c33869q1;
        this.f72569d = c33909s1;
    }

    /* JADX INFO: renamed from: a */
    public final void m75537a(List<C33642f5> list, String str, String str2, View view) {
        if (view == null || view.getVisibility() == 8 || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        this.f72568c.m74641a(list, str, str2, view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt != null) {
                        m75537a(list, str, str2 + " \n " + ClassUtil.getClassName(childAt, Integer.valueOf(i11)), childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75536a(List<C33642f5> list) {
        this.f72569d.m74900b(list);
        for (T t11 : ListenerManager.bigBitmapListener.getListenerList()) {
            if (t11 instanceof InterfaceC33666g8) {
                ((InterfaceC33666g8) t11).m73166a(list);
            }
        }
    }
}
