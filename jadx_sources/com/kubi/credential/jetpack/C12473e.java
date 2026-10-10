package com.kubi.credential.jetpack;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.BaseActivity;
import com.tencent.bugly.proguard.C33675gh;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.credential.jetpack.e */
/* JADX INFO: compiled from: JetpackContext.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u000e\u0010\u0013J3\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010'J'\u0010+\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010/J%\u0010.\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u00052\f\u00101\u001a\b\u0018\u000100R\u00020\u0001H\u0016¢\u0006\u0004\b.\u00102J!\u00104\u001a\u0004\u0018\u00010-2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u00105J/\u00104\u001a\u0004\u0018\u00010-2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00052\f\u00101\u001a\b\u0018\u000100R\u00020\u0001H\u0016¢\u0006\u0004\b4\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b:\u0010'J\u0017\u0010<\u001a\u00020;2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020>2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010'J\u0017\u0010C\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bE\u0010DJ\u0017\u0010F\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bF\u0010DJ\u0017\u0010H\u001a\u00020G2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010H\u001a\u00020G2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bH\u0010LJ\u0017\u0010N\u001a\u00020M2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bN\u0010OJ'\u0010S\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010P\u001a\u00020J2\u0006\u0010Q\u001a\u00020>H\u0016¢\u0006\u0004\bS\u0010TJ/\u0010U\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00052\u0006\u0010P\u001a\u00020J2\u0006\u0010Q\u001a\u00020>H\u0016¢\u0006\u0004\bU\u0010VJ'\u0010S\u001a\u00020R2\u0006\u0010W\u001a\u00020\r2\u0006\u0010P\u001a\u00020J2\u0006\u0010Q\u001a\u00020>H\u0016¢\u0006\u0004\bS\u0010XJ\u001f\u0010\\\u001a\u00020 2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010b\u001a\u00020R2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020`H\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020^H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010j\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\r2\u0006\u0010h\u001a\u00020\r2\u0006\u0010i\u001a\u00020\rH\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\r2\u0006\u0010l\u001a\u00020\u0005H\u0016¢\u0006\u0004\bm\u0010\u000fJ\u0017\u0010n\u001a\u00020\r2\u0006\u0010l\u001a\u00020\u0005H\u0016¢\u0006\u0004\bn\u0010\u000fJ\u0017\u0010o\u001a\u00020\r2\u0006\u0010l\u001a\u00020\u0005H\u0016¢\u0006\u0004\bo\u0010\u000fJ\u0017\u0010p\u001a\u00020\r2\u0006\u0010l\u001a\u00020\u0005H\u0016¢\u0006\u0004\bp\u0010\u000fJ\u001f\u0010t\u001a\u00020R2\u0006\u0010q\u001a\u00020B2\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ'\u0010w\u001a\u00020R2\u0006\u0010v\u001a\u00020\r2\u0006\u0010[\u001a\u00020Y2\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bw\u0010xR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006{"}, m90084d2 = {"Lcom/kubi/credential/jetpack/e;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "", "id", "", "getText", "(I)Ljava/lang/CharSequence;", FirebaseAnalytics.Param.QUANTITY, "getQuantityText", "(II)Ljava/lang/CharSequence;", "", "getString", "(I)Ljava/lang/String;", "", "", "formatArgs", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getQuantityString", "(II[Ljava/lang/Object;)Ljava/lang/String;", "(II)Ljava/lang/String;", "def", "(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "getTextArray", "(I)[Ljava/lang/CharSequence;", "getStringArray", "(I)[Ljava/lang/String;", "", "getIntArray", "(I)[I", "Landroid/content/res/TypedArray;", "obtainTypedArray", "(I)Landroid/content/res/TypedArray;", "", "getDimension", "(I)F", "getDimensionPixelOffset", "(I)I", "getDimensionPixelSize", TtmlNode.RUBY_BASE, "pbase", "getFraction", "(III)F", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources$Theme;", BaseActivity.THEME, "(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "density", "getDrawableForDensity", "(II)Landroid/graphics/drawable/Drawable;", "(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Movie;", "getMovie", "(I)Landroid/graphics/Movie;", "getColor", "Landroid/content/res/ColorStateList;", "getColorStateList", "(I)Landroid/content/res/ColorStateList;", "", "getBoolean", "(I)Z", "getInteger", "Landroid/content/res/XmlResourceParser;", "getLayout", "(I)Landroid/content/res/XmlResourceParser;", "getAnimation", "getXml", "Ljava/io/InputStream;", "openRawResource", "(I)Ljava/io/InputStream;", "Landroid/util/TypedValue;", "value", "(ILandroid/util/TypedValue;)Ljava/io/InputStream;", "Landroid/content/res/AssetFileDescriptor;", "openRawResourceFd", "(I)Landroid/content/res/AssetFileDescriptor;", "outValue", "resolveRefs", "", "getValue", "(ILandroid/util/TypedValue;Z)V", "getValueForDensity", "(IILandroid/util/TypedValue;Z)V", "name", "(Ljava/lang/String;Landroid/util/TypedValue;Z)V", "Landroid/util/AttributeSet;", "set", "attrs", "obtainAttributes", "(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "Landroid/content/res/Configuration;", "config", "Landroid/util/DisplayMetrics;", C33675gh.f70007m, "updateConfiguration", "(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "getConfiguration", "()Landroid/content/res/Configuration;", "defType", "defPackage", "getIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", "resid", "getResourceName", "getResourcePackageName", "getResourceTypeName", "getResourceEntryName", "parser", "Landroid/os/Bundle;", "outBundle", "parseBundleExtras", "(Landroid/content/res/XmlResourceParser;Landroid/os/Bundle;)V", "tagName", "parseBundleExtra", "(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/res/Resources;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class C12473e extends Resources {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Resources resources;

    @Override // android.content.res.Resources
    @NotNull
    public Drawable getDrawable(int id2) {
        Drawable drawable = this.resources.getDrawable(id2);
        Intrinsics.checkNotNullExpressionValue(drawable, "resources.getDrawable(id)");
        return drawable;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int id2, int density) {
        return getDrawableForDensity(id2, density, null);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int id2, int quantity, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String quantityString = this.resources.getQuantityString(id2, quantity, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…d, quantity, *formatArgs)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int id2) {
        String string = this.resources.getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
        return string;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getText(int id2) {
        CharSequence text = this.resources.getText(id2);
        Intrinsics.checkNotNullExpressionValue(text, "resources.getText(id)");
        return text;
    }

    @Override // android.content.res.Resources
    public void getValue(int id2, @NotNull TypedValue outValue, boolean resolveRefs) {
        Intrinsics.checkNotNullParameter(outValue, "outValue");
        this.resources.getValue(id2, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int id2) {
        InputStream inputStreamOpenRawResource = this.resources.openRawResource(id2);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "resources.openRawResource(id)");
        return inputStreamOpenRawResource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12473e(@NotNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getAnimation(int id2) {
        XmlResourceParser animation = this.resources.getAnimation(id2);
        Intrinsics.checkNotNullExpressionValue(animation, "resources.getAnimation(id)");
        return animation;
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int id2) {
        return this.resources.getBoolean(id2);
    }

    @Override // android.content.res.Resources
    public int getColor(int id2) {
        return this.resources.getColor(id2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public ColorStateList getColorStateList(int id2) {
        ColorStateList colorStateList = this.resources.getColorStateList(id2);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "resources.getColorStateList(id)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @NotNull
    public Configuration getConfiguration() {
        Configuration configuration = this.resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "resources.configuration");
        return configuration;
    }

    @Override // android.content.res.Resources
    public float getDimension(int id2) {
        return this.resources.getDimension(id2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int id2) {
        return this.resources.getDimensionPixelOffset(id2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int id2) {
        return this.resources.getDimensionPixelSize(id2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.resources.getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        return displayMetrics;
    }

    @Override // android.content.res.Resources
    @NotNull
    public Drawable getDrawable(int id2, @Nullable Resources.Theme theme) {
        Drawable drawable = this.resources.getDrawable(id2, theme);
        Intrinsics.checkNotNullExpressionValue(drawable, "resources.getDrawable(id, theme)");
        return drawable;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int id2, int density, @Nullable Resources.Theme theme) {
        return getDrawableForDensity(id2, density, theme);
    }

    @Override // android.content.res.Resources
    public float getFraction(int id2, int base, int pbase) {
        return this.resources.getFraction(id2, base, pbase);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(@NotNull String name, @NotNull String defType, @NotNull String defPackage) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defType, "defType");
        Intrinsics.checkNotNullParameter(defPackage, "defPackage");
        return this.resources.getIdentifier(name, defType, defPackage);
    }

    @Override // android.content.res.Resources
    @NotNull
    public int[] getIntArray(int id2) {
        int[] intArray = this.resources.getIntArray(id2);
        Intrinsics.checkNotNullExpressionValue(intArray, "resources.getIntArray(id)");
        return intArray;
    }

    @Override // android.content.res.Resources
    public int getInteger(int id2) {
        return this.resources.getInteger(id2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getLayout(int id2) {
        XmlResourceParser layout = this.resources.getLayout(id2);
        Intrinsics.checkNotNullExpressionValue(layout, "resources.getLayout(id)");
        return layout;
    }

    @Override // android.content.res.Resources
    @NotNull
    public Movie getMovie(int id2) {
        Movie movie = this.resources.getMovie(id2);
        Intrinsics.checkNotNullExpressionValue(movie, "resources.getMovie(id)");
        return movie;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int id2, int quantity) {
        String quantityString = this.resources.getQuantityString(id2, quantity);
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityString(id, quantity)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getQuantityText(int id2, int quantity) {
        CharSequence quantityText = this.resources.getQuantityText(id2, quantity);
        Intrinsics.checkNotNullExpressionValue(quantityText, "resources.getQuantityText(id, quantity)");
        return quantityText;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getResourceEntryName(int resid) {
        String resourceEntryName = this.resources.getResourceEntryName(resid);
        Intrinsics.checkNotNullExpressionValue(resourceEntryName, "resources.getResourceEntryName(resid)");
        return resourceEntryName;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getResourceName(int resid) {
        String resourceName = this.resources.getResourceName(resid);
        Intrinsics.checkNotNullExpressionValue(resourceName, "resources.getResourceName(resid)");
        return resourceName;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getResourcePackageName(int resid) {
        String resourcePackageName = this.resources.getResourcePackageName(resid);
        Intrinsics.checkNotNullExpressionValue(resourcePackageName, "resources.getResourcePackageName(resid)");
        return resourcePackageName;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getResourceTypeName(int resid) {
        String resourceTypeName = this.resources.getResourceTypeName(resid);
        Intrinsics.checkNotNullExpressionValue(resourceTypeName, "resources.getResourceTypeName(resid)");
        return resourceTypeName;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int id2, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = this.resources.getString(id2, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id, *formatArgs)");
        return string;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String[] getStringArray(int id2) {
        String[] stringArray = this.resources.getStringArray(id2);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(id)");
        return stringArray;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getText(int id2, @NotNull CharSequence def) {
        Intrinsics.checkNotNullParameter(def, "def");
        CharSequence text = this.resources.getText(id2, def);
        Intrinsics.checkNotNullExpressionValue(text, "resources.getText(id, def)");
        return text;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence[] getTextArray(int id2) {
        CharSequence[] textArray = this.resources.getTextArray(id2);
        Intrinsics.checkNotNullExpressionValue(textArray, "resources.getTextArray(id)");
        return textArray;
    }

    @Override // android.content.res.Resources
    public void getValue(@NotNull String name, @NotNull TypedValue outValue, boolean resolveRefs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outValue, "outValue");
        this.resources.getValue(name, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int id2, int density, @NotNull TypedValue outValue, boolean resolveRefs) {
        Intrinsics.checkNotNullParameter(outValue, "outValue");
        this.resources.getValueForDensity(id2, density, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getXml(int id2) {
        XmlResourceParser xml = this.resources.getXml(id2);
        Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(id)");
        return xml;
    }

    @Override // android.content.res.Resources
    @NotNull
    public TypedArray obtainAttributes(@NotNull AttributeSet set, @NotNull int[] attrs) {
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = this.resources.obtainAttributes(set, attrs);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "resources.obtainAttributes(set, attrs)");
        return typedArrayObtainAttributes;
    }

    @Override // android.content.res.Resources
    @NotNull
    public TypedArray obtainTypedArray(int id2) {
        TypedArray typedArrayObtainTypedArray = this.resources.obtainTypedArray(id2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "resources.obtainTypedArray(id)");
        return typedArrayObtainTypedArray;
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int id2, @NotNull TypedValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        InputStream inputStreamOpenRawResource = this.resources.openRawResource(id2, value);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "resources.openRawResource(id, value)");
        return inputStreamOpenRawResource;
    }

    @Override // android.content.res.Resources
    @NotNull
    public AssetFileDescriptor openRawResourceFd(int id2) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.resources.openRawResourceFd(id2);
        Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenRawResourceFd, "resources.openRawResourceFd(id)");
        return assetFileDescriptorOpenRawResourceFd;
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(@NotNull String tagName, @NotNull AttributeSet attrs, @NotNull Bundle outBundle) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.resources.parseBundleExtra(tagName, attrs, outBundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(@NotNull XmlResourceParser parser, @NotNull Bundle outBundle) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.resources.parseBundleExtras(parser, outBundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(@NotNull Configuration config, @NotNull DisplayMetrics metrics) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.resources.updateConfiguration(config, metrics);
    }
}
