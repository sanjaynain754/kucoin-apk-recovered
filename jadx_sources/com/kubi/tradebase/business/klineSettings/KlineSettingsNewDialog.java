package com.kubi.tradebase.business.klineSettings;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.R$layout;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;
import n30.C42728d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38190h;
import p569qq.C43852m;
import p575qw.C43881b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: KlineSettingsNewDialog.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u000fH\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020#H\u0002J\u001a\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020 H\u0002J\u0012\u0010-\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017¨\u00061"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KlineSettingsNewDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "dialogBinding", "Lcom/kubi/tradebase/databinding/BtradebaseDialogKlineSettingsNewBinding;", "getDialogBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseDialogKlineSettingsNewBinding;", "dialogBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "debounceSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "kotlin.jvm.PlatformType", "isShowHistoryOrder", "", "()Z", "isShowHistoryOrder$delegate", "Lkotlin/Lazy;", "isShowOpenOrder", "isShowOpenOrder$delegate", "settingConfig", "getSettingConfig", "()Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "settingConfig$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "isBottomSheet", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onDismiss", "dialog", "Landroid/content/DialogInterface;", "checkToUpdateConfig", "setResult", "requestKey", "", DbParams.KEY_CHANNEL_RESULT, "updateCheckBoxDrawableSize", "checkBox", "Landroid/widget/CheckBox;", "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineSettingsNewDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineSettingsNewDialog.kt\ncom/kubi/tradebase/business/klineSettings/KlineSettingsNewDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,140:1\n143#2,20:141\n256#3,2:161\n*S KotlinDebug\n*F\n+ 1 KlineSettingsNewDialog.kt\ncom/kubi/tradebase/business/klineSettings/KlineSettingsNewDialog\n*L\n51#1:141,20\n94#1:161,2\n*E\n"})
public final class KlineSettingsNewDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f51524q0 = C45681e.m100799e(this, new Function1<KlineSettingsNewDialog, C42728d>() { // from class: com.kubi.tradebase.business.klineSettings.KlineSettingsNewDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42728d invoke(@NotNull KlineSettingsNewDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42728d.m93627a(fragment.requireView());
        }
    }, new Function1<C42728d, Unit>() { // from class: com.kubi.tradebase.business.klineSettings.KlineSettingsNewDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42728d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42728d c42728d) {
            invoke(c42728d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final BehaviorSubject<KLineSettingConfig> f51525r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f51526s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f51527t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f51528u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f51523w0 = {Reflection.property1(new PropertyReference1Impl(KlineSettingsNewDialog.class, "dialogBinding", "getDialogBinding()Lcom/kubi/tradebase/databinding/BtradebaseDialogKlineSettingsNewBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f51522v0 = new Companion(null);

    /* JADX INFO: compiled from: KlineSettingsNewDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KlineSettingsNewDialog$Companion;", "", "<init>", "()V", "KEY_RESULT_DRAW_TOOLS", "", "KEY_RESULT_CONFIG_UPDATE", "KEY_SHOW_HISTORY_ORDER", "KEY_SHOW_OPEN_ORDER", "newInstance", "Lcom/kubi/tradebase/business/klineSettings/KlineSettingsNewDialog;", "config", "Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KlineSettingsNewDialog newInstance(@NotNull KLineSettingConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            KlineSettingsNewDialog klineSettingsNewDialog = new KlineSettingsNewDialog();
            klineSettingsNewDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("key_show_history_order", Boolean.valueOf(config.getShowHistoryOrder())), TuplesKt.m90091to("key_show_open_order", Boolean.valueOf(config.getShowActiveOrder()))));
            return klineSettingsNewDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m63147D4(KlineSettingsNewDialog klineSettingsNewDialog, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        klineSettingsNewDialog.m63171w4().setShowHistoryOrder(z11);
        klineSettingsNewDialog.f51525r0.onNext(klineSettingsNewDialog.m63171w4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m63148E4(KlineSettingsNewDialog klineSettingsNewDialog, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        klineSettingsNewDialog.m63171w4().setShowActiveOrder(z11);
        klineSettingsNewDialog.f51525r0.onNext(klineSettingsNewDialog.m63171w4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m63149F4(KlineSettingsNewDialog klineSettingsNewDialog) {
        C43852m.m96591c("B5candle", "klineDrawing", null, null, 12, null);
        m63153K4(klineSettingsNewDialog, "result_draw_tools", null, 2, null);
        klineSettingsNewDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ void m63153K4(KlineSettingsNewDialog klineSettingsNewDialog, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = new Bundle();
        }
        klineSettingsNewDialog.m63167J4(str, bundle);
    }

    /* JADX INFO: renamed from: L4 */
    public static final KLineSettingConfig m63154L4(KlineSettingsNewDialog klineSettingsNewDialog) {
        KLineSettingConfig kLineSettingConfig = new KLineSettingConfig(false, false, 3, null);
        kLineSettingConfig.setShowHistoryOrder(klineSettingsNewDialog.m63172x4());
        kLineSettingConfig.setShowActiveOrder(klineSettingsNewDialog.m63173z4());
        return kLineSettingConfig;
    }

    /* JADX INFO: renamed from: M4 */
    public final void m63168M4(CheckBox checkBox) {
        if (checkBox == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = checkBox.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        Drawable drawable = compoundDrawablesRelative[0];
        if (drawable != null) {
            int iM96650a = C43881b.m96650a(20);
            drawable.setBounds(0, 0, iM96650a, iM96650a);
            checkBox.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.btradebase_dialog_kline_settings_new, container, false);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        m63169u4();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ImageView imageView;
        BaseTextView baseTextView;
        Group group;
        CheckBox checkBox;
        CheckBox checkBox2;
        CheckBox checkBox3;
        CheckBox checkBox4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C42728d c42728dM63170v4 = m63170v4();
        m63168M4(c42728dM63170v4 != null ? c42728dM63170v4.f94599f : null);
        C42728d c42728dM63170v5 = m63170v4();
        m63168M4(c42728dM63170v5 != null ? c42728dM63170v5.f94600g : null);
        C42728d c42728dM63170v6 = m63170v4();
        if (c42728dM63170v6 != null && (checkBox4 = c42728dM63170v6.f94599f) != null) {
            checkBox4.setChecked(m63172x4());
        }
        C42728d c42728dM63170v7 = m63170v4();
        if (c42728dM63170v7 != null && (checkBox3 = c42728dM63170v7.f94599f) != null) {
            C27046k.m66708w(checkBox3, new Function2() { // from class: com.kubi.tradebase.business.klineSettings.i
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KlineSettingsNewDialog.m63147D4(this.f51536b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C42728d c42728dM63170v8 = m63170v4();
        if (c42728dM63170v8 != null && (checkBox2 = c42728dM63170v8.f94600g) != null) {
            checkBox2.setChecked(m63173z4());
        }
        C42728d c42728dM63170v9 = m63170v4();
        if (c42728dM63170v9 != null && (checkBox = c42728dM63170v9.f94600g) != null) {
            C27046k.m66708w(checkBox, new Function2() { // from class: com.kubi.tradebase.business.klineSettings.j
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KlineSettingsNewDialog.m63148E4(this.f51537b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        boolean zM86164i = C38190h.f85888a.m86164i();
        C42728d c42728dM63170v10 = m63170v4();
        if (c42728dM63170v10 != null && (group = c42728dM63170v10.f94598e) != null) {
            group.setVisibility(zM86164i ? 0 : 8);
        }
        C42728d c42728dM63170v11 = m63170v4();
        if (c42728dM63170v11 != null && (baseTextView = c42728dM63170v11.f94601h) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.tradebase.business.klineSettings.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KlineSettingsNewDialog.m63149F4(this.f51538b);
                }
            }, 1, null);
        }
        C42728d c42728dM63170v12 = m63170v4();
        if (c42728dM63170v12 != null && (imageView = c42728dM63170v12.f94595b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.tradebase.business.klineSettings.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KlineSettingsNewDialog.m63150G4(this.f51539b);
                }
            }, 1, null);
        }
        Observable<KLineSettingConfig> observableObserveOn = this.f51525r0.debounce(500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.tradebase.business.klineSettings.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineSettingsNewDialog.m63151H4(this.f51540b, (KLineSettingConfig) obj);
            }
        };
        Consumer<? super KLineSettingConfig> consumer = new Consumer() { // from class: com.kubi.tradebase.business.klineSettings.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KlineSettingsNewDialog.m63152I4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.tradebase.business.klineSettings.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineSettingsNewDialog.m63145B4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.tradebase.business.klineSettings.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KlineSettingsNewDialog.m63146C4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
    }

    /* JADX INFO: renamed from: v4 */
    public final C42728d m63170v4() {
        return (C42728d) this.f51524q0.getValue(this, f51523w0[0]);
    }

    /* JADX INFO: renamed from: w4 */
    public final KLineSettingConfig m63171w4() {
        return (KLineSettingConfig) this.f51528u0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m63172x4() {
        return ((Boolean) this.f51526s0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z4 */
    public final boolean m63173z4() {
        return ((Boolean) this.f51527t0.getValue()).booleanValue();
    }

    public KlineSettingsNewDialog() {
        BehaviorSubject<KLineSettingConfig> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f51525r0 = behaviorSubjectCreate;
        this.f51526s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.business.klineSettings.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(KlineSettingsNewDialog.m63166y4(this.f51532b));
            }
        });
        this.f51527t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.business.klineSettings.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(KlineSettingsNewDialog.m63144A4(this.f51534b));
            }
        });
        this.f51528u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.business.klineSettings.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KlineSettingsNewDialog.m63154L4(this.f51535b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final boolean m63144A4(KlineSettingsNewDialog klineSettingsNewDialog) {
        Bundle arguments = klineSettingsNewDialog.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("key_show_open_order");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public static final Unit m63145B4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public static final void m63146C4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m63150G4(KlineSettingsNewDialog klineSettingsNewDialog) {
        klineSettingsNewDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m63151H4(KlineSettingsNewDialog klineSettingsNewDialog, KLineSettingConfig kLineSettingConfig) {
        klineSettingsNewDialog.m63169u4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public static final void m63152I4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y4 */
    public static final boolean m63166y4(KlineSettingsNewDialog klineSettingsNewDialog) {
        Bundle arguments = klineSettingsNewDialog.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("key_show_history_order");
        }
        return false;
    }

    /* JADX INFO: renamed from: J4 */
    public final void m63167J4(String str, Bundle bundle) {
        BaseActivity baseActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            baseActivity.setFragmentResult(str, bundle);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m63169u4() {
        boolean zIsChanged = m63171w4().isChanged(m63172x4(), m63173z4());
        C44128b.m97266j("KlineSettingsNewDialog", "[checkToUpdateConfig] changed:" + zIsChanged);
        if (zIsChanged) {
            m63167J4("result_config_update", BundleKt.bundleOf(TuplesKt.m90091to("result_config_update", m63171w4())));
        }
    }
}
