package p852kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import p852kotlin.reflect.jvm.internal.impl.types.DynamicType;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p852kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.types.RawType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import p852kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p852kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {

    /* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
    @SourceDebugExtension({"SMAP\nClassicTypeSystemContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContextKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 6 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n1#1,970:1\n1#2:971\n964#3:972\n964#3:973\n964#3:974\n964#3:975\n964#3:976\n964#3:977\n964#3:978\n964#3:979\n964#3:980\n964#3:981\n964#3:982\n964#3:983\n964#3:984\n964#3:985\n964#3:986\n964#3:987\n964#3:988\n964#3:989\n964#3:990\n964#3:991\n964#3:992\n964#3:993\n964#3:994\n964#3:995\n964#3:996\n964#3:997\n964#3:998\n964#3:999\n964#3:1000\n964#3:1001\n964#3:1002\n964#3:1003\n964#3:1004\n964#3:1005\n964#3:1006\n964#3:1007\n964#3:1008\n964#3:1009\n964#3:1010\n964#3:1011\n964#3:1012\n964#3:1013\n964#3:1014\n964#3:1015\n964#3:1016\n964#3:1017\n964#3:1018\n964#3:1019\n964#3:1020\n964#3:1021\n964#3:1022\n964#3:1023\n964#3:1024\n964#3:1025\n964#3:1026\n964#3:1027\n964#3:1028\n964#3:1029\n964#3:1030\n964#3:1031\n964#3:1032\n964#3:1033\n964#3:1034\n964#3:1035\n964#3:1036\n964#3:1037\n964#3:1038\n964#3:1039\n964#3:1040\n964#3:1041\n964#3:1042\n964#3:1043\n964#3:1044\n964#3:1048\n964#3:1049\n964#3:1050\n964#3:1051\n964#3:1052\n964#3:1053\n964#3:1054\n964#3:1055\n964#3:1061\n964#3:1062\n964#3:1063\n964#3:1064\n964#3:1065\n964#3:1066\n964#3:1073\n964#3:1074\n964#3:1075\n964#3:1090\n964#3:1091\n964#3:1092\n964#3:1093\n964#3:1104\n964#3:1105\n964#3:1106\n964#3:1107\n964#3:1108\n964#3:1109\n964#3:1110\n964#3:1111\n964#3:1112\n964#3:1113\n964#3:1114\n964#3:1115\n964#3:1116\n964#3:1117\n964#3:1118\n964#3:1119\n964#3:1120\n964#3:1121\n964#3:1122\n964#3:1123\n964#3:1124\n964#3:1125\n964#3:1126\n964#3:1127\n964#3:1128\n964#3:1129\n827#4:1045\n855#4,2:1046\n774#4:1058\n865#4,2:1059\n1563#4:1069\n1634#4,3:1070\n1563#4:1076\n1634#4,3:1077\n2783#4,7:1080\n827#4:1087\n855#4,2:1088\n1563#4:1094\n1634#4,3:1095\n1285#4,2:1098\n1299#4,4:1100\n21#5,2:1056\n264#6,2:1067\n*S KotlinDebug\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n*L\n41#1:972\n46#1:973\n59#1:974\n64#1:975\n70#1:976\n76#1:977\n81#1:978\n86#1:979\n91#1:980\n96#1:981\n101#1:982\n106#1:983\n111#1:984\n120#1:985\n126#1:986\n131#1:987\n136#1:988\n137#1:989\n142#1:990\n147#1:991\n152#1:992\n157#1:993\n166#1:994\n171#1:995\n176#1:996\n181#1:997\n193#1:998\n198#1:999\n203#1:1000\n208#1:1001\n213#1:1002\n218#1:1003\n223#1:1004\n228#1:1005\n233#1:1006\n234#1:1007\n240#1:1008\n246#1:1009\n251#1:1010\n256#1:1011\n261#1:1012\n266#1:1013\n271#1:1014\n276#1:1015\n281#1:1016\n286#1:1017\n291#1:1018\n292#1:1019\n298#1:1020\n299#1:1021\n304#1:1022\n309#1:1023\n314#1:1024\n320#1:1025\n328#1:1026\n334#1:1027\n339#1:1028\n344#1:1029\n349#1:1030\n354#1:1031\n359#1:1032\n364#1:1033\n378#1:1034\n388#1:1035\n393#1:1036\n419#1:1037\n424#1:1038\n429#1:1039\n430#1:1040\n471#1:1041\n477#1:1042\n482#1:1043\n487#1:1044\n493#1:1048\n498#1:1049\n515#1:1050\n521#1:1051\n526#1:1052\n531#1:1053\n542#1:1054\n553#1:1055\n576#1:1061\n581#1:1062\n586#1:1063\n593#1:1064\n598#1:1065\n604#1:1066\n609#1:1073\n636#1:1074\n637#1:1075\n693#1:1090\n698#1:1091\n703#1:1092\n708#1:1093\n746#1:1104\n751#1:1105\n756#1:1106\n761#1:1107\n766#1:1108\n771#1:1109\n776#1:1110\n781#1:1111\n786#1:1112\n791#1:1113\n796#1:1114\n801#1:1115\n806#1:1116\n811#1:1117\n816#1:1118\n821#1:1119\n826#1:1120\n831#1:1121\n836#1:1122\n845#1:1123\n846#1:1124\n857#1:1125\n862#1:1126\n867#1:1127\n898#1:1128\n905#1:1129\n488#1:1045\n488#1:1046,2\n561#1:1058\n561#1:1059,2\n605#1:1069\n605#1:1070,3\n679#1:1076\n679#1:1077,3\n679#1:1080,7\n685#1:1087\n685#1:1088,2\n734#1:1094\n734#1:1095,3\n735#1:1098,2\n735#1:1100,4\n555#1:1056,2\n605#1:1067,2\n*E\n"})
    public static final class DefaultImpls {
        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) receiver).getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                return TypeSystemContextKt.convertVariance(projectionKind);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isK2(@NotNull ClassicTypeSystemContext classicTypeSystemContext) {
            return false;
        }

        @NotNull
        public static TypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).getConstructor();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static SimpleTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver, boolean z11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).makeNullableAsSpecified(z11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean areEqualTypeConstructors(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker c11, @NotNull TypeConstructorMarker c12) {
            Intrinsics.checkNotNullParameter(c11, "c1");
            Intrinsics.checkNotNullParameter(c12, "c2");
            if (!(c11 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c11 + ", " + Reflection.getOrCreateKotlinClass(c11.getClass())).toString());
            }
            if (c12 instanceof TypeConstructor) {
                return Intrinsics.areEqual(c11, c12);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + Reflection.getOrCreateKotlinClass(c12.getClass())).toString());
        }

        public static int argumentsCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeArgumentListMarker asArgumentList(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return (TypeArgumentListMarker) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static CapturedTypeMarker asCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext.asCapturedType(((SimpleTypeWithEnhancement) receiver).getOrigin());
                }
                if (receiver instanceof NewCapturedType) {
                    return (NewCapturedType) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static DynamicTypeMarker asDynamicType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                if (receiver instanceof DynamicType) {
                    return (DynamicType) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static FlexibleTypeMarker asFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) receiver).unwrap();
                if (unwrappedTypeUnwrap instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static SimpleTypeMarker asRigidType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) receiver).unwrap();
                if (unwrappedTypeUnwrap instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeArgumentMarker asTypeArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static CaptureStatus captureStatus(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getCaptureStatus();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker createFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker lowerBound, @NotNull RigidTypeMarker upperBound) {
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            if (!(lowerBound instanceof SimpleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + classicTypeSystemContext + ", " + Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass())).toString());
            }
            if (upperBound instanceof SimpleType) {
                return KotlinTypeFactory.flexibleType((SimpleType) lowerBound, (SimpleType) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + classicTypeSystemContext + ", " + Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass())).toString());
        }

        @NotNull
        public static TypeArgumentMarker getArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, int i11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().get(i11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static List<TypeArgumentMarker> getArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static FqNameUnsafe getClassFqNameUnsafe(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((TypeConstructor) receiver).mo105126getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo105126getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.getFqNameUnsafe((ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeParameterMarker getParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver, int i11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) receiver).getParameters().get(i11);
                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "get(...)");
                return typeParameterDescriptor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static List<TypeParameterMarker> getParameters(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) receiver).getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static PrimitiveType getPrimitiveArrayType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((TypeConstructor) receiver).mo105126getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo105126getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveArrayType((ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static PrimitiveType getPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((TypeConstructor) receiver).mo105126getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo105126getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveType((ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker getRepresentativeUpperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static KotlinTypeMarker getType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (classicTypeSystemContext.isStarProjection(receiver)) {
                return null;
            }
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).getType().unwrap();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static TypeParameterMarker getTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeVariableTypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) receiver).getOriginalTypeParameter();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static TypeParameterMarker getTypeParameterClassifier(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((TypeConstructor) receiver).mo105126getDeclarationDescriptor();
                if (classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorMo105126getDeclarationDescriptor;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return InlineClassesUtilsKt.unsubstitutedUnderlyingType((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static List<KotlinTypeMarker> getUpperBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) receiver).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean hasAnnotation(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, @NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getAnnotations().hasAnnotation(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean hasRecursiveBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver, @Nullable TypeConstructorMarker typeConstructorMarker) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof TypeParameterDescriptor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) receiver;
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.hasTypeParameterRecursiveBounds$default(typeParameterDescriptor, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + typeParameterDescriptor + ", " + Reflection.getOrCreateKotlinClass(typeParameterDescriptor.getClass())).toString());
        }

        public static boolean identicalArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker a11, @NotNull RigidTypeMarker b11) {
            Intrinsics.checkNotNullParameter(a11, "a");
            Intrinsics.checkNotNullParameter(b11, "b");
            if (!(a11 instanceof SimpleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a11 + ", " + Reflection.getOrCreateKotlinClass(a11.getClass())).toString());
            }
            if (b11 instanceof SimpleType) {
                return ((SimpleType) a11).getArguments() == ((SimpleType) b11).getArguments();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b11 + ", " + Reflection.getOrCreateKotlinClass(b11.getClass())).toString());
        }

        public static boolean isAnyConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.any);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isClassTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).mo105126getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isCommonFinalClassConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((TypeConstructor) receiver).mo105126getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor : null;
                return (classDescriptor == null || !ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isDenotable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).isDenotable();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isError(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isInlineClass(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((TypeConstructor) receiver).mo105126getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor : null;
                return (classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null) instanceof InlineClassRepresentation;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isIntegerLiteralTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isIntersection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isMarkedNullable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (receiver instanceof SimpleType) && ((SimpleType) receiver).isMarkedNullable();
        }

        public static boolean isNotNullTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof NotNullTypeParameter;
        }

        public static boolean isNothingConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.nothing);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isNullableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isOldCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isProjectionNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).isProjectionNotNull();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isRawType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return receiver instanceof RawType;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (KotlinTypeKt.isError((KotlinType) receiver)) {
                    return false;
                }
                SimpleType simpleType = (SimpleType) receiver;
                if (simpleType.getConstructor().mo105126getDeclarationDescriptor() instanceof TypeAliasDescriptor) {
                    return false;
                }
                return simpleType.getConstructor().mo105126getDeclarationDescriptor() != null || (receiver instanceof CapturedType) || (receiver instanceof NewCapturedType) || (receiver instanceof DefinitelyNotNullType) || (simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor) || isSingleClassifierTypeWithEnhancement(classicTypeSystemContext, (SimpleTypeMarker) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        private static boolean isSingleClassifierTypeWithEnhancement(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return (simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.isSingleClassifierType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
        }

        public static boolean isStarProjection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).isStarProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.isStubType((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubTypeForBuilderInference(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.isStubTypeForBuilderInference((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isTypeVariableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (receiver instanceof UnwrappedType) && (((UnwrappedType) receiver).getConstructor() instanceof NewTypeVariableConstructor);
        }

        public static boolean isUnderKotlinPackage(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((TypeConstructor) receiver).mo105126getDeclarationDescriptor();
                return classifierDescriptorMo105126getDeclarationDescriptor != null && KotlinBuiltIns.isUnderKotlinPackage(classifierDescriptorMo105126getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static SimpleTypeMarker lowerBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getLowerBound();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static KotlinTypeMarker lowerType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getLowerType();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, boolean z11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof UnwrappedType) {
                return ClassicTypeSystemContextKt.makeDefinitelyNotNullOrNotNullInternal((UnwrappedType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeCheckerState newTypeCheckerState(@NotNull ClassicTypeSystemContext classicTypeSystemContext, boolean z11, boolean z12, boolean z13) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z11, z12, classicTypeSystemContext, null, null, 24, null);
        }

        @NotNull
        public static SimpleTypeMarker original(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull DefinitelyNotNullTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) receiver).getOriginal();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static int parametersCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static Collection<KotlinTypeMarker> possibleIntegerTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            TypeConstructorMarker typeConstructorMarkerTypeConstructor = classicTypeSystemContext.typeConstructor(receiver);
            if (typeConstructorMarkerTypeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorMarkerTypeConstructor).getPossibleTypes();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeArgumentMarker projection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).getProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static Collection<KotlinTypeMarker> supertypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Collection<KotlinType> collectionMo105127getSupertypes = ((TypeConstructor) receiver).mo105127getSupertypes();
                Intrinsics.checkNotNullExpressionValue(collectionMo105127getSupertypes, "getSupertypes(...)");
                return collectionMo105127getSupertypes;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static SimpleTypeMarker upperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getUpperBound();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static SimpleType captureFromArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker type, @NotNull CaptureStatus status) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            if (type instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments((SimpleType) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + Reflection.getOrCreateKotlinClass(type.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker intersectTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull Collection<? extends KotlinTypeMarker> types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return IntersectionTypeKt.intersectTypes(types);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(@NotNull final ClassicTypeSystemContext classicTypeSystemContext, @NotNull RigidTypeMarker type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof SimpleType) {
                final TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) type).buildSubstitutor();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* JADX INFO: renamed from: transformType */
                    public SimpleTypeMarker mo105130transformType(TypeCheckerState state, KotlinTypeMarker type2) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(type2, "type");
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        TypeSubstitutor typeSubstitutor = typeSubstitutorBuildSubstitutor;
                        Object objLowerBoundIfFlexible = classicTypeSystemContext2.lowerBoundIfFlexible(type2);
                        Intrinsics.checkNotNull(objLowerBoundIfFlexible, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                        KotlinType kotlinTypeSafeSubstitute = typeSubstitutor.safeSubstitute((KotlinType) objLowerBoundIfFlexible, Variance.INVARIANT);
                        Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                        SimpleTypeMarker simpleTypeMarkerAsRigidType = classicTypeSystemContext2.asRigidType((KotlinTypeMarker) kotlinTypeSafeSubstitute);
                        Intrinsics.checkNotNull(simpleTypeMarkerAsRigidType);
                        return simpleTypeMarkerAsRigidType;
                    }
                };
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + Reflection.getOrCreateKotlinClass(type.getClass())).toString());
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) receiver).getVariance();
                Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
                return TypeSystemContextKt.convertVariance(variance);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static CapturedTypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getConstructor();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, boolean z11) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof RigidTypeMarker) {
                return classicTypeSystemContext.withNullability((RigidTypeMarker) receiver, z11);
            }
            if (!(receiver instanceof FlexibleTypeMarker)) {
                throw new IllegalStateException("sealed");
            }
            FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) receiver;
            return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability((RigidTypeMarker) classicTypeSystemContext.lowerBound(flexibleTypeMarker), z11), classicTypeSystemContext.withNullability((RigidTypeMarker) classicTypeSystemContext.upperBound(flexibleTypeMarker), z11));
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    SimpleTypeMarker asRigidType(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    KotlinTypeMarker createFlexibleType(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(@NotNull RigidTypeMarker rigidTypeMarker);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isStarProjection(@NotNull TypeArgumentMarker typeArgumentMarker);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    TypeConstructorMarker typeConstructor(@NotNull RigidTypeMarker rigidTypeMarker);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker withNullability(@NotNull RigidTypeMarker rigidTypeMarker, boolean z11);
}
