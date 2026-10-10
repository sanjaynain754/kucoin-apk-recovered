package com.kubi.operation.lib.topic.market;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$mipmap;
import com.kubi.operation.lib.entity.CoinTopicEntity;
import com.kubi.operation.lib.entity.TopicScrollInfo;
import com.kubi.operation.lib.topic.CoinTopicState;
import com.kubi.operation.lib.topic.QueryTopic;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p701vs.C45625b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: CoinTopicFragment.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m90084d2 = {"Lcom/kubi/operation/lib/topic/market/CoinTopicFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/operation/lib/topic/TopicIntentState$CoinTopicState;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "Lcom/kubi/operation/lib/databinding/OperationFragmentCoinTopicBinding;", "getBinding", "()Lcom/kubi/operation/lib/databinding/OperationFragmentCoinTopicBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/operation/lib/topic/market/CoinTopicVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindState", "refreshView", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/lib/entity/CoinTopicEntity;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinTopicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinTopicFragment.kt\ncom/kubi/operation/lib/topic/market/CoinTopicFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n147#2,16:89\n1#3:105\n*S KotlinDebug\n*F\n+ 1 CoinTopicFragment.kt\ncom/kubi/operation/lib/topic/market/CoinTopicFragment\n*L\n41#1:89,16\n*E\n"})
public final class CoinTopicFragment extends SimpleStateFragment<CoinTopicState> {

    /* JADX INFO: renamed from: U */
    public boolean f36825U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f36826V = C45681e.m100799e(this, new Function1<CoinTopicFragment, C45625b>() { // from class: com.kubi.operation.lib.topic.market.CoinTopicFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45625b invoke(@NotNull CoinTopicFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45625b.m100735a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45625b, Unit>() { // from class: com.kubi.operation.lib.topic.market.CoinTopicFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45625b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45625b c45625b) {
            invoke(c45625b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f36824X = {Reflection.property1(new PropertyReference1Impl(CoinTopicFragment.class, "binding", "getBinding()Lcom/kubi/operation/lib/databinding/OperationFragmentCoinTopicBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f36823W = new Companion(null);

    /* JADX INFO: compiled from: CoinTopicFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/topic/market/CoinTopicFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/operation/lib/topic/market/CoinTopicFragment;", "coin", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CoinTopicFragment instance(@NotNull String coin) {
            Intrinsics.checkNotNullParameter(coin, "coin");
            CoinTopicFragment coinTopicFragment = new CoinTopicFragment();
            new C27051h().m66724h("coin", coin).m66718b(coinTopicFragment);
            return coinTopicFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.topic.market.CoinTopicFragment$bindState$2 */
    /* JADX INFO: compiled from: CoinTopicFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/operation/lib/entity/CoinTopicEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.topic.market.CoinTopicFragment$bindState$2", m90122f = "CoinTopicFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C195362 extends SuspendLambda implements Function2<CoinTopicEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CoinTopicEntity coinTopicEntity, Continuation<? super Unit> continuation) {
            return ((C195362) create(coinTopicEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C195362(Continuation<? super C195362> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C195362 c195362 = CoinTopicFragment.this.new C195362(continuation);
            c195362.L$0 = obj;
            return c195362;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoinTopicEntity coinTopicEntity = (CoinTopicEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoinTopicFragment.this.m43575q3(coinTopicEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m43572p3() {
        C12572a.m23695d("EVENT_CLOSE_ENTRANCE", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.operation_fragment_coin_topic;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF36825U() {
        return this.f36825U;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<CoinTopicVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(CoinTopicVM.class);
    }

    /* JADX INFO: renamed from: o3 */
    public final C45625b m43574o3() {
        return (C45625b) this.f36826V.getValue(this, f36824X[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C45625b c45625bM43574o3 = m43574o3();
        if (c45625bM43574o3 != null && (imageView = c45625bM43574o3.f102767c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.operation.lib.topic.market.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinTopicFragment.m43572p3();
                }
            }, 1, null);
        }
        Bundle arguments = getArguments();
        sendIntent(new QueryTopic(C27041f.m66668h(arguments != null ? RouteExKt.m56239b0(arguments, "coin") : null)));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q3 */
    public final void m43575q3(@Nullable final CoinTopicEntity coinTopicEntity) {
        LinearLayoutCompat linearLayoutCompat;
        MarqueeTextView marqueeTextView;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        MarqueeTextView marqueeTextView2;
        View view;
        TextView textView;
        ImageView imageView;
        if (coinTopicEntity == null || !coinTopicEntity.usable()) {
            C45625b c45625bM43574o3 = m43574o3();
            if (c45625bM43574o3 != null && (marqueeTextView = c45625bM43574o3.f102769e) != null) {
                marqueeTextView.m54677n();
            }
            C45625b c45625bM43574o4 = m43574o3();
            if (c45625bM43574o4 == null || (linearLayoutCompat = c45625bM43574o4.f102770f) == null) {
                return;
            }
            ViewExtKt.m66577h(linearLayoutCompat);
            return;
        }
        C45625b c45625bM43574o5 = m43574o3();
        if (c45625bM43574o5 != null && (imageView = c45625bM43574o5.f102768d) != null) {
            C19570t.m43666d(imageView, coinTopicEntity.getBackUrl(), Integer.valueOf(R$mipmap.operation_ic_placeholder_coin_hot));
        }
        C45625b c45625bM43574o6 = m43574o3();
        if (c45625bM43574o6 != null && (textView = c45625bM43574o6.f102771g) != null) {
            textView.setText(C27041f.m66668h(coinTopicEntity.getTopicTitle()));
        }
        List<TopicScrollInfo> scrollInfo = coinTopicEntity.getScrollInfo();
        if (scrollInfo == null) {
            scrollInfo = CollectionsKt.emptyList();
        }
        C45625b c45625bM43574o7 = m43574o3();
        if (c45625bM43574o7 != null && (view = c45625bM43574o7.f102772h) != null) {
            view.setVisibility(scrollInfo.isEmpty() ? 4 : 0);
        }
        C45625b c45625bM43574o8 = m43574o3();
        if (c45625bM43574o8 != null && (marqueeTextView2 = c45625bM43574o8.f102769e) != null) {
            marqueeTextView2.setContentList(scrollInfo);
        }
        C45625b c45625bM43574o9 = m43574o3();
        if (c45625bM43574o9 != null && (linearLayoutCompat3 = c45625bM43574o9.f102770f) != null) {
            C27046k.m66711z(linearLayoutCompat3, 0L, new Function0() { // from class: com.kubi.operation.lib.topic.market.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinTopicFragment.m43573r3(coinTopicEntity);
                }
            }, 1, null);
        }
        C45625b c45625bM43574o10 = m43574o3();
        if (c45625bM43574o10 != null && (linearLayoutCompat2 = c45625bM43574o10.f102770f) != null) {
            ViewExtKt.m66594y(linearLayoutCompat2);
        }
        C27023a.m66557d("B5candle", "hotspot", null, null, 12, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f36825U = z11;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m43573r3(CoinTopicEntity coinTopicEntity) {
        String topicUrl = coinTopicEntity.getTopicUrl();
        if (topicUrl != null) {
            Router.f46192a.m56184f(topicUrl).m4048k();
        }
        C27023a.m66555b("B5candle", "hotspot", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.operation.lib.topic.market.CoinTopicFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((CoinTopicState) obj).getData();
            }
        }, new C195362(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        MarqueeTextView marqueeTextView;
        C45625b c45625bM43574o3 = m43574o3();
        if (c45625bM43574o3 != null && (marqueeTextView = c45625bM43574o3.f102769e) != null) {
            marqueeTextView.m54677n();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        MarqueeTextView marqueeTextView;
        C45625b c45625bM43574o3 = m43574o3();
        if (c45625bM43574o3 != null && (marqueeTextView = c45625bM43574o3.f102769e) != null) {
            marqueeTextView.m54678o();
        }
    }
}
