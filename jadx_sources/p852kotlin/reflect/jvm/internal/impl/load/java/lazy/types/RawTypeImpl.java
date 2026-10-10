package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.RawType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: RawType.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nRawType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1740#2,3:99\n1563#2:102\n1634#2,3:103\n*S KotlinDebug\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n*L\n80#1:99,3\n61#1:102\n61#1:103,3\n*E\n"})
public final class RawTypeImpl extends FlexibleType implements RawType {
    private RawTypeImpl(SimpleType simpleType, SimpleType simpleType2, boolean z11) {
        super(simpleType, simpleType2);
        if (z11) {
            return;
        }
        KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType, simpleType2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence render$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "(raw) " + it;
    }

    private static final boolean render$onlyOutDiffers(String str, String str2) {
        return Intrinsics.areEqual(str, StringsKt.removePrefix(str2, (CharSequence) "out ")) || Intrinsics.areEqual(str2, ProxyConfig.MATCH_ALL_SCHEMES);
    }

    private static final String render$replaceArgs(String str, String str2) {
        if (!StringsKt.contains$default((CharSequence) str, Typography.less, false, 2, (Object) null)) {
            return str;
        }
        return StringsKt.substringBefore$default(str, Typography.less, (String) null, 2, (Object) null) + Typography.less + str2 + Typography.greater + StringsKt.substringAfterLast$default(str, Typography.greater, (String) null, 2, (Object) null);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public RawTypeImpl makeNullableAsSpecified(boolean z11) {
        return new RawTypeImpl(getLowerBound().makeNullableAsSpecified(z11), getUpperBound().makeNullableAsSpecified(z11));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String render(@NotNull DescriptorRenderer renderer, @NotNull DescriptorRendererOptions options) {
        Pair pair;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        String strRenderType = renderer.renderType(getLowerBound());
        String strRenderType2 = renderer.renderType(getUpperBound());
        if (options.getDebugMode()) {
            return "raw (" + strRenderType + ".." + strRenderType2 + ')';
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return renderer.renderFlexibleType(strRenderType, strRenderType2, TypeUtilsKt.getBuiltIns(this));
        }
        List<String> listRender$renderArguments = render$renderArguments(renderer, getLowerBound());
        List<String> listRender$renderArguments2 = render$renderArguments(renderer, getUpperBound());
        String strJoinToString$default = CollectionsKt.joinToString$default(listRender$renderArguments, ", ", null, null, 0, null, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return RawTypeImpl.render$lambda$2((String) obj);
            }
        }, 30, null);
        List listZip = CollectionsKt.zip(listRender$renderArguments, listRender$renderArguments2);
        if (listZip != null && listZip.isEmpty()) {
            strRenderType2 = render$replaceArgs(strRenderType2, strJoinToString$default);
            break;
        }
        Iterator it = listZip.iterator();
        do {
            if (!it.hasNext()) {
                strRenderType2 = render$replaceArgs(strRenderType2, strJoinToString$default);
                break;
            }
            pair = (Pair) it.next();
        } while (render$onlyOutDiffers((String) pair.getFirst(), (String) pair.getSecond()));
        String strRender$replaceArgs = render$replaceArgs(strRenderType, strJoinToString$default);
        return Intrinsics.areEqual(strRender$replaceArgs, strRenderType2) ? strRender$replaceArgs : renderer.renderFlexibleType(strRender$replaceArgs, strRenderType2, TypeUtilsKt.getBuiltIns(this));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public RawTypeImpl replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new RawTypeImpl(getLowerBound().replaceAttributes(newAttributes), getUpperBound().replaceAttributes(newAttributes));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        this(lowerBound, upperBound, false);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    private static final List<String> render$renderArguments(DescriptorRenderer descriptorRenderer, KotlinType kotlinType) {
        List<TypeProjection> arguments = kotlinType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.renderTypeProjection((TypeProjection) it.next()));
        }
        return arrayList;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        return getLowerBound();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        ClassDescriptor classDescriptor;
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = getConstructor().mo105126getDeclarationDescriptor();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        Object[] objArr = 0;
        if (classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor != null) {
            MemberScope memberScope = classDescriptor.getMemberScope(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue(memberScope, "getMemberScope(...)");
            return memberScope;
        }
        throw new IllegalStateException(("Incorrect classifier: " + getConstructor().mo105126getDeclarationDescriptor()).toString());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public FlexibleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getLowerBound());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) getUpperBound());
        Intrinsics.checkNotNull(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((SimpleType) kotlinTypeRefineType, (SimpleType) kotlinTypeRefineType2, true);
    }
}
