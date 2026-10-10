package gr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.utils.C27099x;
import java.lang.reflect.Type;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gr.i */
/* JADX INFO: compiled from: SubscribeConvertAdapter.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lgr/i;", "ResponseIn", "ResponseOut", "Lkr/c;", "Ljava/lang/reflect/Type;", "type", "<init>", "(Ljava/lang/reflect/Type;)V", "value", "convert", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38007i<ResponseIn, ResponseOut> implements InterfaceC41975c<ResponseIn, ResponseOut> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    public C38007i(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final ResponseOut m85878a(SubscribeMessage value) {
        return Intrinsics.areEqual(this.type, SubscribeMessage.class) ? value : (ResponseOut) C27099x.m66914d(value.getData(), this.type);
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
            return null;
        }
        return m85878a(subscribeMessage);
    }
}
