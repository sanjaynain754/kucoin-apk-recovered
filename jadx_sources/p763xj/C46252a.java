package p763xj;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.C6184u;
import com.facebook.react.uimanager.C6185v;
import com.kubi.homern.R$color;
import com.kubi.homern.R$id;
import com.kubi.kucoin.utils.DayNightThemeManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: xj.a */
/* JADX INFO: compiled from: BlurEffect.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/homern/utils/BlurEffect;", "", "<init>", "()V", "applyBlurEffect", "", "activity", "Landroid/app/Activity;", "radiusX", "", "radiusY", "removeBlurEffect", "addMaskView", "removeMaskView", "getRootContent", "Landroid/widget/FrameLayout;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBlurEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlurEffect.kt\ncom/kubi/homern/utils/BlurEffect\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,88:1\n470#2:89\n*S KotlinDebug\n*F\n+ 1 BlurEffect.kt\ncom/kubi/homern/utils/BlurEffect\n*L\n35#1:89\n*E\n"})
public final class C46252a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46252a f103819a = new C46252a();

    /* JADX INFO: renamed from: a */
    public final void m102009a(@Nullable Activity activity) {
        FrameLayout frameLayoutM102011c;
        if (activity == null || (frameLayoutM102011c = m102011c(activity)) == null) {
            return;
        }
        View view = new View(activity);
        view.setId(R$id.home_vip_dialog_mask_view_rn);
        view.setBackgroundColor(activity.getResources().getColor(R$color.c_50_000D1D));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayoutM102011c.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m102010b(@Nullable Activity activity, float f11, float f12) {
        if (activity == null) {
            return;
        }
        FrameLayout frameLayoutM102011c = m102011c(activity);
        View viewFindViewById = frameLayoutM102011c != null ? frameLayoutM102011c.findViewById(R$id.base_activity_layout) : null;
        if (Build.VERSION.SDK_INT < 31) {
            if (viewFindViewById != null) {
                viewFindViewById.setAlpha(0.2f);
                return;
            }
            return;
        }
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f11, f12, Shader.TileMode.CLAMP);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        if (DayNightThemeManager.f28592a.m33187l()) {
            if (viewFindViewById != null) {
                viewFindViewById.setRenderEffect(renderEffectCreateBlurEffect);
                return;
            }
            return;
        }
        C6185v.m10570a();
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(C6184u.m10569a(Color.parseColor("#B3000000"), BlendMode.SRC_OVER));
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateColorFilterEffect, "createColorFilterEffect(...)");
        RenderEffect renderEffectCreateChainEffect = RenderEffect.createChainEffect(renderEffectCreateColorFilterEffect, renderEffectCreateBlurEffect);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateChainEffect, "createChainEffect(...)");
        if (viewFindViewById != null) {
            viewFindViewById.setRenderEffect(renderEffectCreateChainEffect);
        }
    }

    /* JADX INFO: renamed from: c */
    public final FrameLayout m102011c(Activity activity) {
        return (FrameLayout) activity.findViewById(R$id.content);
    }

    /* JADX INFO: renamed from: d */
    public final void m102012d(@Nullable Activity activity) {
        if (activity == null) {
            return;
        }
        FrameLayout frameLayoutM102011c = m102011c(activity);
        View viewFindViewById = frameLayoutM102011c != null ? frameLayoutM102011c.findViewById(R$id.base_activity_layout) : null;
        if (Build.VERSION.SDK_INT >= 31) {
            if (viewFindViewById != null) {
                viewFindViewById.setRenderEffect(null);
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m102013e(@Nullable Activity activity) {
        FrameLayout frameLayoutM102011c;
        View viewFindViewById;
        if (activity == null || (frameLayoutM102011c = m102011c(activity)) == null || (viewFindViewById = activity.findViewById(R$id.home_vip_dialog_mask_view_rn)) == null) {
            return;
        }
        frameLayoutM102011c.removeView(viewFindViewById);
    }
}
