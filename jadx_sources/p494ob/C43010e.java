package p494ob;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.entity.MsgTypeEnum;
import com.kubi.chat.entity.UploadImage;
import com.kubi.chat.proto.ImProtocol$Message;
import com.kubi.chat.proto.ImProtocol$ProtocolFrame;
import com.kubi.chat.proto.MessageKt$Dsl;
import com.kubi.chat.proto.ProtocolFrameKt$Dsl;
import com.kubi.chat.service.ChatClient;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.retrofit.exception.ApiException;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.net.URLEncoder;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p531pb.C43430b;
import p658ub.C45147a;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: renamed from: ob.e */
/* JADX INFO: compiled from: MessageBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/chat/entity/ChatMessage;", "", "c", "(Lcom/kubi/chat/entity/ChatMessage;)V", "chatMessage", "d", "", "byteArray", "f", "(Lcom/kubi/chat/entity/ChatMessage;[B)V", "ImSDK_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43010e {

    /* JADX INFO: renamed from: ob.e$b */
    /* JADX INFO: compiled from: MessageBuilder.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"ob/e$b", "Lio/reactivex/Observer;", "", "Lio/reactivex/disposables/Disposable;", "d", "", "onSubscribe", "(Lio/reactivex/disposables/Disposable;)V", "byteArray", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([B)V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "onComplete", "()V", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class b implements Observer<byte[]> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChatMessage f95179b;

        public b(ChatMessage chatMessage) {
            this.f95179b = chatMessage;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            C43010e.m94459f(this.f95179b, byteArray);
        }

        @Override // io.reactivex.Observer
        public void onError(@NotNull Throwable e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("type", "socketDisconnect");
            eventParametersBuilderAcquire.m42393d("error_message", C45148b.m99794d(e11.getMessage()));
            eventParametersBuilderAcquire.m42393d("code", "-4");
            eventParametersBuilderAcquire.m42394e("success", false);
            TechnologyEvent.m42388d("payment_im", eventParametersBuilderAcquire);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(@NotNull Disposable d11) {
            Intrinsics.checkNotNullParameter(d11, "d");
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }
    }

    /* JADX INFO: renamed from: ob.e$c */
    /* JADX INFO: compiled from: MessageBuilder.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"ob/e$c", "Lretrofit2/Callback;", "Lcom/kubi/chat/entity/UploadImage;", "Lretrofit2/Call;", "call", "Lretrofit2/Response;", "response", "", "onResponse", "(Lretrofit2/Call;Lretrofit2/Response;)V", "", "t", "onFailure", "(Lretrofit2/Call;Ljava/lang/Throwable;)V", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class c implements Callback<UploadImage> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChatMessage f95180b;

        public c(ChatMessage chatMessage) {
            this.f95180b = chatMessage;
        }

        @Override // retrofit2.Callback
        public void onFailure(@NotNull Call<UploadImage> call, @NotNull Throwable t11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t11, "t");
            this.f95180b.setFailedInfo("Upload picture failed please retry.");
            ChatClient chatClient = ChatClient.INSTANCE.get();
            if (chatClient != null) {
                chatClient.m20393h(this.f95180b);
            }
            if (t11 instanceof ApiException) {
                String str = ((ApiException) t11).code;
                Intrinsics.checkNotNullExpressionValue(str, "t.code");
                C45147a.m99789a("uploadPic", false, str, t11.getMessage());
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(@NotNull Call<UploadImage> call, @NotNull Response<UploadImage> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            ImProtocol$ProtocolFrame protoMessage = this.f95180b.getProtoMessage();
            ChatMessage chatMessage = this.f95180b;
            ProtocolFrameKt$Dsl.Companion companion = ProtocolFrameKt$Dsl.INSTANCE;
            ImProtocol$ProtocolFrame.C11390a builder = protoMessage.toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            ProtocolFrameKt$Dsl protocolFrameKt$Dsl_create = companion._create(builder);
            ImProtocol$Message message = chatMessage.getProtoMessage().getMessage();
            Intrinsics.checkNotNullExpressionValue(message, "chatMessage.getDataPro().message");
            MessageKt$Dsl.Companion companion2 = MessageKt$Dsl.INSTANCE;
            ImProtocol$Message.C11386a builder2 = message.toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder2, "this.toBuilder()");
            MessageKt$Dsl messageKt$Dsl_create = companion2._create(builder2);
            UploadImage uploadImageBody = response.body();
            messageKt$Dsl_create.m20367b(C45148b.m99794d(uploadImageBody == null ? null : uploadImageBody.getImgUrl()));
            protocolFrameKt$Dsl_create.m20374d(messageKt$Dsl_create.m20366a());
            ChatMessage chatMessage2 = new ChatMessage(protocolFrameKt$Dsl_create.m20371a());
            ChatClient chatClient = ChatClient.INSTANCE.get();
            if (chatClient != null) {
                chatClient.m20396k(chatMessage2);
            }
            C45147a.m99790b("uploadPic", false, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: ob.e$a */
    /* JADX INFO: compiled from: MessageBuilder.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgTypeEnum.values().length];
            iArr[MsgTypeEnum.TEXT.ordinal()] = 1;
            iArr[MsgTypeEnum.IMAGE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m94456c(@NotNull ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        ChatClient.Companion companion = ChatClient.INSTANCE;
        ChatClient chatClient = companion.get();
        if (chatClient != null) {
            chatClient.m20394i(chatMessage);
        }
        int i11 = a.$EnumSwitchMapping$0[chatMessage.getMsgType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            m94457d(chatMessage);
        } else {
            ChatClient chatClient2 = companion.get();
            if (chatClient2 == null) {
                return;
            }
            chatClient2.m20396k(chatMessage);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m94458e(ChatMessage chatMessage, ObservableEmitter it) {
        Intrinsics.checkNotNullParameter(chatMessage, "$chatMessage");
        Intrinsics.checkNotNullParameter(it, "it");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(chatMessage.getContent());
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeFile, "decodeFile(chatMessage.getContent())");
        it.onNext(C45148b.m99791a(bitmapDecodeFile, chatMessage.getCompressSize()));
    }

    /* JADX INFO: renamed from: f */
    public static final void m94459f(ChatMessage chatMessage, byte[] bArr) {
        C43430b c43430b = C43430b.f95881a;
        Call<UploadImage> callM95620d = c43430b.m95623c().m95620d(MultipartBody.Part.INSTANCE.createFormData("file", URLEncoder.encode(new File(chatMessage.getContent()).getName(), "UTF-8"), RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, MediaType.INSTANCE.parse("image/jpeg"), 0, 0, 6, (Object) null)));
        c43430b.m95621a(callM95620d);
        callM95620d.enqueue(new c(chatMessage));
    }

    /* JADX INFO: renamed from: d */
    public static final void m94457d(final ChatMessage chatMessage) {
        if (chatMessage.getContent().length() == 0) {
            return;
        }
        if (chatMessage.hasPicUrl()) {
            ChatClient chatClient = ChatClient.INSTANCE.get();
            if (chatClient == null) {
                return;
            }
            chatClient.m20396k(chatMessage);
            return;
        }
        Observable.create(new ObservableOnSubscribe() { // from class: ob.d
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C43010e.m94458e(chatMessage, observableEmitter);
            }
        }).subscribeOn(Schedulers.m87969io()).observeOn(Schedulers.m87969io()).subscribe(new b(chatMessage));
    }
}
