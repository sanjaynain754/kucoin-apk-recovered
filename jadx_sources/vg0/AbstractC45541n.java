package vg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: vg0.n */
/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m90084d2 = {"Lvg0/n;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lvg0/d;", "Lvg0/e;", "Lvg0/n$a;", "Lvg0/n$b;", "Lvg0/o;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC45541n {

    /* JADX INFO: renamed from: vg0.n$a */
    /* JADX INFO: compiled from: SerialKinds.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lvg0/n$a;", "Lvg0/n;", "<init>", "()V", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a extends AbstractC45541n {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f102628a = new a();

        public a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vg0.n$b */
    /* JADX INFO: compiled from: SerialKinds.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lvg0/n$b;", "Lvg0/n;", "<init>", "()V", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class b extends AbstractC45541n {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f102629a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC45541n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC45541n() {
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NotNull
    public String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }
}
