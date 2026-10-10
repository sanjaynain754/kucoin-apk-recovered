package p852kotlin;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: OptIn.kt */
/* JADX INFO: loaded from: classes61.dex */
@Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin(version = "1.3")
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\nB\"\u0012\u000e\b\u0002\u0010\u0002\u001a\u00020\u0003B\u0004\b\b(\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\u00020\u0006B\u0006\b\n0\u00068\u0007R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\bR\u000f\u0010\u0005\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lkotlin/RequiresOptIn;", "", "message", "", "", FirebaseAnalytics.Param.LEVEL, "Lkotlin/RequiresOptIn$Level;", "ERROR", "()Ljava/lang/String;", "()Lkotlin/RequiresOptIn$Level;", "Level", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@p852kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface RequiresOptIn {

    /* JADX INFO: compiled from: OptIn.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lkotlin/RequiresOptIn$Level;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum Level {
        WARNING,
        ERROR;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }
    }

    Level level() default Level.ERROR;

    String message() default "";
}
