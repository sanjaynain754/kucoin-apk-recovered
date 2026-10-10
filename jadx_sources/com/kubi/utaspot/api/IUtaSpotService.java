package com.kubi.utaspot.api;

import android.content.Context;
import android.view.ViewGroup;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IUtaSpotService.kt */
/* JADX INFO: loaded from: classes23.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bg\u0018\u0000  2\u00020\u0001:\u0001 J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J:\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J\"\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H&J\"\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0005H&J6\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/utaspot/api/IUtaSpotService;", "", "getUtaOrderHistoryFragment", "Lcom/kubi/sdk/BaseFragment;", "fromSymbol", "", "side", "tradeType", "getUtaSpotTradeFragment", "getUtaMarginTradeFragment", "jumpUtaOrdersRecordFragment", "", "context", "Landroid/content/Context;", "Lcom/kubi/utaspot/api/UtaTradeType;", "index", "", "injectRiskConfirmTipSwitchView", "viewGroup", "Landroid/view/ViewGroup;", "fromType", "spm", "getUtaDelegationRecordFragment", "mSymbol", "mIndex", "utaTradeType", "jumpUtaDelegationDetailFragment", "ctx", "orderId", "symbol", "content", "bussinesType", "Companion", "UtaSpotApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IUtaSpotService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f54014a = Companion.f54015a;

    /* JADX INFO: compiled from: IUtaSpotService.kt */
    /* JADX INFO: loaded from: classes54.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/utaspot/api/IUtaSpotService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/utaspot/api/IUtaSpotService;", "UtaSpotApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f54015a = new Companion();

        @NotNull
        public final IUtaSpotService get() {
            return (IUtaSpotService) Router.f46192a.m56192n(IUtaSpotService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo65988a(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4);

    /* JADX INFO: renamed from: b */
    void mo65989b(@NotNull Context context, @Nullable String str, @Nullable String str2, @NotNull UtaTradeType utaTradeType, int i11);

    @NotNull
    /* JADX INFO: renamed from: c */
    BaseFragment mo65990c(@Nullable String str, int i11, @NotNull String str2);

    @NotNull
    /* JADX INFO: renamed from: d */
    BaseFragment mo65991d();

    /* JADX INFO: renamed from: e */
    void mo65992e(@Nullable ViewGroup viewGroup, @NotNull String str, @NotNull String str2);

    @NotNull
    /* JADX INFO: renamed from: g */
    BaseFragment mo65993g();

    @NotNull
    /* JADX INFO: renamed from: h */
    BaseFragment mo65994h(@Nullable String str, @Nullable String str2, @NotNull String str3);

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m65987f(IUtaSpotService iUtaSpotService, Context context, String str, String str2, UtaTradeType utaTradeType, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpUtaOrdersRecordFragment");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        if ((i12 & 4) != 0) {
            str2 = null;
        }
        if ((i12 & 16) != 0) {
            i11 = 2;
        }
        iUtaSpotService.mo65989b(context, str, str2, utaTradeType, i11);
    }
}
