package p852kotlin.reflect.jvm.internal;

import com.tencent.bugly.proguard.C33978va;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt___CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KParameter;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u0007*\u00060\bj\u0002`\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\f\u001a\u00020\u0007*\u00060\bj\u0002`\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "<init>", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderCallable", "", "descriptor", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", "parameter", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReflectionObjectRenderer {

    @NotNull
    public static final ReflectionObjectRenderer INSTANCE = new ReflectionObjectRenderer();

    @NotNull
    private static final DescriptorRenderer renderer = DescriptorRenderer.FQ_NAMES_IN_TYPES;

    /* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void appendReceiverType(StringBuilder sb2, ReceiverParameterDescriptor receiverParameterDescriptor) {
        if (receiverParameterDescriptor != null) {
            KotlinType type = receiverParameterDescriptor.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(renderType(type));
            sb2.append(C33978va.f72339h);
        }
    }

    private final String renderCallable(CallableDescriptor descriptor) {
        if (descriptor instanceof PropertyDescriptor) {
            return renderProperty((PropertyDescriptor) descriptor);
        }
        if (descriptor instanceof FunctionDescriptor) {
            return renderFunction((FunctionDescriptor) descriptor);
        }
        throw new IllegalStateException(("Illegal callable: " + descriptor).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderFunction$lambda$2$lambda$1(ValueParameterDescriptor valueParameterDescriptor) {
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return reflectionObjectRenderer.renderType(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderLambda$lambda$4$lambda$3(ValueParameterDescriptor valueParameterDescriptor) {
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return reflectionObjectRenderer.renderType(type);
    }

    @NotNull
    public final String renderFunction(@NotNull FunctionDescriptor descriptor) throws IOException {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(descriptorRenderer.renderName(name, true));
        List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.joinTo(valueParameters, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ReflectionObjectRenderer.renderFunction$lambda$2$lambda$1((ValueParameterDescriptor) obj);
            }
        });
        sb2.append(": ");
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(reflectionObjectRenderer.renderType(returnType));
        return sb2.toString();
    }

    @NotNull
    public final String renderLambda(@NotNull FunctionDescriptor invoke) throws IOException {
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb2, invoke);
        List<ValueParameterDescriptor> valueParameters = invoke.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.joinTo(valueParameters, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ReflectionObjectRenderer.renderLambda$lambda$4$lambda$3((ValueParameterDescriptor) obj);
            }
        });
        sb2.append(" -> ");
        KotlinType returnType = invoke.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(reflectionObjectRenderer.renderType(returnType));
        return sb2.toString();
    }

    @NotNull
    public final String renderParameter(@NotNull KParameterImpl parameter) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i11 = WhenMappings.$EnumSwitchMapping$0[parameter.getKind().ordinal()];
        if (i11 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i11 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(INSTANCE.renderCallable(parameter.getCallable().getDescriptor()));
        return sb2.toString();
    }

    @NotNull
    public final String renderProperty(@NotNull PropertyDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.isVar() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(descriptorRenderer.renderName(name, true));
        sb2.append(": ");
        KotlinType type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(reflectionObjectRenderer.renderType(type));
        return sb2.toString();
    }

    private ReflectionObjectRenderer() {
    }

    private final void appendReceivers(StringBuilder sb2, CallableDescriptor callableDescriptor) {
        boolean z11;
        ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(callableDescriptor);
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        appendReceiverType(sb2, instanceReceiverParameter);
        if (instanceReceiverParameter != null && extensionReceiverParameter != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            sb2.append("(");
        }
        appendReceiverType(sb2, extensionReceiverParameter);
        if (z11) {
            sb2.append(")");
        }
    }

    @NotNull
    public final String renderType(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return renderer.renderType(type);
    }
}
