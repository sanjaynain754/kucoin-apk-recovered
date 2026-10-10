package com.kubi.share.lib.knb;

import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.TextShareParam;
import com.kubi.utils.extensions.C27041f;
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

/* JADX INFO: compiled from: KCHybridBridgeShare.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.knb.KCHybridBridgeShare$shareTextLink$1", m90122f = "KCHybridBridgeShare.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCHybridBridgeShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeShare.kt\ncom/kubi/share/lib/knb/KCHybridBridgeShare$shareTextLink$1\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,242:1\n45#2,4:243\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeShare.kt\ncom/kubi/share/lib/knb/KCHybridBridgeShare$shareTextLink$1\n*L\n125#1:243,4\n*E\n"})
public final class KCHybridBridgeShare$shareTextLink$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $shareContent;
    final /* synthetic */ String $shareLink;
    final /* synthetic */ String $shareTitle;
    final /* synthetic */ String $utmSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCHybridBridgeShare$shareTextLink$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, String str2, String str3, String str4, Continuation<? super KCHybridBridgeShare$shareTextLink$1> continuation) {
        super(2, continuation);
        this.$utmSource = str;
        this.$callback = function2;
        this.$shareTitle = str2;
        this.$shareContent = str3;
        this.$shareLink = str4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeShare$shareTextLink$1(this.$utmSource, this.$callback, this.$shareTitle, this.$shareContent, this.$shareLink, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeShare$shareTextLink$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m59707f(Function2 function2, boolean z11) {
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
                TextShareParam textShareParam = new TextShareParam(this.$utmSource, null, null, null, 14, null);
                String str = this.$shareTitle;
                String str2 = this.$shareContent;
                String str3 = this.$shareLink;
                textShareParam.setTitle(C27041f.m66668h(str));
                textShareParam.setContent(C27041f.m66668h(str2));
                if (str3 != null && str3.length() != 0) {
                    textShareParam.setLinkUrl(str3);
                }
                final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
                iShareService.mo40f(textShareParam, new Function1() { // from class: com.kubi.share.lib.knb.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return KCHybridBridgeShare$shareTextLink$1.m59707f(function2, ((Boolean) obj2).booleanValue());
                    }
                });
            } catch (Throwable th2) {
                if (!C42899b.m94075e(th2)) {
                    C46646a.m102888b(th2, "KCHybridBridgeShare");
                }
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
