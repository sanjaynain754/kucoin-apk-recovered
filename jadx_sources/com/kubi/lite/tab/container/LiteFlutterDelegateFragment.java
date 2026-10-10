package com.kubi.lite.tab.container;

import android.os.Bundle;
import com.kubi.sdk.flutter.ui.FlutterDelegateFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiteFlutterDelegateFragment.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/lite/tab/container/LiteFlutterDelegateFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;", "<init>", "()V", "getTextureMode", "", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class LiteFlutterDelegateFragment extends FlutterDelegateFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f32091Y = new Companion(null);

    /* JADX INFO: compiled from: LiteFlutterDelegateFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/lite/tab/container/LiteFlutterDelegateFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/lite/tab/container/LiteFlutterDelegateFragment;", "initialRoute", "", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final LiteFlutterDelegateFragment newInstance(@NotNull String initialRoute) {
            Intrinsics.checkNotNullParameter(initialRoute, "initialRoute");
            LiteFlutterDelegateFragment liteFlutterDelegateFragment = new LiteFlutterDelegateFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", initialRoute);
            liteFlutterDelegateFragment.setArguments(bundle);
            return liteFlutterDelegateFragment;
        }
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment
    /* JADX INFO: renamed from: l3 */
    public boolean mo37561l3() {
        return true;
    }
}
