package com.kubi.share.lib.jsapi;

import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiShareGalleryDataEntity;
import com.kubi.share.api.GalleryShareParam;
import com.kubi.share.api.IShareService;
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
@DebugMetadata(m90121c = "com.kubi.share.lib.jsapi.KnbShareDispatcher$shareGallery$1", m90122f = "KnbShareDispatcher.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKnbShareDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KnbShareDispatcher.kt\ncom/kubi/share/lib/jsapi/KnbShareDispatcher$shareGallery$1\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,165:1\n45#2,4:166\n*S KotlinDebug\n*F\n+ 1 KnbShareDispatcher.kt\ncom/kubi/share/lib/jsapi/KnbShareDispatcher$shareGallery$1\n*L\n149#1:166,4\n*E\n"})
public final class KnbShareDispatcher$shareGallery$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $allowCustomInviteLink;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ KCJSApiShareGalleryDataEntity $data;
    final /* synthetic */ long $galleryIndex;
    final /* synthetic */ String $rcode;
    final /* synthetic */ String $utmSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KnbShareDispatcher$shareGallery$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity, long j11, String str2, Boolean bool, Continuation<? super KnbShareDispatcher$shareGallery$1> continuation) {
        super(2, continuation);
        this.$utmSource = str;
        this.$callback = function2;
        this.$data = kCJSApiShareGalleryDataEntity;
        this.$galleryIndex = j11;
        this.$rcode = str2;
        this.$allowCustomInviteLink = bool;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KnbShareDispatcher$shareGallery$1(this.$utmSource, this.$callback, this.$data, this.$galleryIndex, this.$rcode, this.$allowCustomInviteLink, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KnbShareDispatcher$shareGallery$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m59688f(Function2 function2, boolean z11) {
        function2.invoke(Boolean.valueOf(z11), null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                IShareService iShareService = IShareService.f49268a.get();
                GalleryShareParam galleryShareParam = new GalleryShareParam(this.$utmSource, null, null, 0, false, null, null, null, null, 510, null);
                KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity = this.$data;
                long j11 = this.$galleryIndex;
                String str = this.$rcode;
                Boolean bool = this.$allowCustomInviteLink;
                galleryShareParam.setGalleryType(kCJSApiShareGalleryDataEntity.getGalleryType());
                galleryShareParam.setGalleryLink(kCJSApiShareGalleryDataEntity.getGalleryLink());
                galleryShareParam.setGalleryIndex((int) j11);
                galleryShareParam.setNeedQrCode(kCJSApiShareGalleryDataEntity.getNeedQrCode());
                galleryShareParam.setRcode(str);
                galleryShareParam.setSupportModifyLink(bool);
                final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
                iShareService.mo40f(galleryShareParam, new Function1() { // from class: com.kubi.share.lib.jsapi.h
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return KnbShareDispatcher$shareGallery$1.m59688f(function2, ((Boolean) obj2).booleanValue());
                    }
                });
            } catch (Throwable th2) {
                if (!C42899b.m94075e(th2)) {
                    C46646a.m102888b(th2, "KnbShareDispatcher");
                }
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
