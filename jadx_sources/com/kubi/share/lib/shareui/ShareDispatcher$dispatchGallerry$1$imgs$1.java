package com.kubi.share.lib.shareui;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.share.api.GalleryShareParam;
import com.kubi.share.lib.entity.ShareGalleryEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import y10.InterfaceC46364a;

/* JADX INFO: compiled from: ShareDispatcher.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/share/lib/entity/ShareGalleryEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.shareui.ShareDispatcher$dispatchGallerry$1$imgs$1", m90122f = "ShareDispatcher.kt", m90123i = {}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ShareDispatcher$dispatchGallerry$1$imgs$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends ShareGalleryEntity>>, Object> {
    final /* synthetic */ GalleryShareParam $param;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends ShareGalleryEntity>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<ShareGalleryEntity>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDispatcher$dispatchGallerry$1$imgs$1(GalleryShareParam galleryShareParam, Continuation<? super ShareDispatcher$dispatchGallerry$1$imgs$1> continuation) {
        super(2, continuation);
        this.$param = galleryShareParam;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareDispatcher$dispatchGallerry$1$imgs$1(this.$param, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<ShareGalleryEntity>> continuation) {
        return ((ShareDispatcher$dispatchGallerry$1$imgs$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41634e<List<ShareGalleryEntity>> interfaceC41634eM102252b = ((InterfaceC46364a) RetrofitFlowExKt.m42820a(InterfaceC46364a.class)).m102252b(this.$param.getGalleryType());
        this.label = 1;
        Object objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM102252b, this);
        if (objM42830k == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM42830k;
    }
}
