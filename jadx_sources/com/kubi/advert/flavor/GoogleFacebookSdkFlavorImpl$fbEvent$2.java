package com.kubi.advert.flavor;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C5501a;
import com.facebook.appevents.AppEventsLogger;
import com.kubi.router.utils.C23636b;
import com.kubi.sdk.BaseApplication;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43840a;
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

/* JADX INFO: compiled from: GoogleFacebookSdkFlavorImpl.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.advert.flavor.GoogleFacebookSdkFlavorImpl$fbEvent$2", m90122f = "GoogleFacebookSdkFlavorImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGoogleFacebookSdkFlavorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleFacebookSdkFlavorImpl.kt\ncom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$fbEvent$2\n+ 2 AdvertEx.kt\ncom/kubi/advert/AdvertExKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,85:1\n40#2,3:86\n40#2,3:91\n216#3,2:89\n*S KotlinDebug\n*F\n+ 1 GoogleFacebookSdkFlavorImpl.kt\ncom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$fbEvent$2\n*L\n64#1:86,3\n72#1:91,3\n69#1:89,2\n*E\n"})
public final class GoogleFacebookSdkFlavorImpl$fbEvent$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $eventName;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ GoogleFacebookSdkFlavorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleFacebookSdkFlavorImpl$fbEvent$2(GoogleFacebookSdkFlavorImpl googleFacebookSdkFlavorImpl, String str, Map<String, String> map, Continuation<? super GoogleFacebookSdkFlavorImpl$fbEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = googleFacebookSdkFlavorImpl;
        this.$eventName = str;
        this.$params = map;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleFacebookSdkFlavorImpl$fbEvent$2(this.this$0, this.$eventName, this.$params, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GoogleFacebookSdkFlavorImpl$fbEvent$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!C5501a.m7768D()) {
                C43840a.m96550d("FacebookSdk not initialized", "GoogleFacebookSdkFlavorImpl");
                C44128b.m97266j("GoogleFacebookSdkFlavorImpl", "FacebookSdk not initialized");
                return Unit.INSTANCE;
            }
            Context contextM56289c = C23636b.m56289c();
            if (contextM56289c == null) {
                contextM56289c = BaseApplication.INSTANCE.get();
            }
            Bundle bundleM14776d = this.this$0.m14776d();
            for (Map.Entry<String, String> entry : this.$params.entrySet()) {
                bundleM14776d.putString(entry.getKey(), entry.getValue());
            }
            AppEventsLogger.INSTANCE.newLogger(contextM56289c).m7841b(this.$eventName, bundleM14776d);
            String str = this.$eventName + ": " + bundleM14776d;
            C43840a.m96550d(str, "GoogleFacebookSdkFlavorImpl");
            C44128b.m97266j("GoogleFacebookSdkFlavorImpl", str);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
