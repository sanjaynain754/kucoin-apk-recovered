package com.kubi.share.lib.flutter;

import android.graphics.Bitmap;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import z10.C46646a;

/* JADX INFO: compiled from: KCFlutterBridgeShareCallImpl.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.flutter.KCFlutterBridgeShareCallImpl$shareImg$1", m90122f = "KCFlutterBridgeShareCallImpl.kt", m90123i = {}, m90124l = {74}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCFlutterBridgeShareCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeShareCallImpl.kt\ncom/kubi/share/lib/flutter/KCFlutterBridgeShareCallImpl$shareImg$1\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,144:1\n45#2,4:145\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeShareCallImpl.kt\ncom/kubi/share/lib/flutter/KCFlutterBridgeShareCallImpl$shareImg$1\n*L\n86#1:145,4\n*E\n"})
public final class KCFlutterBridgeShareCallImpl$shareImg$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $imageData;
    final /* synthetic */ boolean $needQrCode;
    final /* synthetic */ boolean $onlyDarkMode;
    final /* synthetic */ String $shareLink;
    final /* synthetic */ String $utmSource;
    int label;
    final /* synthetic */ KCFlutterBridgeShareCallImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeShareCallImpl$shareImg$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, KCFlutterBridgeShareCallImpl kCFlutterBridgeShareCallImpl, String str2, boolean z11, String str3, boolean z12, Continuation<? super KCFlutterBridgeShareCallImpl$shareImg$1> continuation) {
        super(2, continuation);
        this.$utmSource = str;
        this.$callback = function2;
        this.this$0 = kCFlutterBridgeShareCallImpl;
        this.$imageData = str2;
        this.$needQrCode = z11;
        this.$shareLink = str3;
        this.$onlyDarkMode = z12;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeShareCallImpl$shareImg$1(this.$utmSource, this.$callback, this.this$0, this.$imageData, this.$needQrCode, this.$shareLink, this.$onlyDarkMode, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeShareCallImpl$shareImg$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM91049g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                KCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1 kCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1 = new KCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1(this.this$0, this.$imageData, null);
                this.label = 1;
                objM91049g = C41686h.m91049g(abstractC41697j0M94120b, kCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1, this);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM91049g = obj;
            }
            IShareService iShareService = IShareService.f49268a.get();
            ImageShareParam imageShareParam = new ImageShareParam(this.$utmSource, null, false, null, false, null, null, null, null, null, 1022, null);
            boolean z11 = this.$needQrCode;
            String str = this.$shareLink;
            boolean z12 = this.$onlyDarkMode;
            imageShareParam.setBitmap((Bitmap) objM91049g);
            imageShareParam.setNeedQrCode(z11);
            if (str != null && str.length() != 0) {
                imageShareParam.setQrCodeUrl(str);
            }
            imageShareParam.setOnlyDarkMode(z12);
            final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
            iShareService.mo40f(imageShareParam, new Function1() { // from class: com.kubi.share.lib.flutter.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCFlutterBridgeShareCallImpl$shareImg$1.m59652f(function2, ((Boolean) obj2).booleanValue());
                }
            });
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C46646a.m102888b(th2, "KCFlutterBridgeShareCal");
            }
            this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m59652f(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }
}
