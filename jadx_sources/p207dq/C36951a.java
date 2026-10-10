package p207dq;

import com.kubi.mart.api.IMartService;
import com.kubi.mart.sidebar.spot.SpotSidebarFragment;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dq.a */
/* JADX INFO: compiled from: MartService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/mart/service/MartService;", "Lcom/kubi/mart/api/IMartService;", "<init>", "()V", "getSpotSideBarFragment", "Lcom/kubi/sdk/BaseFragment;", "type", "", "symbolCode", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36951a implements IMartService {
    @Override // com.kubi.mart.api.IMartService
    @NotNull
    /* JADX INFO: renamed from: a */
    public BaseFragment mo41418a(@NotNull String type, @NotNull String symbolCode) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
        return SpotSidebarFragment.INSTANCE.instance(type, symbolCode);
    }
}
