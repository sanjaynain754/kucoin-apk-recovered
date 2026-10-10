package p595rg;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rg.g */
/* JADX INFO: compiled from: IMultiPositionApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/common/IMultiPositionApi;", "Lcom/kubi/function/IMultiFunction;", "closeAllPosition", "", AppsFlyerProperties.CHANNEL, "", "isTrial", "", "fetchPositionBySymbol", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "symbol", "fetchKycLeverage", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "marginMode", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44079g extends InterfaceC43729a {
    @NotNull
    /* JADX INFO: renamed from: B0 */
    Object mo83153B0(@NotNull String str, boolean z11);

    @NotNull
    /* JADX INFO: renamed from: S */
    List<PositionEntity> mo83155S(boolean z11, @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: a */
    KycLeverageEntity mo83157a(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: k0 */
    static /* synthetic */ Object m97140k0(InterfaceC44079g interfaceC44079g, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeAllPosition");
        }
        if ((i11 & 1) != 0) {
            str = "ANDROID";
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return interfaceC44079g.mo83153B0(str, z11);
    }
}
