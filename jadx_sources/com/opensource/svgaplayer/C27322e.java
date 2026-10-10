package com.opensource.svgaplayer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: com.opensource.svgaplayer.e */
/* JADX INFO: compiled from: SVGADynamicEntity.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R>\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR>\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR>\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR>\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\rR>\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR>\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\b\u0010\u000b\"\u0004\b\"\u0010\rR\u009e\u0001\u0010,\u001a~\u0012\u0004\u0012\u00020\u0005\u00124\u00122\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00060$0\u0004j>\u0012\u0004\u0012\u00020\u0005\u00124\u00122\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00060$`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b+\u0010\rR>\u00100\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020-0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020-`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\rR>\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000201`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b2\u0010\rRó\u0001\u00108\u001aÒ\u0001\u0012\u0004\u0012\u00020\u0005\u0012^\u0012\\\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u0006040\u0004jh\u0012\u0004\u0012\u00020\u0005\u0012^\u0012\\\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u000604`\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b7\u0010\rR\"\u0010>\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=¨\u0006?"}, m90084d2 = {"Lcom/opensource/svgaplayer/e;", "", "<init>", "()V", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/HashMap;", "d", "()Ljava/util/HashMap;", "setDynamicHidden$com_opensource_svgaplayer", "(Ljava/util/HashMap;)V", "dynamicHidden", "Landroid/graphics/Bitmap;", "b", "f", "setDynamicImage$com_opensource_svgaplayer", "dynamicImage", "c", CmcdData.Factory.STREAMING_FORMAT_HLS, "setDynamicText$com_opensource_svgaplayer", "dynamicText", "Landroid/text/TextPaint;", "i", "setDynamicTextPaint$com_opensource_svgaplayer", "dynamicTextPaint", "Landroid/text/StaticLayout;", "e", "g", "setDynamicStaticLayoutText$com_opensource_svgaplayer", "dynamicStaticLayoutText", "Landroid/text/BoringLayout;", "setDynamicBoringLayoutText$com_opensource_svgaplayer", "dynamicBoringLayoutText", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "", "frameIndex", "setDynamicDrawer$com_opensource_svgaplayer", "dynamicDrawer", "", "j", "setMClickMap$com_opensource_svgaplayer", "mClickMap", "Lcom/opensource/svgaplayer/a;", "setDynamicIClickArea$com_opensource_svgaplayer", "dynamicIClickArea", "Lkotlin/Function4;", "width", "height", "setDynamicDrawerSized$com_opensource_svgaplayer", "dynamicDrawerSized", "k", "Z", "()Z", CmcdData.Factory.STREAM_TYPE_LIVE, "(Z)V", "isTextDirty", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C27322e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, Boolean> dynamicHidden = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, Bitmap> dynamicImage = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, String> dynamicText = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, TextPaint> dynamicTextPaint = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, StaticLayout> dynamicStaticLayoutText = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, BoringLayout> dynamicBoringLayoutText = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, Function2<Canvas, Integer, Boolean>> dynamicDrawer = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, int[]> mClickMap = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, InterfaceC27318a> dynamicIClickArea = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, Function4<Canvas, Integer, Integer, Integer, Boolean>> dynamicDrawerSized = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isTextDirty;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HashMap<String, BoringLayout> m67750a() {
        return this.dynamicBoringLayoutText;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final HashMap<String, Function2<Canvas, Integer, Boolean>> m67751b() {
        return this.dynamicDrawer;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final HashMap<String, Function4<Canvas, Integer, Integer, Integer, Boolean>> m67752c() {
        return this.dynamicDrawerSized;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final HashMap<String, Boolean> m67753d() {
        return this.dynamicHidden;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final HashMap<String, InterfaceC27318a> m67754e() {
        return this.dynamicIClickArea;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final HashMap<String, Bitmap> m67755f() {
        return this.dynamicImage;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final HashMap<String, StaticLayout> m67756g() {
        return this.dynamicStaticLayoutText;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final HashMap<String, String> m67757h() {
        return this.dynamicText;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final HashMap<String, TextPaint> m67758i() {
        return this.dynamicTextPaint;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final HashMap<String, int[]> m67759j() {
        return this.mClickMap;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsTextDirty() {
        return this.isTextDirty;
    }

    /* JADX INFO: renamed from: l */
    public final void m67761l(boolean z11) {
        this.isTextDirty = z11;
    }
}
