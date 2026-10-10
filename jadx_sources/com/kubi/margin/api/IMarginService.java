package com.kubi.margin.api;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.margin.api.entity.FundsInfo;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.margin.api.entity.IsolateMarginPositionTag;
import com.kubi.margin.api.entity.IsolatedMarginBridgeConfig;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.api.entity.MarginBridgeConfig;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.margin.api.entity.MarkPrice;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p804yo.AbstractC46554a;
import p804yo.InterfaceC46555b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import retrofit2.http.Query;

/* JADX INFO: compiled from: IMarginService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 ¼\u00012\u00020\u0001:\u0002¼\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u001b\u001a\u00020\u001cH&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 H&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH&J\u001e\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"0\r2\u0006\u0010#\u001a\u00020\u000bH&J\u001a\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tH&J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+H&J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+H&J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020+H&J\b\u0010/\u001a\u000200H&J!\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\r2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u00104J\u001a\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u001a\u00106\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0012\u00107\u001a\u0004\u0018\u0001082\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002080\r2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H&J\"\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0 0\"0\r2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020?0 2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u001c\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\"0\r2\u0006\u0010B\u001a\u00020\tH&J$\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\"0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\tH&J\u001c\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\"0\r2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0010\u0010F\u001a\u00020E2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0014\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\"0\rH&J\b\u0010I\u001a\u00020HH&J$\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\"0\r2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020'H&J\u0014\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\"0\rH&J\u0014\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\"0\rH&J/\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\"0\r2\b\u0010S\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010UJ#\u0010V\u001a\u0002082\b\u0010S\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010WJ \u0010X\u001a\b\u0012\u0004\u0012\u00020Y0 2\u0010\b\u0001\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0 H&J/\u0010[\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020E0]j\b\u0012\u0004\u0012\u00020E`^0\\2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010_J\b\u0010`\u001a\u00020=H&J\b\u0010a\u001a\u00020=H&J\b\u0010b\u001a\u00020\u000bH&J\b\u0010c\u001a\u00020\u000bH&J\u0010\u0010d\u001a\u00020'2\u0006\u0010<\u001a\u00020=H&J\u0010\u0010e\u001a\u00020\t2\u0006\u0010<\u001a\u00020=H&J\u0010\u0010f\u001a\u00020;2\u0006\u0010<\u001a\u00020=H&J\b\u0010g\u001a\u00020;H&J\u001a\u0010h\u001a\u00020;2\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010\u000bH&J\u001a\u0010l\u001a\u00020;2\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010\u000bH&J.\u0010m\u001a\u00020;2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020\t2\b\b\u0002\u0010o\u001a\u00020\t2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u000bH&Jn\u0010q\u001a\u00020;2\b\u0010r\u001a\u0004\u0018\u00010s2\u0006\u0010<\u001a\u00020=2\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020\u000b2\b\u0010x\u001a\u0004\u0018\u00010+2\b\u0010y\u001a\u0004\u0018\u00010\u00072\b\u0010z\u001a\u0004\u0018\u00010\u00072\u0006\u0010{\u001a\u00020\t2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010}\u001a\u00020\tH&J1\u0010~\u001a\u00020;2\b\u0010r\u001a\u0004\u0018\u00010s2\u0006\u0010<\u001a\u00020=2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H&J(\u0010\u0082\u0001\u001a\u00020;2\b\u0010r\u001a\u0004\u0018\u00010s2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u000bH&J\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t2\b\u0010r\u001a\u0004\u0018\u00010sH&¢\u0006\u0003\u0010\u0087\u0001J\t\u0010\u0088\u0001\u001a\u00020;H&J\u001b\u0010\u0089\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\b\u0010r\u001a\u0004\u0018\u00010sH&J'\u0010\u008a\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\b\u0010r\u001a\u0004\u0018\u00010s2\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001H&J\t\u0010\u008d\u0001\u001a\u00020\tH&J\u0011\u0010\u008e\u0001\u001a\u0002002\u0006\u0010k\u001a\u00020\u000bH&J\u0013\u0010\u008f\u0001\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u000100H&J0\u0010\u0090\u0001\u001a\u00020;2\u0007\u0010\u0091\u0001\u001a\u00020=2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000b2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000bH&JA\u0010\u0094\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\u0095\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0097\u00010\u0096\u0001H&J4\u0010\u0098\u0001\u001a\u00020;2\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010+2\u000b\b\u0002\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000bH&J(\u0010\u009e\u0001\u001a\u00020;2\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0014\b\u0002\u0010 \u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0096\u0001H&J*\u0010¡\u0001\u001a\u00020;2\b\u0010¢\u0001\u001a\u00030£\u00012\b\u0010¤\u0001\u001a\u00030¥\u00012\u000b\b\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H&J#\u0010¦\u0001\u001a\u00020;2\u0006\u0010<\u001a\u0002002\u0007\u0010§\u0001\u001a\u00020\t2\u0007\u0010¨\u0001\u001a\u00020\tH&J>\u0010©\u0001\u001a\u00020;2\u0007\u0010ª\u0001\u001a\u00020j2\u0006\u0010\u0010\u001a\u00020\u000b2\u0007\u0010«\u0001\u001a\u00020\t2\u0007\u0010¬\u0001\u001a\u00020\t2\u0007\u0010\u00ad\u0001\u001a\u00020\t2\u0007\u0010®\u0001\u001a\u00020\u000bH&J4\u0010¯\u0001\u001a\u00020=2\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00032\t\b\u0002\u0010±\u0001\u001a\u00020\t2\u000b\b\u0002\u0010²\u0001\u001a\u0004\u0018\u00010'H&¢\u0006\u0003\u0010³\u0001J\t\u0010´\u0001\u001a\u00020\tH&J\t\u0010µ\u0001\u001a\u00020;H&J!\u0010¶\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u000e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020;0¸\u0001H&J\u0014\u0010¹\u0001\u001a\u0005\u0018\u00010º\u00012\u0006\u0010\u0010\u001a\u00020\u000bH&J\t\u0010»\u0001\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006½\u0001À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/api/IMarginService;", "", "getLeverType", "", "getMarginType", "getIsolatedMarginType", "fetchUserLeverage", "Ljava/math/BigDecimal;", "isIsolated", "", "code", "", "modifyUserLeverage", "Lio/reactivex/Observable;", "leverage", "getMarginMaxLever", "symbol", "getPnlPrecision", "(Ljava/lang/String;)Ljava/lang/Integer;", "getMarginRiskLever", "getMarginPositionLever", "getMarginMaxAutoLoanDebtRatio", "getIsolatedMaxBorrowAmount", FirebaseAnalytics.Param.CURRENCY, "getIsolatedBorrowEnable", "getIsolatedBorrowEnableOnSymbol", "getMarginRiskGrade", "getMarginConfigForBridge", "Lcom/kubi/margin/api/entity/MarginBridgeConfig;", "getIsolatedMarginConfigForBridge", "Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;", "getIsolatedMarginConfigListForBridge", "", "fetchEtfTicker", "Lcom/kubi/sdk/base/entity/BaseEntity;", "baseCurrency", "getTradeFeeData", "Lio/reactivex/disposables/Disposable;", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "isRefresh", "getTakerFee", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getMakerFee", "getFeeInfo", "Lcom/kubi/margin/api/entity/FeeEntity;", "getIndexPriceListFragment", "Landroidx/fragment/app/Fragment;", "fetchAllIsolatePositionList", "Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "filterNotLoan", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;", "getTransferableAmountDebtRatio", "getLiquidationDebtRatio", "getIsolatePositionBySymbol", "Lcom/kubi/margin/api/entity/MarginPosition;", "fetchIsolatePosition", "profitIllegalDialog", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "fetchIsoLatePositionTags", "Lcom/kubi/margin/api/entity/IsolateMarginPositionTag;", "fetchIsoLatePositionTagsBorrow", "setMarginAutoReturn", "isOpen", "setIsolateMarginAutoReturn", "singlePositionInfo", "Lcom/kubi/margin/api/entity/FundsInfo;", "singlePositionInfoSync", "leverPositionInfo", "Lcom/kubi/margin/api/entity/LeverBalance;", "leverPositionInfoSync", "getIsolatedTransfer", "Lcom/kubi/margin/api/entity/MarginTransfer;", "getMarginMaxLeverString", "item", "getTargetLend", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", "fetchMarginBonus", "Lcom/kubi/margin/api/entity/MarginBonusConfig;", "getSingleMarginPositionByCode", "symbolCode", "withCache", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Observable;", "getSingleMarginPositionByCodeSync", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/margin/api/entity/MarginPosition;", "getMarginMarkPricesSync", "Lcom/kubi/margin/api/entity/MarkPrice;", "symbolList", "fetchCrossAssetsList", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "getMarginTradeFragment", "getIsolatedMarginTradeFragment", "getCrossPageId", "getIsolatedPageId", "getTradeItemBean", "isBaseMarginFragment", "marginTradeFragmentScrollToTop", "toAgreeEtf", "toEtfApply", "requireContext", "Landroid/content/Context;", "coin", "toEftRedeem", "toMarginTradeTab", "isolated", "isBuy", "spmId", "joinMarginRiskView", "viewGroup", "Landroid/view/ViewGroup;", "status", "value", "", "riskGrade", "symbolInfo", "transferableAmountDebtRatio", "flDebtRatio", "isIsolateMargin", "quoteCurrency", "showDashBoardView", "joinLeverGiftView", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "dismissCallback", "checkShowLeverGiftView", "config", "Lcom/kubi/margin/api/entity/MarginWelfare;", "page", "isTypeBonus", "(Landroid/view/ViewGroup;)Ljava/lang/Boolean;", "clearGiftView", "showMarginTicketGuide", "fetchMarginWelfare", "iv_bonus", "Landroid/view/View;", "isShowExperienceIcon", "getEtfInfoFragment", "isEtfInfo", "showCouponsDialog", "assetBorrowFragment", "positionType", "positionTag", "requestCouponsData", "callBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/margin/api/entity/CouponsOverview;", "jumpToTradeHistoryOfOpenOrder", "type", "Lcom/kubi/margin/api/define/MarginType;", "tab", "Lcom/kubi/margin/api/define/MarginTradeHistoryType;", "spm", "getTaxAdvice", "bizType", "consumer", "showErrorAgreementDialog", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "throwable", "", "showSwitchMarginTradeDialog", "isSupportCrossMargin", "isSupportIsolateMargin", "jump2MarginHorizontalKlinePage", "ctx", "showHistoryOrder", "showActivityOrder", "isFrom", "klineType", "getMarginToggleSymbolsFragment", "tradeType", "isMarket", "tradeItemBean", "(Ljava/lang/Integer;ZLcom/kubi/data/entity/TradeItemBean;)Lcom/kubi/sdk/BaseFragment;", "isSupportGuideTab", "jumpToLoanRateDescPage", "checkEuMarginRiskAgreement", "onPassed", "Lkotlin/Function0;", "fetchMarginCurrencyInfo", "Lcom/kubi/data/entity/MarginSymbolInfo;", "isSupportCrossOneClickLiquidation", "Companion", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarginService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f32724a = Companion.f32725a;

    /* JADX INFO: compiled from: IMarginService.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/margin/api/IMarginService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/margin/api/IMarginService;", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f32725a = new Companion();

        @NotNull
        public final IMarginService get() {
            return (IMarginService) Router.f46192a.m56192n(IMarginService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    List<IsolatedMarginBridgeConfig> mo37903A();

    @Nullable
    /* JADX INFO: renamed from: C */
    MarginPosition mo37904C(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: D */
    BigDecimal mo37905D(boolean z11, @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: E */
    MarginBridgeConfig mo37906E();

    /* JADX INFO: renamed from: F */
    boolean mo37907F(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: G */
    Boolean mo37908G(@Nullable ViewGroup viewGroup);

    @NotNull
    /* JADX INFO: renamed from: H */
    List<IsolateMarginPositionTag> mo37909H(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: I */
    Fragment mo37910I(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: J */
    BigDecimal mo37911J(@NotNull SymbolInfoEntity symbolInfoEntity);

    /* JADX INFO: renamed from: K */
    void mo37912K(@NotNull String str, @Nullable Consumer<String> consumer);

    @NotNull
    /* JADX INFO: renamed from: L */
    BaseFragment mo37913L();

    /* JADX INFO: renamed from: M */
    void mo37914M(@Nullable ViewGroup viewGroup, @NotNull BaseFragment baseFragment, @Nullable Action action, @Nullable Action action2);

    /* JADX INFO: renamed from: N */
    void mo37915N(@NotNull BaseFragment baseFragment, @Nullable ViewGroup viewGroup, @Nullable View view);

    /* JADX INFO: renamed from: O */
    void mo37916O(@NotNull String str, boolean z11, boolean z12, @Nullable String str2);

    /* JADX INFO: renamed from: P */
    void mo37917P();

    /* JADX INFO: renamed from: Q */
    boolean mo37918Q();

    @Nullable
    /* JADX INFO: renamed from: S */
    IsolatedMarginBridgeConfig mo37919S(@NotNull String str);

    /* JADX INFO: renamed from: T */
    void mo37920T();

    /* JADX INFO: renamed from: U */
    boolean mo37921U();

    /* JADX INFO: renamed from: V */
    int mo37922V();

    @Nullable
    /* JADX INFO: renamed from: W */
    String mo37923W();

    @Nullable
    /* JADX INFO: renamed from: X */
    Disposable mo37924X(@NotNull TradeItemBean tradeItemBean, boolean z11);

    @Nullable
    /* JADX INFO: renamed from: Y */
    MarginSymbolInfo mo37925Y(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: Z */
    BaseFragment mo37926Z();

    /* JADX INFO: renamed from: a */
    boolean mo37927a();

    @NotNull
    /* JADX INFO: renamed from: a0 */
    BigDecimal mo37928a0(@NotNull String str, @NotNull String str2);

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<ArrayList<FundsInfo>> mo37929b(@Nullable Boolean bool);

    @Nullable
    /* JADX INFO: renamed from: b0 */
    BigDecimal mo37930b0(boolean z11, @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: c */
    MarginPosition mo37931c(@Nullable String str, @Nullable Boolean bool);

    /* JADX INFO: renamed from: c0 */
    int mo37932c0();

    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<FundsInfo>> mo37933d(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: e */
    FundsInfo mo37934e(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<LeverBalance>> mo37935f();

    /* JADX INFO: renamed from: f0 */
    int mo37936f0();

    @Nullable
    /* JADX INFO: renamed from: g0 */
    BigDecimal mo37937g0(boolean z11, @NotNull String str);

    /* JADX INFO: renamed from: h0 */
    void mo37938h0(@NotNull BaseFragment baseFragment, @NotNull Function0<Unit> function0);

    @NotNull
    /* JADX INFO: renamed from: i */
    LeverBalance mo37939i();

    @Nullable
    /* JADX INFO: renamed from: i0 */
    Observable<IsolateMarginPosition> mo37940i0(@Nullable Boolean bool);

    @NotNull
    /* JADX INFO: renamed from: j */
    Observable<BaseEntity<MarginPosition>> mo37941j(@Nullable String str, @Nullable Boolean bool);

    @NotNull
    /* JADX INFO: renamed from: j0 */
    BaseFragment mo37942j0(@Nullable Integer num, boolean z11, @Nullable TradeItemBean tradeItemBean);

    @NotNull
    /* JADX INFO: renamed from: k */
    Observable<BaseEntity<BigDecimal>> mo37943k(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: l */
    List<MarkPrice> mo37944l(@NotNull @Query("symbolList") List<String> list);

    /* JADX INFO: renamed from: l0 */
    void mo37945l0();

    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<Object> mo37946m(boolean z11, @NotNull String str, @NotNull String str2);

    @Nullable
    /* JADX INFO: renamed from: m0 */
    FeeEntity mo37947m0(@NotNull SymbolInfoEntity symbolInfoEntity);

    /* JADX INFO: renamed from: n */
    void mo37948n(@NotNull BaseFragment baseFragment, @Nullable ViewGroup viewGroup);

    @NotNull
    /* JADX INFO: renamed from: n0 */
    String mo37949n0();

    @NotNull
    /* JADX INFO: renamed from: o */
    String mo37950o();

    @NotNull
    /* JADX INFO: renamed from: o0 */
    Observable<MarginPosition> mo37951o0(@NotNull String str);

    /* JADX INFO: renamed from: p */
    void mo37952p(@NotNull FragmentManager fragmentManager, @NotNull Throwable th2, @Nullable Action action);

    /* JADX INFO: renamed from: p0 */
    void mo37953p0(@NotNull InterfaceC46555b interfaceC46555b, @NotNull AbstractC46554a abstractC46554a, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: q */
    BigDecimal mo37954q(@NotNull String str);

    /* JADX INFO: renamed from: q0 */
    void mo37955q0(@Nullable ViewGroup viewGroup, @NotNull BaseFragment baseFragment, @NotNull String str, double d11, @NotNull String str2, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, boolean z11, @Nullable String str3, boolean z12);

    @NotNull
    /* JADX INFO: renamed from: r */
    BigDecimal mo37956r(@NotNull SymbolInfoEntity symbolInfoEntity);

    /* JADX INFO: renamed from: r0 */
    void mo37957r0(@NotNull BaseFragment baseFragment, @Nullable String str, @NotNull String str2, @Nullable String str3);

    /* JADX INFO: renamed from: s */
    void mo37958s(@NotNull Context context, @Nullable String str);

    /* JADX INFO: renamed from: s0 */
    void mo37959s0(@NotNull Context context, @Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: t */
    String mo37960t(@NotNull TradeItemBean tradeItemBean);

    /* JADX INFO: renamed from: t0 */
    boolean mo37961t0(@Nullable Fragment fragment);

    @Nullable
    /* JADX INFO: renamed from: u */
    BigDecimal mo37962u(boolean z11, @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: u0 */
    BigDecimal mo37963u0(boolean z11, @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: v */
    BigDecimal mo37964v(boolean z11, @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: v0 */
    TradeItemBean mo37965v0(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: w */
    void mo37966w(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: w0 */
    void mo37967w0(@NotNull Context context, @NotNull String str, boolean z11, boolean z12, boolean z13, @NotNull String str2);

    /* JADX INFO: renamed from: x */
    void mo37968x(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: x0 */
    boolean mo37969x0(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: y */
    void mo37970y(@NotNull BaseFragment baseFragment, @Nullable String str, @NotNull String str2, @Nullable String str3, @NotNull Consumer<CouponsOverview> consumer);

    /* JADX INFO: renamed from: y0 */
    boolean mo37971y0(@NotNull BaseFragment baseFragment);

    @Nullable
    /* JADX INFO: renamed from: z */
    Integer mo37972z(@NotNull String str);

    /* JADX INFO: renamed from: z0 */
    void mo37973z0(@NotNull Fragment fragment, boolean z11, boolean z12);

    /* JADX INFO: renamed from: A0 */
    static /* synthetic */ Observable m37897A0(IMarginService iMarginService, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAllIsolatePositionList");
        }
        if ((i11 & 1) != 0) {
            bool = null;
        }
        return iMarginService.mo37940i0(bool);
    }

    /* JADX INFO: renamed from: B */
    static /* synthetic */ Observable m37898B(IMarginService iMarginService, String str, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSingleMarginPositionByCode");
        }
        if ((i11 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        return iMarginService.mo37941j(str, bool);
    }

    /* JADX INFO: renamed from: R */
    static /* synthetic */ void m37899R(IMarginService iMarginService, ViewGroup viewGroup, BaseFragment baseFragment, String str, double d11, String str2, SymbolInfoEntity symbolInfoEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11, String str3, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinMarginRiskView");
        }
        iMarginService.mo37955q0(viewGroup, baseFragment, str, d11, str2, symbolInfoEntity, bigDecimal, bigDecimal2, z11, (i11 & 512) != 0 ? null : str3, (i11 & 1024) != 0 ? true : z12);
    }

    /* JADX INFO: renamed from: d0 */
    static /* synthetic */ void m37900d0(IMarginService iMarginService, String str, boolean z11, boolean z12, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toMarginTradeTab");
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        iMarginService.mo37916O(str, z11, z12, str2);
    }

    /* JADX INFO: renamed from: e0 */
    static /* synthetic */ MarginPosition m37901e0(IMarginService iMarginService, String str, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSingleMarginPositionByCodeSync");
        }
        if ((i11 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        return iMarginService.mo37931c(str, bool);
    }

    /* JADX INFO: renamed from: k0 */
    static /* synthetic */ InterfaceC41634e m37902k0(IMarginService iMarginService, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCrossAssetsList");
        }
        if ((i11 & 1) != 0) {
            bool = null;
        }
        return iMarginService.mo37929b(bool);
    }
}
