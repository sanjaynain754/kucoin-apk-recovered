package p852kotlin.reflect.jvm.internal.impl.renderer;

import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.CollectionsKt___CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import p852kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p852kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p852kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.WrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: DescriptorRendererImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nDescriptorRendererImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1225:1\n152#1,10:1226\n152#1,10:1236\n2746#2,3:1246\n774#2:1249\n865#2,2:1250\n1563#2:1252\n1634#2,3:1253\n774#2:1256\n865#2,2:1257\n1563#2:1259\n1634#2,3:1260\n1563#2:1263\n1634#2,3:1264\n1617#2,9:1268\n1869#2:1277\n1870#2:1279\n1626#2:1280\n2746#2,3:1281\n2746#2,3:1284\n774#2:1287\n865#2,2:1288\n1634#2,3:1290\n1#3:1267\n1#3:1278\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n*L\n138#1:1226,10\n145#1:1236,10\n200#1:1246,3\n501#1:1249\n501#1:1250,2\n502#1:1252\n502#1:1253,3\n504#1:1256\n504#1:1257,2\n504#1:1259\n504#1:1260,3\n506#1:1263\n506#1:1264,3\n515#1:1268,9\n515#1:1277\n515#1:1279\n515#1:1280\n606#1:1281,3\n608#1:1284,3\n824#1:1287\n824#1:1288,2\n847#1:1290,3\n515#1:1278\n*E\n"})
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    @NotNull
    private final Lazy functionTypeAnnotationsRenderer$delegate;

    @NotNull
    private final DescriptorRendererOptionsImpl options;

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {
        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
            visitClassDescriptor2(classDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb2) throws IOException {
            visitConstructorDescriptor2(constructorDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb2) throws IOException {
            visitFunctionDescriptor2(functionDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb2) {
            visitModuleDeclaration2(moduleDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
            visitPackageFragmentDescriptor2(packageFragmentDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
            visitPackageViewDescriptor2(packageViewDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb2) throws IOException {
            visitPropertyDescriptor2(propertyDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb2) throws IOException {
            visitPropertyGetterDescriptor2(propertyGetterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb2) throws IOException {
            visitPropertySetterDescriptor2(propertySetterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb2) {
            visitReceiverParameterDescriptor2(receiverParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
            visitTypeAliasDescriptor2(typeAliasDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2) {
            visitTypeParameterDescriptor2(typeParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb2) {
            visitValueParameterDescriptor2(valueParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        private final void visitPropertyAccessorDescriptor(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2, String str) throws IOException {
            int i11 = WhenMappings.$EnumSwitchMapping$0[DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    visitFunctionDescriptor2((FunctionDescriptor) propertyAccessorDescriptor, sb2);
                    return;
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            DescriptorRendererImpl.this.renderAccessorModifiers(propertyAccessorDescriptor, sb2);
            sb2.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
            Intrinsics.checkNotNullExpressionValue(correspondingProperty, "getCorrespondingProperty(...)");
            descriptorRendererImpl.renderProperty(correspondingProperty, sb2);
        }

        /* JADX INFO: renamed from: visitClassDescriptor, reason: avoid collision after fix types in other method */
        public void visitClassDescriptor2(@NotNull ClassDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderClass(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitConstructorDescriptor, reason: avoid collision after fix types in other method */
        public void visitConstructorDescriptor2(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderConstructor(constructorDescriptor, builder);
        }

        /* JADX INFO: renamed from: visitFunctionDescriptor, reason: avoid collision after fix types in other method */
        public void visitFunctionDescriptor2(@NotNull FunctionDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderFunction(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitModuleDeclaration, reason: avoid collision after fix types in other method */
        public void visitModuleDeclaration2(@NotNull ModuleDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderName(descriptor, builder, true);
        }

        /* JADX INFO: renamed from: visitPackageFragmentDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageFragmentDescriptor2(@NotNull PackageFragmentDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderPackageFragment(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitPackageViewDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageViewDescriptor2(@NotNull PackageViewDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderPackageView(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitPropertyDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyDescriptor2(@NotNull PropertyDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderProperty(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitPropertyGetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyGetterDescriptor2(@NotNull PropertyGetterDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            visitPropertyAccessorDescriptor(descriptor, builder, "getter");
        }

        /* JADX INFO: renamed from: visitPropertySetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertySetterDescriptor2(@NotNull PropertySetterDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            visitPropertyAccessorDescriptor(descriptor, builder, "setter");
        }

        /* JADX INFO: renamed from: visitReceiverParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitReceiverParameterDescriptor2(@NotNull ReceiverParameterDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.append(descriptor.getName());
        }

        /* JADX INFO: renamed from: visitTypeAliasDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeAliasDescriptor2(@NotNull TypeAliasDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderTypeAlias(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitTypeParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeParameterDescriptor2(@NotNull TypeParameterDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderTypeParameter(descriptor, builder, true);
        }

        /* JADX INFO: renamed from: visitValueParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitValueParameterDescriptor2(@NotNull ValueParameterDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.renderValueParameter(descriptor, true, builder, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public final void renderConstructor(ConstructorDescriptor constructorDescriptor, StringBuilder sb2) throws IOException {
        boolean z11;
        ClassConstructorDescriptor classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor;
        renderAnnotations$default(this, sb2, constructorDescriptor, null, 2, null);
        if (this.options.getRenderDefaultVisibility() || constructorDescriptor.getConstructedClass().getModality() != Modality.SEALED) {
            DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
            if (renderVisibility(visibility, sb2)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        renderMemberKind(constructorDescriptor, sb2);
        boolean z12 = getRenderConstructorKeyword() || !constructorDescriptor.isPrimary() || z11;
        if (z12) {
            sb2.append(renderKeyword("constructor"));
        }
        ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        if (getSecondaryConstructorsAsPrimary()) {
            if (z12) {
                sb2.append(C33627eb.f69716f);
            }
            renderName(containingDeclaration, sb2, true);
            List<TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            renderTypeParameters(typeParameters, sb2, false);
        }
        List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        renderValueParameters(valueParameters, constructorDescriptor.hasSynthesizedParameterNames(), sb2);
        if (getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof ClassDescriptor) && (classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor = ((ClassDescriptor) containingDeclaration).mo105116getUnsubstitutedPrimaryConstructor()) != null) {
            List<ValueParameterDescriptor> valueParameters2 = classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters2) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(renderKeyword("this"));
                sb2.append(CollectionsKt.joinToString$default(arrayList, ", ", "(", ")", 0, null, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$3
                    @Override // p852kotlin.jvm.functions.Function1
                    public Object invoke(Object obj2) {
                        return DescriptorRendererImpl.renderConstructor$lambda$26((ValueParameterDescriptor) obj2);
                    }
                }, 24, null));
            }
        }
        if (getSecondaryConstructorsAsPrimary()) {
            List<TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
            renderWhereSuffix(typeParameters2, sb2);
        }
    }

    private final void renderDefaultType(StringBuilder sb2, KotlinType kotlinType) {
        renderAnnotations$default(this, sb2, kotlinType, null, 2, null);
        DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) kotlinType : null;
        SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (KotlinTypeKt.isError(kotlinType)) {
            if (TypeUtilsKt.isUnresolvedType(kotlinType) && getPresentableUnresolvedTypes()) {
                sb2.append(renderError(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(kotlinType)));
            } else {
                if (!(kotlinType instanceof ErrorType) || getInformativeErrorType()) {
                    sb2.append(kotlinType.getConstructor().toString());
                } else {
                    sb2.append(((ErrorType) kotlinType).getDebugMessage());
                }
                sb2.append(renderTypeArguments(kotlinType.getArguments()));
            }
        } else if (kotlinType instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable().toString());
        } else if (original instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            renderTypeConstructorAndArguments$default(this, sb2, kotlinType, null, 2, null);
            Unit unit = Unit.INSTANCE;
        }
        if (kotlinType.isMarkedNullable()) {
            sb2.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb2.append(" & Any");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeAlias(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
        renderAnnotations$default(this, sb2, typeAliasDescriptor, null, 2, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        renderVisibility(visibility, sb2);
        renderMemberModifiers(typeAliasDescriptor, sb2);
        sb2.append(renderKeyword("typealias"));
        sb2.append(C33627eb.f69716f);
        renderName(typeAliasDescriptor, sb2, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        renderTypeParameters(declaredTypeParameters, sb2, false);
        renderCapturedTypeParametersIfRequired(typeAliasDescriptor, sb2);
        sb2.append(" = ");
        sb2.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFqName(@NotNull FqNameUnsafe fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return renderFqName(fqName.pathSegments());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderName(@NotNull Name name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strEscape = escape(RenderingUtilsKt.render(name));
        if (!getBoldOnlyForNamesInHtml() || getTextFormat() != RenderingFormat.HTML || !z11) {
            return strEscape;
        }
        return "<b>" + strEscape + "</b>";
    }

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        options.isLocked();
        this.functionTypeAnnotationsRenderer$delegate = LazyKt.lazy(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$0
            private final DescriptorRendererImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return DescriptorRendererImpl.functionTypeAnnotationsRenderer_delegate$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    private final void appendDefinedIn(StringBuilder sb2, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String name;
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) || (declarationDescriptor instanceof PackageViewDescriptor) || (containingDeclaration = declarationDescriptor.getContainingDeclaration()) == null || (containingDeclaration instanceof ModuleDescriptor)) {
            return;
        }
        sb2.append(C33627eb.f69716f);
        sb2.append(renderMessage("defined in"));
        sb2.append(C33627eb.f69716f);
        FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
        Intrinsics.checkNotNullExpressionValue(fqName, "getFqName(...)");
        sb2.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
        if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
            sb2.append(C33627eb.f69716f);
            sb2.append(renderMessage("in file"));
            sb2.append(C33627eb.f69716f);
            sb2.append(name);
        }
    }

    private final void appendTypeProjections(StringBuilder sb2, List<? extends TypeProjection> list) throws IOException {
        CollectionsKt___CollectionsKt.joinTo(list, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$2
            private final DescriptorRendererImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return DescriptorRendererImpl.appendTypeProjections$lambda$10(this.arg$0, (TypeProjection) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence appendTypeProjections$lambda$10(DescriptorRendererImpl descriptorRendererImpl, TypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isStarProjection()) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        KotlinType type = it.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        String strRenderType = descriptorRendererImpl.renderType(type);
        if (it.getProjectionKind() == Variance.INVARIANT) {
            return strRenderType;
        }
        return it.getProjectionKind() + ' ' + strRenderType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DescriptorRendererImpl functionTypeAnnotationsRenderer_delegate$lambda$1(DescriptorRendererImpl descriptorRendererImpl) {
        DescriptorRenderer descriptorRendererWithOptions = descriptorRendererImpl.withOptions(new Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$5
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return DescriptorRendererImpl.functionTypeAnnotationsRenderer_delegate$lambda$1$lambda$0((DescriptorRendererOptions) obj);
            }
        });
        Intrinsics.checkNotNull(descriptorRendererWithOptions, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (DescriptorRendererImpl) descriptorRendererWithOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit functionTypeAnnotationsRenderer_delegate$lambda$1$lambda$0(DescriptorRendererOptions withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.setExcludedTypeAnnotationClasses(SetsKt.plus((Set) withOptions.getExcludedTypeAnnotationClasses(), (Iterable) CollectionsKt.listOf((Object[]) new FqName[]{StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams})));
        return Unit.INSTANCE;
    }

    private final DescriptorRendererImpl getFunctionTypeAnnotationsRenderer() {
        return (DescriptorRendererImpl) this.functionTypeAnnotationsRenderer$delegate.getValue();
    }

    /* JADX INFO: renamed from: gt */
    private final String m90285gt() {
        return escape(">");
    }

    private final Modality implicitModalityWithoutExtensions(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        if (!overriddenDescriptors.isEmpty() && classDescriptor.getModality() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() != ClassKind.INTERFACE || Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
            return Modality.FINAL;
        }
        Modality modality = callableMemberDescriptor.getModality();
        Modality modality2 = Modality.ABSTRACT;
        return modality == modality2 ? modality2 : Modality.OPEN;
    }

    /* JADX INFO: renamed from: lt */
    private final String m90286lt() {
        return escape("<");
    }

    public static /* synthetic */ void renderAnnotations$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.renderAnnotations(sb2, annotated, annotationUseSiteTarget);
    }

    private final void renderClassKindPrefix(ClassDescriptor classDescriptor, StringBuilder sb2) {
        sb2.append(renderKeyword(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    private final String renderConstant(ConstantValue<?> constantValue) {
        Function1<ConstantValue<?>, String> propertyConstantRenderer = this.options.getPropertyConstantRenderer();
        if (propertyConstantRenderer != null) {
            return propertyConstantRenderer.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String strRenderConstant = renderConstant((ConstantValue) it.next());
                if (strRenderConstant != null) {
                    arrayList.add(strRenderConstant);
                }
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.removePrefix(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null), (CharSequence) "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value2).getType() + "::class";
        }
        if (!(value2 instanceof KClassValue.Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
        String strAsString = normalClass.getClassId().asSingleFqName().asString();
        int arrayDimensions = normalClass.getArrayDimensions();
        for (int i11 = 0; i11 < arrayDimensions; i11++) {
            strAsString = "kotlin.Array<" + strAsString + Typography.greater;
        }
        return strAsString + "::class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderConstructor$lambda$26(ValueParameterDescriptor valueParameterDescriptor) {
        return "";
    }

    private final String renderFqName(List<Name> list) {
        return escape(RenderingUtilsKt.renderFqName(list));
    }

    private final void renderModifier(StringBuilder sb2, boolean z11, String str) {
        if (z11) {
            sb2.append(renderKeyword(str));
            sb2.append(C33627eb.f69716f);
        }
    }

    private final void renderNormalizedTypeAsIs(StringBuilder sb2, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb2.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            sb2.append(((FlexibleType) unwrappedTypeUnwrap).render(this, this));
        } else {
            if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            renderSimpleType(sb2, (SimpleType) unwrappedTypeUnwrap);
        }
    }

    private final void renderSimpleType(StringBuilder sb2, SimpleType simpleType) {
        if (Intrinsics.areEqual(simpleType, TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
            sb2.append("???");
            return;
        }
        if (ErrorUtils.isUninferredTypeVariable(simpleType)) {
            if (!getUninferredTypeParameterAsName()) {
                sb2.append("???");
                return;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(renderError(((ErrorTypeConstructor) constructor).getParam(0)));
            return;
        }
        if (KotlinTypeKt.isError(simpleType)) {
            renderDefaultType(sb2, simpleType);
        } else if (shouldRenderAsPrettyFunctionType(simpleType)) {
            renderFunctionType(sb2, simpleType);
        } else {
            renderDefaultType(sb2, simpleType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object renderTypeConstructor$lambda$8(KotlinType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) it).getOriginalTypeVariable() : it;
    }

    public static /* synthetic */ void renderTypeConstructorAndArguments$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.renderTypeConstructorAndArguments(sb2, kotlinType, typeConstructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeParameter(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2, boolean z11) {
        if (z11) {
            sb2.append(m90286lt());
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(typeParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        renderModifier(sb2, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z12 = true;
        renderModifier(sb2, label.length() > 0, label);
        renderAnnotations$default(this, sb2, typeParameterDescriptor, null, 2, null);
        renderName(typeParameterDescriptor, sb2, z11);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z11) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb2.append(" : ");
                Intrinsics.checkNotNull(next);
                sb2.append(renderType(next));
            }
        } else if (z11) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z12) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    Intrinsics.checkNotNull(kotlinType);
                    sb2.append(renderType(kotlinType));
                    z12 = false;
                }
            }
        }
        if (z11) {
            sb2.append(m90285gt());
        }
    }

    private final void renderValVarPrefix(VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z11) {
        if (z11 || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb2.append(renderKeyword(variableDescriptor.isVar() ? "var" : TPReportParams.JSON_KEY_VAL));
            sb2.append(C33627eb.f69716f);
        }
    }

    public static /* synthetic */ void renderValVarPrefix$default(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        descriptorRendererImpl.renderValVarPrefix(variableDescriptor, sb2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    public final void renderValueParameter(ValueParameterDescriptor valueParameterDescriptor, boolean z11, StringBuilder sb2, boolean z12) {
        boolean z13;
        if (z12) {
            sb2.append(renderKeyword("value-parameter"));
            sb2.append(C33627eb.f69716f);
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(valueParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        renderAnnotations$default(this, sb2, valueParameterDescriptor, null, 2, null);
        renderModifier(sb2, valueParameterDescriptor.isCrossinline(), "crossinline");
        renderModifier(sb2, valueParameterDescriptor.isNoinline(), "noinline");
        boolean z14 = false;
        if (getRenderPrimaryConstructorParametersAsProperties()) {
            CallableDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
            ClassConstructorDescriptor classConstructorDescriptor = containingDeclaration instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) containingDeclaration : null;
            if (classConstructorDescriptor == null || !classConstructorDescriptor.isPrimary()) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else {
            z13 = false;
        }
        if (z13) {
            renderModifier(sb2, getActualPropertiesInPrimaryConstructor(), "actual");
        }
        renderVariable(valueParameterDescriptor, z11, sb2, z12, z13);
        if (getDefaultParameterValueRenderer() != null) {
            if (getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor)) {
                z14 = true;
            }
        }
        if (z14) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" = ");
            Function1<ValueParameterDescriptor, String> defaultParameterValueRenderer = getDefaultParameterValueRenderer();
            Intrinsics.checkNotNull(defaultParameterValueRenderer);
            sb3.append(defaultParameterValueRenderer.invoke(valueParameterDescriptor));
            sb2.append(sb3.toString());
        }
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.options.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    @Nullable
    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.options.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.options.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.options.getEachAnnotationOnNewLine();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.options.getEnhancedTypes();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.options.getInformativeErrorType();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    @NotNull
    public final DescriptorRendererOptionsImpl getOptions() {
        return this.options;
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.options.getPresentableUnresolvedTypes();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.options.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return this.options.getRenderAbbreviatedTypeComments();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.options.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.options.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.options.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.options.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return this.options.getTextFormat();
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String render(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), sb2);
        if (getWithDefinedIn()) {
            appendDefinedIn(sb2, declarationDescriptor);
        }
        return sb2.toString();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderAnnotation(@NotNull AnnotationDescriptor annotation, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        KotlinType type = annotation.getType();
        sb2.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            List<String> listRenderAndSortAnnotationArguments = renderAndSortAnnotationArguments(annotation);
            if (getIncludeEmptyAnnotationArguments() || !listRenderAndSortAnnotationArguments.isEmpty()) {
                CollectionsKt___CollectionsKt.joinTo(listRenderAndSortAnnotationArguments, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().mo105126getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    @NotNull
    public String renderClassifierName(@NotNull ClassifierDescriptor klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return ErrorUtils.isError(klass) ? klass.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(klass, this);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFlexibleType(@NotNull String lowerRendered, @NotNull String upperRendered, @NotNull KotlinBuiltIns builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (RenderingUtilsKt.typeStringsDifferOnlyInNullability(lowerRendered, upperRendered)) {
            if (!StringsKt.startsWith$default(upperRendered, "(", false, 2, (Object) null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
        ClassDescriptor collection = builtIns.getCollection();
        Intrinsics.checkNotNullExpressionValue(collection, "getCollection(...)");
        String strSubstringBefore$default = StringsKt.substringBefore$default(classifierNamePolicy.renderClassifier(collection, this), "Collection", (String) null, 2, (Object) null);
        String strReplacePrefixesInTypeRepresentations = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, strSubstringBefore$default + "Mutable", upperRendered, strSubstringBefore$default, strSubstringBefore$default + "(Mutable)");
        if (strReplacePrefixesInTypeRepresentations != null) {
            return strReplacePrefixesInTypeRepresentations;
        }
        String strReplacePrefixesInTypeRepresentations2 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, strSubstringBefore$default + "MutableMap.MutableEntry", upperRendered, strSubstringBefore$default + "Map.Entry", strSubstringBefore$default + "(Mutable)Map.(Mutable)Entry");
        if (strReplacePrefixesInTypeRepresentations2 != null) {
            return strReplacePrefixesInTypeRepresentations2;
        }
        ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
        ClassDescriptor array = builtIns.getArray();
        Intrinsics.checkNotNullExpressionValue(array, "getArray(...)");
        String strSubstringBefore$default2 = StringsKt.substringBefore$default(classifierNamePolicy2.renderClassifier(array, this), "Array", (String) null, 2, (Object) null);
        String strReplacePrefixesInTypeRepresentations3 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, strSubstringBefore$default2 + escape("Array<"), upperRendered, strSubstringBefore$default2 + escape("Array<out "), strSubstringBefore$default2 + escape("Array<(out) "));
        if (strReplacePrefixesInTypeRepresentations3 != null) {
            return strReplacePrefixesInTypeRepresentations3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    @NotNull
    public String renderMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 == 1) {
            return message;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "<set-?>");
        this.options.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy, "<set-?>");
        this.options.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z11) {
        this.options.setDebugMode(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.options.setModifiers(set);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.options.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z11) {
        this.options.setReceiverAfterName(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z11) {
        this.options.setRenderCompanionObjectName(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z11) {
        this.options.setStartFromName(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.options.setTextFormat(renderingFormat);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z11) {
        this.options.setVerbose(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z11) {
        this.options.setWithDefinedIn(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z11) {
        this.options.setWithoutSuperTypes(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z11) {
        this.options.setWithoutTypeParameters(z11);
    }

    private final String arrow() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return "&rarr;";
            }
            throw new NoWhenBranchMatchedException();
        }
        return escape("->");
    }

    private final String escape(String str) {
        return getTextFormat().escape(str);
    }

    private final boolean hasModifiersOrAnnotations(KotlinType kotlinType) {
        if (!FunctionTypesKt.isSuspendFunctionType(kotlinType) && kotlinType.getAnnotations().isEmpty()) {
            return false;
        }
        return true;
    }

    private final boolean isParameterName(AnnotationDescriptor annotationDescriptor) {
        return Intrinsics.areEqual(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName);
    }

    private final boolean overridesSomething(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.getOverriddenDescriptors().isEmpty();
    }

    private final void renderAbbreviatedTypeComment(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat textFormat = getTextFormat();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (textFormat == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        renderNormalizedTypeAsIs(sb2, abbreviatedType.getAbbreviation());
        sb2.append(" */");
        if (getTextFormat() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderAccessorModifiers(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2) {
        renderMemberModifiers(propertyAccessorDescriptor, sb2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    private final void renderAdditionalModifiers(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        boolean z11;
        boolean z12 = false;
        if (functionDescriptor.isOperator()) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
            if (!overriddenDescriptors.isEmpty()) {
                Iterator<T> it = overriddenDescriptors.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isOperator()) {
                            if (!getAlwaysRenderModifiers()) {
                                z11 = false;
                            }
                        }
                    }
                }
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (functionDescriptor.isInfix()) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors2, "getOverriddenDescriptors(...)");
            if (!overriddenDescriptors2.isEmpty()) {
                Iterator<T> it2 = overriddenDescriptors2.iterator();
                while (it2.hasNext()) {
                    if (((FunctionDescriptor) it2.next()).isInfix()) {
                        if (getAlwaysRenderModifiers()) {
                            break;
                        }
                    }
                }
                z12 = true;
            } else {
                z12 = true;
            }
        }
        renderModifier(sb2, functionDescriptor.isTailrec(), "tailrec");
        renderSuspendModifier(functionDescriptor, sb2);
        renderModifier(sb2, functionDescriptor.isInline(), "inline");
        renderModifier(sb2, z12, "infix");
        renderModifier(sb2, z11, C33675gh.f69997c);
    }

    private final List<String> renderAndSortAnnotationArguments(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass;
        String strRenderConstant;
        ClassConstructorDescriptor classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        List listEmptyList = null;
        if (getRenderDefaultAnnotationArguments()) {
            annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        } else {
            annotationClass = null;
        }
        if (annotationClass != null && (classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor = annotationClass.mo105116getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters) {
                if (((ValueParameterDescriptor) obj).declaresDefaultValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
            }
            listEmptyList = arrayList2;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listEmptyList) {
            if (!allValueArguments.containsKey((Name) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Name) it2.next()).asString() + " = ...");
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = allValueArguments.entrySet();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Name name = (Name) entry.getKey();
            ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name.asString());
            sb2.append(" = ");
            if (!listEmptyList.contains(name)) {
                strRenderConstant = renderConstant(constantValue);
            } else {
                strRenderConstant = "...";
            }
            sb2.append(strRenderConstant);
            arrayList5.add(sb2.toString());
        }
        return CollectionsKt.sorted(CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5));
    }

    private final void renderAnnotations(StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set<FqName> excludedAnnotationClasses;
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            if (annotated instanceof KotlinType) {
                excludedAnnotationClasses = getExcludedTypeAnnotationClasses();
            } else {
                excludedAnnotationClasses = getExcludedAnnotationClasses();
            }
            Function1<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.contains(excludedAnnotationClasses, annotationDescriptor.getFqName()) && !isParameterName(annotationDescriptor) && (annotationFilter == null || annotationFilter.invoke(annotationDescriptor).booleanValue())) {
                    sb2.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(C33627eb.f69716f);
                    }
                }
            }
        }
    }

    private final void renderCapturedTypeParametersIfRequired(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb2) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb2.append(" /*captured type parameters: ");
            renderTypeParameterList(sb2, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderClass(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
        boolean z11;
        ClassConstructorDescriptor classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!getStartFromName()) {
            List<ReceiverParameterDescriptor> contextReceivers = classDescriptor.getContextReceivers();
            Intrinsics.checkNotNullExpressionValue(contextReceivers, "getContextReceivers(...)");
            renderContextReceivers(contextReceivers, sb2);
            renderAnnotations$default(this, sb2, classDescriptor, null, 2, null);
            if (!z11) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                renderVisibility(visibility, sb2);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.getModality() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != Modality.FINAL)) {
                Modality modality = classDescriptor.getModality();
                Intrinsics.checkNotNullExpressionValue(modality, "getModality(...)");
                renderModality(modality, sb2, implicitModalityWithoutExtensions(classDescriptor));
            }
            renderMemberModifiers(classDescriptor, sb2);
            if (getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner()) {
                z12 = true;
            } else {
                z12 = false;
            }
            renderModifier(sb2, z12, "inner");
            if (getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData()) {
                z13 = true;
            } else {
                z13 = false;
            }
            renderModifier(sb2, z13, "data");
            if (getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline()) {
                z14 = true;
            } else {
                z14 = false;
            }
            renderModifier(sb2, z14, "inline");
            if (getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor.isValue()) {
                z15 = true;
            } else {
                z15 = false;
            }
            renderModifier(sb2, z15, "value");
            if (getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor.isFun()) {
                z16 = true;
            } else {
                z16 = false;
            }
            renderModifier(sb2, z16, "fun");
            renderClassKindPrefix(classDescriptor, sb2);
        }
        if (!DescriptorUtils.isCompanionObject(classDescriptor)) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb2);
            }
            renderName(classDescriptor, sb2, true);
        } else {
            renderCompanionObjectName(classDescriptor, sb2);
        }
        if (z11) {
            return;
        }
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        renderTypeParameters(declaredTypeParameters, sb2, false);
        renderCapturedTypeParametersIfRequired(classDescriptor, sb2);
        if (!classDescriptor.getKind().isSingleton() && getClassWithPrimaryConstructor() && (classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor = classDescriptor.mo105116getUnsubstitutedPrimaryConstructor()) != null) {
            sb2.append(C33627eb.f69716f);
            renderAnnotations$default(this, sb2, classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor, null, 2, null);
            DescriptorVisibility visibility2 = classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility2, "getVisibility(...)");
            renderVisibility(visibility2, sb2);
            sb2.append(renderKeyword("constructor"));
            List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            renderValueParameters(valueParameters, classConstructorDescriptorMo105116getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb2);
        }
        renderSuperTypes(classDescriptor, sb2);
        renderWhereSuffix(declaredTypeParameters, sb2);
    }

    private final void renderCompanionObjectName(DeclarationDescriptor declarationDescriptor, StringBuilder sb2) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb2.append("companion object");
            }
            renderSpaceIfNeeded(sb2);
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb2.append("of ");
                Name name = containingDeclaration.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb2.append(renderName(name, false));
            }
        }
        if (!getVerbose() && Intrinsics.areEqual(declarationDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
            return;
        }
        if (!getStartFromName()) {
            renderSpaceIfNeeded(sb2);
        }
        Name name2 = declarationDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        sb2.append(renderName(name2, true));
    }

    private final void renderContextReceivers(List<? extends ReceiverParameterDescriptor> list, StringBuilder sb2) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            int i11 = 0;
            for (ReceiverParameterDescriptor receiverParameterDescriptor : list) {
                int i12 = i11 + 1;
                renderAnnotations(sb2, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
                KotlinType type = receiverParameterDescriptor.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                sb2.append(renderForReceiver(type));
                if (i11 == CollectionsKt.getLastIndex(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i11 = i12;
            }
        }
    }

    private final String renderError(String str) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return "<font color=red><b>" + str + "</b></font>";
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    private final void renderExpandedTypeComment(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat textFormat = getTextFormat();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (textFormat == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        renderNormalizedTypeAsIs(sb2, abbreviatedType.getExpandedType());
        sb2.append(" */");
        if (getTextFormat() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    private final String renderForReceiver(KotlinType kotlinType) {
        String strRenderType = renderType(kotlinType);
        if ((shouldRenderAsPrettyFunctionType(kotlinType) && !TypeUtils.isNullableType(kotlinType)) || (kotlinType instanceof DefinitelyNotNullType)) {
            return '(' + strRenderType + ')';
        }
        return strRenderType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderFunction(FunctionDescriptor functionDescriptor, StringBuilder sb2) throws IOException {
        FunctionDescriptor functionDescriptor2;
        StringBuilder sb3;
        String strRenderType;
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = functionDescriptor.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
                renderContextReceivers(contextReceiverParameters, sb2);
                functionDescriptor2 = functionDescriptor;
                sb3 = sb2;
                renderAnnotations$default(this, sb3, functionDescriptor2, null, 2, null);
                DescriptorVisibility visibility = functionDescriptor2.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                renderVisibility(visibility, sb3);
                renderModalityForCallable(functionDescriptor2, sb3);
                if (getIncludeAdditionalModifiers()) {
                    renderMemberModifiers(functionDescriptor2, sb3);
                }
                renderOverride(functionDescriptor2, sb3);
                if (getIncludeAdditionalModifiers()) {
                    renderAdditionalModifiers(functionDescriptor2, sb3);
                } else {
                    renderSuspendModifier(functionDescriptor2, sb3);
                }
                renderMemberKind(functionDescriptor2, sb3);
                if (getVerbose()) {
                    if (functionDescriptor2.isHiddenToOvercomeSignatureClash()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor2.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            } else {
                functionDescriptor2 = functionDescriptor;
                sb3 = sb2;
            }
            sb3.append(renderKeyword("fun"));
            sb3.append(C33627eb.f69716f);
            List<TypeParameterDescriptor> typeParameters = functionDescriptor2.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            renderTypeParameters(typeParameters, sb3, true);
            renderReceiver(functionDescriptor2, sb3);
        } else {
            functionDescriptor2 = functionDescriptor;
            sb3 = sb2;
        }
        renderName(functionDescriptor2, sb3, true);
        List<ValueParameterDescriptor> valueParameters = functionDescriptor2.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        renderValueParameters(valueParameters, functionDescriptor2.hasSynthesizedParameterNames(), sb3);
        renderReceiverAfterName(functionDescriptor2, sb3);
        KotlinType returnType = functionDescriptor2.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb3.append(": ");
            if (returnType == null) {
                strRenderType = "[NULL]";
            } else {
                strRenderType = renderType(returnType);
            }
            sb3.append(strRenderType);
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor2.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        renderWhereSuffix(typeParameters2, sb3);
    }

    private final void renderFunctionType(StringBuilder sb2, KotlinType kotlinType) {
        boolean z11;
        boolean z12;
        Name nameExtractParameterNameFromFunctionTypeArgument;
        boolean z13;
        int length = sb2.length();
        renderAnnotations$default(getFunctionTypeAnnotationsRenderer(), sb2, kotlinType, null, 2, null);
        if (sb2.length() != length) {
            z11 = true;
        } else {
            z11 = false;
        }
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        boolean zIsSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean zIsMarkedNullable = kotlinType.isMarkedNullable();
        if (!zIsMarkedNullable && (!z11 || receiverTypeFromFunctionType == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            if (zIsSuspendFunctionType) {
                sb2.insert(length, '(');
            } else {
                if (z11) {
                    CharsKt.isWhitespace(StringsKt.last(sb2));
                    if (sb2.charAt(StringsKt.getLastIndex(sb2) - 1) != ')') {
                        sb2.insert(StringsKt.getLastIndex(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        renderModifier(sb2, zIsSuspendFunctionType, "suspend");
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb2.append("context(");
            Iterator<KotlinType> it = contextReceiverTypesFromFunctionType.subList(0, CollectionsKt.getLastIndex(contextReceiverTypesFromFunctionType)).iterator();
            while (it.hasNext()) {
                renderNormalizedType(sb2, it.next());
                sb2.append(", ");
            }
            renderNormalizedType(sb2, (KotlinType) CollectionsKt.last((List) contextReceiverTypesFromFunctionType));
            sb2.append(") ");
        }
        if (receiverTypeFromFunctionType != null) {
            if ((!shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) || receiverTypeFromFunctionType.isMarkedNullable()) && !hasModifiersOrAnnotations(receiverTypeFromFunctionType) && !(receiverTypeFromFunctionType instanceof DefinitelyNotNullType)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                sb2.append("(");
            }
            renderNormalizedType(sb2, receiverTypeFromFunctionType);
            if (z13) {
                sb2.append(")");
            }
            sb2.append(C33978va.f72339h);
        }
        sb2.append("(");
        if (FunctionTypesKt.isBuiltinExtensionFunctionalType(kotlinType) && kotlinType.getArguments().size() <= 1) {
            sb2.append("???");
        } else {
            int i11 = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
                int i12 = i11 + 1;
                if (i11 > 0) {
                    sb2.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    nameExtractParameterNameFromFunctionTypeArgument = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                } else {
                    nameExtractParameterNameFromFunctionTypeArgument = null;
                }
                if (nameExtractParameterNameFromFunctionTypeArgument != null) {
                    sb2.append(renderName(nameExtractParameterNameFromFunctionTypeArgument, false));
                    sb2.append(": ");
                }
                sb2.append(renderTypeProjection(typeProjection));
                i11 = i12;
            }
        }
        sb2.append(") ");
        sb2.append(arrow());
        sb2.append(C33627eb.f69716f);
        renderNormalizedType(sb2, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z12) {
            sb2.append(")");
        }
        if (zIsMarkedNullable) {
            sb2.append("?");
        }
    }

    private final void renderInitializer(VariableDescriptor variableDescriptor, StringBuilder sb2) {
        ConstantValue<?> constantValueMo105118getCompileTimeInitializer;
        String strRenderConstant;
        if (getIncludePropertyConstant() && (constantValueMo105118getCompileTimeInitializer = variableDescriptor.mo105118getCompileTimeInitializer()) != null && (strRenderConstant = renderConstant(constantValueMo105118getCompileTimeInitializer)) != null) {
            sb2.append(" = ");
            sb2.append(escape(strRenderConstant));
        }
    }

    private final String renderKeyword(String str) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (!getBoldOnlyForNamesInHtml()) {
                    return "<b>" + str + "</b>";
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return str;
    }

    private final void renderMemberKind(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb2.append("*/ ");
        }
    }

    private final void renderMemberModifiers(MemberDescriptor memberDescriptor, StringBuilder sb2) {
        boolean z11;
        renderModifier(sb2, memberDescriptor.isExternal(), "external");
        boolean z12 = false;
        if (getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect()) {
            z11 = true;
        } else {
            z11 = false;
        }
        renderModifier(sb2, z11, "expect");
        if (getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual()) {
            z12 = true;
        }
        renderModifier(sb2, z12, "actual");
    }

    private final void renderModality(Modality modality, StringBuilder sb2, Modality modality2) {
        if (!getRenderDefaultModality() && modality == modality2) {
            return;
        }
        renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
    }

    private final void renderModalityForCallable(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (!DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) || callableMemberDescriptor.getModality() != Modality.FINAL) {
            if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && overridesSomething(callableMemberDescriptor)) {
                return;
            }
            Modality modality = callableMemberDescriptor.getModality();
            Intrinsics.checkNotNullExpressionValue(modality, "getModality(...)");
            renderModality(modality, sb2, implicitModalityWithoutExtensions(callableMemberDescriptor));
        }
    }

    private final void renderNormalizedType(StringBuilder sb2, KotlinType kotlinType) {
        AbbreviatedType abbreviatedType;
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof AbbreviatedType) {
            abbreviatedType = (AbbreviatedType) unwrappedTypeUnwrap;
        } else {
            abbreviatedType = null;
        }
        if (abbreviatedType != null) {
            if (getRenderTypeExpansions()) {
                renderNormalizedTypeAsIs(sb2, abbreviatedType.getExpandedType());
                if (getRenderAbbreviatedTypeComments()) {
                    renderAbbreviatedTypeComment(sb2, abbreviatedType);
                    return;
                }
                return;
            }
            renderNormalizedTypeAsIs(sb2, abbreviatedType.getAbbreviation());
            if (getRenderUnabbreviatedType()) {
                renderExpandedTypeComment(sb2, abbreviatedType);
                return;
            }
            return;
        }
        renderNormalizedTypeAsIs(sb2, kotlinType);
    }

    private final void renderOverride(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && overridesSomething(callableMemberDescriptor) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            renderModifier(sb2, true, "override");
            if (getVerbose()) {
                sb2.append("/*");
                sb2.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageFragment(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
        renderPackageHeader(packageFragmentDescriptor.getFqName(), "package-fragment", sb2);
        if (getDebugMode()) {
            sb2.append(" in ");
            renderName(packageFragmentDescriptor.getContainingDeclaration(), sb2, false);
        }
    }

    private final void renderPackageHeader(FqName fqName, String str, StringBuilder sb2) {
        sb2.append(renderKeyword(str));
        String strRenderFqName = renderFqName(fqName.toUnsafe());
        if (strRenderFqName.length() > 0) {
            sb2.append(C33627eb.f69716f);
            sb2.append(strRenderFqName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageView(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
        renderPackageHeader(packageViewDescriptor.getFqName(), TPDownloadProxyEnum.DLPARAM_PACKAGE, sb2);
        if (getDebugMode()) {
            sb2.append(" in context of ");
            renderName(packageViewDescriptor.getModule(), sb2, false);
        }
    }

    private final void renderPossiblyInnerType(StringBuilder sb2, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            renderPossiblyInnerType(sb2, outerType);
            sb2.append('.');
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb2.append(renderName(name, false));
        } else {
            TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
            sb2.append(renderTypeConstructor(typeConstructor));
        }
        sb2.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderProperty(PropertyDescriptor propertyDescriptor, StringBuilder sb2) throws IOException {
        PropertyDescriptor propertyDescriptor2;
        StringBuilder sb3;
        boolean z11;
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
                renderContextReceivers(contextReceiverParameters, sb2);
                renderPropertyAnnotations(propertyDescriptor, sb2);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                renderVisibility(visibility, sb2);
                boolean z12 = false;
                if (getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                renderModifier(sb2, z11, "const");
                renderMemberModifiers(propertyDescriptor, sb2);
                renderModalityForCallable(propertyDescriptor, sb2);
                renderOverride(propertyDescriptor, sb2);
                if (getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    z12 = true;
                }
                renderModifier(sb2, z12, "lateinit");
                renderMemberKind(propertyDescriptor, sb2);
            }
            propertyDescriptor2 = propertyDescriptor;
            sb3 = sb2;
            renderValVarPrefix$default(this, propertyDescriptor2, sb3, false, 4, null);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor2.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            renderTypeParameters(typeParameters, sb3, true);
            renderReceiver(propertyDescriptor2, sb3);
        } else {
            propertyDescriptor2 = propertyDescriptor;
            sb3 = sb2;
        }
        renderName(propertyDescriptor2, sb3, true);
        sb3.append(": ");
        KotlinType type = propertyDescriptor2.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb3.append(renderType(type));
        renderReceiverAfterName(propertyDescriptor2, sb3);
        renderInitializer(propertyDescriptor2, sb3);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor2.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        renderWhereSuffix(typeParameters2, sb3);
    }

    private final void renderPropertyAnnotations(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            renderAnnotations$default(this, sb2, propertyDescriptor, null, 2, null);
            FieldDescriptor backingField = propertyDescriptor.getBackingField();
            if (backingField != null) {
                renderAnnotations(sb2, backingField, AnnotationUseSiteTarget.FIELD);
            }
            FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
            if (delegateField != null) {
                renderAnnotations(sb2, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    renderAnnotations(sb2, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    renderAnnotations(sb2, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.single((List) valueParameters);
                    Intrinsics.checkNotNull(valueParameterDescriptor);
                    renderAnnotations(sb2, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void renderReceiver(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            renderAnnotations(sb2, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(renderForReceiver(type));
            sb2.append(C33978va.f72339h);
        }
    }

    private final void renderReceiverAfterName(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) != null) {
            sb2.append(" on ");
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(renderType(type));
        }
    }

    private final void renderSpaceIfNeeded(StringBuilder sb2) {
        int length = sb2.length();
        if (length != 0 && sb2.charAt(length - 1) == ' ') {
            return;
        }
        sb2.append(' ');
    }

    private final void renderSuperTypes(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
        if (!getWithoutSuperTypes() && !KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            Collection<KotlinType> collectionMo105127getSupertypes = classDescriptor.getTypeConstructor().mo105127getSupertypes();
            Intrinsics.checkNotNullExpressionValue(collectionMo105127getSupertypes, "getSupertypes(...)");
            if (!collectionMo105127getSupertypes.isEmpty()) {
                if (collectionMo105127getSupertypes.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny(collectionMo105127getSupertypes.iterator().next())) {
                    renderSpaceIfNeeded(sb2);
                    sb2.append(": ");
                    CollectionsKt___CollectionsKt.joinTo(collectionMo105127getSupertypes, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$4
                        private final DescriptorRendererImpl arg$0;

                        @Override // p852kotlin.jvm.functions.Function1
                        public Object invoke(Object obj) {
                            return DescriptorRendererImpl.renderSuperTypes$lambda$36(this.arg$0, (KotlinType) obj);
                        }

                        {
                            this.arg$0 = this;
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderSuperTypes$lambda$36(DescriptorRendererImpl descriptorRendererImpl, KotlinType kotlinType) {
        Intrinsics.checkNotNull(kotlinType);
        return descriptorRendererImpl.renderType(kotlinType);
    }

    private final void renderSuspendModifier(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        renderModifier(sb2, functionDescriptor.isSuspend(), "suspend");
    }

    private final void renderTypeConstructorAndArguments(StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType possiblyInnerTypeBuildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (possiblyInnerTypeBuildPossiblyInnerType == null) {
            sb2.append(renderTypeConstructor(typeConstructor));
            sb2.append(renderTypeArguments(kotlinType.getArguments()));
        } else {
            renderPossiblyInnerType(sb2, possiblyInnerTypeBuildPossiblyInnerType);
        }
    }

    private final void renderTypeParameterList(StringBuilder sb2, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            renderTypeParameter(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final void renderTypeParameters(List<? extends TypeParameterDescriptor> list, StringBuilder sb2, boolean z11) {
        if (!getWithoutTypeParameters() && !list.isEmpty()) {
            sb2.append(m90286lt());
            renderTypeParameterList(sb2, list);
            sb2.append(m90285gt());
            if (z11) {
                sb2.append(C33627eb.f69716f);
            }
        }
    }

    private final void renderValueParameters(Collection<? extends ValueParameterDescriptor> collection, boolean z11, StringBuilder sb2) {
        boolean zShouldRenderParameterNames = shouldRenderParameterNames(z11);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb2);
        int i11 = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i11, size, sb2);
            renderValueParameter(valueParameterDescriptor, zShouldRenderParameterNames, sb2, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i11, size, sb2);
            i11++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb2);
    }

    private final void renderVariable(VariableDescriptor variableDescriptor, boolean z11, StringBuilder sb2, boolean z12, boolean z13) {
        ValueParameterDescriptor valueParameterDescriptor;
        KotlinType kotlinType;
        boolean z14;
        KotlinType type = variableDescriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        KotlinType varargElementType = null;
        if (variableDescriptor instanceof ValueParameterDescriptor) {
            valueParameterDescriptor = (ValueParameterDescriptor) variableDescriptor;
        } else {
            valueParameterDescriptor = null;
        }
        if (valueParameterDescriptor != null) {
            varargElementType = valueParameterDescriptor.getVarargElementType();
        }
        if (varargElementType == null) {
            kotlinType = type;
        } else {
            kotlinType = varargElementType;
        }
        if (varargElementType != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        renderModifier(sb2, z14, "vararg");
        if (z13 || (z12 && !getStartFromName())) {
            renderValVarPrefix(variableDescriptor, sb2, z13);
        }
        if (z11) {
            renderName(variableDescriptor, sb2, z12);
            sb2.append(": ");
        }
        sb2.append(renderType(kotlinType));
        renderInitializer(variableDescriptor, sb2);
        if (getVerbose() && varargElementType != null) {
            sb2.append(" /*");
            sb2.append(renderType(type));
            sb2.append("*/");
        }
    }

    private final boolean renderVisibility(DescriptorVisibility descriptorVisibility, StringBuilder sb2) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb2.append(renderKeyword(descriptorVisibility.getInternalDisplayName()));
        sb2.append(C33627eb.f69716f);
        return true;
    }

    private final void renderWhereSuffix(List<? extends TypeParameterDescriptor> list, StringBuilder sb2) throws IOException {
        if (!getWithoutTypeParameters()) {
            ArrayList arrayList = new ArrayList(0);
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                for (KotlinType kotlinType : CollectionsKt.drop(upperBounds, 1)) {
                    StringBuilder sb3 = new StringBuilder();
                    Name name = typeParameterDescriptor.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    sb3.append(renderName(name, false));
                    sb3.append(" : ");
                    Intrinsics.checkNotNull(kotlinType);
                    sb3.append(renderType(kotlinType));
                    arrayList.add(sb3.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(C33627eb.f69716f);
                sb2.append(renderKeyword("where"));
                sb2.append(C33627eb.f69716f);
                CollectionsKt___CollectionsKt.joinTo(arrayList, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
    }

    private final boolean shouldRenderAsPrettyFunctionType(KotlinType kotlinType) {
        if (FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            List<TypeProjection> arguments = kotlinType.getArguments();
            if (arguments == null || !arguments.isEmpty()) {
                Iterator<T> it = arguments.iterator();
                while (it.hasNext()) {
                    if (((TypeProjection) it.next()).isStarProjection()) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private final boolean shouldRenderParameterNames(boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!z11) {
            return true;
        }
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderType(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb2 = new StringBuilder();
        renderNormalizedType(sb2, getTypeNormalizer().invoke(type));
        return sb2.toString();
    }

    @NotNull
    public String renderTypeArguments(@NotNull List<? extends TypeProjection> typeArguments) throws IOException {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m90286lt());
        appendTypeProjections(sb2, typeArguments);
        sb2.append(m90285gt());
        return sb2.toString();
    }

    @NotNull
    public String renderTypeConstructor(@NotNull TypeConstructor typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = typeConstructor.mo105126getDeclarationDescriptor();
        if (!(classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptor) && !(classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor) && !(classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            if (classifierDescriptorMo105126getDeclarationDescriptor == null) {
                if (typeConstructor instanceof IntersectionTypeConstructor) {
                    return ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(new Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$1
                        @Override // p852kotlin.jvm.functions.Function1
                        public Object invoke(Object obj) {
                            return DescriptorRendererImpl.renderTypeConstructor$lambda$8((KotlinType) obj);
                        }
                    });
                }
                return typeConstructor.toString();
            }
            throw new IllegalStateException(("Unexpected classifier: " + classifierDescriptorMo105126getDeclarationDescriptor.getClass()).toString());
        }
        return renderClassifierName(classifierDescriptorMo105126getDeclarationDescriptor);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderTypeProjection(@NotNull TypeProjection typeProjection) throws IOException {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        appendTypeProjections(sb2, CollectionsKt.listOf(typeProjection));
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderName(DeclarationDescriptor declarationDescriptor, StringBuilder sb2, boolean z11) {
        Name name = declarationDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(renderName(name, z11));
    }
}
