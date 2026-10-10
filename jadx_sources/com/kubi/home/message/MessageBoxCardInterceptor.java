package com.kubi.home.message;

import android.content.SharedPreferences;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.home.message.card.C14672d;
import com.kubi.home.message.card.MessageApi;
import com.kubi.home.message.card.NoticeConfigEntity;
import com.kubi.home.service.HomeDepend;
import com.kubi.kucoin.home.cards.CardInterceptor;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27025c;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: MessageBoxCardInterceptor.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/home/message/MessageBoxCardInterceptor;", "Lcom/kubi/kucoin/home/cards/CardInterceptor;", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "api", "Lcom/kubi/home/message/card/MessageApi;", "checkNeedShow", "", "needRequestData", "needShowCard", "needShowConfig", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MessageBoxCardInterceptor implements CardInterceptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41709m0 f25833a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MessageApi f25834b;

    /* JADX INFO: renamed from: com.kubi.home.message.MessageBoxCardInterceptor$1 */
    /* JADX INFO: compiled from: MessageBoxCardInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.message.MessageBoxCardInterceptor$1", m90122f = "MessageBoxCardInterceptor.kt", m90123i = {}, m90124l = {39}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nMessageBoxCardInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBoxCardInterceptor.kt\ncom/kubi/home/message/MessageBoxCardInterceptor$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n25#2:71\n26#2:73\n1#3:72\n*S KotlinDebug\n*F\n+ 1 MessageBoxCardInterceptor.kt\ncom/kubi/home/message/MessageBoxCardInterceptor$1\n*L\n49#1:71\n49#1:73\n49#1:72\n*E\n"})
    public static final class C146601 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.home.message.MessageBoxCardInterceptor$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: MessageBoxCardInterceptor.kt */
        @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/home/message/card/NoticeConfigEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.home.message.MessageBoxCardInterceptor$1$1", m90122f = "MessageBoxCardInterceptor.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        @SourceDebugExtension({"SMAP\nMessageBoxCardInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBoxCardInterceptor.kt\ncom/kubi/home/message/MessageBoxCardInterceptor$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,70:1\n1#2:71\n39#3,12:72\n*S KotlinDebug\n*F\n+ 1 MessageBoxCardInterceptor.kt\ncom/kubi/home/message/MessageBoxCardInterceptor$1$1\n*L\n42#1:72,12\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends NoticeConfigEntity>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends NoticeConfigEntity> list, Continuation<? super Unit> continuation) {
                return invoke2((List<NoticeConfigEntity>) list, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<NoticeConfigEntity> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object next;
                List list = (List) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C44128b.m97259c("msg_box", "getMessageConfig Success");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Integer id2 = ((NoticeConfigEntity) next).getId();
                    if (id2 != null && id2.intValue() == 1) {
                        break;
                    }
                }
                NoticeConfigEntity noticeConfigEntity = (NoticeConfigEntity) next;
                if (noticeConfigEntity != null) {
                    SharedPreferences.Editor editorEdit = C42899b.m94072b(BaseApplication.INSTANCE.get()).edit();
                    editorEdit.putString(C14672d.m29557b(), String.valueOf(C27025c.m66566d(noticeConfigEntity.getState())));
                    editorEdit.apply();
                }
                return Unit.INSTANCE;
            }
        }

        public C146601(Continuation<? super C146601> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MessageBoxCardInterceptor.this.new C146601(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C146601) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41634e<List<NoticeConfigEntity>> interfaceC41634eM29553b = MessageBoxCardInterceptor.this.f25834b.m29553b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = RetrofitFlowExKt.m42823d(interfaceC41634eM29553b, false, anonymousClass1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Throwable throwable = ((C19334f) obj).getThrowable();
            if (throwable != null) {
                C44128b.m97262f("msg_box", "getMessageConfig error", throwable);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m29507e() {
        return HomeDepend.f26198a.m30225d().c() && Boolean.parseBoolean(C42899b.m94072b(BaseApplication.INSTANCE.get()).getString(C14672d.m29557b(), CredentialEntry.FALSE_STRING));
    }

    public MessageBoxCardInterceptor() {
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(new CoroutineName("MessageBoxCardInterceptor"));
        this.f25833a = interfaceC41709m0M91125a;
        this.f25834b = (MessageApi) RetrofitFlowExKt.m42820a(MessageApi.class);
        if (HomeDepend.f26198a.m30225d().c()) {
            C41696j.m91104d(interfaceC41709m0M91125a, null, null, new C146601(null), 3, null);
        }
    }

    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: a */
    public boolean mo29504a() {
        return m29507e();
    }

    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: b */
    public boolean mo29505b() {
        return m29507e();
    }

    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: c */
    public boolean mo29506c() {
        return m29507e();
    }
}
