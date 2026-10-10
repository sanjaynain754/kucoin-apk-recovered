package com.kubi.applet;

import com.kubi.home.api.entity.HomeQuickAccessEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AppletService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.applet.AppletService$showAppletAddDialog$2$1", m90122f = "AppletService.kt", m90123i = {}, m90124l = {414}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AppletService$showAppletAddDialog$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeQuickAccessEntity $homeNavigation;
    final /* synthetic */ boolean $isReplace;
    final /* synthetic */ String $replaceId;
    int label;
    final /* synthetic */ AppletService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppletService$showAppletAddDialog$2$1(AppletService appletService, HomeQuickAccessEntity homeQuickAccessEntity, String str, boolean z11, Continuation<? super AppletService$showAppletAddDialog$2$1> continuation) {
        super(2, continuation);
        this.this$0 = appletService;
        this.$homeNavigation = homeQuickAccessEntity;
        this.$replaceId = str;
        this.$isReplace = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppletService$showAppletAddDialog$2$1(this.this$0, this.$homeNavigation, this.$replaceId, this.$isReplace, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AppletService$showAppletAddDialog$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AppletService appletService = this.this$0;
            HomeQuickAccessEntity homeQuickAccessEntity = this.$homeNavigation;
            String str = this.$replaceId;
            boolean z11 = this.$isReplace;
            this.label = 1;
            if (appletService.m15064G(homeQuickAccessEntity, str, z11, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
