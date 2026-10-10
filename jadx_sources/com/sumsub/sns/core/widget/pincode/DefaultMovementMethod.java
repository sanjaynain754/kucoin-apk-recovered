package com.sumsub.sns.core.widget.pincode;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J.\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J.\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\rH\u0016J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/pincode/DefaultMovementMethod;", "Landroid/text/method/MovementMethod;", "<init>", "()V", "initialize", "", "widget", "Landroid/widget/TextView;", "text", "Landroid/text/Spannable;", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKeyUp", "onKeyOther", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onTakeFocus", "direction", "onTrackballEvent", "Landroid/view/MotionEvent;", "onTouchEvent", "onGenericMotionEvent", "canSelectArbitrarily", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class DefaultMovementMethod implements MovementMethod {

    @NotNull
    public static final DefaultMovementMethod INSTANCE = new DefaultMovementMethod();

    @Override // android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public void initialize(@NotNull TextView widget, @NotNull Spannable text) {
        Selection.setSelection(text, 0);
    }

    @Override // android.text.method.MovementMethod
    public boolean onGenericMotionEvent(@NotNull TextView widget, @NotNull Spannable text, @NotNull MotionEvent event) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyDown(@Nullable TextView widget, @Nullable Spannable text, int keyCode, @Nullable KeyEvent event) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyOther(@Nullable TextView view, @Nullable Spannable text, @Nullable KeyEvent event) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyUp(@Nullable TextView widget, @Nullable Spannable text, int keyCode, @Nullable KeyEvent event) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onTouchEvent(@NotNull TextView widget, @NotNull Spannable text, @NotNull MotionEvent event) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onTrackballEvent(@NotNull TextView widget, @NotNull Spannable text, @NotNull MotionEvent event) {
        return false;
    }

    private DefaultMovementMethod() {
    }

    @Override // android.text.method.MovementMethod
    public void onTakeFocus(@NotNull TextView widget, @NotNull Spannable text, int direction) {
    }
}
