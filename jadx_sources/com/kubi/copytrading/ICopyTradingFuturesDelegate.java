package com.kubi.copytrading;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ICopyTradingFuturesDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "", "onViewCreated", "", "rootView", "Landroid/widget/LinearLayout;", "appBar", "Landroid/view/ViewGroup;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "checkJumpToggleLeadTrading", "bundle", "Landroid/os/Bundle;", "fragment", "Lcom/kubi/sdk/BaseFragment;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "refresh", "Companion", "CopyTradingApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ICopyTradingFuturesDelegate {

    /* JADX INFO: compiled from: ICopyTradingFuturesDelegate.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/copytrading/ICopyTradingFuturesDelegate$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "CopyTradingApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f19722a = new Companion();

        @NotNull
        public final ICopyTradingFuturesDelegate get() {
            return (ICopyTradingFuturesDelegate) Router.f46192a.m56192n(ICopyTradingFuturesDelegate.class);
        }
    }

    /* JADX INFO: renamed from: B0 */
    void mo20616B0();

    /* JADX INFO: renamed from: C0 */
    void mo20617C0(@Nullable LinearLayout linearLayout, @Nullable ViewGroup viewGroup, @Nullable ViewPager viewPager);

    /* JADX INFO: renamed from: D0 */
    void mo20618D0(@Nullable Bundle bundle, @NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: a */
    void mo20619a();
}
