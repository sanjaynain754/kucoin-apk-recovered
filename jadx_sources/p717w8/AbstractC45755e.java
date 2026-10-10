package p717w8;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.IOException;
import java.lang.reflect.Type;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.C44971x;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44950c0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44961n;
import tg0.InterfaceC44963p;

/* JADX INFO: renamed from: w8.e */
/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0001\u001c¨\u0006\u001d"}, m90084d2 = {"Lw8/e;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/c;", "loader", "Lokhttp3/ResponseBody;", TtmlNode.TAG_BODY, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ltg0/c;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "Ltg0/p;", "saver", "value", "Lokhttp3/RequestBody;", "c", "(Lokhttp3/MediaType;Ltg0/p;Ljava/lang/Object;)Lokhttp3/RequestBody;", "Ljava/lang/reflect/Type;", "type", "Ltg0/d;", "serializer", "(Ljava/lang/reflect/Type;)Ltg0/d;", "Ltg0/n;", "b", "()Ltg0/n;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Lw8/e$a;", "retrofit2-kotlinx-serialization-converter"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AbstractC45755e {

    /* JADX INFO: renamed from: w8.e$a */
    /* JADX INFO: compiled from: Serializer.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lw8/e$a;", "Lw8/e;", "Ltg0/c0;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "<init>", "(Ltg0/c0;)V", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/c;", "loader", "Lokhttp3/ResponseBody;", TtmlNode.TAG_BODY, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ltg0/c;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "Ltg0/p;", "saver", "value", "Lokhttp3/RequestBody;", "c", "(Lokhttp3/MediaType;Ltg0/p;Ljava/lang/Object;)Lokhttp3/RequestBody;", "Ltg0/c0;", "d", "()Ltg0/c0;", "retrofit2-kotlinx-serialization-converter"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a extends AbstractC45755e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC44950c0 format;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InterfaceC44950c0 format) {
            super(null);
            Intrinsics.checkNotNullParameter(format, "format");
            this.format = format;
        }

        @Override // p717w8.AbstractC45755e
        /* JADX INFO: renamed from: a */
        public <T> T mo101009a(@NotNull InterfaceC44949c<? extends T> loader, @NotNull ResponseBody body) throws IOException {
            Intrinsics.checkNotNullParameter(loader, "loader");
            Intrinsics.checkNotNullParameter(body, "body");
            String strString = body.string();
            Intrinsics.checkNotNullExpressionValue(strString, "body.string()");
            return (T) mo101010b().mo99408a(loader, strString);
        }

        @Override // p717w8.AbstractC45755e
        @NotNull
        /* JADX INFO: renamed from: c */
        public <T> RequestBody mo101011c(@NotNull MediaType contentType, @NotNull InterfaceC44963p<? super T> saver, T value) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(saver, "saver");
            RequestBody requestBodyCreate = RequestBody.create(contentType, mo101010b().mo99409b(saver, value));
            Intrinsics.checkNotNullExpressionValue(requestBodyCreate, "create(contentType, string)");
            return requestBodyCreate;
        }

        @Override // p717w8.AbstractC45755e
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
        public InterfaceC44950c0 mo101010b() {
            return this.format;
        }
    }

    public /* synthetic */ AbstractC45755e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract <T> T mo101009a(@NotNull InterfaceC44949c<? extends T> loader, @NotNull ResponseBody body);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract InterfaceC44961n mo101010b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract <T> RequestBody mo101011c(@NotNull MediaType contentType, @NotNull InterfaceC44963p<? super T> saver, T value);

    public AbstractC45755e() {
    }

    @NotNull
    public final InterfaceC44951d<Object> serializer(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return C44971x.serializer(mo101010b().getSerializersModule(), type);
    }
}
