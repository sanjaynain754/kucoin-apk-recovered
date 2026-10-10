package cg0;

import android.content.Context;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cg0.b */
/* JADX INFO: compiled from: DisplayUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0007¨\u0006\f"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/utils/DisplayUtil;", "", "<init>", "()V", "dp2px", "", "context", "Landroid/content/Context;", "dpValue", "", "px2dp", "pxValue", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4968b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4968b f5549a = new C4968b();

    @IntRange(from = 0)
    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m5262a(@NotNull Context context, @FloatRange(from = 0.0d) float f11) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
