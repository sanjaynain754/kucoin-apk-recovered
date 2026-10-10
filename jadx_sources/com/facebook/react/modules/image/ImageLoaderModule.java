package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.views.image.ReactCallerContextFactory;
import com.facebook.react.views.imagehelper.ImageSource;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p251f4.AbstractC37350a;
import p251f4.InterfaceC37351b;
import p392k4.C40889d;
import p651u3.C45098a;
import p749x5.InterfaceC46071e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImageLoaderModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "ImageLoader")
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, m90084d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "Lcom/facebook/imagepipeline/core/ImagePipeline;", "imagePipeline", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/imagepipeline/core/ImagePipeline;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", "", "requestId", "Lf4/b;", "Ljava/lang/Void;", "request", "", "registerRequest", "(ILf4/b;)V", "removeRequest", "(I)Lf4/b;", "", "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "Lcom/facebook/imagepipeline/core/ImagePipeline;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()Lcom/facebook/imagepipeline/core/ImagePipeline;", "setImagePipeline", "(Lcom/facebook/imagepipeline/core/ImagePipeline;)V", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageLoaderModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoaderModule.kt\ncom/facebook/react/modules/image/ImageLoaderModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {

    @NotNull
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";

    @NotNull
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";

    @NotNull
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";

    @NotNull
    public static final String NAME = "ImageLoader";

    @Nullable
    private ImagePipeline _imagePipeline;

    @Nullable
    private final Object callerContext;

    @Nullable
    private ReactCallerContextFactory callerContextFactory;

    @NotNull
    private final Object enqueuedRequestMonitor;

    @NotNull
    private final SparseArray<InterfaceC37351b<Void>> enqueuedRequests;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        InterfaceC37351b<Void> interfaceC37351bRemoveRequest = removeRequest((int) requestId);
        if (interfaceC37351bRemoveRequest != null) {
            interfaceC37351bRemoveRequest.close();
        }
    }

    private final Object getCallerContext() {
        Object orCreateCallerContext;
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        return (reactCallerContextFactory == null || (orCreateCallerContext = reactCallerContextFactory.getOrCreateCallerContext("", "")) == null) ? this.callerContext : orCreateCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePipeline getImagePipeline() {
        ImagePipeline imagePipeline = this._imagePipeline;
        if (imagePipeline != null) {
            return imagePipeline;
        }
        ImagePipeline imagePipelineM89525a = C40889d.m89525a();
        Intrinsics.checkNotNullExpressionValue(imagePipelineM89525a, "getImagePipeline(...)");
        return imagePipelineM89525a;
    }

    private final void registerRequest(int requestId, InterfaceC37351b<Void> request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC37351b<Void> removeRequest(int requestId) {
        InterfaceC37351b<Void> interfaceC37351b;
        synchronized (this.enqueuedRequestMonitor) {
            interfaceC37351b = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return interfaceC37351b;
    }

    private final void setImagePipeline(ImagePipeline imagePipeline) {
        this._imagePipeline = imagePipeline;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i11 = 0; i11 < size; i11++) {
                    InterfaceC37351b<Void> interfaceC37351bValueAt = this.enqueuedRequests.valueAt(i11);
                    Intrinsics.checkNotNullExpressionValue(interfaceC37351bValueAt, "valueAt(...)");
                    interfaceC37351bValueAt.close();
                }
                this.enqueuedRequests.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(@Nullable String uriString, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString != null && uriString.length() != 0) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            ImageRequest imageRequestM9872a = ImageRequestBuilder.m9851x(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri()).m9872a();
            Intrinsics.checkNotNullExpressionValue(imageRequestM9872a, "build(...)");
            getImagePipeline().m9222k(imageRequestM9872a, getCallerContext()).mo8589b(new AbstractC37350a<AbstractC0110a<InterfaceC46071e>>() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSize$dataSubscriber$1
                @Override // p251f4.AbstractC37350a
                public void onFailureImpl(InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> dataSource) {
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    promise.reject("E_GET_SIZE_FAILURE", dataSource.mo8590c());
                }

                @Override // p251f4.AbstractC37350a
                public void onNewResultImpl(InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> dataSource) {
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    if (dataSource.isFinished()) {
                        AbstractC0110a<InterfaceC46071e> result = dataSource.getResult();
                        try {
                            if (result == null) {
                                promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                                return;
                            }
                            InterfaceC46071e interfaceC46071eM565l = result.m565l();
                            Intrinsics.checkNotNullExpressionValue(interfaceC46071eM565l, "get(...)");
                            InterfaceC46071e interfaceC46071e = interfaceC46071eM565l;
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                            writableMapCreateMap.putInt("width", interfaceC46071e.getWidth());
                            writableMapCreateMap.putInt("height", interfaceC46071e.getHeight());
                            promise.resolve(writableMapCreateMap);
                        } catch (Exception e11) {
                            promise.reject("E_GET_SIZE_FAILURE", e11);
                        } finally {
                            AbstractC0110a.m555j(result);
                        }
                    }
                }
            }, C45098a.m99711a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(@Nullable String uriString, @Nullable ReadableMap headers, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString != null && uriString.length() != 0) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            ImageRequestBuilder imageRequestBuilderM9851x = ImageRequestBuilder.m9851x(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri());
            Intrinsics.checkNotNullExpressionValue(imageRequestBuilderM9851x, "newBuilderWithSource(...)");
            getImagePipeline().m9222k(ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(ReactNetworkImageRequest.INSTANCE, imageRequestBuilderM9851x, headers, null, 4, null), getCallerContext()).mo8589b(new AbstractC37350a<AbstractC0110a<InterfaceC46071e>>() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSizeWithHeaders$dataSubscriber$1
                @Override // p251f4.AbstractC37350a
                public void onFailureImpl(InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> dataSource) {
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    promise.reject("E_GET_SIZE_FAILURE", dataSource.mo8590c());
                }

                @Override // p251f4.AbstractC37350a
                public void onNewResultImpl(InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> dataSource) {
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    if (dataSource.isFinished()) {
                        AbstractC0110a<InterfaceC46071e> result = dataSource.getResult();
                        try {
                            if (result == null) {
                                promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                                return;
                            }
                            InterfaceC46071e interfaceC46071eM565l = result.m565l();
                            Intrinsics.checkNotNullExpressionValue(interfaceC46071eM565l, "get(...)");
                            InterfaceC46071e interfaceC46071e = interfaceC46071eM565l;
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                            writableMapCreateMap.putInt("width", interfaceC46071e.getWidth());
                            writableMapCreateMap.putInt("height", interfaceC46071e.getHeight());
                            promise.resolve(writableMapCreateMap);
                        } catch (Exception e11) {
                            promise.reject("E_GET_SIZE_FAILURE", e11);
                        } finally {
                            AbstractC0110a.m555j(result);
                        }
                    }
                }
            }, C45098a.m99711a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(@Nullable String uriString, double requestIdAsDouble, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        final int i11 = (int) requestIdAsDouble;
        if (uriString != null && uriString.length() != 0) {
            ImageRequest imageRequestM9872a = ImageRequestBuilder.m9851x(Uri.parse(uriString)).m9872a();
            Intrinsics.checkNotNullExpressionValue(imageRequestM9872a, "build(...)");
            InterfaceC37351b<Void> interfaceC37351bM9210B = getImagePipeline().m9210B(imageRequestM9872a, getCallerContext());
            AbstractC37350a<Void> abstractC37350a = new AbstractC37350a<Void>() { // from class: com.facebook.react.modules.image.ImageLoaderModule$prefetchImage$prefetchSubscriber$1
                @Override // p251f4.AbstractC37350a
                public void onFailureImpl(InterfaceC37351b<Void> dataSource) {
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    try {
                        this.this$0.removeRequest(i11);
                        promise.reject("E_PREFETCH_FAILURE", dataSource.mo8590c());
                    } finally {
                        dataSource.close();
                    }
                }

                @Override // p251f4.AbstractC37350a
                public void onNewResultImpl(InterfaceC37351b<Void> dataSource) {
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    if (dataSource.isFinished()) {
                        try {
                            this.this$0.removeRequest(i11);
                            promise.resolve(Boolean.TRUE);
                        } catch (Exception e11) {
                            promise.reject("E_PREFETCH_FAILURE", e11);
                        } finally {
                            dataSource.close();
                        }
                    }
                }
            };
            registerRequest(i11, interfaceC37351bM9210B);
            interfaceC37351bM9210B.mo8589b(abstractC37350a, C45098a.m99711a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(@NotNull final ReadableArray uris, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.image.ImageLoaderModule.queryCache.1
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                ImagePipeline imagePipeline = ImageLoaderModule.this.getImagePipeline();
                int size = uris.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String string = uris.getString(i11);
                    if (string != null && string.length() != 0) {
                        Uri uri = Uri.parse(string);
                        if (imagePipeline.m9230t(uri)) {
                            writableMapCreateMap.putString(string, InterfaceC33617e1.f69653b);
                        } else if (imagePipeline.m9232v(uri)) {
                            writableMapCreateMap.putString(string, "disk");
                        }
                    }
                }
                promise.resolve(writableMapCreateMap);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext, @Nullable Object obj) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext, @NotNull ImagePipeline imagePipeline, @NotNull ReactCallerContextFactory callerContextFactory) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(imagePipeline, "imagePipeline");
        Intrinsics.checkNotNullParameter(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContextFactory = callerContextFactory;
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
