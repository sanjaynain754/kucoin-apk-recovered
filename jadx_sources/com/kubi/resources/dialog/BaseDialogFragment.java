package com.kubi.resources.dialog;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.ReflectUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.resources.C22912t;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.exception.ComponentException;
import com.kubi.sdk.res.R$style;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43853n;
import p569qq.InterfaceC43845f;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseDialogFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001LB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\b\u0010*\u001a\u00020\u001fH\u0016J\b\u0010+\u001a\u00020\u0019H\u0002J\u0014\u0010,\u001a\u00020\u001f2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.H\u0002J\u0012\u0010/\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u00100\u001a\u00020\u001fH\u0016J\u001a\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u00010\rJ\u001a\u00101\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u0001062\b\u00104\u001a\u0004\u0018\u00010\rJ\u001a\u00101\u001a\u00020\u001f2\u0006\u00107\u001a\u0002082\b\u00104\u001a\u0004\u0018\u00010\rH\u0017J\u0006\u00109\u001a\u00020\u001fJ\b\u0010:\u001a\u00020\u001fH\u0016J\b\u0010;\u001a\u00020\u001fH\u0016J\b\u0010<\u001a\u00020\u001fH\u0016J\b\u0010=\u001a\u00020\u001fH\u0016J\b\u0010>\u001a\u00020\u001fH\u0016J\b\u0010?\u001a\u00020\u001fH\u0002J\u0012\u0010@\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u0019H\u0002J\u0012\u0010B\u001a\u00020\u00192\b\u0010C\u001a\u0004\u0018\u000108H\u0002J\u000e\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020FJ\b\u0010G\u001a\u00020\u001fH\u0016J\b\u0010H\u001a\u00020\u0019H\u0016J\b\u0010I\u001a\u00020\u0019H\u0016J\n\u0010J\u001a\u0004\u0018\u00010KH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006M"}, m90084d2 = {"Lcom/kubi/resources/dialog/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/kubi/monitor/ITrackPage;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "<init>", "()V", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDestroyDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setDestroyDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "value", "dialogTag", "getDialogTag", "completableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "getCompletableDeferred", "()Lkotlinx/coroutines/CompletableDeferred;", "setOnDismissListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "dismiss", "dismissAllowingStateLoss", "tryDismissWithAnimation", "dismissWithAnimation", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "onCreate", "onDestroyView", TIMPushProvider.f75062n, "act", "Landroidx/fragment/app/FragmentActivity;", "tag", "frag", "Landroidx/fragment/app/Fragment;", "manager", "Landroidx/fragment/app/FragmentManager;", "setNonCancelable", "onStart", "onResume", "onPause", "onStop", "onDestroy", "dismissAfterAnimation", "isIllegalState", "ignoreDialogCheck", "isExecutingActions", "fragmentManager", "addDisposable", "disposable", "Lio/reactivex/disposables/Disposable;", "onGlobalLayout", "isBottomSheet", "isBottomWindowAnimation", "getViewTreeObserver", "Landroid/view/ViewTreeObserver;", "BottomSheetDismissCallback", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialogFragment.kt\ncom/kubi/resources/dialog/BaseDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n*L\n1#1,322:1\n1#2:323\n44#3,2:324\n*S KotlinDebug\n*F\n+ 1 BaseDialogFragment.kt\ncom/kubi/resources/dialog/BaseDialogFragment\n*L\n272#1:324,2\n*E\n"})
public class BaseDialogFragment extends DialogFragment implements InterfaceC43845f, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f43551V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public DialogInterface.OnDismissListener f43552W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f43553X;

    /* JADX INFO: renamed from: U */
    @NotNull
    public CompositeDisposable f43550U = new CompositeDisposable();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41769w<Boolean> f43554Y = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: com.kubi.resources.dialog.BaseDialogFragment$a */
    /* JADX INFO: compiled from: BaseDialogFragment.kt */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/resources/dialog/BaseDialogFragment$BottomSheetDismissCallback;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "<init>", "(Lcom/kubi/resources/dialog/BaseDialogFragment;)V", "onStateChanged", "", "bottomSheet", "Landroid/view/View;", "newState", "", "onSlide", "slideOffset", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C22880a extends BottomSheetBehavior.BottomSheetCallback {
        public C22880a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NotNull View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NotNull View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 5) {
                BaseDialogFragment.this.dismissAfterAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final boolean m54184q3(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        return i11 == 4;
    }

    public final void dismissAfterAnimation() {
        if (m54183o3(this, false, 1, null)) {
            return;
        }
        try {
            super.dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (m54183o3(this, false, 1, null)) {
            return;
        }
        try {
            if (mo15372k3() && m54195u3()) {
                super.dismissAllowingStateLoss();
            } else {
                super.dismissAllowingStateLoss();
            }
        } catch (Exception unused) {
        }
        C43853n.m96607a(this);
    }

    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return false;
    }

    /* JADX INFO: renamed from: l3 */
    public boolean mo32432l3() {
        return true;
    }

    /* JADX INFO: renamed from: m3 */
    public final boolean m54189m3(FragmentManager fragmentManager) {
        try {
            Boolean bool = (Boolean) ReflectUtils.m6074o(fragmentManager).m6077d("mExecutingActions").m6079f();
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception e11) {
            C43846g.m96568c(new ComponentException(e11, "BaseDialogFragment", false, null, 8, null), null, 2, null);
            return false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Dialog dialog;
        Window window;
        if (m54190n3(true) || !isAdded() || isRemoving() || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (decorView.isAttachedToWindow()) {
            int[] iArr = new int[2];
            decorView.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            Rect rect = new Rect(i11, iArr[1], decorView.getMeasuredWidth() + i11, iArr[1] + decorView.getMeasuredHeight());
            int iM6182d = C5267e0.m6182d();
            int i12 = rect.top;
            EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
            if (i12 < edgeToEdgeCompat.m58272j()) {
                edgeToEdgeCompat.m58280r(window, null);
            }
            if (rect.bottom > iM6182d - edgeToEdgeCompat.m58271i()) {
                edgeToEdgeCompat.m58278p(window, null);
            }
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m54191p3() {
        setCancelable(false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: bw.g
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                    return BaseDialogFragment.m54184q3(dialogInterface, i11, keyEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ boolean m54183o3(BaseDialogFragment baseDialogFragment, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isIllegalState");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return baseDialogFragment.m54190n3(z11);
    }

    /* JADX INFO: renamed from: f3 */
    public final void m54185f3(@NotNull Disposable disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.f43550U.add(disposable);
    }

    @NotNull
    /* JADX INFO: renamed from: getDestroyDisposable, reason: from getter */
    public final CompositeDisposable getF43550U() {
        return this.f43550U;
    }

    @Override // p569qq.InterfaceC43845f
    @Nullable
    public String getPageId() {
        return this.f43551V;
    }

    @NotNull
    /* JADX INFO: renamed from: h3 */
    public final InterfaceC41769w<Boolean> m54187h3() {
        return this.f43554Y;
    }

    @Nullable
    /* JADX INFO: renamed from: i3, reason: from getter */
    public final String getF43553X() {
        return this.f43553X;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f43552W;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ViewTreeObserver viewTreeObserverM54182j3;
        Intrinsics.checkNotNullParameter(view, "view");
        if (getDialog() == null) {
            setShowsDialog(false);
        }
        super.onViewCreated(view, savedInstanceState);
        if (Build.VERSION.SDK_INT < 35 || mo15372k3() || (viewTreeObserverM54182j3 = m54182j3()) == null) {
            return;
        }
        viewTreeObserverM54182j3.addOnGlobalLayoutListener(this);
    }

    @NotNull
    /* JADX INFO: renamed from: r3 */
    public final BaseDialogFragment m54192r3(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.f43552W = onDismissListener;
        return this;
    }

    /* JADX INFO: renamed from: s3 */
    public final void m54193s3(@Nullable Fragment fragment, @Nullable String str) {
        FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
        if (fragment == null || activity == null || C22912t.m54413k(fragment) || !fragment.isAdded() || fragment.isDetached()) {
            return;
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        show(childFragmentManager, str);
    }

    public void setPageId(@Nullable String str) {
        this.f43551V = str;
    }

    @Override // androidx.fragment.app.DialogFragment
    @Deprecated(message = "内部无法判断触发显示DialogFragment的activity是不是在销毁状态了", replaceWith = @ReplaceWith(expression = "show(act,tag) or show(frag,tag)", imports = {}))
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f43553X = tag;
        C43840a.m96551e("BaseDialogFragment, tag:" + tag, null, 2, null);
        if (m54190n3(true)) {
            return;
        }
        if (manager.isDestroyed() || manager.isStateSaved() || m54189m3(manager)) {
            this.f43550U.dispose();
            this.f43554Y.mo90415a(new CancellationException("manager not alive"));
            return;
        }
        if (isAdded() || isRemoving() || !(tag == null || manager.findFragmentByTag(tag) == null)) {
            String f43551v = getPageId();
            if (f43551v == null) {
                f43551v = toString();
                Intrinsics.checkNotNullExpressionValue(f43551v, "toString(...)");
            }
            C43840a.m96552g(f43551v, "dialog");
            return;
        }
        if (!GlobalDialogManager.f43651a.m54337b(this)) {
            if (tag != null) {
                C43846g.m96571f("LAST_DIALOG", tag);
            }
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            if (tag == null) {
                tag = fragmentTransactionBeginTransaction.getClass().getName();
            }
            fragmentTransactionBeginTransaction.add(this, tag);
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            C43853n.m96608b(this);
            return;
        }
        String f43551v2 = getPageId();
        if (f43551v2 == null) {
            f43551v2 = this + "is intercepted";
        }
        C43840a.m96552g(f43551v2, "dialog");
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        String name = this.f43553X;
        if (name == null) {
            name = eventParametersBuilderAcquire.getClass().getName();
        }
        Intrinsics.checkNotNull(name);
        eventParametersBuilderAcquire.m42393d("category", name);
        String f43551v3 = getPageId();
        if (f43551v3 == null) {
            f43551v3 = eventParametersBuilderAcquire.toString();
        }
        eventParametersBuilderAcquire.m42393d("path", f43551v3);
        TechnologyEvent.m42388d("dialog_block", eventParametersBuilderAcquire);
        this.f43550U.dispose();
        this.f43554Y.mo90415a(new CancellationException("interceptor handled"));
    }

    /* JADX INFO: renamed from: t3 */
    public final void m54194t3(@Nullable FragmentActivity fragmentActivity, @Nullable String str) {
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        show(supportFragmentManager, str);
    }

    /* JADX INFO: renamed from: j3 */
    private final ViewTreeObserver m54182j3() {
        Window window;
        View decorView;
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        if (decorView == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: g3 */
    public final void m54186g3(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetDialog bottomSheetDialog;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            bottomSheetDialog = (BottomSheetDialog) dialog;
        } else {
            bottomSheetDialog = null;
        }
        if (bottomSheetDialog != null) {
            try {
                ReflectUtils.m6074o(bottomSheetDialog).m6085l("removeDefaultCallback");
            } catch (Exception unused) {
                Unit unit = Unit.INSTANCE;
            }
        }
        bottomSheetBehavior.addBottomSheetCallback(new C22880a());
        bottomSheetBehavior.setState(5);
    }

    /* JADX INFO: renamed from: n3 */
    public final boolean m54190n3(boolean z11) {
        FragmentActivity activity;
        Dialog dialog;
        FragmentActivity activity2 = getActivity();
        if ((activity2 != null && activity2.isFinishing()) || ((activity = getActivity()) != null && activity.isDestroyed())) {
            return true;
        }
        if (!z11 && (dialog = getDialog()) != null && !dialog.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.Theme.Holo.Dialog.NoActionBar);
        GlobalDialogManager.f43651a.m54338c(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        if (mo15372k3()) {
            if (mo32432l3()) {
                return new BottomSheetDialog(requireContext(), R$style.BottomSheetStyle);
            }
            return new BottomSheetDialog(requireContext(), R$style.BottomSheetStyleNoAnim);
        }
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNull(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        GlobalDialogManager.f43651a.m54339d(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewTreeObserver viewTreeObserverM54182j3;
        Dialog dialog = getDialog();
        if (dialog != null) {
            if (!getRetainInstance()) {
                dialog = null;
            }
            if (dialog != null) {
                dialog.setDismissMessage(null);
            }
        }
        this.f43550U.dispose();
        this.f43554Y.mo91370n(Boolean.TRUE);
        if (Build.VERSION.SDK_INT >= 35 && !mo15372k3() && (viewTreeObserverM54182j3 = m54182j3()) != null) {
            viewTreeObserverM54182j3.removeOnGlobalLayoutListener(this);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        GlobalDialogManager.f43651a.m54340e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        GlobalDialogManager.f43651a.m54341f(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        try {
            super.onStart();
            GlobalDialogManager.f43651a.m54342g(this);
        } catch (Exception unused) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        GlobalDialogManager.f43651a.m54343h(this);
    }

    /* JADX INFO: renamed from: u3 */
    public final boolean m54195u3() {
        BottomSheetDialog bottomSheetDialog;
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            bottomSheetDialog = (BottomSheetDialog) dialog;
        } else {
            bottomSheetDialog = null;
        }
        if (bottomSheetDialog == null) {
            return false;
        }
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior, "getBehavior(...)");
        if (!behavior.isHideable() || !bottomSheetDialog.getDismissWithAnimation()) {
            return false;
        }
        m54186g3(behavior);
        return true;
    }
}
