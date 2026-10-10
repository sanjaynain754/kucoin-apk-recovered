package p575qw;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qw.a */
/* JADX INFO: compiled from: FrameLayoutExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"obtainStyledAttributes", "Landroid/content/res/TypedArray;", "Landroid/widget/FrameLayout;", "attrsSet", "Landroid/util/AttributeSet;", "attrsId", "", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43880a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TypedArray m96649a(@NotNull FrameLayout frameLayout, @Nullable AttributeSet attributeSet, @NotNull int[] attrsId) {
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        Intrinsics.checkNotNullParameter(attrsId, "attrsId");
        TypedArray typedArrayObtainStyledAttributes = frameLayout.getContext().getTheme().obtainStyledAttributes(attributeSet, attrsId, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        return typedArrayObtainStyledAttributes;
    }
}
