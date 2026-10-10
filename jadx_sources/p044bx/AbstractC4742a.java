package p044bx;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.blankj.utilcode.util.C5275i0;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bx.a */
/* JADX INFO: compiled from: AbsRoundViewPolicy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/resources/widget/round/policy/AbsRoundViewPolicy;", "Lcom/kubi/resources/widget/round/policy/IRoundViewPolicy;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "attrs", "", "attrIndex", "", "<init>", "(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;[II)V", "mCornerRadius", "", "getMCornerRadius", "()F", "setMCornerRadius", "(F)V", "mContainer", "getMContainer", "()Landroid/view/View;", "DEFAULT_CORNER_DP_SIZE", "initialize", "", "setCornerRadius", "cornerRadius", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC4742a implements InterfaceC4743b {

    /* JADX INFO: renamed from: a */
    public float f4770a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f4771b;

    /* JADX INFO: renamed from: c */
    public final float f4772c;

    public AbstractC4742a(@NotNull View view, @NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull int[] attrs, int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f4771b = view;
        this.f4772c = 4.0f;
        m4780g(context, attributeSet, attrs, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final View getF4771b() {
        return this.f4771b;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getF4770a() {
        return this.f4770a;
    }

    /* JADX INFO: renamed from: h */
    public final void m4781h(float f11) {
        this.f4770a = f11;
    }

    /* JADX INFO: renamed from: g */
    public final void m4780g(Context context, AttributeSet attributeSet, int[] iArr, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f4770a = typedArrayObtainStyledAttributes.getDimension(i11, C5275i0.m6236a(this.f4772c));
        typedArrayObtainStyledAttributes.recycle();
    }
}
