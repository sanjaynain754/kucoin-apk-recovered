package com.kubi.payment.p106rn;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.reflect.TypeToken;
import com.kubi.payment.fast.data.entities.FiatCouponInfo;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.payment.rn.KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$fromJsonOrNull$1 */
/* JADX INFO: compiled from: GsonUtils.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "com/kubi/utils/GsonUtils$fromJsonOrNull$5"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utils.GsonUtils$fromJsonOrNull$5", m90122f = "GsonUtils.kt", m90123i = {}, m90124l = {197}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJsonOrNull$5\n*L\n1#1,300:1\n*E\n"})
public final class C21353xf9af55e8 extends SuspendLambda implements Function2<InterfaceC41635f<? super FiatCouponInfo.Response>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $json;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.payment.rn.KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$fromJsonOrNull$1$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJsonOrNull$5$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJsonOrNull$5$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<FiatCouponInfo.Response> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21353xf9af55e8(String str, Continuation continuation) {
        super(2, continuation);
        this.$json = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C21353xf9af55e8 c21353xf9af55e8 = new C21353xf9af55e8(this.$json, continuation);
        c21353xf9af55e8.L$0 = obj;
        return c21353xf9af55e8;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41635f<? super FiatCouponInfo.Response> interfaceC41635f, @Nullable Continuation<? super Unit> continuation) {
        return ((C21353xf9af55e8) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
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
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            Object objM66914d = C27099x.m66914d(this.$json, new a().getType());
            this.label = 1;
            if (interfaceC41635f.emit(objM66914d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
