package com.kubi.home.message.card;

import androidx.lifecycle.ViewModelKt;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.message.TimeUtil;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27040e;
import dj.C36716a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MessageBoxVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0016\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0094@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0016\u0010\u001e\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0016\u0010\"\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020#H\u0082@¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0011H\u0002J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020!H\u0002J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020!H\u0002J\"\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+2\u0006\u0010'\u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020\rH\u0002J\b\u0010-\u001a\u00020\u0011H\u0002J\b\u0010.\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u00060"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxUIState;", "<init>", "()V", "api", "Lcom/kubi/home/message/card/MessageApi;", "initState", "getInitState", "()Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxUIState;", "refreshTimeTask", "Lkotlinx/coroutines/Job;", "needCatchException", "", "getNeedCatchException", "()Z", "startRefreshTimeTask", "", "stopRefreshTimeTask", "onCleared", "handleRequestMessageData", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDeleteCardIntent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportDeleteEvent", "refreshData", "data", "", "Lcom/kubi/home/message/card/MessageBox;", "handleClickMessageIntent", "Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent$ClickMessageIntent;", "(Lcom/kubi/home/message/card/MessageBoxContract$MessageBoxIntent$ClickMessageIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshOutSideData", "trackItemClick", "box", "trackItemExpose", "trackItem", "eventType", "", "isClose", "removeCard", "removeCardIfNeed", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMessageBoxVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBoxVM.kt\ncom/kubi/home/message/card/MessageBoxVM\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,292:1\n106#2,2:293\n106#2,2:295\n473#3,4:297\n473#3,4:301\n473#3,4:305\n360#4,7:309\n1573#4:316\n1604#4,4:317\n*S KotlinDebug\n*F\n+ 1 MessageBoxVM.kt\ncom/kubi/home/message/card/MessageBoxVM\n*L\n51#1:293,2\n55#1:295,2\n118#1:297,4\n122#1:301,4\n127#1:305,4\n252#1:309,7\n164#1:316\n164#1:317,4\n*E\n"})
public final class MessageBoxVM extends AbstractC19291m<MessageBoxUIState> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f25841Z = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MessageApi f25842X = (MessageApi) RetrofitFlowExKt.m42820a(MessageApi.class);

    /* JADX INFO: renamed from: Y */
    @Nullable
    public InterfaceC41775x1 f25843Y;

    /* JADX INFO: compiled from: MessageBoxVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxVM$Companion;", "", "<init>", "()V", "HOME_FRAGMENT_PAGE_ID", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.message.card.MessageBoxVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: MessageBoxVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.message.card.MessageBoxVM", m90122f = "MessageBoxVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, m90124l = {119, 129}, m90125m = "dispatchIntent", m90126n = {"intent", "$this$dispatchIntent_u24lambda_u245", "this_$iv", "$this$checkIntent$iv", "it", "$i$a$-apply-MessageBoxVM$dispatchIntent$2", "$i$f$checkIntent", "$i$a$-checkIntent-MessageBoxVM$dispatchIntent$2$1", "intent", "$this$dispatchIntent_u24lambda_u245", "this_$iv", "$this$checkIntent$iv", "it", "$i$a$-apply-MessageBoxVM$dispatchIntent$2", "$i$f$checkIntent", "$i$a$-checkIntent-MessageBoxVM$dispatchIntent$2$3"}, m90127s = {"L$0", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2"})
    public static final class C146671 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C146671(Continuation<? super C146671> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageBoxVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m29538C(MessageBox messageBox) throws JSONException {
        m29525B(this, 1, messageBox, false, 4, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m29539D(MessageBox messageBox) throws JSONException {
        m29525B(this, 2, messageBox, false, 4, null);
    }

    @Override // com.kubi.mvi.state.AbstractC19290l, com.kubi.mvi.state.BaseStateVM
    public boolean getNeedCatchException() {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m29546v() {
        C12572a.m23695d("remove_message_box_card", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m29525B(MessageBoxVM messageBoxVM, int i11, MessageBox messageBox, boolean z11, int i12, Object obj) throws JSONException {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        messageBoxVM.m29537A(i11, messageBox, z11);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m29535q(MessageBoxVM messageBoxVM, MessageBox it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        messageBoxVM.m29537A(1, it, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final MessageBoxUIState m29536t(List list, MessageBoxUIState updateState) {
        int iM66658b;
        int iM66658b2;
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        List list2 = CollectionsKt.toList(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MessageBox messageBox = (MessageBox) obj;
            if (list.size() != 2) {
                iM66658b = C27040e.m66658b(12);
                iM66658b2 = C27040e.m66658b(12);
            } else if (i11 == 0) {
                iM66658b = C27040e.m66658b(12);
                iM66658b2 = C27040e.m66658b(6);
            } else {
                iM66658b = C27040e.m66658b(6);
                iM66658b2 = C27040e.m66658b(12);
            }
            int i13 = iM66658b;
            int i14 = iM66658b2;
            TimeUtil timeUtil = TimeUtil.f25835a;
            Long gmtCreated = messageBox.getGmtCreated();
            arrayList.add(MessageBox.copy$default(messageBox, null, null, null, null, null, null, timeUtil.m29508a(Long.valueOf(gmtCreated != null ? gmtCreated.longValue() : 0L)), null, i13, i14, 191, null));
            i11 = i12;
        }
        return updateState.copy(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final void m29537A(int i11, MessageBox messageBox, boolean z11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("messageId", String.valueOf(messageBox.getId()));
        Integer boxType = messageBox.getBoxType();
        jSONObject.put("messageType", (boxType != null && boxType.intValue() == 1) ? "business" : "operation");
        jSONObject.put("postType", messageBox.getTemplateCode());
        jSONObject.put("postTitle", messageBox.getTitle());
        Iterator<MessageBox> it = ((MessageBoxUIState) getState()).getData().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), messageBox.getId())) {
                break;
            } else {
                i12++;
            }
        }
        jSONObject.put("sortPosition", i12 + 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long gmtCreated = messageBox.getGmtCreated();
        jSONObject.put("intervals", (jCurrentTimeMillis - (gmtCreated != null ? gmtCreated.longValue() : 0L)) / 60000);
        if (i11 == 1) {
            C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, z11 ? "closeMessage" : "messageBox", "1", jSONObject);
        } else {
            C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, z11 ? "closeMessage" : "messageBox", "1", jSONObject);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (m29541o(r9, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
    
        if (m29542p(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        return r1;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C146671 c146671;
        InterfaceC19282d interfaceC19282d2;
        InterfaceC19282d interfaceC19282d3;
        int i11;
        if (continuation instanceof C146671) {
            c146671 = (C146671) continuation;
            int i12 = c146671.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c146671.label = i12 - Integer.MIN_VALUE;
            } else {
                c146671 = new C146671(continuation);
            }
        } else {
            c146671 = new C146671(continuation);
        }
        Object obj = c146671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c146671.label;
        if (i13 != 0) {
            if (i13 == 1) {
                int i14 = c146671.I$0;
                InterfaceC19282d interfaceC19282d4 = (InterfaceC19282d) c146671.L$2;
                interfaceC19282d2 = (InterfaceC19282d) c146671.L$1;
                interfaceC19282d3 = (InterfaceC19282d) c146671.L$0;
                ResultKt.throwOnFailure(obj);
                i11 = i14;
                interfaceC19282d = interfaceC19282d4;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (interfaceC19282d instanceof MessageBoxContract$MessageBoxIntent.ClickMessageIntent) {
            MessageBoxContract$MessageBoxIntent.ClickMessageIntent clickMessageIntent = (MessageBoxContract$MessageBoxIntent.ClickMessageIntent) interfaceC19282d;
            c146671.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c146671.L$1 = interfaceC19282d;
            c146671.L$2 = interfaceC19282d;
            c146671.L$3 = SpillingKt.nullOutSpilledVariable(this);
            c146671.L$4 = interfaceC19282d;
            c146671.L$5 = SpillingKt.nullOutSpilledVariable(clickMessageIntent);
            c146671.I$0 = 0;
            c146671.I$1 = 0;
            c146671.I$2 = 0;
            c146671.label = 1;
        }
        interfaceC19282d2 = interfaceC19282d;
        interfaceC19282d3 = interfaceC19282d2;
        i11 = 0;
        if (interfaceC19282d instanceof MessageBoxContract$MessageBoxIntent.GetMessageDataIntent) {
            m29544s(((MessageBoxContract$MessageBoxIntent.GetMessageDataIntent) interfaceC19282d).getData());
        }
        if (interfaceC19282d instanceof MessageBoxContract$MessageBoxIntent.DeleteCardIntent) {
            c146671.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d3);
            c146671.L$1 = interfaceC19282d2;
            c146671.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c146671.L$3 = SpillingKt.nullOutSpilledVariable(this);
            c146671.L$4 = interfaceC19282d;
            c146671.L$5 = SpillingKt.nullOutSpilledVariable((MessageBoxContract$MessageBoxIntent.DeleteCardIntent) interfaceC19282d);
            c146671.I$0 = i11;
            c146671.I$1 = 0;
            c146671.I$2 = 0;
            c146671.label = 2;
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MessageBoxUIState getInitState() {
        return new MessageBoxUIState(null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m29541o(MessageBoxContract$MessageBoxIntent.ClickMessageIntent clickMessageIntent, Continuation<? super Unit> continuation) throws JSONException {
        MessageBoxVM$handleClickMessageIntent$1 messageBoxVM$handleClickMessageIntent$1;
        if (continuation instanceof MessageBoxVM$handleClickMessageIntent$1) {
            messageBoxVM$handleClickMessageIntent$1 = (MessageBoxVM$handleClickMessageIntent$1) continuation;
            int i11 = messageBoxVM$handleClickMessageIntent$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                messageBoxVM$handleClickMessageIntent$1.label = i11 - Integer.MIN_VALUE;
            } else {
                messageBoxVM$handleClickMessageIntent$1 = new MessageBoxVM$handleClickMessageIntent$1(this, continuation);
            }
        } else {
            messageBoxVM$handleClickMessageIntent$1 = new MessageBoxVM$handleClickMessageIntent$1(this, continuation);
        }
        Object obj = messageBoxVM$handleClickMessageIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = messageBoxVM$handleClickMessageIntent$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            MessageBox box = clickMessageIntent.getBox();
            m29538C(box);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("boxType", String.valueOf(box.getBoxType()));
            linkedHashMap.put("id", String.valueOf(box.getId()));
            InterfaceC41634e<Object> interfaceC41634eM29552a = this.f25842X.m29552a(linkedHashMap);
            MessageBoxVM$handleClickMessageIntent$2$2$1 messageBoxVM$handleClickMessageIntent$2$2$1 = new MessageBoxVM$handleClickMessageIntent$2$2$1(this, box, null);
            messageBoxVM$handleClickMessageIntent$1.L$0 = SpillingKt.nullOutSpilledVariable(clickMessageIntent);
            messageBoxVM$handleClickMessageIntent$1.L$1 = SpillingKt.nullOutSpilledVariable(box);
            messageBoxVM$handleClickMessageIntent$1.L$2 = linkedHashMap;
            messageBoxVM$handleClickMessageIntent$1.L$3 = SpillingKt.nullOutSpilledVariable(linkedHashMap);
            messageBoxVM$handleClickMessageIntent$1.I$0 = 0;
            messageBoxVM$handleClickMessageIntent$1.I$1 = 0;
            messageBoxVM$handleClickMessageIntent$1.label = 1;
            if (RetrofitFlowExKt.m42823d(interfaceC41634eM29552a, false, messageBoxVM$handleClickMessageIntent$2$2$1, messageBoxVM$handleClickMessageIntent$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final Object m29542p(Continuation<? super Unit> continuation) {
        MessageBoxVM$handleDeleteCardIntent$1 messageBoxVM$handleDeleteCardIntent$1;
        if (continuation instanceof MessageBoxVM$handleDeleteCardIntent$1) {
            messageBoxVM$handleDeleteCardIntent$1 = (MessageBoxVM$handleDeleteCardIntent$1) continuation;
            int i11 = messageBoxVM$handleDeleteCardIntent$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                messageBoxVM$handleDeleteCardIntent$1.label = i11 - Integer.MIN_VALUE;
            } else {
                messageBoxVM$handleDeleteCardIntent$1 = new MessageBoxVM$handleDeleteCardIntent$1(this, continuation);
            }
        } else {
            messageBoxVM$handleDeleteCardIntent$1 = new MessageBoxVM$handleDeleteCardIntent$1(this, continuation);
        }
        MessageBoxVM$handleDeleteCardIntent$1 messageBoxVM$handleDeleteCardIntent$2 = messageBoxVM$handleDeleteCardIntent$1;
        Object obj = messageBoxVM$handleDeleteCardIntent$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = messageBoxVM$handleDeleteCardIntent$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<Object> interfaceC41634eM29555d = this.f25842X.m29555d();
            MessageBoxVM$handleDeleteCardIntent$2 messageBoxVM$handleDeleteCardIntent$3 = new MessageBoxVM$handleDeleteCardIntent$2(this, null);
            messageBoxVM$handleDeleteCardIntent$2.label = 1;
            if (RetrofitFlowExKt.m42826g(interfaceC41634eM29555d, false, messageBoxVM$handleDeleteCardIntent$3, messageBoxVM$handleDeleteCardIntent$2, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C12572a.m23695d("refresh_red_dot", Boxing.boxBoolean(false), 0L, 4, null);
        C27024b.m66562e(((MessageBoxUIState) getState()).getData(), new Function1() { // from class: com.kubi.home.message.card.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MessageBoxVM.m29535q(this.f25849b, (MessageBox) obj2);
            }
        });
        m29548x();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public final void m29543r() {
        launchOnIO(new MessageBoxVM$handleRequestMessageData$1(this, null));
    }

    /* JADX INFO: renamed from: s */
    public final void m29544s(final List<MessageBox> list) {
        updateState(new Function1() { // from class: com.kubi.home.message.card.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessageBoxVM.m29536t(list, (MessageBoxUIState) obj);
            }
        });
        m29545u();
    }

    /* JADX INFO: renamed from: u */
    public final void m29545u() {
        C12572a.m23695d("refresh_red_dot", Boolean.FALSE, 0L, 4, null);
        m29547w();
    }

    /* JADX INFO: renamed from: x */
    public final void m29548x() {
        C36716a.m82243f(HomeCardViewHolderProxy.PAGE_ID, "messageBoxClose", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m29549y() {
        InterfaceC41775x1 interfaceC41775x1 = this.f25843Y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f25843Y = launchOnIO(new MessageBoxVM$startRefreshTimeTask$1(this, null));
    }

    /* JADX INFO: renamed from: z */
    public final void m29550z() {
        InterfaceC41775x1 interfaceC41775x1 = this.f25843Y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    public MessageBoxVM() {
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.notice.event.NoticeEvent:message_box_notification_update".length();
        }
        C12572a.m23693b(viewModelScope, new MessageBoxVM$special$$inlined$bindFlowEvent$1("com.kubi.notice.event.NoticeEvent:message_box_notification_update", null, this));
        InterfaceC41709m0 viewModelScope2 = ViewModelKt.getViewModelScope(this);
        if (c12573b.m23696a()) {
            "expose_message_box".length();
        }
        C12572a.m23693b(viewModelScope2, new MessageBoxVM$special$$inlined$bindFlowEvent$2("expose_message_box", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m29550z();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m29550z();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        m29543r();
        m29549y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m29547w() {
        if (((MessageBoxUIState) getState()).getData().isEmpty()) {
            m29546v();
        }
    }
}
