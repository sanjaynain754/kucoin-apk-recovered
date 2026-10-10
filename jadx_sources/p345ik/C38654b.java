package p345ik;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ik.b */
/* JADX INFO: compiled from: Constants.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\u0007R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lik/b;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "CATEGORY_GLOBAL", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "CATEGORY_CACHE", "d", "CATEGORY_SERVER", "e", "NO_NETWORK", "", "f", "[Ljava/lang/String;", "getNO_IPS", "()[Ljava/lang/String;", "NO_IPS", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constants.kt\ncom/kubi/httpdns/utils/Constants\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,15:1\n26#2:16\n*S KotlinDebug\n*F\n+ 1 Constants.kt\ncom/kubi/httpdns/utils/Constants\n*L\n13#1:16\n*E\n"})
public final class C38654b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38654b f86659a = new C38654b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String CATEGORY_GLOBAL = "NetworkChain:Dns";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final String CATEGORY_CACHE = "httpdns-cache";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final String CATEGORY_SERVER = "httpdns-server";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final String NO_NETWORK = "no-network";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final String[] NO_IPS = new String[0];

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m87380a() {
        return CATEGORY_CACHE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m87381b() {
        return CATEGORY_GLOBAL;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m87382c() {
        return CATEGORY_SERVER;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m87383d() {
        return NO_NETWORK;
    }
}
