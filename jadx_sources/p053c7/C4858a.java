package p053c7;

import androidx.camera.core.impl.C1023h0;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c7.a */
/* JADX INFO: compiled from: SystraceMessage.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\t\u0010\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lc7/a;", "", "<init>", "()V", "", "tag", "", "sectionName", "Lc7/a$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JLjava/lang/String;)Lc7/a$a;", "b", "(J)Lc7/a$a;", "", "Z", "INCLUDE_ARGS", "c", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C4858a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4858a f5028a = new C4858a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public static boolean INCLUDE_ARGS;

    /* JADX INFO: renamed from: c7.a$a */
    /* JADX INFO: compiled from: SystraceMessage.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lc7/a$a;", "", "<init>", "()V", "", "c", "", "key", "value", "b", "(Ljava/lang/String;Ljava/lang/Object;)Lc7/a$a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;I)Lc7/a$a;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static abstract class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract a mo4992a(@NotNull String key, int value);

        @NotNull
        /* JADX INFO: renamed from: b */
        public abstract a mo4993b(@NotNull String key, @NotNull Object value);

        /* JADX INFO: renamed from: c */
        public abstract void mo4994c();
    }

    /* JADX INFO: renamed from: c7.a$b */
    /* JADX INFO: compiled from: SystraceMessage.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lc7/a$b;", "Lc7/a$a;", "", "tag", "<init>", "(J)V", "", "c", "()V", "", "key", "", "value", "b", "(Ljava/lang/String;Ljava/lang/Object;)Lc7/a$a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;I)Lc7/a$a;", "J", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long tag;

        @Override // p053c7.C4858a.a
        @NotNull
        /* JADX INFO: renamed from: a */
        public a mo4992a(@NotNull String key, int value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // p053c7.C4858a.a
        @NotNull
        /* JADX INFO: renamed from: b */
        public a mo4993b(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this;
        }

        @Override // p053c7.C4858a.a
        /* JADX INFO: renamed from: c */
        public void mo4994c() {
            Systrace.m10667i(this.tag);
        }

        public b(long j11) {
            this.tag = j11;
        }
    }

    /* JADX INFO: renamed from: c7.a$c */
    /* JADX INFO: compiled from: SystraceMessage.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lc7/a$c;", "Lc7/a$a;", "", "tag", "", "sectionName", "<init>", "(JLjava/lang/String;)V", "", "c", "()V", "key", "", "value", "b", "(Ljava/lang/String;Ljava/lang/Object;)Lc7/a$a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;I)Lc7/a$a;", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "J", "Ljava/lang/String;", "", "Ljava/util/List;", "args", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long tag;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String sectionName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final List<String> args;

        @Override // p053c7.C4858a.a
        @NotNull
        /* JADX INFO: renamed from: a */
        public a mo4992a(@NotNull String key, int value) {
            Intrinsics.checkNotNullParameter(key, "key");
            m4995d(key, String.valueOf(value));
            return this;
        }

        @Override // p053c7.C4858a.a
        @NotNull
        /* JADX INFO: renamed from: b */
        public a mo4993b(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            m4995d(key, value.toString());
            return this;
        }

        @Override // p053c7.C4858a.a
        /* JADX INFO: renamed from: c */
        public void mo4994c() {
            String str;
            long j11 = this.tag;
            String str2 = this.sectionName;
            if (!C4858a.INCLUDE_ARGS || this.args.isEmpty()) {
                str = "";
            } else {
                str = " (" + C1023h0.m1970a(", ", this.args) + ")";
            }
            Systrace.m10662c(j11, str2 + str);
        }

        /* JADX INFO: renamed from: d */
        public final void m4995d(String key, String value) {
            this.args.add(key + ": " + value);
        }

        public c(long j11, @NotNull String sectionName) {
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            this.tag = j11;
            this.sectionName = sectionName;
            this.args = new ArrayList();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final a m4991b(long tag) {
        return new b(tag);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final a m4990a(long tag, @NotNull String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        return new c(tag, sectionName);
    }
}
