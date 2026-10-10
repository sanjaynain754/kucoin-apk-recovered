package com.kubi.sdk.mode.p117ui;

import android.content.Intent;
import android.os.Bundle;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.R$anim;
import com.kubi.sdk.mode.R$layout;
import com.kubi.sdk.mode.SwitchConfig;
import com.kubi.sdk.mode.p117ui.ModeTransitionActivity;
import com.kubi.sdk.mode.widget.HomeMaskView;
import com.kubi.sdk.mode.widget.SwitchLayout;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p610rz.C44201b;
import p742wz.C45960a;
import p813yy.C46611a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import uz.C45337e;
import w00.C45678b;

/* JADX INFO: compiled from: ModeTransitionActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/mode/ui/ModeTransitionActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "binding", "Lcom/kubi/sdk/mode/databinding/ModeTransitionActivityBinding;", "getBinding", "()Lcom/kubi/sdk/mode/databinding/ModeTransitionActivityBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "appMode", "Lcom/kubi/sdk/mode/AppMode;", "maskView", "Lcom/kubi/sdk/mode/widget/HomeMaskView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initContentView", "onStart", "setSystemUI", "onDestroy", "finish", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModeTransitionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeTransitionActivity.kt\ncom/kubi/sdk/mode/ui/ModeTransitionActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n45#2,19:116\n1#3:135\n*S KotlinDebug\n*F\n+ 1 ModeTransitionActivity.kt\ncom/kubi/sdk/mode/ui/ModeTransitionActivity\n*L\n29#1:116,19\n*E\n"})
public final class ModeTransitionActivity extends BaseActivity {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f47137l;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InterfaceC43175a.a f47138m;

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ InterfaceC43175a.a f47139n;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f47140i = C45678b.m100788b(this, new Function1<C44201b, Unit>() { // from class: com.kubi.sdk.mode.ui.ModeTransitionActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C44201b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44201b c44201b) {
            invoke(c44201b);
            return Unit.INSTANCE;
        }
    }, new Function1<ModeTransitionActivity, C44201b>() { // from class: com.kubi.sdk.mode.ui.ModeTransitionActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44201b invoke(@NotNull ModeTransitionActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C44201b.m97424a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: j */
    @Nullable
    public AppMode f47141j;

    /* JADX INFO: renamed from: k */
    public HomeMaskView f47142k;

    /* JADX INFO: renamed from: a0 */
    public static final Unit m57272a0(final ModeTransitionActivity modeTransitionActivity, AppMode appMode) {
        EdgeToEdgeCompat.f48106a.m58265c(modeTransitionActivity);
        HomeMaskView maskView$default = HomeMaskView.Companion.setMaskView$default(HomeMaskView.f47143d, modeTransitionActivity, AppMode.Lite, false, 4, null);
        if (maskView$default == null) {
            modeTransitionActivity.finish();
            return Unit.INSTANCE;
        }
        modeTransitionActivity.f47142k = maskView$default;
        SwitchConfig switchConfig = new SwitchConfig(appMode, AppMode.Pro, false, false, false, 0L, 0L, 0L, 0L, null, false, 2044, null);
        C44128b.m97266j("LiteTag", "ModeTransitionActivity initContentView 显示布局");
        HomeMaskView homeMaskView = modeTransitionActivity.f47142k;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        final SwitchLayout sharedView = homeMaskView.getSharedView();
        if (sharedView != null) {
            sharedView.m57317y(switchConfig);
            if (switchConfig.fromEqualTo()) {
                C44128b.m97266j("LiteTag", "config fromEqualTo");
                sharedView.m57314K(new Function0() { // from class: vz.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModeTransitionActivity.m57273b0(this.f102980b);
                    }
                });
            } else {
                sharedView.m57313I(new Function0() { // from class: vz.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModeTransitionActivity.m57274c0(sharedView, modeTransitionActivity);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("ModeTransitionActivity.kt", ModeTransitionActivity.class);
        f47138m = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onCreate", "com.kubi.sdk.mode.ui.ModeTransitionActivity", "android.os.Bundle", "savedInstanceState", "", "void"), 0);
        f47139n = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onDestroy", "com.kubi.sdk.mode.ui.ModeTransitionActivity", "", "", "", "void"), 0);
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m57274c0(SwitchLayout switchLayout, final ModeTransitionActivity modeTransitionActivity) {
        switchLayout.m57314K(new Function0() { // from class: vz.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModeTransitionActivity.m57275d0(this.f102983b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public final void m57277Z(final AppMode appMode) {
        C27100x0.m66923d(new Function0() { // from class: vz.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModeTransitionActivity.m57272a0(this.f102977b, appMode);
            }
        });
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        C46611a.m102764b().m102770h(C36686b.m82123c(f47138m, this, this, savedInstanceState));
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        this.f47141j = AppMode.INSTANCE.fromString(RouteExKt.m56280w(intent, "from"));
        C44128b.m97266j("web3-anime", "toType=" + this.f47141j);
        C44128b.m97266j("LiteTag", "ModeTransitionActivity onCreate appMode=" + this.f47141j);
        if (this.f47141j == null) {
            finish();
            return;
        }
        setContentView(R$layout.mode_transition_activity);
        m57276e0();
        AppMode appMode = this.f47141j;
        if (appMode != null) {
            m57277Z(appMode);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        InterfaceC43175a interfaceC43175aM82122b = C36686b.m82122b(f47139n, this, this);
        try {
            super.onDestroy();
            C45960a.f103398a.m101388c();
        } finally {
            C46611a.m102764b().m102771i(interfaceC43175aM82122b);
        }
    }

    static {
        ajc$preClinit();
        f47137l = new KProperty[]{Reflection.property1(new PropertyReference1Impl(ModeTransitionActivity.class, "binding", "getBinding()Lcom/kubi/sdk/mode/databinding/ModeTransitionActivityBinding;", 0))};
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m57271Y(ModeTransitionActivity modeTransitionActivity) {
        modeTransitionActivity.getWindow().setEnterTransition(null);
        C44128b.m97266j("LiteTag", "ModeTransitionActivity finish 销毁钱包/Lite页面 appMode=" + modeTransitionActivity.f47141j);
        if (modeTransitionActivity.f47141j != AppMode.Pro) {
            C44128b.m97266j("LiteTag", "ModeTransitionActivity finish 销毁钱包/Lite页面");
            C45337e c45337e = C45337e.f101936a;
            c45337e.m100229c().mo100224a();
            c45337e.m100230d().mo66968a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m57273b0(ModeTransitionActivity modeTransitionActivity) {
        modeTransitionActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m57275d0(ModeTransitionActivity modeTransitionActivity) {
        modeTransitionActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R$anim.anim_fade_out_300);
        C27100x0.m66923d(new Function0() { // from class: vz.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModeTransitionActivity.m57271Y(this.f102979b);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m57276e0() {
    }
}
