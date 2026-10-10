package com.kubi.assets.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.autoearn.AutoEarnViewModel;
import com.kubi.assets.autoearn.views.AutoEarnCoinEntryView;
import com.kubi.assets.filter.AssetFilterDialogFragment;
import com.kubi.assets.filter.AssetFilterHelper;
import com.kubi.assets.filter.IFilterDialogCallBack;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.C23637c;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37760l;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p637ta.C44828n5;
import p830zf.InterfaceC46803i0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BaseAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0002abB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\b\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u000203H\u0014J\u001a\u00105\u001a\u0002032\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u000203H\u0016J\b\u0010;\u001a\u000203H\u0016J\b\u0010<\u001a\u00020\u0017H&J\b\u0010=\u001a\u000203H\u0016J\u0016\u0010D\u001a\u0002032\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0FH\u0016J\u0006\u0010G\u001a\u000203J\u0006\u0010H\u001a\u000203J,\u0010I\u001a\u0002032\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0F2\b\b\u0002\u0010L\u001a\u00020\u00122\f\u0010M\u001a\b\u0012\u0004\u0012\u00020K0NJ\u0014\u0010O\u001a\u0002032\f\u0010J\u001a\b\u0012\u0004\u0012\u00020P0FJ\u0014\u0010Q\u001a\u0002032\f\u0010J\u001a\b\u0012\u0004\u0012\u00020R0FJ\u0018\u0010S\u001a\u0002032\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020RH\u0002J\u0018\u0010W\u001a\u0002032\u0006\u0010V\u001a\u00020R2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u0002032\u0006\u0010X\u001a\u00020YH\u0002J\u000e\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0017J\u001a\u0010^\u001a\u0002032\b\u0010_\u001a\u0004\u0018\u00010Y2\u0006\u0010`\u001a\u00020\u0012H\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR-\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018`\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b/\u00100R!\u0010>\u001a\u0012\u0012\u0004\u0012\u00020@0?j\b\u0012\u0004\u0012\u00020@`A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006c"}, m90084d2 = {"Lcom/kubi/assets/detail/BaseAccountDetailFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/assets/filter/IFilterDialogCallBack;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "safeBinding", "getLayout", "", "getItemLayout", "needDefaultBackground", "", "getEmptyFooterText", "getEndFooterText", "requestParams", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getRequestParams", "()Ljava/util/HashMap;", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getBeforeGet", "()Lcom/kubi/utils/TimeUtils$BeforeGet;", "setBeforeGet", "(Lcom/kubi/utils/TimeUtils$BeforeGet;)V", "assetV2Api", "Lcom/kubi/assets/AssetV2Api;", "getAssetV2Api", "()Lcom/kubi/assets/AssetV2Api;", "assetV2Api$delegate", "Lkotlin/Lazy;", "autoEarnViewModel", "Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "getAutoEarnViewModel", "()Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "autoEarnViewModel$delegate", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "getCoinInfoEntity", "()Lcom/kubi/data/entity/CoinInfoEntity;", "coinInfoEntity$delegate", "onReBack", "", "setHeader", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onFilterClick", "onViewMoreClick", "getAccountType", "refreshData", "initParams", "Ljava/util/ArrayList;", "Lcom/kubi/assets/filter/ParcelizePair;", "Lkotlin/collections/ArrayList;", "getInitParams", "()Ljava/util/ArrayList;", "filterCallBack", DbParams.KEY_CHANNEL_RESULT, "", "initAutoEarnEntry", "reloadAutoEarnState", "setTradeList", "list", "Lcom/kubi/data/entity/TradeItemBean;", "viewMoreFlag", "consumer", "Lio/reactivex/functions/Consumer;", "setFunctionList", "Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderFunction;", "setHeaderInfoList", "Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderInfo;", "setHeaderItemData", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "clickFreezeInfo", "ivArrow", "Lcom/kubi/sdk/widget/shape/view/ShapeImageView;", "loadFreezeReasonData", "getStart", "", "value", "startShowChartAnimator", "imageView", "showAnimation", "AssetHeaderInfo", "AssetHeaderFunction", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseAccountDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAccountDetailFragment.kt\ncom/kubi/assets/detail/BaseAccountDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,473:1\n147#2,16:474\n106#3,15:490\n17#4,2:505\n*S KotlinDebug\n*F\n+ 1 BaseAccountDetailFragment.kt\ncom/kubi/assets/detail/BaseAccountDetailFragment\n*L\n68#1:474,16\n91#1:490,15\n83#1:505,2\n*E\n"})
public abstract class BaseAccountDetailFragment<T extends Parcelable> extends BasePagingFragment<T> implements IFilterDialogCallBack {

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f16858g0 = {Reflection.property1(new PropertyReference1Impl(BaseAccountDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f16859Z = C45681e.m100799e(this, new Function1<BaseAccountDetailFragment<T>, C44828n5>() { // from class: com.kubi.assets.detail.BaseAccountDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44828n5 invoke(@NotNull BaseAccountDetailFragment<T> fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44828n5.m99182a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44828n5, Unit>() { // from class: com.kubi.assets.detail.BaseAccountDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44828n5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44828n5 c44828n5) {
            invoke(c44828n5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final HashMap<String, Object> f16860a0 = new HashMap<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public TimeUtils.C27004b f16861b0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f16862c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.detail.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseAccountDetailFragment.m15887Z3();
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f16863d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f16864e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final ArrayList<ParcelizePair> f16865f0;

    /* JADX INFO: renamed from: com.kubi.assets.detail.BaseAccountDetailFragment$a, reason: from toString */
    /* JADX INFO: compiled from: BaseAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderFunction;", "", "resId", "", "title", "", "callBack", "Lio/reactivex/functions/Action;", "<init>", "(ILjava/lang/String;Lio/reactivex/functions/Action;)V", "getResId", "()I", "getTitle", "()Ljava/lang/String;", "getCallBack", "()Lio/reactivex/functions/Action;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AssetHeaderFunction {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int resId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final Action callBack;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetHeaderFunction)) {
                return false;
            }
            AssetHeaderFunction assetHeaderFunction = (AssetHeaderFunction) other;
            return this.resId == assetHeaderFunction.resId && Intrinsics.areEqual(this.title, assetHeaderFunction.title) && Intrinsics.areEqual(this.callBack, assetHeaderFunction.callBack);
        }

        public AssetHeaderFunction(@DrawableRes int i11, @NotNull String title, @Nullable Action action) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.resId = i11;
            this.title = title;
            this.callBack = action;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getCallBack() {
            return this.callBack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.resId) * 31) + this.title.hashCode()) * 31;
            Action action = this.callBack;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        @NotNull
        public String toString() {
            return "AssetHeaderFunction(resId=" + this.resId + ", title=" + this.title + ", callBack=" + this.callBack + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.detail.BaseAccountDetailFragment$b, reason: from toString */
    /* JADX INFO: compiled from: BaseAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jx\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006-"}, m90084d2 = {"Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderInfo;", "", "title", "", "value", "subValue", "isShowArrow", "", "valueColor", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "onTitleClick", "Lkotlin/Function0;", "", "onEditClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lio/reactivex/functions/Action;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "getValue", "getSubValue", "()Z", "getValueColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lio/reactivex/functions/Action;", "getOnTitleClick", "()Lkotlin/jvm/functions/Function0;", "getOnEditClick", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lio/reactivex/functions/Action;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderInfo;", "equals", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AssetHeaderInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String title;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String value;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String subValue;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final boolean isShowArrow;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final Integer valueColor;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final Action action;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public final Function0<Unit> onTitleClick;

        /* JADX INFO: renamed from: h, reason: from toString */
        @Nullable
        public final Function0<Unit> onEditClick;

        public AssetHeaderInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11, @Nullable Integer num, @Nullable Action action, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1) {
            this.title = str;
            this.value = str2;
            this.subValue = str3;
            this.isShowArrow = z11;
            this.valueColor = num;
            this.action = action;
            this.onTitleClick = function0;
            this.onEditClick = function1;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetHeaderInfo)) {
                return false;
            }
            AssetHeaderInfo assetHeaderInfo = (AssetHeaderInfo) other;
            return Intrinsics.areEqual(this.title, assetHeaderInfo.title) && Intrinsics.areEqual(this.value, assetHeaderInfo.value) && Intrinsics.areEqual(this.subValue, assetHeaderInfo.subValue) && this.isShowArrow == assetHeaderInfo.isShowArrow && Intrinsics.areEqual(this.valueColor, assetHeaderInfo.valueColor) && Intrinsics.areEqual(this.action, assetHeaderInfo.action) && Intrinsics.areEqual(this.onTitleClick, assetHeaderInfo.onTitleClick) && Intrinsics.areEqual(this.onEditClick, assetHeaderInfo.onEditClick);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Function0<Unit> m15931b() {
            return this.onEditClick;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Function0<Unit> m15932c() {
            return this.onTitleClick;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getValueColor() {
            return this.valueColor;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsShowArrow() {
            return this.isShowArrow;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subValue;
            int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isShowArrow)) * 31;
            Integer num = this.valueColor;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Action action = this.action;
            int iHashCode5 = (iHashCode4 + (action == null ? 0 : action.hashCode())) * 31;
            Function0<Unit> function0 = this.onTitleClick;
            int iHashCode6 = (iHashCode5 + (function0 == null ? 0 : function0.hashCode())) * 31;
            Function0<Unit> function1 = this.onEditClick;
            return iHashCode6 + (function1 != null ? function1.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AssetHeaderInfo(title=" + this.title + ", value=" + this.value + ", subValue=" + this.subValue + ", isShowArrow=" + this.isShowArrow + ", valueColor=" + this.valueColor + ", action=" + this.action + ", onTitleClick=" + this.onTitleClick + ", onEditClick=" + this.onEditClick + ')';
        }

        public /* synthetic */ AssetHeaderInfo(String str, String str2, String str3, boolean z11, Integer num, Action action, Function0 function0, Function0 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : action, (i11 & 64) != 0 ? null : function0, (i11 & 128) != 0 ? null : function1);
        }
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m15892n4(BaseAccountDetailFragment baseAccountDetailFragment, boolean z11, String str) {
        BaseFragment.hideLoadingDialog$default(baseAccountDetailFragment, false, 1, null);
        if (z11) {
            baseAccountDetailFragment.m15924v4();
        } else {
            ToastCompat.m66441G(str, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m15893o4(BaseAccountDetailFragment baseAccountDetailFragment, boolean z11, String str) {
        BaseFragment.hideLoadingDialog$default(baseAccountDetailFragment, false, 1, null);
        if (z11) {
            baseAccountDetailFragment.m15924v4();
        } else {
            ToastCompat.m66441G(str, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: D4 */
    public final void m15905D4(BaseViewHolder baseViewHolder, final AssetHeaderInfo assetHeaderInfo) throws Exception {
        int iM66699n;
        Integer valueColor = assetHeaderInfo.getValueColor();
        if (valueColor != null) {
            iM66699n = valueColor.intValue();
        } else {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            iM66699n = C27046k.m66699n(mContext, Intrinsics.areEqual(assetHeaderInfo.getValue(), "0.00") ? R$color.c_text40 : R$color.c_text);
        }
        int i11 = R$id.tvTitle;
        BaseViewHolder text = baseViewHolder.setText(i11, assetHeaderInfo.getTitle());
        int i12 = R$id.tvValue;
        text.setTextColor(i12, iM66699n);
        baseViewHolder.setText(i12, assetHeaderInfo.getValue());
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(i11);
        Action action = assetHeaderInfo.getAction();
        if (action != null) {
            action.run();
            dashTextView.setTag("dashline");
        }
        dashTextView.setNeedDash(false);
        final Function0<Unit> function0M15932c = assetHeaderInfo.m15932c();
        if (function0M15932c != null) {
            dashTextView.setNeedDash(true);
            Intrinsics.checkNotNull(dashTextView);
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.detail.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseAccountDetailFragment.m15864E4(function0M15932c);
                }
            }, 1, null);
        }
        final ShapeImageView shapeImageView = (ShapeImageView) baseViewHolder.getView(R$id.ivArrow);
        ShowHideTextView showHideTextView = (ShowHideTextView) baseViewHolder.getView(i12);
        Intrinsics.checkNotNull(shapeImageView);
        Intrinsics.checkNotNull(showHideTextView);
        C27046k.m66681D(new View[]{shapeImageView, showHideTextView}, new Function0() { // from class: com.kubi.assets.detail.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseAccountDetailFragment.m15865F4(this.f16905b, assetHeaderInfo, shapeImageView);
            }
        });
        shapeImageView.setVisibility((!assetHeaderInfo.getIsShowArrow() || Intrinsics.areEqual(assetHeaderInfo.getValue(), "0.00")) ? 8 : 0);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivEditAvgCost);
        if (assetHeaderInfo.m15931b() == null) {
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66577h(imageView);
        } else {
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66594y(imageView);
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.detail.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseAccountDetailFragment.m15866G4(assetHeaderInfo);
                }
            }, 1, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c4 */
    public abstract String mo15911c4();

    /* JADX INFO: renamed from: I4 */
    public static /* synthetic */ void m15869I4(BaseAccountDetailFragment baseAccountDetailFragment, List list, boolean z11, Consumer consumer, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTradeList");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        baseAccountDetailFragment.m15908H4(list, z11, consumer);
    }

    /* JADX INFO: renamed from: e4 */
    private final AutoEarnViewModel m15889e4() {
        return (AutoEarnViewModel) this.f16863d0.getValue();
    }

    /* JADX INFO: renamed from: g4 */
    private final C44828n5 m15890g4() {
        return (C44828n5) this.f16859Z.getValue(this, f16858g0[0]);
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m15891m4(C44828n5 c44828n5, final BaseAccountDetailFragment baseAccountDetailFragment) {
        if (c44828n5.f100513c.getIsOpen()) {
            baseAccountDetailFragment.showLoadingDialog();
            AutoEarnViewModel autoEarnViewModelM15889e4 = baseAccountDetailFragment.m15889e4();
            CoinInfoEntity coinInfoEntityM15914h4 = baseAccountDetailFragment.m15914h4();
            autoEarnViewModelM15889e4.m15425f(C27041f.m66668h(coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCurrency() : null), new Function2() { // from class: com.kubi.assets.detail.f
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseAccountDetailFragment.m15892n4(this.f16894b, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        } else {
            baseAccountDetailFragment.showLoadingDialog();
            AutoEarnViewModel autoEarnViewModelM15889e5 = baseAccountDetailFragment.m15889e4();
            CoinInfoEntity coinInfoEntityM15914h5 = baseAccountDetailFragment.m15914h4();
            autoEarnViewModelM15889e5.m15429p(C27041f.m66668h(coinInfoEntityM15914h5 != null ? coinInfoEntityM15914h5.getCurrency() : null), new Function2() { // from class: com.kubi.assets.detail.g
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseAccountDetailFragment.m15893o4(this.f16895b, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m15895s4(BaseAccountDetailFragment baseAccountDetailFragment) {
        DialogFragmentHelper dialogFragmentHelperNewInstance = AssetFilterDialogFragment.f17329u0.newInstance(baseAccountDetailFragment.mo15911c4(), baseAccountDetailFragment.f16865f0);
        FragmentManager childFragmentManager = baseAccountDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperNewInstance.show(childFragmentManager, baseAccountDetailFragment.mo15911c4());
    }

    /* JADX INFO: renamed from: B4 */
    public final void m15902B4(@NotNull List<AssetHeaderFunction> list) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C44828n5 c44828n5M15890g4;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(list, "list");
        C44828n5 c44828n5M15890g5 = m15890g4();
        if (c44828n5M15890g5 != null && (frameLayout = c44828n5M15890g5.f100522l) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        C44828n5 c44828n5M15890g6 = m15890g4();
        RecyclerView.Adapter adapter = null;
        if (((c44828n5M15890g6 == null || (recyclerView4 = c44828n5M15890g6.f100520j) == null) ? null : recyclerView4.getAdapter()) == null && (c44828n5M15890g4 = m15890g4()) != null && (recyclerView3 = c44828n5M15890g4.f100520j) != null) {
            recyclerView3.setAdapter(new BaseAccountDetailFragment$setFunctionList$1(R$layout.item_asset_header_function));
        }
        C44828n5 c44828n5M15890g7 = m15890g4();
        RecyclerView.LayoutManager layoutManager = (c44828n5M15890g7 == null || (recyclerView2 = c44828n5M15890g7.f100520j) == null) ? null : recyclerView2.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanCount(list.size() != 1 ? 2 : 1);
        }
        C44828n5 c44828n5M15890g8 = m15890g4();
        if (c44828n5M15890g8 != null && (recyclerView = c44828n5M15890g8.f100520j) != null) {
            adapter = recyclerView.getAdapter();
        }
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type io.chad.library.adapter.base.BaseQuickAdapter<com.kubi.assets.detail.BaseAccountDetailFragment.AssetHeaderFunction, io.chad.library.adapter.base.BaseViewHolder>");
        ((BaseQuickAdapter) adapter).replaceData(list);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m15904C4(@NotNull List<AssetHeaderInfo> list) {
        RecyclerView recyclerView;
        C44828n5 c44828n5M15890g4;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Intrinsics.checkNotNullParameter(list, "list");
        C44828n5 c44828n5M15890g5 = m15890g4();
        if (((c44828n5M15890g5 == null || (recyclerView3 = c44828n5M15890g5.f100521k) == null) ? null : recyclerView3.getAdapter()) == null && (c44828n5M15890g4 = m15890g4()) != null && (recyclerView2 = c44828n5M15890g4.f100521k) != null) {
            final int i11 = R$layout.item_asset_header_info;
            recyclerView2.setAdapter(new BaseQuickAdapter<AssetHeaderInfo, BaseViewHolder>(this, i11) { // from class: com.kubi.assets.detail.BaseAccountDetailFragment$setHeaderInfoList$1

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ BaseAccountDetailFragment<T> f16877i;

                {
                    this.f16877i = this;
                }

                @Override // io.chad.library.adapter.base.BaseQuickAdapter
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public void convert(BaseViewHolder helper, BaseAccountDetailFragment.AssetHeaderInfo item) throws Exception {
                    Intrinsics.checkNotNullParameter(helper, "helper");
                    Intrinsics.checkNotNullParameter(item, "item");
                    this.f16877i.m15905D4(helper, item);
                }
            });
        }
        C44828n5 c44828n5M15890g6 = m15890g4();
        RecyclerView.Adapter adapter = (c44828n5M15890g6 == null || (recyclerView = c44828n5M15890g6.f100521k) == null) ? null : recyclerView.getAdapter();
        BaseQuickAdapter baseQuickAdapter = adapter instanceof BaseQuickAdapter ? (BaseQuickAdapter) adapter : null;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.replaceData(list);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f16861b0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    /* JADX INFO: renamed from: H4 */
    public final void m15908H4(@NotNull List<? extends TradeItemBean> list, boolean z11, @NotNull Consumer<TradeItemBean> consumer) {
        BaseTextView baseTextView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        C44828n5 c44828n5M15890g4 = m15890g4();
        if (c44828n5M15890g4 != null && (frameLayout = c44828n5M15890g4.f100522l) != null) {
            ViewExtKt.m66594y(frameLayout);
        }
        if (z11) {
            C44828n5 c44828n5M15890g5 = m15890g4();
            if (c44828n5M15890g5 != null && (baseTextView3 = c44828n5M15890g5.f100525o) != null) {
                baseTextView3.setVisibility(0);
            }
            C44828n5 c44828n5M15890g6 = m15890g4();
            if (c44828n5M15890g6 != null && (baseTextView2 = c44828n5M15890g6.f100525o) != null) {
                C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.assets.detail.r
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseAccountDetailFragment.m15871J4(this.f16909b);
                    }
                }, 1, null);
            }
        } else {
            C44828n5 c44828n5M15890g7 = m15890g4();
            if (c44828n5M15890g7 != null && (baseTextView = c44828n5M15890g7.f100525o) != null) {
                baseTextView.setVisibility(8);
            }
        }
        C44828n5 c44828n5M15890g8 = m15890g4();
        RecyclerView.Adapter adapter = null;
        if (((c44828n5M15890g8 == null || (recyclerView4 = c44828n5M15890g8.f100520j) == null) ? null : recyclerView4.getAdapter()) == null) {
            C44828n5 c44828n5M15890g9 = m15890g4();
            if (c44828n5M15890g9 != null && (recyclerView3 = c44828n5M15890g9.f100520j) != null) {
                ViewExtKt.m66584o(recyclerView3, C27040e.m66658b(10), 0, C27040e.m66658b(10), 0);
            }
            C44828n5 c44828n5M15890g10 = m15890g4();
            if (c44828n5M15890g10 != null && (recyclerView2 = c44828n5M15890g10.f100520j) != null) {
                recyclerView2.setAdapter(new BaseAccountDetailFragment$setTradeList$2(z11, consumer, R$layout.item_asset_header_trade));
            }
        }
        C44828n5 c44828n5M15890g11 = m15890g4();
        if (c44828n5M15890g11 != null && (recyclerView = c44828n5M15890g11.f100520j) != null) {
            adapter = recyclerView.getAdapter();
        }
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type io.chad.library.adapter.base.BaseQuickAdapter<com.kubi.data.entity.TradeItemBean, io.chad.library.adapter.base.BaseViewHolder>");
        ((BaseQuickAdapter) adapter).replaceData(list);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m15909K4(ShapeImageView shapeImageView, boolean z11) {
        RotateAnimation rotateAnimation = z11 ? new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f) : new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setDuration(300L);
        rotateAnimation.setInterpolator(new AccelerateInterpolator());
        if (shapeImageView != null) {
            shapeImageView.startAnimation(rotateAnimation);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d4 */
    public final AssetV2Api m15912d4() {
        Object value = this.f16862c0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AssetV2Api) value;
    }

    @NotNull
    /* JADX INFO: renamed from: f4, reason: from getter */
    public final TimeUtils.C27004b getF16861b0() {
        return this.f16861b0;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.layout_base_account_detail;
    }

    @NotNull
    /* JADX INFO: renamed from: h4 */
    public final CoinInfoEntity m15914h4() {
        return (CoinInfoEntity) this.f16864e0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i4 */
    public final ArrayList<ParcelizePair> m15915i4() {
        return this.f16865f0;
    }

    @NotNull
    /* JADX INFO: renamed from: j4 */
    public final HashMap<String, Object> m15916j4() {
        return this.f16860a0;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m15917k4(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int iHashCode = value.hashCode();
        if (iHashCode == -1480287667) {
            if (value.equals("ONE_WEEK")) {
                return this.f16861b0.m66434a(7, 6);
            }
            return 0L;
        }
        if (iHashCode == 1314132820) {
            if (value.equals("HALF_MONTH")) {
                return this.f16861b0.m66434a(15, 6);
            }
            return 0L;
        }
        if (iHashCode == 1346794279 && value.equals("ONE_MONTH")) {
            return this.f16861b0.m66434a(30, 6);
        }
        return 0L;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        ImageView imageView;
        C44828n5 c44828n5M15890g4;
        AccountDetailHeaderView accountDetailHeaderView;
        AppBarLayout appBarLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f46496X.setEnabled(false);
        C23637c c23637c = C23637c.f46218a;
        Intent intent = requireActivity().getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        final String strM56297b = c23637c.m56297b(intent, "title");
        if (strM56297b == null) {
            strM56297b = "";
        }
        C44828n5 c44828n5M15890g5 = m15890g4();
        if (c44828n5M15890g5 != null && (appBarLayout = c44828n5M15890g5.f100512b) != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.kubi.assets.detail.m
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i11) {
                    BaseAccountDetailFragment.m15896t4(this.f16901a, strM56297b, appBarLayout2, i11);
                }
            });
        }
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (coinInfoEntityM15914h4 != null && (c44828n5M15890g4 = m15890g4()) != null && (accountDetailHeaderView = c44828n5M15890g4.f100515e) != null) {
            accountDetailHeaderView.m15861a(new FullCoinBean(C27041f.m66668h(coinInfoEntityM15914h4.getIconUrl()), C27041f.m66668h(coinInfoEntityM15914h4.getCurrency()), C27041f.m66668h(coinInfoEntityM15914h4.getName())));
        }
        C44828n5 c44828n5M15890g6 = m15890g4();
        if (c44828n5M15890g6 != null && (imageView = c44828n5M15890g6.f100517g) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.detail.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseAccountDetailFragment.m15894r4(this.f16903b);
                }
            }, 1, null);
        }
        AssetFilterHelper.m16577f(AssetFilterHelper.f17335a, mo15911c4(), null, 2, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: t3 */
    public int mo15921t3() {
        return R$string.coin_detail_empty;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46803i0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46803i0) objM56186h).m103135a() : true) {
            return R$string.coin_no_more_data;
        }
        return 0;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.item_base_account_detail;
    }

    @Override // com.kubi.assets.filter.IFilterDialogCallBack
    /* JADX INFO: renamed from: z */
    public void mo15926z(@NotNull List<ParcelizePair> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        super.mo15926z(result);
        this.f16865f0.clear();
        this.f16865f0.addAll(result);
        mo15906F3();
    }

    public BaseAccountDetailFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.detail.BaseAccountDetailFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.detail.BaseAccountDetailFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f16863d0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AutoEarnViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.detail.BaseAccountDetailFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.detail.BaseAccountDetailFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.detail.BaseAccountDetailFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f16864e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.detail.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseAccountDetailFragment.m15888b4(this.f16900b);
            }
        });
        ArrayList<ParcelizePair> arrayList = new ArrayList<>();
        arrayList.add(new ParcelizePair("direction", ""));
        arrayList.add(new ParcelizePair("time", "ONE_MONTH"));
        arrayList.add(new ParcelizePair("bizType", ""));
        this.f16865f0 = arrayList;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m15864E4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m15865F4(BaseAccountDetailFragment baseAccountDetailFragment, AssetHeaderInfo assetHeaderInfo, ShapeImageView shapeImageView) {
        Intrinsics.checkNotNull(shapeImageView);
        baseAccountDetailFragment.m15910a4(assetHeaderInfo, shapeImageView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m15866G4(AssetHeaderInfo assetHeaderInfo) {
        assetHeaderInfo.m15931b().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m15871J4(BaseAccountDetailFragment baseAccountDetailFragment) {
        String currency;
        baseAccountDetailFragment.mo15922u4();
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM15914h4 = baseAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            currency = coinInfoEntityM15914h4.getCurrency();
        } else {
            currency = null;
        }
        if (currency == null) {
            currency = "";
        }
        InterfaceC37760l.a.m85175a(c37304a, "ASSET", null, null, currency, C43852m.m96602n("B1tradeAccountDetail", FirebaseAnalytics.Event.SEARCH, null, 4, null), null, null, 102, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final AssetV2Api m15887Z3() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: b4 */
    public static final CoinInfoEntity m15888b4(BaseAccountDetailFragment baseAccountDetailFragment) {
        String str;
        String stringExtra = baseAccountDetailFragment.requireActivity().getIntent().getStringExtra("code");
        C37890n c37890n = C37890n.f85269a;
        if (stringExtra == null) {
            str = "";
        } else {
            str = stringExtra;
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
        if (coinInfoEntityM85613u == null) {
            CoinInfoEntity coinInfoEntity = new CoinInfoEntity();
            coinInfoEntity.setCode(stringExtra);
            coinInfoEntity.setCurrency(stringExtra);
            return coinInfoEntity;
        }
        return coinInfoEntityM85613u;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m15894r4(final BaseAccountDetailFragment baseAccountDetailFragment) throws Exception {
        if (baseAccountDetailFragment.getContext() != null) {
            baseAccountDetailFragment.mo15920q4();
            AssetFilterHelper.f17335a.m16578e(baseAccountDetailFragment.mo15911c4(), new Action() { // from class: com.kubi.assets.detail.s
                @Override // io.reactivex.functions.Action
                public final void run() {
                    BaseAccountDetailFragment.m15895s4(this.f16910b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m15896t4(BaseAccountDetailFragment baseAccountDetailFragment, String str, AppBarLayout appBarLayout, int i11) {
        LinearLayoutCompat linearLayoutCompat;
        String currency;
        if (baseAccountDetailFragment.getView() == null) {
            return;
        }
        C44828n5 c44828n5M15890g4 = baseAccountDetailFragment.m15890g4();
        if (c44828n5M15890g4 != null && (linearLayoutCompat = c44828n5M15890g4.f100516f) != null && Math.abs(i11) == linearLayoutCompat.getMeasuredHeight()) {
            NavigationBar navigationBar = baseAccountDetailFragment.getNavigationBar();
            CoinInfoEntity coinInfoEntityM15914h4 = baseAccountDetailFragment.m15914h4();
            if (coinInfoEntityM15914h4 != null && (currency = coinInfoEntityM15914h4.getCurrency()) != null) {
                str = currency;
            }
            navigationBar.setTitle(str);
            return;
        }
        baseAccountDetailFragment.getNavigationBar().setTitle(str);
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m15897w4(BaseAccountDetailFragment baseAccountDetailFragment, boolean z11) {
        AutoEarnCoinEntryView autoEarnCoinEntryView;
        AutoEarnCoinEntryView autoEarnCoinEntryView2;
        C44828n5 c44828n5M15901A4 = baseAccountDetailFragment.m15901A4();
        if (c44828n5M15901A4 != null && (autoEarnCoinEntryView2 = c44828n5M15901A4.f100513c) != null) {
            ViewExtKt.m66594y(autoEarnCoinEntryView2);
        }
        C44828n5 c44828n5M15901A5 = baseAccountDetailFragment.m15901A4();
        if (c44828n5M15901A5 != null && (autoEarnCoinEntryView = c44828n5M15901A5.f100513c) != null) {
            autoEarnCoinEntryView.setIsOpen(z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m15898x4(BaseAccountDetailFragment baseAccountDetailFragment, String str) {
        AutoEarnCoinEntryView autoEarnCoinEntryView;
        AutoEarnCoinEntryView autoEarnCoinEntryView2;
        C44828n5 c44828n5M15901A4 = baseAccountDetailFragment.m15901A4();
        if (c44828n5M15901A4 != null && (autoEarnCoinEntryView2 = c44828n5M15901A4.f100513c) != null) {
            ViewExtKt.m66594y(autoEarnCoinEntryView2);
        }
        C44828n5 c44828n5M15901A5 = baseAccountDetailFragment.m15901A4();
        if (c44828n5M15901A5 != null && (autoEarnCoinEntryView = c44828n5M15901A5.f100513c) != null) {
            autoEarnCoinEntryView.setIsOpen(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m15899y4(BaseAccountDetailFragment baseAccountDetailFragment, String str) {
        AutoEarnCoinEntryView autoEarnCoinEntryView;
        C44828n5 c44828n5M15901A4 = baseAccountDetailFragment.m15901A4();
        if (c44828n5M15901A4 != null && (autoEarnCoinEntryView = c44828n5M15901A4.f100513c) != null) {
            ViewExtKt.m66577h(autoEarnCoinEntryView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m15900z4(BaseAccountDetailFragment baseAccountDetailFragment, String str) {
        AutoEarnCoinEntryView autoEarnCoinEntryView;
        C44828n5 c44828n5M15901A4 = baseAccountDetailFragment.m15901A4();
        if (c44828n5M15901A4 != null && (autoEarnCoinEntryView = c44828n5M15901A4.f100513c) != null) {
            ViewExtKt.m66577h(autoEarnCoinEntryView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final C44828n5 m15901A4() {
        if (getView() != null && isAdded()) {
            return m15890g4();
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: G3 */
    public void mo15907G3() {
        Context context = getContext();
        if (context != null) {
            this.f46495W.addHeaderView(new View(context));
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m15910a4(AssetHeaderInfo assetHeaderInfo, ShapeImageView shapeImageView) {
        Boolean bool;
        boolean zBooleanValue;
        Boolean boolValueOf;
        if (assetHeaderInfo.getIsShowArrow() && !Intrinsics.areEqual(assetHeaderInfo.getValue(), "0.00")) {
            Object tag = shapeImageView.getTag();
            Boolean bool2 = null;
            if (tag instanceof Boolean) {
                bool = (Boolean) tag;
            } else {
                bool = null;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            m15909K4(shapeImageView, zBooleanValue);
            Object tag2 = shapeImageView.getTag();
            if (tag2 instanceof Boolean) {
                bool2 = (Boolean) tag2;
            }
            if (bool2 != null) {
                boolValueOf = Boolean.valueOf(!bool2.booleanValue());
            } else {
                boolValueOf = Boolean.TRUE;
            }
            shapeImageView.setTag(boolValueOf);
            m15919p4(shapeImageView);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m15918l4() {
        String currency;
        final C44828n5 c44828n5M15890g4 = m15890g4();
        if (c44828n5M15890g4 != null) {
            AutoEarnCoinEntryView autoEarnCoinEntryView = c44828n5M15890g4.f100513c;
            CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
            if (coinInfoEntityM15914h4 != null) {
                currency = coinInfoEntityM15914h4.getCurrency();
            } else {
                currency = null;
            }
            autoEarnCoinEntryView.setDesc(C27041f.m66668h(currency));
            c44828n5M15890g4.f100513c.setOnTouchCallback(new Function0() { // from class: com.kubi.assets.detail.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseAccountDetailFragment.m15891m4(c44828n5M15890g4, this);
                }
            });
        }
        m15924v4();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        super.onReBack();
        mo15906F3();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m15919p4(ShapeImageView shapeImageView) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new BaseAccountDetailFragment$loadFreezeReasonData$1(this, shapeImageView, null));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m15924v4() {
        String code;
        AutoEarnViewModel autoEarnViewModelM15889e4 = m15889e4();
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        autoEarnViewModelM15889e4.m15426g(C27041f.m66668h(code), new Function1() { // from class: com.kubi.assets.detail.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseAccountDetailFragment.m15897w4(this.f16896b, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.kubi.assets.detail.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseAccountDetailFragment.m15898x4(this.f16897b, (String) obj);
            }
        }, new Function1() { // from class: com.kubi.assets.detail.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseAccountDetailFragment.m15899y4(this.f16898b, (String) obj);
            }
        }, new Function1() { // from class: com.kubi.assets.detail.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseAccountDetailFragment.m15900z4(this.f16899b, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public void mo15920q4() {
    }

    /* JADX INFO: renamed from: u4 */
    public void mo15922u4() {
    }
}
