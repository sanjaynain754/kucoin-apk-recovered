package com.kubi.operation.lib.widgets.learn;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.card.MaterialCardView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.api.HomeConst;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.entity.LearnVideoEntity;
import com.kubi.operation.lib.exception.OperationException;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.sdk.util.C24275u;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37764p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p213dw.InterfaceC36986b;
import p569qq.C43846g;
import p701vs.C45639p;
import p778xy.C46338a;
import p778xy.C46341d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: LearnWidget.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/learn/LearnWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/operation/lib/widgets/learn/LearnWidgetContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/operation/lib/widgets/learn/LearnWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/operation/lib/databinding/OperationWidgetLearnBinding;", "getBinding$OperationLib_googleRelease", "()Lcom/kubi/operation/lib/databinding/OperationWidgetLearnBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "fillViewData", "data", "Lcom/kubi/operation/lib/entity/LearnVideoEntity;", "displayShimmer", TIMPushProvider.f75062n, "", "openLearnVideo", "videoUrl", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLearnWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnWidget.kt\ncom/kubi/operation/lib/widgets/learn/LearnWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 OperationIssue.kt\ncom/kubi/operation/lib/exception/OperationIssueKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n147#2,16:125\n153#3,7:141\n93#4,4:148\n29#5:152\n45#6,2:153\n1#7:155\n*S KotlinDebug\n*F\n+ 1 LearnWidget.kt\ncom/kubi/operation/lib/widgets/learn/LearnWidget\n*L\n45#1:125,16\n62#1:141,7\n69#1:148,4\n116#1:152\n120#1:153,2\n*E\n"})
public final class LearnWidget extends SimpleStateCardV2<LearnWidgetContract$UIState> {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f36898Y = {Reflection.property1(new PropertyReference1Impl(LearnWidget.class, "binding", "getBinding$OperationLib_googleRelease()Lcom/kubi/operation/lib/databinding/OperationWidgetLearnBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f36899X = C45681e.m100799e(this, new Function1<LearnWidget, C45639p>() { // from class: com.kubi.operation.lib.widgets.learn.LearnWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45639p invoke(@NotNull LearnWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45639p.m100769a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45639p, Unit>() { // from class: com.kubi.operation.lib.widgets.learn.LearnWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45639p it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45639p c45639p) {
            invoke(c45639p);
            return Unit.INSTANCE;
        }
    });

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof CardDataEvent) {
            m43710q3(((CardDataEvent) singleEvent).getData());
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.operation_widget_learn;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<LearnWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(LearnWidgetVM.class);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m43709o3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.learn.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LearnWidget.m43706p3(this.f36902b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final void m43710q3(final LearnVideoEntity learnVideoEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.learn.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LearnWidget.m43707r3(this.f36904b, learnVideoEntity);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: t3 */
    public final C45639p m43711t3() {
        return (C45639p) this.f36899X.getValue(this, f36898Y[0]);
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m43706p3(LearnWidget learnWidget, boolean z11) {
        C45639p c45639pM43711t3 = learnWidget.m43711t3();
        if (c45639pM43711t3 == null) {
            return Unit.INSTANCE;
        }
        ViewGroup viewGroup = null;
        if (z11) {
            LinearLayoutCompat shimmerLearn = c45639pM43711t3.f102895d;
            Intrinsics.checkNotNullExpressionValue(shimmerLearn, "shimmerLearn");
            C27046k.m66685H(shimmerLearn);
            C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c45639pM43711t3.f102898g, c45639pM43711t3.f102899h}), false, 1, null);
            View v11 = c45639pM43711t3.f102900i;
            Intrinsics.checkNotNullExpressionValue(v11, "v3");
            InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(v11, Float.valueOf(12.0f));
            if (interfaceC36986bM54400e != null) {
                interfaceC36986bM54400e.mo54393a();
            }
        } else {
            LinearLayoutCompat shimmerLearn2 = c45639pM43711t3.f102895d;
            Intrinsics.checkNotNullExpressionValue(shimmerLearn2, "shimmerLearn");
            C27046k.m66700o(shimmerLearn2);
            LinearLayoutCompat shimmerLearn3 = c45639pM43711t3.f102895d;
            Intrinsics.checkNotNullExpressionValue(shimmerLearn3, "shimmerLearn");
            ViewParent parent = shimmerLearn3.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(shimmerLearn3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m43707r3(final LearnWidget learnWidget, final LearnVideoEntity learnVideoEntity) {
        C45639p c45639pM43711t3 = learnWidget.m43711t3();
        if (c45639pM43711t3 == null) {
            return Unit.INSTANCE;
        }
        learnWidget.m43709o3(false);
        if (learnVideoEntity == null) {
            MaterialCardView materialCardViewM100770b = c45639pM43711t3.getRoot();
            Intrinsics.checkNotNullExpressionValue(materialCardViewM100770b, "getRoot(...)");
            C27046k.m66700o(materialCardViewM100770b);
            return Unit.INSTANCE;
        }
        MaterialCardView materialCardViewM100770b2 = c45639pM43711t3.getRoot();
        Intrinsics.checkNotNullExpressionValue(materialCardViewM100770b2, "getRoot(...)");
        C27046k.m66685H(materialCardViewM100770b2);
        Group groupContent = c45639pM43711t3.f102893b;
        Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
        C27046k.m66685H(groupContent);
        c45639pM43711t3.f102897f.setText(C27041f.m66668h(learnVideoEntity.getTitle()));
        AppCompatImageView ivImage = c45639pM43711t3.f102894c;
        Intrinsics.checkNotNullExpressionValue(ivImage, "ivImage");
        C46341d c46341dM102151a = C46338a.m102151a(ivImage.getContext());
        Intrinsics.checkNotNullExpressionValue(c46341dM102151a, "with(...)");
        C24275u.m58535a(c46341dM102151a, learnVideoEntity.getImgUrl()).m6594E0(ivImage);
        MaterialCardView materialCardViewM100770b3 = c45639pM43711t3.getRoot();
        Intrinsics.checkNotNullExpressionValue(materialCardViewM100770b3, "getRoot(...)");
        C27046k.m66710y(materialCardViewM100770b3, 1000L, new Function0() { // from class: com.kubi.operation.lib.widgets.learn.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LearnWidget.m43708s3(learnVideoEntity, learnWidget);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m43708s3(LearnVideoEntity learnVideoEntity, LearnWidget learnWidget) throws JSONException {
        String materialUrl = learnVideoEntity.getMaterialUrl();
        if (materialUrl != null) {
            learnWidget.m43712u3(materialUrl);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "watchVideo", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new LearnWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        super.initView();
        C45639p c45639pM43711t3 = m43711t3();
        if (c45639pM43711t3 == null) {
            return;
        }
        Group groupContent = c45639pM43711t3.f102893b;
        Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
        C27046k.m66703r(groupContent);
        m43709o3(true);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(new LearnWidgetContract$UiIntent.LoadData(false, 1, null));
    }

    /* JADX INFO: renamed from: u3 */
    public final void m43712u3(String str) {
        if (str.length() == 0) {
            return;
        }
        if (HomeConst.f25513a.m28964d()) {
            InterfaceC37764p.a.m85187h(C37304a.f82764a, str, null, null, null, 14, null);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), "video/*");
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (Throwable th2) {
            C43846g.m96568c(new OperationException(th2, "LearnWidget", false, null, 8, null), null, 2, null);
            InterfaceC37764p.a.m85187h(C37304a.f82764a, str, null, null, null, 14, null);
        }
    }
}
