package com.kubi.quotefacade.kline;

import android.os.Bundle;
import com.kubi.quotefacade.view.TabContainerFragment;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/KlineFragment;", "Lcom/kubi/quotefacade/view/TabContainerFragment;", "<init>", "()V", "createInitialContent", "Lcom/kubi/sdk/BaseFragment;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineFragment extends TabContainerFragment {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f42138V = new Companion(null);

    /* JADX INFO: compiled from: KlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/KlineFragment$Companion;", "", "<init>", "()V", "ARG_ROUTE", "", "newInstance", "Lcom/kubi/quotefacade/kline/KlineFragment;", "symbol", "klineType", "leverTradeType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ KlineFragment newInstance$default(Companion companion, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str3 = "";
            }
            return companion.newInstance(str, str2, str3);
        }

        @NotNull
        public final KlineFragment newInstance(@NotNull String symbol, @NotNull String klineType, @Nullable String leverTradeType) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(klineType, "klineType");
            KlineFragment klineFragment = new KlineFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_route", "market/kline/chart/index?symbol=" + symbol + "&klineType=" + klineType + "&leverTradeType=" + leverTradeType);
            klineFragment.setArguments(bundle);
            return klineFragment;
        }
    }

    @Override // com.kubi.quotefacade.view.TabContainerFragment
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public BaseFragment mo51732l3() {
        String string = requireArguments().getString("arg_route");
        KlineFlutterDelegateFragment klineFlutterDelegateFragment = new KlineFlutterDelegateFragment();
        Bundle bundle = new Bundle();
        bundle.putString("flutterInitialRoute", string);
        klineFlutterDelegateFragment.setArguments(bundle);
        return klineFlutterDelegateFragment;
    }
}
