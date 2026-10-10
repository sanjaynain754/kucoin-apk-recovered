package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.size.Precision;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.messaging.Constants;
import kotlin.C4452i;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003a1.InterfaceC0010b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultRequestOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b+\u0018\u0000 F2\u00020\u0001:\u0001GB\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010A¨\u0006H"}, m90084d2 = {"Lcoil/request/DefaultRequestOptions;", "", "Lkotlinx/coroutines/j0;", "dispatcher", "La1/b;", "transition", "Lcoil/size/Precision;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Landroid/graphics/drawable/Drawable;", ReactTextInputShadowNode.PROP_PLACEHOLDER, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallback", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Lkotlinx/coroutines/j0;La1/b;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/coroutines/j0;", "getDispatcher", "()Lkotlinx/coroutines/j0;", "b", "La1/b;", "getTransition", "()La1/b;", "c", "Lcoil/size/Precision;", "getPrecision", "()Lcoil/size/Precision;", "d", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "e", "Z", "getAllowHardware", "()Z", "f", "getAllowRgb565", "g", "Landroid/graphics/drawable/Drawable;", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", CmcdData.Factory.STREAMING_FORMAT_HLS, "getError", "i", "getFallback", "j", "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "k", "getDiskCachePolicy", CmcdData.Factory.STREAM_TYPE_LIVE, "getNetworkCachePolicy", "m", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class DefaultRequestOptions {

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final DefaultRequestOptions f5824n = new DefaultRequestOptions(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final AbstractC41697j0 dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final InterfaceC0010b transition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final Precision precision;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final boolean allowHardware;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean allowRgb565;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final Drawable placeholder;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final Drawable error;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final Drawable fallback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    public final CachePolicy memoryCachePolicy;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    public final CachePolicy diskCachePolicy;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    public final CachePolicy networkCachePolicy;

    public DefaultRequestOptions() {
        this(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultRequestOptions)) {
            return false;
        }
        DefaultRequestOptions defaultRequestOptions = (DefaultRequestOptions) other;
        return Intrinsics.areEqual(this.dispatcher, defaultRequestOptions.dispatcher) && Intrinsics.areEqual(this.transition, defaultRequestOptions.transition) && this.precision == defaultRequestOptions.precision && this.bitmapConfig == defaultRequestOptions.bitmapConfig && this.allowHardware == defaultRequestOptions.allowHardware && this.allowRgb565 == defaultRequestOptions.allowRgb565 && Intrinsics.areEqual(this.placeholder, defaultRequestOptions.placeholder) && Intrinsics.areEqual(this.error, defaultRequestOptions.error) && Intrinsics.areEqual(this.fallback, defaultRequestOptions.fallback) && this.memoryCachePolicy == defaultRequestOptions.memoryCachePolicy && this.diskCachePolicy == defaultRequestOptions.diskCachePolicy && this.networkCachePolicy == defaultRequestOptions.networkCachePolicy;
    }

    public DefaultRequestOptions(@NotNull AbstractC41697j0 dispatcher, @NotNull InterfaceC0010b transition, @NotNull Precision precision, @NotNull Bitmap.Config bitmapConfig, boolean z11, boolean z12, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @NotNull CachePolicy memoryCachePolicy, @NotNull CachePolicy diskCachePolicy, @NotNull CachePolicy networkCachePolicy) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(precision, "precision");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(memoryCachePolicy, "memoryCachePolicy");
        Intrinsics.checkNotNullParameter(diskCachePolicy, "diskCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "networkCachePolicy");
        this.dispatcher = dispatcher;
        this.transition = transition;
        this.precision = precision;
        this.bitmapConfig = bitmapConfig;
        this.allowHardware = z11;
        this.allowRgb565 = z12;
        this.placeholder = drawable;
        this.error = drawable2;
        this.fallback = drawable3;
        this.memoryCachePolicy = memoryCachePolicy;
        this.diskCachePolicy = diskCachePolicy;
        this.networkCachePolicy = networkCachePolicy;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.dispatcher.hashCode() * 31) + this.transition.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.bitmapConfig.hashCode()) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31;
        Drawable drawable = this.placeholder;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.error;
        int iHashCode3 = (iHashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.fallback;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }

    @NotNull
    public String toString() {
        return "DefaultRequestOptions(dispatcher=" + this.dispatcher + ", transition=" + this.transition + ", precision=" + this.precision + ", bitmapConfig=" + this.bitmapConfig + ", allowHardware=" + this.allowHardware + ", allowRgb565=" + this.allowRgb565 + ", placeholder=" + this.placeholder + ", error=" + this.error + ", fallback=" + this.fallback + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ')';
    }

    public /* synthetic */ DefaultRequestOptions(AbstractC41697j0 abstractC41697j0, InterfaceC0010b interfaceC0010b, Precision precision, Bitmap.Config config, boolean z11, boolean z12, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C41782z0.m91392b() : abstractC41697j0, (i11 & 2) != 0 ? InterfaceC0010b.f11b : interfaceC0010b, (i11 & 4) != 0 ? Precision.AUTOMATIC : precision, (i11 & 8) != 0 ? C4452i.f3855a.m4245d() : config, (i11 & 16) != 0 ? true : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? null : drawable, (i11 & 128) != 0 ? null : drawable2, (i11 & 256) != 0 ? null : drawable3, (i11 & 512) != 0 ? CachePolicy.ENABLED : cachePolicy, (i11 & 1024) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i11 & 2048) != 0 ? CachePolicy.ENABLED : cachePolicy3);
    }
}
