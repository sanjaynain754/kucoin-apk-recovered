package com.kubi.notice.lib.api;

import android.content.Context;
import com.kubi.notice.lib.entity.MessageUnreadSum;
import com.kubi.notice.lib.entity.Unread;
import com.kubi.notice.lib.service.NoticeDepend;
import com.kubi.utils.extensions.C27039d;
import com.kubi.welfare.api.entity.RemainAwardNumEntity;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: MainRedPointManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.notice.lib.api.MainRedPointManager$getRedPointAsync$2", m90122f = "MainRedPointManager.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m90124l = {72, 73, 74}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "unRead", "otcUnread", "remainAward", "$this$withContext", "unRead", "otcUnread", "remainAward", "unreadSum", "$this$withContext", "unRead", "otcUnread", "remainAward", "unreadSum", "otcUnreadSum"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@SourceDebugExtension({"SMAP\nMainRedPointManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRedPointManager.kt\ncom/kubi/notice/lib/api/MainRedPointManager$getRedPointAsync$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class MainRedPointManager$getRedPointAsync$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $needRequestOTC;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRedPointManager$getRedPointAsync$2(Context context, boolean z11, Continuation<? super MainRedPointManager$getRedPointAsync$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$needRequestOTC = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainRedPointManager$getRedPointAsync$2 mainRedPointManager$getRedPointAsync$2 = new MainRedPointManager$getRedPointAsync$2(this.$context, this.$needRequestOTC, continuation);
        mainRedPointManager$getRedPointAsync$2.L$0 = obj;
        return mainRedPointManager$getRedPointAsync$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MainRedPointManager$getRedPointAsync$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:31:0x010c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0119  */
    /* JADX WARN: Code duplicated, block: B:39:0x0125  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:53:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:37:0x011f->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0;
        InterfaceC41729r0 interfaceC41729r1;
        InterfaceC41729r0 interfaceC41729r2;
        MessageUnreadSum messageUnreadSum;
        List list;
        Object objMo91198h;
        List list2;
        MessageUnreadSum messageUnreadSum2;
        RemainAwardNumEntity remainAwardNumEntity;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Object obj2 = null;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (NoticeDepend.f36385a.m43209a()) {
                InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new MainRedPointManager$getRedPointAsync$2$unRead$1(null), 3, null);
                InterfaceC41729r0 interfaceC41729r0M91102b3 = C41696j.m91102b(interfaceC41709m0, null, null, new MainRedPointManager$getRedPointAsync$2$otcUnread$1(this.$needRequestOTC, null), 3, null);
                interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new MainRedPointManager$getRedPointAsync$2$remainAward$1(null), 3, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
                this.L$2 = interfaceC41729r0M91102b3;
                this.L$3 = interfaceC41729r0M91102b;
                this.label = 1;
                Object objMo91198h2 = interfaceC41729r0M91102b2.mo91198h(this);
                if (objMo91198h2 != coroutine_suspended) {
                    interfaceC41729r0 = interfaceC41729r0M91102b2;
                    obj = objMo91198h2;
                    interfaceC41729r1 = interfaceC41729r0M91102b3;
                }
                return coroutine_suspended;
            }
            C44128b.m97259c("WsNoticeManager", "getRedPoint false");
            MainRedPointManager.f36371f = 0;
            MainRedPointManager.f36372g = 0;
            MainRedPointManager.f36373h = 0;
            MainRedPointManager.f36369d = 0;
            MainRedPointManager.f36370e = 0;
            MainRedPointManager.f36366a.m43155p(this.$context);
            return Unit.INSTANCE;
        }
        if (i11 == 1) {
            interfaceC41729r0M91102b = (InterfaceC41729r0) this.L$3;
            InterfaceC41729r0 interfaceC41729r3 = (InterfaceC41729r0) this.L$2;
            InterfaceC41729r0 interfaceC41729r4 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC41729r0 = interfaceC41729r4;
            interfaceC41729r1 = interfaceC41729r3;
        } else {
            if (i11 == 2) {
                messageUnreadSum = (MessageUnreadSum) this.L$4;
                interfaceC41729r2 = (InterfaceC41729r0) this.L$3;
                interfaceC41729r1 = (InterfaceC41729r0) this.L$2;
                interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
                this.L$4 = messageUnreadSum;
                this.L$5 = list;
                this.label = 3;
                objMo91198h = interfaceC41729r2.mo91198h(this);
                if (objMo91198h != coroutine_suspended) {
                    list2 = list;
                    obj = objMo91198h;
                    messageUnreadSum2 = messageUnreadSum;
                }
                return coroutine_suspended;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) this.L$5;
            messageUnreadSum2 = (MessageUnreadSum) this.L$4;
            ResultKt.throwOnFailure(obj);
        }
        remainAwardNumEntity = (RemainAwardNumEntity) obj;
        if (messageUnreadSum2 != null) {
            MainRedPointManager mainRedPointManager = MainRedPointManager.f36366a;
            MainRedPointManager.f36372g = messageUnreadSum2.getCount();
            MainRedPointManager.f36371f = (MainRedPointManager.f36372g <= 0 || !messageUnreadSum2.getRedHot()) ? 0 : 1;
        }
        if (list2 != null) {
            MainRedPointManager mainRedPointManager2 = MainRedPointManager.f36366a;
            for (Object obj3 : list2) {
                if (Intrinsics.areEqual(((Unread) obj3).getSubject(), "notification.otc")) {
                    obj2 = obj3;
                    break;
                }
            }
            Unread unread = (Unread) obj2;
            MainRedPointManager.f36373h = unread != null ? unread.getCount() : 0;
        }
        if (remainAwardNumEntity != null) {
            MainRedPointManager mainRedPointManager3 = MainRedPointManager.f36366a;
            MainRedPointManager.f36369d = C27039d.m66650j(remainAwardNumEntity.getEncouragementCount());
            MainRedPointManager.f36370e = C27039d.m66650j(remainAwardNumEntity.getInvitationAwardCount());
        }
        MainRedPointManager.f36366a.m43155p(this.$context);
        return Unit.INSTANCE;
        interfaceC41729r2 = interfaceC41729r0M91102b;
        MessageUnreadSum messageUnreadSum3 = (MessageUnreadSum) obj;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
        this.L$3 = interfaceC41729r2;
        this.L$4 = messageUnreadSum3;
        this.label = 2;
        Object objMo91198h3 = interfaceC41729r1.mo91198h(this);
        if (objMo91198h3 != coroutine_suspended) {
            messageUnreadSum = messageUnreadSum3;
            obj = objMo91198h3;
            list = (List) obj;
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
            this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
            this.L$4 = messageUnreadSum;
            this.L$5 = list;
            this.label = 3;
            objMo91198h = interfaceC41729r2.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                list2 = list;
                obj = objMo91198h;
                messageUnreadSum2 = messageUnreadSum;
                remainAwardNumEntity = (RemainAwardNumEntity) obj;
                if (messageUnreadSum2 != null) {
                    MainRedPointManager mainRedPointManager4 = MainRedPointManager.f36366a;
                    MainRedPointManager.f36372g = messageUnreadSum2.getCount();
                    MainRedPointManager.f36371f = (MainRedPointManager.f36372g <= 0 || !messageUnreadSum2.getRedHot()) ? 0 : 1;
                }
                if (list2 != null) {
                    MainRedPointManager mainRedPointManager5 = MainRedPointManager.f36366a;
                    while (r0.hasNext()) {
                        if (Intrinsics.areEqual(((Unread) obj3).getSubject(), "notification.otc")) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    Unread unread2 = (Unread) obj2;
                    MainRedPointManager.f36373h = unread2 != null ? unread2.getCount() : 0;
                }
                if (remainAwardNumEntity != null) {
                    MainRedPointManager mainRedPointManager6 = MainRedPointManager.f36366a;
                    MainRedPointManager.f36369d = C27039d.m66650j(remainAwardNumEntity.getEncouragementCount());
                    MainRedPointManager.f36370e = C27039d.m66650j(remainAwardNumEntity.getInvitationAwardCount());
                }
                MainRedPointManager.f36366a.m43155p(this.$context);
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
