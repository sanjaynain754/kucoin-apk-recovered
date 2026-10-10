package com.kubi.copytrading.widgets;

import com.kubi.copytrading.entity.CopyTradingWidgetEntity;
import com.kubi.utils.C27099x;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659uc.C45151a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sc.InterfaceC44382a;
import y70.C46392a;

/* JADX INFO: compiled from: CopyTradingWidgetRepository.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u000eR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/copytrading/widgets/CopyTradingWidgetRepository;", "", "<init>", "()V", "api", "Lcom/kubi/copytrading/service/api/CopyTradingWidgetApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/service/api/CopyTradingWidgetApi;", "api$delegate", "Lkotlin/Lazy;", "fetchCopyTradingUserWidgetData", "", "Lcom/kubi/copytrading/entity/CopyTradingWidgetEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCopyTradingUserWidgetData", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingWidgetRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingWidgetRepository.kt\ncom/kubi/copytrading/widgets/CopyTradingWidgetRepository\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,38:1\n23#2,2:39\n32#2:41\n196#3,3:42\n*S KotlinDebug\n*F\n+ 1 CopyTradingWidgetRepository.kt\ncom/kubi/copytrading/widgets/CopyTradingWidgetRepository\n*L\n26#1:39,2\n34#1:41\n35#1:42,3\n*E\n"})
public final class CopyTradingWidgetRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CopyTradingWidgetRepository f19972a = new CopyTradingWidgetRepository();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f19973b = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.widgets.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CopyTradingWidgetRepository.m20979b();
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m20980c(@NotNull Continuation<? super List<CopyTradingWidgetEntity>> continuation) {
        CopyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1 copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1;
        if (continuation instanceof CopyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1) {
            copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1 = (CopyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1) continuation;
            int i11 = copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1 = new CopyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1(this, continuation);
            }
        } else {
            copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1 = new CopyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1(this, continuation);
        }
        Object objM97886a = copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM97886a);
                InterfaceC44382a interfaceC44382aM20981d = m20981d();
                copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1.label = 1;
                objM97886a = interfaceC44382aM20981d.m97886a(copyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1);
                if (objM97886a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM97886a);
            }
            List list = (List) objM97886a;
            if (list != null) {
                C46392a.m102333p(C45151a.f101594a.m99798d(), C27099x.m66919i(list, false, 2, null));
                return list;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC44382a m20981d() {
        return (InterfaceC44382a) f19973b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m20982e(@NotNull Continuation<? super List<CopyTradingWidgetEntity>> continuation) {
        CopyTradingWidgetRepository$getCopyTradingUserWidgetData$1 copyTradingWidgetRepository$getCopyTradingUserWidgetData$1;
        if (continuation instanceof CopyTradingWidgetRepository$getCopyTradingUserWidgetData$1) {
            copyTradingWidgetRepository$getCopyTradingUserWidgetData$1 = (CopyTradingWidgetRepository$getCopyTradingUserWidgetData$1) continuation;
            int i11 = copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                copyTradingWidgetRepository$getCopyTradingUserWidgetData$1 = new CopyTradingWidgetRepository$getCopyTradingUserWidgetData$1(this, continuation);
            }
        } else {
            copyTradingWidgetRepository$getCopyTradingUserWidgetData$1 = new CopyTradingWidgetRepository$getCopyTradingUserWidgetData$1(this, continuation);
        }
        Object objM90914f0 = copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90914f0);
            String strM102326h = C46392a.m102326h(C45151a.f101594a.m99798d(), "");
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C11570x8eeebe1b(strM102326h, null)), C42911a.m94120b());
            copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
            copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.L$2 = SpillingKt.nullOutSpilledVariable(strM102326h);
            copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.I$0 = 0;
            copyTradingWidgetRepository$getCopyTradingUserWidgetData$1.label = 1;
            objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, copyTradingWidgetRepository$getCopyTradingUserWidgetData$1);
            if (objM90914f0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90914f0);
        }
        return (List) objM90914f0;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC44382a m20979b() {
        return (InterfaceC44382a) C42597a.m93388d().create(InterfaceC44382a.class);
    }
}
