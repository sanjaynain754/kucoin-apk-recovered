package p476ns;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.kubi.notice.lib.p103ui.xtoast.WindowLayout;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import gs.C38009a;

/* JADX INFO: renamed from: ns.e */
/* JADX INFO: compiled from: XToast.java */
/* JADX INFO: loaded from: classes30.dex */
public class RunnableC42867e implements Runnable {

    /* JADX INFO: renamed from: j */
    public static final Handler f94930j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public Context f94931b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f94932c;

    /* JADX INFO: renamed from: d */
    public WindowManager f94933d;

    /* JADX INFO: renamed from: e */
    public WindowManager.LayoutParams f94934e;

    /* JADX INFO: renamed from: f */
    public boolean f94935f;

    /* JADX INFO: renamed from: g */
    public int f94936g;

    /* JADX INFO: renamed from: h */
    public C42864b f94937h;

    /* JADX INFO: renamed from: i */
    public b f94938i;

    /* JADX INFO: renamed from: ns.e$a */
    /* JADX INFO: compiled from: XToast.java */
    public interface a<V extends View> {
        /* JADX INFO: renamed from: a */
        void mo43213a(RunnableC42867e runnableC42867e, V v11);
    }

    /* JADX INFO: renamed from: ns.e$c */
    /* JADX INFO: compiled from: XToast.java */
    public interface c<V extends View> {
        /* JADX INFO: renamed from: a */
        boolean mo92829a(RunnableC42867e runnableC42867e, V v11, MotionEvent motionEvent);
    }

    public RunnableC42867e(Activity activity) {
        this((Context) activity);
        if ((activity.getWindow().getAttributes().flags & 1024) != 0 || (activity.getWindow().getDecorView().getSystemUiVisibility() & 4) != 0) {
            m94011a(1024);
        }
        this.f94937h = new C42864b(this, activity);
    }

    /* JADX INFO: renamed from: a */
    public RunnableC42867e m94011a(int i11) {
        WindowManager.LayoutParams layoutParams = this.f94934e;
        layoutParams.flags = i11 | layoutParams.flags;
        m94030t();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m94012b() {
        if (this.f94935f) {
            try {
                try {
                    C42864b c42864b = this.f94937h;
                    if (c42864b != null) {
                        c42864b.m94010b();
                    }
                    this.f94933d.removeViewImmediate(this.f94932c);
                    m94018h(this);
                    b bVar = this.f94938i;
                    if (bVar != null) {
                        bVar.mo43208c(this);
                    }
                } finally {
                    this.f94935f = false;
                }
            } catch (IllegalArgumentException e11) {
                e = e11;
                C38009a.m85881b(e, "xtoast", "销毁悬浮窗");
                this.f94935f = false;
            } catch (IllegalStateException e12) {
                e = e12;
                C38009a.m85881b(e, "xtoast", "销毁悬浮窗");
                this.f94935f = false;
            } catch (NullPointerException e13) {
                e = e13;
                C38009a.m85881b(e, "xtoast", "销毁悬浮窗");
                this.f94935f = false;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public RunnableC42867e m94013c(int i11) {
        WindowManager.LayoutParams layoutParams = this.f94934e;
        layoutParams.flags = (~i11) & layoutParams.flags;
        m94030t();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public boolean m94014d() {
        return this.f94935f;
    }

    /* JADX INFO: renamed from: e */
    public boolean m94015e(Runnable runnable, long j11) {
        return f94930j.postAtTime(runnable, this, j11);
    }

    /* JADX INFO: renamed from: f */
    public boolean m94016f(Runnable runnable, long j11) {
        if (j11 < 0) {
            j11 = 0;
        }
        return m94015e(runnable, SystemClock.uptimeMillis() + j11);
    }

    /* JADX INFO: renamed from: h */
    public void m94018h(Runnable runnable) {
        f94930j.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: i */
    public RunnableC42867e m94019i(int i11) {
        this.f94934e.windowAnimations = i11;
        m94030t();
        return this;
    }

    /* JADX INFO: renamed from: j */
    public RunnableC42867e m94020j(View view) {
        int i11;
        if (this.f94932c.getChildCount() > 0) {
            this.f94932c.removeAllViews();
        }
        this.f94932c.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
        }
        WindowManager.LayoutParams layoutParams2 = this.f94934e;
        if (layoutParams2.gravity == 0) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int i12 = ((FrameLayout.LayoutParams) layoutParams).gravity;
                if (i12 != -1) {
                    layoutParams2.gravity = i12;
                }
            } else if ((layoutParams instanceof LinearLayout.LayoutParams) && (i11 = ((LinearLayout.LayoutParams) layoutParams).gravity) != -1) {
                layoutParams2.gravity = i11;
            }
            if (layoutParams2.gravity == 0) {
                layoutParams2.gravity = 17;
            }
        }
        if (layoutParams != null) {
            int i13 = layoutParams2.width;
            if (i13 == -2 && layoutParams2.height == -2) {
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams.width = i13;
                layoutParams.height = layoutParams2.height;
            }
        }
        m94030t();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public RunnableC42867e m94021k(int i11) {
        this.f94936g = i11;
        if (m94014d() && this.f94936g != 0) {
            m94018h(this);
            m94016f(this, this.f94936g);
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public RunnableC42867e m94022l(int i11) {
        this.f94934e.gravity = i11;
        m94030t();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final RunnableC42867e m94023m(View view, a<? extends View> aVar) {
        m94013c(16);
        view.setClickable(true);
        view.setOnClickListener(new ViewOnClickListenerC42865c(this, aVar));
        return this;
    }

    /* JADX INFO: renamed from: n */
    public RunnableC42867e m94024n(a<? extends View> aVar) {
        return m94023m(this.f94932c, aVar);
    }

    /* JADX INFO: renamed from: o */
    public RunnableC42867e m94025o(b bVar) {
        this.f94938i = bVar;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final RunnableC42867e m94026p(View view, c<? extends View> cVar) {
        m94013c(16);
        view.setEnabled(true);
        view.setOnTouchListener(new ViewOnTouchListenerC42866d(this, cVar));
        return this;
    }

    /* JADX INFO: renamed from: q */
    public RunnableC42867e m94027q(c<? extends View> cVar) {
        return m94026p(this.f94932c, cVar);
    }

    /* JADX INFO: renamed from: r */
    public RunnableC42867e m94028r(int i11) {
        View childAt;
        ViewGroup.LayoutParams layoutParams;
        this.f94934e.width = i11;
        if (this.f94932c.getChildCount() > 0 && (layoutParams = (childAt = this.f94932c.getChildAt(0)).getLayoutParams()) != null && layoutParams.width != i11) {
            layoutParams.width = i11;
            childAt.setLayoutParams(layoutParams);
        }
        m94030t();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public void m94029s() {
        if (this.f94932c.getChildCount() == 0 || this.f94934e == null) {
            throw new IllegalArgumentException("WindowParams and view cannot be empty");
        }
        if (this.f94935f) {
            m94030t();
            return;
        }
        Context context = this.f94931b;
        if ((context instanceof Activity) && (((Activity) context).isFinishing() || ((Activity) this.f94931b).isDestroyed())) {
            return;
        }
        try {
            if (this.f94932c.getParent() != null) {
                this.f94933d.removeViewImmediate(this.f94932c);
            }
            this.f94933d.addView(this.f94932c, this.f94934e);
            this.f94935f = true;
            if (this.f94936g != 0) {
                m94018h(this);
                m94016f(this, this.f94936g);
            }
            C42864b c42864b = this.f94937h;
            if (c42864b != null) {
                c42864b.m94009a();
            }
            b bVar = this.f94938i;
            if (bVar != null) {
                bVar.m94031a(this);
            }
        } catch (WindowManager.BadTokenException e11) {
            e = e11;
            C38009a.m85881b(e, "xtoast", "View 对象被重复添加到 WindowManager");
        } catch (IllegalArgumentException e12) {
            e = e12;
            C38009a.m85881b(e, "xtoast", "View 对象被重复添加到 WindowManager");
        } catch (IllegalStateException e13) {
            e = e13;
            C38009a.m85881b(e, "xtoast", "View 对象被重复添加到 WindowManager");
        } catch (NullPointerException e14) {
            e = e14;
            C38009a.m85881b(e, "xtoast", "View 对象被重复添加到 WindowManager");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m94017g() {
        if (m94014d()) {
            m94012b();
        }
        b bVar = this.f94938i;
        if (bVar != null) {
            bVar.m94032b(this);
        }
        this.f94938i = null;
        this.f94931b = null;
        this.f94932c = null;
        this.f94933d = null;
        this.f94934e = null;
        this.f94937h = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        m94012b();
    }

    /* JADX INFO: renamed from: t */
    public void m94030t() {
        if (!m94014d()) {
            return;
        }
        this.f94933d.updateViewLayout(this.f94932c, this.f94934e);
    }

    public RunnableC42867e(Context context) {
        this.f94931b = context;
        this.f94932c = new WindowLayout(context);
        this.f94933d = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f94934e = layoutParams;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation.Toast;
        layoutParams.packageName = context.getPackageName();
        this.f94934e.flags = 40;
    }

    /* JADX INFO: renamed from: ns.e$b */
    /* JADX INFO: compiled from: XToast.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        default void m94031a(RunnableC42867e runnableC42867e) {
        }

        /* JADX INFO: renamed from: b */
        default void m94032b(RunnableC42867e runnableC42867e) {
        }

        /* JADX INFO: renamed from: c */
        default void mo43208c(RunnableC42867e runnableC42867e) {
        }
    }
}
