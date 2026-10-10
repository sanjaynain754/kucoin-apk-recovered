package com.kubi.payment.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.payment.base.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.C42874g;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: BaseFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated(message = "废弃,请使用BasePaymentFragment", replaceWith = @ReplaceWith(expression = "com.kubi.payment.base.BasePaymentFragment", imports = {}))
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H&J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH&J\b\u0010\u001a\u001a\u00020\u000fH\u0015R\u001c\u0010\u0006\u001a\u00028\u0000X\u0084.¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/base/BaseFragment;", "VM", "Lcom/kubi/payment/base/BaseViewModel;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "viewModel", "getViewModel", "()Lcom/kubi/payment/base/BaseViewModel;", "setViewModel", "(Lcom/kubi/payment/base/BaseViewModel;)V", "Lcom/kubi/payment/base/BaseViewModel;", "viewModelClass", "Lkotlin/reflect/KClass;", "onAttach", "", "context", "Landroid/content/Context;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initViews", "observeData", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseFragment<VM extends C42874g> extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    public VM f38210U;

    /* JADX INFO: renamed from: com.kubi.payment.base.BaseFragment$a */
    /* JADX INFO: compiled from: BaseFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20297a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38211b;

        public C20297a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38211b = function;
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
            return this.f38211b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38211b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public abstract void mo45632n3();

    @NotNull
    /* JADX INFO: renamed from: s3 */
    public abstract KClass<VM> mo45635s3();

    @NotNull
    /* JADX INFO: renamed from: t3 */
    public abstract ViewModelProvider.Factory mo45636t3();

    @NotNull
    /* JADX INFO: renamed from: m3 */
    public final VM m45631m3() {
        VM vm2 = this.f38210U;
        if (vm2 != null) {
            return vm2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        m45634r3((C42874g) new ViewModelProvider(this, mo45636t3()).get(JvmClassMappingKt.getJavaClass((KClass) mo45635s3())));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        mo45632n3();
        mo45633o3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m45634r3(@NotNull VM vm2) {
        Intrinsics.checkNotNullParameter(vm2, "<set-?>");
        this.f38210U = vm2;
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m45629p3(BaseFragment baseFragment, Boolean bool) {
        if (bool.booleanValue()) {
            baseFragment.showDialogLoading();
        } else {
            baseFragment.hideDialogLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m45630q3(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    @CallSuper
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        m45631m3().m94036q().observe(getViewLifecycleOwner(), new C20297a(new Function1() { // from class: nt.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.m45629p3(this.f94939b, (Boolean) obj);
            }
        }));
        m45631m3().m94033n().observe(getViewLifecycleOwner(), new C20297a(new Function1() { // from class: nt.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.m45630q3((Throwable) obj);
            }
        }));
    }
}
