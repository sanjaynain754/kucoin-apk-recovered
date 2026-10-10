package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.e */
/* JADX INFO: compiled from: DrawableUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/drawee/drawable/e;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", TypedValues.TransitionType.S_TO, "from", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "drawable", "Lcom/facebook/drawee/drawable/d;", "properties", "e", "(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/d;)V", "Landroid/graphics/drawable/Drawable$Callback;", TUIConstants.TUIChat.CALL_BACK, "Lcom/facebook/drawee/drawable/e0;", "transformCallback", "d", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable$Callback;Lcom/facebook/drawee/drawable/e0;)V", "", "color", "alpha", "c", "(II)I", "b", "(I)I", "drawee_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C5582e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5582e f8266a = new C5582e();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m8664a(@Nullable Drawable to2, @Nullable Drawable from) {
        if (from == null || to2 == null || to2 == from) {
            return;
        }
        to2.setBounds(from.getBounds());
        to2.setChangingConfigurations(from.getChangingConfigurations());
        to2.setLevel(from.getLevel());
        to2.setVisible(from.isVisible(), false);
        to2.setState(from.getState());
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m8665b(int color) {
        int i11 = color >>> 24;
        if (i11 != 0) {
            return i11 != 255 ? -3 : -1;
        }
        return -2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m8666c(int color, int alpha) {
        if (alpha == 255) {
            return color;
        }
        if (alpha == 0) {
            return color & 16777215;
        }
        return (color & 16777215) | ((((color >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m8667d(@Nullable Drawable drawable, @Nullable Drawable.Callback callback, @Nullable InterfaceC5583e0 transformCallback) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        InterfaceC5581d0 interfaceC5581d0 = drawable instanceof InterfaceC5581d0 ? (InterfaceC5581d0) drawable : null;
        if (interfaceC5581d0 != null) {
            interfaceC5581d0.setTransformCallback(transformCallback);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m8668e(@Nullable Drawable drawable, @Nullable C5580d properties) {
        if (drawable == null || properties == null) {
            return;
        }
        properties.m8659a(drawable);
    }
}
