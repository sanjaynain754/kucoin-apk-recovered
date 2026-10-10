package com.kubi.quotefacade.feed;

import android.os.Bundle;
import android.view.View;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.sdk.flutter.ui.FlutterDelegateLifecycleFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeFeedFlutterDelegateFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateLifecycleFragment;", "<init>", "()V", "feedChannel", "Lcom/kubi/quotefacade/feed/FeedHandlerChannel;", "getFeedChannel", "()Lcom/kubi/quotefacade/feed/FeedHandlerChannel;", "feedChannel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getTextureMode", "", "bindEvent", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "isLegalState", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFeedFlutterDelegateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFeedFlutterDelegateFragment.kt\ncom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,67:1\n76#2,7:68\n153#2,7:75\n76#2,7:82\n81#2,2:89\n153#2,7:91\n76#2,7:98\n*S KotlinDebug\n*F\n+ 1 HomeFeedFlutterDelegateFragment.kt\ncom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment\n*L\n28#1:68,7\n33#1:75,7\n38#1:82,7\n43#1:89,2\n48#1:91,7\n53#1:98,7\n*E\n"})
public final class HomeFeedFlutterDelegateFragment extends FlutterDelegateLifecycleFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f41914Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.feed.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFeedFlutterDelegateFragment.m51743r3();
        }
    });

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment
    /* JADX INFO: renamed from: l3 */
    public boolean mo37561l3() {
        return true;
    }

    /* JADX INFO: renamed from: q3 */
    private final void m51742q3() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_change".length();
        }
        C12572a.m23692a(this, false, new C22114x63d2b3f3("com.kubi.home.feed.QuoteEvent:home_feed_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top".length();
        }
        C12572a.m23692a(this, false, new C22115x63d2b3f4("com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_visible_height_change".length();
        }
        C12572a.m23692a(this, false, new C22116x63d2b3f5("com.kubi.home.feed.QuoteEvent:home_feed_visible_height_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_on_top".length();
        }
        C12572a.m23692a(this, true, new C22113x78959a96("com.kubi.home.feed.QuoteEvent:home_feed_on_top", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:fake_tab_change".length();
        }
        C12572a.m23692a(this, false, new C22117x63d2b3f6("com.kubi.home.feed.QuoteEvent:fake_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_native_scroll_vertical_speed".length();
        }
        C12572a.m23692a(this, false, new C22118x63d2b3f7("com.kubi.home.feed.QuoteEvent:home_feed_native_scroll_vertical_speed", null, this));
    }

    /* JADX INFO: renamed from: r3 */
    public static final FeedHandlerChannel m51743r3() {
        return new FeedHandlerChannel();
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getF46737W().m56760h(m51744s3());
    }

    /* JADX INFO: renamed from: s3 */
    public final FeedHandlerChannel m51744s3() {
        return (FeedHandlerChannel) this.f41914Y.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m51742q3();
    }

    /* JADX INFO: renamed from: t3 */
    public final boolean m51745t3() {
        if (getView() != null && !isDetached() && !isRemoving()) {
            return true;
        }
        return false;
    }
}
