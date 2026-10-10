package com.kubi.payment.p2p.trade;

import android.os.Bundle;
import com.kubi.sdk.flutter.ui.FlutterDelegateFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: P2PExpressFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PExpressFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;", "<init>", "()V", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PExpressFragment extends FlutterDelegateFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f39977Y = new Companion(null);

    /* JADX INFO: compiled from: P2PExpressFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PExpressFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/p2p/trade/P2PExpressFragment;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final P2PExpressFragment newInstance() {
            P2PExpressFragment p2PExpressFragment = new P2PExpressFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", "payment/p2p/express/home");
            p2PExpressFragment.setArguments(bundle);
            return p2PExpressFragment;
        }
    }
}
