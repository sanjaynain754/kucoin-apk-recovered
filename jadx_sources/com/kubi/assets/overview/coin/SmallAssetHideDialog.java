package com.kubi.assets.overview.coin;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44753e0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;
import y70.C46396e;

/* JADX INFO: compiled from: SmallAssetHideDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/overview/coin/SmallAssetHideDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "consumer", "Lio/reactivex/functions/Consumer;", "", "<init>", "(Lio/reactivex/functions/Consumer;)V", "binding", "Lcom/kubi/assets/databinding/AssetDialogSmallAssetHideBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogSmallAssetHideBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "debounceSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "isChecked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "isBottomSheet", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "saveHideStatus", "isHide", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSmallAssetHideDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallAssetHideDialog.kt\ncom/kubi/assets/overview/coin/SmallAssetHideDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,91:1\n143#2,20:92\n*S KotlinDebug\n*F\n+ 1 SmallAssetHideDialog.kt\ncom/kubi/assets/overview/coin/SmallAssetHideDialog\n*L\n35#1:92,20\n*E\n"})
public final class SmallAssetHideDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f18269u0 = {Reflection.property1(new PropertyReference1Impl(SmallAssetHideDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogSmallAssetHideBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Consumer<Boolean> f18270q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f18271r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final BehaviorSubject<Boolean> f18272s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f18273t0;

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    public SmallAssetHideDialog(@NotNull Consumer<Boolean> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f18270q0 = consumer;
        this.f18271r0 = C45681e.m100799e(this, new Function1<SmallAssetHideDialog, C44753e0>() { // from class: com.kubi.assets.overview.coin.SmallAssetHideDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44753e0 invoke(@NotNull SmallAssetHideDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C44753e0.m99020a(fragment.requireView());
            }
        }, new Function1<C44753e0, Unit>() { // from class: com.kubi.assets.overview.coin.SmallAssetHideDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C44753e0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44753e0 c44753e0) {
                invoke(c44753e0);
                return Unit.INSTANCE;
            }
        });
        BehaviorSubject<Boolean> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f18272s0 = behaviorSubjectCreate;
        this.f18273t0 = C46396e.m102347d("asset", C10642g.f18281a.m18519a(), false);
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m18511q4(SmallAssetHideDialog smallAssetHideDialog, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        smallAssetHideDialog.f18273t0 = z11;
        smallAssetHideDialog.f18272s0.onNext(Boolean.valueOf(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    private final void m18517w4(boolean z11) {
        C46396e.m102354k("asset", C10642g.f18281a.m18519a(), z11);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_small_asset_hide, container, false);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) throws Exception {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        m18517w4(this.f18273t0);
        this.f18270q0.accept(Boolean.valueOf(this.f18273t0));
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcSecondaryButton kcSecondaryButton;
        KuCheckBox kuCheckBox;
        KuCheckBox kuCheckBox2;
        KuCheckBox kuCheckBox3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44753e0 c44753e0M18518p4 = m18518p4();
        if (c44753e0M18518p4 != null && (kuCheckBox3 = c44753e0M18518p4.f99791b) != null) {
            kuCheckBox3.setChecked(this.f18273t0);
        }
        C44753e0 c44753e0M18518p5 = m18518p4();
        if (c44753e0M18518p5 != null && (kuCheckBox2 = c44753e0M18518p5.f99791b) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getString(R$string.kc_assets_coin_empty_dialog);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            SmallEntity smallEntityM19164h = AssetsHelper.f18684a.m19164h();
            String str = String.format(string, Arrays.copyOf(new Object[]{C27041f.m66668h(smallEntityM19164h != null ? smallEntityM19164h.showString() : null)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            kuCheckBox2.setText(str);
        }
        C44753e0 c44753e0M18518p6 = m18518p4();
        if (c44753e0M18518p6 != null && (kuCheckBox = c44753e0M18518p6.f99791b) != null) {
            C27046k.m66708w(kuCheckBox, new Function2() { // from class: com.kubi.assets.overview.coin.s
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SmallAssetHideDialog.m18511q4(this.f18294b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        Observable<Boolean> observableObserveOn = this.f18272s0.debounce(1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.overview.coin.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SmallAssetHideDialog.m18512r4(this.f18295b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.overview.coin.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SmallAssetHideDialog.m18513s4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.overview.coin.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SmallAssetHideDialog.m18514t4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.overview.coin.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SmallAssetHideDialog.m18515u4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
        C44753e0 c44753e0M18518p7 = m18518p4();
        if (c44753e0M18518p7 == null || (kcSecondaryButton = c44753e0M18518p7.f99792c) == null) {
            return;
        }
        C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.overview.coin.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SmallAssetHideDialog.m18516v4(this.f18298b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p4 */
    public final C44753e0 m18518p4() {
        return (C44753e0) this.f18271r0.getValue(this, f18269u0[0]);
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m18512r4(SmallAssetHideDialog smallAssetHideDialog, Boolean bool) throws Exception {
        Intrinsics.checkNotNull(bool);
        smallAssetHideDialog.m18517w4(bool.booleanValue());
        smallAssetHideDialog.f18270q0.accept(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public static final void m18513s4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public static final Unit m18514t4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public static final void m18515u4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m18516v4(SmallAssetHideDialog smallAssetHideDialog) {
        smallAssetHideDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
