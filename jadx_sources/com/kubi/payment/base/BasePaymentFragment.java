package com.kubi.payment.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.payment.base.BasePaymentFragment;
import com.kubi.payment.base.BasePaymentVM;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.InterfaceC42877j;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: BasePaymentFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u001aH&J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020$H'J\u001a\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010'\u001a\u00020\u0017H&J\b\u0010(\u001a\u00020\u0017H\u0015J\b\u0010)\u001a\u00020\u0017H\u0014R\u001c\u0010\b\u001a\u00028\u0000X\u0084.¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u000fX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006*"}, m90084d2 = {"Lcom/kubi/payment/base/BasePaymentFragment;", "VM", "Lcom/kubi/payment/base/BasePaymentVM;", "Repository", "Lcom/kubi/payment/base/IRepository;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewModel", "getViewModel", "()Lcom/kubi/payment/base/BasePaymentVM;", "setViewModel", "(Lcom/kubi/payment/base/BasePaymentVM;)V", "Lcom/kubi/payment/base/BasePaymentVM;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "viewModelClass", "Lkotlin/reflect/KClass;", "onAttach", "", "context", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", TtmlNode.TAG_LAYOUT, "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "observeData", "retry", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BasePaymentFragment<VM extends BasePaymentVM<Repository>, Repository extends InterfaceC42877j> extends com.kubi.sdk.BaseFragment {

    /* JADX INFO: renamed from: U */
    public VM f38212U;

    /* JADX INFO: renamed from: V */
    public Context f38213V;

    /* JADX INFO: renamed from: com.kubi.payment.base.BasePaymentFragment$a */
    /* JADX INFO: compiled from: BasePaymentFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20298a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38214b;

        public C20298a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38214b = function;
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
            return this.f38214b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38214b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A3 */
    public abstract ViewModelProvider.Factory mo45645A3();

    /* JADX INFO: renamed from: p3 */
    public abstract void mo45648p3();

    @LayoutRes
    /* JADX INFO: renamed from: q3 */
    public abstract int mo45649q3();

    @NotNull
    /* JADX INFO: renamed from: z3 */
    public abstract KClass<VM> mo45654z3();

    @NotNull
    /* JADX INFO: renamed from: n3 */
    public final Context m45646n3() {
        Context context = this.f38213V;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final VM m45647o3() {
        VM vm2 = this.f38212U;
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
        m45652x3(context);
        m45653y3((BasePaymentVM) new ViewModelProvider(this, mo45645A3()).get(JvmClassMappingKt.getJavaClass((KClass) mo45654z3())));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(mo45649q3(), container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        mo45648p3();
        mo45650r3();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m45652x3(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.f38213V = context;
    }

    /* JADX INFO: renamed from: y3 */
    public final void m45653y3(@NotNull VM vm2) {
        Intrinsics.checkNotNullParameter(vm2, "<set-?>");
        this.f38212U = vm2;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m45641s3(BasePaymentFragment basePaymentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            basePaymentFragment.showLoadingDialog();
        } else {
            basePaymentFragment.hideLoadingDialog(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m45642t3(final BasePaymentFragment basePaymentFragment, BasePaymentVM.LoadingUIState loadingUIState) {
        if (loadingUIState.isLoading()) {
            com.kubi.sdk.BaseFragment.showLoadingView$default(basePaymentFragment, 0, 0, 3, null);
        } else if (loadingUIState.isShowContent()) {
            basePaymentFragment.showContentView();
        } else if (loadingUIState.isShowEmpty()) {
            com.kubi.sdk.BaseFragment.showEmptyView$default(basePaymentFragment, 0, 0, (View.OnClickListener) null, 7, (Object) null);
        } else if (loadingUIState.isShowError()) {
            com.kubi.sdk.BaseFragment.showFailView$default(basePaymentFragment, 0, 0, new View.OnClickListener() { // from class: nt.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BasePaymentFragment.m45643u3(this.f94942b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m45643u3(BasePaymentFragment basePaymentFragment, View view) {
        basePaymentFragment.mo45651w3();
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m45644v3(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    @CallSuper
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        m45647o3().m45660s().observe(getViewLifecycleOwner(), new C20298a(new Function1() { // from class: nt.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BasePaymentFragment.m45641s3(this.f94940b, (Boolean) obj);
            }
        }));
        m45647o3().m45655n().observe(getViewLifecycleOwner(), new C20298a(new Function1() { // from class: nt.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BasePaymentFragment.m45642t3(this.f94941b, (BasePaymentVM.LoadingUIState) obj);
            }
        }));
        m45647o3().m45656o().observe(getViewLifecycleOwner(), new C20298a(new Function1() { // from class: nt.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BasePaymentFragment.m45644v3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w3 */
    public void mo45651w3() {
    }
}
