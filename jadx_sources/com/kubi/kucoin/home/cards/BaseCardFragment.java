package com.kubi.kucoin.home.cards;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorRes;
import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.home.cards.exception.CardFlowMessage;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27019d;
import com.kubi.utils.C27059l;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseCardFragment.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0019H%J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u0005J\b\u0010'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\b\u0010)\u001a\u00020\u001bH\u0016J\b\u0010*\u001a\u00020\u001bH\u0016J\u0010\u0010+\u001a\u00020\u00192\b\b\u0001\u0010,\u001a\u00020\u0019J-\u0010-\u001a\u00020.2\b\b\u0001\u0010/\u001a\u00020\u00192\u0016\u00100\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010201\"\u0004\u0018\u000102¢\u0006\u0002\u00103J!\u00104\u001a\u0004\u0018\u0001H5\"\b\b\u0000\u00105*\u00020\u000b2\b\b\u0001\u00106\u001a\u00020\u0019¢\u0006\u0002\u00107R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u00068"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/BaseCardFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "isViewCreated", "", "isVisibleToUser", "isDataLoaded", "showCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCustomCreateView", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setUserVisibleHint", "onHiddenChanged", ViewProps.HIDDEN, "onResume", "onPause", "preformShow", "preformLoad", "preformHide", "isShowing", "isParentShow", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onAgainShow", "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "getColorRes", "color", "getStringRes", "", "id", "formatArgs", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "findViewById", ExifInterface.GPS_DIRECTION_TRUE, "idRes", "(I)Landroid/view/View;", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCardFragment.kt\ncom/kubi/kucoin/home/cards/BaseCardFragment\n+ 2 CardFlowIssue.kt\ncom/kubi/kucoin/home/cards/exception/CardFlowIssueKt\n*L\n1#1,166:1\n48#2,2:167\n*S KotlinDebug\n*F\n+ 1 BaseCardFragment.kt\ncom/kubi/kucoin/home/cards/BaseCardFragment\n*L\n94#1:167,2\n*E\n"})
public abstract class BaseCardFragment extends Fragment {
    public View contentView;
    private boolean isDataLoaded;
    private boolean isViewCreated;
    private boolean isVisibleToUser;

    @NotNull
    private final AtomicInteger showCount = new AtomicInteger();

    @LayoutRes
    public abstract int getLayout();

    private final void preformHide() {
        if (this.isViewCreated && this.isVisibleToUser) {
            this.isVisibleToUser = false;
            onHide();
        }
    }

    private final void preformLoad() {
        if (!this.isDataLoaded && this.isViewCreated && isShowing()) {
            this.isDataLoaded = true;
            onLoad();
        }
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
    public final String getStringRes(@StringRes int id2, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        Context context = getContext();
        if (context == null) {
            context = C27059l.f54343a.m66757a();
        }
        return C27019d.m66519a(context, id2, formatArgs);
    }

    public final boolean isShowing() {
        return this.isVisibleToUser && isParentShow();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewOnCustomCreateView = getLayout() == 0 ? onCustomCreateView(inflater, container, savedInstanceState) : inflater.inflate(getLayout(), container, false);
        if (viewOnCustomCreateView == null) {
            throw new IllegalStateException("you must set getLayout or impl onCustomCreateView");
        }
        setContentView(viewOnCustomCreateView);
        return getContentView();
    }

    @Nullable
    public View onCustomCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.isViewCreated = true;
    }

    public final void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.contentView = view;
    }

    private final void preformShow() {
        if (getUserVisibleHint() && !isHidden() && isResumed() && this.isViewCreated && !this.isVisibleToUser && isParentShow()) {
            this.isVisibleToUser = true;
            onShow();
            if (this.showCount.incrementAndGet() > 1) {
                onAgainShow();
            }
        }
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
        Context context = getContext();
        if (context == null) {
            context = C27059l.f54343a.m66757a();
        }
        return ContextCompat.getColor(context, color);
    }

    public final boolean isParentShow() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            return true;
        }
        if (parentFragment instanceof BaseFragment) {
            return ((BaseFragment) parentFragment).isShowing();
        }
        if (!(parentFragment instanceof BaseCardFragment)) {
            return true;
        }
        return ((BaseCardFragment) parentFragment).isShowing();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            preformShow();
            preformLoad();
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
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C43846g.m96568c(new CardFlowMessage(message, "BaseCardFragment", false, 4, null), null, 2, null);
        }
        preformShow();
        preformLoad();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            preformShow();
            preformLoad();
        } else {
            preformHide();
        }
    }

    public void onAgainShow() {
    }

    public void onHide() {
    }

    public void onLoad() {
    }

    public void onShow() {
    }
}
