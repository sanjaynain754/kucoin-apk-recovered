package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedEnhancementInfoKt\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 3 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder\n*L\n1#1,347:1\n287#1:349\n13#2:348\n293#3:350\n293#3:351\n293#3:352\n293#3:353\n293#3:354\n293#3:355\n293#3:356\n293#3:357\n293#3:358\n293#3:359\n293#3:360\n293#3:361\n293#3:362\n293#3:363\n293#3:364\n293#3:365\n293#3:366\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedEnhancementInfoKt\n*L\n67#1:349\n56#1:348\n68#1:350\n73#1:351\n78#1:352\n93#1:353\n117#1:354\n134#1:355\n154#1:356\n202#1:357\n214#1:358\n234#1:359\n240#1:360\n246#1:361\n253#1:362\n258#1:363\n264#1:364\n270#1:365\n277#1:366\n*E\n"})
public final class PredefinedEnhancementInfoKt {

    @NotNull
    private static final JavaTypeQualifiers NOT_NULLABLE;

    @NotNull
    private static final JavaTypeQualifiers NOT_PLATFORM;

    @NotNull
    private static final JavaTypeQualifiers NULLABLE = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    @NotNull
    private static final Map<String, PredefinedFunctionEnhancementInfo> PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        NOT_PLATFORM = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        NOT_NULLABLE = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        final SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        final String strJavaLang = signatureBuildingComponents.javaLang("Object");
        final String strJavaFunction = signatureBuildingComponents.javaFunction("Predicate");
        final String strJavaFunction2 = signatureBuildingComponents.javaFunction("Function");
        final String strJavaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        final String strJavaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        final String strJavaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        final String strJavaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        final String strJavaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        final String strJavaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Iterator")), "forEachRemaining", null, new Function1(strJavaFunction3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$0
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90241x57ff66e8(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaFunction3;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("Iterable")), "spliterator", null, new Function1(signatureBuildingComponents) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$1
            private final SignatureBuildingComponents arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90257x40924928(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = signatureBuildingComponents;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Collection"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "removeIf", null, new Function1(strJavaFunction) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$2
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90282x11b80da6(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaFunction;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "stream", null, new Function1(strJavaUtil) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$3
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90283x11b80da7(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaUtil;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "parallelStream", null, new Function1(strJavaUtil) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90284x11b80da8(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaUtil;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("List"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder2, "replaceAll", null, new Function1(strJavaFunction6) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$5
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90245x538965db(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaFunction6;
            }
        }, 2, null);
        classEnhancementBuilder2.function("addFirst", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$6
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90246x538965dc(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder2.function("addLast", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$7
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90242x1da354dc(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder2.function("removeFirst", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$8
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90243x1da354dd(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder2.function("removeLast", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$9
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90244x1da354de(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedList"));
        classEnhancementBuilder3.function("addFirst", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$10
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90247x61ad2a5(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder3.function("addLast", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$11
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90248x61ad2a6(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder3.function("removeFirst", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$12
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90249x61ad2a7(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder3.function("removeLast", "2.1", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$13
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90250x61ad2a8(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder4 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedHashSet"));
        classEnhancementBuilder4.function("addFirst", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$14
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90251x4f1e5fc6(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder4.function("addLast", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$15
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90252x4f1e5fdc(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder4.function("removeFirst", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$16
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90253x4f1e5fdd(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder4.function("removeLast", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$17
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90254x4f1e5fde(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder4.function("getFirst", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$18
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90255x4f1e5fdf(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder4.function("getLast", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$19
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90256x4f1e5fe0(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder5 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Map"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "forEach", null, new Function1(strJavaFunction5) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$20
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90258x56d00541(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaFunction5;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "putIfAbsent", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$21
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90259x56d00542(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replace", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$22
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90260x56d00543(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replace", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$23
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90261x56d00544(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replaceAll", null, new Function1(strJavaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$24
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90262x56d0055a(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaFunction4;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "compute", null, new Function1(strJavaLang, strJavaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            private final String arg$0;
            private final String arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90263x56d0055b(this.arg$0, this.arg$1, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaFunction4;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "computeIfAbsent", null, new Function1(strJavaLang, strJavaFunction2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$26
            private final String arg$0;
            private final String arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90264x56d0055c(this.arg$0, this.arg$1, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaFunction2;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "computeIfPresent", null, new Function1(strJavaLang, strJavaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$27
            private final String arg$0;
            private final String arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90265x56d0055d(this.arg$0, this.arg$1, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaFunction4;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "merge", null, new Function1(strJavaLang, strJavaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$28
            private final String arg$0;
            private final String arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90266x56d0055e(this.arg$0, this.arg$1, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaFunction4;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder6 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedHashMap"));
        classEnhancementBuilder6.function("putFirst", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$29
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90267x157e1da3(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        classEnhancementBuilder6.function("putLast", "2.2", new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$30
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90268x157e1da4(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder7 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaUtil2);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "empty", null, new Function1(strJavaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$31
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90269xc99cf801(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaUtil2;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "of", null, new Function1(strJavaLang, strJavaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$32
            private final String arg$0;
            private final String arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90270xc99cf817(this.arg$0, this.arg$1, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaUtil2;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "ofNullable", null, new Function1(strJavaLang, strJavaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$33
            private final String arg$0;
            private final String arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90271xc99cf818(this.arg$0, this.arg$1, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
                this.arg$1 = strJavaUtil2;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "get", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$34
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90272xc99cf819(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "ifPresent", null, new Function1(strJavaFunction3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$35
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90273xc99cf81a(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaFunction3;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("ref/Reference")), "get", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$36
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90274xf3665d9e(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction), "test", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$37
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90275x1d2fc322(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("BiPredicate")), "test", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$38
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90276x7dbbd27b(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction3), "accept", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$39
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90277xa7853814(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction5), "accept", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$40
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90278xd14e9d98(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction2), "apply", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$41
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90279xfb18031c(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction4), "apply", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$42
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90280x24e168a0(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("Supplier")), "get", null, new Function1(strJavaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$43
            private final String arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return PredefinedEnhancementInfoKt.m90281x856d77f9(this.arg$0, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.arg$0 = strJavaLang;
            }
        }, 2, null);
        PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE = signatureEnhancementBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$1$lambda$0 */
    public static final Unit m90241x57ff66e8(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$10 */
    public static final Unit m90242x1da354dc(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$11 */
    public static final Unit m90243x1da354dd(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$12 */
    public static final Unit m90244x1da354de(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$8 */
    public static final Unit m90245x538965db(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$13$lambda$9 */
    public static final Unit m90246x538965dc(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$18$lambda$14 */
    public static final Unit m90247x61ad2a5(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$18$lambda$15 */
    public static final Unit m90248x61ad2a6(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$18$lambda$16 */
    public static final Unit m90249x61ad2a7(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$18$lambda$17 */
    public static final Unit m90250x61ad2a8(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$19 */
    public static final Unit m90251x4f1e5fc6(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$20 */
    public static final Unit m90252x4f1e5fdc(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$21 */
    public static final Unit m90253x4f1e5fdd(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$22 */
    public static final Unit m90254x4f1e5fde(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$23 */
    public static final Unit m90255x4f1e5fdf(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$25$lambda$24 */
    public static final Unit m90256x4f1e5fe0(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$3$lambda$2 */
    public static final Unit m90257x40924928(SignatureBuildingComponents signatureBuildingComponents, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        String strJavaUtil = signatureBuildingComponents.javaUtil("Spliterator");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.returns(strJavaUtil, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$26 */
    public static final Unit m90258x56d00541(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$27 */
    public static final Unit m90259x56d00542(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$28 */
    public static final Unit m90260x56d00543(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$29 */
    public static final Unit m90261x56d00544(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$30 */
    public static final Unit m90262x56d0055a(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$31 */
    public static final Unit m90263x56d0055b(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = NULLABLE;
        function.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2);
        function.returns(str, javaTypeQualifiers2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$32 */
    public static final Unit m90264x56d0055c(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        function.returns(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$33 */
    public static final Unit m90265x56d0055d(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = NOT_NULLABLE;
        JavaTypeQualifiers javaTypeQualifiers3 = NULLABLE;
        function.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers3);
        function.returns(str, javaTypeQualifiers3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$35$lambda$34 */
    public static final Unit m90266x56d0055e(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = NOT_NULLABLE;
        function.parameter(str, javaTypeQualifiers2);
        JavaTypeQualifiers javaTypeQualifiers3 = NULLABLE;
        function.parameter(str2, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3);
        function.returns(str, javaTypeQualifiers3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$38$lambda$36 */
    public static final Unit m90267x157e1da3(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$38$lambda$37 */
    public static final Unit m90268x157e1da4(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$39 */
    public static final Unit m90269xc99cf801(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM, NOT_NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$40 */
    public static final Unit m90270xc99cf817(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_NULLABLE;
        function.parameter(str, javaTypeQualifiers);
        function.returns(str2, NOT_PLATFORM, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$41 */
    public static final Unit m90271xc99cf818(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NULLABLE);
        function.returns(str2, NOT_PLATFORM, NOT_NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$42 */
    public static final Unit m90272xc99cf819(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$44$lambda$43 */
    public static final Unit m90273xc99cf81a(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM, NOT_NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$46$lambda$45 */
    public static final Unit m90274xf3665d9e(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NULLABLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$48$lambda$47 */
    public static final Unit m90275x1d2fc322(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$50$lambda$49 */
    public static final Unit m90276x7dbbd27b(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$52$lambda$51 */
    public static final Unit m90277xa7853814(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.parameter(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$54$lambda$53 */
    public static final Unit m90278xd14e9d98(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$56$lambda$55 */
    public static final Unit m90279xfb18031c(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$58$lambda$57 */
    public static final Unit m90280x24e168a0(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$60$lambda$59 */
    public static final Unit m90281x856d77f9(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.returns(str, NOT_PLATFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$7$lambda$4 */
    public static final Unit m90282x11b80da6(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$7$lambda$5 */
    public static final Unit m90283x11b80da7(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.returns(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$62$lambda$61$lambda$7$lambda$6 */
    public static final Unit m90284x11b80da8(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = NOT_PLATFORM;
        function.returns(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.INSTANCE;
    }

    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;
    }
}
