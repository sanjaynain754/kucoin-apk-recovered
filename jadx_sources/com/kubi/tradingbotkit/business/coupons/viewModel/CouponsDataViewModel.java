package com.kubi.tradingbotkit.business.coupons.viewModel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.bean.params.coupons.CouponsOverviewBean;
import com.kubi.tradingbotkit.business.coupons.CouponsSelectUIState;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.entity.coupons.AllCouponsEntity;
import com.kubi.tradingbotkit.entity.coupons.AllCouponsItemEntity;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27024b;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o50.C42974h;
import o50.C42977k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r40.C43925a;
import ro.C44128b;
import s40.C44314c;

/* JADX INFO: compiled from: CouponsDataViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010&\u001a\u00020'J\u001c\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0002J4\u0010-\u001a\u00020'2\b\u0010.\u001a\u0004\u0018\u00010/2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b00j\b\u0012\u0004\u0012\u00020\u000b`12\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J*\u00102\u001a\u00020'2\b\u0010.\u001a\u0004\u0018\u00010/2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b00j\b\u0012\u0004\u0012\u00020\u000b`1H\u0002J2\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020,2\b\u00107\u001a\u0004\u0018\u00010\u00192\b\u0010+\u001a\u0004\u0018\u00010,J,\u00108\u001a\u00020'2\u0006\u00104\u001a\u00020,2\u0006\u00106\u001a\u00020,2\b\u00107\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR-\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00150\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\rR!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001a\u0010\rR!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\rR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b \u0010\rR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00069"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel;", "Landroidx/lifecycle/AndroidViewModel;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "response", "Lcom/kubi/tradingbotkit/business/coupons/repostory/CouponsRepository;", "newCouponsList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "getNewCouponsList", "()Landroidx/lifecycle/MutableLiveData;", "newCouponsList$delegate", "Lkotlin/Lazy;", "trialCouponsList", "Lcom/kubi/tradingbotkit/model/TrialCouponItemModel;", "getTrialCouponsList", "trialCouponsList$delegate", "allCouponsList", "Lcom/kubi/tradingbotkit/business/coupons/CouponsSelectUIState;", "getAllCouponsList", "allCouponsList$delegate", "maxRewardPercent", "Ljava/math/BigDecimal;", "getMaxRewardPercent", "maxRewardPercent$delegate", "isBlacklistUsers", "", "isBlacklistUsers$delegate", "checkCoupons", "getCheckCoupons", "checkCoupons$delegate", "coroutineExceptionHandler", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineExceptionHandler", "()Lkotlin/coroutines/CoroutineContext;", "receiveCoupons", "", "overviewCoupons", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsOverviewBean;", "checkCouponsId", "", "genericUsable", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsEntity;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "genericUnusable", "getSymbolPrice", "symbol", "quote", "templateType", "totalInvestments", "requestOverviewCoupons", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCouponsDataViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsDataViewModel.kt\ncom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n47#2,4:246\n1563#3:250\n1634#3,3:251\n1563#3:254\n1634#3,3:255\n*S KotlinDebug\n*F\n+ 1 CouponsDataViewModel.kt\ncom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel\n*L\n68#1:246,4\n155#1:250\n155#1:251,3\n185#1:254\n185#1:255,3\n*E\n"})
public final class CouponsDataViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final C44314c f52324V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52325W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f52326X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f52327Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f52328Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f52329a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f52330b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final CoroutineContext f52331c0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CouponsDataViewModel.kt\ncom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel\n*L\n1#1,49:1\n69#2,2:50\n*E\n"})
    public static final class C26122a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C26122a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97264h(exception);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsDataViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f52324V = new C44314c();
        this.f52325W = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.viewModel.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponsDataViewModel.m63923H();
            }
        });
        this.f52326X = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.viewModel.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponsDataViewModel.m63924K();
            }
        });
        this.f52327Y = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.viewModel.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponsDataViewModel.m63934w();
            }
        });
        this.f52328Z = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.viewModel.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponsDataViewModel.m63922G();
            }
        });
        this.f52329a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.viewModel.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponsDataViewModel.m63921F();
            }
        });
        this.f52330b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.viewModel.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponsDataViewModel.m63935x();
            }
        });
        this.f52331c0 = new C26122a(CoroutineExceptionHandler.INSTANCE);
    }

    /* JADX INFO: renamed from: F */
    public static final MutableLiveData m63921F() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: G */
    public static final MutableLiveData m63922G() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: H */
    public static final MutableLiveData m63923H() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: K */
    public static final MutableLiveData m63924K() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: w */
    public static final MutableLiveData m63934w() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: x */
    public static final MutableLiveData m63935x() {
        return new MutableLiveData();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<CouponsSelectUIState<List<AllCouponsItemModel>>> m63936A() {
        return (MutableLiveData) this.f52327Y.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<AllCouponsItemModel> m63937B() {
        return (MutableLiveData) this.f52330b0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final MutableLiveData<BigDecimal> m63938C() {
        return (MutableLiveData) this.f52328Z.getValue();
    }

    /* JADX INFO: renamed from: D */
    public final void m63939D(@NotNull String symbol, @NotNull String quote, @NotNull String templateType, @Nullable BigDecimal bigDecimal, @Nullable String str) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(templateType, "templateType");
        if (Intrinsics.areEqual(quote, "USDT")) {
            m63942J(symbol, templateType, C41014a.m89922G(bigDecimal, null, 1, null).toPlainString(), str);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), this.f52331c0, null, new CouponsDataViewModel$getSymbolPrice$1(quote, this, bigDecimal, symbol, templateType, str, null), 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final MutableLiveData<Boolean> m63940E() {
        return (MutableLiveData) this.f52329a0.getValue();
    }

    /* JADX INFO: renamed from: I */
    public final void m63941I(CouponsOverviewBean couponsOverviewBean, String str) {
        if (C42977k.f95112a.m94384a()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), this.f52331c0, null, new CouponsDataViewModel$overviewCoupons$1(this, couponsOverviewBean, str, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m63942J(@NotNull String symbol, @NotNull String templateType, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(templateType, "templateType");
        CouponsOverviewBean couponsOverviewBean = new CouponsOverviewBean();
        couponsOverviewBean.setSymbol(symbol);
        couponsOverviewBean.setTemplateType(templateType);
        couponsOverviewBean.setTotalInvestments(str);
        m63941I(couponsOverviewBean, str2);
    }

    /* JADX INFO: renamed from: y */
    public final void m63943y(AllCouponsEntity allCouponsEntity, ArrayList<AllCouponsItemModel> arrayList) {
        List<AllCouponsItemEntity> unusable;
        List<AllCouponsItemEntity> unusable2;
        ArrayList arrayList2 = null;
        List<AllCouponsItemEntity> unusable3 = allCouponsEntity != null ? allCouponsEntity.getUnusable() : null;
        if (unusable3 == null || unusable3.isEmpty()) {
            return;
        }
        AllCouponsItemModel allCouponsItemModel = new AllCouponsItemModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777215, null);
        allCouponsItemModel.setSubTitle(t0.a(C27017c.f54310a.m66516f(R$string.kc_tb_coupon_unavailable, new Object[0]), C42974h.m94374c(String.valueOf((allCouponsEntity == null || (unusable2 = allCouponsEntity.getUnusable()) == null) ? null : Integer.valueOf(unusable2.size())))).toString());
        allCouponsItemModel.setType(101);
        arrayList.add(allCouponsItemModel);
        if (allCouponsEntity != null && (unusable = allCouponsEntity.getUnusable()) != null) {
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(unusable, 10));
            Iterator<T> it = unusable.iterator();
            while (it.hasNext()) {
                AllCouponsItemModel allCouponsItemModelM96828b = new C43925a().m96828b((AllCouponsItemEntity) it.next());
                allCouponsItemModelM96828b.setType(103);
                arrayList2.add(allCouponsItemModelM96828b);
            }
        }
        arrayList.addAll(C27024b.m66560c(arrayList2));
    }

    /* JADX INFO: renamed from: z */
    public final void m63944z(AllCouponsEntity allCouponsEntity, ArrayList<AllCouponsItemModel> arrayList, String str) {
        List<AllCouponsItemEntity> usable;
        List<AllCouponsItemEntity> usable2;
        ArrayList arrayList2 = null;
        List<AllCouponsItemEntity> usable3 = allCouponsEntity != null ? allCouponsEntity.getUsable() : null;
        if (usable3 == null || usable3.isEmpty()) {
            return;
        }
        AllCouponsItemModel allCouponsItemModel = new AllCouponsItemModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777215, null);
        allCouponsItemModel.setSubTitle(t0.a(C27017c.f54310a.m66516f(R$string.kc_tb_coupon_available, new Object[0]), C42974h.m94374c(String.valueOf((allCouponsEntity == null || (usable2 = allCouponsEntity.getUsable()) == null) ? null : Integer.valueOf(usable2.size())))).toString());
        allCouponsItemModel.setType(101);
        arrayList.add(allCouponsItemModel);
        if (allCouponsEntity != null && (usable = allCouponsEntity.getUsable()) != null) {
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(usable, 10));
            Iterator<T> it = usable.iterator();
            while (it.hasNext()) {
                AllCouponsItemModel allCouponsItemModelM96828b = new C43925a().m96828b((AllCouponsItemEntity) it.next());
                allCouponsItemModelM96828b.setType(102);
                allCouponsItemModelM96828b.setChecked(Intrinsics.areEqual(str, allCouponsItemModelM96828b.getCouponsId()));
                if (allCouponsItemModelM96828b.getIsChecked()) {
                    t0.d(m63937B(), allCouponsItemModelM96828b);
                }
                arrayList2.add(allCouponsItemModelM96828b);
            }
        }
        arrayList.addAll(C27024b.m66560c(arrayList2));
    }
}
