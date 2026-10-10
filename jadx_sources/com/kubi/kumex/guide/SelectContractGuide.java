package com.kubi.kumex.guide;

import android.graphics.Rect;
import android.view.View;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.kumex.R$id;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.guideview.C22893a;
import com.kubi.resources.guideview.C22896d;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SelectContractGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kumex/guide/SelectContractGuide;", "Lcom/kubi/kumex/guide/BeginnerGuide;", "priority", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "runnable", "Ljava/lang/Runnable;", "<init>", "(ILandroid/view/View;Ljava/lang/Runnable;)V", "getPriority", "()I", "getView", "()Landroid/view/View;", "getRunnable", "()Ljava/lang/Runnable;", "showGuide", "", "generateRect", "Landroid/graphics/Rect;", "forceNotifyTranslationY", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SelectContractGuide extends BeginnerGuide {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f29121k = new Companion(null);

    /* JADX INFO: renamed from: h */
    public final int f29122h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final View f29123i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Runnable f29124j;

    /* JADX INFO: compiled from: SelectContractGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/guide/SelectContractGuide$Companion;", "", "<init>", "()V", "Key", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SelectContractGuide(int i11, @NotNull View view, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29122h = i11;
        this.f29123i = view;
        this.f29124j = runnable;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m33800A(C22896d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m54328l(-4);
        it.m54325i(-4);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF29122h() {
        return this.f29122h;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF29124j() {
        return this.f29124j;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public View getF29123i() {
        return this.f29123i;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m33803z(SelectContractGuide selectContractGuide) {
        selectContractGuide.m33856g();
        C43852m.m96591c(C17060n0.m36552b(), "ContractGuide", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: W1 */
    public void mo33798W1() {
        Rect rectM33804x = m33804x();
        if (Intrinsics.areEqual(getF29145c(), rectM33804x)) {
            return;
        }
        m33864q(rectM33804x);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        View viewFindViewById;
        Rect rectM33804x;
        if (getF29147e() || (viewFindViewById = getF29123i().findViewById(R$id.symbol)) == null || (rectM33804x = m33804x()) == null) {
            return;
        }
        m33865r(true);
        m33857h("SelectContractGuide");
        C43852m.m96595g(C17060n0.m36552b(), "ContractGuide", null, null, 12, null);
        m33858i(rectM33804x, new SelectContractStep(rectM33804x.right - rectM33804x.left, new Function0() { // from class: com.kubi.kumex.guide.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectContractGuide.m33803z(this.f29153b);
            }
        }), viewFindViewById, new Function1() { // from class: com.kubi.kumex.guide.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectContractGuide.m33800A((C22896d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final Rect m33804x() {
        View viewFindViewById;
        View viewFindViewById2 = getF29123i().findViewById(R$id.symbol);
        if (viewFindViewById2 == null || (viewFindViewById = getF29123i().findViewById(R$id.ivSymbol)) == null) {
            return null;
        }
        Rect rectM54302b = C22893a.m54302b(viewFindViewById2, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(viewFindViewById, 0, 0);
        if (C5303w0.m6511a()) {
            return new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right - viewFindViewById.getPaddingStart(), rectM54302b.bottom);
        }
        return new Rect(rectM54302b2.left + viewFindViewById.getPaddingStart(), rectM54302b.top, rectM54302b.right, rectM54302b.bottom);
    }
}
