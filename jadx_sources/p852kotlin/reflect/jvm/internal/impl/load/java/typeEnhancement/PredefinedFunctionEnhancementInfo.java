package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedFunctionEnhancementInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n1563#2:348\n1634#2,3:349\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedFunctionEnhancementInfo\n*L\n41#1:348\n41#1:349,3\n*E\n"})
public final class PredefinedFunctionEnhancementInfo {

    @Nullable
    private final String errorsSinceLanguageVersion;

    @NotNull
    private final List<TypeEnhancementInfo> parametersInfo;

    @Nullable
    private final TypeEnhancementInfo returnTypeInfo;

    @Nullable
    private final PredefinedFunctionEnhancementInfo warningModeClone;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, 7, null);
    }

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> parametersInfo, @Nullable String str) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.returnTypeInfo = typeEnhancementInfo;
        this.parametersInfo = parametersInfo;
        this.errorsSinceLanguageVersion = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo typeEnhancementInfoCopyForWarnings = typeEnhancementInfo != null ? typeEnhancementInfo.copyForWarnings() : null;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parametersInfo, 10));
            for (TypeEnhancementInfo typeEnhancementInfo2 : parametersInfo) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.copyForWarnings() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(typeEnhancementInfoCopyForWarnings, arrayList, null);
        }
        this.warningModeClone = predefinedFunctionEnhancementInfo;
    }

    @Nullable
    public final String getErrorsSinceLanguageVersion() {
        return this.errorsSinceLanguageVersion;
    }

    @NotNull
    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.parametersInfo;
    }

    @Nullable
    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    @Nullable
    public final PredefinedFunctionEnhancementInfo getWarningModeClone() {
        return this.warningModeClone;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : typeEnhancementInfo, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? null : str);
    }
}
