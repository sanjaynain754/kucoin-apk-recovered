package com.kubi.tradingbotkit.business.aggregation.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MediatorLiveData;
import androidx.media3.common.MimeTypes;
import com.kubi.tradingbotkit.business.aggregation.viewmodel.GridTradingListViewModel;
import com.kubi.tradingbotkit.model.GridTradingItemModel;
import com.kubi.utils.DataMapUtil;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: GridTradingListViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\rJ\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u0017J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u000fR!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u000f¨\u0006("}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/aggregation/viewmodel/GridTradingListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "coroutineExceptionHandler", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineExceptionHandler", "()Lkotlin/coroutines/CoroutineContext;", "gridTradList", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/kubi/tradingbotkit/model/GridTradingItemModel;", "getGridTradList", "()Landroidx/lifecycle/MediatorLiveData;", "gridTradList$delegate", "Lkotlin/Lazy;", "nativeSupportGridType", "", "getNativeSupportGridType", "nativeSupportGridType$delegate", "showFailedView", "", "getShowFailedView", "showFailedView$delegate", "selectItemType", "getSelectItemType", "selectItemType$delegate", "requestGridTradingList", "", "selectGridType", "gridData", "updateSelectedGrid", "shouldOpenGridTradingDialog", "isMaintain", "gridStatus", "futuresGridStatus", "getGridTradingType", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridTradingListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridTradingListViewModel.kt\ncom/kubi/tradingbotkit/business/aggregation/viewmodel/GridTradingListViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n47#2,4:192\n1869#3,2:196\n295#3,2:201\n136#4:198\n126#4,2:199\n1#5:203\n*S KotlinDebug\n*F\n+ 1 GridTradingListViewModel.kt\ncom/kubi/tradingbotkit/business/aggregation/viewmodel/GridTradingListViewModel\n*L\n53#1:192,4\n135#1:196,2\n173#1:201,2\n148#1:198\n150#1:199,2\n*E\n"})
public final class GridTradingListViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f52208a0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final CoroutineContext f52209V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52210W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f52211X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f52212Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f52213Z;

    /* JADX INFO: compiled from: GridTradingListViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/aggregation/viewmodel/GridTradingListViewModel$Companion;", "", "<init>", "()V", "GRID_TRADING_TYPE", "", "GRID_TRADING_LIST_SHOWING", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.aggregation.viewmodel.GridTradingListViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 GridTradingListViewModel.kt\ncom/kubi/tradingbotkit/business/aggregation/viewmodel/GridTradingListViewModel\n*L\n1#1,49:1\n54#2,2:50\n*E\n"})
    public static final class C26031a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C26031a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97264h(exception);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridTradingListViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f52209V = new C26031a(CoroutineExceptionHandler.INSTANCE);
        this.f52210W = LazyKt.lazy(new Function0() { // from class: j40.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridTradingListViewModel.m63698t();
            }
        });
        this.f52211X = LazyKt.lazy(new Function0() { // from class: j40.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridTradingListViewModel.m63699u();
            }
        });
        this.f52212Y = LazyKt.lazy(new Function0() { // from class: j40.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridTradingListViewModel.m63701w();
            }
        });
        this.f52213Z = LazyKt.lazy(new Function0() { // from class: j40.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridTradingListViewModel.m63700v();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static final MediatorLiveData m63698t() {
        return new MediatorLiveData();
    }

    /* JADX INFO: renamed from: u */
    public static final MediatorLiveData m63699u() {
        return new MediatorLiveData();
    }

    /* JADX INFO: renamed from: v */
    public static final MediatorLiveData m63700v() {
        return new MediatorLiveData();
    }

    /* JADX INFO: renamed from: w */
    public static final MediatorLiveData m63701w() {
        return new MediatorLiveData();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MediatorLiveData<List<GridTradingItemModel>> m63702r() {
        return (MediatorLiveData) this.f52210W.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final String m63703s() {
        GridTradingItemModel gridTradingItemModel;
        String type;
        Object next;
        String type2;
        String strM66375i = DataMapUtil.f54245a.m66375i("grid_trading_type", "");
        String str = "GRID";
        GridTradingItemModel gridTradingItemModel2 = null;
        Object obj = null;
        GridTradingItemModel gridTradingItemModel3 = null;
        Object obj2 = null;
        if (strM66375i.length() == 0) {
            List<GridTradingItemModel> value = m63702r().getValue();
            if (value != null) {
                for (Object obj3 : value) {
                    GridTradingItemModel gridTradingItemModel4 = (GridTradingItemModel) obj3;
                    String type3 = gridTradingItemModel4.getType();
                    if (type3 != null && type3.length() != 0 && Intrinsics.areEqual(gridTradingItemModel4.getAction(), "APP")) {
                        obj = obj3;
                        break;
                    }
                }
                gridTradingItemModel3 = (GridTradingItemModel) obj;
            }
            if (gridTradingItemModel3 != null && (type2 = gridTradingItemModel3.getType()) != null) {
                str = type2;
            }
            DataMapUtil.f54245a.m66380o("grid_trading_type", str);
            return str;
        }
        List<GridTradingItemModel> value2 = m63702r().getValue();
        if (value2 != null) {
            Iterator<T> it = value2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                GridTradingItemModel gridTradingItemModel5 = (GridTradingItemModel) next;
                if (Intrinsics.areEqual(gridTradingItemModel5.getType(), strM66375i) && Intrinsics.areEqual(gridTradingItemModel5.getAction(), "APP")) {
                    break;
                }
            }
            gridTradingItemModel = (GridTradingItemModel) next;
        } else {
            gridTradingItemModel = null;
        }
        if (gridTradingItemModel == null) {
            List<GridTradingItemModel> value3 = m63702r().getValue();
            if (value3 != null) {
                for (Object obj4 : value3) {
                    if (Intrinsics.areEqual(((GridTradingItemModel) obj4).getAction(), "APP")) {
                        obj2 = obj4;
                        break;
                    }
                }
                gridTradingItemModel2 = (GridTradingItemModel) obj2;
            }
        } else {
            gridTradingItemModel2 = gridTradingItemModel;
        }
        if (gridTradingItemModel2 != null && (type = gridTradingItemModel2.getType()) != null) {
            str = type;
        }
        DataMapUtil.f54245a.m66380o("grid_trading_type", str);
        return str;
    }
}
