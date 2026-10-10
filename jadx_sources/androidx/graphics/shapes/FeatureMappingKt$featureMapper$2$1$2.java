package androidx.graphics.shapes;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FeatureMapping.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "", "i", "", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FeatureMappingKt$featureMapper$2$1$2 extends Lambda implements Function1<Integer, CharSequence> {

    /* JADX INFO: renamed from: $N */
    final /* synthetic */ int f2747$N;
    final /* synthetic */ DoubleMapper $dm;

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
        return invoke(num.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureMappingKt$featureMapper$2$1$2(DoubleMapper doubleMapper, int i11) {
        super(1);
        this.$dm = doubleMapper;
        this.f2747$N = i11;
    }

    @NotNull
    public final CharSequence invoke(int i11) {
        return Format_jvmKt.toStringWithLessPrecision(this.$dm.mapBack(i11 / this.f2747$N));
    }
}
