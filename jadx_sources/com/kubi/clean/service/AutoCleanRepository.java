package com.kubi.clean.service;

import com.kubi.clean.api.entity.AutoCleanBizType;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p689vb.InterfaceC45486a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AutoCleanRepository.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011JN\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u00132\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010\u001cR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/clean/service/AutoCleanRepository;", "", "<init>", "()V", "netApi", "Lcom/kubi/clean/api/IAutoCleanApi;", "kotlin.jvm.PlatformType", "getNetApi", "()Lcom/kubi/clean/api/IAutoCleanApi;", "netApi$delegate", "Lkotlin/Lazy;", "getHomeTopMessageData", "Lcom/kubi/clean/api/entity/IPLimitConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeDialogData", "config", "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;", "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIPLimitConfigMap", "", "", "bizTypeList", "", "Lcom/kubi/clean/api/entity/AutoCleanBizType;", DropFrameTable.COLUMN_SCENE, "successCallBack", "Lkotlin/Function0;", "", "([Lcom/kubi/clean/api/entity/AutoCleanBizType;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAutoCleanRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCleanRepository.kt\ncom/kubi/clean/service/AutoCleanRepository\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n37#2:95\n36#2,3:96\n37#2:99\n36#2,3:100\n33#3:103\n34#3:105\n25#3:106\n26#3:108\n1#4:104\n1#4:107\n*S KotlinDebug\n*F\n+ 1 AutoCleanRepository.kt\ncom/kubi/clean/service/AutoCleanRepository\n*L\n59#1:95\n59#1:96,3\n75#1:99\n75#1:100,3\n87#1:103\n87#1:105\n90#1:106\n90#1:108\n87#1:104\n90#1:107\n*E\n"})
public final class AutoCleanRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f19561a = LazyKt.lazy(new Function0() { // from class: com.kubi.clean.service.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoCleanRepository.m20410g();
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m20408d(AutoCleanRepository autoCleanRepository, AutoCleanBizType[] autoCleanBizTypeArr, String str, Function0 function0, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        return autoCleanRepository.m20411c(autoCleanBizTypeArr, str, function0, continuation);
    }

    /* JADX INFO: renamed from: e */
    public static final CharSequence m20409e(AutoCleanBizType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.name();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m20411c(@NotNull AutoCleanBizType[] autoCleanBizTypeArr, @Nullable String str, @Nullable Function0<Unit> function0, @NotNull Continuation<? super Map<String, IPLimitConfig>> continuation) {
        AutoCleanRepository$getIPLimitConfigMap$1 autoCleanRepository$getIPLimitConfigMap$1;
        AutoCleanRepository autoCleanRepository;
        Function0<Unit> function1;
        Object objM42828i;
        if (continuation instanceof AutoCleanRepository$getIPLimitConfigMap$1) {
            autoCleanRepository$getIPLimitConfigMap$1 = (AutoCleanRepository$getIPLimitConfigMap$1) continuation;
            int i11 = autoCleanRepository$getIPLimitConfigMap$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                autoCleanRepository$getIPLimitConfigMap$1.label = i11 - Integer.MIN_VALUE;
                autoCleanRepository = this;
            } else {
                autoCleanRepository = this;
                autoCleanRepository$getIPLimitConfigMap$1 = new AutoCleanRepository$getIPLimitConfigMap$1(autoCleanRepository, continuation);
            }
        } else {
            autoCleanRepository = this;
            autoCleanRepository$getIPLimitConfigMap$1 = new AutoCleanRepository$getIPLimitConfigMap$1(autoCleanRepository, continuation);
        }
        AutoCleanRepository$getIPLimitConfigMap$1 autoCleanRepository$getIPLimitConfigMap$2 = autoCleanRepository$getIPLimitConfigMap$1;
        Object obj = autoCleanRepository$getIPLimitConfigMap$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = autoCleanRepository$getIPLimitConfigMap$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<Map<String, IPLimitConfig>> interfaceC41634eM100450a = autoCleanRepository.m20412f().m100450a(ArraysKt.joinToString$default(autoCleanBizTypeArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.kubi.clean.service.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AutoCleanRepository.m20409e((AutoCleanBizType) obj2);
                }
            }, 31, (Object) null), str);
            autoCleanRepository$getIPLimitConfigMap$2.L$0 = SpillingKt.nullOutSpilledVariable(autoCleanBizTypeArr);
            autoCleanRepository$getIPLimitConfigMap$2.L$1 = SpillingKt.nullOutSpilledVariable(str);
            function1 = function0;
            autoCleanRepository$getIPLimitConfigMap$2.L$2 = function1;
            autoCleanRepository$getIPLimitConfigMap$2.label = 1;
            objM42828i = RetrofitFlowExKt.m42828i(interfaceC41634eM100450a, false, false, autoCleanRepository$getIPLimitConfigMap$2, 1, null);
            if (objM42828i == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function0<Unit> function2 = (Function0) autoCleanRepository$getIPLimitConfigMap$2.L$2;
            ResultKt.throwOnFailure(obj);
            objM42828i = obj;
            function1 = function2;
        }
        C19334f c19334f = (C19334f) objM42828i;
        Object objM42846a = c19334f.m42846a();
        if (objM42846a != null) {
            if (function1 != null) {
                function1.invoke();
            }
            C44128b.m97259c("ipLimit", "getIPLimitConfig success");
        }
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null) {
            C44128b.m97262f("ipLimit", "getIPLimitConfig Fail", throwable);
        }
        return RetrofitFlowExKt.m42829j(c19334f);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC45486a m20412f() {
        return (InterfaceC45486a) this.f19561a.getValue();
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC45486a m20410g() {
        return (InterfaceC45486a) C42597a.m93387c().create(InterfaceC45486a.class);
    }
}
