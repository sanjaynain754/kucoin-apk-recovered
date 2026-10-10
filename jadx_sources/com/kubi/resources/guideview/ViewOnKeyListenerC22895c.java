package com.kubi.resources.guideview;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.resources.guideview.c */
/* JADX INFO: compiled from: Guide.java */
/* JADX INFO: loaded from: classes11.dex */
public class ViewOnKeyListenerC22895c implements View.OnKeyListener, View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public Configuration f43629b;

    /* JADX INFO: renamed from: c */
    public MaskView f43630c;

    /* JADX INFO: renamed from: d */
    public InterfaceC22894b[] f43631d;

    /* JADX INFO: renamed from: g */
    public C22896d.a f43634g;

    /* JADX INFO: renamed from: j */
    public ViewGroup f43637j;

    /* JADX INFO: renamed from: e */
    public boolean f43632e = true;

    /* JADX INFO: renamed from: f */
    public int f43633f = 0;

    /* JADX INFO: renamed from: h */
    public int f43635h = 0;

    /* JADX INFO: renamed from: i */
    public int f43636i = 0;

    /* JADX INFO: renamed from: com.kubi.resources.guideview.c$a */
    /* JADX INFO: compiled from: Guide.java */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (ViewOnKeyListenerC22895c.this.f43634g != null) {
                ViewOnKeyListenerC22895c.this.f43634g.onShown();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.guideview.c$b */
    /* JADX INFO: compiled from: Guide.java */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (ViewOnKeyListenerC22895c.this.f43634g != null) {
                ViewOnKeyListenerC22895c.this.f43634g.onShown();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.guideview.c$c */
    /* JADX INFO: compiled from: Guide.java */
    public class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f43640a;

        public c(ViewGroup viewGroup) {
            this.f43640a = viewGroup;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f43640a.removeView(ViewOnKeyListenerC22895c.this.f43630c);
            if (ViewOnKeyListenerC22895c.this.f43634g != null) {
                ViewOnKeyListenerC22895c.this.f43634g.onDismiss();
            }
            ViewOnKeyListenerC22895c.this.m54309g();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m54309g() {
        this.f43629b = null;
        this.f43631d = null;
        this.f43634g = null;
        this.f43630c.removeAllViews();
        this.f43630c = null;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        Configuration configuration;
        if (i11 != 4 || keyEvent.getAction() != 1 || (configuration = this.f43629b) == null || !configuration.mAutoDismiss) {
            return false;
        }
        m54306d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m54306d() {
        ViewGroup viewGroup;
        MaskView maskView = this.f43630c;
        if (maskView == null || (viewGroup = (ViewGroup) maskView.getParent()) == null) {
            return;
        }
        if (this.f43629b.mExitAnimationId != -1) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f43630c.getContext(), this.f43629b.mExitAnimationId);
            animationLoadAnimation.setAnimationListener(new c(viewGroup));
            this.f43630c.startAnimation(animationLoadAnimation);
        } else {
            viewGroup.removeView(this.f43630c);
            C22896d.a aVar = this.f43634g;
            if (aVar != null) {
                aVar.onDismiss();
            }
            m54309g();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public MaskView m54307e() {
        return this.f43630c;
    }

    /* JADX INFO: renamed from: h */
    public void m54310h(InterfaceC22894b[] interfaceC22894bArr) {
        this.f43631d = interfaceC22894bArr;
    }

    /* JADX INFO: renamed from: i */
    public void m54311i(Configuration configuration) {
        this.f43629b = configuration;
    }

    /* JADX INFO: renamed from: j */
    public void m54312j(int i11) {
        this.f43633f = i11;
    }

    /* JADX INFO: renamed from: k */
    public void m54313k(boolean z11) {
        this.f43632e = z11;
    }

    /* JADX INFO: renamed from: l */
    public void m54314l(Activity activity) {
        if (this.f43630c == null) {
            this.f43630c = m54308f(activity);
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (this.f43630c.getParent() == null) {
            viewGroup.addView(this.f43630c);
            int i11 = this.f43629b.mEnterAnimationId;
            if (i11 != -1) {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, i11);
                animationLoadAnimation.setAnimationListener(new a());
                this.f43630c.startAnimation(animationLoadAnimation);
            } else {
                C22896d.a aVar = this.f43634g;
                if (aVar != null) {
                    aVar.onShown();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m54316n() {
        View view = this.f43629b.mTargetView;
        if (view == null || this.f43630c == null || this.f43633f == 0) {
            return;
        }
        Rect rectM54302b = C22893a.m54302b(view, this.f43635h, this.f43636i);
        int measuredHeight = this.f43637j.getMeasuredHeight() - this.f43633f;
        if (rectM54302b.bottom > measuredHeight) {
            rectM54302b.bottom = measuredHeight;
        }
        this.f43630c.setTargetRect(rectM54302b);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Configuration configuration = this.f43629b;
        if (configuration == null || !configuration.mAutoDismiss) {
            return;
        }
        m54306d();
    }

    public void setCallback(C22896d.a aVar) {
        this.f43634g = aVar;
    }

    /* JADX INFO: renamed from: f */
    public final MaskView m54308f(Activity activity) {
        int measuredHeight;
        this.f43637j = (ViewGroup) activity.findViewById(R.id.content);
        MaskView maskView = new MaskView(activity);
        maskView.setFullingColor(activity.getResources().getColor(this.f43629b.mFullingColorId));
        maskView.setFullingAlpha(this.f43629b.mAlpha);
        maskView.setHighTargetCorner(this.f43629b.mCorner);
        maskView.setPadding(this.f43629b.mPadding);
        maskView.setPaddingLeft(this.f43629b.mPaddingLeft);
        maskView.setPaddingTop(this.f43629b.mPaddingTop);
        maskView.setPaddingRight(this.f43629b.mPaddingRight);
        maskView.setPaddingBottom(this.f43629b.mPaddingBottom);
        maskView.setHighTargetGraphStyle(this.f43629b.mGraphStyle);
        maskView.setOverlayTarget(this.f43629b.mOverlayTarget);
        maskView.setHighTargetDashColor(this.f43629b.mDashColor);
        maskView.setOnKeyListener(this);
        int[] iArr = new int[2];
        this.f43637j.getLocationInWindow(iArr);
        int i11 = iArr[1];
        this.f43636i = i11;
        if (this.f43632e && i11 == 0) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                this.f43636i = activity.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
            } catch (ClassNotFoundException e11) {
                C44128b.m97264h(e11);
            } catch (IllegalAccessException e12) {
                C44128b.m97264h(e12);
            } catch (IllegalArgumentException e13) {
                C44128b.m97264h(e13);
            } catch (InstantiationException e14) {
                C44128b.m97264h(e14);
            } catch (NoSuchFieldException e15) {
                C44128b.m97264h(e15);
            } catch (NumberFormatException e16) {
                C44128b.m97264h(e16);
            } catch (SecurityException e17) {
                C44128b.m97264h(e17);
            }
        }
        Configuration configuration = this.f43629b;
        Rect rect = configuration.mTargetRect;
        if (rect != null) {
            maskView.setTargetRect(rect);
        } else {
            View view = configuration.mTargetView;
            if (view != null) {
                Rect rectM54302b = C22893a.m54302b(view, this.f43635h, this.f43636i);
                if (this.f43633f != 0 && rectM54302b.bottom > (measuredHeight = this.f43637j.getMeasuredHeight() - this.f43633f)) {
                    rectM54302b.bottom = measuredHeight;
                }
                maskView.setTargetRect(rectM54302b);
            } else {
                View viewFindViewById = activity.findViewById(configuration.mTargetViewId);
                if (viewFindViewById != null) {
                    maskView.setTargetRect(C22893a.m54302b(viewFindViewById, this.f43635h, this.f43636i));
                }
            }
        }
        View viewFindViewById2 = activity.findViewById(this.f43629b.mFullingViewId);
        if (viewFindViewById2 != null) {
            maskView.setFullingRect(C22893a.m54302b(viewFindViewById2, this.f43635h, this.f43636i));
        }
        if (this.f43629b.mOutsideTouchable) {
            maskView.setClickable(false);
        } else {
            maskView.setOnClickListener(this);
        }
        for (InterfaceC22894b interfaceC22894b : this.f43631d) {
            maskView.addView(C22893a.m54301a(activity.getLayoutInflater(), interfaceC22894b));
        }
        return maskView;
    }

    /* JADX INFO: renamed from: m */
    public void m54315m(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            if (this.f43630c == null) {
                this.f43630c = m54308f(activity);
            }
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
            if (this.f43630c.getParent() == null) {
                if (fragment.isVisible()) {
                    viewGroup.addView(this.f43630c);
                }
                int i11 = this.f43629b.mEnterAnimationId;
                if (i11 != -1) {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, i11);
                    animationLoadAnimation.setAnimationListener(new b());
                    this.f43630c.startAnimation(animationLoadAnimation);
                } else {
                    C22896d.a aVar = this.f43634g;
                    if (aVar != null) {
                        aVar.onShown();
                    }
                }
            }
        }
    }
}
