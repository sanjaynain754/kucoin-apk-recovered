package p852kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class DescriptorKindExclude {

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class NonExtensions extends DescriptorKindExclude {

        @NotNull
        public static final NonExtensions INSTANCE = new NonExtensions();
        private static final int fullyExcludedDescriptorKinds;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
            fullyExcludedDescriptorKinds = (~(companion.getVARIABLES_MASK() | companion.getFUNCTIONS_MASK())) & companion.getALL_KINDS_MASK();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return fullyExcludedDescriptorKinds;
        }

        private NonExtensions() {
        }
    }

    public abstract int getFullyExcludedDescriptorKinds();

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class TopLevelPackages extends DescriptorKindExclude {

        @NotNull
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }

        private TopLevelPackages() {
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
