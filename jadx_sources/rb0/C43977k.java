package rb0;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.core.GestureHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rb0.k */
/* JADX INFO: compiled from: ManualGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lrb0/k;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43977k extends GestureHandler<C43977k> {
    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (getState() == 0) {
            m71786n();
        }
    }
}
