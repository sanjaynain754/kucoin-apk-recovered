package androidx.graphics.shapes;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FeatureMapping.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m90084d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FeatureMappingKt$featureMapper$1$1 extends Lambda implements Function1<Pair<? extends Float, ? extends Float>, CharSequence> {
    public static final FeatureMappingKt$featureMapper$1$1 INSTANCE = new FeatureMappingKt$featureMapper$1$1();

    public FeatureMappingKt$featureMapper$1$1() {
        super(1);
    }

    @NotNull
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(@NotNull Pair<Float, Float> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFirst().floatValue() + " -> " + it.getSecond().floatValue();
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends Float, ? extends Float> pair) {
        return invoke2((Pair<Float, Float>) pair);
    }
}
