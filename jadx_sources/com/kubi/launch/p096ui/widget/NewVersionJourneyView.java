package com.kubi.launch.p096ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.Player;
import androidx.media3.p022ui.PlayerView;
import com.kubi.advert.api.IAdvertService;
import com.kubi.app.facade.R$id;
import com.kubi.app.facade.R$layout;
import com.kubi.app.facade.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.helper.UserSelectorMode;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.user.config.UserInfo;
import com.kubi.user.helper.w;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import na.C42788a;
import na.C42790c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45682f;

/* JADX INFO: compiled from: NewVersionJourneyView.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001&\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J\u0016\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0083@¢\u0006\u0002\u0010$J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010\"\u001a\u000200H\u0002J\u000e\u00101\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u00102J\b\u00103\u001a\u00020\u001fH\u0002J\u0016\u00104\u001a\u00020\u001f*\u0002052\b\b\u0002\u00106\u001a\u00020*H\u0002J\u000e\u00107\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u00102R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\r\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u0010'¨\u00069"}, m90084d2 = {"Lcom/kubi/launch/ui/widget/NewVersionJourneyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/app/facade/databinding/LauncherNewVersionJourneyLayoutBinding;", "getBinding", "()Lcom/kubi/app/facade/databinding/LauncherNewVersionJourneyLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "inited", "Ljava/util/concurrent/atomic/AtomicBoolean;", "resultCompletable", "Lkotlinx/coroutines/CompletableDeferred;", "", "choreographer", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "startX", "", "index", "titles", "", "Lkotlin/jvm/internal/EnhancedNullability;", "onAttachedToWindow", "", "onDetachedFromWindow", "initPlayer", "activity", "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "frameCallback", "com/kubi/launch/ui/widget/NewVersionJourneyView$frameCallback$1", "Lcom/kubi/launch/ui/widget/NewVersionJourneyView$frameCallback$1;", "onProgress", "progress", "", "onSegmentChange", "segment", "onNextSegment", "onPrevSegment", "setButton", "Landroidx/appcompat/app/AppCompatActivity;", "updateTitle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAnimate", "fadeOut", "Landroid/view/View;", "delay", "clickResult", "Companion", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewVersionJourneyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewVersionJourneyView.kt\ncom/kubi/launch/ui/widget/NewVersionJourneyView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,371:1\n52#2:372\n80#2,7:373\n*S KotlinDebug\n*F\n+ 1 NewVersionJourneyView.kt\ncom/kubi/launch/ui/widget/NewVersionJourneyView\n*L\n74#1:372\n74#1:373,7\n*E\n"})
public final class NewVersionJourneyView extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f31823n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final AtomicBoolean f31824o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final InterfaceC41769w<String> f31825p;

    /* JADX INFO: renamed from: q */
    public final Choreographer f31826q;

    /* JADX INFO: renamed from: r */
    public int f31827r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final List<String> f31828s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final ChoreographerFrameCallbackC17380b f31829t;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ KProperty<Object>[] f31822v = {Reflection.property1(new PropertyReference1Impl(NewVersionJourneyView.class, "binding", "getBinding()Lcom/kubi/app/facade/databinding/LauncherNewVersionJourneyLayoutBinding;", 0))};

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Companion f31821u = new Companion(null);

    /* JADX INFO: compiled from: NewVersionJourneyView.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/launch/ui/widget/NewVersionJourneyView$Companion;", "", "<init>", "()V", "pageId", "", "pageIdSelect", "TAG", "SWIPE_THRESHOLD", "", "SEGMENT_DURATION", "", "SEGMENT_SIZE", "REWARD_SPM_ID", "ANIME_DURATION", "attach", "Lcom/kubi/launch/ui/widget/NewVersionJourneyView;", "viewStub", "Landroid/view/ViewStub;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final NewVersionJourneyView attach(@NotNull ViewStub viewStub) {
            Intrinsics.checkNotNullParameter(viewStub, "viewStub");
            viewStub.setLayoutResource(R$layout.launcher_new_version_journey_stub);
            View viewFindViewById = viewStub.inflate().findViewById(R$id.journeyView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            return (NewVersionJourneyView) viewFindViewById;
        }
    }

    /* JADX INFO: renamed from: com.kubi.launch.ui.widget.NewVersionJourneyView$b */
    /* JADX INFO: compiled from: NewVersionJourneyView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/launch/ui/widget/NewVersionJourneyView$frameCallback$1", "Landroid/view/Choreographer$FrameCallback;", "doFrame", "", "frameTimeNanos", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ChoreographerFrameCallbackC17380b implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC17380b() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            PlayerView playerView;
            Player player;
            C42790c binding = NewVersionJourneyView.this.getBinding();
            if (binding == null || (playerView = binding.f94797e) == null || (player = playerView.getPlayer()) == null) {
                return;
            }
            NewVersionJourneyView.this.m37524m(player.getCurrentPosition());
            NewVersionJourneyView.this.f31826q.postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.launch.ui.widget.NewVersionJourneyView$onAttachedToWindow$1 */
    /* JADX INFO: compiled from: NewVersionJourneyView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.launch.ui.widget.NewVersionJourneyView$onAttachedToWindow$1", m90122f = "NewVersionJourneyView.kt", m90123i = {}, m90124l = {121}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C173811 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppCompatActivity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C173811(AppCompatActivity appCompatActivity, Continuation<? super C173811> continuation) {
            super(2, continuation);
            this.$activity = appCompatActivity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NewVersionJourneyView.this.new C173811(this.$activity, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C173811) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                NewVersionJourneyView.this.setButton(this.$activity);
                NewVersionJourneyView newVersionJourneyView = NewVersionJourneyView.this;
                this.label = 1;
                if (newVersionJourneyView.m37526u(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVersionJourneyView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m37518l(NewVersionJourneyView newVersionJourneyView, View view, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        newVersionJourneyView.m37523k(view, j11);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m37520p(KcPrimaryButton kcPrimaryButton, String str, Ref.ObjectRef objectRef, NewVersionJourneyView newVersionJourneyView) {
        kcPrimaryButton.m55043o();
        C44128b.m97266j("NewVersionJourneyView", "onClick " + str + ", loginState=" + objectRef.element);
        IAdvertService.m14758l(IAdvertService.f15070a.get(), "VersionPage_Click_Signup", null, 2, null);
        C27023a.m66555b("B1newVersionPage", "exploreNow", null, null, 12, null);
        if (objectRef.element != UserInfo.LoginState.None) {
            newVersionJourneyView.f31825p.mo91370n(str);
        } else {
            newVersionJourneyView.findViewById(R$id.appModeView).setVisibility(newVersionJourneyView.getVisibility());
            C43852m.m96599k("B1UserTypeSelectPage", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.kubi.launch.ui.widget.NewVersionJourneyView$a */
    /* JADX INFO: compiled from: NewVersionJourneyView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C17379a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserInfo.LoginState.values().length];
            try {
                iArr[UserInfo.LoginState.Login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserInfo.LoginState.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVersionJourneyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C42790c getBinding() {
        return (C42790c) this.f31823n.getValue(this, f31822v[0]);
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m37521r(NewVersionJourneyView newVersionJourneyView, String str) {
        w.a.a("user_proficiency", "new_user");
        AppMode.INSTANCE.updateCurrentMode(AppMode.Lite);
        UserSelectorMode.INSTANCE.set(UserSelectorMode.Newer);
        C27023a.m66555b("B1UserTypeSelectPage", "newInCrypto", null, null, 12, null);
        newVersionJourneyView.f31825p.mo91370n(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m37522t(NewVersionJourneyView newVersionJourneyView, String str) {
        AppMode.INSTANCE.updateCurrentMode(AppMode.Pro);
        w.a.a("user_proficiency", "old_user");
        C27023a.m66555b("B1UserTypeSelectPage", "experiencedInCrypto", null, null, 12, null);
        newVersionJourneyView.f31825p.mo91370n(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final void m37523k(View view, long j11) {
        view.setTranslationY(C27040e.m66657a(8.0f));
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).translationY(0.0f).setStartDelay(j11).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
    }

    /* JADX INFO: renamed from: u */
    public final Object m37526u(Continuation<? super Unit> continuation) {
        if (UserInfo.a.d() != UserInfo.LoginState.None) {
            return Unit.INSTANCE;
        }
        Object objM91130f = C41713n0.m91130f(new NewVersionJourneyView$updateTitle$2(this, null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }

    public /* synthetic */ NewVersionJourneyView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: n */
    public static final void m37519n(NewVersionJourneyView newVersionJourneyView, int i11) {
        newVersionJourneyView.m37525o(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.kubi.user.config.UserInfo$LoginState] */
    public final void setButton(AppCompatActivity activity) {
        final KcPrimaryButton kcPrimaryButton;
        final String str;
        C42788a c42788a;
        LinearLayout linearLayout;
        C42788a c42788a2;
        LinearLayout linearLayout2;
        C42790c binding = getBinding();
        if (binding != null && (kcPrimaryButton = binding.f94795c) != null) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? D = UserInfo.a.d();
            objectRef.element = D;
            if (D == UserInfo.LoginState.None) {
                kcPrimaryButton.setText(activity.getString(R$string.new_version_guide_action_register));
            }
            int i11 = C17379a.$EnumSwitchMapping$0[((UserInfo.LoginState) objectRef.element).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    str = "user/register";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "home";
            }
            C27046k.m66710y(kcPrimaryButton, 600L, new Function0() { // from class: com.kubi.launch.ui.widget.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewVersionJourneyView.m37520p(kcPrimaryButton, str, objectRef, this);
                }
            });
            C42790c binding2 = getBinding();
            if (binding2 != null && (c42788a2 = binding2.f94794b) != null && (linearLayout2 = c42788a2.f94781f) != null) {
                C27046k.m66710y(linearLayout2, 600L, new Function0() { // from class: com.kubi.launch.ui.widget.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewVersionJourneyView.m37521r(this.f31843b, str);
                    }
                });
            }
            C42790c binding3 = getBinding();
            if (binding3 != null && (c42788a = binding3.f94794b) != null && (linearLayout = c42788a.f94782g) != null) {
                C27046k.m66710y(linearLayout, 600L, new Function0() { // from class: com.kubi.launch.ui.widget.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewVersionJourneyView.m37522t(this.f31845b, str);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m37524m(long j11) {
        C42790c binding = getBinding();
        if (binding != null) {
            binding.f94798f.setProgress(j11);
            final int i11 = (int) (j11 / 4000);
            if (i11 != this.f31827r && i11 < 4) {
                this.f31827r = i11;
                post(new Runnable() { // from class: com.kubi.launch.ui.widget.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        NewVersionJourneyView.m37519n(this.f31837b, i11);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m37525o(int i11) {
        C42790c binding = getBinding();
        if (binding != null) {
            binding.f94799g.setText(this.f31828s.get(i11));
            BaseTextView title = binding.f94799g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            m37518l(this, title, 0L, 1, null);
            if (isRtl() && i11 == 3) {
                BaseTextView title2 = binding.f94799g;
                Intrinsics.checkNotNullExpressionValue(title2, "title");
                C24256n1.m58513c(title2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AppCompatActivity appCompatActivity;
        super.onAttachedToWindow();
        if (!this.f31824o.getAndSet(true)) {
            Context context = getContext();
            if (context instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) context;
            } else {
                appCompatActivity = null;
            }
            if (appCompatActivity != null) {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(appCompatActivity), null, null, new C173811(appCompatActivity, null), 3, null);
                C43852m.m96599k("B1newVersionPage", null, 2, null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVersionJourneyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31823n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C42790c>() { // from class: com.kubi.launch.ui.widget.NewVersionJourneyView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C42790c invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C42790c.m93779a(C45682f.m100800a(viewGroup));
            }
        });
        this.f31824o = new AtomicBoolean(false);
        this.f31825p = C41777y.m91388c(null, 1, null);
        this.f31826q = Choreographer.getInstance();
        this.f31827r = -1;
        this.f31828s = CollectionsKt.mutableListOf(context.getString(R$string.new_version_guide_title_one), context.getString(R$string.new_version_guide_title_two), context.getString(R$string.new_version_guide_title_three), context.getString(R$string.new_version_guide_title_four_default));
        LayoutInflater.from(context).inflate(R$layout.launcher_new_version_journey_layout, (ViewGroup) this, true);
        this.f31829t = new ChoreographerFrameCallbackC17380b();
    }
}
