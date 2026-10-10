package l20;

import android.view.View;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.entity.DelegationEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: l20.l */
/* JADX INFO: compiled from: IDelegateDetailTradeTypeHeaderView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateDetail/IDelegateDetailTradeTypeHeaderView;", "", "getHeaderLayout", "", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "bindData", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "delegationDetailFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42045l {
    /* JADX INFO: renamed from: a */
    void mo92245a(@NotNull View view, @NotNull DelegationEntity delegationEntity, @NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: b */
    int mo92249b(@NotNull DelegationEntity delegationEntity);
}
