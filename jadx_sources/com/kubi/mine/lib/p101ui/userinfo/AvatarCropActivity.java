package com.kubi.mine.lib.p101ui.userinfo;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.mine.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import gq.C37980a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: AvatarCropActivity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/AvatarCropActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/ActivityAvatarCropBinding;", "getBinding", "()Lcom/kubi/mine/databinding/ActivityAvatarCropBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initCropImageView", "initButtons", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAvatarCropActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarCropActivity.kt\ncom/kubi/mine/lib/ui/userinfo/AvatarCropActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n*L\n1#1,67:1\n45#2,19:68\n*S KotlinDebug\n*F\n+ 1 AvatarCropActivity.kt\ncom/kubi/mine/lib/ui/userinfo/AvatarCropActivity\n*L\n23#1:68,19\n*E\n"})
public final class AvatarCropActivity extends BaseActivity {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f35369i = C45678b.m100788b(this, new Function1<C37980a, Unit>() { // from class: com.kubi.mine.lib.ui.userinfo.AvatarCropActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C37980a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37980a c37980a) {
            invoke(c37980a);
            return Unit.INSTANCE;
        }
    }, new Function1<AvatarCropActivity, C37980a>() { // from class: com.kubi.mine.lib.ui.userinfo.AvatarCropActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37980a invoke(@NotNull AvatarCropActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C37980a.m85835a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f35368k = {Reflection.property1(new PropertyReference1Impl(AvatarCropActivity.class, "binding", "getBinding()Lcom/kubi/mine/databinding/ActivityAvatarCropBinding;", 0))};

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f35367j = new Companion(null);

    /* JADX INFO: compiled from: AvatarCropActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/AvatarCropActivity$Companion;", "", "<init>", "()V", "SELECT_IMAGE_PATH", "", "CROPPED_IMAGE_PATH", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m42282Y(AvatarCropActivity avatarCropActivity, View view) {
        avatarCropActivity.setResult(0);
        avatarCropActivity.finish();
    }

    /* JADX INFO: renamed from: W */
    public final C37980a m42284W() {
        return (C37980a) this.f35369i.getValue(this, f35368k[0]);
    }

    /* JADX INFO: renamed from: Z */
    public static final void m42283Z(AvatarCropActivity avatarCropActivity, View view) {
        LifecycleOwnerKt.getLifecycleScope(avatarCropActivity).launchWhenResumed(new AvatarCropActivity$initButtons$2$1(avatarCropActivity, null));
    }

    /* JADX INFO: renamed from: X */
    public final void m42285X() {
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView;
        C37980a c37980aM42284W = m42284W();
        if (c37980aM42284W != null && (baseTextView = c37980aM42284W.f85409b) != null) {
            baseTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.mine.lib.ui.userinfo.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AvatarCropActivity.m42282Y(this.f35380b, view);
                }
            });
        }
        C37980a c37980aM42284W2 = m42284W();
        if (c37980aM42284W2 != null && (kcPrimaryButton = c37980aM42284W2.f85410c) != null) {
            kcPrimaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.mine.lib.ui.userinfo.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AvatarCropActivity.m42283Z(this.f35381b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m42286a0() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new AvatarCropActivity$initCropImageView$1(this, null));
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_avatar_crop);
        m42286a0();
        m42285X();
    }
}
