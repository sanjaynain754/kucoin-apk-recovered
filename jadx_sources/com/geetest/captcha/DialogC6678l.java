package com.geetest.captcha;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.geetest.captcha.utils.LogUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.l */
/* JADX INFO: loaded from: classes45.dex */
public final class DialogC6678l extends Dialog {

    /* JADX INFO: renamed from: a */
    @Nullable
    public View f11182a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public GTCaptcha4Client.OnDialogShowListener f11183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6678l(@NotNull Context context) {
        super(context, C6689u.m12553a(context, "gt4_captcha_dialog_style"));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6678l(@NotNull Context context, @NotNull String dialogStyle) {
        super(context, C6689u.m12553a(context, dialogStyle));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dialogStyle, "dialogStyle");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z11) {
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener = this.f11183b;
        if (onDialogShowListener != null) {
            onDialogShowListener.onDialogFocusChanged(this, z11);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener = this.f11183b;
        if (onDialogShowListener != null) {
            onDialogShowListener.actionBeforeDialogShow(this);
        }
        super.show();
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener2 = this.f11183b;
        if (onDialogShowListener2 != null) {
            onDialogShowListener2.actionAfterDialogShow(this);
        }
        m12545a();
    }

    /* JADX INFO: renamed from: a */
    public final void m12545a() {
        WindowManager.LayoutParams attributes;
        Integer numValueOf;
        Window window = getWindow();
        if (window != null) {
            window.addFlags(1280);
        }
        Window window2 = getWindow();
        Integer numValueOf2 = null;
        if (window2 != null) {
            attributes = window2.getAttributes();
        } else {
            attributes = null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C6705y c6705yM12541a = C6670h.m12541a(context);
        int i11 = c6705yM12541a.f11249a;
        int i12 = c6705yM12541a.f11250b;
        if (Build.VERSION.SDK_INT < 28 && getContext().getResources().getConfiguration().orientation == 2) {
            if (attributes != null) {
                attributes.width = -1;
            }
            if (attributes != null) {
                attributes.height = -1;
            }
        } else {
            if (attributes != null) {
                attributes.width = i11;
            }
            if (attributes != null) {
                attributes.height = i12;
            }
        }
        LogUtils logUtils = LogUtils.f11200a;
        StringBuilder sb2 = new StringBuilder("ScreenWidth: ");
        sb2.append(i11);
        sb2.append(", ScreenHeight: ");
        sb2.append(i12);
        sb2.append(", DialogWidth: ");
        if (attributes != null) {
            numValueOf = Integer.valueOf(attributes.width);
        } else {
            numValueOf = null;
        }
        sb2.append(numValueOf);
        sb2.append(", DialogHeight: ");
        if (attributes != null) {
            numValueOf2 = Integer.valueOf(attributes.height);
        }
        sb2.append(numValueOf2);
        logUtils.release(sb2.toString());
        if (attributes != null) {
            attributes.gravity = 17;
        }
        Window window3 = getWindow();
        if (window3 == null) {
            return;
        }
        window3.setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        Intrinsics.checkNotNullExpressionValue(inflater, "inflater");
        View view = this.f11182a;
        if (view != null) {
            setContentView(view);
        }
        setCanceledOnTouchOutside(false);
    }
}
