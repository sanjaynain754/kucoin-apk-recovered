package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ReactFontManager.kt */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated(message = "This class is deprecated and will be deleted in the near future. Please use [com.facebook.react.common.assets.ReactFontManager] instead.")
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/facebook/react/views/text/ReactFontManager;", "", "delegate", "Lcom/facebook/react/common/assets/ReactFontManager;", "<init>", "(Lcom/facebook/react/common/assets/ReactFontManager;)V", "getTypeface", "Landroid/graphics/Typeface;", "fontFamilyName", "", TtmlNode.TAG_STYLE, "", "assetManager", "Landroid/content/res/AssetManager;", "weight", TtmlNode.ITALIC, "", "addCustomFont", "", "context", "Landroid/content/Context;", "fontFamily", "fontId", "font", "setTypeface", "typeface", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ReactFontManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static ReactFontManager instance;

    @NotNull
    private final com.facebook.react.common.assets.ReactFontManager delegate;

    /* JADX INFO: compiled from: ReactFontManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/react/views/text/ReactFontManager$Companion;", "", "<init>", "()V", "instance", "Lcom/facebook/react/views/text/ReactFontManager;", "getInstance", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nReactFontManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactFontManager.kt\ncom/facebook/react/views/text/ReactFontManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ReactFontManager getInstance() {
            ReactFontManager reactFontManager = ReactFontManager.instance;
            if (reactFontManager == null) {
                ReactFontManager reactFontManager2 = new ReactFontManager(com.facebook.react.common.assets.ReactFontManager.INSTANCE.getInstance(), null);
                ReactFontManager.instance = reactFontManager2;
                return reactFontManager2;
            }
            return reactFontManager;
        }
    }

    public /* synthetic */ ReactFontManager(com.facebook.react.common.assets.ReactFontManager reactFontManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactFontManager);
    }

    public final void addCustomFont(@NotNull Context context, @NotNull String fontFamily, int fontId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        this.delegate.addCustomFont(context, fontFamily, fontId);
    }

    @NotNull
    public final Typeface getTypeface(@NotNull String fontFamilyName, int style, @NotNull AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        return this.delegate.getTypeface(fontFamilyName, style, assetManager);
    }

    private ReactFontManager(com.facebook.react.common.assets.ReactFontManager reactFontManager) {
        this.delegate = reactFontManager;
    }

    @JvmStatic
    @NotNull
    public static final ReactFontManager getInstance() {
        return INSTANCE.getInstance();
    }

    public final void addCustomFont(@NotNull String fontFamily, @Nullable Typeface font) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        this.delegate.addCustomFont(fontFamily, font);
    }

    @NotNull
    public final Typeface getTypeface(@NotNull String fontFamilyName, int weight, boolean italic, @NotNull AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        return this.delegate.getTypeface(fontFamilyName, weight, italic, assetManager);
    }

    public final void setTypeface(@NotNull String fontFamilyName, int style, @NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.delegate.setTypeface(fontFamilyName, style, typeface);
    }

    @NotNull
    public final Typeface getTypeface(@NotNull String fontFamilyName, int style, int weight, @NotNull AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        return this.delegate.getTypeface(fontFamilyName, style, weight, assetManager);
    }
}
