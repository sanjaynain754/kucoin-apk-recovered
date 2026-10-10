package com.kubi.spot.interceptor;

import android.os.Bundle;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.router.core.Router;
import id.C38519a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p311hf.C38184b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: FlashConvertInterceptor.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.interceptor.FlashConvertInterceptor$intercept$1", m90122f = "FlashConvertInterceptor.kt", m90123i = {1}, m90124l = {66, 68}, m90125m = "invokeSuspend", m90126n = {"correctParams"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nFlashConvertInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlashConvertInterceptor.kt\ncom/kubi/spot/interceptor/FlashConvertInterceptor$intercept$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,210:1\n23#2,2:211\n23#2,2:213\n75#2,2:215\n*S KotlinDebug\n*F\n+ 1 FlashConvertInterceptor.kt\ncom/kubi/spot/interceptor/FlashConvertInterceptor$intercept$1\n*L\n74#1:211,2\n80#1:213,2\n82#1:215,2\n*E\n"})
public final class FlashConvertInterceptor$intercept$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    Object L$0;
    int label;
    final /* synthetic */ FlashConvertInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashConvertInterceptor$intercept$1(FlashConvertInterceptor flashConvertInterceptor, Bundle bundle, Continuation<? super FlashConvertInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.this$0 = flashConvertInterceptor;
        this.$bundle = bundle;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashConvertInterceptor$intercept$1(this.this$0, this.$bundle, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FlashConvertInterceptor$intercept$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x005f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x009d, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        Pair pair;
        Boolean bool;
        boolean zBooleanValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    pair = (Pair) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                this.$bundle.putString("route", URLEncoder.encode("ConvertPage?from=" + ((String) pair.getFirst()) + "&to=" + ((String) pair.getSecond()), "UTF-8"));
                C46392a.m102333p(C38519a.f86479a.m87129d(), (String) pair.getFirst());
            } else {
                this.$bundle.putString("route", URLEncoder.encode("ConvertPage?from=BTC&to=" + C38184b.f85884a.m86146a(), "UTF-8"));
                C46392a.m102333p(C38519a.f86479a.m87129d(), "BTC");
            }
            C46392a.m102330m(C38519a.f86479a.m87130e(), System.currentTimeMillis());
            Router.f46192a.m56184f("krn/router").m4039b(this.this$0.m61867i(this.$bundle)).m4048k();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        FlashConvertInterceptor flashConvertInterceptor = this.this$0;
        this.label = 1;
        obj = flashConvertInterceptor.m61868j(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        Pair pair2 = (Pair) obj;
        InterfaceC41634e<Boolean> interfaceC41634eM89459e = this.this$0.m61870l().m89459e((String) pair2.getFirst());
        this.L$0 = pair2;
        this.label = 2;
        Object objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM89459e, this);
        if (objM42830k != coroutine_suspended) {
            pair = pair2;
            obj = objM42830k;
            bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                this.$bundle.putString("route", URLEncoder.encode("ConvertPage?from=" + ((String) pair.getFirst()) + "&to=" + ((String) pair.getSecond()), "UTF-8"));
                C46392a.m102333p(C38519a.f86479a.m87129d(), (String) pair.getFirst());
            } else {
                this.$bundle.putString("route", URLEncoder.encode("ConvertPage?from=BTC&to=" + C38184b.f85884a.m86146a(), "UTF-8"));
                C46392a.m102333p(C38519a.f86479a.m87129d(), "BTC");
            }
            C46392a.m102330m(C38519a.f86479a.m87130e(), System.currentTimeMillis());
            Router.f46192a.m56184f("krn/router").m4039b(this.this$0.m61867i(this.$bundle)).m4048k();
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
