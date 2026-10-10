package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Simple.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0094@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0094@¢\u0006\u0004\b\u0012\u0010\rR\u001a\u0010\u0018\u001a\u00020\u00138\u0014X\u0094D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/mvi/state/SingleThreadVM;", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/l;", "<init>", "()V", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onFirstShow", "Lcom/kubi/mvi/state/d;", "intent", "dispatchIntent", "(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "o", "n", "", "q", "", ExifInterface.LONGITUDE_WEST, "I", "getDefaultThreadMode", "()I", "defaultThreadMode", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class SingleThreadVM<S extends InterfaceC19284f> extends AbstractC19290l<S> {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final int defaultThreadMode = 2;

    /* JADX INFO: renamed from: com.kubi.mvi.state.SingleThreadVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: Simple.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mvi.state.SingleThreadVM", m90122f = "Simple.kt", m90123i = {0, 0}, m90124l = {98, 99}, m90125m = "dispatchIntent$suspendImpl", m90126n = {"$this", "intent"}, m90127s = {"L$0", "L$1"})
    public static final class C192721<S extends InterfaceC19284f> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleThreadVM<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192721(SingleThreadVM<S> singleThreadVM, Continuation<? super C192721> continuation) {
            super(continuation);
            this.this$0 = singleThreadVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleThreadVM.m42582b(this.this$0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (super.dispatchIntent(r6, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <S extends InterfaceC19284f> Object m42582b(SingleThreadVM<S> singleThreadVM, InterfaceC19282d interfaceC19282d, Continuation<? super Unit> continuation) {
        C192721 c192721;
        if (continuation instanceof C192721) {
            c192721 = (C192721) continuation;
            int i11 = c192721.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c192721.label = i11 - Integer.MIN_VALUE;
            } else {
                c192721 = new C192721(singleThreadVM, continuation);
            }
        } else {
            c192721 = new C192721(singleThreadVM, continuation);
        }
        Object objM42586q = c192721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c192721.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42586q);
            c192721.L$0 = singleThreadVM;
            c192721.L$1 = interfaceC19282d;
            c192721.label = 1;
            objM42586q = singleThreadVM.m42586q(interfaceC19282d, c192721);
            if (objM42586q != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c192721.L$1;
            singleThreadVM = (SingleThreadVM) c192721.L$0;
            ResultKt.throwOnFailure(objM42586q);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42586q);
        }
        return Unit.INSTANCE;
        if (((Boolean) objM42586q).booleanValue()) {
            return Unit.INSTANCE;
        }
        c192721.L$0 = null;
        c192721.L$1 = null;
        c192721.label = 2;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ <S extends InterfaceC19284f> Object m42583r(SingleThreadVM<S> singleThreadVM, InterfaceC19282d interfaceC19282d, Continuation<? super Boolean> continuation) {
        boolean z11 = true;
        if (Intrinsics.areEqual(interfaceC19282d, OnShowIntent.INSTANCE)) {
            singleThreadVM.mo40864p();
        } else if (Intrinsics.areEqual(interfaceC19282d, OnHideIntent.INSTANCE)) {
            singleThreadVM.m42585o();
        } else if (Intrinsics.areEqual(interfaceC19282d, OnFirstShowIntent.INSTANCE)) {
            singleThreadVM.m42584n();
        } else {
            z11 = false;
        }
        return Boxing.boxBoolean(z11);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    public int getDefaultThreadMode() {
        return this.defaultThreadMode;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        return m42582b(this, interfaceC19282d, continuation);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onFirstShow() {
        super.onFirstShow();
        send(OnFirstShowIntent.INSTANCE);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        send(OnHideIntent.INSTANCE);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        send(OnShowIntent.INSTANCE);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public Object m42586q(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Boolean> continuation) {
        return m42583r(this, interfaceC19282d, continuation);
    }

    /* JADX INFO: renamed from: n */
    public void m42584n() {
    }

    /* JADX INFO: renamed from: o */
    public void m42585o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo40864p() {
    }
}
