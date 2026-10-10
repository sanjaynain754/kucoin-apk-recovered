package qe0;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.widget.PopupWindowCompat;
import qe0.AbstractC43723a;

/* JADX INFO: renamed from: qe0.a */
/* JADX INFO: compiled from: BasePopup.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC43723a<T extends AbstractC43723a> implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public PopupWindow f96649b;

    /* JADX INFO: renamed from: c */
    public Context f96650c;

    /* JADX INFO: renamed from: d */
    public View f96651d;

    /* JADX INFO: renamed from: e */
    public int f96652e;

    /* JADX INFO: renamed from: j */
    public int f96657j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f96658k;

    /* JADX INFO: renamed from: l */
    public boolean f96659l;

    /* JADX INFO: renamed from: o */
    @NonNull
    public ViewGroup f96662o;

    /* JADX INFO: renamed from: p */
    public Transition f96663p;

    /* JADX INFO: renamed from: q */
    public Transition f96664q;

    /* JADX INFO: renamed from: s */
    public View f96666s;

    /* JADX INFO: renamed from: v */
    public int f96669v;

    /* JADX INFO: renamed from: w */
    public int f96670w;

    /* JADX INFO: renamed from: f */
    public boolean f96653f = true;

    /* JADX INFO: renamed from: g */
    public boolean f96654g = true;

    /* JADX INFO: renamed from: h */
    public int f96655h = -2;

    /* JADX INFO: renamed from: i */
    public int f96656i = -2;

    /* JADX INFO: renamed from: m */
    public float f96660m = 0.7f;

    /* JADX INFO: renamed from: n */
    @ColorInt
    public int f96661n = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: r */
    public boolean f96665r = true;

    /* JADX INFO: renamed from: t */
    public int f96667t = 2;

    /* JADX INFO: renamed from: u */
    public int f96668u = 1;

    /* JADX INFO: renamed from: x */
    public int f96671x = 0;

    /* JADX INFO: renamed from: y */
    public int f96672y = 1;

    /* JADX INFO: renamed from: z */
    public boolean f96673z = false;

    /* JADX INFO: renamed from: A */
    public boolean f96647A = false;

    /* JADX INFO: renamed from: B */
    public boolean f96648B = false;

    /* JADX INFO: renamed from: qe0.a$a */
    /* JADX INFO: compiled from: BasePopup.java */
    public class a implements View.OnKeyListener {
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i11, KeyEvent keyEvent) {
            if (i11 != 4) {
                return false;
            }
            AbstractC43723a.this.f96649b.dismiss();
            return true;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: qe0.a$b */
    /* JADX INFO: compiled from: BasePopup.java */
    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0 && (x11 < 0 || x11 >= AbstractC43723a.this.f96655h || y11 < 0 || y11 >= AbstractC43723a.this.f96656i)) {
                Log.d("EasyPopup", "onTouch outside:mWidth=" + AbstractC43723a.this.f96655h + ",mHeight=" + AbstractC43723a.this.f96656i);
                return true;
            }
            if (motionEvent.getAction() == 4) {
                Log.d("EasyPopup", "onTouch outside event:mWidth=" + AbstractC43723a.this.f96655h + ",mHeight=" + AbstractC43723a.this.f96656i);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: qe0.a$c */
    /* JADX INFO: compiled from: BasePopup.java */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            AbstractC43723a.this.m96292A().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            AbstractC43723a abstractC43723a = AbstractC43723a.this;
            abstractC43723a.f96655h = abstractC43723a.m96292A().getWidth();
            AbstractC43723a abstractC43723a2 = AbstractC43723a.this;
            abstractC43723a2.f96656i = abstractC43723a2.m96292A().getHeight();
            AbstractC43723a.this.f96647A = true;
            AbstractC43723a.this.f96673z = false;
            AbstractC43723a.m96287k(AbstractC43723a.this);
            if (AbstractC43723a.this.m96299I() && AbstractC43723a.this.f96648B) {
                AbstractC43723a abstractC43723a3 = AbstractC43723a.this;
                abstractC43723a3.m96321f0(abstractC43723a3.f96655h, AbstractC43723a.this.f96656i, AbstractC43723a.this.f96666s, AbstractC43723a.this.f96667t, AbstractC43723a.this.f96668u, AbstractC43723a.this.f96669v, AbstractC43723a.this.f96670w);
            }
        }
    }

    /* JADX INFO: renamed from: qe0.a$d */
    /* JADX INFO: compiled from: BasePopup.java */
    public interface d {
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo96296E();

    /* JADX INFO: renamed from: H */
    public abstract void mo25306H(View view, T t11);

    /* JADX INFO: renamed from: Q */
    public T m96307Q(@LayoutRes int i11) {
        this.f96651d = null;
        this.f96652e = i11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: b0 */
    public void mo54253b0(View view) {
        m96327u(false);
        m96294C();
        this.f96666s = view;
        if (this.f96673z) {
            m96304N();
        }
        this.f96649b.showAsDropDown(view);
    }

    /* JADX INFO: renamed from: c0 */
    public void m96318c0(View view, int i11, int i12) {
        m96327u(false);
        m96294C();
        this.f96666s = view;
        this.f96669v = i11;
        this.f96670w = i12;
        if (this.f96673z) {
            m96304N();
        }
        this.f96649b.showAsDropDown(view, this.f96669v, this.f96670w);
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: d0 */
    public void m96319d0(View view, int i11, int i12, int i13) {
        m96327u(false);
        m96294C();
        this.f96666s = view;
        this.f96669v = i11;
        this.f96670w = i12;
        if (this.f96673z) {
            m96304N();
        }
        PopupWindowCompat.showAsDropDown(this.f96649b, view, this.f96669v, this.f96670w, i13);
    }

    /* JADX INFO: renamed from: e0 */
    public void m96320e0(@NonNull View view, int i11, int i12, int i13, int i14) {
        m96327u(true);
        this.f96666s = view;
        this.f96669v = i13;
        this.f96670w = i14;
        this.f96667t = i11;
        this.f96668u = i12;
        m96294C();
        int iM96325s = m96325s(view, i12, this.f96655h, this.f96669v);
        int iM96326t = m96326t(view, i11, this.f96656i, this.f96670w);
        if (this.f96673z) {
            m96304N();
        }
        PopupWindowCompat.showAsDropDown(this.f96649b, view, iM96325s, iM96326t, 0);
    }

    /* JADX INFO: renamed from: s */
    public final int m96325s(View view, int i11, int i12, int i13) {
        if (i11 == 0) {
            return i13 + ((view.getWidth() / 2) - (i12 / 2));
        }
        if (i11 == 1) {
            return i13 - i12;
        }
        if (i11 != 2) {
            return i11 != 4 ? i13 : i13 - (i12 - view.getWidth());
        }
        return i13 + view.getWidth();
    }

    /* JADX INFO: renamed from: A */
    public View m96292A() {
        PopupWindow popupWindow = this.f96649b;
        if (popupWindow != null) {
            return popupWindow.getContentView();
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public PopupWindow m96293B() {
        return this.f96649b;
    }

    /* JADX INFO: renamed from: C */
    public final void m96294C() {
        if (this.f96659l) {
            ViewGroup viewGroup = this.f96662o;
            if (viewGroup != null) {
                m96324r(viewGroup);
            } else {
                if (m96292A() == null || m96292A().getContext() == null || !(m96292A().getContext() instanceof Activity)) {
                    return;
                }
                m96323q((Activity) m96292A().getContext());
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m96295D() {
        PopupWindow.OnDismissListener onDismissListener = this.f96658k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        m96328v();
        PopupWindow popupWindow = this.f96649b;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f96649b.dismiss();
        }
        m96302L();
    }

    /* JADX INFO: renamed from: F */
    public final void m96297F() {
        Context context;
        if (this.f96651d == null) {
            if (this.f96652e == 0 || (context = this.f96650c) == null) {
                throw new IllegalArgumentException("The content view is null,the layoutId=" + this.f96652e + ",context=" + this.f96650c);
            }
            this.f96651d = LayoutInflater.from(context).inflate(this.f96652e, (ViewGroup) null);
        }
        this.f96649b.setContentView(this.f96651d);
        int i11 = this.f96655h;
        if (i11 > 0 || i11 == -2 || i11 == -1) {
            this.f96649b.setWidth(i11);
        } else {
            this.f96649b.setWidth(-2);
        }
        int i12 = this.f96656i;
        if (i12 > 0 || i12 == -2 || i12 == -1) {
            this.f96649b.setHeight(i12);
        } else {
            this.f96649b.setHeight(-2);
        }
        m96300J();
        m96304N();
        this.f96649b.setInputMethodMode(this.f96671x);
        this.f96649b.setSoftInputMode(this.f96672y);
    }

    /* JADX INFO: renamed from: G */
    public final void m96298G() {
        if (this.f96665r) {
            this.f96649b.setFocusable(this.f96653f);
            this.f96649b.setOutsideTouchable(this.f96654g);
            this.f96649b.setBackgroundDrawable(new ColorDrawable(0));
            return;
        }
        this.f96649b.setFocusable(true);
        this.f96649b.setOutsideTouchable(false);
        this.f96649b.setBackgroundDrawable(null);
        this.f96649b.getContentView().setFocusable(true);
        this.f96649b.getContentView().setFocusableInTouchMode(true);
        this.f96649b.getContentView().setOnKeyListener(new a());
        this.f96649b.setTouchInterceptor(new b());
    }

    /* JADX INFO: renamed from: I */
    public boolean m96299I() {
        PopupWindow popupWindow = this.f96649b;
        return popupWindow != null && popupWindow.isShowing();
    }

    /* JADX INFO: renamed from: P */
    public T m96306P(boolean z11) {
        this.f96659l = z11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: R */
    public T m96308R(Context context, @LayoutRes int i11) {
        this.f96650c = context;
        this.f96651d = null;
        this.f96652e = i11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: S */
    public T m96309S(View view) {
        this.f96651d = view;
        this.f96652e = 0;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: T */
    public T m96310T(Context context) {
        this.f96650c = context;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: U */
    public T m96311U(@ColorInt int i11) {
        this.f96661n = i11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: V */
    public T m96312V(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        this.f96660m = f11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: W */
    public T m96313W(boolean z11) {
        this.f96665r = z11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: X */
    public T m96314X(boolean z11) {
        this.f96653f = z11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: Y */
    public T m96315Y(PopupWindow.OnDismissListener onDismissListener) {
        this.f96658k = onDismissListener;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: Z */
    public T m96316Z(boolean z11) {
        this.f96654g = z11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: a0 */
    public T m96317a0(int i11) {
        this.f96655h = i11;
        return (T) m96305O();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m96321f0(int i11, int i12, @NonNull View view, int i13, int i14, int i15, int i16) {
        if (this.f96649b == null) {
            return;
        }
        this.f96649b.update(view, m96325s(view, i14, i11, i15), m96326t(view, i13, i12, i16), i11, i12);
    }

    /* JADX INFO: renamed from: p */
    public T m96322p() {
        if (this.f96649b == null) {
            this.f96649b = new PopupWindow();
        }
        m96301K();
        m96297F();
        m96303M(this.f96651d);
        int i11 = this.f96657j;
        if (i11 != 0) {
            this.f96649b.setAnimationStyle(i11);
        }
        m96298G();
        this.f96649b.setOnDismissListener(this);
        Transition transition = this.f96663p;
        if (transition != null) {
            this.f96649b.setEnterTransition(transition);
        }
        Transition transition2 = this.f96664q;
        if (transition2 != null) {
            this.f96649b.setExitTransition(transition2);
        }
        return (T) m96305O();
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: r */
    public final void m96324r(ViewGroup viewGroup) {
        ColorDrawable colorDrawable = new ColorDrawable(this.f96661n);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.f96660m * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    /* JADX INFO: renamed from: t */
    public final int m96326t(View view, int i11, int i12, int i13) {
        if (i11 == 0) {
            return i13 - ((view.getHeight() / 2) + (i12 / 2));
        }
        if (i11 == 1) {
            return i13 - (i12 + view.getHeight());
        }
        if (i11 != 3) {
            return i11 != 4 ? i13 : i13 - i12;
        }
        return i13 - view.getHeight();
    }

    /* JADX INFO: renamed from: u */
    public final void m96327u(boolean z11) {
        if (this.f96648B != z11) {
            this.f96648B = z11;
        }
        if (this.f96649b == null) {
            m96322p();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m96328v() {
        Activity activity;
        if (this.f96659l) {
            ViewGroup viewGroup = this.f96662o;
            if (viewGroup != null) {
                m96330x(viewGroup);
            } else {
                if (m96292A() == null || (activity = (Activity) m96292A().getContext()) == null) {
                    return;
                }
                m96329w(activity);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m96331y() {
        PopupWindow popupWindow = this.f96649b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ d m96287k(AbstractC43723a abstractC43723a) {
        abstractC43723a.getClass();
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m96300J() {
        View viewM96292A = m96292A();
        if (this.f96655h <= 0 || this.f96656i <= 0) {
            viewM96292A.measure(0, 0);
            if (this.f96655h <= 0) {
                this.f96655h = viewM96292A.getMeasuredWidth();
            }
            if (this.f96656i <= 0) {
                this.f96656i = viewM96292A.getMeasuredHeight();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m96301K() {
        mo96296E();
    }

    /* JADX INFO: renamed from: M */
    public void m96303M(View view) {
        mo25306H(view, m96305O());
    }

    /* JADX INFO: renamed from: N */
    public final void m96304N() {
        m96292A().getViewTreeObserver().addOnGlobalLayoutListener(new c());
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        m96295D();
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: q */
    public final void m96323q(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(this.f96661n);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.f96660m * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: w */
    public final void m96329w(Activity activity) {
        ((ViewGroup) activity.getWindow().getDecorView().getRootView()).getOverlay().clear();
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: x */
    public final void m96330x(ViewGroup viewGroup) {
        viewGroup.getOverlay().clear();
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(I)TT; */
    /* JADX INFO: renamed from: z */
    public View m96332z(@IdRes int i11) {
        if (m96292A() != null) {
            return m96292A().findViewById(i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public void m96302L() {
    }

    /* JADX INFO: renamed from: O */
    public T m96305O() {
        return this;
    }
}
