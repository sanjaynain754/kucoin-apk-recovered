package androidx.savedstate.serialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: ClassDiscriminatorMode.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Landroidx/savedstate/serialization/ClassDiscriminatorMode;", "", "<init>", "()V", "ALL_OBJECTS", "", "POLYMORPHIC", "Definition", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ClassDiscriminatorMode {
    public static final int ALL_OBJECTS = 1;

    @NotNull
    public static final ClassDiscriminatorMode INSTANCE = new ClassDiscriminatorMode();
    public static final int POLYMORPHIC = 2;

    /* JADX INFO: compiled from: ClassDiscriminatorMode.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Landroidx/savedstate/serialization/ClassDiscriminatorMode$Definition;", "", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p852kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Definition {
    }

    private ClassDiscriminatorMode() {
    }
}
