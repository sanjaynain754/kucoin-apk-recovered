package p852kotlin.reflect.jvm.internal.calls;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: compiled from: CallerImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 #*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\b\u001c\u001d\u001e\u001f !\"#B5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0004R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0007$%&'()*¨\u0006+"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", "", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "getReturnType", "()Ljava/lang/reflect/Type;", "getInstanceClass", "()Ljava/lang/Class;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "checkObjectInstance", "", "obj", "", "Constructor", "BoundConstructor", "AccessorForHiddenConstructor", "AccessorForHiddenBoundConstructor", "Method", "FieldGetter", "FieldSetter", "Companion", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
public abstract class CallerImpl<M extends Member> implements Caller<M> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Class<?> instanceClass;

    @NotNull
    private final M member;

    @NotNull
    private final List<Type> parameterTypes;

    @NotNull
    private final Type returnType;

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "constructor", "boundReceiver", "", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n278#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n*L\n76#1:282\n*E\n"})
    public static final class AccessorForHiddenBoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {

        @Nullable
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public AccessorForHiddenBoundConstructor(@NotNull java.lang.reflect.Constructor<?> constructor, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : ArraysKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.boundReceiver = obj;
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> constructorMo105114getMember = mo105114getMember();
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.add(this.boundReceiver);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(null);
            return constructorMo105114getMember.newInstance(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n274#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n*L\n62#1:282\n*E\n"})
    public static final class AccessorForHiddenConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public AccessorForHiddenConstructor(@NotNull java.lang.reflect.Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt.copyOfRange(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> constructorMo105114getMember = mo105114getMember();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(null);
            return constructorMo105114getMember.newInstance(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "boundReceiver", "", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class BoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {

        @Nullable
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public BoundConstructor(@NotNull java.lang.reflect.Constructor<?> constructor, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.boundReceiver = obj;
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> constructorMo105114getMember = mo105114getMember();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(this.boundReceiver);
            spreadBuilder.addSpread(args);
            return constructorMo105114getMember.newInstance(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0006\b\u0001\u0010\u0006\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u0005H\u0086\b¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0006\b\u0001\u0010\u0006\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u0005H\u0086\b¢\u0006\u0002\u0010\u0007J(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0006\b\u0001\u0010\u0006\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u0005H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", "<init>", "()V", "dropFirst", "", ExifInterface.GPS_DIRECTION_TRUE, "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropLast", "dropFirstAndLast", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Constructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public Constructor(@NotNull java.lang.reflect.Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            return mo105114getMember().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\f\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", "", "<init>", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "Static", "Instance", "JvmStaticInObject", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class FieldGetter extends CallerImpl<Field> {

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "boundReceiver", "", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class BoundInstance extends FieldGetter implements BoundCaller {

            @Nullable
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(@NotNull Field field, @Nullable Object obj) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter, p852kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return mo105114getMember().get(this.boundReceiver);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class BoundJvmStaticInObject extends FieldGetter implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(@NotNull Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Instance extends FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(@NotNull Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "<init>", "(Ljava/lang/reflect/Field;)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class JvmStaticInObject extends FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(@NotNull Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // p852kotlin.reflect.jvm.internal.calls.CallerImpl
            public void checkArguments(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.checkArguments(args);
                checkObjectInstance(ArraysKt.firstOrNull(args));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Static extends FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(@NotNull Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public /* synthetic */ FieldGetter(Field field, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z11);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FieldGetter(Field field, boolean z11) {
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
            super(field, genericType, z11 ? field.getDeclaringClass() : null, new Type[0], null);
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            return mo105114getMember().get(getInstanceClass() != null ? ArraysKt.first(args) : null);
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "notNull", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "call", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "Static", "Instance", "JvmStaticInObject", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class FieldSetter extends CallerImpl<Field> {
        private final boolean notNull;

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0016¢\u0006\u0002\u0010\u000eR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "boundReceiver", "", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class BoundInstance extends FieldSetter implements BoundCaller {

            @Nullable
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(@NotNull Field field, boolean z11, @Nullable Object obj) {
                super(field, z11, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, p852kotlin.reflect.jvm.internal.calls.Caller
            @NotNull
            public Object call(@NotNull Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                mo105114getMember().set(this.boundReceiver, ArraysKt.first(args));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "<init>", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class BoundJvmStaticInObject extends FieldSetter implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(@NotNull Field field, boolean z11) {
                super(field, z11, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, p852kotlin.reflect.jvm.internal.calls.Caller
            @NotNull
            public Object call(@NotNull Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                mo105114getMember().set(null, ArraysKt.last(args));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Instance extends FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(@NotNull Field field, boolean z11) {
                super(field, z11, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "<init>", "(Ljava/lang/reflect/Field;Z)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class JvmStaticInObject extends FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(@NotNull Field field, boolean z11) {
                super(field, z11, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, p852kotlin.reflect.jvm.internal.calls.CallerImpl
            public void checkArguments(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.checkArguments(args);
                checkObjectInstance(ArraysKt.firstOrNull(args));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Static extends FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(@NotNull Field field, boolean z11) {
                super(field, z11, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public /* synthetic */ FieldSetter(Field field, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z11, z12);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FieldSetter(Field field, boolean z11, boolean z12) {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            super(field, TYPE, z12 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.notNull = z11;
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            mo105114getMember().set(getInstanceClass() != null ? ArraysKt.first(args) : null, ArraysKt.last(args));
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.CallerImpl
        public void checkArguments(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            super.checkArguments(args);
            if (this.notNull && ArraysKt.last(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0004¢\u0006\u0002\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "requiresInstance", "", "parameterTypes", "", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "isVoidMethod", "callMethod", "", "instance", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Static", "Instance", "JvmStaticInObject", "BoundStatic", "BoundStaticMultiFieldValueClass", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class Method extends CallerImpl<java.lang.reflect.Method> {
        private final boolean isVoidMethod;

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "boundReceiver", "", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class BoundInstance extends Method implements BoundCaller {

            @Nullable
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(@NotNull java.lang.reflect.Method method, @Nullable Object obj) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
                this.boundReceiver = obj;
            }

            @Override // p852kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return callMethod(this.boundReceiver, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class BoundJvmStaticInObject extends Method implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // p852kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return callMethod(null, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "isCallByToValueClassMangledMethod", "", "boundReceiver", "", "<init>", "(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V", "isCallByToValueClassMangledMethod$kotlin_reflection", "()Z", "getBoundReceiver$kotlin_reflection", "()Ljava/lang/Object;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n270#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n*L\n142#1:282\n*E\n"})
        public static final class BoundStatic extends Method implements BoundCaller {

            @Nullable
            private final Object boundReceiver;
            private final boolean isCallByToValueClassMangledMethod;

            /* JADX WARN: Illegal instructions before constructor call */
            public BoundStatic(@NotNull java.lang.reflect.Method method, boolean z11, @Nullable Object obj) {
                Intrinsics.checkNotNullParameter(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.isCallByToValueClassMangledMethod = z11;
                this.boundReceiver = obj;
            }

            @Override // p852kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(this.boundReceiver);
                spreadBuilder.addSpread(args);
                return callMethod(null, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            }

            @Nullable
            /* JADX INFO: renamed from: getBoundReceiver$kotlin_reflection, reason: from getter */
            public final Object getBoundReceiver() {
                return this.boundReceiver;
            }

            /* JADX INFO: renamed from: isCallByToValueClassMangledMethod$kotlin_reflection, reason: from getter */
            public final boolean getIsCallByToValueClassMangledMethod() {
                return this.isCallByToValueClassMangledMethod;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0002\u0010\u000fR\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "boundReceiverComponents", "", "", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "getBoundReceiverComponents$kotlin_reflection", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "call", "args", "([Ljava/lang/Object;)Ljava/lang/Object;", "receiverComponentsCount", "", "getReceiverComponentsCount", "()I", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,281:1\n37#2:282\n36#2,3:283\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n*L\n155#1:282\n155#1:283,3\n*E\n"})
        public static final class BoundStaticMultiFieldValueClass extends Method implements BoundCaller {

            @NotNull
            private final Object[] boundReceiverComponents;

            /* JADX WARN: Illegal instructions before constructor call */
            public BoundStaticMultiFieldValueClass(@NotNull java.lang.reflect.Method method, @NotNull Object[] boundReceiverComponents) {
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) ArraysKt.drop(genericParameterTypes, boundReceiverComponents.length).toArray(new Type[0]), null);
                this.boundReceiverComponents = boundReceiverComponents;
            }

            @Override // p852kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(this.boundReceiverComponents);
                spreadBuilder.addSpread(args);
                return callMethod(null, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            }

            @NotNull
            /* JADX INFO: renamed from: getBoundReceiverComponents$kotlin_reflection, reason: from getter */
            public final Object[] getBoundReceiverComponents() {
                return this.boundReceiverComponents;
            }

            public final int getReceiverComponentsCount() {
                return this.boundReceiverComponents.length;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n270#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n*L\n113#1:282\n*E\n"})
        public static final class Instance extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // p852kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return callMethod(args[0], args.length <= 1 ? new Object[0] : ArraysKt.copyOfRange(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n270#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n*L\n121#1:282\n*E\n"})
        public static final class JvmStaticInObject extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(@NotNull java.lang.reflect.Method method) {
                super(method, true, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // p852kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                checkObjectInstance(ArraysKt.firstOrNull(args));
                return callMethod(null, args.length <= 1 ? new Object[0] : ArraysKt.copyOfRange(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Static extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // p852kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return callMethod(null, args);
            }
        }

        public /* synthetic */ Method(java.lang.reflect.Method method, boolean z11, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z11, typeArr);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Method(java.lang.reflect.Method method, boolean z11, Type[] typeArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            z11 = (i11 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z11;
            if ((i11 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(typeArr, "getGenericParameterTypes(...)");
            }
            this(method, z11, typeArr, null);
        }

        @Nullable
        public final Object callMethod(@Nullable Object instance, @NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return this.isVoidMethod ? Unit.INSTANCE : mo105114getMember().invoke(instance, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Method(java.lang.reflect.Method method, boolean z11, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z11 ? method.getDeclaringClass() : null, typeArr, null);
            this.isVoidMethod = Intrinsics.areEqual(getReturnType(), Void.TYPE);
        }
    }

    public /* synthetic */ CallerImpl(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    public boolean default$isBoundInstanceCallWithValueClasses() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    private CallerImpl(M m11, Type type, Class<?> cls, Type[] typeArr) {
        List<Type> list;
        this.member = m11;
        this.returnType = type;
        this.instanceClass = cls;
        if (cls != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(cls);
            spreadBuilder.addSpread(typeArr);
            list = CollectionsKt.listOf(spreadBuilder.toArray(new Type[spreadBuilder.size()]));
            list = list == null ? ArraysKt.toList(typeArr) : list;
        }
        this.parameterTypes = list;
    }

    public final void checkObjectInstance(@Nullable Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public void default$checkArguments(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (CallerKt.getArity(this) == args.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + CallerKt.getArity(this) + " arguments, but " + args.length + " were provided.");
    }

    @Nullable
    public final Class<?> getInstanceClass() {
        return this.instanceClass;
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    /* JADX INFO: renamed from: getMember */
    public final M mo105114getMember() {
        return this.member;
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final Type getReturnType() {
        return this.returnType;
    }

    public void checkArguments(@NotNull Object[] objArr) {
        default$checkArguments(objArr);
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    public boolean isBoundInstanceCallWithValueClasses() {
        return default$isBoundInstanceCallWithValueClasses();
    }
}
