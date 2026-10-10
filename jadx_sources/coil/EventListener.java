package coil;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m90084d2 = {"Lcoil/EventListener;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Factory", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface EventListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5704a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final EventListener f5700b = new C5036a();

    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcoil/EventListener$Factory;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public interface Factory {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: b */
        @JvmField
        @NotNull
        public static final Factory f5702b;

        /* JADX INFO: compiled from: EventListener.kt */
        @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\bR\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\t"}, m90084d2 = {"Lcoil/EventListener$Factory$Companion;", "", "()V", "NONE", "Lcoil/EventListener$Factory;", "invoke", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/EventListener;", "create", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ Companion f5703a = new Companion();

            @JvmStatic
            @JvmName(name = "create")
            @NotNull
            public final Factory create(@NotNull final EventListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                return new Factory() { // from class: coil.b
                };
            }
        }

        static {
            Companion companion = Companion.f5703a;
            INSTANCE = companion;
            f5702b = companion.create(EventListener.f5700b);
        }
    }

    /* JADX INFO: renamed from: coil.EventListener$a */
    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"coil/EventListener$a", "Lcoil/EventListener;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C5036a implements EventListener {
    }

    /* JADX INFO: renamed from: coil.EventListener$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, m90084d2 = {"Lcoil/EventListener$b;", "", "<init>", "()V", "Lcoil/EventListener;", "NONE", "Lcoil/EventListener;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5704a = new Companion();
    }
}
