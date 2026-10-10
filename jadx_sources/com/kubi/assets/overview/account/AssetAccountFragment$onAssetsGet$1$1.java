package com.kubi.assets.overview.account;

import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.exception.AssetsException;
import com.kubi.assets.overview.OverviewAnalyticsReporter;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetAccountFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.account.AssetAccountFragment$onAssetsGet$1$1", m90122f = "AssetAccountFragment.kt", m90123i = {0, 0}, m90124l = {271}, m90125m = "invokeSuspend", m90126n = {"currentTime", "elapsedTime"}, m90127s = {"J$0", "J$1"})
public final class AssetAccountFragment$onAssetsGet$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetV2OverviewEntity $myAssetEntity;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ AssetAccountFragment this$0;

    /* JADX INFO: renamed from: com.kubi.assets.overview.account.AssetAccountFragment$onAssetsGet$1$1$1 */
    /* JADX INFO: compiled from: AssetAccountFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.account.AssetAccountFragment$onAssetsGet$1$1$1", m90122f = "AssetAccountFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetAccountFragment.kt\ncom/kubi/assets/overview/account/AssetAccountFragment$onAssetsGet$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n*L\n1#1,360:1\n1#2:361\n44#3,2:362\n*S KotlinDebug\n*F\n+ 1 AssetAccountFragment.kt\ncom/kubi/assets/overview/account/AssetAccountFragment$onAssetsGet$1$1$1\n*L\n274#1:362,2\n*E\n"})
    public static final class C105981 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Result<? extends Unit>>, Object> {
        final /* synthetic */ AssetV2OverviewEntity $myAssetEntity;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(interfaceC41709m0, (Continuation<? super Result<Unit>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105981(AssetV2OverviewEntity assetV2OverviewEntity, Continuation<? super C105981> continuation) {
            super(2, continuation);
            this.$myAssetEntity = assetV2OverviewEntity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C105981(this.$myAssetEntity, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<Unit>> continuation) {
            return ((C105981) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM103844constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AssetV2OverviewEntity assetV2OverviewEntity = this.$myAssetEntity;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    OverviewAnalyticsReporter.f18247a.m18423u(assetV2OverviewEntity);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    C43846g.m96568c(new AssetsException(thM103847exceptionOrNullimpl, "buildTrackData", false, null, 8, null), null, 2, null);
                }
                return Result.m103843boximpl(objM103844constructorimpl);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetAccountFragment$onAssetsGet$1$1(AssetAccountFragment assetAccountFragment, AssetV2OverviewEntity assetV2OverviewEntity, Continuation<? super AssetAccountFragment$onAssetsGet$1$1> continuation) {
        super(2, continuation);
        this.this$0 = assetAccountFragment;
        this.$myAssetEntity = assetV2OverviewEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetAccountFragment$onAssetsGet$1$1(this.this$0, this.$myAssetEntity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetAccountFragment$onAssetsGet$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = jCurrentTimeMillis - this.this$0.f18229X;
            if (j11 >= 30000) {
                AbstractC41697j0 abstractC41697j0M94119a = C42911a.m94119a();
                C105981 c105981 = new C105981(this.$myAssetEntity, null);
                this.J$0 = jCurrentTimeMillis;
                this.J$1 = j11;
                this.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94119a, c105981, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        this.this$0.f18229X = System.currentTimeMillis();
        return Unit.INSTANCE;
    }
}
