package p852kotlin.reflect.jvm.internal.impl.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class MemberKindCheck implements Check {

    @NotNull
    private final String description;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class Member extends MemberKindCheck {

        @NotNull
        public static final Member INSTANCE = new Member();

        private Member() {
            super("must be a member function", null);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getDispatchReceiverParameter() != null;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class MemberOrExtension extends MemberKindCheck {

        @NotNull
        public static final MemberOrExtension INSTANCE = new MemberOrExtension();

        private MemberOrExtension() {
            super("must be a member or an extension function", null);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.getDispatchReceiverParameter() == null && functionDescriptor.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    public /* synthetic */ MemberKindCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private MemberKindCheck(String str) {
        this.description = str;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.description;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
