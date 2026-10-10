package com.kubi.futures.trade.welfare.distribution;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.broker.BrokerConfig;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.guide.GuideHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DistributionManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\r\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionManager;", "", "<init>", "()V", "data", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "checkNeedDistribution", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "checkNeedDistributionFromWs", "isFragmentShow", "", "clearData", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDistributionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionManager.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class DistributionManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DistributionManager f24703a = new DistributionManager();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static FuturesWelfareTrialItemEntity f24704b;

    /* JADX INFO: renamed from: e */
    public final void m28550e() {
        f24704b = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m28548c(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (UserInfo.a.n() && BrokerConfig.f19211a.m20201d().mo20229O()) {
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = f24704b;
            if (futuresWelfareTrialItemEntity == null) {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new DistributionManager$checkNeedDistribution$2(fragment, null), 3, null);
                return;
            }
            View view = fragment.getView();
            if (view != null) {
                GuideHelper.f29155a.m33891w(view, futuresWelfareTrialItemEntity);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m28549d(@NotNull BaseFragment fragment, @Nullable FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (futuresWelfareTrialItemEntity == null || TextUtils.isEmpty(futuresWelfareTrialItemEntity.getCode())) {
            return;
        }
        if (!m28551f(fragment) || !BrokerConfig.f19211a.m20201d().mo20229O()) {
            f24704b = futuresWelfareTrialItemEntity;
            return;
        }
        View view = fragment.getView();
        if (view != null) {
            GuideHelper.f29155a.m33891w(view, futuresWelfareTrialItemEntity);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m28551f(BaseFragment baseFragment) {
        Boolean boolValueOf;
        if (baseFragment.isShowing()) {
            View view = baseFragment.getView();
            if (view != null) {
                boolValueOf = Boolean.valueOf(view.getGlobalVisibleRect(new Rect()));
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
