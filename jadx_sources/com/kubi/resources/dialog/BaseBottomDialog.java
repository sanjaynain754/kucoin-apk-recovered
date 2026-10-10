package com.kubi.resources.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.blankj.utilcode.util.C5267e0;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseBottomDialog.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/resources/dialog/BaseBottomDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "heightAdjustListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onStart", "", "onDestroyView", "removeHeightAdjustListener", "v", "Landroid/view/View;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseBottomDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBottomDialog.kt\ncom/kubi/resources/dialog/BaseBottomDialog\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n28#2:92\n1#3:93\n*S KotlinDebug\n*F\n+ 1 BaseBottomDialog.kt\ncom/kubi/resources/dialog/BaseBottomDialog\n*L\n42#1:92\n*E\n"})
public class BaseBottomDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    public final float f43546q0 = 0.6666667f;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public ViewTreeObserver.OnGlobalLayoutListener f43547r0;

    /* JADX INFO: renamed from: com.kubi.resources.dialog.BaseBottomDialog$a */
    /* JADX INFO: compiled from: BaseBottomDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/dialog/BaseBottomDialog$onStart$1$1$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC22879a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f43549c;

        public ViewTreeObserverOnGlobalLayoutListenerC22879a(int i11) {
            this.f43549c = i11;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = BaseBottomDialog.this.getView();
            if (view == null) {
                return;
            }
            int i11 = view.getLayoutParams().height;
            int measuredHeight = view.getMeasuredHeight();
            int i12 = this.f43549c;
            if (measuredHeight > i12 && i11 != i12) {
                view.getLayoutParams().height = this.f43549c;
                view.requestLayout();
            } else if (1 > i11 || i11 >= i12) {
                BaseBottomDialog.this.m54179l4(view);
            } else {
                view.getLayoutParams().height = -2;
                view.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF43546q0() {
        return this.f43546q0;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m54179l4(View view) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f43547r0;
        if (onGlobalLayoutListener != null) {
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewTreeObserver = null;
                }
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            this.f43547r0 = null;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        m54179l4(getView());
        super.onDestroyView();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = C5267e0.m6183e();
            attributes.height = -1;
            attributes.gravity = 80;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View view = getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
                ViewTreeObserverOnGlobalLayoutListenerC22879a viewTreeObserverOnGlobalLayoutListenerC22879a = new ViewTreeObserverOnGlobalLayoutListenerC22879a((int) (C5267e0.m6182d() * getF43546q0()));
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC22879a);
                this.f43547r0 = viewTreeObserverOnGlobalLayoutListenerC22879a;
            }
        }
    }
}
