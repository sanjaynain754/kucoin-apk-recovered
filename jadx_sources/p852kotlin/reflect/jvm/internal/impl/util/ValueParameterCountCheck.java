package p852kotlin.reflect.jvm.internal.impl.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class ValueParameterCountCheck implements Check {

    @NotNull
    private final String description;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class AtLeast extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: n */
        private final int f91387n;

        public AtLeast(int i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i11);
            sb2.append(" value parameter");
            sb2.append(i11 > 1 ? CmcdData.Factory.STREAMING_FORMAT_SS : "");
            super(sb2.toString(), null);
            this.f91387n = i11;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() >= this.f91387n;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class Equals extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: n */
        private final int f91388n;

        public Equals(int i11) {
            super("must have exactly " + i11 + " value parameters", null);
            this.f91388n = i11;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == this.f91388n;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class NoValueParameters extends ValueParameterCountCheck {

        @NotNull
        public static final NoValueParameters INSTANCE = new NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class SingleValueParameter extends ValueParameterCountCheck {

        @NotNull
        public static final SingleValueParameter INSTANCE = new SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    public /* synthetic */ ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ValueParameterCountCheck(String str) {
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
