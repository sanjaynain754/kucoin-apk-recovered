package com.kubi.assets.dialog.payment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.R$string;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p637ta.C44832o2;
import p637ta.C44866t1;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: AssetMultiPaymentDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010.\u001a\u00020#H\u0002J\b\u0010/\u001a\u00020#H\u0002J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0002J\u0012\u00103\u001a\u00020#2\b\u00104\u001a\u0004\u0018\u00010\u000fH\u0002J!\u00105\u001a\u00020#2\b\u00106\u001a\u0004\u0018\u00010\u000f2\b\u00104\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\b7J\b\u00108\u001a\u00020#H\u0002J\b\u00109\u001a\u00020#H\u0002J\u0006\u0010:\u001a\u00020#J\b\u0010;\u001a\u00020<H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u0006>"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/AssetMultiPaymentDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetMultiPaymentDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "type", "", DropFrameTable.COLUMN_SCENE, "getScene", "()Ljava/lang/String;", "scene$delegate", "Lkotlin/Lazy;", "spmId", "getSpmId", "spmId$delegate", "viewModel", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel;", "getViewModel", "()Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel;", "viewModel$delegate", "adapter", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentContentAdapter;", "getAdapter", "()Lcom/kubi/assets/dialog/payment/AssetMultiPaymentContentAdapter;", "adapter$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "initObservers", "buildContent", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/assets/dialog/payment/AssetPaymentListConfig;", "exposeLastUseIfNeeded", "tradeType", "lastUseExpose", "id", "lastUseExpose$AssetsCenterLib_googleRelease", "showContentView", "showLoadingView", "expose", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetMultiPaymentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetMultiPaymentDialog.kt\ncom/kubi/assets/dialog/payment/AssetMultiPaymentDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n143#2,20:211\n106#3,15:231\n1#4:246\n*S KotlinDebug\n*F\n+ 1 AssetMultiPaymentDialog.kt\ncom/kubi/assets/dialog/payment/AssetMultiPaymentDialog\n*L\n46#1:211,20\n50#1:231,15\n*E\n"})
public final class AssetMultiPaymentDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: A0 */
    public static final /* synthetic */ KProperty<Object>[] f17153A0 = {Reflection.property1(new PropertyReference1Impl(AssetMultiPaymentDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetMultiPaymentDialogBinding;", 0))};

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public static final Companion f17154z0 = new Companion(null);

    /* JADX INFO: renamed from: u0 */
    public String f17157u0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f17160x0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f17161y0;

    /* JADX INFO: renamed from: s0 */
    public final float f17155s0 = 0.9f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f17156t0 = C45681e.m100799e(this, new Function1<AssetMultiPaymentDialog, C44866t1>() { // from class: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44866t1 invoke(@NotNull AssetMultiPaymentDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44866t1.m99256a(fragment.requireView());
        }
    }, new Function1<C44866t1, Unit>() { // from class: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44866t1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44866t1 c44866t1) {
            invoke(c44866t1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f17158v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.payment.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetMultiPaymentDialog.m16323K4(this.f17180b);
        }
    });

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f17159w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.payment.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetMultiPaymentDialog.m16325M4(this.f17181b);
        }
    });

    /* JADX INFO: compiled from: AssetMultiPaymentDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        return true;
    }

    /* JADX INFO: renamed from: w4 */
    public static final AssetMultiPaymentContentAdapter m16336w4(final AssetMultiPaymentDialog assetMultiPaymentDialog) {
        String str = assetMultiPaymentDialog.f17157u0;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            str = null;
        }
        return new AssetMultiPaymentContentAdapter(str, new Function0() { // from class: com.kubi.assets.dialog.payment.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetMultiPaymentDialog.m16337x4(this.f17184b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public final void m16338A4(String str) throws JSONException {
        String strM16376b = AssetPaymentLastUseHelper.f17185a.m16376b(str);
        if (strM16376b == null || strM16376b.length() == 0) {
            return;
        }
        m16344J4(strM16376b, str);
    }

    /* JADX INFO: renamed from: B4 */
    public final AssetMultiPaymentContentAdapter m16339B4() {
        return (AssetMultiPaymentContentAdapter) this.f17161y0.getValue();
    }

    /* JADX INFO: renamed from: C4 */
    public final C44866t1 m16340C4() {
        return (C44866t1) this.f17156t0.getValue(this, f17153A0[0]);
    }

    /* JADX INFO: renamed from: D4 */
    public final String m16341D4() {
        return (String) this.f17158v0.getValue();
    }

    /* JADX INFO: renamed from: E4 */
    public final String m16342E4() {
        return (String) this.f17159w0.getValue();
    }

    /* JADX INFO: renamed from: F4 */
    public final AssetMultiPaymentViewModel m16343F4() {
        return (AssetMultiPaymentViewModel) this.f17160x0.getValue();
    }

    /* JADX INFO: renamed from: J4 */
    public final void m16344J4(@Nullable String str, @Nullable String str2) throws JSONException {
        if (Intrinsics.areEqual(str2, FastQuoteModel.PAY_RECHARGE)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", str);
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e("B1selectDepositMethod", "depositPopup", "lastUse", jSONObject);
            return;
        }
        if (Intrinsics.areEqual(str2, "WITHDRAW")) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("category", str);
            Unit unit2 = Unit.INSTANCE;
            C43852m.m96593e("B1selectWithdrawalMethod", "withdrawalPopup", "lastUse", jSONObject2);
        }
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF17155s0() {
        return this.f17155s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.asset_multi_payment_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onViewCreated: type: ");
        String str = this.f17157u0;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            str = null;
        }
        sb2.append(str);
        sb2.append(", scene: ");
        sb2.append(m16341D4());
        sb2.append(", spmId: ");
        sb2.append(m16342E4());
        C44128b.m97259c("AssetMergeDialog", sb2.toString());
        m16321H4();
        m16320G4();
        AssetMultiPaymentViewModel assetMultiPaymentViewModelM16343F4 = m16343F4();
        String str3 = this.f17157u0;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        } else {
            str2 = str3;
        }
        assetMultiPaymentViewModelM16343F4.m16356A(str2, m16341D4());
        m16346z4();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m16346z4() {
        String str = this.f17157u0;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            str = null;
        }
        if (Intrinsics.areEqual(str, FastQuoteModel.PAY_RECHARGE)) {
            C43852m.m96594f("B1selectDepositMethod", "depositPopup", "1", TuplesKt.m90091to("pre_spm_id", String.valueOf(m16342E4())));
        } else if (Intrinsics.areEqual(str, "WITHDRAW")) {
            C43852m.m96594f("B1selectWithdrawalMethod", "withdrawalPopup", "1", TuplesKt.m90091to("pre_spm_id", String.valueOf(m16342E4())));
        }
    }

    public AssetMultiPaymentDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f17160x0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AssetMultiPaymentViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f17161y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.payment.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetMultiPaymentDialog.m16336w4(this.f17182b);
            }
        });
    }

    /* JADX INFO: renamed from: G4 */
    private final void m16320G4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AssetMultiPaymentDialog$initObservers$1(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AssetMultiPaymentDialog$initObservers$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: H4 */
    private final void m16321H4() {
        C44866t1 c44866t1M16340C4 = m16340C4();
        if (c44866t1M16340C4 != null) {
            c44866t1M16340C4.f100862c.f90679b.setImageResource(R$drawable.ic2_common_system_maintain);
            c44866t1M16340C4.f100862c.f90680c.setText(R$string.load_failed_click_retry);
            LinearLayout root = c44866t1M16340C4.f100862c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C27046k.m66711z(root, 0L, new Function0() { // from class: com.kubi.assets.dialog.payment.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetMultiPaymentDialog.m16322I4(this.f17183b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m16322I4(AssetMultiPaymentDialog assetMultiPaymentDialog) {
        AssetMultiPaymentViewModel assetMultiPaymentViewModelM16343F4 = assetMultiPaymentDialog.m16343F4();
        String str = assetMultiPaymentDialog.f17157u0;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            str = null;
        }
        assetMultiPaymentViewModelM16343F4.m16356A(str, assetMultiPaymentDialog.m16341D4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final String m16323K4(AssetMultiPaymentDialog assetMultiPaymentDialog) {
        Bundle arguments = assetMultiPaymentDialog.getArguments();
        if (arguments != null) {
            return arguments.getString(DropFrameTable.COLUMN_SCENE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public final void m16324L4() {
        AppCompatImageView appCompatImageView;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        C44832o2 c44832o2;
        Context context = getContext();
        int i11 = com.kubi.assets.R$drawable.kc_loading;
        C44866t1 c44866t1M16340C4 = m16340C4();
        if (c44866t1M16340C4 != null && (c44832o2 = c44866t1M16340C4.f100863d) != null) {
            appCompatImageView = c44832o2.f100539b;
        } else {
            appCompatImageView = null;
        }
        C24277v.m58539d(context, i11, appCompatImageView);
        View view = getView();
        if (view != null && (viewFindViewById3 = view.findViewById(R$id.failedView)) != null) {
            ViewExtKt.m66577h(viewFindViewById3);
        }
        View view2 = getView();
        if (view2 != null && (viewFindViewById2 = view2.findViewById(R$id.content)) != null) {
            ViewExtKt.m66577h(viewFindViewById2);
        }
        View view3 = getView();
        if (view3 != null && (viewFindViewById = view3.findViewById(R$id.loadingView)) != null) {
            ViewExtKt.m66594y(viewFindViewById);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static final String m16325M4(AssetMultiPaymentDialog assetMultiPaymentDialog) {
        Bundle arguments = assetMultiPaymentDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("spm");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showContentView() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View view = getView();
        if (view != null && (viewFindViewById3 = view.findViewById(R$id.failedView)) != null) {
            ViewExtKt.m66577h(viewFindViewById3);
        }
        View view2 = getView();
        if (view2 != null && (viewFindViewById2 = view2.findViewById(R$id.loadingView)) != null) {
            ViewExtKt.m66577h(viewFindViewById2);
        }
        View view3 = getView();
        if (view3 != null && (viewFindViewById = view3.findViewById(R$id.content)) != null) {
            ViewExtKt.m66594y(viewFindViewById);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m16337x4(AssetMultiPaymentDialog assetMultiPaymentDialog) {
        assetMultiPaymentDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strM56285z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56285z = RouteExKt.m56285z(arguments, "type", FastQuoteModel.PAY_RECHARGE);
        } else {
            strM56285z = null;
        }
        this.f17157u0 = C27041f.m66669i(strM56285z, FastQuoteModel.PAY_RECHARGE);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putInt("type", mo24511N3());
        }
        super.onCreate(savedInstanceState);
    }

    /* JADX INFO: renamed from: y4 */
    public final void m16345y4(AssetPaymentListConfig assetPaymentListConfig) throws JSONException {
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        String string;
        C44866t1 c44866t1M16340C4 = m16340C4();
        if (c44866t1M16340C4 != null && (baseTextView = c44866t1M16340C4.f100865f) != null) {
            String tradeType = assetPaymentListConfig.getTradeType();
            if (Intrinsics.areEqual(tradeType, FastQuoteModel.PAY_RECHARGE)) {
                string = getString(com.kubi.assets.R$string.kc_deposit_aggr);
            } else if (Intrinsics.areEqual(tradeType, "WITHDRAW")) {
                string = getString(com.kubi.assets.R$string.kc_withdraw_aggr);
            } else {
                string = "";
            }
            baseTextView.setText(string);
        }
        C44866t1 c44866t1M16340C5 = m16340C4();
        if (c44866t1M16340C5 != null && (recyclerView = c44866t1M16340C5.f100864e) != null) {
            recyclerView.setAdapter(m16339B4());
        }
        m16339B4().m16319i(assetPaymentListConfig);
        m16338A4(assetPaymentListConfig.getTradeType());
    }
}
