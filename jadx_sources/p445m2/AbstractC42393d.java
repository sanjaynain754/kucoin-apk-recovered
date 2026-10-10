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
import androidx.annotation.IdRes;
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

/* JADX INFO: renamed from: m2.d */
/* JADX INFO: compiled from: CustomViewTarget.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC42393d<T extends View, Z> implements InterfaceC42399j<Z> {

    /* JADX INFO: renamed from: g */
    @IdRes
    public static final int f93989g = R$id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: b */
    public final a f93990b;

    /* JADX INFO: renamed from: c */
    public final T f93991c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public View.OnAttachStateChangeListener f93992d;

    /* JADX INFO: renamed from: e */
    public boolean f93993e;

    /* JADX INFO: renamed from: f */
    public boolean f93994f;

    /* JADX INFO: renamed from: m2.d$a */
    /* JADX INFO: compiled from: CustomViewTarget.java */
    @VisibleForTesting
    public static final class a {

        /* JADX INFO: renamed from: e */
        @Nullable
        @VisibleForTesting
        public static Integer f93995e;

        /* JADX INFO: renamed from: a */
        public final View f93996a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC42398i> f93997b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f93998c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public ViewTreeObserverOnPreDrawListenerC47013a f93999d;

        /* JADX INFO: renamed from: m2.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CustomViewTarget.java */
        public static final class ViewTreeObserverOnPreDrawListenerC47013a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b */
            public final WeakReference<a> f94000b;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f94000b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m93071a();
                return true;
            }

            public ViewTreeObserverOnPreDrawListenerC47013a(@NonNull a aVar) {
                this.f94000b = new WeakReference<>(aVar);
            }
        }

        /* JADX INFO: renamed from: c */
        public static int m93070c(@NonNull Context context) {
            if (f93995e == null) {
                Display defaultDisplay = ((WindowManager) C43363j.m95506d((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f93995e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f93995e.intValue();
        }

        /* JADX INFO: renamed from: a */
        public void m93071a() {
            if (this.f93997b.isEmpty()) {
                return;
            }
            int iM93076g = m93076g();
            int iM93075f = m93075f();
            if (m93078i(iM93076g, iM93075f)) {
                m93079j(iM93076g, iM93075f);
                m93072b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m93072b() {
            ViewTreeObserver viewTreeObserver = this.f93996a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f93999d);
            }
            this.f93999d = null;
            this.f93997b.clear();
        }

        /* JADX INFO: renamed from: e */
        public final int m93074e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f93998c && this.f93996a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f93996a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m93070c(this.f93996a.getContext());
        }

        /* JADX INFO: renamed from: f */
        public final int m93075f() {
            int paddingTop = this.f93996a.getPaddingTop() + this.f93996a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f93996a.getLayoutParams();
            return m93074e(this.f93996a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* JADX INFO: renamed from: g */
        public final int m93076g() {
            int paddingLeft = this.f93996a.getPaddingLeft() + this.f93996a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f93996a.getLayoutParams();
            return m93074e(this.f93996a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m93077h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: j */
        public final void m93079j(int i11, int i12) {
            Iterator it = new ArrayList(this.f93997b).iterator();
            while (it.hasNext()) {
                ((InterfaceC42398i) it.next()).mo6939e(i11, i12);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m93080k(@NonNull InterfaceC42398i interfaceC42398i) {
            this.f93997b.remove(interfaceC42398i);
        }

        public a(@NonNull View view) {
            this.f93996a = view;
        }

        /* JADX INFO: renamed from: d */
        public void m93073d(@NonNull InterfaceC42398i interfaceC42398i) {
            int iM93076g = m93076g();
            int iM93075f = m93075f();
            if (m93078i(iM93076g, iM93075f)) {
                interfaceC42398i.mo6939e(iM93076g, iM93075f);
                return;
            }
            if (!this.f93997b.contains(interfaceC42398i)) {
                this.f93997b.add(interfaceC42398i);
            }
            if (this.f93999d == null) {
                ViewTreeObserver viewTreeObserver = this.f93996a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC47013a viewTreeObserverOnPreDrawListenerC47013a = new ViewTreeObserverOnPreDrawListenerC47013a(this);
                this.f93999d = viewTreeObserverOnPreDrawListenerC47013a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC47013a);
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m93078i(int i11, int i12) {
            if (m93077h(i11) && m93077h(i12)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo6641k(@Nullable Drawable drawable);

    @Nullable
    /* JADX INFO: renamed from: b */
    private Object m93065b() {
        return this.f93991c.getTag(f93989g);
    }

    /* JADX INFO: renamed from: d */
    private void m93066d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f93992d;
        if (onAttachStateChangeListener == null || this.f93994f) {
            return;
        }
        this.f93991c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f93994f = true;
    }

    /* JADX INFO: renamed from: j */
    private void m93067j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f93992d;
        if (onAttachStateChangeListener == null || !this.f93994f) {
            return;
        }
        this.f93991c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f93994f = false;
    }

    /* JADX INFO: renamed from: m */
    private void m93068m(@Nullable Object obj) {
        this.f93991c.setTag(f93989g, obj);
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: a */
    public final void mo92228a(@NonNull InterfaceC42398i interfaceC42398i) {
        this.f93990b.m93073d(interfaceC42398i);
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: c */
    public final void mo59882c(@Nullable Drawable drawable) {
        this.f93990b.m93072b();
        mo6641k(drawable);
        if (this.f93993e) {
            return;
        }
        m93067j();
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: f */
    public final void mo92229f(@NonNull InterfaceC42398i interfaceC42398i) {
        this.f93990b.m93080k(interfaceC42398i);
    }

    public String toString() {
        return "Target for: " + this.f93991c;
    }

    public AbstractC42393d(@NonNull T t11) {
        this.f93991c = (T) C43363j.m95506d(t11);
        this.f93990b = new a(t11);
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: g */
    public final void mo92230g(@Nullable InterfaceC42029c interfaceC42029c) {
        m93068m(interfaceC42029c);
    }

    @Override // p445m2.InterfaceC42399j
    @Nullable
    public final InterfaceC42029c getRequest() {
        Object objM93065b = m93065b();
        if (objM93065b != null) {
            if (objM93065b instanceof InterfaceC42029c) {
                return (InterfaceC42029c) objM93065b;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: h */
    public final void mo92231h(@Nullable Drawable drawable) {
        m93066d();
        m93069l(drawable);
    }

    @Override // p329i2.InterfaceC38421m
    public void onDestroy() {
    }

    @Override // p329i2.InterfaceC38421m
    public void onStart() {
    }

    @Override // p329i2.InterfaceC38421m
    public void onStop() {
    }

    /* JADX INFO: renamed from: l */
    public void m93069l(@Nullable Drawable drawable) {
    }
}
