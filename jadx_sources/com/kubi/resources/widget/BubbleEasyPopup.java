package com.kubi.resources.widget;

import android.content.Context;
import android.view.View;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p666ul.C45261b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import qe0.C43724b;

/* JADX INFO: renamed from: com.kubi.resources.widget.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BubbleEasyPopup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J.\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/resources/widget/BubbleEasyPopup;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "initViews", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "popup", "setContentViewMinHeight", "showAtAnchorViewSupportRtl", "anchor", "vertGravity", "", "horizGravity", "x", "y", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class BubbleEasyPopup extends C43724b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleEasyPopup(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m55376n0(BubbleEasyPopup bubbleEasyPopup, View view, int i11, Ref.IntRef intRef, Ref.IntRef intRef2, int i12) {
        super.m96320e0(view, i11, intRef.element, intRef2.element, i12);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final void m55377l0(View view) {
        view.setMinimumHeight(view.getMeasuredHeight() + (view instanceof BubbleStyle ? (int) (((BubbleStyle) view).getArrowHeight() + 0.5f) : 0));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m55378m0(@NotNull final View anchor, final int i11, int i12, int i13, final int i14) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i12;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = i13;
        if (C45261b.m100050a(anchor)) {
            int i15 = intRef.element;
            if (i15 == 4) {
                intRef.element = 3;
                intRef2.element = -i13;
            } else if (i15 == 3) {
                intRef.element = 4;
                intRef2.element = -i13;
            }
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BubbleEasyPopup.m55376n0(this.f44921b, anchor, i11, intRef, intRef2, i14);
            }
        });
    }

    @Override // qe0.C43724b, qe0.AbstractC43723a
    /* JADX INFO: renamed from: i0 */
    public void mo25306H(@Nullable View view, @Nullable C43724b c43724b) {
        super.mo25306H(view, c43724b);
        if (view != null) {
            m55377l0(view);
        }
    }
}
