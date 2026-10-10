package com.hcaptcha.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes56.dex */
public final class HCaptchaDialogFragment extends DialogFragment implements InterfaceC9187o {

    /* JADX INFO: renamed from: a0 */
    public static final String f12859a0 = "HCaptchaDialogFragment";

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public static HCaptchaWebView f12860b0;

    /* JADX INFO: renamed from: U */
    @Nullable
    public C9185m f12861U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public HCaptchaStateListener f12862V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public LinearLayout f12863W;

    /* JADX INFO: renamed from: X */
    public float f12864X;

    /* JADX INFO: renamed from: Y */
    public boolean f12865Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public HCaptchaVerifyParams f12866Z;

    /* JADX INFO: renamed from: com.hcaptcha.sdk.HCaptchaDialogFragment$a */
    public class C9170a extends AnimatorListenerAdapter {
        public C9170a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (HCaptchaDialogFragment.this.f12863W != null) {
                HCaptchaDialogFragment.this.f12863W.setVisibility(8);
            }
        }
    }

    public HCaptchaDialogFragment() {
        this.f12864X = 0.6f;
        this.f12865Y = false;
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ boolean m13935e3(HCaptchaDialogFragment hCaptchaDialogFragment, View view, MotionEvent motionEvent) {
        FragmentActivity activity;
        if (hCaptchaDialogFragment.f12865Y || !hCaptchaDialogFragment.isAdded() || (activity = hCaptchaDialogFragment.getActivity()) == null) {
            return view.performClick();
        }
        activity.dispatchTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: h3 */
    public static HCaptchaDialogFragment m13937h3(@NonNull Context context, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull HCaptchaInternalConfig hCaptchaInternalConfig, @NonNull HCaptchaStateListener hCaptchaStateListener) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("hCaptchaConfig", hCaptchaConfig);
        bundle.putSerializable("hCaptchaInternalConfig", hCaptchaInternalConfig);
        bundle.putParcelable("hCaptchaDialogListener", hCaptchaStateListener);
        HCaptchaDialogFragment hCaptchaDialogFragment = new HCaptchaDialogFragment(context, hCaptchaConfig, hCaptchaInternalConfig);
        hCaptchaDialogFragment.setArguments(bundle);
        hCaptchaDialogFragment.f12862V = hCaptchaStateListener;
        return hCaptchaDialogFragment;
    }

    @Override // p687v8.InterfaceC45465b
    /* JADX INFO: renamed from: B1 */
    public void mo13938B1() {
        C9185m c9185m = this.f12861U;
        if (c9185m == null) {
            return;
        }
        HCaptchaConfig hCaptchaConfigM13968e = c9185m.m13968e();
        boolean z11 = hCaptchaConfigM13968e.getSize() == HCaptchaSize.INVISIBLE;
        if (!z11) {
            this.f12865Y = true;
            m13939g3();
        }
        if (this.f12861U != null) {
            if (!z11 || hCaptchaConfigM13968e.getHideDialog().booleanValue()) {
                this.f12861U.m13972i(this.f12866Z);
            } else {
                this.f12861U.m13971h(this.f12866Z);
            }
        }
    }

    /* JADX INFO: renamed from: g3 */
    public final void m13939g3() {
        C9185m c9185m;
        if (this.f12863W != null && (c9185m = this.f12861U) != null && Boolean.TRUE.equals(c9185m.m13968e().getLoading())) {
            this.f12863W.animate().alpha(0.0f).setDuration(200L).setListener(new C9170a());
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().addFlags(2);
            dialog.getWindow().setDimAmount(this.f12864X);
        }
    }

    @Override // com.hcaptcha.sdk.InterfaceC9187o
    /* JADX INFO: renamed from: h */
    public void mo13940h(@NonNull Activity activity, @Nullable HCaptchaVerifyParams hCaptchaVerifyParams) {
        C9185m c9185m;
        this.f12866Z = hCaptchaVerifyParams;
        if (this.f12865Y && (c9185m = this.f12861U) != null) {
            c9185m.m13972i(hCaptchaVerifyParams);
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        String str = f12859a0;
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(str);
        if ((fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) && !supportFragmentManager.isStateSaved()) {
            try {
                show(supportFragmentManager, str);
            } catch (IllegalStateException e11) {
                e11.getMessage();
                HCaptchaStateListener hCaptchaStateListener = this.f12862V;
                if (hCaptchaStateListener != null) {
                    hCaptchaStateListener.onFailure(new HCaptchaException(HCaptchaError.ERROR));
                }
            }
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final View m13942j3(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @NonNull final HCaptchaConfig hCaptchaConfig) {
        View viewInflate = layoutInflater.inflate(R$layout.hcaptcha_fragment, viewGroup, false);
        viewInflate.setFocusableInTouchMode(true);
        viewInflate.requestFocus();
        viewInflate.setOnKeyListener(new View.OnKeyListener() { // from class: com.hcaptcha.sdk.e
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                return HCaptchaDialogFragment.m13934d3(this.f12880b, hCaptchaConfig, view, i11, keyEvent);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: k3 */
    public final void m13943k3(@NonNull View view, @NonNull HCaptchaConfig hCaptchaConfig) {
        View viewFindViewById = view.findViewById(R$id.webView);
        if (!(viewFindViewById instanceof ViewStub)) {
            viewFindViewById.getClass().toString();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
        viewGroup.removeView(viewFindViewById);
        if (f12860b0 == null) {
            f12860b0 = new HCaptchaWebView(requireContext());
        }
        if (f12860b0.getParent() != null) {
            ((ViewGroup) f12860b0.getParent()).removeView(f12860b0);
        }
        viewGroup.addView(f12860b0, iIndexOfChild);
        if (Boolean.FALSE.equals(hCaptchaConfig.getLoading())) {
            f12860b0.setOnTouchListener(new View.OnTouchListener() { // from class: com.hcaptcha.sdk.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return HCaptchaDialogFragment.m13935e3(this.f12879b, view2, motionEvent);
                }
            });
        }
    }

    @Override // p687v8.InterfaceC45466c
    /* JADX INFO: renamed from: u2 */
    public void mo13944u2() {
        C9185m c9185m = this.f12861U;
        if (c9185m == null) {
            return;
        }
        if (c9185m.m13968e().getSize() == HCaptchaSize.INVISIBLE) {
            m13939g3();
        }
        this.f12865Y = true;
        HCaptchaStateListener hCaptchaStateListener = this.f12862V;
        if (hCaptchaStateListener != null) {
            hCaptchaStateListener.onOpen();
        }
    }

    @Override // p687v8.InterfaceC45464a
    /* JADX INFO: renamed from: w */
    public void mo13945w(@NonNull HCaptchaException hCaptchaException) {
        C9185m c9185m = this.f12861U;
        boolean z11 = c9185m != null && c9185m.m13974k(hCaptchaException);
        if (isAdded() && !z11) {
            dismissAllowingStateLoss();
        }
        C9185m c9185m2 = this.f12861U;
        if (c9185m2 != null) {
            if (z11) {
                c9185m2.m13971h(this.f12866Z);
                return;
            }
            HCaptchaStateListener hCaptchaStateListener = this.f12862V;
            if (hCaptchaStateListener != null) {
                hCaptchaStateListener.onFailure(hCaptchaException);
            }
        }
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ boolean m13934d3(HCaptchaDialogFragment hCaptchaDialogFragment, HCaptchaConfig hCaptchaConfig, View view, int i11, KeyEvent keyEvent) {
        hCaptchaDialogFragment.getClass();
        if (i11 == 4 && keyEvent.getAction() == 0) {
            if (hCaptchaDialogFragment.f12865Y || !Boolean.FALSE.equals(hCaptchaConfig.getLoading())) {
                C9185m c9185m = hCaptchaDialogFragment.f12861U;
                if (c9185m != null && c9185m.m13974k(new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // p687v8.InterfaceC45467d
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public void onSuccess(String str) {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
        HCaptchaStateListener hCaptchaStateListener = this.f12862V;
        if (hCaptchaStateListener != null) {
            hCaptchaStateListener.onSuccess(str);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        mo13945w(new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R$style.HCaptchaDialogTheme);
        try {
            Bundle arguments = getArguments();
            this.f12862V = (HCaptchaStateListener) C9174b.m13959a(arguments, "hCaptchaDialogListener", HCaptchaStateListener.class);
            HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) C9174b.m13960b(arguments, "hCaptchaConfig", HCaptchaConfig.class);
            HCaptchaInternalConfig hCaptchaInternalConfig = (HCaptchaInternalConfig) C9174b.m13960b(arguments, "hCaptchaInternalConfig", HCaptchaInternalConfig.class);
            HCaptchaStateListener hCaptchaStateListener = this.f12862V;
            try {
                if (hCaptchaStateListener != null && hCaptchaConfig != null && hCaptchaInternalConfig != null) {
                    if (f12860b0 == null) {
                        f12860b0 = new HCaptchaWebView(requireContext());
                    }
                    HCaptchaWebView hCaptchaWebView = f12860b0;
                    if (this.f12861U == null) {
                        this.f12861U = new C9185m(new Handler(Looper.getMainLooper()), requireContext(), hCaptchaConfig, hCaptchaInternalConfig, this, hCaptchaWebView);
                        return;
                    }
                    return;
                }
                if (hCaptchaStateListener != null) {
                    hCaptchaStateListener.onFailure(new HCaptchaException(HCaptchaError.ERROR));
                    return;
                }
                return;
            } catch (BadParcelableException | AssertionError | ClassCastException unused) {
            }
        } catch (BadParcelableException | AssertionError | ClassCastException unused2) {
        }
        HCaptchaStateListener hCaptchaStateListener2 = this.f12862V;
        if (hCaptchaStateListener2 != null) {
            hCaptchaStateListener2.onFailure(new HCaptchaException(HCaptchaError.ERROR));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@Nullable LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i11;
        int i12;
        try {
            HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) C9174b.m13960b(getArguments(), "hCaptchaConfig", HCaptchaConfig.class);
            if (layoutInflater != null) {
                View viewM13942j3 = m13942j3(layoutInflater, viewGroup, hCaptchaConfig);
                m13943k3(viewM13942j3, hCaptchaConfig);
                LinearLayout linearLayout = (LinearLayout) viewM13942j3.findViewById(R$id.loadingContainer);
                this.f12863W = linearLayout;
                if (linearLayout != null) {
                    if (hCaptchaConfig.getTheme() == HCaptchaTheme.DARK) {
                        i11 = ViewCompat.MEASURED_STATE_MASK;
                    } else {
                        i11 = -1;
                    }
                    this.f12863W.setBackgroundColor(i11);
                    LinearLayout linearLayout2 = this.f12863W;
                    if (Boolean.TRUE.equals(hCaptchaConfig.getLoading()) && !this.f12865Y) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    linearLayout2.setVisibility(i12);
                }
                return viewM13942j3;
            }
            throw new InflateException("inflater is null");
        } catch (BadParcelableException | InflateException | AssertionError | ClassCastException unused) {
            dismiss();
            HCaptchaStateListener hCaptchaStateListener = this.f12862V;
            if (hCaptchaStateListener != null) {
                hCaptchaStateListener.onFailure(new HCaptchaException(HCaptchaError.ERROR));
                return null;
            }
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C9185m c9185m = this.f12861U;
        if (c9185m != null) {
            c9185m.m13970g();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && this.f12861U != null) {
            Window window = dialog.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            this.f12864X = window.getAttributes().dimAmount;
            if (Boolean.FALSE.equals(this.f12861U.m13968e().getLoading())) {
                window.clearFlags(2);
                window.setDimAmount(0.0f);
            }
        }
    }

    public HCaptchaDialogFragment(Context context, HCaptchaConfig hCaptchaConfig, HCaptchaInternalConfig hCaptchaInternalConfig) {
        this();
        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(context);
        this.f12861U = new C9185m(new Handler(Looper.getMainLooper()), context, hCaptchaConfig, hCaptchaInternalConfig, this, hCaptchaWebView);
        f12860b0 = hCaptchaWebView;
    }
}
