package gr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.utils.C19318d;
import com.kubi.utils.C27099x;
import java.lang.reflect.Type;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gr.j */
/* JADX INFO: compiled from: SubscribeConvertAdapter.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lgr/j;", "ResponseIn", "ResponseOut", "Lkr/c;", "", "topic", "Ljava/lang/reflect/Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/reflect/Type;)V", "value", "convert", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)Ljava/lang/Object;", "Ljava/lang/String;", "b", "Ljava/lang/reflect/Type;", "Lcom/kubi/network/api/subscribe/utils/d;", "c", "Lcom/kubi/network/api/subscribe/utils/d;", "topicMatcher", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38008j<ResponseIn, ResponseOut> implements InterfaceC41975c<ResponseIn, ResponseOut> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String topic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C19318d topicMatcher;

    public C38008j(@NotNull String topic, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(type, "type");
        this.topic = topic;
        this.type = type;
        this.topicMatcher = new C19318d(topic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final ResponseOut m85879a(SubscribeMessage value) {
        if (this.topicMatcher.m42761a(value.getTopic())) {
            return Intrinsics.areEqual(this.type, SubscribeMessage.class) ? value : (ResponseOut) C27099x.m66914d(value.getData(), this.type);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kr.InterfaceC41975c
    @Nullable
    public ResponseOut convert(ResponseIn value) {
        if (!(value instanceof SubscribeMessage)) {
            return null;
        }
        SubscribeMessage subscribeMessage = (SubscribeMessage) value;
        if (subscribeMessage.isSocketMessage()) {
            return m85879a(subscribeMessage);
        }
        return null;
    }
}
