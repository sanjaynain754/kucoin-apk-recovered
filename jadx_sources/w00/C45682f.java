package w00;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w00.f */
/* JADX INFO: compiled from: ViewGroupBindings.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/View;)Landroid/view/View;", "b", "sdk_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C45682f {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final View m100800a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view instanceof ViewGroup)) {
            return view;
        }
        View childAt = ((ViewGroup) view).getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "{\n        view.getChildAt(0)\n    }");
        return childAt;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final View m100801b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view;
    }
}
