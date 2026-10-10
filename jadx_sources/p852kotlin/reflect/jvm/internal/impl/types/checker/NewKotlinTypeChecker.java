package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final NewKotlinTypeCheckerImpl Default = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.INSTANCE, null, 2, 0 == true ? 1 : 0);

        @NotNull
        public final NewKotlinTypeCheckerImpl getDefault() {
            return Default;
        }

        private Companion() {
        }
    }

    @NotNull
    KotlinTypeRefiner getKotlinTypeRefiner();

    @NotNull
    OverridingUtil getOverridingUtil();
}
