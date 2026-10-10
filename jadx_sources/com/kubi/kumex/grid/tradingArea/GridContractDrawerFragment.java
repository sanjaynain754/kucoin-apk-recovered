package com.kubi.kumex.grid.tradingArea;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.grid.tradingArea.GridContractDrawerFragment;
import com.kubi.kumex.market.tradingArea.ContractDrawerFragment;
import com.kubi.kumex.market.tradingArea.DrawerTradingAreaVM;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import y70.StorageId;

/* JADX INFO: compiled from: GridContractDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Deprecated(message = "废弃代码，4.0开始，机器人使用h5界面")
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001fH\u0014J\n\u0010 \u001a\u0004\u0018\u00010!H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006#"}, m90084d2 = {"Lcom/kubi/kumex/grid/tradingArea/GridContractDrawerFragment;", "Lcom/kubi/kumex/market/tradingArea/ContractDrawerFragment;", "<init>", "()V", "searchFragment", "Lcom/kubi/kumex/grid/tradingArea/GridSearchDrawerFragment;", "getSearchFragment", "()Lcom/kubi/kumex/grid/tradingArea/GridSearchDrawerFragment;", "searchFragment$delegate", "Lkotlin/Lazy;", "getFavoriteFragment", "Landroidx/fragment/app/Fragment;", "getChildFragment", "type", "", "tradingArea", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "sectionPosition", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "tryShowNoticeView", "persistenceKey", "Lcom/kubi/utils/storage/StorageId;", "", ViewProps.MARGIN, "Lkotlin/Function1;", "getViewModeFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GridContractDrawerFragment extends ContractDrawerFragment {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f29100j0 = new Companion(null);

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f29101i0 = LazyKt.lazy(new Function0() { // from class: hm.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GridContractDrawerFragment.m33751a4();
        }
    });

    /* JADX INFO: compiled from: GridContractDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/grid/tradingArea/GridContractDrawerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/grid/tradingArea/GridContractDrawerFragment;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final GridContractDrawerFragment newInstance() {
            GridContractDrawerFragment gridContractDrawerFragment = new GridContractDrawerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(BaseFragment.FRAGMENT_BACK, R$color.color_fff_1c222b);
            gridContractDrawerFragment.setArguments(bundle);
            return gridContractDrawerFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.grid.tradingArea.GridContractDrawerFragment$a */
    /* JADX INFO: compiled from: GridContractDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/kumex/grid/tradingArea/GridContractDrawerFragment$getViewModeFactory$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15996a implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new DrawerTradingAreaVM(true);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final GridSearchDrawerFragment m33751a4() {
        return new GridSearchDrawerFragment();
    }

    @Override // com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment
    /* JADX INFO: renamed from: G3 */
    public void mo33752G3(@NotNull StorageId<Long> persistenceKey, @Nullable Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(persistenceKey, "persistenceKey");
    }

    @Override // com.kubi.kumex.market.tradingArea.ContractDrawerFragment
    @NotNull
    /* JADX INFO: renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public GridSearchDrawerFragment mo33753S3() {
        return (GridSearchDrawerFragment) this.f29101i0.getValue();
    }

    @Override // com.kubi.kumex.market.tradingArea.ContractDrawerFragment, com.kubi.mvi.state.BaseStateFragment
    @Nullable
    public ViewModelProvider.Factory getViewModeFactory() {
        return new C15996a();
    }

    @Override // com.kubi.kumex.market.tradingArea.ContractDrawerFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R$id.tv_title);
        if (textView != null) {
            textView.setText(getString(R$string.robot_future_grid_title));
        }
    }

    @Override // com.kubi.kumex.market.tradingArea.ContractDrawerFragment, com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment
    @NotNull
    /* JADX INFO: renamed from: v3 */
    public Fragment mo33755v3(int i11, @NotNull String tradingArea, @NotNull AvailableTradeAreaEntity entity, int i12) {
        Intrinsics.checkNotNullParameter(tradingArea, "tradingArea");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return GridDrawerListFragment.f29102f0.newInstance(i11, tradingArea, entity, getF29467U(), getF29468V(), i12);
    }

    @Override // com.kubi.kumex.market.tradingArea.ContractDrawerFragment, com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment
    @NotNull
    /* JADX INFO: renamed from: w3 */
    public Fragment mo33756w3() {
        return GridFavoriteDrawerFragment.f29103j0.newInstance(0, "favor", getF29467U(), getF29468V());
    }
}
