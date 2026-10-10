package cv;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cv.c */
/* JADX INFO: compiled from: FlutterGestureStatus.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/FlutterGestureStatus;", "", "<init>", "()V", "VIEWPAGER_STATUS_FLUTTER_CANCEL", "", "VIEWPAGER_STATUS_FLUTTER_STOP", "VIEWPAGER_STATUS_FLUTTER_FOCUS", "VIEWPAGER_STATUS_FLUTTER_DRAG", "flutterGestureOn", "", "gesture", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36546c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36546c f79388a = new C36546c();

    /* JADX INFO: renamed from: a */
    public final boolean m81812a(@NotNull String gesture) {
        Intrinsics.checkNotNullParameter(gesture, "gesture");
        return Intrinsics.areEqual(gesture, "focus");
    }
}
