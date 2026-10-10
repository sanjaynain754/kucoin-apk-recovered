package com.kubi.quotefacade.widgets.rank;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import bv.C4667f1;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.kucoin.home.p090v2.cards.ICardV2;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.rank.RankFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: RankWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/rank/RankWidget;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "<init>", "()V", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/WidgetHomeRankBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/WidgetHomeRankBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "rankingFragment", "Landroidx/fragment/app/Fragment;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onMoveStart", "onMoveStop", "onEnterDragMode", "onExitDragMode", "setUserVisibleHint", "isVisibleToUser", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankWidget.kt\ncom/kubi/quotefacade/widgets/rank/RankWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,61:1\n147#2,16:62\n*S KotlinDebug\n*F\n+ 1 RankWidget.kt\ncom/kubi/quotefacade/widgets/rank/RankWidget\n*L\n24#1:62,16\n*E\n"})
public final class RankWidget extends BaseCardV2 {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f42878X = {Reflection.property1(new PropertyReference1Impl(RankWidget.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/WidgetHomeRankBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f42879V = C45681e.m100799e(this, new Function1<RankWidget, C4667f1>() { // from class: com.kubi.quotefacade.widgets.rank.RankWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4667f1 invoke(@NotNull RankWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4667f1.m4646a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4667f1, Unit>() { // from class: com.kubi.quotefacade.widgets.rank.RankWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4667f1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4667f1 c4667f1) {
            invoke(c4667f1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Fragment f42880W = RankFragment.Companion.instance$default(RankFragment.f42397b0, "HOMEPAGE", null, null, 6, null);

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.widget_home_rank;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C27032f.m66625p(this, R$id.rankingContainer, this.f42880W, null, 4, null);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: P */
    public void mo31093P() {
        ICardV2 iCardV2;
        super.mo31093P();
        ActivityResultCaller activityResultCaller = this.f42880W;
        if (activityResultCaller instanceof ICardV2) {
            iCardV2 = (ICardV2) activityResultCaller;
        } else {
            iCardV2 = null;
        }
        if (iCardV2 != null) {
            iCardV2.mo31093P();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: Q */
    public void mo31094Q() {
        ICardV2 iCardV2;
        super.mo31094Q();
        ActivityResultCaller activityResultCaller = this.f42880W;
        if (activityResultCaller instanceof ICardV2) {
            iCardV2 = (ICardV2) activityResultCaller;
        } else {
            iCardV2 = null;
        }
        if (iCardV2 != null) {
            iCardV2.mo31094Q();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: k0 */
    public void mo30080k0() {
        ICardV2 iCardV2;
        super.mo30080k0();
        ActivityResultCaller activityResultCaller = this.f42880W;
        if (activityResultCaller instanceof ICardV2) {
            iCardV2 = (ICardV2) activityResultCaller;
        } else {
            iCardV2 = null;
        }
        if (iCardV2 != null) {
            iCardV2.mo30080k0();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: r0 */
    public void mo30082r0() {
        ICardV2 iCardV2;
        super.mo30082r0();
        ActivityResultCaller activityResultCaller = this.f42880W;
        if (activityResultCaller instanceof ICardV2) {
            iCardV2 = (ICardV2) activityResultCaller;
        } else {
            iCardV2 = null;
        }
        if (iCardV2 != null) {
            iCardV2.mo30082r0();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.f42880W.setUserVisibleHint(isVisibleToUser);
    }
}
