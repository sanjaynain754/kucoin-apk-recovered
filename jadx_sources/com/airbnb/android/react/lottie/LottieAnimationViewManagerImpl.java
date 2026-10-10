package com.airbnb.android.react.lottie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: LottieAnimationViewManagerImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0019H\u0007J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u001a\u0010!\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0013H\u0007J\u001a\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010/\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u0002052\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010A\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010C\u001a\u00020\u00102\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010F\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010E2\u0006\u0010#\u001a\u00020$H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006H"}, m90084d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;", "", "<init>", "()V", "REACT_CLASS", "", "exportedViewConstants", "", "getExportedViewConstants$annotations", "getExportedViewConstants", "()Ljava/util/Map;", "createViewInstance", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "sendOnAnimationFinishEvent", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isCancelled", "", "sendAnimationFailureEvent", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "sendAnimationLoadedEvent", "getExportedCustomDirectEventTypeConstants", "", "play", "startFrame", "", "endFrame", "reset", "pause", "resume", "setSourceName", "name", "viewManager", "Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;", "setSourceJson", JPushConstants.Analysis.KEY_JSON, "setSourceURL", "urlString", "setSourceDotLottieURI", "uri", "setCacheComposition", "cacheComposition", "setResizeMode", ViewProps.RESIZE_MODE, "setRenderMode", "renderMode", "setHardwareAcceleration", "hardwareAccelerationAndroid", "setProgress", "progress", "", "setSpeed", "speed", "", "setLoop", "loop", "setAutoPlay", "autoPlay", "setEnableMergePaths", "enableMergePaths", "setEnableSafeMode", "enableSafeMode", "setImageAssetsFolder", "imageAssetsFolder", "setColorFilters", "colorFilters", "Lcom/facebook/react/bridge/ReadableArray;", "setTextFilters", "textFilters", "lottie-react-native_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LottieAnimationViewManagerImpl {

    @NotNull
    public static final LottieAnimationViewManagerImpl INSTANCE = new LottieAnimationViewManagerImpl();

    @NotNull
    public static final String REACT_CLASS = "LottieAnimationView";

    @JvmStatic
    @NotNull
    public static final LottieAnimationView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return lottieAnimationView;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapM10224of = MapBuilder.m10224of(OnAnimationFinishEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onAnimationFinish"), OnAnimationFailureEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onAnimationFailure"), OnAnimationLoadedEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onAnimationLoaded"));
        Intrinsics.checkNotNullExpressionValue(mapM10224of, "of(...)");
        return mapM10224of;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$1(final boolean z11, int i11, int i12, final LottieAnimationView lottieAnimationView) {
        if (!z11) {
            C5080h composition = lottieAnimationView.getComposition();
            Integer numValueOf = composition != null ? Integer.valueOf((int) composition.m5665p()) : null;
            C5080h composition2 = lottieAnimationView.getComposition();
            Integer numValueOf2 = composition2 != null ? Integer.valueOf((int) composition2.m5655f()) : null;
            int minFrame = (int) lottieAnimationView.getMinFrame();
            int maxFrame = (int) lottieAnimationView.getMaxFrame();
            if (numValueOf != null && numValueOf2 != null && (minFrame != numValueOf.intValue() || maxFrame != numValueOf2.intValue())) {
                lottieAnimationView.setMinAndMaxFrame(numValueOf.intValue(), numValueOf2.intValue());
            }
        } else if (i11 > i12) {
            lottieAnimationView.setMinAndMaxFrame(i12, i11);
            if (lottieAnimationView.getSpeed() > 0.0f) {
                lottieAnimationView.reverseAnimationSpeed();
            }
        } else {
            lottieAnimationView.setMinAndMaxFrame(i11, i12);
            if (lottieAnimationView.getSpeed() < 0.0f) {
                lottieAnimationView.reverseAnimationSpeed();
            }
        }
        if (!ViewCompat.isAttachedToWindow(lottieAnimationView)) {
            lottieAnimationView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$play$1$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v11) {
                    Intrinsics.checkNotNullParameter(v11, "v");
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) v11;
                    if (z11) {
                        lottieAnimationView.playAnimation();
                    } else {
                        lottieAnimationView.resumeAnimation();
                    }
                    lottieAnimationView2.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v11) {
                    Intrinsics.checkNotNullParameter(v11, "v");
                    ((LottieAnimationView) v11).removeOnAttachStateChangeListener(this);
                }
            });
        } else if (z11) {
            lottieAnimationView.playAnimation();
        } else {
            lottieAnimationView.resumeAnimation();
        }
    }

    private LottieAnimationViewManagerImpl() {
    }

    @NotNull
    public static final Map<String, Object> getExportedViewConstants() {
        Map<String, Object> mapBuild = MapBuilder.builder().put("VERSION", 1).build();
        Intrinsics.checkNotNullExpressionValue(mapBuild, "build(...)");
        return mapBuild;
    }

    @JvmStatic
    public static final void pause(@NotNull final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.f
            @Override // java.lang.Runnable
            public final void run() {
                LottieAnimationViewManagerImpl.pause$lambda$3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$3(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
            lottieAnimationView.pauseAnimation();
        }
    }

    @JvmStatic
    public static final void play(@NotNull final LottieAnimationView view, final int startFrame, final int endFrame) {
        final boolean z11;
        Intrinsics.checkNotNullParameter(view, "view");
        if (startFrame != -1 && endFrame != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.e
            @Override // java.lang.Runnable
            public final void run() {
                LottieAnimationViewManagerImpl.play$lambda$1(z11, startFrame, endFrame, view);
            }
        });
    }

    @JvmStatic
    public static final void reset(@NotNull final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.c
            @Override // java.lang.Runnable
            public final void run() {
                LottieAnimationViewManagerImpl.reset$lambda$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setProgress(0.0f);
        }
    }

    @JvmStatic
    public static final void resume(@NotNull final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.d
            @Override // java.lang.Runnable
            public final void run() {
                LottieAnimationViewManagerImpl.resume$lambda$4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
            lottieAnimationView.resumeAnimation();
        }
    }

    @JvmStatic
    public static final void sendAnimationFailureEvent(@NotNull LottieAnimationView view, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationFailureEvent(themedReactContext.getSurfaceId(), view.getId(), error));
        }
    }

    @JvmStatic
    public static final void sendAnimationLoadedEvent(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationLoadedEvent(themedReactContext.getSurfaceId(), view.getId()));
        }
    }

    @JvmStatic
    public static final void sendOnAnimationFinishEvent(@NotNull LottieAnimationView view, boolean isCancelled) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationFinishEvent(themedReactContext.getSurfaceId(), view.getId(), isCancelled));
        }
    }

    @JvmStatic
    public static final void setAutoPlay(boolean autoPlay, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAutoPlay(Boolean.valueOf(autoPlay));
    }

    @JvmStatic
    public static final void setCacheComposition(@NotNull LottieAnimationView view, boolean cacheComposition) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCacheComposition(cacheComposition);
    }

    @JvmStatic
    public static final void setColorFilters(@Nullable ReadableArray colorFilters, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setColorFilters(colorFilters);
    }

    @JvmStatic
    public static final void setEnableMergePaths(boolean enableMergePaths, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setEnableMergePaths(Boolean.valueOf(enableMergePaths));
    }

    @JvmStatic
    public static final void setEnableSafeMode(boolean enableSafeMode, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setEnableSafeMode(Boolean.valueOf(enableSafeMode));
    }

    @JvmStatic
    public static final void setHardwareAcceleration(boolean hardwareAccelerationAndroid, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        int i11 = 1;
        if (hardwareAccelerationAndroid) {
            i11 = 2;
        }
        viewManager.setLayerType(i11);
    }

    @JvmStatic
    public static final void setImageAssetsFolder(@Nullable String imageAssetsFolder, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setImageAssetsFolder(imageAssetsFolder);
    }

    @JvmStatic
    public static final void setLoop(boolean loop, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setLoop(Boolean.valueOf(loop));
    }

    @JvmStatic
    public static final void setProgress(float progress, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setProgress(Float.valueOf(progress));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    @JvmStatic
    public static final void setRenderMode(@Nullable String renderMode, @NotNull LottieAnimationViewPropertyManager viewManager) {
        RenderMode renderMode2;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (renderMode != null) {
            int iHashCode = renderMode.hashCode();
            if (iHashCode != 165298699) {
                if (iHashCode != 899536360) {
                    if (iHashCode == 2101957031 && renderMode.equals("SOFTWARE")) {
                        renderMode2 = RenderMode.SOFTWARE;
                    } else {
                        renderMode2 = null;
                    }
                } else if (renderMode.equals("HARDWARE")) {
                    renderMode2 = RenderMode.HARDWARE;
                } else {
                    renderMode2 = null;
                }
            } else if (renderMode.equals("AUTOMATIC")) {
                renderMode2 = RenderMode.AUTOMATIC;
            } else {
                renderMode2 = null;
            }
        } else {
            renderMode2 = null;
        }
        viewManager.setRenderMode(renderMode2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    @JvmStatic
    public static final void setResizeMode(@Nullable String resizeMode, @NotNull LottieAnimationViewPropertyManager viewManager) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (resizeMode != null) {
            int iHashCode = resizeMode.hashCode();
            if (iHashCode != -1364013995) {
                if (iHashCode != 94852023) {
                    if (iHashCode == 951526612 && resizeMode.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    } else {
                        scaleType = null;
                    }
                } else if (resizeMode.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else {
                    scaleType = null;
                }
            } else if (resizeMode.equals(TtmlNode.CENTER)) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                scaleType = null;
            }
        } else {
            scaleType = null;
        }
        viewManager.setScaleType(scaleType);
    }

    @JvmStatic
    public static final void setSourceDotLottieURI(@Nullable String uri, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setSourceDotLottie(uri);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceJson(@Nullable String json, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAnimationJson(json);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceName(@Nullable String name, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (name != null && !StringsKt.contains$default((CharSequence) name, (CharSequence) C33978va.f72339h, false, 2, (Object) null)) {
            name = name + ".json";
        }
        viewManager.setAnimationName(name);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceURL(@Nullable String urlString, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAnimationURL(urlString);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSpeed(double speed, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setSpeed(Float.valueOf((float) speed));
    }

    @JvmStatic
    public static final void setTextFilters(@Nullable ReadableArray textFilters, @NotNull LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setTextFilters(textFilters);
    }

    @JvmStatic
    public static /* synthetic */ void getExportedViewConstants$annotations() {
    }
}
