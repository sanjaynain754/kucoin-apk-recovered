package com.kubi.mine.lib.p101ui;

import com.kubi.mine.lib.entity.NewcomerConfigEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import iq.InterfaceC40163e;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p319hq.InterfaceC38285b;
import p538pq.C43524d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MineViewModel.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/mine/lib/entity/NewcomerConfigEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3", m90122f = "MineViewModel.kt", m90123i = {}, m90124l = {142}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineViewModel.kt\ncom/kubi/mine/lib/ui/MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,205:1\n17#2,2:206\n*S KotlinDebug\n*F\n+ 1 MineViewModel.kt\ncom/kubi/mine/lib/ui/MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3\n*L\n140#1:206,2\n*E\n"})
public final class MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super NewcomerConfigEntity>, Object> {
    final /* synthetic */ InterfaceC38285b $api;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3(InterfaceC38285b interfaceC38285b, Continuation<? super MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3> continuation) {
        super(2, continuation);
        this.$api = interfaceC38285b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3(this.$api, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super NewcomerConfigEntity> continuation) {
        return ((MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zMo88520a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        String rewardCenterUri = null;
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (C43524d.m95780b()) {
                Object objM56186h = Router.f46192a.m56186h(InterfaceC40163e.class, SiteInfoManager.f47913a.m58109c());
                if (objM56186h != null) {
                    zMo88520a = ((InterfaceC40163e) objM56186h).mo88520a();
                } else {
                    zMo88520a = false;
                }
                if (zMo88520a) {
                    InterfaceC41634e<NewcomerConfigEntity> interfaceC41634eM86411d = this.$api.m86411d();
                    this.label = 1;
                    obj = RetrofitFlowExKt.m42826g(interfaceC41634eM86411d, false, null, this, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return null;
        }
        NewcomerConfigEntity newcomerConfigEntity = (NewcomerConfigEntity) ((C19334f) obj).m42846a();
        if (newcomerConfigEntity != null) {
            rewardCenterUri = newcomerConfigEntity.getRewardCenterUri();
        }
        if (rewardCenterUri == null) {
            rewardCenterUri = "";
        }
        if (rewardCenterUri.length() > 0) {
            z11 = true;
        }
        C43524d.m95786h(z11);
        return newcomerConfigEntity;
    }
}
