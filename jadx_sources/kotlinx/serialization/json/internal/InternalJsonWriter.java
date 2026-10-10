package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.flutter.plugin.editing.SpellCheckPlugin;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter;", "", "", "value", "", "writeLong", "(J)V", "", "char", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(C)V", "", "text", "c", "(Ljava/lang/String;)V", "b", "Companion", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InternalJsonWriter {
    /* JADX INFO: renamed from: a */
    void mo91791a(char c11);

    /* JADX INFO: renamed from: b */
    void mo91792b(@NotNull String text);

    /* JADX INFO: renamed from: c */
    void mo91793c(@NotNull String text);

    void writeLong(long value);

    /* JADX INFO: compiled from: JsonStreams.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072K\u0010\b\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m90084d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter$Companion;", "", "<init>", "()V", "doWriteEscaping", "", "text", "", "writeImpl", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f92075a = new Companion();

        public final void doWriteEscaping(@NotNull String text, @NotNull Function3<? super String, ? super Integer, ? super Integer, Unit> writeImpl) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(writeImpl, "writeImpl");
            int length = text.length();
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = text.charAt(i12);
                if (cCharAt < C41960x0.m92015b().length && C41960x0.m92015b()[cCharAt] != null) {
                    writeImpl.invoke(text, Integer.valueOf(i11), Integer.valueOf(i12));
                    String str = C41960x0.m92015b()[cCharAt];
                    Intrinsics.checkNotNull(str);
                    writeImpl.invoke(str, 0, Integer.valueOf(str.length()));
                    i11 = i12 + 1;
                }
            }
            writeImpl.invoke(text, Integer.valueOf(i11), Integer.valueOf(text.length()));
        }
    }
}
