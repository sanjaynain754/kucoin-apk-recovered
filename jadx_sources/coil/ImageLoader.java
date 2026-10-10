package coil;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.bitmap.BitmapPool;
import coil.bitmap.RealBitmapPool;
import coil.bitmap.RealBitmapReferenceCounter;
import coil.memory.RealWeakMemoryCache;
import coil.memory.StrongMemoryCache;
import coil.request.DefaultRequestOptions;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.C4448e;
import kotlin.C4452i;
import kotlin.Function0;
import kotlin.ImageLoaderOptions;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612s0.C44261b;
import p612s0.C44262c;
import p612s0.InterfaceC44260a;
import p744x0.C45968c;
import p744x0.C45973h;
import p744x0.InterfaceC45975j;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m90084d2 = {"Lcoil/ImageLoader;", "", "Builder", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface ImageLoader {

    /* JADX INFO: compiled from: ImageLoader.kt */
    @Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-¨\u00061"}, m90084d2 = {"Lcoil/ImageLoader$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lokhttp3/Call$Factory;", "c", "()Lokhttp3/Call$Factory;", "Lx0/h;", "d", "()Lx0/h;", "Lcoil/ImageLoader;", "b", "()Lcoil/ImageLoader;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "applicationContext", "Lcoil/request/DefaultRequestOptions;", "Lcoil/request/DefaultRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lokhttp3/Call$Factory;", "callFactory", "Lcoil/EventListener$Factory;", "Lcoil/EventListener$Factory;", "eventListenerFactory", "Lcoil/a;", "e", "Lcoil/a;", "componentRegistry", "Lb1/f;", "f", "Lb1/f;", "options", "g", "Lx0/h;", "memoryCache", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "D", "availableMemoryPercentage", "i", "bitmapPoolPercentage", "", "j", "Z", "bitmapPoolingEnabled", "k", "trackWeakReferences", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context applicationContext;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public DefaultRequestOptions defaults;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public Call.Factory callFactory;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public EventListener.Factory eventListenerFactory;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public C5039a componentRegistry;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public ImageLoaderOptions options;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public C45973h memoryCache;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public double availableMemoryPercentage;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public double bitmapPoolPercentage;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public boolean bitmapPoolingEnabled;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public boolean trackWeakReferences;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
            this.defaults = DefaultRequestOptions.f5824n;
            this.callFactory = null;
            this.eventListenerFactory = null;
            this.componentRegistry = null;
            this.options = new ImageLoaderOptions(false, false, false, 7, null);
            this.memoryCache = null;
            C4452i c4452i = C4452i.f3855a;
            this.availableMemoryPercentage = c4452i.m4246e(applicationContext);
            this.bitmapPoolPercentage = c4452i.m4247f();
            this.bitmapPoolingEnabled = true;
            this.trackWeakReferences = true;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final ImageLoader m5443b() {
            C45973h c45973hM5445d = this.memoryCache;
            if (c45973hM5445d == null) {
                c45973hM5445d = m5445d();
            }
            C45973h c45973h = c45973hM5445d;
            Context context = this.applicationContext;
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            BitmapPool bitmapPool = c45973h.getBitmapPool();
            Call.Factory factoryM5444c = this.callFactory;
            if (factoryM5444c == null) {
                factoryM5444c = m5444c();
            }
            Call.Factory factory = factoryM5444c;
            EventListener.Factory factory2 = this.eventListenerFactory;
            if (factory2 == null) {
                factory2 = EventListener.Factory.f5702b;
            }
            EventListener.Factory factory3 = factory2;
            C5039a c5039a = this.componentRegistry;
            if (c5039a == null) {
                c5039a = new C5039a();
            }
            return new RealImageLoader(context, defaultRequestOptions, bitmapPool, c45973h, factory, factory3, c5039a, this.options, null);
        }

        /* JADX INFO: renamed from: c */
        public final Call.Factory m5444c() {
            return Function0.m4234b(new p852kotlin.jvm.functions.Function0<Call.Factory>() { // from class: coil.ImageLoader$Builder$buildDefaultCallFactory$1
                {
                    super(0);
                }

                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final Call.Factory invoke() {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    C4448e c4448e = C4448e.f3851a;
                    OkHttpClient okHttpClientBuild = builder.cache(C4448e.m4237a(this.this$0.applicationContext)).build();
                    Intrinsics.checkNotNullExpressionValue(okHttpClientBuild, "Builder()\n                .cache(CoilUtils.createDefaultCache(applicationContext))\n                .build()");
                    return okHttpClientBuild;
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public final C45973h m5445d() {
            long jM4243b = C4452i.f3855a.m4243b(this.applicationContext, this.availableMemoryPercentage);
            int i11 = (int) ((this.bitmapPoolingEnabled ? this.bitmapPoolPercentage : 0.0d) * jM4243b);
            int i12 = (int) (jM4243b - ((long) i11));
            BitmapPool c44261b = i11 == 0 ? new C44261b() : new RealBitmapPool(i11, null, null, null, 6, null);
            InterfaceC45975j realWeakMemoryCache = this.trackWeakReferences ? new RealWeakMemoryCache(null) : C45968c.f103406a;
            InterfaceC44260a realBitmapReferenceCounter = this.bitmapPoolingEnabled ? new RealBitmapReferenceCounter(realWeakMemoryCache, c44261b, null) : C44262c.f97809a;
            return new C45973h(StrongMemoryCache.INSTANCE.invoke(realWeakMemoryCache, realBitmapReferenceCounter, i12, null), realWeakMemoryCache, realBitmapReferenceCounter, c44261b);
        }
    }

    /* JADX INFO: compiled from: ImageLoader.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcoil/ImageLoader$Companion;", "", "()V", "invoke", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "create", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5716a = new Companion();

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final ImageLoader create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Builder(context).m5443b();
        }
    }
}
