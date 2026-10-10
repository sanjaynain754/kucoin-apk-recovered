package p852kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0017\u0018B\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0004¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "parameterTypes", "", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "getParameterTypes", "()Ljava/util/List;", "member", "getMember", "()Ljava/lang/reflect/Method;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "callMethod", "", "instance", "args", "", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Unbound", "Bound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class InternalUnderlyingValOfInlineClass implements Caller<Method> {

    @NotNull
    private final List<Type> parameterTypes;

    @NotNull
    private final Type returnType;

    @NotNull
    private final Method unboxMethod;

    /* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "unboxMethod", "Ljava/lang/reflect/Method;", "boundReceiver", "", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Bound extends InternalUnderlyingValOfInlineClass implements BoundCaller {

        @Nullable
        private final Object boundReceiver;

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            return callMethod(this.boundReceiver, args);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bound(@NotNull Method unboxMethod, @Nullable Object obj) {
            super(unboxMethod, CollectionsKt.emptyList(), null);
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
            this.boundReceiver = obj;
        }
    }

    /* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "unboxMethod", "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nInternalUnderlyingValOfInlineClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalUnderlyingValOfInlineClass.kt\nkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,45:1\n270#2:46\n*S KotlinDebug\n*F\n+ 1 InternalUnderlyingValOfInlineClass.kt\nkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound\n*L\n31#1:46\n*E\n"})
    public static final class Unbound extends InternalUnderlyingValOfInlineClass {
        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            Object obj = args[0];
            CallerImpl.Companion companion = CallerImpl.INSTANCE;
            return callMethod(obj, args.length <= 1 ? new Object[0] : ArraysKt.copyOfRange(args, 1, args.length));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unbound(@NotNull Method unboxMethod) {
            super(unboxMethod, CollectionsKt.listOf(unboxMethod.getDeclaringClass()), null);
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
        }
    }

    public /* synthetic */ InternalUnderlyingValOfInlineClass(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    public boolean default$isBoundInstanceCallWithValueClasses() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    /* JADX INFO: renamed from: getMember */
    public final Method mo105114getMember() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InternalUnderlyingValOfInlineClass(Method method, List<? extends Type> list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        this.returnType = returnType;
    }

    @Nullable
    public final Object callMethod(@Nullable Object instance, @NotNull Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.unboxMethod.invoke(instance, Arrays.copyOf(args, args.length));
    }

    public void default$checkArguments(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (CallerKt.getArity(this) == args.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + CallerKt.getArity(this) + " arguments, but " + args.length + " were provided.");
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final List<Type> getParameterTypes() {
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
