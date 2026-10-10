package com.kubi.kumex.record.currentDelegate.adapter;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.history.filter.OrderAssetType;
import com.kubi.futures.trade.order.modify.BaseModifyOrderDialog;
import com.kubi.futures.trade.order.modify.limit.LimitModifyOrderViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.RobotSiteConfigEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.C16700e0;
import com.kubi.kumex.record.OrderEmpty;
import com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateAdapter;
import com.kubi.kumex.trade.PositionHelper;
import com.kubi.kumex.utils.C17035b;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.view.OrderHorizontalProgress;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37567b;
import fm.C37568c;
import fm.C37569d;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.util.MultiTypeDelegate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import ki.C41050b;
import ki.InterfaceC41049a;
import li.C42227b;
import li.C42230e;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p801yl.C46527h0;
import p830zf.InterfaceC46810m;
import p832zh.C46855g;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import t30.C44681a;
import y70.C46392a;

/* JADX INFO: compiled from: TodoDelegateAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001>Bç\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012U\b\u0002\u0010\b\u001aO\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\tj\u0004\u0018\u0001`\u0013\u0012+\b\u0002\u0010\u0014\u001a%\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u0012+\b\u0002\u0010\u0019\u001a%\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a\u0012U\b\u0002\u0010\u001b\u001aO\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\tj\u0004\u0018\u0001`\u0013\u0012@\b\u0002\u0010\u001c\u001a:\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001dj\u0004\u0018\u0001` ¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0002H\u0014J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0018\u0010)\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u001eH\u0002J\u0018\u0010+\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010,\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010.\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\"\u0010/\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u000101H\u0002J\"\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0010\u0010;\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0003H\u0016J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0010H\u0002J\b\u0010=\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R[\u0010\b\u001aO\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\tj\u0004\u0018\u0001`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\u0014\u001a%\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\u0019\u001a%\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015j\u0004\u0018\u0001`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R[\u0010\u001b\u001aO\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\tj\u0004\u0018\u0001`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000RF\u0010\u001c\u001a:\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001dj\u0004\u0018\u0001` X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00107\u001a\u0012\u0012\u0004\u0012\u00020908j\b\u0012\u0004\u0012\u000209`:X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "orders", "", "isFuturesTrade", "", "revokeOrderClicked", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "pos", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "orderEntity", "", "Lcom/kubi/kumex/record/currentDelegate/adapter/OrderClicked;", "viewOppositeFundsClicked", "Lkotlin/Function1;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderHistoryNumTipsInfo;", "orderNumTipsInfo", "Lcom/kubi/kumex/record/currentDelegate/adapter/ViewOppositeFundsClicked;", "viewMoreClicked", "Lcom/kubi/kumex/record/currentDelegate/adapter/ViewAllDelegationsClicked;", "twapClickListener", "emptyGuideClicked", "Lkotlin/Function2;", "Lcom/kubi/kumex/record/OrderEmpty;", "orderEmpty", "Lcom/kubi/kumex/record/currentDelegate/adapter/EmptyGuideClicked;", "<init>", "(Ljava/util/List;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V", "convert", "helper", "item", "bindTwapOrder", C33954u6.f72238i, "order", "bindOrderEmpty", "empty", "bindNumTips", "bindOrderInfo", "bindStopOrderInfo", "bindTsoOrderInfo", "renderCommonScene", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "requestChaseOrder", "fragment", "Lcom/kubi/sdk/BaseFragment;", "confirmBtn", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "reportOrders", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "onViewAttachedToWindow", "expose", "clearExpirePositionId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTodoDelegateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoDelegateAdapter.kt\ncom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateAdapter\n+ 2 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 6 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,839:1\n55#2:840\n55#2:841\n55#2:842\n55#2:848\n55#2:849\n55#2:850\n55#2:856\n55#2:861\n55#2:862\n55#2:866\n153#3,2:843\n126#3,2:863\n136#3:865\n178#4:845\n17#5,2:846\n220#6,5:851\n1563#7:857\n1634#7,3:858\n*S KotlinDebug\n*F\n+ 1 TodoDelegateAdapter.kt\ncom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateAdapter\n*L\n241#1:840\n247#1:841\n270#1:842\n444#1:848\n645#1:849\n651#1:850\n704#1:856\n522#1:861\n535#1:862\n574#1:866\n361#1:843,2\n560#1:863,2\n551#1:865\n361#1:845\n380#1:846,2\n663#1:851,5\n716#1:857\n716#1:858,3\n*E\n"})
public final class TodoDelegateAdapter extends BaseQuickAdapter<TodoDelegateItem, BaseViewHolder> {

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Companion f29991p = new Companion(null);

    /* JADX INFO: renamed from: i */
    public final boolean f29992i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final Function3<View, Integer, OrderEntity, Unit> f29993j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Function1<TodoDelegateItem.OrderHistoryNumTipsInfo, Unit> f29994k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final Function1<View, Unit> f29995l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final Function3<View, Integer, OrderEntity, Unit> f29996m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final Function2<View, OrderEmpty, Unit> f29997n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final HashSet<String> f29998o;

    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateAdapter$Companion;", "", "<init>", "()V", "NUM_TIPS", "", "ACTIVE_ORDER", "ORDER_HISTORY_EMPTY", "ORDER_NO_MORE", "STOP_ORDER", "TSO_ORDER", "ACTIVE_ORDER_FOOTER", "ACTIVE_ORDER_EMPTY", "TWAP_ORDER", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateAdapter$a */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/record/currentDelegate/adapter/TodoDelegateAdapter$1", "Lio/chad/library/adapter/base/util/MultiTypeDelegate;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "getItemType", "", "item", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16571a extends MultiTypeDelegate<TodoDelegateItem> {
        @Override // io.chad.library.adapter.base.util.MultiTypeDelegate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int getItemType(TodoDelegateItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof TodoDelegateItem.OrderHistoryNumTipsInfo) {
                return 1;
            }
            if (item instanceof TodoDelegateItem.ActiveOrderInfo) {
                return 2;
            }
            if (item instanceof TodoDelegateItem.d) {
                return 3;
            }
            if (item instanceof TodoDelegateItem.e) {
                return 4;
            }
            if (item instanceof TodoDelegateItem.StopOrderInfo) {
                return 5;
            }
            if (item instanceof TodoDelegateItem.TsoOrderInfo) {
                return 6;
            }
            if (item instanceof TodoDelegateItem.g) {
                return 7;
            }
            if (item instanceof TodoDelegateItem.OrderEmptyInfo) {
                return 8;
            }
            if (item instanceof TodoDelegateItem.TwapOrderInfo) {
                return 9;
            }
            if (item instanceof TodoDelegateItem.b) {
                return -1;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ TodoDelegateAdapter(List list, boolean z11, Function3 function3, Function1 function1, Function1 function2, Function3 function4, Function2 function5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z11, (i11 & 4) != 0 ? null : function3, (i11 & 8) != 0 ? null : function1, (i11 & 16) != 0 ? null : function2, (i11 & 32) != 0 ? null : function4, (i11 & 64) != 0 ? null : function5);
    }

    /* JADX INFO: renamed from: R */
    public final void m35504R(final BaseViewHolder baseViewHolder, final OrderEntity orderEntity, ContractEntity contractEntity) {
        baseViewHolder.setVisible(R$id.ivArrow, this.f29992i && !Intrinsics.areEqual(orderEntity.getSymbol(), C46527h0.f104291a.m102677L()));
        int i11 = R$id.modify;
        final View view = baseViewHolder.getView(i11);
        View view2 = baseViewHolder.getView(R$id.modifyLine);
        Intrinsics.checkNotNull(view);
        C27046k.m66684G(view, this.f29992i && C37568c.m84644o(orderEntity));
        Intrinsics.checkNotNull(view2);
        C27046k.m66684G(view2, C27046k.m66704s(view));
        View view3 = baseViewHolder.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: qm.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35472S(orderEntity, view);
            }
        }, 1, null);
        final View view4 = baseViewHolder.getView(R$id.chase);
        if (view4 != null) {
            View view5 = baseViewHolder.getView(R$id.chaseLine);
            C27046k.m66684G(view4, this.f29992i && C37568c.m84642m(orderEntity) && !C37568c.m84635f(orderEntity));
            Intrinsics.checkNotNull(view5);
            C27046k.m66684G(view5, C27046k.m66704s(view4));
            C27046k.m66711z(view4, 0L, new Function0() { // from class: qm.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TodoDelegateAdapter.m35473T(view4, this, orderEntity);
                }
            }, 1, null);
        }
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.symbol);
        C27096v0 c27096v0M24440e = contractEntity != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntity) : null;
        String symbol = orderEntity.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        baseTextView.setText(C27041f.m66667g(c27096v0M24440e, symbol));
        final BaseTextView baseTextView2 = (BaseTextView) baseViewHolder.getView(R$id.revoke);
        if (Intrinsics.areEqual(RepositoryServiceLocator.f19236a.m20288g().mo24997Y(C27041f.m66668h(orderEntity.getSymbol())), "Paused")) {
            C27017c c27017c = C27017c.f54310a;
            baseTextView2.setText(c27017c.m66516f(R$string.in_maintenance, new Object[0]));
            baseTextView2.setTextColor(c27017c.m66512a(R$color.c_text30));
        } else {
            C27017c c27017c2 = C27017c.f54310a;
            baseTextView2.setText(c27017c2.m66516f(R$string.revoke_order, new Object[0]));
            baseTextView2.setTextColor(c27017c2.m66512a(R$color.c_text));
        }
        Intrinsics.checkNotNull(baseTextView2);
        C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: qm.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35478Y(this.f96814b, baseTextView2, baseViewHolder, orderEntity);
            }
        }, 1, null);
        BaseTextView baseTextView3 = (BaseTextView) baseViewHolder.getView(R$id.time);
        Long createdAt = orderEntity.getCreatedAt();
        baseTextView3.setText(C27041f.m66668h(createdAt != null ? C44681a.m98835b(createdAt.longValue(), null, false, false, null, 15, null) : null));
        TextView textView = (TextView) baseViewHolder.getView(R$id.reduceOnlyAndHidden);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence charSequenceM35729i = C16700e0.m35729i(orderEntity, context, null, 2, null);
        if (charSequenceM35729i.length() == 0) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66684G(textView, false);
        } else {
            Intrinsics.checkNotNull(textView);
            C27046k.m66684G(textView, true);
            textView.setText(charSequenceM35729i);
        }
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.amount);
        C27017c c27017c3 = C27017c.f54310a;
        textView2.setText(c27017c3.m66516f(R$string.qty_stub, FuturesDisplayNameUtils.f22525a.m24439d(contractEntity)));
        ((AppCompatTextView) baseViewHolder.getView(R$id.marginMode)).setText(C37568c.m84634e(orderEntity) ? c27017c3.m66516f(R$string.kumex_cross_position, new Object[0]) : c27017c3.m66516f(R$string.kumex_isolate_position, new Object[0]));
        ((AppCompatTextView) baseViewHolder.getView(R$id.leverage)).setText(C17054k0.m36530d(orderEntity.getLeverage(), false, 1, null));
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.trialTag);
        Intrinsics.checkNotNull(textView3);
        C27046k.m66684G(textView3, orderEntity.isTrialFunds());
        textView3.setText(C27092t0.m66896a(orderEntity.getPrizeType()));
        AppCompatTextView appCompatTextView = (AppCompatTextView) baseViewHolder.getView(R$id.tvTradeType);
        String strM35730j = C16700e0.m35730j(orderEntity);
        if (strM35730j == null) {
            strM35730j = C27041f.m66668h(orderEntity.getAdvancedDisplayType());
        }
        if (strM35730j.length() == 0) {
            Intrinsics.checkNotNull(appCompatTextView);
            C27046k.m66684G(appCompatTextView, false);
        } else {
            Intrinsics.checkNotNull(appCompatTextView);
            C27046k.m66684G(appCompatTextView, true);
            appCompatTextView.setText(strM35730j);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) baseViewHolder.getView(R$id.side);
        Context context2 = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView2.setText(C16700e0.m35734n(orderEntity, context2));
        appCompatTextView2.setTextColor(C22890g.m54281f(c27017c3.m66513b(), Intrinsics.areEqual(orderEntity.getSide(), "buy")));
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) baseViewHolder.getView(R$id.close);
        Intrinsics.checkNotNull(appCompatTextView3);
        C27046k.m66684G(appCompatTextView3, C16700e0.m35733m(orderEntity));
        appCompatTextView3.setText(appCompatTextView3.getContext().getString(R$string.kumex_close_position_brief));
        Context context3 = appCompatTextView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatTextView3.setTextColor(C22890g.m54281f(context3, Intrinsics.areEqual(orderEntity.getSide(), "buy")));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TodoDelegateAdapter(@NotNull List<? extends TodoDelegateItem> orders, boolean z11, @Nullable Function3<? super View, ? super Integer, ? super OrderEntity, Unit> function3, @Nullable Function1<? super TodoDelegateItem.OrderHistoryNumTipsInfo, Unit> function1, @Nullable Function1<? super View, Unit> function2, @Nullable Function3<? super View, ? super Integer, ? super OrderEntity, Unit> function4, @Nullable Function2<? super View, ? super OrderEmpty, Unit> function5) {
        super(orders);
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f29992i = z11;
        this.f29993j = function3;
        this.f29994k = function1;
        this.f29995l = function2;
        this.f29996m = function4;
        this.f29997n = function5;
        C16571a c16571a = new C16571a();
        c16571a.registerItemType(1, R$layout.bkumex_item_order_header_num_tips);
        c16571a.registerItemType(2, R$layout.bkumex_item_order_active);
        c16571a.registerItemType(5, R$layout.bkumex_item_order_stop);
        c16571a.registerItemType(6, R$layout.bkumex_item_order_tso);
        c16571a.registerItemType(3, R$layout.view_empty);
        c16571a.registerItemType(4, R$layout.view_end);
        c16571a.registerItemType(7, R$layout.bkumex_item_orders_view_all);
        c16571a.registerItemType(8, R$layout.bkumex_position_order_empty_view);
        c16571a.registerItemType(9, R$layout.bkumex_item_order_twap);
        setMultiTypeDelegate(c16571a);
        this.f29998o = new HashSet<>(50);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m35462B(TodoDelegateAdapter todoDelegateAdapter, KcSecondaryButton kcSecondaryButton, OrderEmpty orderEmpty) {
        Function2<View, OrderEmpty, Unit> function2 = todoDelegateAdapter.f29997n;
        if (function2 != null) {
            Intrinsics.checkNotNull(kcSecondaryButton);
            function2.invoke(kcSecondaryButton, orderEmpty);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m35463C(TodoDelegateAdapter todoDelegateAdapter, KcSecondaryButton kcSecondaryButton, OrderEmpty orderEmpty) {
        Function2<View, OrderEmpty, Unit> function2 = todoDelegateAdapter.f29997n;
        if (function2 != null) {
            Intrinsics.checkNotNull(kcSecondaryButton);
            function2.invoke(kcSecondaryButton, orderEmpty);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m35464D(TodoDelegateAdapter todoDelegateAdapter, KcSecondaryButton kcSecondaryButton, OrderEmpty orderEmpty) {
        Function2<View, OrderEmpty, Unit> function2 = todoDelegateAdapter.f29997n;
        if (function2 != null) {
            Intrinsics.checkNotNull(kcSecondaryButton);
            function2.invoke(kcSecondaryButton, orderEmpty);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m35465I(TodoDelegateAdapter todoDelegateAdapter, KcSecondaryButton kcSecondaryButton, BaseViewHolder baseViewHolder, OrderEntity orderEntity) {
        Function3<View, Integer, OrderEntity, Unit> function3 = todoDelegateAdapter.f29996m;
        if (function3 != null) {
            Intrinsics.checkNotNull(kcSecondaryButton);
            function3.invoke(kcSecondaryButton, Integer.valueOf(baseViewHolder.getBindingAdapterPosition()), orderEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m35466J(TodoDelegateAdapter todoDelegateAdapter, KcSecondaryButton kcSecondaryButton, BaseViewHolder baseViewHolder, OrderEntity orderEntity) {
        Function3<View, Integer, OrderEntity, Unit> function3 = todoDelegateAdapter.f29996m;
        if (function3 != null) {
            Intrinsics.checkNotNull(kcSecondaryButton);
            function3.invoke(kcSecondaryButton, Integer.valueOf(baseViewHolder.getBindingAdapterPosition()), orderEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m35467K(TodoDelegateAdapter todoDelegateAdapter, KcSecondaryButton kcSecondaryButton, BaseViewHolder baseViewHolder, OrderEntity orderEntity) {
        Function3<View, Integer, OrderEntity, Unit> function3 = todoDelegateAdapter.f29996m;
        if (function3 != null) {
            Intrinsics.checkNotNull(kcSecondaryButton);
            function3.invoke(kcSecondaryButton, Integer.valueOf(baseViewHolder.getBindingAdapterPosition()), orderEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m35468L(TodoDelegateAdapter todoDelegateAdapter, BaseTextView baseTextView, BaseViewHolder baseViewHolder, OrderEntity orderEntity) {
        Function3<View, Integer, OrderEntity, Unit> function3 = todoDelegateAdapter.f29996m;
        if (function3 != null) {
            Intrinsics.checkNotNull(baseTextView);
            function3.invoke(baseTextView, Integer.valueOf(baseViewHolder.getBindingAdapterPosition()), orderEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    private final void m35469M() {
        if (this.f29998o.size() >= getData().size()) {
            List<TodoDelegateItem> data = getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
            for (TodoDelegateItem todoDelegateItem : data) {
                arrayList.add(todoDelegateItem instanceof TodoDelegateItem.b ? C27041f.m66668h(((TodoDelegateItem.b) todoDelegateItem).getOrderEntity().getId()) : "none");
            }
            final HashSet hashSet = CollectionsKt.toHashSet(arrayList);
            C17035b.m36494a(this.f29998o, new Function1() { // from class: qm.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TodoDelegateAdapter.m35470N(hashSet, (String) obj));
                }
            });
        }
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m35470N(HashSet hashSet, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !hashSet.contains(it);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m35471P(TodoDelegateAdapter todoDelegateAdapter, BaseViewHolder baseViewHolder) {
        Function1<View, Unit> function1 = todoDelegateAdapter.f29995l;
        if (function1 != null) {
            View itemView = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            function1.invoke(itemView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final void m35474U(final TodoDelegateAdapter todoDelegateAdapter, final BaseFragment baseFragment, final OrderEntity orderEntity, BaseViewHolder viewHolder, final DialogFragmentHelper d11) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(d11, "d");
        View view = viewHolder.getView(R$id.cbAgain);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66708w((CompoundButton) view, new Function2() { // from class: qm.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TodoDelegateAdapter.m35475V((CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        View view2 = viewHolder.getView(R$id.tvCancel);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: qm.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35476W(d11);
            }
        }, 1, null);
        final KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) viewHolder.getView(R$id.tvConfirm);
        Intrinsics.checkNotNull(kcPrimaryButton);
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: qm.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35477X(this.f96802b, baseFragment, kcPrimaryButton, orderEntity);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.btnHView);
        if (view3 != null) {
            ViewExtKt.m66577h(view3);
        }
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m35475V(CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "compoundButton");
        C46392a.m102328k(C46894j.f104736a.m103280s(), !compoundButton.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m35478Y(TodoDelegateAdapter todoDelegateAdapter, BaseTextView baseTextView, BaseViewHolder baseViewHolder, OrderEntity orderEntity) {
        Function3<View, Integer, OrderEntity, Unit> function3 = todoDelegateAdapter.f29993j;
        if (function3 != null) {
            Intrinsics.checkNotNull(baseTextView);
            function3.invoke(baseTextView, Integer.valueOf(baseViewHolder.getBindingAdapterPosition()), orderEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m35496y(TodoDelegateAdapter todoDelegateAdapter, TodoDelegateItem.OrderHistoryNumTipsInfo orderHistoryNumTipsInfo) {
        Function1<TodoDelegateItem.OrderHistoryNumTipsInfo, Unit> function1 = todoDelegateAdapter.f29994k;
        if (function1 != null) {
            function1.invoke(orderHistoryNumTipsInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x013b  */
    /* JADX INFO: renamed from: A */
    public final void m35497A(BaseViewHolder baseViewHolder, final OrderEmpty orderEmpty) {
        ((ImageView) baseViewHolder.getView(R$id.empty_icon)).setImageResource(R$drawable.ic2_common_empty);
        TextView textView = (TextView) baseViewHolder.itemView.findViewById(R$id.empty_tips);
        if (C27025c.m66566d(orderEmpty.getIsTrial())) {
            View viewFindViewById = baseViewHolder.itemView.findViewById(R$id.guideGroup);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66700o(viewFindViewById);
            Intrinsics.checkNotNull(textView);
            C27046k.m66685H(textView);
            textView.setText(baseViewHolder.itemView.getContext().getString(R$string.no_order));
            return;
        }
        View viewFindViewById2 = baseViewHolder.itemView.findViewById(R$id.guideGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66685H(viewFindViewById2);
        Intrinsics.checkNotNull(textView);
        C27046k.m66700o(textView);
        TextView textView2 = (TextView) baseViewHolder.itemView.findViewById(R$id.balanceTv);
        final KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) baseViewHolder.itemView.findViewById(R$id.guideBtn1);
        final KcSecondaryButton kcSecondaryButton2 = (KcSecondaryButton) baseViewHolder.itemView.findViewById(R$id.guideBtn2);
        final KcSecondaryButton kcSecondaryButton3 = (KcSecondaryButton) baseViewHolder.itemView.findViewById(R$id.guideBtn3);
        if (orderEmpty.getBalance() != null) {
            if (orderEmpty.getSettleCurrency() != null && orderEmpty.getPrecision() != null) {
                textView2.setText(C42828b.m93906g(C27041f.m66669i(C42180b.m92640e(orderEmpty.getBalance(), null, orderEmpty.getPrecision().intValue(), true, false, true, 0, null, 105, null), C37569d.m84684y()), C27041f.m66668h(C27041f.m66677q(orderEmpty.getSettleCurrency())), true, false, 4, null));
            }
            if (orderEmpty.getBalance().compareTo(BigDecimal.ZERO) > 0) {
                if (C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
                    Intrinsics.checkNotNull(kcSecondaryButton);
                    C27046k.m66685H(kcSecondaryButton);
                    kcSecondaryButton.setText(C27017c.f54310a.m66516f(R$string.copytd_copy_trading, new Object[0]));
                } else {
                    Intrinsics.checkNotNull(kcSecondaryButton);
                    C27046k.m66700o(kcSecondaryButton);
                }
                if (C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
                    RobotSiteConfigEntity robotSiteConfigEntity = (RobotSiteConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103252Q(), RobotSiteConfigEntity.class, null);
                    if (C27025c.m66566d(robotSiteConfigEntity != null ? robotSiteConfigEntity.isSupportFutures() : null)) {
                        Intrinsics.checkNotNull(kcSecondaryButton2);
                        C27046k.m66685H(kcSecondaryButton2);
                        kcSecondaryButton2.setText(C27017c.f54310a.m66516f(R$string.kc_tb_asset_bot, new Object[0]));
                    } else {
                        Intrinsics.checkNotNull(kcSecondaryButton2);
                        C27046k.m66700o(kcSecondaryButton2);
                    }
                } else {
                    Intrinsics.checkNotNull(kcSecondaryButton2);
                    C27046k.m66700o(kcSecondaryButton2);
                }
            } else {
                Intrinsics.checkNotNull(kcSecondaryButton);
                C27046k.m66685H(kcSecondaryButton);
                C27017c c27017c = C27017c.f54310a;
                kcSecondaryButton.setText(c27017c.m66516f(R$string.go_transfer, new Object[0]));
                Intrinsics.checkNotNull(kcSecondaryButton2);
                C27046k.m66685H(kcSecondaryButton2);
                kcSecondaryButton2.setText(c27017c.m66516f(R$string.go_deposite, new Object[0]));
            }
        } else {
            textView2.setText(C37569d.m84684y());
            Intrinsics.checkNotNull(kcSecondaryButton);
            C27046k.m66700o(kcSecondaryButton);
            Intrinsics.checkNotNull(kcSecondaryButton2);
            C27046k.m66700o(kcSecondaryButton2);
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46810m.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46810m) objM56186h).m103140a() : true) {
            Intrinsics.checkNotNull(kcSecondaryButton3);
            C27046k.m66685H(kcSecondaryButton3);
        } else {
            Intrinsics.checkNotNull(kcSecondaryButton3);
            C27046k.m66700o(kcSecondaryButton3);
        }
        C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: qm.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35462B(this.f96789b, kcSecondaryButton, orderEmpty);
            }
        }, 1, null);
        C27046k.m66711z(kcSecondaryButton2, 0L, new Function0() { // from class: qm.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35463C(this.f96792b, kcSecondaryButton2, orderEmpty);
            }
        }, 1, null);
        C27046k.m66711z(kcSecondaryButton3, 0L, new Function0() { // from class: qm.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35464D(this.f96795b, kcSecondaryButton3, orderEmpty);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m35501H(final BaseViewHolder baseViewHolder, final OrderEntity orderEntity) {
        String strM84684y;
        String strM84684y2;
        ContractEntity contractEntityM84630a = C37568c.m84630a(orderEntity);
        if (contractEntityM84630a == null) {
            return;
        }
        final BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.symbol);
        baseTextView.setText(FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM84630a));
        Intrinsics.checkNotNull(baseTextView);
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: qm.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35468L(this.f96818b, baseTextView, baseViewHolder, orderEntity);
            }
        }, 1, null);
        BaseTextView baseTextView2 = (BaseTextView) baseViewHolder.getView(R$id.time);
        Long createdAt = orderEntity.getCreatedAt();
        baseTextView2.setText(C27041f.m66668h(createdAt != null ? C44681a.m98835b(createdAt.longValue(), null, false, false, null, 15, null) : null));
        TextView textView = (TextView) baseViewHolder.getView(R$id.reduceOnlyAndHidden);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence charSequenceM35729i = C16700e0.m35729i(orderEntity, context, null, 2, null);
        boolean z11 = false;
        if (charSequenceM35729i.length() == 0) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66684G(textView, false);
        } else {
            Intrinsics.checkNotNull(textView);
            C27046k.m66684G(textView, true);
            textView.setText(charSequenceM35729i);
        }
        ((AppCompatTextView) baseViewHolder.getView(R$id.marginMode)).setText(C37568c.m84634e(orderEntity) ? C27017c.f54310a.m66516f(R$string.kumex_cross_position, new Object[0]) : C27017c.f54310a.m66516f(R$string.kumex_isolate_position, new Object[0]));
        ((AppCompatTextView) baseViewHolder.getView(R$id.leverage)).setText(C17054k0.m36530d(orderEntity.getLeverage(), false, 1, null));
        View view = baseViewHolder.getView(R$id.trialTag);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66684G(view, orderEntity.isTrialFunds());
        AppCompatTextView appCompatTextView = (AppCompatTextView) baseViewHolder.getView(R$id.side);
        Context context2 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView.setText(C16700e0.m35734n(orderEntity, context2));
        C27017c c27017c = C27017c.f54310a;
        appCompatTextView.setTextColor(C22890g.m54281f(c27017c.m66513b(), Intrinsics.areEqual(orderEntity.getSide(), "buy")));
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) baseViewHolder.getView(R$id.close);
        Intrinsics.checkNotNull(appCompatTextView2);
        C27046k.m66684G(appCompatTextView2, C16700e0.m35733m(orderEntity));
        appCompatTextView2.setText(appCompatTextView2.getContext().getString(R$string.kumex_close_position_brief));
        Context context3 = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatTextView2.setTextColor(C22890g.m54281f(context3, Intrinsics.areEqual(orderEntity.getSide(), "buy")));
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntityM84630a);
        if (interfaceC41049aM90019b instanceof C42230e) {
            interfaceC41049aM90019b = new C42227b();
        }
        ((TextView) baseViewHolder.getView(R$id.amount)).setText(c27017c.m66516f(R$string.qty_stub, interfaceC41049aM90019b.mo90014h(C37567b.m84629s(contractEntityM84630a))));
        OrderHorizontalProgress orderHorizontalProgress = (OrderHorizontalProgress) baseViewHolder.getView(R$id.progress);
        BigDecimal bigDecimalM89922G = C41014a.m89922G(orderEntity.getDealSize(), null, 1, null);
        BigDecimal bigDecimalSubtract = C41014a.m89922G(orderEntity.getSize(), null, 1, null).subtract(C41014a.m89922G(orderEntity.getCancelSize(), null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        orderHorizontalProgress.m36694g(bigDecimalM89922G, bigDecimalSubtract, C16700e0.m35722b(orderEntity, contractEntityM84630a, interfaceC41049aM90019b, C41014a.m89922G(orderEntity.getDealSize(), null, 1, null), false, 8, null), C16700e0.m35722b(orderEntity, contractEntityM84630a, interfaceC41049aM90019b, C41014a.m89922G(orderEntity.getSize(), null, 1, null).subtract(C41014a.m89922G(orderEntity.getCancelSize(), null, 1, null)), false, 8, null), Intrinsics.areEqual(orderEntity.getSide(), "buy"));
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.avgPriceValueTv);
        BigDecimal avgDealPrice = orderEntity.getAvgDealPrice();
        textView2.setText(C42180b.m92647l(avgDealPrice != null ? C42180b.m92640e(avgDealPrice, null, C37567b.m84618h(contractEntityM84630a), false, false, false, 0, null, 125, null) : null));
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.totalDurationValueTv);
        Long twapDurationSec = orderEntity.getTwapDurationSec();
        if (twapDurationSec == null || (strM84684y = C46855g.m103205f(twapDurationSec.longValue())) == null) {
            strM84684y = C37569d.m84684y();
        }
        textView3.setText(strM84684y);
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.usedDurationValueTv);
        Long twapUsedDurationSec = orderEntity.getTwapUsedDurationSec();
        if (twapUsedDurationSec == null || (strM84684y2 = C46855g.m103205f(twapUsedDurationSec.longValue())) == null) {
            strM84684y2 = C37569d.m84684y();
        }
        textView4.setText(strM84684y2);
        String strMo24997Y = RepositoryServiceLocator.f19236a.m20288g().mo24997Y(C27041f.m66668h(orderEntity.getSymbol()));
        TextView textView5 = (TextView) baseViewHolder.getView(R$id.statusTv);
        if (Intrinsics.areEqual(strMo24997Y, "Paused")) {
            textView5.setText(c27017c.m66516f(R$string.in_maintenance, new Object[0]));
            textView5.setBackgroundResource(R$drawable.shape_complementary8_4r);
            textView5.setTextColor(c27017c.m66512a(R$color.complementary));
        } else {
            textView5.setText(Intrinsics.areEqual(orderEntity.getStatus(), "PAUSED") ? textView5.getContext().getString(R$string.payment_Investment_status_paused) : "");
            textView5.setTextColor(c27017c.m66512a(R$color.complementary));
        }
        final KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) baseViewHolder.getView(R$id.twapEditTv);
        Intrinsics.checkNotNull(kcSecondaryButton);
        if (this.f29992i && C37568c.m84642m(orderEntity)) {
            z11 = true;
        }
        C27046k.m66684G(kcSecondaryButton, z11);
        C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: qm.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35465I(this.f96822b, kcSecondaryButton, baseViewHolder, orderEntity);
            }
        }, 1, null);
        final KcSecondaryButton kcSecondaryButton2 = (KcSecondaryButton) baseViewHolder.getView(R$id.twapStartOrPauseTv);
        Intrinsics.checkNotNull(kcSecondaryButton2);
        C27046k.m66684G(kcSecondaryButton2, !Intrinsics.areEqual(strMo24997Y, "Paused"));
        if (Intrinsics.areEqual(orderEntity.getStatus(), "PAUSED")) {
            kcSecondaryButton2.setTextColor(c27017c.m66512a(R$color.brandGreen));
            KcSecondaryButton.m55044m(kcSecondaryButton2, R$color.brandGreen4, null, 2, null);
            kcSecondaryButton2.setText(kcSecondaryButton2.getContext().getString(R$string.bkumex_twap_order_restart));
        } else {
            kcSecondaryButton2.setText(kcSecondaryButton2.getContext().getString(R$string.twap_record_stop_order));
            kcSecondaryButton2.setTextColor(c27017c.m66512a(R$color.c_text));
            KcSecondaryButton.m55044m(kcSecondaryButton2, R$color.c_cover4, null, 2, null);
        }
        C27046k.m66711z(kcSecondaryButton2, 0L, new Function0() { // from class: qm.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35466J(this.f96826b, kcSecondaryButton2, baseViewHolder, orderEntity);
            }
        }, 1, null);
        final KcSecondaryButton kcSecondaryButton3 = (KcSecondaryButton) baseViewHolder.getView(R$id.twapTerminateTv);
        Intrinsics.checkNotNull(kcSecondaryButton3);
        C27046k.m66684G(kcSecondaryButton3, !Intrinsics.areEqual(strMo24997Y, "Paused"));
        C27046k.m66711z(kcSecondaryButton3, 0L, new Function0() { // from class: qm.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35467K(this.f96830b, kcSecondaryButton3, baseViewHolder, orderEntity);
            }
        }, 1, null);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull TodoDelegateItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        switch (helper.getItemViewType()) {
            case 1:
                TodoDelegateItem.OrderHistoryNumTipsInfo orderHistoryNumTipsInfo = item instanceof TodoDelegateItem.OrderHistoryNumTipsInfo ? (TodoDelegateItem.OrderHistoryNumTipsInfo) item : null;
                if (orderHistoryNumTipsInfo != null) {
                    m35506x(helper, orderHistoryNumTipsInfo);
                }
                break;
            case 2:
                TodoDelegateItem.ActiveOrderInfo activeOrderInfo = item instanceof TodoDelegateItem.ActiveOrderInfo ? (TodoDelegateItem.ActiveOrderInfo) item : null;
                if (activeOrderInfo != null) {
                    m35498E(helper, activeOrderInfo.getOrderEntity());
                }
                break;
            case 3:
                helper.setText(R$id.empty_tips, R$string.no_order);
                break;
            case 4:
                helper.setText(R$id.tv_end, R$string.auto_footer_nomore_data);
                break;
            case 5:
                TodoDelegateItem.StopOrderInfo stopOrderInfo = item instanceof TodoDelegateItem.StopOrderInfo ? (TodoDelegateItem.StopOrderInfo) item : null;
                if (stopOrderInfo != null) {
                    m35499F(helper, stopOrderInfo.getOrderEntity());
                }
                break;
            case 6:
                TodoDelegateItem.TsoOrderInfo tsoOrderInfo = item instanceof TodoDelegateItem.TsoOrderInfo ? (TodoDelegateItem.TsoOrderInfo) item : null;
                if (tsoOrderInfo != null) {
                    m35500G(helper, tsoOrderInfo.getOrderEntity());
                }
                break;
            case 7:
                View itemView = helper.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                C27046k.m66711z(itemView, 0L, new Function0() { // from class: qm.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TodoDelegateAdapter.m35471P(this.f96787b, helper);
                    }
                }, 1, null);
                ((TextView) helper.getView(R$id.descTv)).setText(C27017c.f54310a.m66516f(R$string.bkumex_order_view_all, new Object[0]));
                break;
            case 8:
                TodoDelegateItem.OrderEmptyInfo orderEmptyInfo = item instanceof TodoDelegateItem.OrderEmptyInfo ? (TodoDelegateItem.OrderEmptyInfo) item : null;
                if (orderEmptyInfo != null) {
                    m35497A(helper, orderEmptyInfo.getOrderEmpty());
                }
                break;
            case 9:
                TodoDelegateItem.TwapOrderInfo twapOrderInfo = item instanceof TodoDelegateItem.TwapOrderInfo ? (TodoDelegateItem.TwapOrderInfo) item : null;
                if (twapOrderInfo != null) {
                    m35501H(helper, twapOrderInfo.getOrderEntity());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m35505Z(BaseFragment baseFragment, KcPrimaryButton kcPrimaryButton, OrderEntity orderEntity) {
        ((LimitModifyOrderViewModel) new ViewModelProvider(baseFragment).get(LimitModifyOrderViewModel.class)).m27378q0(baseFragment, kcPrimaryButton, orderEntity);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) throws JSONException {
        int bindingAdapterPosition;
        OrderEntity orderEntity;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.f29992i && (bindingAdapterPosition = holder.getBindingAdapterPosition()) >= 0 && bindingAdapterPosition < getData().size()) {
            TodoDelegateItem todoDelegateItem = getData().get(bindingAdapterPosition);
            if (todoDelegateItem instanceof TodoDelegateItem.ActiveOrderInfo) {
                orderEntity = ((TodoDelegateItem.ActiveOrderInfo) todoDelegateItem).getOrderEntity();
            } else if (todoDelegateItem instanceof TodoDelegateItem.StopOrderInfo) {
                orderEntity = ((TodoDelegateItem.StopOrderInfo) todoDelegateItem).getOrderEntity();
            } else if (!(todoDelegateItem instanceof TodoDelegateItem.TsoOrderInfo)) {
                return;
            } else {
                orderEntity = ((TodoDelegateItem.TsoOrderInfo) todoDelegateItem).getOrderEntity();
            }
            if (CollectionsKt.contains(this.f29998o, orderEntity.getId())) {
                return;
            }
            this.f29998o.add(C27041f.m66668h(orderEntity.getId()));
            m35503Q(orderEntity);
            m35469M();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m35506x(BaseViewHolder baseViewHolder, final TodoDelegateItem.OrderHistoryNumTipsInfo orderHistoryNumTipsInfo) {
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.numDescTv);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(baseTextView.getContext().getString(orderHistoryNumTipsInfo.getNumDescResId()));
        StringBuilder sb3 = new StringBuilder();
        sb3.append('(');
        sb3.append(orderHistoryNumTipsInfo.getNum());
        sb3.append(')');
        sb2.append(sb3.toString());
        baseTextView.setText(sb2.toString());
        Intrinsics.checkNotNull(baseTextView);
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: qm.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateAdapter.m35496y(this.f96807b, orderHistoryNumTipsInfo);
            }
        }, 1, null);
        if (Intrinsics.areEqual(orderHistoryNumTipsInfo.getAssetType(), OrderAssetType.SelfFunds.getTypeName())) {
            C43852m.m96595g("B6FuturesTradeOrder", "ViewUserFundOrder", "1", null, 8, null);
        } else {
            C43852m.m96595g("B6FuturesTradeOrder", "ViewTrailFundOrder", "1", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m35472S(OrderEntity orderEntity, View view) throws JSONException {
        String str;
        String str2 = "sell";
        if (C37568c.m84645p(orderEntity)) {
            Intrinsics.checkNotNull(view);
            PositionHelper.m36454s(PositionHelper.f30771a, (BaseFragment) ViewKt.findFragment(view), null, orderEntity, null, null, 24, null);
            String strM36552b = C17060n0.m36552b();
            JSONObject jSONObjectPut = new JSONObject().put("trade_pair", C27041f.m66668h(orderEntity.getSymbol())).put("isTrialFunds", C27025c.m66566d(Boolean.valueOf(orderEntity.isTrialFunds())));
            String lowerCase = C27041f.m66668h(orderEntity.getMarginMode()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            JSONObject jSONObjectPut2 = jSONObjectPut.put("marginType", lowerCase);
            if (Intrinsics.areEqual(orderEntity.getSide(), "buy")) {
                str2 = "buy";
            }
            C43852m.m96589a(strM36552b, "ModifyTPSLOrder", "1", jSONObjectPut2.put("trade_type", str2));
        } else {
            Intrinsics.checkNotNull(view);
            FragmentManager childFragmentManager = ((BaseFragment) ViewKt.findFragment(view)).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            BaseModifyOrderDialog.Companion.show$default(BaseModifyOrderDialog.f23879x0, childFragmentManager, orderEntity, null, null, 12, null);
            String strM36552b2 = C17060n0.m36552b();
            JSONObject jSONObjectPut3 = new JSONObject().put("trade_pair", C27041f.m66668h(orderEntity.getSymbol())).put("isTrialFunds", C27025c.m66566d(Boolean.valueOf(orderEntity.isTrialFunds())));
            String lowerCase2 = C27041f.m66668h(orderEntity.getMarginMode()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("marginType", lowerCase2);
            if (Intrinsics.areEqual(orderEntity.getSide(), "buy")) {
                str2 = "buy";
            }
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("trade_type", str2);
            if (Intrinsics.areEqual(C27041f.m66668h(orderEntity.getPositionSide()), "BOTH")) {
                str = "1";
            } else {
                str = "2";
            }
            C43852m.m96589a(strM36552b2, "ModifyOrder", "1", jSONObjectPut5.put("positionMode", str).put("pricing_type", C37568c.m84648s(orderEntity)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m35473T(View view, final TodoDelegateAdapter todoDelegateAdapter, final OrderEntity orderEntity) throws JSONException {
        String str;
        final BaseFragment baseFragment = (BaseFragment) ViewKt.findFragment(view);
        if (!C46392a.m102322d(C46894j.f104736a.m103280s(), true)) {
            todoDelegateAdapter.m35505Z(baseFragment, null, orderEntity);
        } else {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54148E4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54161R4(0).m54167X4(R$string.kumex_chase_order).m54148E4(R$layout.bkumex_dialog_chase_view_tips, new DialogFragmentHelper.InterfaceC22882b() { // from class: qm.f
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    TodoDelegateAdapter.m35474U(this.f96798b, baseFragment, orderEntity, baseViewHolder, dialogFragmentHelper);
                }
            });
            FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alertDialogFragmentHelperM54148E4.show(childFragmentManager, "chaseOrderDialog");
        }
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObjectPut = new JSONObject().put("trade_pair", C27041f.m66668h(orderEntity.getSymbol())).put("isTrialFunds", C27025c.m66566d(Boolean.valueOf(orderEntity.isTrialFunds())));
        String lowerCase = C27041f.m66668h(orderEntity.getMarginMode()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        JSONObject jSONObjectPut2 = jSONObjectPut.put("marginType", lowerCase);
        String str2 = "buy";
        if (!Intrinsics.areEqual(orderEntity.getSide(), "buy")) {
            str2 = "sell";
        }
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("trade_type", str2);
        if (Intrinsics.areEqual(C27041f.m66668h(orderEntity.getPositionSide()), "BOTH")) {
            str = "1";
        } else {
            str = "2";
        }
        C43852m.m96589a(strM36552b, "ChaseOrder", "1", jSONObjectPut3.put("positionMode", str).put("pricing_type", C37568c.m84648s(orderEntity)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m35476W(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m35477X(TodoDelegateAdapter todoDelegateAdapter, BaseFragment baseFragment, KcPrimaryButton kcPrimaryButton, OrderEntity orderEntity) {
        todoDelegateAdapter.m35505Z(baseFragment, kcPrimaryButton, orderEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public final void m35498E(BaseViewHolder baseViewHolder, OrderEntity orderEntity) {
        boolean z11;
        ContractEntity contractEntityM84630a = C37568c.m84630a(orderEntity);
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntityM84630a);
        m35504R(baseViewHolder, orderEntity, contractEntityM84630a);
        OrderHorizontalProgress orderHorizontalProgress = (OrderHorizontalProgress) baseViewHolder.getView(R$id.progress);
        BigDecimal bigDecimalM89922G = C41014a.m89922G(orderEntity.getDealSize(), null, 1, null);
        BigDecimal bigDecimalSubtract = C41014a.m89922G(orderEntity.getSize(), null, 1, null).subtract(C41014a.m89922G(orderEntity.getCancelSize(), null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        orderHorizontalProgress.m36694g(bigDecimalM89922G, bigDecimalSubtract, C16700e0.m35722b(orderEntity, contractEntityM84630a, interfaceC41049aM90019b, C41014a.m89922G(orderEntity.getDealSize(), null, 1, null), false, 8, null), C16700e0.m35722b(orderEntity, contractEntityM84630a, interfaceC41049aM90019b, C41014a.m89922G(orderEntity.getSize(), null, 1, null).subtract(C41014a.m89922G(orderEntity.getCancelSize(), null, 1, null)), false, 8, null), Intrinsics.areEqual(orderEntity.getSide(), "buy"));
        ((BaseTextView) baseViewHolder.getView(R$id.priceValue)).setText(C16700e0.m35726f(orderEntity, contractEntityM84630a));
        Context context = baseViewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence charSequenceM35727g = C16700e0.m35727g(orderEntity, contractEntityM84630a, context);
        View view = baseViewHolder.getView(R$id.takerStopGroup);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        if (charSequenceM35727g != null && charSequenceM35727g.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        C27046k.m66684G(view, !z11);
        ((BaseTextView) baseViewHolder.getView(R$id.takerStopValue)).setText(charSequenceM35727g);
    }

    /* JADX INFO: renamed from: F */
    public final void m35499F(BaseViewHolder baseViewHolder, OrderEntity orderEntity) {
        OrderEntity orderEntity2;
        String strM35722b;
        ContractEntity contractEntityM84630a = C37568c.m84630a(orderEntity);
        m35504R(baseViewHolder, orderEntity, contractEntityM84630a);
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.amountValue);
        if (C27025c.m66566d(orderEntity.getShortcut())) {
            orderEntity2 = orderEntity;
            strM35722b = C27017c.f54310a.m66516f(R$string.kumex_tpsl_all_position, new Object[0]);
        } else {
            orderEntity2 = orderEntity;
            strM35722b = C16700e0.m35722b(orderEntity2, contractEntityM84630a, null, null, false, 14, null);
        }
        baseTextView.setText(strM35722b);
        ((BaseTextView) baseViewHolder.getView(R$id.priceValue)).setText(C16700e0.m35726f(orderEntity2, contractEntityM84630a));
        BaseTextView baseTextView2 = (BaseTextView) baseViewHolder.getView(R$id.triggerPriceValue);
        String strM35723c = C16700e0.m35723c(orderEntity2, contractEntityM84630a);
        if (strM35723c == null) {
            strM35723c = C37569d.m84684y();
        }
        baseTextView2.setText(strM35723c);
    }

    /* JADX INFO: renamed from: G */
    public final void m35500G(BaseViewHolder baseViewHolder, OrderEntity orderEntity) {
        String strM84684y;
        ContractEntity contractEntityM84630a = C37568c.m84630a(orderEntity);
        m35504R(baseViewHolder, orderEntity, contractEntityM84630a);
        ((BaseTextView) baseViewHolder.getView(R$id.amountValue)).setText(C16700e0.m35722b(orderEntity, contractEntityM84630a, null, orderEntity.getSize(), false, 10, null));
        ((BaseTextView) baseViewHolder.getView(R$id.delegationPriceValue)).setText(C16700e0.m35726f(orderEntity, contractEntityM84630a));
        ((BaseTextView) baseViewHolder.getView(R$id.activePriceValue)).setText(C16700e0.m35732l(orderEntity));
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.callbackRateValue);
        BigDecimal callbackRate = orderEntity.getCallbackRate();
        if (callbackRate == null || (strM84684y = C42180b.m92642g(callbackRate, null, null, 1, false, false, false, 59, null)) == null) {
            strM84684y = C37569d.m84684y();
        }
        baseTextView.setText(strM84684y);
    }

    /* JADX INFO: renamed from: Q */
    public final void m35503Q(OrderEntity orderEntity) throws JSONException {
        String str;
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObjectPut = new JSONObject().put("trade_pair", C27041f.m66668h(orderEntity.getSymbol())).put("isTrialFunds", C27025c.m66566d(Boolean.valueOf(orderEntity.isTrialFunds())));
        String lowerCase = C27041f.m66668h(orderEntity.getMarginMode()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        JSONObject jSONObjectPut2 = jSONObjectPut.put("marginType", lowerCase);
        String str2 = "buy";
        if (!Intrinsics.areEqual(orderEntity.getSide(), "buy")) {
            str2 = "sell";
        }
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("trade_type", str2);
        if (Intrinsics.areEqual(C27041f.m66668h(orderEntity.getPositionSide()), "BOTH")) {
            str = "1";
        } else {
            str = "2";
        }
        C43852m.m96593e(strM36552b, "orders", "1", jSONObjectPut3.put("positionMode", str).put("pricing_type", C37568c.m84648s(orderEntity)));
    }
}
