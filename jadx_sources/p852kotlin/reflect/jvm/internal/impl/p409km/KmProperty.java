package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.BooleanFlagDelegate;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.FlagDelegatesImplKt;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.FlagImpl;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmPropertyExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmProperty\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1#2:831\n1563#3:832\n1634#3,3:833\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmProperty\n*L\n390#1:832\n390#1:833,3\n*E\n"})
public final class KmProperty {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(KmProperty.class, "_hasSetter", "get_hasSetter()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(KmProperty.class, "_hasGetter", "get_hasGetter()Z", 0))};

    @NotNull
    private final BooleanFlagDelegate _hasGetter$delegate;

    @NotNull
    private final BooleanFlagDelegate _hasSetter$delegate;

    @NotNull
    private final List<KmAnnotation> annotations;

    @NotNull
    private final List<KmAnnotation> backingFieldAnnotations;

    @NotNull
    private final List<KmType> contextReceiverTypes;

    @NotNull
    private final List<KmAnnotation> delegateFieldAnnotations;

    @NotNull
    private final List<KmAnnotation> extensionReceiverParameterAnnotations;

    @NotNull
    private final List<KmPropertyExtension> extensions;
    private int flags;

    @NotNull
    private final KmPropertyAccessorAttributes getter;

    @NotNull
    private String name;

    @Nullable
    private KmType receiverParameterType;
    public KmType returnType;

    @Nullable
    private KmPropertyAccessorAttributes setter;

    @Nullable
    private KmValueParameter setterParameter;

    @NotNull
    private final List<KmTypeParameter> typeParameters;

    @NotNull
    private final List<KmVersionRequirement> versionRequirements;

    public KmProperty(int i11, @NotNull String name, int i12, int i13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.flags = i11;
        this.name = name;
        Flags.BooleanFlagField HAS_SETTER = Flags.HAS_SETTER;
        Intrinsics.checkNotNullExpressionValue(HAS_SETTER, "HAS_SETTER");
        this._hasSetter$delegate = FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(HAS_SETTER));
        Flags.BooleanFlagField HAS_GETTER = Flags.HAS_GETTER;
        Intrinsics.checkNotNullExpressionValue(HAS_GETTER, "HAS_GETTER");
        this._hasGetter$delegate = FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(HAS_GETTER));
        KmPropertyAccessorAttributes kmPropertyAccessorAttributes = new KmPropertyAccessorAttributes(i12);
        set_hasGetter(true);
        this.getter = kmPropertyAccessorAttributes;
        this.setter = get_hasSetter() ? new KmPropertyAccessorAttributes(i13) : null;
        this.typeParameters = new ArrayList(0);
        this.extensionReceiverParameterAnnotations = new ArrayList(0);
        this.contextReceiverTypes = new ArrayList(0);
        this.versionRequirements = new ArrayList(0);
        this.annotations = new ArrayList(0);
        this.backingFieldAnnotations = new ArrayList(0);
        this.delegateFieldAnnotations = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).createPropertyExtension());
        }
        this.extensions = arrayList;
    }

    private final boolean get_hasSetter() {
        return this._hasSetter$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final void set_hasGetter(boolean z11) {
        this._hasGetter$delegate.setValue(this, $$delegatedProperties[1], z11);
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final List<KmAnnotation> getBackingFieldAnnotations() {
        return this.backingFieldAnnotations;
    }

    @NotNull
    public final List<KmType> getContextReceiverTypes() {
        return this.contextReceiverTypes;
    }

    @NotNull
    public final List<KmAnnotation> getDelegateFieldAnnotations() {
        return this.delegateFieldAnnotations;
    }

    @NotNull
    public final List<KmAnnotation> getExtensionReceiverParameterAnnotations() {
        return this.extensionReceiverParameterAnnotations;
    }

    @NotNull
    public final List<KmPropertyExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    @NotNull
    public final KmPropertyAccessorAttributes getGetter() {
        return this.getter;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final KmType getReceiverParameterType() {
        return this.receiverParameterType;
    }

    @NotNull
    public final KmType getReturnType() {
        KmType kmType = this.returnType;
        if (kmType != null) {
            return kmType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("returnType");
        return null;
    }

    @Nullable
    public final KmPropertyAccessorAttributes getSetter() {
        return this.setter;
    }

    @Nullable
    public final KmValueParameter getSetterParameter() {
        return this.setterParameter;
    }

    @NotNull
    public final List<KmTypeParameter> getTypeParameters() {
        return this.typeParameters;
    }

    @NotNull
    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setFlags$kotlin_metadata(int i11) {
        this.flags = i11;
    }

    public final void setReceiverParameterType(@Nullable KmType kmType) {
        this.receiverParameterType = kmType;
    }

    public final void setReturnType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.returnType = kmType;
    }

    public final void setSetterParameter(@Nullable KmValueParameter kmValueParameter) {
        this.setterParameter = kmValueParameter;
    }
}
