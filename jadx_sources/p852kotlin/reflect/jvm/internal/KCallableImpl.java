package p852kotlin.reflect.jvm.internal;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KParameter;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.KTypeParameter;
import p852kotlin.reflect.KVisibility;
import p852kotlin.reflect.full.IllegalCallableAccessException;
import p852kotlin.reflect.jvm.KTypesJvm;
import p852kotlin.reflect.jvm.ReflectJvmMapping;
import p852kotlin.reflect.jvm.internal.calls.Caller;
import p852kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;

/* JADX INFO: compiled from: KCallableImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u00108\u001a\u00028\u00002\u0016\u00109\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010;0:\"\u0004\u0018\u00010;H\u0016¢\u0006\u0002\u0010<J#\u0010=\u001a\u00028\u00002\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010;0>H\u0016¢\u0006\u0002\u0010?J\u0015\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:H\u0002¢\u0006\u0002\u0010BJ3\u0010C\u001a\u00028\u00002\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010;0>2\f\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010EH\u0000¢\u0006\u0004\bF\u0010GJ\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020!H\u0002J#\u0010M\u001a\u00028\u00002\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010;0>H\u0002¢\u0006\u0002\u0010?J\u0010\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020(H\u0002J\n\u0010P\u001a\u0004\u0018\u00010QH\u0002R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R(\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u001b*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR>\u0010\u001f\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020! \u001b*\u0016\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00020!\u0018\u0001`\"0 j\b\u0012\u0004\u0012\u00020!`\"0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u001c\u0010%\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010&0&0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R(\u0010+\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020, \u001b*\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00190\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0016R\u0014\u00105\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u0014\u00106\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0016R\u0014\u00107\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R,\u0010@\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010; \u001b*\f\u0012\u0006\u0012\u0004\u0018\u00010;\u0018\u00010:0:0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00150IX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "defaultCaller", "getDefaultCaller", TtmlNode.RUBY_CONTAINER, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "isBound", "", "()Z", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "annotations", "getAnnotations", "()Ljava/util/List;", "_parameters", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "Lkotlin/collections/ArrayList;", "parameters", "getParameters", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "_typeParameters", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "isFinal", "isOpen", "isAbstract", "isAnnotationConstructor", "call", "args", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "", "(Ljava/util/Map;)Ljava/lang/Object;", "_absentArguments", "getAbsentArguments", "()[Ljava/lang/Object;", "callDefaultMethod", "continuationArgument", "Lkotlin/coroutines/Continuation;", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parametersNeedMFVCFlattening", "Lkotlin/Lazy;", "getParameterTypeSize", "", "parameter", "callAnnotationConstructor", "defaultEmptyArray", "type", "extractContinuationArgument", "Ljava/lang/reflect/Type;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n+ 2 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,276:1\n230#2,5:277\n230#2,5:282\n230#2,5:287\n230#2,5:292\n230#2,2:302\n232#2,3:308\n1#3:297\n1563#4:298\n1634#4,3:299\n1011#4,2:311\n1563#4:313\n1634#4,3:314\n1788#4,4:317\n1869#4,2:321\n1761#4,3:323\n37#5:304\n36#5,3:305\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n107#1:277,5\n158#1:282,5\n206#1:287,5\n214#1:292,5\n248#1:302,2\n248#1:308,3\n234#1:298\n234#1:299,3\n65#1:311,2\n85#1:313\n85#1:314,3\n124#1:317,4\n132#1:321,2\n220#1:323,3\n249#1:304\n249#1:305,3\n*E\n"})
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    @NotNull
    private final ReflectProperties.LazySoftVal<Object[]> _absentArguments;

    @NotNull
    private final ReflectProperties.LazySoftVal<List<Annotation>> _annotations;

    @NotNull
    private final ReflectProperties.LazySoftVal<ArrayList<KParameter>> _parameters;

    @NotNull
    private final ReflectProperties.LazySoftVal<KTypeImpl> _returnType;

    @NotNull
    private final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> _typeParameters;

    @NotNull
    private final Lazy<Boolean> parametersNeedMFVCFlattening;

    public final R callDefaultMethod$kotlin_reflection(@NotNull Map<KParameter, ? extends Object> args, @Nullable Continuation<?> continuationArgument) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        List<KParameter> parameters = getParameters();
        boolean z11 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) getCaller().call(isSuspend() ? new Continuation[]{continuationArgument} : new Continuation[0]);
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] absentArguments = getAbsentArguments();
        if (isSuspend()) {
            absentArguments[parameters.size()] = continuationArgument;
        }
        boolean zBooleanValue = this.parametersNeedMFVCFlattening.getValue().booleanValue();
        int i11 = 0;
        for (KParameter kParameter : parameters) {
            int parameterTypeSize = zBooleanValue ? getParameterTypeSize(kParameter) : 1;
            if (args.containsKey(kParameter)) {
                absentArguments[kParameter.getIndex()] = args.get(kParameter);
            } else if (kParameter.isOptional()) {
                if (zBooleanValue) {
                    int i12 = i11 + parameterTypeSize;
                    for (int i13 = i11; i13 < i12; i13++) {
                        int i14 = (i13 / 32) + size;
                        Object obj = absentArguments[i14];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                        absentArguments[i14] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i13 % 32)));
                    }
                } else {
                    int i15 = (i11 / 32) + size;
                    Object obj2 = absentArguments[i15];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    absentArguments[i15] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i11 % 32)));
                }
                z11 = true;
            } else if (!kParameter.isVararg()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            if (kParameter.getKind() == KParameter.Kind.VALUE) {
                i11 += parameterTypeSize;
            }
        }
        if (!z11) {
            try {
                Caller<?> caller = getCaller();
                Object[] objArrCopyOf = Arrays.copyOf(absentArguments, size);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                return (R) caller.call(objArrCopyOf);
            } catch (IllegalAccessException e12) {
                throw new IllegalCallableAccessException(e12);
            }
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller != null) {
            try {
                return (R) defaultCaller.call(absentArguments);
            } catch (IllegalAccessException e13) {
                throw new IllegalCallableAccessException(e13);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
    }

    @NotNull
    public abstract Caller<?> getCaller();

    @NotNull
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    public abstract Caller<?> getDefaultCaller();

    @NotNull
    public abstract CallableMemberDescriptor getDescriptor();

    public abstract boolean isBound();

    /* JADX INFO: Access modifiers changed from: private */
    public static final KTypeImpl _returnType$lambda$7(final KCallableImpl kCallableImpl) {
        KotlinType returnType = kCallableImpl.getDescriptor().getReturnType();
        Intrinsics.checkNotNull(returnType);
        return new KTypeImpl(returnType, new Function0(kCallableImpl) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$9
            private final KCallableImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return KCallableImpl._returnType$lambda$7$lambda$6(this.arg$0);
            }

            {
                this.arg$0 = kCallableImpl;
            }
        });
    }

    private final Object[] getAbsentArguments() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    private final int getParameterTypeSize(KParameter parameter) {
        if (!this.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!UtilKt.getNeedsMultiFieldValueClassFlattening(parameter.getType())) {
            return 1;
        }
        KType type = parameter.getType();
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(((KTypeImpl) type).getType()));
        Intrinsics.checkNotNull(mfvcUnboxMethods);
        return mfvcUnboxMethods.size();
    }

    @Override // p852kotlin.reflect.KCallable
    public R call(@NotNull Object... args) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return (R) getCaller().call(args);
        } catch (IllegalAccessException e11) {
            throw new IllegalCallableAccessException(e11);
        }
    }

    @Override // p852kotlin.reflect.KCallable
    public R callBy(@NotNull Map<KParameter, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return isAnnotationConstructor() ? callAnnotationConstructor(args) : callDefaultMethod$kotlin_reflection(args, null);
    }

    @Override // p852kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        Intrinsics.checkNotNullExpressionValue(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // p852kotlin.reflect.KCallable
    @NotNull
    public List<KParameter> getParameters() {
        ArrayList<KParameter> arrayListInvoke = this._parameters.invoke();
        Intrinsics.checkNotNullExpressionValue(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    @Override // p852kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        KTypeImpl kTypeImplInvoke = this._returnType.invoke();
        Intrinsics.checkNotNullExpressionValue(kTypeImplInvoke, "invoke(...)");
        return kTypeImplInvoke;
    }

    @Override // p852kotlin.reflect.KCallable
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> listInvoke = this._typeParameters.invoke();
        Intrinsics.checkNotNullExpressionValue(listInvoke, "invoke(...)");
        return listInvoke;
    }

    public KCallableImpl() {
        ReflectProperties.LazySoftVal<List<Annotation>> lazySoftValLazySoft = ReflectProperties.lazySoft(new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$0
            private final KCallableImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return KCallableImpl._annotations$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft, "lazySoft(...)");
        this._annotations = lazySoftValLazySoft;
        ReflectProperties.LazySoftVal<ArrayList<KParameter>> lazySoftValLazySoft2 = ReflectProperties.lazySoft(new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$1
            private final KCallableImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return KCallableImpl._parameters$lambda$5(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft2, "lazySoft(...)");
        this._parameters = lazySoftValLazySoft2;
        ReflectProperties.LazySoftVal<KTypeImpl> lazySoftValLazySoft3 = ReflectProperties.lazySoft(new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$2
            private final KCallableImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return KCallableImpl._returnType$lambda$7(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft3, "lazySoft(...)");
        this._returnType = lazySoftValLazySoft3;
        ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> lazySoftValLazySoft4 = ReflectProperties.lazySoft(new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$3
            private final KCallableImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return KCallableImpl._typeParameters$lambda$9(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft4, "lazySoft(...)");
        this._typeParameters = lazySoftValLazySoft4;
        ReflectProperties.LazySoftVal<Object[]> lazySoftValLazySoft5 = ReflectProperties.lazySoft(new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$4
            private final KCallableImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return KCallableImpl._absentArguments$lambda$14(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft5, "lazySoft(...)");
        this._absentArguments = lazySoftValLazySoft5;
        this.parametersNeedMFVCFlattening = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$5
            private final KCallableImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return Boolean.valueOf(KCallableImpl.parametersNeedMFVCFlattening$lambda$20(this.arg$0));
            }

            {
                this.arg$0 = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] _absentArguments$lambda$14(KCallableImpl kCallableImpl) {
        int i11;
        int parameterTypeSize;
        List<KParameter> parameters = kCallableImpl.getParameters();
        int size = parameters.size() + (kCallableImpl.isSuspend() ? 1 : 0);
        if (kCallableImpl.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            i11 = 0;
            for (KParameter kParameter : parameters) {
                if (kParameter.getKind() == KParameter.Kind.VALUE) {
                    parameterTypeSize = kCallableImpl.getParameterTypeSize(kParameter);
                } else {
                    parameterTypeSize = 0;
                }
                i11 += parameterTypeSize;
            }
        } else if (parameters.isEmpty()) {
            i11 = 0;
        } else {
            Iterator<T> it = parameters.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (((KParameter) it.next()).getKind() == KParameter.Kind.VALUE && (i11 = i11 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        int i12 = (i11 + 31) / 32;
        Object[] objArr = new Object[size + i12 + 1];
        for (KParameter kParameter2 : parameters) {
            if (kParameter2.isOptional() && !UtilKt.isInlineClassType(kParameter2.getType())) {
                objArr[kParameter2.getIndex()] = UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(kParameter2.getType()));
            } else if (kParameter2.isVararg()) {
                objArr[kParameter2.getIndex()] = kCallableImpl.defaultEmptyArray(kParameter2.getType());
            }
        }
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[size + i13] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _annotations$lambda$0(KCallableImpl kCallableImpl) {
        return UtilKt.computeAnnotations(kCallableImpl.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList _parameters$lambda$5(KCallableImpl kCallableImpl) {
        int i11;
        final CallableMemberDescriptor descriptor = kCallableImpl.getDescriptor();
        ArrayList arrayList = new ArrayList();
        final int i12 = 0;
        if (!kCallableImpl.isBound()) {
            final ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptor);
            if (instanceReceiverParameter != null) {
                arrayList.add(new KParameterImpl(kCallableImpl, 0, KParameter.Kind.INSTANCE, new Function0(instanceReceiverParameter) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$6
                    private final ReceiverParameterDescriptor arg$0;

                    @Override // p852kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return KCallableImpl._parameters$lambda$5$lambda$1(this.arg$0);
                    }

                    {
                        this.arg$0 = instanceReceiverParameter;
                    }
                }));
                i11 = 1;
            } else {
                i11 = 0;
            }
            final ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                arrayList.add(new KParameterImpl(kCallableImpl, i11, KParameter.Kind.EXTENSION_RECEIVER, new Function0(extensionReceiverParameter) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$7
                    private final ReceiverParameterDescriptor arg$0;

                    @Override // p852kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return KCallableImpl._parameters$lambda$5$lambda$2(this.arg$0);
                    }

                    {
                        this.arg$0 = extensionReceiverParameter;
                    }
                }));
                i11++;
            }
        } else {
            i11 = 0;
        }
        int size = descriptor.getValueParameters().size();
        while (i12 < size) {
            arrayList.add(new KParameterImpl(kCallableImpl, i11, KParameter.Kind.VALUE, new Function0(descriptor, i12) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$8
                private final CallableMemberDescriptor arg$0;
                private final int arg$1;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return KCallableImpl._parameters$lambda$5$lambda$3(this.arg$0, this.arg$1);
                }

                {
                    this.arg$0 = descriptor;
                    this.arg$1 = i12;
                }
            }));
            i12++;
            i11++;
        }
        if (kCallableImpl.isAnnotationConstructor() && (descriptor instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$lambda$5$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    return ComparisonsKt.compareValues(((KParameter) t11).getName(), ((KParameter) t12).getName());
                }
            });
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor _parameters$lambda$5$lambda$3(CallableMemberDescriptor callableMemberDescriptor, int i11) {
        ValueParameterDescriptor valueParameterDescriptor = callableMemberDescriptor.getValueParameters().get(i11);
        Intrinsics.checkNotNullExpressionValue(valueParameterDescriptor, "get(...)");
        return valueParameterDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type _returnType$lambda$7$lambda$6(KCallableImpl kCallableImpl) {
        Type typeExtractContinuationArgument = kCallableImpl.extractContinuationArgument();
        if (typeExtractContinuationArgument == null) {
            return kCallableImpl.getCaller().getReturnType();
        }
        return typeExtractContinuationArgument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _typeParameters$lambda$9(KCallableImpl kCallableImpl) {
        List<TypeParameterDescriptor> typeParameters = kCallableImpl.getDescriptor().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : typeParameters) {
            Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(new KTypeParameterImpl(kCallableImpl, typeParameterDescriptor));
        }
        return arrayList;
    }

    private final R callAnnotationConstructor(Map<KParameter, ? extends Object> args) throws IllegalCallableAccessException {
        Object objDefaultEmptyArray;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                objDefaultEmptyArray = args.get(kParameter);
                if (objDefaultEmptyArray == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.isOptional()) {
                objDefaultEmptyArray = null;
            } else if (kParameter.isVararg()) {
                objDefaultEmptyArray = defaultEmptyArray(kParameter.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            arrayList.add(objDefaultEmptyArray);
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller != null) {
            try {
                return (R) defaultCaller.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
    }

    private final Object defaultEmptyArray(KType type) {
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) KTypesJvm.getJvmErasure(type));
        if (javaClass.isArray()) {
            Object objNewInstance = Array.newInstance(javaClass.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + javaClass.getSimpleName() + ", because it is not an array type");
    }

    private final Type extractContinuationArgument() {
        ParameterizedType parameterizedType;
        Type rawType;
        WildcardType wildcardType;
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) getCaller().getParameterTypes());
            if (objLastOrNull instanceof ParameterizedType) {
                parameterizedType = (ParameterizedType) objLastOrNull;
            } else {
                parameterizedType = null;
            }
            if (parameterizedType != null) {
                rawType = parameterizedType.getRawType();
            } else {
                rawType = null;
            }
            if (Intrinsics.areEqual(rawType, Continuation.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                Object objSingle = ArraysKt.single(actualTypeArguments);
                if (objSingle instanceof WildcardType) {
                    wildcardType = (WildcardType) objSingle;
                } else {
                    wildcardType = null;
                }
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) ArraysKt.first(lowerBounds);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parametersNeedMFVCFlattening$lambda$20(KCallableImpl kCallableImpl) {
        List<KParameter> parameters = kCallableImpl.getParameters();
        if (parameters != null && parameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (UtilKt.getNeedsMultiFieldValueClassFlattening(((KParameter) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    @Override // p852kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = getDescriptor().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        return UtilKt.toKVisibility(visibility);
    }

    @Override // p852kotlin.reflect.KCallable
    public boolean isAbstract() {
        if (getDescriptor().getModality() == Modality.ABSTRACT) {
            return true;
        }
        return false;
    }

    public final boolean isAnnotationConstructor() {
        if (Intrinsics.areEqual(getName(), "<init>") && getContainer().getJClass().isAnnotation()) {
            return true;
        }
        return false;
    }

    @Override // p852kotlin.reflect.KCallable
    public boolean isFinal() {
        if (getDescriptor().getModality() == Modality.FINAL) {
            return true;
        }
        return false;
    }

    @Override // p852kotlin.reflect.KCallable
    public boolean isOpen() {
        if (getDescriptor().getModality() == Modality.OPEN) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor _parameters$lambda$5$lambda$1(ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor _parameters$lambda$5$lambda$2(ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }
}
