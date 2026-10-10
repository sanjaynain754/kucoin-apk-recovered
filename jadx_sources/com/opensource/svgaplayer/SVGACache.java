package com.opensource.svgaplayer;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import k90.C40965c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: SVGACache.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001*B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\"\u0010!J\u0015\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010!R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010)\u001a\u00020\r8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGACache;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "k", "(Landroid/content/Context;)V", "Lcom/opensource/svgaplayer/SVGACache$Type;", "type", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/content/Context;Lcom/opensource/svgaplayer/SVGACache$Type;)V", "", "path", "f", "(Ljava/lang/String;)V", "", "j", "()Z", "i", "cacheKey", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Z", "str", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/URL;", "url", "d", "(Ljava/net/URL;)Ljava/lang/String;", "Ljava/io/File;", "b", "(Ljava/lang/String;)Ljava/io/File;", "e", "audio", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/opensource/svgaplayer/SVGACache$Type;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "cacheDir", "Type", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class SVGACache {

    /* JADX INFO: renamed from: c */
    public static final SVGACache f55407c = new SVGACache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static Type type = Type.DEFAULT;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static String cacheDir = "/";

    /* JADX INFO: compiled from: SVGACache.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGACache$Type;", "", "(Ljava/lang/String;I)V", "DEFAULT", "FILE", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 1, 15})
    public enum Type {
        DEFAULT,
        FILE
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m67644c(@NotNull String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(charsetName)");
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        String string = "";
        for (byte b11 : messageDigest.digest()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
            sb2.append(str2);
            string = sb2.toString();
        }
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final File m67642a(@NotNull String audio) {
        return new File(m67648g() + audio + ".mp3");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final File m67643b(@NotNull String cacheKey) {
        return new File(m67648g() + cacheKey + '/');
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final File m67646e(@NotNull String cacheKey) {
        return new File(m67648g() + cacheKey + ".svga");
    }

    /* JADX INFO: renamed from: f */
    public final void m67647f(@NotNull String path) {
        File[] fileArrListFiles;
        try {
            File file = new File(path);
            if (!file.exists()) {
                file = null;
            }
            if (file == null || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.exists()) {
                    Intrinsics.checkExpressionValueIsNotNull(file2, "file");
                    if (file2.isDirectory()) {
                        SVGACache sVGACache = f55407c;
                        String absolutePath = file2.getAbsolutePath();
                        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
                        sVGACache.m67647f(absolutePath);
                    }
                    file2.delete();
                }
            }
        } catch (Exception e11) {
            C40965c.f91057a.m89715c("SVGACache", "Clear svga cache path: " + path + " fail", e11);
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m67648g() {
        if (!Intrinsics.areEqual(cacheDir, "/")) {
            File file = new File(cacheDir);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return cacheDir;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m67650i() {
        return type == Type.DEFAULT;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m67651j() {
        return !Intrinsics.areEqual("/", m67648g()) && new File(m67648g()).exists();
    }

    /* JADX INFO: renamed from: k */
    public final void m67652k(@Nullable Context context) {
        m67653l(context, Type.DEFAULT);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m67645d(@NotNull URL url) {
        String string = url.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "url.toString()");
        return m67644c(string);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m67649h(@NotNull String cacheKey) {
        File fileM67646e;
        if (m67650i()) {
            fileM67646e = m67643b(cacheKey);
        } else {
            fileM67646e = m67646e(cacheKey);
        }
        return fileM67646e.exists();
    }

    /* JADX INFO: renamed from: l */
    public final void m67653l(@Nullable Context context, @NotNull Type type2) {
        if (!m67651j() && context != null) {
            StringBuilder sb2 = new StringBuilder();
            File cacheDir2 = context.getCacheDir();
            Intrinsics.checkExpressionValueIsNotNull(cacheDir2, "context.cacheDir");
            sb2.append(cacheDir2.getAbsolutePath());
            sb2.append("/svga/");
            cacheDir = sb2.toString();
            File file = new File(m67648g());
            if (file.exists()) {
                file = null;
            }
            if (file != null) {
                file.mkdirs();
            }
            type = type2;
        }
    }
}
