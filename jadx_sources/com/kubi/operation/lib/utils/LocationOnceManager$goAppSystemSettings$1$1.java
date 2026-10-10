package com.kubi.operation.lib.utils;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5264d;
import com.kubi.operation.lib.exception.OperationException;
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
import ro.C44128b;

/* JADX INFO: compiled from: LocationOnceManager.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.utils.LocationOnceManager$goAppSystemSettings$1$1", m90122f = "LocationOnceManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nLocationOnceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationOnceManager.kt\ncom/kubi/operation/lib/utils/LocationOnceManager$goAppSystemSettings$1$1\n+ 2 OperationIssue.kt\ncom/kubi/operation/lib/exception/OperationIssueKt\n*L\n1#1,180:1\n45#2,2:181\n*S KotlinDebug\n*F\n+ 1 LocationOnceManager.kt\ncom/kubi/operation/lib/utils/LocationOnceManager$goAppSystemSettings$1$1\n*L\n163#1:181,2\n*E\n"})
public final class LocationOnceManager$goAppSystemSettings$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationOnceManager$goAppSystemSettings$1$1(FragmentActivity fragmentActivity, Continuation<? super LocationOnceManager$goAppSystemSettings$1$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocationOnceManager$goAppSystemSettings$1$1(this.$activity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LocationOnceManager$goAppSystemSettings$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                C5264d.m6170p();
            } catch (Exception e11) {
                C44128b.m97263g("LocationOnceManager", e11);
                try {
                    Intent intent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
                    intent.addFlags(268435456);
                    this.$activity.startActivity(intent);
                } catch (Throwable th2) {
                    C43846g.m96568c(new OperationException(th2, "LocationOnceManager", false, null, 8, null), null, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
