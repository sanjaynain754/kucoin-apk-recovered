package com.kubi.operation.lib.widgets.newuser.helper;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.media3.p022ui.PlayerView;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import java.io.File;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewUserWidgetVideoHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.newuser.helper.NewUserWidgetVideoHelper$downloadAndPlay$1$1", m90122f = "NewUserWidgetVideoHelper.kt", m90123i = {}, m90124l = {79}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NewUserWidgetVideoHelper$downloadAndPlay$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    final /* synthetic */ ViewStub $viewStub;
    Object L$0;
    int label;
    final /* synthetic */ NewUserWidgetVideoHelper this$0;

    /* JADX INFO: renamed from: com.kubi.operation.lib.widgets.newuser.helper.NewUserWidgetVideoHelper$downloadAndPlay$1$1$1 */
    /* JADX INFO: compiled from: NewUserWidgetVideoHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.newuser.helper.NewUserWidgetVideoHelper$downloadAndPlay$1$1$1", m90122f = "NewUserWidgetVideoHelper.kt", m90123i = {}, m90124l = {79}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C195911 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super File>, Object> {
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ NewUserWidgetVideoHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195911(NewUserWidgetVideoHelper newUserWidgetVideoHelper, String str, Continuation<? super C195911> continuation) {
            super(2, continuation);
            this.this$0 = newUserWidgetVideoHelper;
            this.$url = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C195911(this.this$0, this.$url, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super File> continuation) {
            return ((C195911) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            NewUserWidgetVideoHelper newUserWidgetVideoHelper = this.this$0;
            String str = this.$url;
            this.label = 1;
            Object objM43774s = newUserWidgetVideoHelper.m43774s(str, this);
            if (objM43774s == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objM43774s;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserWidgetVideoHelper$downloadAndPlay$1$1(NewUserWidgetVideoHelper newUserWidgetVideoHelper, ViewStub viewStub, String str, Continuation<? super NewUserWidgetVideoHelper$downloadAndPlay$1$1> continuation) {
        super(2, continuation);
        this.this$0 = newUserWidgetVideoHelper;
        this.$viewStub = viewStub;
        this.$url = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewUserWidgetVideoHelper$downloadAndPlay$1$1(this.this$0, this.$viewStub, this.$url, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NewUserWidgetVideoHelper$downloadAndPlay$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NewUserWidgetVideoHelper newUserWidgetVideoHelper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                newUserWidgetVideoHelper = (NewUserWidgetVideoHelper) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.m43775u(this.$viewStub)) {
                return Unit.INSTANCE;
            }
            NewUserWidgetVideoHelper newUserWidgetVideoHelper2 = this.this$0;
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C195911 c195911 = new C195911(this.this$0, this.$url, null);
            this.L$0 = newUserWidgetVideoHelper2;
            this.label = 1;
            Object objM91049g = C41686h.m91049g(abstractC41697j0M94120b, c195911, this);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
            newUserWidgetVideoHelper = newUserWidgetVideoHelper2;
            obj = objM91049g;
        }
        newUserWidgetVideoHelper.f36926a = (File) obj;
        File file = this.this$0.f36926a;
        if (file == null) {
            return Unit.INSTANCE;
        }
        if (this.this$0.m43775u(this.$viewStub)) {
            return Unit.INSTANCE;
        }
        this.$viewStub.setLayoutResource(R$layout.operation_widget_newuser_video);
        View viewInflate = this.$viewStub.inflate();
        PlayerView playerView = (PlayerView) viewInflate.findViewById(R$id.playerView);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.ivPlaceholder);
        NewUserWidgetVideoHelper newUserWidgetVideoHelper3 = this.this$0;
        Intrinsics.checkNotNull(playerView);
        Intrinsics.checkNotNull(imageView);
        newUserWidgetVideoHelper3.m43771B(file, playerView, imageView);
        return Unit.INSTANCE;
    }
}
