package p445m2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.R$id;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p419l2.InterfaceC42029c;
import p523p2.C43363j;

/* JADX INFO: renamed from: m2.k */
/* JADX INFO: compiled from: ViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC42400k<T extends View, Z> extends AbstractC42390a<Z> {

    /* JADX INFO: renamed from: h */
    public static boolean f94004h;

    /* JADX INFO: renamed from: i */
    public static int f94005i = R$id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: c */
    public final T f94006c;

    /* JADX INFO: renamed from: d */
    public final a f94007d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public View.OnAttachStateChangeListener f94008e;

    /* JADX INFO: renamed from: f */
    public boolean f94009f;

    /* JADX INFO: renamed from: g */
    public boolean f94010g;

    /* JADX INFO: renamed from: m2.k$a */
    /* JADX INFO: compiled from: ViewTarget.java */
    @VisibleForTesting
    public static final class a {

        /* JADX INFO: renamed from: e */
        @Nullable
        @VisibleForTesting
        public static Integer f94011e;

        /* JADX INFO: renamed from: a */
        public final View f94012a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC42398i> f94013b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f94014c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public ViewTreeObserverOnPreDrawListenerC47014a f94015d;

        /* JADX INFO: renamed from: m2.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ViewTarget.java */
        public static final class ViewTreeObserverOnPreDrawListenerC47014a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b */
            public final WeakReference<a> f94016b;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f94016b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m93092a();
                return true;
            }

            public ViewTreeObserverOnPreDrawListenerC47014a(@NonNull a aVar) {
                this.f94016b = new WeakReference<>(aVar);
            }
        }

        /* JADX INFO: renamed from: c */
        public static int m93091c(@NonNull Context context) {
            if (f94011e == null) {
                Display defaultDisplay = ((WindowManager) C43363j.m95506d((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f94011e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f94011e.intValue();
        }

        /* JADX INFO: renamed from: a */
        public void m93092a() {
            if (this.f94013b.isEmpty()) {
                return;
            }
            int iM93097g = m93097g();
            int iM93096f = m93096f();
            if (m93099i(iM93097g, iM93096f)) {
                m93100j(iM93097g, iM93096f);
                m93093b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m93093b() {
            ViewTreeObserver viewTreeObserver = this.f94012a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f94015d);
            }
            this.f94015d = null;
            this.f94013b.clear();
        }

        /* JADX INFO: renamed from: e */
        public final int m93095e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f94014c && this.f94012a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f94012a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m93091c(this.f94012a.getContext());
        }

        /* JADX INFO: renamed from: f */
        public final int m93096f() {
            int paddingTop = this.f94012a.getPaddingTop() + this.f94012a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f94012a.getLayoutParams();
            return m93095e(this.f94012a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* JADX INFO: renamed from: g */
        public final int m93097g() {
            int paddingLeft = this.f94012a.getPaddingLeft() + this.f94012a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f94012a.getLayoutParams();
            return m93095e(this.f94012a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m93098h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: j */
        public final void m93100j(int i11, int i12) {
            Iterator it = new ArrayList(this.f94013b).iterator();
            while (it.hasNext()) {
                ((InterfaceC42398i) it.next()).mo6939e(i11, i12);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m93101k(@NonNull InterfaceC42398i interfaceC42398i) {
            this.f94013b.remove(interfaceC42398i);
        }

        public a(@NonNull View view) {
            this.f94012a = view;
        }

        /* JADX INFO: renamed from: d */
        public void m93094d(@NonNull InterfaceC42398i interfaceC42398i) {
            int iM93097g = m93097g();
            int iM93096f = m93096f();
            if (m93099i(iM93097g, iM93096f)) {
                interfaceC42398i.mo6939e(iM93097g, iM93096f);
                return;
            }
            if (!this.f94013b.contains(interfaceC42398i)) {
                this.f94013b.add(interfaceC42398i);
            }
            if (this.f94015d == null) {
                ViewTreeObserver viewTreeObserver = this.f94012a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC47014a viewTreeObserverOnPreDrawListenerC47014a = new ViewTreeObserverOnPreDrawListenerC47014a(this);
                this.f94015d = viewTreeObserverOnPreDrawListenerC47014a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC47014a);
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m93099i(int i11, int i12) {
            if (m93098h(i11) && m93098h(i12)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m93090k(@Nullable Object obj) {
        f94004h = true;
        this.f94006c.setTag(f94005i, obj);
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public static void m93086l(int i11) {
        if (f94004h) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f94005i = i11;
    }

    @Override // p445m2.InterfaceC42399j
    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo92228a(@NonNull InterfaceC42398i interfaceC42398i) {
        this.f94007d.m93094d(interfaceC42398i);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m93087b() {
        return this.f94006c.getTag(f94005i);
    }

    /* JADX INFO: renamed from: d */
    public final void m93088d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f94008e;
        if (onAttachStateChangeListener == null || this.f94010g) {
            return;
        }
        this.f94006c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f94010g = true;
    }

    @Override // p445m2.InterfaceC42399j
    @CallSuper
    /* JADX INFO: renamed from: f */
    public void mo92229f(@NonNull InterfaceC42398i interfaceC42398i) {
        this.f94007d.m93101k(interfaceC42398i);
    }

    /* JADX INFO: renamed from: j */
    public final void m93089j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f94008e;
        if (onAttachStateChangeListener == null || !this.f94010g) {
            return;
        }
        this.f94006c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f94010g = false;
    }

    public String toString() {
        return "Target for: " + this.f94006c;
    }

    public AbstractC42400k(@NonNull T t11) {
        this.f94006c = (T) C43363j.m95506d(t11);
        this.f94007d = new a(t11);
    }

    @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
    @CallSuper
    /* JADX INFO: renamed from: c */
    public void mo59882c(@Nullable Drawable drawable) {
        super.mo59882c(drawable);
        this.f94007d.m93093b();
        if (!this.f94009f) {
            m93089j();
        }
    }

    @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: g */
    public void mo92230g(@Nullable InterfaceC42029c interfaceC42029c) {
        m93090k(interfaceC42029c);
    }

    @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
    @Nullable
    public InterfaceC42029c getRequest() {
        Object objM93087b = m93087b();
        if (objM93087b != null) {
            if (objM93087b instanceof InterfaceC42029c) {
                return (InterfaceC42029c) objM93087b;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
    @CallSuper
    /* JADX INFO: renamed from: h */
    public void mo92231h(@Nullable Drawable drawable) {
        super.mo92231h(drawable);
        m93088d();
    }
}
