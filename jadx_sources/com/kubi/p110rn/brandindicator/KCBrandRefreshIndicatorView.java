package com.kubi.p110rn.brandindicator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.util.C24277v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBrandRefreshIndicatorView.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/rn/brandindicator/KCBrandRefreshIndicatorView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "playing", "", "setPlaying", "", "value", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "syncAnimatable", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class KCBrandRefreshIndicatorView extends AppCompatImageView {
    private boolean playing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCBrandRefreshIndicatorView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C24277v.m58539d(context, R$drawable.kc_loading, this);
    }

    public final void setPlaying(boolean value) {
        if (this.playing == value) {
            return;
        }
        this.playing = value;
        syncAnimatable();
    }

    private final void syncAnimatable() {
        Animatable animatable;
        Object drawable = getDrawable();
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            if (this.playing) {
                if (!animatable.isRunning()) {
                    animatable.start();
                }
            } else if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        syncAnimatable();
    }
}
