package com.kubi.futures.compliance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.futures.data.compliance.entity.EuropeComplianceDocsEntity;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36811o;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import sh.EuropeComplianceLangEntity;
import w00.C45681e;

/* JADX INFO: compiled from: EuropeComplianceLangDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010'\u001a\u00020%H\u0002J$\u0010(\u001a\u00020%2\u001a\u0010)\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0012\u0006\u0012\u0004\u0018\u00010-0*H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceLangDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "data", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", "getData", "()Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", "data$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogEuropeComplianceLangBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogEuropeComplianceLangBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/compliance/EuropeComplianceLangViewModel;", "getViewModel", "()Lcom/kubi/futures/compliance/EuropeComplianceLangViewModel;", "viewModel$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, NotificationCompat.CATEGORY_NAVIGATION, "setData", "pair", "Lkotlin/Pair;", "", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceLangEntity;", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEuropeComplianceLangDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuropeComplianceLangDialog.kt\ncom/kubi/futures/compliance/EuropeComplianceLangDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,156:1\n157#2,6:157\n*S KotlinDebug\n*F\n+ 1 EuropeComplianceLangDialog.kt\ncom/kubi/futures/compliance/EuropeComplianceLangDialog\n*L\n57#1:157,6\n*E\n"})
public final class EuropeComplianceLangDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f22568q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EuropeComplianceLangDialog.m24530r4(this.f22670b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f22569r0 = C45681e.m100799e(this, new Function1<EuropeComplianceLangDialog, C36811o>() { // from class: com.kubi.futures.compliance.EuropeComplianceLangDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36811o invoke(@NotNull EuropeComplianceLangDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36811o.m82483a(fragment.requireView());
        }
    }, new Function1<C36811o, Unit>() { // from class: com.kubi.futures.compliance.EuropeComplianceLangDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$1
        public final void invoke(@NotNull C36811o it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36811o c36811o) {
            invoke(c36811o);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22570s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EuropeComplianceLangDialog.m24521E4();
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f22571t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EuropeComplianceLangDialog.m24532w4(this.f22671b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f22567v0 = {Reflection.property1(new PropertyReference1Impl(EuropeComplianceLangDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogEuropeComplianceLangBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f22566u0 = new Companion(null);

    /* JADX INFO: compiled from: EuropeComplianceLangDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceLangDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "data", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull LifecycleOwner owner, @NotNull EuropeComplianceDocsEntity data) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(data, "data");
            if (owner instanceof Fragment) {
                FragmentManager childFragmentManager = ((Fragment) owner).getChildFragmentManager();
                Intrinsics.checkNotNull(childFragmentManager);
                EuropeComplianceLangDialog europeComplianceLangDialog = new EuropeComplianceLangDialog();
                Bundle bundle = new Bundle();
                bundle.putParcelable("data", data);
                europeComplianceLangDialog.setArguments(bundle);
                europeComplianceLangDialog.show(childFragmentManager, "EuropeComplianceLangDialog");
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.compliance.EuropeComplianceLangDialog$a */
    /* JADX INFO: compiled from: EuropeComplianceLangDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12852a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f22572b;

        public C12852a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22572b = function;
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
            return this.f22572b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22572b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m24520D4(C36811o c36811o, EuropeComplianceLangEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c36811o.f80692c.setEnabled(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final EuropeComplianceLangViewModel m24521E4() {
        return new EuropeComplianceLangViewModel();
    }

    /* JADX INFO: renamed from: t4 */
    private final WrapperLoadingView m24531t4() {
        return (WrapperLoadingView) this.f22571t0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_europe_compliance_lang, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36811o c36811oM24537u4 = m24537u4();
        if (c36811oM24537u4 == null) {
            return;
        }
        ViewExtKt.m66578i(view, (int) (((double) C5267e0.m6179a()) * 0.9d));
        AppCompatImageView close = c36811oM24537u4.f80691b;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.compliance.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeComplianceLangDialog.m24533y4(this.f22594b);
            }
        }, 1, null);
        c36811oM24537u4.f80692c.setEnabled(false);
        KcPrimaryButton confirm = c36811oM24537u4.f80692c;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.compliance.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeComplianceLangDialog.m24534z4(this.f22595b);
            }
        }, 1, null);
        WrapperLoadingView wrapperLoadingViewM24531t4 = m24531t4();
        if (wrapperLoadingViewM24531t4 != null) {
            wrapperLoadingViewM24531t4.showLoading();
        }
        m24538v4().m24541q().observe(getViewLifecycleOwner(), new C12852a(new Function1() { // from class: com.kubi.futures.compliance.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeComplianceLangDialog.m24518A4(this.f22669b, (Pair) obj);
            }
        }));
        m24538v4().m24540p();
    }

    /* JADX INFO: renamed from: s4 */
    public final EuropeComplianceDocsEntity m24536s4() {
        return (EuropeComplianceDocsEntity) this.f22568q0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final C36811o m24537u4() {
        return (C36811o) this.f22569r0.getValue(this, f22567v0[0]);
    }

    /* JADX INFO: renamed from: v4 */
    public final EuropeComplianceLangViewModel m24538v4() {
        return (EuropeComplianceLangViewModel) this.f22570s0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m24518A4(EuropeComplianceLangDialog europeComplianceLangDialog, Pair pair) {
        Intrinsics.checkNotNull(pair);
        europeComplianceLangDialog.m24535B4(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m24519C4(EuropeComplianceLangDialog europeComplianceLangDialog, View view) {
        WrapperLoadingView wrapperLoadingViewM24531t4 = europeComplianceLangDialog.m24531t4();
        if (wrapperLoadingViewM24531t4 != null) {
            wrapperLoadingViewM24531t4.showLoading();
        }
        europeComplianceLangDialog.m24538v4().m24540p();
    }

    /* JADX INFO: renamed from: r4 */
    public static final EuropeComplianceDocsEntity m24530r4(EuropeComplianceLangDialog europeComplianceLangDialog) {
        Bundle arguments = europeComplianceLangDialog.getArguments();
        if (arguments != null) {
            return (EuropeComplianceDocsEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: w4 */
    public static final WrapperLoadingView m24532w4(EuropeComplianceLangDialog europeComplianceLangDialog) {
        LinearLayout linearLayout;
        C36811o c36811oM24537u4 = europeComplianceLangDialog.m24537u4();
        if (c36811oM24537u4 != null && (linearLayout = c36811oM24537u4.f80693d) != null) {
            return WrapperLoadingView.injectView(linearLayout);
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m24533y4(EuropeComplianceLangDialog europeComplianceLangDialog) {
        europeComplianceLangDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m24534z4(EuropeComplianceLangDialog europeComplianceLangDialog) {
        europeComplianceLangDialog.m24539x4();
        Fragment parentFragment = europeComplianceLangDialog.getParentFragment();
        if (parentFragment instanceof EuropeComplianceContractsDialog) {
            ((EuropeComplianceContractsDialog) parentFragment).dismissAllowingStateLoss();
        }
        europeComplianceLangDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m24535B4(Pair<? extends List<EuropeComplianceLangEntity>, ? extends Throwable> pair) {
        final C36811o c36811oM24537u4 = m24537u4();
        if (c36811oM24537u4 != null) {
            if (pair.getSecond() != null) {
                WrapperLoadingView wrapperLoadingViewM24531t4 = m24531t4();
                if (wrapperLoadingViewM24531t4 != null) {
                    wrapperLoadingViewM24531t4.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.futures.compliance.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            EuropeComplianceLangDialog.m24519C4(this.f22672b, view);
                        }
                    });
                    return;
                }
                return;
            }
            WrapperLoadingView wrapperLoadingViewM24531t5 = m24531t4();
            if (wrapperLoadingViewM24531t5 != null) {
                wrapperLoadingViewM24531t5.showContent();
            }
            EuropeComplianceLangAdapter europeComplianceLangAdapter = new EuropeComplianceLangAdapter(new Function1() { // from class: com.kubi.futures.compliance.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EuropeComplianceLangDialog.m24520D4(c36811oM24537u4, (EuropeComplianceLangEntity) obj);
                }
            });
            c36811oM24537u4.f80694e.setAdapter(europeComplianceLangAdapter);
            europeComplianceLangAdapter.m24555l(pair.getFirst());
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m24539x4() {
        EuropeComplianceDocsEntity europeComplianceDocsEntityM24536s4;
        EuropeComplianceLangAdapter europeComplianceLangAdapter;
        EuropeComplianceLangEntity europeComplianceLangEntityM24552h;
        C36811o c36811oM24537u4 = m24537u4();
        if (c36811oM24537u4 != null && (europeComplianceDocsEntityM24536s4 = m24536s4()) != null) {
            RecyclerView.Adapter adapter = c36811oM24537u4.f80694e.getAdapter();
            if (adapter instanceof EuropeComplianceLangAdapter) {
                europeComplianceLangAdapter = (EuropeComplianceLangAdapter) adapter;
            } else {
                europeComplianceLangAdapter = null;
            }
            if (europeComplianceLangAdapter == null || (europeComplianceLangEntityM24552h = europeComplianceLangAdapter.m24552h()) == null) {
                return;
            }
            InterfaceC37766r.a.m85191b(C37304a.f82764a, StringsKt.replace$default(C27041f.m66668h(europeComplianceDocsEntityM24536s4.getPriidKIdUrl()), "{lang}", C27041f.m66668h(europeComplianceLangEntityM24552h.getLang()), false, 4, (Object) null), null, null, null, 14, null);
        }
    }
}
