package com.kubi.spot.business.callAuction.action;

import androidx.fragment.app.FragmentManager;
import com.kubi.spot.kline.ILoadKlineAction;
import com.kubi.spot.kline.flutter.SpotFlutterKlineFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.callAuction.action.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CallAuctionLoadKlineAction.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/action/CallAuctionLoadKlineAction;", "Lcom/kubi/spot/kline/ILoadKlineAction;", "<init>", "()V", "loadKlineFragment", "", "spotFlutterKlineFragmentDelegate", "Lkotlin/Lazy;", "Lcom/kubi/spot/kline/flutter/SpotFlutterKlineFragment;", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CallAuctionLoadKlineAction implements ILoadKlineAction {
    @Override // com.kubi.spot.kline.ILoadKlineAction
    /* JADX INFO: renamed from: a */
    public void mo60491a(@NotNull Lazy<SpotFlutterKlineFragment> spotFlutterKlineFragmentDelegate, @NotNull FragmentManager childFragmentManager) {
        Intrinsics.checkNotNullParameter(spotFlutterKlineFragmentDelegate, "spotFlutterKlineFragmentDelegate");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
    }
}
