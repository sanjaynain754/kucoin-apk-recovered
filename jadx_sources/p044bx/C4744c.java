package p044bx;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bx.c */
/* JADX INFO: compiled from: RoundView21Policy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017J(\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/resources/widget/round/policy/RoundView21Policy;", "Lcom/kubi/resources/widget/round/policy/AbsRoundViewPolicy;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "attrs", "", "attrIndex", "", "<init>", "(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;[II)V", "beforeDispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "afterDispatchDraw", ViewProps.ON_LAYOUT, "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "setCornerRadius", "cornerRadius", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4744c extends AbstractC4742a {

    /* JADX INFO: renamed from: bx.c$a */
    /* JADX INFO: compiled from: RoundView21Policy.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/resources/widget/round/policy/RoundView21Policy$afterDispatchDraw$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, C4744c.this.getF4771b().getWidth(), C4744c.this.getF4771b().getHeight(), C4744c.this.getF4770a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4744c(@NotNull View view, @NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull int[] attrs, int i11) {
        super(view, context, attributeSet, attrs, i11);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // p044bx.InterfaceC4743b
    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public void mo4782a(@Nullable Canvas canvas) {
        getF4771b().setOutlineProvider(new a());
    }

    @Override // p044bx.InterfaceC4743b
    @TargetApi(21)
    /* JADX INFO: renamed from: c */
    public void mo4784c(@Nullable Canvas canvas) {
        getF4771b().setClipToOutline(true);
    }

    @Override // p044bx.InterfaceC4743b
    /* JADX INFO: renamed from: d */
    public void mo4785d(float f11) {
        m4781h(f11);
    }

    @Override // p044bx.InterfaceC4743b
    /* JADX INFO: renamed from: b */
    public void mo4783b(int i11, int i12, int i13, int i14) {
    }
}
