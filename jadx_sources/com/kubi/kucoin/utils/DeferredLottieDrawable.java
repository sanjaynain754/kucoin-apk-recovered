package com.kubi.kucoin.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.RadioButton;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.tencent.bugly.proguard.C33863pg;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.v, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AsyncBottomTabDrawable.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0015J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0012\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0013H\u0017J\b\u0010&\u001a\u00020\u0013H\u0016J\b\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0001H\u0016J \u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/kucoin/utils/DeferredLottieDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", TUIConstants.TUIChat.OWNER, "Landroid/widget/RadioButton;", "assetName", "", "fallback", C33863pg.f71438h, "Lcom/kubi/kucoin/utils/BottomLottieGateway;", "<init>", "(Landroid/widget/RadioButton;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/kubi/kucoin/utils/BottomLottieGateway;)V", "animation", "Lcom/airbnb/lottie/LottieDrawable;", "request", "Lcom/kubi/kucoin/utils/BottomLottieRequest;", "active", "", "generation", "", "setActive", "", "newActive", "dispose", "requestComposition", "cancelRequest", "draw", "canvas", "Landroid/graphics/Canvas;", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "getIntrinsicWidth", "getIntrinsicHeight", "getMinimumWidth", "getMinimumHeight", "invalidateDrawable", "who", "scheduleDrawable", "what", "Ljava/lang/Runnable;", "when", "", "unscheduleDrawable", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DeferredLottieDrawable extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RadioButton f28605b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f28606c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Drawable f28607d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final BottomLottieGateway f28608e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public LottieDrawable f28609f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public BottomLottieRequest f28610g;

    /* JADX INFO: renamed from: h */
    public boolean f28611h;

    /* JADX INFO: renamed from: i */
    public int f28612i;

    /* JADX INFO: renamed from: d */
    public final void m33202d() {
        this.f28611h = false;
        m33201c();
        LottieDrawable lottieDrawable = this.f28609f;
        if (lottieDrawable != null) {
            lottieDrawable.m5627v();
            lottieDrawable.setCallback(null);
        }
        this.f28609f = null;
        this.f28607d.setCallback(null);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Android")
    public int getOpacity() {
        return -3;
    }

    public DeferredLottieDrawable(@NotNull RadioButton owner, @NotNull String assetName, @NotNull Drawable fallback, @NotNull BottomLottieGateway gateway) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        this.f28605b = owner;
        this.f28606c = assetName;
        this.f28607d = fallback;
        this.f28608e = gateway;
        fallback.setCallback(this);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m33199f(Ref.BooleanRef booleanRef, int i11, DeferredLottieDrawable deferredLottieDrawable, C5080h composition, BottomLottieSource source) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(source, "source");
        booleanRef.element = true;
        int i12 = deferredLottieDrawable.f28612i;
        if (i11 == i12) {
            deferredLottieDrawable.f28610g = null;
        }
        if (i11 != i12 || !deferredLottieDrawable.f28611h || !deferredLottieDrawable.f28605b.isAttachedToWindow()) {
            return Unit.INSTANCE;
        }
        LottieDrawable lottieDrawableMo33150a = deferredLottieDrawable.f28608e.mo33150a(composition);
        lottieDrawableMo33150a.setBounds(deferredLottieDrawable.getBounds());
        lottieDrawableMo33150a.setCallback(deferredLottieDrawable);
        lottieDrawableMo33150a.start();
        deferredLottieDrawable.f28609f = lottieDrawableMo33150a;
        C44128b.m97259c("AsyncBottomTab", "composition ready, asset=" + deferredLottieDrawable.f28606c + ", source=" + source);
        deferredLottieDrawable.invalidateSelf();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m33200g(Ref.BooleanRef booleanRef, int i11, DeferredLottieDrawable deferredLottieDrawable, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        booleanRef.element = true;
        if (i11 == deferredLottieDrawable.f28612i) {
            deferredLottieDrawable.f28610g = null;
        }
        deferredLottieDrawable.invalidateSelf();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m33201c() {
        this.f28612i++;
        BottomLottieRequest bottomLottieRequest = this.f28610g;
        if (bottomLottieRequest != null) {
            bottomLottieRequest.cancel();
        }
        this.f28610g = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = this.f28609f;
        if (drawable == null) {
            drawable = this.f28607d;
        }
        drawable.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m33203e() {
        if (this.f28610g == null && this.f28605b.isAttachedToWindow()) {
            final int i11 = this.f28612i;
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            BottomLottieGateway bottomLottieGateway = this.f28608e;
            Context context = this.f28605b.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BottomLottieRequest bottomLottieRequestMo33151b = bottomLottieGateway.mo33151b(context, this.f28606c, new Function2() { // from class: com.kubi.kucoin.utils.t
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeferredLottieDrawable.m33199f(booleanRef, i11, this, (C5080h) obj, (BottomLottieSource) obj2);
                }
            }, new Function1() { // from class: com.kubi.kucoin.utils.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeferredLottieDrawable.m33200g(booleanRef, i11, this, (Throwable) obj);
                }
            });
            if (booleanRef.element) {
                return;
            }
            this.f28610g = bottomLottieRequestMo33151b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f28607d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f28607d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f28607d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f28607d.getMinimumWidth();
    }

    /* JADX INFO: renamed from: h */
    public final void m33204h(boolean z11) {
        LottieDrawable lottieDrawable;
        if (this.f28611h == z11) {
            if (!z11 || (lottieDrawable = this.f28609f) == null) {
                return;
            }
            lottieDrawable.start();
            return;
        }
        this.f28611h = z11;
        if (!z11) {
            LottieDrawable lottieDrawable2 = this.f28609f;
            if (lottieDrawable2 != null) {
                lottieDrawable2.m5627v();
            }
            m33201c();
            return;
        }
        LottieDrawable lottieDrawable3 = this.f28609f;
        if (lottieDrawable3 != null) {
            lottieDrawable3.start();
        } else {
            m33203e();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f28607d.setBounds(bounds);
        LottieDrawable lottieDrawable = this.f28609f;
        if (lottieDrawable != null) {
            lottieDrawable.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NotNull Drawable who, @NotNull Runnable what, long when) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f28607d.setAlpha(alpha);
        LottieDrawable lottieDrawable = this.f28609f;
        if (lottieDrawable != null) {
            lottieDrawable.setAlpha(alpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f28607d.setColorFilter(colorFilter);
        LottieDrawable lottieDrawable = this.f28609f;
        if (lottieDrawable != null) {
            lottieDrawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NotNull Drawable who, @NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        unscheduleSelf(what);
    }
}
