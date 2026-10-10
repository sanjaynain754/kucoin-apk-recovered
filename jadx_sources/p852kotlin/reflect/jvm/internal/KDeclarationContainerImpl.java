package p852kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.ClassBasedDeclarationContainer;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p852kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 B2\u00020\u0001:\u0004?@ABB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H&J\"\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0004J\u0016\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0016\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJE\u0010 \u001a\u0004\u0018\u00010!*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u001d2\u0010\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050#2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010%\u001a\u00020&H\u0002¢\u0006\u0002\u0010'J=\u0010(\u001a\u0004\u0018\u00010!*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u001d2\u0010\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050#2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0002\u0010)J(\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050,H\u0002J\u0018\u0010-\u001a\u0004\u0018\u00010!2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001dJ \u0010/\u001a\u0004\u0018\u00010!2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001d2\u0006\u00100\u001a\u00020&J\u0014\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\u0006\u0010.\u001a\u00020\u001dJ\u0014\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\u0006\u0010.\u001a\u00020\u001dJ4\u00103\u001a\u0002042\u0010\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005062\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050,2\u0006\u00108\u001a\u00020&H\u0002J\u0018\u00109\u001a\u00020:2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020&H\u0002J$\u0010<\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0015H\u0002R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006C"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "<init>", "()V", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "getProperties", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "findPropertyDescriptor", "", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "findFunctionDescriptor", "lookupMethod", "Ljava/lang/reflect/Method;", "parameterTypes", "", "returnType", "isStaticDefault", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "tryGetMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "tryGetConstructor", "Ljava/lang/reflect/Constructor;", "", "findMethodBySignature", "desc", "findDefaultMethod", "isMember", "findConstructorBySignature", "findDefaultConstructor", "addParametersAndMasks", "", DbParams.KEY_CHANNEL_RESULT, "", "valueParameters", "isConstructor", "parseJvmDescriptor", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "parseReturnType", "parseType", "begin", "end", "Data", "MemberBelonginess", "FunctionJvmDescriptor", "Companion", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKDeclarationContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,316:1\n1617#2,9:317\n1869#2:326\n1870#2:328\n1626#2:329\n774#2:330\n865#2,2:331\n1491#2:333\n1516#2,3:334\n1519#2,3:344\n774#2:347\n865#2,2:348\n774#2:350\n865#2,2:351\n1#3:327\n1#3:353\n382#4,7:337\n1310#5,2:354\n37#6:356\n36#6,3:357\n37#6:360\n36#6,3:361\n37#6:364\n36#6,3:365\n*S KotlinDebug\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n*L\n58#1:317,9\n58#1:326\n58#1:328\n58#1:329\n83#1:330\n83#1:331,2\n103#1:333\n103#1:334,3\n103#1:344,3\n128#1:347\n128#1:348,2\n142#1:350\n142#1:351,2\n58#1:327\n103#1:337,7\n197#1:354,2\n207#1:356\n207#1:357,3\n216#1:360\n216#1:361,3\n241#1:364\n241#1:365,3\n*E\n"})
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Class<?> DEFAULT_CONSTRUCTOR_MARKER = DefaultConstructorMarker.class;

    @NotNull
    private static final Regex LOCAL_PROPERTY_SIGNATURE = new Regex("<v#(\\d+)>");

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "<init>", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public abstract class Data {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Data.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: moduleData$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal moduleData;

        public Data() {
            this.moduleData = ReflectProperties.lazySoft(new Function0(KDeclarationContainerImpl.this) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$$Lambda$0
                private final KDeclarationContainerImpl arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return KDeclarationContainerImpl.Data.moduleData_delegate$lambda$0(this.arg$0);
                }

                {
                    this.arg$0 = kDeclarationContainerImpl;
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final RuntimeModuleData getModuleData() {
            T value = this.moduleData.getValue(this, $$delegatedProperties[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (RuntimeModuleData) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RuntimeModuleData moduleData_delegate$lambda$0(KDeclarationContainerImpl kDeclarationContainerImpl) {
            return ModuleByClassLoaderKt.getOrCreateModule(kDeclarationContainerImpl.getJClass());
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "", "parameters", "", "Ljava/lang/Class;", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "getParameters", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/Class;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FunctionJvmDescriptor {

        @NotNull
        private final List<Class<?>> parameters;

        @Nullable
        private final Class<?> returnType;

        /* JADX WARN: Multi-variable type inference failed */
        public FunctionJvmDescriptor(@NotNull List<? extends Class<?>> parameters, @Nullable Class<?> cls) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.parameters = parameters;
            this.returnType = cls;
        }

        @NotNull
        public final List<Class<?>> getParameters() {
            return this.parameters;
        }

        @Nullable
        public final Class<?> getReturnType() {
            return this.returnType;
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "<init>", "(Ljava/lang/String;I)V", "DECLARED", "INHERITED", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public final boolean accept(@NotNull CallableMemberDescriptor member) {
            Intrinsics.checkNotNullParameter(member, "member");
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    private final Method lookupMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z11) {
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z12;
        if (z11) {
            clsArr[0] = cls;
        }
        Method methodTryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (methodTryGetMethod != null) {
            return methodTryGetMethod;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodLookupMethod = lookupMethod(superclass, str, clsArr, cls2, z11);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z12 = z11;
            if (methodLookupMethod != null) {
                return methodLookupMethod;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z12 = z11;
        }
        Iterator it = ArrayIteratorKt.iterator(cls.getInterfaces());
        while (it.hasNext()) {
            Class<?> cls4 = (Class) it.next();
            Intrinsics.checkNotNull(cls4);
            Method methodLookupMethod2 = lookupMethod(cls4, str2, clsArr2, cls3, z12);
            if (methodLookupMethod2 != null) {
                return methodLookupMethod2;
            }
            if (z12) {
                Class<?> clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(cls4), cls4.getName() + "$DefaultImpls");
                if (clsTryLoadClass != null) {
                    clsArr2[0] = cls4;
                    Method methodTryGetMethod2 = tryGetMethod(clsTryLoadClass, str2, clsArr2, cls3);
                    if (methodTryGetMethod2 != null) {
                        return methodTryGetMethod2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final Constructor<?> tryGetConstructor(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method tryGetMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.areEqual(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.areEqual(method.getName(), str) && Intrinsics.areEqual(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @NotNull
    public abstract Collection<ConstructorDescriptor> getConstructorDescriptors();

    @NotNull
    public abstract Collection<FunctionDescriptor> getFunctions(@NotNull Name name);

    @Nullable
    public abstract PropertyDescriptor getLocalProperty(int index);

    @NotNull
    public abstract Collection<PropertyDescriptor> getProperties(@NotNull Name name);

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findFunctionDescriptor$lambda$9(FunctionDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + RuntimeTypeMapper.INSTANCE.mapSignature(descriptor).get_signature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findPropertyDescriptor$lambda$5(PropertyDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptor).getString();
    }

    private final FunctionJvmDescriptor parseJvmDescriptor(String desc, boolean parseReturnType) {
        String str;
        int iIndexOf$default;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (true) {
            if (desc.charAt(i11) == ')') {
                String str2 = desc;
                return new FunctionJvmDescriptor(arrayList, parseReturnType ? parseType(str2, i11 + 1, str2.length()) : null);
            }
            int i12 = i11;
            while (desc.charAt(i12) == '[') {
                i12++;
            }
            char cCharAt = desc.charAt(i12);
            if (StringsKt.contains$default((CharSequence) "VZCBSIFJD", cCharAt, false, 2, (Object) null)) {
                int i13 = i12 + 1;
                str = desc;
                iIndexOf$default = i13;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + desc);
                }
                str = desc;
                iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ';', i11, false, 4, (Object) null) + 1;
            }
            arrayList.add(parseType(str, i11, iIndexOf$default));
            i11 = iIndexOf$default;
            desc = str;
        }
    }

    @Nullable
    public final Constructor<?> findConstructorBySignature(@NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return tryGetConstructor(getJClass(), parseJvmDescriptor(desc, false).getParameters());
    }

    @Nullable
    public final Constructor<?> findDefaultConstructor(@NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        addParametersAndMasks(arrayList, parseJvmDescriptor(desc, false).getParameters(), true);
        Unit unit = Unit.INSTANCE;
        return tryGetConstructor(jClass, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ae  */
    @NotNull
    public final FunctionDescriptor findFunctionDescriptor(@NotNull String name, @NotNull String signature) {
        Collection<FunctionDescriptor> functions;
        ArrayList arrayList;
        String strAsString;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        if (Intrinsics.areEqual(name, "<init>")) {
            functions = CollectionsKt.toList(getConstructorDescriptors());
            arrayList = new ArrayList();
            for (Object obj : functions) {
                ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) obj;
                if (constructorDescriptor.isPrimary()) {
                    ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
                    Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration)) {
                        String strAsString2 = RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).get_signature();
                        if (!StringsKt.startsWith$default(strAsString2, "constructor-impl", false, 2, (Object) null) || !StringsKt.endsWith$default(strAsString2, ")V", false, 2, (Object) null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + constructorDescriptor + ": " + strAsString2).toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(StringsKt.removeSuffix(strAsString2, (CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED));
                        ClassifierDescriptorWithTypeParameters containingDeclaration2 = constructorDescriptor.getContainingDeclaration();
                        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
                        sb2.append(ValueClassAwareCallerKt.toJvmDescriptor(containingDeclaration2));
                        strAsString = sb2.toString();
                    } else {
                        strAsString = RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).get_signature();
                    }
                } else {
                    strAsString = RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).get_signature();
                }
                if (Intrinsics.areEqual(strAsString, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            Name nameIdentifier = Name.identifier(name);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            functions = getFunctions(nameIdentifier);
            arrayList = new ArrayList();
            for (Object obj2 : functions) {
                if (Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapSignature((FunctionDescriptor) obj2).get_signature(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        Collection<FunctionDescriptor> collection = functions;
        if (arrayList.size() == 1) {
            return (FunctionDescriptor) CollectionsKt.single((List) arrayList);
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(collection, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, new Function1() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$3
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj3) {
                return KDeclarationContainerImpl.findFunctionDescriptor$lambda$9((FunctionDescriptor) obj3);
            }
        }, 30, null);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Function '");
        sb3.append(name);
        sb3.append("' (JVM signature: ");
        sb3.append(signature);
        sb3.append(") not resolved in ");
        sb3.append(this);
        sb3.append(':');
        sb3.append(strJoinToString$default.length() == 0 ? " no members found" : '\n' + strJoinToString$default);
        throw new KotlinReflectionInternalError(sb3.toString());
    }

    @NotNull
    public final PropertyDescriptor findPropertyDescriptor(@NotNull String name, @NotNull String signature) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        MatchResult matchResultMatchEntire = LOCAL_PROPERTY_SIGNATURE.matchEntire(signature);
        if (matchResultMatchEntire != null) {
            String str = matchResultMatchEntire.getDestructured().getMatch().getGroupValues().get(1);
            PropertyDescriptor localProperty = getLocalProperty(Integer.parseInt(str));
            if (localProperty != null) {
                return localProperty;
            }
            throw new KotlinReflectionInternalError("Local property #" + str + " not found in " + getJClass());
        }
        Name nameIdentifier = Name.identifier(name);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        Collection<PropertyDescriptor> properties = getProperties(nameIdentifier);
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapPropertySignature((PropertyDescriptor) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.single((List) arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            DescriptorVisibility visibility = ((PropertyDescriptor) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        final KDeclarationContainerImpl$$Lambda$0 kDeclarationContainerImpl$$Lambda$0 = new Function2() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function2
            public Object invoke(Object obj3, Object obj4) {
                return Integer.valueOf(KDeclarationContainerImpl.findPropertyDescriptor$lambda$3((DescriptorVisibility) obj3, (DescriptorVisibility) obj4));
            }
        };
        Collection collectionValues = MapsKt.toSortedMap(linkedHashMap, new Comparator(kDeclarationContainerImpl$$Lambda$0) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$1
            private final Function2 arg$0;

            @Override // java.util.Comparator
            public int compare(Object obj3, Object obj4) {
                return KDeclarationContainerImpl.findPropertyDescriptor$lambda$4(this.arg$0, obj3, obj4);
            }

            {
                this.arg$0 = kDeclarationContainerImpl$$Lambda$0;
            }
        }).values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        List list = (List) CollectionsKt.last(collectionValues);
        if (list.size() == 1) {
            Intrinsics.checkNotNull(list);
            return (PropertyDescriptor) CollectionsKt.first(list);
        }
        Name nameIdentifier2 = Name.identifier(name);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        String strJoinToString$default = CollectionsKt.joinToString$default(getProperties(nameIdentifier2), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, new Function1() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$2
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj3) {
                return KDeclarationContainerImpl.findPropertyDescriptor$lambda$5((PropertyDescriptor) obj3);
            }
        }, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strJoinToString$default.length() == 0 ? " no members found" : '\n' + strJoinToString$default);
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    private final void addParametersAndMasks(List<Class<?>> result, List<? extends Class<?>> valueParameters, boolean isConstructor) {
        Class<?> cls;
        if (Intrinsics.areEqual(CollectionsKt.lastOrNull((List) valueParameters), DEFAULT_CONSTRUCTOR_MARKER)) {
            valueParameters = valueParameters.subList(0, valueParameters.size() - 1);
        }
        result.addAll(valueParameters);
        int size = (valueParameters.size() + 31) / 32;
        for (int i11 = 0; i11 < size; i11++) {
            Class<?> TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            result.add(TYPE);
        }
        if (isConstructor) {
            cls = DEFAULT_CONSTRUCTOR_MARKER;
        } else {
            cls = Object.class;
        }
        Intrinsics.checkNotNull(cls);
        result.add(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findPropertyDescriptor$lambda$3(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        Integer numCompare = DescriptorVisibilities.compare(descriptorVisibility, descriptorVisibility2);
        if (numCompare != null) {
            return numCompare.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findPropertyDescriptor$lambda$4(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final Class<?> parseType(String desc, int begin, int end) throws ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt != 'F') {
            if (cCharAt != 'L') {
                if (cCharAt != 'S') {
                    if (cCharAt != 'V') {
                        if (cCharAt != 'I') {
                            if (cCharAt != 'J') {
                                if (cCharAt != 'Z') {
                                    if (cCharAt != '[') {
                                        switch (cCharAt) {
                                            case 'B':
                                                return Byte.TYPE;
                                            case 'C':
                                                return Character.TYPE;
                                            case 'D':
                                                return Double.TYPE;
                                            default:
                                                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + desc);
                                        }
                                    }
                                    return UtilKt.createArrayType(parseType(desc, begin + 1, end));
                                }
                                return Boolean.TYPE;
                            }
                            return Long.TYPE;
                        }
                        return Integer.TYPE;
                    }
                    Class<?> TYPE = Void.TYPE;
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    return TYPE;
                }
                return Short.TYPE;
            }
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(getJClass());
            String strSubstring = desc.substring(begin + 1, end - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Class<?> clsLoadClass = safeClassLoader.loadClass(StringsKt.replace$default(strSubstring, '/', '.', false, 4, (Object) null));
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        return Float.TYPE;
    }

    @Nullable
    public final Method findDefaultMethod(@NotNull String name, @NotNull String desc, boolean isMember) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(getJClass());
        }
        FunctionJvmDescriptor jvmDescriptor = parseJvmDescriptor(desc, true);
        addParametersAndMasks(arrayList, jvmDescriptor.getParameters(), false);
        Class<?> methodOwner = getMethodOwner();
        String str = name + "$default";
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> returnType = jvmDescriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        return lookupMethod(methodOwner, str, clsArr, returnType, isMember);
    }

    @Nullable
    public final Method findMethodBySignature(@NotNull String name, @NotNull String desc) {
        Method methodLookupMethod;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        FunctionJvmDescriptor jvmDescriptor = parseJvmDescriptor(desc, true);
        Class<?>[] clsArr = (Class[]) jvmDescriptor.getParameters().toArray(new Class[0]);
        Class<?> returnType = jvmDescriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        Method methodLookupMethod2 = lookupMethod(getMethodOwner(), name, clsArr, returnType, false);
        if (methodLookupMethod2 != null) {
            return methodLookupMethod2;
        }
        if (!getMethodOwner().isInterface() || (methodLookupMethod = lookupMethod(Object.class, name, clsArr, returnType, false)) == null) {
            return null;
        }
        return methodLookupMethod;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    @NotNull
    public final Collection<KCallableImpl<?>> getMembers(@NotNull MemberScope scope, @NotNull MemberBelonginess belonginess) {
        KCallableImpl kCallableImpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(belonginess, "belonginess");
        CreateKCallableVisitor createKCallableVisitor = new CreateKCallableVisitor(this) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
            public KCallableImpl<?> visitConstructorDescriptor(ConstructorDescriptor descriptor, Unit data) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(data, "data");
                throw new IllegalStateException("No constructors should appear here: " + descriptor);
            }

            {
                super(this);
            }
        };
        Collection<DeclarationDescriptor> contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (!Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.INVISIBLE_FAKE) && belonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = (KCallableImpl) declarationDescriptor.accept(createKCallableVisitor, Unit.INSTANCE);
                } else {
                    kCallableImpl = null;
                }
            } else {
                kCallableImpl = null;
            }
            if (kCallableImpl != null) {
                arrayList.add(kCallableImpl);
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    @NotNull
    public Class<?> getMethodOwner() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            return getJClass();
        }
        return wrapperByPrimitive;
    }
}
