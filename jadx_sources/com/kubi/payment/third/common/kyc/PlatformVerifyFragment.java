package com.kubi.payment.third.common.kyc;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.third.base.BaseThirdFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import f00.C37304a;
import g00.InterfaceC37755g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37694u2;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: PlatformVerifyFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;", "Lcom/kubi/payment/third/base/BaseThirdFragment;", "Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentThirdPlatformVerifyBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentThirdPlatformVerifyBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModelClass", "Lkotlin/reflect/KClass;", "getLayout", "", "initViews", "", "onResume", "observeData", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPlatformVerifyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformVerifyFragment.kt\ncom/kubi/payment/third/common/kyc/PlatformVerifyFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,99:1\n147#2,16:100\n*S KotlinDebug\n*F\n+ 1 PlatformVerifyFragment.kt\ncom/kubi/payment/third/common/kyc/PlatformVerifyFragment\n*L\n17#1:100,16\n*E\n"})
public final class PlatformVerifyFragment extends BaseThirdFragment<PlatformVerifyViewModel> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f40215V = C45681e.m100799e(this, new Function1<PlatformVerifyFragment, C37694u2>() { // from class: com.kubi.payment.third.common.kyc.PlatformVerifyFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37694u2 invoke(@NotNull PlatformVerifyFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37694u2.m84979a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37694u2, Unit>() { // from class: com.kubi.payment.third.common.kyc.PlatformVerifyFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37694u2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37694u2 c37694u2) {
            invoke(c37694u2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f40214X = {Reflection.property1(new PropertyReference1Impl(PlatformVerifyFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentThirdPlatformVerifyBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f40213W = new Companion(null);

    /* JADX INFO: compiled from: PlatformVerifyFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseActivity.Companion.launch$default(BaseActivity.INSTANCE, context, PlatformVerifyFragment.class, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.third.common.kyc.PlatformVerifyFragment$a */
    /* JADX INFO: compiled from: PlatformVerifyFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21384a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f40216b;

        public C21384a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f40216b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f40216b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40216b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m49518A3(PlatformVerifyFragment platformVerifyFragment, FiatUserInfo fiatUserInfo) {
        ImageView imageView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        BaseTextView baseTextView7;
        ImageView imageView8;
        ImageView imageView9;
        ConstraintLayout constraintLayout;
        ImageView imageView10;
        BaseTextView baseTextView8;
        ImageView imageView11;
        ImageView imageView12;
        if (C27025c.m66566d(fiatUserInfo != null ? Boolean.valueOf(fiatUserInfo.isUnverified()) : null)) {
            C37694u2 c37694u2M49524x3 = platformVerifyFragment.m49524x3();
            if (c37694u2M49524x3 != null && (imageView12 = c37694u2M49524x3.f84732c) != null) {
                imageView12.setImageResource(R$drawable.ic_warning_20);
            }
            C37694u2 c37694u2M49524x4 = platformVerifyFragment.m49524x3();
            if (c37694u2M49524x4 != null && (imageView11 = c37694u2M49524x4.f84732c) != null) {
                C27046k.m66701p(imageView11, platformVerifyFragment.getColorRes(R$color.complementary));
            }
            C37694u2 c37694u2M49524x5 = platformVerifyFragment.m49524x3();
            if (c37694u2M49524x5 != null && (baseTextView8 = c37694u2M49524x5.f84735f) != null) {
                C27046k.m66700o(baseTextView8);
            }
            C37694u2 c37694u2M49524x6 = platformVerifyFragment.m49524x3();
            if (c37694u2M49524x6 != null && (imageView10 = c37694u2M49524x6.f84731b) != null) {
                C27046k.m66685H(imageView10);
            }
        } else {
            if (C27025c.m66566d(fiatUserInfo != null ? Boolean.valueOf(fiatUserInfo.isHighKyc()) : null)) {
                if (C27025c.m66566d(fiatUserInfo != null ? Boolean.valueOf(fiatUserInfo.isSanctionKyc()) : null)) {
                    C37694u2 c37694u2M49524x7 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x7 != null && (constraintLayout = c37694u2M49524x7.f84739j) != null) {
                        C27046k.m66700o(constraintLayout);
                    }
                } else {
                    C37694u2 c37694u2M49524x8 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x8 != null && (imageView9 = c37694u2M49524x8.f84732c) != null) {
                        imageView9.setImageResource(R$drawable.ic_success_20);
                    }
                    C37694u2 c37694u2M49524x9 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x9 != null && (imageView8 = c37694u2M49524x9.f84732c) != null) {
                        C27046k.m66701p(imageView8, platformVerifyFragment.getColorRes(R$color.primary));
                    }
                    C37694u2 c37694u2M49524x10 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x10 != null && (baseTextView7 = c37694u2M49524x10.f84735f) != null) {
                        C27046k.m66700o(baseTextView7);
                    }
                    C37694u2 c37694u2M49524x11 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x11 != null && (imageView7 = c37694u2M49524x11.f84731b) != null) {
                        C27046k.m66700o(imageView7);
                    }
                }
            } else {
                if (C27025c.m66566d(fiatUserInfo != null ? Boolean.valueOf(fiatUserInfo.isVerifying()) : null)) {
                    C37694u2 c37694u2M49524x12 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x12 != null && (imageView6 = c37694u2M49524x12.f84732c) != null) {
                        imageView6.setImageResource(R$mipmap.botc_ic_progress_status);
                    }
                    C37694u2 c37694u2M49524x13 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x13 != null && (imageView5 = c37694u2M49524x13.f84732c) != null) {
                        C27046k.m66701p(imageView5, platformVerifyFragment.getColorRes(R$color.complementary));
                    }
                    C37694u2 c37694u2M49524x14 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x14 != null && (baseTextView6 = c37694u2M49524x14.f84735f) != null) {
                        baseTextView6.setText(platformVerifyFragment.getString(R$string.payment_verify_processing));
                    }
                    C37694u2 c37694u2M49524x15 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x15 != null && (baseTextView5 = c37694u2M49524x15.f84735f) != null) {
                        baseTextView5.setTextColor(platformVerifyFragment.getColorRes(R$color.complementary));
                    }
                    C37694u2 c37694u2M49524x16 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x16 != null && (baseTextView4 = c37694u2M49524x16.f84735f) != null) {
                        C27046k.m66685H(baseTextView4);
                    }
                    C37694u2 c37694u2M49524x17 = platformVerifyFragment.m49524x3();
                    if (c37694u2M49524x17 != null && (imageView4 = c37694u2M49524x17.f84731b) != null) {
                        C27046k.m66685H(imageView4);
                    }
                } else {
                    if (C27025c.m66566d(fiatUserInfo != null ? Boolean.valueOf(fiatUserInfo.isFailed()) : null)) {
                        C37694u2 c37694u2M49524x18 = platformVerifyFragment.m49524x3();
                        if (c37694u2M49524x18 != null && (imageView3 = c37694u2M49524x18.f84732c) != null) {
                            imageView3.setImageResource(R$drawable.ic_fail_20);
                        }
                        C37694u2 c37694u2M49524x19 = platformVerifyFragment.m49524x3();
                        if (c37694u2M49524x19 != null && (imageView2 = c37694u2M49524x19.f84732c) != null) {
                            C27046k.m66701p(imageView2, platformVerifyFragment.getColorRes(R$color.secondary));
                        }
                        C37694u2 c37694u2M49524x20 = platformVerifyFragment.m49524x3();
                        if (c37694u2M49524x20 != null && (baseTextView3 = c37694u2M49524x20.f84735f) != null) {
                            baseTextView3.setText(platformVerifyFragment.getString(R$string.payment_verify_failure));
                        }
                        C37694u2 c37694u2M49524x21 = platformVerifyFragment.m49524x3();
                        if (c37694u2M49524x21 != null && (baseTextView2 = c37694u2M49524x21.f84735f) != null) {
                            baseTextView2.setTextColor(platformVerifyFragment.getColorRes(R$color.secondary));
                        }
                        C37694u2 c37694u2M49524x22 = platformVerifyFragment.m49524x3();
                        if (c37694u2M49524x22 != null && (baseTextView = c37694u2M49524x22.f84735f) != null) {
                            C27046k.m66685H(baseTextView);
                        }
                        C37694u2 c37694u2M49524x23 = platformVerifyFragment.m49524x3();
                        if (c37694u2M49524x23 != null && (imageView = c37694u2M49524x23.f84731b) != null) {
                            C27046k.m66685H(imageView);
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m49523z3() {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.payment_third_platform_verify;
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<PlatformVerifyViewModel> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(PlatformVerifyViewModel.class);
    }

    /* JADX INFO: renamed from: x3 */
    public final C37694u2 m49524x3() {
        return (C37694u2) this.f40215V.getValue(this, f40214X[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m49522y3(PlatformVerifyFragment platformVerifyFragment, View view) {
        platformVerifyFragment.preformBackPressed();
    }

    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        ConstraintLayout constraintLayout;
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setLeftIcon(R$drawable.ic_close_24);
        }
        NavigationBar navigationBar2 = getNavigationBar();
        if (navigationBar2 != null) {
            navigationBar2.setLeftOnclickListener(new View.OnClickListener() { // from class: com.kubi.payment.third.common.kyc.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlatformVerifyFragment.m49522y3(this.f40221b, view);
                }
            });
        }
        C37694u2 c37694u2M49524x3 = m49524x3();
        if (c37694u2M49524x3 != null && (constraintLayout = c37694u2M49524x3.f84739j) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.payment.third.common.kyc.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlatformVerifyFragment.m49523z3();
                }
            }, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((PlatformVerifyViewModel) m45631m3()).m49531x().observe(getViewLifecycleOwner(), new C21384a(new Function1() { // from class: com.kubi.payment.third.common.kyc.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformVerifyFragment.m49518A3(this.f40220b, (FiatUserInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((PlatformVerifyViewModel) m45631m3()).m49532y();
    }
}
