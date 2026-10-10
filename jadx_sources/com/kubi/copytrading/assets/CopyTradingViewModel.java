package com.kubi.copytrading.assets;

import androidx.lifecycle.MutableLiveData;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.mvi.p102vm.BaseVM;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: CopyTradingViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020$J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020$J\u0006\u0010*\u001a\u00020$R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR-\u0010\u0013\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0018\u00010\u00140\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR-\u0010\u001b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0015\u0018\u00010\u00140\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR-\u0010\u001e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0015\u0018\u00010\u00140\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000f¨\u0006+"}, m90084d2 = {"Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "api", "Lcom/kubi/copytrading/assets/AssetsCopytdApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/assets/AssetsCopytdApi;", "api$delegate", "Lkotlin/Lazy;", "leadTradingAssetData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/copytrading/assets/LeaderTraderAccountInfoEntity;", "getLeadTradingAssetData", "()Landroidx/lifecycle/MutableLiveData;", "leadTradingFailed", "", "getLeadTradingFailed", "leadTradingPositionUiStatus", "Lkotlin/Pair;", "", "Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;", "getLeadTradingPositionUiStatus", "copyTradingAssetData", "Lcom/kubi/copytrading/assets/CopyTradingCopyAssetEntity;", "getCopyTradingAssetData", "copyTradingPositionUiStatus", "Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;", "getCopyTradingPositionUiStatus", "recommendLeadTradingListUiStatus", "Lcom/kubi/copytrading/assets/LeadTradingItemEntity;", "getRecommendLeadTradingListUiStatus", "uiHideNumberFlag", "getUiHideNumberFlag", "fetchRecommendList", "", "leadTradingItemRequestEntity", "Lcom/kubi/copytrading/assets/LeadTradingItemRequestEntity;", "fetchCopyAssets", "fetchCopyPositions", "fetchLeadAssets", "fetchLeadPositions", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingViewModel.kt\ncom/kubi/copytrading/assets/CopyTradingViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,95:1\n135#2,2:96\n*S KotlinDebug\n*F\n+ 1 CopyTradingViewModel.kt\ncom/kubi/copytrading/assets/CopyTradingViewModel\n*L\n45#1:96,2\n*E\n"})
public final class CopyTradingViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f19808V = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.assets.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CopyTradingViewModel.m20646p();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<LeaderTraderAccountInfoEntity> f19809W = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f19810X = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Pair<Boolean, List<LeadTradingPositionEntity>>> f19811Y = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<CopyTradingCopyAssetEntity> f19812Z = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, List<CopyTradingTraderEntity>>> f19813a0 = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, List<LeadTradingItemEntity>>> f19814b0 = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f19815c0 = new MutableLiveData<>(Boolean.valueOf(C46392a.m102322d(IAssetsCenterService.f16464a.get().mo15354t(), false)));

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<Pair<Boolean, List<LeadTradingPositionEntity>>> m20647A() {
        return this.f19811Y;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<Pair<Boolean, List<LeadTradingItemEntity>>> m20648B() {
        return this.f19814b0;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final MutableLiveData<Boolean> m20649C() {
        return this.f19815c0;
    }

    /* JADX INFO: renamed from: q */
    public final void m20650q() {
        launchOnMain(new CopyTradingViewModel$fetchCopyAssets$1(this, null));
    }

    /* JADX INFO: renamed from: r */
    public final void m20651r() {
        launchOnMain(new CopyTradingViewModel$fetchCopyPositions$1(this, null));
    }

    /* JADX INFO: renamed from: s */
    public final void m20652s() {
        launchOnMain(new CopyTradingViewModel$fetchLeadAssets$1(this, null));
    }

    /* JADX INFO: renamed from: t */
    public final void m20653t() {
        launchOnMain(new CopyTradingViewModel$fetchLeadPositions$1(this, null));
    }

    /* JADX INFO: renamed from: u */
    public final void m20654u(@NotNull LeadTradingItemRequestEntity leadTradingItemRequestEntity) {
        Intrinsics.checkNotNullParameter(leadTradingItemRequestEntity, "leadTradingItemRequestEntity");
        launchOnMain(new CopyTradingViewModel$fetchRecommendList$1(this, leadTradingItemRequestEntity, null));
    }

    /* JADX INFO: renamed from: v */
    public final AssetsCopytdApi m20655v() {
        return (AssetsCopytdApi) this.f19808V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final MutableLiveData<CopyTradingCopyAssetEntity> m20656w() {
        return this.f19812Z;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final MutableLiveData<Pair<Boolean, List<CopyTradingTraderEntity>>> m20657x() {
        return this.f19813a0;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final MutableLiveData<LeaderTraderAccountInfoEntity> m20658y() {
        return this.f19809W;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final MutableLiveData<Boolean> m20659z() {
        return this.f19810X;
    }

    /* JADX INFO: renamed from: p */
    public static final AssetsCopytdApi m20646p() {
        return (AssetsCopytdApi) C42597a.m93388d().create(AssetsCopytdApi.class);
    }
}
