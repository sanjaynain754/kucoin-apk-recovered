package p318hp;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.resources.guideview.C22896d;
import com.kubi.resources.guideview.InterfaceC22894b;
import com.kubi.resources.guideview.ViewOnKeyListenerC22895c;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.subjects.PublishSubject;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import p698vp.C45618h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import y70.C46392a;

/* JADX INFO: renamed from: hp.t */
/* JADX INFO: compiled from: MarginGuideHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006./0123B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u001e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J&\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u001e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u001e\u0010 \u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u001e\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u001e\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J.\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\f\u0010'\u001a\u00020\u0007*\u00020\u001eH\u0002J\u0014\u0010(\u001a\u00020)*\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u001d\u0010,\u001a\u00020\u0013*\u00020\u001e2\u000e\b\u0004\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0082\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00064"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginGuideHelper;", "", "<init>", "()V", "GUIDE_TARGET_VISIBLE_TOLERANCE_DP", "", "isGuide", "", "()Z", "setGuide", "(Z)V", "subject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getSubject", "()Lio/reactivex/subjects/PublishSubject;", "setSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "checkGuide", "", "fragment", "Lcom/kubi/margin/trade/BaseMarginFragment;", "onComplete", "Lkotlin/Function0;", "hideGuide", "Lcom/kubi/sdk/BaseFragment;", "showGuideOrder", "showStep1", "showGuideOfStep1", "target", "Landroid/view/View;", "showStep2", "showStep3", "showStep4", "showStep5", "showGuideWhenTargetVisible", "guide", "Lcom/kubi/resources/guideview/Guide;", "resetGuideState", "isFullyVisibleInWindow", "expand", "Landroid/graphics/Rect;", TypedValues.CycleType.S_WAVE_OFFSET, "", "doOnNextPreDraw", TUIConstants.TIMPush.NOTIFICATION.ACTION, "LeverStep1", "LeverStep2", "LeverStep3", "LeverStep4", "LeverStep5", "LeverGuideOrder", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginGuideHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginGuideHelper.kt\ncom/kubi/margin/helper/MarginGuideHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,497:1\n306#1,7:502\n323#1:509\n135#2,2:498\n135#2,2:500\n126#2,2:510\n126#2,2:512\n126#2,2:514\n126#2,2:516\n126#2,2:518\n126#2,2:520\n126#2,2:522\n126#2,2:524\n126#2,2:526\n126#2,2:528\n126#2,2:530\n*S KotlinDebug\n*F\n+ 1 MarginGuideHelper.kt\ncom/kubi/margin/helper/MarginGuideHelper\n*L\n260#1:502,7\n260#1:509\n43#1:498,2\n49#1:500,2\n78#1:510,2\n111#1:512,2\n112#1:514,2\n140#1:516,2\n141#1:518,2\n167#1:520,2\n168#1:522,2\n199#1:524,2\n200#1:526,2\n231#1:528,2\n232#1:530,2\n*E\n"})
public final class C38274t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38274t f85990a = new C38274t();

    /* JADX INFO: renamed from: b */
    public static boolean f85991b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static PublishSubject<Boolean> f85992c;

    /* JADX INFO: renamed from: hp.t$a */
    /* JADX INFO: compiled from: MarginGuideHelper.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginGuideHelper$LeverGuideOrder;", "Lcom/kubi/resources/guideview/Component;", "next", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "isRight", "", "noticeHeight", "", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "getFitPosition", "getYOffset", "getXOffset", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f85993a;

        /* JADX INFO: renamed from: b */
        public final boolean f85994b;

        /* JADX INFO: renamed from: c */
        public int f85995c;

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: c */
        public int mo18891c() {
            return 4;
        }

        public a(@NotNull Function0<Unit> next) {
            Intrinsics.checkNotNullParameter(next, "next");
            this.f85993a = next;
            this.f85994b = C27063n.m66764b("trade_panel_position", 1) == 1;
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m86371h(a aVar) {
            aVar.f85993a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m86372i(a aVar) {
            aVar.f85993a.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: b */
        public int mo18890b() {
            return -(this.f85995c + 36);
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return this.f85994b ? 48 : 16;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.bmargin_view_guide_step3, (ViewGroup) null);
            if ((!this.f85994b && !C5303w0.m6511a()) || (this.f85994b && C5303w0.m6511a())) {
                int i11 = R$id.topLayout;
                ViewGroup.LayoutParams layoutParams = viewInflate.findViewById(i11).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                int i12 = R$id.contentLayout;
                ViewGroup.LayoutParams layoutParams3 = viewInflate.findViewById(i12).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                int i13 = R$id.parent;
                layoutParams2.startToStart = i13;
                layoutParams2.endToEnd = -1;
                layoutParams4.startToStart = i13;
                layoutParams4.endToEnd = -1;
                viewInflate.findViewById(i11).setLayoutParams(layoutParams2);
                viewInflate.findViewById(i12).setLayoutParams(layoutParams4);
            }
            View viewFindViewById = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: hp.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.a.m86371h(this.f85988b);
                }
            }, 1, null);
            int i14 = R$id.nextDone;
            View viewFindViewById2 = viewInflate.findViewById(i14);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: hp.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.a.m86372i(this.f85989b);
                }
            }, 1, null);
            View viewFindViewById3 = viewInflate.findViewById(R$id.prev);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            ViewExtKt.m66577h(viewFindViewById3);
            View viewFindViewById4 = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            ViewExtKt.m66577h(viewFindViewById4);
            View viewFindViewById5 = viewInflate.findViewById(i14);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            ViewExtKt.m66594y(viewFindViewById5);
            View viewFindViewById6 = viewInflate.findViewById(R$id.tv3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            C27046k.m66703r(viewFindViewById6);
            this.f85995c = C5275i0.m6240e(C5275i0.m6237b(viewInflate.findViewById(R$id.contentLayout)));
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: hp.t$b */
    /* JADX INFO: compiled from: MarginGuideHelper.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginGuideHelper$LeverStep1;", "Lcom/kubi/resources/guideview/Component;", "skip", "Lkotlin/Function0;", "", "next", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "isRight", "", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f85996a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function0<Unit> f85997b;

        /* JADX INFO: renamed from: c */
        public final boolean f85998c;

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: b */
        public int mo18890b() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: c */
        public int mo18891c() {
            return 2;
        }

        public b(@NotNull Function0<Unit> skip, @NotNull Function0<Unit> next) {
            Intrinsics.checkNotNullParameter(skip, "skip");
            Intrinsics.checkNotNullParameter(next, "next");
            this.f85996a = skip;
            this.f85997b = next;
            this.f85998c = C27063n.m66764b("trade_panel_position", 1) == 1;
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m86375h(b bVar) {
            bVar.f85997b.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m86376i(b bVar) {
            bVar.f85996a.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return this.f85998c ? 48 : 16;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.bmargin_view_guide_step1, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: hp.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.b.m86375h(this.f86022b);
                }
            }, 1, null);
            View viewFindViewById2 = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: hp.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.b.m86376i(this.f86023b);
                }
            }, 1, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: hp.t$c */
    /* JADX INFO: compiled from: MarginGuideHelper.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginGuideHelper$LeverStep2;", "Lcom/kubi/resources/guideview/Component;", "skip", "Lkotlin/Function0;", "", "next", "prev", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f85999a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function0<Unit> f86000b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Function0<Unit> f86001c;

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: b */
        public int mo18890b() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: c */
        public int mo18891c() {
            return 4;
        }

        public c(@NotNull Function0<Unit> skip, @NotNull Function0<Unit> next, @NotNull Function0<Unit> prev) {
            Intrinsics.checkNotNullParameter(skip, "skip");
            Intrinsics.checkNotNullParameter(next, "next");
            Intrinsics.checkNotNullParameter(prev, "prev");
            this.f85999a = skip;
            this.f86000b = next;
            this.f86001c = prev;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m86380i(c cVar) {
            cVar.f86000b.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m86381j(c cVar) {
            cVar.f85999a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m86382k(c cVar) {
            cVar.f86001c.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return 48;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.bmargin_view_guide_step2, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: hp.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.c.m86380i(this.f86026b);
                }
            }, 1, null);
            View viewFindViewById2 = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: hp.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.c.m86381j(this.f86027b);
                }
            }, 1, null);
            View viewFindViewById3 = viewInflate.findViewById(R$id.prev);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: hp.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.c.m86382k(this.f86028b);
                }
            }, 1, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: hp.t$d */
    /* JADX INFO: compiled from: MarginGuideHelper.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginGuideHelper$LeverStep3;", "Lcom/kubi/resources/guideview/Component;", "skip", "Lkotlin/Function0;", "", "next", "prev", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "isRight", "", "noticeHeight", "", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "getFitPosition", "getYOffset", "getXOffset", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f86002a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function0<Unit> f86003b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Function0<Unit> f86004c;

        /* JADX INFO: renamed from: d */
        public final boolean f86005d;

        /* JADX INFO: renamed from: e */
        public int f86006e;

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: c */
        public int mo18891c() {
            return 4;
        }

        public d(@NotNull Function0<Unit> skip, @NotNull Function0<Unit> next, @NotNull Function0<Unit> prev) {
            Intrinsics.checkNotNullParameter(skip, "skip");
            Intrinsics.checkNotNullParameter(next, "next");
            Intrinsics.checkNotNullParameter(prev, "prev");
            this.f86002a = skip;
            this.f86003b = next;
            this.f86004c = prev;
            this.f86005d = C27063n.m66764b("trade_panel_position", 1) == 1;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m86386i(d dVar) {
            dVar.f86002a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m86387j(d dVar) {
            dVar.f86003b.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m86388k(d dVar) {
            dVar.f86004c.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: b */
        public int mo18890b() {
            return -(this.f86006e + 36);
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return this.f86005d ? 48 : 16;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.bmargin_view_guide_step3, (ViewGroup) null);
            if ((!this.f86005d && !C5303w0.m6511a()) || (this.f86005d && C5303w0.m6511a())) {
                int i11 = R$id.topLayout;
                ViewGroup.LayoutParams layoutParams = viewInflate.findViewById(i11).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                int i12 = R$id.contentLayout;
                ViewGroup.LayoutParams layoutParams3 = viewInflate.findViewById(i12).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                int i13 = R$id.parent;
                layoutParams2.leftToLeft = i13;
                layoutParams2.rightToRight = -1;
                layoutParams4.leftToLeft = i13;
                layoutParams4.rightToRight = -1;
                viewInflate.findViewById(i11).setLayoutParams(layoutParams2);
                viewInflate.findViewById(i12).setLayoutParams(layoutParams4);
            }
            View viewFindViewById = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: hp.z
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.d.m86386i(this.f86029b);
                }
            }, 1, null);
            View viewFindViewById2 = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: hp.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.d.m86387j(this.f85937b);
                }
            }, 1, null);
            View viewFindViewById3 = viewInflate.findViewById(R$id.prev);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: hp.b0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.d.m86388k(this.f85940b);
                }
            }, 1, null);
            this.f86006e = C5275i0.m6240e(C5275i0.m6237b(viewInflate.findViewById(R$id.contentLayout)));
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: hp.t$e */
    /* JADX INFO: compiled from: MarginGuideHelper.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginGuideHelper$LeverStep4;", "Lcom/kubi/resources/guideview/Component;", "skip", "Lkotlin/Function0;", "", "next", "prev", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "isRight", "", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f86007a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function0<Unit> f86008b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Function0<Unit> f86009c;

        /* JADX INFO: renamed from: d */
        public final boolean f86010d;

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: b */
        public int mo18890b() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: c */
        public int mo18891c() {
            return 2;
        }

        public e(@NotNull Function0<Unit> skip, @NotNull Function0<Unit> next, @NotNull Function0<Unit> prev) {
            Intrinsics.checkNotNullParameter(skip, "skip");
            Intrinsics.checkNotNullParameter(next, "next");
            Intrinsics.checkNotNullParameter(prev, "prev");
            this.f86007a = skip;
            this.f86008b = next;
            this.f86009c = prev;
            this.f86010d = C27063n.m66764b("trade_panel_position", 1) == 1;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m86392i(e eVar) {
            eVar.f86007a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m86393j(e eVar) {
            eVar.f86008b.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m86394k(e eVar) {
            eVar.f86009c.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return this.f86010d ? 48 : 16;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.bmargin_view_guide_step4, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: hp.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.e.m86392i(this.f85944b);
                }
            }, 1, null);
            View viewFindViewById2 = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: hp.d0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.e.m86393j(this.f85947b);
                }
            }, 1, null);
            View viewFindViewById3 = viewInflate.findViewById(R$id.prev);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: hp.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.e.m86394k(this.f85951b);
                }
            }, 1, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: hp.t$f */
    /* JADX INFO: compiled from: MarginGuideHelper.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginGuideHelper$LeverStep5;", "Lcom/kubi/resources/guideview/Component;", "next", "Lkotlin/Function0;", "", "prev", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class f implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f86011a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function0<Unit> f86012b;

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: b */
        public int mo18890b() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: c */
        public int mo18891c() {
            return 4;
        }

        public f(@NotNull Function0<Unit> next, @NotNull Function0<Unit> prev) {
            Intrinsics.checkNotNullParameter(next, "next");
            Intrinsics.checkNotNullParameter(prev, "prev");
            this.f86011a = next;
            this.f86012b = prev;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m86398i(f fVar) {
            fVar.f86011a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m86399j(f fVar) {
            fVar.f86011a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m86400k(f fVar) {
            fVar.f86012b.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return 48;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.bmargin_view_guide_step5, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: hp.f0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.f.m86398i(this.f85955b);
                }
            }, 1, null);
            View viewFindViewById2 = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: hp.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.f.m86399j(this.f85958b);
                }
            }, 1, null);
            View viewFindViewById3 = viewInflate.findViewById(R$id.prev);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: hp.h0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38274t.f.m86400k(this.f85962b);
                }
            }, 1, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: hp.t$g */
    /* JADX INFO: compiled from: MarginGuideHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, m90084d2 = {"com/kubi/margin/helper/MarginGuideHelper$doOnNextPreDraw$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginGuideHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginGuideHelper.kt\ncom/kubi/margin/helper/MarginGuideHelper$doOnNextPreDraw$1\n+ 2 MarginGuideHelper.kt\ncom/kubi/margin/helper/MarginGuideHelper\n*L\n1#1,497:1\n261#2,14:498\n*E\n"})
    public static final class g implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserver f86013b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f86014c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BaseMarginFragment f86015d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f86016e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Function0 f86017f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewOnKeyListenerC22895c f86018g;

        public g(ViewTreeObserver viewTreeObserver, View view, BaseMarginFragment baseMarginFragment, View view2, Function0 function0, ViewOnKeyListenerC22895c viewOnKeyListenerC22895c) {
            this.f86013b = viewTreeObserver;
            this.f86014c = view;
            this.f86015d = baseMarginFragment;
            this.f86016e = view2;
            this.f86017f = function0;
            this.f86018g = viewOnKeyListenerC22895c;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f86013b.isAlive()) {
                this.f86013b.removeOnPreDrawListener(this);
            } else {
                this.f86014c.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f86015d.isShowing()) {
                C38274t.f85990a.m86355B(this.f86016e);
                return true;
            }
            C38274t c38274t = C38274t.f85990a;
            if (c38274t.m86368z(this.f86016e)) {
                this.f86018g.m54315m(this.f86015d);
                return true;
            }
            c38274t.m86355B(this.f86016e);
            this.f86017f.invoke();
            c38274t.m86366x().onNext(Boolean.TRUE);
            return true;
        }
    }

    /* JADX INFO: renamed from: hp.t$h */
    /* JADX INFO: compiled from: MarginGuideHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/margin/helper/MarginGuideHelper$showStep1$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f86019b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BaseMarginFragment f86020c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0<Unit> f86021d;

        public h(View view, BaseMarginFragment baseMarginFragment, Function0<Unit> function0) {
            this.f86019b = view;
            this.f86020c = baseMarginFragment;
            this.f86021d = function0;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f86019b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C38274t.f85990a.m86356C(this.f86020c, this.f86019b, this.f86021d);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m86319D(View view, Function0 function0) {
        f85991b = false;
        Object tag = view.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = tag instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag : null;
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        C45618h c45618h = C45618h.f102740a;
        C46392a.m102328k(c45618h.m100724l(), true);
        C46392a.m102328k(c45618h.m100725m(), true);
        function0.invoke();
        f85992c.onNext(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m86321G(View view, Function0 function0) {
        f85991b = false;
        Object tag = view.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = tag instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag : null;
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        C46392a.m102328k(C45618h.f102740a.m100725m(), true);
        function0.invoke();
        f85992c.onNext(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m86322K(View view, Function0 function0) {
        f85991b = false;
        Object tag = view.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = tag instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag : null;
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        C45618h c45618h = C45618h.f102740a;
        C46392a.m102328k(c45618h.m100724l(), true);
        C46392a.m102328k(c45618h.m100725m(), true);
        function0.invoke();
        f85992c.onNext(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m86325O(View view, Function0 function0) {
        f85991b = false;
        Object tag = view.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = tag instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag : null;
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        C45618h c45618h = C45618h.f102740a;
        C46392a.m102328k(c45618h.m100724l(), true);
        C46392a.m102328k(c45618h.m100725m(), true);
        function0.invoke();
        f85992c.onNext(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m86328S(View view, Function0 function0) {
        f85991b = false;
        Object tag = view.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = tag instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag : null;
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        C45618h c45618h = C45618h.f102740a;
        C46392a.m102328k(c45618h.m100724l(), true);
        C46392a.m102328k(c45618h.m100725m(), true);
        function0.invoke();
        f85992c.onNext(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m86331W(View view, Function0 function0) {
        f85991b = false;
        Object tag = view.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = tag instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag : null;
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        C45618h c45618h = C45618h.f102740a;
        C46392a.m102328k(c45618h.m100724l(), true);
        C46392a.m102328k(c45618h.m100725m(), true);
        function0.invoke();
        f85992c.onNext(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m86355B(View view) {
        f85991b = false;
        view.setTag(null);
    }

    /* JADX INFO: renamed from: H */
    public final void m86358H(BaseMarginFragment baseMarginFragment, View view, ViewOnKeyListenerC22895c viewOnKeyListenerC22895c, Function0<Unit> function0) {
        viewOnKeyListenerC22895c.m54313k(false);
        if (!baseMarginFragment.isShowing()) {
            m86355B(view);
            return;
        }
        BaseMarginFragment.m39685t6(baseMarginFragment, 0, 1, null);
        if (view.isAttachedToWindow()) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new g(viewTreeObserver, view, baseMarginFragment, view, function0, viewOnKeyListenerC22895c));
        } else {
            if (!baseMarginFragment.isShowing()) {
                f85990a.m86355B(view);
                return;
            }
            C38274t c38274t = f85990a;
            if (c38274t.m86368z(view)) {
                viewOnKeyListenerC22895c.m54315m(baseMarginFragment);
                return;
            }
            c38274t.m86355B(view);
            function0.invoke();
            c38274t.m86366x().onNext(Boolean.TRUE);
        }
    }

    static {
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        f85992c = publishSubjectCreate;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m86352u(BaseMarginFragment baseMarginFragment, Function0 function0) {
        f85990a.m86359I(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m86353v(BaseMarginFragment baseMarginFragment, Function0 function0) {
        f85990a.m86357F(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m86354A() {
        return f85991b;
    }

    /* JADX INFO: renamed from: C */
    public final void m86356C(final BaseMarginFragment baseMarginFragment, final View view, final Function0<Unit> function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(view).m54319c(200).m54321e(16).m54326j(10).m54327k(10).m54322f(R$color.c_icon).m54323g(0).m54317a(new b(new Function0() { // from class: hp.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86319D(view, function0);
            }
        }, new Function0() { // from class: hp.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86320E(view, baseMarginFragment, function0);
            }
        })).m54320d(false).m54318b();
        view.setTag(viewOnKeyListenerC22895cM54318b);
        Intrinsics.checkNotNull(viewOnKeyListenerC22895cM54318b);
        m86358H(baseMarginFragment, view, viewOnKeyListenerC22895cM54318b, function0);
    }

    /* JADX INFO: renamed from: F */
    public final void m86357F(BaseMarginFragment baseMarginFragment, final Function0<Unit> function0) {
        final View viewFindViewById = baseMarginFragment.findViewById(R$id.rgToggle);
        if (viewFindViewById == null) {
            return;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(viewFindViewById).m54319c(200).m54321e(8).m54322f(R$color.c_icon).m54317a(new a(new Function0() { // from class: hp.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86321G(viewFindViewById, function0);
            }
        })).m54320d(false).m54318b();
        viewFindViewById.setTag(viewOnKeyListenerC22895cM54318b);
        Intrinsics.checkNotNull(viewOnKeyListenerC22895cM54318b);
        m86358H(baseMarginFragment, viewFindViewById, viewOnKeyListenerC22895cM54318b, function0);
    }

    /* JADX INFO: renamed from: I */
    public final void m86359I(BaseMarginFragment baseMarginFragment, Function0<Unit> function0) {
        View viewFindViewById = baseMarginFragment.findViewById(R$id.flQuote);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new h(viewFindViewById, baseMarginFragment, function0));
    }

    /* JADX INFO: renamed from: J */
    public final void m86360J(final BaseMarginFragment baseMarginFragment, final Function0<Unit> function0) {
        final View viewFindViewById = baseMarginFragment.findViewById(R$id.ivMore);
        if (viewFindViewById == null) {
            return;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(viewFindViewById).m54319c(200).m54321e(16).m54326j(10).m54327k(10).m54328l(10).m54325i(10).m54322f(R$color.c_icon).m54323g(0).m54317a(new c(new Function0() { // from class: hp.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86322K(viewFindViewById, function0);
            }
        }, new Function0() { // from class: hp.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86323L(viewFindViewById, baseMarginFragment, function0);
            }
        }, new Function0() { // from class: hp.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86324M(viewFindViewById, baseMarginFragment, function0);
            }
        })).m54320d(false).m54318b();
        viewFindViewById.setTag(viewOnKeyListenerC22895cM54318b);
        Intrinsics.checkNotNull(viewOnKeyListenerC22895cM54318b);
        m86358H(baseMarginFragment, viewFindViewById, viewOnKeyListenerC22895cM54318b, function0);
    }

    /* JADX INFO: renamed from: N */
    public final void m86361N(final BaseMarginFragment baseMarginFragment, final Function0<Unit> function0) {
        final View viewFindViewById = baseMarginFragment.findViewById(R$id.rgToggle);
        if (viewFindViewById == null) {
            return;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(viewFindViewById).m54319c(200).m54321e(8).m54322f(R$color.c_icon).m54317a(new d(new Function0() { // from class: hp.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86325O(viewFindViewById, function0);
            }
        }, new Function0() { // from class: hp.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86326P(viewFindViewById, baseMarginFragment, function0);
            }
        }, new Function0() { // from class: hp.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86327Q(viewFindViewById, baseMarginFragment, function0);
            }
        })).m54320d(false).m54318b();
        viewFindViewById.setTag(viewOnKeyListenerC22895cM54318b);
        Intrinsics.checkNotNull(viewOnKeyListenerC22895cM54318b);
        m86358H(baseMarginFragment, viewFindViewById, viewOnKeyListenerC22895cM54318b, function0);
    }

    /* JADX INFO: renamed from: R */
    public final void m86362R(final BaseMarginFragment baseMarginFragment, final Function0<Unit> function0) {
        final View viewFindViewById = baseMarginFragment.findViewById(R$id.submit_trade);
        if (viewFindViewById == null) {
            return;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(viewFindViewById).m54319c(200).m54321e(16).m54322f(R$color.c_icon).m54328l(3).m54325i(3).m54326j(10).m54327k(10).m54323g(0).m54317a(new e(new Function0() { // from class: hp.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86328S(viewFindViewById, function0);
            }
        }, new Function0() { // from class: hp.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86329T(viewFindViewById, baseMarginFragment, function0);
            }
        }, new Function0() { // from class: hp.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86330U(viewFindViewById, baseMarginFragment, function0);
            }
        })).m54320d(false).m54318b();
        viewFindViewById.setTag(viewOnKeyListenerC22895cM54318b);
        Intrinsics.checkNotNull(viewOnKeyListenerC22895cM54318b);
        m86358H(baseMarginFragment, viewFindViewById, viewOnKeyListenerC22895cM54318b, function0);
    }

    /* JADX INFO: renamed from: V */
    public final void m86363V(final BaseMarginFragment baseMarginFragment, final Function0<Unit> function0) {
        final View viewFindViewById = baseMarginFragment.findViewById(R$id.ivMore);
        if (viewFindViewById == null) {
            return;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(viewFindViewById).m54319c(200).m54321e(16).m54326j(10).m54327k(10).m54328l(10).m54325i(10).m54322f(R$color.c_icon).m54323g(0).m54317a(new f(new Function0() { // from class: hp.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86331W(viewFindViewById, function0);
            }
        }, new Function0() { // from class: hp.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38274t.m86332X(viewFindViewById, baseMarginFragment, function0);
            }
        })).m54320d(false).m54318b();
        viewFindViewById.setTag(viewOnKeyListenerC22895cM54318b);
        Intrinsics.checkNotNull(viewOnKeyListenerC22895cM54318b);
        m86358H(baseMarginFragment, viewFindViewById, viewOnKeyListenerC22895cM54318b, function0);
    }

    /* JADX INFO: renamed from: t */
    public final void m86364t(@NotNull final BaseMarginFragment fragment, @NotNull final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (!f85991b && C42579a.f94275a.m93347g().c()) {
            C45618h c45618h = C45618h.f102740a;
            if (!C46392a.m102322d(c45618h.m100724l(), false) && fragment.isShowing()) {
                f85991b = true;
                BaseMarginFragment.m39685t6(fragment, 0, 1, null);
                BaseFragment.runOnUiThread$default(fragment, new Function0() { // from class: hp.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C38274t.m86352u(fragment, onComplete);
                    }
                }, 1000L, null, 4, null);
            } else if (C46392a.m102322d(c45618h.m100725m(), false) || !fragment.isShowing()) {
                onComplete.invoke();
                f85992c.onNext(Boolean.TRUE);
            } else {
                f85991b = true;
                BaseMarginFragment.m39685t6(fragment, 0, 1, null);
                BaseFragment.runOnUiThread$default(fragment, new Function0() { // from class: hp.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C38274t.m86353v(fragment, onComplete);
                    }
                }, 1000L, null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final Rect m86365w(Rect rect, int i11) {
        Rect rect2 = new Rect(rect);
        int i12 = -i11;
        rect2.inset(i12, i12);
        return rect2;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final PublishSubject<Boolean> m86366x() {
        return f85992c;
    }

    /* JADX INFO: renamed from: y */
    public final void m86367y(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        View viewFindViewById = fragment.findViewById(R$id.flQuote);
        if (viewFindViewById == null) {
            return;
        }
        Object tag = viewFindViewById.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = tag instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag : null;
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        View viewFindViewById2 = fragment.findViewById(R$id.ivMore);
        if (viewFindViewById2 == null) {
            return;
        }
        Object tag2 = viewFindViewById2.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c2 = tag2 instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag2 : null;
        if (viewOnKeyListenerC22895c2 != null) {
            viewOnKeyListenerC22895c2.m54306d();
        }
        View viewFindViewById3 = fragment.findViewById(R$id.submit_trade);
        if (viewFindViewById3 == null) {
            return;
        }
        Object tag3 = viewFindViewById3.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c3 = tag3 instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag3 : null;
        if (viewOnKeyListenerC22895c3 != null) {
            viewOnKeyListenerC22895c3.m54306d();
        }
        View viewFindViewById4 = fragment.findViewById(R$id.rgToggle);
        if (viewFindViewById4 == null) {
            return;
        }
        Object tag4 = viewFindViewById4.getTag();
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c4 = tag4 instanceof ViewOnKeyListenerC22895c ? (ViewOnKeyListenerC22895c) tag4 : null;
        if (viewOnKeyListenerC22895c4 != null) {
            viewOnKeyListenerC22895c4.m54306d();
        }
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m86320E(View view, BaseMarginFragment baseMarginFragment, Function0 function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c;
        Object tag = view.getTag();
        if (tag instanceof ViewOnKeyListenerC22895c) {
            viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) tag;
        } else {
            viewOnKeyListenerC22895c = null;
        }
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        f85990a.m86360J(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m86323L(View view, BaseMarginFragment baseMarginFragment, Function0 function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c;
        Object tag = view.getTag();
        if (tag instanceof ViewOnKeyListenerC22895c) {
            viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) tag;
        } else {
            viewOnKeyListenerC22895c = null;
        }
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        f85990a.m86361N(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m86324M(View view, BaseMarginFragment baseMarginFragment, Function0 function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c;
        Object tag = view.getTag();
        if (tag instanceof ViewOnKeyListenerC22895c) {
            viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) tag;
        } else {
            viewOnKeyListenerC22895c = null;
        }
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        f85990a.m86359I(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m86326P(View view, BaseMarginFragment baseMarginFragment, Function0 function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c;
        Object tag = view.getTag();
        if (tag instanceof ViewOnKeyListenerC22895c) {
            viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) tag;
        } else {
            viewOnKeyListenerC22895c = null;
        }
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        f85990a.m86362R(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m86327Q(View view, BaseMarginFragment baseMarginFragment, Function0 function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c;
        Object tag = view.getTag();
        if (tag instanceof ViewOnKeyListenerC22895c) {
            viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) tag;
        } else {
            viewOnKeyListenerC22895c = null;
        }
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        f85990a.m86360J(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m86329T(View view, BaseMarginFragment baseMarginFragment, Function0 function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c;
        Object tag = view.getTag();
        if (tag instanceof ViewOnKeyListenerC22895c) {
            viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) tag;
        } else {
            viewOnKeyListenerC22895c = null;
        }
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        f85990a.m86363V(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m86330U(View view, BaseMarginFragment baseMarginFragment, Function0 function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c;
        Object tag = view.getTag();
        if (tag instanceof ViewOnKeyListenerC22895c) {
            viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) tag;
        } else {
            viewOnKeyListenerC22895c = null;
        }
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        f85990a.m86361N(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m86332X(View view, BaseMarginFragment baseMarginFragment, Function0 function0) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c;
        Object tag = view.getTag();
        if (tag instanceof ViewOnKeyListenerC22895c) {
            viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) tag;
        } else {
            viewOnKeyListenerC22895c = null;
        }
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
        f85990a.m86362R(baseMarginFragment, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m86368z(View view) {
        if (!view.isShown() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        Point point = new Point();
        if (!view.getGlobalVisibleRect(rect, point)) {
            return false;
        }
        int i11 = point.x;
        return m86365w(rect, C5275i0.m6236a(2.0f)).contains(new Rect(i11, point.y, MathKt.roundToInt(view.getWidth() * Math.abs(view.getScaleX())) + i11, point.y + MathKt.roundToInt(view.getHeight() * Math.abs(view.getScaleY()))));
    }
}
