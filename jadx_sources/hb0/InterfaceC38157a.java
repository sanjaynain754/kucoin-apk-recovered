package hb0;

import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import ib0.C38510b;
import jb0.InterfaceC40375i;

/* JADX INFO: renamed from: hb0.a */
/* JADX INFO: compiled from: RefreshComponent.java */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC38157a extends InterfaceC40375i {
    @NonNull
    C38510b getSpinnerStyle();

    @NonNull
    View getView();

    boolean isSupportHorizontalDrag();

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    int onFinish(@NonNull InterfaceC38162f interfaceC38162f, boolean z11);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void onHorizontalDrag(float f11, int i11, int i12);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void onInitialized(@NonNull InterfaceC38161e interfaceC38161e, int i11, int i12);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void onMoving(boolean z11, float f11, int i11, int i12, int i13);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void onReleased(@NonNull InterfaceC38162f interfaceC38162f, int i11, int i12);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void onStartAnimator(@NonNull InterfaceC38162f interfaceC38162f, int i11, int i12);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void setPrimaryColors(@ColorInt int... iArr);
}
