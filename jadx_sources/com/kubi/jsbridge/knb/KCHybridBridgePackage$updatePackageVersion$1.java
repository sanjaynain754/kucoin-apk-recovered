package com.kubi.jsbridge.knb;

import android.content.Context;
import com.kubi.sdk.pkg.hybird.HybridPackageManager;
import com.kubi.web.api.IWebService;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: KCHybridBridgePackage.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.knb.KCHybridBridgePackage$updatePackageVersion$1", m90122f = "KCHybridBridgePackage.kt", m90123i = {}, m90124l = {45, 48, 50}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCHybridBridgePackage$updatePackageVersion$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $packageName;
    final /* synthetic */ String $version;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCHybridBridgePackage$updatePackageVersion$1(String str, String str2, Context context, Continuation<? super KCHybridBridgePackage$updatePackageVersion$1> continuation) {
        super(2, continuation);
        this.$packageName = str;
        this.$version = str2;
        this.$ctx = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgePackage$updatePackageVersion$1(this.$packageName, this.$version, this.$ctx, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgePackage$updatePackageVersion$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r8 == r0) goto L26;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                        ((Boolean) obj).getClass();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Boolean) obj).getClass();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            IWebService iWebService = IWebService.f54644a.get();
            this.label = 1;
            if (iWebService.mo36739b(true, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        C44128b.m97266j("KCHybridBridgePackage", "updateOfflinePackage " + this.$packageName + ' ' + this.$version + ' ');
        String str = this.$packageName;
        if (str != null && str.length() != 0) {
            HybridPackageManager hybridPackageManager = HybridPackageManager.f47391a;
            Context context = this.$ctx;
            String str2 = this.$packageName;
            this.label = 2;
            obj = hybridPackageManager.m57719j(context, str2, this);
        } else {
            HybridPackageManager hybridPackageManager2 = HybridPackageManager.f47391a;
            Context context2 = this.$ctx;
            this.label = 3;
            obj = HybridPackageManager.m57713n(hybridPackageManager2, context2, 0, this, 2, null);
        }
        return coroutine_suspended;
    }
}
