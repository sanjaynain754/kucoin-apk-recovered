package com.kubi.assets;

import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.assets.x0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IAssetAccountView.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J+\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\"\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001aH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/IAssetAccountView;", "", "getView", "Landroid/view/View;", "bindEyesChanged", "", "consumer", "Lio/reactivex/functions/Consumer;", "", "initStatus", "(Lio/reactivex/functions/Consumer;Ljava/lang/Boolean;)V", "bindFragmentAndPageId", "fragment", "Lcom/kubi/sdk/BaseFragment;", "pageId", "", "bindAssetsInfoSet", "baseCurrencyName", "assetsValue", "assetsValueLegal", "setCopyTradingWalletTagVisible", ViewProps.VISIBLE, "setCopyTradingWalletTagAmountText", "text", "setCopyTradingWalletTagOnClick", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IAssetAccountView {
    /* JADX INFO: renamed from: a */
    void mo19953a(@Nullable String str, @NotNull String str2, @NotNull String str3);

    /* JADX INFO: renamed from: b */
    void mo19954b(@Nullable Consumer<Boolean> consumer, @Nullable Boolean bool);

    /* JADX INFO: renamed from: d */
    void mo19955d(@NotNull BaseFragment baseFragment, @Nullable String str);

    @NotNull
    View getView();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m20180c(IAssetAccountView iAssetAccountView, Consumer consumer, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindEyesChanged");
        }
        if ((i11 & 1) != 0) {
            consumer = null;
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        iAssetAccountView.mo19954b(consumer, bool);
    }

    default void setCopyTradingWalletTagAmountText(@Nullable String text) {
    }

    default void setCopyTradingWalletTagOnClick(@Nullable Function0<Unit> action) {
    }

    default void setCopyTradingWalletTagVisible(boolean visible) {
    }
}
