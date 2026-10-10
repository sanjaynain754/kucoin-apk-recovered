package com.kubi.copytrading;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.copytrading.futures.FutureCopyTradingConfig;
import com.kubi.resources.guideview.C22896d;
import com.kubi.resources.guideview.InterfaceC22894b;
import com.kubi.resources.guideview.ViewOnKeyListenerC22895c;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.copytrading.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LeadTradingGuideHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/copytrading/LeadTradingGuideHelper;", "", "<init>", "()V", "checkGuideInTrading", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "showGuideOfStep2", "showGuideOfStep3", "showGuideOfStep4", "LeverStep1", "LeverStep2", "LeverStep3", "LeverStep4", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LeadTradingGuideHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LeadTradingGuideHelper f19949a = new LeadTradingGuideHelper();

    /* JADX INFO: renamed from: com.kubi.copytrading.r$a */
    /* JADX INFO: compiled from: LeadTradingGuideHelper.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/copytrading/LeadTradingGuideHelper$LeverStep2;", "Lcom/kubi/resources/guideview/Component;", "skip", "Lkotlin/Function0;", "", "next", "prev", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f19950a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function0<Unit> f19951b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Function0<Unit> f19952c;

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

        public a(@NotNull Function0<Unit> skip, @NotNull Function0<Unit> next, @NotNull Function0<Unit> prev) {
            Intrinsics.checkNotNullParameter(skip, "skip");
            Intrinsics.checkNotNullParameter(next, "next");
            Intrinsics.checkNotNullParameter(prev, "prev");
            this.f19950a = skip;
            this.f19951b = next;
            this.f19952c = prev;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m20937i(a aVar) {
            aVar.f19951b.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m20938j(a aVar) {
            aVar.f19950a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m20939k(a aVar) {
            aVar.f19952c.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return C27063n.m66764b("trade_panel_position", 1) == 1 ? 48 : 16;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.cprd_view_guide_step2, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.copytrading.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.a.m20937i(this.f19941b);
                }
            }, 1, null);
            View viewFindViewById2 = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.copytrading.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.a.m20938j(this.f19942b);
                }
            }, 1, null);
            View viewFindViewById3 = viewInflate.findViewById(R$id.prev);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: com.kubi.copytrading.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.a.m20939k(this.f19943b);
                }
            }, 1, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.r$b */
    /* JADX INFO: compiled from: LeadTradingGuideHelper.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/copytrading/LeadTradingGuideHelper$LeverStep3;", "Lcom/kubi/resources/guideview/Component;", "skip", "Lkotlin/Function0;", "", "next", "prev", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f19953a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function0<Unit> f19954b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Function0<Unit> f19955c;

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

        public b(@NotNull Function0<Unit> skip, @NotNull Function0<Unit> next, @NotNull Function0<Unit> prev) {
            Intrinsics.checkNotNullParameter(skip, "skip");
            Intrinsics.checkNotNullParameter(next, "next");
            Intrinsics.checkNotNullParameter(prev, "prev");
            this.f19953a = skip;
            this.f19954b = next;
            this.f19955c = prev;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m20943i(b bVar) {
            bVar.f19954b.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m20944j(b bVar) {
            bVar.f19953a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m20945k(b bVar) {
            bVar.f19955c.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return 32;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.cprd_view_guide_step3, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.copytrading.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.b.m20943i(this.f19958b);
                }
            }, 1, null);
            View viewFindViewById2 = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.copytrading.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.b.m20944j(this.f19960b);
                }
            }, 1, null);
            View viewFindViewById3 = viewInflate.findViewById(R$id.prev);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: com.kubi.copytrading.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.b.m20945k(this.f19961b);
                }
            }, 1, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.r$c */
    /* JADX INFO: compiled from: LeadTradingGuideHelper.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/copytrading/LeadTradingGuideHelper$LeverStep4;", "Lcom/kubi/resources/guideview/Component;", "skip", "Lkotlin/Function0;", "", "prev", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f19956a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function0<Unit> f19957b;

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

        public c(@NotNull Function0<Unit> skip, @NotNull Function0<Unit> prev) {
            Intrinsics.checkNotNullParameter(skip, "skip");
            Intrinsics.checkNotNullParameter(prev, "prev");
            this.f19956a = skip;
            this.f19957b = prev;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m20949i(c cVar) {
            cVar.f19956a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m20950j(c cVar) {
            cVar.f19956a.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m20951k(c cVar) {
            cVar.f19957b.invoke();
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return (C27063n.m66764b("trade_panel_position", 1) == 1 && C5303w0.m6511a()) ? -40 : 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return (C27063n.m66764b("trade_panel_position", 1) != 1 || C5303w0.m6511a()) ? 16 : 48;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        @SuppressLint({"SetTextI18n"})
        @NotNull
        /* JADX INFO: renamed from: e */
        public View mo18893e(@NotNull LayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.cprd_view_guide_step4, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R$id.next);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.copytrading.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.c.m20949i(this.f19962b);
                }
            }, 1, null);
            View viewFindViewById2 = viewInflate.findViewById(R$id.skip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.copytrading.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.c.m20950j(this.f19963b);
                }
            }, 1, null);
            View viewFindViewById3 = viewInflate.findViewById(R$id.prev);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: com.kubi.copytrading.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingGuideHelper.c.m20951k(this.f19985b);
                }
            }, 1, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m20921k(BaseFragment baseFragment) {
        f19949a.m20931l(baseFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final void m20930j(@NotNull final BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!CopyTradingConfig.f19710a.m20608y() || FutureCopyTradingConfig.f19902a.m20875j().getValue().getIsMasterAccount()) {
            return;
        }
        BaseFragment.runOnUiThread$default(fragment, new Function0() { // from class: com.kubi.copytrading.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20921k(fragment);
            }
        }, 1500L, null, 4, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m20931l(final BaseFragment baseFragment) {
        final View viewFindViewById = baseFragment.findViewById(R$id.buyAction);
        if (viewFindViewById == null) {
            viewFindViewById = baseFragment.findViewById(R$id.action);
        }
        if (!baseFragment.isShowing() || viewFindViewById == null) {
            return;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(viewFindViewById).m54319c(200).m54321e(16).m54326j(10).m54328l(10).m54325i(10).m54327k(10).m54322f(R$color.c_icon).m54323g(0).m54317a(new a(new Function0() { // from class: com.kubi.copytrading.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20922m(viewFindViewById);
            }
        }, new Function0() { // from class: com.kubi.copytrading.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20923n(viewFindViewById, baseFragment);
            }
        }, new Function0() { // from class: com.kubi.copytrading.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20924o(viewFindViewById);
            }
        })).m54320d(false).m54318b();
        viewFindViewById.setTag(viewOnKeyListenerC22895cM54318b);
        viewOnKeyListenerC22895cM54318b.m54313k(false);
        if (baseFragment.isShowing()) {
            viewOnKeyListenerC22895cM54318b.m54315m(baseFragment);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m20932p(final BaseFragment baseFragment) {
        final View viewFindViewById = baseFragment.findViewById(R$id.switchCopyLayout);
        if (!baseFragment.isShowing() || viewFindViewById == null) {
            return;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(viewFindViewById).m54319c(200).m54321e(16).m54322f(R$color.c_icon).m54323g(0).m54317a(new b(new Function0() { // from class: com.kubi.copytrading.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20925q(viewFindViewById);
            }
        }, new Function0() { // from class: com.kubi.copytrading.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20926r(viewFindViewById, baseFragment);
            }
        }, new Function0() { // from class: com.kubi.copytrading.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20927s(viewFindViewById, baseFragment);
            }
        })).m54320d(false).m54318b();
        viewFindViewById.setTag(viewOnKeyListenerC22895cM54318b);
        viewOnKeyListenerC22895cM54318b.m54313k(false);
        if (baseFragment.isShowing()) {
            viewOnKeyListenerC22895cM54318b.m54315m(baseFragment);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m20933t(final BaseFragment baseFragment) {
        final View viewFindViewById = baseFragment.findViewById(R$id.availableValue);
        if (!baseFragment.isShowing() || viewFindViewById == null) {
            return;
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(viewFindViewById).m54319c(200).m54321e(16).m54326j(C5303w0.m6511a() ? 10 : 50).m54327k(C5303w0.m6511a() ? 50 : 10).m54328l(10).m54325i(10).m54322f(R$color.c_icon).m54323g(0).m54317a(new c(new Function0() { // from class: com.kubi.copytrading.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20929v(viewFindViewById);
            }
        }, new Function0() { // from class: com.kubi.copytrading.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeadTradingGuideHelper.m20928u(viewFindViewById, baseFragment);
            }
        })).m54320d(false).m54318b();
        viewFindViewById.setTag(viewOnKeyListenerC22895cM54318b);
        viewOnKeyListenerC22895cM54318b.m54313k(false);
        if (baseFragment.isShowing()) {
            viewOnKeyListenerC22895cM54318b.m54315m(baseFragment);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m20922m(View view) {
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m20923n(View view, BaseFragment baseFragment) {
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
        f19949a.m20932p(baseFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m20924o(View view) {
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m20925q(View view) {
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m20926r(View view, BaseFragment baseFragment) {
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
        f19949a.m20933t(baseFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m20927s(View view, BaseFragment baseFragment) {
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
        f19949a.m20931l(baseFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m20928u(View view, BaseFragment baseFragment) {
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
        f19949a.m20932p(baseFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m20929v(View view) {
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
        return Unit.INSTANCE;
    }
}
