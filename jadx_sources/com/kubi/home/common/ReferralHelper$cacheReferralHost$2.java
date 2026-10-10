package com.kubi.home.common;

import android.net.Uri;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ReferralHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.common.ReferralHelper$cacheReferralHost$2", m90122f = "ReferralHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nReferralHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReferralHelper.kt\ncom/kubi/home/common/ReferralHelper$cacheReferralHost$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1869#2,2:67\n*S KotlinDebug\n*F\n+ 1 ReferralHelper.kt\ncom/kubi/home/common/ReferralHelper$cacheReferralHost$2\n*L\n37#1:67,2\n*E\n"})
public final class ReferralHelper$cacheReferralHost$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<FunctionEntity> $functions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralHelper$cacheReferralHost$2(List<FunctionEntity> list, Continuation<? super ReferralHelper$cacheReferralHost$2> continuation) {
        super(2, continuation);
        this.$functions = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralHelper$cacheReferralHost$2(this.$functions, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ReferralHelper$cacheReferralHost$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            for (FunctionEntity functionEntity : this.$functions) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Uri uri = Uri.parse(functionEntity.getUri());
                    String strM66668h = C27041f.m66668h(uri.getHost());
                    String strM66668h2 = C27041f.m66668h(uri.getPath());
                    if (!StringsKt.isBlank(strM66668h) && StringsKt.startsWith$default(strM66668h2, "/referral", false, 2, (Object) null)) {
                        ReferralHelper.f25587a.m29043b(strM66668h);
                    } else {
                        Result.m103844constructorimpl(Unit.INSTANCE);
                    }
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
