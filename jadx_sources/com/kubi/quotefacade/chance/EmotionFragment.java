package com.kubi.quotefacade.chance;

import android.os.Bundle;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.flutter.ui.FlutterEntryFragment;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EmotionFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/chance/EmotionFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterEntryFragment;", "<init>", "()V", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EmotionFragment extends FlutterEntryFragment {

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f41636i0 = new Companion(null);

    /* JADX INFO: compiled from: EmotionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/chance/EmotionFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/chance/EmotionFragment;", "initialRoute", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final EmotionFragment newInstance(@NotNull String initialRoute) {
            Intrinsics.checkNotNullParameter(initialRoute, "initialRoute");
            EmotionFragment emotionFragment = new EmotionFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", initialRoute);
            emotionFragment.setArguments(bundle);
            return emotionFragment;
        }
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterEntryFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterEntryFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m56971F3();
        C43852m.m96595g("B5ChanceCenter", "Tab", "0", null, 8, null);
    }
}
