package com.kubi.sdk.flutter.protocol;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.List;
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

/* JADX INFO: compiled from: KCFlutterBridgeBasicCallImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.flutter.protocol.KCFlutterBridgeBasicCallImpl$showBottomSheetDialog$1", m90122f = "KCFlutterBridgeBasicCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeBasicCallImpl$showBottomSheetDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Long, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ List<SelectEntity> $items;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeBasicCallImpl$showBottomSheetDialog$1(List<SelectEntity> list, Context context, Function2<? super Long, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeBasicCallImpl$showBottomSheetDialog$1> continuation) {
        super(2, continuation);
        this.$items = list;
        this.$ctx = context;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeBasicCallImpl$showBottomSheetDialog$1(this.$items, this.$ctx, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeBasicCallImpl$showBottomSheetDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m56890f(Function2 function2, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        function2.invoke(Long.valueOf(baseViewHolder.getBindingAdapterPosition()), null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
            List<SelectEntity> list = this.$items;
            final Function2<Long, ProtocolException, Unit> function2 = this.$callback;
            DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, list, new BiConsumer() { // from class: com.kubi.sdk.flutter.protocol.b
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    KCFlutterBridgeBasicCallImpl$showBottomSheetDialog$1.m56890f(function2, (BaseViewHolder) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
                }
            }, false, null, null, false, 60, null);
            FragmentManager supportFragmentManager = ((FragmentActivity) this.$ctx).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            dialogFragmentHelperM58944B.show(supportFragmentManager, "flutter_knb_bottom_sheet_selector");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
