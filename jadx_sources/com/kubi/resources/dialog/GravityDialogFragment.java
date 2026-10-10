package com.kubi.resources.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$style;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GravityDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/resources/dialog/GravityDialogFragment;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "<init>", "()V", "type", "", "getType", "()I", "setType", "(I)V", "heightRatio", "", "getHeightRatio", "()F", "setHeightRatio", "(F)V", "onStart", "", "generateWidth", "displayMetrics", "Landroid/util/DisplayMetrics;", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGravityDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GravityDialogFragment.kt\ncom/kubi/resources/dialog/GravityDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public class GravityDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f43592b0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    public int f43593Z;

    /* JADX INFO: renamed from: a0 */
    public float f43594a0 = 0.5f;

    /* JADX INFO: compiled from: GravityDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/resources/dialog/GravityDialogFragment$Companion;", "", "<init>", "()V", "GRAVITY_BOTTOM_WITHOUT_HEIGHT_CONSTRAINT", "", "GRAVITY_BOTTOM_WITH_HALF_HEIGHT", "GRAVITY_CENTER_SMALL", "GRAVITY_CENTER_LARGE", "GRAVITY_FILL", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: v3 */
    public int mo54247v3(@NotNull DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: renamed from: w3, reason: from getter */
    public final float getF43594a0() {
        return this.f43594a0;
    }

    /* JADX INFO: renamed from: x3 */
    public final void m54249x3(float f11) {
        this.f43594a0 = f11;
    }

    /* JADX INFO: renamed from: y3 */
    public final void m54250y3(int i11) {
        this.f43593Z = i11;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            if (window != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                }
                Dialog dialog2 = getDialog();
                Intrinsics.checkNotNull(dialog2);
                Window window4 = dialog2.getWindow();
                Intrinsics.checkNotNull(window4);
                WindowManager.LayoutParams attributes = window4.getAttributes();
                attributes.width = mo54247v3(displayMetrics);
                int i11 = this.f43593Z;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                attributes.gravity = 17;
                            } else {
                                attributes.height = -1;
                                attributes.gravity = 119;
                            }
                        } else {
                            attributes.gravity = 17;
                            attributes.width = displayMetrics.widthPixels - C5275i0.m6236a(56.0f);
                        }
                    } else {
                        attributes.gravity = 17;
                        attributes.width = displayMetrics.widthPixels - C5275i0.m6236a(100.0f);
                    }
                } else {
                    attributes.windowAnimations = R$style.style_bottom_dialog;
                    if (getView() != null && this.f43593Z != -1 && C5275i0.m6237b(getView()) > ((int) (C5267e0.m6182d() * this.f43594a0))) {
                        attributes.height = (int) (C5267e0.m6182d() * this.f43594a0);
                    }
                    attributes.gravity = 80;
                }
                Dialog dialog3 = getDialog();
                if (dialog3 != null && (window3 = dialog3.getWindow()) != null) {
                    window3.setAttributes(attributes);
                }
                Dialog dialog4 = getDialog();
                if (dialog4 != null && (window2 = dialog4.getWindow()) != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
            }
        }
    }
}
