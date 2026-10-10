package p852kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p002a0.C0005a;
import p002a0.C0006b;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: compiled from: overridingUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\noverridingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1634#2,3:85\n855#2,2:88\n*S KotlinDebug\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n*L\n40#1:85,3\n72#1:88,2\n*E\n"})
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetCreate = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) linkedList);
            final SmartSet smartSetCreate2 = SmartSet.Companion.create();
            Collection<C0005a> collectionExtractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(objFirst, linkedList, descriptorByHandle, new Function1(smartSetCreate2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$$Lambda$1
                private final SmartSet arg$0;

                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup$lambda$2(this.arg$0, obj);
                }

                {
                    this.arg$0 = smartSetCreate2;
                }
            });
            Intrinsics.checkNotNullExpressionValue(collectionExtractMembersOverridableInBothWays, "extractMembersOverridableInBothWays(...)");
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                Object objSingle = CollectionsKt.single(collectionExtractMembersOverridableInBothWays);
                Intrinsics.checkNotNullExpressionValue(objSingle, "single(...)");
                smartSetCreate.add(objSingle);
            } else {
                C0006b c0006b = (Object) OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, descriptorByHandle);
                CallableDescriptor callableDescriptorInvoke = descriptorByHandle.invoke(c0006b);
                for (C0005a c0005a : collectionExtractMembersOverridableInBothWays) {
                    Intrinsics.checkNotNull(c0005a);
                    if (!OverridingUtil.isMoreSpecific(callableDescriptorInvoke, descriptorByHandle.invoke(c0005a))) {
                        smartSetCreate2.add(c0005a);
                    }
                }
                if (!smartSetCreate2.isEmpty()) {
                    smartSetCreate.addAll(smartSetCreate2);
                }
                smartSetCreate.add(c0006b);
            }
        }
        return smartSetCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectMostSpecificInEachOverridableGroup$lambda$2(SmartSet smartSet, Object obj) {
        Intrinsics.checkNotNull(obj);
        smartSet.add(obj);
        return Unit.INSTANCE;
    }
}
