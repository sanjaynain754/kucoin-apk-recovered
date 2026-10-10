package ax;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p044bx.C4744c;
import p044bx.InterfaceC4743b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ax.a */
/* JADX INFO: compiled from: RoundViewImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ2\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/resources/widget/round/abs/RoundViewImpl;", "Lcom/kubi/resources/widget/round/abs/IRoundView;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "attrs", "", "attrIndex", "", "<init>", "(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;[II)V", "generalRoundViewPolicy", "Lcom/kubi/resources/widget/round/policy/IRoundViewPolicy;", ViewProps.ON_LAYOUT, "", "changed", "", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "beforeDispatchDraw", "canvas", "Landroid/graphics/Canvas;", "afterDispatchDraw", "init", "setCornerRadius", "cornerRadius", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4399a {

    /* JADX INFO: renamed from: a */
    public InterfaceC4743b f3831a;

    public C4399a(@NotNull View view, @NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull int[] attrs, int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m4035c(view, context, attributeSet, attrs, i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m4033a(@Nullable Canvas canvas) {
        InterfaceC4743b interfaceC4743b = this.f3831a;
        if (interfaceC4743b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("generalRoundViewPolicy");
            interfaceC4743b = null;
        }
        interfaceC4743b.mo4782a(canvas);
    }

    /* JADX INFO: renamed from: b */
    public final void m4034b(@Nullable Canvas canvas) {
        InterfaceC4743b interfaceC4743b = this.f3831a;
        if (interfaceC4743b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("generalRoundViewPolicy");
            interfaceC4743b = null;
        }
        interfaceC4743b.mo4784c(canvas);
    }

    /* JADX INFO: renamed from: c */
    public final void m4035c(View view, Context context, AttributeSet attributeSet, int[] iArr, int i11) {
        this.f3831a = new C4744c(view, context, attributeSet, iArr, i11);
    }

    /* JADX INFO: renamed from: d */
    public void m4036d(boolean z11, int i11, int i12, int i13, int i14) {
        InterfaceC4743b interfaceC4743b = this.f3831a;
        if (interfaceC4743b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("generalRoundViewPolicy");
            interfaceC4743b = null;
        }
        interfaceC4743b.mo4783b(i11, i12, i13, i14);
    }

    /* JADX INFO: renamed from: e */
    public void m4037e(float f11) {
        InterfaceC4743b interfaceC4743b = this.f3831a;
        if (interfaceC4743b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("generalRoundViewPolicy");
            interfaceC4743b = null;
        }
        interfaceC4743b.mo4785d(f11);
    }
}
