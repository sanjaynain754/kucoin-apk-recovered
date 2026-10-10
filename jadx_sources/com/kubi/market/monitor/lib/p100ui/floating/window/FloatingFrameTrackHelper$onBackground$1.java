package com.kubi.market.monitor.lib.p100ui.floating.window;

import aq.C4373b;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FloatingFrameTrackHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingFrameTrackHelper$onBackground$1", m90122f = "FloatingFrameTrackHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FloatingFrameTrackHelper$onBackground$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    /* synthetic */ int I$0;
    int label;

    public final Object invoke(int i11, Continuation<? super Unit> continuation) {
        return ((FloatingFrameTrackHelper$onBackground$1) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingFrameTrackHelper$onBackground$1(String str, Continuation<? super FloatingFrameTrackHelper$onBackground$1> continuation) {
        super(2, continuation);
        this.$id = str;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m41036f(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put("allItemAmount", 60);
        jSONObject.put("clickPosition", str);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FloatingFrameTrackHelper$onBackground$1 floatingFrameTrackHelper$onBackground$1 = new FloatingFrameTrackHelper$onBackground$1(this.$id, continuation);
        floatingFrameTrackHelper$onBackground$1.I$0 = ((Number) obj).intValue();
        return floatingFrameTrackHelper$onBackground$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i11 = this.I$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (i11 > 0) {
            final String str = this.$id;
            C4373b.m3910l("B1window", "2", null, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.h1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FloatingFrameTrackHelper$onBackground$1.m41036f(str, (JSONObject) obj2);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }
}
