package p852kotlin.reflect.jvm.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "<init>", "()V", "asString", "", "KotlinFunction", "KotlinConstructor", "JavaMethod", "JavaConstructor", "FakeJavaAnnotationConstructor", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class JvmFunctionSignature {

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,302:1\n6482#2:303\n*S KotlinDebug\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n88#1:303\n*E\n"})
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        @NotNull
        private final Class<?> jClass;

        @NotNull
        private final List<Method> methods;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(@NotNull Class<?> jClass) {
            super(null);
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            this.jClass = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            this.methods = ArraysKt.sortedWith(declaredMethods, new Comparator() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    return ComparisonsKt.compareValues(((Method) t11).getName(), ((Method) t12).getName());
                }
            });
        }

        @Override // p852kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String get_signature() {
            return CollectionsKt.joinToString$default(this.methods, "", "<init>(", ")V", 0, null, new Function1() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$$Lambda$0
                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return JvmFunctionSignature.FakeJavaAnnotationConstructor.asString$lambda$1((Method) obj);
                }
            }, 24, null);
        }

        @NotNull
        public final List<Method> getMethods() {
            return this.methods;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence asString$lambda$1(Method method) {
            Class<?> returnType = method.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return ReflectClassUtilKt.getDesc(returnType);
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "<init>", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class JavaConstructor extends JvmFunctionSignature {

        @NotNull
        private final Constructor<?> constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(@NotNull Constructor<?> constructor) {
            super(null);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            this.constructor = constructor;
        }

        @Override // p852kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String get_signature() {
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return ArraysKt.joinToString$default(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, new Function1() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor$$Lambda$0
                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return JvmFunctionSignature.JavaConstructor.asString$lambda$0((Class) obj);
                }
            }, 24, (Object) null);
        }

        @NotNull
        public final Constructor<?> getConstructor() {
            return this.constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence asString$lambda$0(Class cls) {
            Intrinsics.checkNotNull(cls);
            return ReflectClassUtilKt.getDesc(cls);
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "getMethod", "()Ljava/lang/reflect/Method;", "asString", "", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class JavaMethod extends JvmFunctionSignature {

        @NotNull
        private final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethod(@NotNull Method method) {
            super(null);
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
        }

        @Override // p852kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String get_signature() {
            return RuntimeTypeMapperKt.getSignature(this.method);
        }

        @NotNull
        public final Method getMethod() {
            return this.method;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "_signature", "", "constructorDesc", "getConstructorDesc", "()Ljava/lang/String;", "asString", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class KotlinConstructor extends JvmFunctionSignature {

        @NotNull
        private final String _signature;

        @NotNull
        private final JvmMemberSignature.Method signature;

        @Override // p852kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        @NotNull
        public final String getConstructorDesc() {
            return this.signature.getDesc();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinConstructor(@NotNull JvmMemberSignature.Method signature) {
            super(null);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.signature = signature;
            this._signature = signature.asString();
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "_signature", "", "methodName", "getMethodName", "()Ljava/lang/String;", "methodDesc", "getMethodDesc", "asString", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class KotlinFunction extends JvmFunctionSignature {

        @NotNull
        private final String _signature;

        @NotNull
        private final JvmMemberSignature.Method signature;

        @Override // p852kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        @NotNull
        public final String getMethodDesc() {
            return this.signature.getDesc();
        }

        @NotNull
        public final String getMethodName() {
            return this.signature.getName();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinFunction(@NotNull JvmMemberSignature.Method signature) {
            super(null);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.signature = signature;
            this._signature = signature.asString();
        }
    }

    public /* synthetic */ JvmFunctionSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: asString */
    public abstract String get_signature();

    private JvmFunctionSignature() {
    }
}
