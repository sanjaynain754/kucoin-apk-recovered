package com.kubi.sdk.pkg.util;

import android.graphics.Bitmap;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: WhiteCheckTool.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/util/WhiteCheckTool$a;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/util/WhiteCheckTool$a;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.util.WhiteCheckTool$calculateRate$2", m90122f = "WhiteCheckTool.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WhiteCheckTool$calculateRate$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super WhiteCheckTool.C23981a>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;
    final /* synthetic */ WhiteCheckTool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteCheckTool$calculateRate$2(WhiteCheckTool whiteCheckTool, Bitmap bitmap, Continuation<? super WhiteCheckTool$calculateRate$2> continuation) {
        super(2, continuation);
        this.this$0 = whiteCheckTool;
        this.$bitmap = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WhiteCheckTool$calculateRate$2(this.this$0, this.$bitmap, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super WhiteCheckTool.C23981a> continuation) {
        return ((WhiteCheckTool$calculateRate$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            final Ref.IntRef intRef2 = new Ref.IntRef();
            this.this$0.m57858e(this.$bitmap, new Function1<Integer, Unit>() { // from class: com.kubi.sdk.pkg.util.WhiteCheckTool$calculateRate$2.1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(int i11) {
                    Ref.IntRef intRef3 = intRef2;
                    if (intRef3.element == 0) {
                        intRef.element = i11;
                        intRef3.element = 1;
                    }
                    if (intRef.element == i11) {
                        intRef3.element++;
                    } else {
                        intRef3.element--;
                    }
                }
            });
            final Ref.IntRef intRef3 = new Ref.IntRef();
            this.this$0.m57858e(this.$bitmap, new Function1<Integer, Unit>() { // from class: com.kubi.sdk.pkg.util.WhiteCheckTool$calculateRate$2.2
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(int i11) {
                    if (intRef.element == i11) {
                        intRef3.element++;
                    }
                }
            });
            return new WhiteCheckTool.C23981a(intRef.element, (intRef3.element * 100.0f) / (this.$bitmap.getWidth() * this.$bitmap.getHeight()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
