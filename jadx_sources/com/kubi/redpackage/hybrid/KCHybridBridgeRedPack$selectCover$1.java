package com.kubi.redpackage.hybrid;

import android.content.Intent;
import com.kubi.redpackage.exception.RedPkgException;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeRedPackCoverData;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCHybridBridgeRedPack.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.redpackage.hybrid.KCHybridBridgeRedPack$selectCover$1", m90122f = "KCHybridBridgeRedPack.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCHybridBridgeRedPack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeRedPack.kt\ncom/kubi/redpackage/hybrid/KCHybridBridgeRedPack$selectCover$1\n+ 2 RedPackageIssue.kt\ncom/kubi/redpackage/exception/RedPackageIssueKt\n*L\n1#1,81:1\n44#2,2:82\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeRedPack.kt\ncom/kubi/redpackage/hybrid/KCHybridBridgeRedPack$selectCover$1\n*L\n76#1:82,2\n*E\n"})
public final class KCHybridBridgeRedPack$selectCover$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ KCHybridBridgeRedPackCoverData $coverData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCHybridBridgeRedPack$selectCover$1(BaseActivity baseActivity, KCHybridBridgeRedPackCoverData kCHybridBridgeRedPackCoverData, Continuation<? super KCHybridBridgeRedPack$selectCover$1> continuation) {
        super(2, continuation);
        this.$activity = baseActivity;
        this.$coverData = kCHybridBridgeRedPackCoverData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeRedPack$selectCover$1(this.$activity, this.$coverData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeRedPack$selectCover$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                BaseActivity baseActivity = this.$activity;
                Intent intent = new Intent();
                KCHybridBridgeRedPackCoverData kCHybridBridgeRedPackCoverData = this.$coverData;
                intent.putExtra("id", kCHybridBridgeRedPackCoverData.getExtendId());
                intent.putExtra("name", kCHybridBridgeRedPackCoverData.getExtendName());
                Unit unit = Unit.INSTANCE;
                baseActivity.setResult(100, intent);
                this.$activity.finish();
            } catch (Throwable th2) {
                C43846g.m96568c(new RedPkgException(th2, "KCHybridBridgeRedPack", false, null, 8, null), null, 2, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
