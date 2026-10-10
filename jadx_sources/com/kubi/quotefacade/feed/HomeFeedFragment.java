package com.kubi.quotefacade.feed;

import android.os.Bundle;
import com.kubi.quotefacade.view.TabContainerFragment;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HomeFeedFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/quotefacade/feed/HomeFeedFragment;", "Lcom/kubi/quotefacade/view/TabContainerFragment;", "<init>", "()V", "createInitialContent", "Lcom/kubi/sdk/BaseFragment;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeFeedFragment extends TabContainerFragment {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f41915V = new Companion(null);

    /* JADX INFO: compiled from: HomeFeedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/feed/HomeFeedFragment$Companion;", "", "<init>", "()V", "ARG_ROUTE", "", "instance", "Lcom/kubi/quotefacade/feed/HomeFeedFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HomeFeedFragment instance() {
            HomeFeedFragment homeFeedFragment = new HomeFeedFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_route", "home/feed/index");
            homeFeedFragment.setArguments(bundle);
            return homeFeedFragment;
        }
    }

    @Override // com.kubi.quotefacade.view.TabContainerFragment
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public BaseFragment mo51732l3() {
        String string = requireArguments().getString("arg_route");
        HomeFeedFlutterDelegateFragment homeFeedFlutterDelegateFragment = new HomeFeedFlutterDelegateFragment();
        Bundle bundle = new Bundle();
        bundle.putString("flutterInitialRoute", string);
        homeFeedFlutterDelegateFragment.setArguments(bundle);
        return homeFeedFlutterDelegateFragment;
    }
}
