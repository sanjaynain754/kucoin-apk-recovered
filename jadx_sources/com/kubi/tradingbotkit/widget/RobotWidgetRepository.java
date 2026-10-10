package com.kubi.tradingbotkit.widget;

import com.kubi.tradingbotkit.widget.entity.RobotWidgetEntity;
import com.kubi.utils.C27099x;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import u50.C45125a;
import x50.InterfaceC46081a;
import y70.C46392a;

/* JADX INFO: compiled from: RobotWidgetRepository.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u000eR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradingbotkit/widget/RobotWidgetRepository;", "", "<init>", "()V", "api", "Lcom/kubi/tradingbotkit/widget/api/RobotWidgetApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/tradingbotkit/widget/api/RobotWidgetApi;", "api$delegate", "Lkotlin/Lazy;", "fetchRobotWidgetData", "", "Lcom/kubi/tradingbotkit/widget/entity/RobotWidgetEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRobotWidgetData", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRobotWidgetRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RobotWidgetRepository.kt\ncom/kubi/tradingbotkit/widget/RobotWidgetRepository\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,39:1\n23#2,2:40\n32#2:42\n196#3,3:43\n*S KotlinDebug\n*F\n+ 1 RobotWidgetRepository.kt\ncom/kubi/tradingbotkit/widget/RobotWidgetRepository\n*L\n26#1:40,2\n35#1:42\n36#1:43,3\n*E\n"})
public final class RobotWidgetRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RobotWidgetRepository f52508a = new RobotWidgetRepository();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f52509b = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.widget.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RobotWidgetRepository.m64352b();
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m64353c(@NotNull Continuation<? super List<RobotWidgetEntity>> continuation) {
        RobotWidgetRepository$fetchRobotWidgetData$1 robotWidgetRepository$fetchRobotWidgetData$1;
        if (continuation instanceof RobotWidgetRepository$fetchRobotWidgetData$1) {
            robotWidgetRepository$fetchRobotWidgetData$1 = (RobotWidgetRepository$fetchRobotWidgetData$1) continuation;
            int i11 = robotWidgetRepository$fetchRobotWidgetData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                robotWidgetRepository$fetchRobotWidgetData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                robotWidgetRepository$fetchRobotWidgetData$1 = new RobotWidgetRepository$fetchRobotWidgetData$1(this, continuation);
            }
        } else {
            robotWidgetRepository$fetchRobotWidgetData$1 = new RobotWidgetRepository$fetchRobotWidgetData$1(this, continuation);
        }
        Object objM101592a = robotWidgetRepository$fetchRobotWidgetData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = robotWidgetRepository$fetchRobotWidgetData$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM101592a);
                InterfaceC46081a interfaceC46081aM64354d = m64354d();
                robotWidgetRepository$fetchRobotWidgetData$1.label = 1;
                objM101592a = interfaceC46081aM64354d.m101592a(robotWidgetRepository$fetchRobotWidgetData$1);
                if (objM101592a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM101592a);
            }
            List list = (List) objM101592a;
            if (list != null) {
                C46392a.m102333p(C45125a.f101543a.m99747b(), C27099x.m66919i(list, false, 2, null));
                return list;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC46081a m64354d() {
        return (InterfaceC46081a) f52509b.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m64355e(@NotNull Continuation<? super List<RobotWidgetEntity>> continuation) {
        String strM102326h = C46392a.m102326h(C45125a.f101543a.m99747b(), "");
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new C26248xcf11b870(strM102326h, null)), C42911a.m94120b()), continuation);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC46081a m64352b() {
        return (InterfaceC46081a) C42597a.m93388d().create(InterfaceC46081a.class);
    }
}
