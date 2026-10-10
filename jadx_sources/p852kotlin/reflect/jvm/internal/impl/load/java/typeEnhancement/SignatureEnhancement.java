package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p852kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import p852kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.RawType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1563#2:297\n1634#2,3:298\n1563#2:301\n1634#2,3:302\n1563#2:306\n1634#2,3:307\n1761#2,3:310\n1761#2,3:313\n1573#2:316\n1604#2,4:317\n1563#2:321\n1634#2,3:322\n1563#2:325\n1634#2,3:326\n1#3:305\n*S KotlinDebug\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n*L\n55#1:297\n55#1:298,3\n66#1:301\n66#1:302,3\n123#1:306\n123#1:307,3\n144#1:310,3\n150#1:313,3\n156#1:316\n156#1:317,4\n170#1:321\n170#1:322,3\n220#1:325\n220#1:326,3\n*E\n"})
public final class SignatureEnhancement {

    @NotNull
    private final JavaTypeEnhancement typeEnhancement;

    private final KotlinType enhance(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z11, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z12, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        SignatureParts signatureParts = new SignatureParts(annotated, z11, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinTypeInvoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(overriddenDescriptors, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : overriddenDescriptors) {
            Intrinsics.checkNotNull(callableMemberDescriptor2);
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return enhance(signatureParts, kotlinTypeInvoke, arrayList, typeEnhancementInfo, z12);
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z11, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z12, Function1 function1, int i11, Object obj) {
        return signatureEnhancement.enhance(callableMemberDescriptor, annotated, z11, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i11 & 32) != 0 ? false : z12, function1);
    }

    private final boolean containsFunctionN(KotlinType kotlinType) {
        return TypeUtils.contains(kotlinType, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return SignatureEnhancement.containsFunctionN$lambda$16((UnwrappedType) obj);
            }
        });
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, SignatureParts signatureParts, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return signatureEnhancement.enhance(signatureParts, kotlinType, list, typeEnhancementInfo2, z11);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021a, code lost:
    
        if (r3 == null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <D extends CallableMemberDescriptor> D enhanceSignature(D d11, LazyJavaResolverContext lazyJavaResolverContext) {
        D d12;
        KotlinType kotlinTypeEnhanceValueParameter;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        boolean z11;
        boolean z12;
        boolean z13;
        KotlinType type;
        List<TypeEnhancementInfo> parametersInfo;
        String errorsSinceLanguageVersion;
        PropertyDescriptorImpl propertyDescriptorImpl;
        PropertyGetterDescriptorImpl getter;
        if (!(d11 instanceof JavaCallableMemberDescriptor)) {
            return d11;
        }
        if (d11.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE || d11.getOriginal().getOverriddenDescriptors().size() != 1) {
            LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, getDefaultAnnotations(d11, lazyJavaResolverContext));
            if (!(d11 instanceof JavaPropertyDescriptor) || (getter = (propertyDescriptorImpl = (PropertyDescriptorImpl) d11).getGetter()) == null || getter.isDefault()) {
                d12 = d11;
            } else {
                PropertyGetterDescriptorImpl getter2 = propertyDescriptorImpl.getGetter();
                Intrinsics.checkNotNull(getter2);
                d12 = getter2;
            }
            KotlinType type2 = null;
            if (d11.getExtensionReceiverParameter() != null) {
                FunctionDescriptor functionDescriptor = d12 instanceof FunctionDescriptor ? (FunctionDescriptor) d12 : null;
                kotlinTypeEnhanceValueParameter = enhanceValueParameter(d11, functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$0
                    @Override // p852kotlin.jvm.functions.Function1
                    public Object invoke(Object obj) {
                        return SignatureEnhancement.enhanceSignature$lambda$2((CallableMemberDescriptor) obj);
                    }
                });
            } else {
                kotlinTypeEnhanceValueParameter = null;
            }
            JavaMethodDescriptor javaMethodDescriptor = d11 instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d11 : null;
            int i11 = 0;
            if (javaMethodDescriptor != null) {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                String strSignature = MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
                if (strSignature != null) {
                    PredefinedFunctionEnhancementInfo warningModeClone = PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(strSignature);
                    if (warningModeClone == null) {
                        warningModeClone = null;
                    } else {
                        if (warningModeClone.getErrorsSinceLanguageVersion() != null && ((errorsSinceLanguageVersion = warningModeClone.getErrorsSinceLanguageVersion()) == null || !StringsKt.startsWith$default(errorsSinceLanguageVersion, "2.", false, 2, (Object) null))) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (warningModeClone.getErrorsSinceLanguageVersion() != null) {
                            warningModeClone = warningModeClone.getWarningModeClone();
                        }
                    }
                    predefinedFunctionEnhancementInfo = warningModeClone;
                } else {
                    predefinedFunctionEnhancementInfo = null;
                }
            } else {
                predefinedFunctionEnhancementInfo = null;
            }
            if (predefinedFunctionEnhancementInfo != null) {
                predefinedFunctionEnhancementInfo.getParametersInfo().size();
                ((JavaMethodDescriptor) d11).getValueParameters().size();
            }
            boolean z14 = (UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState()) || lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(d11);
            List<ValueParameterDescriptor> valueParameters = d12.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueParameters, 10));
            for (final ValueParameterDescriptor valueParameterDescriptor : valueParameters) {
                arrayList.add(enhanceValueParameter(d11, valueParameterDescriptor, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, (predefinedFunctionEnhancementInfo == null || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? null : (TypeEnhancementInfo) CollectionsKt.getOrNull(parametersInfo, valueParameterDescriptor.getIndex()), z14, new Function1(valueParameterDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$1
                    private final ValueParameterDescriptor arg$0;

                    @Override // p852kotlin.jvm.functions.Function1
                    public Object invoke(Object obj) {
                        return SignatureEnhancement.enhanceSignature$lambda$9$lambda$8(this.arg$0, (CallableMemberDescriptor) obj);
                    }

                    {
                        this.arg$0 = valueParameterDescriptor;
                    }
                }));
            }
            PropertyDescriptor propertyDescriptor = d11 instanceof PropertyDescriptor ? (PropertyDescriptor) d11 : null;
            KotlinType kotlinTypeEnhance$default = enhance$default(this, d11, d12, true, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, (propertyDescriptor == null || !JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE : AnnotationQualifierApplicabilityType.FIELD, predefinedFunctionEnhancementInfo != null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$2
                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return SignatureEnhancement.enhanceSignature$lambda$10((CallableMemberDescriptor) obj);
                }
            }, 32, null);
            KotlinType returnType = d11.getReturnType();
            Intrinsics.checkNotNull(returnType);
            if (containsFunctionN(returnType)) {
                z11 = true;
            } else {
                ReceiverParameterDescriptor extensionReceiverParameter = d11.getExtensionReceiverParameter();
                if ((extensionReceiverParameter == null || (type = extensionReceiverParameter.getType()) == null) ? false : containsFunctionN(type)) {
                    z11 = true;
                } else {
                    List<ValueParameterDescriptor> valueParameters2 = d11.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                    if (valueParameters2 != null && valueParameters2.isEmpty()) {
                        z13 = false;
                        break;
                    }
                    Iterator<T> it = valueParameters2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z13 = false;
                            break;
                        }
                        KotlinType type3 = ((ValueParameterDescriptor) it.next()).getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                        if (containsFunctionN(type3)) {
                            z13 = true;
                            break;
                        }
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
            Pair<CallableDescriptor.UserDataKey<?>, ?> pairM90091to = z11 ? TuplesKt.m90091to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d11)) : null;
            if (kotlinTypeEnhanceValueParameter == null && kotlinTypeEnhance$default == null) {
                if (arrayList.isEmpty()) {
                    z12 = false;
                    break;
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z12 = false;
                        break;
                    }
                    if (((KotlinType) it2.next()) != null) {
                        z12 = true;
                        break;
                    }
                }
                if (!z12) {
                }
            }
            JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d11;
            if (kotlinTypeEnhanceValueParameter == null) {
                ReceiverParameterDescriptor extensionReceiverParameter2 = d11.getExtensionReceiverParameter();
                if (extensionReceiverParameter2 != null) {
                    type2 = extensionReceiverParameter2.getType();
                }
            } else {
                type2 = kotlinTypeEnhanceValueParameter;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (Object obj : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                KotlinType type4 = (KotlinType) obj;
                if (type4 == null) {
                    type4 = d11.getValueParameters().get(i11).getType();
                    Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                }
                arrayList2.add(type4);
                i11 = i12;
            }
            if (kotlinTypeEnhance$default == null) {
                kotlinTypeEnhance$default = d11.getReturnType();
                Intrinsics.checkNotNull(kotlinTypeEnhance$default);
            }
            JavaCallableMemberDescriptor javaCallableMemberDescriptorEnhance = javaCallableMemberDescriptor.enhance(type2, arrayList2, kotlinTypeEnhance$default, pairM90091to);
            Intrinsics.checkNotNull(javaCallableMemberDescriptorEnhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
            return javaCallableMemberDescriptorEnhance;
        }
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$10(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType returnType = it.getReturnType();
        Intrinsics.checkNotNull(returnType);
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$2(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
        Intrinsics.checkNotNull(extensionReceiverParameter);
        KotlinType type = extensionReceiverParameter.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$9$lambda$8(ValueParameterDescriptor valueParameterDescriptor, CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType type = it.getValueParameters().get(valueParameterDescriptor.getIndex()).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enhanceTypeParameterBounds$lambda$15$lambda$14(UnwrappedType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof RawType;
    }

    private final KotlinType enhanceValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z11, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers;
        return enhance(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z11, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(@NotNull LazyJavaResolverContext c11, @NotNull Collection<? extends D> platformSignatures) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(platformSignatures, 10));
        Iterator<T> it = platformSignatures.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), c11));
        }
        return arrayList;
    }

    public SignatureEnhancement(@NotNull JavaTypeEnhancement typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.typeEnhancement = typeEnhancement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean containsFunctionN$lambda$16(UnwrappedType unwrappedType) {
        boolean z11;
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = unwrappedType.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorMo105126getDeclarationDescriptor.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(classifierDescriptorMo105126getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME())) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d11, LazyJavaResolverContext lazyJavaResolverContext) {
        LazyJavaClassDescriptor lazyJavaClassDescriptor;
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d11);
        if (topLevelContainingClassifier == null) {
            return d11.getAnnotations();
        }
        List<JavaAnnotation> moduleAnnotations = null;
        if (topLevelContainingClassifier instanceof LazyJavaClassDescriptor) {
            lazyJavaClassDescriptor = (LazyJavaClassDescriptor) topLevelContainingClassifier;
        } else {
            lazyJavaClassDescriptor = null;
        }
        if (lazyJavaClassDescriptor != null) {
            moduleAnnotations = lazyJavaClassDescriptor.getModuleAnnotations();
        }
        if (moduleAnnotations != null && !moduleAnnotations.isEmpty()) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(moduleAnnotations, 10));
            Iterator<T> it = moduleAnnotations.iterator();
            while (it.hasNext()) {
                arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
            }
            return Annotations.Companion.create(CollectionsKt.plus((Iterable) d11.getAnnotations(), (Iterable) arrayList));
        }
        return d11.getAnnotations();
    }

    @NotNull
    public final KotlinType enhanceSuperType(@NotNull KotlinType type, @NotNull LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        KotlinType kotlinTypeEnhance$default = enhance$default(this, new SignatureParts(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type, CollectionsKt.emptyList(), null, false, 12, null);
        if (kotlinTypeEnhance$default == null) {
            return type;
        }
        return kotlinTypeEnhance$default;
    }

    @NotNull
    public final List<KotlinType> enhanceTypeParameterBounds(@NotNull TypeParameterDescriptor typeParameter, @NotNull List<? extends KotlinType> bounds, @NotNull LazyJavaResolverContext context) {
        KotlinType kotlinType;
        KotlinType kotlinTypeEnhance$default;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bounds, 10));
        for (KotlinType kotlinType2 : bounds) {
            if (TypeUtilsKt.contains(kotlinType2, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$3
                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return Boolean.valueOf(SignatureEnhancement.enhanceTypeParameterBounds$lambda$15$lambda$14((UnwrappedType) obj));
                }
            })) {
                kotlinType = kotlinType2;
            } else {
                kotlinType = kotlinType2;
                kotlinTypeEnhance$default = enhance$default(this, new SignatureParts(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, CollectionsKt.emptyList(), null, false, 12, null);
                if (kotlinTypeEnhance$default == null) {
                }
                arrayList.add(kotlinTypeEnhance$default);
            }
            kotlinTypeEnhance$default = kotlinType;
            arrayList.add(kotlinTypeEnhance$default);
        }
        return arrayList;
    }

    private final KotlinType enhance(SignatureParts signatureParts, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z11) {
        return this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, list, typeEnhancementInfo, z11), signatureParts.getSkipRawTypeArguments());
    }
}
