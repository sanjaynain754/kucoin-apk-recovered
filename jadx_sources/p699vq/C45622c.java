package p699vq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43851l;
import p642tq.InterfaceC45062e;
import p642tq.InterfaceC45063f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vq.c */
/* JADX INFO: compiled from: NoPerformance.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lvq/c;", "Ltq/f;", "<init>", "()V", "", "name", "operation", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "category", "Ltq/e;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltq/e;", "Lqq/l$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lqq/l$a;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C45622c implements InterfaceC45063f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45622c f102750a = new C45622c();

    /* JADX INFO: renamed from: vq.c$a */
    /* JADX INFO: compiled from: NoPerformance.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lvq/c$a;", "Lqq/l$a;", "<init>", "()V", "", "start", InterfaceC33730j9.f70350a, "", "key", "value", "putAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "name", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;J)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class a implements C43851l.a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f102751a = new a();

        @Override // p569qq.C43851l.a
        /* JADX INFO: renamed from: a */
        public void mo32882a(@NotNull String name, long value) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // p569qq.C43851l.a
        public void putAttribute(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
        }

        @Override // p569qq.C43851l.a
        public void start() {
        }

        @Override // p569qq.C43851l.a
        public void stop() {
        }
    }

    @Override // p642tq.InterfaceC45063f
    @NotNull
    /* JADX INFO: renamed from: a */
    public C43851l.a mo32879a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a.f102751a;
    }

    @Override // p642tq.InterfaceC45063f
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC45062e mo32880b(@NotNull String name, @NotNull String operation, @Nullable String description, @Nullable String category) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return C45621b.f102749a;
    }
}
