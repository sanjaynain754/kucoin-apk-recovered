package p698vp;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.margin.entity.LeverConfig;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.StorageId;

/* JADX INFO: renamed from: vp.h */
/* JADX INFO: compiled from: StorageIds.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0005J \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0005J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010'\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\nR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\nR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\nR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b-\u0010\n¨\u0006."}, m90084d2 = {"Lcom/kubi/margin/util/StorageIds;", "", "<init>", "()V", "CATEGORY", "", "MARGIN_GUIDE", "Lcom/kubi/utils/storage/StorageId;", "", "getMARGIN_GUIDE", "()Lcom/kubi/utils/storage/StorageId;", "MARGIN_GUIDE_ORDER", "getMARGIN_GUIDE_ORDER", "KEY_ORDER_MODE", "", "getKEY_ORDER_MODE", "LEVER_CONFIG", "Lcom/kubi/margin/entity/LeverConfig;", "getLEVER_CONFIG", "ISOLATE_MARGIN_CONFIG", "getISOLATE_MARGIN_CONFIG", "LEVER_MARKET_SYMBOL_LIST", "getLEVER_MARKET_SYMBOL_LIST", "LAST_UN_RECEIVE_UPDATED_AT", "", "getLAST_UN_RECEIVE_UPDATED_AT", "ACTIVITY_TIME", "getACTIVITY_TIME", "couponGuide", "type", "IS_IN_WHITE_LIST", "getIS_IN_WHITE_LIST", "REMIND_PRICE_DEVIATE", "getREMIND_PRICE_DEVIATE", "couponTime", "page", "couponCreateTime", "isShowRedDot", "MARGIN_BANNER_CLOSE_UNTIL", "id", "MARGIN_EXAM_ERROR_COUNT", "getMARGIN_EXAM_ERROR_COUNT", "MARGIN_EXAM_ERROR_START_TIME", "getMARGIN_EXAM_ERROR_START_TIME", "EU_MARGIN_RISK_TIP_SIGNED", "getEU_MARGIN_RISK_TIP_SIGNED", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45618h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45618h f102740a = new C45618h();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f102741b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f102742c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<LeverConfig> f102743d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<String> f102744e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<String> f102745f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<Long> f102746g;

    static {
        StorageType storageType = StorageType.Shared;
        f102741b = new StorageId<>(ViewProps.MARGIN, "margin_guide", storageType, true);
        f102742c = new StorageId<>(ViewProps.MARGIN, "margin_guide_order", storageType, true);
        f102743d = new StorageId<>(ViewProps.MARGIN, "leverConfig", null, false, 12, null);
        f102744e = new StorageId<>(ViewProps.MARGIN, "isolateMarginConfigsMap", null, false, 12, null);
        f102745f = new StorageId<>(ViewProps.MARGIN, "leverMarketSymbolList", null, false, 12, null);
        f102746g = new StorageId<>(ViewProps.MARGIN, "REMIND_PRICE_DEVIATE", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Long> m100713a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new StorageId<>(ViewProps.MARGIN, "banner_close_until_" + id2, null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Long> m100714b(@Nullable String str, @Nullable String str2) {
        return new StorageId<>(ViewProps.MARGIN, UserInfo.a.i() + "lever_gift_last_time" + str + str2, null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<Boolean> m100715c(@Nullable String str) {
        return new StorageId<>(ViewProps.MARGIN, "showMarginTicketGuide" + str, StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<Long> m100716d(@Nullable String str, @Nullable String str2) {
        return new StorageId<>(ViewProps.MARGIN, UserInfo.a.i() + "lever_gift_last_show" + str + str2, null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<Boolean> m100717e() {
        StorageId storageId = new StorageId(ViewProps.MARGIN, "eu_margin_risk_tip_signed", StorageType.Shared, false, 8, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<String> m100718f() {
        return f102744e;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Boolean> m100719g() {
        return new StorageId<>(ViewProps.MARGIN, UserInfo.a.i() + "isolated_white", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final StorageId<Integer> m100720h() {
        return new StorageId<>(ViewProps.MARGIN, UserInfo.a.i() + "KEY_ORDER_MODE", null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final StorageId<LeverConfig> m100721i() {
        return f102743d;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageId<String> m100722j() {
        return f102745f;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final StorageId<Long> m100723k() {
        return new StorageId<>(ViewProps.MARGIN, UserInfo.a.i() + "margin_exam_error_start_time", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final StorageId<Boolean> m100724l() {
        return f102741b;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final StorageId<Boolean> m100725m() {
        return f102742c;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final StorageId<Long> m100726n() {
        return f102746g;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final StorageId<Long> m100727o(@Nullable String str) {
        return new StorageId<>(ViewProps.MARGIN, UserInfo.a.i() + "lever_badge_last_time" + str, null, false, 12, null);
    }
}
