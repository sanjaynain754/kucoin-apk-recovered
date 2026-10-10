package e20;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.CheckCodeParamsEntity;
import com.kubi.data.entity.CheckCodeResultEntity;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.spot.entity.DelegationItemEntity;
import com.kubi.spot.entity.MarginSymbol;
import com.kubi.spot.entity.MarketsEntity;
import com.kubi.spot.entity.NFTEntity;
import com.kubi.spot.entity.OrderResultEntity;
import com.kubi.spot.entity.SavingBalanceEntity;
import com.kubi.spot.entity.TagEntity;
import com.kubi.spot.quote.market.info.MarketByCurrencyEntity;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.spot.quote.market.info.MarketTradeStat;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: e20.d */
/* JADX INFO: compiled from: MarketApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H'JR\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00040\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'J \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000bH'JD\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000bH'J \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000bH'J6\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000bH'JB\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000bH'J6\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000bH'JB\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000bH'J6\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000bH'JB\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000bH'J6\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000bH'JB\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000bH'J6\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000bH'JB\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000bH'J6\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000bH'JB\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000bH'J\u001e\u0010(\u001a\u00020)2\b\b\u0001\u0010*\u001a\u00020\u000f2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'J \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'J0\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00040\u00032\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u00100\u001a\u00020\u000bH'J*\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u00103\u001a\u00020\u000bH'J0\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00040\u00032\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u00100\u001a\u00020\u000bH'J\u001a\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00040\u0003H'J \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'J\u0014\u00109\u001a\u00020)2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'J&\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00050\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'J \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'J \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'J:\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00050\u00040\u00032\b\b\u0001\u0010@\u001a\u00020A2\b\b\u0003\u0010B\u001a\u00020\u000b2\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\u000bH'JL\u0010D\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0E0\u00050\u00040\u00032\b\b\u0001\u0010F\u001a\u00020\u000b2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010B\u001a\u00020\u000b2\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\u000bH'J,\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u00040\u00032\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000bH'J6\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010*\u001a\u00020\u000b2\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u000bH'J\u0014\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00040\u0003H'J\u001e\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00040\u00032\b\b\u0001\u0010Q\u001a\u00020\u000bH'J2\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010T\u001a\u00020\u000bH'JD\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\b0\u00040\u00032\u0014\b\u0001\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0X2\b\b\u0003\u0010Y\u001a\u00020Z2\b\b\u0003\u0010[\u001a\u00020ZH'J0\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\b0\u00040\u00032\u0014\b\u0001\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0XH'J(\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u00042\b\b\u0001\u0010_\u001a\u00020\u000b2\b\b\u0003\u0010\u0015\u001a\u00020\u000bH§@¢\u0006\u0002\u0010`JF\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010c\u001a\u00020\u000b2\b\b\u0001\u0010T\u001a\u00020\u000b2\b\b\u0003\u0010d\u001a\u00020\u000bH§@¢\u0006\u0002\u0010eJF\u0010f\u001a\b\u0012\u0004\u0012\u00020b0\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010c\u001a\u00020\u000b2\b\b\u0001\u0010T\u001a\u00020\u000b2\b\b\u0003\u0010d\u001a\u00020\u000bH§@¢\u0006\u0002\u0010eJ&\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0h0\u00042\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0002\u0010jJ\u0012\u0010k\u001a\u00020)2\b\b\u0001\u0010\f\u001a\u00020\u000bH'J(\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\u000bH§@¢\u0006\u0002\u0010`J\u0014\u0010n\u001a\u00020)2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000bH'J\u001e\u0010o\u001a\b\u0012\u0004\u0012\u00020Z0\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u000bH§@¢\u0006\u0002\u0010jJ\u001e\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\u00040\u00032\b\b\u0001\u0010r\u001a\u00020\u000bH'J \u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'J\u001a\u0010t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0h0\u00040\u0003H'J\u0012\u0010v\u001a\u00020)2\b\b\u0001\u0010\f\u001a\u00020\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006wÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/api/MarketApi;", "", "getQuotes", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "Lcom/kubi/spot/entity/MarketsEntity;", "getPersonalHistory", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/spot/entity/DelegationItemEntity;", "tradeType", "", "symbol", "orderId", "page", "", "size", "getSavingBalance", "Lcom/kubi/spot/entity/SavingBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "cancelTradeOder", "type", "cancelOcoOder", "requestTradeOder", "Lcom/kubi/spot/entity/OrderResultEntity;", "stringStringMap", "", "fingerEvent", "requestTradeOderV2", "validationToken", "requestTradeSavingOrder", "requestTradeSavingOrderV2", "requestOcoOder", "requestOcoOderV2", "requestMarginOcoOder", "requestMarginOcoOderV2", "requestTsoOder", "requestTsoOderV2", "requestMarginTsoOder", "requestMarginTsoOderV2", "getSymbolHistory", "Lokhttp3/Request;", TUIConstants.TUIContact.LIMIT, "getOrderBookCenter", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "getTradeDataBySymbols", "Lcom/kubi/data/entity/TradeItemBean;", "symbols", "from", "getDiscoverTradeDataBySymbols", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "customizations", "getMarketSymbol", "quotes", "getFavoriteSymbols", "marketTick", "Lcom/kubi/data/entity/MarketTicker;", "marketTickRequest", "getSymbolsInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "addFavorSymbol", "stickSymbol", "checkValidationCode", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "checkCodeParamsEntity", "Lcom/kubi/data/entity/CheckCodeParamsEntity;", "header", "fingerId", "getCheckRequiredValidation", "", "bizType", "loginToken", "getCurrencyBalance", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "accountType", "getOrderBookList", "Lcom/kubi/data/entity/OrderBookEntity;", "precision", "getMaintenanceStatus", "Lcom/kubi/data/entity/MaintenanceEntity;", "getCDNMaintenanceStatus", "url", "getPreviewInfo", "Lcom/kubi/data/entity/SymbolPreviewEntity;", "lang", "getTradeOrdersV2", "Lcom/kubi/spot/entity/DelegationEntity;", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "checkAllowCancelAll", "", "forceTypeLimit", "getStopOrdersV3", "getDiscoverDetailTags", "Lcom/kubi/spot/entity/TagEntity;", "item", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarketCoinInfo", "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "legalCurrency", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCoinInfo", "getMarketSymbolByCurrency", "", "Lcom/kubi/spot/quote/market/info/MarketByCurrencyEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarketTickerStats", "getTradeStats", "Lcom/kubi/spot/quote/market/info/MarketTradeStat;", "getMarketCurrency", "supportFlashTrade", "getNftInfo", "Lcom/kubi/spot/entity/NFTEntity;", "symbolName", "getRiskWarning", "getMarginSymbols", "Lcom/kubi/spot/entity/MarginSymbol;", "getTicker", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37053d {
    @FormUrlEncoded
    @POST("v1/trade/order")
    @NotNull
    /* JADX INFO: renamed from: A */
    Observable<BaseEntity<OrderResultEntity>> m82916A(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str);

    @GET("v1/maintenance-status")
    @NotNull
    /* JADX INFO: renamed from: B */
    Observable<BaseEntity<MaintenanceEntity>> m82917B();

    @GET("v1/kcop/quick-silver/universe-currency/symbols/info/{currency}")
    @Nullable
    /* JADX INFO: renamed from: E */
    Object m82918E(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @NotNull @Query("symbol") String str2, @NotNull @Query("legalCurrency") String str3, @NotNull @Query("lang") String str4, @NotNull @Query("source") String str5, @NotNull Continuation<? super BaseEntity<MarketCoinInfo>> continuation);

    @FormUrlEncoded
    @POST("v2/kc/trade/tso-order")
    @NotNull
    /* JADX INFO: renamed from: F */
    Observable<BaseEntity<OrderResultEntity>> m82919F(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str, @Header("X-VALIDATION-TOKEN") @Nullable String str2);

    @FormUrlEncoded
    @POST("v1/kc/trade/tso-order")
    @NotNull
    /* JADX INFO: renamed from: G */
    Observable<BaseEntity<OrderResultEntity>> m82920G(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str);

    @FormUrlEncoded
    @POST("v2/kc/trade/saving/order")
    @NotNull
    /* JADX INFO: renamed from: H */
    Observable<BaseEntity<OrderResultEntity>> m82921H(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str, @Header("X-VALIDATION-TOKEN") @Nullable String str2);

    @FormUrlEncoded
    @POST("v1/margin/trade/tso-order")
    @NotNull
    /* JADX INFO: renamed from: I */
    Observable<BaseEntity<OrderResultEntity>> m82922I(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str);

    @FormUrlEncoded
    @POST("v2/margin/trade/oco-order")
    @NotNull
    /* JADX INFO: renamed from: L */
    Observable<BaseEntity<OrderResultEntity>> m82923L(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str, @Header("X-VALIDATION-TOKEN") @Nullable String str2);

    @GET("v1/quick-silver/universe-currency/market/symbols/{currency}")
    @Nullable
    /* JADX INFO: renamed from: M */
    Object m82924M(@Path(FirebaseAnalytics.Param.CURRENCY) @Nullable String str, @NotNull Continuation<? super BaseEntity<List<MarketByCurrencyEntity>>> continuation);

    @FormUrlEncoded
    @POST("v1/kc/trade/saving/order")
    @NotNull
    /* JADX INFO: renamed from: O */
    Observable<BaseEntity<OrderResultEntity>> m82925O(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str);

    @GET
    @NotNull
    /* JADX INFO: renamed from: Q */
    Observable<BaseEntity<MaintenanceEntity>> m82926Q(@Url @NotNull String str);

    @FormUrlEncoded
    @POST("v2/margin/trade/tso-order")
    @NotNull
    /* JADX INFO: renamed from: R */
    Observable<BaseEntity<OrderResultEntity>> m82927R(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str, @Header("X-VALIDATION-TOKEN") @Nullable String str2);

    @GET("v1/trade/personal-history")
    @NotNull
    /* JADX INFO: renamed from: S */
    Observable<BaseEntity<BasePageEntity<DelegationItemEntity>>> m82928S(@Nullable @Query("tradeType") String str, @Nullable @Query("symbol") String str2, @Nullable @Query("orderId") String str3, @Query("page") int i11, @Query("size") int i12);

    @FormUrlEncoded
    @POST("v2/kc/trade/oco-order")
    @NotNull
    /* JADX INFO: renamed from: U */
    Observable<BaseEntity<OrderResultEntity>> m82929U(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str, @Header("X-VALIDATION-TOKEN") @Nullable String str2);

    @GET("v1/kcop/quick-silver/universe-currency/market/{currency}")
    @NotNull
    /* JADX INFO: renamed from: V */
    Request m82930V(@Path(FirebaseAnalytics.Param.CURRENCY) @Nullable String str) throws Throwable;

    @FormUrlEncoded
    @POST("v1/margin/trade/oco-order")
    @NotNull
    /* JADX INFO: renamed from: W */
    Observable<BaseEntity<OrderResultEntity>> m82931W(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str);

    @GET("spot-trade/app/earn-balance")
    @NotNull
    /* JADX INFO: renamed from: X */
    Observable<BaseEntity<SavingBalanceEntity>> m82932X(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<ArrayList<TradeItemBean>>> m82933a(@Nullable @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @FormUrlEncoded
    @POST("v2/chameleon/user/collect/spot")
    @NotNull
    Observable<BaseEntity<Object>> addFavorSymbol(@Field("symbols") @Nullable String symbol);

    @GET("v1/market/orderbook-level2")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<OrderBookEntity>> m82934b(@Nullable @Query("symbol") String str, @NotNull @Query(TUIConstants.TUIContact.LIMIT) String str2, @Nullable @Query("precision") String str3);

    @GET("v1/symbols")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<ArrayList<SymbolInfoEntity>>> m82935c(@Nullable @Query("symbols") String str);

    @GET("v1/symbol/previewInfo")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<SymbolPreviewEntity>> m82936d(@NotNull @Query("symbol") String str, @NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str2, @NotNull @Query("lang") String str3);

    @GET("v2/kc/trade/orders")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<BasePageEntity<DelegationEntity>>> m82937e(@QueryMap @NotNull HashMap<String, String> map, @Query("checkAllowCancelAll") boolean z11, @Query("forceTypeLimit") boolean z12);

    @FormUrlEncoded
    @POST("v1/account/currency-balance")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<CurrencyBalance>> m82938f(@Field("accountType") @Nullable String str, @Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str2);

    @GET("v1/market/orderbook-level1")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<OrderBookCenterEntity>> m82939g(@Nullable @Query("symbol") String str);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    Observable<BaseEntity<ArrayList<TradeItemBean>>> getMarketSymbol(@Nullable @Query("quote") String quotes, @Header("User-Agent") @NotNull String from);

    @GET("v1/symbol/loan-symbols")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<List<MarginSymbol>>> m82940h();

    @GET("v1/kumex-market/latest-ticker")
    @NotNull
    /* JADX INFO: renamed from: i */
    Request m82941i(@NotNull @Query("symbol") String str);

    @GET("v1/api-reaper/flash-trade/valid-enter/{currency}")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m82942j(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @NotNull Continuation<? super BaseEntity<Boolean>> continuation);

    @GET("v1/discover/item/tag")
    @Nullable
    /* JADX INFO: renamed from: k */
    Object m82943k(@NotNull @Query("item") String str, @NotNull @Query("type") String str2, @NotNull Continuation<? super BaseEntity<TagEntity>> continuation);

    @GET("v1/quick-silver/universe-currency/symbols/stats/{symbol}")
    @NotNull
    /* JADX INFO: renamed from: l */
    Request m82944l(@Path("symbol") @NotNull String str) throws Throwable;

    @GET("v3/kc/trade/stop-orders")
    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<BaseEntity<BasePageEntity<DelegationEntity>>> m82945m(@QueryMap @NotNull HashMap<String, String> map);

    @GET("v1/quick-silver/universe-currency/symbols/info/{currency}")
    @Nullable
    /* JADX INFO: renamed from: n */
    Object m82946n(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @NotNull @Query("symbol") String str2, @NotNull @Query("legalCurrency") String str3, @NotNull @Query("lang") String str4, @NotNull @Query("source") String str5, @NotNull Continuation<? super BaseEntity<MarketCoinInfo>> continuation);

    @GET("v1/trade/symbol-history")
    @NotNull
    /* JADX INFO: renamed from: o */
    Request m82947o(@Query(TUIConstants.TUIContact.LIMIT) int i11, @Nullable @Query("symbol") String str) throws Throwable;

    @GET("v1/quick-silver/universe-currency/symbol/user-trade-status")
    @Nullable
    /* JADX INFO: renamed from: p */
    Object m82948p(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @NotNull Continuation<? super BaseEntity<MarketTradeStat>> continuation);

    @GET("v1/markets")
    @NotNull
    /* JADX INFO: renamed from: q */
    Observable<BaseEntity<ArrayList<MarketsEntity>>> m82949q();

    @GET("v1/kc/token/symbol")
    @NotNull
    /* JADX INFO: renamed from: r */
    Observable<BaseEntity<NFTEntity>> m82950r(@NotNull @Query("symbolName") String str);

    @FormUrlEncoded
    @POST("v1/kc/trade/oco-order-cancel")
    @NotNull
    /* JADX INFO: renamed from: s */
    Observable<BaseEntity<Object>> m82951s(@Field("orderId") @Nullable String str);

    @GET("v1/market/tick")
    @NotNull
    /* JADX INFO: renamed from: t */
    Observable<BaseEntity<MarketTicker>> m82952t(@Nullable @Query("symbol") String str);

    @GET("v1/market/tick")
    @NotNull
    /* JADX INFO: renamed from: u */
    Request m82953u(@Nullable @Query("symbol") String str) throws Throwable;

    @Headers({"Cache-Time: 1000", "X-KC-CDN-SITE-TYPE: global"})
    @GET("discover-front/trading/item/spot")
    @NotNull
    /* JADX INFO: renamed from: v */
    Observable<BaseEntity<MarketListEntityItem>> m82954v(@Nullable @Query("symbol") String str, @NotNull @Query("customizations") String str2);

    @FormUrlEncoded
    @POST("v1/trade/order-cancel")
    @NotNull
    /* JADX INFO: renamed from: w */
    Observable<BaseEntity<Object>> m82955w(@Field("tradeType") @Nullable String str, @Field("orderId") @Nullable String str2, @Field("symbol") @Nullable String str3, @Field("type") @Nullable String str4);

    @POST("v1/auth/verify-validation-code")
    @NotNull
    /* JADX INFO: renamed from: x */
    Observable<BaseEntity<ArrayList<CheckCodeResultEntity>>> m82956x(@Body @NotNull CheckCodeParamsEntity checkCodeParamsEntity, @Header("X-SERVICE-PLATFORM") @NotNull String str, @Header("HEADER_FINGER_EVENT") @Nullable String str2);

    @FormUrlEncoded
    @POST("v1/kc/trade/oco-order")
    @NotNull
    /* JADX INFO: renamed from: y */
    Observable<BaseEntity<OrderResultEntity>> m82957y(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str);

    @FormUrlEncoded
    @POST("v2/trade/order")
    @NotNull
    /* JADX INFO: renamed from: z */
    Observable<BaseEntity<OrderResultEntity>> m82958z(@FieldMap @NotNull Map<String, String> map, @Header("HEADER_FINGER_EVENT") @Nullable String str, @Header("X-VALIDATION-TOKEN") @Nullable String str2);

    /* JADX INFO: renamed from: C */
    static /* synthetic */ Object m82909C(InterfaceC37053d interfaceC37053d, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketCoinInfo");
        }
        if ((i11 & 16) != 0) {
            str5 = "APP";
        }
        return interfaceC37053d.m82946n(str, str2, str3, str4, str5, continuation);
    }

    /* JADX INFO: renamed from: D */
    static /* synthetic */ Observable m82910D(InterfaceC37053d interfaceC37053d, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiscoverTradeDataBySymbols");
        }
        if ((i11 & 2) != 0) {
            str2 = "UserFavorites,PriceWarn,SymbolLabel";
        }
        return interfaceC37053d.m82954v(str, str2);
    }

    /* JADX INFO: renamed from: J */
    static /* synthetic */ Observable m82911J(InterfaceC37053d interfaceC37053d, CheckCodeParamsEntity checkCodeParamsEntity, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkValidationCode");
        }
        if ((i11 & 2) != 0) {
            str = "KUCOIN";
        }
        return interfaceC37053d.m82956x(checkCodeParamsEntity, str, str2);
    }

    /* JADX INFO: renamed from: K */
    static /* synthetic */ Object m82912K(InterfaceC37053d interfaceC37053d, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllCoinInfo");
        }
        if ((i11 & 16) != 0) {
            str5 = "APP";
        }
        return interfaceC37053d.m82918E(str, str2, str3, str4, str5, continuation);
    }

    /* JADX INFO: renamed from: N */
    static /* synthetic */ Object m82913N(InterfaceC37053d interfaceC37053d, String str, String str2, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiscoverDetailTags");
        }
        if ((i11 & 2) != 0) {
            str2 = AllCouponsItemModel.UNAVAILABLE_REASON_SYMBOL;
        }
        return interfaceC37053d.m82943k(str, str2, continuation);
    }

    /* JADX INFO: renamed from: P */
    static /* synthetic */ Observable m82914P(InterfaceC37053d interfaceC37053d, HashMap map, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeOrdersV2");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return interfaceC37053d.m82937e(map, z11, z12);
    }

    /* JADX INFO: renamed from: T */
    static /* synthetic */ Observable m82915T(InterfaceC37053d interfaceC37053d, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderBookList");
        }
        if ((i11 & 2) != 0) {
            str2 = "50";
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return interfaceC37053d.m82934b(str, str2, str3);
    }
}
