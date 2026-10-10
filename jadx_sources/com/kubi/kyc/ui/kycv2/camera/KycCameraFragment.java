package com.kubi.kyc.ui.kycv2.camera;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentActivity;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.kyc.ui.kycv2.KycBridgeManager;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p205dn.C36882b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: KycCameraFragment.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/kyc/databinding/BusercenterActivityKycCameraBinding;", "getBinding", "()Lcom/kubi/kyc/databinding/BusercenterActivityKycCameraBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "ekycFlowid", "", "front_photo", "type", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "onStart", "onStop", "bindState", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraViewModel;", "getVmClass", "()Lkotlin/reflect/KClass;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycCameraFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycCameraFragment.kt\ncom/kubi/kyc/ui/kycv2/camera/KycCameraFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,156:1\n147#2,16:157\n158#3,2:173\n*S KotlinDebug\n*F\n+ 1 KycCameraFragment.kt\ncom/kubi/kyc/ui/kycv2/camera/KycCameraFragment\n*L\n30#1:157,16\n56#1:173,2\n*E\n"})
public final class KycCameraFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f31472Y = {Reflection.property1(new PropertyReference1Impl(KycCameraFragment.class, "binding", "getBinding()Lcom/kubi/kyc/databinding/BusercenterActivityKycCameraBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f31473U = C45681e.m100799e(this, new Function1<KycCameraFragment, C36882b>() { // from class: com.kubi.kyc.ui.kycv2.camera.KycCameraFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36882b invoke(@NotNull KycCameraFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36882b.m82633a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36882b, Unit>() { // from class: com.kubi.kyc.ui.kycv2.camera.KycCameraFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36882b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36882b c36882b) {
            invoke(c36882b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f31474V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public String f31475W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f31476X;

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.KycCameraFragment$bindState$2 */
    /* JADX INFO: compiled from: KycCameraFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/kyc/ui/kycv2/camera/CameraState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kyc.ui.kycv2.camera.KycCameraFragment$bindState$2", m90122f = "KycCameraFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C172002 extends SuspendLambda implements Function2<CameraState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CameraState cameraState, Continuation<? super Unit> continuation) {
            return ((C172002) create(cameraState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.KycCameraFragment$bindState$2$a */
        /* JADX INFO: compiled from: KycCameraFragment.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CameraState.values().length];
                try {
                    iArr[CameraState.NOT_READY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CameraState.READY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C172002(Continuation<? super C172002> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C172002 c172002 = KycCameraFragment.this.new C172002(continuation);
            c172002.L$0 = obj;
            return c172002;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C36882b c36882bM37223t3;
            PreviewView previewView;
            CameraState cameraState = (CameraState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i11 = a.$EnumSwitchMapping$0[cameraState.ordinal()];
            if (i11 == 1) {
                KycCameraFragment.this.sendIntent(KycCameraContract$UiIntent.CameraInit.INSTANCE);
            } else if (i11 == 2 && (c36882bM37223t3 = KycCameraFragment.this.m37223t3()) != null && (previewView = c36882bM37223t3.f81428e) != null) {
                final KycCameraFragment kycCameraFragment = KycCameraFragment.this;
                C17207b.m37258a(previewView, new Function0() { // from class: com.kubi.kyc.ui.kycv2.camera.f
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KycCameraFragment.C172002.m37225f(kycCameraFragment);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m37225f(KycCameraFragment kycCameraFragment) {
            PreviewView previewView;
            C36882b c36882bM37223t3 = kycCameraFragment.m37223t3();
            if (c36882bM37223t3 != null && (previewView = c36882bM37223t3.f81428e) != null) {
                Intrinsics.checkNotNull(kycCameraFragment, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                kycCameraFragment.sendIntent(new KycCameraContract$UiIntent.StartPreview(kycCameraFragment, previewView));
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.KycCameraFragment$bindState$4 */
    /* JADX INFO: compiled from: KycCameraFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kyc.ui.kycv2.camera.KycCameraFragment$bindState$4", m90122f = "KycCameraFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C172024 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C172024(Continuation<? super C172024> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C172024 c172024 = KycCameraFragment.this.new C172024(continuation);
            c172024.L$0 = obj;
            return c172024;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C172024) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KycCameraFragment kycCameraFragment;
            Context context;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (str != null && (context = (kycCameraFragment = KycCameraFragment.this).getContext()) != null) {
                if (TextUtils.isEmpty(kycCameraFragment.f31475W)) {
                    KycBridgeManager kycBridgeManager = KycBridgeManager.f31425a;
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    KycBridgeManager.m37173z(kycBridgeManager, (FragmentActivity) context, str, null, kycCameraFragment.f31476X, 4, null);
                } else {
                    KycBridgeManager kycBridgeManager2 = KycBridgeManager.f31425a;
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    kycBridgeManager2.m37190y((FragmentActivity) context, kycCameraFragment.f31475W, str, kycCameraFragment.f31476X);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m37220u3(KycCameraFragment kycCameraFragment, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C27041f.m66668h(kycCameraFragment.getF26355e0()), "Back", null, null, 12, null);
        if (TextUtils.isEmpty(kycCameraFragment.f31475W)) {
            KycBridgeManager.m37155O(KycBridgeManager.f31425a, "finish_get_photo", "failed_get_photo", "user_back", "kucoin_camera", ConstantsKt.FACE_CAPTURE_MODE_FRONT, kycCameraFragment.f31476X, null, 64, null);
        }
        FragmentActivity activity = kycCameraFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.busercenter_activity_kyc_camera;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends KycCameraViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(KycCameraViewModel.class);
    }

    /* JADX INFO: renamed from: t3 */
    public final C36882b m37223t3() {
        return (C36882b) this.f31473U.getValue(this, f31472Y[0]);
    }

    public KycCameraFragment() {
        setPageId("KucoinCamera");
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m37221v3(KycCameraFragment kycCameraFragment) {
        PreviewView previewView;
        ClipOutPathView clipOutPathView;
        C36882b c36882bM37223t3 = kycCameraFragment.m37223t3();
        if (c36882bM37223t3 != null && (previewView = c36882bM37223t3.f81428e) != null) {
            C36882b c36882bM37223t4 = kycCameraFragment.m37223t3();
            if (c36882bM37223t4 != null && (clipOutPathView = c36882bM37223t4.f81426c) != null) {
                kycCameraFragment.sendIntent(new KycCameraContract$UiIntent.ShutterButtonClick(previewView, clipOutPathView));
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m37222w3(KycCameraFragment kycCameraFragment) {
        C43852m.m96591c(C27041f.m66668h(kycCameraFragment.getF26355e0()), "TransCamera", null, null, 12, null);
        kycCameraFragment.sendIntent(KycCameraContract$UiIntent.SwitchCameraClick.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.kyc.ui.kycv2.camera.KycCameraFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCameraState();
            }
        }, new C172002(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.kyc.ui.kycv2.camera.KycCameraFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPath();
            }
        }, new C172024(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        ClipOutPathView clipOutPathView;
        ClipOutPathView clipOutPathView2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        ImageView imageView;
        ClipOutPathView clipOutPathView3;
        super.initView();
        if (C12573b.f21598a.m23696a()) {
            "activity_finish".length();
        }
        C12572a.m23692a(this, false, new KycCameraFragment$initView$$inlined$bindFlowEvent$1("activity_finish", null, this));
        if (TextUtils.equals(this.f31476X, "passport")) {
            C36882b c36882bM37223t3 = m37223t3();
            if (c36882bM37223t3 != null && (clipOutPathView3 = c36882bM37223t3.f81426c) != null) {
                String string = getString(R$string.kyc_take_photo_passport);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                clipOutPathView3.setPhotoText(string);
            }
        } else if (TextUtils.isEmpty(this.f31475W)) {
            C36882b c36882bM37223t4 = m37223t3();
            if (c36882bM37223t4 != null && (clipOutPathView2 = c36882bM37223t4.f81426c) != null) {
                String string2 = getString(R$string.kyc_caputure_front_tip);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                clipOutPathView2.setPhotoText(string2);
            }
        } else {
            C36882b c36882bM37223t5 = m37223t3();
            if (c36882bM37223t5 != null && (clipOutPathView = c36882bM37223t5.f81426c) != null) {
                String string3 = getString(R$string.kyc_caputure_back_tip);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                clipOutPathView.setPhotoText(string3);
            }
        }
        C36882b c36882bM37223t6 = m37223t3();
        if (c36882bM37223t6 != null && (imageView = c36882bM37223t6.f81427d) != null) {
            ViewExtKt.m66575f(imageView, new Function1() { // from class: com.kubi.kyc.ui.kycv2.camera.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycCameraFragment.m37220u3(this.f31489b, (View) obj);
                }
            });
        }
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setVisibility(8);
        }
        C36882b c36882bM37223t7 = m37223t3();
        if (c36882bM37223t7 != null && (appCompatImageView2 = c36882bM37223t7.f81425b) != null) {
            C27046k.m66710y(appCompatImageView2, 3000L, new Function0() { // from class: com.kubi.kyc.ui.kycv2.camera.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycCameraFragment.m37221v3(this.f31490b);
                }
            });
        }
        C36882b c36882bM37223t8 = m37223t3();
        if (c36882bM37223t8 != null && (appCompatImageView = c36882bM37223t8.f81431h) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.kyc.ui.kycv2.camera.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycCameraFragment.m37222w3(this.f31491b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String string3 = null;
        if (arguments != null) {
            string = arguments.getString("front_photo_path");
        } else {
            string = null;
        }
        this.f31475W = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("data");
        } else {
            string2 = null;
        }
        this.f31476X = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("data_1");
        }
        this.f31474V = string3;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        sendIntent(KycCameraContract$UiIntent.CameraInit.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        sendIntent(KycCameraContract$UiIntent.CameraReset.INSTANCE);
    }
}
