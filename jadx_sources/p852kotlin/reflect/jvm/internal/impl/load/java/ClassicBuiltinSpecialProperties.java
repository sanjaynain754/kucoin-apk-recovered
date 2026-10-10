package p852kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: ClassicBuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nClassicBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1761#3,3:38\n*S KotlinDebug\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n*L\n33#1:38,3\n*E\n"})
public final class ClassicBuiltinSpecialProperties {

    @NotNull
    public static final ClassicBuiltinSpecialProperties INSTANCE = new ClassicBuiltinSpecialProperties();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getBuiltinSpecialPropertyGetterName$lambda$1(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return INSTANCE.hasBuiltinSpecialPropertyFqName(it);
    }

    private final boolean hasBuiltinSpecialPropertyFqNameImpl(CallableMemberDescriptor callableMemberDescriptor) {
        if (CollectionsKt.contains(BuiltinSpecialProperties.INSTANCE.getSPECIAL_FQ_NAMES(), DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor)) && callableMemberDescriptor.getValueParameters().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        if (overriddenDescriptors.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : overriddenDescriptors) {
            ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
            Intrinsics.checkNotNull(callableMemberDescriptor2);
            if (classicBuiltinSpecialProperties.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String getBuiltinSpecialPropertyGetterName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorFirstOverridden$default = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.getBuiltinSpecialPropertyGetterName$lambda$1((CallableMemberDescriptor) obj));
            }
        }, 1, null);
        if (callableMemberDescriptorFirstOverridden$default == null || (name = BuiltinSpecialProperties.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(DescriptorUtilsKt.getFqNameSafe(callableMemberDescriptorFirstOverridden$default))) == null) {
            return null;
        }
        return name.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(callableMemberDescriptor.getName())) {
            return hasBuiltinSpecialPropertyFqNameImpl(callableMemberDescriptor);
        }
        return false;
    }

    private ClassicBuiltinSpecialProperties() {
    }
}
