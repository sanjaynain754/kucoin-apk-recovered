package p852kotlin.reflect.jvm.internal.impl.p409km.jvm.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotation;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmClass;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmConstructor;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmEnumEntry;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmFunction;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmPackage;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmProperty;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmPropertyAccessorAttributes;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmType;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeAlias;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmValueParameter;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.ReadContext;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.ReadUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.ReadersKt;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.WriteContext;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.WriteUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.WritersKt;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.common.KmModuleFragment;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmClassExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmConstructorExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmEnumEntryExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtensionType;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmFunctionExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmModuleFragmentExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmPackageExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmPropertyExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeAliasExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeParameterExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmValueParameterExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;
import p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmFieldSignature;
import p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmMemberSignatureKt;
import p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmMethodSignature;
import p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: JvmMetadataExtensions.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJvmMetadataExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmMetadataExtensions.kt\nkotlin/metadata/jvm/internal/JvmMetadataExtensions\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1634#2,3:302\n1634#2,3:306\n1634#2,3:309\n1634#2,3:312\n1634#2,3:315\n1634#2,3:318\n1634#2,3:321\n1634#2,3:324\n1634#2,3:327\n1634#2,3:330\n1634#2,3:333\n1563#2:336\n1634#2,3:337\n1869#2,2:340\n1869#2,2:342\n1563#2:344\n1634#2,3:345\n1563#2:348\n1634#2,3:349\n1563#2:352\n1634#2,3:353\n1563#2:356\n1634#2,3:357\n1563#2:360\n1634#2,3:361\n1563#2:364\n1634#2,3:365\n1563#2:368\n1634#2,3:369\n1563#2:372\n1634#2,3:373\n1563#2:376\n1634#2,3:377\n1869#2,2:380\n1869#2,2:382\n1869#2,2:384\n1563#2:386\n1634#2,3:387\n1#3:305\n*S KotlinDebug\n*F\n+ 1 JvmMetadataExtensions.kt\nkotlin/metadata/jvm/internal/JvmMetadataExtensions\n*L\n25#1:302,3\n58#1:306,3\n59#1:309,3\n71#1:312,3\n72#1:315,3\n74#1:318,3\n76#1:321,3\n77#1:324,3\n78#1:327,3\n102#1:330,3\n130#1:333,3\n135#1:336\n135#1:337,3\n139#1:340,2\n151#1:342,2\n172#1:344\n172#1:345,3\n174#1:348\n174#1:349,3\n184#1:352\n184#1:353,3\n185#1:356\n185#1:357,3\n187#1:360\n187#1:361,3\n190#1:364\n190#1:365,3\n192#1:368\n192#1:369,3\n193#1:372\n193#1:373,3\n230#1:376\n230#1:377,3\n237#1:380,2\n243#1:382,2\n251#1:384,2\n267#1:386\n267#1:387,3\n*E\n"})
public final class JvmMetadataExtensions implements MetadataExtensions {
    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @Nullable
    public KmEnumEntryExtension createEnumEntryExtension() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @Nullable
    public KmTypeAliasExtension createTypeAliasExtension() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @Nullable
    public KmValueParameterExtension createValueParameterExtension() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @NotNull
    public KmClassExtension createClassExtension() {
        return new JvmClassExtension();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @NotNull
    public KmConstructorExtension createConstructorExtension() {
        return new JvmConstructorExtension();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @NotNull
    public KmFunctionExtension createFunctionExtension() {
        return new JvmFunctionExtension();
    }

    @NotNull
    public KmModuleFragmentExtension createModuleFragmentExtensions() {
        return new KmModuleFragmentExtension() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmMetadataExtensions.createModuleFragmentExtensions.1
            private final KmExtensionType type = new KmExtensionType(Reflection.getOrCreateKotlinClass(KmModuleFragmentExtension.class));

            @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmExtension
            public KmExtensionType getType() {
                return this.type;
            }
        };
    }

    @NotNull
    public KmPackageExtension createPackageExtension() {
        return new JvmPackageExtension();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @NotNull
    public KmPropertyExtension createPropertyExtension() {
        return new JvmPropertyExtension();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @NotNull
    public KmTypeExtension createTypeExtension() {
        return new JvmTypeExtension();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    @NotNull
    public KmTypeParameterExtension createTypeParameterExtension() {
        return new JvmTypeParameterExtension();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readClassExtensions(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class proto, @NotNull ReadContext c11) {
        String str;
        Intrinsics.checkNotNullParameter(kmClass, "kmClass");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmClassExtension jvm = JvmExtensionNodesKt.getJvm(kmClass);
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmClass.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.checkNotNull(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c11.getStrings()));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> anonymousObjectOriginName = JvmProtoBuf.anonymousObjectOriginName;
        Intrinsics.checkNotNullExpressionValue(anonymousObjectOriginName, "anonymousObjectOriginName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, anonymousObjectOriginName);
        if (num != null) {
            jvm.setAnonymousObjectOriginName(c11.get(num.intValue()));
        }
        for (ProtoBuf.Property property : (List) proto.getExtension(JvmProtoBuf.classLocalVariable)) {
            List<KmProperty> localDelegatedProperties = jvm.getLocalDelegatedProperties();
            Intrinsics.checkNotNull(property);
            localDelegatedProperties.add(ReadersKt.toKmProperty(property, c11));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName = JvmProtoBuf.classModuleName;
        Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
        Integer num2 = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, classModuleName);
        if (num2 == null || (str = c11.get(num2.intValue())) == null) {
            str = "main";
        }
        jvm.setModuleName(str);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> jvmClassFlags = JvmProtoBuf.jvmClassFlags;
        Intrinsics.checkNotNullExpressionValue(jvmClassFlags, "jvmClassFlags");
        Integer num3 = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, jvmClassFlags);
        if (num3 != null) {
            jvm.setJvmFlags(num3.intValue());
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readConstructorExtensions(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmConstructor, "kmConstructor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmConstructorExtension jvm = JvmExtensionNodesKt.getJvm(kmConstructor);
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmConstructor.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.checkNotNull(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c11.getStrings()));
        }
        JvmMemberSignature.Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature(proto, c11.getStrings(), c11.getTypes());
        jvm.setSignature(jvmConstructorSignature != null ? JvmMemberSignatureKt.wrapAsPublic(jvmConstructorSignature) : null);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readEnumEntryExtensions(@NotNull KmEnumEntry kmEnumEntry, @NotNull ProtoBuf.EnumEntry proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmEnumEntry, "kmEnumEntry");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        for (ProtoBuf.Annotation annotation : proto.getAnnotationList()) {
            List<KmAnnotation> annotations = kmEnumEntry.getAnnotations();
            Intrinsics.checkNotNull(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c11.getStrings()));
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readFunctionExtensions(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmFunction, "kmFunction");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmFunctionExtension jvm = JvmExtensionNodesKt.getJvm(kmFunction);
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmFunction.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.checkNotNull(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c11.getStrings()));
        }
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList = proto.getExtensionReceiverAnnotationList();
        Intrinsics.checkNotNullExpressionValue(extensionReceiverAnnotationList, "getExtensionReceiverAnnotationList(...)");
        List<KmAnnotation> extensionReceiverParameterAnnotations = kmFunction.getExtensionReceiverParameterAnnotations();
        for (ProtoBuf.Annotation annotation2 : extensionReceiverAnnotationList) {
            Intrinsics.checkNotNull(annotation2);
            extensionReceiverParameterAnnotations.add(ReadUtilsKt.readAnnotation(annotation2, c11.getStrings()));
        }
        JvmMemberSignature.Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature(proto, c11.getStrings(), c11.getTypes());
        jvm.setSignature(jvmMethodSignature != null ? JvmMemberSignatureKt.wrapAsPublic(jvmMethodSignature) : null);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> lambdaClassOriginName = JvmProtoBuf.lambdaClassOriginName;
        Intrinsics.checkNotNullExpressionValue(lambdaClassOriginName, "lambdaClassOriginName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, lambdaClassOriginName);
        if (num != null) {
            jvm.setLambdaClassOriginName(c11.get(num.intValue()));
        }
    }

    public void readModuleFragmentExtensions(@NotNull KmModuleFragment kmModuleFragment, @NotNull ProtoBuf.PackageFragment proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmModuleFragment, "kmModuleFragment");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
    }

    public void readPackageExtensions(@NotNull KmPackage kmPackage, @NotNull ProtoBuf.Package proto, @NotNull ReadContext c11) {
        String str;
        Intrinsics.checkNotNullParameter(kmPackage, "kmPackage");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmPackageExtension jvm = JvmExtensionNodesKt.getJvm(kmPackage);
        for (ProtoBuf.Property property : (List) proto.getExtension(JvmProtoBuf.packageLocalVariable)) {
            List<KmProperty> localDelegatedProperties = jvm.getLocalDelegatedProperties();
            Intrinsics.checkNotNull(property);
            localDelegatedProperties.add(ReadersKt.toKmProperty(property, c11));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.packageModuleName;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, packageModuleName);
        if (num == null || (str = c11.get(num.intValue())) == null) {
            str = "main";
        }
        jvm.setModuleName(str);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readPropertyExtensions(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmProperty, "kmProperty");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmPropertyExtension jvm = JvmExtensionNodesKt.getJvm(kmProperty);
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmProperty.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.checkNotNull(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c11.getStrings()));
        }
        List<ProtoBuf.Annotation> getterAnnotationList = proto.getGetterAnnotationList();
        Intrinsics.checkNotNullExpressionValue(getterAnnotationList, "getGetterAnnotationList(...)");
        List<KmAnnotation> annotations2 = kmProperty.getGetter().getAnnotations();
        for (ProtoBuf.Annotation annotation2 : getterAnnotationList) {
            Intrinsics.checkNotNull(annotation2);
            annotations2.add(ReadUtilsKt.readAnnotation(annotation2, c11.getStrings()));
        }
        KmPropertyAccessorAttributes setter = kmProperty.getSetter();
        if (setter != null) {
            List<ProtoBuf.Annotation> setterAnnotationList = proto.getSetterAnnotationList();
            Intrinsics.checkNotNullExpressionValue(setterAnnotationList, "getSetterAnnotationList(...)");
            List<KmAnnotation> annotations3 = setter.getAnnotations();
            for (ProtoBuf.Annotation annotation3 : setterAnnotationList) {
                Intrinsics.checkNotNull(annotation3);
                annotations3.add(ReadUtilsKt.readAnnotation(annotation3, c11.getStrings()));
            }
        }
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList = proto.getExtensionReceiverAnnotationList();
        Intrinsics.checkNotNullExpressionValue(extensionReceiverAnnotationList, "getExtensionReceiverAnnotationList(...)");
        List<KmAnnotation> extensionReceiverParameterAnnotations = kmProperty.getExtensionReceiverParameterAnnotations();
        for (ProtoBuf.Annotation annotation4 : extensionReceiverAnnotationList) {
            Intrinsics.checkNotNull(annotation4);
            extensionReceiverParameterAnnotations.add(ReadUtilsKt.readAnnotation(annotation4, c11.getStrings()));
        }
        List<ProtoBuf.Annotation> backingFieldAnnotationList = proto.getBackingFieldAnnotationList();
        Intrinsics.checkNotNullExpressionValue(backingFieldAnnotationList, "getBackingFieldAnnotationList(...)");
        List<KmAnnotation> backingFieldAnnotations = kmProperty.getBackingFieldAnnotations();
        for (ProtoBuf.Annotation annotation5 : backingFieldAnnotationList) {
            Intrinsics.checkNotNull(annotation5);
            backingFieldAnnotations.add(ReadUtilsKt.readAnnotation(annotation5, c11.getStrings()));
        }
        List<ProtoBuf.Annotation> delegateFieldAnnotationList = proto.getDelegateFieldAnnotationList();
        Intrinsics.checkNotNullExpressionValue(delegateFieldAnnotationList, "getDelegateFieldAnnotationList(...)");
        List<KmAnnotation> delegateFieldAnnotations = kmProperty.getDelegateFieldAnnotations();
        for (ProtoBuf.Annotation annotation6 : delegateFieldAnnotationList) {
            Intrinsics.checkNotNull(annotation6);
            delegateFieldAnnotations.add(ReadUtilsKt.readAnnotation(annotation6, c11.getStrings()));
        }
        JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, proto, c11.getStrings(), c11.getTypes(), false, 8, null);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
        JvmProtoBuf.JvmMethodSignature getter = (jvmPropertySignature == null || !jvmPropertySignature.hasGetter()) ? null : jvmPropertySignature.getGetter();
        JvmProtoBuf.JvmMethodSignature setter2 = (jvmPropertySignature == null || !jvmPropertySignature.hasSetter()) ? null : jvmPropertySignature.getSetter();
        Object extension = proto.getExtension(JvmProtoBuf.flags);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        jvm.setJvmFlags(((Number) extension).intValue());
        jvm.setFieldSignature(jvmFieldSignature$default != null ? JvmMemberSignatureKt.wrapAsPublic(jvmFieldSignature$default) : null);
        jvm.setGetterSignature(getter != null ? new JvmMethodSignature(c11.get(getter.getName()), c11.get(getter.getDesc())) : null);
        jvm.setSetterSignature(setter2 != null ? new JvmMethodSignature(c11.get(setter2.getName()), c11.get(setter2.getDesc())) : null);
        JvmProtoBuf.JvmMethodSignature syntheticMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasSyntheticMethod()) ? null : jvmPropertySignature.getSyntheticMethod();
        jvm.setSyntheticMethodForAnnotations(syntheticMethod != null ? new JvmMethodSignature(c11.get(syntheticMethod.getName()), c11.get(syntheticMethod.getDesc())) : null);
        JvmProtoBuf.JvmMethodSignature delegateMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasDelegateMethod()) ? null : jvmPropertySignature.getDelegateMethod();
        jvm.setSyntheticMethodForDelegate(delegateMethod != null ? new JvmMethodSignature(c11.get(delegateMethod.getName()), c11.get(delegateMethod.getDesc())) : null);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readTypeAliasExtensions(@NotNull KmTypeAlias kmTypeAlias, @NotNull ProtoBuf.TypeAlias proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmTypeAlias, "kmTypeAlias");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readTypeExtensions(@NotNull KmType kmType, @NotNull ProtoBuf.Type proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmType, "kmType");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmTypeExtension jvm = JvmExtensionNodesKt.getJvm(kmType);
        Object extension = proto.getExtension(JvmProtoBuf.isRaw);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        jvm.setRaw(((Boolean) extension).booleanValue());
        for (ProtoBuf.Annotation annotation : (List) proto.getExtension(JvmProtoBuf.typeAnnotation)) {
            List<KmAnnotation> annotations = jvm.getAnnotations();
            Intrinsics.checkNotNull(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c11.getStrings()));
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readTypeParameterExtensions(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "kmTypeParameter");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmTypeParameterExtension jvm = JvmExtensionNodesKt.getJvm(kmTypeParameter);
        for (ProtoBuf.Annotation annotation : (List) proto.getExtension(JvmProtoBuf.typeParameterAnnotation)) {
            List<KmAnnotation> annotations = jvm.getAnnotations();
            Intrinsics.checkNotNull(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c11.getStrings()));
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void readValueParameterExtensions(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter proto, @NotNull ReadContext c11) {
        Intrinsics.checkNotNullParameter(kmValueParameter, "kmValueParameter");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmValueParameter.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.checkNotNull(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c11.getStrings()));
        }
    }

    public void writeClassExtensions(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(kmClass, "kmClass");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmClassExtension jvm = JvmExtensionNodesKt.getJvm(kmClass);
        List<KmAnnotation> annotations = kmClass.getAnnotations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotations, 10));
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it.next(), c11.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
        String anonymousObjectOriginName = jvm.getAnonymousObjectOriginName();
        if (anonymousObjectOriginName != null) {
        }
        Iterator<T> it2 = jvm.getLocalDelegatedProperties().iterator();
        while (it2.hasNext()) {
            proto.addExtension(JvmProtoBuf.classLocalVariable, WritersKt.writeProperty(c11, (KmProperty) it2.next()).build());
        }
        String moduleName = jvm.getModuleName();
        if (moduleName != null && !Intrinsics.areEqual(moduleName, "main")) {
            proto.setExtension(JvmProtoBuf.classModuleName, Integer.valueOf(c11.get(moduleName)));
        }
        if (jvm.getJvmFlags() != 0) {
            proto.setExtension(JvmProtoBuf.jvmClassFlags, Integer.valueOf(jvm.getJvmFlags()));
        }
    }

    public void writeConstructorExtensions(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(kmConstructor, "kmConstructor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmConstructorExtension jvm = JvmExtensionNodesKt.getJvm(kmConstructor);
        List<KmAnnotation> annotations = kmConstructor.getAnnotations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotations, 10));
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it.next(), c11.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
        JvmMethodSignature signature = jvm.getSignature();
        if (signature != null) {
            proto.setExtension(JvmProtoBuf.constructorSignature, toJvmMethodSignature(signature, c11));
        }
    }

    public void writeEnumEntryExtensions(@NotNull KmEnumEntry enumEntry, @NotNull ProtoBuf.EnumEntry.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(enumEntry, "enumEntry");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        Iterator<T> it = enumEntry.getAnnotations().iterator();
        while (it.hasNext()) {
            proto.addAnnotation(WriteUtilsKt.writeAnnotation((KmAnnotation) it.next(), c11.getStrings()).build());
        }
    }

    public void writeFunctionExtensions(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(kmFunction, "kmFunction");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmFunctionExtension jvm = JvmExtensionNodesKt.getJvm(kmFunction);
        List<KmAnnotation> annotations = kmFunction.getAnnotations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotations, 10));
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it.next(), c11.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
        List<KmAnnotation> extensionReceiverParameterAnnotations = kmFunction.getExtensionReceiverParameterAnnotations();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(extensionReceiverParameterAnnotations, 10));
        Iterator<T> it2 = extensionReceiverParameterAnnotations.iterator();
        while (it2.hasNext()) {
            arrayList2.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it2.next(), c11.getStrings()).build());
        }
        proto.addAllExtensionReceiverAnnotation(arrayList2);
        JvmMethodSignature signature = jvm.getSignature();
        if (signature != null) {
        }
        String lambdaClassOriginName = jvm.getLambdaClassOriginName();
        if (lambdaClassOriginName != null) {
        }
    }

    public void writeModuleFragmentExtensions(@NotNull KmModuleFragment kmModuleFragment, @NotNull ProtoBuf.PackageFragment.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(kmModuleFragment, "kmModuleFragment");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
    }

    public void writePackageExtensions(@NotNull KmPackage kmPackage, @NotNull ProtoBuf.Package.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(kmPackage, "kmPackage");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmPackageExtension jvm = JvmExtensionNodesKt.getJvm(kmPackage);
        Iterator<T> it = jvm.getLocalDelegatedProperties().iterator();
        while (it.hasNext()) {
            proto.addExtension(JvmProtoBuf.packageLocalVariable, WritersKt.writeProperty(c11, (KmProperty) it.next()).build());
        }
        String moduleName = jvm.getModuleName();
        if (moduleName == null || Intrinsics.areEqual(moduleName, "main")) {
            return;
        }
        proto.setExtension(JvmProtoBuf.packageModuleName, Integer.valueOf(c11.get(moduleName)));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void writePropertyExtensions(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property.Builder proto, @NotNull WriteContext c11) {
        boolean z11;
        Intrinsics.checkNotNullParameter(kmProperty, "kmProperty");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmPropertyExtension jvm = JvmExtensionNodesKt.getJvm(kmProperty);
        List<KmAnnotation> annotations = kmProperty.getAnnotations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotations, 10));
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it.next(), c11.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
        List<KmAnnotation> annotations2 = kmProperty.getGetter().getAnnotations();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotations2, 10));
        Iterator<T> it2 = annotations2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it2.next(), c11.getStrings()).build());
        }
        proto.addAllGetterAnnotation(arrayList2);
        KmPropertyAccessorAttributes setter = kmProperty.getSetter();
        if (setter != null) {
            List<KmAnnotation> annotations3 = setter.getAnnotations();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotations3, 10));
            Iterator<T> it3 = annotations3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it3.next(), c11.getStrings()).build());
            }
            proto.addAllSetterAnnotation(arrayList3);
        }
        List<KmAnnotation> extensionReceiverParameterAnnotations = kmProperty.getExtensionReceiverParameterAnnotations();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(extensionReceiverParameterAnnotations, 10));
        Iterator<T> it4 = extensionReceiverParameterAnnotations.iterator();
        while (it4.hasNext()) {
            arrayList4.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it4.next(), c11.getStrings()).build());
        }
        proto.addAllExtensionReceiverAnnotation(arrayList4);
        List<KmAnnotation> backingFieldAnnotations = kmProperty.getBackingFieldAnnotations();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(backingFieldAnnotations, 10));
        Iterator<T> it5 = backingFieldAnnotations.iterator();
        while (it5.hasNext()) {
            arrayList5.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it5.next(), c11.getStrings()).build());
        }
        proto.addAllBackingFieldAnnotation(arrayList5);
        List<KmAnnotation> delegateFieldAnnotations = kmProperty.getDelegateFieldAnnotations();
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(delegateFieldAnnotations, 10));
        Iterator<T> it6 = delegateFieldAnnotations.iterator();
        while (it6.hasNext()) {
            arrayList6.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it6.next(), c11.getStrings()).build());
        }
        proto.addAllDelegateFieldAnnotation(arrayList6);
        JvmProtoBuf.JvmPropertySignature.Builder builderNewBuilder = JvmProtoBuf.JvmPropertySignature.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        boolean z12 = true;
        if (jvm.getFieldSignature() != null) {
            JvmProtoBuf.JvmFieldSignature.Builder builderNewBuilder2 = JvmProtoBuf.JvmFieldSignature.newBuilder();
            JvmFieldSignature fieldSignature = jvm.getFieldSignature();
            Intrinsics.checkNotNull(fieldSignature);
            builderNewBuilder2.setName(c11.get(fieldSignature.getName()));
            JvmFieldSignature fieldSignature2 = jvm.getFieldSignature();
            Intrinsics.checkNotNull(fieldSignature2);
            builderNewBuilder2.setDesc(c11.get(fieldSignature2.getDescriptor()));
            builderNewBuilder.setField(builderNewBuilder2.build());
            z11 = true;
        } else {
            z11 = false;
        }
        if (jvm.getGetterSignature() != null) {
            JvmMethodSignature getterSignature = jvm.getGetterSignature();
            Intrinsics.checkNotNull(getterSignature);
            builderNewBuilder.setGetter(toJvmMethodSignature(getterSignature, c11));
            z11 = true;
        }
        if (jvm.getSetterSignature() != null) {
            JvmMethodSignature setterSignature = jvm.getSetterSignature();
            Intrinsics.checkNotNull(setterSignature);
            builderNewBuilder.setSetter(toJvmMethodSignature(setterSignature, c11));
        } else {
            z12 = z11;
        }
        if (z12 && jvm.getSyntheticMethodForAnnotations() != null) {
            JvmMethodSignature syntheticMethodForAnnotations = jvm.getSyntheticMethodForAnnotations();
            Intrinsics.checkNotNull(syntheticMethodForAnnotations);
            builderNewBuilder.setSyntheticMethod(toJvmMethodSignature(syntheticMethodForAnnotations, c11));
        }
        if (z12 && jvm.getSyntheticMethodForDelegate() != null) {
            JvmMethodSignature syntheticMethodForDelegate = jvm.getSyntheticMethodForDelegate();
            Intrinsics.checkNotNull(syntheticMethodForDelegate);
            builderNewBuilder.setDelegateMethod(toJvmMethodSignature(syntheticMethodForDelegate, c11));
        }
        int jvmFlags = jvm.getJvmFlags();
        ProtoBuf.Property defaultInstance = ProtoBuf.Property.getDefaultInstance();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> generatedExtension = JvmProtoBuf.flags;
        Integer num = (Integer) defaultInstance.getExtension(generatedExtension);
        if (num == null || jvmFlags != num.intValue()) {
            proto.setExtension(generatedExtension, Integer.valueOf(jvm.getJvmFlags()));
        }
        if (z12) {
            proto.setExtension(JvmProtoBuf.propertySignature, builderNewBuilder.build());
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void writeTypeParameterExtensions(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "kmTypeParameter");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        Iterator<T> it = JvmExtensionNodesKt.getJvm(kmTypeParameter).getAnnotations().iterator();
        while (it.hasNext()) {
            proto.addExtension(JvmProtoBuf.typeParameterAnnotation, WriteUtilsKt.writeAnnotation((KmAnnotation) it.next(), c11.getStrings()).build());
        }
    }

    private final JvmProtoBuf.JvmMethodSignature toJvmMethodSignature(p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmMemberSignature jvmMemberSignature, WriteContext writeContext) {
        JvmProtoBuf.JvmMethodSignature.Builder builderNewBuilder = JvmProtoBuf.JvmMethodSignature.newBuilder();
        builderNewBuilder.setName(writeContext.get(jvmMemberSignature.getName()));
        builderNewBuilder.setDesc(writeContext.get(jvmMemberSignature.getDescriptor()));
        JvmProtoBuf.JvmMethodSignature jvmMethodSignatureBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(jvmMethodSignatureBuild, "build(...)");
        return jvmMethodSignatureBuild;
    }

    public void writeTypeAliasExtensions(@NotNull KmTypeAlias typeAlias, @NotNull ProtoBuf.TypeAlias.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void writeTypeExtensions(@NotNull KmType type, @NotNull ProtoBuf.Type.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        JvmTypeExtension jvm = JvmExtensionNodesKt.getJvm(type);
        if (jvm.isRaw()) {
            proto.setExtension(JvmProtoBuf.isRaw, Boolean.TRUE);
        }
        Iterator<T> it = jvm.getAnnotations().iterator();
        while (it.hasNext()) {
            proto.addExtension(JvmProtoBuf.typeAnnotation, WriteUtilsKt.writeAnnotation((KmAnnotation) it.next(), c11.getStrings()).build());
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions
    public void writeValueParameterExtensions(@NotNull KmValueParameter valueParameter, @NotNull ProtoBuf.ValueParameter.Builder proto, @NotNull WriteContext c11) {
        Intrinsics.checkNotNullParameter(valueParameter, "valueParameter");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c11, "c");
        List<KmAnnotation> annotations = valueParameter.getAnnotations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotations, 10));
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it.next(), c11.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
    }
}
