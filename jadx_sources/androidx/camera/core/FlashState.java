package androidx.camera.core;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: FlashState.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Landroidx/camera/core/FlashState;", "", "<init>", "()V", "UNKNOWN", "", "FIRED", "UNAVAILABLE", "NOT_FIRED", "FlashState", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FlashState {
    public static final int FIRED = 1;

    @NotNull
    public static final FlashState INSTANCE = new FlashState();
    public static final int NOT_FIRED = 3;
    public static final int UNAVAILABLE = 2;
    public static final int UNKNOWN = 0;

    /* JADX INFO: renamed from: androidx.camera.core.FlashState$FlashState, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlashState.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Landroidx/camera/core/FlashState$FlashState;", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p852kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface InterfaceC46957FlashState {
    }

    private FlashState() {
    }
}
