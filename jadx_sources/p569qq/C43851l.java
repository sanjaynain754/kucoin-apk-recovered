package p569qq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qq.l */
/* JADX INFO: compiled from: TechnologyPerformance.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lqq/l;", "", "<init>", "()V", "", "name", "", "autoStart", "Lqq/l$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Z)Lqq/l$a;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43851l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43851l f96921a = new C43851l();

    /* JADX INFO: renamed from: qq.l$a */
    /* JADX INFO: compiled from: TechnologyPerformance.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lqq/l$a;", "", "", "start", "()V", InterfaceC33730j9.f70350a, "", "key", "value", "putAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "name", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;J)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo32882a(@NotNull String name, long value);

        void putAttribute(@NotNull String key, @NotNull String value);

        void start();

        void stop();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final a m96588a(@NotNull String name, boolean autoStart) {
        Intrinsics.checkNotNullParameter(name, "name");
        a aVarMo32879a = C43848i.f96913a.m96586e().mo32843e().mo32879a(name);
        if (autoStart) {
            aVarMo32879a.start();
        }
        return aVarMo32879a;
    }
}
