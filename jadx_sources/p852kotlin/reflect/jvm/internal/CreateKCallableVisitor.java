package p852kotlin.reflect.jvm.internal;

import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", TtmlNode.RUBY_CONTAINER, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "visitPropertyDescriptor", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "data", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/CreateKCallableVisitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
public class CreateKCallableVisitor extends DeclarationDescriptorVisitorEmptyBodies<KCallableImpl<?>, Unit> {

    @NotNull
    private final KDeclarationContainerImpl container;

    public CreateKCallableVisitor(@NotNull KDeclarationContainerImpl container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    @NotNull
    public KCallableImpl<?> visitFunctionDescriptor(@NotNull FunctionDescriptor descriptor, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new KFunctionImpl(this.container, descriptor);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    @NotNull
    public KCallableImpl<?> visitPropertyDescriptor(@NotNull PropertyDescriptor descriptor, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = (descriptor.getDispatchReceiverParameter() != null ? 1 : 0) + (descriptor.getExtensionReceiverParameter() != null ? 1 : 0);
        if (descriptor.isVar()) {
            if (i11 == 0) {
                return new KMutableProperty0Impl(this.container, descriptor);
            }
            if (i11 == 1) {
                return new KMutableProperty1Impl(this.container, descriptor);
            }
            if (i11 == 2) {
                return new KMutableProperty2Impl(this.container, descriptor);
            }
        } else {
            if (i11 == 0) {
                return new KProperty0Impl(this.container, descriptor);
            }
            if (i11 == 1) {
                return new KProperty1Impl(this.container, descriptor);
            }
            if (i11 == 2) {
                return new KProperty2Impl(this.container, descriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }
}
