package com.facebook.react.modules.fresco;

import android.content.Context;
import com.facebook.imagepipeline.backends.okhttp3.C5641a;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.modules.network.OkHttpCompat;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p392k4.C40887b;
import p392k4.C40889d;
import p684v5.C45422c;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FrescoModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = FrescoModule.NAME, needsEagerInit = true)
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001eB)\b\u0007\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/modules/common/ModuleDataCleaner$Cleanable;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "clearOnDestroy", "", "imagePipelineConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLcom/facebook/imagepipeline/core/ImagePipelineConfig;)V", "imagePipeline", "Lcom/facebook/imagepipeline/core/ImagePipeline;", "hasBeenInitializedExternally", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/imagepipeline/core/ImagePipeline;ZZ)V", "config", "pipeline", "initialize", "", "getName", "", "clearSensitiveData", "onHostResume", "onHostPause", "onHostDestroy", "getImagePipeline", "()Lcom/facebook/imagepipeline/core/ImagePipeline;", "invalidate", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class FrescoModule extends ReactContextBaseJavaModule implements ModuleDataCleaner.Cleanable, LifecycleEventListener, TurboModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "FrescoModule";
    private static boolean hasBeenInitialized;
    private final boolean clearOnDestroy;

    @Nullable
    private ImagePipelineConfig config;

    @Nullable
    private ImagePipeline pipeline;

    /* JADX INFO: compiled from: FrescoModule.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule$Companion;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "context", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "getDefaultConfig", "(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "", "hasBeenInitialized", "()Z", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "getDefaultConfigBuilder", "(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "", "NAME", "Ljava/lang/String;", "Z", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ImagePipelineConfig.C5651a getDefaultConfigBuilder(@NotNull ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            HashSet hashSet = new HashSet();
            hashSet.add(new SystraceRequestListener());
            OkHttpClient okHttpClientCreateClient = OkHttpClientProvider.createClient();
            C45422c.a aVar = new C45422c.a();
            if (ReactNativeFeatureFlags.loadVectorDrawablesOnImages()) {
                XmlFormat.INSTANCE.addDecodingCapability(aVar, context);
            }
            OkHttpCompat.getCookieJarContainer(okHttpClientCreateClient).setCookieJar(new JavaNetCookieJar(new ForwardingCookieHandler(context)));
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Intrinsics.checkNotNull(okHttpClientCreateClient);
            return C5641a.m9117a(applicationContext, okHttpClientCreateClient).m9297S(new ReactOkHttpNetworkFetcher(okHttpClientCreateClient)).m9296R(aVar.m100385d()).m9295Q(DownsampleMode.AUTO).m9298T(hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ImagePipelineConfig getDefaultConfig(ReactContext context) {
            return getDefaultConfigBuilder(context).m9299a();
        }

        @JvmStatic
        public final boolean hasBeenInitialized() {
            return FrescoModule.hasBeenInitialized;
        }
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, null, 6, null);
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, @Nullable ImagePipeline imagePipeline) {
        this(reactApplicationContext, imagePipeline, false, false, 12, null);
    }

    @JvmStatic
    @NotNull
    public static final ImagePipelineConfig.C5651a getDefaultConfigBuilder(@NotNull ReactContext reactContext) {
        return INSTANCE.getDefaultConfigBuilder(reactContext);
    }

    private final ImagePipeline getImagePipeline() {
        if (this.pipeline == null) {
            this.pipeline = C40889d.m89525a();
        }
        return this.pipeline;
    }

    @JvmStatic
    public static final boolean hasBeenInitialized() {
        return INSTANCE.hasBeenInitialized();
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        ImagePipeline imagePipeline;
        if (INSTANCE.hasBeenInitialized() && this.clearOnDestroy && (imagePipeline = getImagePipeline()) != null) {
            imagePipeline.m9217e();
        }
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, @Nullable ImagePipeline imagePipeline, boolean z11) {
        this(reactApplicationContext, imagePipeline, z11, false, 8, null);
    }

    @Override // com.facebook.react.modules.common.ModuleDataCleaner.Cleanable
    public void clearSensitiveData() {
        ImagePipeline imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            imagePipeline.m9215c();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        Companion companion = INSTANCE;
        if (!companion.hasBeenInitialized()) {
            ImagePipelineConfig defaultConfig = this.config;
            if (defaultConfig == null) {
                Intrinsics.checkNotNull(reactApplicationContext);
                defaultConfig = companion.getDefaultConfig(reactApplicationContext);
            }
            C40887b.a aVarM89514e = C40887b.m89514e();
            Intrinsics.checkNotNullExpressionValue(aVarM89514e, "newBuilder(...)");
            if (ReactNativeFeatureFlags.loadVectorDrawablesOnImages()) {
                aVarM89514e.m89523e(XmlFormat.INSTANCE.getDrawableFactory());
            }
            C40889d.m89527c(reactApplicationContext.getApplicationContext(), defaultConfig, aVarM89514e.m89524f());
            hasBeenInitialized = true;
        } else if (this.config != null) {
            C45999a.m101488I(ReactConstants.TAG, "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, boolean z11) {
        this(reactApplicationContext, z11, null, 4, null);
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z11, ImagePipelineConfig imagePipelineConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : imagePipelineConfig);
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, boolean z11, @Nullable ImagePipelineConfig imagePipelineConfig) {
        super(reactApplicationContext);
        this.clearOnDestroy = z11;
        this.config = imagePipelineConfig;
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, imagePipeline, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? false : z12);
    }

    @JvmOverloads
    public FrescoModule(@Nullable ReactApplicationContext reactApplicationContext, @Nullable ImagePipeline imagePipeline, boolean z11, boolean z12) {
        this(reactApplicationContext, z11, null, 4, null);
        this.pipeline = imagePipeline;
        if (z12) {
            hasBeenInitialized = true;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
