package com.airbnb.android.react.lottie;

import android.content.res.AssetManager;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.widget.ImageView;
import com.airbnb.lottie.C5066a;
import com.airbnb.lottie.C5110s0;
import com.airbnb.lottie.C5112t0;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.text.ReactFontManager;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p297h1.C38074d;
import p522p1.C43350c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: LottieAnimationViewPropertyManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010R\u001a\u00020SJ\u0018\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020V2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00109\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R\u001c\u0010<\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010\u0010R\u001c\u0010?\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000e\"\u0004\bA\u0010\u0010R\u001e\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010I\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bJ\u0010\u001c\"\u0004\bK\u0010\u001eR\u001e\u0010L\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bM\u0010\u001c\"\u0004\bN\u0010\u001eR\u001e\u0010O\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bP\u0010E\"\u0004\bQ\u0010G¨\u0006W"}, m90084d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/airbnb/lottie/LottieAnimationView;", "<init>", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "viewWeakReference", "Ljava/lang/ref/WeakReference;", "animationNameDirty", "", "value", "", "animationName", "getAnimationName", "()Ljava/lang/String;", "setAnimationName", "(Ljava/lang/String;)V", "scaleType", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "imageAssetsFolder", "getImageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "getEnableMergePaths", "()Ljava/lang/Boolean;", "setEnableMergePaths", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "enableSafeMode", "getEnableSafeMode", "setEnableSafeMode", "colorFilters", "Lcom/facebook/react/bridge/ReadableArray;", "getColorFilters", "()Lcom/facebook/react/bridge/ReadableArray;", "setColorFilters", "(Lcom/facebook/react/bridge/ReadableArray;)V", "textFilters", "getTextFilters", "setTextFilters", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "getRenderMode", "()Lcom/airbnb/lottie/RenderMode;", "setRenderMode", "(Lcom/airbnb/lottie/RenderMode;)V", "layerType", "", "getLayerType", "()Ljava/lang/Integer;", "setLayerType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "animationJson", "getAnimationJson", "setAnimationJson", "animationURL", "getAnimationURL", "setAnimationURL", "sourceDotLottie", "getSourceDotLottie", "setSourceDotLottie", "progress", "", "getProgress", "()Ljava/lang/Float;", "setProgress", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "loop", "getLoop", "setLoop", "autoPlay", "getAutoPlay", "setAutoPlay", "speed", "getSpeed", "setSpeed", "commitChanges", "", "parseColorFilter", "colorFilter", "Lcom/facebook/react/bridge/ReadableMap;", "lottie-react-native_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLottieAnimationViewPropertyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimationViewPropertyManager.kt\ncom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,252:1\n1#2:253\n739#3,9:254\n37#4,2:263\n*S KotlinDebug\n*F\n+ 1 LottieAnimationViewPropertyManager.kt\ncom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager\n*L\n242#1:254,9\n243#1:263,2\n*E\n"})
public final class LottieAnimationViewPropertyManager {

    @Nullable
    private String animationJson;

    @Nullable
    private String animationName;
    private boolean animationNameDirty;

    @Nullable
    private String animationURL;

    @Nullable
    private Boolean autoPlay;

    @Nullable
    private ReadableArray colorFilters;

    @Nullable
    private Boolean enableMergePaths;

    @Nullable
    private Boolean enableSafeMode;

    @Nullable
    private String imageAssetsFolder;

    @Nullable
    private Integer layerType;

    @Nullable
    private Boolean loop;

    @Nullable
    private Float progress;

    @Nullable
    private RenderMode renderMode;

    @Nullable
    private ImageView.ScaleType scaleType;

    @Nullable
    private String sourceDotLottie;

    @Nullable
    private Float speed;

    @Nullable
    private ReadableArray textFilters;

    @NotNull
    private final WeakReference<LottieAnimationView> viewWeakReference;

    private final void parseColorFilter(ReadableMap colorFilter, LottieAnimationView view) {
        int iIntValue;
        List listEmptyList;
        if (colorFilter.getType("color") == ReadableType.Map) {
            Integer color = ColorPropConverter.getColor(colorFilter.getMap("color"), view.getContext());
            Intrinsics.checkNotNull(color);
            iIntValue = color.intValue();
        } else {
            iIntValue = colorFilter.getInt("color");
        }
        String str = colorFilter.getString("keypath") + ".**";
        String strQuote = Pattern.quote(C33978va.f72339h);
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
        List<String> listSplit = new Regex(strQuote).split(str, 0);
        if (listSplit.isEmpty()) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                }
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        view.addValueCallback(new C38074d((String[]) Arrays.copyOf(strArr, strArr.length)), InterfaceC5091m0.f6001K, (C43350c<ColorFilter>) new C43350c(new C5110s0(iIntValue)));
    }

    public final void commitChanges() {
        Object objM103844constructorimpl;
        LottieAnimationView lottieAnimationView = this.viewWeakReference.get();
        if (lottieAnimationView == null) {
            return;
        }
        ReadableArray readableArray = this.textFilters;
        if (readableArray != null && readableArray.size() > 0) {
            C5112t0 c5112t0 = new C5112t0(lottieAnimationView);
            int size = readableArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                ReadableMap map = readableArray.getMap(i11);
                if (map != null) {
                    c5112t0.m5907e(map.getString("find"), map.getString("replace"));
                }
            }
            lottieAnimationView.setTextDelegate(c5112t0);
        }
        String str = this.animationJson;
        if (str != null) {
            lottieAnimationView.setAnimationFromJson(str, String.valueOf(str.hashCode()));
            this.animationJson = null;
        }
        String str2 = this.animationURL;
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                lottieAnimationView.setAnimation(new FileInputStream(file), String.valueOf(str2.hashCode()));
            } else {
                lottieAnimationView.setAnimationFromUrl(str2, String.valueOf(str2.hashCode()));
            }
            this.animationURL = null;
        }
        String str3 = this.sourceDotLottie;
        if (str3 != null) {
            File file2 = new File(str3);
            if (file2.exists()) {
                lottieAnimationView.setAnimation(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                this.sourceDotLottie = null;
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Uri.parse(str3).getScheme());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            if (((String) objM103844constructorimpl) != null) {
                lottieAnimationView.setAnimationFromUrl(str3);
                this.sourceDotLottie = null;
                return;
            }
            int identifier = lottieAnimationView.getResources().getIdentifier(str3, "raw", lottieAnimationView.getContext().getPackageName());
            if (identifier == 0) {
                RNLog.m10577e("Animation for " + str3 + " was not found in raw resources");
                return;
            }
            lottieAnimationView.setAnimation(identifier);
            this.animationNameDirty = false;
            this.sourceDotLottie = null;
        }
        if (this.animationNameDirty) {
            lottieAnimationView.setAnimation(this.animationName);
            this.animationNameDirty = false;
        }
        Float f11 = this.progress;
        if (f11 != null) {
            lottieAnimationView.setProgress(f11.floatValue());
            this.progress = null;
        }
        Boolean bool = this.loop;
        if (bool != null) {
            lottieAnimationView.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.loop = null;
        }
        Boolean bool2 = this.autoPlay;
        if (bool2 != null && bool2.booleanValue() && !lottieAnimationView.isAnimating()) {
            lottieAnimationView.playAnimation();
        }
        Float f12 = this.speed;
        if (f12 != null) {
            lottieAnimationView.setSpeed(f12.floatValue());
            this.speed = null;
        }
        ImageView.ScaleType scaleType = this.scaleType;
        if (scaleType != null) {
            lottieAnimationView.setScaleType(scaleType);
            this.scaleType = null;
        }
        RenderMode renderMode = this.renderMode;
        if (renderMode != null) {
            lottieAnimationView.setRenderMode(renderMode);
            this.renderMode = null;
        }
        Integer num = this.layerType;
        if (num != null) {
            lottieAnimationView.setLayerType(num.intValue(), null);
        }
        String str4 = this.imageAssetsFolder;
        if (str4 != null) {
            lottieAnimationView.setImageAssetsFolder(str4);
            this.imageAssetsFolder = null;
        }
        Boolean bool3 = this.enableMergePaths;
        if (bool3 != null) {
            lottieAnimationView.enableMergePathsForKitKatAndAbove(bool3.booleanValue());
            this.enableMergePaths = null;
        }
        Boolean bool4 = this.enableSafeMode;
        if (bool4 != null) {
            lottieAnimationView.setSafeMode(bool4.booleanValue());
            this.enableSafeMode = null;
        }
        ReadableArray readableArray2 = this.colorFilters;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        int size2 = readableArray2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ReadableMap map2 = readableArray2.getMap(i12);
            if (map2 != null) {
                parseColorFilter(map2, lottieAnimationView);
            }
        }
    }

    @Nullable
    public final String getAnimationJson() {
        return this.animationJson;
    }

    @Nullable
    public final String getAnimationName() {
        return this.animationName;
    }

    @Nullable
    public final String getAnimationURL() {
        return this.animationURL;
    }

    @Nullable
    public final Boolean getAutoPlay() {
        return this.autoPlay;
    }

    @Nullable
    public final ReadableArray getColorFilters() {
        return this.colorFilters;
    }

    @Nullable
    public final Boolean getEnableMergePaths() {
        return this.enableMergePaths;
    }

    @Nullable
    public final Boolean getEnableSafeMode() {
        return this.enableSafeMode;
    }

    @Nullable
    public final String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    @Nullable
    public final Integer getLayerType() {
        return this.layerType;
    }

    @Nullable
    public final Boolean getLoop() {
        return this.loop;
    }

    @Nullable
    public final Float getProgress() {
        return this.progress;
    }

    @Nullable
    public final RenderMode getRenderMode() {
        return this.renderMode;
    }

    @Nullable
    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    @Nullable
    public final String getSourceDotLottie() {
        return this.sourceDotLottie;
    }

    @Nullable
    public final Float getSpeed() {
        return this.speed;
    }

    @Nullable
    public final ReadableArray getTextFilters() {
        return this.textFilters;
    }

    public final void setAnimationJson(@Nullable String str) {
        this.animationJson = str;
    }

    public final void setAnimationName(@Nullable String str) {
        this.animationName = str;
        this.animationNameDirty = true;
    }

    public final void setAnimationURL(@Nullable String str) {
        this.animationURL = str;
    }

    public final void setAutoPlay(@Nullable Boolean bool) {
        this.autoPlay = bool;
    }

    public final void setColorFilters(@Nullable ReadableArray readableArray) {
        this.colorFilters = readableArray;
    }

    public final void setEnableMergePaths(@Nullable Boolean bool) {
        this.enableMergePaths = bool;
    }

    public final void setEnableSafeMode(@Nullable Boolean bool) {
        this.enableSafeMode = bool;
    }

    public final void setImageAssetsFolder(@Nullable String str) {
        this.imageAssetsFolder = str;
    }

    public final void setLayerType(@Nullable Integer num) {
        this.layerType = num;
    }

    public final void setLoop(@Nullable Boolean bool) {
        this.loop = bool;
    }

    public final void setProgress(@Nullable Float f11) {
        this.progress = f11;
    }

    public final void setRenderMode(@Nullable RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    public final void setScaleType(@Nullable ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }

    public final void setSourceDotLottie(@Nullable String str) {
        this.sourceDotLottie = str;
    }

    public final void setSpeed(@Nullable Float f11) {
        this.speed = f11;
    }

    public final void setTextFilters(@Nullable ReadableArray readableArray) {
        this.textFilters = readableArray;
    }

    public LottieAnimationViewPropertyManager(@NotNull final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.viewWeakReference = new WeakReference<>(view);
        view.setFontAssetDelegate(new C5066a() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager.1
            @Override // com.airbnb.lottie.C5066a
            public Typeface fetchFont(String fontFamily) {
                Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
                AssetManager assets = view.getContext().getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                return companion.getTypeface(fontFamily, -1, -1, assets);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0059  */
            @Override // com.airbnb.lottie.C5066a
            public Typeface fetchFont(String fontFamily, String fontStyle, String fontName) {
                int i11;
                Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                switch (fontStyle) {
                    case "Medium":
                        i11 = 500;
                        break;
                    case "Normal":
                    case "Regular":
                        i11 = 400;
                        break;
                    case "Bold":
                        i11 = 700;
                        break;
                    case "Thin":
                        i11 = 100;
                        break;
                    case "Black":
                        i11 = 900;
                        break;
                    case "Light":
                        i11 = 200;
                        break;
                    default:
                        i11 = -1;
                        break;
                }
                ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
                AssetManager assets = view.getContext().getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                return companion.getTypeface(fontName, -1, i11, assets);
            }
        });
    }
}
