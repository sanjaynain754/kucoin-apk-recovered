package com.kubi.share.lib.flutter;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5290q;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.share.lib.utils.ShareExtKt;
import kotlinx.coroutines.AbstractC41697j0;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import xb0.C46126b;
import z10.C46646a;

/* JADX INFO: compiled from: KCFlutterBridgeShareCallImpl.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.flutter.KCFlutterBridgeShareCallImpl$savePhoto$1", m90122f = "KCFlutterBridgeShareCallImpl.kt", m90123i = {1}, m90124l = {106, 113}, m90125m = "invokeSuspend", m90126n = {"checkPermission"}, m90127s = {"I$0"})
@SourceDebugExtension({"SMAP\nKCFlutterBridgeShareCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeShareCallImpl.kt\ncom/kubi/share/lib/flutter/KCFlutterBridgeShareCallImpl$savePhoto$1\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,144:1\n45#2,4:145\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeShareCallImpl.kt\ncom/kubi/share/lib/flutter/KCFlutterBridgeShareCallImpl$savePhoto$1\n*L\n123#1:145,4\n*E\n"})
public final class KCFlutterBridgeShareCallImpl$savePhoto$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $imageData;
    int I$0;
    int label;
    final /* synthetic */ KCFlutterBridgeShareCallImpl this$0;

    /* JADX INFO: renamed from: com.kubi.share.lib.flutter.KCFlutterBridgeShareCallImpl$savePhoto$1$1 */
    /* JADX INFO: compiled from: KCFlutterBridgeShareCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.flutter.KCFlutterBridgeShareCallImpl$savePhoto$1$1", m90122f = "KCFlutterBridgeShareCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C245421 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ String $imageData;
        int label;
        final /* synthetic */ KCFlutterBridgeShareCallImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C245421(KCFlutterBridgeShareCallImpl kCFlutterBridgeShareCallImpl, String str, Context context, Continuation<? super C245421> continuation) {
            super(2, continuation);
            this.this$0 = kCFlutterBridgeShareCallImpl;
            this.$imageData = str;
            this.$ctx = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m59650g() {
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245421(this.this$0, this.$imageData, this.$ctx, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245421) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ShareExtKt.m59838K((FragmentActivity) this.$ctx, C5290q.m6355f(this.this$0.m59647e(this.$imageData), 0), true, new Function0() { // from class: com.kubi.share.lib.flutter.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KCFlutterBridgeShareCallImpl$savePhoto$1.C245421.m59650g();
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeShareCallImpl$savePhoto$1(Context context, Function2<? super Boolean, ? super ProtocolException, Unit> function2, KCFlutterBridgeShareCallImpl kCFlutterBridgeShareCallImpl, String str, Continuation<? super KCFlutterBridgeShareCallImpl$savePhoto$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$callback = function2;
        this.this$0 = kCFlutterBridgeShareCallImpl;
        this.$imageData = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeShareCallImpl$savePhoto$1(this.$ctx, this.$callback, this.this$0, this.$imageData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeShareCallImpl$savePhoto$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:24:0x006b, B:21:0x0051), top: B:33:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r11 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r1, r6, r10) == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? BooleanValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                this.$callback.invoke(Boxing.boxBoolean(true), null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (KCFlutterBridgeShareCallImpl.f49349a.m59648a()) {
                this.label = 1;
                obj = PermissionCompatKt.m49933b(new C46126b((FragmentActivity) this.$ctx), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this);
            } else {
                BooleanValue = 1;
                if (BooleanValue != 0) {
                    AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                    C245421 c245421 = new C245421(this.this$0, this.$imageData, this.$ctx, null);
                    this.I$0 = BooleanValue;
                    this.label = 2;
                } else {
                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("-2", new RuntimeException("Storage permission denied"), null, false, 12, null));
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
            BooleanValue = ((Boolean) obj).booleanValue();
            if (BooleanValue != 0) {
                AbstractC41697j0 abstractC41697j0M94120b2 = C42911a.m94120b();
                C245421 c245422 = new C245421(this.this$0, this.$imageData, this.$ctx, null);
                this.I$0 = BooleanValue;
                this.label = 2;
            } else {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("-2", new RuntimeException("Storage permission denied"), null, false, 12, null));
            }
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C46646a.m102888b(th2, "KCFlutterBridgeShareCal");
            }
            this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }
}
