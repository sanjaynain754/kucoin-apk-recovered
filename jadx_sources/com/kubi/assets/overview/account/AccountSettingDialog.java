package com.kubi.assets.overview.account;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.sort.AccountTabSortSettingFragment;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
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
import p569qq.C43852m;
import p637ta.C44829o;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
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

/* JADX INFO: compiled from: AccountSettingDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/overview/account/AccountSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "consumer", "Lio/reactivex/functions/Consumer;", "", "<init>", "(Lio/reactivex/functions/Consumer;)V", "binding", "Lcom/kubi/assets/databinding/AssetDialogAccountSettingBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogAccountSettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "debounceSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "isChecked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "isBottomSheet", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "saveHideStatus", "isHide", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountSettingDialog.kt\ncom/kubi/assets/overview/account/AccountSettingDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,93:1\n143#2,20:94\n*S KotlinDebug\n*F\n+ 1 AccountSettingDialog.kt\ncom/kubi/assets/overview/account/AccountSettingDialog\n*L\n33#1:94,20\n*E\n"})
public final class AccountSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f18219u0 = {Reflection.property1(new PropertyReference1Impl(AccountSettingDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogAccountSettingBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Consumer<Boolean> f18220q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f18221r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final BehaviorSubject<Boolean> f18222s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f18223t0;

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    public AccountSettingDialog(@NotNull Consumer<Boolean> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f18220q0 = consumer;
        this.f18221r0 = C45681e.m100799e(this, new Function1<AccountSettingDialog, C44829o>() { // from class: com.kubi.assets.overview.account.AccountSettingDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44829o invoke(@NotNull AccountSettingDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C44829o.m99184a(fragment.requireView());
            }
        }, new Function1<C44829o, Unit>() { // from class: com.kubi.assets.overview.account.AccountSettingDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C44829o it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44829o c44829o) {
                invoke(c44829o);
                return Unit.INSTANCE;
            }
        });
        BehaviorSubject<Boolean> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f18222s0 = behaviorSubjectCreate;
        this.f18223t0 = C10615q.m18400a();
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m18357q4(AccountSettingDialog accountSettingDialog, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        accountSettingDialog.f18223t0 = z11;
        accountSettingDialog.f18222s0.onNext(Boolean.valueOf(z11));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_account_setting, container, false);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) throws Exception {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        m18364w4(this.f18223t0);
        this.f18220q0.accept(Boolean.valueOf(this.f18223t0));
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        LinearLayout linearLayout;
        KuCheckBox kuCheckBox;
        KuCheckBox kuCheckBox2;
        KuCheckBox kuCheckBox3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44829o c44829oM18363p4 = m18363p4();
        if (c44829oM18363p4 != null && (kuCheckBox3 = c44829oM18363p4.f100528b) != null) {
            kuCheckBox3.setChecked(this.f18223t0);
        }
        C44829o c44829oM18363p5 = m18363p4();
        if (c44829oM18363p5 != null && (kuCheckBox2 = c44829oM18363p5.f100528b) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getString(R$string.kc_asset_sort_hide_small);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            SmallEntity smallEntityM19164h = AssetsHelper.f18684a.m19164h();
            String str = String.format(string, Arrays.copyOf(new Object[]{smallEntityM19164h != null ? smallEntityM19164h.getQuotaLimit() : null}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            kuCheckBox2.setText(str);
        }
        C44829o c44829oM18363p6 = m18363p4();
        if (c44829oM18363p6 != null && (kuCheckBox = c44829oM18363p6.f100528b) != null) {
            C27046k.m66708w(kuCheckBox, new Function2() { // from class: com.kubi.assets.overview.account.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSettingDialog.m18357q4(this.f18232b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        Observable<Boolean> observableObserveOn = this.f18222s0.debounce(1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.overview.account.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSettingDialog.m18358r4(this.f18233b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.overview.account.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AccountSettingDialog.m18359s4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.overview.account.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSettingDialog.m18360t4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.overview.account.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AccountSettingDialog.m18361u4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
        C44829o c44829oM18363p7 = m18363p4();
        if (c44829oM18363p7 == null || (linearLayout = c44829oM18363p7.f100529c) == null) {
            return;
        }
        C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.assets.overview.account.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountSettingDialog.m18362v4(this.f18236b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p4 */
    public final C44829o m18363p4() {
        return (C44829o) this.f18221r0.getValue(this, f18219u0[0]);
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m18358r4(AccountSettingDialog accountSettingDialog, Boolean bool) throws Exception {
        String str;
        if (bool.booleanValue()) {
            str = TIMPushProvider.f75063o;
        } else {
            str = "unhide";
        }
        C43852m.m96590b("B1overview", "set", "hideSmallBalance", TuplesKt.m90091to("after_click_element_value", str));
        Intrinsics.checkNotNull(bool);
        accountSettingDialog.m18364w4(bool.booleanValue());
        accountSettingDialog.f18220q0.accept(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public static final void m18359s4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public static final Unit m18360t4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public static final void m18361u4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m18362v4(AccountSettingDialog accountSettingDialog) {
        accountSettingDialog.dismissAllowingStateLoss();
        if (accountSettingDialog.getContext() != null) {
            AccountTabSortSettingFragment.Companion companion = AccountTabSortSettingFragment.f18757Z;
            Context contextRequireContext = accountSettingDialog.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            companion.launchPageOnCase(contextRequireContext);
        }
        C43852m.m96591c("B1overview", "set", "manageAccounts", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public final void m18364w4(boolean z11) {
        C10615q.m18401b(z11);
    }
}
