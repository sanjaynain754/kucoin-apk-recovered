package com.trtc.uikit.livekit.p180kc.flutter;

import android.os.Bundle;
import com.kubi.sdk.flutter.ui.FlutterDelegateFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveCardContainerFragment.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/flutter/LiveCardContainerFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;", "<init>", "()V", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveCardContainerFragment extends FlutterDelegateFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f79156Y = new Companion(null);

    /* JADX INFO: compiled from: LiveCardContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/flutter/LiveCardContainerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/trtc/uikit/livekit/kc/flutter/LiveCardContainerFragment;", "route", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final LiveCardContainerFragment newInstance(@NotNull String route) {
            Intrinsics.checkNotNullParameter(route, "route");
            LiveCardContainerFragment liveCardContainerFragment = new LiveCardContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", route);
            liveCardContainerFragment.setArguments(bundle);
            return liveCardContainerFragment;
        }
    }
}
