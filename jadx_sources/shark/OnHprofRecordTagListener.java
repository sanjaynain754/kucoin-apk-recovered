package shark;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: OnHprofRecordTagListener.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\u000bJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Lshark/OnHprofRecordTagListener;", "", "Lshark/HprofRecordTag;", "tag", "", SessionDescription.ATTR_LENGTH, "Lshark/HprofRecordReader;", "reader", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public interface OnHprofRecordTagListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f98231a;

    /* JADX INFO: compiled from: OnHprofRecordTagListener.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042 \b\u0004\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006H\u0086\n¨\u0006\u000b"}, m90084d2 = {"Lshark/OnHprofRecordTagListener$Companion;", "", "()V", "invoke", "Lshark/OnHprofRecordTagListener;", "block", "Lkotlin/Function3;", "Lshark/HprofRecordTag;", "", "Lshark/HprofRecordReader;", "", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f98231a = new Companion();

        /* JADX INFO: renamed from: shark.OnHprofRecordTagListener$Companion$a */
        /* JADX INFO: compiled from: OnHprofRecordTagListener.kt */
        @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"shark/OnHprofRecordTagListener$Companion$a", "Lshark/OnHprofRecordTagListener;", "Lshark/HprofRecordTag;", "tag", "", SessionDescription.ATTR_LENGTH, "Lshark/HprofRecordReader;", "reader", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C44438a implements OnHprofRecordTagListener {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Function3 f98232b;

            public C44438a(Function3 function3) {
                this.f98232b = function3;
            }

            @Override // shark.OnHprofRecordTagListener
            /* JADX INFO: renamed from: a */
            public void mo98153a(@NotNull HprofRecordTag tag, long length, @NotNull HprofRecordReader reader) {
                this.f98232b.invoke(tag, Long.valueOf(length), reader);
            }
        }

        @NotNull
        public final OnHprofRecordTagListener invoke(@NotNull Function3<? super HprofRecordTag, ? super Long, ? super HprofRecordReader, Unit> block) {
            return new C44438a(block);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo98153a(@NotNull HprofRecordTag tag, long length, @NotNull HprofRecordReader reader);
}
