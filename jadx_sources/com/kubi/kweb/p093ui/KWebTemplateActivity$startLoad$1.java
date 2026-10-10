package com.kubi.kweb.p093ui;

import android.widget.ImageView;
import com.kubi.kweb.R$mipmap;
import com.kubi.utils.extensions.C27046k;
import com.kubi.widget.web.ui.KWebContainer;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KWebTemplateActivity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kweb.ui.KWebTemplateActivity$startLoad$1", m90122f = "KWebTemplateActivity.kt", m90123i = {}, m90124l = {54}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KWebTemplateActivity$startLoad$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ KWebTemplateActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebTemplateActivity$startLoad$1(KWebTemplateActivity kWebTemplateActivity, String str, Continuation<? super KWebTemplateActivity$startLoad$1> continuation) {
        super(2, continuation);
        this.this$0 = kWebTemplateActivity;
        this.$path = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KWebTemplateActivity$startLoad$1(this.this$0, this.$path, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KWebTemplateActivity$startLoad$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            KWebContainer kWebContainerM67451l0 = this.this$0.m67451l0();
            KWebTemplateActivity$startLoad$1$success$1 kWebTemplateActivity$startLoad$1$success$1 = new KWebTemplateActivity$startLoad$1$success$1(this.this$0, this.$path, null);
            this.label = 1;
            obj = kWebContainerM67451l0.m67476B(kWebTemplateActivity$startLoad$1$success$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ImageView rightThree = this.this$0.getNavigationBar().getRightThree();
            Intrinsics.checkNotNullExpressionValue(rightThree, "getRightThree(...)");
            C27046k.m66685H(rightThree);
            this.this$0.getNavigationBar().getRightThree().setImageResource(R$mipmap.ic_share);
        }
        return Unit.INSTANCE;
    }
}
