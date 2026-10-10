package com.kubi.kumex.record.done;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.os.BundleKt;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RnOrderHistoryFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kumex/record/done/RnOrderHistoryFragment;", "Lcom/kubi/sdk/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "rnFragment", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "addRnFragment", "onRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnOrderHistoryFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f30175V = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseFragment f30176U;

    /* JADX INFO: compiled from: RnOrderHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/record/done/RnOrderHistoryFragment$Companion;", "", "<init>", "()V", "ARG_START_TIME", "", "ARG_END_TIME", "ARG_BIZ_TYPE", "newInstance", "Lcom/kubi/kumex/record/done/RnOrderHistoryFragment;", "source", "Landroid/os/Bundle;", "bizType", "Lcom/kubi/broker/MultiBizType;", "buildInitialArgs", "buildInitialArgs$KumexLib_googleRelease", "readNonBlankString", "key", "readLong", "", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRnOrderHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnOrderHistoryFragment.kt\ncom/kubi/kumex/record/done/RnOrderHistoryFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final String m35661b(Bundle bundle, String str) {
            String strM56284y;
            String string;
            if (bundle == null || (strM56284y = RouteExKt.m56284y(bundle, str)) == null || (string = StringsKt.trim((CharSequence) strM56284y).toString()) == null || string.length() <= 0) {
                return null;
            }
            return string;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Long m35660a(Bundle bundle, String str) {
            if (bundle != null) {
                return Long.valueOf(RouteExKt.m56268q(bundle, str));
            }
            return null;
        }

        @NotNull
        public final Bundle buildInitialArgs$KumexLib_googleRelease(@Nullable Bundle source) {
            Pair pair = new Pair(Constants.BIZ, "trade");
            Pair pair2 = new Pair("entry", "main");
            Pair pair3 = new Pair(Constants.COMPONENT, "kucoin_order_center");
            Pair pair4 = new Pair("route", "HistoryOrderPage");
            Pair pair5 = new Pair("titleBarHidden", CredentialEntry.FALSE_STRING);
            Boolean bool = Boolean.TRUE;
            Bundle bundleBundleOf = BundleKt.bundleOf(pair, pair2, pair3, pair4, pair5, new Pair("ignoreHandleBackPressed", bool), new Pair("isEmbedMode", bool));
            Companion companion = RnOrderHistoryFragment.f30175V;
            String strM35661b = companion.m35661b(source, "symbol");
            if (strM35661b != null) {
                bundleBundleOf.putString("symbol", strM35661b);
            }
            Long lM35660a = companion.m35660a(source, "startTime");
            if (lM35660a != null) {
                bundleBundleOf.putLong("startTime", lM35660a.longValue());
            }
            Long lM35660a2 = companion.m35660a(source, "endTime");
            if (lM35660a2 != null) {
                bundleBundleOf.putLong("endTime", lM35660a2.longValue());
            }
            String strM35661b2 = companion.m35661b(source, "bizType");
            if (strM35661b2 != null) {
                bundleBundleOf.putString("bizType", strM35661b2);
            }
            return bundleBundleOf;
        }

        @NotNull
        public final RnOrderHistoryFragment newInstance(@Nullable Bundle source, @NotNull MultiBizType bizType) {
            Intrinsics.checkNotNullParameter(bizType, "bizType");
            Bundle bundle = source != null ? new Bundle(source) : new Bundle();
            bundle.putString("bizType", bizType.name());
            RnOrderHistoryFragment rnOrderHistoryFragment = new RnOrderHistoryFragment();
            rnOrderHistoryFragment.setArguments(bundle);
            return rnOrderHistoryFragment;
        }
    }

    /* JADX INFO: renamed from: j3 */
    private final void m35659j3() {
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(f30175V.buildInitialArgs$KumexLib_googleRelease(getArguments()));
        this.f30176U = rnRootFragment;
        getChildFragmentManager().beginTransaction().add(R$id.fl_container, rnRootFragment).commitAllowingStateLoss();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.activity_fragment_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        ActivityResultCaller activityResultCaller = this.f30176U;
        if (activityResultCaller != null && (activityResultCaller instanceof SwipeRefreshLayout.OnRefreshListener)) {
            ((SwipeRefreshLayout.OnRefreshListener) activityResultCaller).onRefresh();
        }
        IReactNativeService.nativeNotifyRn$default(IReactNativeService.INSTANCE.get(), "orderCenterRefresh", null, 2, null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            m35659j3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f30176U;
        if (baseFragment != null) {
            baseFragment.onHide();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        BaseFragment baseFragment = this.f30176U;
        if (baseFragment != null) {
            baseFragment.onShow();
        }
    }
}
