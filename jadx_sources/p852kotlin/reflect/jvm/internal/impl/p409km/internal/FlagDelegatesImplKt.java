package p852kotlin.reflect.jvm.internal.impl.p409km.internal;

import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KMutableProperty1;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmClass;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmConstructor;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmFunction;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmProperty;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmPropertyAccessorAttributes;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmType;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeAlias;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmValueParameter;
import p852kotlin.reflect.jvm.internal.impl.p409km.MemberKind;
import p852kotlin.reflect.jvm.internal.impl.p409km.Modality;
import p852kotlin.reflect.jvm.internal.impl.p409km.Visibility;

/* JADX INFO: compiled from: FlagDelegatesImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nFlagDelegatesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlagDelegatesImpl.kt\nkotlin/metadata/internal/FlagDelegatesImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1563#2:89\n1634#2,3:90\n1563#2:93\n1634#2,3:94\n1563#2:97\n1634#2,3:98\n*S KotlinDebug\n*F\n+ 1 FlagDelegatesImpl.kt\nkotlin/metadata/internal/FlagDelegatesImplKt\n*L\n50#1:89\n50#1:90,3\n53#1:93\n53#1:94,3\n56#1:97\n56#1:98,3\n*E\n"})
public final class FlagDelegatesImplKt {
    @NotNull
    public static final BooleanFlagDelegate<KmClass> classBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).getFlags$kotlin_metadata());
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
            }
        }, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmConstructor> constructorBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.constructorBooleanFlag.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmConstructor) obj).getFlags$kotlin_metadata());
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmConstructor) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
            }
        }, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmFunction> functionBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).getFlags$kotlin_metadata());
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
            }
        }, flag);
    }

    @NotNull
    public static final <Node> EnumFlagDelegate<Node, MemberKind> memberKindDelegate(@NotNull KMutableProperty1<Node, Integer> flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Flags.FlagField<ProtoBuf.MemberKind> MEMBER_KIND = Flags.MEMBER_KIND;
        Intrinsics.checkNotNullExpressionValue(MEMBER_KIND, "MEMBER_KIND");
        EnumEntries<MemberKind> entries = MemberKind.getEntries();
        EnumEntries<MemberKind> entries2 = MemberKind.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<MemberKind> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(flags, MEMBER_KIND, entries, arrayList);
    }

    @NotNull
    public static final <Node> EnumFlagDelegate<Node, Modality> modalityDelegate(@NotNull KMutableProperty1<Node, Integer> flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Flags.FlagField<ProtoBuf.Modality> MODALITY = Flags.MODALITY;
        Intrinsics.checkNotNullExpressionValue(MODALITY, "MODALITY");
        EnumEntries<Modality> entries = Modality.getEntries();
        EnumEntries<Modality> entries2 = Modality.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<Modality> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(flags, MODALITY, entries, arrayList);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmPropertyAccessorAttributes> propertyAccessorBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyAccessorBooleanFlag.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmPropertyAccessorAttributes) obj).getFlags$kotlin_metadata());
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmPropertyAccessorAttributes) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
            }
        }, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmProperty> propertyBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).getFlags$kotlin_metadata());
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
            }
        }, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmTypeAlias> typeAliasBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.typeAliasBooleanFlag.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmTypeAlias) obj).getFlags$kotlin_metadata());
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmTypeAlias) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
            }
        }, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmType> typeBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.typeBooleanFlag.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmType) obj).getFlags$kotlin_metadata());
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmType) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
            }
        }, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmValueParameter> valueParameterBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.valueParameterBooleanFlag.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmValueParameter) obj).getFlags$kotlin_metadata());
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmValueParameter) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
            }
        }, flag);
    }

    @NotNull
    public static final <Node> EnumFlagDelegate<Node, Visibility> visibilityDelegate(@NotNull KMutableProperty1<Node, Integer> flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Flags.FlagField<ProtoBuf.Visibility> VISIBILITY = Flags.VISIBILITY;
        Intrinsics.checkNotNullExpressionValue(VISIBILITY, "VISIBILITY");
        EnumEntries<Visibility> entries = Visibility.getEntries();
        EnumEntries<Visibility> entries2 = Visibility.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<Visibility> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(flags, VISIBILITY, entries, arrayList);
    }
}
