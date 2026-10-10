package p468nb;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.chat.entity.ChatHasUnreadRequest;
import com.kubi.chat.entity.ChatHistory;
import com.kubi.chat.entity.ChatHistoryRequest;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.entity.ChatMessages;
import com.kubi.chat.entity.InstrumentTypeEnum;
import com.kubi.chat.entity.MsgStatusEnum;
import com.kubi.chat.entity.MsgTypeEnum;
import com.kubi.network.retrofit.exception.ApiException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p494ob.C43006a;
import p494ob.C43007b;
import p494ob.C43008c;
import p494ob.C43010e;
import p531pb.C43430b;
import p658ub.C45147a;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: renamed from: nb.a */
/* JADX INFO: compiled from: ChatConversation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJc\u0010%\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\"\b\u0002\u0010!\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001f2\u0018\b\u0002\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u0019\u0018\u00010\"¢\u0006\u0004\b%\u0010&JA\u0010'\u001a\u00020\u00192\u0018\b\u0002\u0010!\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0019\u0018\u00010\"2\u0018\b\u0002\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u0019\u0018\u00010\"¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0010¢\u0006\u0004\b,\u0010*J\r\u0010-\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106¨\u0006;"}, m90084d2 = {"Lnb/a;", "", "", "fromUserId", "toUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "textContent", "", "data", "Lcom/kubi/chat/entity/ChatMessage;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/chat/entity/ChatMessage;", "path", "", "isCompress", "", "compressSize", "j", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/kubi/chat/entity/ChatMessage;", "fromId", "toId", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/chat/entity/ChatMessage;", "message", "", "i", "(Lcom/kubi/chat/entity/ChatMessage;)V", "seqId", "", "pageSize", "Lkotlin/Function2;", "", "successAction", "Lkotlin/Function1;", "", "failAction", "f", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "n", "(J)V", "hasReadId", "m", "g", "()J", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getFromUserId", "()Ljava/lang/String;", "b", "getToUserId", "c", "J", "localMessageSeqId", "d", "myMessageHasReadId", "targetMessageHasReadId", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C42792a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String fromUserId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String toUserId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long localMessageSeqId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long myMessageHasReadId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long targetMessageHasReadId;

    /* JADX INFO: renamed from: nb.a$a */
    /* JADX INFO: compiled from: ChatConversation.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"nb/a$a", "Lretrofit2/Callback;", "Lcom/kubi/chat/entity/ChatHistory;", "Lretrofit2/Call;", "call", "Lretrofit2/Response;", "response", "", "onResponse", "(Lretrofit2/Call;Lretrofit2/Response;)V", "", "t", "onFailure", "(Lretrofit2/Call;Ljava/lang/Throwable;)V", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class a implements Callback<ChatHistory> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f94806b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C42792a f94807c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function2<List<ChatMessage>, String, Unit> f94808d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Function1<Throwable, Unit> f94809e;

        /* JADX INFO: renamed from: nb.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Comparisons.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
        public static final class C47015a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.compareValues(((ChatMessages) t11).getMsgSeqId(), ((ChatMessages) t12).getMsgSeqId());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, C42792a c42792a, Function2<? super List<ChatMessage>, ? super String, Unit> function2, Function1<? super Throwable, Unit> function1) {
            this.f94806b = str;
            this.f94807c = c42792a;
            this.f94808d = function2;
            this.f94809e = function1;
        }

        @Override // retrofit2.Callback
        public void onFailure(@NotNull Call<ChatHistory> call, @NotNull Throwable t11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t11, "t");
            Function1<Throwable, Unit> function1 = this.f94809e;
            if (function1 != null) {
                function1.invoke(t11);
            }
            if (t11 instanceof ApiException) {
                String str = ((ApiException) t11).code;
                Intrinsics.checkNotNullExpressionValue(str, "t.code");
                C45147a.m99789a("messageHistory", false, str, t11.getMessage());
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(@NotNull Call<ChatHistory> call, @NotNull Response<ChatHistory> response) {
            List<ChatMessages> listMessage;
            Object next;
            ChatMessages chatMessages;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            ChatHistory chatHistoryBody = response.body();
            ChatHistory chatHistoryBody2 = response.body();
            List listSortedWith = (chatHistoryBody2 == null || (listMessage = chatHistoryBody2.getListMessage()) == null) ? null : CollectionsKt.sortedWith(listMessage, new C47015a());
            String str = this.f94806b;
            if (str == null || str.length() == 0) {
                this.f94807c.localMessageSeqId = C45148b.m99793c(chatHistoryBody == null ? null : chatHistoryBody.getCurrentMsgSeqId());
                this.f94807c.targetMessageHasReadId = C45148b.m99793c(chatHistoryBody == null ? null : chatHistoryBody.getSenderReadSeqId());
                this.f94807c.myMessageHasReadId = C45148b.m99793c(chatHistoryBody == null ? null : chatHistoryBody.getReceiverReadSeqId());
                long jM99793c = C45148b.m99793c(chatHistoryBody == null ? null : chatHistoryBody.getReceiverLatestSendSeqId());
                if (jM99793c > this.f94807c.targetMessageHasReadId) {
                    if (listSortedWith == null) {
                        chatMessages = null;
                    } else {
                        Iterator it = listSortedWith.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            Long msgSeqId = ((ChatMessages) next).getMsgSeqId();
                            if (msgSeqId != null && msgSeqId.longValue() == jM99793c) {
                                break;
                            }
                        }
                        chatMessages = (ChatMessages) next;
                    }
                    if (chatMessages == null) {
                        return;
                    } else {
                        this.f94807c.m93794i(new ChatMessage(chatMessages));
                    }
                }
            }
            if (listSortedWith == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                Iterator it2 = listSortedWith.iterator();
                while (it2.hasNext()) {
                    ChatMessage chatMessage = new ChatMessage((ChatMessages) it2.next());
                    chatMessage.setStatus(MsgStatusEnum.DELIVERED);
                    arrayList.add(chatMessage);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            Function2<List<ChatMessage>, String, Unit> function2 = this.f94808d;
            if (function2 != null) {
                function2.invoke(arrayList, C45148b.m99794d(chatHistoryBody != null ? chatHistoryBody.getLastSeqId() : null));
            }
            C45147a.m99790b("messageHistory", false, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: nb.a$b */
    /* JADX INFO: compiled from: ChatConversation.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"nb/a$b", "Lretrofit2/Callback;", "", "Lretrofit2/Call;", "call", "Lretrofit2/Response;", "response", "", "onResponse", "(Lretrofit2/Call;Lretrofit2/Response;)V", "", "t", "onFailure", "(Lretrofit2/Call;Ljava/lang/Throwable;)V", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class b implements Callback<Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<Boolean, Unit> f94810b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1<Throwable, Unit> f94811c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function2) {
            this.f94810b = function1;
            this.f94811c = function2;
        }

        @Override // retrofit2.Callback
        public void onFailure(@NotNull Call<Boolean> call, @NotNull Throwable t11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t11, "t");
            Function1<Throwable, Unit> function1 = this.f94811c;
            if (function1 != null) {
                function1.invoke(t11);
            }
            if (t11 instanceof ApiException) {
                String str = ((ApiException) t11).code;
                Intrinsics.checkNotNullExpressionValue(str, "t.code");
                C45147a.m99789a("messageUnread", false, str, t11.getMessage());
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(@NotNull Call<Boolean> call, @NotNull Response<Boolean> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            Function1<Boolean, Unit> function1 = this.f94810b;
            if (function1 != null) {
                function1.invoke(response.body());
            }
            C45147a.m99790b("messageUnread", false, null, null, 14, null);
        }
    }

    public C42792a(@NotNull String fromUserId, @NotNull String toUserId) {
        Intrinsics.checkNotNullParameter(fromUserId, "fromUserId");
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ChatMessage m93789k(C42792a c42792a, String str, Map map, Boolean bool, Long l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i11 & 4) != 0) {
            bool = Boolean.TRUE;
        }
        if ((i11 & 8) != 0) {
            l11 = 3500L;
        }
        return c42792a.m93795j(str, map, bool, l11);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ChatMessage m93790e(@NotNull String fromId, @NotNull String toId, @NotNull String textContent, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(toId, "toId");
        Intrinsics.checkNotNullParameter(textContent, "textContent");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C43008c().m94449d(fromId).m94453h(toId).m94448c(textContent).m94450e(MsgTypeEnum.TEXT).m94451f(data).m94446a();
    }

    /* JADX INFO: renamed from: f */
    public final void m93791f(@Nullable String seqId, @Nullable Integer pageSize, @Nullable Function2<? super List<ChatMessage>, ? super String, Unit> successAction, @Nullable Function1<? super Throwable, Unit> failAction) {
        if (!Intrinsics.areEqual(seqId, "1")) {
            C43430b.f95881a.m95623c().m95618b(new ChatHistoryRequest(this.toUserId, seqId, pageSize)).enqueue(new a(seqId, this, successAction, failAction));
        } else {
            if (successAction == null) {
                return;
            }
            successAction.invoke(CollectionsKt.emptyList(), seqId);
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getMyMessageHasReadId() {
        return this.myMessageHasReadId;
    }

    /* JADX INFO: renamed from: h */
    public final void m93793h(@Nullable Function1<? super Boolean, Unit> successAction, @Nullable Function1<? super Throwable, Unit> failAction) {
        C43430b.f95881a.m95623c().m95617a(new ChatHasUnreadRequest(this.toUserId)).enqueue(new b(successAction, failAction));
    }

    /* JADX INFO: renamed from: i */
    public final void m93794i(@NotNull ChatMessage message) {
        ChatMessage chatMessageM94442a;
        Intrinsics.checkNotNullParameter(message, "message");
        if (Intrinsics.areEqual(message.getFromUid(), this.fromUserId) || (chatMessageM94442a = new C43006a(message).m94444c(InstrumentTypeEnum.MESSAGE_READ).m94442a()) == null) {
            return;
        }
        C43007b.m94445a(chatMessageM94442a);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final ChatMessage m93795j(@NotNull String path, @NotNull Map<String, String> data, @Nullable Boolean isCompress, @Nullable Long compressSize) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(data, "data");
        this.localMessageSeqId++;
        C43008c c43008cM94452g = new C43008c().m94449d(this.fromUserId).m94453h(this.toUserId).m94448c(path).m94450e(MsgTypeEnum.IMAGE).m94451f(data).m94452g(this.localMessageSeqId);
        if (!C45148b.m99792b(isCompress)) {
            compressSize = null;
        }
        ChatMessage chatMessageM94446a = c43008cM94452g.m94447b(compressSize).m94446a();
        if (chatMessageM94446a == null) {
            return chatMessageM94446a;
        }
        C43010e.m94456c(chatMessageM94446a);
        return chatMessageM94446a;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final ChatMessage m93796l(@NotNull String textContent, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(textContent, "textContent");
        Intrinsics.checkNotNullParameter(data, "data");
        this.localMessageSeqId++;
        ChatMessage chatMessageM94446a = new C43008c().m94449d(this.fromUserId).m94453h(this.toUserId).m94448c(textContent).m94450e(MsgTypeEnum.TEXT).m94451f(data).m94452g(this.localMessageSeqId).m94446a();
        if (chatMessageM94446a == null) {
            return chatMessageM94446a;
        }
        C43010e.m94456c(chatMessageM94446a);
        return chatMessageM94446a;
    }

    /* JADX INFO: renamed from: m */
    public final void m93797m(long hasReadId) {
        this.myMessageHasReadId = RangesKt.coerceAtLeast(hasReadId, this.myMessageHasReadId);
    }

    /* JADX INFO: renamed from: n */
    public final void m93798n(long seqId) {
        this.localMessageSeqId = RangesKt.coerceAtLeast(seqId, this.localMessageSeqId);
    }
}
