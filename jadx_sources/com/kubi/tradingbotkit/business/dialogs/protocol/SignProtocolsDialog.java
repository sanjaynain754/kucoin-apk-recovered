package com.kubi.tradingbotkit.business.dialogs.protocol;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.host.HostManager;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.dialogs.protocol.model.Protocol;
import com.kubi.utils.C27018c0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.ArrayList;
import java.util.Iterator;
import l50.C42098x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: SignProtocolsDialog.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/dialogs/protocol/SignProtocolsDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "binding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitSignProtocolBinding;", "getBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitSignProtocolBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "strategyTemplateId", "", "getStrategyTemplateId", "()Ljava/lang/String;", "strategyTemplateId$delegate", "Lkotlin/Lazy;", "protocols", "Ljava/util/ArrayList;", "Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/Protocol;", "kotlin.jvm.PlatformType", "getProtocols", "()Ljava/util/ArrayList;", "protocols$delegate", "protocolViewModel", "Lcom/kubi/tradingbotkit/business/dialogs/protocol/SignProtocolViewModel;", "getProtocolViewModel", "()Lcom/kubi/tradingbotkit/business/dialogs/protocol/SignProtocolViewModel;", "protocolViewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObservers", "setAgreementText", "generateAgreementUrl", "path", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignProtocolsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolsDialog.kt\ncom/kubi/tradingbotkit/business/dialogs/protocol/SignProtocolsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n143#2,20:171\n106#3,15:191\n1878#4,3:206\n1869#4,2:209\n*S KotlinDebug\n*F\n+ 1 SignProtocolsDialog.kt\ncom/kubi/tradingbotkit/business/dialogs/protocol/SignProtocolsDialog\n*L\n38#1:171,20\n57#1:191,15\n130#1:206,3\n137#1:209,2\n*E\n"})
public final class SignProtocolsDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f52345c0 = C45681e.m100799e(this, new Function1<SignProtocolsDialog, C42098x>() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42098x invoke(@NotNull SignProtocolsDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42098x.m92351a(fragment.requireView());
        }
    }, new Function1<C42098x, Unit>() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42098x it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42098x c42098x) {
            invoke(c42098x);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f52346d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SignProtocolsDialog.m63970V3(this.f52354b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f52347e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SignProtocolsDialog.m63968S3(this.f52355b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f52348f0;

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f52344h0 = {Reflection.property1(new PropertyReference1Impl(SignProtocolsDialog.class, "binding", "getBinding()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitSignProtocolBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f52343g0 = new Companion(null);

    /* JADX INFO: compiled from: SignProtocolsDialog.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/dialogs/protocol/SignProtocolsDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "strategyTemplateId", "", "protocols", "Ljava/util/ArrayList;", "Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/Protocol;", "Lkotlin/collections/ArrayList;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull String strategyTemplateId, @Nullable ArrayList<Protocol> protocols) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(strategyTemplateId, "strategyTemplateId");
            SignProtocolsDialog signProtocolsDialog = new SignProtocolsDialog();
            Bundle bundle = new Bundle();
            bundle.putString("data", strategyTemplateId);
            bundle.putParcelableArrayList("data_1", protocols);
            signProtocolsDialog.setArguments(bundle);
            signProtocolsDialog.show(fragmentManager, "SignProtocolsDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$a */
    /* JADX INFO: compiled from: SignProtocolsDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26133a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f52349b;

        public C26133a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52349b = function;
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
            return this.f52349b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52349b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$b */
    /* JADX INFO: compiled from: SignProtocolsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/tradingbotkit/business/dialogs/protocol/SignProtocolsDialog$setAgreementText$2$clickSpan$1", "Lcom/kubi/utils/MyClickSpan;", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26134b extends C27018c0 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f52350d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26134b(Context context, int i11, View.OnClickListener onClickListener) {
            super(i11, onClickListener);
            this.f52350d = context;
        }

        @Override // com.kubi.utils.C27018c0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(true);
            ds2.setColor(ResourcesCompat.getColor(this.f52350d.getResources(), R$color.brandGreen, this.f52350d.getTheme()));
        }
    }

    /* JADX INFO: renamed from: H3 */
    private final String m63961H3(String str) {
        if (!StringsKt.startsWith$default(str, "/", false, 2, (Object) null)) {
            str = '/' + str;
        }
        return HostManager.a.m() + str;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m63966Q3(SignProtocolsDialog signProtocolsDialog, CompoundButton compoundButton, boolean z11) {
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C42098x c42098xM63972I3 = signProtocolsDialog.m63972I3();
        if (c42098xM63972I3 != null && (kcPrimaryButton = c42098xM63972I3.f93305d) != null) {
            kcPrimaryButton.setEnabled(z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public final C42098x m63972I3() {
        return (C42098x) this.f52345c0.getValue(this, f52344h0[0]);
    }

    /* JADX INFO: renamed from: J3 */
    public final SignProtocolViewModel m63973J3() {
        return (SignProtocolViewModel) this.f52348f0.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public final ArrayList<Protocol> m63974K3() {
        return (ArrayList) this.f52347e0.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public final String m63975L3() {
        return (String) this.f52346d0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.btrading_bot_kit_sign_protocol, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        AlignTopCheckBox alignTopCheckBox;
        AlignTopCheckBox alignTopCheckBox2;
        AppCompatImageView appCompatImageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C42098x c42098xM63972I3 = m63972I3();
        if (c42098xM63972I3 != null && (appCompatImageView = c42098xM63972I3.f93304c) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SignProtocolsDialog.m63965P3(this.f52351b);
                }
            }, 1, null);
        }
        C42098x c42098xM63972I4 = m63972I3();
        if (c42098xM63972I4 != null && (alignTopCheckBox2 = c42098xM63972I4.f93303b) != null) {
            C27046k.m66708w(alignTopCheckBox2, new Function2() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.d
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SignProtocolsDialog.m63966Q3(this.f52352b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C42098x c42098xM63972I5 = m63972I3();
        if (c42098xM63972I5 != null && (alignTopCheckBox = c42098xM63972I5.f93303b) != null) {
            alignTopCheckBox.setChecked(false);
        }
        C42098x c42098xM63972I6 = m63972I3();
        if (c42098xM63972I6 != null && (kcPrimaryButton2 = c42098xM63972I6.f93305d) != null) {
            kcPrimaryButton2.setEnabled(false);
        }
        C42098x c42098xM63972I7 = m63972I3();
        if (c42098xM63972I7 != null && (kcPrimaryButton = c42098xM63972I7.f93305d) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SignProtocolsDialog.m63967R3(this.f52353b);
                }
            }, 1, null);
        }
        m63976T3();
        m63962M3();
    }

    public SignProtocolsDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$special$$inlined$viewModels$default$2
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
        this.f52348f0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SignProtocolViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolsDialog$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: M3 */
    private final void m63962M3() {
        m63973J3().m63952v().observe(getViewLifecycleOwner(), new C26133a(new Function1() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SignProtocolsDialog.m63963N3(this.f52356b, (Boolean) obj);
            }
        }));
        m63973J3().m63951u().observe(getViewLifecycleOwner(), new C26133a(new Function1() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SignProtocolsDialog.m63964O3(this.f52357b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m63963N3(SignProtocolsDialog signProtocolsDialog, Boolean bool) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        if (bool.booleanValue()) {
            C42098x c42098xM63972I3 = signProtocolsDialog.m63972I3();
            if (c42098xM63972I3 != null && (kcPrimaryButton2 = c42098xM63972I3.f93305d) != null) {
                kcPrimaryButton2.m55043o();
            }
        } else {
            C42098x c42098xM63972I4 = signProtocolsDialog.m63972I3();
            if (c42098xM63972I4 != null && (kcPrimaryButton = c42098xM63972I4.f93305d) != null) {
                kcPrimaryButton.mo28851l();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m63964O3(SignProtocolsDialog signProtocolsDialog, Boolean bool) {
        signProtocolsDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m63965P3(SignProtocolsDialog signProtocolsDialog) {
        signProtocolsDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m63967R3(SignProtocolsDialog signProtocolsDialog) {
        signProtocolsDialog.m63973J3().m63953x(signProtocolsDialog.m63975L3());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final ArrayList m63968S3(SignProtocolsDialog signProtocolsDialog) {
        Bundle arguments = signProtocolsDialog.getArguments();
        if (arguments != null) {
            return BundleCompat.getParcelableArrayList(arguments, "data_1", Protocol.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m63969U3(SignProtocolsDialog signProtocolsDialog, Protocol protocol, View view) {
        view.cancelPendingInputEvents();
        C37304a c37304a = C37304a.f82764a;
        String url = protocol.getUrl();
        if (url == null) {
            url = "";
        }
        InterfaceC37766r.a.m85190a(c37304a, signProtocolsDialog.m63961H3(url), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: V3 */
    public static final String m63970V3(SignProtocolsDialog signProtocolsDialog) {
        String strM56285z;
        Bundle arguments = signProtocolsDialog.getArguments();
        if (arguments == null || (strM56285z = RouteExKt.m56285z(arguments, "data", "1")) == null) {
            return "1";
        }
        return strM56285z;
    }

    /* JADX INFO: renamed from: T3 */
    public final void m63976T3() {
        BaseTextView baseTextView;
        Context context;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        final Protocol protocol;
        ArrayList<Protocol> arrayListM63974K3 = m63974K3();
        if (arrayListM63974K3 != null && !arrayListM63974K3.isEmpty()) {
            Iterable iterableM63974K3 = m63974K3();
            if (iterableM63974K3 != null && (context = getContext()) != null) {
                StringBuilder sb2 = new StringBuilder(C33627eb.f69716f);
                if (C5303w0.m6511a()) {
                    iterableM63974K3 = CollectionsKt.reversed(iterableM63974K3);
                }
                int i11 = 0;
                for (Object obj : iterableM63974K3) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Protocol protocol2 = (Protocol) obj;
                    if (i11 != 0) {
                        sb2.append(" & ");
                    }
                    sb2.append(protocol2.getTitle());
                    i11 = i12;
                }
                String string = getString(R$string.kc_tb_protocols_desc, sb2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                Iterator it = CollectionsKt.reversed(iterableM63974K3).iterator();
                loop1: while (true) {
                    String str = string;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop1;
                        }
                        protocol = (Protocol) it.next();
                        String title = protocol.getTitle();
                        if (title == null || title.length() == 0) {
                        }
                    }
                    int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, protocol.getTitle(), 0, false, 6, (Object) null);
                    spannableStringBuilder.setSpan(new C26134b(context, R$color.c_text, new View.OnClickListener() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SignProtocolsDialog.m63969U3(this.f52358b, protocol, view);
                        }
                    }), iLastIndexOf$default, protocol.getTitle().length() + iLastIndexOf$default, 17);
                    string = str.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
                }
                C42098x c42098xM63972I3 = m63972I3();
                if (c42098xM63972I3 != null && (baseTextView3 = c42098xM63972I3.f93306e) != null) {
                    baseTextView3.setMovementMethod(LinkMovementMethod.getInstance());
                }
                C42098x c42098xM63972I4 = m63972I3();
                if (c42098xM63972I4 != null && (baseTextView2 = c42098xM63972I4.f93306e) != null) {
                    baseTextView2.setText(spannableStringBuilder);
                    return;
                }
                return;
            }
            return;
        }
        C42098x c42098xM63972I5 = m63972I3();
        if (c42098xM63972I5 != null && (baseTextView = c42098xM63972I5.f93306e) != null) {
            baseTextView.setText(getString(R$string.kc_tb_protocols_desc, getString(R$string.stub)));
        }
    }
}
