package com.kubi.kumex.flutter;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.flutter.widget.kline.KLineConverter;
import com.kubi.flutter.widget.kline.KLineType;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.core.C27030d;
import f00.C37304a;
import g00.InterfaceC37752d;
import g00.InterfaceC37756h;
import g00.InterfaceC37762n;
import gf.C37878b0;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeKLineCallImpl.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.flutter.KCFlutterBridgeKLineCallImpl$jumpBsOrder$1", m90122f = "KCFlutterBridgeKLineCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeKLineCallImpl$jumpBsOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $klineType;
    final /* synthetic */ Map<String, Object> $parameters;
    final /* synthetic */ String $symbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeKLineCallImpl$jumpBsOrder$1(String str, String str2, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Map<String, ? extends Object> map, Continuation<? super KCFlutterBridgeKLineCallImpl$jumpBsOrder$1> continuation) {
        super(2, continuation);
        this.$klineType = str;
        this.$symbol = str2;
        this.$callback = function2;
        this.$parameters = map;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeKLineCallImpl$jumpBsOrder$1(this.$klineType, this.$symbol, this.$callback, this.$parameters, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeKLineCallImpl$jumpBsOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        long time;
        long jMin;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str2 = this.$klineType;
        int iHashCode = str2.hashCode();
        if (iHashCode != -1081309778) {
            if (iHashCode != -503567600) {
                if (iHashCode == 3537154 && str2.equals(SearchCategory$Companion.SPOT)) {
                    InterfaceC37762n.a.m85178b(C37304a.f82764a, Boxing.boxLong(0L), Boxing.boxLong(2L), this.$symbol, null, null, null, 56, null);
                    this.$callback.invoke(Boxing.boxBoolean(true), null);
                }
            } else if (str2.equals(SearchCategory$Companion.FUTURES)) {
                KLineType kLineTypeM24353a = KLineConverter.f22477a.m24353a(C37878b0.f85252a.m85523d());
                Object obj2 = this.$parameters.get("time");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Number");
                long jLongValue = ((Number) obj2).longValue();
                int period = kLineTypeM24353a.getPeriod();
                KLineType.Companion companion = KLineType.f22375e;
                if (period >= companion.getONE_DAY().getPeriod()) {
                    time = jLongValue * ((long) 1000);
                    jMin = Math.min(System.currentTimeMillis(), (((long) (kLineTypeM24353a.getPeriod() * 1000)) + time) - 1);
                } else {
                    time = TimeUtils.m66431r(C27030d.m66607a(jLongValue * ((long) 1000), "yyyy-MM-dd")).getTime();
                    jMin = Math.min(System.currentTimeMillis(), (((long) (companion.getONE_DAY().getPeriod() * 1000)) + time) - 1);
                }
                InterfaceC37752d.a.m85125d(C37304a.f82764a, this.$symbol, Boxing.boxLong(1L), Boxing.boxLong(time), Boxing.boxLong(jMin), null, null, null, 112, null);
                this.$callback.invoke(Boxing.boxBoolean(true), null);
            }
        } else if (str2.equals(ViewProps.MARGIN)) {
            Object obj3 = this.$parameters.get("side");
            if (Intrinsics.areEqual(obj3, Boxing.boxInt(0))) {
                str = "buy";
            } else {
                str = Intrinsics.areEqual(obj3, Boxing.boxInt(1)) ? "sell" : "";
            }
            String str3 = str;
            C37304a c37304a = C37304a.f82764a;
            String str4 = Intrinsics.areEqual(this.$parameters.get("bizType"), Boxing.boxInt(2)) ? "isolated" : "cross";
            Long lBoxLong = Boxing.boxLong(2L);
            String str5 = this.$symbol;
            InterfaceC37756h.a.m85146d(c37304a, str4, lBoxLong, str5, str5, str3, null, null, null, 224, null);
            this.$callback.invoke(Boxing.boxBoolean(true), null);
        }
        this.$callback.invoke(Boxing.boxBoolean(false), null);
        return Unit.INSTANCE;
    }
}
