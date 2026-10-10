package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: DeserializedTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nDeserializedTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1563#2:59\n1634#2,3:60\n*S KotlinDebug\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n*L\n51#1:59\n51#1:60,3\n*E\n"})
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    @NotNull
    private final DeserializedAnnotations annotations;

    /* JADX INFO: renamed from: c */
    @NotNull
    private final DeserializationContext f91382c;

    @NotNull
    private final ProtoBuf.TypeParameter proto;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(@NotNull DeserializationContext c11, @NotNull ProtoBuf.TypeParameter proto, int i11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(proto, "proto");
        StorageManager storageManager = c11.getStorageManager();
        DeclarationDescriptor containingDeclaration = c11.getContainingDeclaration();
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = NameResolverUtilKt.getName(c11.getNameResolver(), proto.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.TypeParameter.Variance variance = proto.getVariance();
        Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
        super(storageManager, containingDeclaration, empty, name, protoEnumFlags.variance(variance), proto.getReified(), i11, SourceElement.NO_SOURCE, SupertypeLoopChecker.EMPTY.INSTANCE);
        this.f91382c = c11;
        this.proto = proto;
        this.annotations = new DeserializedAnnotations(c11.getStorageManager(), new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$$Lambda$0
            private final DeserializedTypeParameterDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return DeserializedTypeParameterDescriptor.annotations$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List annotations$lambda$0(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        return CollectionsKt.toList(deserializedTypeParameterDescriptor.f91382c.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(deserializedTypeParameterDescriptor.proto, deserializedTypeParameterDescriptor.f91382c.getNameResolver()));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public DeserializedAnnotations getAnnotations() {
        return this.annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: reportSupertypeLoopError, reason: merged with bridge method [inline-methods] */
    public Void mo105129reportSupertypeLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> resolveUpperBounds() {
        List<ProtoBuf.Type> listUpperBounds = ProtoTypeTableUtilKt.upperBounds(this.proto, this.f91382c.getTypeTable());
        if (listUpperBounds.isEmpty()) {
            return CollectionsKt.listOf(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        TypeDeserializer typeDeserializer = this.f91382c.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listUpperBounds, 10));
        Iterator<T> it = listUpperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }
}
