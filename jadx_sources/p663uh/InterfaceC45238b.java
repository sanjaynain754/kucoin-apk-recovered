package p663uh;

import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.data.platform.model.UserConfig;
import com.kubi.kumex.data.trade.model.AuUserCategoryVO;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: uh.b */
/* JADX INFO: compiled from: ISettingService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H&J\b\u0010\u0011\u001a\u00020\u000eH&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000eH&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u001bH&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010H&J\b\u0010\u001d\u001a\u00020\u001bH&J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH&J\n\u0010 \u001a\u0004\u0018\u00010\u001fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/setting/ISettingService;", "Lcom/kubi/futures/data/setting/ISettingApi;", "fetchInitData", "", "getUserConfig", "Lcom/kubi/kumex/data/platform/model/UserConfig;", "updateUserConfig", "map", "", "", "observeUserConfig", "Lio/reactivex/Flowable;", "updatePreferencesSettings", "new", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "observePreferencesSettings", "Lio/reactivex/Observable;", "getPreferencesSettings", "submitPreferencesSettings", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "initPreferencesSettingsMemory", "getTaxRate", "Ljava/math/BigDecimal;", "isTrial", "", "updateTradingNoticeSettings", "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "observeTradingNoticeSettings", "getTradingNoticeSettings", "fetchAuUserCategoryCached", "Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;", "getAuUserCategory", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45238b extends InterfaceC45237a {
    @NotNull
    /* JADX INFO: renamed from: F0 */
    UserConfig mo99981F0();

    /* JADX INFO: renamed from: c */
    void mo99982c(@NotNull TradingNoticeEntity tradingNoticeEntity);

    /* JADX INFO: renamed from: e */
    void mo99983e();

    /* JADX INFO: renamed from: f */
    void mo99984f();

    @NotNull
    /* JADX INFO: renamed from: g */
    TradingNoticeEntity mo99985g();

    /* JADX INFO: renamed from: i */
    void mo99986i(@NotNull PreferencesEntity preferencesEntity);

    @Nullable
    /* JADX INFO: renamed from: k */
    AuUserCategoryVO getF101778e();

    @NotNull
    /* JADX INFO: renamed from: m */
    PreferencesEntity mo99988m();

    @NotNull
    /* JADX INFO: renamed from: o */
    Flowable<UserConfig> mo99989o();

    @NotNull
    /* JADX INFO: renamed from: p */
    Observable<PreferencesEntity> mo99990p();

    /* JADX INFO: renamed from: q */
    void mo99991q(@NotNull Map<String, String> map);

    @Nullable
    /* JADX INFO: renamed from: r */
    Object mo99992r(@NotNull PreferencesEntity preferencesEntity);

    @Nullable
    /* JADX INFO: renamed from: s */
    AuUserCategoryVO mo99993s();

    @NotNull
    /* JADX INFO: renamed from: t */
    Observable<TradingNoticeEntity> mo99994t();

    @NotNull
    /* JADX INFO: renamed from: w */
    BigDecimal mo99995w(boolean z11);
}
