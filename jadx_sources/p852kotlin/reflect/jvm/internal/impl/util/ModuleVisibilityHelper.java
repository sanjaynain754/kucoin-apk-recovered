package p852kotlin.reflect.jvm.internal.impl.util;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* JADX INFO: compiled from: ModuleVisibilityHelper.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ModuleVisibilityHelper {
    boolean isInFriendModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2);

    /* JADX INFO: compiled from: ModuleVisibilityHelper.kt */
    public static final class EMPTY implements ModuleVisibilityHelper {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public boolean isInFriendModule(@NotNull DeclarationDescriptor what, @NotNull DeclarationDescriptor from) {
            Intrinsics.checkNotNullParameter(what, "what");
            Intrinsics.checkNotNullParameter(from, "from");
            return true;
        }
    }
}
