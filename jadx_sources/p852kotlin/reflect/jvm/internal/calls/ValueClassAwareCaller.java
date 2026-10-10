package p852kotlin.reflect.jvm.internal.calls;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import p852kotlin.reflect.jvm.internal.UtilKt;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ValueClassAwareCaller.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002()B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"J\u001b\u0010$\u001a\u0004\u0018\u00010%2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0016¢\u0006\u0002\u0010'R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010#\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "oldCaller", "isDefault", "", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "caller", "member", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "returnType", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "isBoundInstanceCallWithValueClasses", "()Z", "data", "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$BoxUnboxData;", "slices", "", "Lkotlin/ranges/IntRange;", "[Lkotlin/ranges/IntRange;", "getRealSlicesOfParameters", "index", "", "hasMfvcParameters", "call", "", "args", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "MultiFieldValueClassPrimaryConstructorCaller", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1761#2,3:393\n1563#2:396\n1634#2,3:397\n1761#2,3:409\n1634#2,3:412\n37#3:400\n36#3,3:401\n37#3:405\n36#3,3:406\n37#3:415\n36#3,3:416\n1#4:404\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n*L\n45#1:393,3\n48#1:396\n48#1:397,3\n166#1:409,3\n184#1:412,3\n48#1:400\n48#1:401,3\n155#1:405\n155#1:406,3\n192#1:415\n192#1:416,3\n*E\n"})
public final class ValueClassAwareCaller<M extends Member> implements Caller<M> {

    @NotNull
    private final Caller<M> caller;

    @NotNull
    private final BoxUnboxData data;
    private final boolean hasMfvcParameters;
    private final boolean isDefault;
    private final M member;

    @NotNull
    private final IntRange[] slices;

    /* JADX INFO: compiled from: ValueClassAwareCaller.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$BoxUnboxData;", "", "argumentRange", "Lkotlin/ranges/IntRange;", "unboxParameters", "", "", "Ljava/lang/reflect/Method;", "box", "<init>", "(Lkotlin/ranges/IntRange;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getUnboxParameters", "()[Ljava/util/List;", "[Ljava/util/List;", "getBox", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class BoxUnboxData {

        @NotNull
        private final IntRange argumentRange;

        @Nullable
        private final Method box;

        @NotNull
        private final List<Method>[] unboxParameters;

        public BoxUnboxData(@NotNull IntRange argumentRange, @NotNull List<Method>[] unboxParameters, @Nullable Method method) {
            Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
            Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
            this.argumentRange = argumentRange;
            this.unboxParameters = unboxParameters;
            this.box = method;
        }

        @NotNull
        public final IntRange getArgumentRange() {
            return this.argumentRange;
        }

        @Nullable
        public final Method getBox() {
            return this.box;
        }

        @NotNull
        public final List<Method>[] getUnboxParameters() {
            return this.unboxParameters;
        }
    }

    /* JADX INFO: compiled from: ValueClassAwareCaller.kt */
    @Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0016¢\u0006\u0002\u0010#R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001c¨\u0006$"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", TtmlNode.RUBY_CONTAINER, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "constructorDesc", "", "originalParameters", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "constructorImpl", "Ljava/lang/reflect/Method;", "boxMethod", "parameterUnboxMethods", "member", "getMember", "()Ljava/lang/Void;", "returnType", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "originalParametersGroups", "Ljava/lang/Class;", "getOriginalParametersGroups", "()Ljava/util/List;", "parameterTypes", "getParameterTypes", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,392:1\n1563#2:393\n1634#2,3:394\n1573#2:397\n1604#2,3:398\n1563#2:401\n1634#2,3:402\n1607#2:405\n1374#2:406\n1460#2,2:407\n1563#2:409\n1634#2,3:410\n1462#2,3:413\n37#3:416\n36#3,3:417\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n*L\n224#1:393\n224#1:394,3\n232#1:397\n232#1:398,3\n234#1:401\n234#1:402,3\n232#1:405\n241#1:406\n241#1:407,2\n241#1:409\n241#1:410,3\n241#1:413,3\n241#1:416\n241#1:417,3\n*E\n"})
    public static final class MultiFieldValueClassPrimaryConstructorCaller implements Caller {

        @NotNull
        private final Method boxMethod;

        @NotNull
        private final Method constructorImpl;

        @NotNull
        private final List<List<Class<?>>> originalParametersGroups;

        @NotNull
        private final List<Type> parameterTypes;

        @NotNull
        private final List<List<Method>> parameterUnboxMethods;

        public boolean default$isBoundInstanceCallWithValueClasses() {
            return false;
        }

        @Nullable
        public Void getMember() {
            return null;
        }

        public MultiFieldValueClassPrimaryConstructorCaller(@NotNull FunctionDescriptor descriptor, @NotNull KDeclarationContainerImpl container, @NotNull String constructorDesc, @NotNull List<? extends ParameterDescriptor> originalParameters) {
            Collection collectionListOf;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
            Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
            Method methodFindMethodBySignature = container.findMethodBySignature("constructor-impl", constructorDesc);
            Intrinsics.checkNotNull(methodFindMethodBySignature);
            this.constructorImpl = methodFindMethodBySignature;
            Method methodFindMethodBySignature2 = container.findMethodBySignature("box-impl", StringsKt.removeSuffix(constructorDesc, (CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED) + ReflectClassUtilKt.getDesc(container.getJClass()));
            Intrinsics.checkNotNull(methodFindMethodBySignature2);
            this.boxMethod = methodFindMethodBySignature2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(originalParameters, 10));
            Iterator<T> it = originalParameters.iterator();
            while (it.hasNext()) {
                KotlinType type = ((ParameterDescriptor) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                arrayList.add(ValueClassAwareCallerKt.getValueClassUnboxMethods(TypeSubstitutionKt.asSimpleType(type), descriptor));
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(originalParameters, 10));
            int i11 = 0;
            for (Object obj : originalParameters) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((ParameterDescriptor) obj).getType().getConstructor().mo105126getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo105126getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor;
                List<Method> list = this.parameterUnboxMethods.get(i11);
                if (list != null) {
                    collectionListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        collectionListOf.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
                    Intrinsics.checkNotNull(javaClass);
                    collectionListOf = CollectionsKt.listOf(javaClass);
                }
                arrayList2.add(collectionListOf);
                i11 = i12;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = CollectionsKt.flatten(arrayList2);
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionListOf;
            Intrinsics.checkNotNullParameter(args, "args");
            List<Pair> listZip = ArraysKt.zip(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listZip) {
                Object objComponent1 = pair.component1();
                List list = (List) pair.component2();
                if (list != null) {
                    collectionListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        collectionListOf.add(((Method) it.next()).invoke(objComponent1, new Object[0]));
                    }
                } else {
                    collectionListOf = CollectionsKt.listOf(objComponent1);
                }
                CollectionsKt.addAll(arrayList, collectionListOf);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        /* JADX INFO: renamed from: getMember */
        public /* bridge */ /* synthetic */ Member mo105114getMember() {
            return (Member) getMember();
        }

        @NotNull
        public final List<List<Class<?>>> getOriginalParametersGroups() {
            return this.originalParametersGroups;
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public List<Type> getParameterTypes() {
            return this.parameterTypes;
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // p852kotlin.reflect.jvm.internal.calls.Caller
        public boolean isBoundInstanceCallWithValueClasses() {
            return default$isBoundInstanceCallWithValueClasses();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[LOOP:1: B:25:0x0073->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    public ValueClassAwareCaller(@NotNull CallableMemberDescriptor descriptor, @NotNull Caller<? extends M> oldCaller, boolean z11) {
        Class inlineClass;
        BoxUnboxData boxUnboxData;
        KotlinType kotlinTypeSubstitutedUnderlyingType;
        ArrayList arrayList;
        Iterator<T> it;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(oldCaller, "oldCaller");
        this.isDefault = z11;
        boolean z12 = false;
        if (oldCaller instanceof CallerImpl.Method.BoundStatic) {
            ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            extensionReceiverParameter = extensionReceiverParameter == null ? descriptor.getDispatchReceiverParameter() : extensionReceiverParameter;
            KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
            if (type != null && InlineClassesUtilsKt.needsMfvcFlattening(type)) {
                if (z11) {
                    List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    if (valueParameters == null || !valueParameters.isEmpty()) {
                        Iterator<T> it2 = valueParameters.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                    List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(type));
                                    Intrinsics.checkNotNull(mfvcUnboxMethods);
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mfvcUnboxMethods, 10));
                                    it = mfvcUnboxMethods.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((CallerImpl.Method.BoundStatic) oldCaller).getBoundReceiver(), new Object[0]));
                                    }
                                    oldCaller = new CallerImpl.Method.BoundStaticMultiFieldValueClass(((CallerImpl.Method) oldCaller).mo105114getMember(), arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    List<Method> mfvcUnboxMethods2 = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(type));
                    Intrinsics.checkNotNull(mfvcUnboxMethods2);
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mfvcUnboxMethods2, 10));
                    it = mfvcUnboxMethods2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((CallerImpl.Method.BoundStatic) oldCaller).getBoundReceiver(), new Object[0]));
                    }
                    oldCaller = new CallerImpl.Method.BoundStaticMultiFieldValueClass(((CallerImpl.Method) oldCaller).mo105114getMember(), arrayList.toArray(new Object[0]));
                }
            }
        }
        this.caller = (Caller<M>) oldCaller;
        this.member = (M) oldCaller.mo105114getMember();
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        boolean z13 = descriptor instanceof FunctionDescriptor;
        Method boxMethod = ((z13 && ((FunctionDescriptor) descriptor).isSuspend() && (kotlinTypeSubstitutedUnderlyingType = InlineClassesUtilsKt.substitutedUnderlyingType(returnType)) != null && KotlinBuiltIns.isPrimitiveType(kotlinTypeSubstitutedUnderlyingType)) || (inlineClass = ValueClassAwareCallerKt.toInlineClass(returnType)) == null) ? null : ValueClassAwareCallerKt.getBoxMethod(inlineClass, descriptor);
        if (InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            boxUnboxData = new BoxUnboxData(IntRange.INSTANCE.getEMPTY(), new List[0], boxMethod);
        } else {
            int i11 = -1;
            if ((!(oldCaller instanceof CallerImpl.Method.BoundStatic) || oldCaller.getIsCallByToValueClassMangledMethod()) && !(oldCaller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass)) {
                if (descriptor instanceof ConstructorDescriptor) {
                    if (!(oldCaller instanceof BoundCaller)) {
                        i11 = 0;
                    }
                } else if (descriptor.getDispatchReceiverParameter() == null || (oldCaller instanceof BoundCaller)) {
                    i11 = 0;
                } else {
                    DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                    Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                }
            }
            int i12 = oldCaller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? -oldCaller.getReceiverComponentsCount() : i11;
            List listMakeKotlinParameterTypes = ValueClassAwareCallerKt.makeKotlinParameterTypes(descriptor, oldCaller.mo105114getMember(), new Function1() { // from class: kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller$$Lambda$0
                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return Boolean.valueOf(ValueClassAwareCaller.data$lambda$5$lambda$3((ClassDescriptor) obj));
                }
            });
            Iterator it3 = listMakeKotlinParameterTypes.iterator();
            int size = 0;
            while (it3.hasNext()) {
                List<Method> mfvcUnboxMethods3 = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType((KotlinType) it3.next()));
                size += mfvcUnboxMethods3 != null ? mfvcUnboxMethods3.size() : 1;
            }
            int i13 = size + i12 + (this.isDefault ? ((size + 31) / 32) + 1 : 0) + ((z13 && ((FunctionDescriptor) descriptor).isSuspend()) ? 1 : 0);
            ValueClassAwareCallerKt.checkParametersSize(this, i13, descriptor, this.isDefault);
            IntRange intRangeUntil = RangesKt.until(Math.max(i11, 0), listMakeKotlinParameterTypes.size() + i11);
            List[] listArr = new List[i13];
            int i14 = 0;
            while (i14 < i13) {
                listArr[i14] = (i14 > intRangeUntil.getLast() || intRangeUntil.getFirst() > i14) ? null : ValueClassAwareCallerKt.getValueClassUnboxMethods(TypeSubstitutionKt.asSimpleType((KotlinType) listMakeKotlinParameterTypes.get(i14 - i11)), descriptor);
                i14++;
            }
            boxUnboxData = new BoxUnboxData(intRangeUntil, listArr, boxMethod);
        }
        this.data = boxUnboxData;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Caller<M> caller = this.caller;
        int length = caller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? ((CallerImpl.Method.BoundStaticMultiFieldValueClass) caller).getBoundReceiverComponents().length : caller instanceof CallerImpl.Method.BoundStatic ? 1 : 0;
        if (length > 0) {
            listCreateListBuilder.add(RangesKt.until(0, length));
        }
        List<Method>[] unboxParameters = boxUnboxData.getUnboxParameters();
        int length2 = unboxParameters.length;
        int i15 = 0;
        while (i15 < length2) {
            List<Method> list = unboxParameters[i15];
            int size2 = (list != null ? list.size() : 1) + length;
            listCreateListBuilder.add(RangesKt.until(length, size2));
            i15++;
            length = size2;
        }
        this.slices = (IntRange[]) CollectionsKt.build(listCreateListBuilder).toArray(new IntRange[0]);
        Iterable argumentRange = this.data.getArgumentRange();
        if (!(argumentRange instanceof Collection) || !((Collection) argumentRange).isEmpty()) {
            Iterator it4 = argumentRange.iterator();
            while (it4.hasNext()) {
                List<Method> list2 = this.data.getUnboxParameters()[((IntIterator) it4).nextInt()];
                if (list2 != null && list2.size() > 1) {
                    z12 = true;
                    break;
                }
            }
        }
        this.hasMfvcParameters = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean data$lambda$5$lambda$3(ClassDescriptor makeKotlinParameterTypes) {
        Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return InlineClassesUtilsKt.isValueClass(makeKotlinParameterTypes);
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objDefaultPrimitiveValue;
        Object objDefaultPrimitiveValue2;
        Intrinsics.checkNotNullParameter(args, "args");
        IntRange argumentRange = this.data.getArgumentRange();
        List<Method>[] unboxParameters = this.data.getUnboxParameters();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.hasMfvcParameters) {
                List listCreateListBuilder = CollectionsKt.createListBuilder(args.length);
                int first = argumentRange.getFirst();
                for (int i11 = 0; i11 < first; i11++) {
                    listCreateListBuilder.add(args[i11]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = unboxParameters[first2];
                        Object obj = args[first2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj != null) {
                                    objDefaultPrimitiveValue2 = method.invoke(obj, new Object[0]);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    objDefaultPrimitiveValue2 = UtilKt.defaultPrimitiveValue(returnType);
                                }
                                listCreateListBuilder.add(objDefaultPrimitiveValue2);
                            }
                        } else {
                            listCreateListBuilder.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int lastIndex = ArraysKt.getLastIndex(args);
                if (last2 <= lastIndex) {
                    while (true) {
                        listCreateListBuilder.add(args[last2]);
                        if (last2 == lastIndex) {
                            break;
                        }
                        last2++;
                    }
                }
                args = CollectionsKt.build(listCreateListBuilder).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i12 = 0; i12 < length; i12++) {
                    int first3 = argumentRange.getFirst();
                    if (i12 > argumentRange.getLast() || first3 > i12) {
                        objDefaultPrimitiveValue = args[i12];
                    } else {
                        List<Method> list2 = unboxParameters[i12];
                        Method method2 = list2 != null ? (Method) CollectionsKt.single((List) list2) : null;
                        objDefaultPrimitiveValue = args[i12];
                        if (method2 != null) {
                            if (objDefaultPrimitiveValue != null) {
                                objDefaultPrimitiveValue = method2.invoke(objDefaultPrimitiveValue, new Object[0]);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                objDefaultPrimitiveValue = UtilKt.defaultPrimitiveValue(returnType2);
                            }
                        }
                    }
                    objArr[i12] = objDefaultPrimitiveValue;
                }
                args = objArr;
            }
        }
        Object objCall = this.caller.call(args);
        return (objCall == IntrinsicsKt.getCOROUTINE_SUSPENDED() || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember */
    public M mo105114getMember() {
        return this.member;
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    @NotNull
    public final IntRange getRealSlicesOfParameters(int index) {
        if (index >= 0) {
            IntRange[] intRangeArr = this.slices;
            if (index < intRangeArr.length) {
                return intRangeArr[index];
            }
        }
        IntRange[] intRangeArr2 = this.slices;
        if (intRangeArr2.length == 0) {
            return new IntRange(index, index);
        }
        int length = (index - intRangeArr2.length) + ((IntRange) ArraysKt.last(intRangeArr2)).getLast() + 1;
        return new IntRange(length, length);
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.caller.getReturnType();
    }

    @Override // p852kotlin.reflect.jvm.internal.calls.Caller
    public boolean isBoundInstanceCallWithValueClasses() {
        return this.caller instanceof CallerImpl.Method.BoundInstance;
    }
}
