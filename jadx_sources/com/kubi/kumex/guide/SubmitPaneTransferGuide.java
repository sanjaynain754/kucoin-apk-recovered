package com.kubi.kumex.guide;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.kumex.R$id;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.guideview.C22893a;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitPaneTransferGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/guide/SubmitPaneTransferGuide;", "Lcom/kubi/kumex/guide/BeginnerGuide;", "priority", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "runnable", "Ljava/lang/Runnable;", "<init>", "(ILandroid/view/View;Ljava/lang/Runnable;)V", "getPriority", "()I", "getView", "()Landroid/view/View;", "getRunnable", "()Ljava/lang/Runnable;", "showGuide", "", "forceNotifyTranslationY", "doShowGuide", "order", "target", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SubmitPaneTransferGuide extends BeginnerGuide {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f29130k = new Companion(null);

    /* JADX INFO: renamed from: h */
    public final int f29131h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final View f29132i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Runnable f29133j;

    /* JADX INFO: compiled from: SubmitPaneTransferGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/guide/SubmitPaneTransferGuide$Companion;", "", "<init>", "()V", "Key", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m33841y(View view, View view2) {
        int i11;
        int i12;
        Rect rectM54302b = C22893a.m54302b(view, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(view2, 0, 0);
        boolean z11 = view.getLayoutDirection() == 1;
        Rect rect = z11 ? new Rect(rectM54302b2.left, rectM54302b.top, rectM54302b.right, rectM54302b2.bottom) : new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right, rectM54302b2.bottom);
        if (z11) {
            i11 = rectM54302b.right;
            i12 = rectM54302b2.left;
        } else {
            i11 = rectM54302b2.right;
            i12 = rectM54302b.left;
        }
        BeginnerGuide.m33851j(this, rect, new TransferAssetsStep(i11 - i12, new Function0() { // from class: com.kubi.kumex.guide.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitPaneTransferGuide.m33842z(this.f29226b);
            }
        }), view2, null, 8, null);
    }

    public SubmitPaneTransferGuide(int i11, @NotNull View view, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29131h = i11;
        this.f29132i = view;
        this.f29133j = runnable;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m33836C(final View view, final SubmitPaneTransferGuide submitPaneTransferGuide, final View view2) {
        view.post(new Runnable() { // from class: com.kubi.kumex.guide.x0
            @Override // java.lang.Runnable
            public final void run() {
                SubmitPaneTransferGuide.m33837D(this.f29221b, view, view2);
            }
        });
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A, reason: from getter */
    public View getF29132i() {
        return this.f29132i;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF29131h() {
        return this.f29131h;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF29133j() {
        return this.f29133j;
    }

    /* JADX INFO: renamed from: D */
    public static final void m33837D(SubmitPaneTransferGuide submitPaneTransferGuide, View view, View view2) {
        submitPaneTransferGuide.m33841y(view, view2);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m33842z(SubmitPaneTransferGuide submitPaneTransferGuide) {
        submitPaneTransferGuide.m33856g();
        C43852m.m96591c(C17060n0.m36552b(), "TransferGuide", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: W1 */
    public void mo33798W1() {
        View viewFindViewById;
        Rect rect;
        View viewFindViewById2 = getF29132i().findViewById(R$id.availableLabel);
        if (viewFindViewById2 != null && (viewFindViewById = getF29132i().findViewById(R$id.availableValue)) != null) {
            Rect rectM54302b = C22893a.m54302b(viewFindViewById2, 0, 0);
            Rect rectM54302b2 = C22893a.m54302b(viewFindViewById, 0, 0);
            if (viewFindViewById2.getLayoutDirection() == 1) {
                rect = new Rect(rectM54302b2.left, rectM54302b.top, rectM54302b.right, rectM54302b2.bottom);
            } else {
                rect = new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right, rectM54302b2.bottom);
            }
            if (Intrinsics.areEqual(rect, getF29145c())) {
                return;
            }
            m33861n();
            m33864q(rect);
        }
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        final View viewFindViewById;
        final View viewFindViewById2;
        AppBarLayout.Behavior behaviorMo33799k;
        if (getF29147e() || (viewFindViewById = getF29132i().findViewById(R$id.availableLabel)) == null || (viewFindViewById2 = getF29132i().findViewById(R$id.availableValue)) == null || (behaviorMo33799k = mo33799k(getF29132i())) == null) {
            return;
        }
        m33857h("TransferAssetsGuide");
        m33865r(true);
        C43852m.m96595g(C17060n0.m36552b(), "TransferGuide", null, null, 12, null);
        Pair<Boolean, Integer> pairM33863p = m33863p(behaviorMo33799k);
        if (pairM33863p.getFirst().booleanValue()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(pairM33863p.getSecond().intValue(), 0);
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "ofInt(...)");
            m33855e(behaviorMo33799k, valueAnimatorOfInt, new Function0() { // from class: com.kubi.kumex.guide.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubmitPaneTransferGuide.m33836C(viewFindViewById, this, viewFindViewById2);
                }
            });
            return;
        }
        m33841y(viewFindViewById, viewFindViewById2);
    }
}
