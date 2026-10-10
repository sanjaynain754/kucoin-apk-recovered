package k10;

import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

/* JADX INFO: renamed from: k10.a */
/* JADX INFO: compiled from: ILoadingView.java */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC40863a {
    void showContent();

    void showEmpty(@StringRes int i11, @DrawableRes int i12, View.OnClickListener onClickListener);

    void showEmpty(CharSequence charSequence, @DrawableRes int i11, View.OnClickListener onClickListener);

    void showError(@StringRes int i11, View.OnClickListener onClickListener);

    void showLoading();
}
