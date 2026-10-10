package com.kubi.home.deposit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import fj.C37521h;
import g00.InterfaceC37749a;
import java.util.Map;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: HomeDepositFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0007R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/home/deposit/HomeDepositFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/home/databinding/HomeFragmentDepositBinding;", "getBinding", "()Lcom/kubi/home/databinding/HomeFragmentDepositBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "alertNewGuide", "force", "", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeDepositFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeDepositFragment.kt\ncom/kubi/home/deposit/HomeDepositFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,76:1\n147#2,16:77\n*S KotlinDebug\n*F\n+ 1 HomeDepositFragment.kt\ncom/kubi/home/deposit/HomeDepositFragment\n*L\n29#1:77,16\n*E\n"})
public final class HomeDepositFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f25616U = C45681e.m100799e(this, new Function1<HomeDepositFragment, C37521h>() { // from class: com.kubi.home.deposit.HomeDepositFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37521h invoke(@NotNull HomeDepositFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37521h.m84502a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37521h, Unit>() { // from class: com.kubi.home.deposit.HomeDepositFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37521h it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37521h c37521h) {
            invoke(c37521h);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f25617V = "Depositpage";

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f25615X = {Reflection.property1(new PropertyReference1Impl(HomeDepositFragment.class, "binding", "getBinding()Lcom/kubi/home/databinding/HomeFragmentDepositBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f25614W = new Companion(null);

    /* JADX INFO: compiled from: HomeDepositFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/deposit/HomeDepositFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.deposit.HomeDepositFragment$onViewCreated$2 */
    /* JADX INFO: compiled from: HomeDepositFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.deposit.HomeDepositFragment$onViewCreated$2", m90122f = "HomeDepositFragment.kt", m90123i = {}, m90124l = {59}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C145332 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        public C145332(Continuation<? super C145332> continuation) {
            super(1, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return HomeDepositFragment.this.new C145332(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C145332) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.m90350b(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            HomeDepositFragment.this.m29109l3(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m29108o3(HomeDepositFragment homeDepositFragment) {
        homeDepositFragment.m29109l3(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m29107n3(final HomeDepositFragment homeDepositFragment) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.home.deposit.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeDepositFragment.m29108o3(this.f25632b);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF25617V() {
        return this.f25617V;
    }

    /* JADX INFO: renamed from: m3 */
    public final C37521h m29110m3() {
        return (C37521h) this.f25616U.getValue(this, f25615X[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.home_fragment_deposit, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DepositManager depositManager = DepositManager.f25628a;
        if (depositManager.m29127q()) {
            InterfaceC37749a.a.m85110e(C37304a.f82764a, null, 0L, 0L, null, null, null, 57, null);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        getTitleBar().setTitle(getString(R$string.home_emotion_add_funds));
        ImageView rightOneIcon = getTitleBar().getRightOneIcon();
        rightOneIcon.setImageResource(R$drawable.ic2_question_20);
        C27046k.m66701p(rightOneIcon, getColorRes(R$color.c_text));
        C27046k.m66710y(rightOneIcon, 1000L, new Function0() { // from class: com.kubi.home.deposit.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeDepositFragment.m29107n3(this.f25631b);
            }
        });
        C37521h c37521hM29110m3 = m29110m3();
        if (c37521hM29110m3 != null && (recyclerView = c37521hM29110m3.f83309b) != null) {
            recyclerView.setAdapter(new HomeDepositAdapter(depositManager.m29126i()));
        }
        MviExKt.m42519o(this, new C145332(null));
        C27023a.m66557d("Depositpage", "Depositpage", null, null, 12, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f25617V = str;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: l3 */
    public final void m29109l3(boolean z11) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            IAssetsCenterService.f16464a.get().mo15341f(supportFragmentManager, z11);
        }
    }
}
