package com.kubi.tradingbotkit.business.asset;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.C24346y;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.tradingbotkit.R$drawable;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.asset.adapter.BotAssetsItemAssetsRunningProxy;
import com.kubi.tradingbotkit.business.asset.adapter.BotAssetsItemAssetsStrategyProxy;
import com.kubi.tradingbotkit.model.assets.AssetsOverviewModel;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k40.C40903j;
import k50.C40911a;
import l50.C42073i;
import n50.C42756a;
import nf.C42828b;
import o50.C42969c;
import o50.C42974h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p402kf.C41014a;
import p402kf.C41016c;
import p429lf.C42180b;
import p481ny.C42899b;
import p569qq.C43852m;
import p569qq.InterfaceC43850k;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import rs.AbstractC44173c;
import rs.C44172b;
import sa.C44370a;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: BotAssetsFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010-\u001a\u00020\u0010H\u0014J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u00020\u0010H\u0002J\b\u00103\u001a\u00020\u0010H\u0002J\u0010\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020\u0010H\u0016J\u0010\u00107\u001a\u00020\u00102\u0006\u00105\u001a\u00020#H\u0002J\b\u00108\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\b\u0010:\u001a\u00020\u0010H\u0014J\u0010\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020#H\u0002J\u0012\u0010=\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0012\u0010@\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010AH\u0002J\u0012\u0010B\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010D\u001a\u00020\u00102\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010EH\u0002J\b\u0010F\u001a\u00020\u0010H\u0002J\u001e\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\u0016J\b\u0010K\u001a\u0004\u0018\u00010LR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006N"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UIState;", "<init>", "()V", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFragmentBotAssetsBinding;", "getViewBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFragmentBotAssetsBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/tradingbotkit/business/asset/adapter/BotAssetsAdapter;", "getAdapter", "()Lcom/kubi/tradingbotkit/business/asset/adapter/BotAssetsAdapter;", "jumpToRobotIntroduce", "", "data", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "jumpToRobotCreate", "trackEventClick", "blockId", "", "locationId", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsViewModel;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingBgView", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "initView", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentByParams", "clickCollection", "showIvExpend", "getLocationId", "changeState", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "changeImage", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "lazyLoad", "bindState", "setRecyclerViewTopMargin", "it", "diffRefresh", "diffList", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$DiffList;", "updateProfitNumber", "Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;", "getAboutString", "profit", "showBotsList", "", "showEmptyView", "updateTotalAsset", "baseCurrencyName", "assetsValue", "assetsValueLegal", "getBotTotalBalance", "Ljava/math/BigDecimal;", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBotAssetsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BotAssetsFragment.kt\ncom/kubi/tradingbotkit/business/asset/BotAssetsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n*L\n1#1,509:1\n147#2,16:510\n808#3,11:526\n1869#3,2:537\n136#4:539\n45#5,4:540\n*S KotlinDebug\n*F\n+ 1 BotAssetsFragment.kt\ncom/kubi/tradingbotkit/business/asset/BotAssetsFragment\n*L\n71#1:510,16\n280#1:526,11\n281#1:537,2\n482#1:539\n504#1:540,4\n*E\n"})
@InterfaceC43850k(pageId = "bot_page_bot_assets")
public final class BotAssetsFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f52216U = C45681e.m100799e(this, new Function1<BotAssetsFragment, C42073i>() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42073i invoke(@NotNull BotAssetsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42073i.m92297a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C42073i, Unit>() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C42073i it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42073i c42073i) {
            invoke(c42073i);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final C40903j f52217V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public WrapperLoadingView f52218W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public WrapperLoadingView f52219X;

    /* JADX INFO: renamed from: Y */
    public boolean f52220Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public String f52221Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f52215b0 = {Reflection.property1(new PropertyReference1Impl(BotAssetsFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFragmentBotAssetsBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f52214a0 = new Companion(null);

    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsFragment;", "RECYCLER_VIEW_MARGIN_TOP_12", "", "RECYCLER_VIEW_MARGIN_TOP_0", "VIEW_ROTATION_180", "", "VIEW_ROTATION_0", "LOCATION_ID_EXPEND", "", "LOCATION_ID_FOLD", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BotAssetsFragment newInstance() {
            return new BotAssetsFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$a */
    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/tradingbotkit/business/asset/BotAssetsFragment$adapter$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26032a implements ItemCallBack<BotAssetsTotalItemModel> {
        public C26032a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, BotAssetsTotalItemModel data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            if (view.getId() == R$id.ll_grid_name) {
                BotAssetsFragment.this.m63743X3(data);
                return;
            }
            if (view.getId() == R$id.bt_create) {
                BotAssetsFragment.this.m63742W3(data);
            } else if (view.getId() == R$id.iv_grid_icon) {
                BotAssetsFragment.this.m63743X3(data);
            } else if (view.getId() == R$id.aggregate_assets) {
                C40911a.m89599c("/tabpage/running", null, false, 6, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$b */
    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/tradingbotkit/business/asset/BotAssetsFragment$adapter$2", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26033b implements ItemCallBack<BotAssetsTotalItemModel> {
        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, BotAssetsTotalItemModel data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            C40911a.m89599c("/tabpage/running", null, false, 6, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$10 */
    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$DiffList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$10", m90122f = "BotAssetsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C2603510 extends SuspendLambda implements Function2<DiffList, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(DiffList diffList, Continuation<? super Unit> continuation) {
            return ((C2603510) create(diffList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C2603510(Continuation<? super C2603510> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2603510 c2603510 = BotAssetsFragment.this.new C2603510(continuation);
            c2603510.L$0 = obj;
            return c2603510;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DiffList diffList = (DiffList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BotAssetsFragment.this.m63737Q3(diffList);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$12 */
    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$12", m90122f = "BotAssetsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C2603712 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C2603712(Continuation<? super C2603712> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2603712 c2603712 = BotAssetsFragment.this.new C2603712(continuation);
            c2603712.Z$0 = ((Boolean) obj).booleanValue();
            return c2603712;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C2603712) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Group group;
            Group group2;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (z11) {
                C42073i c42073iM63741U3 = BotAssetsFragment.this.m63741U3();
                if (c42073iM63741U3 != null && (group2 = c42073iM63741U3.f92876g) != null) {
                    ViewExtKt.m66594y(group2);
                }
            } else {
                C42073i c42073iM63741U4 = BotAssetsFragment.this.m63741U3();
                if (c42073iM63741U4 != null && (group = c42073iM63741U4.f92876g) != null) {
                    ViewExtKt.m66577h(group);
                }
            }
            BotAssetsFragment.this.m63745Z3(z11);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$2 */
    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$2", m90122f = "BotAssetsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C260382 extends SuspendLambda implements Function2<List<? extends BotAssetsTotalItemModel>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends BotAssetsTotalItemModel> list, Continuation<? super Unit> continuation) {
            return invoke2((List<BotAssetsTotalItemModel>) list, continuation);
        }

        public C260382(Continuation<? super C260382> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C260382 c260382 = BotAssetsFragment.this.new C260382(continuation);
            c260382.L$0 = obj;
            return c260382;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<BotAssetsTotalItemModel> list, Continuation<? super Unit> continuation) {
            return ((C260382) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BotAssetsFragment.this.m63746a4(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$4 */
    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$4", m90122f = "BotAssetsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C260404 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C260404(Continuation<? super C260404> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C260404 c260404 = BotAssetsFragment.this.new C260404(continuation);
            c260404.Z$0 = ((Boolean) obj).booleanValue();
            return c260404;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C260404) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppCompatCheckBox appCompatCheckBox;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C42073i c42073iM63741U3 = BotAssetsFragment.this.m63741U3();
            if (c42073iM63741U3 != null && (appCompatCheckBox = c42073iM63741U3.f92873d) != null) {
                appCompatCheckBox.setChecked(z11);
            }
            C42073i c42073iM63741U4 = BotAssetsFragment.this.m63741U3();
            ShowHideTextView.m54778d(c42073iM63741U4 != null ? c42073iM63741U4.f92874e : null, z11);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$6 */
    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$6", m90122f = "BotAssetsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C260426 extends SuspendLambda implements Function2<AssetsOverviewModel, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AssetsOverviewModel assetsOverviewModel, Continuation<? super Unit> continuation) {
            return ((C260426) create(assetsOverviewModel, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C260426(Continuation<? super C260426> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C260426 c260426 = BotAssetsFragment.this.new C260426(continuation);
            c260426.L$0 = obj;
            return c260426;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetsOverviewModel assetsOverviewModel = (AssetsOverviewModel) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BotAssetsFragment.this.m63750g4(assetsOverviewModel);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$8 */
    /* JADX INFO: compiled from: BotAssetsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsFragment$bindState$8", m90122f = "BotAssetsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C260448 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C260448(Continuation<? super C260448> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C260448 c260448 = BotAssetsFragment.this.new C260448(continuation);
            c260448.L$0 = obj;
            return c260448;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C260448) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BotAssetsFragment.this.m63744Y3(C27041f.m66669i(str, "USDT"));
            BotAssetsFragment.this.m63747b4();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: S3 */
    public final BigDecimal m63739S3() {
        String totalRunningAmount;
        try {
            AssetsOverviewModel overviewModel = ((UIState) getState()).getOverviewModel();
            if (overviewModel == null || (totalRunningAmount = overviewModel.getTotalRunningAmount()) == null) {
                return null;
            }
            return DowngradeExKt.m66535e(totalRunningAmount, null, 1, null);
        } catch (Exception e11) {
            String simpleName = BotAssetsFragment.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (!C42899b.m94075e(e11)) {
                C42756a.m93685b(e11, simpleName);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m63750g4(AssetsOverviewModel assetsOverviewModel) {
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c2;
        String totalRunningProfit;
        BigDecimal bigDecimalM66535e;
        String totalRunningProfit2;
        BigDecimal bigDecimalM66535e2;
        String strM92640e = (assetsOverviewModel == null || (totalRunningProfit2 = assetsOverviewModel.getTotalRunningProfit()) == null || (bigDecimalM66535e2 = DowngradeExKt.m66535e(totalRunningProfit2, null, 1, null)) == null) ? null : C42180b.m92640e(bigDecimalM66535e2, null, 2, false, false, false, 2, null, 93, null);
        String strM66668h = C27041f.m66668h((assetsOverviewModel == null || (totalRunningProfit = assetsOverviewModel.getTotalRunningProfit()) == null || (bigDecimalM66535e = DowngradeExKt.m66535e(totalRunningProfit, null, 1, null)) == null) ? null : BotAssetsExt.f52232a.m63782a(bigDecimalM66535e));
        C42073i c42073iM63741U3 = m63741U3();
        if (c42073iM63741U3 != null && (showHideTextView4 = c42073iM63741U3.f92895z) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c2.setText(C42828b.m93911l(strM66668h + C27041f.m66669i(strM92640e, "--")));
        }
        C42073i c42073iM63741U4 = m63741U3();
        if (c42073iM63741U4 != null && (showHideTextView3 = c42073iM63741U4.f92894y) != null) {
            showHideTextView3.setText(m63738R3(assetsOverviewModel != null ? assetsOverviewModel.getTotalRunningProfit() : null));
        }
        C42073i c42073iM63741U5 = m63741U3();
        if (c42073iM63741U5 != null && (showHideTextView2 = c42073iM63741U5.f92889t) != null && (textViewM97383c = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c.setText(BotAssetsExt.f52232a.m63783b(assetsOverviewModel != null ? assetsOverviewModel.getTodayRunningProfit() : null));
        }
        C42073i c42073iM63741U6 = m63741U3();
        if (c42073iM63741U6 == null || (showHideTextView = c42073iM63741U6.f92888s) == null) {
            return;
        }
        showHideTextView.setText(m63738R3(assetsOverviewModel != null ? assetsOverviewModel.getTodayRunningProfit() : null));
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m63709H3(BotAssetsFragment botAssetsFragment) {
        botAssetsFragment.m63749f4("TotalProfit", "1");
        C40911a.m89599c("/tabpage/profit/totalprofit", null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m63710I3(BotAssetsFragment botAssetsFragment) {
        botAssetsFragment.m63749f4("TodayProfit", "1");
        C40911a.m89599c("/tabpage/profit/totalprofit", null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m63711J3(BotAssetsFragment botAssetsFragment) {
        botAssetsFragment.m63749f4("BotHomePage", "1");
        C40911a.m89599c("", null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m63712K3(BotAssetsFragment botAssetsFragment) {
        String string = botAssetsFragment.getString(R$string.candy_warm_prompt);
        String string2 = botAssetsFragment.getString(R$string.kc_tb_asset_total_tip);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = botAssetsFragment.getString(R$string.i_already_know);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C42969c.m94361e(botAssetsFragment, string, string2, string3, null, null, null, null, 120, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m63714M3(BotAssetsFragment botAssetsFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        botAssetsFragment.sendIntent(new BotAssetsContract$UiIntent.HideOrShowNumber(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m63715N3(BotAssetsFragment botAssetsFragment) {
        TradingBotKitDepend.f52488a.m64274a().mo15333C(botAssetsFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m63716O3(BotAssetsFragment botAssetsFragment) {
        boolean z11 = !C27063n.m66763a("expend_bot_list", true);
        botAssetsFragment.m63749f4("List", botAssetsFragment.m63740T3(z11));
        botAssetsFragment.m63735F3(z11);
        botAssetsFragment.sendIntent(new BotAssetsContract$UiIntent.ExpendList(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m63717P3(BotAssetsFragment botAssetsFragment) {
        botAssetsFragment.m63749f4("History", "1");
        C40911a.m89599c("/tabpage/profit/profitlist", null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m63718V3(BotAssetsFragment botAssetsFragment) {
        botAssetsFragment.sendIntent(BotAssetsContract$UiIntent.GetAssetTotal.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    private final void m63719c4() {
        WrapperLoadingView wrapperLoadingView = this.f52218W;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(R$string.coin_no_data, R$drawable.ic2_common_empty, new View.OnClickListener() { // from class: com.kubi.tradingbotkit.business.asset.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BotAssetsFragment.m63720d4(this.f52235b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m63720d4(BotAssetsFragment botAssetsFragment, View view) {
        botAssetsFragment.sendIntent(BotAssetsContract$UiIntent.GetAssetTotal.INSTANCE);
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m63737Q3(DiffList diffList) {
        C42073i c42073iM63741U3;
        RecyclerView recyclerView;
        if (diffList != null) {
            DiffUtil.DiffResult diffResult = diffList.getDiffResult();
            if (diffResult != null) {
                diffResult.dispatchUpdatesTo(this.f52217V);
            }
            List<BotAssetsTotalItemModel> listM63779b = diffList.m63779b();
            if (listM63779b == null || (c42073iM63741U3 = m63741U3()) == null || (recyclerView = c42073iM63741U3.f92882m) == null) {
                return;
            }
            C24346y.m59052b(recyclerView, CollectionsKt.toMutableList((Collection) listM63779b));
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final String m63740T3(boolean z11) {
        return z11 ? "1" : "2";
    }

    /* JADX INFO: renamed from: U3 */
    public final C42073i m63741U3() {
        return (C42073i) this.f52216U.getValue(this, f52215b0[0]);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m63744Y3(@Nullable String str) {
        this.f52221Z = str;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getShowList();
            }
        }, new C260382(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C260404(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getOverviewModel();
            }
        }, new C260426(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCurrency();
            }
        }, new C260448(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDiffList();
            }
        }, new C2603510(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsFragment.bindState.11
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getShowExpendView());
            }
        }, new C2603712(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (!(singleEvent instanceof C26049a) || getView() == null) {
            return;
        }
        C42073i c42073iM63741U3 = m63741U3();
        if (c42073iM63741U3 != null && (kuCoinRefreshLayout = c42073iM63741U3.f92883n) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        WrapperLoadingView wrapperLoadingView = this.f52219X;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m63748e4() {
        ImageView imageView;
        ImageView imageView2;
        if (C27063n.m66763a("expend_bot_list", true)) {
            C42073i c42073iM63741U3 = m63741U3();
            if (c42073iM63741U3 == null || (imageView2 = c42073iM63741U3.f92878i) == null) {
                return;
            }
            imageView2.setRotation(0.0f);
            return;
        }
        C42073i c42073iM63741U4 = m63741U3();
        if (c42073iM63741U4 == null || (imageView = c42073iM63741U4.f92878i) == null) {
            return;
        }
        imageView.setRotation(180.0f);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m63749f4(String str, String str2) {
        C43852m.m96591c("B10BotAssets", str, str2, null, 8, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.btrading_bot_kit_fragment_bot_assets;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19867U() {
        return this.f52220Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<BotAssetsViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(BotAssetsViewModel.class);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m63751h4(@NotNull String baseCurrencyName, @NotNull String assetsValue, @NotNull String assetsValueLegal) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c2;
        BaseTextView baseTextView5;
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(assetsValue, "assetsValue");
        Intrinsics.checkNotNullParameter(assetsValueLegal, "assetsValueLegal");
        if (getView() == null) {
            return;
        }
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            C42073i c42073iM63741U3 = m63741U3();
            if (c42073iM63741U3 != null && (baseTextView5 = c42073iM63741U3.f92869B) != null) {
                baseTextView5.setText(baseCurrencyName);
            }
            C42073i c42073iM63741U4 = m63741U3();
            if (c42073iM63741U4 != null && (showHideTextView4 = c42073iM63741U4.f92893x) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
                textViewM97383c2.setText(assetsValue);
            }
            C42073i c42073iM63741U5 = m63741U3();
            if (c42073iM63741U5 != null && (showHideTextView3 = c42073iM63741U5.f92892w) != null) {
                showHideTextView3.setText(assetsValueLegal);
            }
            C42073i c42073iM63741U6 = m63741U3();
            if (c42073iM63741U6 == null || (baseTextView4 = c42073iM63741U6.f92887r) == null) {
                return;
            }
            ViewExtKt.m66577h(baseTextView4);
            return;
        }
        C42073i c42073iM63741U7 = m63741U3();
        if (c42073iM63741U7 != null && (baseTextView3 = c42073iM63741U7.f92869B) != null) {
            baseTextView3.setText(C41016c.m89965c());
        }
        C42073i c42073iM63741U8 = m63741U3();
        if (c42073iM63741U8 != null && (showHideTextView2 = c42073iM63741U8.f92893x) != null && (textViewM97383c = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c.setText(C42974h.m94376e(assetsValueLegal));
        }
        C42073i c42073iM63741U9 = m63741U3();
        if (c42073iM63741U9 != null && (showHideTextView = c42073iM63741U9.f92892w) != null) {
            showHideTextView.setText(C42828b.m93915p(C42828b.m93906g(assetsValue, "≈", false, false, 6, null)));
        }
        C42073i c42073iM63741U10 = m63741U3();
        if (c42073iM63741U10 != null && (baseTextView2 = c42073iM63741U10.f92887r) != null) {
            ViewExtKt.m66594y(baseTextView2);
        }
        C42073i c42073iM63741U11 = m63741U3();
        if (c42073iM63741U11 == null || (baseTextView = c42073iM63741U11.f92887r) == null) {
            return;
        }
        baseTextView.setText(baseCurrencyName);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f52220Y = z11;
    }

    public BotAssetsFragment() {
        setPageId("B10BotAssets");
        this.f52217V = C40903j.a.m89594c(C40903j.a.m89594c(new C40903j.a(), 1, BotAssetsItemAssetsStrategyProxy.class, new C26032a(), null, 8, null), 2, BotAssetsItemAssetsRunningProxy.class, new C26033b(), null, 8, null).m89595a();
        this.f52221Z = "USDT";
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m63713L3(BotAssetsFragment botAssetsFragment) {
        AppCompatCheckBox appCompatCheckBox;
        C42073i c42073iM63741U3 = botAssetsFragment.m63741U3();
        if (c42073iM63741U3 != null && (appCompatCheckBox = c42073iM63741U3.f92873d) != null) {
            appCompatCheckBox.performClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public final void m63735F3(boolean z11) {
        Float fValueOf;
        RotateAnimation rotateAnimation;
        RotateAnimation rotateAnimation2;
        ImageView imageView;
        ImageView imageView2;
        C42073i c42073iM63741U3 = m63741U3();
        if (c42073iM63741U3 != null && (imageView2 = c42073iM63741U3.f92878i) != null) {
            fValueOf = Float.valueOf(imageView2.getRotation());
        } else {
            fValueOf = null;
        }
        if (Intrinsics.areEqual(fValueOf, 0.0f)) {
            if (!z11) {
                rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            } else {
                rotateAnimation2 = new RotateAnimation(180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation = rotateAnimation2;
            }
        } else if (!z11) {
            rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation = rotateAnimation2;
        } else {
            rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        }
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setDuration(300L);
        rotateAnimation.setInterpolator(new AccelerateInterpolator());
        C42073i c42073iM63741U4 = m63741U3();
        if (c42073iM63741U4 != null && (imageView = c42073iM63741U4.f92878i) != null) {
            imageView.startAnimation(rotateAnimation);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final void m63736G3() {
        KcSecondaryButton kcSecondaryButton;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ImageView imageView;
        RelativeLayout relativeLayout;
        BaseTextView baseTextView3;
        AppCompatCheckBox appCompatCheckBox;
        LinearLayoutCompat linearLayoutCompat;
        ImageView imageView2;
        C42073i c42073iM63741U3 = m63741U3();
        if (c42073iM63741U3 != null && (imageView2 = c42073iM63741U3.f92879j) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.asset.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63712K3(this.f52236b);
                }
            }, 1, null);
        }
        C42073i c42073iM63741U4 = m63741U3();
        if (c42073iM63741U4 != null && (linearLayoutCompat = c42073iM63741U4.f92881l) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.asset.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63713L3(this.f52237b);
                }
            }, 1, null);
        }
        C42073i c42073iM63741U5 = m63741U3();
        if (c42073iM63741U5 != null && (appCompatCheckBox = c42073iM63741U5.f92873d) != null) {
            C27046k.m66708w(appCompatCheckBox, new Function2() { // from class: com.kubi.tradingbotkit.business.asset.i
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotAssetsFragment.m63714M3(this.f52238b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C42073i c42073iM63741U6 = m63741U3();
        if (c42073iM63741U6 != null && (baseTextView3 = c42073iM63741U6.f92869B) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.asset.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63715N3(this.f52239b);
                }
            }, 1, null);
        }
        C42073i c42073iM63741U7 = m63741U3();
        if (c42073iM63741U7 != null && (relativeLayout = c42073iM63741U7.f92884o) != null) {
            C27046k.m66711z(relativeLayout, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.asset.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63716O3(this.f52240b);
                }
            }, 1, null);
        }
        m63748e4();
        C42073i c42073iM63741U8 = m63741U3();
        if (c42073iM63741U8 != null && (imageView = c42073iM63741U8.f92880k) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.asset.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63717P3(this.f52241b);
                }
            }, 1, null);
        }
        C42073i c42073iM63741U9 = m63741U3();
        if (c42073iM63741U9 != null && (baseTextView2 = c42073iM63741U9.f92868A) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.asset.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63709H3(this.f52242b);
                }
            }, 1, null);
        }
        C42073i c42073iM63741U10 = m63741U3();
        if (c42073iM63741U10 != null && (baseTextView = c42073iM63741U10.f92890u) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.asset.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63710I3(this.f52243b);
                }
            }, 1, null);
        }
        C42073i c42073iM63741U11 = m63741U3();
        if (c42073iM63741U11 != null && (kcSecondaryButton = c42073iM63741U11.f92872c) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.asset.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63711J3(this.f52234b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final String m63738R3(String str) {
        String str2;
        String strM89967e = C41016c.m89967e(C27041f.m66668h(C41016c.m89965c()));
        if (str != null && str.length() != 0) {
            BigDecimal bigDecimal = new BigDecimal(C41014a.m89941o(C41014a.m89940n(DowngradeExKt.m66535e(str, null, 1, null), this.f52221Z), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : 2, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null));
            BigDecimal bigDecimalAbs = bigDecimal.abs();
            if (bigDecimal.compareTo(bigDecimalAbs) != 0) {
                str2 = C33820nf.f71144W;
            } else {
                str2 = "";
            }
            Intrinsics.checkNotNull(bigDecimalAbs);
            return "≈ " + str2 + strM89967e + ' ' + C27041f.m66669i(C42180b.m92640e(bigDecimalAbs, null, 2, false, false, false, 2, null, 93, null), "- -");
        }
        return "--";
    }

    /* JADX INFO: renamed from: W3 */
    public final void m63742W3(BotAssetsTotalItemModel botAssetsTotalItemModel) {
        m63749f4("Create", String.valueOf(botAssetsTotalItemModel.getItemId()));
        String jumpLink2 = botAssetsTotalItemModel.getJumpLink2();
        if (jumpLink2 != null) {
            C40911a.m89599c(jumpLink2, null, false, 6, null);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m63743X3(BotAssetsTotalItemModel botAssetsTotalItemModel) {
        m63749f4("Intro", String.valueOf(botAssetsTotalItemModel.getItemId()));
        String jumpLink1 = botAssetsTotalItemModel.getJumpLink1();
        if (jumpLink1 != null) {
            C40911a.m89599c(jumpLink1, null, false, 6, null);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m63745Z3(boolean z11) {
        ViewGroup.LayoutParams layoutParams;
        int i11;
        C42073i c42073iM63741U3;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C42073i c42073iM63741U4 = m63741U3();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (c42073iM63741U4 != null && (recyclerView2 = c42073iM63741U4.f92882m) != null) {
            layoutParams = recyclerView2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (!z11) {
            i11 = 12;
        } else {
            i11 = 0;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) C27025c.m66565c(C27017c.f54310a.m66513b(), i11);
        }
        if (marginLayoutParams != null && (c42073iM63741U3 = m63741U3()) != null && (recyclerView = c42073iM63741U3.f92882m) != null) {
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m63746a4(List<BotAssetsTotalItemModel> list) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C42073i c42073iM63741U3 = m63741U3();
        if (c42073iM63741U3 != null && (recyclerView2 = c42073iM63741U3.f92882m) != null) {
            recyclerView2.setVisibility(0);
        }
        if (list != null && !list.isEmpty()) {
            WrapperLoadingView wrapperLoadingView = this.f52218W;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
            C42073i c42073iM63741U4 = m63741U3();
            if (c42073iM63741U4 != null && (recyclerView = c42073iM63741U4.f92882m) != null) {
                C24346y.m59052b(recyclerView, CollectionsKt.toMutableList((Collection) list));
                return;
            }
            return;
        }
        m63719c4();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m63747b4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String strM94374c;
        C42073i c42073iM63741U3 = m63741U3();
        String strM94374c2 = null;
        if (c42073iM63741U3 != null && (baseTextView2 = c42073iM63741U3.f92868A) != null) {
            int i11 = R$string.kc_tb_asset_total_profit;
            String str = this.f52221Z;
            if (str != null) {
                strM94374c = C42974h.m94374c(str);
            } else {
                strM94374c = null;
            }
            baseTextView2.setText(getString(i11, C27041f.m66669i(strM94374c, "- -")));
        }
        C42073i c42073iM63741U4 = m63741U3();
        if (c42073iM63741U4 != null && (baseTextView = c42073iM63741U4.f92890u) != null) {
            int i12 = R$string.kc_tb_asset_today_profit;
            String str2 = this.f52221Z;
            if (str2 != null) {
                strM94374c2 = C42974h.m94374c(str2);
            }
            baseTextView.setText(getString(i12, C27041f.m66669i(strM94374c2, "- -")));
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        RecyclerView recyclerView;
        CoordinatorLayout coordinatorLayout;
        KcSecondaryButton kcSecondaryButton;
        KcSecondaryButton kcSecondaryButton2;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        super.initView();
        C42073i c42073iM63741U3 = m63741U3();
        if (c42073iM63741U3 != null) {
            recyclerView = c42073iM63741U3.f92882m;
        } else {
            recyclerView = null;
        }
        this.f52218W = WrapperLoadingView.injectView(recyclerView);
        C42073i c42073iM63741U4 = m63741U3();
        if (c42073iM63741U4 != null) {
            coordinatorLayout = c42073iM63741U4.f92875f;
        } else {
            coordinatorLayout = null;
        }
        this.f52219X = WrapperLoadingView.injectView(coordinatorLayout);
        C42073i c42073iM63741U5 = m63741U3();
        if (c42073iM63741U5 != null && (recyclerView3 = c42073iM63741U5.f92882m) != null) {
            recyclerView3.setAdapter(this.f52217V);
        }
        C42073i c42073iM63741U6 = m63741U3();
        if (c42073iM63741U6 != null && (recyclerView2 = c42073iM63741U6.f92882m) != null) {
            recyclerView2.setItemAnimator(null);
        }
        m63736G3();
        m63747b4();
        C42073i c42073iM63741U7 = m63741U3();
        if (c42073iM63741U7 != null && (kuCoinRefreshLayout = c42073iM63741U7.f92883n) != null) {
            kuCoinRefreshLayout.m54650b(new Function0() { // from class: com.kubi.tradingbotkit.business.asset.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotAssetsFragment.m63718V3(this.f52233b);
                }
            });
        }
        WrapperLoadingView wrapperLoadingView = this.f52219X;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
        if (C5303w0.m6511a()) {
            C42073i c42073iM63741U8 = m63741U3();
            if (c42073iM63741U8 != null && (kcSecondaryButton2 = c42073iM63741U8.f92872c) != null) {
                C27046k.m66693h(kcSecondaryButton2, R$drawable.ic2_arrow_right2_16, 0, GravityCompat.START);
                return;
            }
            return;
        }
        C42073i c42073iM63741U9 = m63741U3();
        if (c42073iM63741U9 != null && (kcSecondaryButton = c42073iM63741U9.f92872c) != null) {
            C27046k.m66693h(kcSecondaryButton, R$drawable.ic2_arrow_right2_16, 0, GravityCompat.END);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof DialogFragment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((DialogFragment) it.next()).dismissAllowingStateLoss();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        sendIntent(BotAssetsContract$UiIntent.GetAssetTotal.INSTANCE);
        sendIntent(new BotAssetsContract$UiIntent.HideOrShowNumber(IAssetsCenterService.f16464a.get().mo15359y()));
    }
}
