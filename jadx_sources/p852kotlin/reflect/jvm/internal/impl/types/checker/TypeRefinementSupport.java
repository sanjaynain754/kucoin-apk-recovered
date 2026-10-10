package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinTypeRefiner.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class TypeRefinementSupport {
    private final boolean isEnabled;

    /* JADX INFO: compiled from: KotlinTypeRefiner.kt */
    public static final class Enabled extends TypeRefinementSupport {

        @NotNull
        private final KotlinTypeRefiner typeRefiner;

        @NotNull
        public final KotlinTypeRefiner getTypeRefiner() {
            return this.typeRefiner;
        }
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }
}
