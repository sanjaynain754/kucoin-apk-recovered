package com.kubi.assets.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.round.widget.RoundTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44869t4;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SubscriptDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\fH\u0002J\b\u0010,\u001a\u00020\rH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001b\u0010\u001d¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/dialog/SubscriptDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/KucoinFragmentSubscriptDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinFragmentSubscriptDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onConfirmCallback", "Lkotlin/Function1;", "", "", "getOnConfirmCallback", "()Lkotlin/jvm/functions/Function1;", "setOnConfirmCallback", "(Lkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "Lkotlin/Lazy;", "chainName", "getChainName", "chainName$delegate", "isFrom", "", "()Ljava/lang/Boolean;", "isFrom$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initUI", "initListener", "type", "initData", "getEmailSet", "getSmsSet", "isBottomSheet", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptDialog.kt\ncom/kubi/assets/dialog/SubscriptDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,176:1\n143#2,20:177\n*S KotlinDebug\n*F\n+ 1 SubscriptDialog.kt\ncom/kubi/assets/dialog/SubscriptDialog\n*L\n25#1:177,20\n*E\n"})
public final class SubscriptDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function1<? super Integer, Unit> f16955r0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f16953w0 = {Reflection.property1(new PropertyReference1Impl(SubscriptDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinFragmentSubscriptDialogBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f16952v0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16954q0 = C45681e.m100799e(this, new Function1<SubscriptDialog, C44869t4>() { // from class: com.kubi.assets.dialog.SubscriptDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44869t4 invoke(@NotNull SubscriptDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44869t4.m99262a(fragment.requireView());
        }
    }, new Function1<C44869t4, Unit>() { // from class: com.kubi.assets.dialog.SubscriptDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44869t4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44869t4 c44869t4) {
            invoke(c44869t4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f16956s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubscriptDialog.m16035s4(this.f17224b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f16957t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubscriptDialog.m16034r4(this.f17226b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f16958u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubscriptDialog.m16025H4(this.f17018b);
        }
    });

    /* JADX INFO: compiled from: SubscriptDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/dialog/SubscriptDialog$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return false;
    }

    /* JADX INFO: renamed from: w4 */
    private final boolean m16036w4() {
        return AssetsDepend.f18689a.m19189j().M();
    }

    @Nullable
    /* JADX INFO: renamed from: G4 */
    public final Boolean m16038G4() {
        return (Boolean) this.f16958u0.getValue();
    }

    /* JADX INFO: renamed from: I4 */
    public final void m16039I4(@Nullable Function1<? super Integer, Unit> function1) {
        this.f16955r0 = function1;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.kucoin_fragment_subscript_dialog, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m16024F4();
        m16037y4();
    }

    /* JADX INFO: renamed from: t4 */
    public final C44869t4 m16040t4() {
        return (C44869t4) this.f16954q0.getValue(this, f16953w0[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: u4 */
    public final String m16041u4() {
        return (String) this.f16957t0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: v4 */
    public final String m16042v4() {
        return (String) this.f16956s0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m16043x4() {
        return AssetsDepend.f18689a.m19189j().R();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m16044z4(final int i11) {
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i11;
        C44869t4 c44869t4M16040t4 = m16040t4();
        if (c44869t4M16040t4 != null && (constraintLayout2 = c44869t4M16040t4.f100889c) != null) {
            C27046k.m66711z(constraintLayout2, 0L, new Function0() { // from class: com.kubi.assets.dialog.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptDialog.m16019A4(this.f17210b, intRef);
                }
            }, 1, null);
        }
        C44869t4 c44869t4M16040t5 = m16040t4();
        if (c44869t4M16040t5 != null && (constraintLayout = c44869t4M16040t5.f100888b) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.assets.dialog.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptDialog.m16020B4(this.f17213b, intRef);
                }
            }, 1, null);
        }
        C44869t4 c44869t4M16040t6 = m16040t4();
        if (c44869t4M16040t6 != null && (baseTextView = c44869t4M16040t6.f100901o) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.dialog.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptDialog.m16021C4(this.f17216b, i11);
                }
            }, 1, null);
        }
        C44869t4 c44869t4M16040t7 = m16040t4();
        if (c44869t4M16040t7 != null) {
            ImageView ivCancel = c44869t4M16040t7.f100890d;
            Intrinsics.checkNotNullExpressionValue(ivCancel, "ivCancel");
            RoundTextView tvCancel = c44869t4M16040t7.f100893g;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            C27046k.m66681D(new View[]{ivCancel, tvCancel}, new Function0() { // from class: com.kubi.assets.dialog.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptDialog.m16022D4(this.f17219b);
                }
            });
            RoundTextView tvSettings = c44869t4M16040t7.f100896j;
            Intrinsics.checkNotNullExpressionValue(tvSettings, "tvSettings");
            C27046k.m66711z(tvSettings, 0L, new Function0() { // from class: com.kubi.assets.dialog.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptDialog.m16023E4(this.f17221b, intRef);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m16019A4(SubscriptDialog subscriptDialog, Ref.IntRef intRef) {
        ImageView imageView;
        ImageView imageView2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C44869t4 c44869t4M16040t4 = subscriptDialog.m16040t4();
        if (c44869t4M16040t4 != null && (constraintLayout2 = c44869t4M16040t4.f100889c) != null) {
            constraintLayout2.setSelected(true);
        }
        C44869t4 c44869t4M16040t5 = subscriptDialog.m16040t4();
        if (c44869t4M16040t5 != null && (constraintLayout = c44869t4M16040t5.f100888b) != null) {
            constraintLayout.setSelected(false);
        }
        C44869t4 c44869t4M16040t6 = subscriptDialog.m16040t4();
        if (c44869t4M16040t6 != null && (imageView2 = c44869t4M16040t6.f100892f) != null) {
            ViewExtKt.m66594y(imageView2);
        }
        C44869t4 c44869t4M16040t7 = subscriptDialog.m16040t4();
        if (c44869t4M16040t7 != null && (imageView = c44869t4M16040t7.f100891e) != null) {
            ViewExtKt.m66577h(imageView);
        }
        intRef.element = 1;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m16020B4(SubscriptDialog subscriptDialog, Ref.IntRef intRef) {
        ImageView imageView;
        ImageView imageView2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C44869t4 c44869t4M16040t4 = subscriptDialog.m16040t4();
        if (c44869t4M16040t4 != null && (constraintLayout2 = c44869t4M16040t4.f100889c) != null) {
            constraintLayout2.setSelected(false);
        }
        C44869t4 c44869t4M16040t5 = subscriptDialog.m16040t4();
        if (c44869t4M16040t5 != null && (constraintLayout = c44869t4M16040t5.f100888b) != null) {
            constraintLayout.setSelected(true);
        }
        C44869t4 c44869t4M16040t6 = subscriptDialog.m16040t4();
        if (c44869t4M16040t6 != null && (imageView2 = c44869t4M16040t6.f100891e) != null) {
            ViewExtKt.m66594y(imageView2);
        }
        C44869t4 c44869t4M16040t7 = subscriptDialog.m16040t4();
        if (c44869t4M16040t7 != null && (imageView = c44869t4M16040t7.f100892f) != null) {
            ViewExtKt.m66577h(imageView);
        }
        intRef.element = 2;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m16021C4(SubscriptDialog subscriptDialog, int i11) {
        Context context = subscriptDialog.getContext();
        if (context != null) {
            if (i11 == 2) {
                AssetsDepend.f18689a.m19186g().m56316j(context);
            } else {
                AssetsDepend.f18689a.m19186g().m56318l(context);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m16022D4(SubscriptDialog subscriptDialog) {
        subscriptDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m16023E4(SubscriptDialog subscriptDialog, Ref.IntRef intRef) {
        subscriptDialog.dismiss();
        Function1<? super Integer, Unit> function1 = subscriptDialog.f16955r0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(intRef.element));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    private final void m16024F4() {
        int i11;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        ConstraintLayout constraintLayout2;
        ImageView imageView;
        ConstraintLayout constraintLayout3;
        BaseTextView baseTextView5;
        ImageView imageView2;
        ConstraintLayout constraintLayout4;
        BaseTextView baseTextView6;
        ImageView imageView3;
        ImageView imageView4;
        if (C5303w0.m6511a()) {
            C44869t4 c44869t4M16040t4 = m16040t4();
            if (c44869t4M16040t4 != null && (imageView4 = c44869t4M16040t4.f100891e) != null) {
                imageView4.setRotationY(180.0f);
            }
            C44869t4 c44869t4M16040t5 = m16040t4();
            if (c44869t4M16040t5 != null && (imageView3 = c44869t4M16040t5.f100892f) != null) {
                imageView3.setRotationY(180.0f);
            }
        }
        if (m16036w4()) {
            C44869t4 c44869t4M16040t6 = m16040t4();
            if (c44869t4M16040t6 != null && (baseTextView6 = c44869t4M16040t6.f100895i) != null) {
                baseTextView6.setText(AssetsDepend.f18689a.m19189j().D());
            }
            C44869t4 c44869t4M16040t7 = m16040t4();
            if (c44869t4M16040t7 != null && (constraintLayout4 = c44869t4M16040t7.f100888b) != null) {
                constraintLayout4.setSelected(true);
            }
            C44869t4 c44869t4M16040t8 = m16040t4();
            if (c44869t4M16040t8 != null && (imageView2 = c44869t4M16040t8.f100891e) != null) {
                ViewExtKt.m66594y(imageView2);
            }
            i11 = 0;
        } else {
            C44869t4 c44869t4M16040t9 = m16040t4();
            if (c44869t4M16040t9 != null && (constraintLayout = c44869t4M16040t9.f100888b) != null) {
                ViewExtKt.m66577h(constraintLayout);
            }
            C44869t4 c44869t4M16040t10 = m16040t4();
            if (c44869t4M16040t10 != null && (baseTextView2 = c44869t4M16040t10.f100901o) != null) {
                baseTextView2.setText(getString(R$string.asset_bind_email));
            }
            C44869t4 c44869t4M16040t11 = m16040t4();
            if (c44869t4M16040t11 != null && (baseTextView = c44869t4M16040t11.f100901o) != null) {
                ViewExtKt.m66594y(baseTextView);
            }
            i11 = 1;
        }
        if (m16043x4()) {
            C44869t4 c44869t4M16040t12 = m16040t4();
            if (c44869t4M16040t12 != null && (baseTextView5 = c44869t4M16040t12.f100898l) != null) {
                baseTextView5.setText(AssetsDepend.f18689a.m19189j().Z());
            }
            if (i11 == 1) {
                C44869t4 c44869t4M16040t13 = m16040t4();
                if (c44869t4M16040t13 != null && (constraintLayout3 = c44869t4M16040t13.f100889c) != null) {
                    constraintLayout3.setSelected(true);
                }
                C44869t4 c44869t4M16040t14 = m16040t4();
                if (c44869t4M16040t14 != null && (imageView = c44869t4M16040t14.f100892f) != null) {
                    ViewExtKt.m66594y(imageView);
                }
            }
        } else {
            C44869t4 c44869t4M16040t15 = m16040t4();
            if (c44869t4M16040t15 != null && (constraintLayout2 = c44869t4M16040t15.f100889c) != null) {
                ViewExtKt.m66577h(constraintLayout2);
            }
            C44869t4 c44869t4M16040t16 = m16040t4();
            if (c44869t4M16040t16 != null && (baseTextView4 = c44869t4M16040t16.f100901o) != null) {
                baseTextView4.setText(getString(R$string.asset_bind_phone));
            }
            C44869t4 c44869t4M16040t17 = m16040t4();
            if (c44869t4M16040t17 != null && (baseTextView3 = c44869t4M16040t17.f100901o) != null) {
                ViewExtKt.m66594y(baseTextView3);
            }
            i11 = 2;
        }
        m16044z4(i11);
    }

    /* JADX INFO: renamed from: H4 */
    public static final Boolean m16025H4(SubscriptDialog subscriptDialog) {
        Bundle arguments = subscriptDialog.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("isFrom", false));
        }
        return null;
    }

    /* JADX INFO: renamed from: r4 */
    public static final String m16034r4(SubscriptDialog subscriptDialog) {
        Bundle arguments = subscriptDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public static final String m16035s4(SubscriptDialog subscriptDialog) {
        Bundle arguments = subscriptDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("coin");
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    private final void m16037y4() {
        String strM16042v4;
        String string;
        BaseTextView baseTextView;
        String upperCase;
        String strM16041u4 = m16041u4();
        if (strM16041u4 != null && strM16041u4.length() != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m16042v4());
            sb2.append('-');
            String strM16041u5 = m16041u4();
            if (strM16041u5 != null) {
                upperCase = strM16041u5.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            sb2.append(upperCase);
            strM16042v4 = sb2.toString();
        } else {
            strM16042v4 = m16042v4();
        }
        if (C27025c.m66566d(m16038G4())) {
            string = getString(R$string.asset_deposit_notice);
        } else {
            string = getString(R$string.asset_withdraw_notice);
        }
        Intrinsics.checkNotNull(string);
        C44869t4 c44869t4M16040t4 = m16040t4();
        if (c44869t4M16040t4 != null && (baseTextView = c44869t4M16040t4.f100899m) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(string, Arrays.copyOf(new Object[]{strM16042v4}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            baseTextView.setText(str);
        }
    }
}
