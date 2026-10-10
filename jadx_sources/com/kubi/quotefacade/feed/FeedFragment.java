package com.kubi.quotefacade.feed;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.quotefacade.view.TabContainerFragment;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.flutter.ui.FlutterDelegateLifecycleFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p607rv.C44177a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: FeedFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/quotefacade/feed/FeedFragment;", "Lcom/kubi/quotefacade/view/TabContainerFragment;", "<init>", "()V", "feedDistanceRequestJob", "Lkotlinx/coroutines/Job;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "getFlutterViewDistanceToBottomWindow", "", "createInitialContent", "Lcom/kubi/sdk/BaseFragment;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFeedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedFragment.kt\ncom/kubi/quotefacade/feed/FeedFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n153#2,7:104\n1#3:111\n*S KotlinDebug\n*F\n+ 1 FeedFragment.kt\ncom/kubi/quotefacade/feed/FeedFragment\n*L\n44#1:104,7\n*E\n"})
public final class FeedFragment extends TabContainerFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f41910W = new Companion(null);

    /* JADX INFO: renamed from: V */
    @Nullable
    public InterfaceC41775x1 f41911V;

    /* JADX INFO: compiled from: FeedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/quotefacade/feed/FeedFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_ROUTE", "FEED_ROUTE", "instance", "Lcom/kubi/quotefacade/feed/FeedFragment;", "instanceForKline", FirebaseAnalytics.Param.CURRENCY, "klineType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FeedFragment instance() {
            FeedFragment feedFragment = new FeedFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_route", "market/feed/index?from=market");
            feedFragment.setArguments(bundle);
            return feedFragment;
        }

        @NotNull
        public final FeedFragment instanceForKline(@NotNull String currency, @NotNull String klineType) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(klineType, "klineType");
            FeedFragment feedFragment = new FeedFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_route", "market/feed/index?coin=" + currency + "&from=" + klineType);
            feedFragment.setArguments(bundle);
            return feedFragment;
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC41775x1 interfaceC41775x1 = this.f41911V;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f41911V = null;
        super.onDestroyView();
    }

    @Override // com.kubi.quotefacade.view.TabContainerFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        InterfaceC41775x1 interfaceC41775x1 = this.f41911V;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        String string = requireArguments().getString("arg_route");
        if (string == null) {
            string = "";
        }
        if (StringsKt.contains$default((CharSequence) string, (CharSequence) "from=kline", false, 2, (Object) null)) {
            C44128b.m97259c(getTAG(), "监听 FEED_FLUTTER_DISTANCE_KLINE_FEED_REQUEST 事件");
            str = "feed_flutter_distance_kline_feed_request";
        } else {
            C44128b.m97259c(getTAG(), "监听 FEED_FLUTTER_DISTANCE_REQUEST 事件");
            str = "feed_flutter_distance_request";
        }
        if (C12573b.f21598a.m23696a()) {
            str.length();
        }
        this.f41911V = C12572a.m23692a(this, false, new FeedFragment$onViewCreated$$inlined$bindFlowEvent$default$1(str, null, this, str));
    }

    @Override // com.kubi.quotefacade.view.TabContainerFragment
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public BaseFragment mo51732l3() {
        String string = requireArguments().getString("arg_route");
        FlutterDelegateLifecycleFragment flutterDelegateLifecycleFragment = new FlutterDelegateLifecycleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("flutterInitialRoute", string);
        flutterDelegateLifecycleFragment.setArguments(bundle);
        return flutterDelegateLifecycleFragment;
    }

    /* JADX INFO: renamed from: q3 */
    public final int m51733q3() {
        FlutterDelegateLifecycleFragment flutterDelegateLifecycleFragment;
        Object next;
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        do {
            flutterDelegateLifecycleFragment = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(((Fragment) next) instanceof FlutterDelegateLifecycleFragment));
        if (next instanceof FlutterDelegateLifecycleFragment) {
            flutterDelegateLifecycleFragment = (FlutterDelegateLifecycleFragment) next;
        }
        if (flutterDelegateLifecycleFragment == null) {
            return -1;
        }
        return C44177a.f97517a.m97396a(flutterDelegateLifecycleFragment.getView());
    }
}
