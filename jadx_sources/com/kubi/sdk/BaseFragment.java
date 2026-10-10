package com.kubi.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.exception.AppBaseException;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.AbstractC27013a0;
import com.kubi.utils.C27019d;
import com.kubi.utils.C27084r0;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k10.DialogC40864b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43853n;
import p569qq.InterfaceC43845f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: BaseFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0094\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00106\u001a\u0002072\b\b\u0001\u00108\u001a\u000207J-\u00109\u001a\u00020\r2\b\b\u0001\u0010:\u001a\u0002072\u0016\u0010;\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001000<\"\u0004\u0018\u000100¢\u0006\u0002\u0010=J\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0<2\b\b\u0001\u0010:\u001a\u000207¢\u0006\u0002\u0010?J!\u0010@\u001a\u0004\u0018\u0001HA\"\b\b\u0000\u0010A*\u00020\"2\b\b\u0001\u0010B\u001a\u000207¢\u0006\u0002\u0010CJ\u0012\u0010.\u001a\b\u0012\u0004\u0012\u0002HA0D\"\u0004\b\u0000\u0010AJ$\u0010E\u001a\u0004\u0018\u00010\"2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010KJ$\u0010E\u001a\u00020\"2\u0006\u0010F\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010H\u001a\u0004\u0018\u00010IH&J\u001a\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\"2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0010\u0010O\u001a\u00020M2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010P\u001a\u00020M2\u0006\u0010Q\u001a\u00020\u0007H\u0016J\b\u0010R\u001a\u00020MH\u0016J\b\u0010S\u001a\u00020MH\u0016J\u0018\u0010T\u001a\u00020M2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010V\u001a\u00020KJ\u0016\u0010W\u001a\u00020M2\u0006\u0010U\u001a\u00020\r2\u0006\u0010X\u001a\u00020YJ\b\u0010Z\u001a\u00020MH\u0016J\b\u0010[\u001a\u00020\u0007H\u0016J\b\u0010\\\u001a\u00020MH\u0016J\u0006\u0010]\u001a\u00020\u0007J\u0006\u0010^\u001a\u00020\u0007J\u0010\u0010_\u001a\u00020M2\b\u0010V\u001a\u0004\u0018\u00010KJ\u0012\u0010`\u001a\u00020M2\b\u0010V\u001a\u0004\u0018\u00010KH\u0016J\u0012\u0010a\u001a\u00020M2\b\u0010V\u001a\u0004\u0018\u00010KH\u0002J\b\u0010b\u001a\u00020MH\u0002J\b\u0010c\u001a\u00020MH\u0002J\b\u0010d\u001a\u00020MH\u0002J\b\u0010e\u001a\u00020MH\u0002J\b\u0010f\u001a\u00020MH\u0002J\b\u0010g\u001a\u00020MH\u0002J\b\u0010h\u001a\u00020MH\u0002J\b\u0010i\u001a\u00020MH\u0002J\b\u0010j\u001a\u00020MH\u0016J\b\u0010k\u001a\u00020MH\u0016J\b\u0010l\u001a\u00020MH\u0016J\b\u0010m\u001a\u00020MH\u0016J\u0006\u0010n\u001a\u00020MJ\u0010\u0010o\u001a\u00020M2\b\b\u0002\u0010p\u001a\u00020\u0007J\u0006\u0010q\u001a\u00020\u0007J\r\u0010r\u001a\u0004\u0018\u000107¢\u0006\u0002\u0010sJ\u001c\u0010t\u001a\u00020M2\b\b\u0003\u00108\u001a\u0002072\b\b\u0002\u0010u\u001a\u000207H\u0016J\b\u0010v\u001a\u00020MH\u0016J&\u0010w\u001a\u00020M2\b\b\u0002\u0010x\u001a\u0002072\b\b\u0002\u0010y\u001a\u0002072\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{J$\u0010w\u001a\u00020M2\u0006\u0010x\u001a\u00020|2\b\b\u0002\u0010y\u001a\u0002072\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{J(\u0010}\u001a\u00020M2\b\b\u0002\u0010x\u001a\u0002072\b\b\u0002\u0010y\u001a\u0002072\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{H\u0016J$\u0010}\u001a\u00020M2\u0006\u0010x\u001a\u00020|2\b\b\u0002\u0010y\u001a\u0002072\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{J\u001a\u0010~\u001a\u00020M2\u0006\u0010x\u001a\u00020|2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{J\"\u0010~\u001a\u00020M2\u0006\u0010x\u001a\u00020|2\u0006\u00108\u001a\u0002072\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{J\u0016\u0010\u007f\u001a\u00020M2\u000e\u0010\u0080\u0001\u001a\t\u0012\u0004\u0012\u00020M0\u0081\u0001J/\u0010\u007f\u001a\u00020M2\u000e\u0010\u0080\u0001\u001a\t\u0012\u0004\u0012\u00020M0\u0081\u00012\n\b\u0002\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0012J'\u0010\u008a\u0001\u001a\u00020M2\u0007\u0010\u008b\u0001\u001a\u0002072\u0007\u0010\u008c\u0001\u001a\u0002072\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016J$\u0010\u008f\u0001\u001a\u00020M2\b\u0010\u0090\u0001\u001a\u00030\u008e\u00012\u0011\u0010\u0091\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u00010\u0092\u0001J\u000b\u0010\u0093\u0001\u001a\u0004\u0018\u00010(H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\"X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u0010\u0085\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010 \u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u0095\u0001"}, m90084d2 = {"Lcom/kubi/sdk/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kubi/sdk/IBackCallback;", "Lcom/kubi/monitor/ITrackPage;", "<init>", "()V", "isViewCreated", "", "isVisibleToUser", "isDataLoaded", "showCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDestroyDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "visibleDisposable", "getVisibleDisposable", "pageId", "getPageId", "setPageId", "(Ljava/lang/String;)V", "titleBar", "Lcom/kubi/sdk/widget/TitleBar;", "getTitleBar", "()Lcom/kubi/sdk/widget/TitleBar;", "titleBar$delegate", "Lkotlin/Lazy;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingDialog", "Lcom/kubi/sdk/widget/loading/LoadingDialog;", "getLoadingDialog", "()Lcom/kubi/sdk/widget/loading/LoadingDialog;", "loadingDialog$delegate", "showPredicate", "Lcom/kubi/utils/ShowPredicate;", "", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getColorRes", "", "color", "getStringRes", "id", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArrayRes", "(I)[Ljava/lang/String;", "findViewById", ExifInterface.GPS_DIRECTION_TRUE, "idRes", "(I)Landroid/view/View;", "Lcom/kubi/utils/LastPredicate;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setUserVisibleHint", "onHiddenChanged", ViewProps.HIDDEN, "onResume", "onPause", "setFragmentResult", "requestKey", "bundle", "setFragmentResultListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/sdk/FragmentResultListener;", "preformBackPressed", "onBackPressed", "onDestroyView", "isShowing", "isParentShow", "performArguments", "onArguments", "dispatchChildArguments", "preformLoad", "dispatchChildLoad", "performShowAndLoad", "scheduleDeferredDispatchChildShow", "preformShow", "dispatchChildShow", "preformHide", "dispatchChildHide", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onAgainShow", "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "showLoadingDialog", "hideLoadingDialog", "dismiss", "loadingDialogShowing", "getViewStatus", "()Ljava/lang/Integer;", "showLoadingView", "gravity", "showContentView", "showEmptyView", "tips", TUIConstants.TUIChat.INPUT_MORE_ICON, "click", "Landroid/view/View$OnClickListener;", "", "showFailView", "showErrorView", "runOnUiThread", "block", "Lkotlin/Function0;", "delay", "", "composite", "resultDelegate", "Lcom/kubi/sdk/ResultDelegate;", "getResultDelegate", "()Lcom/kubi/sdk/ResultDelegate;", "resultDelegate$delegate", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "startActivityWithResult", "intent", "callBack", "Lio/reactivex/functions/Consumer;", "getLoadingViewForTest", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/kubi/sdk/BaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,404:1\n1#2:405\n45#3,2:406\n808#4,11:408\n1869#4,2:419\n808#4,11:421\n1869#4,2:432\n808#4,11:434\n1869#4,2:445\n808#4,11:447\n1869#4,2:458\n*S KotlinDebug\n*F\n+ 1 BaseFragment.kt\ncom/kubi/sdk/BaseFragment\n*L\n108#1:406,2\n214#1:408,11\n214#1:419,2\n232#1:421,11\n232#1:432,2\n274#1:434,11\n274#1:445,2\n294#1:447,11\n294#1:458,2\n*E\n"})
public abstract class BaseFragment extends Fragment implements IBackCallback, InterfaceC43845f {

    @NotNull
    public static final String FRAGMENT_BACK = "fragment_back";
    public View contentView;
    private boolean isDataLoaded;
    private boolean isViewCreated;
    private boolean isVisibleToUser;

    @Nullable
    private WrapperLoadingView loadingView;

    @Nullable
    private String pageId;

    @NotNull
    private final AtomicInteger showCount = new AtomicInteger();
    private final String TAG = getClass().getSimpleName();

    @NotNull
    private final CompositeDisposable destroyDisposable = new CompositeDisposable();

    @NotNull
    private final CompositeDisposable visibleDisposable = new CompositeDisposable();

    /* JADX INFO: renamed from: titleBar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleBar = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseFragment.titleBar_delegate$lambda$0(this.f46833b);
        }
    });

    /* JADX INFO: renamed from: loadingDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseFragment.loadingDialog_delegate$lambda$1(this.f46842b);
        }
    });

    @NotNull
    private final C27084r0<Object> showPredicate = new C27084r0<>();
    private boolean needLoadingView = true;

    /* JADX INFO: renamed from: resultDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultDelegate = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseFragment.resultDelegate_delegate$lambda$12();
        }
    });

    public static /* synthetic */ void showEmptyView$default(BaseFragment baseFragment, int i11, int i12, View.OnClickListener onClickListener, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyView");
        }
        if ((i13 & 1) != 0) {
            i11 = R$string.no_more_data;
        }
        if ((i13 & 2) != 0) {
            i12 = R$drawable.ic2_common_empty;
        }
        if ((i13 & 4) != 0) {
            onClickListener = null;
        }
        baseFragment.showEmptyView(i11, i12, onClickListener);
    }

    public static /* synthetic */ void showErrorView$default(BaseFragment baseFragment, CharSequence charSequence, View.OnClickListener onClickListener, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorView");
        }
        if ((i11 & 2) != 0) {
            onClickListener = null;
        }
        baseFragment.showErrorView(charSequence, onClickListener);
    }

    public static /* synthetic */ void showFailView$default(BaseFragment baseFragment, int i11, int i12, View.OnClickListener onClickListener, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFailView");
        }
        if ((i13 & 1) != 0) {
            i11 = R$string.load_failed_click_retry;
        }
        if ((i13 & 2) != 0) {
            i12 = R$drawable.ic2_common_system_maintain;
        }
        if ((i13 & 4) != 0) {
            onClickListener = null;
        }
        baseFragment.showFailView(i11, i12, onClickListener);
    }

    public boolean onBackPressed() {
        return false;
    }

    @NotNull
    public abstract View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container);

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Object objM103844constructorimpl;
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        C43846g.m96571f("LAST_FRAGMENT", simpleName);
        setContentView(onCreateView(inflater, savedInstanceState, container));
        if (!getF26346V()) {
            return getContentView();
        }
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(new WrapperLoadingView(inflater.getContext(), getContentView()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new AppBaseException(thM103847exceptionOrNullimpl, "BaseFragmentLoadingView", false, null, 8, null), null, 2, null);
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            this.loadingView = (WrapperLoadingView) objM103844constructorimpl;
            Bundle arguments = getArguments();
            if (arguments != null) {
                int i11 = arguments.getInt(FRAGMENT_BACK);
                WrapperLoadingView wrapperLoadingView2 = this.loadingView;
                viewGroup = wrapperLoadingView2 != null ? wrapperLoadingView2 : null;
                if (viewGroup != null) {
                    viewGroup.setBackgroundResource(i11);
                }
            }
        } else {
            ViewParent parent = wrapperLoadingView != null ? wrapperLoadingView.getParent() : null;
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.loadingView);
            }
        }
        WrapperLoadingView wrapperLoadingView3 = this.loadingView;
        return wrapperLoadingView3 != null ? wrapperLoadingView3 : getContentView();
    }

    public final void runOnUiThread(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        runOnUiThread(block, 0L, null);
    }

    public final void showEmptyView(int tips, int icon, @Nullable View.OnClickListener click) {
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(tips, icon, click);
        }
    }

    public final void showErrorView(@NotNull CharSequence tips, @Nullable View.OnClickListener click) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showError(tips, click);
        }
    }

    public void showFailView(int tips, int icon, @Nullable View.OnClickListener click) {
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(tips, icon, click);
        }
    }

    private final DialogC40864b getLoadingDialog() {
        return (DialogC40864b) this.loadingDialog.getValue();
    }

    private final ResultDelegate getResultDelegate() {
        return (ResultDelegate) this.resultDelegate.getValue();
    }

    public static /* synthetic */ void hideLoadingDialog$default(BaseFragment baseFragment, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideLoadingDialog");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        baseFragment.hideLoadingDialog(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialogC40864b loadingDialog_delegate$lambda$1(BaseFragment baseFragment) {
        Context contextRequireContext = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new DialogC40864b(contextRequireContext, false, 2, null);
    }

    private final void preformHide() {
        if (this.isViewCreated && this.isVisibleToUser) {
            C44128b.m97268l(this.TAG, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE);
            this.isVisibleToUser = false;
            this.visibleDisposable.clear();
            this.showPredicate.m66839d();
            onHide();
            dispatchChildHide();
            C43853n.m96607a(this);
        }
    }

    private final void preformLoad() {
        if (!this.isDataLoaded && this.isViewCreated && isShowing()) {
            C44128b.m97268l(this.TAG, "onLoad");
            this.isDataLoaded = true;
            onLoad();
            dispatchChildLoad();
            performArguments(getArguments());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResultDelegate resultDelegate_delegate$lambda$12() {
        return new ResultDelegate();
    }

    public static /* synthetic */ void runOnUiThread$default(BaseFragment baseFragment, Function0 function0, long j11, CompositeDisposable compositeDisposable, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runOnUiThread");
        }
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        if ((i11 & 4) != 0) {
            compositeDisposable = null;
        }
        baseFragment.runOnUiThread(function0, j11, compositeDisposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleDeferredDispatchChildShow$lambda$7(BaseFragment baseFragment) {
        if (baseFragment.isViewCreated && baseFragment.isVisibleToUser) {
            baseFragment.dispatchChildShow();
        }
    }

    public static /* synthetic */ void setFragmentResult$default(BaseFragment baseFragment, String str, Bundle bundle, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFragmentResult");
        }
        if ((i11 & 2) != 0) {
            bundle = new Bundle();
        }
        baseFragment.setFragmentResult(str, bundle);
    }

    public static /* synthetic */ void showErrorView$default(BaseFragment baseFragment, CharSequence charSequence, int i11, View.OnClickListener onClickListener, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorView");
        }
        if ((i12 & 4) != 0) {
            onClickListener = null;
        }
        baseFragment.showErrorView(charSequence, i11, onClickListener);
    }

    public static /* synthetic */ void showLoadingView$default(BaseFragment baseFragment, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadingView");
        }
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 17;
        }
        baseFragment.showLoadingView(i11, i12);
    }

    @NotNull
    public final View getContentView() {
        View view = this.contentView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentView");
        return null;
    }

    @NotNull
    public final CompositeDisposable getDestroyDisposable() {
        return this.destroyDisposable;
    }

    @VisibleForTesting
    @Nullable
    /* JADX INFO: renamed from: getLoadingViewForTest, reason: from getter */
    public final WrapperLoadingView getLoadingView() {
        return this.loadingView;
    }

    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF26346V() {
        return this.needLoadingView;
    }

    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF26355e0() {
        return this.pageId;
    }

    @NotNull
    public final String getStringRes(@StringRes int id2, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (getContext() == null) {
            return C27019d.m66519a(BaseApplication.INSTANCE.get(), id2, formatArgs);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return C27019d.m66519a(contextRequireContext, id2, formatArgs);
    }

    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final TitleBar getTitleBar() {
        return (TitleBar) this.titleBar.getValue();
    }

    @Nullable
    public final Integer getViewStatus() {
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            return Integer.valueOf(wrapperLoadingView.getStatus());
        }
        return null;
    }

    @NotNull
    public final CompositeDisposable getVisibleDisposable() {
        return this.visibleDisposable;
    }

    public final boolean isShowing() {
        return this.isVisibleToUser && isParentShow();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.isViewCreated = true;
    }

    public final void performArguments(@Nullable Bundle bundle) {
        if (!this.isViewCreated) {
            setArguments(bundle);
        } else {
            onArguments(bundle);
            dispatchChildArguments(bundle);
        }
    }

    public final void runOnUiThread(@NotNull final Function0<Unit> block, long delay, @Nullable CompositeDisposable composite) {
        Intrinsics.checkNotNullParameter(block, "block");
        Flowable<Long> flowableObserveOn = Flowable.timer(delay, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.sdk.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.runOnUiThread$lambda$10(block, (Long) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(new Consumer() { // from class: com.kubi.sdk.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        if (composite == null) {
            composite = this.destroyDisposable;
        }
        DisposableKt.addTo(disposableSubscribe, composite);
    }

    public final void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.contentView = view;
    }

    public final void setFragmentResult(@NotNull String requestKey, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.setFragmentResult(requestKey, bundle);
        }
    }

    public final void setFragmentResultListener(@NotNull String requestKey, @NotNull FragmentResultListener listener) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(listener, "listener");
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.setFragmentResultListener(requestKey, (FragmentResultListener) RouteExKt.m56240c(listener, this), false);
        }
    }

    public void setNeedLoadingView(boolean z11) {
        this.needLoadingView = z11;
    }

    public void setPageId(@Nullable String str) {
        this.pageId = str;
    }

    public void showContentView() {
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    public final void showEmptyView(@NotNull CharSequence tips, int icon, @Nullable View.OnClickListener click) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(tips, icon, click);
        }
    }

    public final void showErrorView(@NotNull CharSequence tips, int color, @Nullable View.OnClickListener click) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showError(tips, color, click);
        }
    }

    public final void showFailView(@NotNull CharSequence tips, int icon, @Nullable View.OnClickListener click) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(tips, icon, click);
        }
    }

    public void showLoadingView(@ColorInt int color, int gravity) {
        WrapperLoadingView wrapperLoadingView = this.loadingView;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading(gravity, color);
        }
    }

    @NotNull
    public final <T> AbstractC27013a0<T> showPredicate() {
        C27084r0<Object> c27084r0 = this.showPredicate;
        Intrinsics.checkNotNull(c27084r0, "null cannot be cast to non-null type com.kubi.utils.LastPredicate<T of com.kubi.sdk.BaseFragment.showPredicate>");
        return c27084r0;
    }

    public final void startActivityWithResult(@NotNull Intent intent, @NotNull Consumer<Intent> callBack) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getResultDelegate().m56600d(this, intent, callBack);
    }

    private final void dispatchChildArguments(Bundle bundle) {
        if (isAdded()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BaseFragment) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BaseFragment) it.next()).performArguments(bundle);
            }
        }
    }

    private final void dispatchChildHide() {
        if (isAdded()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BaseFragment) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BaseFragment) it.next()).preformHide();
            }
        }
    }

    private final void dispatchChildLoad() {
        if (isAdded()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BaseFragment) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BaseFragment) it.next()).preformLoad();
            }
        }
    }

    private final void dispatchChildShow() {
        if (isAdded()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BaseFragment) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BaseFragment) it.next()).preformShow();
            }
        }
    }

    private final void performShowAndLoad() {
        preformShow();
        preformLoad();
        scheduleDeferredDispatchChildShow();
    }

    private final void preformShow() {
        if (getUserVisibleHint() && !isHidden() && isResumed() && this.isViewCreated && !this.isVisibleToUser && isParentShow()) {
            C44128b.m97268l(this.TAG, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW);
            this.isVisibleToUser = true;
            this.showPredicate.m66840e();
            onShow();
            if (this.showCount.incrementAndGet() > 1) {
                onAgainShow();
            }
            dispatchChildShow();
            C43853n.m96608b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runOnUiThread$lambda$10(Function0 function0, Long l11) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void scheduleDeferredDispatchChildShow() {
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: com.kubi.sdk.j0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFragment.scheduleDeferredDispatchChildShow$lambda$7(this.f46858b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TitleBar titleBar_delegate$lambda$0(BaseFragment baseFragment) {
        BaseActivity baseActivity;
        TitleBar titleBar;
        FragmentActivity activity = baseFragment.getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null && (titleBar = baseActivity.getTitleBar()) != null) {
            return titleBar;
        }
        FragmentActivity fragmentActivityRequireActivity = baseFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new TitleBar(fragmentActivityRequireActivity);
    }

    @Nullable
    public final <T extends View> T findViewById(@IdRes int idRes) {
        View view = getView();
        if (view != null) {
            return (T) view.findViewById(idRes);
        }
        return null;
    }

    public final int getColorRes(@ColorRes int color) {
        if (getContext() == null) {
            return ContextCompat.getColor(BaseApplication.INSTANCE.get(), color);
        }
        return ContextCompat.getColor(requireContext(), color);
    }

    @NotNull
    public final String[] getStringArrayRes(@ArrayRes int id2) {
        if (getContext() == null) {
            String[] stringArray = BaseApplication.INSTANCE.get().getResources().getStringArray(id2);
            Intrinsics.checkNotNull(stringArray);
            return stringArray;
        }
        String[] stringArray2 = requireContext().getResources().getStringArray(id2);
        Intrinsics.checkNotNull(stringArray2);
        return stringArray2;
    }

    public final void hideLoadingDialog(boolean dismiss) {
        getLoadingDialog().m89436a(dismiss);
    }

    public final boolean isParentShow() {
        BaseFragment baseFragment;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof BaseFragment) {
            baseFragment = (BaseFragment) parentFragment;
        } else {
            baseFragment = null;
        }
        if (baseFragment != null) {
            return baseFragment.isShowing();
        }
        return true;
    }

    public final boolean loadingDialogShowing() {
        return getLoadingDialog().isShowing();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getResultDelegate().m56598b(this, requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.visibleDisposable.clear();
        this.destroyDisposable.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            performShowAndLoad();
        } else {
            preformHide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        preformHide();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        try {
            super.onResume();
        } catch (Exception e11) {
            C44128b.m97264h(e11);
        }
        performShowAndLoad();
    }

    public void preformBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            performShowAndLoad();
        } else {
            preformHide();
        }
    }

    public final void showLoadingDialog() {
        getLoadingDialog().show();
    }

    public static /* synthetic */ void showEmptyView$default(BaseFragment baseFragment, CharSequence charSequence, int i11, View.OnClickListener onClickListener, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyView");
        }
        if ((i12 & 2) != 0) {
            i11 = R$drawable.ic2_common_empty;
        }
        if ((i12 & 4) != 0) {
            onClickListener = null;
        }
        baseFragment.showEmptyView(charSequence, i11, onClickListener);
    }

    public static /* synthetic */ void showFailView$default(BaseFragment baseFragment, CharSequence charSequence, int i11, View.OnClickListener onClickListener, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFailView");
        }
        if ((i12 & 2) != 0) {
            i11 = R$drawable.ic2_common_empty;
        }
        if ((i12 & 4) != 0) {
            onClickListener = null;
        }
        baseFragment.showFailView(charSequence, i11, onClickListener);
    }

    public void onAgainShow() {
    }

    public void onHide() {
    }

    public void onLoad() {
    }

    public void onShow() {
    }

    public void onArguments(@Nullable Bundle bundle) {
    }
}
