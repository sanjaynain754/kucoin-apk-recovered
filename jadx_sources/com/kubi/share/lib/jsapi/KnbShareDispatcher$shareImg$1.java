package com.kubi.share.lib.jsapi;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.C5290q;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: compiled from: KnbShareDispatcher.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.jsapi.KnbShareDispatcher$shareImg$1", m90122f = "KnbShareDispatcher.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKnbShareDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KnbShareDispatcher.kt\ncom/kubi/share/lib/jsapi/KnbShareDispatcher$shareImg$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,165:1\n1#2:166\n45#3,4:167\n*S KotlinDebug\n*F\n+ 1 KnbShareDispatcher.kt\ncom/kubi/share/lib/jsapi/KnbShareDispatcher$shareImg$1\n*L\n85#1:167,4\n*E\n"})
public final class KnbShareDispatcher$shareImg$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $allowCustomInviteLink;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ boolean $needQrCode;
    final /* synthetic */ boolean $onlyDarkMode;
    final /* synthetic */ String $pic;
    final /* synthetic */ String $qrCodeUrl;
    final /* synthetic */ String $rcode;
    final /* synthetic */ String $utmSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KnbShareDispatcher$shareImg$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, String str2, boolean z11, String str3, boolean z12, String str4, boolean z13, Continuation<? super KnbShareDispatcher$shareImg$1> continuation) {
        super(2, continuation);
        this.$pic = str;
        this.$callback = function2;
        this.$utmSource = str2;
        this.$needQrCode = z11;
        this.$qrCodeUrl = str3;
        this.$onlyDarkMode = z12;
        this.$rcode = str4;
        this.$allowCustomInviteLink = z13;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KnbShareDispatcher$shareImg$1(this.$pic, this.$callback, this.$utmSource, this.$needQrCode, this.$qrCodeUrl, this.$onlyDarkMode, this.$rcode, this.$allowCustomInviteLink, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KnbShareDispatcher$shareImg$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            String str = this.$pic;
            byte[] bArrM59680a = str != null ? KnbShareDispatcher.f49370a.m59680a(str) : null;
            if (bArrM59680a != null && bArrM59680a.length == 0) {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("invalid image data", null, null, false, 14, null));
                return Unit.INSTANCE;
            }
            Bitmap bitmapM6355f = C5290q.m6355f(bArrM59680a, 0);
            if (bitmapM6355f == null) {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("invalid image data", null, null, false, 14, null));
                return Unit.INSTANCE;
            }
            IShareService iShareService = IShareService.f49268a.get();
            ImageShareParam imageShareParam = new ImageShareParam(this.$utmSource, null, false, null, false, null, null, null, null, null, 1022, null);
            boolean z11 = this.$needQrCode;
            String str2 = this.$qrCodeUrl;
            boolean z12 = this.$onlyDarkMode;
            String str3 = this.$rcode;
            boolean z13 = this.$allowCustomInviteLink;
            imageShareParam.setBitmap(bitmapM6355f);
            imageShareParam.setNeedQrCode(z11);
            if (str2 != null && str2.length() != 0) {
                imageShareParam.setQrCodeUrl(str2);
            }
            imageShareParam.setOnlyDarkMode(z12);
            imageShareParam.setRcode(str3);
            imageShareParam.setSupportModifyLink(Boxing.boxBoolean(z13));
            final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
            iShareService.mo40f(imageShareParam, new Function1() { // from class: com.kubi.share.lib.jsapi.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KnbShareDispatcher$shareImg$1.m59690f(function2, ((Boolean) obj2).booleanValue());
                }
            });
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C46646a.m102888b(th2, "KnbShareDispatcher");
            }
            this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m59690f(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }
}
