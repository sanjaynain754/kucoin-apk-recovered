package com.kubi.sdk.base.p113ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.dialog.LoadingDialogFragment;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.R$string;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.kubi.utils.ToastCompat;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import me.jessyan.autosize.internal.CancelAdapt;
import org.jetbrains.annotations.NotNull;
import ro.C44128b;
import xb0.C46126b;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public abstract class OldBaseFragment extends BaseFragment implements InterfaceC23686g, CancelAdapt {
    private static final String TAG = "f_dialog_loading";
    private CompositeDisposable compositeDisposable;
    private boolean hasInit = false;
    protected boolean isCurrentlyVisible = false;
    private boolean isReBack;
    protected View mContentView;
    protected Context mContext;
    private LoadingDialogFragment mLoadingDialog;
    private C46126b rxPermissions;

    @LayoutRes
    public abstract int getLayout();

    public boolean isLight() {
        return false;
    }

    public View onCustomCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    public void showEmpty() {
        showEmpty(R$string.common_no_data, R$drawable.ic2_common_empty);
    }

    public void showError(String str) {
        showErrorView(str, new ViewOnClickListenerC23687h(this));
    }

    public void showLoading() {
        showLoadingView(0, 17);
    }

    private void clearSubscription() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    private LoadingDialogFragment getLoadingDialog() {
        if (this.mLoadingDialog == null) {
            this.mLoadingDialog = new LoadingDialogFragment();
        }
        return this.mLoadingDialog;
    }

    private void onParentHiddenChanged(boolean z11) {
        if (z11) {
            onHiddenChanged(true);
        } else {
            onHiddenChanged(isHidden());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.InterfaceC23686g
    public CompositeDisposable getCompositeDisposable() {
        if (this.compositeDisposable == null) {
            this.compositeDisposable = new CompositeDisposable();
        }
        return this.compositeDisposable;
    }

    public C46126b getRxPermissions() {
        if (this.rxPermissions == null) {
            this.rxPermissions = new C46126b(this);
        }
        return this.rxPermissions;
    }

    @Override // com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void hideDialogLoading() {
        LoadingDialogFragment loadingDialogFragment = this.mLoadingDialog;
        if (loadingDialogFragment == null || !loadingDialogFragment.isVisible() || this.mLoadingDialog.getFragmentManager() == null) {
            return;
        }
        this.mLoadingDialog.dismissAllowingStateLoss();
    }

    public void hideDialogLoadingCompat() {
        try {
            LoadingDialogFragment loadingDialogFragment = this.mLoadingDialog;
            if (loadingDialogFragment != null) {
                loadingDialogFragment.dismissAllowingStateLoss();
            }
        } catch (Exception e11) {
            C44128b.m97264h(e11);
        }
    }

    public boolean isCurrentlyVisible() {
        return this.isCurrentlyVisible;
    }

    @Override // com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showDialogLoading() {
        LoadingDialogFragment loadingDialogFragment = this.mLoadingDialog;
        if (loadingDialogFragment == null || loadingDialogFragment.getDialog() == null || !this.mLoadingDialog.getDialog().isShowing()) {
            getLoadingDialog().show(getChildFragmentManager(), TAG);
        }
    }

    public void showEmpty(@StringRes int i11, @DrawableRes int i12) {
        showEmpty(i11, i12, null);
    }

    public void showError(String str, int i11) {
        showErrorView(str, i11, new ViewOnClickListenerC23687h(this));
    }

    public void showErrorToast(Throwable th2) {
        if (th2 instanceof ApiException) {
            showToast(th2.getMessage());
        }
    }

    public void showLoading(int i11) {
        showLoadingView(0, i11);
    }

    public void showNetWorkError() {
        showEmpty(R$string.network_error, R$drawable.ic2_common_network_error);
    }

    private boolean checkParentVisible(OldBaseFragment oldBaseFragment) {
        if (oldBaseFragment.getParentFragment() == null || !(oldBaseFragment.getParentFragment() instanceof OldBaseFragment)) {
            return true;
        }
        OldBaseFragment oldBaseFragment2 = (OldBaseFragment) oldBaseFragment.getParentFragment();
        if (oldBaseFragment2.isCurrentlyVisible() && checkParentVisible(oldBaseFragment2)) {
            return true;
        }
        return false;
    }

    private void onViewHideOrShow(boolean z11) {
        if (getActivity() != null && this.isCurrentlyVisible != z11) {
            this.isCurrentlyVisible = z11;
            onViewHideOrShowToggle(z11);
            if (z11 && this.hasInit) {
                lazyLoad();
            }
            KuCoinLooper.INSTANCE.onFragmentShowOrHide(this, z11);
        }
    }

    public void addSubscription(Disposable disposable) {
        getCompositeDisposable().add(disposable);
    }

    @Override // com.kubi.sdk.base.p113ui.InterfaceC23686g
    public NavigationBar getNavigationBar() {
        if (getActivity() instanceof InterfaceC23686g) {
            return ((InterfaceC23686g) getActivity()).getNavigationBar();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = getContext();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable Bundle bundle, @Nullable ViewGroup viewGroup) {
        View viewInflate;
        if (getLayout() == 0) {
            viewInflate = onCustomCreateView(layoutInflater, viewGroup, bundle);
        } else {
            viewInflate = layoutInflater.inflate(getLayout(), viewGroup, false);
        }
        this.mContentView = viewInflate;
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.hasInit = false;
        this.mLoadingDialog = null;
        clearSubscription();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z11) {
        super.onHiddenChanged(z11);
        if (z11 && getUserVisibleHint()) {
            onViewHideOrShow(false);
        } else if (!z11 && getUserVisibleHint()) {
            onViewHideOrShow(true);
        }
        if (getHost() != null) {
            for (Fragment fragment : getChildFragmentManager().getFragments()) {
                if (fragment instanceof OldBaseFragment) {
                    ((OldBaseFragment) fragment).onParentHiddenChanged(z11);
                }
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.isReBack = true;
        onViewHideOrShow(false);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isReBack) {
            onReBack();
        }
        this.isReBack = false;
        if (getUserVisibleHint() && !isHidden() && checkParentVisible(this)) {
            onViewHideOrShow(true);
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.hasInit = true;
        if (this.isCurrentlyVisible) {
            lazyLoad();
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z11) {
        super.setUserVisibleHint(z11);
        onViewHideOrShow(z11);
    }

    public void showContent() {
        showContentView();
    }

    public void showEmpty(@StringRes int i11, @DrawableRes int i12, View.OnClickListener onClickListener) {
        showEmptyView(i11, i12, onClickListener);
    }

    public void showToast(String str) {
        ToastCompat.m66440F(str);
    }

    @Deprecated
    public void lazyLoad() {
    }

    public void onReBack() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retryClick(View view) {
    }

    @Deprecated
    public void onViewHideOrShowToggle(boolean z11) {
    }
}
