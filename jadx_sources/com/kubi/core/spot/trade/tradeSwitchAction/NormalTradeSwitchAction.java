package com.kubi.core.spot.trade.tradeSwitchAction;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.submit.TradeTypeUiData;
import com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.spot.trade.tradeSwitchAction.NormalTradeSwitchAction;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradebase.tradetype.TradeTypeSelectedDialog;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p310he.InterfaceC38175b;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v30.C45409v;
import ve.C45518a;
import ye.InterfaceC46470a;

/* JADX INFO: compiled from: NormalTradeSwitchAction.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J.\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0016¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/core/spot/trade/tradeSwitchAction/NormalTradeSwitchAction;", "Lcom/kubi/core/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "<init>", "()V", "clickPriceType", "", "supportTradeTypes", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "tradeVerticalSubmitFragment", "Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment;", "mParent", "Lcom/kubi/core/spot/business/ITradeParentBehavior;", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeVerticalBinding;", "checkPriceInput", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "subscriptionSocket", "fragment", "Lcom/kubi/sdk/BaseFragment;", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "auction", "Lkotlin/Function0;", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNormalTradeSwitchAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalTradeSwitchAction.kt\ncom/kubi/core/spot/trade/tradeSwitchAction/NormalTradeSwitchAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n*L\n1#1,122:1\n1563#2:123\n1634#2,3:124\n1563#2:128\n1634#2,3:129\n1#3:127\n37#4:132\n36#4,3:133\n44#5,8:136\n44#5,8:144\n*S KotlinDebug\n*F\n+ 1 NormalTradeSwitchAction.kt\ncom/kubi/core/spot/trade/tradeSwitchAction/NormalTradeSwitchAction\n*L\n41#1:123\n41#1:124,3\n44#1:128\n44#1:129,3\n44#1:132\n44#1:133,3\n98#1:136,8\n118#1:144,8\n*E\n"})
public final class NormalTradeSwitchAction implements InterfaceC46470a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f21281a = new Companion(null);

    /* JADX INFO: compiled from: NormalTradeSwitchAction.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/spot/trade/tradeSwitchAction/NormalTradeSwitchAction$Companion;", "", "<init>", "()V", "NORMAL_TRADE_SWITCH_ACTION_CLASS_NAME", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX INFO: renamed from: e */
    public static final Unit m23382e(List list, InterfaceC38175b interfaceC38175b, TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, TradeType type) {
        Object next;
        String string;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TradeTypeUiData) next).getF20771b() != type);
        TradeTypeUiData tradeTypeUiData = (TradeTypeUiData) next;
        if (tradeTypeUiData != null) {
            int f20772c = tradeTypeUiData.getF20772c();
            Context context = tradeBaseVerticalSubmitFragment.getContext();
            string = context != null ? context.getString(f20772c) : null;
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        interfaceC38175b.mo22376e(string, type);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m23383f(C45409v c45409v, DialogInterface dialogInterface) {
        c45409v.f102358i.setImageResource(R$drawable.ic2_triangle_bottom_16);
    }

    @Override // ye.InterfaceC46470a
    /* JADX INFO: renamed from: b */
    public void mo21625b(@NotNull final List<? extends TradeTypeUiData> supportTradeTypes, @Nullable final TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, @NotNull final InterfaceC38175b mParent, @NotNull final C45409v binding) {
        Object next;
        String value;
        TradeType f20771b;
        Intrinsics.checkNotNullParameter(supportTradeTypes, "supportTradeTypes");
        Intrinsics.checkNotNullParameter(mParent, "mParent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        if (tradeBaseVerticalSubmitFragment == null || !tradeBaseVerticalSubmitFragment.isShowing()) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportTradeTypes, 10));
        Iterator<T> it = supportTradeTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeTypeUiData) it.next()).getF20771b());
        }
        Iterator<T> it2 = supportTradeTypes.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((TradeTypeUiData) next).getIsChecked());
        TradeTypeUiData tradeTypeUiData = (TradeTypeUiData) next;
        TradeTypeSelectedDialog.Companion companion = TradeTypeSelectedDialog.f51647v0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((TradeType) it3.next()).getValue());
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        if (tradeTypeUiData == null || (f20771b = tradeTypeUiData.getF20771b()) == null || (value = f20771b.getValue()) == null) {
            value = TradeType.LIMIT.getValue();
        }
        BaseDialogFragment baseDialogFragmentM54192r3 = TradeTypeSelectedDialog.Companion.newInstance$default(companion, strArr, value, String.valueOf(tradeBaseVerticalSubmitFragment.getF79322n()), false, 8, (Object) null).m63384w4(new Function1() { // from class: ye.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NormalTradeSwitchAction.m23382e(supportTradeTypes, mParent, tradeBaseVerticalSubmitFragment, (TradeType) obj);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: ye.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NormalTradeSwitchAction.m23383f(binding, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = tradeBaseVerticalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "TradeTypeSelectedDialog");
        binding.f102358i.setImageResource(R$drawable.ic2_triangle_top_16);
    }

    @Override // ye.InterfaceC46470a
    /* JADX INFO: renamed from: a */
    public boolean mo21624a(@Nullable BigDecimal bigDecimal) throws JSONException {
        if (C41014a.m89919D(bigDecimal)) {
            C45518a.m100507a("当前订单-校验输入的价格为0", "NormalTradeSwitchAction");
            ToastCompat.m66441G(C27017c.f54310a.m66513b().getString(R$string.price_not_zero), new Object[0]);
            SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_INPUT_PRICE, SpotBusinessTracker.SpotFailReason.INPUT_PRICE_ILLEGAL);
            return false;
        }
        return true;
    }
}
